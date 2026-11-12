package qj0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R(\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R(\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001a\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*¨\u0006+"}, d2 = {"Lqj0/h;", "", "", TtmlNode.ATTR_ID, "title", "headerTitle", "headerSubtitle", "plansTitle", "", "Lqj0/b;", "Lqj0/l;", "plans", "featuresTitle", "Lqj0/j;", "features", "cta", "Lqj0/k;", "legal", "", "isTrial", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lqj0/b;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "h", "c", JWKParameterNames.RSA_EXPONENT, "d", "getPlansTitle", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "j", "Lqj0/b;", "()Lqj0/b;", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("headerTitle")
    private final String headerTitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("headerSubtitle")
    private final String headerSubtitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("plansTitle")
    private final String plansTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("plans")
    private final List<b<l>> plans;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("featuresTitle")
    private final String featuresTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("features")
    private final List<b<j>> features;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cta")
    private final String cta;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("legal")
    private final b<k> legal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isTrial")
    private final Boolean isTrial;

    public h(String str, String str2, String str3, String str4, String str5, List<b<l>> list, String str6, List<b<j>> list2, String str7, b<k> bVar, Boolean bool) {
        this.id = str;
        this.title = str2;
        this.headerTitle = str3;
        this.headerSubtitle = str4;
        this.plansTitle = str5;
        this.plans = list;
        this.featuresTitle = str6;
        this.features = list2;
        this.cta = str7;
        this.legal = bVar;
        this.isTrial = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    public final List<b<j>> b() {
        return this.features;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFeaturesTitle() {
        return this.featuresTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.id, hVar.id) && s.g(this.title, hVar.title) && s.g(this.headerTitle, hVar.headerTitle) && s.g(this.headerSubtitle, hVar.headerSubtitle) && s.g(this.plansTitle, hVar.plansTitle) && s.g(this.plans, hVar.plans) && s.g(this.featuresTitle, hVar.featuresTitle) && s.g(this.features, hVar.features) && s.g(this.cta, hVar.cta) && s.g(this.legal, hVar.legal) && s.g(this.isTrial, hVar.isTrial);
    }

    public final b<k> f() {
        return this.legal;
    }

    public final List<b<l>> g() {
        return this.plans;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.headerTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.headerSubtitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.plansTitle;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<b<l>> list = this.plans;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.featuresTitle;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<b<j>> list2 = this.features;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.cta;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        b<k> bVar = this.legal;
        int iHashCode10 = (iHashCode9 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.isTrial;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getIsTrial() {
        return this.isTrial;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.headerTitle;
        String str4 = this.headerSubtitle;
        String str5 = this.plansTitle;
        List<b<l>> list = this.plans;
        String str6 = this.featuresTitle;
        List<b<j>> list2 = this.features;
        String str7 = this.cta;
        b<k> bVar = this.legal;
        Boolean bool = this.isTrial;
        StringBuilder sbI = p6.b.i("ContentfulPlanSelectionDTO(id=", str, ", title=", str2, ", headerTitle=");
        sn.a.t(sbI, str3, ", headerSubtitle=", str4, ", plansTitle=");
        e0.o(str5, ", plans=", ", featuresTitle=", sbI, list);
        e0.o(str6, ", features=", ", cta=", sbI, list2);
        sbI.append(str7);
        sbI.append(", legal=");
        sbI.append(bVar);
        sbI.append(", isTrial=");
        return p6.b.f(sbI, bool, ")");
    }
}
