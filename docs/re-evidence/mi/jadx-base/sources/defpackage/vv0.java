package defpackage;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class vv0 extends o0e<tv0> {

    public class a extends o0e.b<ejo, tv0> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ejo a(tv0 tv0Var) throws GeneralSecurityException {
            return new sv0(tv0Var.G().toByteArray(), fjo.a(tv0Var.H().J()), tv0Var.H().I(), tv0Var.H().G(), 0);
        }
    }

    public class b extends o0e.a<uv0, tv0> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public tv0 a(uv0 uv0Var) throws GeneralSecurityException {
            return tv0.J().t(ByteString.copyFrom(mbj.c(uv0Var.F()))).u(uv0Var.G()).v(vv0.this.m()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public uv0 c(ByteString byteString) throws InvalidProtocolBufferException {
            return uv0.I(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(uv0 uv0Var) throws GeneralSecurityException {
            if (uv0Var.F() < 16) {
                throw new GeneralSecurityException("key_size must be at least 16 bytes");
            }
            vv0.p(uv0Var.G());
        }
    }

    public vv0() {
        super(tv0.class, new a(ejo.class));
    }

    public static final KeyTemplate k() {
        return l(32, HashType.SHA256, 32, 4096);
    }

    public static KeyTemplate l(int i, HashType hashType, int i2, int i3) {
        return KeyTemplate.a(new vv0().c(), uv0.H().t(i).u(wv0.K().t(i3).u(i2).v(hashType).build()).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void p(wv0 wv0Var) throws GeneralSecurityException {
        fnq.a(wv0Var.I());
        if (wv0Var.J() == HashType.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        if (wv0Var.G() < wv0Var.I() + 25) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    @Override // defpackage.o0e
    public o0e.a<uv0, tv0> e() {
        return new b(uv0.class);
    }

    @Override // defpackage.o0e
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public tv0 g(ByteString byteString) throws InvalidProtocolBufferException {
        return tv0.K(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(tv0 tv0Var) throws GeneralSecurityException {
        fnq.c(tv0Var.I(), m());
        p(tv0Var.H());
    }
}
