package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public class zs3 extends o0e<xs3> {

    public class a extends o0e.b<xu0, xs3> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public xu0 a(xs3 xs3Var) throws GeneralSecurityException {
            return new vs3(xs3Var.F().toByteArray());
        }
    }

    public class b extends o0e.a<ys3, xs3> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public xs3 a(ys3 ys3Var) throws GeneralSecurityException {
            return xs3.H().u(zs3.this.j()).t(ByteString.copyFrom(mbj.c(32))).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public ys3 c(ByteString byteString) throws InvalidProtocolBufferException {
            return ys3.D(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(ys3 ys3Var) throws GeneralSecurityException {
        }
    }

    public zs3() {
        super(xs3.class, new a(xu0.class));
    }

    public static void l(boolean z) throws GeneralSecurityException {
        cdk.q(new zs3(), z);
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // defpackage.o0e
    public o0e.a<ys3, xs3> e() {
        return new b(ys3.class);
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
    public xs3 g(ByteString byteString) throws InvalidProtocolBufferException {
        return xs3.I(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(xs3 xs3Var) throws GeneralSecurityException {
        fnq.c(xs3Var.G(), j());
        if (xs3Var.F().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
