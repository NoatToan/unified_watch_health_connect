package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.view.RadarView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ActionRadarView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RadarView f10164a;
    private Context e;

    public ActionRadarView(Context context) {
        this(context, null);
    }

    public ActionRadarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionRadarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = context;
        a();
    }

    private void a() {
        this.f10164a = (RadarView) View.inflate(this.e, R.layout.action_radar_layout, this).findViewById(R.id.radar_view);
    }

    public void setData(double[] dArr, float f) {
        if (dArr == null || dArr.length != 6) {
            LogUtil.j("ActionRadarView", "scores is null or scores.length not equals 6");
            return;
        }
        this.f10164a.setCount(6);
        this.f10164a.setTextColorAndSize(getResources().getColor(com.huawei.ui.commonui.R.color.textColorSecondary), getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.textSizeBody3));
        this.f10164a.setNumberColorAndSize(getResources().getColor(com.huawei.ui.commonui.R.color.textColorSecondary), getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.textSizeBody1));
        this.f10164a.setIsActionRadar(true);
        String[] strArr = {getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_radar_coordination), getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_radar_technique), getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_radar_completeness), getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_radar_aesthetics), getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_radar_softness), getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_radar_balance)};
        double[] dArr2 = new double[6];
        for (int i = 0; i < 6; i++) {
            dArr2[i] = dArr[i] / 100.0d;
        }
        this.f10164a.setPercentOfMap(dArr2, strArr);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(getResources().getColor(com.huawei.ui.commonui.R.color.colorBackground)));
        arrayList.add(Integer.valueOf(getResources().getColor(com.huawei.ui.commonui.R.color.colorBackground)));
        arrayList.add(Integer.valueOf(getResources().getColor(com.huawei.ui.commonui.R.color.colorBackground)));
        arrayList.add(Integer.valueOf(getResources().getColor(com.huawei.ui.commonui.R.color.colorBackground)));
        this.f10164a.setColorList(arrayList);
        this.f10164a.setAverageScore(Math.round(f));
    }
}
