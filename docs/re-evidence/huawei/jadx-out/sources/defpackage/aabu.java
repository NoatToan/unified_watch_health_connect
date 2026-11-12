package defpackage;

import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.HelloExtension;

/* JADX INFO: loaded from: classes20.dex */
public final class aabu extends HelloExtension {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103b;

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public int getExtensionLength() {
        return 2;
    }

    public aabu(int i) {
        super(HelloExtension.ExtensionType.RECORD_SIZE_LIMIT);
        this.f103b = b(i);
    }

    public int a() {
        return this.f103b;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "Record Size Limit: " + this.f103b + " bytes" + zzp.c();
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public void writeExtensionTo(zzl zzlVar) {
        zzlVar.d(this.f103b, 16);
    }

    public static aabu b(zzf zzfVar) throws aaay {
        if (zzfVar == null) {
            throw new NullPointerException("record size limit must not be null!");
        }
        int iA = zzfVar.a(16);
        if (iA < 64) {
            throw new aaay("record size limit must be at last 64 bytes, not only " + iA + "!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        return new aabu(iA);
    }

    public static int b(int i) {
        if (i >= 64 && i <= 65535) {
            return i;
        }
        throw new IllegalArgumentException("Record size limit must be within [64...65535], not " + i + "!");
    }
}
