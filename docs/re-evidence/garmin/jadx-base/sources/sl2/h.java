package sl2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements ul2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f160051b;

    public /* synthetic */ h(i iVar, int i14) {
        this.f160050a = i14;
        this.f160051b = iVar;
    }

    @Override // ul2.b
    public final void a(ul2.a aVar, byte[] bArr) {
        int i14 = this.f160050a;
        int i15 = 2;
        i iVar = this.f160051b;
        int i16 = 0;
        switch (i14) {
            case 0:
                Logger logger = i.f160052e;
                int i17 = bArr[0] & UnsignedBytes.MAX_VALUE;
                if (i17 == 144 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 0) {
                    iVar.f(aVar, 0, true);
                } else if (i17 == 103 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 0) {
                    iVar.f(aVar, 18, false);
                } else if (i17 == 105 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 133) {
                    iVar.f(aVar, 11, false);
                } else if (i17 == 106 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 128) {
                    iVar.f(aVar, 17, false);
                } else if (i17 == 106 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 134) {
                    iVar.f(aVar, 16, false);
                } else {
                    iVar.f(aVar, 19, false);
                }
                break;
            case 1:
                Logger logger2 = i.f160052e;
                if (!g.h(bArr)) {
                    logger2.error("Failed to start CRS applet");
                    iVar.f(aVar, 3, false);
                } else {
                    logger2.trace("Sending GET_CERTIFICATE_COMMAND");
                    aVar.k(g.f160043f, new h(iVar, i15));
                }
                break;
            default:
                byte[] bArr2 = new byte[128];
                int iA = g.a(iVar.f160053b, iVar.f160054c, iVar.f160055d, bArr, bArr2);
                if (iA == 0) {
                    byte[] bArr3 = new byte[TsExtractor.TS_STREAM_TYPE_SPLICE_INFO];
                    bArr3[0] = UnsignedBytes.MAX_POWER_OF_TWO;
                    bArr3[1] = Ascii.CAN;
                    bArr3[2] = 0;
                    bArr3[3] = 0;
                    bArr3[4] = UnsignedBytes.MAX_POWER_OF_TWO;
                    System.arraycopy(bArr2, 0, bArr3, 5, 128);
                    bArr3[133] = 0;
                    i.f160052e.trace("Sending set pass code auth command");
                    h hVar = new h(iVar, i16);
                    aVar.getClass();
                    aVar.l(bArr3, hVar, AbstractComponentTracker.LINGERING_TIMEOUT);
                } else {
                    iVar.f(aVar, iA, false);
                }
                break;
        }
    }
}
