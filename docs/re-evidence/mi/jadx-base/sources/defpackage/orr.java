package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public class orr extends o0e<mrr> {

    public class a extends o0e.b<xu0, mrr> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public xu0 a(mrr mrrVar) throws GeneralSecurityException {
            return new lrr(mrrVar.F().toByteArray());
        }
    }

    public class b extends o0e.a<nrr, mrr> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public mrr a(nrr nrrVar) throws GeneralSecurityException {
            return mrr.H().u(orr.this.j()).t(ByteString.copyFrom(mbj.c(32))).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public nrr c(ByteString byteString) throws InvalidProtocolBufferException {
            return nrr.D(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(nrr nrrVar) throws GeneralSecurityException {
        }
    }

    public orr() {
        super(mrr.class, new a(xu0.class));
    }

    public static void l(boolean z) throws GeneralSecurityException {
        cdk.q(new orr(), z);
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // defpackage.o0e
    public o0e.a<nrr, mrr> e() {
        return new b(nrr.class);
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
    public mrr g(ByteString byteString) throws InvalidProtocolBufferException {
        return mrr.I(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(mrr mrrVar) throws GeneralSecurityException {
        fnq.c(mrrVar.G(), j());
        if (mrrVar.F().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
