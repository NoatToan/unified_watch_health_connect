package defpackage;

import android.util.Base64;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16120b;
    public final String c;
    public final List<List<byte[]>> d;
    public final int e = 0;
    public final String f;

    public e0a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f16119a = (String) g6i.g(str);
        this.f16120b = (String) g6i.g(str2);
        this.c = (String) g6i.g(str3);
        this.d = (List) g6i.g(list);
        this.f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String d() {
        return this.f;
    }

    public String e() {
        return this.f16119a;
    }

    public String f() {
        return this.f16120b;
    }

    public String g() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f16119a + ", mProviderPackage: " + this.f16120b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
