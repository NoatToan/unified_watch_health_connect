package com.huawei.ads.adsrec;

import android.content.Context;
import com.huawei.ads.adsrec.db.table.AdTraceRecord;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.StringUtils;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.awz;
import defpackage.axt;
import defpackage.axv;
import defpackage.axy;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f4758a;
    private int d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4760c = 0;
    private int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4759b = 0;
    private int g = 0;
    private StringBuilder f = new StringBuilder();
    private StringBuilder i = new StringBuilder();

    public void c(boolean z) {
        ICABackFlowCallback iCABackFlowCallbackB = awz.b();
        if (iCABackFlowCallbackB == null) {
            return;
        }
        IUtilCallback iUtilCallbackC = awz.c();
        if (iUtilCallbackC == null) {
            HiAdLog.e("CABackFlowProcessor", "utilCallback is null, return");
            return;
        }
        if (!z) {
            if (!axy.a()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long lastBackFlowCATime = iCABackFlowCallbackB.getLastBackFlowCATime();
            String config = iUtilCallbackC.getConfig("maxIntervalTriggerBackFlow");
            String config2 = iUtilCallbackC.getConfig("maxCountTriggerBackFlow");
            long jQueryCount = this.f4758a.queryCount("AdTraceRecord");
            if (jCurrentTimeMillis - lastBackFlowCATime <= ((long) StringUtils.parseIntOrDefault(config, 24)) * 3600000 && jQueryCount < StringUtils.parseIntOrDefault(config2, 15)) {
                return;
            }
        }
        String strD = d(iUtilCallbackC);
        if (StringUtils.isBlank(strD)) {
            HiAdLog.i("CABackFlowProcessor", "content is blank, return");
            return;
        }
        boolean zBackFlow2CA = iCABackFlowCallbackB.backFlow2CA(strD);
        iCABackFlowCallbackB.setLastBackFlowCATime(System.currentTimeMillis());
        this.f4758a.d();
        e(zBackFlow2CA);
    }

    private void e(boolean z) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.e);
        sb.append(",");
        sb.append(this.f4760c);
        sb.append(",");
        sb.append(this.g);
        sb.append(",");
        sb.append(this.f4759b);
        j.a(this.d, sb.toString(), this.i.toString(), this.f.toString(), z ? "1" : "0");
    }

    private JSONArray c(IUtilCallback iUtilCallback) {
        JSONArray jSONArray = new JSONArray();
        Map<String, Double> userCost = iUtilCallback.getUserCost(0);
        Map<String, Double> userCost2 = iUtilCallback.getUserCost(1);
        Long costEndTime = iUtilCallback.getCostEndTime(0);
        Long costEndTime2 = iUtilCallback.getCostEndTime(1);
        if (!axv.d(userCost)) {
            for (Map.Entry<String, Double> entry : userCost.entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                axt.a(jSONObject, "secondIndustryId", key);
                Map<String, Double> map = userCost2;
                axt.e(jSONObject, "cost7d", value.doubleValue());
                axt.b(jSONObject, "endTime", costEndTime.longValue());
                jSONArray.put(jSONObject);
                if (!StringUtils.isBlank(key)) {
                    if (this.i.length() > 0) {
                        this.i.append(",");
                    }
                    this.i.append(key);
                }
                if (Math.abs(value.doubleValue()) < 1.0E-8d) {
                    this.e++;
                } else {
                    this.f4760c++;
                }
                userCost2 = map;
            }
        }
        Map<String, Double> map2 = userCost2;
        if (!axv.d(map2)) {
            for (Map.Entry<String, Double> entry2 : map2.entrySet()) {
                String key2 = entry2.getKey();
                double dDoubleValue = entry2.getValue().doubleValue();
                JSONObject jSONObject2 = new JSONObject();
                axt.a(jSONObject2, "dspId", key2);
                axt.e(jSONObject2, "cost7d", dDoubleValue);
                axt.b(jSONObject2, "endTime", costEndTime2.longValue());
                jSONArray.put(jSONObject2);
                if (!StringUtils.isBlank(key2)) {
                    if (this.f.length() > 0) {
                        this.f.append(",");
                    }
                    this.f.append(key2);
                }
                if (Math.abs(dDoubleValue) < 1.0E-8d) {
                    this.g++;
                } else {
                    this.f4759b++;
                }
            }
        }
        return jSONArray;
    }

    private JSONArray e() {
        List<AdTraceRecord> listQuery = this.f4758a.query(AdTraceRecord.class, null, null, null, null, null);
        listQuery.size();
        JSONArray jSONArray = new JSONArray();
        if (!ListUtil.isEmpty(listQuery)) {
            for (AdTraceRecord adTraceRecord : listQuery) {
                try {
                    String strA = adTraceRecord.a();
                    String strG = adTraceRecord.g();
                    String strE = adTraceRecord.e();
                    String strD = adTraceRecord.d();
                    String strC = adTraceRecord.c();
                    boolean zH = adTraceRecord.h();
                    JSONObject jSONObject = new JSONObject();
                    axt.a(jSONObject, "contentId", strA);
                    axt.a(jSONObject, "uniqueId", strG);
                    axt.a(jSONObject, "adCreativeMaterialUrl", strE);
                    if (!StringUtils.isBlank(strD)) {
                        axt.e(jSONObject, "exposure", axt.a(strD));
                    }
                    if (!StringUtils.isBlank(strC)) {
                        axt.e(jSONObject, "click", axt.a(strC));
                    }
                    axt.a(jSONObject, "tradeMode", adTraceRecord.b());
                    axt.e(jSONObject, "sendToMedia", Boolean.valueOf(zH));
                    jSONArray.put(jSONObject);
                    this.d++;
                } catch (Exception e) {
                    HiAdLog.printSafeStackTrace(3, e);
                    HiAdLog.e("CABackFlowProcessor", "build adsInfo  error");
                }
            }
        }
        return jSONArray;
    }

    private String d(IUtilCallback iUtilCallback) {
        JSONArray jSONArrayE = e();
        if (this.d == 0) {
            return "";
        }
        JSONArray jSONArrayC = c(iUtilCallback);
        JSONObject jSONObject = new JSONObject();
        axt.e(jSONObject, "adsInfo", jSONArrayE);
        axt.e(jSONObject, "cost", jSONArrayC);
        jSONObject.toString();
        return jSONObject.toString();
    }

    public n(Context context) {
        this.f4758a = new e(context);
    }
}
