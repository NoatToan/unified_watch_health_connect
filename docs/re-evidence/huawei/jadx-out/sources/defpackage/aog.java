package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.eventbus.ElementTypesAreNonnullByDefault;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class aog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f626b;
    private final aoi d;
    private final Object e;

    aog(aoi aoiVar, Object obj, Object obj2, Method method) {
        this.d = (aoi) Preconditions.checkNotNull(aoiVar);
        this.e = Preconditions.checkNotNull(obj);
        this.f625a = Preconditions.checkNotNull(obj2);
        this.f626b = (Method) Preconditions.checkNotNull(method);
    }

    public aoi a() {
        return this.d;
    }

    public Object c() {
        return this.e;
    }

    public Object b() {
        return this.f625a;
    }

    public Method e() {
        return this.f626b;
    }
}
