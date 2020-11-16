package com.example.dailysmarts.di.module;

import com.example.dailysmarts.ui.fragments.TabDailyQuote;
import com.example.dailysmarts.ui.fragments.TabFavouriteQuotes;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentsModule {

    @ContributesAndroidInjector
    abstract TabDailyQuote provideTabDailyQuote();

    @ContributesAndroidInjector
    abstract TabFavouriteQuotes provideTabFavouriteQuotes();
}
