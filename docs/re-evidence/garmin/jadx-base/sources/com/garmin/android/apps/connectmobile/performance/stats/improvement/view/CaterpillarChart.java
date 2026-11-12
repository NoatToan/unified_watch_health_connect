package com.garmin.android.apps.connectmobile.performance.stats.improvement.view;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.view.CaterpillarChart;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0019\u001a\u001b\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB)\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getMaxBarViewHeight", "()I", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart$d;", "a", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart$d;", "getOnBarSelectedListener", "()Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart$d;", "setOnBarSelectedListener", "(Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart$d;)V", "onBarSelectedListener", "d", "b", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CaterpillarChart extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f40146k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public d onBarSelectedListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ValueAnimator f40149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ValueAnimator f40150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f40151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f40152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f40153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f40154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f40155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f40156j;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart$a;", "", "", TtmlNode.ATTR_TTS_COLOR, "", "percentage", "", "isInteractive", "isPausedSection", "<init>", "(IFZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f40158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f40159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f40160d;

        public a(int i14, float f14, boolean z14, boolean z15) {
            this.f40157a = i14;
            this.f40158b = f14;
            this.f40159c = z14;
            this.f40160d = z15;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart$c;", "", "", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart$a;", "bars", "", "xLabels", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a> f40161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f40162b;

        public c(List<a> list, List<String> list2) {
            list.getClass();
            list2.getClass();
            this.f40161a = list;
            this.f40162b = list2;
        }
    }

    public interface d {
        void I2(int i14);
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public CaterpillarChart(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        context.getClass();
        attributeSet.getClass();
        this.f40148b = -1;
        this.f40149c = new ValueAnimator();
        this.f40150d = new ValueAnimator();
        this.f40151e = new ArrayList();
        this.f40152f = new ArrayList();
        getContext().getResources().getDimension(R.dimen.andfont_caption);
        this.f40156j = a7.b.getColor(getContext(), R.color.gcm_text_secondary);
        b();
    }

    private final int getMaxBarViewHeight() {
        LinearLayout linearLayout = this.f40155i;
        if (linearLayout == null) {
            s.m("caterpillarChartBarContainer");
            throw null;
        }
        int height = linearLayout.getHeight();
        LinearLayout linearLayout2 = this.f40155i;
        if (linearLayout2 == null) {
            s.m("caterpillarChartBarContainer");
            throw null;
        }
        int paddingTop = height - linearLayout2.getPaddingTop();
        LinearLayout linearLayout3 = this.f40155i;
        if (linearLayout3 != null) {
            return paddingTop - linearLayout3.getPaddingBottom();
        }
        s.m("caterpillarChartBarContainer");
        throw null;
    }

    public final void a(int i14) {
        ArrayList arrayList = this.f40151e;
        arrayList.clear();
        ArrayList arrayList2 = this.f40152f;
        arrayList2.clear();
        int i15 = this.f40148b;
        ValueAnimator valueAnimator = this.f40149c;
        int i16 = 0;
        if (i15 == -1) {
            this.f40148b = i14;
            LinearLayout linearLayout = this.f40155i;
            if (linearLayout == null) {
                s.m("caterpillarChartBarContainer");
                throw null;
            }
            int childCount = linearLayout.getChildCount();
            while (i16 < childCount) {
                LinearLayout linearLayout2 = this.f40155i;
                if (linearLayout2 == null) {
                    s.m("caterpillarChartBarContainer");
                    throw null;
                }
                Object tag = linearLayout2.getChildAt(i16).getTag();
                Integer num = tag instanceof Integer ? (Integer) tag : null;
                if (num != null) {
                    if (num.intValue() != this.f40148b) {
                        arrayList.add(Integer.valueOf(i16));
                    }
                }
                i16++;
            }
            int maxBarViewHeight = getMaxBarViewHeight();
            valueAnimator.setIntValues(maxBarViewHeight, (int) (maxBarViewHeight * 0.3f));
            valueAnimator.start();
            return;
        }
        LinearLayout linearLayout3 = this.f40155i;
        ValueAnimator valueAnimator2 = this.f40150d;
        if (i15 == i14) {
            if (linearLayout3 == null) {
                s.m("caterpillarChartBarContainer");
                throw null;
            }
            int childCount2 = linearLayout3.getChildCount();
            while (i16 < childCount2) {
                LinearLayout linearLayout4 = this.f40155i;
                if (linearLayout4 == null) {
                    s.m("caterpillarChartBarContainer");
                    throw null;
                }
                Object tag2 = linearLayout4.getChildAt(i16).getTag();
                Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
                if (num2 != null) {
                    if (num2.intValue() != this.f40148b) {
                        arrayList2.add(Integer.valueOf(i16));
                    }
                }
                i16++;
            }
            int maxBarViewHeight2 = getMaxBarViewHeight();
            valueAnimator2.setIntValues((int) (maxBarViewHeight2 * 0.3f), maxBarViewHeight2);
            valueAnimator2.start();
            this.f40148b = -1;
            return;
        }
        if (linearLayout3 == null) {
            s.m("caterpillarChartBarContainer");
            throw null;
        }
        int childCount3 = linearLayout3.getChildCount();
        while (i16 < childCount3) {
            LinearLayout linearLayout5 = this.f40155i;
            if (linearLayout5 == null) {
                s.m("caterpillarChartBarContainer");
                throw null;
            }
            Object tag3 = linearLayout5.getChildAt(i16).getTag();
            Integer num3 = tag3 instanceof Integer ? (Integer) tag3 : null;
            if (num3 != null && num3.intValue() == i14) {
                arrayList2.add(Integer.valueOf(i16));
            }
            int i17 = this.f40148b;
            if (num3 != null && num3.intValue() == i17) {
                arrayList.add(Integer.valueOf(i16));
            }
            i16++;
        }
        int maxBarViewHeight3 = getMaxBarViewHeight();
        valueAnimator.setIntValues(maxBarViewHeight3, (int) (maxBarViewHeight3 * 0.3f));
        valueAnimator.start();
        int maxBarViewHeight4 = getMaxBarViewHeight();
        valueAnimator2.setIntValues((int) (maxBarViewHeight4 * 0.3f), maxBarViewHeight4);
        valueAnimator2.start();
        this.f40148b = i14;
    }

    public final void b() {
        LayoutInflater.from(getContext()).inflate(R.layout.caterpillar_chart_layout, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.caterpillar_chart_no_data_message);
        viewFindViewById.getClass();
        this.f40153g = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.caterpillar_chart_x_axis_container);
        viewFindViewById2.getClass();
        this.f40154h = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.caterpillar_chart_bar_container);
        viewFindViewById3.getClass();
        this.f40155i = (LinearLayout) viewFindViewById3;
        final int i14 = 0;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(this) { // from class: y61.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CaterpillarChart f194602b;

            {
                this.f194602b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams;
                ViewGroup.LayoutParams layoutParams2;
                int i15 = i14;
                CaterpillarChart caterpillarChart = this.f194602b;
                switch (i15) {
                    case 0:
                        int i16 = CaterpillarChart.f40146k;
                        valueAnimator.getClass();
                        Iterator it = caterpillarChart.f40151e.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            if (iIntValue >= 0) {
                                LinearLayout linearLayout = caterpillarChart.f40155i;
                                if (linearLayout == null) {
                                    s.m("caterpillarChartBarContainer");
                                    throw null;
                                }
                                if (iIntValue < linearLayout.getChildCount()) {
                                    Object animatedValue = valueAnimator.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    if (num != null) {
                                        int iIntValue2 = num.intValue();
                                        LinearLayout linearLayout2 = caterpillarChart.f40155i;
                                        if (linearLayout2 == null) {
                                            s.m("caterpillarChartBarContainer");
                                            throw null;
                                        }
                                        View childAt = linearLayout2.getChildAt(iIntValue);
                                        if (childAt != null && (layoutParams = childAt.getLayoutParams()) != null) {
                                            layoutParams.height = iIntValue2;
                                        }
                                        if (childAt != null) {
                                            childAt.requestLayout();
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        return;
                    default:
                        int i17 = CaterpillarChart.f40146k;
                        valueAnimator.getClass();
                        Iterator it3 = caterpillarChart.f40152f.iterator();
                        while (it3.hasNext()) {
                            int iIntValue3 = ((Number) it3.next()).intValue();
                            if (iIntValue3 >= 0) {
                                LinearLayout linearLayout3 = caterpillarChart.f40155i;
                                if (linearLayout3 == null) {
                                    s.m("caterpillarChartBarContainer");
                                    throw null;
                                }
                                if (iIntValue3 < linearLayout3.getChildCount()) {
                                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                                    Integer num2 = animatedValue2 instanceof Integer ? (Integer) animatedValue2 : null;
                                    if (num2 != null) {
                                        int iIntValue4 = num2.intValue();
                                        LinearLayout linearLayout4 = caterpillarChart.f40155i;
                                        if (linearLayout4 == null) {
                                            s.m("caterpillarChartBarContainer");
                                            throw null;
                                        }
                                        View childAt2 = linearLayout4.getChildAt(iIntValue3);
                                        if (childAt2 != null && (layoutParams2 = childAt2.getLayoutParams()) != null) {
                                            layoutParams2.height = iIntValue4;
                                        }
                                        if (childAt2 != null) {
                                            childAt2.requestLayout();
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        return;
                }
            }
        };
        ValueAnimator valueAnimator = this.f40149c;
        valueAnimator.addUpdateListener(animatorUpdateListener);
        valueAnimator.setInterpolator(new AccelerateInterpolator());
        final int i15 = 1;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: y61.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CaterpillarChart f194602b;

            {
                this.f194602b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ViewGroup.LayoutParams layoutParams;
                ViewGroup.LayoutParams layoutParams2;
                int i16 = i15;
                CaterpillarChart caterpillarChart = this.f194602b;
                switch (i16) {
                    case 0:
                        int i17 = CaterpillarChart.f40146k;
                        valueAnimator2.getClass();
                        Iterator it = caterpillarChart.f40151e.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            if (iIntValue >= 0) {
                                LinearLayout linearLayout = caterpillarChart.f40155i;
                                if (linearLayout == null) {
                                    s.m("caterpillarChartBarContainer");
                                    throw null;
                                }
                                if (iIntValue < linearLayout.getChildCount()) {
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    if (num != null) {
                                        int iIntValue2 = num.intValue();
                                        LinearLayout linearLayout2 = caterpillarChart.f40155i;
                                        if (linearLayout2 == null) {
                                            s.m("caterpillarChartBarContainer");
                                            throw null;
                                        }
                                        View childAt = linearLayout2.getChildAt(iIntValue);
                                        if (childAt != null && (layoutParams = childAt.getLayoutParams()) != null) {
                                            layoutParams.height = iIntValue2;
                                        }
                                        if (childAt != null) {
                                            childAt.requestLayout();
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        return;
                    default:
                        int i18 = CaterpillarChart.f40146k;
                        valueAnimator2.getClass();
                        Iterator it3 = caterpillarChart.f40152f.iterator();
                        while (it3.hasNext()) {
                            int iIntValue3 = ((Number) it3.next()).intValue();
                            if (iIntValue3 >= 0) {
                                LinearLayout linearLayout3 = caterpillarChart.f40155i;
                                if (linearLayout3 == null) {
                                    s.m("caterpillarChartBarContainer");
                                    throw null;
                                }
                                if (iIntValue3 < linearLayout3.getChildCount()) {
                                    Object animatedValue2 = valueAnimator2.getAnimatedValue();
                                    Integer num2 = animatedValue2 instanceof Integer ? (Integer) animatedValue2 : null;
                                    if (num2 != null) {
                                        int iIntValue4 = num2.intValue();
                                        LinearLayout linearLayout4 = caterpillarChart.f40155i;
                                        if (linearLayout4 == null) {
                                            s.m("caterpillarChartBarContainer");
                                            throw null;
                                        }
                                        View childAt2 = linearLayout4.getChildAt(iIntValue3);
                                        if (childAt2 != null && (layoutParams2 = childAt2.getLayoutParams()) != null) {
                                            layoutParams2.height = iIntValue4;
                                        }
                                        if (childAt2 != null) {
                                            childAt2.requestLayout();
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        return;
                }
            }
        };
        ValueAnimator valueAnimator2 = this.f40150d;
        valueAnimator2.addUpdateListener(animatorUpdateListener2);
        valueAnimator2.setInterpolator(new AccelerateInterpolator());
    }

    public final d getOnBarSelectedListener() {
        return this.onBarSelectedListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Object tag = view2 != null ? view2.getTag() : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            int iIntValue = num.intValue();
            d dVar = this.onBarSelectedListener;
            if (dVar != null) {
                dVar.I2(iIntValue);
            }
            a(iIntValue);
        }
    }

    public final void setOnBarSelectedListener(d dVar) {
        this.onBarSelectedListener = dVar;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart$b;", "", "<init>", "()V", "", "SHRUNKEN_BAR_HEIGHT_FRACTION", "F", "", "STATUS_PADDING", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaterpillarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f40148b = -1;
        this.f40149c = new ValueAnimator();
        this.f40150d = new ValueAnimator();
        this.f40151e = new ArrayList();
        this.f40152f = new ArrayList();
        getContext().getResources().getDimension(R.dimen.andfont_caption);
        this.f40156j = a7.b.getColor(getContext(), R.color.gcm_text_secondary);
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaterpillarChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f40148b = -1;
        this.f40149c = new ValueAnimator();
        this.f40150d = new ValueAnimator();
        this.f40151e = new ArrayList();
        this.f40152f = new ArrayList();
        getContext().getResources().getDimension(R.dimen.andfont_caption);
        this.f40156j = a7.b.getColor(getContext(), R.color.gcm_text_secondary);
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaterpillarChart(Context context) {
        super(context);
        context.getClass();
        this.f40148b = -1;
        this.f40149c = new ValueAnimator();
        this.f40150d = new ValueAnimator();
        this.f40151e = new ArrayList();
        this.f40152f = new ArrayList();
        getContext().getResources().getDimension(R.dimen.andfont_caption);
        this.f40156j = a7.b.getColor(getContext(), R.color.gcm_text_secondary);
        b();
    }
}
