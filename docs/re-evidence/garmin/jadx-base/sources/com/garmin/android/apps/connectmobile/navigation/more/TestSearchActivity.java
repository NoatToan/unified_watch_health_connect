package com.garmin.android.apps.connectmobile.navigation.more;

import android.os.Bundle;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import ca0.q1;
import e23.p;
import h4.k;
import h5.e0;
import h5.g;
import i3.dd;
import i3.mh;
import i3.uc;
import j92.f;
import l72.c3;
import l72.p2;
import o13.m;
import o13.r;
import o13.t;
import o4.d0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m1;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import u1.a2;
import v.h;
import v13.e;
import v13.i;
import vv0.u;
import vy0.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/TestSearchActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "", "magicSearchChecked", "similarityThresholdChecked", "", "sliderStep", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TestSearchActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39390b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39391a = m.b(new u(15));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.navigation.more.TestSearchActivity$TestSearchScreen$1$1", f = "TestSearchActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f39393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f39393b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return TestSearchActivity.this.new a(this.f39393b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = TestSearchActivity.f39390b;
            TestSearchActivity.this.ea().g(this.f39393b.getF182175a().booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.navigation.more.TestSearchActivity$TestSearchScreen$2$1", f = "TestSearchActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f39395b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f39395b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return TestSearchActivity.this.new b(this.f39395b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = TestSearchActivity.f39390b;
            TestSearchActivity.this.ea().e(this.f39395b.getF182175a().booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void da(p3.m mVar, int i14) {
        TestSearchActivity testSearchActivity;
        long j8;
        o0 o0VarE = mVar.E(1972696689);
        int i15 = i14 | (o0VarE.r(this) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.valueOf(ea().c()));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.valueOf(ea().k()));
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Boolean bool = (Boolean) p1Var.getF182175a();
            bool.getClass();
            boolean zR = o0VarE.r(this);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new a(p1Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, bool, o0VarE);
            Boolean bool2 = (Boolean) p1Var2.getF182175a();
            bool2.getClass();
            boolean zR2 = o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new b(p1Var2, null);
                o0VarE.K(objQ4);
            }
            l0.e((p) objQ4, bool2, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar, 1.0f), a2.a(o0VarE), true);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarB, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            ea().getClass();
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            h4.r rVarY = l.y(aVar, f14);
            f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = f.f97931h;
            mh.c("✨Type ??? to reveal all search results in More Menu", rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            p2 p2Var = p2.f111205a;
            p2Var.g("Enable magic search (???)", null, null, null, z3.f.c(-709645488, new sk0.c(p1Var, 11), o0VarE), false, false, null, o0VarE, 24582, 494);
            p2Var.g("Enable similarity threshold filter for fuzzy search results", null, null, null, z3.f.c(1876340217, new sk0.c(p1Var2, 12), o0VarE), false, false, null, o0VarE, 24582, 494);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(146765585);
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = n23.j.o((float) (ea().f() * ((double) 100)), o0VarE);
                }
                m1 m1Var = (m1) objQ5;
                c3 c3Var = c3.f110949a;
                float floatValue = m1Var.getFloatValue();
                j23.e eVar2 = new j23.e(0.0f, 100.0f);
                bVar2.getClass();
                h4.r rVarY2 = l.y(aVar, f15);
                dd ddVar = dd.f87874a;
                long jD = am.j.d(o0VarE);
                if (d92.b.d(o0VarE)) {
                    d0.f128823b.getClass();
                    j8 = d0.f128826e;
                } else {
                    d0.f128823b.getClass();
                    j8 = d0.f128824c;
                }
                d0.f128823b.getClass();
                long j14 = d0.f128831j;
                long jG = d92.b.a(o0VarE).e().g();
                ddVar.getClass();
                uc ucVarG = dd.g(jD, j8, j14, jG, j14, o0VarE, 992);
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new q1(m1Var, 10);
                    o0VarE.K(objQ6);
                }
                e23.l<? super Float, Unit> lVar = (e23.l) objQ6;
                boolean zR3 = o0VarE.r(this);
                Object objQ7 = o0VarE.q();
                if (zR3 || objQ7 == c2565a) {
                    objQ7 = new vv0.n(5, this, m1Var);
                    o0VarE.K(objQ7);
                }
                testSearchActivity = this;
                c3Var.a(floatValue, lVar, rVarY2, false, eVar2, 99, ucVarG, (e23.a) objQ7, o0VarE, 196656, 8);
                String str = "Similarity Threshold: " + ((int) m1Var.getFloatValue()) + "% - fuzzy search results with similarity score below this threshold will be filtered out";
                fVar.getClass();
                x0 x0VarB = d92.c.b(x0Var, o0VarE);
                bVar2.getClass();
                mh.c(str, l.A(aVar, f15, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                testSearchActivity = this;
                o0VarE.C(148201319);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            testSearchActivity = this;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(testSearchActivity, i14);
        }
    }

    public final vy0.r ea() {
        return (vy0.r) this.f39391a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new z3.e(-359284159, true, new h0(this, 0, (byte) 0)));
    }
}
