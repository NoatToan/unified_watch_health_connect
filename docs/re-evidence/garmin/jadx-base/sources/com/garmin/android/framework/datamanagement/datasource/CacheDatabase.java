package com.garmin.android.framework.datamanagement.datasource;

import androidx.room.b0;
import androidx.room.x;
import bb2.a;
import bb2.e;
import bb2.j;
import bb2.m;
import bb2.p;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;

/* JADX INFO: loaded from: classes8.dex */
public abstract class CacheDatabase extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static CacheDatabase f49878a;

    public static synchronized CacheDatabase i() {
        try {
            if (f49878a == null) {
                b0.a aVarA = x.a(GarminConnectMobileApp.f28688j, CacheDatabase.class, "cache-database");
                aVarA.c();
                aVarA.f10732j = true;
                f49878a = (CacheDatabase) aVarA.b();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f49878a;
    }

    public abstract a e();

    public abstract e f();

    public abstract j g();

    public abstract m h();

    public abstract p j();
}
