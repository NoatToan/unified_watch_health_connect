package ew1;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import kotlin.w3;
import p005kotlin.Metadata;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0014\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/w1;", "Lew1/u;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/g3;", "Lhv1/f;", "uiModel", "avgWeeklyHours", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w1 extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f66814e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f66816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a4.b f66817d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66818a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66818a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/w1$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = w1.f66814e;
            w1 w1Var = w1.this;
            w1Var.y6().L7(null);
            f(false);
            androidx.fragment.app.m activity = w1Var.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66820a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66820a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66820a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66822b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66821a = aVar;
            this.f66822b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66821a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66822b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66823a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f66823a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66823a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public w1() {
        super(R.layout.fbt_activity_view);
        this.f66815b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new d(this), new f(this), new e(null, this));
        this.f66816c = new c();
        this.f66817d = new a4.b(this, 18);
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(activity.getString(R.string.set_goals_title));
            b.u onBackPressedDispatcher = activity.getOnBackPressedDispatcher();
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.b(this.f66816c, viewLifecycleOwner);
        }
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-432370612, true, new t1(this, 0)));
        aw1.h hVarY6 = y6();
        ge1.b.T(androidx.lifecycle.v1.a(hVarY6), null, null, new aw1.j(hVarY6, null), 3);
        ((androidx.lifecycle.s0) y6().f13367a1.getValue()).f(getViewLifecycleOwner(), this.f66817d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w6(aw1.h hVar, boolean z14, boolean z15, e23.l lVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        boolean z16;
        hv1.f fVar;
        p3.o0 o0VarE = mVar.E(51262827);
        int i15 = 4;
        int i16 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarG = o53.f0.G(hVar.f13380m1, o0VarE);
            g3 g3Var = (g3) p1VarG.getF182175a();
            if ((g3Var != null ? g3Var.f35300a : null) == fw.p.SUCCESS) {
                Object objH = r1.q2.h(o0VarE, -1837098901, p3.m.f135153a);
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objH == c2565a) {
                    g3 g3Var2 = (g3) p1VarG.getF182175a();
                    if (g3Var2 == null || (fVar = (hv1.f) g3Var2.f35301b) == null) {
                        fVar = hv1.f.ZERO_FOUR;
                    }
                    objH = p3.p0.n(fVar);
                    o0VarE.K(objH);
                }
                p3.p1 p1Var = (p3.p1) objH;
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
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                o0Var = o0VarE;
                g02.b2.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), z14, hVar.C5("FBTRideWeeklyAvgHoursFragCompose"), hVar.Y5(), gl1.y.Q(o0VarE, R.string.how_many_hours_ride), gl1.y.Q(o0VarE, R.string.current_training_details_message), null, null, null, o0Var, i16 & 112, 448);
                hv1.f fVar2 = (hv1.f) p1Var.getF182175a();
                Object objQ = o0Var.q();
                if (objQ == c2565a) {
                    objQ = new et1.b2(p1Var, i15);
                    o0Var.K(objQ);
                }
                cw1.v1.a(fVar2, (e23.l) objQ, o0Var, 48);
                c2.l.f(b0Var.a(aVar, 1.0f, true), o0Var);
                if (z15) {
                    o0Var.C(2061059766);
                    b82.c.b(null, null, z3.f.c(1455154476, new bt1.k(lVar, p1Var, 7), o0Var), null, 0L, o0Var, 384, 27);
                    z16 = false;
                    o0Var.g0(false);
                } else {
                    z16 = false;
                    o0Var.C(2061567174);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                o0Var.g0(z16);
            } else {
                o0Var = o0VarE;
                o0Var.C(-1835734281);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u1(this, hVar, z14, z15, lVar, i14, 0);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTRideWeeklyAvgHoursFragCompose";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66815b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/w1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
