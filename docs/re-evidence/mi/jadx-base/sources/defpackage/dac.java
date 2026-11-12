package defpackage;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class dac extends o0e<bac> {

    public class a extends o0e.b<aze, bac> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public aze a(bac bacVar) throws GeneralSecurityException {
            HashType hashTypeE = bacVar.I().E();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bacVar.H().toByteArray(), "HMAC");
            int iF = bacVar.I().F();
            int i = c.f15303a[hashTypeE.ordinal()];
            if (i == 1) {
                return new l8i(new k8i("HMACSHA1", secretKeySpec), iF);
            }
            if (i == 2) {
                return new l8i(new k8i("HMACSHA256", secretKeySpec), iF);
            }
            if (i == 3) {
                return new l8i(new k8i("HMACSHA512", secretKeySpec), iF);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    public class b extends o0e.a<cac, bac> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public bac a(cac cacVar) throws GeneralSecurityException {
            return bac.K().v(dac.this.k()).u(cacVar.F()).t(ByteString.copyFrom(mbj.c(cacVar.E()))).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public cac c(ByteString byteString) throws InvalidProtocolBufferException {
            return cac.G(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(cac cacVar) throws GeneralSecurityException {
            if (cacVar.E() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            dac.o(cacVar.F());
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15303a;

        static {
            int[] iArr = new int[HashType.values().length];
            f15303a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15303a[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15303a[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public dac() {
        super(bac.class, new a(aze.class));
    }

    public static void m(boolean z) throws GeneralSecurityException {
        cdk.q(new dac(), z);
    }

    public static void o(eac eacVar) throws GeneralSecurityException {
        if (eacVar.F() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = c.f15303a[eacVar.E().ordinal()];
        if (i == 1) {
            if (eacVar.F() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (eacVar.F() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (eacVar.F() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // defpackage.o0e
    public o0e.a<cac, bac> e() {
        return new b(cac.class);
    }

    @Override // defpackage.o0e
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public bac g(ByteString byteString) throws InvalidProtocolBufferException {
        return bac.L(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(bac bacVar) throws GeneralSecurityException {
        fnq.c(bacVar.J(), k());
        if (bacVar.H().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        o(bacVar.I());
    }
}
