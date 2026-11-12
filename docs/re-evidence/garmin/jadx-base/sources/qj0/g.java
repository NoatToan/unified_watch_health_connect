package qj0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, d2 = {"Lqj0/g;", "", "", TtmlNode.ATTR_ID, "", "Lqj0/b;", "Lqj0/j;", "features", "prompt", "promptYearly", "promptMonthly", "cta", "Lqj0/k;", "legal", "", "isTrial", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqj0/b;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "f", JWKParameterNames.RSA_EXPONENT, "g", "Lqj0/b;", "()Lqj0/b;", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("features")
    private final List<b<j>> features;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prompt")
    private final String prompt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("promptYearly")
    private final String promptYearly;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("promptMonthly")
    private final String promptMonthly;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cta")
    private final String cta;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("legal")
    private final b<k> legal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isTrial")
    private final Boolean isTrial;

    public g(String str, List<b<j>> list, String str2, String str3, String str4, String str5, b<k> bVar, Boolean bool) {
        this.id = str;
        this.features = list;
        this.prompt = str2;
        this.promptYearly = str3;
        this.promptMonthly = str4;
        this.cta = str5;
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

    public final b<k> c() {
        return this.legal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPromptMonthly() {
        return this.promptMonthly;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.id, gVar.id) && s.g(this.features, gVar.features) && s.g(this.prompt, gVar.prompt) && s.g(this.promptYearly, gVar.promptYearly) && s.g(this.promptMonthly, gVar.promptMonthly) && s.g(this.cta, gVar.cta) && s.g(this.legal, gVar.legal) && s.g(this.isTrial, gVar.isTrial);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPromptYearly() {
        return this.promptYearly;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getIsTrial() {
        return this.isTrial;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<b<j>> list = this.features;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.prompt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promptYearly;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promptMonthly;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cta;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        b<k> bVar = this.legal;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.isTrial;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        List<b<j>> list = this.features;
        String str2 = this.prompt;
        String str3 = this.promptYearly;
        String str4 = this.promptMonthly;
        String str5 = this.cta;
        b<k> bVar = this.legal;
        Boolean bool = this.isTrial;
        StringBuilder sbG = l2.g("ContentfulPaywallDTO(id=", str, ", features=", list, ", prompt=");
        sn.a.t(sbG, str2, ", promptYearly=", str3, ", promptMonthly=");
        sn.a.t(sbG, str4, ", cta=", str5, ", legal=");
        sbG.append(bVar);
        sbG.append(", isTrial=");
        sbG.append(bool);
        sbG.append(")");
        return sbG.toString();
    }
}
