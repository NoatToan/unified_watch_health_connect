package com.huawei.basichealthmodel;

import android.os.RemoteException;
import android.util.SparseArray;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.IHealthDataOpenInterface;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.bxc;
import defpackage.bxd;
import defpackage.byu;
import defpackage.cbg;
import defpackage.cdf;
import defpackage.lsm;
import health.compact.a.LogAnonymous;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class DeveloperKitProxy extends IHealthDataOpenInterface.Stub {
    @Override // com.huawei.health.IHealthDataOpenInterface
    public void getHealthData(long j, long j2, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        LogUtil.a("HL_DeveloperKitProxy", "getHealthData startTime ", Long.valueOf(j), " endTime ", Long.valueOf(j2), " callback ", iBaseCommonCallback);
        if (iBaseCommonCallback == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HL_DeveloperKitProxy", "getHealthData currentTime ", Long.valueOf(jCurrentTimeMillis));
        if (j < 0 || j2 <= 0 || j > j2 || j > jCurrentTimeMillis) {
            iBaseCommonCallback.onResponse(2, "getHealthData param invalid");
            return;
        }
        int iR = cbg.r();
        LogUtil.a("HL_DeveloperKitProxy", "getHealthData joinTime ", Integer.valueOf(iR));
        if (iR <= 0) {
            iBaseCommonCallback.onResponse(-2, "user not subscribed");
            return;
        }
        String strC = c(Math.max(j, DateFormatUtil.d(iR)), Math.min(j2, jCurrentTimeMillis));
        LogUtil.a("HL_DeveloperKitProxy", "getHealthData result ", strC);
        iBaseCommonCallback.onResponse(0, strC);
    }

    private String c(long j, long j2) {
        HashMap<String, HealthLifeBean> map = new HashMap<>();
        HashMap map2 = new HashMap();
        Set<Integer> setA = a(j, j2);
        String strQ = cbg.q();
        Iterator<Integer> it = setA.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            SparseArray<HealthLifeBean> sparseArrayC = cdf.c(bxd.e(strQ, iIntValue, byu.c().b(), true));
            HealthLifeBean healthLifeBean = (HealthLifeBean) lsm.e(sparseArrayC.get(1));
            if (healthLifeBean != null) {
                healthLifeBean.setId(100001);
                sparseArrayC.put(100001, healthLifeBean);
            }
            int size = sparseArrayC.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArrayC.keyAt(i);
                HealthLifeBean healthLifeBean2 = sparseArrayC.get(iKeyAt);
                if (healthLifeBean2 != null) {
                    healthLifeBean2.setRecordDay(iIntValue);
                    if (healthLifeBean2.getAddStatus() == 1) {
                        map.put(iIntValue + "_" + iKeyAt, healthLifeBean2);
                    } else {
                        map2.put(iIntValue + "_" + iKeyAt, healthLifeBean2);
                    }
                }
            }
        }
        return d(map, map2, j, j2).toString();
    }

    private JSONArray d(HashMap<String, HealthLifeBean> map, Map<String, HealthLifeBean> map2, long j, long j2) {
        JSONArray jSONArray = new JSONArray();
        if (map != null && map.size() > 0) {
            List<HealthLifeBean> listB = bxc.b(DateFormatUtil.a(j), DateFormatUtil.a(j2), cbg.q());
            HashMap map3 = new HashMap();
            for (HealthLifeBean healthLifeBean : listB) {
                if (healthLifeBean != null) {
                    map3.put(healthLifeBean.getRecordDay() + "_" + healthLifeBean.getId(), healthLifeBean);
                }
            }
            for (Map.Entry<String, HealthLifeBean> entry : map.entrySet()) {
                if (entry != null) {
                    HealthLifeBean healthLifeBeanB = (HealthLifeBean) map3.get(entry.getKey());
                    if (healthLifeBeanB == null) {
                        healthLifeBeanB = b(entry.getValue());
                    }
                    jSONArray.put(a(healthLifeBeanB));
                }
            }
        }
        if (map2 != null && map2.size() > 0) {
            for (HealthLifeBean healthLifeBean2 : map2.values()) {
                if (healthLifeBean2 != null) {
                    jSONArray.put(d(healthLifeBean2));
                }
            }
        }
        return jSONArray;
    }

    private Set<Integer> a(long j, long j2) {
        LogUtil.a("HL_DeveloperKitProxy", "getDaysFromTimeStampRange startTime ", Long.valueOf(j), " endTime", Long.valueOf(j2));
        HashSet hashSet = new HashSet();
        while (j < j2 + 86400000) {
            hashSet.add(Integer.valueOf(DateFormatUtil.a(Math.min(j, j2))));
            j += 86400000;
        }
        return hashSet;
    }

    private HealthLifeBean b(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_DeveloperKitProxy", "emptyTaskRecordDbBean bean is null");
            return null;
        }
        HealthLifeBean healthLifeBean2 = new HealthLifeBean();
        healthLifeBean2.setComplete(0);
        healthLifeBean2.setRest(0);
        healthLifeBean2.setRecordDay(healthLifeBean.getRecordDay());
        healthLifeBean2.setTimestamp(healthLifeBean.getTimestamp());
        healthLifeBean2.setTimeZone(healthLifeBean.getTimeZone());
        healthLifeBean2.setId(healthLifeBean.getId());
        return healthLifeBean2;
    }

    private JSONObject a(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_DeveloperKitProxy", "subscribedTask2Json bean is null");
            return new JSONObject();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("addStatus", 1);
            jSONObject.put("status", healthLifeBean.getComplete());
            jSONObject.put("restStatus", healthLifeBean.getRest());
            jSONObject.put(ParsedFieldTag.RECORD_DAY, healthLifeBean.getRecordDay());
            jSONObject.put("timestamp", healthLifeBean.getTimestamp());
            jSONObject.put(DBSessionCommon.COLUMN_TIME_ZONE, healthLifeBean.getTimeZone());
            jSONObject.put("id", healthLifeBean.getId());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("HL_DeveloperKitProxy", "subscribedTask2Json exception ", LogAnonymous.b(e));
            return new JSONObject();
        }
    }

    private JSONObject d(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_DeveloperKitProxy", "unSubscribedTask2Json bean is null");
            return new JSONObject();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("addStatus", 0);
            jSONObject.put("status", 0);
            jSONObject.put("restStatus", 0);
            jSONObject.put(ParsedFieldTag.RECORD_DAY, healthLifeBean.getRecordDay());
            jSONObject.put("timestamp", healthLifeBean.getTimestamp());
            jSONObject.put(DBSessionCommon.COLUMN_TIME_ZONE, healthLifeBean.getTimeZone());
            jSONObject.put("id", healthLifeBean.getId());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("HL_DeveloperKitProxy", "unSubscribedTask2Json exception ", LogAnonymous.b(e));
            return new JSONObject();
        }
    }
}
