package ah0;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lah0/a;", "", "", "isEnableReview", "", "reviewType", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "()Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isEnableReview")
    private final Boolean isEnableReview;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reviewType")
    private final String reviewType;

    public a(Boolean bool, String str) {
        this.isEnableReview = bool;
        this.reviewType = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getReviewType() {
        return this.reviewType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getIsEnableReview() {
        return this.isEnableReview;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.isEnableReview, aVar.isEnableReview) && s.g(this.reviewType, aVar.reviewType);
    }

    public final int hashCode() {
        Boolean bool = this.isEnableReview;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.reviewType;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeedbackDTO(isEnableReview=" + this.isEnableReview + ", reviewType=" + this.reviewType + ")";
    }
}
