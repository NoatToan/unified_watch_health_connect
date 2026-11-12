package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public class of8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f29104a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String[] f29105b = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};
    public static final Method c;
    public static final Method d;
    public static /* synthetic */ Class e;

    static {
        Method method;
        Method method2 = null;
        try {
            Class clsA = e;
            if (clsA == null) {
                clsA = a("java.lang.Throwable");
                e = clsA;
            }
            method = clsA.getMethod("getCause", null);
        } catch (Exception unused) {
            method = null;
        }
        c = method;
        try {
            Class clsA2 = e;
            if (clsA2 == null) {
                clsA2 = a("java.lang.Throwable");
                e = clsA2;
            }
            Class<?>[] clsArr = new Class[1];
            Class<?> clsA3 = e;
            if (clsA3 == null) {
                clsA3 = a("java.lang.Throwable");
                e = clsA3;
            }
            clsArr[0] = clsA3;
            method2 = clsA2.getMethod("initCause", clsArr);
        } catch (Exception unused2) {
        }
        d = method2;
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    public static Throwable b(Throwable th) {
        Throwable thC;
        synchronized (f29104a) {
            thC = c(th, f29105b);
        }
        return thC;
    }

    public static Throwable c(Throwable th, String[] strArr) {
        String str;
        if (th == null) {
            return null;
        }
        Throwable thF = f(th);
        if (thF != null) {
            return thF;
        }
        if (strArr == null) {
            synchronized (f29104a) {
                strArr = f29105b;
            }
        }
        for (int i = 0; i < strArr.length && ((str = strArr[i]) == null || (thF = e(th, str)) == null); i++) {
        }
        return thF == null ? d(th, "detail") : thF;
    }

    public static Throwable d(Throwable th, String str) {
        Field field;
        try {
            field = th.getClass().getField(str);
        } catch (NoSuchFieldException | SecurityException unused) {
            field = null;
        }
        if (field != null) {
            Class clsA = e;
            if (clsA == null) {
                clsA = a("java.lang.Throwable");
                e = clsA;
            }
            if (clsA.isAssignableFrom(field.getType())) {
                try {
                    return (Throwable) field.get(th);
                } catch (IllegalAccessException | IllegalArgumentException unused2) {
                }
            }
        }
        return null;
    }

    public static Throwable e(Throwable th, String str) {
        Method method;
        try {
            method = th.getClass().getMethod(str, null);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method != null) {
            Class clsA = e;
            if (clsA == null) {
                clsA = a("java.lang.Throwable");
                e = clsA;
            }
            if (clsA.isAssignableFrom(method.getReturnType())) {
                try {
                    return (Throwable) method.invoke(th, rj1.f32591a);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Throwable f(Throwable th) {
        if (th instanceof xig) {
            return ((xig) th).getCause();
        }
        if (th instanceof SQLException) {
            return ((SQLException) th).getNextException();
        }
        if (th instanceof InvocationTargetException) {
            return ((InvocationTargetException) th).getTargetException();
        }
        return null;
    }

    public static String[] g(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, oyo.F);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return m(arrayList);
    }

    public static int h(Throwable th) {
        return i(th).size();
    }

    public static List i(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = b(th);
        }
        return arrayList;
    }

    public static Throwable[] j(Throwable th) {
        List listI = i(th);
        return (Throwable[]) listI.toArray(new Throwable[listI.size()]);
    }

    public static boolean k() {
        return c != null;
    }

    public static void l(List list, List list2) {
        if (list == null || list2 == null) {
            throw new IllegalArgumentException("The List must not be null");
        }
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (((String) list.get(size)).equals((String) list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }

    public static String[] m(List list) {
        return (String[]) list.toArray(new String[list.size()]);
    }
}
