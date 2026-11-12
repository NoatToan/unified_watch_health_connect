package u63;

import java.net.URI;
import java.util.Iterator;
import java.util.SortedSet;
import oauth.signpost.exception.OAuthMessageSignerException;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t63.b f169072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t63.a f169073b;

    public c(t63.b bVar, t63.a aVar) {
        this.f169072a = bVar;
        this.f169073b = aVar;
    }

    public final String a() throws OAuthMessageSignerException {
        try {
            return this.f169072a.getMethod() + '&' + r63.b.d(c()) + '&' + r63.b.d(b());
        } catch (Exception e4) {
            throw new OAuthMessageSignerException(e4);
        }
    }

    public final String b() {
        String string;
        t63.a aVar = this.f169073b;
        if (aVar == null) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        int i14 = 0;
        for (String str : aVar.f162800a.keySet()) {
            if (!"oauth_signature".equals(str) && !"realm".equals(str)) {
                if (i14 > 0) {
                    sb3.append("&");
                }
                StringBuilder sb4 = new StringBuilder();
                SortedSet<String> sortedSet = aVar.f162800a.get(str);
                if (sortedSet == null) {
                    string = ((Object) str) + "=";
                } else {
                    Iterator<String> it = sortedSet.iterator();
                    while (it.hasNext()) {
                        sb4.append((Object) str);
                        sb4.append("=");
                        sb4.append(it.next());
                        if (it.hasNext()) {
                            sb4.append("&");
                        }
                    }
                    string = sb4.toString();
                }
                sb3.append(string);
            }
            i14++;
        }
        return sb3.toString();
    }

    public final String c() {
        int iLastIndexOf;
        URI uri = new URI(this.f169072a.b());
        String lowerCase = uri.getScheme().toLowerCase();
        String lowerCase2 = uri.getAuthority().toLowerCase();
        if (((lowerCase.equals("http") && uri.getPort() == 80) || (lowerCase.equals("https") && uri.getPort() == 443)) && (iLastIndexOf = lowerCase2.lastIndexOf(":")) >= 0) {
            lowerCase2 = lowerCase2.substring(0, iLastIndexOf);
        }
        String rawPath = uri.getRawPath();
        if (rawPath == null || rawPath.length() <= 0) {
            rawPath = "/";
        }
        return com.nimbusds.jose.shaded.gson.internal.a.h(lowerCase, "://", lowerCase2, rawPath);
    }
}
