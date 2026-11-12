package sl2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.common.primitives.UnsignedBytes;
import org.slf4j.Logger;
import pl2.l;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements ul2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f160057b;

    public /* synthetic */ j(k kVar, int i14) {
        this.f160056a = i14;
        this.f160057b = kVar;
    }

    @Override // ul2.b
    public final void a(ul2.a aVar, byte[] bArr) {
        int i14 = this.f160056a;
        int i15 = 1;
        k kVar = this.f160057b;
        switch (i14) {
            case 0:
                Logger logger = k.f160058c;
                if (!g.h(bArr)) {
                    logger.error("Failed to start CRS Applet");
                    kVar.g(aVar, 3, false);
                } else {
                    logger.trace("Sending GET_CHALLENGE_COMMAND");
                    aVar.k(g.f160044g, new j(kVar, i15));
                }
                break;
            case 1:
                Logger logger2 = k.f160058c;
                if (bArr.length >= 10 && (bArr[8] & UnsignedBytes.MAX_VALUE) == 144 && (bArr[9] & UnsignedBytes.MAX_VALUE) == 0) {
                    byte[] bArr2 = new byte[32];
                    int i16 = 2;
                    if (g.b(kVar.f160059b, bArr, bArr2) == 0) {
                        byte[] bArr3 = new byte[38];
                        bArr3[0] = UnsignedBytes.MAX_POWER_OF_TWO;
                        bArr3[1] = 32;
                        bArr3[2] = 0;
                        bArr3[3] = 0;
                        bArr3[4] = 32;
                        bArr3[37] = 0;
                        System.arraycopy(bArr2, 0, bArr3, 5, 32);
                        k.f160058c.trace("Sending pass code verification command");
                        j jVar = new j(kVar, i16);
                        aVar.getClass();
                        aVar.l(bArr3, jVar, AbstractComponentTracker.LINGERING_TIMEOUT);
                    } else {
                        kVar.g(aVar, 2, false);
                    }
                } else {
                    kVar.g(aVar, 8, false);
                }
                break;
            default:
                Logger logger3 = k.f160058c;
                int i17 = bArr[0] & UnsignedBytes.MAX_VALUE;
                if (i17 == 144) {
                    kVar.g(aVar, 0, true);
                } else if (i17 == 105 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 133) {
                    kVar.g(aVar, 20, false);
                } else if (i17 == 99) {
                    int i18 = bArr[1] & UnsignedBytes.MAX_VALUE;
                    l lVar = new l();
                    lVar.b(14, false);
                    lVar.f138591d = i18;
                    kVar.f(aVar, lVar);
                } else if (i17 == 103 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 0) {
                    kVar.g(aVar, 18, false);
                } else if (i17 == 105 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 131) {
                    l lVar2 = new l();
                    lVar2.f138591d = -1;
                    lVar2.b(12, false);
                    kVar.f(aVar, lVar2);
                } else if (i17 == 106 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 128) {
                    kVar.g(aVar, 17, false);
                } else if (i17 == 106 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 134) {
                    kVar.g(aVar, 16, false);
                } else {
                    kVar.g(aVar, 19, false);
                }
                break;
        }
    }
}
