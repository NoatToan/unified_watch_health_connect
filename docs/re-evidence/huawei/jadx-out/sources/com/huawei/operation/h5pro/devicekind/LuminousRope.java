package com.huawei.operation.h5pro.devicekind;

import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.ble.BleOperatorCompactImpl;
import health.compact.a.Services;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class LuminousRope {
    private static final int AEROBIC_ADVANCE_THRESHOLD_POSITION = 1;
    private static final int AEROBIC_BASE_THRESHOLD_POSITION = 0;
    private static final int AEROBIC_THRESHOLD_POSITION = 3;
    private static final int ANAEROBIC_ADVANCE_THRESHOLD_POSITION = 4;
    private static final int ANAEROBIC_BASE_THRESHOLD_POSITION = 3;
    private static final int ANAEROBIC_THRESHOLD_POSITION = 4;
    private static final int FAT_BURN_THRESHOLD_POSITION = 2;
    private static final int FITNESS_THRESHOLD_POSITION = 0;
    private static final int LACTIC_ACID_THRESHOLD_POSITION = 2;
    private static final int MAXIMUM_MAX_THRESHOLD_POSITION = 5;
    private static final int MAX_THRESHOLD_POSITION = 5;
    private static final String TAG = "LuminousRope";
    private static final String TYPE_MAXIMUM_HEART_RATE = "0";
    private static final String TYPE_RESERVED_HEART_RATE = "1";
    private static final int WARM_UP_THRESHOLD_POSITION = 1;
    private BleOperatorCompactImpl mBleOperatorCompactImpl;

    public LuminousRope(BleOperatorCompactImpl bleOperatorCompactImpl) {
        this.mBleOperatorCompactImpl = bleOperatorCompactImpl;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    public void requestHeartRateInterval(String str, String str2) {
        byte b2;
        if (this.mBleOperatorCompactImpl == null) {
            LogUtil.j(TAG, "bleOperator is null");
            return;
        }
        HeartRateThresholdConfig heartRateThresholdConfigRequestHeartRateInterval = requestHeartRateInterval(4);
        if (heartRateThresholdConfigRequestHeartRateInterval == null) {
            this.mBleOperatorCompactImpl.requestHeartRateInterval("", String.valueOf(1), str2);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            int iHashCode = str.hashCode();
            if (iHashCode != 48) {
                if (iHashCode == 49 && str.equals("1")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("0")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                jSONArray.put(0, heartRateThresholdConfigRequestHeartRateInterval.getAerobicBaseThreshold());
                jSONArray.put(1, heartRateThresholdConfigRequestHeartRateInterval.getAerobicAdvanceThreshold());
                jSONArray.put(2, heartRateThresholdConfigRequestHeartRateInterval.getLacticAcidThreshold());
                jSONArray.put(3, heartRateThresholdConfigRequestHeartRateInterval.getAnaerobicBaseThreshold());
                jSONArray.put(4, heartRateThresholdConfigRequestHeartRateInterval.getAnaerobicAdvanceThreshold());
                jSONArray.put(5, heartRateThresholdConfigRequestHeartRateInterval.getMaxThreshold());
            } else if (b2 == 1) {
                jSONArray.put(0, heartRateThresholdConfigRequestHeartRateInterval.getFitnessThreshold());
                jSONArray.put(1, heartRateThresholdConfigRequestHeartRateInterval.getWarmUpThreshold());
                jSONArray.put(2, heartRateThresholdConfigRequestHeartRateInterval.getFatBurnThreshold());
                jSONArray.put(3, heartRateThresholdConfigRequestHeartRateInterval.getAerobicThreshold());
                jSONArray.put(4, heartRateThresholdConfigRequestHeartRateInterval.getAnaerobicThreshold());
                jSONArray.put(5, heartRateThresholdConfigRequestHeartRateInterval.getMaxThreshold());
            } else {
                LogUtil.e(TAG, "requestHeartRateInterval other type");
            }
            jSONObject.put("type", str);
            jSONObject.put("interval", jSONArray);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "requestHeartRateInterval fail JSONException");
        }
        this.mBleOperatorCompactImpl.requestHeartRateInterval(jSONObject.toString(), String.valueOf(0), str2);
    }

    private HeartRateThresholdConfig requestHeartRateInterval(int i) {
        HeartRateZoneMgr heartRateZoneMgrByCache = ((HealthDataMgrApi) Services.b("HWHealthDataMgr", HealthDataMgrApi.class)).getHeartRateZoneMgrByCache();
        if (heartRateZoneMgrByCache == null) {
            return null;
        }
        return heartRateZoneMgrByCache.getPostureType(i);
    }
}
