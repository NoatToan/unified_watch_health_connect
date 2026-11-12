package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes20.dex */
public class aacw implements AlgorithmParameterSpec, Destroyable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f135c;
    private boolean d;

    public aacw(aacw aacwVar) {
        if (aacwVar == null) {
            throw new NullPointerException("IV missing");
        }
        byte[] bArr = aacwVar.f135c;
        this.f135c = Arrays.copyOf(bArr, bArr.length);
    }

    public aacw(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("IV missing");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("IV is empty");
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("len is negative");
        }
        if (bArr.length - i < i2) {
            throw new IllegalArgumentException("Invalid offset/length combination");
        }
        this.f135c = Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public int c() {
        return this.f135c.length;
    }

    public void c(zzl zzlVar) {
        zzlVar.a(this.f135c);
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        zzg.a(this.f135c);
        this.d = true;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.d;
    }
}
