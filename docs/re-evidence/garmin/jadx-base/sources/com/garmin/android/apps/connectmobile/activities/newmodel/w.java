package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class w extends s1 implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(TtmlNode.START)
    private a0 f29688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(TtmlNode.END)
    private a0 f29689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("minLat")
    private double f29690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("maxLat")
    private double f29691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("minLon")
    private double f29692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("maxLon")
    private double f29693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("polyline")
    private List<a0> f29694g;

    public class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            return new w(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public w(Parcel parcel) {
        this.f29688a = (a0) parcel.readParcelable(a0.class.getClassLoader());
        this.f29689b = (a0) parcel.readParcelable(a0.class.getClassLoader());
        this.f29690c = parcel.readDouble();
        this.f29691d = parcel.readDouble();
        this.f29692e = parcel.readDouble();
        this.f29693f = parcel.readDouble();
        int i14 = parcel.readInt();
        if (i14 > 0) {
            if (this.f29694g == null) {
                this.f29694g = new ArrayList();
            }
            ClassLoader classLoader = a0.class.getClassLoader();
            for (int i15 = 0; i15 < i14; i15++) {
                this.f29694g.add((a0) parcel.readParcelable(classLoader));
            }
        }
    }

    public final List<a0> C() {
        return this.f29694g;
    }

    public final void D(List<a0> list) {
        this.f29694g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            if (!jSONObject.isNull(TtmlNode.START)) {
                a0 a0Var = new a0();
                this.f29688a = a0Var;
                a0Var.k(jSONObject.getJSONObject(TtmlNode.START));
            }
            if (!jSONObject.isNull(TtmlNode.END)) {
                a0 a0Var2 = new a0();
                this.f29689b = a0Var2;
                a0Var2.k(jSONObject.getJSONObject(TtmlNode.END));
            }
            this.f29690c = jSONObject.optDouble("minLat", 0.0d);
            this.f29691d = jSONObject.optDouble("maxLat", 0.0d);
            this.f29692e = jSONObject.optDouble("minLon", 0.0d);
            this.f29693f = jSONObject.optDouble("maxLon", 0.0d);
            if (jSONObject.isNull("polyline")) {
                return;
            }
            this.f29694g = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("polyline");
            Parcelable.Creator<a0> creator = a0.CREATOR;
            int length = jSONArray.length();
            a0[] a0VarArr = new a0[length];
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                a0 a0Var3 = new a0();
                a0Var3.k(jSONObject2);
                a0VarArr[i14] = a0Var3;
            }
            for (int i15 = 0; i15 < length; i15++) {
                this.f29694g.add(a0VarArr[i15]);
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GeoPolylineDTO [start=");
        sb3.append(this.f29688a);
        sb3.append(", end=");
        sb3.append(this.f29689b);
        sb3.append(", minLat=");
        sb3.append(this.f29690c);
        sb3.append(", maxLat=");
        sb3.append(this.f29691d);
        sb3.append(", minLon=");
        sb3.append(this.f29692e);
        sb3.append(", maxLon=");
        sb3.append(this.f29693f);
        sb3.append(", polylineDTO=");
        return u62.z.c(sb3, this.f29694g, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeParcelable(this.f29688a, 0);
        parcel.writeParcelable(this.f29689b, 0);
        parcel.writeDouble(this.f29690c);
        parcel.writeDouble(this.f29691d);
        parcel.writeDouble(this.f29692e);
        parcel.writeDouble(this.f29693f);
        List<a0> list = this.f29694g;
        if (list == null || list.isEmpty()) {
            parcel.writeInt(0);
            return;
        }
        int size = this.f29694g.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeParcelable(this.f29694g.get(i15), 0);
        }
    }

    public w() {
    }

    public w(a0 a0Var, a0 a0Var2, double d14, double d15, double d16, double d17, List<a0> list) {
        this.f29688a = a0Var;
        this.f29689b = a0Var2;
        this.f29690c = d14;
        this.f29691d = d15;
        this.f29692e = d16;
        this.f29693f = d17;
        this.f29694g = list;
    }
}
