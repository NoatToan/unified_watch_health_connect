package com.xiaomi.hm.health.model.account.secondaryscreen;

import com.huami.tools.log.HMLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class SecondaryModel {
    private static final String TAG = "SecondaryModel";
    private boolean enable;
    private int index;
    private boolean newProtocal;
    private int parentType;
    private int type;
    private boolean updated;

    public SecondaryModel(int i, int i2, boolean z, int i3, boolean z2) {
        this.newProtocal = false;
        this.updated = false;
        this.type = i2;
        this.enable = z;
        this.index = i3;
        this.parentType = i;
        this.newProtocal = z2;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof SecondaryModel) && ((SecondaryModel) obj).getType() == this.type;
    }

    public int getIndex() {
        return this.index;
    }

    public int getParentType() {
        return this.parentType;
    }

    public int getType() {
        return this.type;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isNewProtocal() {
        return this.newProtocal;
    }

    public boolean isUpdated() {
        return this.updated;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setUpdated(boolean z) {
        this.updated = z;
    }

    public String toString() {
        String string = "";
        if (this.newProtocal) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", this.type);
                jSONObject.put("enable", this.enable);
                jSONObject.put("index", this.index);
                jSONObject.put(SecondaryScreen.KEY_PARENT, this.parentType);
                string = jSONObject.toString();
                HMLog.d(TAG, "jsonObjecgt " + string, new Object[0]);
                return string;
            } catch (Exception unused) {
                return string;
            }
        }
        try {
            if (this.index != -1) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", this.type);
                jSONObject2.put("enable", this.enable);
                jSONObject2.put("index", this.index);
                jSONObject2.put(SecondaryScreen.KEY_UPDATED, this.updated);
                string = jSONObject2.toString();
                HMLog.d(TAG, "jsonObjecgt " + string, new Object[0]);
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type", this.type);
                string = jSONObject3.toString();
                HMLog.d(TAG, "jsonObject " + string, new Object[0]);
            }
        } catch (Exception unused2) {
        }
        HMLog.d(TAG, "toString " + string, new Object[0]);
        return string;
    }

    public SecondaryModel(int i, boolean z, int i2) {
        this.newProtocal = false;
        this.updated = false;
        this.type = i;
        this.enable = z;
        this.index = i2;
    }

    public SecondaryModel(int i, boolean z, int i2, boolean z2) {
        this.newProtocal = false;
        this.updated = false;
        this.type = i;
        this.enable = z;
        this.index = i2;
        this.updated = z2;
    }
}
