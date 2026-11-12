package ff2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001c"}, d2 = {"Lff2/n;", "", "", "detailBodyText", "detailBodyDetailText", "detailEmailOfferButtonText", "detailImageUrl", "detailPromoCode", "detailPromoCodeDetailText", "", "detailPromoCodeExpirationDate", "detailShopNowUrl", "detailTitleText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", "h", IntegerTokenConverter.CONVERTER_KEY, "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailBodyText")
    private final String detailBodyText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailBodyDetailText")
    private final String detailBodyDetailText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailEmailOfferButtonText")
    private final String detailEmailOfferButtonText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailImageUrl")
    private final String detailImageUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailPromoCode")
    private final String detailPromoCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailPromoCodeDetailText")
    private final String detailPromoCodeDetailText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailPromoCodeExpirationDate")
    private final Long detailPromoCodeExpirationDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailShopNowUrl")
    private final String detailShopNowUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailTitleText")
    private final String detailTitleText;

    public n(String str, String str2, String str3, String str4, String str5, String str6, Long l14, String str7, String str8) {
        hb.a.p(str, str3, str4, str7, str8);
        this.detailBodyText = str;
        this.detailBodyDetailText = str2;
        this.detailEmailOfferButtonText = str3;
        this.detailImageUrl = str4;
        this.detailPromoCode = str5;
        this.detailPromoCodeDetailText = str6;
        this.detailPromoCodeExpirationDate = l14;
        this.detailShopNowUrl = str7;
        this.detailTitleText = str8;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDetailBodyDetailText() {
        return this.detailBodyDetailText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDetailBodyText() {
        return this.detailBodyText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDetailEmailOfferButtonText() {
        return this.detailEmailOfferButtonText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDetailPromoCode() {
        return this.detailPromoCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.detailBodyText, nVar.detailBodyText) && s.g(this.detailBodyDetailText, nVar.detailBodyDetailText) && s.g(this.detailEmailOfferButtonText, nVar.detailEmailOfferButtonText) && s.g(this.detailImageUrl, nVar.detailImageUrl) && s.g(this.detailPromoCode, nVar.detailPromoCode) && s.g(this.detailPromoCodeDetailText, nVar.detailPromoCodeDetailText) && s.g(this.detailPromoCodeExpirationDate, nVar.detailPromoCodeExpirationDate) && s.g(this.detailShopNowUrl, nVar.detailShopNowUrl) && s.g(this.detailTitleText, nVar.detailTitleText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDetailPromoCodeDetailText() {
        return this.detailPromoCodeDetailText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getDetailPromoCodeExpirationDate() {
        return this.detailPromoCodeExpirationDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDetailShopNowUrl() {
        return this.detailShopNowUrl;
    }

    public final int hashCode() {
        int iHashCode = this.detailBodyText.hashCode() * 31;
        String str = this.detailBodyDetailText;
        int iJ = wr.g.j(wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.detailEmailOfferButtonText), 31, this.detailImageUrl);
        String str2 = this.detailPromoCode;
        int iHashCode2 = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.detailPromoCodeDetailText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.detailPromoCodeExpirationDate;
        return this.detailTitleText.hashCode() + wr.g.j((iHashCode3 + (l14 != null ? l14.hashCode() : 0)) * 31, 31, this.detailShopNowUrl);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDetailTitleText() {
        return this.detailTitleText;
    }

    public final String toString() {
        String str = this.detailBodyText;
        String str2 = this.detailBodyDetailText;
        String str3 = this.detailEmailOfferButtonText;
        String str4 = this.detailImageUrl;
        String str5 = this.detailPromoCode;
        String str6 = this.detailPromoCodeDetailText;
        Long l14 = this.detailPromoCodeExpirationDate;
        String str7 = this.detailShopNowUrl;
        String str8 = this.detailTitleText;
        StringBuilder sbI = p6.b.i("DetailPayloadDTO(detailBodyText=", str, ", detailBodyDetailText=", str2, ", detailEmailOfferButtonText=");
        sn.a.t(sbI, str3, ", detailImageUrl=", str4, ", detailPromoCode=");
        sn.a.t(sbI, str5, ", detailPromoCodeDetailText=", str6, ", detailPromoCodeExpirationDate=");
        b71.i.q(l14, ", detailShopNowUrl=", str7, ", detailTitleText=", sbI);
        return am.j.o(str8, ")", sbI);
    }
}
