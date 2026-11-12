package com.github.anrwatchdog;

import android.os.Looper;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class ANRError extends Error {
    private static final long serialVersionUID = 1;
    public final long duration;

    public static class a implements Serializable {
        private final String a;
        private final StackTraceElement[] b;

        /* JADX INFO: renamed from: com.github.anrwatchdog.ANRError$a$a, reason: collision with other inner class name */
        public class C0135a extends Throwable {
            public /* synthetic */ C0135a(a aVar, C0135a c0135a, b bVar) {
                this(c0135a);
            }

            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                setStackTrace(a.this.b);
                return this;
            }

            private C0135a(C0135a c0135a) {
                super(a.this.a, c0135a);
            }
        }

        public /* synthetic */ a(String str, StackTraceElement[] stackTraceElementArr, b bVar) {
            this(str, stackTraceElementArr);
        }

        private a(String str, StackTraceElement[] stackTraceElementArr) {
            this.a = str;
            this.b = stackTraceElementArr;
        }
    }

    public static class b implements Comparator<Thread> {
        public final /* synthetic */ Thread a;

        public b(Thread thread) {
            this.a = thread;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Thread thread, Thread thread2) {
            if (thread == thread2) {
                return 0;
            }
            Thread thread3 = this.a;
            if (thread == thread3) {
                return 1;
            }
            if (thread2 == thread3) {
                return -1;
            }
            return thread2.getName().compareTo(thread.getName());
        }
    }

    private ANRError(a.C0135a c0135a, long j) {
        super("Application Not Responding for at least " + j + " ms.", c0135a);
        this.duration = j;
    }

    public static ANRError a(long j, String str, boolean z) {
        Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new b(thread));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == thread || (entry.getKey().getName().startsWith(str) && (z || entry.getValue().length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        b bVar = null;
        a.C0135a c0135a = null;
        for (Map.Entry entry2 : treeMap.entrySet()) {
            c0135a = new a.C0135a(new a(c((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue(), bVar), c0135a, bVar);
        }
        return new ANRError(c0135a, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ANRError b(long j) {
        Thread thread = Looper.getMainLooper().getThread();
        return new ANRError(new a.C0135a(new a(c(thread), thread.getStackTrace(), null), 0 == true ? 1 : 0, 0 == true ? 1 : 0), j);
    }

    private static String c(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
