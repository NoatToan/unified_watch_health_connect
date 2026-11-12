package pl2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpl2/b;", "Lul2/d;", "Lcs2/a;", "", "callback", "<init>", "(Lcs2/a;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ul2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f138547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f138548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f138549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f138550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f138551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f138552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f138553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<cs2.a<Integer>> f138554h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"pl2/b$a", "Lul2/b;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements ul2.b {
        public a() {
        }

        @Override // ul2.b
        public final void a(ul2.a aVar, byte[] bArr) {
            aVar.getClass();
            b bVar = b.this;
            bVar.getClass();
            bVar.f138547a.trace("Getting available space");
            aVar.l(bVar.f138549c, new pl2.a(bVar), AbstractComponentTracker.LINGERING_TIMEOUT);
        }
    }

    public b(cs2.a<Integer> aVar) {
        aVar.getClass();
        this.f138547a = LoggerFactory.getLogger("PAY#NFC#AvailableSpace");
        byte b14 = (byte) 0;
        this.f138548b = new byte[]{b14, (byte) 164, (byte) 4, b14, b14};
        this.f138549c = new byte[]{(byte) 128, (byte) 202, 0, (byte) 254, (byte) 2, (byte) 223, (byte) 37};
        this.f138550d = 19;
        this.f138551e = 4;
        this.f138552f = 2;
        this.f138553g = "9000";
        this.f138554h = new AtomicReference<>(aVar);
    }

    @Override // tl2.f
    public final void b(tl2.c.b bVar) {
        bVar.getClass();
        if (bVar != tl2.c.b.SUCCESS) {
            this.f138547a.trace("Available space request finished unsuccessfully -> " + bVar);
            cs2.a<Integer> andSet = this.f138554h.getAndSet(null);
            if (andSet != null) {
                andSet.accept(null);
            }
        }
    }

    @Override // ul2.d
    public final void c(ul2.c cVar) {
        this.f138547a.trace("Selecting ISD");
        a aVar = new a();
        int i14 = ul2.a.f171955p;
        cVar.l(this.f138548b, aVar, AbstractComponentTracker.LINGERING_TIMEOUT);
    }
}
