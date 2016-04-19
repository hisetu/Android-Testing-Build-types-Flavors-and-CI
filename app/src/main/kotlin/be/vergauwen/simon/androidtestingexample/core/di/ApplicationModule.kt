package be.vergauwen.simon.androidtestingexample.core.di

import android.app.Application
import android.content.Context
import be.vergauwen.simon.androidtestingexample.core.rx.RxUtil
import be.vergauwen.simon.androidtestingexample.core.rx.Transformers
import dagger.Module
import dagger.Provides

@Module
open class ApplicationModule(private val application: Application) {

  @ApplicationScope
  @Provides
  open fun provideApplicationContext(): Context {
    return application
  }

  @ApplicationScope
  @Provides
  open fun provideTransformers(): Transformers {
    return RxUtil()
  }
}