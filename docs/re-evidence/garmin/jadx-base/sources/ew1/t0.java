package ew1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import i3.e5;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\nX\u008a\u0084\u0002"}, d2 = {"Lew1/t0;", "Lew1/u;", "<init>", "()V", "a", "Ljv1/s;", "uiModel", "Lvt1/f;", "selectedGoalType", "Lcom/garmin/android/apps/connectmobile/g3;", "Ljv1/f;", "coachPlanData", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f66754g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vt1.f f66756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jv1.m f66757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f66758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f66759f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f66761b;

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
            f66760a = iArr;
            int[] iArr2 = new int[vt1.o.values().length];
            try {
                iArr2[vt1.o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[vt1.o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f66761b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/t0$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0049  */
        /* JADX WARN: Code duplicated, block: B:15:0x0051  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.s
        public final void b() {
            t0 t0Var = t0.this;
            vt1.f fVar = t0Var.f66756c;
            if (t0Var.y6().f13385r1 && fVar != null && t0Var.y6().w6()) {
                jv1.s sVar = (jv1.s) t0Var.y6().j6().d();
                if ((sVar != null ? sVar.f101129h : null) == null) {
                    t0Var.y6().B6(fVar, (String) t0Var.f66758e.getValue(), false);
                    t0Var.y6().E7(t0Var.f66757d);
                } else if (!t0Var.y6().f13385r1) {
                    t0Var.y6().D7(null);
                }
            } else if (!t0Var.y6().f13385r1) {
                t0Var.y6().D7(null);
            }
            f(false);
            t0Var.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66763a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66763a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66763a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66765b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66764a = aVar;
            this.f66765b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66764a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66765b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66766a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f66766a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66766a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public t0() {
        super(R.layout.fbt_activity_view);
        this.f66755b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new d(this), new f(this), new e(null, this));
        this.f66758e = o13.m.b(new e40.d(this, 13));
        this.f66759f = new c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(R.string.set_goals_title);
            b.u onBackPressedDispatcher = activity.getOnBackPressedDispatcher();
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.b(this.f66759f, viewLifecycleOwner);
        }
        if (y6().f13385r1) {
            y6().l5();
        }
        String string2 = null;
        if (this.f66756c == null) {
            jv1.s sVar = (jv1.s) y6().j6().d();
            this.f66756c = sVar != null ? sVar.f101128g : null;
        }
        if (this.f66757d == null) {
            jv1.s sVar2 = (jv1.s) y6().j6().d();
            this.f66757d = sVar2 != null ? sVar2.f101129h : null;
        }
        jv1.h hVarE5 = y6().E5();
        if (hVarE5 instanceof jv1.g) {
            jv1.g gVar = (jv1.g) hVarE5;
            vt1.n nVar = gVar.f101054c;
            if (nVar == null || nVar == vt1.n.OTHER) {
                String strI = og0.a.i(og0.a.f131967a, gVar.a());
                bg0.a.f17827a.getClass();
                gg0.i iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                fy1.i.a aVar = fy1.i.f73924a;
                Double dF = d53.s.f(strI);
                double dDoubleValue = dF != null ? dF.doubleValue() : 0.0d;
                aVar.getClass();
                String str = NumberFormat.getNumberInstance(Locale.getDefault()).format(dDoubleValue);
                str.getClass();
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                String strA = iVar.a(contextRequireContext);
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                String strC = iVar.c(contextRequireContext2);
                String strG = e5.g(str, StringUtils.SPACE, strA);
                string = getString(R.string.what_is_goal_for_this_distance, e5.g(str, StringUtils.SPACE, strC));
                string.getClass();
                string2 = getString(R.string.what_is_goal_for_this_distance, strG);
            } else {
                Context contextRequireContext3 = requireContext();
                contextRequireContext3.getClass();
                string = getString(R.string.what_is_goal_for_this_distance, nVar.a(contextRequireContext3));
                string.getClass();
            }
        } else if (hVarE5 instanceof jv1.i) {
            int iB = MathKt.b(((jv1.i) hVarE5).f101059c);
            l3.f23124b.getClass();
            String strN1 = l3.a.n1(iB);
            Context contextRequireContext4 = requireContext();
            contextRequireContext4.getClass();
            String strK1 = l3.a.k1(new l22.a(contextRequireContext4), true, iB);
            String string3 = getString(R.string.what_is_goal_for_this_distance, strN1);
            string3.getClass();
            string2 = getString(R.string.what_is_goal_for_this_distance, strK1);
            string = string3;
        } else {
            string = "";
        }
        o13.p pVar = new o13.p(string, string2);
        tu1.a.p(view2, R.id.composable_container, new z3.e(-1033856421, true, new e11.f0(this, (String) pVar.f128594a, 9, (String) pVar.f128595b)));
    }

    public final void w6(final String str, final String str2, final vt1.f fVar, final List list, final e23.l lVar, final boolean z14, final int i14, final int i15, boolean z15, e23.a aVar, p3.m mVar, int i16) {
        p3.o0 o0VarE = mVar.E(-608370463);
        int i17 = i16 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(fVar) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024) | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.k(i14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.k(i15) ? 8388608 : 4194304) | (o0VarE.h(z15) ? 67108864 : 33554432) | (o0VarE.r(aVar) ? 536870912 : 268435456);
        if (o0VarE.n(i17 & 1, (306783379 & i17) != 306783378)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(c2.x2.d(h4.r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            b82.c.c(z3.f.c(1780807809, new u0(z15, aVar), o0VarE), z3.f.c(-219324293, new e23.q() { // from class: ew1.r0
                /* JADX WARN: Code duplicated, block: B:23:0x00ed  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    b92.a aVarB;
                    String strH;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t0.a aVar3 = t0.f66754g;
                    ((c2.a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        String str3 = str2;
                        if (str3 != null) {
                            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str3);
                            aVarB = c0235a.b();
                        } else {
                            aVarB = null;
                        }
                        h4.r.a aVar4 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC2 = c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7);
                        String strQ = gl1.y.Q(mVar2, R.string.only_visible_to_you);
                        int i18 = b92.a.f16960b;
                        g02.b2.a(rVarC2, z14, i14, i15, str, strQ, null, aVarB, null, mVar2, 0, 320);
                        for (vt1.f fVar2 : list) {
                            String strQ2 = gl1.y.Q(mVar2, fVar2.getF180129a());
                            boolean zEquals = fVar2.equals(fVar);
                            if (zEquals) {
                                strH = sn.a.h(mVar2, -1172451273, R.string.selected, mVar2);
                            } else {
                                mVar2.C(-1986163396);
                                mVar2.f();
                                strH = "";
                            }
                            b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                            c0235a2.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ2, ". ", strH));
                            b92.a aVarB2 = c0235a2.b();
                            h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                            e23.l lVar2 = lVar;
                            boolean zB = mVar2.B(lVar2) | mVar2.r(fVar2);
                            Object objQ = mVar2.q();
                            if (zB) {
                                objQ = new dl0.g(26, lVar2, fVar2);
                                mVar2.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new dl0.g(26, lVar2, fVar2);
                                    mVar2.K(objQ);
                                }
                            }
                            int i19 = b92.a.f16960b;
                            cw1.r.a(rVarF, strQ2, aVarB2, zEquals, false, (e23.a) objQ, mVar2, 6, 16);
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
            p2VarI0.f135219d = new s0(this, str, str2, fVar, list, lVar, z14, i14, i15, z15, aVar, i16);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTGoalTypeSelectionFragment";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66755b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/t0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
