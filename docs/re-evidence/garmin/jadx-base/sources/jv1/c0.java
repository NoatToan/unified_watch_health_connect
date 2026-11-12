package jv1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Ljv1/c0;", "", "", "articleNavBar", "articleTitle", "articleDuration", "articleDeck", "articleBody", "headerImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", JWKParameterNames.RSA_EXPONENT, "c", "f", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("articleNavBar")
    private final String articleNavBar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("articleTitle")
    private final String articleTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("articleDuration")
    private final String articleDuration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("articleDeck")
    private final String articleDeck;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("articleBody")
    private final String articleBody;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("headerImageUrl")
    private final String headerImageUrl;

    public c0(String str, String str2, String str3, String str4, String str5, String str6) {
        hb.a.p(str, str2, str3, str4, str5);
        this.articleNavBar = str;
        this.articleTitle = str2;
        this.articleDuration = str3;
        this.articleDeck = str4;
        this.articleBody = str5;
        this.headerImageUrl = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getArticleBody() {
        return this.articleBody;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getArticleDeck() {
        return this.articleDeck;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getArticleDuration() {
        return this.articleDuration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getArticleNavBar() {
        return this.articleNavBar;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getArticleTitle() {
        return this.articleTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.articleNavBar, c0Var.articleNavBar) && p005kotlin.jvm.internal.s.g(this.articleTitle, c0Var.articleTitle) && p005kotlin.jvm.internal.s.g(this.articleDuration, c0Var.articleDuration) && p005kotlin.jvm.internal.s.g(this.articleDeck, c0Var.articleDeck) && p005kotlin.jvm.internal.s.g(this.articleBody, c0Var.articleBody) && p005kotlin.jvm.internal.s.g(this.headerImageUrl, c0Var.headerImageUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(wr.g.j(wr.g.j(this.articleNavBar.hashCode() * 31, 31, this.articleTitle), 31, this.articleDuration), 31, this.articleDeck), 31, this.articleBody);
        String str = this.headerImageUrl;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.articleNavBar;
        String str2 = this.articleTitle;
        String str3 = this.articleDuration;
        String str4 = this.articleDeck;
        String str5 = this.articleBody;
        String str6 = this.headerImageUrl;
        StringBuilder sbI = p6.b.i("TrainingGuidanceArticleContentfulData(articleNavBar=", str, ", articleTitle=", str2, ", articleDuration=");
        sn.a.t(sbI, str3, ", articleDeck=", str4, ", articleBody=");
        return e5.h(sbI, str5, ", headerImageUrl=", str6, ")");
    }
}
