package defpackage;

import java.util.List;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.CertificateTypeExtension;
import org.eclipse.californium.scandium.dtls.HelloExtension;

/* JADX INFO: loaded from: classes20.dex */
public class aacb extends CertificateTypeExtension {
    private aacb(zzf zzfVar) {
        super(HelloExtension.ExtensionType.SERVER_CERT_TYPE, zzfVar);
    }

    public aacb(List<CertificateType> list) {
        super(HelloExtension.ExtensionType.SERVER_CERT_TYPE, list);
    }

    public aacb(CertificateType certificateType) {
        super(HelloExtension.ExtensionType.SERVER_CERT_TYPE, certificateType);
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public String toString(int i) {
        return super.toString(i, "Server");
    }

    public static aacb c(zzf zzfVar) {
        return new aacb(zzfVar);
    }
}
