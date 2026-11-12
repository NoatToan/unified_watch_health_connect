package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class jg5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f22761a;

    public jg5(byte[] bArr) {
        this.f22761a = bArr;
    }

    public static jg5 o(ef efVar, boolean z) {
        pe peVarO = efVar.o();
        return (z || (peVarO instanceof jg5)) ? q(peVarO) : new jg5(((ge) peVarO).r());
    }

    public static jg5 q(Object obj) {
        if (obj == null || (obj instanceof jg5)) {
            return (jg5) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (jg5) pe.j((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof jg5) {
            return wj1.a(this.f22761a, ((jg5) peVar).f22761a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return plo.b(this.f22761a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(22, this.f22761a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f22761a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f22761a.length) + 1 + this.f22761a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
