package x13;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lx13/a;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: x13.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx13/a$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3506a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f188450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f188451b;

        static {
            Method method;
            Method method2;
            new C3506a();
            Method[] methods = Throwable.class.getMethods();
            methods.getClass();
            int length = methods.length;
            int i14 = 0;
            while (true) {
                method = null;
                if (i14 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i14];
                if (s.g(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (s.g(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        break;
                    }
                }
                i14++;
            }
            f188450a = method2;
            for (Method method3 : methods) {
                if (s.g(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f188451b = method;
        }

        private C3506a() {
        }
    }

    public void a(Throwable th3, Throwable th4) {
        th3.getClass();
        th4.getClass();
        Method method = C3506a.f188450a;
        if (method != null) {
            method.invoke(th3, th4);
        }
    }

    public List<Throwable> b(Throwable th3) {
        Object objInvoke;
        th3.getClass();
        Method method = C3506a.f188451b;
        if (method == null || (objInvoke = method.invoke(th3, null)) == null) {
            return j0.f134944a;
        }
        List<Throwable> listAsList = Arrays.asList((Throwable[]) objInvoke);
        listAsList.getClass();
        return listAsList;
    }
}
