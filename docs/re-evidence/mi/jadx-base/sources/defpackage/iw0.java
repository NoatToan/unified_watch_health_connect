package defpackage;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes5.dex */
public final class iw0 extends o0e<gw0> {

    public class a extends o0e.b<h06, gw0> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public h06 a(gw0 gw0Var) throws GeneralSecurityException {
            return new fw0(gw0Var.F().toByteArray());
        }
    }

    public class b extends o0e.a<hw0, gw0> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public gw0 a(hw0 hw0Var) throws GeneralSecurityException {
            return gw0.H().t(ByteString.copyFrom(mbj.c(hw0Var.E()))).u(iw0.this.l()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public hw0 c(ByteString byteString) throws InvalidProtocolBufferException {
            return hw0.G(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(hw0 hw0Var) throws GeneralSecurityException {
            if (hw0Var.E() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + hw0Var.E() + ". Valid keys must have 64 bytes.");
        }
    }

    public iw0() {
        super(gw0.class, new a(h06.class));
    }

    public static final KeyTemplate j() {
        return k(64, KeyTemplate.OutputPrefixType.TINK);
    }

    private static KeyTemplate k(int i, KeyTemplate.OutputPrefixType outputPrefixType) {
        return KeyTemplate.a(new iw0().c(), hw0.F().t(i).build().toByteArray(), outputPrefixType);
    }

    public static void n(boolean z) throws GeneralSecurityException {
        cdk.q(new iw0(), z);
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // defpackage.o0e
    public o0e.a<hw0, gw0> e() {
        return new b(hw0.class);
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
    public gw0 g(ByteString byteString) throws InvalidProtocolBufferException {
        return gw0.I(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(gw0 gw0Var) throws GeneralSecurityException {
        fnq.c(gw0Var.G(), l());
        if (gw0Var.F().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + gw0Var.F().size() + ". Valid keys must have 64 bytes.");
    }
}
