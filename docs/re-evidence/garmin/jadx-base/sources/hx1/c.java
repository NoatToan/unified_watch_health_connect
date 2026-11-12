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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhx1/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f86223i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f86224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d3 f86225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f86226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f86227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f86228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f86229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f86230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1712c f86231h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86232a;

        static {
            int[] iArr = new int[fx1.a.values().length];
            try {
                iArr[fx1.a.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fx1.a.BEGINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fx1.a.INTERMEDIATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fx1.a.ADVANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f86232a = iArr;
        }
    }

    /* JADX INFO: renamed from: hx1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hx1/c$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1712c extends s {
        public C1712c() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.s
        public final void b() {
            c cVar = c.this;
            cVar.f86231h.f(false);
            fx1.a aVar = (fx1.a) cVar.u6().f80055i.d();
            if (aVar != null) {
                gx1.b bVarU6 = cVar.u6();
                ex1.a aVar2 = (ex1.a) bVarU6.f80053g.d();
                bVarU6.x4().m(aVar2 != null ? ex1.a.b(aVar2, aVar, null, null, 6) : null);
            }
            cVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f86234a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f86234a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f86234a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86234a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f86235a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f86235a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f86235a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f86236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f86237b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f86236a = aVar;
            this.f86237b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f86236a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f86237b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f86238a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f86238a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f86238a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c() {
        super(R.layout.gcm4_filter_difficulty_fragment);
        this.f86224a = new w1(s0.f105811a.b(gx1.b.class), new e(this), new g(this), new f(null, this));
        this.f86231h = new C1712c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f86225b = (d3) context;
        } catch (Exception unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "StpFilterDifficultyFragment", "Host activity must implement ToolbarListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((y0) u6().f80050d.getValue()).j(Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Float fValueOf = Float.valueOf(16.0f);
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f86226c = a7.b.getDrawable(view2.getContext(), 2131232298);
        d3 d3Var = this.f86225b;
        final int i14 = 2;
        if (d3Var != null) {
            d3Var.updateActionBar(getString(R.string.common_difficulty), 2);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f86231h, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.all_button);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById;
        gCMComplexOneLineButton.getClass();
        Drawable drawable = this.f86226c;
        int i15 = GCMComplexOneLineButton.f47760m;
        gCMComplexOneLineButton.c(drawable, fValueOf);
        final int i16 = 0;
        gCMComplexOneLineButton.f(false);
        viewFindViewById.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) viewFindViewById;
        this.f86227d = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f86222b;

            {
                this.f86222b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                c cVar = this.f86222b;
                switch (i17) {
                    case 0:
                        c.a aVar = c.f86223i;
                        gx1.b bVarU6 = cVar.u6();
                        fx1.a aVar2 = fx1.a.ALL;
                        aVar2.getClass();
                        ((y0) bVarU6.f80054h.getValue()).j(aVar2);
                        break;
                    case 1:
                        c.a aVar3 = c.f86223i;
                        gx1.b bVarU7 = cVar.u6();
                        fx1.a aVar4 = fx1.a.BEGINNER;
                        aVar4.getClass();
                        ((y0) bVarU7.f80054h.getValue()).j(aVar4);
                        break;
                    case 2:
                        c.a aVar5 = c.f86223i;
                        gx1.b bVarU8 = cVar.u6();
                        fx1.a aVar6 = fx1.a.INTERMEDIATE;
                        aVar6.getClass();
                        ((y0) bVarU8.f80054h.getValue()).j(aVar6);
                        break;
                    default:
                        c.a aVar7 = c.f86223i;
                        gx1.b bVarU9 = cVar.u6();
                        fx1.a aVar8 = fx1.a.ADVANCED;
                        aVar8.getClass();
                        ((y0) bVarU9.f80054h.getValue()).j(aVar8);
                        break;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.beginner_button);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) viewFindViewById2;
        gCMComplexOneLineButton3.getClass();
        gCMComplexOneLineButton3.c(this.f86226c, fValueOf);
        gCMComplexOneLineButton3.f(false);
        viewFindViewById2.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) viewFindViewById2;
        this.f86228e = gCMComplexOneLineButton4;
        final int i17 = 1;
        gCMComplexOneLineButton4.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f86222b;

            {
                this.f86222b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                c cVar = this.f86222b;
                switch (i18) {
                    case 0:
                        c.a aVar = c.f86223i;
                        gx1.b bVarU6 = cVar.u6();
                        fx1.a aVar2 = fx1.a.ALL;
                        aVar2.getClass();
                        ((y0) bVarU6.f80054h.getValue()).j(aVar2);
                        break;
                    case 1:
                        c.a aVar3 = c.f86223i;
                        gx1.b bVarU7 = cVar.u6();
                        fx1.a aVar4 = fx1.a.BEGINNER;
                        aVar4.getClass();
                        ((y0) bVarU7.f80054h.getValue()).j(aVar4);
                        break;
                    case 2:
                        c.a aVar5 = c.f86223i;
                        gx1.b bVarU8 = cVar.u6();
                        fx1.a aVar6 = fx1.a.INTERMEDIATE;
                        aVar6.getClass();
                        ((y0) bVarU8.f80054h.getValue()).j(aVar6);
                        break;
                    default:
                        c.a aVar7 = c.f86223i;
                        gx1.b bVarU9 = cVar.u6();
                        fx1.a aVar8 = fx1.a.ADVANCED;
                        aVar8.getClass();
                        ((y0) bVarU9.f80054h.getValue()).j(aVar8);
                        break;
                }
            }
        });
        View viewFindViewById3 = view2.findViewById(R.id.intermediate_button);
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) viewFindViewById3;
        gCMComplexOneLineButton5.getClass();
        gCMComplexOneLineButton5.c(this.f86226c, fValueOf);
        gCMComplexOneLineButton5.f(false);
        viewFindViewById3.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton6 = (GCMComplexOneLineButton) viewFindViewById3;
        this.f86229f = gCMComplexOneLineButton6;
        gCMComplexOneLineButton6.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f86222b;

            {
                this.f86222b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i14;
                c cVar = this.f86222b;
                switch (i18) {
                    case 0:
                        c.a aVar = c.f86223i;
                        gx1.b bVarU6 = cVar.u6();
                        fx1.a aVar2 = fx1.a.ALL;
                        aVar2.getClass();
                        ((y0) bVarU6.f80054h.getValue()).j(aVar2);
                        break;
                    case 1:
                        c.a aVar3 = c.f86223i;
                        gx1.b bVarU7 = cVar.u6();
                        fx1.a aVar4 = fx1.a.BEGINNER;
                        aVar4.getClass();
                        ((y0) bVarU7.f80054h.getValue()).j(aVar4);
                        break;
                    case 2:
                        c.a aVar5 = c.f86223i;
                        gx1.b bVarU8 = cVar.u6();
                        fx1.a aVar6 = fx1.a.INTERMEDIATE;
                        aVar6.getClass();
                        ((y0) bVarU8.f80054h.getValue()).j(aVar6);
                        break;
                    default:
                        c.a aVar7 = c.f86223i;
                        gx1.b bVarU9 = cVar.u6();
                        fx1.a aVar8 = fx1.a.ADVANCED;
                        aVar8.getClass();
                        ((y0) bVarU9.f80054h.getValue()).j(aVar8);
                        break;
                }
            }
        });
        View viewFindViewById4 = view2.findViewById(R.id.advanced_button);
        GCMComplexOneLineButton gCMComplexOneLineButton7 = (GCMComplexOneLineButton) viewFindViewById4;
        gCMComplexOneLineButton7.getClass();
        gCMComplexOneLineButton7.c(this.f86226c, fValueOf);
        gCMComplexOneLineButton7.f(false);
        viewFindViewById4.getClass();
        this.f86230g = (GCMComplexOneLineButton) viewFindViewById4;
        boolean z14 = u6().f80047a == fx1.c.SELF_GUIDED;
        GCMComplexOneLineButton gCMComplexOneLineButton8 = this.f86230g;
        if (z14) {
            if (gCMComplexOneLineButton8 == null) {
                p005kotlin.jvm.internal.s.m("advancedButton");
                throw null;
            }
            final int i18 = 3;
            gCMComplexOneLineButton8.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f86222b;

                {
                    this.f86222b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i19 = i18;
                    c cVar = this.f86222b;
                    switch (i19) {
                        case 0:
                            c.a aVar = c.f86223i;
                            gx1.b bVarU6 = cVar.u6();
                            fx1.a aVar2 = fx1.a.ALL;
                            aVar2.getClass();
                            ((y0) bVarU6.f80054h.getValue()).j(aVar2);
                            break;
                        case 1:
                            c.a aVar3 = c.f86223i;
                            gx1.b bVarU7 = cVar.u6();
                            fx1.a aVar4 = fx1.a.BEGINNER;
                            aVar4.getClass();
                            ((y0) bVarU7.f80054h.getValue()).j(aVar4);
                            break;
                        case 2:
                            c.a aVar5 = c.f86223i;
                            gx1.b bVarU8 = cVar.u6();
                            fx1.a aVar6 = fx1.a.INTERMEDIATE;
                            aVar6.getClass();
                            ((y0) bVarU8.f80054h.getValue()).j(aVar6);
                            break;
                        default:
                            c.a aVar7 = c.f86223i;
                            gx1.b bVarU9 = cVar.u6();
                            fx1.a aVar8 = fx1.a.ADVANCED;
                            aVar8.getClass();
                            ((y0) bVarU9.f80054h.getValue()).j(aVar8);
                            break;
                    }
                }
            });
        } else {
            if (gCMComplexOneLineButton8 == null) {
                p005kotlin.jvm.internal.s.m("advancedButton");
                throw null;
            }
            gCMComplexOneLineButton8.setVisibility(8);
        }
        u6().f80053g.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: hx1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f86220b;

            {
                this.f86220b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i16;
                c cVar = this.f86220b;
                switch (i19) {
                    case 0:
                        c.a aVar = c.f86223i;
                        gx1.b bVarU6 = cVar.u6();
                        fx1.a aVar2 = ((ex1.a) obj).f66927a;
                        aVar2.getClass();
                        ((y0) bVarU6.f80054h.getValue()).j(aVar2);
                        return Unit.INSTANCE;
                    default:
                        fx1.a aVar3 = (fx1.a) obj;
                        if (aVar3 != null) {
                            GCMComplexOneLineButton gCMComplexOneLineButton9 = cVar.f86227d;
                            if (gCMComplexOneLineButton9 == null) {
                                p005kotlin.jvm.internal.s.m("allButton");
                                throw null;
                            }
                            gCMComplexOneLineButton9.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton10 = cVar.f86228e;
                            if (gCMComplexOneLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("beginnerButton");
                                throw null;
                            }
                            gCMComplexOneLineButton10.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton11 = cVar.f86229f;
                            if (gCMComplexOneLineButton11 == null) {
                                p005kotlin.jvm.internal.s.m("intermediateButton");
                                throw null;
                            }
                            gCMComplexOneLineButton11.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton12 = cVar.f86230g;
                            if (gCMComplexOneLineButton12 == null) {
                                p005kotlin.jvm.internal.s.m("advancedButton");
                                throw null;
                            }
                            gCMComplexOneLineButton12.f(false);
                            int i24 = c.b.f86232a[aVar3.ordinal()];
                            if (i24 == 1) {
                                GCMComplexOneLineButton gCMComplexOneLineButton13 = cVar.f86227d;
                                if (gCMComplexOneLineButton13 == null) {
                                    p005kotlin.jvm.internal.s.m("allButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton13.f(true);
                            } else if (i24 == 2) {
                                GCMComplexOneLineButton gCMComplexOneLineButton14 = cVar.f86228e;
                                if (gCMComplexOneLineButton14 == null) {
                                    p005kotlin.jvm.internal.s.m("beginnerButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton14.f(true);
                            } else if (i24 == 3) {
                                GCMComplexOneLineButton gCMComplexOneLineButton15 = cVar.f86229f;
                                if (gCMComplexOneLineButton15 == null) {
                                    p005kotlin.jvm.internal.s.m("intermediateButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton15.f(true);
                            } else {
                                if (i24 != 4) {
                                    u0.r();
                                    return null;
                                }
                                GCMComplexOneLineButton gCMComplexOneLineButton16 = cVar.f86230g;
                                if (gCMComplexOneLineButton16 == null) {
                                    p005kotlin.jvm.internal.s.m("advancedButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton16.f(true);
                            }
                        } else {
                            c.a aVar4 = c.f86223i;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        u6().f80055i.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: hx1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f86220b;

            {
                this.f86220b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i17;
                c cVar = this.f86220b;
                switch (i19) {
                    case 0:
                        c.a aVar = c.f86223i;
                        gx1.b bVarU6 = cVar.u6();
                        fx1.a aVar2 = ((ex1.a) obj).f66927a;
                        aVar2.getClass();
                        ((y0) bVarU6.f80054h.getValue()).j(aVar2);
                        return Unit.INSTANCE;
                    default:
                        fx1.a aVar3 = (fx1.a) obj;
                        if (aVar3 != null) {
                            GCMComplexOneLineButton gCMComplexOneLineButton9 = cVar.f86227d;
                            if (gCMComplexOneLineButton9 == null) {
                                p005kotlin.jvm.internal.s.m("allButton");
                                throw null;
                            }
                            gCMComplexOneLineButton9.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton10 = cVar.f86228e;
                            if (gCMComplexOneLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("beginnerButton");
                                throw null;
                            }
                            gCMComplexOneLineButton10.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton11 = cVar.f86229f;
                            if (gCMComplexOneLineButton11 == null) {
                                p005kotlin.jvm.internal.s.m("intermediateButton");
                                throw null;
                            }
                            gCMComplexOneLineButton11.f(false);
                            GCMComplexOneLineButton gCMComplexOneLineButton12 = cVar.f86230g;
                            if (gCMComplexOneLineButton12 == null) {
                                p005kotlin.jvm.internal.s.m("advancedButton");
                                throw null;
                            }
                            gCMComplexOneLineButton12.f(false);
                            int i24 = c.b.f86232a[aVar3.ordinal()];
                            if (i24 == 1) {
                                GCMComplexOneLineButton gCMComplexOneLineButton13 = cVar.f86227d;
                                if (gCMComplexOneLineButton13 == null) {
                                    p005kotlin.jvm.internal.s.m("allButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton13.f(true);
                            } else if (i24 == 2) {
                                GCMComplexOneLineButton gCMComplexOneLineButton14 = cVar.f86228e;
                                if (gCMComplexOneLineButton14 == null) {
                                    p005kotlin.jvm.internal.s.m("beginnerButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton14.f(true);
                            } else if (i24 == 3) {
                                GCMComplexOneLineButton gCMComplexOneLineButton15 = cVar.f86229f;
                                if (gCMComplexOneLineButton15 == null) {
                                    p005kotlin.jvm.internal.s.m("intermediateButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton15.f(true);
                            } else {
                                if (i24 != 4) {
                                    u0.r();
                                    return null;
                                }
                                GCMComplexOneLineButton gCMComplexOneLineButton16 = cVar.f86230g;
                                if (gCMComplexOneLineButton16 == null) {
                                    p005kotlin.jvm.internal.s.m("advancedButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton16.f(true);
                            }
                        } else {
                            c.a aVar4 = c.f86223i;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final gx1.b u6() {
        return (gx1.b) this.f86224a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhx1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
