package com.xiaomi.hm.health.bt.model;

import android.text.TextUtils;
import com.huami.account.UserLegalInfoManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class HMPeytoSettings {
    public static final int DEF_RIDE = 2;
    public static final int DEF_RUN = 0;
    public static final int DEF_RUN_INDOOR = 3;
    public static final int DEF_WALK = 1;
    public static final int DISTURB_CLOSE = 0;
    public static final int DISTURB_OPEN = 1;
    public static final int DISTURB_SMART = 2;
    public boolean a = false;
    public boolean b = false;
    public int c = 0;
    public boolean d = false;
    public int e = 0;
    public int f = 0;
    public ArrayList<AlarmSwitch> g = new ArrayList<>();
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public int l = 3;
    public int m = 0;

    public static class AlarmSwitch {
        private int a;
        private boolean b;

        public AlarmSwitch(int index, boolean enable) {
            this.b = false;
            this.a = index;
            this.b = enable;
        }

        public int getIndex() {
            return this.a;
        }

        public boolean isEnable() {
            return this.b;
        }

        public void setEnable(boolean enable) {
            this.b = enable;
        }

        public void setIndex(int index) {
            this.a = index;
        }

        public String toString() {
            return "{index=" + this.a + ", enable=" + this.b + '}';
        }
    }

    public static HMPeytoSettings fromJsonString(String json) {
        HMPeytoSettings hMPeytoSettings = new HMPeytoSettings();
        if (TextUtils.isEmpty(json)) {
            return hMPeytoSettings;
        }
        try {
            JSONObject jSONObject = new JSONObject(json);
            hMPeytoSettings.setRtHrOn(jSONObject.optBoolean("isRtHrOn"));
            hMPeytoSettings.setLiftScreenOn(jSONObject.optBoolean("isLiftScreenOn"));
            hMPeytoSettings.setWatchFaceType(jSONObject.optInt("watchFaceType"));
            hMPeytoSettings.setConnectedAdvOn(jSONObject.optBoolean("isConnectedAdvOn"));
            hMPeytoSettings.setLongPressDef(jSONObject.optInt("longPressDef"));
            hMPeytoSettings.setDisturbMode(jSONObject.optInt("disturbMode"));
            hMPeytoSettings.setAutoPause(jSONObject.optBoolean("autoPause"));
            hMPeytoSettings.setHrAlert(jSONObject.optBoolean("hrAlert"));
            hMPeytoSettings.setPaceAlert(jSONObject.optBoolean("paceAlert"));
            hMPeytoSettings.setDisAlert(jSONObject.optBoolean("disAlert"));
            hMPeytoSettings.setBrightness(jSONObject.optInt("brightness", 3));
            hMPeytoSettings.setLanguage(jSONObject.optInt(UserLegalInfoManager.KEY_LANGUAGE));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("alarm");
            ArrayList<AlarmSwitch> arrayList = new ArrayList<>();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    arrayList.add(new AlarmSwitch(jSONObject2.optInt("index"), jSONObject2.optBoolean("enable")));
                }
            }
            hMPeytoSettings.setAlarmSwitches(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hMPeytoSettings;
    }

    public ArrayList<AlarmSwitch> getAlarmSwitches() {
        return this.g;
    }

    public int getBrightness() {
        return this.l;
    }

    public int getDisturbMode() {
        return this.f;
    }

    public int getLanguage() {
        return this.m;
    }

    public int getLongPressDef() {
        return this.e;
    }

    public int getWatchFaceType() {
        return this.c;
    }

    public boolean isAutoPause() {
        return this.h;
    }

    public boolean isConnectedAdvOn() {
        return this.d;
    }

    public boolean isDisAlert() {
        return this.k;
    }

    public boolean isHrAlert() {
        return this.i;
    }

    public boolean isLiftScreenOn() {
        return this.b;
    }

    public boolean isPaceAlert() {
        return this.j;
    }

    public boolean isRtHrOn() {
        return this.a;
    }

    public void setAlarmSwitches(ArrayList<AlarmSwitch> alarmSwitches) {
        this.g = alarmSwitches;
    }

    public void setAutoPause(boolean autoPause) {
        this.h = autoPause;
    }

    public void setBrightness(int brightness) {
        this.l = brightness;
    }

    public void setConnectedAdvOn(boolean connectedAdvOn) {
        this.d = connectedAdvOn;
    }

    public void setDisAlert(boolean disAlert) {
        this.k = disAlert;
    }

    public void setDisturbMode(int disturbMode) {
        this.f = disturbMode;
    }

    public void setHrAlert(boolean hrAlert) {
        this.i = hrAlert;
    }

    public void setLanguage(int language) {
        this.m = language;
    }

    public void setLiftScreenOn(boolean liftScreenOn) {
        this.b = liftScreenOn;
    }

    public void setLongPressDef(int longPressDef) {
        this.e = longPressDef;
    }

    public void setPaceAlert(boolean paceAlert) {
        this.j = paceAlert;
    }

    public void setRtHrOn(boolean rtHrOn) {
        this.a = rtHrOn;
    }

    public void setWatchFaceType(int watchFaceType) {
        this.c = watchFaceType;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isRtHrOn", this.a);
            jSONObject.put("isLiftScreenOn", this.b);
            jSONObject.put("watchFaceType", this.c);
            jSONObject.put("isConnectedAdvOn", this.d);
            jSONObject.put("longPressDef", this.e);
            jSONObject.put("disturbMode", this.f);
            jSONObject.put("autoPause", this.h);
            jSONObject.put("hrAlert", this.i);
            jSONObject.put("paceAlert", this.j);
            jSONObject.put("disAlert", this.k);
            jSONObject.put("brightness", this.l);
            jSONObject.put(UserLegalInfoManager.KEY_LANGUAGE, this.m);
            ArrayList<AlarmSwitch> arrayList = this.g;
            if (arrayList != null && arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (AlarmSwitch alarmSwitch : this.g) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("index", alarmSwitch.getIndex());
                    jSONObject2.put("enable", alarmSwitch.isEnable());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("alarm", jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return toJson().toString();
    }
}
