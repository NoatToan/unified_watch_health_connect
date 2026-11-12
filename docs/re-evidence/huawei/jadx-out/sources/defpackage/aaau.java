package defpackage;

import org.eclipse.californium.scandium.dtls.HelloExtension;

/* JADX INFO: loaded from: classes20.dex */
public final class aaau extends HelloExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static aaau f50a = new aaau();

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public int getExtensionLength() {
        return 0;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public void writeExtensionTo(zzl zzlVar) {
    }

    private aaau() {
        super(HelloExtension.ExtensionType.EXTENDED_MASTER_SECRET);
    }

    public static aaau d(zzf zzfVar) {
        if (zzfVar == null) {
            throw new NullPointerException("extended master secret must not be null!");
        }
        return f50a;
    }
}
