package com.xiaomi.hm.health.traininglib.util;

import android.text.TextUtils;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.properties.HMUserPropertiesAPI;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.network.hmnetwork.properties.PropertyItem;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.traininglib.model.TrainingAlarm;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingConfigManager {
    private static final String a = "TrainingConfigManager";

    public class a extends d {
        public a(String str) {
            super(str);
        }

        @Override // com.xiaomi.hm.health.traininglib.util.TrainingConfigManager.d
        public void a(JSONObject jSONObject) {
            TrainingAlarm trainingAlarm = (TrainingAlarm) ParseJsonUtil.parse2Object(jSONObject.toString(), TrainingAlarm.class);
            if (trainingAlarm != null) {
                HMLog.i(TrainingConfigManager.a, "从服务端获取训练提醒数据成功:" + trainingAlarm.toString(), new Object[0]);
                TrainingConfig.saveTrainingAlarmConfigFromWeb(trainingAlarm);
            }
        }
    }

    public class b extends d {
        public b(String str) {
            super(str);
        }

        @Override // com.xiaomi.hm.health.traininglib.util.TrainingConfigManager.d
        public void a(JSONObject jSONObject) {
            if (jSONObject != null) {
                HMLog.i(TrainingConfigManager.a, "从服务端获取最高心率数据成功:" + jSONObject.toString(), new Object[0]);
                TrainingConfig.saveHeartWarningConfigFromWeb(jSONObject);
            }
        }
    }

    public static class c extends IHMHttpResponseHandler {
        private c() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                String str = new String(hMHttpResponseData.getResponseBody());
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.optInt("code") == 1) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                        if (jSONObjectOptJSONObject.optJSONObject(Configs.Params.PROPERTIES).has(Property.PROPERTY_TRAINING_REMINDER)) {
                            TrainingConfig.setAlarmConfigSynced(true);
                            HMLog.i(TrainingConfigManager.a, "本地的训练提醒数据提交至服务器成功:" + str, new Object[0]);
                        } else if (jSONObjectOptJSONObject.optJSONObject(Configs.Params.PROPERTIES).has(Property.PROPERTY_TRAINING_HEARTRATE)) {
                            TrainingConfig.setHrWarningConfigSynced(true);
                            HMLog.i(TrainingConfigManager.a, "本地的最高心率数据提交至服务器成功:" + str, new Object[0]);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static abstract class d extends IHMHttpResponseHandler {
        private String a;

        public d(String str) {
            this.a = str;
        }

        public abstract void a(JSONObject jSONObject);

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody()));
                    if (jSONObject.has(this.a)) {
                        a(new JSONObject(jSONObject.optString(this.a)));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void initTrainingBgmEnable() {
        if (TrainingKeeper.getCache(TrainingConfig.TRAINING_BGM_ENABLE) == null) {
            TrainingConfig.setTrainingBgmEnable(true);
        }
    }

    public static void syncAlarmConfig() {
        String cache = TrainingKeeper.getCache(TrainingConfig.ALARM_CONFIG_SYNCED);
        if (cache != null && !Boolean.valueOf(cache).booleanValue()) {
            String trainingReminderStr = TrainingConfig.getTrainingReminderStr(TrainingConfig.getTrainingALarmFromLocal());
            HMLog.i(a, "本地的训练提醒数据有更新,准备提交:" + trainingReminderStr, new Object[0]);
            if (!TextUtils.isEmpty(trainingReminderStr)) {
                HMUserPropertiesAPI.postProperty(new PropertyItem(Property.PROPERTY_TRAINING_REMINDER, trainingReminderStr), false, (IHMBasicHttpResponseHandler) new c());
            }
        } else if (cache == null) {
            HMLog.i(a, "需要获取服务端的训练提醒数据", new Object[0]);
            HMUserPropertiesAPI.getProperty(new PropertyItem(Property.PROPERTY_TRAINING_REMINDER), false, new a(Property.PROPERTY_TRAINING_REMINDER));
        } else {
            HMLog.i(a, "训练提醒数据已同步,不需要再次同步", new Object[0]);
        }
        String cache2 = TrainingKeeper.getCache(TrainingConfig.HR_WARNING_CONFIG_SYNCED);
        if (cache2 == null || Boolean.valueOf(cache2).booleanValue()) {
            if (cache2 != null) {
                HMLog.i(a, "最高心率数据已同步,不需要再次同步", new Object[0]);
                return;
            } else {
                HMLog.i(a, "需要获取服务端的最高心率数据", new Object[0]);
                HMUserPropertiesAPI.getProperty(new PropertyItem(Property.PROPERTY_TRAINING_HEARTRATE), false, new b(Property.PROPERTY_TRAINING_HEARTRATE));
                return;
            }
        }
        String heartWarningConfigStr = TrainingConfig.getHeartWarningConfigStr();
        HMLog.i(a, "本地的最高心率数据有更新,准备提交:" + heartWarningConfigStr, new Object[0]);
        if (TextUtils.isEmpty(heartWarningConfigStr)) {
            return;
        }
        HMUserPropertiesAPI.postProperty(new PropertyItem(Property.PROPERTY_TRAINING_HEARTRATE, heartWarningConfigStr), false, (IHMBasicHttpResponseHandler) new c());
    }
}
