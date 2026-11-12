package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.google.gson.Gson;
import java.util.List;
import java.util.WeakHashMap;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import ty1.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/z;", "Lty1/h0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends h0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f46367y = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f46370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f46371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexButton f46372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexButton f46373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexButton f46374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexButton f46375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMComplexButton f46376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMComplexButton f46377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GCMComplexButton f46378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GCMComplexButton f46379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GCMComplexButton f46380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GCMComplexButton f46381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GCMComplexButton f46382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GCMComplexButton f46383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GCMComplexButton f46384r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexButton f46385t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f46386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Toolbar f46387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public gg0.f f46388x;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46390b;

        static {
            int[] iArr = new int[gg0.f.values().length];
            try {
                iArr[gg0.f.f77130f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.f.f77131g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg0.f.f77132h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gg0.f.f77133i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gg0.f.f77134j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gg0.f.f77135k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[gg0.f.f77136l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[gg0.f.f77137m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[gg0.f.f77138n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[gg0.f.f77139o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[gg0.f.f77140p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[gg0.f.f77141q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[gg0.f.f77142r.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[gg0.f.f77143t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f46389a = iArr;
            int[] iArr2 = new int[fw.p.values().length];
            try {
                iArr2[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            f46390b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/z$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            z.this.F6();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f46392a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f46392a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46392a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46392a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46393a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46393a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46393a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46395b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46394a = aVar;
            this.f46395b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46394a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46395b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46396a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46396a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46396a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public z() {
        super(R.layout.ti_add_event_type_fragment);
        this.f46369c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new e(this), new g(this), new f(null, this));
        this.f46370d = new c();
    }

    public final AddTIEventViewModel A6() {
        return (AddTIEventViewModel) this.f46369c.getValue();
    }

    public final void C6(gg0.f fVar) {
        if (fVar != this.f46388x) {
            ((y0) A6().H1.getValue()).m(Boolean.TRUE);
        }
        AddTIEventViewModel addTIEventViewModelA6 = A6();
        fVar.getClass();
        addTIEventViewModelA6.F6(fVar);
    }

    public final void E6() {
        A6().G6(ny1.e.DISTANCE);
        C6(gg0.f.f77136l);
        A6().N5().f(getViewLifecycleOwner(), new d(new ty1.w1(this, 1)));
    }

    public final void F6() {
        this.f46370d.f(false);
        requireActivity().onBackPressed();
    }

    public final void G6(GCMComplexButton gCMComplexButton) {
        GCMComplexButton gCMComplexButton2 = this.f46372f;
        if (gCMComplexButton2 == null) {
            p005kotlin.jvm.internal.s.m("runningButton");
            throw null;
        }
        gCMComplexButton2.a(p005kotlin.jvm.internal.s.g(gCMComplexButton2, gCMComplexButton));
        GCMComplexButton gCMComplexButton3 = this.f46373g;
        if (gCMComplexButton3 == null) {
            p005kotlin.jvm.internal.s.m("trailRunningButton");
            throw null;
        }
        gCMComplexButton3.a(p005kotlin.jvm.internal.s.g(gCMComplexButton3, gCMComplexButton));
        GCMComplexButton gCMComplexButton4 = this.f46374h;
        if (gCMComplexButton4 == null) {
            p005kotlin.jvm.internal.s.m("cyclingButton");
            throw null;
        }
        gCMComplexButton4.a(p005kotlin.jvm.internal.s.g(gCMComplexButton4, gCMComplexButton));
        GCMComplexButton gCMComplexButton5 = this.f46375i;
        if (gCMComplexButton5 == null) {
            p005kotlin.jvm.internal.s.m("gravelCyclingButton");
            throw null;
        }
        gCMComplexButton5.a(p005kotlin.jvm.internal.s.g(gCMComplexButton5, gCMComplexButton));
        GCMComplexButton gCMComplexButton6 = this.f46376j;
        if (gCMComplexButton6 == null) {
            p005kotlin.jvm.internal.s.m("mountainBikingButton");
            throw null;
        }
        gCMComplexButton6.a(p005kotlin.jvm.internal.s.g(gCMComplexButton6, gCMComplexButton));
        GCMComplexButton gCMComplexButton7 = this.f46377k;
        if (gCMComplexButton7 == null) {
            p005kotlin.jvm.internal.s.m("swimmingButton");
            throw null;
        }
        gCMComplexButton7.a(p005kotlin.jvm.internal.s.g(gCMComplexButton7, gCMComplexButton));
        GCMComplexButton gCMComplexButton8 = this.f46378l;
        if (gCMComplexButton8 == null) {
            p005kotlin.jvm.internal.s.m("triathlonButton");
            throw null;
        }
        gCMComplexButton8.a(p005kotlin.jvm.internal.s.g(gCMComplexButton8, gCMComplexButton));
        GCMComplexButton gCMComplexButton9 = this.f46379m;
        if (gCMComplexButton9 == null) {
            p005kotlin.jvm.internal.s.m("multiSportButton");
            throw null;
        }
        gCMComplexButton9.a(p005kotlin.jvm.internal.s.g(gCMComplexButton9, gCMComplexButton));
        GCMComplexButton gCMComplexButton10 = this.f46380n;
        if (gCMComplexButton10 == null) {
            p005kotlin.jvm.internal.s.m("hikingButton");
            throw null;
        }
        gCMComplexButton10.a(p005kotlin.jvm.internal.s.g(gCMComplexButton10, gCMComplexButton));
        GCMComplexButton gCMComplexButton11 = this.f46381o;
        if (gCMComplexButton11 == null) {
            p005kotlin.jvm.internal.s.m("walkingButton");
            throw null;
        }
        gCMComplexButton11.a(p005kotlin.jvm.internal.s.g(gCMComplexButton11, gCMComplexButton));
        GCMComplexButton gCMComplexButton12 = this.f46382p;
        if (gCMComplexButton12 == null) {
            p005kotlin.jvm.internal.s.m("fitnessEquipmentButton");
            throw null;
        }
        gCMComplexButton12.a(p005kotlin.jvm.internal.s.g(gCMComplexButton12, gCMComplexButton));
        GCMComplexButton gCMComplexButton13 = this.f46383q;
        if (gCMComplexButton13 == null) {
            p005kotlin.jvm.internal.s.m("motorcyclingButton");
            throw null;
        }
        gCMComplexButton13.a(p005kotlin.jvm.internal.s.g(gCMComplexButton13, gCMComplexButton));
        GCMComplexButton gCMComplexButton14 = this.f46384r;
        if (gCMComplexButton14 == null) {
            p005kotlin.jvm.internal.s.m("winterSportsButton");
            throw null;
        }
        gCMComplexButton14.a(p005kotlin.jvm.internal.s.g(gCMComplexButton14, gCMComplexButton));
        GCMComplexButton gCMComplexButton15 = this.f46385t;
        if (gCMComplexButton15 != null) {
            gCMComplexButton15.a(p005kotlin.jvm.internal.s.g(gCMComplexButton15, gCMComplexButton));
        } else {
            p005kotlin.jvm.internal.s.m("otherButton");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46368b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIReviewEntriesEventTypeFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0214  */
    /* JADX WARN: Code duplicated, block: B:26:0x021c  */
    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        boolean z14;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46368b;
        final int i14 = 2;
        if (aVar != null) {
            String string = getString(R.string.activity_details_event_type);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46370d, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.toolbar_actionbar_default);
        final int i15 = 13;
        tn.k kVar = new tn.k(i15);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, kVar);
        View viewFindViewById2 = view2.findViewById(R.id.title_view);
        viewFindViewById2.getClass();
        this.f46371e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.toolbar_actionbar_default);
        viewFindViewById3.getClass();
        this.f46387w = (Toolbar) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.toolbar_Layout);
        viewFindViewById4.getClass();
        this.f46386v = (LinearLayout) viewFindViewById4;
        TextView textView = this.f46371e;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("titleView");
            throw null;
        }
        textView.setText(getString(R.string.select_event_activity_type, A6().x5().d()));
        View viewFindViewById5 = view2.findViewById(R.id.running_button);
        final int i16 = 0;
        ((GCMComplexButton) viewFindViewById5).a(false);
        viewFindViewById5.getClass();
        this.f46372f = (GCMComplexButton) viewFindViewById5;
        if (A6().f46439u2) {
            LinearLayout linearLayout = this.f46386v;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("mToolBarLayout");
                throw null;
            }
            linearLayout.setVisibility(0);
        }
        GCMComplexButton gCMComplexButton = this.f46372f;
        if (gCMComplexButton == null) {
            p005kotlin.jvm.internal.s.m("runningButton");
            throw null;
        }
        View viewFindViewById6 = gCMComplexButton.findViewById(R.id.inner_layout);
        viewFindViewById6.getClass();
        int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById6.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        View viewFindViewById7 = view2.findViewById(R.id.trail_running_button);
        ((GCMComplexButton) viewFindViewById7).a(false);
        viewFindViewById7.getClass();
        GCMComplexButton gCMComplexButton2 = (GCMComplexButton) viewFindViewById7;
        this.f46373g = gCMComplexButton2;
        View viewFindViewById8 = gCMComplexButton2.findViewById(R.id.inner_layout);
        viewFindViewById8.getClass();
        int dimensionPixelSize2 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById8.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        View viewFindViewById9 = view2.findViewById(R.id.cycling_button);
        ((GCMComplexButton) viewFindViewById9).a(false);
        viewFindViewById9.getClass();
        GCMComplexButton gCMComplexButton3 = (GCMComplexButton) viewFindViewById9;
        this.f46374h = gCMComplexButton3;
        View viewFindViewById10 = gCMComplexButton3.findViewById(R.id.inner_layout);
        viewFindViewById10.getClass();
        int dimensionPixelSize3 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById10.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        View viewFindViewById11 = view2.findViewById(R.id.gravel_cycling_button);
        ((GCMComplexButton) viewFindViewById11).a(false);
        viewFindViewById11.getClass();
        GCMComplexButton gCMComplexButton4 = (GCMComplexButton) viewFindViewById11;
        this.f46375i = gCMComplexButton4;
        View viewFindViewById12 = gCMComplexButton4.findViewById(R.id.inner_layout);
        viewFindViewById12.getClass();
        int dimensionPixelSize4 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById12.setPadding(dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4);
        View viewFindViewById13 = view2.findViewById(R.id.mountain_biking_button);
        ((GCMComplexButton) viewFindViewById13).a(false);
        viewFindViewById13.getClass();
        GCMComplexButton gCMComplexButton5 = (GCMComplexButton) viewFindViewById13;
        this.f46376j = gCMComplexButton5;
        View viewFindViewById14 = gCMComplexButton5.findViewById(R.id.inner_layout);
        viewFindViewById14.getClass();
        int dimensionPixelSize5 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById14.setPadding(dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5);
        View viewFindViewById15 = view2.findViewById(R.id.swimming_button);
        ((GCMComplexButton) viewFindViewById15).a(false);
        viewFindViewById15.getClass();
        GCMComplexButton gCMComplexButton6 = (GCMComplexButton) viewFindViewById15;
        this.f46377k = gCMComplexButton6;
        View viewFindViewById16 = gCMComplexButton6.findViewById(R.id.inner_layout);
        viewFindViewById16.getClass();
        int dimensionPixelSize6 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById16.setPadding(dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6);
        View viewFindViewById17 = view2.findViewById(R.id.triathlon_button);
        ((GCMComplexButton) viewFindViewById17).a(false);
        viewFindViewById17.getClass();
        GCMComplexButton gCMComplexButton7 = (GCMComplexButton) viewFindViewById17;
        this.f46378l = gCMComplexButton7;
        View viewFindViewById18 = gCMComplexButton7.findViewById(R.id.inner_layout);
        viewFindViewById18.getClass();
        int dimensionPixelSize7 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById18.setPadding(dimensionPixelSize7, dimensionPixelSize7, dimensionPixelSize7, dimensionPixelSize7);
        A6();
        final int i17 = 6;
        List list = (List) new Gson().fromJson(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("triathlon_events_enabled"), new mz1.u().getType());
        final int i18 = 1;
        if (list == null) {
            z14 = false;
        } else {
            if (!list.contains("AnyUser")) {
                if (list.contains("MBTester")) {
                    s3.f23252a.getClass();
                    if (!s3.a("ROLE_MBTESTER")) {
                        if (list.contains("DITester")) {
                            s3.f23252a.getClass();
                            if (s3.a("ROLE_DI_TESTER")) {
                            }
                        }
                        z14 = false;
                    }
                } else {
                    if (list.contains("DITester")) {
                        s3.f23252a.getClass();
                        if (s3.a("ROLE_DI_TESTER")) {
                        }
                    }
                    z14 = false;
                }
            }
            z14 = true;
        }
        v22.e.r(viewFindViewById18, z14);
        View viewFindViewById19 = view2.findViewById(R.id.multi_sport_button);
        ((GCMComplexButton) viewFindViewById19).a(false);
        viewFindViewById19.getClass();
        GCMComplexButton gCMComplexButton8 = (GCMComplexButton) viewFindViewById19;
        this.f46379m = gCMComplexButton8;
        View viewFindViewById20 = gCMComplexButton8.findViewById(R.id.inner_layout);
        viewFindViewById20.getClass();
        int dimensionPixelSize8 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById20.setPadding(dimensionPixelSize8, dimensionPixelSize8, dimensionPixelSize8, dimensionPixelSize8);
        View viewFindViewById21 = view2.findViewById(R.id.hiking_button);
        ((GCMComplexButton) viewFindViewById21).a(false);
        viewFindViewById21.getClass();
        GCMComplexButton gCMComplexButton9 = (GCMComplexButton) viewFindViewById21;
        this.f46380n = gCMComplexButton9;
        View viewFindViewById22 = gCMComplexButton9.findViewById(R.id.inner_layout);
        viewFindViewById22.getClass();
        int dimensionPixelSize9 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById22.setPadding(dimensionPixelSize9, dimensionPixelSize9, dimensionPixelSize9, dimensionPixelSize9);
        View viewFindViewById23 = view2.findViewById(R.id.walking_button);
        ((GCMComplexButton) viewFindViewById23).a(false);
        viewFindViewById23.getClass();
        GCMComplexButton gCMComplexButton10 = (GCMComplexButton) viewFindViewById23;
        this.f46381o = gCMComplexButton10;
        View viewFindViewById24 = gCMComplexButton10.findViewById(R.id.inner_layout);
        viewFindViewById24.getClass();
        int dimensionPixelSize10 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById24.setPadding(dimensionPixelSize10, dimensionPixelSize10, dimensionPixelSize10, dimensionPixelSize10);
        View viewFindViewById25 = view2.findViewById(R.id.fitness_equipment_button);
        ((GCMComplexButton) viewFindViewById25).a(false);
        viewFindViewById25.getClass();
        GCMComplexButton gCMComplexButton11 = (GCMComplexButton) viewFindViewById25;
        this.f46382p = gCMComplexButton11;
        View viewFindViewById26 = gCMComplexButton11.findViewById(R.id.inner_layout);
        viewFindViewById26.getClass();
        int dimensionPixelSize11 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById26.setPadding(dimensionPixelSize11, dimensionPixelSize11, dimensionPixelSize11, dimensionPixelSize11);
        View viewFindViewById27 = view2.findViewById(R.id.motorcycling_button);
        ((GCMComplexButton) viewFindViewById27).a(false);
        viewFindViewById27.getClass();
        GCMComplexButton gCMComplexButton12 = (GCMComplexButton) viewFindViewById27;
        this.f46383q = gCMComplexButton12;
        View viewFindViewById28 = gCMComplexButton12.findViewById(R.id.inner_layout);
        viewFindViewById28.getClass();
        int dimensionPixelSize12 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById28.setPadding(dimensionPixelSize12, dimensionPixelSize12, dimensionPixelSize12, dimensionPixelSize12);
        View viewFindViewById29 = view2.findViewById(R.id.winter_sports_button);
        ((GCMComplexButton) viewFindViewById29).a(false);
        viewFindViewById29.getClass();
        GCMComplexButton gCMComplexButton13 = (GCMComplexButton) viewFindViewById29;
        this.f46384r = gCMComplexButton13;
        View viewFindViewById30 = gCMComplexButton13.findViewById(R.id.inner_layout);
        viewFindViewById30.getClass();
        int dimensionPixelSize13 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById30.setPadding(dimensionPixelSize13, dimensionPixelSize13, dimensionPixelSize13, dimensionPixelSize13);
        View viewFindViewById31 = view2.findViewById(R.id.other_button);
        ((GCMComplexButton) viewFindViewById31).a(false);
        viewFindViewById31.getClass();
        GCMComplexButton gCMComplexButton14 = (GCMComplexButton) viewFindViewById31;
        this.f46385t = gCMComplexButton14;
        View viewFindViewById32 = gCMComplexButton14.findViewById(R.id.inner_layout);
        viewFindViewById32.getClass();
        int dimensionPixelSize14 = requireContext().getResources().getDimensionPixelSize(R.dimen.spacing_small);
        viewFindViewById32.setPadding(dimensionPixelSize14, dimensionPixelSize14, dimensionPixelSize14, dimensionPixelSize14);
        Toolbar toolbar = this.f46387w;
        if (toolbar == null) {
            p005kotlin.jvm.internal.s.m("mToolBar");
            throw null;
        }
        final int i19 = 10;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i24 = i19;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i24) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton15 = this.f46372f;
        if (gCMComplexButton15 == null) {
            p005kotlin.jvm.internal.s.m("runningButton");
            throw null;
        }
        gCMComplexButton15.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i24 = i18;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i24) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton16 = this.f46373g;
        if (gCMComplexButton16 == null) {
            p005kotlin.jvm.internal.s.m("trailRunningButton");
            throw null;
        }
        gCMComplexButton16.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i24 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i24) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton17 = this.f46374h;
        if (gCMComplexButton17 == null) {
            p005kotlin.jvm.internal.s.m("cyclingButton");
            throw null;
        }
        final int i24 = 3;
        gCMComplexButton17.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i25 = i24;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i25) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton18 = this.f46375i;
        if (gCMComplexButton18 == null) {
            p005kotlin.jvm.internal.s.m("gravelCyclingButton");
            throw null;
        }
        final int i25 = 4;
        gCMComplexButton18.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i26 = i25;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i26) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton19 = this.f46376j;
        if (gCMComplexButton19 == null) {
            p005kotlin.jvm.internal.s.m("mountainBikingButton");
            throw null;
        }
        final int i26 = 5;
        gCMComplexButton19.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i27 = i26;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i27) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton20 = this.f46377k;
        if (gCMComplexButton20 == null) {
            p005kotlin.jvm.internal.s.m("swimmingButton");
            throw null;
        }
        gCMComplexButton20.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i27 = i17;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i27) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton21 = this.f46378l;
        if (gCMComplexButton21 == null) {
            p005kotlin.jvm.internal.s.m("triathlonButton");
            throw null;
        }
        final int i27 = 7;
        gCMComplexButton21.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i28 = i27;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i28) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton22 = this.f46379m;
        if (gCMComplexButton22 == null) {
            p005kotlin.jvm.internal.s.m("multiSportButton");
            throw null;
        }
        final int i28 = 8;
        gCMComplexButton22.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i29 = i28;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i29) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton23 = this.f46380n;
        if (gCMComplexButton23 == null) {
            p005kotlin.jvm.internal.s.m("hikingButton");
            throw null;
        }
        final int i29 = 9;
        gCMComplexButton23.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i210 = i29;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i210) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton24 = this.f46381o;
        if (gCMComplexButton24 == null) {
            p005kotlin.jvm.internal.s.m("walkingButton");
            throw null;
        }
        final int i30 = 11;
        gCMComplexButton24.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i210 = i30;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i210) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton25 = this.f46382p;
        if (gCMComplexButton25 == null) {
            p005kotlin.jvm.internal.s.m("fitnessEquipmentButton");
            throw null;
        }
        final int i34 = 12;
        gCMComplexButton25.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i210 = i34;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i210) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton26 = this.f46383q;
        if (gCMComplexButton26 == null) {
            p005kotlin.jvm.internal.s.m("motorcyclingButton");
            throw null;
        }
        gCMComplexButton26.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i210 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i210) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton27 = this.f46384r;
        if (gCMComplexButton27 == null) {
            p005kotlin.jvm.internal.s.m("winterSportsButton");
            throw null;
        }
        final int i35 = 14;
        gCMComplexButton27.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i210 = i35;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i210) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton28 = this.f46385t;
        if (gCMComplexButton28 == null) {
            p005kotlin.jvm.internal.s.m("otherButton");
            throw null;
        }
        gCMComplexButton28.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167254b;

            {
                this.f167254b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i210 = i16;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167254b;
                switch (i210) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77144v);
                        zVar.F6();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77130f);
                        zVar.F6();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77131g);
                        zVar.F6();
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77132h);
                        zVar.F6();
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77133i);
                        zVar.F6();
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77134j);
                        zVar.F6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77135k);
                        zVar.F6();
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        if (zVar.A6().D5().d() != gg0.f.f77137m) {
                            zVar.E6();
                            zVar.F6();
                        } else {
                            androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar10.setTitle(R.string.lbl_change_activity_type_title);
                            aVar10.setMessage(R.string.change_activity_type_multisport_alert_msg);
                            aVar10.setCancelable(false);
                            aVar10.setPositiveButton(R.string.lbl_common_continue, new x1(zVar, 0));
                            aVar10.setNegativeButton(R.string.lbl_cancel, new o(6));
                            aVar10.show();
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77137m);
                        zVar.F6();
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77138n);
                        zVar.F6();
                        break;
                    case 10:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        androidx.fragment.app.m activity = zVar.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    case 11:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77139o);
                        zVar.F6();
                        break;
                    case 12:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77140p);
                        zVar.F6();
                        break;
                    case 13:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77142r);
                        zVar.F6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                        zVar.C6(gg0.f.f77143t);
                        zVar.F6();
                        break;
                }
            }
        });
        this.f46388x = A6().E5().d();
        A6().f46438u1.f(getViewLifecycleOwner(), new w61.g(new ty1.w1(this, i16)));
        A6().D5().f(getViewLifecycleOwner(), new d(new ty1.w1(this, i24)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
