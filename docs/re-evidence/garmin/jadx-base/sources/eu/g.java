package eu;

import android.net.Uri;
import p005kotlin.Metadata;
import tt.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Leu/g;", "", "", "imageFileName", "Landroid/net/Uri;", "imageUri", "Ltt/m;", "chapterColors", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Ltt/m;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f66085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f66086c;

    public g(String str, Uri uri, m mVar) {
        str.getClass();
        uri.getClass();
        mVar.getClass();
        this.f66084a = str;
        this.f66085b = uri;
        this.f66086c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f66084a.equals(gVar.f66084a) && this.f66085b.equals(gVar.f66085b) && this.f66086c == gVar.f66086c;
    }

    public final int hashCode() {
        return this.f66086c.hashCode() + ((this.f66085b.hashCode() + (this.f66084a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShareImageInfo(imageFileName=" + this.f66084a + ", imageUri=" + this.f66085b + ", chapterColors=" + this.f66086c + ")";
    }
}
