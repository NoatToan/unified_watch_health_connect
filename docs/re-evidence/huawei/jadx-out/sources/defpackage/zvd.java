package defpackage;

import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.elements.EndpointContext;

/* JADX INFO: loaded from: classes20.dex */
public class zvd extends Message {
    @Override // org.eclipse.californium.core.coap.Message
    public int getRawCode() {
        return 0;
    }

    @Override // org.eclipse.californium.core.coap.Message
    public boolean hasBlock(zuv zuvVar) {
        return false;
    }

    @Override // org.eclipse.californium.core.coap.Message
    public boolean isIntendedPayload() {
        return false;
    }

    public zvd(CoAP.Type type) {
        super(type);
        setProtectFromOffload();
    }

    public String toString() {
        String str;
        String str2;
        if (!hasEmptyToken() || getOptions().d().size() > 0 || getPayloadSize() > 0) {
            String payloadString = getPayloadString();
            if (payloadString == null) {
                str = "no payload";
            } else {
                int length = payloadString.length();
                if (payloadString.indexOf("\n") != -1) {
                    payloadString = payloadString.substring(0, payloadString.indexOf("\n"));
                }
                if (payloadString.length() > 24) {
                    payloadString = payloadString.substring(0, 20);
                }
                str = "\"" + payloadString + "\"";
                if (str.length() != length + 2) {
                    str = str + ".. " + str.length() + " bytes";
                }
            }
            str2 = " NON-EMPTY: Token=" + getTokenString() + ", " + getOptions() + ", " + str;
        } else {
            str2 = "";
        }
        return String.format("%s        MID=%5d%s", getType(), Integer.valueOf(getMID()), str2);
    }

    @Override // org.eclipse.californium.core.coap.Message
    public void assertPayloadMatchsBlocksize() {
        if (getPayloadSize() <= 0) {
            return;
        }
        throw new IllegalStateException("Empty message contains " + getPayloadSize() + " bytes payload!");
    }

    public static zvd a(Message message) {
        return e(message, message.getSourceContext());
    }

    public static zvd e(Message message, EndpointContext endpointContext) {
        zvd zvdVar = new zvd(CoAP.Type.ACK);
        zvdVar.setDestinationContext(endpointContext);
        zvdVar.setMID(message.getMID());
        return zvdVar;
    }

    public static zvd d(Message message) {
        return c(message, message.getSourceContext());
    }

    public static zvd c(Message message, EndpointContext endpointContext) {
        zvd zvdVar = new zvd(CoAP.Type.RST);
        zvdVar.setDestinationContext(endpointContext);
        zvdVar.setMID(message.getMID());
        return zvdVar;
    }
}
