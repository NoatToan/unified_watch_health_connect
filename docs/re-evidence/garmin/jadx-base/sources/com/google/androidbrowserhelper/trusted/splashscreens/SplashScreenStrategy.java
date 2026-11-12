package com.google.androidbrowserhelper.trusted.splashscreens;

import androidx.browser.trusted.i;
import r.g;

/* JADX INFO: loaded from: classes14.dex */
public interface SplashScreenStrategy {
    void configureTwaBuilder(i iVar, g gVar, Runnable runnable);

    void onTwaLaunchInitiated(String str, i iVar);
}
