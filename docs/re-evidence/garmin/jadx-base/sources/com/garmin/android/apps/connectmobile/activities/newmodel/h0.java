package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("stepIndex")
    private int f29468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("name")
    private String f29469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("intensity")
    private String f29470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("durationType")
    private String f29471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("durationValue")
    private long f29472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("targetType")
    private String f29473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("targetValue")
    private Double f29474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SerializedName("targetValueLow")
    private Double f29475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("targetValueHigh")
    private Double f29476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("notes")
    private String f29477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("equipmentType")
    private String f29478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("exerciseCategory")
    private String f29479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("exerciseName")
    private String f29480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("exerciseWeightValue")
    private int f29481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SerializedName("weightDisplayUnit")
    private String f29482o;

    public class a implements Parcelable.Creator<h0> {
        @Override // android.os.Parcelable.Creator
        public final h0 createFromParcel(Parcel parcel) {
            return new h0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h0[] newArray(int i14) {
            return new h0[i14];
        }
    }

    public h0(Parcel parcel) {
        this.f29468a = parcel.readInt();
        this.f29469b = parcel.readString();
        this.f29470c = parcel.readString();
        this.f29471d = parcel.readString();
        this.f29472e = parcel.readLong();
        this.f29473f = parcel.readString();
        if (parcel.readByte() == 0) {
            this.f29474g = null;
        } else {
            this.f29474g = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.f29475h = null;
        } else {
            this.f29475h = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.f29476i = null;
        } else {
            this.f29476i = Double.valueOf(parcel.readDouble());
        }
        this.f29477j = parcel.readString();
        this.f29478k = parcel.readString();
        this.f29479l = parcel.readString();
        this.f29480m = parcel.readString();
        this.f29481n = parcel.readInt();
        this.f29482o = parcel.readString();
    }

    public final String b() {
        return this.f29470c;
    }

    public final int d() {
        return this.f29468a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.f29473f;
    }

    public final Double g() {
        return this.f29474g;
    }

    public final Double h() {
        return this.f29476i;
    }

    public final Double i() {
        return this.f29475h;
    }

    public final boolean j() {
        String str = this.f29473f;
        return str != null && str.equals("POWER");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f29468a);
        parcel.writeString(this.f29469b);
        parcel.writeString(this.f29470c);
        parcel.writeString(this.f29471d);
        parcel.writeLong(this.f29472e);
        parcel.writeString(this.f29473f);
        if (this.f29474g == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.f29474g.doubleValue());
        }
        if (this.f29475h == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.f29475h.doubleValue());
        }
        if (this.f29476i == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.f29476i.doubleValue());
        }
        parcel.writeString(this.f29477j);
        parcel.writeString(this.f29478k);
        parcel.writeString(this.f29479l);
        parcel.writeString(this.f29480m);
        parcel.writeInt(this.f29481n);
        parcel.writeString(this.f29482o);
    }
}
