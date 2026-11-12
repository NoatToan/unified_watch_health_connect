package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class dv0 extends o0e<bv0> {

    public class a extends o0e.b<aze, bv0> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public aze a(bv0 bv0Var) throws GeneralSecurityException {
            return new l8i(new j8i(bv0Var.G().toByteArray()), bv0Var.H().E());
        }
    }

    public class b extends o0e.a<cv0, bv0> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public bv0 a(cv0 cv0Var) throws GeneralSecurityException {
            return bv0.J().v(0).t(ByteString.copyFrom(mbj.c(cv0Var.D()))).u(cv0Var.E()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public cv0 c(ByteString byteString) throws InvalidProtocolBufferException {
            return cv0.F(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(cv0 cv0Var) throws GeneralSecurityException {
            dv0.p(cv0Var.E());
            dv0.q(cv0Var.D());
        }
    }

    public dv0() {
        super(bv0.class, new a(aze.class));
    }

    public static void n(boolean z) throws GeneralSecurityException {
        cdk.q(new dv0(), z);
    }

    public static void p(ev0 ev0Var) throws GeneralSecurityException {
        if (ev0Var.E() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (ev0Var.E() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void q(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // defpackage.o0e
    public o0e.a<cv0, bv0> e() {
        return new b(cv0.class);
    }

    @Override // defpackage.o0e
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public bv0 g(ByteString byteString) throws InvalidProtocolBufferException {
        return bv0.K(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(bv0 bv0Var) throws GeneralSecurityException {
        fnq.c(bv0Var.I(), l());
        q(bv0Var.G().size());
        p(bv0Var.H());
    }
}
