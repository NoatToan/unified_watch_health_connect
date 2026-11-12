package wt2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements k7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f187198b;

    public /* synthetic */ j(k kVar, int i14) {
        this.f187197a = i14;
        this.f187198b = kVar;
    }

    @Override // k7.b
    public final void accept(Object obj) {
        switch (this.f187197a) {
            case 0:
                this.f187198b.b((byte[]) obj);
                break;
            default:
                byte[] bArr = (byte[]) obj;
                k kVar = this.f187198b;
                Logger logger = kVar.f187202d;
                if (bArr == null) {
                    logger.error("sendDataMessage: failed to send file data");
                    kVar.d(k.c.f187208d);
                } else {
                    try {
                        kVar.b(bArr);
                    } catch (Exception e4) {
                        logger.error("sendDataMessage: failed to parse message", (Throwable) e4);
                        kVar.d(k.c.f187208d);
                        return;
                    }
                }
                break;
        }
    }
}
