package w52;

import c2.x2;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, d.class, "stopRecording", "stopRecording()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((d) this.receiver).f182488a.f();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: w52.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"w52/b$b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3393b implements p3.h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.n0 f182481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.k0 f182482b;

        public C3393b(androidx.lifecycle.n0 n0Var, androidx.lifecycle.k0 k0Var) {
            this.f182481a = n0Var;
            this.f182482b = k0Var;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f182481a.getF158016a().d(this.f182482b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    public static final void a(com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, String str, e23.q<? super String, ? super String, ? super e23.a<Unit>, Unit> qVar, e23.p<? super com.garmin.android.apps.connectmobile.workouts.data.model.a, ? super File, Unit> pVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        Object obj;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2;
        int i16;
        aVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-553624926);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            obj = qVar;
            i15 |= o0VarE.r(obj) ? 256 : 128;
        } else {
            obj = qVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z15 = (i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.B(aVar));
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z15) {
                o0VarE.K(aVar);
                objQ = aVar;
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    o0VarE.K(aVar);
                    objQ = aVar;
                }
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.a aVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) objQ;
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(null);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var = (p3.p1) objQ2;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            boolean zR = ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | o0VarE.r(aVar4);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                Object obj2 = obj;
                aVar2 = aVar4;
                i16 = 0;
                t42.l lVar = new t42.l(pVar, aVar2, obj2, p1Var, 27);
                o0VarE.K(lVar);
                objQ3 = lVar;
            } else {
                aVar2 = aVar4;
                i16 = 0;
            }
            e23.l lVar2 = (e23.l) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new w40.d(6);
                o0VarE.K(objQ4);
            }
            e23.l lVar3 = (e23.l) objQ4;
            int i17 = ((((i15 & 112) == 32 ? 1 : i16) | (o0VarE.r(aVar2) ? 1 : 0)) == true ? 1 : 0) | ((i15 & 57344) != 16384 ? i16 : 1);
            Object objQ5 = o0VarE.q();
            if (i17 != 0 || objQ5 == c2565a) {
                objQ5 = new w52.a(aVar2, str, z14, i16);
                o0VarE.K(objQ5);
            }
            p002j6.c.a(lVar2, rVarF, null, lVar3, (e23.l) objQ5, o0VarE, 3120, 4);
            androidx.lifecycle.n0 n0Var = (androidx.lifecycle.n0) o0VarE.A(s9.j.f158018a);
            boolean zR2 = o0VarE.r(n0Var);
            Object objQ6 = o0VarE.q();
            if (zR2 || objQ6 == c2565a) {
                objQ6 = new w02.b(11, n0Var, p1Var);
                o0VarE.K(objQ6);
            }
            p3.l0.a(n0Var, (e23.l) objQ6, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(aVar, str, qVar, pVar, z14, i14);
        }
    }
}
