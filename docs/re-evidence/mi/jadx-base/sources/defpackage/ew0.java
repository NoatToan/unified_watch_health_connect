package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes5.dex */
public final class ew0 extends o0e<cw0> {

    public class a extends o0e.b<xu0, cw0> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public xu0 a(cw0 cw0Var) throws GeneralSecurityException {
            return new bw0(cw0Var.F().toByteArray());
        }
    }

    public class b extends o0e.a<dw0, cw0> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public cw0 a(dw0 dw0Var) {
            return cw0.H().t(ByteString.copyFrom(mbj.c(dw0Var.D()))).u(ew0.this.k()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public dw0 c(ByteString byteString) throws InvalidProtocolBufferException {
            return dw0.E(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(dw0 dw0Var) throws GeneralSecurityException {
            fnq.a(dw0Var.D());
        }
    }

    public ew0() {
        super(cw0.class, new a(xu0.class));
    }

    public static boolean j() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void m(boolean z) throws GeneralSecurityException {
        if (j()) {
            cdk.q(new ew0(), z);
        }
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // defpackage.o0e
    public o0e.a<dw0, cw0> e() {
        return new b(dw0.class);
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
    public cw0 g(ByteString byteString) throws InvalidProtocolBufferException {
        return cw0.I(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(cw0 cw0Var) throws GeneralSecurityException {
        fnq.c(cw0Var.G(), k());
        fnq.a(cw0Var.F().size());
    }
}
