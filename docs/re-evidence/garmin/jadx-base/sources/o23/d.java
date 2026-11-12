package o23;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n23.w3;
import p005kotlin.jvm.internal.s;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
public class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f128702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f128703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.l f128704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.l f128705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f128706e;

    public d(Class cls, Map map, o13.l lVar, o13.l lVar2, List list) {
        this.f128702a = cls;
        this.f128703b = map;
        this.f128704c = lVar;
        this.f128705d = lVar2;
        this.f128706e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zG;
        boolean z14;
        String name = method.getName();
        Class cls = this.f128702a;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f128705d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f128704c.getValue();
            }
        }
        boolean zG2 = s.g(name, "equals");
        Map map = this.f128703b;
        boolean z15 = false;
        if (!zG2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb3 = new StringBuilder("Method is not supported: ");
            sb3.append(method);
            sb3.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb3.append(u.i0(objArr));
            sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            throw new w3(sb3.toString());
        }
        Object objV = u.V(objArr);
        Annotation annotation = objV instanceof Annotation ? (Annotation) objV : null;
        if (s.g(annotation != null ? dh.b.u(dh.b.s(annotation)) : null, cls)) {
            List list = this.f128706e;
            if (list != null && list.isEmpty()) {
                z14 = true;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = true;
                    break;
                }
                Method method2 = (Method) it.next();
                Object obj2 = map.get(method2.getName());
                Object objInvoke = method2.invoke(objV, null);
                if (obj2 instanceof boolean[]) {
                    objInvoke.getClass();
                    zG = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    objInvoke.getClass();
                    zG = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    objInvoke.getClass();
                    zG = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    objInvoke.getClass();
                    zG = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    objInvoke.getClass();
                    zG = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    objInvoke.getClass();
                    zG = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    objInvoke.getClass();
                    zG = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    objInvoke.getClass();
                    zG = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof Object[]) {
                    objInvoke.getClass();
                    zG = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                } else {
                    zG = s.g(obj2, objInvoke);
                }
                if (!zG) {
                    z14 = false;
                    break;
                }
            }
            if (z14) {
                z15 = true;
            }
        }
        return Boolean.valueOf(z15);
    }
}
