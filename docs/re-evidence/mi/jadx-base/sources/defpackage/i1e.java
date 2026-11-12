package defpackage;

import com.google.crypto.tink.proto.a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class i1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20664a;

    public i1e(a aVar) {
        this.f20664a = aVar;
    }

    public static void a(ea8 ea8Var) throws GeneralSecurityException {
        if (ea8Var == null || ea8Var.F().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(a aVar) throws GeneralSecurityException {
        if (aVar == null || aVar.I() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static a c(ea8 ea8Var, xu0 xu0Var) throws GeneralSecurityException {
        try {
            a aVarM = a.M(xu0Var.b(ea8Var.F().toByteArray(), new byte[0]), l.b());
            b(aVarM);
            return aVarM;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static ea8 d(a aVar, xu0 xu0Var) throws GeneralSecurityException {
        byte[] bArrA = xu0Var.a(aVar.toByteArray(), new byte[0]);
        try {
            if (a.M(xu0Var.b(bArrA, new byte[0]), l.b()).equals(aVar)) {
                return ea8.G().t(ByteString.copyFrom(bArrA)).u(xlq.b(aVar)).build();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static final i1e e(a aVar) throws GeneralSecurityException {
        b(aVar);
        return new i1e(aVar);
    }

    public static final i1e j(l1e l1eVar, xu0 xu0Var) throws GeneralSecurityException, IOException {
        ea8 ea8VarA = l1eVar.a();
        a(ea8VarA);
        return new i1e(c(ea8VarA, xu0Var));
    }

    public a f() {
        return this.f20664a;
    }

    public j1e g() {
        return xlq.b(this.f20664a);
    }

    public <P> P h(Class<P> cls) throws GeneralSecurityException {
        Class<?> clsE = cdk.e(cls);
        if (clsE != null) {
            return (P) i(cls, clsE);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public final <B, P> P i(Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        return (P) cdk.t(cdk.l(this, cls2), cls);
    }

    public void k(m1e m1eVar, xu0 xu0Var) throws GeneralSecurityException, IOException {
        m1eVar.b(d(this.f20664a, xu0Var));
    }

    public String toString() {
        return g().toString();
    }
}
