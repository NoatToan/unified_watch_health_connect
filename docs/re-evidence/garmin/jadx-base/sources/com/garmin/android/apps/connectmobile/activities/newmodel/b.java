package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b extends s1 implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("metrics")
    private List<Double> f29403a;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Parcel parcel) {
        int i14 = parcel.readInt();
        if (i14 > 0) {
            if (this.f29403a == null) {
                this.f29403a = new ArrayList();
            }
            for (int i15 = 0; i15 < i14; i15++) {
                this.f29403a.add(Double.valueOf(parcel.readDouble()));
            }
        }
    }

    public final List<Double> C() {
        return this.f29403a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject.isNull("metrics")) {
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("metrics");
        this.f29403a = new ArrayList();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            try {
                double d14 = Double.parseDouble(String.valueOf(jSONArray.get(i14)));
                Double dValueOf = Double.valueOf(d14);
                if (Double.isInfinite(d14)) {
                    throw new IllegalArgumentException("-Infinity or +Infinity is not a valid metric value");
                }
                this.f29403a.add(dValueOf);
            } catch (Exception unused) {
                this.f29403a.add(Double.valueOf(Double.NaN));
            }
        }
    }

    public final String toString() {
        return u62.z.c(new StringBuilder("ActivityDetailsMetricsDTO [metrics="), this.f29403a, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        List<Double> list = this.f29403a;
        if (list == null || list.isEmpty()) {
            parcel.writeInt(0);
            return;
        }
        int size = this.f29403a.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeDouble(this.f29403a.get(i15).doubleValue());
        }
    }

    public b() {
    }

    public b(List<Double> list) {
        this.f29403a = list;
    }
}
