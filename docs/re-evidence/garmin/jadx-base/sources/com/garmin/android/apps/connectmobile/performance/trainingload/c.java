package com.garmin.android.apps.connectmobile.performance.trainingload;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.m;
import fw.p;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import v13.i;
import vb.h;
import w61.r0;
import w61.w;
import w61.x;
import x61.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/c;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/b$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment implements com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f40195p = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f40196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.b f40197b = new a4.b(this, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Fragment f40198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f40199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f40200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f40201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f40202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f40203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f40204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f40205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f40206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LoadFocusView f40207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LoadFocusView f40208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LoadFocusView f40209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FrameLayout f40210o;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40211a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40211a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.trainingload.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingload.LoadFocusFragment$onDeviceChanged$1", f = "LoadFocusFragment.kt", l = {233}, m = "invokeSuspend", v = 2)
    public static final class C0751c extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40212a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f40214c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0751c(String str, t13.d<? super C0751c> dVar) {
            super(2, dVar);
            this.f40214c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C0751c(this.f40214c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0751c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f40212a;
            if (i14 == 0) {
                r.b(obj);
                x xVar = c.this.f40196a;
                if (xVar != null) {
                    this.f40212a = 1;
                    if (xVar.A4(this.f40214c, true, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40215a;

        public d(l lVar) {
            lVar.getClass();
            this.f40215a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40215a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40215a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b
    public final void m5(String str) {
        ge1.b.T(f0.w(this), null, null, new C0751c(str, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm4_load_focus_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var;
        Set<com.garmin.android.apps.connectmobile.performance.model.a> setD;
        y0 y0Var2;
        m mVar;
        super.onResume();
        if (this.f40198c == null) {
            Fragment fragmentG = getChildFragmentManager().G("DeviceFragmentTag");
            this.f40198c = fragmentG;
            if (fragmentG == null || !(fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                return;
            }
            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
            if (bVar.isAdded()) {
                x xVar = this.f40196a;
                bVar.u6((xVar == null || (y0Var2 = xVar.f183271g) == null || (mVar = (m) y0Var2.d()) == null) ? null : (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c);
                x xVar2 = this.f40196a;
                if (xVar2 == null || (y0Var = xVar2.f183272h) == null || (setD = y0Var.d()) == null) {
                    return;
                }
                bVar.v6(h0.b1(setD));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var;
        y0<m<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.pause_date_string);
        viewFindViewById.getClass();
        this.f40199d = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.focus_date_range);
        viewFindViewById2.getClass();
        this.f40200e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.focus_feedback_phrase);
        viewFindViewById3.getClass();
        this.f40201f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.focus_feedback_message);
        viewFindViewById4.getClass();
        this.f40202g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.no_data_available_view);
        viewFindViewById5.getClass();
        this.f40203h = viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.load_focus_layout_container);
        viewFindViewById6.getClass();
        this.f40204i = viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.show_selector_view_container);
        viewFindViewById7.getClass();
        this.f40205j = viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.load_focus_pause_layout);
        viewFindViewById8.getClass();
        this.f40206k = viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.load_focus_anaerobic_bar_view);
        viewFindViewById9.getClass();
        this.f40207l = (LoadFocusView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.load_focus_aerobic_h_bar_view);
        viewFindViewById10.getClass();
        this.f40208m = (LoadFocusView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.load_focus_aerobic_l_bar_view);
        viewFindViewById11.getClass();
        this.f40209n = (LoadFocusView) viewFindViewById11;
        v childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a aVarB = j.b(childFragmentManager, childFragmentManager);
        com.garmin.android.apps.connectmobile.performance.stats.improvement.b.f40115g.getClass();
        final int i14 = 1;
        aVarB.j(R.id.tabbed_pager_optional_view, new com.garmin.android.apps.connectmobile.performance.stats.improvement.b(), "DeviceFragmentTag", 1);
        Unit unit = Unit.INSTANCE;
        aVarB.e();
        View viewFindViewById12 = view2.findViewById(R.id.tabbed_pager_optional_view);
        viewFindViewById12.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById12;
        this.f40210o = frameLayout;
        frameLayout.setVisibility(8);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (c22.b.a(contextRequireContext) >= 1.5f) {
            LoadFocusView loadFocusView = this.f40207l;
            if (loadFocusView == null) {
                s.m("loadFocusAnaerobicBarView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = loadFocusView.getLayoutParams();
            Resources resources = getResources();
            resources.getClass();
            layoutParams.height = (int) xy2.b.n(resources, 75.0f);
            LoadFocusView loadFocusView2 = this.f40208m;
            if (loadFocusView2 == null) {
                s.m("loadFocusAerobicHBarView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = loadFocusView2.getLayoutParams();
            Resources resources2 = getResources();
            resources2.getClass();
            layoutParams2.height = (int) xy2.b.n(resources2, 75.0f);
            LoadFocusView loadFocusView3 = this.f40209n;
            if (loadFocusView3 == null) {
                s.m("loadFocusAerobicLBarView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams3 = loadFocusView3.getLayoutParams();
            Resources resources3 = getResources();
            resources3.getClass();
            layoutParams3.height = (int) xy2.b.n(resources3, 75.0f);
        }
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            l22.a aVar = new l22.a(activity);
            Resources resources4 = activity.getResources();
            resources4.getClass();
            r0 r0Var = new r0(new k(aVar, resources4), null, null, false, 14, null);
            androidx.fragment.app.m activity2 = getActivity();
            this.f40196a = (x) (activity2 != null ? new x1(activity2, r0Var).b(s0.f105811a.b(x.class)) : null);
        }
        x xVar = this.f40196a;
        if (xVar != null && (y0Var2 = xVar.f183282q) != null) {
            final int i15 = 0;
            y0Var2.f(getViewLifecycleOwner(), new d(new l(this) { // from class: a71.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.trainingload.c f1728b;

                {
                    this.f1728b = this;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x003a  */
                /* JADX WARN: Code duplicated, block: B:19:0x003e  */
                /* JADX WARN: Code duplicated, block: B:22:0x0046  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    FrameLayout frameLayout2;
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.performance.trainingload.c cVar = this.f1728b;
                    switch (i16) {
                        case 0:
                            fw.m mVar = (fw.m) obj;
                            com.garmin.android.apps.connectmobile.performance.trainingload.c.a aVar2 = com.garmin.android.apps.connectmobile.performance.trainingload.c.f40195p;
                            Fragment fragmentG = cVar.getChildFragmentManager().G("DeviceFragmentTag");
                            if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                                if (bVar.isAdded()) {
                                    bVar.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                                }
                            }
                            return Unit.INSTANCE;
                        default:
                            Set set = (Set) obj;
                            if (set != null) {
                                com.garmin.android.apps.connectmobile.performance.trainingload.c.a aVar3 = com.garmin.android.apps.connectmobile.performance.trainingload.c.f40195p;
                                if (!(!set.isEmpty()) || set.size() < 2) {
                                    frameLayout2 = cVar.f40210o;
                                    if (frameLayout2 != null) {
                                        s.m("deviceSelectorContainer");
                                        throw null;
                                    }
                                    frameLayout2.setVisibility(8);
                                } else {
                                    Fragment fragment = cVar.f40198c;
                                    if (fragment != null && (fragment instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                        com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragment;
                                        if (bVar2.isAdded()) {
                                            bVar2.v6(h0.b1(set));
                                        }
                                    }
                                }
                            } else {
                                frameLayout2 = cVar.f40210o;
                                if (frameLayout2 != null) {
                                    s.m("deviceSelectorContainer");
                                    throw null;
                                }
                                frameLayout2.setVisibility(8);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        x xVar2 = this.f40196a;
        if (xVar2 != null) {
            w61.i.a(xVar2.f183282q, xVar2.f183280o, null, new w(xVar2, i14)).f(getViewLifecycleOwner(), this.f40197b);
        }
        x xVar3 = this.f40196a;
        if (xVar3 == null || (y0Var = xVar3.f183272h) == null) {
            return;
        }
        y0Var.f(getViewLifecycleOwner(), new d(new l(this) { // from class: a71.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.trainingload.c f1728b;

            {
                this.f1728b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x003a  */
            /* JADX WARN: Code duplicated, block: B:19:0x003e  */
            /* JADX WARN: Code duplicated, block: B:22:0x0046  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                FrameLayout frameLayout2;
                int i16 = i14;
                com.garmin.android.apps.connectmobile.performance.trainingload.c cVar = this.f1728b;
                switch (i16) {
                    case 0:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.trainingload.c.a aVar2 = com.garmin.android.apps.connectmobile.performance.trainingload.c.f40195p;
                        Fragment fragmentG = cVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                            if (bVar.isAdded()) {
                                bVar.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Set set = (Set) obj;
                        if (set != null) {
                            com.garmin.android.apps.connectmobile.performance.trainingload.c.a aVar3 = com.garmin.android.apps.connectmobile.performance.trainingload.c.f40195p;
                            if (!(!set.isEmpty()) || set.size() < 2) {
                                frameLayout2 = cVar.f40210o;
                                if (frameLayout2 != null) {
                                    s.m("deviceSelectorContainer");
                                    throw null;
                                }
                                frameLayout2.setVisibility(8);
                            } else {
                                Fragment fragment = cVar.f40198c;
                                if (fragment != null && (fragment instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                    com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragment;
                                    if (bVar2.isAdded()) {
                                        bVar2.v6(h0.b1(set));
                                    }
                                }
                            }
                        } else {
                            frameLayout2 = cVar.f40210o;
                            if (frameLayout2 != null) {
                                s.m("deviceSelectorContainer");
                                throw null;
                            }
                            frameLayout2.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/c$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
