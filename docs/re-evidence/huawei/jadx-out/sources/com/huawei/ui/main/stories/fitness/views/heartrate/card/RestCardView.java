package com.huawei.ui.main.stories.fitness.views.heartrate.card;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.health.knit.api.ICustomCalculator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem;
import defpackage.ukb;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class RestCardView extends HeartRateCardView implements IFocusObserverItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnReferenceChange f27331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICustomCalculator f27332c;
    private DetailView e;

    public interface OnReferenceChange {
        void onReferenceChange(float f);
    }

    public RestCardView(Context context, ObserveredClassifiedView observeredClassifiedView, String str) {
        super(context, observeredClassifiedView, str, context.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.f27331b = null;
        this.e = null;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        float fCalculate;
        ICustomCalculator iCustomCalculator = this.f27332c;
        if (iCustomCalculator == null) {
            fCalculate = hwHealthBaseScrollBarLineChart.getShowDataAverage();
        } else {
            fCalculate = iCustomCalculator.calculate(hwHealthBaseScrollBarLineChart, this.mHost.getStepDataType());
        }
        int i3 = 0;
        if (fCalculate > 0.0f) {
            double d = fCalculate;
            setContentText(UnitUtil.e(d, 1, 0));
            i3 = Integer.parseInt(UnitUtil.e(d, 1, 0));
        } else {
            setContentText("--");
        }
        DetailView detailView = this.e;
        if (detailView != null) {
            detailView.a(i3);
        }
        OnReferenceChange onReferenceChange = this.f27331b;
        if (onReferenceChange != null) {
            onReferenceChange.onReferenceChange(fCalculate);
        }
    }

    public void d(ICustomCalculator iCustomCalculator) {
        this.f27332c = iCustomCalculator;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem
    public View onCreateDetailView() {
        if (this.e == null) {
            this.e = new DetailView(getContext());
        }
        return this.e;
    }

    public void setOnReferenceChangeListener(OnReferenceChange onReferenceChange) {
        this.f27331b = onReferenceChange;
    }

    static class DetailView extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ConstraintLayout f27333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f27334b;
        private HealthTextView d;
        private HealthTextView e;

        DetailView(Context context) {
            super(context);
            d();
        }

        private void d() {
            inflate(getContext(), R.layout.focus_view_detail_rest_hr, this);
            this.e = (HealthTextView) findViewById(R.id.text_rest_heartrate_tip);
            this.f27334b = (HealthTextView) findViewById(R.id.text_ecg_measurement_reminder);
            this.f27333a = (ConstraintLayout) findViewById(R.id.ecg_measurement_reminder_layout);
            this.d = (HealthTextView) findViewById(R.id.point1);
            this.e.setText(getResources().getString(R.string.IDS_resting_heart_rate_details_string_new, 60, 100, 60));
        }

        public void a(int i) {
            if (i != 0 && ((i < 60 || i > 100) && ukb.d())) {
                this.f27334b.setVisibility(0);
                this.f27333a.setVisibility(0);
                this.d.setVisibility(0);
                String string = getResources().getString(R.string.IDS_heart_rate_ecg_view);
                ukb.b(getResources().getString(R.string.IDS_heart_rate_rest_ecg_tips, string), string, this.f27334b, 0, ukb.h() ? 2 : 1);
                return;
            }
            this.f27334b.setVisibility(8);
            this.f27333a.setVisibility(8);
            this.d.setVisibility(8);
        }
    }
}
