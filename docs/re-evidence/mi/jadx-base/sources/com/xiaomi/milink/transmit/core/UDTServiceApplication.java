package com.xiaomi.milink.transmit.core;

import android.app.Application;

/* JADX INFO: loaded from: classes11.dex */
public class UDTServiceApplication extends Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UDTServiceApplication f13591a;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f13591a = this;
    }
}
