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

/* JADX INFO: loaded from: classes10.dex */
public class PistePercentageView extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f11272c;

    public PistePercentageView(Context context, MotionPathSimplify motionPathSimplify) {
        super(context);
        this.f11272c = context;
        c(motionPathSimplify);
    }

    private void c(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            return;
        }
        View viewInflate = View.inflate(this.f11272c, R.layout.common_chart_ring_layout, null);
        HealthRingChart healthRingChart = (HealthRingChart) viewInflate.findViewById(R.id.ring_view);
        int extendDataInt = motionPathSimplify.getExtendDataInt("skiPisteRegion", -1);
        if (extendDataInt == 1 || extendDataInt == 2 || extendDataInt == 3) {
            LogUtil.a("Track_SnowPercentageView", "PistePercentage show");
            List<qjp> listB = b(extendDataInt, motionPathSimplify);
            qjm qjmVarC = new qjm().b(false).c(true);
            HealthRingChartAdapter.DataFormatter dataFormatter = new HealthRingChartAdapter.DataFormatter() { // from class: jsd
                @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
                public final String format(qjp qjpVar) {
                    return UnitUtil.e(qjpVar.f(), 2, 0);
                }
            };
            HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.f11272c, qjmVarC, listB);
            healthRingChartAdapter.d(dataFormatter);
            healthRingChart.setAdapter(healthRingChartAdapter);
            if (LanguageUtil.o(this.f11272c)) {
                healthRingChart.setDesc(qre.f(R.string.IDS_track_piste), qre.f(R.string.IDS_track_percentage));
            }
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            setOrientation(1);
            addView(viewInflate);
            return;
        }
        ReleaseLogUtil.e("Track_SnowPercentageView", "skiPisteRegion invalid ", Integer.valueOf(extendDataInt));
    }

    private List<qjp> b(int i, MotionPathSimplify motionPathSimplify) {
        int extendDataInt = motionPathSimplify.getExtendDataInt("novicePistePercent", -1);
        int extendDataInt2 = motionPathSimplify.getExtendDataInt("easyPistePercent", -1);
        int extendDataInt3 = motionPathSimplify.getExtendDataInt("intermediatePistePercent", -1);
        int extendDataInt4 = motionPathSimplify.getExtendDataInt("advancedPistePercent", -1);
        int[] iArrD = d(i);
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            arrayList.add(new qjp(qre.f(R.string.IDS_ski_novice_piste), extendDataInt, iArrD[0], iArrD[1]));
            arrayList.add(new qjp(qre.f(R.string.IDS_ski_easy_piste), extendDataInt2, iArrD[2], iArrD[3]));
            arrayList.add(new qjp(qre.f(R.string.IDS_ski_intermediate_piste), extendDataInt3, iArrD[4], iArrD[5]));
            arrayList.add(new qjp(qre.f(R.string.IDS_ski_advanced_piste), extendDataInt4, iArrD[6], iArrD[7]));
            return arrayList;
        }
        arrayList.add(new qjp(qre.f(R.string.IDS_ski_easy_piste), extendDataInt2, iArrD[0], iArrD[1]));
        arrayList.add(new qjp(qre.f(R.string.IDS_ski_intermediate_piste), extendDataInt3, iArrD[2], iArrD[3]));
        arrayList.add(new qjp(qre.f(R.string.IDS_ski_advanced_piste), extendDataInt4, iArrD[4], iArrD[5]));
        return arrayList;
    }

    private int[] d(int i) {
        if (i == 1) {
            return new int[]{Color.parseColor("#64BB5C"), Color.parseColor("#95E48E"), Color.parseColor("#317AF7"), Color.parseColor("#95BCFF"), Color.parseColor("#E84026"), Color.parseColor("#FE7F6B"), Color.parseColor("#635D5D"), Color.parseColor("#8F8989")};
        }
        if (i == 2) {
            return new int[]{Color.parseColor("#64BB5C"), Color.parseColor("#95E48E"), Color.parseColor("#E84026"), Color.parseColor("#FE7F6B"), Color.parseColor("#635D5D"), Color.parseColor("#8F8989")};
        }
        if (i == 3) {
            return new int[]{Color.parseColor("#64BB5C"), Color.parseColor("#95E48E"), Color.parseColor("#317AF7"), Color.parseColor("#95BCFF"), Color.parseColor("#635D5D"), Color.parseColor("#8F8989")};
        }
        return new int[0];
    }
}
