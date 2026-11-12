package x22;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.a1;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x0;
import androidx.core.view.z0;
import androidx.fragment.app.e0;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import e32.j;
import e32.o;
import java.util.Iterator;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lx22/d;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends r0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f188532k = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f188533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f188534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AppBarLayout f188535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CoordinatorLayout f188536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FrameLayout f188537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ComposeView f188538j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            TabLayout.TabView tabView;
            view2.removeOnLayoutChangeListener(this);
            d dVar = d.this;
            int tabCount = dVar.pa().getTabCount();
            if (tabCount < 0) {
                return;
            }
            int i26 = 0;
            while (true) {
                Typeface typefaceA = h22.a.a("font/roboto_medium.ttf", dVar.pa().getContext());
                TabLayout.Tab tabAt = dVar.pa().getTabAt(i26);
                if (tabAt != null && (tabView = tabAt.f53250view) != null) {
                    for (View view3 : new x0(tabView)) {
                        if (view3 instanceof TextView) {
                            ((TextView) view3).setTypeface(typefaceA);
                        }
                    }
                }
                if (i26 == tabCount) {
                    return;
                } else {
                    i26++;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"x22/d$c", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements ViewPager.j {
        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            d dVar = d.this;
            AppBarLayout appBarLayout = dVar.f188535g;
            if (appBarLayout == null) {
                s.m("appBarLayout");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
            layoutParams.getClass();
            AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) ((CoordinatorLayout.f) layoutParams).f6350a;
            if (behavior != null) {
                behavior.setTopAndBottomOffset(0);
            }
            if (behavior != null) {
                CoordinatorLayout coordinatorLayout = dVar.f188536h;
                if (coordinatorLayout == null) {
                    s.m("rootLayout");
                    throw null;
                }
                AppBarLayout appBarLayout2 = dVar.f188535g;
                if (appBarLayout2 != null) {
                    behavior.onNestedPreScroll(coordinatorLayout, appBarLayout2, (View) coordinatorLayout, 0, 1, new int[2], 0);
                } else {
                    s.m("appBarLayout");
                    throw null;
                }
            }
        }
    }

    static {
        new a(null);
    }

    public d() {
        final int i14 = 0;
        this.f188533e = m.b(new e23.a(this) { // from class: x22.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f188531b;

            {
                this.f188531b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                d dVar = this.f188531b;
                switch (i15) {
                    case 0:
                        int i16 = d.f188532k;
                        return (SwipeViewPager) dVar.findViewById(R.id.view_pager);
                    default:
                        int i17 = d.f188532k;
                        return (TabLayout) dVar.findViewById(R.id.tab_layout);
                }
            }
        });
        final int i15 = 1;
        this.f188534f = m.b(new e23.a(this) { // from class: x22.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f188531b;

            {
                this.f188531b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                d dVar = this.f188531b;
                switch (i16) {
                    case 0:
                        int i17 = d.f188532k;
                        return (SwipeViewPager) dVar.findViewById(R.id.view_pager);
                    default:
                        int i18 = d.f188532k;
                        return (TabLayout) dVar.findViewById(R.id.tab_layout);
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public String fa() {
        return null;
    }

    public abstract e0 ma();

    public int na() {
        return R.layout.tabbed_pager_activity_layout;
    }

    public final fe.a oa() {
        return qa().getAdapter();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        TabLayout.TabView tabView;
        super.onCreate(bundle);
        setContentView(na());
        View viewFindViewById = findViewById(R.id.app_bar_layout);
        viewFindViewById.getClass();
        this.f188535g = (AppBarLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.root_layout);
        viewFindViewById2.getClass();
        this.f188536h = (CoordinatorLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.notification_layout);
        viewFindViewById3.getClass();
        this.f188537i = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.promotion_container);
        viewFindViewById4.getClass();
        this.f188538j = (ComposeView) viewFindViewById4;
        qa().setAdapter(ma());
        qa().setSwipeEnabled(false);
        qa().c(new c());
        TabLayout tabLayoutPa = pa();
        if (tabLayoutPa.isLaidOut() && !tabLayoutPa.isLayoutRequested()) {
            int tabCount = pa().getTabCount();
            if (tabCount >= 0) {
                int i14 = 0;
                while (true) {
                    Typeface typefaceA = h22.a.a("font/roboto_medium.ttf", pa().getContext());
                    TabLayout.Tab tabAt = pa().getTabAt(i14);
                    if (tabAt != null && (tabView = tabAt.f53250view) != null) {
                        Iterator<View> it = new x0(tabView).iterator();
                        while (true) {
                            z0 z0Var = (z0) it;
                            if (!z0Var.hasNext()) {
                                break;
                            }
                            View view2 = (View) z0Var.next();
                            if (view2 instanceof TextView) {
                                ((TextView) view2).setTypeface(typefaceA);
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
            tabLayoutPa.addOnLayoutChangeListener(new b());
        }
        FrameLayout frameLayout = this.f188537i;
        if (frameLayout == null) {
            s.m("notificationLayout");
            throw null;
        }
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new vx0.a(this, 1));
        pa().getLayoutParams().height = (int) c22.b.c(this, getResources().getDimensionPixelSize(R.dimen.date_range_selector_tab_layout_height), 1.5f);
        int intExtra = getIntent().getIntExtra("initialTab", -1);
        if (intExtra >= 0) {
            fe.a adapter = qa().getAdapter();
            if (intExtra < (adapter != null ? adapter.getF44052d() : 0)) {
                ra(intExtra);
            }
        }
    }

    @Override // androidx.fragment.app.m
    public void onResumeFragments() {
        CharSequence pageTitle;
        super.onResumeFragments();
        pa().setupWithViewPager(qa());
        fe.a adapter = qa().getAdapter();
        if (adapter != null) {
            int f149591t = adapter.getF44052d();
            for (int i14 = 0; i14 < f149591t; i14++) {
                fe.a adapter2 = qa().getAdapter();
                if (adapter2 instanceof j) {
                    TabLayout.Tab tabAt = pa().getTabAt(i14);
                    if (tabAt != null) {
                        j jVar = (j) adapter2;
                        o oVar = jVar.f62798j[i14];
                        Integer num = oVar.f62823e;
                        String str = oVar.f62824f;
                        if (num != null) {
                            androidx.fragment.app.m mVar = jVar.f62796h;
                            pageTitle = str != null ? mVar.getString(num.intValue(), str) : mVar.getString(num.intValue());
                        } else {
                            pageTitle = jVar.getPageTitle(i14);
                        }
                        tabAt.setContentDescription(pageTitle);
                    }
                    if (tabAt != null) {
                        a1.a(tabAt.f53250view, null);
                    }
                }
            }
        }
    }

    public final TabLayout pa() {
        Object value = this.f188534f.getValue();
        value.getClass();
        return (TabLayout) value;
    }

    public final SwipeViewPager qa() {
        Object value = this.f188533e.getValue();
        value.getClass();
        return (SwipeViewPager) value;
    }

    public final void ra(int i14) {
        qa().C(i14, false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx22/d$a;", "", "<init>", "()V", "", "INITIAL_TAB_KEY", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
