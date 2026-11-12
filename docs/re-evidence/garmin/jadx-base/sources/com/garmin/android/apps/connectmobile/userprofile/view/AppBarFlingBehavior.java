package com.garmin.android.apps.connectmobile.userprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMNestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class AppBarFlingBehavior extends AppBarLayout.Behavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OverScroller f47216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f47217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f47218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f47219e;

    public AppBarFlingBehavior() {
        this.f47218d = new HashMap();
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i14, int i15, int i16, int i17) {
        boolean zOnMeasureChild = super.onMeasureChild(coordinatorLayout, appBarLayout, i14, i15, i16, i17);
        if (this.f47217c == null) {
            this.f47217c = new a(this, 0);
        }
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.f47217c);
        return zOnMeasureChild;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view2, View view3, int i14, int i15) {
        OverScroller overScroller;
        StringBuilder sb3 = new StringBuilder("onStartNestedScroll: ");
        sb3.append(appBarLayout.getClass().getSimpleName());
        sb3.append(" <- ");
        sb3.append(view2.getClass().getSimpleName());
        sb3.append(" <- ");
        sb3.append(view3.getClass().getSimpleName());
        sb3.append(i15 == 0 ? " (TOUCH)" : " (NON_TOUCH)");
        i2.l("AppBarHeaderBehavior", sb3.toString());
        int i16 = 0;
        if (!(appBarLayout.getTotalScrollRange() + this.f47215a == 0)) {
            if (this.f47216b == null) {
                try {
                    Field declaredField = getClass().getSuperclass().getSuperclass().getDeclaredField("mScroller");
                    declaredField.setAccessible(true);
                    overScroller = (OverScroller) declaredField.get(this);
                } catch (IllegalAccessException | NoSuchFieldException e4) {
                    i2.n("AppBarHeaderBehavior", "Cannot get scroller instance: " + e4.getMessage());
                    overScroller = null;
                }
                this.f47216b = overScroller;
            }
            OverScroller overScroller2 = this.f47216b;
            if (overScroller2 != null) {
                overScroller2.abortAnimation();
            }
        }
        this.f47219e = view3;
        HashMap map = this.f47218d;
        if (((b) map.get(view3)) == null) {
            b bVar = new b(i16);
            map.put(this.f47219e, bVar);
            View view4 = this.f47219e;
            if (view4 instanceof RecyclerView) {
                ((RecyclerView) view4).addOnScrollListener(bVar);
            } else if (view4 instanceof GCMNestedScrollView) {
                ((GCMNestedScrollView) view4).setOnScrollListener(bVar);
            }
        }
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view2, view3, i14, i15);
    }

    public static class b extends RecyclerView.u implements GCMNestedScrollView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47221a;

        public /* synthetic */ b(int i14) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrollStateChanged(RecyclerView recyclerView, int i14) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
            this.f47221a += i15;
        }

        private b() {
        }
    }

    public class a implements AppBarLayout.OnOffsetChangedListener {
        private a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i14) {
            b bVar;
            AppBarFlingBehavior appBarFlingBehavior = AppBarFlingBehavior.this;
            appBarFlingBehavior.f47215a = i14;
            if (appBarLayout.getTotalScrollRange() + i14 == 0) {
                return;
            }
            View view2 = appBarFlingBehavior.f47219e;
            HashMap map = appBarFlingBehavior.f47218d;
            if (map.get(view2) == null || ((b) map.get(view2)).f47221a > 0) {
                return;
            }
            for (View view3 : map.keySet()) {
                if (view3 != view2 && (bVar = (b) map.get(view3)) != null && bVar.f47221a != 0) {
                    if (view3 instanceof RecyclerView) {
                        ((RecyclerView) view3).scrollToPosition(0);
                    } else {
                        view3.scrollTo(0, 0);
                    }
                    bVar.f47221a = 0;
                }
            }
        }

        public /* synthetic */ a(AppBarFlingBehavior appBarFlingBehavior, int i14) {
            this();
        }
    }

    public AppBarFlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47218d = new HashMap();
    }
}
