package px0;

import b.u;
import b.w;
import c.p;
import com.google.protobuf.DescriptorProtos;
import e23.l;
import h62.g;
import i3.e5;
import java.util.List;
import o62.s0;
import o72.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import p13.k0;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import s70.b0;
import sc.f;
import sc.j;
import w5.r;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f141770a = new a();

        @Override // e23.l
        public final Object invoke(Object obj) {
            throw new IllegalStateException(e5.f(obj, "Unknown screen "));
        }
    }

    /* JADX INFO: renamed from: px0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2660b implements l<ox0.b, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2660b f141771a = new C2660b();

        @Override // e23.l
        public final Object invoke(ox0.b bVar) {
            return bVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<ox0.a, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f141772a = new c();

        @Override // e23.l
        public final Object invoke(ox0.a aVar) {
            return aVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements l<ox0.c, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f141773a = new d();

        @Override // e23.l
        public final Object invoke(ox0.c cVar) {
            return cVar.toString();
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141774a;

        static {
            int[] iArr = new int[qx0.e.values().length];
            try {
                iArr[qx0.e.GENESIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qx0.e.REPORTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f141774a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    public static final void a(boolean z14, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1496321059);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            f fVarT = oi0.c.T(new j[]{ox0.b.INSTANCE}, o0VarE);
            p.f22335a.getClass();
            w wVarA = p.a(o0VarE);
            u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            boolean zR = o0VarE.r(fVarT) | o0VarE.r(onBackPressedDispatcher);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new p40.o0(16, fVarT, onBackPressedDispatcher);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new p40.o0(16, fVarT, onBackPressedDispatcher);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar = (e23.a) objQ;
            List listK = x.k(t.W(o0VarE), r.t(o0VarE));
            o0VarE.C(849529684);
            sc.e eVar = new sc.e(a.f141770a);
            z3.e eVarC = z3.f.c(-483848156, new s0(fVarT, 8), o0VarE);
            C2660b c2660b = C2660b.f141771a;
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            eVar.a(t0Var.b(ox0.b.class), c2660b, k0Var, eVarC);
            px0.a.f141768a.getClass();
            eVar.a(t0Var.b(ox0.a.class), c.f141772a, k0Var, px0.a.f141769b);
            eVar.a(t0Var.b(ox0.c.class), d.f141773a, k0Var, z3.f.c(-497571851, new g(z14, aVar, i16), o0VarE));
            Unit unit = Unit.INSTANCE;
            b0 b0Var = new b0(eVar, 6);
            o0VarE.g0(false);
            f.Companion companion = f.INSTANCE;
            t.f(fVarT, null, null, aVar, listK, null, null, null, null, b0Var, o0VarE, 0, DescriptorProtos.Edition.EDITION_PROTO2_VALUE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j30.d(z14, i14);
        }
    }
}
