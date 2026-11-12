package ew1;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u0014\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lew1/m0;", "Lew1/u;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/g3;", "", "findRaceState", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f66573c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66574b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66575a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f66575a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66575a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66576a = aVar;
            this.f66577b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66576a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66577b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66578a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66578a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public m0() {
        super(R.layout.fbt_activity_view);
        this.f66574b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new b(this), new d(this), new c(null, this));
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            aw1.h hVarY6 = y6();
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            if (!hVarY6.V6()) {
                string = mVarRequireActivity.getString(R.string.set_schedule);
                string.getClass();
            } else if (hVarY6.e7()) {
                string = mVarRequireActivity.getString(R.string.garmin_triathlon_coach);
                string.getClass();
            } else if (hVarY6.O6()) {
                string = mVarRequireActivity.getString(R.string.garmin_cycling_coach);
                string.getClass();
            } else if (hVarY6.b7()) {
                string = mVarRequireActivity.getString(R.string.garmin_run_coach);
                string.getClass();
            } else {
                string = mVarRequireActivity.getString(R.string.set_schedule);
                string.getClass();
            }
            activity.setTitle(string);
        }
        View viewFindViewById = view2.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-390496016, true, new l0(this, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    /* JADX WARN: Code duplicated, block: B:46:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0154  */
    /* JADX WARN: Code duplicated, block: B:53:0x0210  */
    public final void w6(String str, boolean z14, int i14, int i15, e23.a<Unit> aVar, p3.m mVar, int i16) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        j92.b bVar;
        j92.e eVar;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        p3.o0 o0VarE = mVar.E(2141438650);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = i16 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.k(i15) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(c2.x2.d(aVar2, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                f10.o.a(z14, 0.0f, i14, i15, o0VarE, (i17 & 7168) | ((i17 >> 3) & 14) | (i17 & 896), 2);
                h4.r rVarF = c2.x2.f(aVar2, 1.0f);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarA = b0Var.a(c2.l.A(rVarF, eVar.f97920e, 0.0f, 2), 1.0f, true);
                zVarA = c2.y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                bVar.getClass();
                h4.r rVarA2 = c2.l.A(aVar2, 0.0f, eVar.f97922g, 1);
                s62.a.f157643a.getClass();
                u4.d dVarA = f72.t0.a(t62.c.f162799a);
                long jD = am.j.d(o0VarE);
                gl.c.f77766a.getClass();
                long jB = gl.c.a(o0VarE).b();
                bVar.getClass();
                g02.i.a(rVarA2, dVarA, jD, jB, j92.b.f97901d.f97907f, 0.0f, null, o0VarE, 0, 224);
                d6.h.f57752b.getClass();
                int i18 = d6.h.f57755e;
                d6.h hVarA = d6.h.a(i18);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, i17 & 14, 0, 130046);
                String strQ = gl1.y.Q(o0VarE, R.string.find_race_to_train_for);
                d6.h hVarA2 = d6.h.a(i18);
                fVar2.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130046);
                o0VarE.g0(true);
                b82.c.b(null, null, z3.f.c(-1592670065, new cq0.p(aVar, 18), o0VarE), null, 0L, o0VarE, 384, 27);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            f10.o.a(z14, 0.0f, i14, i15, o0VarE, (i17 & 7168) | ((i17 >> 3) & 14) | (i17 & 896), 2);
            h4.r rVarF2 = c2.x2.f(aVar2, 1.0f);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            h4.r rVarA3 = b0Var2.a(c2.l.A(rVarF2, eVar.f97920e, 0.0f, 2), 1.0f, true);
            zVarA = c2.y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA3, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            bVar.getClass();
            h4.r rVarA4 = c2.l.A(aVar2, 0.0f, eVar.f97922g, 1);
            s62.a.f157643a.getClass();
            u4.d dVarA2 = f72.t0.a(t62.c.f162799a);
            long jD2 = am.j.d(o0VarE);
            gl.c.f77766a.getClass();
            long jB2 = gl.c.a(o0VarE).b();
            bVar.getClass();
            g02.i.a(rVarA4, dVarA2, jD2, jB2, j92.b.f97901d.f97907f, 0.0f, null, o0VarE, 0, 224);
            d6.h.f57752b.getClass();
            int i19 = d6.h.f57755e;
            d6.h hVarA3 = d6.h.a(i19);
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, hVarA3, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, i17 & 14, 0, 130046);
            String strQ2 = gl1.y.Q(o0VarE, R.string.find_race_to_train_for);
            d6.h hVarA4 = d6.h.a(i19);
            fVar3.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, hVarA4, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130046);
            o0VarE.g0(true);
            b82.c.b(null, null, z3.f.c(-1592670065, new cq0.p(aVar, 18), o0VarE), null, 0L, o0VarE, 384, 27);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(this, str, z14, i14, i15, aVar, i16);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTFindRaceFragmentCompose";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66574b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/m0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
