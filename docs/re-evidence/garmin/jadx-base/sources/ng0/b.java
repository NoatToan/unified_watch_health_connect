package ng0;

import com.garmin.android.apps.connectmobile.workouts.data.model.c;
import com.garmin.android.apps.connectmobile.workouts.data.model.k;
import e23.q;
import l72.p2;
import mt0.s1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lng0/b;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f125905a = new b();

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    public final void a(mg0.a aVar, q<? super k, ? super c, ? super String, Unit> qVar, m mVar, int i14) {
        o0 o0Var;
        aVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(-1710003307);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.r(qVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            p2 p2Var = p2.f111205a;
            String str = aVar.f118364a;
            String str2 = aVar.f118365b;
            b92.a aVar2 = aVar.f118366c;
            e eVarC = f.c(-1095131869, new m92.f(aVar, 13), o0VarE);
            boolean z14 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new s1(13, qVar, aVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s1(13, qVar, aVar);
                    o0VarE.K(objQ);
                }
            }
            int i16 = b92.a.f16960b;
            o0Var = o0VarE;
            p2Var.h(str, str2, null, null, aVar2, false, false, eVarC, null, null, (e23.a) objQ, o0Var, 12582912, 0, 876);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(this, aVar, qVar, i14, 11);
        }
    }
}
