package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class zu0 implements x8i<xu0, xu0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f41677a = Logger.getLogger(zu0.class.getName());

    public static class b implements xu0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v8i<xu0> f41678a;

        @Override // defpackage.xu0
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return b83.a(this.f41678a.b().a(), this.f41678a.b().c().a(bArr, bArr2));
        }

        @Override // defpackage.xu0
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<v8i.b<xu0>> it = this.f41678a.c(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().c().b(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        zu0.f41677a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator<v8i.b<xu0>> it2 = this.f41678a.e().iterator();
            while (it2.hasNext()) {
                try {
                    return it2.next().c().b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        public b(v8i<xu0> v8iVar) {
            this.f41678a = v8iVar;
        }
    }

    public static void e() throws GeneralSecurityException {
        cdk.r(new zu0());
    }

    @Override // defpackage.x8i
    public Class<xu0> a() {
        return xu0.class;
    }

    @Override // defpackage.x8i
    public Class<xu0> b() {
        return xu0.class;
    }

    @Override // defpackage.x8i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public xu0 c(v8i<xu0> v8iVar) throws GeneralSecurityException {
        return new b(v8iVar);
    }
}
