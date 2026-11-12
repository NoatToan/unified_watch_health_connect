package defpackage;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yhd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f40178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<?> f40179b;

    public yhd(Method method, List<?> list) {
        this.f40178a = method;
        this.f40179b = Collections.unmodifiableList(list);
    }

    public List<?> a() {
        return this.f40179b;
    }

    public Method b() {
        return this.f40178a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f40178a.getDeclaringClass().getName(), this.f40178a.getName(), this.f40179b);
    }
}
