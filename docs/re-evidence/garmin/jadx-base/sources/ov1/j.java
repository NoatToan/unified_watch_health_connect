package ov1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import r1.q2;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0011²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lov1/j;", "Landroidx/fragment/app/Fragment;", "", TtmlNode.TAG_LAYOUT, "<init>", "(Ljava/lang/Integer;)V", "a", "", "uiDateLoadingState", "Lmv1/a;", "uiStatePreferences", "Lmv1/b;", "uiStateTriFBTPreferences", "Lmv1/d;", "uiStateFitnessPreferences", "Lmv1/c;", "uiStateFROGPreferences", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f134173d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f134174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f134175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz1.g f134176c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134177a;

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
            f134177a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ov1/j$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            j jVar = j.this;
            jVar.f134175b.f(false);
            androidx.fragment.app.m activity = jVar.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f134179a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f134179a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f134180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f134181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f134180a = aVar;
            this.f134181b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f134180a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f134181b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134182a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f134182a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f134182a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public j(Integer num) {
        super(num != null ? num.intValue() : R.layout.composable_container);
        this.f134174a = new w1(s0.f105811a.b(pv1.b.class), new d(this), new f(this), new e(null, this));
        this.f134175b = new c();
        this.f134176c = new iz1.g(this, 12);
    }

    public final pv1.b A6() {
        return (pv1.b) this.f134174a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.edit_preferences));
        }
        androidx.fragment.app.m activity2 = getActivity();
        z1 z1Var = activity2 instanceof z1 ? (z1) activity2 : null;
        if (z1Var != null) {
            z1Var.updateActionBarNavigation(3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        k kVar = new k(this);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        mVarRequireActivity.addMenuProvider(kVar, viewLifecycleOwner);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-88221854, true, new i(this, 0)));
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        onBackPressedDispatcher.b(this.f134175b, viewLifecycleOwner2);
        A6().K0.f(getViewLifecycleOwner(), this.f134176c);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0232  */
    /* JADX WARN: Code duplicated, block: B:72:0x024f  */
    /* JADX WARN: Code duplicated, block: B:81:0x028b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(pv1.b bVar, p3.m mVar, int i14) throws Throwable {
        int i15;
        Throwable th3;
        boolean z14;
        boolean z15;
        o0 o0VarE = mVar.E(-1969187542);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(bVar.M0, o0VarE);
            p1 p1VarC2 = s9.c.c(bVar.O0, o0VarE);
            p1 p1VarC3 = s9.c.c(bVar.S0, o0VarE);
            p1 p1VarC4 = s9.c.c(bVar.W0, o0VarE);
            p1 p1VarC5 = s9.c.c(bVar.Z0, o0VarE);
            if (((Boolean) p1VarC.getF182175a()).booleanValue()) {
                g22.e.l(this);
            } else {
                g22.e.f(this);
            }
            mv1.a aVar = (mv1.a) p1VarC2.getF182175a();
            if (aVar == null) {
                o0VarE.C(893013109);
                o0VarE.g0(false);
                z14 = false;
                th3 = null;
                i15 = 3;
            } else {
                th3 = null;
                o0VarE.C(893013110);
                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                i15 = 3;
                h4.r rVarB = a2.b(c2.l.A(rVarD, 0.0f, j92.b.f97899b.f97920e, 1), a2.a(o0VarE), true);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarB, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
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
                b0 b0Var = b0.f22601a;
                v6(aVar, o0VarE, i16 & 112);
                o0VarE.g0(true);
                z14 = false;
                o0VarE.g0(false);
            }
            mv1.b bVar3 = (mv1.b) p1VarC3.getF182175a();
            if (bVar3 == null) {
                o0VarE.C(893450581);
                o0VarE.g0(z14);
                z15 = z14;
            } else {
                List<tw1.h> list = bVar3.f121178g;
                o0VarE.C(893450582);
                h4.r rVarD2 = x2.d(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarB2 = a2.b(c2.l.A(rVarD2, 0.0f, j92.b.f97899b.f97920e, 1), a2.a(o0VarE), true);
                c2.j jVar = c2.j.f22691a;
                g6.f.a aVar3 = g6.f.f75994b;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(20);
                h4.d.f81522a.getClass();
                z zVarA2 = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 6);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarB2, o0VarE);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA2, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar4 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                b0 b0Var2 = b0.f22601a;
                int i17 = i16 & 112;
                z6(bVar3, o0VarE, i17);
                y6(bVar3, o0VarE, i17);
                fy1.i.f73924a.getClass();
                if (fy1.i.a.q() || !(list == null || list.isEmpty())) {
                    z15 = false;
                    o0VarE.C(-1620296807);
                    w6(list, o0VarE, ((i16 << 3) & 896) | 6);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1620204551);
                    z15 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(z15);
            }
            mv1.d dVar = (mv1.d) p1VarC4.getF182175a();
            p3.m.a aVar5 = p3.m.f135153a;
            if (dVar == null) {
                o0VarE.C(894175361);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(894175362);
                boolean zR = o0VarE.r(this);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new g(this, 11);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g(this, 11);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar6 = (e23.a) objQ;
                boolean zR2 = o0VarE.r(this);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new g(this, 12);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new g(this, 12);
                        o0VarE.K(objQ2);
                    }
                }
                z15 = false;
                lv1.b.a(dVar, aVar6, (e23.a) objQ2, o0VarE, 0);
                o0VarE.g0(false);
            }
            mv1.c cVar2 = (mv1.c) p1VarC5.getF182175a();
            if (cVar2 == null) {
                o0VarE.C(894540324);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(894540325);
                boolean zR3 = o0VarE.r(this);
                Object objQ3 = o0VarE.q();
                if (zR3) {
                    objQ3 = new g(this, 13);
                    o0VarE.K(objQ3);
                } else {
                    aVar5.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new g(this, 13);
                        o0VarE.K(objQ3);
                    }
                }
                lv1.a.a(cVar2, (e23.a) objQ3, o0VarE, 0);
                o0VarE.g0(false);
            }
        } else {
            i15 = 3;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oo0.f(this, bVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x018d  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x024f  */
    public final void v6(mv1.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0Var2;
        Context context;
        p3.m.a aVar2;
        boolean z14;
        int i15;
        jv1.o oVar;
        hv1.e eVarA;
        Object obj;
        j61.f courseProfileDTO;
        j61.f courseProfileDTO2;
        j61.f courseProfileDTO3;
        List<tw1.h> list = aVar.f121170h;
        boolean z15 = aVar.f121164b;
        List<String> list2 = aVar.f121167e;
        fg0.k kVar = aVar.f121169g;
        o0 o0VarE = mVar.E(642688347);
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            b0 b0Var = b0.f22601a;
            boolean zE5 = A6().e5();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zE5) {
                o0VarE.C(1543112078);
                tw1.k kVar3 = aVar.f121163a;
                if (kVar3 == null) {
                    o0VarE.C(591834163);
                    o0VarE.g0(false);
                    o0Var2 = o0VarE;
                    context = context2;
                    aVar2 = aVar4;
                    z14 = false;
                } else {
                    o0VarE.C(591834164);
                    l72.p2 p2Var = l72.p2.f111205a;
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_training_level);
                    String strQ2 = gl1.y.Q(o0VarE, kVar3.f166749c);
                    boolean zR = o0VarE.r(this);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new g(this, 4);
                        o0VarE.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g(this, 4);
                            o0VarE.K(objQ);
                        }
                    }
                    aVar2 = aVar4;
                    context = context2;
                    z14 = false;
                    p2Var.h(strQ, strQ2, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 0, 0, 1020);
                    o0Var2 = o0VarE;
                    Unit unit = Unit.INSTANCE;
                    o0Var2.g0(false);
                }
                o0Var2.g0(z14);
            } else {
                o0Var2 = o0VarE;
                context = context2;
                z15 = z15;
                aVar2 = aVar4;
                z14 = false;
                o0Var2.C(592164221);
                o0Var2.g0(false);
            }
            wt1.q.a aVar5 = wt1.q.f187120f;
            List<String> list3 = aVar.f121166d;
            aVar5.getClass();
            String strB = wt1.q.a.b(context, list3);
            l72.p2 p2Var2 = l72.p2.f111205a;
            String strQ3 = gl1.y.Q(o0Var2, R.string.training_days);
            String string = "";
            if (strB == null) {
                strB = "";
            }
            boolean zR2 = o0Var2.r(this);
            Object objQ2 = o0Var2.q();
            if (zR2) {
                objQ2 = new g(this, 5);
                o0Var2.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new g(this, 5);
                    o0Var2.K(objQ2);
                }
            }
            o0 o0Var3 = o0Var2;
            p2Var2.h(strQ3, strB, null, null, null, false, false, null, null, null, (e23.a) objQ2, o0Var3, 0, 0, 1020);
            if (list2 == null || list2.size() != 1) {
                i15 = z15 ? R.string.long_ride_days : R.string.long_run_days;
            } else {
                i15 = z15 ? R.string.itp_setup_option_long_day : R.string.atp_lbl_long_run_day;
            }
            String string2 = context.getString(i15);
            string2.getClass();
            String strB2 = wt1.q.a.b(context, list2);
            if (strB2 == null) {
                strB2 = "";
            }
            boolean zR3 = o0Var3.r(this);
            Object objQ3 = o0Var3.q();
            int i17 = 6;
            if (zR3) {
                objQ3 = new g(this, i17);
                o0Var3.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new g(this, i17);
                    o0Var3.K(objQ3);
                }
            }
            p2Var2.h(string2, strB2, null, null, null, false, false, null, null, null, (e23.a) objQ3, o0Var3, 0, 0, 1020);
            jv1.c cVar = aVar.f121168f;
            if (cVar != null) {
                string = context.getString(cVar.f101019a);
                string.getClass();
            }
            String str = string;
            String strQ4 = gl1.y.Q(o0Var3, R.string.workout_intensity_target_type);
            boolean zR4 = o0Var3.r(this);
            Object objQ4 = o0Var3.q();
            if (zR4) {
                objQ4 = new g(this, 7);
                o0Var3.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new g(this, 7);
                    o0Var3.K(objQ4);
                }
            }
            p2Var2.h(strQ4, str, null, null, null, false, false, null, null, null, (e23.a) objQ4, o0Var3, 0, 0, 1020);
            o0Var = o0Var3;
            if (z15) {
                o0Var.C(593269216);
                String elevationProfileType = (kVar == null || (courseProfileDTO3 = kVar.getCourseProfileDTO()) == null) ? null : courseProfileDTO3.getElevationProfileType();
                Double elevationGainMeter = (kVar == null || (courseProfileDTO2 = kVar.getCourseProfileDTO()) == null) ? null : courseProfileDTO2.getElevationGainMeter();
                String hillType = (kVar == null || (courseProfileDTO = kVar.getCourseProfileDTO()) == null) ? null : courseProfileDTO.getHillType();
                if (elevationProfileType == null && elevationGainMeter == null && hillType == null) {
                    o0Var.C(594820797);
                    o0Var.g0(z14);
                } else {
                    o0Var.C(593640689);
                    List<jv1.o> list4 = aVar.f121171i;
                    if (list4 != null) {
                        Iterator<T> it = list4.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            Object next = it.next();
                            if (p005kotlin.jvm.internal.s.g(((jv1.o) next).f101105a, elevationProfileType)) {
                                obj = next;
                                break;
                            }
                        }
                        oVar = (jv1.o) obj;
                    } else {
                        oVar = null;
                    }
                    if (hillType != null) {
                        hv1.e.f85844c.getClass();
                        eVarA = hv1.e.a.a(hillType);
                    } else {
                        eVarA = null;
                    }
                    l22.a aVar6 = new l22.a(context);
                    String strA = new zv1.a(aVar6).a(oVar, elevationGainMeter, eVarA);
                    if (strA != null) {
                        Object objH = q2.h(o0Var, 594154266, aVar2);
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objH == c2565a) {
                            objH = new ot1.t(11);
                            o0Var.K(objH);
                        }
                        String strC = oi0.c.C(strA, aVar6, (e23.l) objH);
                        l72.p2 p2Var3 = l72.p2.f111205a;
                        String strQ5 = gl1.y.Q(o0Var, R.string.lbl_course_profile);
                        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                        c0235a.f16962a.put("label_secondary", strC);
                        b92.a aVarB = c0235a.b();
                        boolean zR5 = o0Var.r(this);
                        Object objQ5 = o0Var.q();
                        if (zR5 || objQ5 == c2565a) {
                            objQ5 = new g(this, 8);
                            o0Var.K(objQ5);
                        }
                        int i18 = b92.a.f16960b;
                        p2Var3.h(strQ5, strA, null, null, aVarB, false, false, null, null, null, (e23.a) objQ5, o0Var, 0, 0, 1004);
                        o0Var = o0Var;
                        o0Var.g0(z14);
                    } else {
                        o0Var.C(594802941);
                        o0Var.g0(z14);
                    }
                    o0Var.g0(z14);
                }
                o0Var.g0(z14);
            } else {
                o0Var.C(594834685);
                o0Var.g0(z14);
            }
            fy1.i.f73924a.getClass();
            if (fy1.i.a.q() || !(list == null || list.isEmpty())) {
                o0Var.C(594992072);
                h4.r.a aVar7 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar7, j92.b.f97899b.f97919d), o0Var);
                w6(list, o0Var, 6 | ((i16 << 3) & 896));
                o0Var.g0(z14);
            } else {
                o0Var.C(595135261);
                o0Var.g0(z14);
            }
            o0Var.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oo0.f(this, aVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0183  */
    public final void w6(List list, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        tw1.h hVar;
        o0 o0VarE = mVar.E(-1755277394);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(true) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            String str = null;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            b0 b0Var = b0.f22601a;
            o0VarE.C(-4701265);
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarF2, f14, 0.0f, 0.0f, eVar.f97917b, 6);
            String upperCase = gl1.y.Q(o0VarE, R.string.lbl_strength).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            mh.c(upperCase, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE.g0(false);
            vt1.h.a aVar3 = vt1.h.f180113e;
            if (list != null && (hVar = (tw1.h) h0.d0(list)) != null) {
                str = hVar.f166715a;
            }
            aVar3.getClass();
            vt1.h hVarA = vt1.h.a.a(str);
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.strength_workouts);
            String strQ2 = gl1.y.Q(o0VarE, hVarA.f180121b);
            boolean zR = o0VarE.r(this);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new g(this, 14);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g(this, 14);
                    o0VarE.K(objQ);
                }
            }
            p2Var.h(strQ, strQ2, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 0, 0, 1020);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(this, list, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0162  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ab  */
    public final void y6(mv1.b bVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        List<String> list = bVar.f121174c;
        o0 o0VarE = mVar.E(-503947229);
        int i16 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            b0 b0Var = b0.f22601a;
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar3.getClass();
            h4.r rVarC2 = c2.l.C(rVarF2, f14, 0.0f, 0.0f, eVar.f97917b, 6);
            String upperCase = gl1.y.Q(o0VarE, R.string.lbl_swimming).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            i15 = 1;
            mh.c(upperCase, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            int i17 = (list != null ? list.size() : 0) > 1 ? R.string.swim_days : R.string.swim_day;
            wt1.q.f187120f.getClass();
            String strB = wt1.q.a.b(context, list);
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, i17);
            String strB2 = "";
            if (strB == null) {
                strB = "";
            }
            boolean zR = o0VarE.r(this);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new g(this, 9);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g(this, 9);
                    o0VarE.K(objQ);
                }
            }
            p2Var.h(strQ, strB, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 0, 0, 1020);
            hv1.i iVar = bVar.f121177f;
            String strQ2 = gl1.y.Q(o0VarE, R.string.swim_distance);
            if (iVar != null) {
                hv1.i.a aVar4 = hv1.i.f85867c;
                strB2 = iVar.b(context, false);
            }
            boolean zR2 = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new g(this, 10);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new g(this, 10);
                    o0VarE.K(objQ2);
                }
            }
            p2Var.h(strQ2, strB2, null, null, null, false, false, null, null, null, (e23.a) objQ2, o0VarE, 0, 0, 1020);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(this, bVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0155  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x023f  */
    public final void z6(mv1.b bVar, p3.m mVar, int i14) {
        o0 o0Var;
        String str;
        List<String> list = bVar.f121173b;
        o0 o0VarE = mVar.E(-1519006371);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            b0 b0Var = b0.f22601a;
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar3.getClass();
            h4.r rVarC2 = c2.l.C(rVarF2, f14, 0.0f, 0.0f, eVar.f97917b, 6);
            String upperCase = gl1.y.Q(o0VarE, R.string.lbl_running_cycling).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            mh.c(upperCase, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            wt1.q.a aVar3 = wt1.q.f187120f;
            List<String> list2 = bVar.f121172a;
            aVar3.getClass();
            String strB = wt1.q.a.b(context, list2);
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.training_days);
            String string = "";
            if (strB == null) {
                strB = "";
            }
            boolean zR = o0VarE.r(this);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                objQ = new g(this, 0);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g(this, 0);
                    o0VarE.K(objQ);
                }
            }
            p2Var.h(strQ, strB, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 0, 0, 1020);
            int i17 = (list != null ? list.size() : 0) > 1 ? R.string.long_workout_days : R.string.long_workout_day;
            String strB2 = wt1.q.a.b(context, list);
            String strQ2 = gl1.y.Q(o0VarE, i17);
            if (strB2 == null) {
                strB2 = "";
            }
            boolean zR2 = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new g(this, i16);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new g(this, i16);
                    o0VarE.K(objQ2);
                }
            }
            p2Var.h(strQ2, strB2, null, null, null, false, false, null, null, null, (e23.a) objQ2, o0VarE, 0, 0, 1020);
            jv1.c cVar = bVar.f121175d;
            if (cVar != null) {
                String string2 = context.getString(cVar.f101019a);
                string2.getClass();
                str = string2;
            } else {
                str = "";
            }
            String strQ3 = gl1.y.Q(o0VarE, R.string.running_workout_target);
            boolean zR3 = o0VarE.r(this);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new g(this, 2);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new g(this, 2);
                    o0VarE.K(objQ3);
                }
            }
            p2Var.h(strQ3, str, null, null, null, false, false, null, null, null, (e23.a) objQ3, o0VarE, 0, 0, 1020);
            jv1.c cVar2 = bVar.f121176e;
            if (cVar2 != null) {
                string = context.getString(cVar2.f101019a);
                string.getClass();
            }
            String str2 = string;
            String strQ4 = gl1.y.Q(o0VarE, R.string.cycling_workout_target);
            boolean zR4 = o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR4) {
                objQ4 = new g(this, 3);
                o0VarE.K(objQ4);
            } else {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new g(this, 3);
                    o0VarE.K(objQ4);
                }
            }
            p2Var.h(strQ4, str2, null, null, null, false, false, null, null, null, (e23.a) objQ4, o0VarE, 0, 0, 1020);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(this, bVar, i14, 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lov1/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ j(Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
