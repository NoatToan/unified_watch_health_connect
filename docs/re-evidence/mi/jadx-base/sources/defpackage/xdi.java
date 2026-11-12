package defpackage;

import com.google.protobuf.a1;
import com.google.protobuf.d0;
import com.google.protobuf.e1;
import com.google.protobuf.t;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public final class xdi {
    public static final xdi c = new xdi();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, e1<?>> f39021b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufl f39020a = new b4f();

    public static xdi a() {
        return c;
    }

    public <T> void b(T t, a1 a1Var, t tVar) throws IOException {
        e(t).h(t, a1Var, tVar);
    }

    public e1<?> c(Class<?> cls, e1<?> e1Var) {
        d0.b(cls, "messageType");
        d0.b(e1Var, SchemaNetUtils.SchemaDir);
        return this.f39021b.putIfAbsent(cls, e1Var);
    }

    public <T> e1<T> d(Class<T> cls) {
        d0.b(cls, "messageType");
        e1<T> e1Var = (e1) this.f39021b.get(cls);
        if (e1Var != null) {
            return e1Var;
        }
        e1<T> e1VarA = this.f39020a.a(cls);
        e1<T> e1Var2 = (e1<T>) c(cls, e1VarA);
        return e1Var2 != null ? e1Var2 : e1VarA;
    }

    public <T> e1<T> e(T t) {
        return d(t.getClass());
    }
}
