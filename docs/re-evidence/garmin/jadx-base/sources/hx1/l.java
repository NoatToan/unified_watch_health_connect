package hx1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhx1/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f86289l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f86290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d3 f86291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f86292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f86293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f86294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f86295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f86296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f86297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexOneLineButton f86298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMComplexOneLineButton f86299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f86300k;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86301a;

        static {
            int[] iArr = new int[fx1.e.values().length];
            try {
                iArr[fx1.e.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fx1.e.THREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fx1.e.FOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fx1.e.FIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fx1.e.SIX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[fx1.e.SEVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[fx1.e.EIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f86301a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hx1/l$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.s
        public final void b() {
            a aVar = l.f86289l;
            l lVar = l.this;
            fx1.e eVar = (fx1.e) lVar.u6().f80059m.d();
            if (eVar != null) {
                gx1.b bVarU6 = lVar.u6();
                ex1.a aVar2 = (ex1.a) bVarU6.f80053g.d();
                bVarU6.x4().m(aVar2 != null ? ex1.a.b(aVar2, null, null, eVar, 3) : null);
            }
            lVar.f86300k.f(false);
            lVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f86303a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f86303a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f86303a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86303a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f86304a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f86304a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f86304a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f86305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f86306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f86305a = aVar;
            this.f86306b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f86305a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f86306b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f86307a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f86307a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f86307a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public l() {
        super(R.layout.gcm4_filter_workouts_per_week_fragment);
        this.f86290a = new w1(s0.f105811a.b(gx1.b.class), new e(this), new g(this), new f(null, this));
        this.f86300k = new c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f86291b = (d3) context;
        } catch (Exception unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "StpFilterWorkoutsPerWeekFragment", "Host activity must implement ToolbarListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((y0) u6().f80050d.getValue()).j(Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f86292c = a7.b.getDrawable(view2.getContext(), 2131232298);
        d3 d3Var = this.f86291b;
        if (d3Var != null) {
            d3Var.updateActionBar(getString(R.string.stp_filter_workouts_per_week_title), 2);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f86300k, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.all_button);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById;
        gCMComplexOneLineButton.getClass();
        v6(gCMComplexOneLineButton);
        viewFindViewById.getClass();
        this.f86293d = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.three_button);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) viewFindViewById2;
        gCMComplexOneLineButton2.getClass();
        v6(gCMComplexOneLineButton2);
        viewFindViewById2.getClass();
        this.f86294e = (GCMComplexOneLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.four_button);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) viewFindViewById3;
        gCMComplexOneLineButton3.getClass();
        v6(gCMComplexOneLineButton3);
        viewFindViewById3.getClass();
        this.f86295f = (GCMComplexOneLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.five_button);
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) viewFindViewById4;
        gCMComplexOneLineButton4.getClass();
        v6(gCMComplexOneLineButton4);
        viewFindViewById4.getClass();
        this.f86296g = (GCMComplexOneLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.six_button);
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) viewFindViewById5;
        gCMComplexOneLineButton5.getClass();
        v6(gCMComplexOneLineButton5);
        viewFindViewById5.getClass();
        this.f86297h = (GCMComplexOneLineButton) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.seven_button);
        GCMComplexOneLineButton gCMComplexOneLineButton6 = (GCMComplexOneLineButton) viewFindViewById6;
        gCMComplexOneLineButton6.getClass();
        v6(gCMComplexOneLineButton6);
        viewFindViewById6.getClass();
        this.f86298i = (GCMComplexOneLineButton) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.eight_button);
        GCMComplexOneLineButton gCMComplexOneLineButton7 = (GCMComplexOneLineButton) viewFindViewById7;
        gCMComplexOneLineButton7.getClass();
        v6(gCMComplexOneLineButton7);
        viewFindViewById7.getClass();
        this.f86299j = (GCMComplexOneLineButton) viewFindViewById7;
        GCMComplexOneLineButton gCMComplexOneLineButton8 = this.f86293d;
        if (gCMComplexOneLineButton8 == null) {
            p005kotlin.jvm.internal.s.m("allButton");
            throw null;
        }
        final int i14 = 0;
        gCMComplexOneLineButton8.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f86286b;

            {
                this.f86286b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                l lVar = this.f86286b;
                switch (i15) {
                    case 0:
                        l.a aVar = l.f86289l;
                        lVar.u6().A4(fx1.e.ALL);
                        break;
                    case 1:
                        l.a aVar2 = l.f86289l;
                        lVar.u6().A4(fx1.e.THREE);
                        break;
                    case 2:
                        l.a aVar3 = l.f86289l;
                        lVar.u6().A4(fx1.e.FOUR);
                        break;
                    case 3:
                        l.a aVar4 = l.f86289l;
                        lVar.u6().A4(fx1.e.FIVE);
                        break;
                    case 4:
                        l.a aVar5 = l.f86289l;
                        lVar.u6().A4(fx1.e.SEVEN);
                        break;
                    case 5:
                        l.a aVar6 = l.f86289l;
                        lVar.u6().A4(fx1.e.EIGHT);
                        break;
                    case 6:
                        l.a aVar7 = l.f86289l;
                        lVar.u6().A4(fx1.e.FIVE);
                        break;
                    default:
                        l.a aVar8 = l.f86289l;
                        lVar.u6().A4(fx1.e.SIX);
                        break;
                }
            }
        });
        if (u6().f80047a == fx1.c.SELF_GUIDED) {
            GCMComplexOneLineButton gCMComplexOneLineButton9 = this.f86294e;
            if (gCMComplexOneLineButton9 == null) {
                p005kotlin.jvm.internal.s.m("threeButton");
                throw null;
            }
            final int i15 = 1;
            gCMComplexOneLineButton9.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f86286b;

                {
                    this.f86286b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i16 = i15;
                    l lVar = this.f86286b;
                    switch (i16) {
                        case 0:
                            l.a aVar = l.f86289l;
                            lVar.u6().A4(fx1.e.ALL);
                            break;
                        case 1:
                            l.a aVar2 = l.f86289l;
                            lVar.u6().A4(fx1.e.THREE);
                            break;
                        case 2:
                            l.a aVar3 = l.f86289l;
                            lVar.u6().A4(fx1.e.FOUR);
                            break;
                        case 3:
                            l.a aVar4 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        case 4:
                            l.a aVar5 = l.f86289l;
                            lVar.u6().A4(fx1.e.SEVEN);
                            break;
                        case 5:
                            l.a aVar6 = l.f86289l;
                            lVar.u6().A4(fx1.e.EIGHT);
                            break;
                        case 6:
                            l.a aVar7 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        default:
                            l.a aVar8 = l.f86289l;
                            lVar.u6().A4(fx1.e.SIX);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton10 = this.f86295f;
            if (gCMComplexOneLineButton10 == null) {
                p005kotlin.jvm.internal.s.m("fourButton");
                throw null;
            }
            final int i16 = 2;
            gCMComplexOneLineButton10.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f86286b;

                {
                    this.f86286b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i17 = i16;
                    l lVar = this.f86286b;
                    switch (i17) {
                        case 0:
                            l.a aVar = l.f86289l;
                            lVar.u6().A4(fx1.e.ALL);
                            break;
                        case 1:
                            l.a aVar2 = l.f86289l;
                            lVar.u6().A4(fx1.e.THREE);
                            break;
                        case 2:
                            l.a aVar3 = l.f86289l;
                            lVar.u6().A4(fx1.e.FOUR);
                            break;
                        case 3:
                            l.a aVar4 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        case 4:
                            l.a aVar5 = l.f86289l;
                            lVar.u6().A4(fx1.e.SEVEN);
                            break;
                        case 5:
                            l.a aVar6 = l.f86289l;
                            lVar.u6().A4(fx1.e.EIGHT);
                            break;
                        case 6:
                            l.a aVar7 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        default:
                            l.a aVar8 = l.f86289l;
                            lVar.u6().A4(fx1.e.SIX);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton11 = this.f86296g;
            if (gCMComplexOneLineButton11 == null) {
                p005kotlin.jvm.internal.s.m("fiveButton");
                throw null;
            }
            final int i17 = 3;
            gCMComplexOneLineButton11.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f86286b;

                {
                    this.f86286b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i18 = i17;
                    l lVar = this.f86286b;
                    switch (i18) {
                        case 0:
                            l.a aVar = l.f86289l;
                            lVar.u6().A4(fx1.e.ALL);
                            break;
                        case 1:
                            l.a aVar2 = l.f86289l;
                            lVar.u6().A4(fx1.e.THREE);
                            break;
                        case 2:
                            l.a aVar3 = l.f86289l;
                            lVar.u6().A4(fx1.e.FOUR);
                            break;
                        case 3:
                            l.a aVar4 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        case 4:
                            l.a aVar5 = l.f86289l;
                            lVar.u6().A4(fx1.e.SEVEN);
                            break;
                        case 5:
                            l.a aVar6 = l.f86289l;
                            lVar.u6().A4(fx1.e.EIGHT);
                            break;
                        case 6:
                            l.a aVar7 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        default:
                            l.a aVar8 = l.f86289l;
                            lVar.u6().A4(fx1.e.SIX);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton12 = this.f86298i;
            if (gCMComplexOneLineButton12 == null) {
                p005kotlin.jvm.internal.s.m("sevenButton");
                throw null;
            }
            final int i18 = 4;
            gCMComplexOneLineButton12.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f86286b;

                {
                    this.f86286b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i19 = i18;
                    l lVar = this.f86286b;
                    switch (i19) {
                        case 0:
                            l.a aVar = l.f86289l;
                            lVar.u6().A4(fx1.e.ALL);
                            break;
                        case 1:
                            l.a aVar2 = l.f86289l;
                            lVar.u6().A4(fx1.e.THREE);
                            break;
                        case 2:
                            l.a aVar3 = l.f86289l;
                            lVar.u6().A4(fx1.e.FOUR);
                            break;
                        case 3:
                            l.a aVar4 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        case 4:
                            l.a aVar5 = l.f86289l;
                            lVar.u6().A4(fx1.e.SEVEN);
                            break;
                        case 5:
                            l.a aVar6 = l.f86289l;
                            lVar.u6().A4(fx1.e.EIGHT);
                            break;
                        case 6:
                            l.a aVar7 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        default:
                            l.a aVar8 = l.f86289l;
                            lVar.u6().A4(fx1.e.SIX);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton13 = this.f86299j;
            if (gCMComplexOneLineButton13 == null) {
                p005kotlin.jvm.internal.s.m("eightButton");
                throw null;
            }
            final int i19 = 5;
            gCMComplexOneLineButton13.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f86286b;

                {
                    this.f86286b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i110 = i19;
                    l lVar = this.f86286b;
                    switch (i110) {
                        case 0:
                            l.a aVar = l.f86289l;
                            lVar.u6().A4(fx1.e.ALL);
                            break;
                        case 1:
                            l.a aVar2 = l.f86289l;
                            lVar.u6().A4(fx1.e.THREE);
                            break;
                        case 2:
                            l.a aVar3 = l.f86289l;
                            lVar.u6().A4(fx1.e.FOUR);
                            break;
                        case 3:
                            l.a aVar4 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        case 4:
                            l.a aVar5 = l.f86289l;
                            lVar.u6().A4(fx1.e.SEVEN);
                            break;
                        case 5:
                            l.a aVar6 = l.f86289l;
                            lVar.u6().A4(fx1.e.EIGHT);
                            break;
                        case 6:
                            l.a aVar7 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        default:
                            l.a aVar8 = l.f86289l;
                            lVar.u6().A4(fx1.e.SIX);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton14 = this.f86297h;
            if (gCMComplexOneLineButton14 == null) {
                p005kotlin.jvm.internal.s.m("sixButton");
                throw null;
            }
            gCMComplexOneLineButton14.setVisibility(8);
        } else {
            GCMComplexOneLineButton gCMComplexOneLineButton15 = this.f86296g;
            if (gCMComplexOneLineButton15 == null) {
                p005kotlin.jvm.internal.s.m("fiveButton");
                throw null;
            }
            final int i24 = 6;
            gCMComplexOneLineButton15.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f86286b;

                {
                    this.f86286b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i110 = i24;
                    l lVar = this.f86286b;
                    switch (i110) {
                        case 0:
                            l.a aVar = l.f86289l;
                            lVar.u6().A4(fx1.e.ALL);
                            break;
                        case 1:
                            l.a aVar2 = l.f86289l;
                            lVar.u6().A4(fx1.e.THREE);
                            break;
                        case 2:
                            l.a aVar3 = l.f86289l;
                            lVar.u6().A4(fx1.e.FOUR);
                            break;
                        case 3:
                            l.a aVar4 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        case 4:
                            l.a aVar5 = l.f86289l;
                            lVar.u6().A4(fx1.e.SEVEN);
                            break;
                        case 5:
                            l.a aVar6 = l.f86289l;
                            lVar.u6().A4(fx1.e.EIGHT);
                            break;
                        case 6:
                            l.a aVar7 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        default:
                            l.a aVar8 = l.f86289l;
                            lVar.u6().A4(fx1.e.SIX);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton16 = this.f86297h;
            if (gCMComplexOneLineButton16 == null) {
                p005kotlin.jvm.internal.s.m("sixButton");
                throw null;
            }
            final int i25 = 7;
            gCMComplexOneLineButton16.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f86286b;

                {
                    this.f86286b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i110 = i25;
                    l lVar = this.f86286b;
                    switch (i110) {
                        case 0:
                            l.a aVar = l.f86289l;
                            lVar.u6().A4(fx1.e.ALL);
                            break;
                        case 1:
                            l.a aVar2 = l.f86289l;
                            lVar.u6().A4(fx1.e.THREE);
                            break;
                        case 2:
                            l.a aVar3 = l.f86289l;
                            lVar.u6().A4(fx1.e.FOUR);
                            break;
                        case 3:
                            l.a aVar4 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        case 4:
                            l.a aVar5 = l.f86289l;
                            lVar.u6().A4(fx1.e.SEVEN);
                            break;
                        case 5:
                            l.a aVar6 = l.f86289l;
                            lVar.u6().A4(fx1.e.EIGHT);
                            break;
                        case 6:
                            l.a aVar7 = l.f86289l;
                            lVar.u6().A4(fx1.e.FIVE);
                            break;
                        default:
                            l.a aVar8 = l.f86289l;
                            lVar.u6().A4(fx1.e.SIX);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton17 = this.f86294e;
            if (gCMComplexOneLineButton17 == null) {
                p005kotlin.jvm.internal.s.m("threeButton");
                throw null;
            }
            gCMComplexOneLineButton17.setVisibility(8);
            GCMComplexOneLineButton gCMComplexOneLineButton18 = this.f86295f;
            if (gCMComplexOneLineButton18 == null) {
                p005kotlin.jvm.internal.s.m("fourButton");
                throw null;
            }
            gCMComplexOneLineButton18.setVisibility(8);
            GCMComplexOneLineButton gCMComplexOneLineButton19 = this.f86298i;
            if (gCMComplexOneLineButton19 == null) {
                p005kotlin.jvm.internal.s.m("sevenButton");
                throw null;
            }
            gCMComplexOneLineButton19.setVisibility(8);
            GCMComplexOneLineButton gCMComplexOneLineButton20 = this.f86299j;
            if (gCMComplexOneLineButton20 == null) {
                p005kotlin.jvm.internal.s.m("eightButton");
                throw null;
            }
            gCMComplexOneLineButton20.setVisibility(8);
        }
        final int i26 = 0;
        u6().f80053g.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: hx1.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f86288b;

            {
                this.f86288b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i27 = i26;
                l lVar = this.f86288b;
                switch (i27) {
                    case 0:
                        l.a aVar = l.f86289l;
                        lVar.u6().A4(((ex1.a) obj).f66929c);
                        return Unit.INSTANCE;
                    default:
                        fx1.e eVar = (fx1.e) obj;
                        if (eVar != null) {
                            GCMComplexOneLineButton gCMComplexOneLineButton21 = lVar.f86293d;
                            if (gCMComplexOneLineButton21 == null) {
                                p005kotlin.jvm.internal.s.m("allButton");
                                throw null;
                            }
                            gCMComplexOneLineButton21.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton22 = lVar.f86294e;
                            if (gCMComplexOneLineButton22 == null) {
                                p005kotlin.jvm.internal.s.m("threeButton");
                                throw null;
                            }
                            gCMComplexOneLineButton22.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton23 = lVar.f86295f;
                            if (gCMComplexOneLineButton23 == null) {
                                p005kotlin.jvm.internal.s.m("fourButton");
                                throw null;
                            }
                            gCMComplexOneLineButton23.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton24 = lVar.f86296g;
                            if (gCMComplexOneLineButton24 == null) {
                                p005kotlin.jvm.internal.s.m("fiveButton");
                                throw null;
                            }
                            gCMComplexOneLineButton24.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton25 = lVar.f86297h;
                            if (gCMComplexOneLineButton25 == null) {
                                p005kotlin.jvm.internal.s.m("sixButton");
                                throw null;
                            }
                            gCMComplexOneLineButton25.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton26 = lVar.f86298i;
                            if (gCMComplexOneLineButton26 == null) {
                                p005kotlin.jvm.internal.s.m("sevenButton");
                                throw null;
                            }
                            gCMComplexOneLineButton26.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton27 = lVar.f86299j;
                            if (gCMComplexOneLineButton27 == null) {
                                p005kotlin.jvm.internal.s.m("eightButton");
                                throw null;
                            }
                            gCMComplexOneLineButton27.f(false);
                            switch (l.b.f86301a[eVar.ordinal()]) {
                                case 1:
                                    GCMComplexOneLineButton gCMComplexOneLineButton28 = lVar.f86293d;
                                    if (gCMComplexOneLineButton28 == null) {
                                        p005kotlin.jvm.internal.s.m("allButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton28.f(true);
                                    break;
                                    break;
                                case 2:
                                    GCMComplexOneLineButton gCMComplexOneLineButton29 = lVar.f86294e;
                                    if (gCMComplexOneLineButton29 == null) {
                                        p005kotlin.jvm.internal.s.m("threeButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton29.f(true);
                                    break;
                                    break;
                                case 3:
                                    GCMComplexOneLineButton gCMComplexOneLineButton30 = lVar.f86295f;
                                    if (gCMComplexOneLineButton30 == null) {
                                        p005kotlin.jvm.internal.s.m("fourButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton30.f(true);
                                    break;
                                    break;
                                case 4:
                                    GCMComplexOneLineButton gCMComplexOneLineButton31 = lVar.f86296g;
                                    if (gCMComplexOneLineButton31 == null) {
                                        p005kotlin.jvm.internal.s.m("fiveButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton31.f(true);
                                    break;
                                    break;
                                case 5:
                                    GCMComplexOneLineButton gCMComplexOneLineButton32 = lVar.f86297h;
                                    if (gCMComplexOneLineButton32 == null) {
                                        p005kotlin.jvm.internal.s.m("sixButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton32.f(true);
                                    break;
                                    break;
                                case 6:
                                    GCMComplexOneLineButton gCMComplexOneLineButton33 = lVar.f86298i;
                                    if (gCMComplexOneLineButton33 == null) {
                                        p005kotlin.jvm.internal.s.m("sevenButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton33.f(true);
                                    break;
                                    break;
                                case 7:
                                    GCMComplexOneLineButton gCMComplexOneLineButton34 = lVar.f86299j;
                                    if (gCMComplexOneLineButton34 == null) {
                                        p005kotlin.jvm.internal.s.m("eightButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton34.f(true);
                                    break;
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                        } else {
                            l.a aVar2 = l.f86289l;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i27 = 1;
        u6().f80059m.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: hx1.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f86288b;

            {
                this.f86288b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i28 = i27;
                l lVar = this.f86288b;
                switch (i28) {
                    case 0:
                        l.a aVar = l.f86289l;
                        lVar.u6().A4(((ex1.a) obj).f66929c);
                        return Unit.INSTANCE;
                    default:
                        fx1.e eVar = (fx1.e) obj;
                        if (eVar != null) {
                            GCMComplexOneLineButton gCMComplexOneLineButton21 = lVar.f86293d;
                            if (gCMComplexOneLineButton21 == null) {
                                p005kotlin.jvm.internal.s.m("allButton");
                                throw null;
                            }
                            gCMComplexOneLineButton21.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton22 = lVar.f86294e;
                            if (gCMComplexOneLineButton22 == null) {
                                p005kotlin.jvm.internal.s.m("threeButton");
                                throw null;
                            }
                            gCMComplexOneLineButton22.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton23 = lVar.f86295f;
                            if (gCMComplexOneLineButton23 == null) {
                                p005kotlin.jvm.internal.s.m("fourButton");
                                throw null;
                            }
                            gCMComplexOneLineButton23.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton24 = lVar.f86296g;
                            if (gCMComplexOneLineButton24 == null) {
                                p005kotlin.jvm.internal.s.m("fiveButton");
                                throw null;
                            }
                            gCMComplexOneLineButton24.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton25 = lVar.f86297h;
                            if (gCMComplexOneLineButton25 == null) {
                                p005kotlin.jvm.internal.s.m("sixButton");
                                throw null;
                            }
                            gCMComplexOneLineButton25.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton26 = lVar.f86298i;
                            if (gCMComplexOneLineButton26 == null) {
                                p005kotlin.jvm.internal.s.m("sevenButton");
                                throw null;
                            }
                            gCMComplexOneLineButton26.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton27 = lVar.f86299j;
                            if (gCMComplexOneLineButton27 == null) {
                                p005kotlin.jvm.internal.s.m("eightButton");
                                throw null;
                            }
                            gCMComplexOneLineButton27.f(false);
                            switch (l.b.f86301a[eVar.ordinal()]) {
                                case 1:
                                    GCMComplexOneLineButton gCMComplexOneLineButton28 = lVar.f86293d;
                                    if (gCMComplexOneLineButton28 == null) {
                                        p005kotlin.jvm.internal.s.m("allButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton28.f(true);
                                    break;
                                    break;
                                case 2:
                                    GCMComplexOneLineButton gCMComplexOneLineButton29 = lVar.f86294e;
                                    if (gCMComplexOneLineButton29 == null) {
                                        p005kotlin.jvm.internal.s.m("threeButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton29.f(true);
                                    break;
                                    break;
                                case 3:
                                    GCMComplexOneLineButton gCMComplexOneLineButton30 = lVar.f86295f;
                                    if (gCMComplexOneLineButton30 == null) {
                                        p005kotlin.jvm.internal.s.m("fourButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton30.f(true);
                                    break;
                                    break;
                                case 4:
                                    GCMComplexOneLineButton gCMComplexOneLineButton31 = lVar.f86296g;
                                    if (gCMComplexOneLineButton31 == null) {
                                        p005kotlin.jvm.internal.s.m("fiveButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton31.f(true);
                                    break;
                                    break;
                                case 5:
                                    GCMComplexOneLineButton gCMComplexOneLineButton32 = lVar.f86297h;
                                    if (gCMComplexOneLineButton32 == null) {
                                        p005kotlin.jvm.internal.s.m("sixButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton32.f(true);
                                    break;
                                    break;
                                case 6:
                                    GCMComplexOneLineButton gCMComplexOneLineButton33 = lVar.f86298i;
                                    if (gCMComplexOneLineButton33 == null) {
                                        p005kotlin.jvm.internal.s.m("sevenButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton33.f(true);
                                    break;
                                    break;
                                case 7:
                                    GCMComplexOneLineButton gCMComplexOneLineButton34 = lVar.f86299j;
                                    if (gCMComplexOneLineButton34 == null) {
                                        p005kotlin.jvm.internal.s.m("eightButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton34.f(true);
                                    break;
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                        } else {
                            l.a aVar2 = l.f86289l;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final gx1.b u6() {
        return (gx1.b) this.f86290a.getValue();
    }

    public final void v6(GCMComplexOneLineButton gCMComplexOneLineButton) {
        Drawable drawable = this.f86292c;
        int i14 = GCMComplexOneLineButton.f47760m;
        gCMComplexOneLineButton.c(drawable, Float.valueOf(16.0f));
        gCMComplexOneLineButton.f(false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhx1/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
