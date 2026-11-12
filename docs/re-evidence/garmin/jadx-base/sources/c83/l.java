package c83;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f25802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f25804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<?> f25805d;

    public l(Class<?> cls, Object obj, Method method, List<?> list) {
        this.f25802a = cls;
        this.f25803b = obj;
        this.f25804c = method;
        this.f25805d = Collections.unmodifiableList(list);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f25802a.getName(), this.f25804c.getName(), this.f25805d);
    }
}
