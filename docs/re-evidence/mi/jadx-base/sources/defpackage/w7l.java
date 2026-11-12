package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class w7l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f37690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc8 f37691b;
    public byte[] c;
    public int d;
    public int e;

    public static class a implements ri5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zye f37692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f37693b;
        public final byte[] c;
        public final int d;

        public a(zye zyeVar, byte[] bArr, byte[] bArr2, int i) {
            this.f37692a = zyeVar;
            this.f37693b = bArr;
            this.c = bArr2;
            this.d = i;
        }

        @Override // defpackage.ri5
        public v7l a(ac8 ac8Var) {
            return new ndb(this.f37692a, this.d, ac8Var, this.c, this.f37693b);
        }
    }

    public static class b implements ri5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final aw6 f37694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f37695b;
        public final byte[] c;
        public final int d;

        public b(aw6 aw6Var, byte[] bArr, byte[] bArr2, int i) {
            this.f37694a = aw6Var;
            this.f37695b = bArr;
            this.c = bArr2;
            this.d = i;
        }

        @Override // defpackage.ri5
        public v7l a(ac8 ac8Var) {
            return new llb(this.f37694a, this.d, ac8Var, this.c, this.f37695b);
        }
    }

    public w7l(bc8 bc8Var) {
        this.d = 256;
        this.e = 256;
        this.f37690a = null;
        this.f37691b = bc8Var;
    }

    public SP800SecureRandom a(zye zyeVar, byte[] bArr, boolean z) {
        return new SP800SecureRandom(this.f37690a, this.f37691b.get(this.e), new a(zyeVar, bArr, this.c, this.d), z);
    }

    public SP800SecureRandom b(aw6 aw6Var, byte[] bArr, boolean z) {
        return new SP800SecureRandom(this.f37690a, this.f37691b.get(this.e), new b(aw6Var, bArr, this.c, this.d), z);
    }

    public w7l c(byte[] bArr) {
        this.c = bArr;
        return this;
    }

    public w7l(SecureRandom secureRandom, boolean z) {
        this.d = 256;
        this.e = 256;
        this.f37690a = secureRandom;
        this.f37691b = new hg2(secureRandom, z);
    }
}
