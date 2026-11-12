package defpackage;

import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.coap.CoAP;

/* JADX INFO: loaded from: classes20.dex */
public final class zux {
    public static String e(zuy zuyVar) {
        return d(zuyVar.a());
    }

    public static String d(zvf zvfVar) {
        String strC = zzp.c();
        StringBuilder sb = new StringBuilder("==[ CoAP Response ]============================================");
        sb.append(strC);
        sb.append(String.format("MID    : %d%n", Integer.valueOf(zvfVar.getMID())));
        sb.append(String.format("Token  : %s%n", zvfVar.getTokenString()));
        sb.append(String.format("Type   : %s%n", zvfVar.getType()));
        CoAP.ResponseCode responseCodeD = zvfVar.d();
        sb.append(String.format("Status : %s - %s%n", responseCodeD, responseCodeD.name()));
        Long lC = zvfVar.c();
        if (zvfVar.getOffloadMode() != null) {
            if (lC != null) {
                sb.append(String.format("RTT    : %d ms%n", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(lC.longValue()))));
            }
            sb.append("(offloaded)");
            sb.append(strC);
        } else {
            sb.append(String.format("Options: %s%n", zvfVar.getOptions()));
            if (lC != null) {
                sb.append(String.format("RTT    : %d ms%n", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(lC.longValue()))));
            }
            sb.append(String.format("Payload: %d Bytes%n", Integer.valueOf(zvfVar.getPayloadSize())));
            if (zvfVar.getPayloadSize() > 0 && zuz.d(zvfVar.getOptions().h())) {
                sb.append("---------------------------------------------------------------");
                sb.append(strC);
                sb.append(zvfVar.getPayloadString());
                sb.append(strC);
            }
        }
        sb.append("===============================================================");
        return sb.toString();
    }
}
