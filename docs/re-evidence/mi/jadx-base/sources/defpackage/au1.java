package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class au1 implements ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public af f3445a;

    public au1(af afVar) {
        this.f3445a = afVar;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() throws IOException {
        return new yt1(gjo.b(getOctetStream()));
    }

    @Override // defpackage.ie
    public InputStream getOctetStream() {
        return new yf4(this.f3445a);
    }

    @Override // defpackage.gd
    public pe toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}
