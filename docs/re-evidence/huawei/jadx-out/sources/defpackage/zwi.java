package defpackage;

import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.option.OptionRegistry;
import org.eclipse.californium.core.network.serialization.DataParser;

/* JADX INFO: loaded from: classes20.dex */
public class zwi extends DataParser {
    private final boolean e;

    public zwi() {
        this(false, zvo.a());
    }

    @Deprecated
    public zwi(boolean z, int[] iArr) {
        super(iArr);
        this.e = z;
    }

    public zwi(boolean z, OptionRegistry optionRegistry) {
        super(optionRegistry);
        this.e = z;
    }

    @Override // org.eclipse.californium.core.network.serialization.DataParser
    public zwj parseHeader(zzf zzfVar) {
        if (!zzfVar.h(4)) {
            throw new zvb("UDP Message too short! " + (zzfVar.b() / 8) + " must be at least 4 bytes!");
        }
        int iA = zzfVar.a(2);
        c(iA);
        CoAP.Type typeValueOf = CoAP.Type.valueOf(zzfVar.a(2));
        boolean z = typeValueOf == CoAP.Type.CON;
        int iA2 = zzfVar.a(4);
        if (iA2 > 8) {
            throw new zvb("UDP Message has invalid token length (> 8) " + iA2);
        }
        int iA3 = zzfVar.a(8);
        int iA4 = zzfVar.a(16);
        if (this.e) {
            if (iA3 == 0) {
                if (zzfVar.d()) {
                    throw new zuw("UDP malformed Empty Message!", null, iA4, iA3, z);
                }
            } else if (typeValueOf == CoAP.Type.RST) {
                throw new zuw("UDP malformed RST Message!", null, iA4, iA3, z);
            }
        }
        if (!zzfVar.h(iA2)) {
            throw new zuw("UDP Message too short for token! " + (zzfVar.b() / 8) + " must be at least " + iA2 + " bytes!", null, iA4, iA3, z);
        }
        return new zwj(iA, typeValueOf, zve.e(zzfVar.b(iA2)), iA3, iA4, 0);
    }

    @Override // org.eclipse.californium.core.network.serialization.DataParser
    public void assertValidOptions(zvi zviVar) {
        c(zviVar);
    }

    private void c(int i) {
        if (i == 1) {
            return;
        }
        throw new zvb("UDP Message has invalid version: " + i);
    }

    public static void c(zvi zviVar) {
        zuv zuvVarF = zviVar.f();
        if (zuvVarF != null && zuvVarF.f()) {
            throw new IllegalArgumentException("Block1 BERT used for UDP!");
        }
        zuv zuvVarJ = zviVar.j();
        if (zuvVarJ != null && zuvVarJ.f()) {
            throw new IllegalArgumentException("Block2 BERT used for UDP!");
        }
    }
}
