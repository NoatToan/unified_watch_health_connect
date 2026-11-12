package com.huawei.watchface.utils.analytice.data;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.x2;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class AnalyticsGeneralEvent extends BaseEvent<AnalyticsGeneralEvent> {
    public LinkedHashMap g = new LinkedHashMap();
    public String h;

    @Override // com.huawei.watchface.s3
    public String a() {
        return this.h;
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        if (this.g == null) {
            this.g = new LinkedHashMap();
        }
        this.g.put("startts", String.valueOf(f()));
        this.g.put("endts", String.valueOf(c()));
        this.g.put("totalTime", String.valueOf(c() - f()));
        this.g.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, String.valueOf(x2.c()));
        this.g.put("hmsVer", CommonUtils.h());
        return this.g;
    }

    public final void d(String str) {
        this.h = str;
    }

    public void sendEvent(String str, HashMap<String, String> map) {
        AnalyticsGeneralEvent analyticsGeneralEvent = new AnalyticsGeneralEvent();
        analyticsGeneralEvent.d(str);
        analyticsGeneralEvent.g.putAll(map);
        analyticsGeneralEvent.j();
    }
}
