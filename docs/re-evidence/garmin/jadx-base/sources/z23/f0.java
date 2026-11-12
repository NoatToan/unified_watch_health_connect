package z23;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends b0 implements o33.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f202045a;

    public f0(Object obj) {
        obj.getClass();
        this.f202045a = obj;
    }

    @Override // z23.b0
    public final Member H() throws IllegalAccessException, InvocationTargetException {
        a.f202020a.getClass();
        Object obj = this.f202045a;
        obj.getClass();
        Method method = a.a(obj).f202023b;
        Method method2 = null;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            method2 = (Method) objInvoke;
        }
        if (method2 != null) {
            return method2;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // o33.s
    public final o33.t getType() throws IllegalAccessException, InvocationTargetException {
        a.f202020a.getClass();
        Object obj = this.f202045a;
        obj.getClass();
        Method method = a.a(obj).f202022a;
        Class cls = null;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new v(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
