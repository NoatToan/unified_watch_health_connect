package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class bu1 implements je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bf f4605a;

    public bu1(bf bfVar) {
        this.f4605a = bfVar;
    }

    @Override // defpackage.e7d
    public re getLoadedObject() throws IOException {
        return new zt1(hjo.b(getOctetStream()));
    }

    @Override // defpackage.je
    public InputStream getOctetStream() {
        return new zf4(this.f4605a);
    }

    @Override // defpackage.hd
    public re toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}
