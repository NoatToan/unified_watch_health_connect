package org.apache.commons.lang.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.NullArgumentException;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;

/* JADX INFO: loaded from: classes23.dex */
public class ExceptionUtils {
    public static final String a = " [wrapped] ";
    private static final Object b = new Object();
    private static String[] c = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};
    private static final Method d;
    private static final Method e;
    public static /* synthetic */ Class f;

    static {
        Method method;
        Method method2 = null;
        try {
            Class clsA = f;
            if (clsA == null) {
                clsA = a("java.lang.Throwable");
                f = clsA;
            }
            method = clsA.getMethod("getCause", null);
        } catch (Exception unused) {
            method = null;
        }
        d = method;
        try {
            Class clsA2 = f;
            if (clsA2 == null) {
                clsA2 = a("java.lang.Throwable");
                f = clsA2;
            }
            Class<?>[] clsArr = new Class[1];
            Class<?> clsA3 = f;
            if (clsA3 == null) {
                clsA3 = a("java.lang.Throwable");
                f = clsA3;
            }
            clsArr[0] = clsA3;
            method2 = clsA2.getMethod("initCause", clsArr);
        } catch (Exception unused2) {
        }
        e = method2;
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    public static void addCauseMethodName(String str) {
        if (!StringUtils.isNotEmpty(str) || isCauseMethodName(str)) {
            return;
        }
        ArrayList arrayListB = b();
        if (arrayListB.add(str)) {
            synchronized (b) {
                c = i(arrayListB);
            }
        }
    }

    private static ArrayList b() {
        ArrayList arrayList;
        synchronized (b) {
            arrayList = new ArrayList(Arrays.asList(c));
        }
        return arrayList;
    }

    private static Throwable c(Throwable th, String str) {
        Field field;
        try {
            field = th.getClass().getField(str);
        } catch (NoSuchFieldException | SecurityException unused) {
            field = null;
        }
        if (field != null) {
            Class clsA = f;
            if (clsA == null) {
                clsA = a("java.lang.Throwable");
                f = clsA;
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

    private static Throwable d(Throwable th, String str) {
        Method method;
        try {
            method = th.getClass().getMethod(str, null);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method != null) {
            Class clsA = f;
            if (clsA == null) {
                clsA = a("java.lang.Throwable");
                f = clsA;
            }
            if (clsA.isAssignableFrom(method.getReturnType())) {
                try {
                    return (Throwable) method.invoke(th, ArrayUtils.EMPTY_OBJECT_ARRAY);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Throwable e(Throwable th) {
        if (th instanceof Nestable) {
            return ((Nestable) th).getCause();
        }
        if (th instanceof SQLException) {
            return ((SQLException) th).getNextException();
        }
        if (th instanceof InvocationTargetException) {
            return ((InvocationTargetException) th).getTargetException();
        }
        return null;
    }

    public static List f(Throwable th) {
        StringTokenizer stringTokenizer = new StringTokenizer(getStackTrace(th), SystemUtils.LINE_SEPARATOR);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().length() == 0) {
                z = true;
                arrayList.add(strNextToken);
            } else if (z) {
                break;
            }
        }
        return arrayList;
    }

    public static String[] g(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, SystemUtils.LINE_SEPARATOR);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return i(arrayList);
    }

    public static Throwable getCause(Throwable th) {
        Throwable cause;
        synchronized (b) {
            cause = getCause(th, c);
        }
        return cause;
    }

    public static String getFullStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
        Throwable[] throwables = getThrowables(th);
        for (int i = 0; i < throwables.length; i++) {
            throwables[i].printStackTrace(printWriter);
            if (isNestedThrowable(throwables[i])) {
                break;
            }
        }
        return stringWriter.getBuffer().toString();
    }

    public static String getMessage(Throwable th) {
        if (th == null) {
            return "";
        }
        String shortClassName = ClassUtils.getShortClassName(th, null);
        String message = th.getMessage();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(shortClassName);
        stringBuffer.append(": ");
        stringBuffer.append(StringUtils.defaultString(message));
        return stringBuffer.toString();
    }

    public static Throwable getRootCause(Throwable th) {
        List throwableList = getThrowableList(th);
        if (throwableList.size() < 2) {
            return null;
        }
        return (Throwable) throwableList.get(throwableList.size() - 1);
    }

    public static String getRootCauseMessage(Throwable th) {
        Throwable rootCause = getRootCause(th);
        if (rootCause != null) {
            th = rootCause;
        }
        return getMessage(th);
    }

    public static String[] getRootCauseStackTrace(Throwable th) {
        List listF;
        if (th == null) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        Throwable[] throwables = getThrowables(th);
        int length = throwables.length;
        ArrayList arrayList = new ArrayList();
        int i = length - 1;
        List listF2 = f(throwables[i]);
        while (true) {
            length--;
            if (length < 0) {
                return (String[]) arrayList.toArray(new String[0]);
            }
            if (length != 0) {
                listF = f(throwables[length - 1]);
                removeCommonFrames(listF2, listF);
            } else {
                listF = listF2;
            }
            if (length == i) {
                arrayList.add(throwables[length].toString());
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(" [wrapped] ");
                stringBuffer.append(throwables[length].toString());
                arrayList.add(stringBuffer.toString());
            }
            for (int i2 = 0; i2 < listF2.size(); i2++) {
                arrayList.add(listF2.get(i2));
            }
            listF2 = listF;
        }
    }

    public static String[] getStackFrames(Throwable th) {
        return th == null ? ArrayUtils.EMPTY_STRING_ARRAY : g(getStackTrace(th));
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static int getThrowableCount(Throwable th) {
        return getThrowableList(th).size();
    }

    public static List getThrowableList(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = getCause(th);
        }
        return arrayList;
    }

    public static Throwable[] getThrowables(Throwable th) {
        List throwableList = getThrowableList(th);
        return (Throwable[]) throwableList.toArray(new Throwable[throwableList.size()]);
    }

    private static int h(Throwable th, Class cls, int i, boolean z) {
        if (th != null && cls != null) {
            if (i < 0) {
                i = 0;
            }
            Throwable[] throwables = getThrowables(th);
            if (i >= throwables.length) {
                return -1;
            }
            if (z) {
                while (i < throwables.length) {
                    if (cls.isAssignableFrom(throwables[i].getClass())) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < throwables.length) {
                    if (cls.equals(throwables[i].getClass())) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }

    private static String[] i(List list) {
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static int indexOfThrowable(Throwable th, Class cls) {
        return h(th, cls, 0, false);
    }

    public static int indexOfType(Throwable th, Class cls) {
        return h(th, cls, 0, true);
    }

    public static boolean isCauseMethodName(String str) {
        boolean z;
        synchronized (b) {
            z = ArrayUtils.indexOf(c, str) >= 0;
        }
        return z;
    }

    public static boolean isNestedThrowable(Throwable th) {
        if (th == null) {
            return false;
        }
        if ((th instanceof Nestable) || (th instanceof SQLException) || (th instanceof InvocationTargetException) || isThrowableNested()) {
            return true;
        }
        Class<?> cls = th.getClass();
        synchronized (b) {
            int length = c.length;
            for (int i = 0; i < length; i++) {
                try {
                    Method method = cls.getMethod(c[i], null);
                    if (method == null) {
                        continue;
                    } else {
                        Class clsA = f;
                        if (clsA == null) {
                            clsA = a("java.lang.Throwable");
                            f = clsA;
                        }
                        if (clsA.isAssignableFrom(method.getReturnType())) {
                            return true;
                        }
                    }
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            try {
                return cls.getField("detail") != null;
            } catch (NoSuchFieldException | SecurityException unused2) {
            }
        }
    }

    public static boolean isThrowableNested() {
        return d != null;
    }

    public static void printRootCauseStackTrace(Throwable th) {
        printRootCauseStackTrace(th, System.err);
    }

    public static void removeCauseMethodName(String str) {
        if (StringUtils.isNotEmpty(str)) {
            ArrayList arrayListB = b();
            if (arrayListB.remove(str)) {
                synchronized (b) {
                    c = i(arrayListB);
                }
            }
        }
    }

    public static void removeCommonFrames(List list, List list2) {
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

    public static boolean setCause(Throwable th, Throwable th2) {
        boolean z;
        if (th == null) {
            throw new NullArgumentException("target");
        }
        Object[] objArr = {th2};
        Method method = e;
        if (method != null) {
            try {
                method.invoke(th, objArr);
                z = true;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                z = false;
            }
        } else {
            z = false;
        }
        try {
            Class<?> cls = th.getClass();
            Class<?>[] clsArr = new Class[1];
            Class<?> clsA = f;
            if (clsA == null) {
                clsA = a("java.lang.Throwable");
                f = clsA;
            }
            clsArr[0] = clsA;
            cls.getMethod("setCause", clsArr).invoke(th, objArr);
            return true;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return z;
        }
    }

    public static int indexOfThrowable(Throwable th, Class cls, int i) {
        return h(th, cls, i, false);
    }

    public static int indexOfType(Throwable th, Class cls, int i) {
        return h(th, cls, i, true);
    }

    public static void printRootCauseStackTrace(Throwable th, PrintStream printStream) {
        if (th == null) {
            return;
        }
        if (printStream == null) {
            throw new IllegalArgumentException("The PrintStream must not be null");
        }
        for (String str : getRootCauseStackTrace(th)) {
            printStream.println(str);
        }
        printStream.flush();
    }

    public static Throwable getCause(Throwable th, String[] strArr) {
        String str;
        if (th == null) {
            return null;
        }
        Throwable thE = e(th);
        if (thE != null) {
            return thE;
        }
        if (strArr == null) {
            synchronized (b) {
                strArr = c;
            }
        }
        for (int i = 0; i < strArr.length && ((str = strArr[i]) == null || (thE = d(th, str)) == null); i++) {
        }
        return thE == null ? c(th, "detail") : thE;
    }

    public static void printRootCauseStackTrace(Throwable th, PrintWriter printWriter) {
        if (th == null) {
            return;
        }
        if (printWriter != null) {
            for (String str : getRootCauseStackTrace(th)) {
                printWriter.println(str);
            }
            printWriter.flush();
            return;
        }
        throw new IllegalArgumentException("The PrintWriter must not be null");
    }
}
