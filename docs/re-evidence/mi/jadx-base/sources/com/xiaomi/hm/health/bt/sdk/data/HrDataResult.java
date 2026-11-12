package com.xiaomi.hm.health.bt.sdk.data;

import android.util.Base64;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class HrDataResult implements Serializable {
    private static final String DEVICE_ID = "deviceId";
    private static final String DEVICE_SOURCE = "deviceSource";
    private static final String GENERATED_TIME = "generatedTime";
    private static final String HEART_RATE_DATA = "heartRateData";
    private static final String LAST_SYNC_TIME = "lastSyncTime";
    private static final String TIME_ZONE = "timeZone";
    private static final String TYPE = "type";
    private static final long serialVersionUID = 1;
    private String deviceId;
    private int deviceSource;
    private Calendar lastSyncTimeCalendar;
    private List<HrData> result = new ArrayList();
    private boolean success;

    public void addData(HrData hrData) {
        this.result.add(hrData);
        Calendar calendar = hrData.getCalendar();
        Calendar calendar2 = this.lastSyncTimeCalendar;
        if (calendar2 == null || calendar2.before(calendar)) {
            this.lastSyncTimeCalendar = calendar;
        }
    }

    public String getHrDataResult() {
        JSONArray jSONArray = new JSONArray();
        for (HrData hrData : this.result) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put(GENERATED_TIME, hrData.getCalendar().getTimeInMillis() / 1000);
                jSONObject.put(DEVICE_SOURCE, this.deviceSource);
                jSONObject.put(HEART_RATE_DATA, Base64.encodeToString(new byte[]{(byte) hrData.getHr()}, 2));
                jSONObject.put("deviceId", this.deviceId);
                jSONObject.put("timeZone", ProfileUtils.getTimezoneKey(hrData.getCalendar().getTimeZone()));
                jSONObject.put("lastSyncTime", (hrData.getCalendar().getTimeInMillis() / 1000) + 1);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray.toString();
    }

    public long getLastSyncTime() {
        Calendar calendar = this.lastSyncTimeCalendar;
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis() / 1000;
    }

    public List<HrData> getResult() {
        return this.result;
    }

    public int getTimeZone() {
        Calendar calendar = this.lastSyncTimeCalendar;
        if (calendar == null) {
            return 0;
        }
        return ProfileUtils.getTimezoneKey(calendar.getTimeZone());
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }
}
