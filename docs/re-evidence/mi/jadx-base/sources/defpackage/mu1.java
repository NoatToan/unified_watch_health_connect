package defpackage;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class mu1 implements gd, d7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27212b;
    public af c;

    public mu1(boolean z, int i, af afVar) {
        this.f27211a = z;
        this.f27212b = i;
        this.c = afVar;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() throws IOException {
        return this.c.c(this.f27211a, this.f27212b);
    }

    @Override // defpackage.gd
    public pe toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
