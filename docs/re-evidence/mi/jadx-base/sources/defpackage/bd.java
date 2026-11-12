package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class bd extends pe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4071b = {-1};
    public static final byte[] c = {0};
    public static final bd d = new bd(false);
    public static final bd e = new bd(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4072a;

    public bd(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        byte b2 = bArr[0];
        if (b2 == 0) {
            this.f4072a = c;
        } else if ((b2 & 255) == 255) {
            this.f4072a = f4071b;
        } else {
            this.f4072a = wj1.d(bArr);
        }
    }

    public static bd o(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b2 = bArr[0];
        if (b2 == 0) {
            return d;
        }
        return (b2 & 255) == 255 ? e : new bd(bArr);
    }

    public static bd q(Object obj) {
        if (obj == null || (obj instanceof bd)) {
            return (bd) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (bd) pe.j((byte[]) obj);
        } catch (IOException e2) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e2.getMessage());
        }
    }

    public static bd r(boolean z) {
        return z ? e : d;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        return (peVar instanceof bd) && this.f4072a[0] == ((bd) peVar).f4072a[0];
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(1, this.f4072a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return this.f4072a[0];
    }

    @Override // defpackage.pe
    public int i() {
        return 3;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public boolean t() {
        return this.f4072a[0] != 0;
    }

    public String toString() {
        return this.f4072a[0] != 0 ? "TRUE" : "FALSE";
    }

    public bd(boolean z) {
        this.f4072a = z ? f4071b : c;
    }
}
