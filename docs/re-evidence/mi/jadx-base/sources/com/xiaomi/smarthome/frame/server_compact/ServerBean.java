package com.xiaomi.smarthome.frame.server_compact;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ServerBean implements Parcelable, Cloneable {
    public static final Parcelable.Creator<ServerBean> CREATOR = new Parcelable.Creator<ServerBean>() { // from class: com.xiaomi.smarthome.frame.server_compact.ServerBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServerBean createFromParcel(Parcel parcel) {
            return new ServerBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServerBean[] newArray(int i) {
            return new ServerBean[i];
        }
    };
    public final String countryCode;
    public final String machineCode;
    public transient String name;

    public ServerBean(String str, String str2, String str3) {
        this.machineCode = str;
        this.countryCode = str2;
        this.name = str3;
    }

    public static ServerBean formJson(JSONObject jSONObject) throws JSONException {
        return new ServerBean(jSONObject.getString("machineCode"), jSONObject.getString("countryCode"), jSONObject.optString("name"));
    }

    public static ServerBean fromCountryAndMachineCode(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("countryCode or machineCode is empty!");
        }
        return new ServerBean(str2, str, "");
    }

    public static List<ServerBean> parse(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(formJson(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return new ServerBean(this.machineCode, this.countryCode, "");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String dump() {
        return "ServerBean: " + this.countryCode + " : " + this.machineCode + " ";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerBean serverBean = (ServerBean) obj;
        if (this.machineCode.equals(serverBean.machineCode)) {
            return this.countryCode.equals(serverBean.countryCode);
        }
        return false;
    }

    public int hashCode() {
        return (this.machineCode.hashCode() * 31) + this.countryCode.hashCode();
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("machineCode", this.machineCode);
            jSONObject.put("countryCode", this.countryCode);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String toString() {
        return toJson();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.machineCode);
        parcel.writeString(this.countryCode);
    }

    public ServerBean(Parcel parcel) {
        this.name = "";
        this.machineCode = parcel.readString();
        this.countryCode = parcel.readString();
    }
}
