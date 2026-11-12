package com.xiaomi.fitness.common.devicelist;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceModel$Device implements Serializable {
    private static final long serialVersionUID = 9876543219000001L;

    @SerializedName("dev_name")
    public String devName;
    public String did;
    public Map<String, String> extra_values;

    @SerializedName("last_conn_time")
    public long lastConnectTime;
    public String mac;
    public String model;
    public String name;

    @SerializedName("pd_id")
    public int productId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceModel$Device) {
            return ((DeviceModel$Device) obj).did.equals(this.did);
        }
        return false;
    }

    public String getEncryptKey() {
        Map<String, String> map = this.extra_values;
        String str = map != null ? map.get("encrypt_key") : null;
        return str == null ? "" : str;
    }

    public String getHuamiAuthKey() {
        Map<String, String> map = this.extra_values;
        if (map != null) {
            return map.get("auth_key");
        }
        return null;
    }

    public String getHuamiMac() {
        Map<String, String> map = this.extra_values;
        if (map != null) {
            return map.get("mac_address");
        }
        return null;
    }

    public String getIRKey() {
        Map<String, String> map = this.extra_values;
        if (map != null) {
            return map.get("irq_key");
        }
        return null;
    }

    public String getMac() {
        String str = this.mac;
        if (str != null) {
            return str.toUpperCase();
        }
        return null;
    }

    public String getName() {
        return TextUtils.isEmpty(this.name) ? this.devName : this.name;
    }

    public String getNodeId() {
        Map<String, String> map = this.extra_values;
        if (map != null) {
            return map.get("third_node_id");
        }
        return null;
    }

    public String getSN() {
        Map<String, String> map = this.extra_values;
        if (map != null) {
            return map.get("sn");
        }
        return null;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setSN(String str) {
        if (this.extra_values == null) {
            this.extra_values = new HashMap();
        }
        this.extra_values.put("sn", str);
    }
}
