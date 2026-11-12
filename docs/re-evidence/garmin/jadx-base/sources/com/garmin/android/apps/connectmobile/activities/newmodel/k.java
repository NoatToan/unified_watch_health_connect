package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class k extends s1 implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("running")
    private List<String> f29581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("swimming")
    private List<String> f29582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("hiking")
    private List<String> f29583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("cycling")
    private List<String> f29584d;

    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(Parcel parcel) {
        this.f29581a = new ArrayList();
        this.f29582b = new ArrayList();
        this.f29583c = new ArrayList();
        this.f29584d = new ArrayList();
        parcel.readList(this.f29581a, k.class.getClassLoader());
        parcel.readList(this.f29582b, k.class.getClassLoader());
        parcel.readList(this.f29583c, k.class.getClassLoader());
        parcel.readList(this.f29584d, k.class.getClassLoader());
    }

    public static ArrayList D(JSONArray jSONArray) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                try {
                    if (!jSONArray.isNull(i14) && (obj = jSONArray.get(i14)) != null && (obj instanceof String)) {
                        arrayList.add((String) obj);
                    }
                } catch (JSONException e4) {
                    i2.e(a2.ACTIVITIES, "AvailableMetricsDTO", e4);
                }
            }
        }
        return arrayList;
    }

    public final boolean C() {
        List<String> list = this.f29584d;
        return list != null && list.contains("maxAvgPower_1");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        a2 a2Var = a2.ACTIVITIES;
        String str = "loadFromJson: " + jSONObject.toString();
        i2.f36769a.getClass();
        i2.a.k(a2Var, "AvailableMetricsDTO", str);
        this.f29581a = D(jSONObject.optJSONArray("running"));
        this.f29582b = D(jSONObject.optJSONArray("swimming"));
        this.f29583c = D(jSONObject.optJSONArray("hiking"));
        this.f29584d = D(jSONObject.optJSONArray("cycling"));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvailableMetricsDTO [cycling = ");
        sb3.append(this.f29584d);
        sb3.append(", running = ");
        sb3.append(this.f29581a);
        sb3.append(", hiking = ");
        sb3.append(this.f29583c);
        sb3.append(", swimming = ");
        return u62.z.c(sb3, this.f29582b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeList(this.f29581a);
        parcel.writeList(this.f29582b);
        parcel.writeList(this.f29583c);
        parcel.writeList(this.f29584d);
    }

    public k() {
    }
}
