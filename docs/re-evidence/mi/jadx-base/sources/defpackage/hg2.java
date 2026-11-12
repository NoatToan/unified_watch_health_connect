package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.X931SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class hg2 implements bc8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f20033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20034b;

    public class a implements ac8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20035a;

        public a(int i) {
            this.f20035a = i;
        }

        @Override // defpackage.ac8
        public byte[] a() {
            if (!(hg2.this.f20033a instanceof SP800SecureRandom) && !(hg2.this.f20033a instanceof X931SecureRandom)) {
                return hg2.this.f20033a.generateSeed((this.f20035a + 7) / 8);
            }
            byte[] bArr = new byte[(this.f20035a + 7) / 8];
            hg2.this.f20033a.nextBytes(bArr);
            return bArr;
        }

        @Override // defpackage.ac8
        public int b() {
            return this.f20035a;
        }
    }

    public hg2(SecureRandom secureRandom, boolean z) {
        this.f20033a = secureRandom;
        this.f20034b = z;
    }

    @Override // defpackage.bc8
    public ac8 get(int i) {
        return new a(i);
    }
}
