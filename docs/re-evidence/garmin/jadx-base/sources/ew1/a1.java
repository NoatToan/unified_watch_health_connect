package ew1;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import kotlin.w3;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/a1;", "Lew1/u;", "<init>", "()V", "a", "Ljv1/s;", "wizardData", "Ltw1/d;", "selectedHoursPerWeek", "", "nextButtonEnabled", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a1 extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f66302e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f66304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<tw1.d> f66305d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/a1$b", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            b.u onBackPressedDispatcher;
            a aVar = a1.f66302e;
            a1 a1Var = a1.this;
            if (!a1Var.z6().f13385r1) {
                aw1.h hVarZ6 = a1Var.z6();
                jv1.s sVarI6 = hVarZ6.i6();
                hVarZ6.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 511) : null);
                jv1.s sVarI7 = hVarZ6.i6();
                hVarZ6.k8(sVarI7 != null ? jv1.s.a(sVarI7, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 511) : null);
            }
            f(false);
            androidx.fragment.app.m activity = a1Var.getActivity();
            if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66307a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f66307a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66307a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66309b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66308a = aVar;
            this.f66309b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66308a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66309b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66310a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66310a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66310a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a1() {
        super(R.layout.fbt_activity_view);
        this.f66303b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new c(this), new e(this), new d(null, this));
        this.f66304c = new b();
        this.f66305d = p13.x.k(new tw1.d("Beginner", "Beginner", 8, 4, 6), new tw1.d("Intermediate", "Intermediate", 12, 6, 6));
    }

    public static String y6(tw1.d dVar) {
        return dVar.getWorkoutsPerWeekMin() == dVar.getWorkoutsPerWeekMax() ? String.valueOf(dVar.getWorkoutsPerWeekMax()) : androidx.core.view.j.d(dVar.getWorkoutsPerWeekMin(), dVar.getWorkoutsPerWeekMax(), "-");
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(activity.getString(R.string.set_schedule));
            b.u onBackPressedDispatcher = activity.getOnBackPressedDispatcher();
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.b(this.f66304c, viewLifecycleOwner);
        }
        View viewFindViewById = view2.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(641074854, true, new z0(this, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w6(h4.r rVar, List list, tw1.d dVar, boolean z14, int i14, int i15, e23.l lVar, p3.m mVar, int i16) {
        h4.r rVar2;
        String strJ;
        p3.o0 o0VarE = mVar.E(1972820679);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i16 | 6 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.B(dVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.k(i14) ? 16384 : 8192) | (o0VarE.k(i15) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(this) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            h4.r.a aVar = h4.r.S;
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(dVar);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = hb.a.n(dVar != null, o0VarE);
            }
            p3.p1 p1Var2 = (p3.p1) objQ2;
            h4.r rVarE = u1.n.e(c2.x2.d(aVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            h4.r rVarA = c2.b0.f22601a.a(u1.a2.b(c2.x2.f(aVar, 1.0f), u1.a2.a(o0VarE), true), 1.0f, true);
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
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
            d92.b.f58625c.getClass();
            g02.b2.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, gl1.y.Q(o0VarE, R.string.how_many_hours_to_train), null, null, null, null, o0VarE, (i17 >> 6) & 8176, 480);
            o0VarE = o0VarE;
            o0VarE.C(-1624682278);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tw1.d dVar2 = (tw1.d) it.next();
                boolean zG = p005kotlin.jvm.internal.s.g(dVar2, (tw1.d) p1Var.getF182175a());
                String strP = gl1.y.P(R.string.lbl_plural_more_than_one_hour_capitalized, new Object[]{Integer.valueOf(dVar2.getAvgWorkoutHoursPerWeek())}, o0VarE);
                String strG = e5.g(y6(dVar2), StringUtils.SPACE, gl1.y.Q(o0VarE, R.string.lbl_workouts_per_week));
                String strG2 = e5.g(y6(dVar2), StringUtils.SPACE, gl1.y.Q(o0VarE, R.string.lbl_workouts_per_week_title));
                if (zG) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 628183670, R.string.selected, o0VarE, false);
                } else {
                    o0VarE.C(-2001055011);
                    o0VarE.g0(false);
                    strJ = "";
                }
                b92.a aVarA = wz1.a.a(strP + " . " + strG2 + " . " + strJ);
                boolean zR = o0VarE.r(dVar2);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new ci0.b(dVar2, 20, p1Var2, p1Var);
                    o0VarE.K(objQ3);
                }
                int i18 = b92.a.f16960b;
                p3.o0 o0Var = o0VarE;
                cw1.r.b(null, strP, strG, aVarA, zG, false, (e23.l) objQ3, o0Var, 0, 33);
                o0VarE = o0Var;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            b82.c.b(null, null, z3.f.c(-1800685412, new cw1.h0(lVar, p1Var2, p1Var, 2), o0VarE), null, 0L, o0VarE, 384, 27);
            o0VarE.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(this, rVar2, list, dVar, z14, i14, i15, lVar, i16, 2);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTItpHoursPerWeekSelectionFragmentCompose";
    }

    public final aw1.h z6() {
        return (aw1.h) this.f66303b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/a1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
