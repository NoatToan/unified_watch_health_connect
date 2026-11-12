package sl2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements ul2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f160016b;

    public /* synthetic */ d(e eVar, int i14) {
        this.f160015a = i14;
        this.f160016b = eVar;
    }

    @Override // ul2.b
    public final void a(ul2.a aVar, byte[] bArr) {
        switch (this.f160015a) {
            case 0:
                Logger logger = e.f160017c;
                e eVar = this.f160016b;
                if (bArr != null && g.h(bArr)) {
                    logger.trace("Sending IS_PASSCODE_SET_COMMAND");
                    aVar.k(e.f160018d, new d(eVar, 1));
                } else {
                    logger.error("Failed to start CRS Applet");
                    eVar.g(aVar, 3, false, -1);
                }
                break;
            case 1:
                a.e(e.f160017c, bArr);
                e eVar2 = this.f160016b;
                if (bArr == null || bArr.length < 5) {
                    eVar2.g(aVar, 18, false, -1);
                } else if (!g.g(bArr)) {
                    eVar2.g(aVar, 25, false, -1);
                } else {
                    byte b14 = bArr[2];
                    if (b14 == 1) {
                        eVar2.g(aVar, 22, true, -1);
                    } else if (b14 == 4) {
                        eVar2.f160021b = 11;
                        aVar.k(e.f160019e, new d(eVar2, 2));
                    } else if (b14 == 5) {
                        eVar2.f160021b = 12;
                        aVar.k(e.f160020f, new d(eVar2, 2));
                    } else if (b14 == 6) {
                        eVar2.g(aVar, 13, true, -1);
                    } else {
                        eVar2.f160021b = 11;
                        eVar2.g(aVar, 11, true, -1);
                    }
                }
                break;
            default:
                e.f(this.f160016b, aVar, bArr);
                break;
        }
    }
}
