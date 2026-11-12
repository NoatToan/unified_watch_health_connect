package ma;

import android.net.Uri;
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

/* JADX INFO: loaded from: classes.dex */
public class a implements ha.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha.d f117462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f117463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f117464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f117465d;

    public a(ha.d dVar, byte[] bArr, byte[] bArr2) {
        this.f117462a = dVar;
        this.f117463b = bArr;
        this.f117464c = bArr2;
    }

    @Override // ha.d
    public final void a(ha.n nVar) {
        nVar.getClass();
        this.f117462a.a(nVar);
    }

    @Override // ha.d
    public final long b(ha.g gVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f117463b, "AES"), new IvParameterSpec(this.f117464c));
                ha.e eVar = new ha.e(this.f117462a, gVar);
                this.f117465d = new CipherInputStream(eVar, cipher);
                eVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e4) {
                o2.c.p(e4);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e14) {
            o2.c.p(e14);
            return 0L;
        }
    }

    @Override // ha.d
    public final void close() {
        if (this.f117465d != null) {
            this.f117465d = null;
            this.f117462a.close();
        }
    }

    @Override // ha.d
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f117462a.getResponseHeaders();
    }

    @Override // ha.d
    public final Uri getUri() {
        return this.f117462a.getUri();
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) throws IOException {
        this.f117465d.getClass();
        int i16 = this.f117465d.read(bArr, i14, i15);
        if (i16 < 0) {
            return -1;
        }
        return i16;
    }
}
