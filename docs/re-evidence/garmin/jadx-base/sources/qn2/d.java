package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lqn2/d;", "Lpn2/d;", "Lqn2/w;", "seInfo", "Lqn2/b;", "appletInstanceInfoDto", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "serviceId", "spId", "spAdditionalInfoType", "Lpn2/r;", "spAdditionalInfo", "<init>", "(Lqn2/w;Lqn2/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpn2/r;)V", "a", "Lqn2/w;", "getSeInfo", "()Lqn2/w;", "setSeInfo", "(Lqn2/w;)V", "b", "Lqn2/b;", "getAppletInstanceInfoDto", "()Lqn2/b;", "setAppletInstanceInfoDto", "(Lqn2/b;)V", "c", "Ljava/lang/String;", "getLanguageCode", "()Ljava/lang/String;", "setLanguageCode", "(Ljava/lang/String;)V", "d", "getServiceId", "setServiceId", JWKParameterNames.RSA_EXPONENT, "getSpId", "setSpId", "f", "getSpAdditionalInfoType", "setSpAdditionalInfoType", "g", "Lpn2/r;", "getSpAdditionalInfo", "()Lpn2/r;", "setSpAdditionalInfo", "(Lpn2/r;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements pn2.d {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("seInfo")
    private w seInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appletInstanceInfo")
    private b appletInstanceInfoDto;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE)
    private String languageCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serviceId")
    private String serviceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spId")
    private String spId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spAdditionalInfoType")
    private String spAdditionalInfoType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spAdditionalInfo")
    private pn2.r spAdditionalInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(w.CREATOR.createFromParcel(parcel), b.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), pn2.r.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(w wVar, b bVar, String str, String str2, String str3, String str4, pn2.r rVar) {
        wVar.getClass();
        bVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        rVar.getClass();
        this.seInfo = wVar;
        this.appletInstanceInfoDto = bVar;
        this.languageCode = str;
        this.serviceId = str2;
        this.spId = str3;
        this.spAdditionalInfoType = str4;
        this.spAdditionalInfo = rVar;
        if (str.length() != 3) {
            vb.h.x(am.j.h(this.languageCode.length(), "languageCode length(3): "));
            throw null;
        }
        if (this.serviceId.length() != 8) {
            vb.h.x(am.j.h(this.serviceId.length(), "serviceId length(8): "));
            throw null;
        }
        if (this.spId.length() != 8) {
            vb.h.x(am.j.h(this.spId.length(), "spId length(8): "));
            throw null;
        }
        if (this.spAdditionalInfoType.length() == 12) {
            return;
        }
        vb.h.x(am.j.h(this.spAdditionalInfoType.length(), "spAdditionalInfoType length(12): "));
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.seInfo, dVar.seInfo) && p005kotlin.jvm.internal.s.g(this.appletInstanceInfoDto, dVar.appletInstanceInfoDto) && p005kotlin.jvm.internal.s.g(this.languageCode, dVar.languageCode) && p005kotlin.jvm.internal.s.g(this.serviceId, dVar.serviceId) && p005kotlin.jvm.internal.s.g(this.spId, dVar.spId) && p005kotlin.jvm.internal.s.g(this.spAdditionalInfoType, dVar.spAdditionalInfoType) && p005kotlin.jvm.internal.s.g(this.spAdditionalInfo, dVar.spAdditionalInfo);
    }

    public final int hashCode() {
        return this.spAdditionalInfo.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j((this.appletInstanceInfoDto.hashCode() + (this.seInfo.hashCode() * 31)) * 31, 31, this.languageCode), 31, this.serviceId), 31, this.spId), 31, this.spAdditionalInfoType);
    }

    public final String toString() {
        w wVar = this.seInfo;
        b bVar = this.appletInstanceInfoDto;
        String str = this.languageCode;
        String str2 = this.serviceId;
        String str3 = this.spId;
        String str4 = this.spAdditionalInfoType;
        pn2.r rVar = this.spAdditionalInfo;
        StringBuilder sb3 = new StringBuilder("FNBeginIssueCardRequestPayloadDto(seInfo=");
        sb3.append(wVar);
        sb3.append(", appletInstanceInfoDto=");
        sb3.append(bVar);
        sb3.append(", languageCode='");
        sn.a.t(sb3, str, "', serviceId='", str2, "', spId='");
        sn.a.t(sb3, str3, "', spAdditionalInfoType='", str4, "', spAdditionalInfo=");
        sb3.append(rVar);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.seInfo.writeToParcel(parcel, i14);
        this.appletInstanceInfoDto.writeToParcel(parcel, i14);
        parcel.writeString(this.languageCode);
        parcel.writeString(this.serviceId);
        parcel.writeString(this.spId);
        parcel.writeString(this.spAdditionalInfoType);
        this.spAdditionalInfo.writeToParcel(parcel, i14);
    }
}
