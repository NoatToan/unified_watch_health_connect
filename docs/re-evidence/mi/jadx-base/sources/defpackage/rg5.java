package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class rg5 implements ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ky5 f32514a;

    public rg5(ky5 ky5Var) {
        this.f32514a = ky5Var;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() throws IOException {
        return new pg5(this.f32514a.c());
    }

    @Override // defpackage.ie
    public InputStream getOctetStream() {
        return this.f32514a;
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
