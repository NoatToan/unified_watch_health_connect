package defpackage;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class dh5 implements ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public af f15527a;

    public dh5(af afVar) {
        this.f15527a = afVar;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() throws IOException {
        return new bh5(this.f15527a.d(), false);
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
