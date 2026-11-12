package eu;

import android.net.Uri;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Leu/h;", "", "Landroid/net/Uri;", "imageUri", "", "fileName", "", "isSelected", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Z)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f66087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66089c;

    public h(Uri uri, String str, boolean z14) {
        uri.getClass();
        str.getClass();
        this.f66087a = uri;
        this.f66088b = str;
        this.f66089c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f66087a.equals(hVar.f66087a) && this.f66088b.equals(hVar.f66088b) && this.f66089c == hVar.f66089c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66089c) + wr.g.j(this.f66087a.hashCode() * 31, 31, this.f66088b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShareImageUIData(imageUri=");
        sb3.append(this.f66087a);
        sb3.append(", fileName=");
        sb3.append(this.f66088b);
        sb3.append(", isSelected=");
        return hb.a.k(sb3, this.f66089c, ")");
    }
}
