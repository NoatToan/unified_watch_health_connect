package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qqk implements pzd {
    public static final xve<Class<?>, byte[]> j = new xve<>(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj1 f31751b;
    public final pzd c;
    public final pzd d;
    public final int e;
    public final int f;
    public final Class<?> g;
    public final cch h;
    public final lyp<?> i;

    public qqk(nj1 nj1Var, pzd pzdVar, pzd pzdVar2, int i, int i2, lyp<?> lypVar, Class<?> cls, cch cchVar) {
        this.f31751b = nj1Var;
        this.c = pzdVar;
        this.d = pzdVar2;
        this.e = i;
        this.f = i2;
        this.i = lypVar;
        this.g = cls;
        this.h = cchVar;
    }

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f31751b.b(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        lyp<?> lypVar = this.i;
        if (lypVar != null) {
            lypVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        messageDigest.update(c());
        this.f31751b.put(bArr);
    }

    public final byte[] c() {
        xve<Class<?>, byte[]> xveVar = j;
        byte[] bArrE = xveVar.e(this.g);
        if (bArrE != null) {
            return bArrE;
        }
        byte[] bytes = this.g.getName().getBytes(pzd.f30934a);
        xveVar.i(this.g, bytes);
        return bytes;
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        if (!(obj instanceof qqk)) {
            return false;
        }
        qqk qqkVar = (qqk) obj;
        return this.f == qqkVar.f && this.e == qqkVar.e && ulq.e(this.i, qqkVar.i) && this.g.equals(qqkVar.g) && this.c.equals(qqkVar.c) && this.d.equals(qqkVar.d) && this.h.equals(qqkVar.h);
    }

    @Override // defpackage.pzd
    public int hashCode() {
        int iHashCode = (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f;
        lyp<?> lypVar = this.i;
        if (lypVar != null) {
            iHashCode = (iHashCode * 31) + lypVar.hashCode();
        }
        return (((iHashCode * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + AbstractJsonLexerKt.END_OBJ;
    }
}
