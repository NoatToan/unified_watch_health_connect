package sl2;

import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import pl2.l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends ul2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<cs2.a<l>> f160007a;

    public a(cs2.a<l> aVar) {
        this.f160007a = new AtomicReference<>(aVar);
    }

    public static void e(Logger logger, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        for (byte b14 : bArr) {
            sb3.append(String.format("%02X ", Byte.valueOf(b14)));
        }
        logger.trace("Response:".concat(sb3.toString()));
    }

    @Override // tl2.f
    public void b(tl2.c.b bVar) {
        cs2.a<l> andSet = this.f160007a.getAndSet(null);
        if (andSet == null || bVar == tl2.c.b.SUCCESS) {
            return;
        }
        l lVar = new l();
        lVar.f138588a = 25;
        andSet.accept(lVar);
    }

    public final void d(ul2.a aVar, l lVar) {
        cs2.a<l> andSet = this.f160007a.getAndSet(null);
        aVar.e();
        if (andSet != null) {
            andSet.accept(lVar);
        }
    }
}
