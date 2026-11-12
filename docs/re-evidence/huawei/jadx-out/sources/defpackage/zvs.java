package defpackage;

import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.OptionNumberRegistry;
import org.eclipse.californium.core.coap.option.BaseOptionDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zvs extends BaseOptionDefinition {
    public zvs(int i, String str, boolean z, int... iArr) {
        super(i, str, OptionNumberRegistry.OptionFormat.STRING, z, iArr);
    }

    @Override // org.eclipse.californium.core.coap.option.BaseOptionDefinition, org.eclipse.californium.core.coap.option.OptionDefinition
    public zvc create(String str) {
        return new zvc(this, str);
    }

    public static String e(byte[] bArr) {
        return new String(bArr, CoAP.f44404a);
    }

    public static byte[] b(String str) {
        return str.getBytes(CoAP.f44404a);
    }
}
