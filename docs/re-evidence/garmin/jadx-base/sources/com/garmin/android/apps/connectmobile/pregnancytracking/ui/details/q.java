package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.garmin.android.apps.connectmobile.view.DynamicHeightAdaptedTouchSwitchViewPager;
import com.google.android.material.tabs.TabLayout;
import fb1.d0;
import fb1.o0;
import fb1.p0;
import kotlin.w3;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/q;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "c", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends m0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f40794v = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NestedScrollView f40796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f40797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f40798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f40799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f40800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f40801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewPager f40802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ComposeView f40803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TabLayout f40804q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f40795h = o13.m.b(new d0(4));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f40805r = o13.m.a(o13.n.NONE, new g(this, null, new f(this), null, null));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w1 f40806t = new w1(s0.f105811a.b(p0.class), new h(this), new j(this), new i(null, this));

    public interface b {
        void M4(ww0.c cVar);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/q$c;", "Landroidx/fragment/app/e0;", "Landroidx/fragment/app/v;", "fragmentManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lww0/c;", "pregnancyDetails", "Lorg/joda/time/LocalDate;", "date", "<init>", "(Landroidx/fragment/app/v;Landroid/content/Context;Lww0/c;Lorg/joda/time/LocalDate;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends e0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Context f40807h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ww0.c f40808i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final LocalDate f40809j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f40810k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v vVar, Context context, ww0.c cVar, LocalDate localDate) {
            super(vVar);
            vVar.getClass();
            context.getClass();
            cVar.getClass();
            localDate.getClass();
            this.f40807h = context;
            this.f40808i = cVar;
            this.f40809j = localDate;
            this.f40810k = -1;
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF149591t() {
            return 2;
        }

        @Override // androidx.fragment.app.e0
        public final Fragment getItem(int i14) {
            LocalDate localDate = this.f40809j;
            if (i14 == 0) {
                o.a aVar = o.E;
                ww0.c cVar = this.f40808i;
                aVar.getClass();
                cVar.getClass();
                localDate.getClass();
                o oVar = new o();
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_PREGNANCY_DETAILS", cVar);
                bundle.putSerializable("EXTRA_DATE", localDate);
                oVar.setArguments(bundle);
                return oVar;
            }
            n.a aVar2 = n.f40726p;
            ww0.c cVar2 = this.f40808i;
            aVar2.getClass();
            cVar2.getClass();
            localDate.getClass();
            n nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("EXTRA_PREGNANCY_DETAILS", cVar2);
            bundle2.putSerializable("EXTRA_DATE", localDate);
            nVar.setArguments(bundle2);
            return nVar;
        }

        @Override // fe.a
        public final int getItemPosition(Object obj) {
            obj.getClass();
            if (obj instanceof b) {
                ((b) obj).M4(this.f40808i);
            }
            return super.getItemPosition(obj);
        }

        @Override // fe.a
        public final CharSequence getPageTitle(int i14) {
            Context context = this.f40807h;
            if (i14 == 0) {
                String string = context.getString(R.string.mct_logging);
                string.getClass();
                return string;
            }
            if (i14 != 1) {
                return "";
            }
            String string2 = context.getString(R.string.lbl_msn_workout_exercise_tips);
            string2.getClass();
            return string2;
        }

        @Override // androidx.fragment.app.e0, fe.a
        public final void setPrimaryItem(ViewGroup viewGroup, int i14, Object obj) {
            viewGroup.getClass();
            obj.getClass();
            super.setPrimaryItem(viewGroup, i14, obj);
            if (i14 != this.f40810k) {
                Fragment fragment = (Fragment) obj;
                DynamicHeightAdaptedTouchSwitchViewPager dynamicHeightAdaptedTouchSwitchViewPager = (DynamicHeightAdaptedTouchSwitchViewPager) viewGroup;
                if (fragment.getView() != null) {
                    this.f40810k = i14;
                    dynamicHeightAdaptedTouchSwitchViewPager.f47402h1 = fragment.getView();
                    dynamicHeightAdaptedTouchSwitchViewPager.requestLayout();
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f40811a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f40811a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40811a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40811a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/pregnancytracking/ui/details/q$e", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements androidx.core.view.s {
        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            menu.clear();
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            return false;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40812a;

        public f(Fragment fragment) {
            this.f40812a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f40812a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<hx0.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f40814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f40815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f40816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f40817e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f40813a = fragment;
            this.f40814b = qualifier;
            this.f40815c = aVar;
            this.f40816d = aVar2;
            this.f40817e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, hx0.s] */
        @Override // e23.a
        public final hx0.s invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f40815c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getViewModelStore();
            Fragment fragment = this.f40813a;
            e23.a aVar = this.f40816d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hx0.s.class), viewModelStore, null, defaultViewModelCreationExtras, this.f40814b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f40817e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40818a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f40818a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40818a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40820b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40819a = aVar;
            this.f40820b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40819a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40820b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40821a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f40821a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40821a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        androidx.fragment.app.m activity = getActivity();
        PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
        if (pregnancyDetailsActivity != null) {
            pregnancyDetailsActivity.ua();
        }
        p0 p0Var = (p0) this.f40806t.getValue();
        LocalDate localDateI6 = I6();
        p0Var.f70286a.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
        ge1.b.T(v1.a(p0Var), null, null, new o0(localDateI6, p0Var, null), 3);
    }

    public final LocalDate I6() {
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
            } else {
                Object serializable2 = arguments.getSerializable("EXTRA_DATE_KEY");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            LocalDate localDate = (LocalDate) serializable;
            if (localDate != null) {
                return localDate;
            }
        }
        vb.h.z("Can't display cycle data without day.");
        return null;
    }

    public final void J6(int i14, int i15) {
        ComposeView composeView = this.f40803p;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("pieChart");
            throw null;
        }
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        ComposeView composeView2 = this.f40803p;
        if (composeView2 == null) {
            p005kotlin.jvm.internal.s.m("pieChart");
            throw null;
        }
        composeView2.setContent(new z3.e(-1853610905, true, new a71.l(i14, i15, 2)));
        ComposeView composeView3 = this.f40803p;
        if (composeView3 == null) {
            p005kotlin.jvm.internal.s.m("pieChart");
            throw null;
        }
        composeView3.setOnClickListener(new do1.l(1));
        ComposeView composeView4 = this.f40803p;
        if (composeView4 == null) {
            p005kotlin.jvm.internal.s.m("pieChart");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c22.c.a(composeView4, contextRequireContext, R.dimen.gauge_chart_size_small, 1.4f, 2.0f);
    }

    public final void K6() {
        LinearLayout linearLayout = this.f40798k;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("mOver42WeekLinearLayout");
            throw null;
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.f40797j;
        if (linearLayout2 == null) {
            p005kotlin.jvm.internal.s.m("mUnder42WeekLinearLayout");
            throw null;
        }
        linearLayout2.setVisibility(0);
        LinearLayout linearLayout3 = this.f40799l;
        if (linearLayout3 == null) {
            p005kotlin.jvm.internal.s.m("incompleteSetUpLinearLayout");
            throw null;
        }
        linearLayout3.setVisibility(0);
        J6(-1, -1);
        TextView textView = this.f40801n;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mStartSetUp");
            throw null;
        }
        textView.setOnClickListener(new fb1.m0(this, 1));
        g22.e.k(this, new e(), b0.b.RESUMED);
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        ((com.garmin.android.apps.connectmobile.c) activity).initActionBar(true, R.string.pregnancy_title);
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 24 && i15 == -1) {
            androidx.fragment.app.m activity = getActivity();
            PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
            if (pregnancyDetailsActivity != null) {
                pregnancyDetailsActivity.ua();
            }
        }
        if (i14 == 25 && i15 == -1) {
            androidx.fragment.app.m activity2 = getActivity();
            PregnancyDetailsActivity pregnancyDetailsActivity2 = activity2 instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity2 : null;
            if (pregnancyDetailsActivity2 != null) {
                pregnancyDetailsActivity2.ua();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.fragment_pregnancy_details_one_day);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.pregnancy_one_day_scroll_view);
        viewFindViewById.getClass();
        this.f40796i = (NestedScrollView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.under_42_week_linear_layout);
        viewFindViewById2.getClass();
        this.f40797j = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.over_42_week_linear_layout);
        viewFindViewById3.getClass();
        this.f40798k = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.incomplete_set_up);
        viewFindViewById4.getClass();
        this.f40799l = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.pregnancy_details_view_pager);
        viewFindViewById5.getClass();
        this.f40802o = (ViewPager) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.pregnancy_details_pie_chart);
        viewFindViewById6.getClass();
        this.f40803p = (ComposeView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.pregnancy_details_tab_layout);
        viewFindViewById7.getClass();
        this.f40804q = (TabLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.pregnancy_setup);
        viewFindViewById8.getClass();
        this.f40801n = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.stop_tracking_button);
        viewFindViewById9.getClass();
        TextView textView = (TextView) viewFindViewById9;
        this.f40800m = textView;
        textView.setOnClickListener(new fb1.m0(this, 0));
        TextView textView2 = (TextView) view2.findViewById(R.id.maximum_week_number_text_view);
        textView2.setText("42");
        textView2.setContentDescription(getString(R.string.lbl_pregnancy_weeks, "42"));
        dh.b.L(((hx0.s) this.f40805r.getValue()).A4(I6()), this, new d(new f2.o0(this, 14)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/q$a;", "", "<init>", "()V", "", "EXTRA_DATE_KEY", "Ljava/lang/String;", "", "MAX_WEEKS_VALUE", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q a(LocalDate localDate) {
            q qVar = new q();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_DATE_KEY", localDate);
            qVar.setArguments(bundle);
            return qVar;
        }

        private a() {
        }
    }
}
