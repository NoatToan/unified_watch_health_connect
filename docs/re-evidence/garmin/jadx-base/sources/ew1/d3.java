package ew1;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/d3;", "Lew1/u;", "<init>", "()V", "a", "Ljv1/s;", "uiModel", "", "selectedDaysPerWeek", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d3 extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f66394d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f66396c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f66397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f66398b;

        public b(boolean z14, e23.a<Unit> aVar) {
            this.f66397a = z14;
            this.f66398b = aVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                p3.x1 x1Var = p3.n.f135158a;
                b82.c.b(null, null, z3.f.c(989694623, new a42.e(this.f66397a, this.f66398b, 5), mVar2), null, b82.c.d(mVar2), mVar2, 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/d3$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = d3.f66394d;
            d3 d3Var = d3.this;
            if (d3Var.y6().J0) {
                aw1.h hVarY6 = d3Var.y6();
                hVarY6.J0 = false;
                hVarY6.F5().m(null);
            } else {
                aw1.h hVarY7 = d3Var.y6();
                jv1.s sVarI6 = hVarY7.i6();
                hVarY7.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 511) : null);
            }
            d3Var.f66396c.f(false);
            d3Var.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66400a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66400a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66400a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66401a = aVar;
            this.f66402b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66401a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66402b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66403a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f66403a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66403a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public d3() {
        super(R.layout.fbt_activity_view);
        this.f66395b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new d(this), new f(this), new e(null, this));
        this.f66396c = new c();
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.setTitle(R.string.set_schedule);
        b.u onBackPressedDispatcher = mVarRequireActivity.getOnBackPressedDispatcher();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f66396c, viewLifecycleOwner);
        tu1.a.p(view2, R.id.composable_container, new z3.e(279397519, true, new dh1.a(this, 22)));
    }

    public final void w6(final Integer num, final List<Integer> list, final e23.l<? super Integer, Unit> lVar, final boolean z14, final int i14, final int i15, boolean z15, e23.a<Unit> aVar, p3.m mVar, int i16) {
        p3.o0 o0VarE = mVar.E(-2013538380);
        int i17 = i16 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.k(i14) ? 16384 : 8192) | (o0VarE.k(i15) ? 131072 : 65536) | (o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarD = c2.x2.d(h4.r.S, 1.0f);
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
            b82.c.c(z3.f.c(474244948, new b(z15, aVar), o0VarE), z3.f.c(-1802323762, new e23.q() { // from class: ew1.c3
                /* JADX WARN: Code duplicated, block: B:25:0x00d4  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    String strH;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    d3.a aVar3 = d3.f66394d;
                    ((c2.a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar4 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        g02.b2.a(c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, gl1.y.Q(mVar2, R.string.how_many_days_to_train), null, null, null, null, mVar2, 0, 480);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Number) it.next()).intValue();
                            String strValueOf = String.valueOf(iIntValue2);
                            Integer num2 = num;
                            boolean z16 = num2 != null && num2.intValue() == iIntValue2;
                            if (z16) {
                                strH = sn.a.h(mVar2, 553021979, R.string.selected, mVar2);
                            } else {
                                mVar2.C(-36100136);
                                mVar2.f();
                                strH = "";
                            }
                            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strValueOf, ". ", strH));
                            b92.a aVarB = c0235a.b();
                            h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                            e23.l lVar2 = lVar;
                            boolean zB = mVar2.B(lVar2) | mVar2.k(iIntValue2);
                            Object objQ = mVar2.q();
                            if (zB) {
                                objQ = new au0.m(lVar2, iIntValue2, 9);
                                mVar2.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new au0.m(lVar2, iIntValue2, 9);
                                    mVar2.K(objQ);
                                }
                            }
                            int i18 = b92.a.f16960b;
                            cw1.r.a(rVarF, strValueOf, aVarB, z16, false, (e23.a) objQ, mVar2, 6, 16);
                        }
                        p3.x1 x1Var3 = p3.n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 54);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ak0.r(this, num, list, lVar, z14, i14, i15, z15, aVar, i16);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTWorkoutsPerWeekSelectionFragment";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66395b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/d3$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
