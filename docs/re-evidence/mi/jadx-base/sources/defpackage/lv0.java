package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public class lv0 extends o0e<jv0> {

    public class a extends o0e.b<k7d, jv0> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public k7d a(jv0 jv0Var) throws GeneralSecurityException {
            return new iv0(jv0Var.H().toByteArray(), jv0Var.I().E());
        }
    }

    public class b extends o0e.a<kv0, jv0> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public jv0 a(kv0 kv0Var) throws GeneralSecurityException {
            return jv0.K().u(kv0Var.F()).t(ByteString.copyFrom(mbj.c(kv0Var.E()))).v(lv0.this.k()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public kv0 c(ByteString byteString) throws InvalidProtocolBufferException {
            return kv0.G(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(kv0 kv0Var) throws GeneralSecurityException {
            fnq.a(kv0Var.E());
            lv0.this.n(kv0Var.F());
        }
    }

    public lv0() {
        super(jv0.class, new a(k7d.class));
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // defpackage.o0e
    public o0e.a<kv0, jv0> e() {
        return new b(kv0.class);
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
    public jv0 g(ByteString byteString) throws InvalidProtocolBufferException {
        return jv0.L(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(jv0 jv0Var) throws GeneralSecurityException {
        fnq.c(jv0Var.J(), k());
        fnq.a(jv0Var.H().size());
        n(jv0Var.I());
    }

    public final void n(mv0 mv0Var) throws GeneralSecurityException {
        if (mv0Var.E() < 12 || mv0Var.E() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
