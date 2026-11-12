package com.garmin.android.apps.connectmobile.badges.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/q;", "Landroid/os/Parcelable;", "", "userProfileId", "", "fullName", "displayName", "userLevel", "userPoint", "", "hasPrivate", "Lb12/b;", "userProfileImageData", "order", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IZLb12/b;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "getDisplayName", "g", JWKParameterNames.RSA_EXPONENT, "I", "h", "()I", "f", "Z", "()Z", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f30654j = b12.b.f14385f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final Integer userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private final Integer userLevel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userPoint")
    private final int userPoint;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasPrivate")
    private final boolean hasPrivate;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient b12.b f30661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Integer f30662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f30663i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer num;
            b12.b bVar;
            Integer numValueOf2;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                num = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String string = parcel.readString();
            Integer num2 = num;
            String string2 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
            int i14 = parcel.readInt();
            boolean z14 = parcel.readInt() != 0;
            b12.b bVar2 = (b12.b) parcel.readParcelable(q.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf2 = num2;
                bVar = bVar2;
            } else {
                bVar = bVar2;
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new q(numValueOf, string, string2, numValueOf3, i14, z14, bVar, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public /* synthetic */ q(Integer num, String str, String str2, Integer num2, int i14, boolean z14, b12.b bVar, Integer num3, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : num2, (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? false : z14, (i15 & 64) != 0 ? null : bVar, (i15 & 128) != 0 ? null : num3);
    }

    public static q b(q qVar, b12.b bVar, Integer num, int i14) {
        Integer num2 = qVar.userProfileId;
        String str = qVar.fullName;
        String str2 = qVar.displayName;
        Integer num3 = qVar.userLevel;
        int i15 = qVar.userPoint;
        boolean z14 = qVar.hasPrivate;
        if ((i14 & 64) != 0) {
            bVar = qVar.f30661g;
        }
        return new q(num2, str, str2, num3, i15, z14, bVar, num);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFullName() {
        return this.fullName;
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
        return p005kotlin.jvm.internal.s.g(this.userProfileId, qVar.userProfileId) && p005kotlin.jvm.internal.s.g(this.fullName, qVar.fullName) && p005kotlin.jvm.internal.s.g(this.displayName, qVar.displayName) && p005kotlin.jvm.internal.s.g(this.userLevel, qVar.userLevel) && this.userPoint == qVar.userPoint && this.hasPrivate == qVar.hasPrivate && p005kotlin.jvm.internal.s.g(this.f30661g, qVar.f30661g) && p005kotlin.jvm.internal.s.g(this.f30662h, qVar.f30662h);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHasPrivate() {
        return this.hasPrivate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getUserLevel() {
        return this.userLevel;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getUserPoint() {
        return this.userPoint;
    }

    public final int hashCode() {
        Integer num = this.userProfileId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fullName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.userLevel;
        int iG = q6.f.g(q2.d(this.userPoint, (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31, this.hasPrivate);
        b12.b bVar = this.f30661g;
        int iHashCode4 = (iG + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num3 = this.f30662h;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getUserProfileId() {
        return this.userProfileId;
    }

    public final String toString() {
        Integer num = this.userProfileId;
        String str = this.fullName;
        String str2 = this.displayName;
        Integer num2 = this.userLevel;
        int i14 = this.userPoint;
        boolean z14 = this.hasPrivate;
        StringBuilder sbF = l2.f("LeaderboardProfileDTO(userProfileId=", num, ", fullName=", str, ", displayName=");
        fb1.c.u(num2, str2, ", userLevel=", ", userPoint=", sbF);
        fb1.c.x(sbF, i14, ", hasPrivate=", z14, ", userProfileImageData=");
        sbF.append(this.f30661g);
        sbF.append(", order=");
        sbF.append(this.f30662h);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.userProfileId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.fullName);
        parcel.writeString(this.displayName);
        Integer num2 = this.userLevel;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeInt(this.userPoint);
        parcel.writeInt(this.hasPrivate ? 1 : 0);
        parcel.writeParcelable(this.f30661g, i14);
        Integer num3 = this.f30662h;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
    }

    public q(Integer num, String str, String str2, Integer num2, int i14, boolean z14, b12.b bVar, Integer num3) {
        this.userProfileId = num;
        this.fullName = str;
        this.displayName = str2;
        this.userLevel = num2;
        this.userPoint = i14;
        this.hasPrivate = z14;
        this.f30661g = bVar;
        this.f30662h = num3;
        this.f30663i = p005kotlin.jvm.internal.s.g(str2, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName());
    }

    public q() {
        this(null, null, null, null, 0, false, null, null, 255, null);
    }
}
