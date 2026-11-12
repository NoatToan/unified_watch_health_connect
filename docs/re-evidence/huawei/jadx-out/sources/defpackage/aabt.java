package defpackage;

import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.HelloExtension;

/* JADX INFO: loaded from: classes20.dex */
public final class aabt extends HelloExtension {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static aabt f102c = new aabt();

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public int getExtensionLength() {
        return 1;
    }

    private aabt() {
        super(HelloExtension.ExtensionType.RENEGOTIATION_INFO);
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public void writeExtensionTo(zzl zzlVar) {
        zzlVar.d((byte) 0);
    }

    public static aabt b(zzf zzfVar) throws aaay {
        if (zzfVar == null) {
            throw new NullPointerException("renegotiation info must not be null!");
        }
        if (zzfVar.e() != 0) {
            throw new aaay("renegotiation info must be empty!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        return f102c;
    }
}
