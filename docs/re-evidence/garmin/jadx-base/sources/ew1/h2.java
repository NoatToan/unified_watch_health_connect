package ew1;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0010²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0014\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/h2;", "Lew1/u;", "<init>", "()V", "a", "Ljv1/s;", "wizardData", "Lcom/garmin/android/apps/connectmobile/g3;", "Ljv1/e;", "coachCautionData", "Ljv1/h;", "selectedDuration", "Lbg0/a$b;", "currentCustomUnit", "", "enableNextButton", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h2 extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f66500d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f66502c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f66504b;

        static {
            int[] iArr = new int[gg0.i.values().length];
            try {
                iArr[gg0.i.MILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.i.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66503a = iArr;
            int[] iArr2 = new int[vt1.o.values().length];
            try {
                iArr2[vt1.o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[vt1.o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f66504b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/h2$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = h2.f66500d;
            h2 h2Var = h2.this;
            h2Var.y6().z7(null);
            h2Var.f66502c.f(false);
            h2Var.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66506a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66506a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66506a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66508b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66507a = aVar;
            this.f66508b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66507a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66508b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66509a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f66509a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66509a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public h2() {
        super(R.layout.fbt_activity_view);
        this.f66501b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new d(this), new f(this), new e(null, this));
        this.f66502c = new c();
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
        onBackPressedDispatcher.b(this.f66502c, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-83026489, true, new e2(this, composeView, 0)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x010c, code lost:
    
        r14 = r14;
        r13 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w6(final boolean z14, final boolean z15, final bg0.a.b bVar, final List list, final e23.l lVar, final vt1.o oVar, final jv1.h hVar, final List list2, final double d14, final double d15, final boolean z16, final int i14, final int i15, final e23.l lVar2, e23.a aVar, p3.m mVar, final int i16) {
        e23.a aVar2;
        int i17;
        boolean z17;
        p3.o0 o0VarE = mVar.E(137038573);
        p3.c<?> cVar = o0VarE.f135177b;
        int i18 = i16 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.k(bVar.ordinal()) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024) | (o0VarE.k(oVar == null ? -1 : oVar.ordinal()) ? 131072 : 65536) | (o0VarE.r(hVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(list2) ? 8388608 : 4194304) | (o0VarE.m(d14) ? 67108864 : 33554432) | (o0VarE.m(d15) ? 536870912 : 268435456);
        int i19 = 3072 | (o0VarE.h(z16) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i18 & 1, ((i18 & 306783379) == 306783378 && (i19 & 9363) == 9362) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                if (hVar instanceof jv1.g) {
                    o0VarE = o0VarE;
                    z17 = false;
                } else {
                    o0VarE = o0VarE;
                    z17 = false;
                }
                objQ = hb.a.n(z17, o0VarE);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarE = u1.n.e(c2.x2.d(aVar3, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            h4.r rVarB = u1.a2.b(c2.b0.f22601a.a(c2.x2.f(aVar3, 1.0f), 1.0f, true), u1.a2.a(o0VarE), true);
            c2.z zVarA2 = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            d92.b.f58625c.getClass();
            p3.o0 o0Var = o0VarE;
            g02.b2.a(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z16, i14, i15, gl1.y.Q(o0VarE, R.string.distance_to_train_for), null, null, null, null, o0Var, (i19 << 3) & 8176, 480);
            o0VarE = o0Var;
            int i24 = oVar == null ? -1 : b.f66504b[oVar.ordinal()];
            int i25 = 9;
            boolean z18 = true;
            if (i24 == 1) {
                o0VarE.C(322318463);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new et1.b2(p1Var, i25);
                    o0VarE.K(objQ2);
                }
                int i26 = (i18 & 112) | ((i18 << 6) & 896);
                int i27 = i18 << 3;
                cw1.m1.a(null, z15, z14, bVar, list, lVar, hVar, list2, d14, d15, lVar2, (e23.l) objQ2, o0VarE, i26 | (i27 & 7168) | (i27 & 57344) | 196608 | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), 54);
                i17 = 0;
                o0VarE.g0(false);
                Unit unit = Unit.INSTANCE;
                z18 = true;
            } else if (i24 != 2) {
                o0VarE.C(323780857);
                o0VarE.g0(false);
                Unit unit2 = Unit.INSTANCE;
                i17 = 0;
            } else {
                o0VarE.C(323153014);
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new et1.b2(p1Var, 10);
                    o0VarE.K(objQ3);
                }
                int i28 = i18 >> 3;
                int i29 = i18 >> 9;
                cw1.j1.a(null, bVar, list, lVar, hVar, d14, d15, lVar2, (e23.l) objQ3, o0VarE, (i29 & 3670016) | (i28 & 896) | (i28 & 112) | 100663296 | 3072 | (57344 & (i18 >> 6)) | (458752 & i29) | 12582912);
                o0VarE.g0(false);
                Unit unit3 = Unit.INSTANCE;
                i17 = 0;
            }
            o0VarE.g0(z18);
            aVar2 = aVar;
            b82.c.b(null, null, z3.f.c(-349149758, new f2(aVar2, p1Var, i17), o0VarE), null, 0L, o0VarE, 384, 27);
            o0VarE.g0(z18);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final e23.a aVar6 = aVar2;
            p2VarI0.f135219d = new e23.p(z14, z15, bVar, list, lVar, oVar, hVar, list2, d14, d15, z16, i14, i15, lVar2, aVar6, i16) { // from class: ew1.g2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f66476b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f66477c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ bg0.a.b f66478d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f66479e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.l f66480f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ vt1.o f66481g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ jv1.h f66482h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ List f66483i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ double f66484j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ double f66485k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ boolean f66486l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ int f66487m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ int f66488n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e23.l f66489o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ e23.a f66490p;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h2.a aVar7 = h2.f66500d;
                    int iT = p3.p0.t(24577);
                    this.f66475a.w6(this.f66476b, this.f66477c, this.f66478d, this.f66479e, this.f66480f, this.f66481g, this.f66482h, this.f66483i, this.f66484j, this.f66485k, this.f66486l, this.f66487m, this.f66488n, this.f66489o, this.f66490p, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTSelectDistanceOrTimeFragmentCompose";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66501b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/h2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
