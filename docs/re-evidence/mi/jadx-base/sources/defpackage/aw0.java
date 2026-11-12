package defpackage;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class aw0 extends o0e<yv0> {

    public class a extends o0e.b<xu0, yv0> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o0e.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public xu0 a(yv0 yv0Var) throws GeneralSecurityException {
            return new xv0(yv0Var.F().toByteArray());
        }
    }

    public class b extends o0e.a<zv0, yv0> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public yv0 a(zv0 zv0Var) throws GeneralSecurityException {
            return yv0.H().t(ByteString.copyFrom(mbj.c(zv0Var.E()))).u(aw0.this.l()).build();
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public zv0 c(ByteString byteString) throws InvalidProtocolBufferException {
            return zv0.G(byteString, l.b());
        }

        @Override // o0e.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(zv0 zv0Var) throws GeneralSecurityException {
            fnq.a(zv0Var.E());
        }
    }

    public aw0() {
        super(yv0.class, new a(xu0.class));
    }

    public static final KeyTemplate j() {
        return k(32, KeyTemplate.OutputPrefixType.TINK);
    }

    public static KeyTemplate k(int i, KeyTemplate.OutputPrefixType outputPrefixType) {
        return KeyTemplate.a(new aw0().c(), zv0.F().t(i).build().toByteArray(), outputPrefixType);
    }

    public static void n(boolean z) throws GeneralSecurityException {
        cdk.q(new aw0(), z);
    }

    @Override // defpackage.o0e
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // defpackage.o0e
    public o0e.a<zv0, yv0> e() {
        return new b(zv0.class);
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
    public yv0 g(ByteString byteString) throws InvalidProtocolBufferException {
        return yv0.I(byteString, l.b());
    }

    @Override // defpackage.o0e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(yv0 yv0Var) throws GeneralSecurityException {
        fnq.c(yv0Var.G(), l());
        fnq.a(yv0Var.F().size());
    }
}
