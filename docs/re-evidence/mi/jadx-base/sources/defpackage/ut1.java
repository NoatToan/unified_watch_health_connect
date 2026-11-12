package defpackage;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class ut1 implements gd, d7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af f36108b;

    public ut1(int i, af afVar) {
        this.f36107a = i;
        this.f36108b = afVar;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() throws IOException {
        return new st1(this.f36107a, this.f36108b.d());
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
