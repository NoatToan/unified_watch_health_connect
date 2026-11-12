package vb0;

import android.net.Uri;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvb0/a;", "", "", "unitId", "Landroid/net/Uri;", "manageSubscriptionUri", "<init>", "(JLandroid/net/Uri;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f176833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f176834b;

    public /* synthetic */ a(long j8, Uri uri, int i14, j jVar) {
        this(j8, (i14 & 2) != 0 ? null : uri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f176833a == aVar.f176833a && s.g(this.f176834b, aVar.f176834b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f176833a) * 31;
        Uri uri = this.f176834b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "InReachSubscriptionBannerData(unitId=" + this.f176833a + ", manageSubscriptionUri=" + this.f176834b + ")";
    }

    public a(long j8, Uri uri) {
        this.f176833a = j8;
        this.f176834b = uri;
    }
}
