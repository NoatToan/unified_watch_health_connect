package xe0;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import q6.f;
import v.e0;
import we0.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lxe0/b;", "", "", "rating", "", "userId", "", "favoriteFeature", "feedback", "featureRequest", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lwe0/g;", "feedbackSelections", "(Lwe0/g;)V", "a", "I", "getRating", "()I", "b", "J", "getUserId", "()J", "c", "Ljava/lang/String;", "getFavoriteFeature", "()Ljava/lang/String;", "d", "getFeedback", JWKParameterNames.RSA_EXPONENT, "getFeatureRequest", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Rating")
    private final int rating;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UserId")
    private final long userId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FavoriteFeature")
    private final String favoriteFeature;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AdditionalFeedback")
    private final String feedback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FeatureRequest")
    private final String featureRequest;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.f184753b, gVar.f184752a, (String) h0.d0(gVar.f184755d), gVar.f184754c, gVar.f184756e);
        gVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.rating == bVar.rating && this.userId == bVar.userId && s.g(this.favoriteFeature, bVar.favoriteFeature) && s.g(this.feedback, bVar.feedback) && s.g(this.featureRequest, bVar.featureRequest);
    }

    public final int hashCode() {
        int iE = f.e(Integer.hashCode(this.rating) * 31, 31, this.userId);
        String str = this.favoriteFeature;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.feedback;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.featureRequest;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i14 = this.rating;
        long j8 = this.userId;
        String str = this.favoriteFeature;
        String str2 = this.feedback;
        String str3 = this.featureRequest;
        StringBuilder sb3 = new StringBuilder("GCPlusUserFeedback(rating=");
        sb3.append(i14);
        sb3.append(", userId=");
        sb3.append(j8);
        sn.a.t(sb3, ", favoriteFeature=", str, ", feedback=", str2);
        return e0.h(sb3, ", featureRequest=", str3, ")");
    }

    public b(int i14, long j8, String str, String str2, String str3) {
        this.rating = i14;
        this.userId = j8;
        this.favoriteFeature = str;
        this.feedback = str2;
        this.featureRequest = str3;
    }
}
