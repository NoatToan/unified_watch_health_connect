package com.garmin.android.apps.connectmobile.smartscale.model;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0015\u001a\u0004\b3\u0010\u0017\"\u0004\b\u001a\u0010\u0019R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001b\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001b\u001a\u0004\b6\u0010\u001d\"\u0004\b#\u0010\u001fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b\u0011\u00109\"\u0004\b7\u0010:¨\u0006;"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/model/f;", "Landroid/os/Parcelable;", "", "userProfileId", "", "deviceId", "deviceNickname", "deviceShortName", "Lcom/garmin/android/apps/connectmobile/smartscale/model/f$b;", "gender", "", "height", "weight", "activityClass", "timeZoneKey", "birthdate", "", "isPrimaryUser", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/smartscale/model/f$b;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Integer;", "getUserProfileId", "()Ljava/lang/Integer;", "o", "(Ljava/lang/Integer;)V", "b", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "c", "getDeviceNickname", "g", "d", "getDeviceShortName", "h", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/android/apps/connectmobile/smartscale/model/f$b;", "getGender", "()Lcom/garmin/android/apps/connectmobile/smartscale/model/f$b;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/garmin/android/apps/connectmobile/smartscale/model/f$b;)V", "Ljava/lang/Double;", "getHeight", "()Ljava/lang/Double;", "j", "(Ljava/lang/Double;)V", "getWeight", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getActivityClass", "getTimeZoneKey", "m", "getBirthdate", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private Integer userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private String deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nickname")
    private String deviceNickname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortName")
    private String deviceShortName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gender")
    private b gender;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("height")
    private Double height;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private Double weight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityClass")
    private Integer activityClass;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeZoneKey")
    private String timeZoneKey;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("birthdate")
    private String birthdate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isPrimaryUser")
    private Boolean isPrimaryUser;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            Integer numValueOf;
            b bVar;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                bVar = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                bVar = null;
            }
            String string = parcel.readString();
            b bVar2 = bVar;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            b bVarValueOf = parcel.readInt() == 0 ? bVar2 : b.valueOf(parcel.readString());
            Object objValueOf = parcel.readInt() == 0 ? bVar2 : Double.valueOf(parcel.readDouble());
            Object objValueOf2 = parcel.readInt() == 0 ? bVar2 : Double.valueOf(parcel.readDouble());
            Object objValueOf3 = parcel.readInt() == 0 ? bVar2 : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            Boolean boolValueOf = bVar2;
            b bVar3 = bVarValueOf;
            Double d14 = objValueOf;
            Double d15 = objValueOf2;
            Integer num = objValueOf3;
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new f(numValueOf, string, string2, string3, bVar3, d14, d15, num, string4, string5, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/model/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        MALE,
        FEMALE
    }

    public /* synthetic */ f(Integer num, String str, String str2, String str3, b bVar, Double d14, Double d15, Integer num2, String str4, String str5, Boolean bool, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : bVar, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : d15, (i14 & 128) != 0 ? null : num2, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5, (i14 & 1024) != 0 ? null : bool);
    }

    public final void b(Integer num) {
        this.activityClass = num;
    }

    public final void d(String str) {
        this.birthdate = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.userProfileId, fVar.userProfileId) && s.g(this.deviceId, fVar.deviceId) && s.g(this.deviceNickname, fVar.deviceNickname) && s.g(this.deviceShortName, fVar.deviceShortName) && this.gender == fVar.gender && s.g(this.height, fVar.height) && s.g(this.weight, fVar.weight) && s.g(this.activityClass, fVar.activityClass) && s.g(this.timeZoneKey, fVar.timeZoneKey) && s.g(this.birthdate, fVar.birthdate) && s.g(this.isPrimaryUser, fVar.isPrimaryUser);
    }

    public final void f(String str) {
        this.deviceId = str;
    }

    public final void g(String str) {
        this.deviceNickname = str;
    }

    public final void h(String str) {
        this.deviceShortName = str;
    }

    public final int hashCode() {
        Integer num = this.userProfileId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.deviceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceNickname;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceShortName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b bVar = this.gender;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Double d14 = this.height;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.weight;
        int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num2 = this.activityClass;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.timeZoneKey;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthdate;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isPrimaryUser;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final void i(b bVar) {
        this.gender = bVar;
    }

    public final void j(Double d14) {
        this.height = d14;
    }

    public final void k(Boolean bool) {
        this.isPrimaryUser = bool;
    }

    public final void m(String str) {
        this.timeZoneKey = str;
    }

    public final void o(Integer num) {
        this.userProfileId = num;
    }

    public final void q(Double d14) {
        this.weight = d14;
    }

    public final String toString() {
        Integer num = this.userProfileId;
        String str = this.deviceId;
        String str2 = this.deviceNickname;
        String str3 = this.deviceShortName;
        b bVar = this.gender;
        Double d14 = this.height;
        Double d15 = this.weight;
        Integer num2 = this.activityClass;
        String str4 = this.timeZoneKey;
        String str5 = this.birthdate;
        Boolean bool = this.isPrimaryUser;
        StringBuilder sbF = l2.f("IndexUserInfoDTO(userProfileId=", num, ", deviceId=", str, ", deviceNickname=");
        sn.a.t(sbF, str2, ", deviceShortName=", str3, ", gender=");
        sbF.append(bVar);
        sbF.append(", height=");
        sbF.append(d14);
        sbF.append(", weight=");
        i.t(sbF, d15, ", activityClass=", num2, ", timeZoneKey=");
        sn.a.t(sbF, str4, ", birthdate=", str5, ", isPrimaryUser=");
        return p6.b.f(sbF, bool, ")");
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
        parcel.writeString(this.deviceId);
        parcel.writeString(this.deviceNickname);
        parcel.writeString(this.deviceShortName);
        b bVar = this.gender;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        Double d14 = this.height;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.weight;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Integer num2 = this.activityClass;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.timeZoneKey);
        parcel.writeString(this.birthdate);
        Boolean bool = this.isPrimaryUser;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
    }

    public f(Integer num, String str, String str2, String str3, b bVar, Double d14, Double d15, Integer num2, String str4, String str5, Boolean bool) {
        this.userProfileId = num;
        this.deviceId = str;
        this.deviceNickname = str2;
        this.deviceShortName = str3;
        this.gender = bVar;
        this.height = d14;
        this.weight = d15;
        this.activityClass = num2;
        this.timeZoneKey = str4;
        this.birthdate = str5;
        this.isPrimaryUser = bool;
    }

    public f() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
