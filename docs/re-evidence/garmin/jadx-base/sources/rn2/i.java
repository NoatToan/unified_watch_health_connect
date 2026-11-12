package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u001d\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0016\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lrn2/i;", "Lpn2/d;", "", "cid", "appletInstanceAid", "serviceId", "spId", "cardType", "cardCategory", "Lrn2/l;", "cardStatuses", "Lrn2/a;", "additionalInfo", "additionalInfoHash", "Lpn2/r;", "spAdditionalInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrn2/l;Lrn2/a;Ljava/lang/String;Lpn2/r;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "d", "c", "getServiceId", "getSpId", JWKParameterNames.RSA_EXPONENT, "getCardType", "f", "getCardCategory", "Lrn2/l;", "()Lrn2/l;", "h", "Lrn2/a;", "()Lrn2/a;", IntegerTokenConverter.CONVERTER_KEY, "getAdditionalInfoHash", "j", "Lpn2/r;", "getSpAdditionalInfo", "()Lpn2/r;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements pn2.d {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cid")
    private final String cid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appletInstanceAid")
    private final String appletInstanceAid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serviceId")
    private final String serviceId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spId")
    private final String spId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardType")
    private final String cardType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardCategory")
    private final String cardCategory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardStatuses")
    private final l cardStatuses;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("additionalInfo")
    private final rn2.a additionalInfo;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("additionalInfoHash")
    private final String additionalInfoHash;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spAdditionalInfo")
    private final pn2.r spAdditionalInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), l.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : rn2.a.CREATOR.createFromParcel(parcel), parcel.readString(), pn2.r.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, l lVar, rn2.a aVar, String str7, pn2.r rVar) {
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        lVar.getClass();
        rVar.getClass();
        this.cid = str;
        this.appletInstanceAid = str2;
        this.serviceId = str3;
        this.spId = str4;
        this.cardType = str5;
        this.cardCategory = str6;
        this.cardStatuses = lVar;
        this.additionalInfo = aVar;
        this.additionalInfoHash = str7;
        this.spAdditionalInfo = rVar;
        if (str.length() != 63) {
            vb.h.x(am.j.h(str.length(), "cid length(63): "));
            throw null;
        }
        int length = str2.length();
        if (2 > length || length >= 33) {
            vb.h.x(am.j.h(str2.length(), "appletInstanceAid length(2-32): "));
            throw null;
        }
        if (str3.length() != 8) {
            vb.h.x(am.j.h(str3.length(), "serviceId length(8): "));
            throw null;
        }
        if (str4.length() != 8) {
            vb.h.x(am.j.h(str4.length(), "spId length(8): "));
            throw null;
        }
        if (str5.length() != 12) {
            vb.h.x(am.j.h(str5.length(), "serviceId length(12): "));
            throw null;
        }
        if (str6.length() != 8) {
            vb.h.x(am.j.h(str6.length(), "cardCategory length(8): "));
            throw null;
        }
        if (str7 == null || str7.length() == 43) {
            return;
        }
        vb.h.x(am.j.h(str7.length(), "additionalInfoHash length(43): "));
        throw null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rn2.a getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAppletInstanceAid() {
        return this.appletInstanceAid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.cid, iVar.cid) && p005kotlin.jvm.internal.s.g(this.appletInstanceAid, iVar.appletInstanceAid) && p005kotlin.jvm.internal.s.g(this.serviceId, iVar.serviceId) && p005kotlin.jvm.internal.s.g(this.spId, iVar.spId) && p005kotlin.jvm.internal.s.g(this.cardType, iVar.cardType) && p005kotlin.jvm.internal.s.g(this.cardCategory, iVar.cardCategory) && p005kotlin.jvm.internal.s.g(this.cardStatuses, iVar.cardStatuses) && p005kotlin.jvm.internal.s.g(this.additionalInfo, iVar.additionalInfo) && p005kotlin.jvm.internal.s.g(this.additionalInfoHash, iVar.additionalInfoHash) && p005kotlin.jvm.internal.s.g(this.spAdditionalInfo, iVar.spAdditionalInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getCardStatuses() {
        return this.cardStatuses;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    public final int hashCode() {
        int iHashCode = (this.cardStatuses.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(this.cid.hashCode() * 31, 31, this.appletInstanceAid), 31, this.serviceId), 31, this.spId), 31, this.cardType), 31, this.cardCategory)) * 31;
        rn2.a aVar = this.additionalInfo;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.additionalInfoHash;
        return this.spAdditionalInfo.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.cid;
        String str2 = this.appletInstanceAid;
        String str3 = this.serviceId;
        String str4 = this.spId;
        String str5 = this.cardType;
        String str6 = this.cardCategory;
        l lVar = this.cardStatuses;
        rn2.a aVar = this.additionalInfo;
        String str7 = this.additionalInfoHash;
        pn2.r rVar = this.spAdditionalInfo;
        StringBuilder sbI = p6.b.i("FNCardInfoDto(cid=", str, ", appletInstanceAid=", str2, ", serviceId=");
        sn.a.t(sbI, str3, ", spId=", str4, ", cardType=");
        sn.a.t(sbI, str5, ", cardCategory=", str6, ", cardStatuses=");
        sbI.append(lVar);
        sbI.append(", additionalInfo=");
        sbI.append(aVar);
        sbI.append(", additionalInfoHash=");
        sbI.append(str7);
        sbI.append(", spAdditionalInfo=");
        sbI.append(rVar);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.cid);
        parcel.writeString(this.appletInstanceAid);
        parcel.writeString(this.serviceId);
        parcel.writeString(this.spId);
        parcel.writeString(this.cardType);
        parcel.writeString(this.cardCategory);
        this.cardStatuses.writeToParcel(parcel, i14);
        rn2.a aVar = this.additionalInfo;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.additionalInfoHash);
        this.spAdditionalInfo.writeToParcel(parcel, i14);
    }
}
