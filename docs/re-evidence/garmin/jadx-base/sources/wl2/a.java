package wl2;

import com.garmin.device.nfc.NfcCommandHandler;
import com.garmin.device.nfc.i;
import com.garmin.device.nfc.j;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import p13.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NfcCommandHandler.e f186019b;

    public /* synthetic */ a(NfcCommandHandler.e eVar, int i14) {
        this.f186018a = i14;
        this.f186019b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        byte[] bArrD;
        Optional optionalAbsent;
        byte b14;
        int i14 = this.f186018a;
        NfcCommandHandler.e eVar = this.f186019b;
        i iVar = (i) obj;
        switch (i14) {
            case 0:
                int i15 = b.f186020p;
                return Boolean.valueOf(j.b(iVar, eVar));
            case 1:
                int i16 = b.f186020p;
                return Boolean.valueOf(j.b(iVar, eVar));
            case 2:
                int i17 = b.f186020p;
                return Boolean.valueOf(j.b(iVar, eVar));
            default:
                int i18 = b.f186020p;
                if (iVar != null && (bArrD = iVar.d()) != null) {
                    if (bArrD.length >= 2) {
                        int i19 = 0;
                        if (((byte) (bArrD[0] & ((byte) 255))) != ((byte) eVar.f50841a) || bArrD[1] == (b14 = (byte) 0)) {
                            optionalAbsent = Optional.absent();
                        } else {
                            int length = bArrD.length;
                            while (true) {
                                if (i19 >= length) {
                                    i19 = -1;
                                } else if (bArrD[i19] != b14) {
                                    i19++;
                                }
                            }
                            optionalAbsent = Optional.of(new String(s.k(1, i19, bArrD), d53.c.f57666b));
                        }
                    } else {
                        optionalAbsent = Optional.absent();
                    }
                    if (optionalAbsent != null) {
                        return optionalAbsent;
                    }
                }
                return Optional.absent();
        }
    }
}
