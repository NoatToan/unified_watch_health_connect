package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class vt1 implements hd, e7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf f37199b;

    public vt1(int i, bf bfVar) {
        this.f37198a = i;
        this.f37199b = bfVar;
    }

    @Override // defpackage.e7d
    public re getLoadedObject() throws IOException {
        return new tt1(this.f37198a, this.f37199b.d());
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
