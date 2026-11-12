package com.huawei.ui.main.stories.fitness.activity.step;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView;
import defpackage.lrd;
import defpackage.qre;
import defpackage.qri;
import defpackage.uhv;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class CalorieDescriptionConvertView extends RelativeLayout implements ScrollChartObserverTotalDataView.OnDataChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f27011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27013c;
    private HealthTextView d;

    public CalorieDescriptionConvertView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.day_step_transfer_layout, this);
        this.f27011a = viewInflate.findViewById(R.id.transfer_data_layout);
        this.f27012b = (HealthTextView) viewInflate.findViewById(R.id.transfer_data_description);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.transfer_data_content);
        this.f27013c = (HealthTextView) viewInflate.findViewById(R.id.transfer_data_title);
    }

    private void c(final float f) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uhj
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(f);
            }
        });
    }

    public /* synthetic */ void b(float f) {
        final double d = uhv.d(f);
        LogUtil.a("Step_CalorieDescriptionConvertView", "updateDistanceDescription totalStep ", Float.valueOf(f), "stepCalorie ", Double.valueOf(d));
        HandlerExecutor.c(new Runnable() { // from class: uhl
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(double d) {
        HealthTextView healthTextView = this.f27013c;
        if (healthTextView == null) {
            LogUtil.e("Step_CalorieDescriptionConvertView", "mTransferDataTitle is null");
            return;
        }
        healthTextView.setText(qre.f(R.string.IDS_plugin_achievement_calorie_desc));
        int iRound = Math.round(((float) d) / 1000.0f);
        this.f27012b.setText(uhv.b(iRound));
        String strE = UnitUtil.e(iRound, 1, 0);
        SpannableString spannableString = new SpannableString(qre.e(R.plurals.IDS_caloric_diff_kcals, iRound, strE));
        qri.e(spannableString, strE, R.string.textFontFamilyMedium);
        qri.b(spannableString, strE, R.color.textColorPrimary);
        qri.c(spannableString, strE, qre.b(R.dimen.health_common_20sp));
        this.d.setText(spannableString);
        lrd.d(this.f27011a, qre.a(R.string.accessibility_step_calorie, qre.e(R.plurals.accessibility_calorie_kcal, iRound, strE), this.f27012b.getText()), false);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.OnDataChange
    public void onChange(float f) {
        c(f);
    }
}
