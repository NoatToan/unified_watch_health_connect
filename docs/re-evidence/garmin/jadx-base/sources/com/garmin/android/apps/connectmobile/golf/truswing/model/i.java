package com.garmin.android.apps.connectmobile.golf.truswing.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class i extends s1 implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f35934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f35935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f35936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f35937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f35939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f35940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f35941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f35942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f35943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f35944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f35945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f35946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f35947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f35948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j f35949p;

    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(Parcel parcel) {
        this.f35934a = parcel.readDouble();
        this.f35935b = parcel.readDouble();
        this.f35936c = parcel.readDouble();
        this.f35937d = parcel.readDouble();
        this.f35938e = parcel.readByte() != 0;
        this.f35939f = parcel.readDouble();
        this.f35940g = parcel.readDouble();
        this.f35941h = parcel.readDouble();
        this.f35942i = parcel.readDouble();
        this.f35943j = parcel.readDouble();
        this.f35944k = parcel.readDouble();
        this.f35945l = parcel.readDouble();
        this.f35946m = parcel.readDouble();
        this.f35947n = parcel.readDouble();
        this.f35948o = parcel.readDouble();
        this.f35949p = (j) parcel.readParcelable(j.class.getClassLoader());
    }

    public static boolean C(double d14, double d15) {
        return (Double.isNaN(d14) && Double.isNaN(d15)) || Math.ceil(d14) == Math.ceil(d15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C(iVar.f35934a, this.f35934a) && C(iVar.f35935b, this.f35935b) && C(iVar.f35936c, this.f35936c) && C(iVar.f35937d, this.f35937d) && C(iVar.f35939f, this.f35939f) && C(iVar.f35940g, this.f35940g) && C(iVar.f35941h, this.f35941h) && C(iVar.f35942i, this.f35942i) && C(iVar.f35943j, this.f35943j) && C(iVar.f35944k, this.f35944k) && C(iVar.f35945l, this.f35945l) && C(iVar.f35946m, this.f35946m) && C(iVar.f35947n, this.f35947n) && C(iVar.f35948o, this.f35948o);
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.f35934a), Double.valueOf(this.f35935b), Double.valueOf(this.f35936c), Double.valueOf(this.f35937d), Double.valueOf(this.f35939f), Double.valueOf(this.f35940g), Double.valueOf(this.f35941h), Double.valueOf(this.f35942i), Double.valueOf(this.f35943j), Double.valueOf(this.f35944k), Double.valueOf(this.f35945l), Double.valueOf(this.f35946m), Double.valueOf(this.f35947n), Double.valueOf(this.f35948o));
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f35934a = jSONObject.optDouble("speed");
            this.f35935b = jSONObject.optDouble("backswingTime");
            this.f35936c = jSONObject.optDouble("downswingTime");
            this.f35937d = jSONObject.optDouble("tempo");
            this.f35938e = jSONObject.optBoolean("impact");
            this.f35939f = jSONObject.optDouble("shaftLeanAddress");
            this.f35940g = jSONObject.optDouble("shaftAngleAddress");
            this.f35941h = jSONObject.optDouble("clubPathImpact");
            this.f35942i = jSONObject.optDouble("faceAngleImpact");
            this.f35943j = jSONObject.optDouble("faceTargetImpact");
            this.f35944k = jSONObject.optDouble("angleAttackImpact");
            this.f35945l = jSONObject.optDouble("clubLoftImpact");
            this.f35946m = jSONObject.optDouble("clubLoftOffset");
            this.f35947n = jSONObject.optDouble("shaftLeanImpact");
            this.f35948o = jSONObject.optDouble("shaftAngleImpact");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("frontVectors");
            j jVar = new j();
            jVar.k(jSONObjectOptJSONObject);
            this.f35949p = jVar;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeDouble(this.f35934a);
        parcel.writeDouble(this.f35935b);
        parcel.writeDouble(this.f35936c);
        parcel.writeDouble(this.f35937d);
        parcel.writeByte(this.f35938e ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.f35939f);
        parcel.writeDouble(this.f35940g);
        parcel.writeDouble(this.f35941h);
        parcel.writeDouble(this.f35942i);
        parcel.writeDouble(this.f35943j);
        parcel.writeDouble(this.f35944k);
        parcel.writeDouble(this.f35945l);
        parcel.writeDouble(this.f35946m);
        parcel.writeDouble(this.f35947n);
        parcel.writeDouble(this.f35948o);
        parcel.writeParcelable(this.f35949p, i14);
    }

    public i() {
    }
}
