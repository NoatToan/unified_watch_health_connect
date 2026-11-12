package com.xiaomi.hm.health.model.account;

import android.text.TextUtils;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.devicex.manage.api.config.NightModeConfigApi;
import kotlin.Lazy;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class HMNightModeConfig implements NightModeConfigApi {
    private static final int DEFAULT_END_MINUTE = 420;
    private static final int DEFAULT_START_MINUTE = 1140;
    public static final int NIGHT_MODE_CLOSE = 0;
    public static final int NIGHT_MODE_OPEN_AFTER_SUNSET = 1;
    public static final int NIGHT_MODE_OPEN_TIMER = 2;
    private static final String TAG = "HMNightModeConfig";
    private static final Lazy<PropertyStoreApi> propertyStoreApiLazy = KoinJavaComponent.inject(PropertyStoreApi.class);
    private int nightMode = 0;
    private int startMinute = DEFAULT_START_MINUTE;
    private int endMinute = 420;

    public static HMNightModeConfig fromJsonString() {
        return fromJsonString(propertyStoreApiLazy.getValue().getProperty(Property.PROPERTY_NIGHT_MODE, ""));
    }

    public HMAutoBacklightInfo generateAutoBacklightInfo() {
        HMAutoBacklightInfo hMAutoBacklightInfo = new HMAutoBacklightInfo();
        hMAutoBacklightInfo.setStartHour(this.startMinute / 60);
        hMAutoBacklightInfo.setStartMinute(this.startMinute % 60);
        hMAutoBacklightInfo.setStopHour(this.endMinute / 60);
        hMAutoBacklightInfo.setStopMinute(this.endMinute % 60);
        int i = this.nightMode;
        if (i == 0) {
            hMAutoBacklightInfo.setMode(0);
        } else if (i == 1) {
            hMAutoBacklightInfo.setMode(2);
        } else if (i == 2) {
            hMAutoBacklightInfo.setMode(1);
        }
        HMLog.i(TAG, "autoBacklightInfo: " + hMAutoBacklightInfo, new Object[0]);
        return hMAutoBacklightInfo;
    }

    public int getEndMinute() {
        return this.endMinute;
    }

    public int getNightMode() {
        return this.nightMode;
    }

    public int getStartMinute() {
        return this.startMinute;
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.config.NightModeConfigApi
    public synchronized boolean needForecast() {
        return fromJsonString().getNightMode() == 1;
    }

    public void setEndMinute(int i) {
        this.endMinute = i;
    }

    public void setNightMode(int i) {
        this.nightMode = i;
    }

    public void setStartMinute(int i) {
        this.startMinute = i;
    }

    public String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("nightMode", this.nightMode);
            jSONObject.put("startMinute", this.startMinute);
            jSONObject.put("endMinute", this.endMinute);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return toJsonString();
    }

    public static HMNightModeConfig fromJsonString(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HMNightModeConfig();
        }
        try {
            HMNightModeConfig hMNightModeConfig = new HMNightModeConfig();
            JSONObject jSONObject = new JSONObject(str);
            hMNightModeConfig.setNightMode(jSONObject.optInt("nightMode", 0));
            hMNightModeConfig.setStartMinute(jSONObject.optInt("startMinute", DEFAULT_START_MINUTE));
            hMNightModeConfig.setEndMinute(jSONObject.optInt("endMinute", 420));
            return hMNightModeConfig;
        } catch (Exception e) {
            e.printStackTrace();
            return new HMNightModeConfig();
        }
    }
}
