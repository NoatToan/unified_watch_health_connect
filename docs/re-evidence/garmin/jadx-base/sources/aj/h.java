package aj;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class h implements ui.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f3349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f3350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public URL f3353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f3354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3355h;

    public h(String str, i iVar) {
        this.f3350c = null;
        if (TextUtils.isEmpty(str)) {
            vb.h.s("Must not be null or empty");
            throw null;
        }
        this.f3351d = str;
        qj.l.c(iVar, "Argument must not be null");
        this.f3349b = iVar;
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        if (this.f3354g == null) {
            this.f3354g = c().getBytes(ui.e.f171166a);
        }
        messageDigest.update(this.f3354g);
    }

    public final String c() {
        String str = this.f3351d;
        if (str != null) {
            return str;
        }
        URL url = this.f3350c;
        qj.l.c(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.f3352e)) {
            String string = this.f3351d;
            if (TextUtils.isEmpty(string)) {
                URL url = this.f3350c;
                qj.l.c(url, "Argument must not be null");
                string = url.toString();
            }
            this.f3352e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.f3352e;
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f3349b.equals(hVar.f3349b)) {
                return true;
            }
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        if (this.f3355h == 0) {
            int iHashCode = c().hashCode();
            this.f3355h = iHashCode;
            this.f3355h = this.f3349b.hashCode() + (iHashCode * 31);
        }
        return this.f3355h;
    }

    public final String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f3356a);
    }

    public h(URL url, i iVar) {
        qj.l.c(url, "Argument must not be null");
        this.f3350c = url;
        this.f3351d = null;
        qj.l.c(iVar, "Argument must not be null");
        this.f3349b = iVar;
    }

    public h(URL url) {
        this(url, i.f3356a);
    }
}
