package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class e0b implements pzd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dmb f16121b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public e0b(URL url) {
        this(url, dmb.f15684b);
    }

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.d;
        return str != null ? str : ((URL) a6i.d(this.c)).toString();
    }

    public final byte[] d() {
        if (this.g == null) {
            this.g = c().getBytes(pzd.f30934a);
        }
        return this.g;
    }

    public Map<String, String> e() {
        return this.f16121b.a();
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        if (!(obj instanceof e0b)) {
            return false;
        }
        e0b e0bVar = (e0b) obj;
        return c().equals(e0bVar.c()) && this.f16121b.equals(e0bVar.f16121b);
    }

    public final String f() {
        if (TextUtils.isEmpty(this.e)) {
            String string = this.d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) a6i.d(this.c)).toString();
            }
            this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    public final URL g() throws MalformedURLException {
        if (this.f == null) {
            this.f = new URL(f());
        }
        return this.f;
    }

    public String h() {
        return f();
    }

    @Override // defpackage.pzd
    public int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = (iHashCode * 31) + this.f16121b.hashCode();
        }
        return this.h;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public e0b(String str) {
        this(str, dmb.f15684b);
    }

    public e0b(URL url, dmb dmbVar) {
        this.c = (URL) a6i.d(url);
        this.d = null;
        this.f16121b = (dmb) a6i.d(dmbVar);
    }

    public e0b(String str, dmb dmbVar) {
        this.c = null;
        this.d = a6i.b(str);
        this.f16121b = (dmb) a6i.d(dmbVar);
    }
}
