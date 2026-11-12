package com.garmin.android.apps.connectmobile.traininginitiative.ui.goal;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.s;
import b.u;
import c2.l2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.f1;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.k;
import e11.c0;
import ew1.c2;
import f12.l;
import fz1.o;
import g02.b2;
import gg0.i;
import h5.e0;
import i3.e5;
import i3.mh;
import k52.g;
import l72.f0;
import o13.p;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p92.y;
import r53.p2;
import r53.q2;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f46024o = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f46026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f46027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f46029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.workouts.data.model.c f46030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46031g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f46033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f46034j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46025a = new w1(s0.f105811a.b(fz1.k.class), new d(this), new f(this), new C0893e(null, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ng0.a f46032h = ng0.a.LEG_SCREEN_VIEW;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f46035k = q2.a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f46036l = q2.a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f46037m = q2.a(new p("", ""));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f46038n = new c();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46039a;

        static {
            int[] iArr = new int[m52.c.values().length];
            try {
                iArr[m52.c.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.c.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m52.c.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m52.c.LAP_SWIMMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m52.c.OPEN_WATER_SWIMMING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f46039a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/goal/e$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            e eVar = e.this;
            if (eVar.f46032h == ng0.a.DETAILS_SCREEN_VIEW) {
                eVar.requireActivity().finish();
            } else {
                e.w6(eVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46041a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f46041a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46041a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0893e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0893e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46042a = aVar;
            this.f46043b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46042a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46043b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46044a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f46044a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46044a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final void w6(e eVar) {
        eVar.f46038n.f(false);
        if (eVar.y6().f74013l) {
            ng0.a aVar = eVar.f46032h;
            ng0.a aVar2 = ng0.a.LEG_SCREEN_VIEW;
            if (aVar == aVar2) {
                k kVar = eVar.f46029e;
                m52.c eventLegActivityType = kVar != null ? kVar.getEventLegActivityType() : null;
                int i14 = eventLegActivityType == null ? -1 : b.f46039a[eventLegActivityType.ordinal()];
                if (i14 == 1) {
                    eVar.getParentFragmentManager().Z();
                    eVar.y6().F4(m52.c.CYCLING, aVar2);
                    return;
                }
                if (i14 == 2) {
                    eVar.getParentFragmentManager().Z();
                    eVar.y6().F4(m52.c.SWIMMING, aVar2);
                    return;
                } else if (i14 == 3 || i14 == 4 || i14 == 5) {
                    eVar.getParentFragmentManager().Z();
                    eVar.y6().z4().m("EventGoalTypeFragment");
                    return;
                } else {
                    y.f136664a.getClass();
                    y.a.c("EventLegGoalFragment", "Invalid leg type.");
                    return;
                }
            }
        }
        eVar.requireActivity().onBackPressed();
    }

    public final boolean A6() {
        return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k kVar;
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar;
        ng0.a aVar;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        long j8;
        Object value5;
        l22.a aVar2;
        int i14;
        Object value6;
        k kVar2;
        i unit;
        Double value7;
        fy1.d dVar;
        Object serializable;
        Parcelable parcelable;
        Parcelable parcelable2;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) arguments.getParcelable("LEG_TARGET_DTO", k.class);
            } else {
                Parcelable parcelable3 = arguments.getParcelable("LEG_TARGET_DTO");
                if (!(parcelable3 instanceof k)) {
                    parcelable3 = null;
                }
                parcelable2 = (k) parcelable3;
            }
            kVar = (k) parcelable2;
        } else {
            kVar = null;
        }
        this.f46029e = kVar;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments2.getParcelable("CUSTOM_LEG_GOAL", com.garmin.android.apps.connectmobile.workouts.data.model.c.class);
            } else {
                Parcelable parcelable4 = arguments2.getParcelable("CUSTOM_LEG_GOAL");
                if (!(parcelable4 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.c)) {
                    parcelable4 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.workouts.data.model.c) parcelable4;
            }
            cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) parcelable;
        } else {
            cVar = null;
        }
        this.f46030f = cVar;
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            aVar = ng0.a.LEG_SCREEN_VIEW;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments3.getSerializable("LEG_GOAL_SCREEN_VIEW", ng0.a.class);
            } else {
                Object serializable2 = arguments3.getSerializable("LEG_GOAL_SCREEN_VIEW");
                if (!(serializable2 instanceof ng0.a)) {
                    serializable2 = null;
                }
                serializable = (ng0.a) serializable2;
            }
            aVar = (ng0.a) serializable;
            if (aVar == null) {
                aVar = ng0.a.LEG_SCREEN_VIEW;
            }
        }
        this.f46032h = aVar;
        Bundle arguments4 = getArguments();
        int i15 = 0;
        this.f46033i = arguments4 != null && arguments4.getBoolean("IS_ORGANIZER_EVENT");
        k kVar3 = this.f46029e;
        this.f46031g = (kVar3 != null ? kVar3.getEventLegActivityType() : null) == m52.c.CYCLING;
        k kVar4 = this.f46029e;
        m52.c eventLegActivityType = kVar4 != null ? kVar4.getEventLegActivityType() : null;
        int i16 = eventLegActivityType == null ? -1 : b.f46039a[eventLegActivityType.ordinal()];
        if (i16 == 1) {
            fy1.d dVar2 = y6().f74018q;
            if (dVar2 != null) {
                i15 = dVar2.f73894e;
            }
        } else if (i16 == 2) {
            fy1.d dVar3 = y6().f74018q;
            if (dVar3 != null) {
                i15 = dVar3.f73893d;
            }
        } else if ((i16 == 3 || i16 == 4 || i16 == 5) && (dVar = y6().f74018q) != null) {
            i15 = dVar.f73892c;
        }
        k kVar5 = this.f46029e;
        double dDoubleValue = (kVar5 == null || (value7 = kVar5.getValue()) == null) ? 0.0d : value7.doubleValue();
        k kVar6 = this.f46029e;
        this.f46027c = g.a(dDoubleValue, (kVar6 == null || (unit = kVar6.getUnit()) == null) ? null : unit.d());
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar2 = this.f46030f;
        p2 p2Var = this.f46037m;
        p2 p2Var2 = this.f46036l;
        p2 p2Var3 = this.f46035k;
        if (cVar2 != null) {
            og0.a aVar3 = og0.a.f131967a;
            Double value8 = cVar2.getValue();
            double dDoubleValue2 = value8 != null ? value8.doubleValue() : 0.0d;
            i unit2 = cVar2.getUnit();
            if (unit2 == null) {
                unit2 = i.SECOND;
            }
            aVar3.getClass();
            this.f46028d = (long) og0.a.j(dDoubleValue2, unit2);
            do {
                value4 = p2Var3.getValue();
                l3.a aVar4 = l3.f23124b;
                j8 = this.f46028d;
                aVar4.getClass();
            } while (!p2Var3.b(value4, l3.a.e1(j8)));
            do {
                value5 = p2Var2.getValue();
                l3.a aVar5 = l3.f23124b;
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                aVar2 = new l22.a(contextRequireContext);
                i14 = (int) this.f46028d;
                aVar5.getClass();
            } while (!p2Var2.b(value5, l3.a.k1(aVar2, true, i14)));
            do {
                value6 = p2Var.getValue();
                kVar2 = this.f46029e;
            } while (!p2Var.b(value6, z6(kVar2 != null ? kVar2.getEventLegActivityType() : null)));
        } else {
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, getString(R.string.enter_goal_time)));
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, new p(getString(R.string.enter_goal_pace), getString(R.string.enter_goal_pace))));
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, getString(R.string.enter_goal_pace)));
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext2, null, 0, 6, null);
        composeView.setContent(new z3.e(1838033913, true, new a03.k(this, i15, 25)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46038n, viewLifecycleOwner);
        if (this.f46032h != ng0.a.LEG_SCREEN_VIEW) {
            m activity = getActivity();
            activity.getClass();
            activity.addMenuProvider(new o(this), getViewLifecycleOwner(), b0.b.RESUMED);
        }
    }

    public final void u6(int i14, int i15, b92.a aVar, e23.a aVar2, String str, String str2, p3.m mVar, boolean z14) {
        boolean z15;
        int i16;
        boolean z16;
        o0 o0VarE = mVar.E(-2121834620);
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
            z15 = z14;
        } else {
            z15 = z14;
            i16 = i17 | (o0VarE.h(z15) ? 256 : 128);
        }
        int i19 = i16 | (o0VarE.B(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i19 & 1, (i19 & 9363) != 9362)) {
            boolean z17 = i18 == 0 ? z15 : false;
            p3.x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(895633466, new bt1.m(str, str2, aVar, aVar2, z17), o0VarE), o0VarE, 196608, 31);
            z16 = z17;
        } else {
            o0VarE.e();
            z16 = z15;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(this, str, str2, z16, aVar, aVar2, i14, i15);
        }
    }

    public final void v6(final boolean z14, final boolean z15, final int i14, final int i15, p3.m mVar, int i16) {
        o0 o0Var;
        o0 o0VarE = mVar.E(601829465);
        int i17 = i16 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.k(i15) ? 2048 : 1024) | (o0VarE.r(this) ? 16384 : 8192);
        boolean zG = true;
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            p3.x1 x1Var = n.f135158a;
            p2 p2Var = this.f46035k;
            final boolean z16 = p0.c(p2Var, o0VarE, 0).getF182175a() == 0;
            if (p0.c(p2Var, o0VarE, 0).getF182175a() == 0) {
                o0VarE.C(1908364902);
            } else {
                o0VarE.C(-1462458840);
                zG = p005kotlin.jvm.internal.s.g(p0.c(p2Var, o0VarE, 0).getF182175a(), getString(R.string.enter_goal_time));
            }
            o0VarE.g0(false);
            final boolean z17 = zG;
            z3.e eVarC = z3.f.c(-1085155613, new e23.p() { // from class: fz1.l
                /* JADX WARN: Code duplicated, block: B:102:0x03c2  */
                /* JADX WARN: Code duplicated, block: B:111:0x042e  */
                /* JADX WARN: Code duplicated, block: B:148:0x05a9  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v7 */
                /* JADX WARN: Type inference failed for: r13v4 */
                /* JADX WARN: Type inference failed for: r13v5, types: [b92.a, kotlin.jvm.internal.j] */
                /* JADX WARN: Type inference failed for: r13v6 */
                /* JADX WARN: Type inference failed for: r17v2 */
                /* JADX WARN: Type inference failed for: r20v1, types: [p3.m] */
                /* JADX WARN: Type inference failed for: r20v2, types: [p3.m] */
                /* JADX WARN: Type inference failed for: r28v2 */
                /* JADX WARN: Type inference failed for: r28v3, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r28v4 */
                /* JADX WARN: Type inference failed for: r3v16, types: [l72.x0] */
                /* JADX WARN: Type inference failed for: r3v40, types: [l72.f0] */
                /* JADX WARN: Type inference failed for: r4v12, types: [p3.m] */
                /* JADX WARN: Type inference failed for: r7v5, types: [androidx.fragment.app.Fragment, com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v10, types: [p3.m] */
                /* JADX WARN: Type inference failed for: r8v12, types: [p3.m] */
                /* JADX WARN: Type inference failed for: r8v15 */
                /* JADX WARN: Type inference failed for: r8v16 */
                /* JADX WARN: Type inference failed for: r8v17 */
                /* JADX WARN: Type inference failed for: r8v18 */
                /* JADX WARN: Type inference failed for: r8v19 */
                /* JADX WARN: Type inference failed for: r8v20 */
                /* JADX WARN: Type inference failed for: r8v6, types: [p3.m] */
                /* JADX WARN: Type inference failed for: r8v7, types: [p3.m] */
                /* JADX WARN: Type inference failed for: r8v9, types: [p3.m] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    h5.g.a.f fVar;
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar;
                    h5.g.a.C1623g c1623g;
                    h5.g.a.b bVar;
                    e0.a aVar;
                    h5.g.a.e eVar2;
                    boolean z18;
                    boolean z19;
                    h4.r.a aVar2;
                    p2 p2Var2;
                    c2.b0 b0Var;
                    ?? r14;
                    o13.p pVar;
                    Double value;
                    m52.c eventLegActivityType;
                    Double value2;
                    l2 l2VarA;
                    final int i18;
                    ?? r15;
                    b92.a aVarB;
                    ?? r16;
                    ?? r28;
                    ?? r17;
                    ?? r18;
                    String strC;
                    gg0.i unit;
                    m52.c eventLegActivityType2;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.f46024o;
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar4 = h4.r.S;
                        h4.r rVarD = x2.d(aVar4, 1.0f);
                        c2.j.f22691a.getClass();
                        c2.j.g gVar = c2.j.f22698h;
                        h4.d.f81522a.getClass();
                        h4.g.a aVar5 = h4.d.a.f81536n;
                        z zVarA = c2.y.a(gVar, aVar5, mVar2, 6);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar6 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar3 = h5.g.a.f81810g;
                        b4.c(eVar3, zVarA, mVar2);
                        h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                        b4.c(c1623g2, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        h5.g.a.f fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC, mVar2);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar4 = this.f74038a;
                        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar = eVar4.f46029e;
                        p2 p2Var3 = eVar4.f46037m;
                        String string = eVar4.getString(R.string.string_space_string_pattern, (kVar == null || (eventLegActivityType2 = kVar.getEventLegActivityType()) == null) ? null : eVar4.getString(eventLegActivityType2.f116677c), eVar4.getString(R.string.lbl_time_goal));
                        string.getClass();
                        String string2 = eVar4.getString(eVar4.f46031g ? R.string.enter_either_goal_time_or_speed : R.string.enter_either_goal_time_or_pace);
                        string2.getClass();
                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar5, mVar2, 0);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC2 = h4.k.c(aVar4, mVar2);
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar3, zVarA2, mVar2);
                        b4.c(c1623g2, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        }
                        b4.c(fVar2, rVarC2, mVar2);
                        boolean z24 = z14;
                        boolean z25 = z15;
                        if (z24) {
                            mVar2.C(234306527);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            eVar = eVar4;
                            c1623g = c1623g2;
                            bVar = bVar2;
                            eVar2 = eVar3;
                            fVar = fVar2;
                            aVar = aVar6;
                            b2.a(c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), !z25, i14, i15, string, string2, null, null, null, mVar2, 0, 448);
                            p3.m mVar3 = mVar2;
                            mVar3.f();
                            aVar2 = aVar4;
                            b0Var = b0Var2;
                            z18 = z24;
                            p2Var2 = p2Var3;
                            z19 = z25;
                            r14 = mVar3;
                        } else {
                            fVar = fVar2;
                            eVar = eVar4;
                            c1623g = c1623g2;
                            bVar = bVar2;
                            aVar = aVar6;
                            eVar2 = eVar3;
                            mVar2.C(234798187);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            d92.b.f58625c.getClass();
                            j92.e eVar5 = j92.b.f97899b;
                            float f14 = eVar5.f97921f;
                            float f15 = eVar5.f97918c;
                            float f16 = eVar5.f97920e;
                            h4.r rVarF = x2.f(c2.l.B(aVar4, f16, f14, f16, f15), 1.0f);
                            h4.g.a aVar7 = h4.d.a.f81537o;
                            h4.r rVarB = b0Var2.b(rVarF, aVar7);
                            d6.h.f57752b.getClass();
                            int i19 = d6.h.f57755e;
                            z18 = z24;
                            z19 = z25;
                            aVar2 = aVar4;
                            p2Var2 = p2Var3;
                            mh.c(string, rVarB, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                            b0Var = b0Var2;
                            mh.c(string2, b0Var2.b(x2.f(c2.l.B(aVar2, f16, f15, f16, f16), 1.0f), aVar7), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar2), mVar2, 0, 0, 130044);
                            p3.m mVar4 = mVar2;
                            mVar4.f();
                            r14 = mVar4;
                        }
                        final ?? r19 = eVar;
                        boolean z26 = r19.f46033i;
                        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = r19.f46029e;
                        if (z26) {
                            String strValueOf = String.valueOf(kVar2 != null ? kVar2.getValue() : null);
                            com.garmin.android.apps.connectmobile.workouts.data.model.k kVar3 = r19.f46029e;
                            if (kVar3 == null || (unit = kVar3.getUnit()) == null) {
                                strC = null;
                            } else {
                                Context contextRequireContext = r19.requireContext();
                                contextRequireContext.getClass();
                                strC = unit.c(contextRequireContext);
                            }
                            pVar = new o13.p(strValueOf, strC);
                        } else {
                            double dDoubleValue = 0.0d;
                            if (kVar2 == null || (eventLegActivityType = kVar2.getEventLegActivityType()) == null || !(eventLegActivityType == m52.c.OPEN_WATER_SWIMMING || eventLegActivityType == m52.c.LAP_SWIMMING || eventLegActivityType == m52.c.SWIMMING)) {
                                og0.a aVar8 = og0.a.f131967a;
                                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar4 = r19.f46029e;
                                if (kVar4 != null && (value = kVar4.getValue()) != null) {
                                    dDoubleValue = value.doubleValue();
                                }
                                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar5 = r19.f46029e;
                                gg0.i unit2 = kVar5 != null ? kVar5.getUnit() : null;
                                aVar8.getClass();
                                String strI = og0.a.i(aVar8, og0.a.g(dDoubleValue, unit2));
                                Context contextRequireContext2 = r19.requireContext();
                                contextRequireContext2.getClass();
                                pVar = new o13.p(strI, og0.a.q(contextRequireContext2));
                            } else {
                                og0.a aVar9 = og0.a.f131967a;
                                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar6 = r19.f46029e;
                                if (kVar6 != null && (value2 = kVar6.getValue()) != null) {
                                    dDoubleValue = value2.doubleValue();
                                }
                                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar7 = r19.f46029e;
                                gg0.i unit3 = kVar7 != null ? kVar7.getUnit() : null;
                                aVar9.getClass();
                                String strValueOf2 = String.valueOf(og0.a.g(dDoubleValue, unit3));
                                gg0.i iVar = gg0.i.METER;
                                Context contextRequireContext3 = r19.requireContext();
                                contextRequireContext3.getClass();
                                pVar = new o13.p(strValueOf2, iVar.c(contextRequireContext3));
                            }
                        }
                        if (z18) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            float f17 = j92.b.f97899b.f97920e;
                            l2VarA = c2.l.e(f17, 0.0f, f17, f17, 2);
                        } else {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            l2VarA = c2.l.a(j92.b.f97899b.f97920e);
                        }
                        l72.x0.f111346a.e(c2.l.x(aVar2, l2VarA), z3.f.c(-241017240, new c0(16, pVar, r19), r14), r14, (l72.x0.f111348c << 6) | 48, 0);
                        String string3 = r19.getString(R.string.lbl_goal_time);
                        string3.getClass();
                        final int i24 = 0;
                        String str = (String) p0.c(r19.f46035k, r14, 0).getF182175a();
                        if (str == null) {
                            str = "0";
                        }
                        String str2 = (String) p0.c(r19.f46036l, r14, 0).getF182175a();
                        if (str2 != null) {
                            i18 = 1;
                            r15 = 0;
                            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                            c0235a.f16962a.put("label_secondary", str2);
                            aVarB = c0235a.b();
                        } else {
                            i18 = 1;
                            r15 = 0;
                            aVarB = null;
                        }
                        boolean zR = r14.r(r19);
                        Object objQ = r14.q();
                        p3.m.a aVar10 = p3.m.f135153a;
                        if (zR) {
                            objQ = new e23.a() { // from class: fz1.n
                                @Override // e23.a
                                public final Object invoke() {
                                    Number numberValueOf;
                                    double dN;
                                    Number numberValueOf2;
                                    ag0.b bVarA;
                                    switch (i24) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar6 = r19;
                                            com.garmin.android.apps.connectmobile.workouts.data.model.k kVar8 = eVar6.f46029e;
                                            m52.c eventLegActivityType3 = kVar8 != null ? kVar8.getEventLegActivityType() : null;
                                            long j8 = eVar6.f46028d;
                                            if (j8 == 0) {
                                                double d14 = eVar6.f46027c;
                                                int i25 = eventLegActivityType3 == null ? -1 : mg0.b.a.f118370a[eventLegActivityType3.ordinal()];
                                                if (i25 == 1 || i25 == 2 || i25 == 3) {
                                                    l3.a aVar11 = l3.f23124b;
                                                    int i26 = (int) eventLegActivityType3.f116680f;
                                                    aVar11.getClass();
                                                    dN = l3.a.n(i26, true);
                                                } else if (i25 != 4) {
                                                    l3.a aVar12 = l3.f23124b;
                                                    double d15 = eventLegActivityType3 != null ? eventLegActivityType3.f116680f : 0.0d;
                                                    aVar12.getClass();
                                                    dN = l3.a.m(d15, false);
                                                } else {
                                                    l3.a aVar13 = l3.f23124b;
                                                    double d16 = eventLegActivityType3.f116680f;
                                                    q3 q3Var = q3.MILE_PER_HOUR;
                                                    q3 q3Var2 = q3.METERS_PER_SECOND;
                                                    aVar13.getClass();
                                                    dN = l3.a.w(d16, q3Var, q3Var2);
                                                }
                                                numberValueOf = Integer.valueOf((int) (d14 / dN));
                                            } else {
                                                numberValueOf = Long.valueOf(j8);
                                            }
                                            f1 f1VarA = f1.a.a(f1.Y0, numberValueOf.intValue(), 48, 252);
                                            f1VarA.T = new com.google.android.exoplayer2.analytics.q(19, eVar6, eventLegActivityType3);
                                            String str3 = f1.Z0;
                                            v childFragmentManager = eVar6.getChildFragmentManager();
                                            childFragmentManager.getClass();
                                            if (childFragmentManager.G(str3) == null) {
                                                f1VarA.show(childFragmentManager, str3);
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar7 = r19;
                                            com.garmin.android.apps.connectmobile.workouts.data.model.k kVar9 = eVar7.f46029e;
                                            m52.c eventLegActivityType4 = kVar9 != null ? kVar9.getEventLegActivityType() : null;
                                            boolean z27 = eVar7.f46031g;
                                            double dW = eVar7.f46026b;
                                            if (z27) {
                                                if (dW == 0.0d) {
                                                    l3.a aVar14 = l3.f23124b;
                                                    double d17 = eventLegActivityType4 != null ? eventLegActivityType4.f116680f : 0.0d;
                                                    q3 q3Var3 = q3.MILE_PER_HOUR;
                                                    q3 q3Var4 = q3.METERS_PER_SECOND;
                                                    aVar14.getClass();
                                                    dW = l3.a.w(d17, q3Var3, q3Var4);
                                                }
                                                Context contextRequireContext4 = eVar7.requireContext();
                                                contextRequireContext4.getClass();
                                                new ag0.f(contextRequireContext4, dW, eVar7.A6(), new f2.o0(eVar7, 26)).show();
                                            } else {
                                                if (dW == 0.0d) {
                                                    numberValueOf2 = eventLegActivityType4 != null ? Long.valueOf(eventLegActivityType4.f116680f) : Double.valueOf(0.0d);
                                                } else if (eventLegActivityType4 == m52.c.RUNNING) {
                                                    l3.a aVar15 = l3.f23124b;
                                                    boolean zA6 = eVar7.A6();
                                                    aVar15.getClass();
                                                    numberValueOf2 = Integer.valueOf(l3.a.p(dW, zA6));
                                                } else {
                                                    l3.f23124b.getClass();
                                                    numberValueOf2 = Integer.valueOf(l3.a.r(dW, true));
                                                }
                                                long j14 = eventLegActivityType4 != null ? eventLegActivityType4.f116678d : 0L;
                                                Number numberValueOf3 = eventLegActivityType4 != null ? Double.valueOf(eventLegActivityType4.f116679e) : Integer.valueOf(DateTimeConstants.SECONDS_PER_HOUR);
                                                if (eventLegActivityType4 == m52.c.RUNNING) {
                                                    bVarA = ag0.b.a.b(ag0.b.Z0, numberValueOf2.longValue(), j14, numberValueOf3.longValue(), eVar7.A6());
                                                } else {
                                                    ag0.b.a aVar16 = ag0.b.Z0;
                                                    long jLongValue = numberValueOf2.longValue();
                                                    long jLongValue2 = numberValueOf3.longValue();
                                                    aVar16.getClass();
                                                    bVarA = ag0.b.a.a(jLongValue, j14, jLongValue2, null, R.string.lbl_per_100_meters);
                                                }
                                                String string4 = eVar7.getString(R.string.lbl_ok);
                                                string4.getClass();
                                                bVarA.U6(string4, new p(eventLegActivityType4, eVar7));
                                                bVarA.show(eVar7.getParentFragmentManager(), "GoalPacePicker");
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r14.K(objQ);
                        } else {
                            aVar10.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e23.a() { // from class: fz1.n
                                    @Override // e23.a
                                    public final Object invoke() {
                                        Number numberValueOf;
                                        double dN;
                                        Number numberValueOf2;
                                        ag0.b bVarA;
                                        switch (i24) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar6 = r19;
                                                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar8 = eVar6.f46029e;
                                                m52.c eventLegActivityType3 = kVar8 != null ? kVar8.getEventLegActivityType() : null;
                                                long j8 = eVar6.f46028d;
                                                if (j8 == 0) {
                                                    double d14 = eVar6.f46027c;
                                                    int i25 = eventLegActivityType3 == null ? -1 : mg0.b.a.f118370a[eventLegActivityType3.ordinal()];
                                                    if (i25 == 1 || i25 == 2 || i25 == 3) {
                                                        l3.a aVar11 = l3.f23124b;
                                                        int i26 = (int) eventLegActivityType3.f116680f;
                                                        aVar11.getClass();
                                                        dN = l3.a.n(i26, true);
                                                    } else if (i25 != 4) {
                                                        l3.a aVar12 = l3.f23124b;
                                                        double d15 = eventLegActivityType3 != null ? eventLegActivityType3.f116680f : 0.0d;
                                                        aVar12.getClass();
                                                        dN = l3.a.m(d15, false);
                                                    } else {
                                                        l3.a aVar13 = l3.f23124b;
                                                        double d16 = eventLegActivityType3.f116680f;
                                                        q3 q3Var = q3.MILE_PER_HOUR;
                                                        q3 q3Var2 = q3.METERS_PER_SECOND;
                                                        aVar13.getClass();
                                                        dN = l3.a.w(d16, q3Var, q3Var2);
                                                    }
                                                    numberValueOf = Integer.valueOf((int) (d14 / dN));
                                                } else {
                                                    numberValueOf = Long.valueOf(j8);
                                                }
                                                f1 f1VarA = f1.a.a(f1.Y0, numberValueOf.intValue(), 48, 252);
                                                f1VarA.T = new com.google.android.exoplayer2.analytics.q(19, eVar6, eventLegActivityType3);
                                                String str3 = f1.Z0;
                                                v childFragmentManager = eVar6.getChildFragmentManager();
                                                childFragmentManager.getClass();
                                                if (childFragmentManager.G(str3) == null) {
                                                    f1VarA.show(childFragmentManager, str3);
                                                }
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar7 = r19;
                                                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar9 = eVar7.f46029e;
                                                m52.c eventLegActivityType4 = kVar9 != null ? kVar9.getEventLegActivityType() : null;
                                                boolean z27 = eVar7.f46031g;
                                                double dW = eVar7.f46026b;
                                                if (z27) {
                                                    if (dW == 0.0d) {
                                                        l3.a aVar14 = l3.f23124b;
                                                        double d17 = eventLegActivityType4 != null ? eventLegActivityType4.f116680f : 0.0d;
                                                        q3 q3Var3 = q3.MILE_PER_HOUR;
                                                        q3 q3Var4 = q3.METERS_PER_SECOND;
                                                        aVar14.getClass();
                                                        dW = l3.a.w(d17, q3Var3, q3Var4);
                                                    }
                                                    Context contextRequireContext4 = eVar7.requireContext();
                                                    contextRequireContext4.getClass();
                                                    new ag0.f(contextRequireContext4, dW, eVar7.A6(), new f2.o0(eVar7, 26)).show();
                                                } else {
                                                    if (dW == 0.0d) {
                                                        numberValueOf2 = eventLegActivityType4 != null ? Long.valueOf(eventLegActivityType4.f116680f) : Double.valueOf(0.0d);
                                                    } else if (eventLegActivityType4 == m52.c.RUNNING) {
                                                        l3.a aVar15 = l3.f23124b;
                                                        boolean zA6 = eVar7.A6();
                                                        aVar15.getClass();
                                                        numberValueOf2 = Integer.valueOf(l3.a.p(dW, zA6));
                                                    } else {
                                                        l3.f23124b.getClass();
                                                        numberValueOf2 = Integer.valueOf(l3.a.r(dW, true));
                                                    }
                                                    long j14 = eventLegActivityType4 != null ? eventLegActivityType4.f116678d : 0L;
                                                    Number numberValueOf3 = eventLegActivityType4 != null ? Double.valueOf(eventLegActivityType4.f116679e) : Integer.valueOf(DateTimeConstants.SECONDS_PER_HOUR);
                                                    if (eventLegActivityType4 == m52.c.RUNNING) {
                                                        bVarA = ag0.b.a.b(ag0.b.Z0, numberValueOf2.longValue(), j14, numberValueOf3.longValue(), eVar7.A6());
                                                    } else {
                                                        ag0.b.a aVar16 = ag0.b.Z0;
                                                        long jLongValue = numberValueOf2.longValue();
                                                        long jLongValue2 = numberValueOf3.longValue();
                                                        aVar16.getClass();
                                                        bVarA = ag0.b.a.a(jLongValue, j14, jLongValue2, null, R.string.lbl_per_100_meters);
                                                    }
                                                    String string4 = eVar7.getString(R.string.lbl_ok);
                                                    string4.getClass();
                                                    bVarA.U6(string4, new p(eventLegActivityType4, eVar7));
                                                    bVarA.show(eVar7.getParentFragmentManager(), "GoalPacePicker");
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r14.K(objQ);
                            }
                        }
                        int i25 = b92.a.f16960b;
                        boolean z27 = z16;
                        r19.u6(0, 0, aVarB, (e23.a) objQ, string3, str, r14, z27);
                        String string4 = r19.getString(r19.f46031g ? R.string.lbl_course_goal_speed : R.string.lbl_course_goal_pace);
                        string4.getClass();
                        p2 p2Var4 = p2Var2;
                        String str3 = (String) ((o13.p) p0.c(p2Var4, r14, 0).getF182175a()).f128594a;
                        String str4 = (String) ((o13.p) p0.c(p2Var4, r14, 0).getF182175a()).f128595b;
                        b92.a.C0235a c0235a2 = new b92.a.C0235a(r15, i18, r15);
                        c0235a2.f16962a.put("label_secondary", str4);
                        b92.a aVarB2 = c0235a2.b();
                        boolean zR2 = r14.r(r19);
                        Object objQ2 = r14.q();
                        if (zR2) {
                            objQ2 = new e23.a() { // from class: fz1.n
                                @Override // e23.a
                                public final Object invoke() {
                                    Number numberValueOf;
                                    double dN;
                                    Number numberValueOf2;
                                    ag0.b bVarA;
                                    switch (i18) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar6 = r19;
                                            com.garmin.android.apps.connectmobile.workouts.data.model.k kVar8 = eVar6.f46029e;
                                            m52.c eventLegActivityType3 = kVar8 != null ? kVar8.getEventLegActivityType() : null;
                                            long j8 = eVar6.f46028d;
                                            if (j8 == 0) {
                                                double d14 = eVar6.f46027c;
                                                int i26 = eventLegActivityType3 == null ? -1 : mg0.b.a.f118370a[eventLegActivityType3.ordinal()];
                                                if (i26 == 1 || i26 == 2 || i26 == 3) {
                                                    l3.a aVar11 = l3.f23124b;
                                                    int i27 = (int) eventLegActivityType3.f116680f;
                                                    aVar11.getClass();
                                                    dN = l3.a.n(i27, true);
                                                } else if (i26 != 4) {
                                                    l3.a aVar12 = l3.f23124b;
                                                    double d15 = eventLegActivityType3 != null ? eventLegActivityType3.f116680f : 0.0d;
                                                    aVar12.getClass();
                                                    dN = l3.a.m(d15, false);
                                                } else {
                                                    l3.a aVar13 = l3.f23124b;
                                                    double d16 = eventLegActivityType3.f116680f;
                                                    q3 q3Var = q3.MILE_PER_HOUR;
                                                    q3 q3Var2 = q3.METERS_PER_SECOND;
                                                    aVar13.getClass();
                                                    dN = l3.a.w(d16, q3Var, q3Var2);
                                                }
                                                numberValueOf = Integer.valueOf((int) (d14 / dN));
                                            } else {
                                                numberValueOf = Long.valueOf(j8);
                                            }
                                            f1 f1VarA = f1.a.a(f1.Y0, numberValueOf.intValue(), 48, 252);
                                            f1VarA.T = new com.google.android.exoplayer2.analytics.q(19, eVar6, eventLegActivityType3);
                                            String str5 = f1.Z0;
                                            v childFragmentManager = eVar6.getChildFragmentManager();
                                            childFragmentManager.getClass();
                                            if (childFragmentManager.G(str5) == null) {
                                                f1VarA.show(childFragmentManager, str5);
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar7 = r19;
                                            com.garmin.android.apps.connectmobile.workouts.data.model.k kVar9 = eVar7.f46029e;
                                            m52.c eventLegActivityType4 = kVar9 != null ? kVar9.getEventLegActivityType() : null;
                                            boolean z28 = eVar7.f46031g;
                                            double dW = eVar7.f46026b;
                                            if (z28) {
                                                if (dW == 0.0d) {
                                                    l3.a aVar14 = l3.f23124b;
                                                    double d17 = eventLegActivityType4 != null ? eventLegActivityType4.f116680f : 0.0d;
                                                    q3 q3Var3 = q3.MILE_PER_HOUR;
                                                    q3 q3Var4 = q3.METERS_PER_SECOND;
                                                    aVar14.getClass();
                                                    dW = l3.a.w(d17, q3Var3, q3Var4);
                                                }
                                                Context contextRequireContext4 = eVar7.requireContext();
                                                contextRequireContext4.getClass();
                                                new ag0.f(contextRequireContext4, dW, eVar7.A6(), new f2.o0(eVar7, 26)).show();
                                            } else {
                                                if (dW == 0.0d) {
                                                    numberValueOf2 = eventLegActivityType4 != null ? Long.valueOf(eventLegActivityType4.f116680f) : Double.valueOf(0.0d);
                                                } else if (eventLegActivityType4 == m52.c.RUNNING) {
                                                    l3.a aVar15 = l3.f23124b;
                                                    boolean zA6 = eVar7.A6();
                                                    aVar15.getClass();
                                                    numberValueOf2 = Integer.valueOf(l3.a.p(dW, zA6));
                                                } else {
                                                    l3.f23124b.getClass();
                                                    numberValueOf2 = Integer.valueOf(l3.a.r(dW, true));
                                                }
                                                long j14 = eventLegActivityType4 != null ? eventLegActivityType4.f116678d : 0L;
                                                Number numberValueOf3 = eventLegActivityType4 != null ? Double.valueOf(eventLegActivityType4.f116679e) : Integer.valueOf(DateTimeConstants.SECONDS_PER_HOUR);
                                                if (eventLegActivityType4 == m52.c.RUNNING) {
                                                    bVarA = ag0.b.a.b(ag0.b.Z0, numberValueOf2.longValue(), j14, numberValueOf3.longValue(), eVar7.A6());
                                                } else {
                                                    ag0.b.a aVar16 = ag0.b.Z0;
                                                    long jLongValue = numberValueOf2.longValue();
                                                    long jLongValue2 = numberValueOf3.longValue();
                                                    aVar16.getClass();
                                                    bVarA = ag0.b.a.a(jLongValue, j14, jLongValue2, null, R.string.lbl_per_100_meters);
                                                }
                                                String string5 = eVar7.getString(R.string.lbl_ok);
                                                string5.getClass();
                                                bVarA.U6(string5, new p(eventLegActivityType4, eVar7));
                                                bVarA.show(eVar7.getParentFragmentManager(), "GoalPacePicker");
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r14.K(objQ2);
                        } else {
                            aVar10.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: fz1.n
                                    @Override // e23.a
                                    public final Object invoke() {
                                        Number numberValueOf;
                                        double dN;
                                        Number numberValueOf2;
                                        ag0.b bVarA;
                                        switch (i18) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar6 = r19;
                                                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar8 = eVar6.f46029e;
                                                m52.c eventLegActivityType3 = kVar8 != null ? kVar8.getEventLegActivityType() : null;
                                                long j8 = eVar6.f46028d;
                                                if (j8 == 0) {
                                                    double d14 = eVar6.f46027c;
                                                    int i26 = eventLegActivityType3 == null ? -1 : mg0.b.a.f118370a[eventLegActivityType3.ordinal()];
                                                    if (i26 == 1 || i26 == 2 || i26 == 3) {
                                                        l3.a aVar11 = l3.f23124b;
                                                        int i27 = (int) eventLegActivityType3.f116680f;
                                                        aVar11.getClass();
                                                        dN = l3.a.n(i27, true);
                                                    } else if (i26 != 4) {
                                                        l3.a aVar12 = l3.f23124b;
                                                        double d15 = eventLegActivityType3 != null ? eventLegActivityType3.f116680f : 0.0d;
                                                        aVar12.getClass();
                                                        dN = l3.a.m(d15, false);
                                                    } else {
                                                        l3.a aVar13 = l3.f23124b;
                                                        double d16 = eventLegActivityType3.f116680f;
                                                        q3 q3Var = q3.MILE_PER_HOUR;
                                                        q3 q3Var2 = q3.METERS_PER_SECOND;
                                                        aVar13.getClass();
                                                        dN = l3.a.w(d16, q3Var, q3Var2);
                                                    }
                                                    numberValueOf = Integer.valueOf((int) (d14 / dN));
                                                } else {
                                                    numberValueOf = Long.valueOf(j8);
                                                }
                                                f1 f1VarA = f1.a.a(f1.Y0, numberValueOf.intValue(), 48, 252);
                                                f1VarA.T = new com.google.android.exoplayer2.analytics.q(19, eVar6, eventLegActivityType3);
                                                String str5 = f1.Z0;
                                                v childFragmentManager = eVar6.getChildFragmentManager();
                                                childFragmentManager.getClass();
                                                if (childFragmentManager.G(str5) == null) {
                                                    f1VarA.show(childFragmentManager, str5);
                                                }
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar7 = r19;
                                                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar9 = eVar7.f46029e;
                                                m52.c eventLegActivityType4 = kVar9 != null ? kVar9.getEventLegActivityType() : null;
                                                boolean z28 = eVar7.f46031g;
                                                double dW = eVar7.f46026b;
                                                if (z28) {
                                                    if (dW == 0.0d) {
                                                        l3.a aVar14 = l3.f23124b;
                                                        double d17 = eventLegActivityType4 != null ? eventLegActivityType4.f116680f : 0.0d;
                                                        q3 q3Var3 = q3.MILE_PER_HOUR;
                                                        q3 q3Var4 = q3.METERS_PER_SECOND;
                                                        aVar14.getClass();
                                                        dW = l3.a.w(d17, q3Var3, q3Var4);
                                                    }
                                                    Context contextRequireContext4 = eVar7.requireContext();
                                                    contextRequireContext4.getClass();
                                                    new ag0.f(contextRequireContext4, dW, eVar7.A6(), new f2.o0(eVar7, 26)).show();
                                                } else {
                                                    if (dW == 0.0d) {
                                                        numberValueOf2 = eventLegActivityType4 != null ? Long.valueOf(eventLegActivityType4.f116680f) : Double.valueOf(0.0d);
                                                    } else if (eventLegActivityType4 == m52.c.RUNNING) {
                                                        l3.a aVar15 = l3.f23124b;
                                                        boolean zA6 = eVar7.A6();
                                                        aVar15.getClass();
                                                        numberValueOf2 = Integer.valueOf(l3.a.p(dW, zA6));
                                                    } else {
                                                        l3.f23124b.getClass();
                                                        numberValueOf2 = Integer.valueOf(l3.a.r(dW, true));
                                                    }
                                                    long j14 = eventLegActivityType4 != null ? eventLegActivityType4.f116678d : 0L;
                                                    Number numberValueOf3 = eventLegActivityType4 != null ? Double.valueOf(eventLegActivityType4.f116679e) : Integer.valueOf(DateTimeConstants.SECONDS_PER_HOUR);
                                                    if (eventLegActivityType4 == m52.c.RUNNING) {
                                                        bVarA = ag0.b.a.b(ag0.b.Z0, numberValueOf2.longValue(), j14, numberValueOf3.longValue(), eVar7.A6());
                                                    } else {
                                                        ag0.b.a aVar16 = ag0.b.Z0;
                                                        long jLongValue = numberValueOf2.longValue();
                                                        long jLongValue2 = numberValueOf3.longValue();
                                                        aVar16.getClass();
                                                        bVarA = ag0.b.a.a(jLongValue, j14, jLongValue2, null, R.string.lbl_per_100_meters);
                                                    }
                                                    String string5 = eVar7.getString(R.string.lbl_ok);
                                                    string5.getClass();
                                                    bVarA.U6(string5, new p(eventLegActivityType4, eVar7));
                                                    bVarA.show(eVar7.getParentFragmentManager(), "GoalPacePicker");
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r14.K(objQ2);
                            }
                        }
                        r19.u6(0, 4, aVarB2, (e23.a) objQ2, string4, str3, r14, false);
                        if (z27) {
                            r14.C(238530742);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97920e);
                            String string5 = r19.getString(R.string.goal_time_or_pace_required, "48");
                            string5.getClass();
                            d92.b.f58624b.getClass();
                            ?? r24 = r14;
                            r28 = r15;
                            r16 = r19;
                            mh.c(string5, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, r14), r24, 0, 0, 131068);
                            ?? r25 = r24;
                            r25.f();
                            r17 = r25;
                        } else {
                            r16 = r19;
                            r28 = r15;
                            r14.C(238734195);
                            r14.f();
                            r17 = r14;
                        }
                        r17.y();
                        ng0.a aVar11 = r16.f46032h;
                        if (aVar11 == ng0.a.LEG_SCREEN_VIEW || (aVar11 == ng0.a.DETAILS_SCREEN_VIEW && r16.y6().f74015n)) {
                            r17.C(1639276368);
                            h4.r.a aVar12 = aVar2;
                            h4.r rVarA = b0Var.a(aVar12, 1.0f, false);
                            if (z18 || z19) {
                                r17.C(1639320388);
                                rVarA = u1.n.e(rVarA, fb1.c.z(d92.b.f58623a, r17), m1.f128891a);
                                r17.f();
                            } else {
                                r17.C(1639540457);
                                r17.f();
                            }
                            s2 s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, r17, 0);
                            int iHashCode3 = Long.hashCode(r17.getU());
                            i2 i2VarX3 = r17.x();
                            h4.r rVarC3 = h4.k.c(rVarA, r17);
                            if (r17.F() == null) {
                                p0.l();
                                throw r28;
                            }
                            r17.z();
                            if (r17.getT()) {
                                r17.M(aVar);
                            } else {
                                r17.c();
                            }
                            b4.c(eVar2, s2VarA, r17);
                            b4.c(c1623g, i2VarX3, r17);
                            if (r17.getT() || !p005kotlin.jvm.internal.s.g(r17.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, r17, iHashCode3, bVar);
                            }
                            b4.c(fVar, rVarC3, r17);
                            u2 u2Var = u2.f22900a;
                            ?? r26 = f0.f110999a;
                            String string6 = r16.getString(R.string.lbl_next);
                            string6.getClass();
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarF2 = x2.f(c2.l.y(aVar12, j92.b.f97899b.f97920e), 1.0f);
                            boolean z28 = !z17;
                            boolean zR3 = r17.r(r16);
                            Object objQ3 = r17.q();
                            if (zR3) {
                                objQ3 = new c2(21, (Object) r16, u2Var);
                                r17.K(objQ3);
                            } else {
                                aVar10.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new c2(21, (Object) r16, u2Var);
                                    r17.K(objQ3);
                                }
                            }
                            ?? r27 = r17;
                            r26.d(0, 1, (e23.a) objQ3, rVarF2, string6, r27, null, z28);
                            ?? r29 = r27;
                            r29.y();
                            r29.f();
                            r18 = r29;
                        } else {
                            r17.C(1641760553);
                            r17.f();
                            r18 = r17;
                        }
                        r18.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, eVarC, o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fz1.m(this, z14, z15, i14, i15, i16);
        }
    }

    public final fz1.k y6() {
        return (fz1.k) this.f46025a.getValue();
    }

    public final p<String, String> z6(m52.c cVar) {
        int i14 = cVar == null ? -1 : b.f46039a[cVar.ordinal()];
        if (i14 == 1) {
            this.f46026b = this.f46027c / this.f46028d;
            String string = getString(A6() ? R.string.lbl_pace_unit_km : R.string.lbl_pace_unit_mi);
            string.getClass();
            og0.a aVar = og0.a.f131967a;
            double d14 = this.f46028d;
            double d15 = this.f46027c;
            aVar.getClass();
            String strG = e5.g(og0.a.b(d14, d15), StringUtils.SPACE, string);
            l3.a aVar2 = l3.f23124b;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            l22.a aVar3 = new l22.a(contextRequireContext);
            int iD = (int) og0.a.d(this.f46028d, this.f46027c);
            aVar2.getClass();
            return new p<>(strG, e5.g(l3.a.k1(aVar3, true, iD), StringUtils.SPACE, string));
        }
        if (i14 == 2) {
            this.f46026b = this.f46027c / this.f46028d;
            q3 q3Var = A6() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
            l3.a aVar4 = l3.f23124b;
            Context context = getContext();
            double d16 = this.f46026b;
            aVar4.getClass();
            String strN0 = l3.a.N0(context, d16, q3Var, l3.f23130h, true, getString(R.string.enter_goal_speed));
            return new p<>(strN0, strN0);
        }
        if (i14 != 3 && i14 != 4 && i14 != 5) {
            y.f136664a.getClass();
            y.a.c("EventLegGoalFragment", "Invalid event Leg Activity Type " + cVar);
            return new p<>("", "");
        }
        this.f46026b = this.f46027c / this.f46028d;
        l3.a aVar5 = l3.f23124b;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        double d17 = this.f46026b;
        String string2 = getString(R.string.enter_goal_speed);
        string2.getClass();
        String strM1 = aVar5.M1(contextRequireContext2, d17, true, true, string2);
        int iR = l3.a.r(this.f46026b, true);
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        String strH = com.nimbusds.jose.shaded.gson.internal.a.h(l3.a.k1(new l22.a(contextRequireContext3), true, iR), getString(R.string.lbl_per), "100", getString(R.string.lbl_meter));
        String strConcat = "Invalid event Leg Activity Type ".concat(strH);
        y.f136664a.getClass();
        y.a.c("EventLegGoalFragment", strConcat);
        return new p<>(strM1, strH);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LEG_TARGET_DTO", "CUSTOM_LEG_GOAL", "IS_ORGANIZER_EVENT", "LEG_GOAL_SCREEN_VIEW", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
