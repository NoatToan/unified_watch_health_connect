package d91;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Ld91/i;", "", "Ld91/a;", "feature", "", "cardTitle", "cardBody", "", "Ld91/j;", "parameters", "<init>", "(Ld91/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ld91/a;", "c", "()Ld91/a;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feature")
    private final a feature;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardTitle")
    private final String cardTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardText")
    private final String cardBody;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parameters")
    private final List<j> parameters;

    public i(a aVar, String str, String str2, List<j> list) {
        this.feature = aVar;
        this.cardTitle = str;
        this.cardBody = str2;
        this.parameters = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardBody() {
        return this.cardBody;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getFeature() {
        return this.feature;
    }

    public final List<j> d() {
        return this.parameters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.feature == iVar.feature && p005kotlin.jvm.internal.s.g(this.cardTitle, iVar.cardTitle) && p005kotlin.jvm.internal.s.g(this.cardBody, iVar.cardBody) && p005kotlin.jvm.internal.s.g(this.parameters, iVar.parameters);
    }

    public final int hashCode() {
        a aVar = this.feature;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.cardTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardBody;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<j> list = this.parameters;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MessageLinkDTO(feature=" + this.feature + ", cardTitle=" + this.cardTitle + ", cardBody=" + this.cardBody + ", parameters=" + this.parameters + ")";
    }
}
