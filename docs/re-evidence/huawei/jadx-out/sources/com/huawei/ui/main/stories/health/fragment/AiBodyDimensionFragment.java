package com.huawei.ui.main.stories.health.fragment;

import android.text.SpannableString;
import android.util.Pair;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.uww;
import defpackage.vei;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AiBodyDimensionFragment extends WeightBodyDataFragment {
    private static final String TAG = "HealthWeight_AiBodyDimensionFragment";

    abstract int getTitleId();

    abstract double getValueFrom(uww uwwVar);

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected void initData() {
        if (this.mAiBodyShapeBean == null) {
            return;
        }
        double valueFrom = getValueFrom(this.mAiBodyShapeBean);
        String strE = UnitUtil.e(UnitUtil.f() ? UnitUtil.e(valueFrom / 10.0d, 0) : valueFrom / 10.0d, 1, 1);
        SpannableString spannableString = new SpannableString(strE);
        if (UnitUtil.f()) {
            this.mDataUnit.setText(R.string.IDS_ins);
        } else {
            this.mDataUnit.setText(R.string.IDS_cm);
        }
        updateTitleTextStyle(strE, spannableString, getTitleId());
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected long getTrendEndTime() {
        return this.mAiBodyShapeBean.h();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected List<Pair<Long, Float>> buildTrendData(List<HiHealthData> list) {
        double dE;
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            boolean zF = UnitUtil.f();
            for (HiHealthData hiHealthData : list) {
                if (zF) {
                    dE = UnitUtil.e(hiHealthData.getDouble(getBodyDataKey()) / 10.0d, 0);
                } else {
                    dE = hiHealthData.getDouble(getBodyDataKey()) / 10.0d;
                }
                arrayList.add(new Pair(Long.valueOf(hiHealthData.getStartTime()), Float.valueOf((float) dE)));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected HiAggregateOption getHiAggregateOption() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(getTrendStartTime(), getTrendEndTime());
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(3);
        hiAggregateOption.setSortOrder(0);
        vei.e(hiAggregateOption);
        LogUtil.a(TAG, "getChartData() aggregateOption = ", hiAggregateOption.toString());
        return hiAggregateOption;
    }
}
