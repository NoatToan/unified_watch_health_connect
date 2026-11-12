package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class iee implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rd f21052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21053b = a();

    public iee(byte[] bArr) {
        this.f21052a = new rd(bArr, true);
    }

    public final Object a() {
        try {
            return this.f21052a.s();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed DER construction: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f21053b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f21053b;
        this.f21053b = a();
        return obj;
    }
}
