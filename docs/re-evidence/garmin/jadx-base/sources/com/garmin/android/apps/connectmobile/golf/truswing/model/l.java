package com.garmin.android.apps.connectmobile.golf.truswing.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/truswing/model/l;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "averageDistance", "averageSpeed", "", TtmlNode.ATTR_ID, "", "lastModifiedTime", "maxLifetimeDistance", "percentFairwayHit", "percentFairwayLeft", "percentFairwayRight", "percentGreenHit", "percentGreenMissLeft", "percentGreenMissLong", "percentGreenMissRight", "percentGreenMissShort", "", "shotsCount", "swingCount", "<init>", "(DDJLjava/lang/String;DDDDDDDDDII)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends s1 implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f35965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f35966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f35967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f35969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f35970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f35971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f35972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f35973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f35974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f35975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f35976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f35977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35979o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readDouble(), parcel.readDouble(), parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(double d14, double d15, long j8, String str, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, double d28, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 0.0d : d14, (i16 & 2) != 0 ? 0.0d : d15, (i16 & 4) != 0 ? 0L : j8, (i16 & 8) != 0 ? "" : str, (i16 & 16) != 0 ? 0.0d : d16, (i16 & 32) != 0 ? 0.0d : d17, (i16 & 64) != 0 ? 0.0d : d18, (i16 & 128) != 0 ? 0.0d : d19, (i16 & 256) != 0 ? 0.0d : d24, (i16 & 512) != 0 ? 0.0d : d25, (i16 & 1024) != 0 ? 0.0d : d26, (i16 & 2048) != 0 ? 0.0d : d27, (i16 & 4096) != 0 ? 0.0d : d28, (i16 & 8192) != 0 ? 0 : i14, (i16 & 16384) != 0 ? 0 : i15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f35965a = jSONObject.optDouble("averageDistance", 0.0d);
            this.f35966b = jSONObject.optDouble("averageSpeed", 0.0d);
            this.f35967c = jSONObject.optLong(TtmlNode.ATTR_ID, 0L);
            String strOptString = jSONObject.optString("lastModifiedTime", "");
            strOptString.getClass();
            this.f35968d = strOptString;
            this.f35969e = jSONObject.optDouble("maxLifetimeDistance", 0.0d);
            this.f35970f = jSONObject.optDouble("percentFairwayHit", 0.0d);
            this.f35971g = jSONObject.optDouble("percentFairwayLeft", 0.0d);
            this.f35972h = jSONObject.optDouble("percentFairwayRight", 0.0d);
            this.f35973i = jSONObject.optDouble("percentGreenHit", 0.0d);
            this.f35974j = jSONObject.optDouble("percentGreenMissLeft", 0.0d);
            this.f35975k = jSONObject.optDouble("percentGreenMissLong", 0.0d);
            this.f35976l = jSONObject.optDouble("percentGreenMissRight", 0.0d);
            this.f35977m = jSONObject.optDouble("percentGreenMissShort", 0.0d);
            this.f35978n = jSONObject.optInt("shotsCount", 0);
            this.f35979o = jSONObject.optInt("swingCount", 0);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.f35965a);
        parcel.writeDouble(this.f35966b);
        parcel.writeLong(this.f35967c);
        parcel.writeString(this.f35968d);
        parcel.writeDouble(this.f35969e);
        parcel.writeDouble(this.f35970f);
        parcel.writeDouble(this.f35971g);
        parcel.writeDouble(this.f35972h);
        parcel.writeDouble(this.f35973i);
        parcel.writeDouble(this.f35974j);
        parcel.writeDouble(this.f35975k);
        parcel.writeDouble(this.f35976l);
        parcel.writeDouble(this.f35977m);
        parcel.writeInt(this.f35978n);
        parcel.writeInt(this.f35979o);
    }

    public l(double d14, double d15, long j8, String str, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, double d28, int i14, int i15) {
        str.getClass();
        this.f35965a = d14;
        this.f35966b = d15;
        this.f35967c = j8;
        this.f35968d = str;
        this.f35969e = d16;
        this.f35970f = d17;
        this.f35971g = d18;
        this.f35972h = d19;
        this.f35973i = d24;
        this.f35974j = d25;
        this.f35975k = d26;
        this.f35976l = d27;
        this.f35977m = d28;
        this.f35978n = i14;
        this.f35979o = i15;
    }

    public l() {
        this(0.0d, 0.0d, 0L, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 32767, null);
    }
}
