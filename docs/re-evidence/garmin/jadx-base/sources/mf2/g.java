package mf2;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmf2/g;", "", "", "pageName", "", "pageViews", "viewedDuration", "<init>", "(Ljava/lang/String;II)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "I", "()I", "c", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pageName")
    private final String pageName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pageViews")
    private final int pageViews;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("viewedDuration")
    private final int viewedDuration;

    public g(String str, int i14, int i15) {
        str.getClass();
        this.pageName = str;
        this.pageViews = i14;
        this.viewedDuration = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPageViews() {
        return this.pageViews;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getViewedDuration() {
        return this.viewedDuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.pageName, gVar.pageName) && this.pageViews == gVar.pageViews && this.viewedDuration == gVar.viewedDuration;
    }

    public final int hashCode() {
        return Integer.hashCode(this.viewedDuration) + q2.d(this.pageViews, this.pageName.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.pageName;
        int i14 = this.pageViews;
        return am.j.q(androidx.core.view.j.k(i14, "LiveActivityPageViews(pageName=", str, ", pageViews=", ", viewedDuration="), this.viewedDuration, ")");
    }
}
