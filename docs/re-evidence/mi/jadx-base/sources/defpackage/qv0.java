package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class qv0 extends o0e<ov0> {

    public class a extends o0e.b<xu0, ov0> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public xu0 a(ov0 ov0Var) throws GeneralSecurityException {
            return new nv0(ov0Var.G().toByteArray(), ov0Var.H().E());
        }
    }

    public class b extends o0e.a<pv0, ov0> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ov0 a(pv0 pv0Var) throws GeneralSecurityException {
            return ov0.J().t(ByteString.copyFrom(mbj.c(pv0Var.D()))).u(pv0Var.E()).v(qv0.this.j()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public pv0 c(ByteString byteString) throws InvalidProtocolBufferException {
            return pv0.F(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(pv0 pv0Var) throws GeneralSecurityException {
            fnq.a(pv0Var.D());
            if (pv0Var.E().E() != 12 && pv0Var.E().E() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public qv0() {
        super(ov0.class, new a(xu0.class));
    }

    public static void l(boolean z) throws GeneralSecurityException {
        cdk.q(new qv0(), z);
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // defpackage.o0e
    public o0e.a<pv0, ov0> e() {
        return new b(pv0.class);
    }

    @Override // defpackage.o0e
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ov0 g(ByteString byteString) throws InvalidProtocolBufferException {
        return ov0.K(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(ov0 ov0Var) throws GeneralSecurityException {
        fnq.c(ov0Var.I(), j());
        fnq.a(ov0Var.G().size());
        if (ov0Var.H().E() != 12 && ov0Var.H().E() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
