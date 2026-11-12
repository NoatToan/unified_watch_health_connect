package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/f0;", "Landroid/os/Parcelable;", "", "totalValue", "", "userProfilePk", "", "allPrivate", "", "rank", "todayValue", "", "lastSyncTime", "Lb12/b;", "userProfileImageData", "fullName", "displayName", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Lb12/b;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Double;", "h", "()Ljava/lang/Double;", "b", "Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "c", "Z", "d", "()Z", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "getTodayValue", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f38147k = b12.b.f14385f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalValue")
    private final Double totalValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("allPrivate")
    private final boolean allPrivate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rank")
    private final Integer rank;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("todayValue")
    private final Double todayValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastSyncTime")
    private final String lastSyncTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient b12.b f38154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient String f38155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient String f38156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f38157j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f0> {
        @Override // android.os.Parcelable.Creator
        public final f0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f0(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), (b12.b) parcel.readParcelable(f0.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f0[] newArray(int i14) {
            return new f0[i14];
        }
    }

    public /* synthetic */ f0(Double d14, Long l14, boolean z14, Integer num, Double d15, String str, b12.b bVar, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : d15, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? null : bVar, (i14 & 128) != 0 ? null : str2, (i14 & 256) != 0 ? null : str3);
    }

    public static f0 b(f0 f0Var, b12.b bVar, String str, String str2) {
        return new f0(f0Var.totalValue, f0Var.userProfilePk, f0Var.allPrivate, f0Var.rank, f0Var.todayValue, f0Var.lastSyncTime, bVar, str, str2);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAllPrivate() {
        return this.allPrivate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p005kotlin.jvm.internal.s.g(this.totalValue, f0Var.totalValue) && p005kotlin.jvm.internal.s.g(this.userProfilePk, f0Var.userProfilePk) && this.allPrivate == f0Var.allPrivate && p005kotlin.jvm.internal.s.g(this.rank, f0Var.rank) && p005kotlin.jvm.internal.s.g(this.todayValue, f0Var.todayValue) && p005kotlin.jvm.internal.s.g(this.lastSyncTime, f0Var.lastSyncTime) && p005kotlin.jvm.internal.s.g(this.f38154g, f0Var.f38154g) && p005kotlin.jvm.internal.s.g(this.f38155h, f0Var.f38155h) && p005kotlin.jvm.internal.s.g(this.f38156i, f0Var.f38156i);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLastSyncTime() {
        return this.lastSyncTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getTotalValue() {
        return this.totalValue;
    }

    public final int hashCode() {
        Double d14 = this.totalValue;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Long l14 = this.userProfilePk;
        int iG = q6.f.g((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.allPrivate);
        Integer num = this.rank;
        int iHashCode2 = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Double d15 = this.todayValue;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str = this.lastSyncTime;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        b12.b bVar = this.f38154g;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f38155h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38156i;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getUserProfilePk() {
        return this.userProfilePk;
    }

    public final String toString() {
        Double d14 = this.totalValue;
        Long l14 = this.userProfilePk;
        boolean z14 = this.allPrivate;
        Integer num = this.rank;
        Double d15 = this.todayValue;
        String str = this.lastSyncTime;
        StringBuilder sb3 = new StringBuilder("UserStatDTO(totalValue=");
        sb3.append(d14);
        sb3.append(", userProfilePk=");
        sb3.append(l14);
        sb3.append(", allPrivate=");
        sb3.append(z14);
        sb3.append(", rank=");
        sb3.append(num);
        sb3.append(", todayValue=");
        b71.i.u(sb3, d15, ", lastSyncTime=", str, ", userProfileImageData=");
        sb3.append(this.f38154g);
        sb3.append(", fullName=");
        sb3.append(this.f38155h);
        sb3.append(", displayName=");
        return am.j.o(this.f38156i, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.totalValue;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Long l14 = this.userProfilePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeInt(this.allPrivate ? 1 : 0);
        Integer num = this.rank;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d15 = this.todayValue;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.lastSyncTime);
        parcel.writeParcelable(this.f38154g, i14);
        parcel.writeString(this.f38155h);
        parcel.writeString(this.f38156i);
    }

    public f0(Double d14, Long l14, boolean z14, Integer num, Double d15, String str, b12.b bVar, String str2, String str3) {
        this.totalValue = d14;
        this.userProfilePk = l14;
        this.allPrivate = z14;
        this.rank = num;
        this.todayValue = d15;
        this.lastSyncTime = str;
        this.f38154g = bVar;
        this.f38155h = str2;
        this.f38156i = str3;
        boolean z15 = false;
        if (l14 != null && ((int) l14.longValue()) == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()) {
            z15 = true;
        }
        this.f38157j = z15;
    }

    public f0() {
        this(null, null, false, null, null, null, null, null, null, 511, null);
    }
}
