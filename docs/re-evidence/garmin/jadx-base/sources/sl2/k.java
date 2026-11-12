package sl2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl2.l;

/* JADX INFO: loaded from: classes11.dex */
public class k extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f160058c = LoggerFactory.getLogger("PAY#NFC#VerifyPassCode");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160059b;

    public k(String str, cs2.a<l> aVar) {
        super(aVar);
        this.f160059b = str;
    }

    @Override // ul2.d
    public final void c(ul2.c cVar) {
        f160058c.trace("Selecting CRS Applet");
        cVar.k(g.f160042e, new j(this, 0));
    }

    public final void f(ul2.a aVar, l lVar) {
        f160058c.trace("Verifying pass code set complete: " + lVar.f138588a + " (" + lVar.f138589b + ")");
        d(aVar, lVar);
    }

    public final void g(ul2.a aVar, int i14, boolean z14) {
        l lVar = new l();
        lVar.b(i14, z14);
        f(aVar, lVar);
    }
}
