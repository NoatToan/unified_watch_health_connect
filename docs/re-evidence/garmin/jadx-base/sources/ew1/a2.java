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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u0014\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/a2;", "Lew1/u;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/g3;", "Ljv1/d;", "uiModel", "Lhv1/j;", "weeklyDistanceValState", "", "avgPaceValueState", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a2 extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f66311e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.b f66313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f66314d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66315a;

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
            f66315a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/a2$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = a2.f66311e;
            a2 a2Var = a2.this;
            a2Var.y6().I7(null);
            a2Var.y6().H7(null);
            f(false);
            a2Var.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66317a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66317a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66319b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66318a = aVar;
            this.f66319b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66318a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66319b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f66320a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66320a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a2() {
        super(R.layout.fbt_activity_view);
        this.f66312b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new d(this), new f(this), new e(null, this));
        this.f66313c = new a4.b(this, 19);
        this.f66314d = new c();
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.setTitle(R.string.set_goals_title);
        b.u onBackPressedDispatcher = mVarRequireActivity.getOnBackPressedDispatcher();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f66314d, viewLifecycleOwner);
        y6().G1 = null;
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(478977661, true, new x1(this, 0)));
        aw1.h hVarY6 = y6();
        ge1.b.T(androidx.lifecycle.v1.a(hVarY6), null, null, new aw1.k(hVarY6, null), 3);
        ((androidx.lifecycle.s0) y6().f13367a1.getValue()).f(getViewLifecycleOwner(), this.f66313c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w6(aw1.h hVar, boolean z14, boolean z15, e23.p pVar, p3.m mVar, int i14) {
        p3.p1 p1Var;
        p3.p1 p1Var2;
        boolean z16;
        jv1.d dVar;
        hv1.j jVar;
        jv1.d dVar2;
        p3.o0 o0VarE = mVar.E(259730311);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarG = o53.f0.G(hVar.f13378k1, o0VarE);
            g3 g3Var = (g3) p1VarG.getF182175a();
            if ((g3Var != null ? g3Var.f35300a : null) == fw.p.SUCCESS) {
                o0VarE.C(-1904962724);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    g3 g3Var2 = (g3) p1VarG.getF182175a();
                    if (g3Var2 == null || (dVar2 = (jv1.d) g3Var2.f35301b) == null || (jVar = dVar2.f101026a) == null) {
                        jVar = hv1.j.ZERO;
                    }
                    objQ = p3.p0.n(jVar);
                    o0VarE.K(objQ);
                }
                p3.p1 p1Var3 = (p3.p1) objQ;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    g3 g3Var3 = (g3) p1VarG.getF182175a();
                    objQ2 = p3.p0.n(Integer.valueOf((g3Var3 == null || (dVar = (jv1.d) g3Var3.f35301b) == null) ? 0 : dVar.f101027b));
                    o0VarE.K(objQ2);
                }
                p3.p1 p1Var4 = (p3.p1) objQ2;
                h4.r.a aVar = h4.r.S;
                h4.r rVarD = c2.x2.d(aVar, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                h4.g.a aVar2 = h4.d.a.f81536n;
                c2.z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarD, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarB = u1.a2.b(b0Var.a(c2.x2.f(aVar, 1.0f), 1.0f, true), u1.a2.a(o0VarE), true);
                c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                g02.b2.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), z14, hVar.C5("FBTRunningWeeklyAvgDistancePaceFragCompose"), hVar.Y5(), gl1.y.Q(o0VarE, R.string.weekly_running_routine_question), gl1.y.Q(o0VarE, R.string.current_training_details_message), null, null, null, o0VarE, i15 & 112, 448);
                hv1.j jVar2 = (hv1.j) p1Var3.getF182175a();
                int iIntValue = ((Number) p1Var4.getF182175a()).intValue();
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    p1Var = p1Var3;
                    objQ3 = new et1.b2(p1Var, 5);
                    o0VarE.K(objQ3);
                } else {
                    p1Var = p1Var3;
                }
                e23.l lVar = (e23.l) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    p1Var2 = p1Var4;
                    objQ4 = new et1.b2(p1Var2, 6);
                    o0VarE.K(objQ4);
                } else {
                    p1Var2 = p1Var4;
                }
                cw1.v1.e(jVar2, iIntValue, lVar, (e23.l) objQ4, o0VarE, 3456);
                o0VarE = o0VarE;
                c2.l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
                o0VarE.g0(true);
                if (z15) {
                    o0VarE.C(1892186497);
                    z16 = false;
                    b82.c.b(null, null, z3.f.c(-150646106, new y1(pVar, p1Var, p1Var2, 0 == true ? 1 : 0), o0VarE), null, 0L, o0VarE, 384, 27);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    o0VarE.C(1892719852);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-1902771551);
                g3 g3Var4 = (g3) p1VarG.getF182175a();
                boolean z17 = (g3Var4 != null ? g3Var4.f35300a : null) == fw.p.LOADING;
                ew1.d.f66369a.getClass();
                g02.s0.a(null, z17, ew1.d.f66370b, o0VarE, 384, 1);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u1(this, hVar, z14, z15, pVar, i14, 1);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTRunningWeeklyAvgDistancePaceFragCompose";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66312b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/a2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
