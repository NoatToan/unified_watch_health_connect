package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class eh5 implements ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bf f16639a;

    public eh5(bf bfVar) {
        this.f16639a = bfVar;
    }

    @Override // defpackage.e7d
    public re getLoadedObject() throws IOException {
        return new ch5(this.f16639a.d(), false);
    }

    @Override // defpackage.hd
    public re toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
