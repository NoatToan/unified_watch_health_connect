package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public class v1e extends o0e<t1e> {

    public class a extends o0e.b<xu0, t1e> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public xu0 a(t1e t1eVar) throws GeneralSecurityException {
            String strF = t1eVar.F().F();
            return new s1e(t1eVar.F().E(), r1e.a(strF).b(strF));
        }
    }

    public class b extends o0e.a<u1e, t1e> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public t1e a(u1e u1eVar) throws GeneralSecurityException {
            return t1e.H().t(u1eVar).u(v1e.this.j()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public u1e c(ByteString byteString) throws InvalidProtocolBufferException {
            return u1e.G(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(u1e u1eVar) throws GeneralSecurityException {
        }
    }

    public v1e() {
        super(t1e.class, new a(xu0.class));
    }

    public static void l(boolean z) throws GeneralSecurityException {
        cdk.q(new v1e(), z);
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // defpackage.o0e
    public o0e.a<u1e, t1e> e() {
        return new b(u1e.class);
    }

    @Override // defpackage.o0e
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    public int j() {
        return 0;
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public t1e g(ByteString byteString) throws InvalidProtocolBufferException {
        return t1e.I(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(t1e t1eVar) throws GeneralSecurityException {
        fnq.c(t1eVar.G(), j());
    }
}
