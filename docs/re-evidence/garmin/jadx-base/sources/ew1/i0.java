package ew1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66512a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vt1.o.f180178i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vt1.o.f180179j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vt1.o.f180180k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[vt1.o.f180181l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f66512a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f66513a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f66513a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f66513a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f66513a.invoke(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    public static final void a(androidx.fragment.app.m mVar, boolean z14, e3 e3Var, p3.m mVar2, int i14) {
        p3.o0 o0VarE = mVar2.E(-190130038);
        int i15 = i14 | (o0VarE.r(mVar) ? 4 : 2) | (o0VarE.r(e3Var) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = c2.x2.d(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarD2 = c2.x2.d(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            bVar2.getClass();
            bVar2.getClass();
            c2.l2 l2VarE = c2.l.e(f14, 0.0f, f15, f15, 2);
            bVar2.getClass();
            c2.j.i iVarI = c2.j.i(eVar.f97918c);
            boolean zR = o0VarE.r(e3Var) | o0VarE.r(mVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ad0.f(z14, e3Var, mVar, 4);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ad0.f(z14, e3Var, mVar, 4);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarD2, null, l2VarE, iVarI, null, null, false, null, (e23.l) objQ, o0VarE, 6, 490);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new am.i1(mVar, z14, e3Var, i14, 12);
        }
    }

    public static i53.f b(int i14, Context context) {
        boolean z14 = (i14 & 2) == 0;
        boolean z15 = (i14 & 4) == 0;
        ArrayList arrayListM = p13.x.m(context.getString(R.string.workouts_adapt_based_on_fitness));
        if (z14) {
            String string = context.getString(R.string.some_days_include_double_workouts);
            string.getClass();
            arrayListM.add(string);
        } else if (z15) {
            String string2 = context.getString(R.string.able_to_run_for_minutes, "30");
            string2.getClass();
            arrayListM.add(string2);
        }
        return i53.a.j(arrayListM);
    }
}
