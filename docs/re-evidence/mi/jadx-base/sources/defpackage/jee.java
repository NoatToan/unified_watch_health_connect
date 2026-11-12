package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class jee implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ud f22700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22701b = a();

    public jee(byte[] bArr) {
        this.f22700a = new ud(bArr, true);
    }

    public final Object a() {
        try {
            return this.f22700a.s();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed DER construction: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f22701b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f22701b;
        this.f22701b = a();
        return obj;
    }
}
