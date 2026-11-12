package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/q;", "Landroid/os/Parcelable;", "", "deviceId", "", "deviceTypePk", "deviceVersionPk", "<init>", "(Ljava/lang/String;JJ)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "J", "getDeviceTypePk", "()J", "c", "getDeviceVersionPk", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final String deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceTypePk")
    private final long deviceTypePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceVersionPk")
    private final long deviceVersionPk;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new q(parcel.readString(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ q(String str, long j8, long j14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? -1L : j8, (i14 & 4) != 0 ? -1L : j14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.deviceId, qVar.deviceId) && this.deviceTypePk == qVar.deviceTypePk && this.deviceVersionPk == qVar.deviceVersionPk;
    }

    public final int hashCode() {
        String str = this.deviceId;
        return Long.hashCode(this.deviceVersionPk) + q6.f.e((str == null ? 0 : str.hashCode()) * 31, 31, this.deviceTypePk);
    }

    public final String toString() {
        String str = this.deviceId;
        return com.nimbusds.jose.shaded.gson.internal.a.g(this.deviceVersionPk, ", deviceVersionPk=", ")", com.nimbusds.jose.shaded.gson.internal.a.j(this.deviceTypePk, "DeviceMetadataDTO(deviceId=", str, ", deviceTypePk="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.deviceId);
        parcel.writeLong(this.deviceTypePk);
        parcel.writeLong(this.deviceVersionPk);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/q$a;", "", "<init>", "()V", "", "NO_DATA", "J", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public q(String str, long j8, long j14) {
        this.deviceId = str;
        this.deviceTypePk = j8;
        this.deviceVersionPk = j14;
    }

    public q() {
        this(null, 0L, 0L, 7, null);
    }
}
