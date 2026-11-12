package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.californium.scandium.dtls.HelloExtension;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;

/* JADX INFO: loaded from: classes20.dex */
public class aacf extends HelloExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<SignatureAndHashAlgorithm> f121a;

    public aacf(List<SignatureAndHashAlgorithm> list) {
        super(HelloExtension.ExtensionType.SIGNATURE_ALGORITHMS);
        this.f121a = list;
    }

    public List<SignatureAndHashAlgorithm> d() {
        return this.f121a;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public String toString(int i) {
        StringBuilder sb = new StringBuilder(super.toString(i));
        String strD = zzp.d(i + 1);
        String strD2 = zzp.d(i + 2);
        sb.append(strD);
        sb.append("Signature Algorithms (");
        sb.append(this.f121a.size());
        sb.append(" algorithms):");
        sb.append(zzp.c());
        for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : this.f121a) {
            sb.append(strD2);
            sb.append("Signature and Hash Algorithm: ");
            sb.append(signatureAndHashAlgorithm);
            sb.append(zzp.c());
        }
        return sb.toString();
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public int getExtensionLength() {
        return (this.f121a.size() * 2) + 2;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public void writeExtensionTo(zzl zzlVar) {
        zzlVar.d(this.f121a.size() * 2, 16);
        for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : this.f121a) {
            zzlVar.d(signatureAndHashAlgorithm.c().getCode(), 8);
            zzlVar.d(signatureAndHashAlgorithm.b().getCode(), 8);
        }
    }

    public static aacf d(zzf zzfVar) {
        ArrayList arrayList = new ArrayList();
        zzf zzfVarD = zzfVar.d(zzfVar.a(16));
        while (zzfVarD.d()) {
            arrayList.add(new SignatureAndHashAlgorithm(zzfVarD.a(8), zzfVarD.a(8)));
        }
        return new aacf(Collections.unmodifiableList(arrayList));
    }
}
