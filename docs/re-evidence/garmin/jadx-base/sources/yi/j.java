package yi;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import qj.m;

/* JADX INFO: loaded from: classes7.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj.i<ui.e, String> f197313a = new qj.i<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj.a.c f197314b = rj.a.a(10, new a(this));

    public class a implements rj.a.b<b> {
        public a(j jVar) {
        }

        @Override // rj.a.b
        public final b b() {
            try {
                return new b(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256));
            } catch (NoSuchAlgorithmException e4) {
                o2.c.p(e4);
                return null;
            }
        }
    }

    public static final class b implements rj.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageDigest f197315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rj.d.b f197316b = new rj.d.b();

        public b(MessageDigest messageDigest) {
            this.f197315a = messageDigest;
        }

        @Override // rj.a.d
        public final rj.d.b e() {
            return this.f197316b;
        }
    }

    public final String a(ui.e eVar) {
        String strA;
        synchronized (this.f197313a) {
            strA = this.f197313a.a(eVar);
        }
        if (strA == null) {
            b bVar = (b) this.f197314b.acquire();
            try {
                eVar.b(bVar.f197315a);
                byte[] bArrDigest = bVar.f197315a.digest();
                char[] cArr = m.f144983b;
                synchronized (cArr) {
                    for (int i14 = 0; i14 < bArrDigest.length; i14++) {
                        byte b14 = bArrDigest[i14];
                        int i15 = b14 & UnsignedBytes.MAX_VALUE;
                        int i16 = i14 * 2;
                        char[] cArr2 = m.f144982a;
                        cArr[i16] = cArr2[i15 >>> 4];
                        cArr[i16 + 1] = cArr2[b14 & Ascii.SI];
                    }
                    strA = new String(cArr);
                }
                this.f197314b.a(bVar);
            } catch (Throwable th3) {
                this.f197314b.a(bVar);
                throw th3;
            }
        }
        synchronized (this.f197313a) {
            this.f197313a.d(eVar, strA);
        }
        return strA;
    }
}
