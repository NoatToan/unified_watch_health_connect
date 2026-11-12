package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class bg5 implements hd, e7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bf f4174a;

    public bg5(bf bfVar) {
        this.f4174a = bfVar;
    }

    @Override // defpackage.e7d
    public re getLoadedObject() throws IOException {
        try {
            return new zf5(this.f4174a.d());
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }

    @Override // defpackage.hd
    public re toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }
}
