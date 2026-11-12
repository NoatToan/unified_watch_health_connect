package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class sg5 implements je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ly5 f33606a;

    public sg5(ly5 ly5Var) {
        this.f33606a = ly5Var;
    }

    @Override // defpackage.e7d
    public re getLoadedObject() throws IOException {
        return new qg5(this.f33606a.c());
    }

    @Override // defpackage.je
    public InputStream getOctetStream() {
        return this.f33606a;
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
