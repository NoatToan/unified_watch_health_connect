package defpackage;

import androidx.health.platform.client.proto.f0;
import androidx.health.platform.client.proto.w1;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class vdi {
    public static final vdi c = new vdi();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, w1<?>> f36776b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sfl f36775a = new z3f();

    public static vdi a() {
        return c;
    }

    public w1<?> b(Class<?> cls, w1<?> w1Var) {
        f0.b(cls, "messageType");
        f0.b(w1Var, SchemaNetUtils.SchemaDir);
        return this.f36776b.putIfAbsent(cls, w1Var);
    }

    public <T> w1<T> c(Class<T> cls) {
        f0.b(cls, "messageType");
        w1<T> w1Var = (w1) this.f36776b.get(cls);
        if (w1Var != null) {
            return w1Var;
        }
        w1<T> w1VarA = this.f36775a.a(cls);
        w1<T> w1Var2 = (w1<T>) b(cls, w1VarA);
        return w1Var2 != null ? w1Var2 : w1VarA;
    }

    public <T> w1<T> d(T t) {
        return c(t.getClass());
    }
}
