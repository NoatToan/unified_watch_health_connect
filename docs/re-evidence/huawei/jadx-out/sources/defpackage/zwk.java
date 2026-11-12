package defpackage;

import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.option.OptionRegistry;
import org.eclipse.californium.core.network.serialization.DataParser;

/* JADX INFO: loaded from: classes20.dex */
public class zwk extends DataParser {
    public zwk() {
    }

    @Deprecated
    public zwk(int[] iArr) {
        super(iArr);
    }

    public zwk(OptionRegistry optionRegistry) {
        super(optionRegistry);
    }

    @Override // org.eclipse.californium.core.network.serialization.DataParser
    public zwj parseHeader(zzf zzfVar) {
        int i = 1;
        if (!zzfVar.h(1)) {
            throw new zvb("TCP Message too short! " + (zzfVar.b() / 8) + " must be at least 1 byte!");
        }
        int iA = zzfVar.a(4);
        int iA2 = zzfVar.a(4);
        if (iA2 > 8) {
            throw new zvb("TCP Message has invalid token length (> 8) " + iA2);
        }
        if (iA != 13) {
            if (iA == 14) {
                i = 2;
            } else {
                i = iA == 15 ? 4 : 0;
            }
        }
        int i2 = i + 1 + iA2;
        if (!zzfVar.h(i2)) {
            throw new zvb("TCP Message too short! " + (zzfVar.b() / 8) + " must be at least " + i2 + " bytes!");
        }
        zzfVar.b(i);
        return new zwj(1, CoAP.Type.CON, zve.e(zzfVar.b(iA2)), zzfVar.a(8), -1, 0);
    }
}
