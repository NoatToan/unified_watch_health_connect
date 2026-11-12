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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0010²\u0006\u0014\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/x2;", "Lew1/u;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/g3;", "Ljv1/d0;", "uiModel", "Lhv1/j;", "weeklyDistanceValState", "", "avgPaceValueState", "Lhv1/f;", "avgWeeklyHours", "Lhv1/i;", "avgDistancePerSwim", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x2 extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f66834d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f66836c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/x2$b", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = x2.f66834d;
            x2 x2Var = x2.this;
            x2Var.y6().W7(null);
            f(false);
            androidx.fragment.app.m activity = x2Var.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66838a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f66838a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66838a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66840b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66839a = aVar;
            this.f66840b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66839a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66840b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66841a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66841a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66841a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public x2() {
        super(R.layout.fbt_activity_view);
        this.f66835b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new c(this), new e(this), new d(null, this));
        this.f66836c = new b();
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
            onBackPressedDispatcher.b(this.f66836c, viewLifecycleOwner);
        }
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-1857741358, true, new v2(this, 0)));
        aw1.h hVarY6 = y6();
        ge1.b.T(androidx.lifecycle.v1.a(hVarY6), null, null, new aw1.h0(hVarY6, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0279  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w6(aw1.h hVar, boolean z14, boolean z15, e23.l lVar, p3.m mVar, int i14) {
        p3.p1 p1Var;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        hv1.i iVar;
        hv1.f fVar2;
        jv1.d dVar;
        hv1.j jVar;
        jv1.d dVar2;
        p3.o0 o0VarE = mVar.E(581963181);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarG = o53.f0.G(hVar.f13382o1, o0VarE);
            g3 g3Var = (g3) p1VarG.getF182175a();
            if ((g3Var != null ? g3Var.f35300a : null) == fw.p.SUCCESS) {
                o0VarE.C(-1517373456);
                g3 g3Var2 = (g3) p1VarG.getF182175a();
                jv1.d0 d0Var = g3Var2 != null ? (jv1.d0) g3Var2.f35301b : null;
                p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                r0Var.f105810a = d0Var == null ? new jv1.d0(null, null, null, 7, null) : d0Var;
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    if (d0Var == null || (dVar2 = d0Var.f101031c) == null || (jVar = dVar2.f101026a) == null) {
                        jVar = hv1.j.ZERO;
                    }
                    objQ = p3.p0.n(jVar);
                    o0VarE.K(objQ);
                }
                p3.p1 p1Var2 = (p3.p1) objQ;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p3.p0.n(Integer.valueOf((d0Var == null || (dVar = d0Var.f101031c) == null) ? 0 : dVar.f101027b));
                    o0VarE.K(objQ2);
                }
                p3.p1 p1Var3 = (p3.p1) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    if (d0Var == null || (fVar2 = d0Var.f101030b) == null) {
                        fVar2 = hv1.f.ZERO_FOUR;
                    }
                    objQ3 = p3.p0.n(fVar2);
                    o0VarE.K(objQ3);
                }
                p3.p1 p1Var4 = (p3.p1) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    if (d0Var == null || (iVar = d0Var.f101029a) == null) {
                        iVar = hv1.i.NOVICE;
                    }
                    objQ4 = p3.p0.n(iVar);
                    o0VarE.K(objQ4);
                }
                p3.p1 p1Var5 = (p3.p1) objQ4;
                h4.r.a aVar = h4.r.S;
                h4.r rVarD = c2.x2.d(aVar, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                h4.g.a aVar2 = h4.d.a.f81536n;
                c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarD, o0VarE);
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
                b4.c(eVar, zVarA2, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA1, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    p1Var = p1Var2;
                } else {
                    p1Var = p1Var2;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, o0VarE);
                    b0Var = c2.b0.f22601a;
                    h4.r rVarB = u1.a2.b(b0Var.a(c2.x2.f(aVar, 1.0f), 1.0f, true), u1.a2.a(o0VarE), true);
                    zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarB, o0VarE);
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
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g02.b2.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), z14, hVar.C5("FBTTriathlonTrainingHistoryFragCompose"), hVar.Y5(), gl1.y.Q(o0VarE, R.string.tell_about_current_training), gl1.y.Q(o0VarE, R.string.current_training_details_message), null, null, null, o0VarE, i15 & 112, 448);
                    cw1.v1.g((hv1.i) p1Var5.getF182175a(), new w2(r0Var, p1Var5, 0), o0VarE, 0);
                    cw1.v1.a((hv1.f) p1Var4.getF182175a(), new w2(r0Var, p1Var4, 1), o0VarE, 0);
                    cw1.v1.e((hv1.j) p1Var.getF182175a(), ((Number) p1Var3.getF182175a()).intValue(), new w2(r0Var, p1Var, 2), new w2(r0Var, p1Var3, 3), o0VarE, 0);
                    o0VarE = o0VarE;
                    c2.l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
                    o0VarE.g0(true);
                    if (z15) {
                        o0VarE.C(-2014138740);
                        b82.c.b(null, null, z3.f.c(171586764, new r1(2, lVar, r0Var), o0VarE), null, 0L, o0VarE, 384, 27);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-2013621722);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                }
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = c2.b0.f22601a;
                h4.r rVarB2 = u1.a2.b(b0Var.a(c2.x2.f(aVar, 1.0f), 1.0f, true), u1.a2.a(o0VarE), true);
                zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB2, o0VarE);
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
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                g02.b2.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), z14, hVar.C5("FBTTriathlonTrainingHistoryFragCompose"), hVar.Y5(), gl1.y.Q(o0VarE, R.string.tell_about_current_training), gl1.y.Q(o0VarE, R.string.current_training_details_message), null, null, null, o0VarE, i15 & 112, 448);
                cw1.v1.g((hv1.i) p1Var5.getF182175a(), new w2(r0Var, p1Var5, 0), o0VarE, 0);
                cw1.v1.a((hv1.f) p1Var4.getF182175a(), new w2(r0Var, p1Var4, 1), o0VarE, 0);
                cw1.v1.e((hv1.j) p1Var.getF182175a(), ((Number) p1Var3.getF182175a()).intValue(), new w2(r0Var, p1Var, 2), new w2(r0Var, p1Var3, 3), o0VarE, 0);
                o0VarE = o0VarE;
                c2.l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
                o0VarE.g0(true);
                if (z15) {
                    o0VarE.C(-2014138740);
                    b82.c.b(null, null, z3.f.c(171586764, new r1(2, lVar, r0Var), o0VarE), null, 0L, o0VarE, 384, 27);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-2013621722);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1513731173);
                g3 g3Var3 = (g3) p1VarG.getF182175a();
                boolean z16 = (g3Var3 != null ? g3Var3.f35300a : null) == fw.p.LOADING;
                f.f66447a.getClass();
                g02.s0.a(null, z16, f.f66448b, o0VarE, 384, 1);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u1(this, hVar, z14, z15, lVar, i14, 2);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTTriathlonTrainingHistoryFragCompose";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66835b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/x2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
