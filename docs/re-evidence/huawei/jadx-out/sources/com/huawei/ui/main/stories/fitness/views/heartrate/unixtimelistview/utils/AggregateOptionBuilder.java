package com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.utils;

import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class AggregateOptionBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f27344a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27345c;

    public enum DataGroupUnit {
        NONE,
        DAY,
        WEEK,
        MONTH,
        YEAR,
        ALL
    }

    public AggregateOptionBuilder d(long j, long j2) {
        this.f27345c = j;
        this.f27344a = j2;
        return this;
    }

    public HiAggregateOption e(DataGroupUnit dataGroupUnit, String str, int i) {
        int iOrdinal;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(this.f27345c);
        hiAggregateOption.setEndTime(this.f27344a);
        int i2 = 3;
        hiAggregateOption.setAggregateType(3);
        if (str.contains("_DETAIL") || (iOrdinal = dataGroupUnit.ordinal()) == 0) {
            i2 = 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                b(hiAggregateOption, str);
                i2 = 5;
            } else if (iOrdinal == 4) {
                b(hiAggregateOption, str);
                i2 = 6;
            } else {
                i2 = -1;
                LogUtil.j("AggregateOptionBuilder", "userViewSelf not support,uniteType: ", -1);
            }
        }
        hiAggregateOption.setConstantsKey(new String[]{str});
        hiAggregateOption.setType(new int[]{i});
        hiAggregateOption.setGroupUnitType(i2);
        hiAggregateOption.setReadType(0);
        return hiAggregateOption;
    }

    private void b(HiAggregateOption hiAggregateOption, String str) {
        if ("HR_NORMAL_MAX".equals(str) || "HR_WARNING_MAX".equals(str) || "BRADYCARDIA_MAX".equals(str)) {
            hiAggregateOption.setAggregateType(4);
        } else if ("HR_NORMAL_MIN".equals(str) || "HR_WARNING_MIN".equals(str) || "BRADYCARDIA_MIN".equals(str)) {
            hiAggregateOption.setAggregateType(5);
        } else {
            LogUtil.j("AggregateOptionBuilder", "YearAndMonth constKey = ", str);
        }
    }
}
