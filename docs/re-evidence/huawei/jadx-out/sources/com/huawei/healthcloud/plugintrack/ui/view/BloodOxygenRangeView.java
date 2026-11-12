package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class BloodOxygenRangeView extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11238c;

    public BloodOxygenRangeView(Context context) {
        super(context);
        b(context);
    }

    public BloodOxygenRangeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public BloodOxygenRangeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }

    private void b(Context context) {
        this.f11238c = context;
        if (context == null) {
            LogUtil.a("Track_TrackChartViewHolder", "mContext is null");
            return;
        }
        View.inflate(context, R.layout.blood_oxygen_introduced_item, this);
        ((HealthTextView) findViewById(R.id.blood_oxygen_measure_range_1)).setText(String.format(this.f11238c.getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_greater_than), UnitUtil.e(90.0d, 2, 0)));
        ((HealthTextView) findViewById(R.id.blood_oxygen_measure_range_2)).setText(String.format(this.f11238c.getString(R.string.IDS_press_auto_monitor_relax_range), UnitUtil.e(70.0d, 2, 0), UnitUtil.e(89.0d, 2, 0)));
    }
}
