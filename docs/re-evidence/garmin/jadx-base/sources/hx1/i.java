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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhx1/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f86265m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f86266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d3 f86267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f86268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f86269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f86270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f86271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f86272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f86273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexOneLineButton f86274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMComplexOneLineButton f86275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMComplexOneLineButton f86276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f86277l;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86278a;

        static {
            int[] iArr = new int[fx1.b.values().length];
            try {
                iArr[fx1.b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fx1.b.FIVE_K.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fx1.b.TEN_K.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fx1.b.HALF_MARATHON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fx1.b.MARATHON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[fx1.b.SPRINT_TRIATHLON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[fx1.b.OLYMPIC_TRIATHLON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[fx1.b.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f86278a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hx1/i$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.s
        public final void b() {
            a aVar = i.f86265m;
            i iVar = i.this;
            fx1.b bVar = (fx1.b) iVar.u6().f80057k.d();
            if (bVar != null) {
                gx1.b bVarU6 = iVar.u6();
                ex1.a aVar2 = (ex1.a) bVarU6.f80053g.d();
                bVarU6.x4().m(aVar2 != null ? ex1.a.b(aVar2, null, bVar, null, 5) : null);
            }
            iVar.f86277l.f(false);
            iVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f86280a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f86280a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f86280a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86280a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f86281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f86281a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f86281a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f86282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f86283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f86282a = aVar;
            this.f86283b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f86282a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f86283b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f86284a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f86284a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f86284a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public i() {
        super(R.layout.gcm4_filter_plan_type_fragment);
        this.f86266a = new w1(s0.f105811a.b(gx1.b.class), new e(this), new g(this), new f(null, this));
        this.f86277l = new c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f86267b = (d3) context;
        } catch (Exception unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "StpFilterPlanTypeFragment", "Host activity must implement ToolbarListener.");
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
        this.f86268c = a7.b.getDrawable(view2.getContext(), 2131232298);
        d3 d3Var = this.f86267b;
        if (d3Var != null) {
            d3Var.updateActionBar(getString(R.string.stp_filter_plan_self_guided_title), 2);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f86277l, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.all_button);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById;
        gCMComplexOneLineButton.getClass();
        v6(gCMComplexOneLineButton);
        viewFindViewById.getClass();
        this.f86269d = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.five_k_button);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) viewFindViewById2;
        gCMComplexOneLineButton2.getClass();
        v6(gCMComplexOneLineButton2);
        viewFindViewById2.getClass();
        this.f86270e = (GCMComplexOneLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.ten_k_button);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) viewFindViewById3;
        gCMComplexOneLineButton3.getClass();
        v6(gCMComplexOneLineButton3);
        viewFindViewById3.getClass();
        this.f86271f = (GCMComplexOneLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.half_marathon_button);
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) viewFindViewById4;
        gCMComplexOneLineButton4.getClass();
        v6(gCMComplexOneLineButton4);
        viewFindViewById4.getClass();
        this.f86272g = (GCMComplexOneLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.marathon_button);
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) viewFindViewById5;
        gCMComplexOneLineButton5.getClass();
        v6(gCMComplexOneLineButton5);
        viewFindViewById5.getClass();
        this.f86273h = (GCMComplexOneLineButton) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.sprint_triathlon_button);
        GCMComplexOneLineButton gCMComplexOneLineButton6 = (GCMComplexOneLineButton) viewFindViewById6;
        gCMComplexOneLineButton6.getClass();
        v6(gCMComplexOneLineButton6);
        viewFindViewById6.getClass();
        this.f86274i = (GCMComplexOneLineButton) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.olympic_triathlon_button);
        GCMComplexOneLineButton gCMComplexOneLineButton7 = (GCMComplexOneLineButton) viewFindViewById7;
        gCMComplexOneLineButton7.getClass();
        v6(gCMComplexOneLineButton7);
        viewFindViewById7.getClass();
        this.f86275j = (GCMComplexOneLineButton) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.other_button);
        GCMComplexOneLineButton gCMComplexOneLineButton8 = (GCMComplexOneLineButton) viewFindViewById8;
        gCMComplexOneLineButton8.getClass();
        v6(gCMComplexOneLineButton8);
        viewFindViewById8.getClass();
        this.f86276k = (GCMComplexOneLineButton) viewFindViewById8;
        GCMComplexOneLineButton gCMComplexOneLineButton9 = this.f86269d;
        if (gCMComplexOneLineButton9 == null) {
            p005kotlin.jvm.internal.s.m("allButton");
            throw null;
        }
        final int i14 = 0;
        gCMComplexOneLineButton9.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f86264b;

            {
                this.f86264b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                i iVar = this.f86264b;
                switch (i15) {
                    case 0:
                        i.a aVar = i.f86265m;
                        iVar.u6().z4(fx1.b.ALL);
                        break;
                    case 1:
                        i.a aVar2 = i.f86265m;
                        iVar.u6().z4(fx1.b.FIVE_K);
                        break;
                    case 2:
                        i.a aVar3 = i.f86265m;
                        iVar.u6().z4(fx1.b.TEN_K);
                        break;
                    case 3:
                        i.a aVar4 = i.f86265m;
                        iVar.u6().z4(fx1.b.HALF_MARATHON);
                        break;
                    case 4:
                        i.a aVar5 = i.f86265m;
                        iVar.u6().z4(fx1.b.MARATHON);
                        break;
                    case 5:
                        i.a aVar6 = i.f86265m;
                        iVar.u6().z4(fx1.b.OTHER);
                        break;
                    case 6:
                        i.a aVar7 = i.f86265m;
                        iVar.u6().z4(fx1.b.SPRINT_TRIATHLON);
                        break;
                    default:
                        i.a aVar8 = i.f86265m;
                        iVar.u6().z4(fx1.b.OLYMPIC_TRIATHLON);
                        break;
                }
            }
        });
        if (u6().f80047a == fx1.c.SELF_GUIDED) {
            GCMComplexOneLineButton gCMComplexOneLineButton10 = this.f86270e;
            if (gCMComplexOneLineButton10 == null) {
                p005kotlin.jvm.internal.s.m("fiveKButton");
                throw null;
            }
            final int i15 = 1;
            gCMComplexOneLineButton10.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f86264b;

                {
                    this.f86264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i16 = i15;
                    i iVar = this.f86264b;
                    switch (i16) {
                        case 0:
                            i.a aVar = i.f86265m;
                            iVar.u6().z4(fx1.b.ALL);
                            break;
                        case 1:
                            i.a aVar2 = i.f86265m;
                            iVar.u6().z4(fx1.b.FIVE_K);
                            break;
                        case 2:
                            i.a aVar3 = i.f86265m;
                            iVar.u6().z4(fx1.b.TEN_K);
                            break;
                        case 3:
                            i.a aVar4 = i.f86265m;
                            iVar.u6().z4(fx1.b.HALF_MARATHON);
                            break;
                        case 4:
                            i.a aVar5 = i.f86265m;
                            iVar.u6().z4(fx1.b.MARATHON);
                            break;
                        case 5:
                            i.a aVar6 = i.f86265m;
                            iVar.u6().z4(fx1.b.OTHER);
                            break;
                        case 6:
                            i.a aVar7 = i.f86265m;
                            iVar.u6().z4(fx1.b.SPRINT_TRIATHLON);
                            break;
                        default:
                            i.a aVar8 = i.f86265m;
                            iVar.u6().z4(fx1.b.OLYMPIC_TRIATHLON);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton11 = this.f86271f;
            if (gCMComplexOneLineButton11 == null) {
                p005kotlin.jvm.internal.s.m("tenKButton");
                throw null;
            }
            final int i16 = 2;
            gCMComplexOneLineButton11.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f86264b;

                {
                    this.f86264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i17 = i16;
                    i iVar = this.f86264b;
                    switch (i17) {
                        case 0:
                            i.a aVar = i.f86265m;
                            iVar.u6().z4(fx1.b.ALL);
                            break;
                        case 1:
                            i.a aVar2 = i.f86265m;
                            iVar.u6().z4(fx1.b.FIVE_K);
                            break;
                        case 2:
                            i.a aVar3 = i.f86265m;
                            iVar.u6().z4(fx1.b.TEN_K);
                            break;
                        case 3:
                            i.a aVar4 = i.f86265m;
                            iVar.u6().z4(fx1.b.HALF_MARATHON);
                            break;
                        case 4:
                            i.a aVar5 = i.f86265m;
                            iVar.u6().z4(fx1.b.MARATHON);
                            break;
                        case 5:
                            i.a aVar6 = i.f86265m;
                            iVar.u6().z4(fx1.b.OTHER);
                            break;
                        case 6:
                            i.a aVar7 = i.f86265m;
                            iVar.u6().z4(fx1.b.SPRINT_TRIATHLON);
                            break;
                        default:
                            i.a aVar8 = i.f86265m;
                            iVar.u6().z4(fx1.b.OLYMPIC_TRIATHLON);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton12 = this.f86272g;
            if (gCMComplexOneLineButton12 == null) {
                p005kotlin.jvm.internal.s.m("halfMarathonButton");
                throw null;
            }
            final int i17 = 3;
            gCMComplexOneLineButton12.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f86264b;

                {
                    this.f86264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i18 = i17;
                    i iVar = this.f86264b;
                    switch (i18) {
                        case 0:
                            i.a aVar = i.f86265m;
                            iVar.u6().z4(fx1.b.ALL);
                            break;
                        case 1:
                            i.a aVar2 = i.f86265m;
                            iVar.u6().z4(fx1.b.FIVE_K);
                            break;
                        case 2:
                            i.a aVar3 = i.f86265m;
                            iVar.u6().z4(fx1.b.TEN_K);
                            break;
                        case 3:
                            i.a aVar4 = i.f86265m;
                            iVar.u6().z4(fx1.b.HALF_MARATHON);
                            break;
                        case 4:
                            i.a aVar5 = i.f86265m;
                            iVar.u6().z4(fx1.b.MARATHON);
                            break;
                        case 5:
                            i.a aVar6 = i.f86265m;
                            iVar.u6().z4(fx1.b.OTHER);
                            break;
                        case 6:
                            i.a aVar7 = i.f86265m;
                            iVar.u6().z4(fx1.b.SPRINT_TRIATHLON);
                            break;
                        default:
                            i.a aVar8 = i.f86265m;
                            iVar.u6().z4(fx1.b.OLYMPIC_TRIATHLON);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton13 = this.f86273h;
            if (gCMComplexOneLineButton13 == null) {
                p005kotlin.jvm.internal.s.m("marathonButton");
                throw null;
            }
            final int i18 = 4;
            gCMComplexOneLineButton13.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f86264b;

                {
                    this.f86264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i19 = i18;
                    i iVar = this.f86264b;
                    switch (i19) {
                        case 0:
                            i.a aVar = i.f86265m;
                            iVar.u6().z4(fx1.b.ALL);
                            break;
                        case 1:
                            i.a aVar2 = i.f86265m;
                            iVar.u6().z4(fx1.b.FIVE_K);
                            break;
                        case 2:
                            i.a aVar3 = i.f86265m;
                            iVar.u6().z4(fx1.b.TEN_K);
                            break;
                        case 3:
                            i.a aVar4 = i.f86265m;
                            iVar.u6().z4(fx1.b.HALF_MARATHON);
                            break;
                        case 4:
                            i.a aVar5 = i.f86265m;
                            iVar.u6().z4(fx1.b.MARATHON);
                            break;
                        case 5:
                            i.a aVar6 = i.f86265m;
                            iVar.u6().z4(fx1.b.OTHER);
                            break;
                        case 6:
                            i.a aVar7 = i.f86265m;
                            iVar.u6().z4(fx1.b.SPRINT_TRIATHLON);
                            break;
                        default:
                            i.a aVar8 = i.f86265m;
                            iVar.u6().z4(fx1.b.OLYMPIC_TRIATHLON);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton14 = this.f86276k;
            if (gCMComplexOneLineButton14 == null) {
                p005kotlin.jvm.internal.s.m("otherButton");
                throw null;
            }
            final int i19 = 5;
            gCMComplexOneLineButton14.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f86264b;

                {
                    this.f86264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i110 = i19;
                    i iVar = this.f86264b;
                    switch (i110) {
                        case 0:
                            i.a aVar = i.f86265m;
                            iVar.u6().z4(fx1.b.ALL);
                            break;
                        case 1:
                            i.a aVar2 = i.f86265m;
                            iVar.u6().z4(fx1.b.FIVE_K);
                            break;
                        case 2:
                            i.a aVar3 = i.f86265m;
                            iVar.u6().z4(fx1.b.TEN_K);
                            break;
                        case 3:
                            i.a aVar4 = i.f86265m;
                            iVar.u6().z4(fx1.b.HALF_MARATHON);
                            break;
                        case 4:
                            i.a aVar5 = i.f86265m;
                            iVar.u6().z4(fx1.b.MARATHON);
                            break;
                        case 5:
                            i.a aVar6 = i.f86265m;
                            iVar.u6().z4(fx1.b.OTHER);
                            break;
                        case 6:
                            i.a aVar7 = i.f86265m;
                            iVar.u6().z4(fx1.b.SPRINT_TRIATHLON);
                            break;
                        default:
                            i.a aVar8 = i.f86265m;
                            iVar.u6().z4(fx1.b.OLYMPIC_TRIATHLON);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton15 = this.f86274i;
            if (gCMComplexOneLineButton15 == null) {
                p005kotlin.jvm.internal.s.m("sprintTriathlonButton");
                throw null;
            }
            gCMComplexOneLineButton15.setVisibility(8);
            GCMComplexOneLineButton gCMComplexOneLineButton16 = this.f86275j;
            if (gCMComplexOneLineButton16 == null) {
                p005kotlin.jvm.internal.s.m("olympicTriathlonButton");
                throw null;
            }
            gCMComplexOneLineButton16.setVisibility(8);
        } else {
            GCMComplexOneLineButton gCMComplexOneLineButton17 = this.f86274i;
            if (gCMComplexOneLineButton17 == null) {
                p005kotlin.jvm.internal.s.m("sprintTriathlonButton");
                throw null;
            }
            final int i24 = 6;
            gCMComplexOneLineButton17.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f86264b;

                {
                    this.f86264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i110 = i24;
                    i iVar = this.f86264b;
                    switch (i110) {
                        case 0:
                            i.a aVar = i.f86265m;
                            iVar.u6().z4(fx1.b.ALL);
                            break;
                        case 1:
                            i.a aVar2 = i.f86265m;
                            iVar.u6().z4(fx1.b.FIVE_K);
                            break;
                        case 2:
                            i.a aVar3 = i.f86265m;
                            iVar.u6().z4(fx1.b.TEN_K);
                            break;
                        case 3:
                            i.a aVar4 = i.f86265m;
                            iVar.u6().z4(fx1.b.HALF_MARATHON);
                            break;
                        case 4:
                            i.a aVar5 = i.f86265m;
                            iVar.u6().z4(fx1.b.MARATHON);
                            break;
                        case 5:
                            i.a aVar6 = i.f86265m;
                            iVar.u6().z4(fx1.b.OTHER);
                            break;
                        case 6:
                            i.a aVar7 = i.f86265m;
                            iVar.u6().z4(fx1.b.SPRINT_TRIATHLON);
                            break;
                        default:
                            i.a aVar8 = i.f86265m;
                            iVar.u6().z4(fx1.b.OLYMPIC_TRIATHLON);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton18 = this.f86275j;
            if (gCMComplexOneLineButton18 == null) {
                p005kotlin.jvm.internal.s.m("olympicTriathlonButton");
                throw null;
            }
            final int i25 = 7;
            gCMComplexOneLineButton18.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f86264b;

                {
                    this.f86264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i110 = i25;
                    i iVar = this.f86264b;
                    switch (i110) {
                        case 0:
                            i.a aVar = i.f86265m;
                            iVar.u6().z4(fx1.b.ALL);
                            break;
                        case 1:
                            i.a aVar2 = i.f86265m;
                            iVar.u6().z4(fx1.b.FIVE_K);
                            break;
                        case 2:
                            i.a aVar3 = i.f86265m;
                            iVar.u6().z4(fx1.b.TEN_K);
                            break;
                        case 3:
                            i.a aVar4 = i.f86265m;
                            iVar.u6().z4(fx1.b.HALF_MARATHON);
                            break;
                        case 4:
                            i.a aVar5 = i.f86265m;
                            iVar.u6().z4(fx1.b.MARATHON);
                            break;
                        case 5:
                            i.a aVar6 = i.f86265m;
                            iVar.u6().z4(fx1.b.OTHER);
                            break;
                        case 6:
                            i.a aVar7 = i.f86265m;
                            iVar.u6().z4(fx1.b.SPRINT_TRIATHLON);
                            break;
                        default:
                            i.a aVar8 = i.f86265m;
                            iVar.u6().z4(fx1.b.OLYMPIC_TRIATHLON);
                            break;
                    }
                }
            });
            GCMComplexOneLineButton gCMComplexOneLineButton19 = this.f86270e;
            if (gCMComplexOneLineButton19 == null) {
                p005kotlin.jvm.internal.s.m("fiveKButton");
                throw null;
            }
            gCMComplexOneLineButton19.setVisibility(8);
            GCMComplexOneLineButton gCMComplexOneLineButton20 = this.f86271f;
            if (gCMComplexOneLineButton20 == null) {
                p005kotlin.jvm.internal.s.m("tenKButton");
                throw null;
            }
            gCMComplexOneLineButton20.setVisibility(8);
            GCMComplexOneLineButton gCMComplexOneLineButton21 = this.f86272g;
            if (gCMComplexOneLineButton21 == null) {
                p005kotlin.jvm.internal.s.m("halfMarathonButton");
                throw null;
            }
            gCMComplexOneLineButton21.setVisibility(8);
            GCMComplexOneLineButton gCMComplexOneLineButton22 = this.f86273h;
            if (gCMComplexOneLineButton22 == null) {
                p005kotlin.jvm.internal.s.m("marathonButton");
                throw null;
            }
            gCMComplexOneLineButton22.setVisibility(8);
            GCMComplexOneLineButton gCMComplexOneLineButton23 = this.f86276k;
            if (gCMComplexOneLineButton23 == null) {
                p005kotlin.jvm.internal.s.m("otherButton");
                throw null;
            }
            gCMComplexOneLineButton23.setVisibility(8);
        }
        final int i26 = 0;
        u6().f80053g.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: hx1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f86262b;

            {
                this.f86262b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i27 = i26;
                i iVar = this.f86262b;
                switch (i27) {
                    case 0:
                        i.a aVar = i.f86265m;
                        iVar.u6().z4(((ex1.a) obj).f66928b);
                        return Unit.INSTANCE;
                    default:
                        fx1.b bVar = (fx1.b) obj;
                        if (bVar != null) {
                            GCMComplexOneLineButton gCMComplexOneLineButton24 = iVar.f86269d;
                            if (gCMComplexOneLineButton24 == null) {
                                p005kotlin.jvm.internal.s.m("allButton");
                                throw null;
                            }
                            gCMComplexOneLineButton24.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton25 = iVar.f86270e;
                            if (gCMComplexOneLineButton25 == null) {
                                p005kotlin.jvm.internal.s.m("fiveKButton");
                                throw null;
                            }
                            gCMComplexOneLineButton25.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton26 = iVar.f86271f;
                            if (gCMComplexOneLineButton26 == null) {
                                p005kotlin.jvm.internal.s.m("tenKButton");
                                throw null;
                            }
                            gCMComplexOneLineButton26.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton27 = iVar.f86272g;
                            if (gCMComplexOneLineButton27 == null) {
                                p005kotlin.jvm.internal.s.m("halfMarathonButton");
                                throw null;
                            }
                            gCMComplexOneLineButton27.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton28 = iVar.f86273h;
                            if (gCMComplexOneLineButton28 == null) {
                                p005kotlin.jvm.internal.s.m("marathonButton");
                                throw null;
                            }
                            gCMComplexOneLineButton28.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton29 = iVar.f86274i;
                            if (gCMComplexOneLineButton29 == null) {
                                p005kotlin.jvm.internal.s.m("sprintTriathlonButton");
                                throw null;
                            }
                            gCMComplexOneLineButton29.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton30 = iVar.f86275j;
                            if (gCMComplexOneLineButton30 == null) {
                                p005kotlin.jvm.internal.s.m("olympicTriathlonButton");
                                throw null;
                            }
                            gCMComplexOneLineButton30.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton31 = iVar.f86276k;
                            if (gCMComplexOneLineButton31 == null) {
                                p005kotlin.jvm.internal.s.m("otherButton");
                                throw null;
                            }
                            gCMComplexOneLineButton31.f(false);
                            switch (i.b.f86278a[bVar.ordinal()]) {
                                case 1:
                                    GCMComplexOneLineButton gCMComplexOneLineButton32 = iVar.f86269d;
                                    if (gCMComplexOneLineButton32 == null) {
                                        p005kotlin.jvm.internal.s.m("allButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton32.f(true);
                                    break;
                                    break;
                                case 2:
                                    GCMComplexOneLineButton gCMComplexOneLineButton33 = iVar.f86270e;
                                    if (gCMComplexOneLineButton33 == null) {
                                        p005kotlin.jvm.internal.s.m("fiveKButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton33.f(true);
                                    break;
                                    break;
                                case 3:
                                    GCMComplexOneLineButton gCMComplexOneLineButton34 = iVar.f86271f;
                                    if (gCMComplexOneLineButton34 == null) {
                                        p005kotlin.jvm.internal.s.m("tenKButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton34.f(true);
                                    break;
                                    break;
                                case 4:
                                    GCMComplexOneLineButton gCMComplexOneLineButton35 = iVar.f86272g;
                                    if (gCMComplexOneLineButton35 == null) {
                                        p005kotlin.jvm.internal.s.m("halfMarathonButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton35.f(true);
                                    break;
                                    break;
                                case 5:
                                    GCMComplexOneLineButton gCMComplexOneLineButton36 = iVar.f86273h;
                                    if (gCMComplexOneLineButton36 == null) {
                                        p005kotlin.jvm.internal.s.m("marathonButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton36.f(true);
                                    break;
                                    break;
                                case 6:
                                    GCMComplexOneLineButton gCMComplexOneLineButton37 = iVar.f86274i;
                                    if (gCMComplexOneLineButton37 == null) {
                                        p005kotlin.jvm.internal.s.m("sprintTriathlonButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton37.f(true);
                                    break;
                                    break;
                                case 7:
                                    GCMComplexOneLineButton gCMComplexOneLineButton38 = iVar.f86275j;
                                    if (gCMComplexOneLineButton38 == null) {
                                        p005kotlin.jvm.internal.s.m("olympicTriathlonButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton38.f(true);
                                    break;
                                    break;
                                case 8:
                                    GCMComplexOneLineButton gCMComplexOneLineButton39 = iVar.f86276k;
                                    if (gCMComplexOneLineButton39 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton39.f(true);
                                    break;
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                        } else {
                            i.a aVar2 = i.f86265m;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i27 = 1;
        u6().f80057k.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: hx1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f86262b;

            {
                this.f86262b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i28 = i27;
                i iVar = this.f86262b;
                switch (i28) {
                    case 0:
                        i.a aVar = i.f86265m;
                        iVar.u6().z4(((ex1.a) obj).f66928b);
                        return Unit.INSTANCE;
                    default:
                        fx1.b bVar = (fx1.b) obj;
                        if (bVar != null) {
                            GCMComplexOneLineButton gCMComplexOneLineButton24 = iVar.f86269d;
                            if (gCMComplexOneLineButton24 == null) {
                                p005kotlin.jvm.internal.s.m("allButton");
                                throw null;
                            }
                            gCMComplexOneLineButton24.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton25 = iVar.f86270e;
                            if (gCMComplexOneLineButton25 == null) {
                                p005kotlin.jvm.internal.s.m("fiveKButton");
                                throw null;
                            }
                            gCMComplexOneLineButton25.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton26 = iVar.f86271f;
                            if (gCMComplexOneLineButton26 == null) {
                                p005kotlin.jvm.internal.s.m("tenKButton");
                                throw null;
                            }
                            gCMComplexOneLineButton26.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton27 = iVar.f86272g;
                            if (gCMComplexOneLineButton27 == null) {
                                p005kotlin.jvm.internal.s.m("halfMarathonButton");
                                throw null;
                            }
                            gCMComplexOneLineButton27.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton28 = iVar.f86273h;
                            if (gCMComplexOneLineButton28 == null) {
                                p005kotlin.jvm.internal.s.m("marathonButton");
                                throw null;
                            }
                            gCMComplexOneLineButton28.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton29 = iVar.f86274i;
                            if (gCMComplexOneLineButton29 == null) {
                                p005kotlin.jvm.internal.s.m("sprintTriathlonButton");
                                throw null;
                            }
                            gCMComplexOneLineButton29.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton30 = iVar.f86275j;
                            if (gCMComplexOneLineButton30 == null) {
                                p005kotlin.jvm.internal.s.m("olympicTriathlonButton");
                                throw null;
                            }
                            gCMComplexOneLineButton30.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton31 = iVar.f86276k;
                            if (gCMComplexOneLineButton31 == null) {
                                p005kotlin.jvm.internal.s.m("otherButton");
                                throw null;
                            }
                            gCMComplexOneLineButton31.f(false);
                            switch (i.b.f86278a[bVar.ordinal()]) {
                                case 1:
                                    GCMComplexOneLineButton gCMComplexOneLineButton32 = iVar.f86269d;
                                    if (gCMComplexOneLineButton32 == null) {
                                        p005kotlin.jvm.internal.s.m("allButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton32.f(true);
                                    break;
                                    break;
                                case 2:
                                    GCMComplexOneLineButton gCMComplexOneLineButton33 = iVar.f86270e;
                                    if (gCMComplexOneLineButton33 == null) {
                                        p005kotlin.jvm.internal.s.m("fiveKButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton33.f(true);
                                    break;
                                    break;
                                case 3:
                                    GCMComplexOneLineButton gCMComplexOneLineButton34 = iVar.f86271f;
                                    if (gCMComplexOneLineButton34 == null) {
                                        p005kotlin.jvm.internal.s.m("tenKButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton34.f(true);
                                    break;
                                    break;
                                case 4:
                                    GCMComplexOneLineButton gCMComplexOneLineButton35 = iVar.f86272g;
                                    if (gCMComplexOneLineButton35 == null) {
                                        p005kotlin.jvm.internal.s.m("halfMarathonButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton35.f(true);
                                    break;
                                    break;
                                case 5:
                                    GCMComplexOneLineButton gCMComplexOneLineButton36 = iVar.f86273h;
                                    if (gCMComplexOneLineButton36 == null) {
                                        p005kotlin.jvm.internal.s.m("marathonButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton36.f(true);
                                    break;
                                    break;
                                case 6:
                                    GCMComplexOneLineButton gCMComplexOneLineButton37 = iVar.f86274i;
                                    if (gCMComplexOneLineButton37 == null) {
                                        p005kotlin.jvm.internal.s.m("sprintTriathlonButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton37.f(true);
                                    break;
                                    break;
                                case 7:
                                    GCMComplexOneLineButton gCMComplexOneLineButton38 = iVar.f86275j;
                                    if (gCMComplexOneLineButton38 == null) {
                                        p005kotlin.jvm.internal.s.m("olympicTriathlonButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton38.f(true);
                                    break;
                                    break;
                                case 8:
                                    GCMComplexOneLineButton gCMComplexOneLineButton39 = iVar.f86276k;
                                    if (gCMComplexOneLineButton39 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    gCMComplexOneLineButton39.f(true);
                                    break;
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                        } else {
                            i.a aVar2 = i.f86265m;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final gx1.b u6() {
        return (gx1.b) this.f86266a.getValue();
    }

    public final void v6(GCMComplexOneLineButton gCMComplexOneLineButton) {
        Drawable drawable = this.f86268c;
        int i14 = GCMComplexOneLineButton.f47760m;
        gCMComplexOneLineButton.c(drawable, Float.valueOf(16.0f));
        gCMComplexOneLineButton.f(false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhx1/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
