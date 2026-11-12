package org.apache.commons.lang.exception;

import defpackage.of8;
import defpackage.xig;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NestableDelegate implements Serializable {
    private static final transient String MUST_BE_THROWABLE = "The Nestable implementation passed to the NestableDelegate(Nestable) constructor must extend java.lang.Throwable";
    static /* synthetic */ Class class$org$apache$commons$lang$exception$Nestable = null;
    public static boolean matchSubclasses = true;
    private static final long serialVersionUID = 1;
    public static boolean topDown = true;
    public static boolean trimStackFrames = true;
    private Throwable nestable;

    /* JADX WARN: Multi-variable type inference failed */
    public NestableDelegate(xig xigVar) {
        this.nestable = null;
        if (!(xigVar instanceof Throwable)) {
            throw new IllegalArgumentException(MUST_BE_THROWABLE);
        }
        this.nestable = (Throwable) xigVar;
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getMessage(int i) {
        Throwable throwable = getThrowable(i);
        Class cls = class$org$apache$commons$lang$exception$Nestable;
        Class cls2 = cls;
        if (cls == null) {
            Class clsClass$ = class$("org.apache.commons.lang.exception.Nestable");
            class$org$apache$commons$lang$exception$Nestable = clsClass$;
            cls2 = clsClass$;
        }
        return cls2.isInstance(throwable) ? ((xig) throwable).getMessage(0) : throwable.getMessage();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String[] getMessages() {
        Class cls;
        Throwable[] throwables = getThrowables();
        String[] strArr = new String[throwables.length];
        for (int i = 0; i < throwables.length; i++) {
            Class cls2 = class$org$apache$commons$lang$exception$Nestable;
            if (cls2 == null) {
                cls = cls2;
                Class clsClass$ = class$("org.apache.commons.lang.exception.Nestable");
                class$org$apache$commons$lang$exception$Nestable = clsClass$;
                cls = clsClass$;
            }
            cls = cls2;
            strArr[i] = cls.isInstance(throwables[i]) ? ((xig) throwables[i]).getMessage(0) : throwables[i].getMessage();
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String[] getStackFrames(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
        if (th instanceof xig) {
            ((xig) th).printPartialStackTrace(printWriter);
        } else {
            th.printStackTrace(printWriter);
        }
        return of8.g(stringWriter.getBuffer().toString());
    }

    public Throwable getThrowable(int i) {
        return i == 0 ? this.nestable : getThrowables()[i];
    }

    public int getThrowableCount() {
        return of8.h(this.nestable);
    }

    public Throwable[] getThrowables() {
        return of8.j(this.nestable);
    }

    public int indexOfThrowable(Class cls, int i) {
        if (cls == null) {
            return -1;
        }
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("The start index was out of bounds: ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        Throwable[] thArrJ = of8.j(this.nestable);
        if (i >= thArrJ.length) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("The start index was out of bounds: ");
            stringBuffer2.append(i);
            stringBuffer2.append(" >= ");
            stringBuffer2.append(thArrJ.length);
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        }
        if (matchSubclasses) {
            while (i < thArrJ.length) {
                if (cls.isAssignableFrom(thArrJ[i].getClass())) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < thArrJ.length) {
                if (cls.equals(thArrJ[i].getClass())) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void trimStackFrames(List list) {
        for (int size = list.size() - 1; size > 0; size--) {
            String[] strArr = (String[]) list.get(size);
            String[] strArr2 = (String[]) list.get(size - 1);
            ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
            of8.l(arrayList, new ArrayList(Arrays.asList(strArr2)));
            int length = strArr.length - arrayList.size();
            if (length > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("\t... ");
                stringBuffer.append(length);
                stringBuffer.append(" more");
                arrayList.add(stringBuffer.toString());
                list.set(size, arrayList.toArray(new String[arrayList.size()]));
            }
        }
    }

    public void printStackTrace(PrintStream printStream) {
        synchronized (printStream) {
            PrintWriter printWriter = new PrintWriter((OutputStream) printStream, false);
            printStackTrace(printWriter);
            printWriter.flush();
        }
    }

    public String getMessage(String str) {
        Throwable thB = of8.b(this.nestable);
        String message = thB == null ? null : thB.getMessage();
        if (thB == null || message == null) {
            return str;
        }
        if (str == null) {
            return message;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(": ");
        stringBuffer.append(message);
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void printStackTrace(PrintWriter printWriter) {
        Throwable thB;
        Throwable th = this.nestable;
        if (of8.k()) {
            if (th instanceof xig) {
                ((xig) th).printPartialStackTrace(printWriter);
                return;
            } else {
                th.printStackTrace(printWriter);
                return;
            }
        }
        List arrayList = new ArrayList();
        while (thB != null) {
            thB = th;
            arrayList.add(getStackFrames(thB));
            thB = of8.b(thB);
        }
        thB = th;
        String str = "Caused by: ";
        if (!topDown) {
            str = "Rethrown as: ";
            Collections.reverse(arrayList);
        }
        if (trimStackFrames) {
            trimStackFrames(arrayList);
        }
        synchronized (printWriter) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    for (String str2 : (String[]) it.next()) {
                        printWriter.println(str2);
                    }
                    if (it.hasNext()) {
                        printWriter.print(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
