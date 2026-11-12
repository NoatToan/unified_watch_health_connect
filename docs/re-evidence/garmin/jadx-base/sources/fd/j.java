package fd;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfd/j;", "", "", "Lfd/h;", "webSourceParams", "Landroid/net/Uri;", "topOriginUri", "Landroid/view/InputEvent;", "inputEvent", "appDestination", "webDestination", "verifiedDestination", "<init>", "(Ljava/util/List;Landroid/net/Uri;Landroid/view/InputEvent;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h> f70435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f70436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputEvent f70437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f70438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f70439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f70440f;

    public /* synthetic */ j(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, uri, (i14 & 4) != 0 ? null : inputEvent, (i14 & 8) != 0 ? null : uri2, (i14 & 16) != 0 ? null : uri3, (i14 & 32) != 0 ? null : uri4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f70435a, jVar.f70435a) && s.g(this.f70439e, jVar.f70439e) && s.g(this.f70438d, jVar.f70438d) && s.g(this.f70436b, jVar.f70436b) && s.g(this.f70437c, jVar.f70437c) && s.g(this.f70440f, jVar.f70440f);
    }

    public final int hashCode() {
        int iHashCode = this.f70435a.hashCode() * 31;
        Uri uri = this.f70436b;
        int iHashCode2 = uri.hashCode() + iHashCode;
        InputEvent inputEvent = this.f70437c;
        if (inputEvent != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent.hashCode();
        }
        Uri uri2 = this.f70438d;
        if (uri2 != null) {
            iHashCode2 = (iHashCode2 * 31) + uri2.hashCode();
        }
        Uri uri3 = this.f70439e;
        if (uri3 != null) {
            iHashCode2 = (iHashCode2 * 31) + uri3.hashCode();
        }
        int iHashCode3 = uri.hashCode() + (iHashCode2 * 31);
        if (inputEvent != null) {
            iHashCode3 = (iHashCode3 * 31) + inputEvent.hashCode();
        }
        Uri uri4 = this.f70440f;
        if (uri4 == null) {
            return iHashCode3;
        }
        return uri4.hashCode() + (iHashCode3 * 31);
    }

    public final String toString() {
        return am.j.m("WebSourceRegistrationRequest { ", "WebSourceParams=[" + this.f70435a + "], TopOriginUri=" + this.f70436b + ", InputEvent=" + this.f70437c + ", AppDestination=" + this.f70438d + ", WebDestination=" + this.f70439e + ", VerifiedDestination=" + this.f70440f, " }");
    }

    public j(List<h> list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4) {
        list.getClass();
        uri.getClass();
        this.f70435a = list;
        this.f70436b = uri;
        this.f70437c = inputEvent;
        this.f70438d = uri2;
        this.f70439e = uri3;
        this.f70440f = uri4;
    }
}
