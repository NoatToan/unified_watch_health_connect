package qs1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, d2 = {"Lqs1/b0;", "", "", "curatedCourseId", "", "suggestionType", "suggestionText", "", "activityConsentGiven", "locale", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "a", "J", "getCuratedCourseId", "()J", "b", "Ljava/lang/String;", "getSuggestionType", "()Ljava/lang/String;", "c", "getSuggestionText", "d", "Z", "getActivityConsentGiven", "()Z", JWKParameterNames.RSA_EXPONENT, "getLocale", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("curatedCourseId")
    private final long curatedCourseId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestionType")
    private final String suggestionType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestionText")
    private final String suggestionText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityConsentGiven")
    private final boolean activityConsentGiven;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private final String locale;

    public b0(long j8, String str, String str2, boolean z14, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.curatedCourseId = j8;
        this.suggestionType = str;
        this.suggestionText = str2;
        this.activityConsentGiven = z14;
        this.locale = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.curatedCourseId == b0Var.curatedCourseId && p005kotlin.jvm.internal.s.g(this.suggestionType, b0Var.suggestionType) && p005kotlin.jvm.internal.s.g(this.suggestionText, b0Var.suggestionText) && this.activityConsentGiven == b0Var.activityConsentGiven && p005kotlin.jvm.internal.s.g(this.locale, b0Var.locale);
    }

    public final int hashCode() {
        return this.locale.hashCode() + q6.f.g(wr.g.j(wr.g.j(Long.hashCode(this.curatedCourseId) * 31, 31, this.suggestionType), 31, this.suggestionText), 31, this.activityConsentGiven);
    }

    public final String toString() {
        long j8 = this.curatedCourseId;
        String str = this.suggestionType;
        String str2 = this.suggestionText;
        boolean z14 = this.activityConsentGiven;
        String str3 = this.locale;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "UserSuggestionDTO(curatedCourseId=", ", suggestionType=", str);
        com.airbnb.lottie.animation.keyframe.a.t(", suggestionText=", str2, ", activityConsentGiven=", sbK, z14);
        return e0.h(sbK, ", locale=", str3, ")");
    }

    public /* synthetic */ b0(long j8, String str, String str2, boolean z14, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, str2, (i14 & 8) != 0 ? false : z14, str3);
    }
}
