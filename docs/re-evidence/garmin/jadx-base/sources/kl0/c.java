package kl0;

import android.net.Uri;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkl0/c;", "", "Lil0/a;", "golfCourseItem", "Landroid/net/Uri;", "drivingDirectionsRedirectUri", "<init>", "(Lil0/a;Landroid/net/Uri;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final il0.a f105232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f105233b;

    public c(il0.a aVar, Uri uri) {
        aVar.getClass();
        this.f105232a = aVar;
        this.f105233b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f105232a, cVar.f105232a) && s.g(this.f105233b, cVar.f105233b);
    }

    public final int hashCode() {
        int iHashCode = this.f105232a.hashCode() * 31;
        Uri uri = this.f105233b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "GolfCourseDetailsUIState(golfCourseItem=" + this.f105232a + ", drivingDirectionsRedirectUri=" + this.f105233b + ")";
    }

    public /* synthetic */ c(il0.a aVar, Uri uri, int i14, j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : uri);
    }
}
