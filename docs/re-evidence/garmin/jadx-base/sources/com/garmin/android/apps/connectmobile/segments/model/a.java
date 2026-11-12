package com.garmin.android.apps.connectmobile.segments.model;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/a;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f41341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f41342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f41343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f41344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f41340f = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C0784a();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.segments.model.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/model/a$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/a;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0784a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        parcel.getClass();
        this.f41341a = parcel.readDouble();
        this.f41342b = parcel.readDouble();
        this.f41343c = parcel.readDouble();
        this.f41344d = parcel.readDouble();
        this.f41345e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f41341a = jSONObject.optDouble("latitude");
        this.f41342b = jSONObject.optDouble("longitude");
        this.f41343c = jSONObject.optDouble("elevation");
        this.f41344d = jSONObject.optDouble("distance");
        this.f41345e = jSONObject.optLong("timestamp");
    }

    public final String toString() {
        double d14 = this.f41341a;
        double d15 = this.f41342b;
        double d16 = this.f41343c;
        double d17 = this.f41344d;
        long j8 = this.f41345e;
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("GeoPointDTO [latitude=", d14, ", longitude=");
        sbA.append(d15);
        j.x(sbA, ", elevation=", d16, ", distance=");
        sbA.append(d17);
        return com.nimbusds.jose.shaded.gson.internal.a.g(j8, ", timestamp=", "]", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.f41341a);
        parcel.writeDouble(this.f41342b);
        parcel.writeDouble(this.f41343c);
        parcel.writeDouble(this.f41344d);
        parcel.writeLong(this.f41345e);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/a$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/a;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "KEY_LATITUDE", "Ljava/lang/String;", "KEY_LONGITUDE", "KEY_ELEVATION", "KEY_DISTANCE", "KEY_TIMESTAMP", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public a() {
    }
}
