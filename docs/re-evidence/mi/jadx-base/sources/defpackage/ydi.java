package defpackage;

import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.s;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class ydi {
    public static final ydi c = new ydi();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, k0<?>> f40073b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vfl f40072a = new y3f();

    public static ydi a() {
        return c;
    }

    public <T> void b(T t, i0 i0Var, l lVar) throws IOException {
        e(t).g(t, i0Var, lVar);
    }

    public k0<?> c(Class<?> cls, k0<?> k0Var) {
        s.b(cls, "messageType");
        s.b(k0Var, SchemaNetUtils.SchemaDir);
        return this.f40073b.putIfAbsent(cls, k0Var);
    }

    public <T> k0<T> d(Class<T> cls) {
        s.b(cls, "messageType");
        k0<T> k0Var = (k0) this.f40073b.get(cls);
        if (k0Var != null) {
            return k0Var;
        }
        k0<T> k0VarA = this.f40072a.a(cls);
        k0<T> k0Var2 = (k0<T>) c(cls, k0VarA);
        return k0Var2 != null ? k0Var2 : k0VarA;
    }

    public <T> k0<T> e(T t) {
        return d(t.getClass());
    }
}
