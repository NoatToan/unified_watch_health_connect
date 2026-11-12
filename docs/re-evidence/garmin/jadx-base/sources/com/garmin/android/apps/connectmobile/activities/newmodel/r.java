package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import org.json.JSONObject;
import ps.z1;

/* JADX INFO: loaded from: classes7.dex */
public class r extends s1 implements Parcelable, Comparable<r> {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f29643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f29644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f29647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z1 f29650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z1 f29652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f29653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z1 f29654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f29655n;

    public class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public r(Parcel parcel) {
        this.f29642a = parcel.readInt();
        this.f29643b = parcel.readDouble();
        this.f29644c = parcel.readDouble();
        this.f29645d = parcel.readInt();
        this.f29646e = parcel.readInt();
        this.f29647f = parcel.readDouble();
        this.f29648g = parcel.readString();
        this.f29649h = parcel.readInt();
        this.f29650i = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.f29651j = parcel.readInt();
        this.f29652k = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.f29653l = parcel.readDouble();
        this.f29654m = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.f29655n = parcel.readDouble();
    }

    public final boolean C() {
        int i14 = this.f29642a;
        return i14 == 0 || i14 == 1 || this.f29643b > 0.0d || this.f29644c > 0.0d || this.f29645d > 0 || this.f29647f > 0.0d || !TextUtils.isEmpty(this.f29648g) || this.f29649h > 0 || this.f29651j > 0 || this.f29653l > 0.0d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(r rVar) {
        return Integer.compare(this.f29646e, rVar.f29646e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f29642a = jSONObject.optInt("gasMode", 255);
        this.f29643b = jSONObject.optDouble("heliumContent", 0.0d);
        this.f29644c = jSONObject.optDouble("oxygenContent", 0.0d);
        this.f29645d = jSONObject.optInt("status", 0);
        this.f29646e = jSONObject.optInt("gasIndex", 0);
        this.f29647f = jSONObject.optDouble("volume", 0.0d);
        this.f29648g = s1.u(jSONObject, "tankType");
        this.f29649h = jSONObject.optInt("tankStartingPressure", -1);
        if (!jSONObject.isNull("tankStartingPressureUnit")) {
            this.f29650i = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("tankStartingPressureUnit").toString(), z1.class);
        }
        this.f29651j = jSONObject.optInt("tankEndingPressure", -1);
        if (!jSONObject.isNull("tankEndingPressureUnit")) {
            this.f29652k = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("tankEndingPressureUnit").toString(), z1.class);
        }
        this.f29653l = jSONObject.optDouble("tankSize", 0.0d);
        if (!jSONObject.isNull("tankSizeUnit")) {
            this.f29654m = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("tankSizeUnit").toString(), z1.class);
        }
        this.f29655n = jSONObject.optDouble("sacRate", Double.NaN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f29642a);
        parcel.writeDouble(this.f29643b);
        parcel.writeDouble(this.f29644c);
        parcel.writeInt(this.f29645d);
        parcel.writeInt(this.f29646e);
        parcel.writeDouble(this.f29647f);
        parcel.writeString(this.f29648g);
        parcel.writeInt(this.f29649h);
        parcel.writeParcelable(this.f29650i, i14);
        parcel.writeInt(this.f29651j);
        parcel.writeParcelable(this.f29652k, i14);
        parcel.writeDouble(this.f29653l);
        parcel.writeParcelable(this.f29654m, i14);
        parcel.writeDouble(this.f29655n);
    }

    public r(int i14) {
        this.f29642a = 255;
        this.f29649h = -1;
        this.f29651j = -1;
        this.f29646e = i14;
        this.f29644c = -1.0d;
        this.f29643b = -1.0d;
    }

    public r() {
        this(0);
    }
}
