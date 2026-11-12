package xm0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.x0;
import androidx.core.view.z0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.viewpager2.widget.ViewPager2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxm0/c;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f191331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f191332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ComposeView f191333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f191334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TabLayoutMediator f191335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewPager2 f191336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f191337g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191338a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f191338a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f191338a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f191339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f191340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a aVar, Fragment fragment) {
            super(0);
            this.f191339a = aVar;
            this.f191340b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f191339a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f191340b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: xm0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C3561c extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191341a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3561c(Fragment fragment) {
            super(0);
            this.f191341a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f191341a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191342a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f191342a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f191342a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f191343a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar) {
            super(0);
            this.f191343a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f191343a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f191344a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o13.l lVar) {
            super(0);
            this.f191344a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f191344a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f191345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f191346b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, o13.l lVar) {
            super(0);
            this.f191345a = aVar;
            this.f191346b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f191345a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f191346b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f191348b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment, o13.l lVar) {
            super(0);
            this.f191347a = fragment;
            this.f191348b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f191348b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f191347a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public c() {
        super(R.layout.fragment_group_detail_leaderboard);
        t0 t0Var = s0.f105811a;
        this.f191331a = new w1(t0Var.b(mm0.e.class), new a(this), new C3561c(this), new b(null, this));
        o13.l lVarA = o13.m.a(o13.n.NONE, new e(new d(this)));
        this.f191332b = new w1(t0Var.b(z.class), new f(lVarA), new h(this, lVarA), new g(null, lVarA));
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        Object tag = tab != null ? tab.getTag() : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            int iIntValue = num.intValue();
            j jVar = this.f191337g;
            if (jVar == null) {
                p005kotlin.jvm.internal.s.m("leaderboardListAdapter");
                throw null;
            }
            String str = (String) p13.u.L(iIntValue, jVar.f191416m);
            TextView textView = this.f191334d;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("dateTitleTextView");
                throw null;
            }
            textView.setText(str);
            TextView textView2 = this.f191334d;
            if (textView2 != null) {
                v22.e.r(textView2, g22.n.d(str));
            } else {
                p005kotlin.jvm.internal.s.m("dateTitleTextView");
                throw null;
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        View view3;
        TabLayout.TabView tabView;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.relationship_filter_menu);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f191333c = composeView;
        composeView.setContent(new z3.e(222717679, true, new xm0.a(this, 0)));
        ComposeView composeView2 = this.f191333c;
        if (composeView2 == null) {
            p005kotlin.jvm.internal.s.m("relationshipFilterMenu");
            throw null;
        }
        composeView2.setVisibility(0);
        View viewFindViewById2 = view2.findViewById(R.id.date_title_text_view);
        viewFindViewById2.getClass();
        this.f191334d = (TextView) viewFindViewById2;
        TabLayout tabLayout = (TabLayout) view2.findViewById(R.id.leaderboard_date_range_tab_layout);
        tabLayout.getClass();
        if (tabLayout.isLaidOut() && !tabLayout.isLayoutRequested()) {
            int tabCount = tabLayout.getTabCount();
            if (tabCount >= 0) {
                int i14 = 0;
                while (true) {
                    Typeface typefaceA = h22.a.a("font/roboto_medium.ttf", tabLayout.getContext());
                    TabLayout.Tab tabAt = tabLayout.getTabAt(i14);
                    if (tabAt != null && (tabView = tabAt.f53250view) != null) {
                        Iterator<View> it = new x0(tabView).iterator();
                        while (true) {
                            z0 z0Var = (z0) it;
                            if (!z0Var.hasNext()) {
                                break;
                            }
                            View view4 = (View) z0Var.next();
                            if (view4 instanceof TextView) {
                                ((TextView) view4).setTypeface(typefaceA);
                            }
                        }
                    }
                    if (i14 == tabCount) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        } else {
            tabLayout.addOnLayoutChangeListener(new xm0.b(tabLayout));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        tabLayout.getLayoutParams().height = (int) c22.b.c(contextRequireContext, getResources().getDimension(R.dimen.date_range_selector_tab_layout_height), 1.5f);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        View viewFindViewById3 = view2.findViewById(R.id.leaderboard_list_view_pager);
        viewFindViewById3.getClass();
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById3;
        this.f191336f = viewPager2;
        viewPager2.setUserInputEnabled(false);
        ViewPager2 viewPager3 = this.f191336f;
        if (viewPager3 == null) {
            p005kotlin.jvm.internal.s.m("leaderboardListViewPager");
            throw null;
        }
        viewPager3.setOffscreenPageLimit(MathKt.c((w.values().length - 1) / 2.0f));
        ViewPager2 viewPager4 = this.f191336f;
        if (viewPager4 == null) {
            p005kotlin.jvm.internal.s.m("leaderboardListViewPager");
            throw null;
        }
        this.f191335e = new TabLayoutMediator(tabLayout, viewPager4, false, true, new wr.g(12));
        GroupDetailsDTO groupDetailsDTO = ((mm0.e) this.f191331a.getValue()).f119507c;
        if (groupDetailsDTO == null || (view3 = getView()) == null) {
            return;
        }
        view3.post(new vg1.d(18, this, groupDetailsDTO));
    }
}
