package ff2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lff2/o;", "", "", "offerBodyText", "offerHeaderText", "offerImageUrl", "offerShopNowButtonText", "offerTitleText", "offerViewDetailsButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setOfferBodyText", "(Ljava/lang/String;)V", "b", "setOfferHeaderText", "c", "setOfferImageUrl", "d", "setOfferShopNowButtonText", JWKParameterNames.RSA_EXPONENT, "setOfferTitleText", "f", "setOfferViewDetailsButtonText", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offerBodyText")
    private String offerBodyText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offerHeaderText")
    private String offerHeaderText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offerImageUrl")
    private String offerImageUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offerShopNowButtonText")
    private String offerShopNowButtonText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offerTitleText")
    private String offerTitleText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offerViewDetailsButtonText")
    private String offerViewDetailsButtonText;

    public o(String str, String str2, String str3, String str4, String str5, String str6) {
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.offerBodyText = str;
        this.offerHeaderText = str2;
        this.offerImageUrl = str3;
        this.offerShopNowButtonText = str4;
        this.offerTitleText = str5;
        this.offerViewDetailsButtonText = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOfferBodyText() {
        return this.offerBodyText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOfferHeaderText() {
        return this.offerHeaderText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOfferImageUrl() {
        return this.offerImageUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOfferShopNowButtonText() {
        return this.offerShopNowButtonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOfferTitleText() {
        return this.offerTitleText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return s.g(this.offerBodyText, oVar.offerBodyText) && s.g(this.offerHeaderText, oVar.offerHeaderText) && s.g(this.offerImageUrl, oVar.offerImageUrl) && s.g(this.offerShopNowButtonText, oVar.offerShopNowButtonText) && s.g(this.offerTitleText, oVar.offerTitleText) && s.g(this.offerViewDetailsButtonText, oVar.offerViewDetailsButtonText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOfferViewDetailsButtonText() {
        return this.offerViewDetailsButtonText;
    }

    public final int hashCode() {
        return this.offerViewDetailsButtonText.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j(this.offerBodyText.hashCode() * 31, 31, this.offerHeaderText), 31, this.offerImageUrl), 31, this.offerShopNowButtonText), 31, this.offerTitleText);
    }

    public final String toString() {
        String str = this.offerBodyText;
        String str2 = this.offerHeaderText;
        String str3 = this.offerImageUrl;
        String str4 = this.offerShopNowButtonText;
        String str5 = this.offerTitleText;
        String str6 = this.offerViewDetailsButtonText;
        StringBuilder sbI = p6.b.i("OfferPayloadDTO(offerBodyText=", str, ", offerHeaderText=", str2, ", offerImageUrl=");
        sn.a.t(sbI, str3, ", offerShopNowButtonText=", str4, ", offerTitleText=");
        return e5.h(sbI, str5, ", offerViewDetailsButtonText=", str6, ")");
    }
}
