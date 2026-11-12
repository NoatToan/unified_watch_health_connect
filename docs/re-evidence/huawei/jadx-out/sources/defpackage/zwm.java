package defpackage;

import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.network.serialization.DataSerializer;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class zwm extends DataSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f54684b = aaex.a((Class<?>) zwm.class);

    @Override // org.eclipse.californium.core.network.serialization.DataSerializer
    public void serializeMessage(zzl zzlVar, Message message) {
        int mid = message.getMID();
        if (mid == -1) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("MID required for UDP serialization!");
            f54684b.warn("UDP, {}:", message, illegalArgumentException);
            throw illegalArgumentException;
        }
        serializeHeader(zzlVar, new zwj(1, message.getType(), message.getToken(), message.getRawCode(), mid, -1));
        zzlVar.g();
        serializeOptionsAndPayload(zzlVar, message.getOptions(), message.getPayload());
    }

    @Override // org.eclipse.californium.core.network.serialization.DataSerializer
    public void serializeHeader(zzl zzlVar, zwj zwjVar) {
        zzlVar.d(1, 2);
        zzlVar.d(zwjVar.a().value, 2);
        zzlVar.d(zwjVar.e().c(), 4);
        zzlVar.d(zwjVar.c(), 8);
        zzlVar.d(zwjVar.b(), 16);
        zzlVar.a(zwjVar.e().d());
    }

    @Override // org.eclipse.californium.core.network.serialization.DataSerializer
    public void assertValidOptions(zvi zviVar) {
        zwi.c(zviVar);
    }
}
