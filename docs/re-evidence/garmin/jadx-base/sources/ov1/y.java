package ov1;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import g02.b2;
import h5.e0;
import i3.e5;
import java.util.List;
import java.util.Locale;
import o4.m1;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lov1/y;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lmv1/b;", "preferenceState", "", "checkedState", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f134244b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f134245a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jv1.c f134246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f134247b;

        public b(jv1.c cVar, n1 n1Var) {
            this.f134246a = cVar;
            this.f134247b = n1Var;
        }

        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            bool.booleanValue();
            int iOrdinal = this.f134246a.ordinal();
            a aVar = y.f134244b;
            this.f134247b.t(iOrdinal);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jv1.c f134248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f134249b;

        public c(jv1.c cVar, n1 n1Var) {
            this.f134248a = cVar;
            this.f134249b = n1Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            int iOrdinal = this.f134248a.ordinal();
            a aVar = y.f134244b;
            this.f134249b.t(iOrdinal);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f134250a;

        public d(List list) {
            this.f134250a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f134250a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f134251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f134252b;

        public e(List list, n1 n1Var) {
            this.f134251a = list;
            this.f134252b = n1Var;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:43:0x0106  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                jv1.c cVar = (jv1.c) this.f134251a.get(iIntValue);
                mVar2.C(-824553417);
                int iOrdinal = cVar.ordinal();
                int i15 = cVar.f101019a;
                int iOrdinal2 = jv1.c.AUTO.ordinal();
                p3.m.a aVar = p3.m.f135153a;
                n1 n1Var = this.f134252b;
                if (iOrdinal == iOrdinal2) {
                    mVar2.C(-824501710);
                    String strQ = gl1.y.Q(mVar2, i15);
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_pace);
                    Locale locale = Locale.ROOT;
                    String lowerCase = strQ2.toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = gl1.y.Q(mVar2, R.string.sensor_hr).toLowerCase(locale);
                    lowerCase2.getClass();
                    String strP = gl1.y.P(R.string.workouts_change_between_target_types, new Object[]{lowerCase, lowerCase2}, mVar2);
                    int iOrdinal3 = cVar.ordinal();
                    a aVar2 = y.f134244b;
                    boolean z14 = iOrdinal3 == n1Var.getIntValue();
                    boolean zK = mVar2.k(cVar.ordinal());
                    Object objQ = mVar2.q();
                    if (zK) {
                        objQ = new b(cVar, n1Var);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b(cVar, n1Var);
                            mVar2.K(objQ);
                        }
                    }
                    cw1.r.b(null, strQ, strP, null, z14, false, (e23.l) objQ, mVar2, 0, 41);
                    mVar2 = mVar2;
                    mVar2.f();
                } else {
                    mVar2.C(-823817292);
                    String strQ3 = gl1.y.Q(mVar2, i15);
                    int iOrdinal4 = cVar.ordinal();
                    a aVar3 = y.f134244b;
                    boolean z15 = iOrdinal4 == n1Var.getIntValue();
                    boolean zK2 = mVar2.k(cVar.ordinal());
                    Object objQ2 = mVar2.q();
                    if (zK2) {
                        objQ2 = new c(cVar, n1Var);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new c(cVar, n1Var);
                            mVar2.K(objQ2);
                        }
                    }
                    cw1.r.a(null, strQ3, null, z15, false, (e23.a) objQ2, mVar2, 0, 21);
                    mVar2.f();
                }
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134253a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f134253a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f134253a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f134254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f134255b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f134254a = aVar;
            this.f134255b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f134254a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f134255b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134256a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f134256a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f134256a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public y() {
        super(R.layout.fbt_compose_fragment);
        this.f134245a = new w1(s0.f105811a.b(pv1.b.class), new f(this), new h(this), new g(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.set_schedule));
        }
        androidx.fragment.app.m activity2 = getActivity();
        z1 z1Var = activity2 instanceof z1 ? (z1) activity2 : null;
        if (z1Var != null) {
            z1Var.updateActionBarNavigation(2);
        }
        tu1.a.p(view2, R.id.compose_view, new z3.e(-2079765487, true, new x(this)));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x017b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0182  */
    /* JADX WARN: Code duplicated, block: B:49:0x0186  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0201  */
    /* JADX WARN: Code duplicated, block: B:67:0x0240  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(p3.m mVar, int i14) {
        y yVar;
        List listImmutableListOf;
        jv1.c cVar;
        n1 n1Var;
        h5.g.a.f fVar;
        b0 b0Var;
        j92.b bVar;
        j92.e eVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        int i15;
        boolean zR;
        Object objQ;
        n1 n1Var2;
        jv1.c cVar2;
        o0 o0VarE = mVar.E(-1841513478);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(this) ? 4 : 2);
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            jv1.c.a aVar = jv1.c.f101012b;
            Boolean bool = v6().T0;
            Boolean bool2 = Boolean.TRUE;
            if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
                aVar.getClass();
                listImmutableListOf = Util.immutableListOf(jv1.c.AUTO, jv1.c.PACE, jv1.c.HEART_RATE);
            } else {
                aVar.getClass();
                listImmutableListOf = Util.immutableListOf(jv1.c.AUTO, jv1.c.POWER, jv1.c.HEART_RATE);
            }
            p1 p1VarC = s9.c.c(v6().S0, o0VarE);
            int iOrdinal = -1;
            if (p005kotlin.jvm.internal.s.g(v6().T0, bool2)) {
                mv1.b bVar2 = (mv1.b) p1VarC.getF182175a();
                if (bVar2 != null && (cVar2 = bVar2.f121175d) != null) {
                    iOrdinal = cVar2.ordinal();
                }
            } else {
                mv1.b bVar3 = (mv1.b) p1VarC.getF182175a();
                if (bVar3 != null && (cVar = bVar3.f121176e) != null) {
                    iOrdinal = cVar.ordinal();
                }
            }
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = e5.o(iOrdinal, o0VarE);
            }
            n1 n1Var3 = (n1) objQ2;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            long jF = vb.h.f(d92.b.f58623a, o0VarE);
            m1.a aVar3 = m1.f128891a;
            h4.r rVarE = u1.n.e(rVarD, jF, aVar3);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            z zVarA2 = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            List list = listImmutableListOf;
            if (o0VarE.T) {
                n1Var = n1Var3;
            } else {
                n1Var = n1Var3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = b0.f22601a;
                h4.r rVarE2 = u1.n.e(x2.f(aVar2, 1.0f), d92.b.a(o0VarE).c().c(), aVar3);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                c2.l.f(x2.h(rVarE2, eVar.f97920e), o0VarE);
                h4.r rVarB = a2.b(b0Var.a(x2.f(aVar2, 1.0f), 1.0f, true), a2.a(o0VarE), true);
                zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, o0VarE);
                if (p005kotlin.jvm.internal.s.g(v6().T0, bool2)) {
                    i15 = R.string.running_workout_target_preference;
                } else {
                    i15 = R.string.cycling_workout_target_preference;
                }
                bVar.getClass();
                b2.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97921f, 7), false, 0, 0, gl1.y.Q(o0VarE, i15), null, null, null, null, o0VarE, 0, 494);
                h4.r rVarA = b0Var.a(aVar2, 1.0f, true);
                zR = o0VarE.r(list);
                objQ = o0VarE.q();
                if (!zR || objQ == c2565a) {
                    n1Var2 = n1Var;
                    objQ = new o50.a(12, list, n1Var2);
                    o0VarE.K(objQ);
                } else {
                    n1Var2 = n1Var;
                }
                e2.c.b(rVarA, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
                o0VarE.g0(true);
                yVar = this;
                b82.c.b(null, null, z3.f.c(271027781, new oo0.f(5, yVar, n1Var2), o0VarE), null, 0L, o0VarE, 384, 27);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0Var = b0.f22601a;
            h4.r rVarE3 = u1.n.e(x2.f(aVar2, 1.0f), d92.b.a(o0VarE).c().c(), aVar3);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            c2.l.f(x2.h(rVarE3, eVar.f97920e), o0VarE);
            h4.r rVarB2 = a2.b(b0Var.a(x2.f(aVar2, 1.0f), 1.0f, true), a2.a(o0VarE), true);
            zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarB2, o0VarE);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, o0VarE);
            if (p005kotlin.jvm.internal.s.g(v6().T0, bool2)) {
                i15 = R.string.running_workout_target_preference;
            } else {
                i15 = R.string.cycling_workout_target_preference;
            }
            bVar.getClass();
            b2.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97921f, 7), false, 0, 0, gl1.y.Q(o0VarE, i15), null, null, null, null, o0VarE, 0, 494);
            h4.r rVarA2 = b0Var.a(aVar2, 1.0f, true);
            zR = o0VarE.r(list);
            objQ = o0VarE.q();
            if (zR) {
                n1Var2 = n1Var;
                objQ = new o50.a(12, list, n1Var2);
                o0VarE.K(objQ);
            } else {
                n1Var2 = n1Var;
                objQ = new o50.a(12, list, n1Var2);
                o0VarE.K(objQ);
            }
            e2.c.b(rVarA2, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
            o0VarE.g0(true);
            yVar = this;
            b82.c.b(null, null, z3.f.c(271027781, new oo0.f(5, yVar, n1Var2), o0VarE), null, 0L, o0VarE, 384, 27);
            o0VarE.g0(true);
        } else {
            yVar = this;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(yVar, i14);
        }
    }

    public final pv1.b v6() {
        return (pv1.b) this.f134245a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lov1/y$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
