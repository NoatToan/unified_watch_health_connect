package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class TimePercentageView extends LinearLayout {
    private final Context e;

    public TimePercentageView(Context context, MotionPathSimplify motionPathSimplify) {
        super(context);
        this.e = context;
        e(motionPathSimplify);
    }

    private void e(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            return;
        }
        View viewInflate = View.inflate(this.e, R.layout.common_chart_ring_layout, null);
        HealthRingChart healthRingChart = (HealthRingChart) viewInflate.findViewById(R.id.ring_view);
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime());
        int extendDataInt = motionPathSimplify.getExtendDataInt("skiCableTime", -1);
        int extendDataInt2 = motionPathSimplify.getExtendDataInt("skiFreeTime", -1);
        if (seconds <= 0 || extendDataInt <= 0) {
            ReleaseLogUtil.d("Track_TimePercentageView", "showTimePercentage skiTime or skiCableTime invalid");
            return;
        }
        LogUtil.a("Track_TimePercentageView", "TimePercentage show");
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(Integer.valueOf(seconds));
        arrayList.add(Integer.valueOf(extendDataInt));
        if (extendDataInt2 > 0) {
            arrayList.add(Integer.valueOf(extendDataInt2));
        }
        healthRingChart.a(arrayList);
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.e, new qjm().b(false).c(true), a(seconds, extendDataInt, extendDataInt2));
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: jss
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return UnitUtil.e((int) qjpVar.f());
            }
        });
        healthRingChart.setAdapter(healthRingChartAdapter);
        if (LanguageUtil.o(this.e)) {
            healthRingChart.setDesc(qre.f(R.string.IDS_track_time), qre.f(R.string.IDS_track_percentage));
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        addView(viewInflate);
    }

    private List<qjp> a(int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qjp(qre.f(R.string.IDS_track_slide), i, Color.parseColor("#FB6522"), Color.parseColor("#FF9C70")));
        arrayList.add(new qjp(qre.f(R.string.IDS_track_cable), i2, Color.parseColor("#13B2E7"), Color.parseColor("#66D8FE")));
        if (i3 > 0) {
            arrayList.add(new qjp(qre.f(R.string.IDS_track_rest), i3, Color.parseColor("#BCC4CF"), Color.parseColor("#C6CFDB")));
        }
        return arrayList;
    }
}
