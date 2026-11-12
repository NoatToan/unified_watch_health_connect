package io.reactivex.exceptions;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    public static final class a extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public static abstract class b {
        public abstract void a(String str);
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintStream f94583a;

        public c(PrintStream printStream) {
            this.f94583a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        public final void a(String str) {
            this.f94583a.println((Object) str);
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintWriter f94584a;

        public d(PrintWriter printWriter) {
            this.f94584a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        public final void a(String str) {
            this.f94584a.println((Object) str);
        }
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th3 : iterable) {
                if (th3 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th3).getExceptions());
                } else if (th3 != null) {
                    linkedHashSet.add(th3);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            h.s("errors is empty");
            throw null;
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.exceptions = listUnmodifiableList;
        this.message = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    private void appendStackTrace(StringBuilder sb3, Throwable th3, String str) {
        sb3.append(str);
        sb3.append(th3);
        sb3.append('\n');
        for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
            sb3.append("\t\tat ");
            sb3.append(stackTraceElement);
            sb3.append('\n');
        }
        if (th3.getCause() != null) {
            sb3.append("\tCaused by: ");
            appendStackTrace(sb3, th3.getCause(), "");
        }
    }

    private List<Throwable> getListOfCauses(Throwable th3) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th3.getCause();
        if (cause != null && cause != th3) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private void printStackTrace(b bVar) {
        StringBuilder sb3 = new StringBuilder(128);
        sb3.append(this);
        sb3.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb3.append("\tat ");
            sb3.append(stackTraceElement);
            sb3.append('\n');
        }
        int i14 = 1;
        for (Throwable th3 : this.exceptions) {
            sb3.append("  ComposedException ");
            sb3.append(i14);
            sb3.append(" :\n");
            appendStackTrace(sb3, th3, SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            i14++;
        }
        bVar.a(sb3.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.cause == null) {
                a aVar = new a();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.exceptions.iterator();
                Throwable rootCause = aVar;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th3 : getListOfCauses(next)) {
                            if (hashSet.contains(th3)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th3);
                            }
                        }
                        try {
                            rootCause.initCause(next);
                        } catch (Throwable unused) {
                        }
                        rootCause = getRootCause(rootCause);
                    }
                }
                this.cause = aVar;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.cause;
    }

    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public Throwable getRootCause(Throwable th3) {
        Throwable cause = th3.getCause();
        if (cause == null || th3 == cause) {
            return th3;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    public int size() {
        return this.exceptions.size();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace(new d(printWriter));
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }
}
