package defpackage;

import org.eclipse.californium.core.coap.CoAP;

/* JADX INFO: loaded from: classes20.dex */
public class zuy {
    private zvf d;

    protected zuy(zvf zvfVar) {
        if (zvfVar == null) {
            throw new NullPointerException("Response must not be null!");
        }
        this.d = zvfVar;
    }

    public CoAP.ResponseCode b() {
        return this.d.d();
    }

    public String d() {
        return this.d.getPayloadString();
    }

    public zvf a() {
        return this.d;
    }

    public String toString() {
        return this.d.toString();
    }
}
