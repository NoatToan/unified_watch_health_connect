package defpackage;

import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.HelloExtension;

/* JADX INFO: loaded from: classes20.dex */
public final class aaan extends HelloExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aaae f45a;

    private aaan(aaae aaaeVar, HelloExtension.ExtensionType extensionType) {
        super(extensionType);
        this.f45a = aaaeVar;
    }

    public aaae b() {
        return this.f45a;
    }

    public boolean e() {
        return getType() != HelloExtension.ExtensionType.CONNECTION_ID;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "DTLS Conection ID: " + this.f45a + zzp.c();
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public int getExtensionLength() {
        return this.f45a.c() + 1;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public void writeExtensionTo(zzl zzlVar) {
        zzlVar.c(this.f45a, 8);
    }

    public static aaan c(aaae aaaeVar, HelloExtension.ExtensionType extensionType) {
        if (aaaeVar == null) {
            throw new NullPointerException("cid must not be null!");
        }
        if (extensionType == null) {
            throw new NullPointerException("type must not be null!");
        }
        if (extensionType != HelloExtension.ExtensionType.CONNECTION_ID && extensionType.getReplacementType() != HelloExtension.ExtensionType.CONNECTION_ID) {
            throw new IllegalArgumentException(extensionType + " type is not supported as Connection ID!");
        }
        return new aaan(aaaeVar, extensionType);
    }

    public static aaan a(zzf zzfVar, HelloExtension.ExtensionType extensionType) throws aaay {
        if (zzfVar == null) {
            throw new NullPointerException("cid must not be null!");
        }
        if (extensionType == null) {
            throw new NullPointerException("type must not be null!");
        }
        if (extensionType != HelloExtension.ExtensionType.CONNECTION_ID && extensionType.getReplacementType() != HelloExtension.ExtensionType.CONNECTION_ID) {
            throw new IllegalArgumentException(extensionType + " type is not supported as Connection ID!");
        }
        int iB = zzfVar.b() / 8;
        if (iB == 0) {
            throw new aaay("Connection id length must be provided!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        if (iB > 256) {
            StringBuilder sb = new StringBuilder("Connection id length too large! 255 max, but has ");
            sb.append(iB - 1);
            throw new aaay(sb.toString(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        int iA = zzfVar.a(8);
        int i = iB - 1;
        if (iA == i) {
            if (iA == 0) {
                return new aaan(aaae.f20c, extensionType);
            }
            return new aaan(new aaae(zzfVar.b(iA)), extensionType);
        }
        throw new aaay("Connection id length " + iA + " doesn't match " + i + "!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
    }
}
