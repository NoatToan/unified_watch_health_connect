package com.garmin.android.apps.connectmobile.startup.init;

import android.content.Context;
import android.os.Build;
import c22.t2;
import com.garmin.android.apps.connectmobile.FlipperInitializer;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.onboarding.inappupdate.InAppUpdateInitializer;
import com.garmin.android.library.mapsdkadapter.m;
import ie2.n;
import java.util.List;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p92.o;
import qw0.i;
import t13.h;
import t92.e;
import x53.c;
import z10.g0;
import zd.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/GCMStartupInitializer;", "Lzd/b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMStartupInitializer implements b<Unit> {
    @Override // zd.b
    public final Unit create(Context context) throws Throwable {
        context.getClass();
        o oVar = o.f136619a;
        g0 g0Var = new g0(context);
        e eVar = new e();
        oVar.getClass();
        o.f136620b = g0Var;
        o.f136621c = eVar;
        String strA = t2.a(2, context);
        String strA2 = t2.a(18, context);
        n nVar = n.f93149a;
        i iVar = new i(context, strA, strA2);
        nVar.getClass();
        m.f50298a.getClass();
        c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new ie2.m(context, null), 3);
        n.f93150b = iVar;
        fq1.i.f73249d.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 != 31 && i14 != 32) {
            ge1.b.W(h.f161748a, new eq1.b(context, null));
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GCMStartupInitializer", "Dependencies initialized.");
        return Unit.INSTANCE;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return x.m(AppContextInitializer.class, GloggerInitializer.class, ForegroundBackgroundInitializer.class, FlipperInitializer.class, AnalyticsInitializer.class, GCMCacheManagerInitializer.class, InAppUpdateInitializer.class, DependencyInjectionInitializer.class, SamdInitializer.class, GdiDeviceConnectionInitializer.class);
    }
}
