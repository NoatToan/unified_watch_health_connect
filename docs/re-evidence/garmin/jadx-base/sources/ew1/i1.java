package ew1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.Locale;
import p005kotlin.Metadata;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lew1/i1;", "Lew1/u;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i1 extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f66514e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.b f66516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f66517d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66518a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66518a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/i1$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            i1 i1Var = i1.this;
            i1Var.y6().H5().getClass();
            i1Var.y6().f13386s1 = false;
            i1Var.f66517d.f(false);
            i1Var.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66520a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66520a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66520a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66522b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66521a = aVar;
            this.f66522b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66521a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66522b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66523a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f66523a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66523a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public i1() {
        super(R.layout.fbt_compose_fragment);
        this.f66515b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new d(this), new f(this), new e(null, this));
        this.f66516c = new a4.b(this, 17);
        this.f66517d = new c();
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f66517d, viewLifecycleOwner);
        requireActivity().setTitle(R.string.lbl_adaptive_training_plan);
        boolean z14 = y6().f13386s1;
        vt1.o oVarS5 = y6().S5();
        if (oVarS5 == null) {
            oVarS5 = vt1.o.f180175f;
        }
        vt1.o oVar = oVarS5;
        vt1.f fVarL5 = y6().L5();
        if (z14) {
            fy1.c.f73884a.getClass();
            fy1.c.b("GarminCoachNoCompatiblePlansDeadEnd");
        } else {
            fy1.c.f73884a.getClass();
            fy1.c.b("GarminCoachNoCompatiblePlansShown");
        }
        ((ComposeView) view2.findViewById(R.id.compose_view)).setContent(new z3.e(1040278344, true, new g1(this, z14, oVar, fVarL5, 0, (byte) 0)));
        y6().A5().f(getViewLifecycleOwner(), this.f66516c);
    }

    @Override // ew1.u
    public final boolean u6() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0289  */
    /* JADX WARN: Code duplicated, block: B:59:0x02e1  */
    public final void w6(boolean z14, vt1.o oVar, vt1.f fVar, p3.m mVar, int i14) {
        boolean z15;
        Object obj;
        p3.o0 o0VarE = mVar.E(1594676667);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.k(oVar.ordinal()) ? 32 : 16) | (o0VarE.r(fVar) ? 256 : 128) | (o0VarE.r(this) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = c2.x2.d(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97922g;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarD, eVar.f97920e, f14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81537o, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            u4.d dVarA = oVar.a();
            long jD = am.j.d(o0VarE);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(o0VarE).b();
            bVar.getClass();
            g02.i.a(null, dVarA, jD, jB, j92.b.f97901d.f97907f, 0.0f, null, o0VarE, 0, 225);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.no_compatible_training_plans);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 131068);
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            bVar.getClass();
            h4.r rVarC3 = c2.l.C(rVarF, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            String strQ2 = gl1.y.Q(o0VarE, R.string.no_matching_plans_description);
            fVar2.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            mh.c(strQ2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            if (z14) {
                o0VarE.C(-1320099491);
                o0VarE.g0(false);
            } else {
                h4.r rVarC4 = c2.l.C(ds.e0.g(o0VarE, -1320502584, aVar, 1.0f, bVar), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                String lowerCase = fVar.c(context).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String strP = gl1.y.P(R.string.update_goal_to_match_plan, new Object[]{lowerCase}, o0VarE);
                fVar2.getClass();
                mh.c(strP, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            c2.l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
            p3.m.a aVar3 = p3.m.f135153a;
            int i17 = R.string.lbl_exit;
            if (z14) {
                z15 = false;
                obj = this;
                o0VarE.C(-1319599523);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1319996416);
                l72.f0 f0Var = l72.f0.f110999a;
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_exit);
                h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
                bVar.getClass();
                h4.r rVarC5 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                obj = this;
                boolean zR = o0VarE.r(obj);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new e40.d(obj, 15);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e40.d(obj, 15);
                        o0VarE.K(objQ);
                    }
                }
                f0Var.i(strQ3, rVarC5, false, (e23.a) objQ, o0VarE, 0, 4);
                z15 = false;
                o0VarE.g0(false);
            }
            if (!z14) {
                i17 = R.string.change_goal;
            }
            l72.f0 f0Var2 = l72.f0.f110999a;
            String strQ4 = gl1.y.Q(o0VarE, i17);
            h4.r rVarF3 = c2.x2.f(aVar, 1.0f);
            if ((i15 & 14) == 4) {
                z15 = true;
            }
            boolean zR2 = o0VarE.r(obj) | z15 | o0VarE.r(fVar) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                an0.d dVar = new an0.d(z14, obj, fVar, context, 1);
                o0VarE.K(dVar);
                objQ2 = dVar;
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    an0.d dVar2 = new an0.d(z14, obj, fVar, context, 1);
                    o0VarE.K(dVar2);
                    objQ2 = dVar2;
                }
            }
            f0Var2.d(384, 9, (e23.a) objQ2, rVarF3, strQ4, o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g1(this, z14, oVar, fVar, i14);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTNoCompatiblePlansFragment";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66515b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/i1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
