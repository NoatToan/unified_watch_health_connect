package ff0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lff0/g;", "", "", "Lgf0/a;", FirebaseAnalytics.Param.CONTENT, "", "next", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.CONTENT)
    private final List<gf0.a> content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("next")
    private final String next;

    public g(List<gf0.a> list, String str) {
        this.content = list;
        this.next = str;
    }

    public final List<gf0.a> a() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.content, gVar.content) && p005kotlin.jvm.internal.s.g(this.next, gVar.next);
    }

    public final int hashCode() {
        List<gf0.a> list = this.content;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.next;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "EcgListResponse(content=" + this.content + ", next=" + this.next + ")";
    }
}
