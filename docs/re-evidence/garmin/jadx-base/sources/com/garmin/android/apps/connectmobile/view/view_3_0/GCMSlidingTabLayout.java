package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseActivity;
import gw.j;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class GCMSlidingTabLayout extends com.garmin.android.apps.connectmobile.view.view_3_0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f47841k = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f47843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f47844j;

    public GCMSlidingTabLayout(Context context) {
        super(context);
        d(null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd  */
    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.a
    public final void a() {
        j jVar;
        Drawable drawableB;
        int currentItem;
        String strA;
        com.garmin.android.apps.connectmobile.view.view_3_0.a.b bVar = new com.garmin.android.apps.connectmobile.view.view_3_0.a.b();
        int iA = this.f47844j.a();
        for (int i14 = 0; i14 < iA; i14++) {
            if (this.f47853b != 0) {
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                int i15 = this.f47853b;
                c cVar = this.f47858g;
                View viewInflate = layoutInflaterFrom.inflate(i15, (ViewGroup) cVar, false);
                TextView textView = (TextView) viewInflate.findViewById(this.f47854c);
                ImageView imageView = (ImageView) viewInflate.findViewById(this.f47842h);
                boolean z14 = this.f47843i;
                boolean z15 = this.f47855d;
                if (z14) {
                    if (z15) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                        layoutParams.width = 0;
                        layoutParams.weight = 1.0f;
                    }
                } else if (z15) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.weight = 1.0f;
                }
                a aVar = this.f47844j;
                ViewPager viewPager = aVar.f47862a;
                CharSequence string = "";
                if (viewPager != null) {
                    fe.a adapter = viewPager.getAdapter();
                    if (adapter != null) {
                        string = adapter.getPageTitle(i14);
                    }
                } else if (aVar.f47863b != null && (jVar = aVar.f47864c) != null) {
                    SelectExerciseActivity selectExerciseActivity = (SelectExerciseActivity) jVar.f79512b;
                    SelectExerciseActivity.a aVar2 = SelectExerciseActivity.f29833f;
                    if (i14 == 0) {
                        string = selectExerciseActivity.getString(R.string.common_all);
                    } else if (i14 == 1) {
                        string = selectExerciseActivity.getString(R.string.common_recent);
                    }
                }
                int i16 = 17;
                if (string != null) {
                    textView.setText(string);
                    textView.post(new eh2.b(textView, i16));
                }
                ViewPager viewPager2 = this.f47844j.f47862a;
                if (viewPager2 != null) {
                    fe.a adapter2 = viewPager2.getAdapter();
                    if (adapter2 instanceof h32.b) {
                        drawableB = ((h32.b) adapter2).b(i14);
                    } else {
                        drawableB = null;
                    }
                } else {
                    drawableB = null;
                }
                if (drawableB != null) {
                    if (c22.b.a(getContext()) >= 1.5f) {
                        int iC = (int) c22.b.c(getContext(), getResources().getDimensionPixelSize(R.dimen.icon_default), 1.5f);
                        imageView.setMinimumHeight(iC);
                        imageView.setMinimumWidth(iC);
                    }
                    imageView.setImageDrawable(drawableB);
                    ViewPager viewPager3 = this.f47844j.f47862a;
                    if (viewPager3 != null) {
                        fe.a adapter3 = viewPager3.getAdapter();
                        if (adapter3 instanceof h32.b) {
                            strA = ((h32.b) adapter3).a(i14);
                        } else {
                            strA = null;
                        }
                    } else {
                        strA = null;
                    }
                    imageView.setContentDescription(strA);
                }
                ViewPager viewPager4 = this.f47844j.f47862a;
                if (viewPager4 != null) {
                    viewPager4.getAdapter();
                }
                viewInflate.setOnClickListener(bVar);
                String str = this.f47857f.get(i14, null);
                if (str != null) {
                    viewInflate.setContentDescription(str);
                }
                cVar.addView(viewInflate);
                cVar.setGravity(17);
                a aVar3 = this.f47844j;
                ViewPager viewPager5 = aVar3.f47862a;
                if (viewPager5 != null) {
                    currentItem = viewPager5.getCurrentItem();
                } else {
                    ViewPager2 viewPager6 = aVar3.f47863b;
                    currentItem = viewPager6 != null ? viewPager6.getCurrentItem() : 0;
                }
                if (i14 == currentItem) {
                    viewInflate.setSelected(true);
                }
            }
        }
    }

    public final void d(AttributeSet attributeSet) {
        a aVar = new a(0);
        this.f47844j = aVar;
        this.f47856e = aVar;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j1.f149710l);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        setDistributeEvenly(true);
        setBottomBorderColor(a7.b.getColor(getContext(), R.color.gcm3_tab_line));
        if (z14) {
            this.f47853b = R.layout.gcm_tab_icon;
            this.f47854c = R.id.tab_title;
            this.f47842h = R.id.tab_icon;
            setSelectedIndicatorColors(a7.b.getColor(getContext(), R.color.gcm3_tab_selected_line));
        } else {
            this.f47853b = R.layout.gcm_tab;
            this.f47854c = R.id.tab_title;
            this.f47842h = R.id.tab_icon;
            setSelectedIndicatorColors(a7.b.getColor(getContext(), R.color.gcm_border_selected));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAllocateEqualTabSpace(boolean z14) {
        this.f47843i = z14;
    }

    public static class a extends com.garmin.android.apps.connectmobile.view.view_3_0.a.e {
        public /* synthetic */ a(int i14) {
            this();
        }

        private a() {
        }
    }

    public GCMSlidingTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(attributeSet);
    }

    public GCMSlidingTabLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        d(attributeSet);
    }
}
