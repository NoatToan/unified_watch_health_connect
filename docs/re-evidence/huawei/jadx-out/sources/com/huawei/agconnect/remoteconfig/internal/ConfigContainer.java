package com.huawei.agconnect.remoteconfig.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.remoteconfig.internal.server.Parameter;
import com.huawei.agconnect.remoteconfig.internal.utils.DataProcessingFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigContainer implements Parcelable {
    public static final Parcelable.Creator<ConfigContainer> CREATOR = new Parcelable.Creator<ConfigContainer>() { // from class: com.huawei.agconnect.remoteconfig.internal.ConfigContainer.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfigContainer[] newArray(int i) {
            return new ConfigContainer[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfigContainer createFromParcel(Parcel parcel) {
            return new ConfigContainer(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f5053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Map<String, String>> f5054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5055c;
    private long d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f5053a;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        parcel.writeString(jSONObject.toString());
        parcel.writeString(this.f5055c);
        parcel.writeLong(this.d);
        parcel.writeString((this.f5054b != null ? new JSONArray((Collection) this.f5054b) : new JSONArray()).toString());
    }

    public String c() {
        return this.f5055c;
    }

    public void b(long j) {
        this.d = j;
    }

    public JSONObject b() {
        return this.f5053a;
    }

    public boolean a(long j) {
        return System.currentTimeMillis() - this.d > j * 1000;
    }

    public List<Map<String, String>> a() {
        return this.f5054b;
    }

    public ConfigContainer(JSONObject jSONObject) {
        this.f5053a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public ConfigContainer(List<Parameter> list, List<Map<String, String>> list2, String str) {
        this.f5053a = DataProcessingFactory.a(list);
        this.f5054b = list2;
        this.f5055c = str;
        this.d = System.currentTimeMillis();
    }

    private ConfigContainer(Parcel parcel) {
        Logger.v("RemoteConfig", "read config container from cache");
        try {
            String string = parcel.readString();
            if (string == null || string.length() <= 0) {
                this.f5053a = new JSONObject();
            } else {
                this.f5053a = new JSONObject(string);
            }
        } catch (JSONException e) {
            Logger.e("RemoteConfig", "parcel json value format error", e);
            this.f5053a = new JSONObject();
        }
        this.f5055c = parcel.readString();
        this.d = parcel.readLong();
        try {
            String string2 = parcel.readString();
            this.f5054b = (string2 == null || string2.length() <= 0) ? new ArrayList<>() : DataProcessingFactory.a(new JSONArray(string2));
        } catch (JSONException e2) {
            Logger.e("RemoteConfig", "parcel json value format error", e2);
            this.f5054b = new ArrayList();
        }
    }
}
