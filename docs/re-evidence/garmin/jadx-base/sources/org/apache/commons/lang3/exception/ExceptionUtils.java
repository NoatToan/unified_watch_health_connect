package org.apache.commons.lang3.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import sn.a;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ExceptionUtils {
    private static final String[] CAUSE_METHOD_NAMES = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};
    private static final int NOT_FOUND = -1;
    static final String WRAPPED_MARKER = " [wrapped] ";

    @Deprecated
    public static Throwable getCause(Throwable th3, String[] strArr) {
        Throwable causeUsingMethodName;
        if (th3 == null) {
            return null;
        }
        if (strArr == null) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                return cause;
            }
            strArr = CAUSE_METHOD_NAMES;
        }
        for (String str : strArr) {
            if (str != null && (causeUsingMethodName = getCauseUsingMethodName(th3, str)) != null) {
                return causeUsingMethodName;
            }
        }
        return null;
    }

    private static Throwable getCauseUsingMethodName(Throwable th3, String str) {
        Method method;
        try {
            method = th3.getClass().getMethod(str, null);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method != null && Throwable.class.isAssignableFrom(method.getReturnType())) {
            try {
                return (Throwable) method.invoke(th3, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            }
        }
        return null;
    }

    @Deprecated
    public static String[] getDefaultCauseMethodNames() {
        return (String[]) ArrayUtils.clone(CAUSE_METHOD_NAMES);
    }

    public static String getMessage(Throwable th3) {
        if (th3 == null) {
            return "";
        }
        String shortClassName = ClassUtils.getShortClassName(th3, null);
        String message = th3.getMessage();
        StringBuilder sbI = a.i(shortClassName, ": ");
        sbI.append(StringUtils.defaultString(message));
        return sbI.toString();
    }

    public static Throwable getRootCause(Throwable th3) {
        List<Throwable> throwableList = getThrowableList(th3);
        if (throwableList.isEmpty()) {
            return null;
        }
        return (Throwable) com.airbnb.lottie.animation.keyframe.a.c(1, throwableList);
    }

    public static String getRootCauseMessage(Throwable th3) {
        Throwable rootCause = getRootCause(th3);
        if (rootCause != null) {
            th3 = rootCause;
        }
        return getMessage(th3);
    }

    public static String[] getRootCauseStackTrace(Throwable th3) {
        List<String> stackFrameList;
        if (th3 == null) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        Throwable[] throwables = getThrowables(th3);
        int length = throwables.length;
        ArrayList arrayList = new ArrayList();
        int i14 = length - 1;
        List<String> stackFrameList2 = getStackFrameList(throwables[i14]);
        while (true) {
            int i15 = length - 1;
            if (i15 < 0) {
                return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
            }
            if (i15 != 0) {
                stackFrameList = getStackFrameList(throwables[length - 2]);
                removeCommonFrames(stackFrameList2, stackFrameList);
            } else {
                stackFrameList = stackFrameList2;
            }
            if (i15 == i14) {
                arrayList.add(throwables[i15].toString());
            } else {
                arrayList.add(WRAPPED_MARKER + throwables[i15].toString());
            }
            arrayList.addAll(stackFrameList2);
            stackFrameList2 = stackFrameList;
            length = i15;
        }
    }

    public static List<String> getStackFrameList(Throwable th3) {
        StringTokenizer stringTokenizer = new StringTokenizer(getStackTrace(th3), System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z14 = true;
            } else if (z14) {
                break;
            }
        }
        return arrayList;
    }

    public static String[] getStackFrames(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public static String getStackTrace(Throwable th3) {
        StringWriter stringWriter = new StringWriter();
        th3.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static int getThrowableCount(Throwable th3) {
        return getThrowableList(th3).size();
    }

    public static List<Throwable> getThrowableList(Throwable th3) {
        ArrayList arrayList = new ArrayList();
        while (th3 != null && !arrayList.contains(th3)) {
            arrayList.add(th3);
            th3 = th3.getCause();
        }
        return arrayList;
    }

    public static Throwable[] getThrowables(Throwable th3) {
        return (Throwable[]) getThrowableList(th3).toArray(ArrayUtils.EMPTY_THROWABLE_ARRAY);
    }

    public static boolean hasCause(Throwable th3, Class<? extends Throwable> cls) {
        if (th3 instanceof UndeclaredThrowableException) {
            th3 = th3.getCause();
        }
        return cls.isInstance(th3);
    }

    private static int indexOf(Throwable th3, Class<? extends Throwable> cls, int i14, boolean z14) {
        if (th3 != null && cls != null) {
            if (i14 < 0) {
                i14 = 0;
            }
            Throwable[] throwables = getThrowables(th3);
            if (i14 >= throwables.length) {
                return -1;
            }
            if (z14) {
                while (i14 < throwables.length) {
                    if (cls.isAssignableFrom(throwables[i14].getClass())) {
                        return i14;
                    }
                    i14++;
                }
            } else {
                while (i14 < throwables.length) {
                    if (cls.equals(throwables[i14].getClass())) {
                        return i14;
                    }
                    i14++;
                }
            }
        }
        return -1;
    }

    public static int indexOfThrowable(Throwable th3, Class<? extends Throwable> cls) {
        return indexOf(th3, cls, 0, false);
    }

    public static int indexOfType(Throwable th3, Class<? extends Throwable> cls) {
        return indexOf(th3, cls, 0, true);
    }

    public static void printRootCauseStackTrace(Throwable th3, PrintStream printStream) {
        if (th3 == null) {
            return;
        }
        Objects.requireNonNull(printStream, "printStream");
        for (String str : getRootCauseStackTrace(th3)) {
            printStream.println(str);
        }
        printStream.flush();
    }

    public static void removeCommonFrames(List<String> list, List<String> list2) {
        if (list == null || list2 == null) {
            h.s("The List must not be null");
            return;
        }
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }

    public static <R> R rethrow(Throwable th3) {
        return (R) typeErasure(th3);
    }

    private static <T extends Throwable> T throwableOf(Throwable th3, Class<T> cls, int i14, boolean z14) {
        if (th3 != null && cls != null) {
            if (i14 < 0) {
                i14 = 0;
            }
            Throwable[] throwables = getThrowables(th3);
            if (i14 >= throwables.length) {
                return null;
            }
            if (z14) {
                while (i14 < throwables.length) {
                    if (cls.isAssignableFrom(throwables[i14].getClass())) {
                        return cls.cast(throwables[i14]);
                    }
                    i14++;
                }
            } else {
                while (i14 < throwables.length) {
                    if (cls.equals(throwables[i14].getClass())) {
                        return cls.cast(throwables[i14]);
                    }
                    i14++;
                }
            }
        }
        return null;
    }

    public static <T extends Throwable> T throwableOfThrowable(Throwable th3, Class<T> cls) {
        return (T) throwableOf(th3, cls, 0, false);
    }

    public static <T extends Throwable> T throwableOfType(Throwable th3, Class<T> cls) {
        return (T) throwableOf(th3, cls, 0, true);
    }

    private static <R, T extends Throwable> R typeErasure(Throwable th3) throws Throwable {
        throw th3;
    }

    public static <R> R wrapAndThrow(Throwable th3) {
        if (th3 instanceof RuntimeException) {
            throw ((RuntimeException) th3);
        }
        if (th3 instanceof Error) {
            throw ((Error) th3);
        }
        throw new UndeclaredThrowableException(th3);
    }

    public static int indexOfThrowable(Throwable th3, Class<? extends Throwable> cls, int i14) {
        return indexOf(th3, cls, i14, false);
    }

    public static <T extends Throwable> T throwableOfThrowable(Throwable th3, Class<T> cls, int i14) {
        return (T) throwableOf(th3, cls, i14, false);
    }

    public static int indexOfType(Throwable th3, Class<? extends Throwable> cls, int i14) {
        return indexOf(th3, cls, i14, true);
    }

    public static <T extends Throwable> T throwableOfType(Throwable th3, Class<T> cls, int i14) {
        return (T) throwableOf(th3, cls, i14, true);
    }

    public static void printRootCauseStackTrace(Throwable th3) {
        printRootCauseStackTrace(th3, System.err);
    }

    public static void printRootCauseStackTrace(Throwable th3, PrintWriter printWriter) {
        if (th3 == null) {
            return;
        }
        Objects.requireNonNull(printWriter, "printWriter");
        for (String str : getRootCauseStackTrace(th3)) {
            printWriter.println(str);
        }
        printWriter.flush();
    }

    @Deprecated
    public static Throwable getCause(Throwable th3) {
        return getCause(th3, null);
    }

    public static String[] getStackFrames(Throwable th3) {
        if (th3 == null) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        return getStackFrames(getStackTrace(th3));
    }
}
