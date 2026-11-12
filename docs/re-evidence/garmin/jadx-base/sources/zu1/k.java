package zu1;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.s;
import b.u;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import fw.p;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.List;
import java.util.Locale;
import kotlin.t1;
import kotlin.w3;
import l72.j0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import vu1.o;
import zo1.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzu1/k;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f207122d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f207123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f207124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f207125c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207126a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f207126a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zu1/k$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            k kVar = k.this;
            kVar.f207125c.f(false);
            kVar.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f207128a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f207128a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f207128a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f207129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f207130b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f207129a = aVar;
            this.f207130b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f207129a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f207130b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f207131a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f207131a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f207131a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public k() {
        super(R.layout.composable_container);
        this.f207123a = new w1(s0.f105811a.b(o.class), new d(this), new f(this), new e(null, this));
        this.f207124b = p0.n(hv1.c.ALL);
        this.f207125c = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(new tu1.c(), getViewLifecycleOwner(), b0.b.RESUMED);
        m mVarRequireActivity2 = requireActivity();
        mVarRequireActivity2.setTitle(R.string.training_guidance);
        u onBackPressedDispatcher = mVarRequireActivity2.getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f207125c, viewLifecycleOwner);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-1526138598, true, new j(this, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x015d  */
    public final void u6(String str, List<av1.g> list, p3.m mVar, int i14) {
        o0 o0Var;
        str.getClass();
        list.getClass();
        o0 o0VarE = mVar.E(1883849163);
        int i15 = 2;
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = n.f135158a;
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            tu1.i.a aVar = tu1.i.f166483a;
            int size = list.size();
            aVar.getClass();
            if (f75992b <= 1.5f) {
                size = (size + 1) / 2;
            }
            r.a aVar2 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar2, o0VarE);
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
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            float f16 = eVar.f97919d;
            bVar2.getClass();
            r rVarB = l.B(aVar2, f14, f16, f15, eVar.f97917b);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            int i17 = size;
            mh.c(upperCase, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            i53.c cVarE = i53.a.e(list);
            boolean zR = o0Var.r(this);
            Object objQ = o0Var.q();
            if (zR) {
                objQ = new j(this, i15);
                o0Var.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j(this, i15);
                    o0Var.K(objQ);
                }
            }
            cv1.h.a(i17, cVarE, (e23.p) objQ, o0Var, 0);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(this, str, list, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01d9  */
    public final void v6(p1<hv1.c> p1Var, p3.m mVar, int i14) {
        p1Var.getClass();
        o0 o0VarE = mVar.E(-1663640358);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = l.A(rVarX, eVar.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            bVar.getClass();
            r rVarC2 = l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
            String upperCase = gl1.y.Q(o0VarE, R.string.content_type).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            mh.c(upperCase, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            bVar.getClass();
            r rVarC3 = l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            bVar.getClass();
            s2 s2VarA = q2.a(c2.j.i(eVar.f97918c), h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC4 = h4.k.c(rVarC3, o0VarE);
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
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC4, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(828911833);
            w13.c cVar2 = hv1.c.f85837f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            while (bVarN.hasNext()) {
                hv1.c cVar3 = (hv1.c) bVarN.next();
                j0 j0Var = new j0(gl1.y.Q(o0VarE, cVar3.f85838a), null, null, false, p1Var.getF182175a() == cVar3, 14, null);
                boolean zK = o0VarE.k(cVar3.ordinal());
                Object objQ = o0VarE.q();
                if (zK) {
                    objQ = new yt.f(22, p1Var, cVar3);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new yt.f(22, p1Var, cVar3);
                        o0VarE.K(objQ);
                    }
                }
                l72.n0.a(null, j0Var, 0L, (e23.l) objQ, o0VarE, 0, 5);
            }
            e5.u(o0VarE, false, true, true);
            p3.x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zi1.a(this, p1Var, i14, 11);
        }
    }

    public final void w6(av1.f fVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1300954907);
        int i15 = (o0VarE.B(fVar) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = this.f207124b;
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r rVarD = x2.d(r.S, 1.0f);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            boolean zR = o0VarE.r(this) | ((i15 & 14) == 4);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new zr.j(fVar, this, p1Var);
                o0VarE.K(objQ2);
            }
            e2.c.b(rVarD, null, null, iVarI, null, null, false, null, (e23.l) objQ2, o0VarE, 6, 494);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zi1.a(this, fVar, i14, 10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzu1/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
