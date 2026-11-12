package defpackage;

import org.eclipse.californium.scandium.dtls.ConnectionIdGenerator;

/* JADX INFO: loaded from: classes20.dex */
public class aaae extends zzg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aaae f20c = new aaae(zzg.f54809a);

    public static boolean a(ConnectionIdGenerator connectionIdGenerator) {
        return connectionIdGenerator != null;
    }

    public aaae(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.zzg
    public String toString() {
        return "CID=" + a();
    }

    public static boolean c(ConnectionIdGenerator connectionIdGenerator) {
        return connectionIdGenerator != null && connectionIdGenerator.useConnectionId();
    }

    public static boolean e(aaae aaaeVar) {
        return (aaaeVar == null || aaaeVar.b()) ? false : true;
    }
}
