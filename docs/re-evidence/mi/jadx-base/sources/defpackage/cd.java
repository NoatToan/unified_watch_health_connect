package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class cd extends re {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f5200b = {-1};
    public static final byte[] c = {0};
    public static final cd d = new cd(false);
    public static final cd e = new cd(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5201a;

    public cd(boolean z) {
        this.f5201a = z ? f5200b : c;
    }

    public static cd o(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b2 = bArr[0];
        if (b2 == 0) {
            return d;
        }
        return (b2 & 255) == 255 ? e : new cd(bArr);
    }

    public static cd q(Object obj) {
        if (obj == null || (obj instanceof cd)) {
            return (cd) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (cd) re.j((byte[]) obj);
        } catch (IOException e2) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e2.getMessage());
        }
    }

    public static cd r(boolean z) {
        return z ? e : d;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        return (reVar instanceof cd) && this.f5201a[0] == ((cd) reVar).f5201a[0];
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(1, this.f5201a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return this.f5201a[0];
    }

    @Override // defpackage.re
    public int i() {
        return 3;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public boolean t() {
        return this.f5201a[0] != 0;
    }

    public String toString() {
        return this.f5201a[0] != 0 ? "TRUE" : "FALSE";
    }

    public cd(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        byte b2 = bArr[0];
        if (b2 == 0) {
            this.f5201a = c;
        } else if ((b2 & 255) == 255) {
            this.f5201a = f5200b;
        } else {
            this.f5201a = vj1.e(bArr);
        }
    }
}
