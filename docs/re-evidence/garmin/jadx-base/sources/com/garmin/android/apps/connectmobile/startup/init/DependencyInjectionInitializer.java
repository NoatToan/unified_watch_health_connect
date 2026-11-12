package com.garmin.android.apps.connectmobile.startup.init;

import a51.m;
import android.content.Context;
import c22.f2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.j2;
import id0.c3;
import java.util.List;
import org.koin.core.context.DefaultContextExtKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import zd.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/DependencyInjectionInitializer;", "Lzd/b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DependencyInjectionInitializer implements b<Unit> {
    @Override // zd.b
    public final Unit create(Context context) {
        context.getClass();
        j2 j2Var = j2.f36949a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        j2Var.getClass();
        DefaultContextExtKt.startKoin(new m(applicationContext, 5));
        c3.f92688a.getClass();
        f2.b();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "DependencyInjectionInitializer", "Dependency injection initialized");
        return Unit.INSTANCE;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return j0.f134944a;
    }
}
