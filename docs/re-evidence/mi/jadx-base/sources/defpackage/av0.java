package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class av0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3478b;
    public final byte[] c;
    public CipherInputStream d;

    public av0(a aVar, byte[] bArr, byte[] bArr2) {
        this.f3477a = aVar;
        this.f3478b = bArr;
        this.c = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final long b(b bVar) throws IOException {
        try {
            Cipher cipherR = r();
            try {
                cipherR.init(2, new SecretKeySpec(this.f3478b, "AES"), new IvParameterSpec(this.c));
                dp5 dp5Var = new dp5(this.f3477a, bVar);
                this.d = new CipherInputStream(dp5Var, cipherR);
                dp5Var.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        if (this.d != null) {
            this.d = null;
            this.f3477a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final Map<String, List<String>> d() {
        return this.f3477a.d();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final void f(fxp fxpVar) {
        rk1.e(fxpVar);
        this.f3477a.f(fxpVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final Uri h() {
        return this.f3477a.h();
    }

    public Cipher r() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // defpackage.zm5
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        rk1.e(this.d);
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
