package com.garmin.android.apps.connectmobile.startup.init;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import vf1.a;
import zd.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/SamdInitializer;", "Lzd/b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SamdInitializer implements b<Unit> {
    @Override // zd.b
    public final Unit create(Context context) {
        context.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "SamdInitializer", "SaMDHelper initialize");
        a aVar2 = (a) KoinJavaComponent.get$default(a.class, null, null, 6, null);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        aVar2.f(applicationContext, (vf1.b) KoinJavaComponent.get$default(vf1.b.class, null, null, 6, null));
        return Unit.INSTANCE;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return x.m(DependencyInjectionInitializer.class);
    }
}
