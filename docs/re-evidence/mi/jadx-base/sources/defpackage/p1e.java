package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public class p1e extends o0e<n1e> {

    public class a extends o0e.b<xu0, n1e> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public xu0 a(n1e n1eVar) throws GeneralSecurityException {
            String strE = n1eVar.F().E();
            return r1e.a(strE).b(strE);
        }
    }

    public class b extends o0e.a<o1e, n1e> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public n1e a(o1e o1eVar) throws GeneralSecurityException {
            return n1e.H().t(o1eVar).u(p1e.this.j()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public o1e c(ByteString byteString) throws InvalidProtocolBufferException {
            return o1e.F(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(o1e o1eVar) throws GeneralSecurityException {
        }
    }

    public p1e() {
        super(n1e.class, new a(xu0.class));
    }

    public static void l(boolean z) throws GeneralSecurityException {
        cdk.q(new p1e(), z);
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // defpackage.o0e
    public o0e.a<o1e, n1e> e() {
        return new b(o1e.class);
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
    public n1e g(ByteString byteString) throws InvalidProtocolBufferException {
        return n1e.I(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(n1e n1eVar) throws GeneralSecurityException {
        fnq.c(n1eVar.G(), j());
    }
}
