package defpackage;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Exception;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class ag5 implements gd, d7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public af f966a;

    public ag5(af afVar) {
        this.f966a = afVar;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() throws IOException {
        try {
            return new yf5(this.f966a.d());
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }

    @Override // defpackage.gd
    public pe toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }
}
