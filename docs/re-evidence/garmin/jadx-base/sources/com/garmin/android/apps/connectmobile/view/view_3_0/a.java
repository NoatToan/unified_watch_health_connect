package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseActivity;
import gw.j;

/* JADX INFO: loaded from: classes10.dex */
public class a extends HorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f47856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<String> f47857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.view.view_3_0.c f47858g;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = 0;
            while (true) {
                a aVar = a.this;
                if (i14 >= aVar.f47858g.getChildCount()) {
                    return;
                }
                if (view2 == aVar.f47858g.getChildAt(i14)) {
                    aVar.getClass();
                    e eVar = aVar.f47856e;
                    ViewPager viewPager = eVar.f47862a;
                    if (viewPager != null) {
                        viewPager.setCurrentItem(i14);
                        return;
                    }
                    ViewPager2 viewPager2 = eVar.f47863b;
                    if (viewPager2 != null) {
                        viewPager2.setCurrentItem(i14);
                        return;
                    }
                    return;
                }
                i14++;
            }
        }
    }

    public interface c {
    }

    public interface d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewPager f47862a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewPager2 f47863b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j f47864c = null;

        public final int a() {
            RecyclerView.h adapter;
            ViewPager viewPager = this.f47862a;
            if (viewPager != null && viewPager != null && viewPager.getAdapter() != null) {
                fe.a adapter2 = this.f47862a.getAdapter();
                if (adapter2 != null) {
                    return adapter2.getCount();
                }
                return 0;
            }
            ViewPager2 viewPager2 = this.f47863b;
            if (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) {
                return 0;
            }
            return adapter.getItemCount();
        }
    }

    public a(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f47856e = new e();
        this.f47857f = new SparseArray<>();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f47852a = (int) (getResources().getDisplayMetrics().density * 24.0f);
        com.garmin.android.apps.connectmobile.view.view_3_0.c cVar = new com.garmin.android.apps.connectmobile.view.view_3_0.c(context);
        this.f47858g = cVar;
        addView(cVar, -1, -2);
    }

    public void a() {
        ViewPager2 viewPager2;
        View viewInflate;
        TextView textView;
        int currentItem;
        j jVar;
        e eVar = this.f47856e;
        ViewPager viewPager = eVar.f47862a;
        if ((viewPager == null || viewPager.getAdapter() == null) && ((viewPager2 = eVar.f47863b) == null || viewPager2.getAdapter() == null)) {
            return;
        }
        b bVar = new b();
        for (int i14 = 0; i14 < this.f47856e.a(); i14++) {
            int i15 = this.f47853b;
            com.garmin.android.apps.connectmobile.view.view_3_0.c cVar = this.f47858g;
            if (i15 != 0) {
                viewInflate = LayoutInflater.from(getContext()).inflate(this.f47853b, (ViewGroup) cVar, false);
                textView = (TextView) viewInflate.findViewById(this.f47854c);
            } else {
                viewInflate = null;
                textView = null;
            }
            if (viewInflate == null) {
                TextView textView2 = new TextView(getContext());
                textView2.setGravity(17);
                textView2.setTextSize(2, 12.0f);
                textView2.setTypeface(Typeface.DEFAULT_BOLD);
                textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                TypedValue typedValue = new TypedValue();
                getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
                textView2.setBackgroundResource(typedValue.resourceId);
                textView2.setAllCaps(true);
                int i16 = (int) (getResources().getDisplayMetrics().density * 16.0f);
                textView2.setPadding(i16, i16, i16, cVar.f47866a + i16);
                viewInflate = textView2;
            }
            if (textView == null && TextView.class.isInstance(viewInflate)) {
                textView = (TextView) viewInflate;
            }
            if (this.f47855d) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            if (textView != null) {
                e eVar2 = this.f47856e;
                ViewPager viewPager3 = eVar2.f47862a;
                CharSequence string = "";
                if (viewPager3 != null) {
                    fe.a adapter = viewPager3.getAdapter();
                    if (adapter != null) {
                        string = adapter.getPageTitle(i14);
                    }
                } else if (eVar2.f47863b != null && (jVar = eVar2.f47864c) != null) {
                    SelectExerciseActivity selectExerciseActivity = (SelectExerciseActivity) jVar.f79512b;
                    SelectExerciseActivity.a aVar = SelectExerciseActivity.f29833f;
                    if (i14 == 0) {
                        string = selectExerciseActivity.getString(com.garmin.android.apps.connectmobile.R.string.common_all);
                    } else if (i14 == 1) {
                        string = selectExerciseActivity.getString(com.garmin.android.apps.connectmobile.R.string.common_recent);
                    }
                }
                textView.setText(string);
                viewInflate.setOnClickListener(bVar);
            }
            String str = this.f47857f.get(i14, null);
            if (str != null) {
                viewInflate.setContentDescription(str);
            }
            cVar.addView(viewInflate);
            e eVar3 = this.f47856e;
            ViewPager viewPager4 = eVar3.f47862a;
            if (viewPager4 != null) {
                currentItem = viewPager4.getCurrentItem();
            } else {
                ViewPager2 viewPager5 = eVar3.f47863b;
                currentItem = viewPager5 != null ? viewPager5.getCurrentItem() : 0;
            }
            if (i14 == currentItem) {
                viewInflate.setSelected(true);
            }
        }
    }

    public final void b(int i14, int i15) {
        View childAt;
        com.garmin.android.apps.connectmobile.view.view_3_0.c cVar = this.f47858g;
        int childCount = cVar.getChildCount();
        if (childCount == 0 || i14 < 0 || i14 >= childCount || (childAt = cVar.getChildAt(i14)) == null) {
            return;
        }
        int left = childAt.getLeft() + i15;
        if (i14 > 0 || i15 > 0) {
            left -= this.f47852a;
        }
        scrollTo(left, 0);
    }

    public final void c() {
        this.f47858g.removeAllViews();
        e eVar = this.f47856e;
        if (eVar.f47862a == null && eVar.f47863b == null) {
            return;
        }
        C0931a c0931a = new C0931a(this, 0);
        ViewPager viewPager = eVar.f47862a;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(c0931a);
        } else {
            ViewPager2 viewPager2 = eVar.f47863b;
            if (viewPager2 != null) {
                viewPager2.f11339c.f11374a.add(new com.garmin.android.apps.connectmobile.view.view_3_0.b(eVar, c0931a));
            }
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int currentItem;
        super.onAttachedToWindow();
        e eVar = this.f47856e;
        ViewPager viewPager = eVar.f47862a;
        if (viewPager == null && eVar.f47863b == null) {
            return;
        }
        if (viewPager != null) {
            currentItem = viewPager.getCurrentItem();
        } else {
            ViewPager2 viewPager2 = eVar.f47863b;
            currentItem = viewPager2 != null ? viewPager2.getCurrentItem() : 0;
        }
        b(currentItem, 0);
    }

    public void setBottomBorderColor(int i14) {
        com.garmin.android.apps.connectmobile.view.view_3_0.c cVar = this.f47858g;
        cVar.getClass();
        int iArgb = Color.argb(127, Color.red(i14), Color.green(i14), Color.blue(i14));
        Paint paint = cVar.f47867b;
        if (iArgb <= 0) {
            iArgb = cVar.f47870e;
        }
        paint.setColor(iArgb);
        cVar.invalidate();
    }

    public void setCustomTabColorizer(c cVar) {
        com.garmin.android.apps.connectmobile.view.view_3_0.c cVar2 = this.f47858g;
        cVar2.f47873h = cVar;
        cVar2.invalidate();
    }

    public void setDistributeEvenly(boolean z14) {
        this.f47855d = z14;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        com.garmin.android.apps.connectmobile.view.view_3_0.c cVar = this.f47858g;
        cVar.f47873h = null;
        cVar.f47874i.f47875a = iArr;
        cVar.invalidate();
    }

    public void setTabSelectionListener(d dVar) {
    }

    public void setViewPager(ViewPager viewPager) {
        e eVar = this.f47856e;
        eVar.f47862a = viewPager;
        eVar.f47863b = null;
        c();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.view.view_3_0.a$a, reason: collision with other inner class name */
    public class C0931a implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47859a;

        private C0931a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
            this.f47859a = i14;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
            a aVar = a.this;
            com.garmin.android.apps.connectmobile.view.view_3_0.c cVar = aVar.f47858g;
            com.garmin.android.apps.connectmobile.view.view_3_0.c cVar2 = aVar.f47858g;
            int childCount = cVar.getChildCount();
            if (childCount == 0 || i14 < 0 || i14 >= childCount) {
                return;
            }
            cVar2.f47871f = i14;
            cVar2.f47872g = f14;
            cVar2.invalidate();
            View childAt = cVar2.getChildAt(i14);
            aVar.b(i14, childAt != null ? (int) (f14 * childAt.getWidth()) : 0);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            int i15 = this.f47859a;
            a aVar = a.this;
            if (i15 == 0) {
                com.garmin.android.apps.connectmobile.view.view_3_0.c cVar = aVar.f47858g;
                cVar.f47871f = i14;
                cVar.f47872g = 0.0f;
                cVar.invalidate();
                aVar.b(i14, 0);
            }
            int i16 = 0;
            while (i16 < aVar.f47858g.getChildCount()) {
                aVar.f47858g.getChildAt(i16).setSelected(i14 == i16);
                i16++;
            }
        }

        public /* synthetic */ C0931a(a aVar, int i14) {
            this();
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context) {
        this(context, null);
    }
}
