package lz0;

import ds.e0;
import p005kotlin.Metadata;
import q6.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llz0/b;", "", "", "activityId", "timestamp", "", "deleted", "<init>", "(JJZ)V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f115394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f115396c;

    public b(long j8, long j14, boolean z14) {
        this.f115394a = j8;
        this.f115395b = j14;
        this.f115396c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f115394a == bVar.f115394a && this.f115395b == bVar.f115395b && this.f115396c == bVar.f115396c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115396c) + f.e(Long.hashCode(this.f115394a) * 31, 31, this.f115395b);
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f115394a, "NewsFeedEditedPost(activityId=", ", timestamp=");
        sbK.append(this.f115395b);
        sbK.append(", deleted=");
        sbK.append(this.f115396c);
        sbK.append(")");
        return sbK.toString();
    }
}
