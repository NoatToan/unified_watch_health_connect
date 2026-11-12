package sl2;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl2.l;

/* JADX INFO: loaded from: classes11.dex */
public class e extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f160017c = LoggerFactory.getLogger("PAY#NFC#IsPasscodeSet");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f160018d = {UnsignedBytes.MAX_POWER_OF_TWO, -54, 0, -40, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f160019e = {UnsignedBytes.MAX_POWER_OF_TWO, -54, -97, Ascii.ETB, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f160020f = {UnsignedBytes.MAX_POWER_OF_TWO, -54, -97, Ascii.CAN, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f160021b;

    public e(cs2.a<l> aVar) {
        super(aVar);
    }

    public static void f(e eVar, ul2.a aVar, byte[] bArr) {
        a.e(f160017c, bArr);
        if (bArr == null || bArr.length < 5 || !g.g(bArr)) {
            eVar.g(aVar, eVar.f160021b, true, 3);
        } else {
            eVar.g(aVar, eVar.f160021b, true, bArr[3] & UnsignedBytes.MAX_VALUE);
        }
    }

    @Override // sl2.a, tl2.f
    public final void b(tl2.c.b bVar) {
        f160017c.trace("IsPassCodeSet complete");
        super.b(bVar);
    }

    @Override // ul2.d
    public final void c(ul2.c cVar) {
        f160017c.trace("Selecting CRS Applet");
        cVar.k(g.f160042e, new d(this, 0));
    }

    public final void g(ul2.a aVar, int i14, boolean z14, int i15) {
        f160017c.trace("Checking is pass code set complete: " + i14 + " (" + z14 + "), retries: " + i15);
        l lVar = new l();
        lVar.f138591d = i15;
        lVar.b(i14, z14);
        d(aVar, lVar);
    }
}
