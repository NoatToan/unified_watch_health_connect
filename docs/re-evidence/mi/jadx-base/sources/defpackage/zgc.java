package defpackage;

import com.service.mi.visa.VisaRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class zgc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zgc f41248b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public btc f41249a;

    public static zgc c() {
        if (f41248b == null) {
            synchronized (zgc.class) {
                try {
                    if (f41248b == null) {
                        f41248b = new zgc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f41248b;
    }

    public final void a() {
    }

    public String b(String str) {
        a();
        return this.f41249a.get(str);
    }

    public void d(btc btcVar) {
        this.f41249a = btcVar;
    }

    public String e(u3q u3qVar) {
        return f(u3qVar.g(), u3qVar.f(), u3qVar.e());
    }

    public <T> String f(String str, T t, Map<String, String> map) {
        a();
        return this.f41249a.a(str, t, map);
    }

    public <T> String g(r1p r1pVar) {
        r1pVar.e().put("tag", "tds");
        return f(r1pVar.g(), r1pVar.f(), r1pVar.e());
    }

    public <T> String h(VisaRequest visaRequest) {
        return f(visaRequest.getRequestFullUrl(), visaRequest.getParams(), visaRequest.getHeaders());
    }

    public <T> String i(w3r w3rVar) {
        return f(w3rVar.g(), w3rVar.f(), w3rVar.e());
    }
}
