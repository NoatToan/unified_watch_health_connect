package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class j06 implements x8i<h06, h06> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f22279a = Logger.getLogger(j06.class.getName());

    public static class a implements h06 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v8i<h06> f22280a;

        public a(v8i<h06> v8iVar) {
            this.f22280a = v8iVar;
        }

        @Override // defpackage.h06
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<v8i.b<h06>> it = this.f22280a.c(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().c().a(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        j06.f22279a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator<v8i.b<h06>> it2 = this.f22280a.e().iterator();
            while (it2.hasNext()) {
                try {
                    return it2.next().c().a(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        @Override // defpackage.h06
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return b83.a(this.f22280a.b().a(), this.f22280a.b().c().b(bArr, bArr2));
        }
    }

    public static void e() throws GeneralSecurityException {
        cdk.r(new j06());
    }

    @Override // defpackage.x8i
    public Class<h06> a() {
        return h06.class;
    }

    @Override // defpackage.x8i
    public Class<h06> b() {
        return h06.class;
    }

    @Override // defpackage.x8i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h06 c(v8i<h06> v8iVar) {
        return new a(v8iVar);
    }
}
