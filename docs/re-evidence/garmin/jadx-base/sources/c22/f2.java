package c22;

import java.util.Iterator;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.dsl.ModuleDSLKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class f2 {
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a3 -> B:25:0x00a6). Please report as a decompilation issue!!! */
    public static final Object a(String str, v13.c cVar) {
        e2 e2Var;
        d2 d2Var;
        int i14;
        o oVar;
        Iterator it;
        u0 u0Var;
        String str2;
        int i15;
        d2 d2Var2;
        if (cVar instanceof e2) {
            e2Var = (e2) cVar;
            int i16 = e2Var.f23049g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                e2Var.f23049g = i16 - Integer.MIN_VALUE;
            } else {
                e2Var = new e2(cVar);
            }
        } else {
            e2Var = new e2(cVar);
        }
        Object obj = e2Var.f23048f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = e2Var.f23049g;
        if (i17 == 0) {
            o13.r.b(obj);
            d2Var = (d2) KoinJavaComponent.get$default(d2.class, null, null, 6, null);
            o oVar2 = (o) KoinJavaComponent.get$default(o.class, null, null, 6, null);
            w13.c cVar2 = u0.f23285k;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            i14 = 0;
            oVar = oVar2;
            it = bVarN;
            while (it.hasNext()) {
                u0Var = (u0) it.next();
                if (d2Var.a(u0Var) && oVar.g(u0Var)) {
                    com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    aVar2.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.GENERAL, "OnDemandResources.notInstalled trigger install from " + str + " for " + u0Var);
                    e2Var.f23043a = str;
                    e2Var.f23044b = d2Var;
                    e2Var.f23045c = oVar;
                    e2Var.f23046d = it;
                    e2Var.f23047e = i14;
                    e2Var.f23049g = 1;
                    if (d2Var.b(u0Var, e2Var) == aVar) {
                        return aVar;
                    }
                    str2 = str;
                    i15 = i14;
                    d2Var2 = d2Var;
                }
            }
            return Unit.INSTANCE;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i15 = e2Var.f23047e;
        it = e2Var.f23046d;
        oVar = e2Var.f23045c;
        d2Var2 = e2Var.f23044b;
        str2 = e2Var.f23043a;
        o13.r.b(obj);
        d2Var = d2Var2;
        i14 = i15;
        str = str2;
        while (it.hasNext()) {
            u0Var = (u0) it.next();
            if (d2Var.a(u0Var)) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final void b() {
        id0.e1.f92714a.getClass();
        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "GarminConnectOnDemandResourcesDI load on demand resources Koin module");
        DefaultContextExtKt.loadKoinModules(ModuleDSLKt.module$default(false, new id0.e0(18), 1, null));
    }
}
