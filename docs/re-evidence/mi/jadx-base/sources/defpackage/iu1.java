package defpackage;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class iu1 implements ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public af f22089a;

    public iu1(af afVar) {
        this.f22089a = afVar;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() throws IOException {
        return new gu1(this.f22089a.d());
    }

    @Override // defpackage.gd
    public pe toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
