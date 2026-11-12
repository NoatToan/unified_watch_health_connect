package sl2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl2.l;

/* JADX INFO: loaded from: classes11.dex */
public class i extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f160052e = LoggerFactory.getLogger("PAY#NFC#SetPassCode");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f160054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f160055d;

    public i(String str, int i14, cs2.a<l> aVar, int i15, f fVar) {
        super(aVar);
        this.f160053b = str;
        this.f160054c = i14;
        this.f160055d = fVar;
    }

    @Override // ul2.d
    public final void c(ul2.c cVar) {
        f160052e.trace("Selecting CRS applet");
        cVar.k(g.f160042e, new h(this, 1));
    }

    public final void f(ul2.a aVar, int i14, boolean z14) {
        f160052e.trace("Setting pass code complete: " + i14 + " (" + z14 + ")");
        l lVar = new l();
        lVar.b(i14, z14);
        d(aVar, lVar);
    }
}
