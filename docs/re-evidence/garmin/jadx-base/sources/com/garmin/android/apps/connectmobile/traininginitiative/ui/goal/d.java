package com.garmin.android.apps.connectmobile.traininginitiative.ui.goal;

import am.j1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import e11.f0;
import e23.l;
import f2.o0;
import fg0.j;
import fw.p;
import fz1.i;
import fz1.k;
import fz1.r;
import g02.b2;
import h5.e0;
import i3.e5;
import i3.mh;
import l72.p2;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "", "enableNextBtn", "Lfz1/r;", "goalSelection", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46013c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46014a = new w1(s0.f105811a.b(k.class), new e(this), new g(this), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f46015b = new c();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46017b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46016a = iArr;
            int[] iArr2 = new int[r.values().length];
            try {
                iArr2[r.FINISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[r.FINISH_GOAL_DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[r.FINISH_LEG_GOALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f46017b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/goal/d$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = d.f46013c;
            d dVar = d.this;
            if (!dVar.v6().f74012k) {
                if (dVar.v6().f74009h) {
                    dVar.v6().z4().m("EventGoalSetUpFragment");
                    return;
                } else {
                    dVar.v6().M4();
                    return;
                }
            }
            m activity = dVar.getActivity();
            if (activity != null) {
                activity.setResult(0);
                activity.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0892d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46019a;

        public C0892d(l lVar) {
            lVar.getClass();
            this.f46019a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f46019a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46019a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46020a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46020a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46020a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46022b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46021a = aVar;
            this.f46022b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46021a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46022b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46023a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46023a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46023a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        o13.p pVar;
        j eventCustomization;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        if (v6().f74012k) {
            j eventCustomization2 = v6().x4().getEventCustomization();
            if ((eventCustomization2 != null ? eventCustomization2.h() : null) != null) {
                pVar = new o13.p(r.FINISH_LEG_GOALS, Boolean.TRUE);
            } else {
                j eventCustomization3 = v6().x4().getEventCustomization();
                if (eventCustomization3 == null || !eventCustomization3.y()) {
                    pVar = ((v6().f74013l || v6().f74014m) && ((eventCustomization = v6().x4().getEventCustomization()) == null || !eventCustomization.y())) ? new o13.p(r.FINISH, Boolean.TRUE) : new o13.p(null, Boolean.FALSE);
                } else {
                    pVar = new o13.p(r.FINISH_GOAL_DISTANCE, Boolean.TRUE);
                }
            }
        } else {
            pVar = new o13.p(null, Boolean.FALSE);
        }
        composeView.setContent(new z3.e(133857363, true, new i(this, (r) pVar.f128594a, ((Boolean) pVar.f128595b).booleanValue(), 0, (byte) 0)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        int i14 = v6().f74012k ? R.string.set_goals_title : R.string.event_goal;
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.setTitle(mVarRequireActivity.getString(i14));
        u onBackPressedDispatcher = mVarRequireActivity.getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46015b, viewLifecycleOwner);
        k kVarV6 = v6();
        kVarV6.A4().m(null);
        kVarV6.f74007f = false;
        v6().D.f(getViewLifecycleOwner(), new C0892d(new o0(this, 25)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r7v34 */
    public final void u6(r rVar, boolean z14, p3.m mVar, int i14) {
        d dVar;
        int i15;
        boolean z15;
        b0 b0Var;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        int i16;
        h4.r.a aVar;
        String strJ;
        p1 p1Var2;
        p1 p1Var3;
        boolean z16;
        String strJ2;
        p1 p1Var4;
        boolean z17;
        p1 p1Var5;
        p3.o0 o0VarE = mVar.E(1537740033);
        int i17 = i14 | (o0VarE.k(rVar == null ? -1 : rVar.ordinal()) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = hb.a.n(z14, o0VarE);
            }
            p1 p1Var6 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p0.n(rVar);
                o0VarE.K(objQ2);
            }
            p1 p1Var7 = (p1) objQ2;
            fg0.d completionTarget = v6().x4().getCompletionTarget();
            if ((completionTarget != null ? completionTarget.getUnitType() : null) == gg0.h.TIME) {
                i15 = R.string.finish_with_goal_distance;
            } else {
                i15 = v6().E4() ? R.string.finish_overall_time_goal : R.string.finish_with_goal_time;
            }
            j jVar = v6().f74021v;
            if (jVar != null) {
                if (jVar.getCustomGoal() != null) {
                    p1Var7.setValue(r.FINISH_GOAL_DISTANCE);
                    p1Var6.setValue(Boolean.TRUE);
                } else if (jVar.h() != null) {
                    p1Var7.setValue(r.FINISH_LEG_GOALS);
                    p1Var6.setValue(Boolean.TRUE);
                }
                Unit unit = Unit.INSTANCE;
            }
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int i18 = i15;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
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
            b0 b0Var2 = b0.f22601a;
            String strJ3 = v6().f74017p;
            if (strJ3 == null) {
                z15 = false;
                strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2093630182, R.string.what_is_goal_for_event, o0VarE, false);
            } else {
                z15 = false;
                o0VarE.C(2093628663);
                o0VarE.g0(false);
            }
            String str = strJ3;
            if (v6().D4()) {
                o0VarE.C(478135231);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7);
                boolean z18 = !v6().f74014m;
                fy1.d dVar2 = v6().f74018q;
                p1Var = p1Var7;
                i16 = i18;
                b0Var = b0Var2;
                c2565a = c2565a2;
                b2.a(rVarC2, z18, (dVar2 != null ? dVar2.f73890a : z15) == true ? 1 : 0, v6().f74019r, str, gl1.y.Q(o0VarE, R.string.only_visible_to_you), null, null, null, o0VarE, 0, 448);
                o0VarE.g0(z15);
                aVar = aVar2;
            } else {
                b0Var = b0Var2;
                c2565a = c2565a2;
                p1Var = p1Var7;
                i16 = i18;
                o0VarE.C(478668493);
                d92.b.f58623a.getClass();
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                d6.h.f57752b.getClass();
                int i19 = d6.h.f57755e;
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97920e;
                bVar2.getClass();
                float f16 = eVar.f97920e;
                bVar2.getClass();
                aVar = aVar2;
                mh.c(str, c2.l.C(aVar2, f16, f14, eVar.f97921f, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
                String strQ = gl1.y.Q(o0VarE, R.string.only_visible_to_you);
                fVar.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                bVar2.getClass();
                float f17 = eVar.f97918c;
                org.apache.commons.lang3.e.j(bVar2);
                mh.c(strQ, c2.l.B(aVar, f15, f17, f15, eVar.f97923h), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            String strQ2 = gl1.y.Q(o0VarE, R.string.finish_the_event);
            boolean z19 = ((r) p1Var.getF182175a()) == r.FINISH;
            String strJ4 = "";
            if (z19) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2093681089, R.string.lbl_selected, o0VarE, false);
            } else {
                o0VarE.C(479650695);
                o0VarE.g0(false);
                strJ = "";
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ2, ". ", strJ));
            b92.a aVarB = c0235a.b();
            p2 p2Var = p2.f111205a;
            z3.e eVarC = z3.f.c(855783042, new an1.i(z19, 24), o0VarE);
            Object objQ3 = o0VarE.q();
            p3.m.a.C2565a c2565a3 = c2565a;
            if (objQ3 == c2565a3) {
                p1Var2 = p1Var;
                objQ3 = new j1(p1Var2, p1Var6, 1);
                o0VarE.K(objQ3);
            } else {
                p1Var2 = p1Var;
            }
            int i24 = b92.a.f16960b;
            p1 p1Var8 = p1Var2;
            p2Var.g(strQ2, null, aVarB, null, eVarC, false, z19, (e23.a) objQ3, o0VarE, 100687872, 170);
            if (v6().f74016o) {
                p1Var3 = p1Var8;
                o0VarE.C(483550187);
                o0VarE.g0(false);
            } else {
                o0VarE.C(480846894);
                String strQ3 = gl1.y.Q(o0VarE, i16);
                boolean z24 = ((r) p1Var8.getF182175a()) == r.FINISH_GOAL_DISTANCE;
                if (z24) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2093726593, R.string.lbl_selected, o0VarE, false);
                } else {
                    o0VarE.C(481061319);
                    o0VarE.g0(false);
                    strJ2 = "";
                }
                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                c0235a2.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ3, ". ", strJ2));
                b92.a aVarB2 = c0235a2.b();
                z3.e eVarC2 = z3.f.c(-1358928172, new an1.i(z24, 25), o0VarE);
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a3) {
                    p1Var4 = p1Var8;
                    objQ4 = new j1(p1Var4, p1Var6, 2);
                    o0VarE.K(objQ4);
                } else {
                    p1Var4 = p1Var8;
                }
                p1 p1Var9 = p1Var4;
                p2Var.g(strQ3, null, aVarB2, null, eVarC2, false, z24, (e23.a) objQ4, o0VarE, 100687872, 170);
                if (v6().E4()) {
                    o0VarE.C(482188016);
                    String strQ4 = gl1.y.Q(o0VarE, R.string.finish_leg_time_goals);
                    boolean z25 = ((r) p1Var9.getF182175a()) == r.FINISH_LEG_GOALS;
                    if (z25) {
                        strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2093771233, R.string.lbl_selected, o0VarE, false);
                    } else {
                        o0VarE.C(482445159);
                        o0VarE.g0(false);
                    }
                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                    c0235a3.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ4, ". ", strJ4));
                    b92.a aVarB3 = c0235a3.b();
                    z3.e eVarC3 = z3.f.c(-1539021457, new an1.i(z25, 26), o0VarE);
                    Object objQ5 = o0VarE.q();
                    if (objQ5 == c2565a3) {
                        p1Var5 = p1Var9;
                        objQ5 = new j1(p1Var5, p1Var6, 3);
                        o0VarE.K(objQ5);
                    } else {
                        p1Var5 = p1Var9;
                    }
                    e23.a aVar5 = (e23.a) objQ5;
                    p1Var3 = p1Var5;
                    p2Var.g(strQ4, null, aVarB3, null, eVarC3, false, z25, aVar5, o0VarE, 100687872, 170);
                    z17 = false;
                    o0VarE.g0(false);
                } else {
                    p1Var3 = p1Var9;
                    z17 = false;
                    o0VarE.C(483536299);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z17);
            }
            c2.l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
            if (v6().D4()) {
                o0VarE.C(483713402);
                dVar = this;
                b82.c.a(null, null, z3.f.c(-214928353, new f0(dVar, 18, p1Var6, p1Var3), o0VarE), 0L, o0VarE, 384, 11);
                o0VarE.g0(false);
            } else {
                dVar = this;
                o0VarE.C(484673596);
                l72.f0 f0Var = l72.f0.f110999a;
                h4.r rVarF = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                boolean zBooleanValue = ((Boolean) p1Var6.getF182175a()).booleanValue();
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_next);
                boolean zR = o0VarE.r(dVar);
                Object objQ6 = o0VarE.q();
                if (zR || objQ6 == c2565a3) {
                    z16 = false;
                    objQ6 = new fz1.j(dVar, p1Var3, 0);
                    o0VarE.K(objQ6);
                } else {
                    z16 = false;
                }
                f0Var.d(0, 1, (e23.a) objQ6, rVarY, strQ5, o0VarE, null, zBooleanValue);
                o0VarE.g0(z16);
            }
            o0VarE.g0(true);
        } else {
            dVar = this;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(dVar, rVar, z14, i14);
        }
    }

    public final k v6() {
        return (k) this.f46014a.getValue();
    }

    public final void w6() {
        if (!v6().f74012k) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "FinishEventSelected");
            v6().B4();
        } else {
            fy1.c.f73884a.getClass();
            fy1.c.b("GarminCoachCompletionGoalTypeSelected");
            v6().B4();
            v6().K4(getActivity());
        }
    }

    public final void y6() {
        if (v6().f74012k) {
            fy1.c.f73884a.getClass();
            fy1.c.b("GarminCoachGoalValueSelected");
        } else {
            ht.a.f85464a.getClass();
            ht.a.a(null, "FinishWithGoalSelected");
        }
        v6().z4().m("EventGoalDetailsFragment");
    }

    public final void z6() {
        if (v6().f74012k) {
            fy1.c.f73884a.getClass();
            fy1.c.b("GarminCoachGoalValueSelected");
        } else {
            ht.a.f85464a.getClass();
            ht.a.a(null, "FinishWithLegGoalSelected");
        }
        v6().F4(m52.c.SWIMMING, ng0.a.LEG_SCREEN_VIEW);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
