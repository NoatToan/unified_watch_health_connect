package com.garmin.android.apps.connectmobile.golf.truswing.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b extends s1 implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f35899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f35900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f35901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35903g;

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
        this.f35897a = parcel.readInt();
        this.f35898b = parcel.readString();
        this.f35899c = parcel.readDouble();
        this.f35900d = parcel.readDouble();
        this.f35901e = parcel.readDouble();
        this.f35902f = parcel.readString();
        this.f35903g = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f35897a = jSONObject.optInt("value");
            this.f35898b = s1.u(jSONObject, "name");
            this.f35899c = jSONObject.optDouble("shaftLength");
            this.f35900d = jSONObject.optDouble("loftAngle");
            this.f35901e = jSONObject.optDouble("lieAngle");
            this.f35902f = s1.u(jSONObject, "displayRange");
            this.f35903g = jSONObject.optBoolean("valid");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f35897a);
        parcel.writeString(this.f35898b);
        parcel.writeDouble(this.f35899c);
        parcel.writeDouble(this.f35900d);
        parcel.writeDouble(this.f35901e);
        parcel.writeString(this.f35902f);
        parcel.writeByte(this.f35903g ? (byte) 1 : (byte) 0);
    }

    public b(int i14, String str, double d14, double d15, double d16, String str2) {
        this(i14, str, d14, d15, d16, str2, true);
    }

    public b(int i14, String str, double d14, double d15, double d16, String str2, boolean z14) {
        this.f35897a = i14;
        this.f35898b = str;
        this.f35899c = d14;
        this.f35900d = d15;
        this.f35901e = d16;
        this.f35902f = str2;
        this.f35903g = z14;
    }

    public b() {
    }
}
