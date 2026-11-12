package vd0;

import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AllDogsActivity f177372b;

    public /* synthetic */ s(AllDogsActivity allDogsActivity, int i14) {
        this.f177371a = i14;
        this.f177372b = allDogsActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i14 = this.f177371a;
        AllDogsActivity allDogsActivity = this.f177372b;
        switch (i14) {
            case 0:
                pe0.d dVar = (pe0.d) obj;
                AllDogsActivity.a aVar = AllDogsActivity.f34686g;
                p2 p2Var = allDogsActivity.da().f131261f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, pe0.c.a((pe0.c) value, null, dVar, null, null, null, 0.0d, null, null, false, null, 1021)));
                lc.m0 m0Var = allDogsActivity.f34692f;
                if (m0Var != null) {
                    m0Var.m();
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("navController");
                throw null;
            case 1:
                pe0.d dVar2 = (pe0.d) obj;
                AllDogsActivity.a aVar2 = AllDogsActivity.f34686g;
                p2 p2Var2 = allDogsActivity.fa().f131412h;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, pe0.j.a((pe0.j) value2, null, dVar2, null, null, null, 0.0d, null, null, false, null, null, 2045)));
                lc.m0 m0Var2 = allDogsActivity.f34692f;
                if (m0Var2 != null) {
                    m0Var2.m();
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("navController");
                throw null;
            case 2:
                Throwable th3 = null;
                long jLongValue = ((Long) obj).longValue();
                AllDogsActivity.a aVar3 = AllDogsActivity.f34686g;
                p2 p2Var3 = allDogsActivity.ea().f131288e;
                while (true) {
                    Object value5 = p2Var3.getValue();
                    Throwable th4 = th3;
                    if (p2Var3.b(value5, th4)) {
                        lc.m0 m0Var3 = allDogsActivity.f34692f;
                        if (m0Var3 != null) {
                            lc.y.l(m0Var3, new xd0.a.h(jLongValue));
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("navController");
                        throw th4;
                    }
                    th3 = th4;
                }
                break;
            case 3:
                i53.c cVar = (i53.c) obj;
                AllDogsActivity.a aVar4 = AllDogsActivity.f34686g;
                cVar.getClass();
                oe0.d dVarDa = allDogsActivity.da();
                dVarDa.getClass();
                p2 p2Var4 = dVarDa.f131261f;
                do {
                    value3 = p2Var4.getValue();
                } while (!p2Var4.b(value3, pe0.c.a((pe0.c) value3, null, null, cVar, null, null, 0.0d, null, null, false, null, 1019)));
                lc.m0 m0Var4 = allDogsActivity.f34692f;
                if (m0Var4 != null) {
                    m0Var4.m();
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("navController");
                throw null;
            default:
                i53.c cVar2 = (i53.c) obj;
                AllDogsActivity.a aVar5 = AllDogsActivity.f34686g;
                cVar2.getClass();
                oe0.s sVarFa = allDogsActivity.fa();
                sVarFa.getClass();
                p2 p2Var5 = sVarFa.f131412h;
                do {
                    value4 = p2Var5.getValue();
                } while (!p2Var5.b(value4, pe0.j.a((pe0.j) value4, null, null, cVar2, null, null, 0.0d, null, null, false, null, null, 2043)));
                lc.m0 m0Var5 = allDogsActivity.f34692f;
                if (m0Var5 != null) {
                    m0Var5.m();
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("navController");
                throw null;
        }
    }
}
