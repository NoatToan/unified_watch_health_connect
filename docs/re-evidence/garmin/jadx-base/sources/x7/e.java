package x7;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.e1;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s1;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z0;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends x<e, a> implements r0 {
    private static final e DEFAULT_INSTANCE;
    private static volatile z0<e> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private k0<String, g> preferences_ = k0.f6775b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j0<String, g> f189362a = j0.b(s1.f6834k, s1.f6836m, g.z());

        private b() {
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        x.n(e.class, eVar);
    }

    private e() {
    }

    public static k0 p(e eVar) {
        k0<String, g> k0Var = eVar.preferences_;
        if (!k0Var.f6776a) {
            eVar.preferences_ = k0Var.c();
        }
        return eVar.preferences_;
    }

    public static a r() {
        e eVar = DEFAULT_INSTANCE;
        eVar.getClass();
        return (a) ((x.a) eVar.f(x.f.NEW_BUILDER));
    }

    public static e s(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        x xVarM = x.m(DEFAULT_INSTANCE, new androidx.datastore.preferences.protobuf.i.c(fileInputStream, 4096), o.a());
        if (x.i(xVarM, true)) {
            return (e) xVarM;
        }
        throw new UninitializedMessageException(xVarM).asInvalidProtocolBufferException().setUnfinishedMessage(xVarM);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final Object f(x.f fVar) {
        z0 bVar;
        d dVar = null;
        switch (d.f189361a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a(dVar);
            case 3:
                return new e1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f189362a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<e> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (e.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new x.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                com.google.protobuf.a.m();
                return null;
        }
    }

    public final Map<String, g> q() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public static final class a extends x.a<e, a> implements r0 {
        private a() {
            super(e.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(d dVar) {
            this();
        }
    }
}
