package ew1;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import i3.e5;
import i3.mh;
import kotlin.w3;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/m2;", "Lew1/u;", "<init>", "()V", "a", "Ljv1/s;", "wizardData", "Lvt1/d;", "selectedCyclingSubType", "", "nextButtonEnabled", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m2 extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f66581d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f66583c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66584a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180176g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f66584a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/m2$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = m2.f66581d;
            m2 m2Var = m2.this;
            aw1.h hVarA6 = m2Var.A6();
            vt1.d dVar = hVarA6.S5() == vt1.o.f180176g ? vt1.d.f180090c : null;
            jv1.s sVarI6 = hVarA6.i6();
            hVarA6.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, dVar, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17, 511) : null);
            m2Var.f66583c.f(false);
            m2Var.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66586a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66586a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66586a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66588b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66587a = aVar;
            this.f66588b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66587a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66588b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66589a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f66589a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66589a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public m2() {
        super(R.layout.fbt_activity_view);
        this.f66582b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new d(this), new f(this), new e(null, this));
        this.f66583c = new c();
    }

    public final aw1.h A6() {
        return (aw1.h) this.f66582b.getValue();
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
        onBackPressedDispatcher.b(this.f66583c, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-91044225, true, new l2(this, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01b2  */
    public final void w6(vt1.d dVar, e23.l<? super vt1.d, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        String strJ;
        p3.o0 o0VarE = mVar.E(-1041905653);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.k(dVar == null ? -1 : dVar.ordinal()) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            bVar.getClass();
            h4.r rVarA = c2.l.A(aVar, 0.0f, eVar.f97917b, 1);
            bVar.getClass();
            h4.r rVarA2 = c2.l.A(rVarA, eVar.f97920e, 0.0f, 2);
            String strG = sn.a.g(gl1.y.Q(o0VarE, R.string.cycling_type_title));
            d92.b.f58624b.getClass();
            int i16 = i15;
            mh.c(strG, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.C(1850959599);
            w13.c cVar = vt1.d.f180095h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                vt1.d dVar2 = (vt1.d) bVarN.next();
                boolean z14 = dVar == dVar2;
                String strQ = gl1.y.Q(o0VarE, dVar2.f180096a);
                if (z14) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 532465198, R.string.selected, o0VarE, false);
                } else {
                    o0VarE.C(-673360347);
                    o0VarE.g0(false);
                    strJ = "";
                }
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ, StringUtils.SPACE, strJ));
                b92.a aVarB = c0235a.b();
                boolean zK = ((i16 & 112) == 32) | o0VarE.k(dVar2.ordinal());
                Object objQ = o0VarE.q();
                if (zK) {
                    objQ = new c2(2, lVar, dVar2);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new c2(2, lVar, dVar2);
                        o0VarE.K(objQ);
                    }
                }
                int i17 = b92.a.f16960b;
                cw1.r.a(null, strQ, aVarB, z14, false, (e23.a) objQ, o0VarE, 0, 17);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(this, dVar, lVar, i14, 25);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTSelectSportFragmentCompose";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y6(h4.r rVar, vt1.o oVar, vt1.d dVar, boolean z14, int i14, int i15, e23.p pVar, p3.m mVar, int i16) {
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(64480369);
        int i17 = i16 | 6 | (o0VarE.k(oVar == null ? -1 : oVar.ordinal()) ? 32 : 16) | (o0VarE.k(dVar != null ? dVar.ordinal() : -1) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.k(i14) ? 16384 : 8192) | (o0VarE.k(i15) ? 131072 : 65536) | (o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(this) ? 8388608 : 4194304);
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
            h4.r rVarA = c2.b0.f22601a.a(aVar, 1.0f, true);
            vt1.d dVar2 = (vt1.d) p1Var.getF182175a();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new am.c1(p1Var2, p1Var, 6);
                o0VarE.K(objQ3);
            }
            z6(rVarA, oVar, dVar2, z14, i14, i15, (e23.l) objQ3, o0VarE, (i17 & 112) | 1572864 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 29360128));
            o0VarE = o0VarE;
            b82.c.b(null, null, z3.f.c(1533799932, new d50.i(pVar, oVar, p1Var2, p1Var, 20), o0VarE), null, 0L, o0VarE, 384, 27);
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(this, rVar2, oVar, dVar, z14, i14, i15, pVar, i16, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z6(h4.r rVar, vt1.o oVar, vt1.d dVar, boolean z14, int i14, int i15, e23.l lVar, p3.m mVar, int i16) {
        int i17;
        int i18;
        e23.l lVar2;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-130198552);
        int i19 = (o0VarE.B(rVar) ? 4 : 2) | i16;
        if ((i16 & 48) == 0) {
            i19 |= o0VarE.k(oVar == null ? -1 : oVar.ordinal()) ? 32 : 16;
        }
        int i24 = i19 | (o0VarE.k(dVar != null ? dVar.ordinal() : -1) ? 256 : 128);
        if ((i16 & 3072) == 0) {
            i24 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 = i14;
            i24 |= o0VarE.k(i17) ? 16384 : 8192;
        } else {
            i17 = i14;
        }
        if ((196608 & i16) == 0) {
            i18 = i15;
            i24 |= o0VarE.k(i18) ? 131072 : 65536;
        } else {
            i18 = i15;
        }
        if ((12582912 & i16) == 0) {
            i24 |= o0VarE.r(this) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i24 & 1, (4793491 & i24) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarB = u1.a2.b(c2.x2.f(rVar, 1.0f), u1.a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            int i25 = i24 >> 6;
            g02.b2.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), z14, i17, i18, gl1.y.Q(o0VarE, R.string.which_sport_training_question), null, null, null, null, o0VarE, i25 & 8176, 480);
            o0Var = o0VarE;
            if (oVar == vt1.o.f180176g) {
                o0Var.C(-1766099428);
                int i26 = ((i24 >> 15) & 896) | (i25 & 14) | 48;
                lVar2 = lVar;
                w6(dVar, lVar2, o0Var, i26);
                o0Var.g0(false);
            } else {
                lVar2 = lVar;
                o0Var.C(-1765895696);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            lVar2 = lVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as.j(this, rVar, oVar, dVar, z14, i14, i15, lVar2, i16);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/m2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
