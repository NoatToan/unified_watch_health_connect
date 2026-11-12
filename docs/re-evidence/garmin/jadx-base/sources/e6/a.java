package e6;

import d53.u;
import j23.k;
import j23.l;
import j23.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w0;
import p13.p0;
import p13.y;
import p3.m;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le6/a;", "", "<init>", "()V", "ui-tooling"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f63139a = new a();

    private a() {
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method a(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        ?? r14;
        boolean z14;
        int length = methodArr.length;
        boolean z15 = false;
        int i14 = 0;
        while (i14 < length) {
            method = methodArr[i14];
            if (str.equals(method.getName()) || u.y(method.getName(), str.concat("-"), z15)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                f63139a.getClass();
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z16 = z15;
                    ?? r15 = z16;
                    while (r14 < length2) {
                        Class<?> cls = parameterTypes[r14];
                        int i15 = r15 + 1;
                        Class<?> cls2 = clsArr2[r15];
                        if (dh.b.x(cls).equals(dh.b.x(cls2)) || cls.isAssignableFrom(cls2)) {
                            r14 = z16;
                            r14 = z16;
                            z14 = true;
                        } else {
                            r14 = z16;
                            z14 = false;
                        }
                        arrayList.add(Boolean.valueOf(z14));
                        r15 = i15;
                        r14++;
                    }
                    r14 = z16;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (((Boolean) it.next()).booleanValue());
                    }
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(str.concat(" not found"));
                }
                continue;
            }
            i14++;
            z15 = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method b(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                break;
            }
            Object obj = objArr[i14];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i14++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                l lVarO = t.o(0, iCeil);
                ArrayList arrayList2 = new ArrayList(y.r(lVarO, 10));
                Iterator<Integer> it = lVarO.iterator();
                while (((k) it).f96801c) {
                    ((p0) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                w0 w0Var = new w0(3);
                ArrayList<Object> arrayList3 = w0Var.f105816a;
                w0Var.b(clsArr);
                w0Var.a(m.class);
                w0Var.b(clsArr2);
                return a(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!s.g(method.getName(), str)) {
                    if (!u.y(method.getName(), str + '-', false)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    public static void c(String str, String str2, m mVar, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method methodB = b(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodB != null) {
                methodB.setAccessible(true);
                if (Modifier.isStatic(methodB.getModifiers())) {
                    d(methodB, null, mVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    d(methodB, cls.getConstructor(null).newInstance(null), mVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e4) {
            d.f63146a.getClass();
            throw e4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    public static void d(Method method, Object obj, m mVar, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i14 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i15 = length - 1;
                if (s.g(parameterTypes[length], m.class)) {
                    i14 = length;
                    break;
                } else if (i15 < 0) {
                    break;
                } else {
                    length = i15;
                }
            }
        }
        int i16 = i14 + 1;
        int iCeil = (i14 != 0 ? (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i14)) / 10.0d) : 1) + i16;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i14) / 31.0d) : 0) + iCeil != length2) {
            h.z("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i17 = 0; i17 < length2; i17++) {
            if (i17 < 0 || i17 >= i14) {
                if (i17 == i14) {
                    objValueOf = mVar;
                } else if (i16 <= i17 && i17 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i17 || i17 >= length2) {
                        h.z("Unexpected index");
                        return;
                    }
                    objValueOf = 2097151;
                }
            } else if (i17 < 0 || i17 >= objArr.length) {
                Class<?> cls = method.getParameterTypes()[i17];
                f63139a.getClass();
                switch (cls.getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i17];
            }
            objArr2[i17] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }
}
