package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.calorie.FitnessCalorieDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity;
import defpackage.ftz;
import defpackage.lrd;
import defpackage.qre;
import defpackage.uhv;
import health.compact.a.UnitUtil;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class DayProgressBarScrollView extends RelativeLayout implements ScrollChartObserverTotalDataView.OnDataChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HealthProgressBar f27140c;
    private final Context d;
    private View e;
    private final AtomicInteger h;
    private float j;

    public DayProgressBarScrollView(Context context) {
        super(context);
        this.h = new AtomicInteger();
        this.j = -1.0f;
        this.f27139b = -1;
        this.d = context;
        View viewInflate = View.inflate(context, R.layout.day_step_progress_layout, this);
        this.e = viewInflate.findViewById(R.id.day_progress_layout);
        HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.day_step_progressbar);
        this.f27140c = healthProgressBar;
        findViewById(R.id.kaka_bubble).setVisibility(4);
        findViewById(R.id.kaka_list_layout).setVisibility(8);
        if (ftz.b()) {
            ViewGroup.LayoutParams layoutParams = healthProgressBar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
                marginLayoutParams.setMarginEnd(((Integer) BaseActivity.getSafeRegionWidth().second).intValue());
            }
        }
        healthProgressBar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ukn
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f50293a.a();
            }
        });
        LogUtil.a("DayProgressBarScrollView", "DayProgressBarScrollView mActivity ", context);
    }

    public /* synthetic */ void a() {
        if (this.f27139b > 0) {
            return;
        }
        int width = this.f27140c.getWidth();
        this.f27139b = width;
        if (width > 0) {
            this.f27138a = Math.round((this.f27140c.getHeight() * 100.0f) / this.f27139b);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.OnDataChange
    public void onChange(float f) {
        d(f);
    }

    public void c(int i) {
        this.h.set(i);
        d(this.j);
    }

    private void d(float f) {
        int i;
        this.j = f;
        int i2 = this.h.get();
        LogUtil.a("DayProgressBarScrollView", "update mValue ", Float.valueOf(this.j), " target ", Integer.valueOf(i2));
        int iMax = 0;
        if (this.d instanceof FitnessSportIntensityDetailActivity) {
            this.f27140c.setProgressDrawable(qre.c(R.drawable.progress_drawable_section_active_intensity));
            FitnessSportIntensityDetailActivity fitnessSportIntensityDetailActivity = (FitnessSportIntensityDetailActivity) this.d;
            fitnessSportIntensityDetailActivity.d((int) this.j, i2);
            fitnessSportIntensityDetailActivity.b((int) this.j, i2);
            i = R.plurals.accessibility_intensity_progress;
        } else {
            i = 0;
        }
        if (this.d instanceof FitnessCalorieDetailActivity) {
            this.f27140c.setProgressDrawable(qre.c(R.drawable.progress_drawable_section_active_caloric));
            FitnessCalorieDetailActivity fitnessCalorieDetailActivity = (FitnessCalorieDetailActivity) this.d;
            fitnessCalorieDetailActivity.a(this.j, i2);
            fitnessCalorieDetailActivity.b(this.j, i2);
            i = R.plurals.accessibility_calorie_progress;
        }
        if (i2 > 0) {
            float f2 = this.j;
            if (f2 > 0.0f) {
                int iE = uhv.e(f2, i2);
                LogUtil.a("DayProgressBarScrollView", "update percent ", Integer.valueOf(iE));
                iMax = Math.max(iE, this.f27138a);
            }
        }
        this.f27140c.setProgress(iMax);
        a(i, i2, iMax);
    }

    private void a(int i, int i2, int i3) {
        lrd.d(this.e, qre.e(i, i2, Integer.valueOf((int) this.j), Integer.valueOf(i2), UnitUtil.e(i3, 2, 0)), false);
    }
}
