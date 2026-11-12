package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class nu1 implements hd, e7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28369b;
    public bf c;

    public nu1(boolean z, int i, bf bfVar) {
        this.f28368a = z;
        this.f28369b = i;
        this.c = bfVar;
    }

    @Override // defpackage.e7d
    public re getLoadedObject() throws IOException {
        return this.c.c(this.f28368a, this.f28369b);
    }

    @Override // defpackage.hd
    public re toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
