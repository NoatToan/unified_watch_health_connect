package defpackage;

import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.HelloExtension;

/* JADX INFO: loaded from: classes20.dex */
public final class aaby extends HelloExtension {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static aaby f110b = new aaby(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aade f111a;

    private aaby(aade aadeVar) {
        super(HelloExtension.ExtensionType.SERVER_NAME);
        this.f111a = aadeVar;
    }

    public static aaby c() {
        return f110b;
    }

    public static aaby c(aade aadeVar) {
        if (aadeVar == null) {
            throw new NullPointerException("server names must not be null");
        }
        if (aadeVar.d() == 0) {
            throw new IllegalArgumentException("server names must not be empty");
        }
        return new aaby(aadeVar);
    }

    public aade e() {
        return this.f111a;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public String toString(int i) {
        String string = super.toString(i);
        if (this.f111a == null) {
            return string;
        }
        return string + this.f111a.e(i + 1) + zzp.c();
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public int getExtensionLength() {
        aade aadeVar = this.f111a;
        if (aadeVar != null) {
            return aadeVar.a();
        }
        return 0;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public void writeExtensionTo(zzl zzlVar) {
        aade aadeVar = this.f111a;
        if (aadeVar != null) {
            aadeVar.b(zzlVar);
        }
    }

    public static aaby a(zzf zzfVar) throws aaay {
        if (!zzfVar.d()) {
            return c();
        }
        aade aadeVarB = aade.b();
        try {
            aadeVarB.c(zzfVar);
            return new aaby(aadeVarB);
        } catch (IllegalArgumentException e) {
            if (e.getCause() instanceof IllegalArgumentException) {
                throw new aaay("Server Name Indication extension contains unknown name_type", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
            }
            throw new aaay("malformed Server Name Indication extension", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
        }
    }
}
