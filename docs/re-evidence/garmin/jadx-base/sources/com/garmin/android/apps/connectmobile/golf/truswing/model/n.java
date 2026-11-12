package com.garmin.android.apps.connectmobile.golf.truswing.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B»\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/truswing/model/n;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "avgApexHeight", "avgAttackAngle", "avgBallSpeed", "avgCarryDistance", "avgClubFaceAngle", "avgClubPathAngle", "avgClubSpeed", "avgDistance", "avgSmashFactor", "avgSwingTempo", "avgTotalDistance", "avgVirtualLaunchAngle", "", "clubId", "", "lastModifiedTime", "maxBallSpeed", "maxCarryDistance", "maxClubHeadSpeed", "maxTotalDistance", "<init>", "(DDDDDDDDDDDDJLjava/lang/String;DDDD)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends s1 implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f35981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f35982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f35983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f35984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f35985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f35986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f35987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f35988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f35989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f35990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f35991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f35992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f35993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f35994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f35995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f35996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f35997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f35998r;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, double d28, double d29, long j8, String str, double d34, double d35, double d36, double d37, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0.0d : d14, (i14 & 2) != 0 ? 0.0d : d15, (i14 & 4) != 0 ? 0.0d : d16, (i14 & 8) != 0 ? 0.0d : d17, (i14 & 16) != 0 ? 0.0d : d18, (i14 & 32) != 0 ? 0.0d : d19, (i14 & 64) != 0 ? 0.0d : d24, (i14 & 128) != 0 ? 0.0d : d25, (i14 & 256) != 0 ? 0.0d : d26, (i14 & 512) != 0 ? 0.0d : d27, (i14 & 1024) != 0 ? 0.0d : d28, (i14 & 2048) != 0 ? 0.0d : d29, (i14 & 4096) != 0 ? 0L : j8, (i14 & 8192) != 0 ? "" : str, (i14 & 16384) != 0 ? 0.0d : d34, (i14 & 32768) != 0 ? 0.0d : d35, (i14 & 65536) != 0 ? 0.0d : d36, (i14 & 131072) != 0 ? 0.0d : d37);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f35981a = jSONObject.optDouble("avgApexHeight", 0.0d);
            this.f35982b = jSONObject.optDouble("avgAttackAngle", 0.0d);
            this.f35983c = jSONObject.optDouble("avgBallSpeed", 0.0d);
            this.f35984d = jSONObject.optDouble("avgCarryDistance", 0.0d);
            this.f35985e = jSONObject.optDouble("avgClubFaceAngle", 0.0d);
            this.f35986f = jSONObject.optDouble("avgClubPathAngle", 0.0d);
            this.f35987g = jSONObject.optDouble("avgClubSpeed", 0.0d);
            this.f35988h = jSONObject.optDouble("avgDistance", 0.0d);
            this.f35989i = jSONObject.optDouble("avgSmashFactor", 0.0d);
            this.f35990j = jSONObject.optDouble("avgSwingTempo", 0.0d);
            this.f35991k = jSONObject.optDouble("avgTotalDistance", 0.0d);
            this.f35992l = jSONObject.optDouble("avgVirtualLaunchAngle", 0.0d);
            this.f35993m = jSONObject.optLong("clubId", 0L);
            String strOptString = jSONObject.optString("lastModifiedTime", "");
            strOptString.getClass();
            this.f35994n = strOptString;
            this.f35995o = jSONObject.optDouble("maxBallSpeed", 0.0d);
            this.f35996p = jSONObject.optDouble("maxCarryDistance", 0.0d);
            this.f35997q = jSONObject.optDouble("maxClubHeadSpeed", 0.0d);
            this.f35998r = jSONObject.optDouble("maxTotalDistance", 0.0d);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.f35981a);
        parcel.writeDouble(this.f35982b);
        parcel.writeDouble(this.f35983c);
        parcel.writeDouble(this.f35984d);
        parcel.writeDouble(this.f35985e);
        parcel.writeDouble(this.f35986f);
        parcel.writeDouble(this.f35987g);
        parcel.writeDouble(this.f35988h);
        parcel.writeDouble(this.f35989i);
        parcel.writeDouble(this.f35990j);
        parcel.writeDouble(this.f35991k);
        parcel.writeDouble(this.f35992l);
        parcel.writeLong(this.f35993m);
        parcel.writeString(this.f35994n);
        parcel.writeDouble(this.f35995o);
        parcel.writeDouble(this.f35996p);
        parcel.writeDouble(this.f35997q);
        parcel.writeDouble(this.f35998r);
    }

    public n(double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, double d28, double d29, long j8, String str, double d34, double d35, double d36, double d37) {
        str.getClass();
        this.f35981a = d14;
        this.f35982b = d15;
        this.f35983c = d16;
        this.f35984d = d17;
        this.f35985e = d18;
        this.f35986f = d19;
        this.f35987g = d24;
        this.f35988h = d25;
        this.f35989i = d26;
        this.f35990j = d27;
        this.f35991k = d28;
        this.f35992l = d29;
        this.f35993m = j8;
        this.f35994n = str;
        this.f35995o = d34;
        this.f35996p = d35;
        this.f35997q = d36;
        this.f35998r = d37;
    }

    public n() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0L, null, 0.0d, 0.0d, 0.0d, 0.0d, 262143, null);
    }
}
