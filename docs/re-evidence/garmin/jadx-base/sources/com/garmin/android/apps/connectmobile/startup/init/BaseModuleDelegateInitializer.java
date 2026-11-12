package com.garmin.android.apps.connectmobile.startup.init;

import android.content.Context;
import bv.c;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import java.util.List;
import kd0.m;
import p005kotlin.Metadata;
import p13.j0;
import zd.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/BaseModuleDelegateInitializer;", "Lzd/b;", "Lbv/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BaseModuleDelegateInitializer implements b<c> {
    @Override // zd.b
    public final c create(Context context) {
        context.getClass();
        GarminConnectMobileApp.a aVar = GarminConnectMobileApp.f28685g;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        aVar.getClass();
        GarminConnectMobileApp.f28688j = applicationContext;
        m mVar = new m();
        bv.b.f21239a.getClass();
        bv.b.f21240b = mVar;
        return mVar;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return j0.f134944a;
    }
}
