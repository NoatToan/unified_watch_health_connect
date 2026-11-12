package com.xiaomi.hm.health.bt.profile.smartwatch.health;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes18.dex */
public class BleHealthData {
    public List<ActivityDataFragment> detailList;
    public List<BleHealthSummary> summaryList;

    public String toString() {
        return "<SummaryList: " + ArraysUtil.toString(this.summaryList) + ",\nDetailList: " + ArraysUtil.toString(this.detailList) + Typography.greater;
    }
}
