package sl2;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import pl2.l;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements ul2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f160009b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f160008a = i14;
        this.f160009b = cVar;
    }

    @Override // ul2.b
    public final void a(ul2.a aVar, byte[] bArr) {
        switch (this.f160008a) {
            case 0:
                String strI = g.i(bArr);
                int i14 = bArr[0] & UnsignedBytes.MAX_VALUE;
                c cVar = this.f160009b;
                if (i14 == 144 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 0) {
                    cVar.f(aVar, 0, true);
                } else if (i14 == 105 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 131) {
                    l lVar = new l();
                    lVar.f138591d = -1;
                    lVar.b(12, false);
                    cVar.d(aVar, lVar);
                } else if (strI.startsWith("63f") || strI.startsWith("63F")) {
                    int i15 = bArr[1] & Ascii.SI;
                    l lVar2 = new l();
                    lVar2.f138591d = i15;
                    lVar2.b(12, false);
                    cVar.d(aVar, lVar2);
                } else {
                    int i16 = bArr[0] & UnsignedBytes.MAX_VALUE;
                    if (i16 == 99) {
                        int i17 = bArr[1] & UnsignedBytes.MAX_VALUE;
                        l lVar3 = new l();
                        lVar3.f138591d = i17;
                        lVar3.b(14, false);
                        cVar.d(aVar, lVar3);
                    } else if (i16 == 106 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 129) {
                        l lVar4 = new l();
                        lVar4.f138591d = 0;
                        lVar4.b(13, false);
                        cVar.d(aVar, lVar4);
                    } else {
                        cVar.f(aVar, 19, false);
                    }
                }
                break;
            case 1:
                boolean zH = g.h(bArr);
                c cVar2 = this.f160009b;
                if (!zH) {
                    cVar2.f(aVar, 3, false);
                } else {
                    aVar.k(g.f160043f, new b(cVar2, 2));
                }
                break;
            case 2:
                byte[] bArr2 = new byte[128];
                c cVar3 = this.f160009b;
                int iA = g.a(cVar3.f160011c, cVar3.f160012d, cVar3.f160013e, bArr, bArr2);
                if (iA == 0) {
                    cVar3.f160014f = bArr2;
                    aVar.k(g.f160044g, new b(cVar3, 3));
                } else {
                    cVar3.f(aVar, iA, false);
                }
                break;
            default:
                byte[] bArr3 = new byte[32];
                c cVar4 = this.f160009b;
                int iB = g.b(cVar4.f160010b, bArr, bArr3);
                if (iB == 0) {
                    byte[] bArr4 = new byte[SyslogConstants.LOG_LOCAL4];
                    System.arraycopy(cVar4.f160014f, 0, bArr4, 0, 128);
                    System.arraycopy(bArr3, 0, bArr4, 128, 32);
                    byte[] bArr5 = new byte[166];
                    bArr5[0] = UnsignedBytes.MAX_POWER_OF_TWO;
                    bArr5[1] = 36;
                    bArr5[2] = 0;
                    bArr5[3] = 0;
                    bArr5[4] = -96;
                    bArr5[165] = 0;
                    System.arraycopy(bArr4, 0, bArr5, 5, SyslogConstants.LOG_LOCAL4);
                    b bVar = new b(cVar4, 0);
                    aVar.getClass();
                    aVar.l(bArr5, bVar, AbstractComponentTracker.LINGERING_TIMEOUT);
                } else {
                    cVar4.f(aVar, iB, false);
                }
                break;
        }
    }
}
