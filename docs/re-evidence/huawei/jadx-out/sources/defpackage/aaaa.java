package defpackage;

import java.util.List;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.CertificateTypeExtension;
import org.eclipse.californium.scandium.dtls.HelloExtension;

/* JADX INFO: loaded from: classes20.dex */
public class aaaa extends CertificateTypeExtension {
    private aaaa(zzf zzfVar) {
        super(HelloExtension.ExtensionType.CLIENT_CERT_TYPE, zzfVar);
    }

    public aaaa(List<CertificateType> list) {
        super(HelloExtension.ExtensionType.CLIENT_CERT_TYPE, list);
    }

    public aaaa(CertificateType certificateType) {
        super(HelloExtension.ExtensionType.CLIENT_CERT_TYPE, certificateType);
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public String toString(int i) {
        return super.toString(i, "Client");
    }

    public static aaaa e(zzf zzfVar) {
        return new aaaa(zzfVar);
    }
}
