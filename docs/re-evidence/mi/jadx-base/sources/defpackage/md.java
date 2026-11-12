package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class md extends re {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static md[] f26024b = new md[12];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f26025a;

    public md(byte[] bArr) {
        if (!jdi.c("org.bouncycastle.asn1.allow_unsafe_integer") && wd.t(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        this.f26025a = vj1.e(bArr);
    }

    public static md o(byte[] bArr) {
        if (bArr.length > 1) {
            return new md(bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        md[] mdVarArr = f26024b;
        if (i >= mdVarArr.length) {
            return new md(vj1.e(bArr));
        }
        md mdVar = mdVarArr[i];
        if (mdVar != null) {
            return mdVar;
        }
        md mdVar2 = new md(vj1.e(bArr));
        mdVarArr[i] = mdVar2;
        return mdVar2;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof md) {
            return vj1.a(this.f26025a, ((md) reVar).f26025a);
        }
        return false;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(10, this.f26025a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f26025a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f26025a.length) + 1 + this.f26025a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }
}
