package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class hv0 extends o0e<fv0> {

    public class a extends o0e.b<xu0, fv0> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public xu0 a(fv0 fv0Var) throws GeneralSecurityException {
            return new ca8((k7d) new lv0().d(fv0Var.G(), k7d.class), (aze) new dac().d(fv0Var.H(), aze.class), fv0Var.H().I().F());
        }
    }

    public class b extends o0e.a<gv0, fv0> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public fv0 a(gv0 gv0Var) throws GeneralSecurityException {
            jv0 jv0VarA = new lv0().e().a(gv0Var.D());
            return fv0.J().t(jv0VarA).u(new dac().e().a(gv0Var.E())).v(hv0.this.j()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public gv0 c(ByteString byteString) throws InvalidProtocolBufferException {
            return gv0.F(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(gv0 gv0Var) throws GeneralSecurityException {
            new lv0().e().d(gv0Var.D());
            new dac().e().d(gv0Var.E());
            fnq.a(gv0Var.D().E());
        }
    }

    public hv0() {
        super(fv0.class, new a(xu0.class));
    }

    public static void l(boolean z) throws GeneralSecurityException {
        cdk.q(new hv0(), z);
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // defpackage.o0e
    public o0e.a<gv0, fv0> e() {
        return new b(gv0.class);
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
    public fv0 g(ByteString byteString) throws InvalidProtocolBufferException {
        return fv0.K(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(fv0 fv0Var) throws GeneralSecurityException {
        fnq.c(fv0Var.I(), j());
        new lv0().i(fv0Var.G());
        new dac().i(fv0Var.H());
    }
}
