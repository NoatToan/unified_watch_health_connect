package rx.exceptions;

import java.util.HashSet;
import v83.s;

/* JADX INFO: loaded from: classes11.dex */
public final class AssemblyStackTraceException extends RuntimeException {
    private static final long serialVersionUID = 2038859767182585852L;

    public AssemblyStackTraceException(String str) {
        super(str);
    }

    public static AssemblyStackTraceException find(Throwable th3) {
        HashSet hashSet = new HashSet();
        while (!(th3 instanceof AssemblyStackTraceException)) {
            if (th3 != null && th3.getCause() != null) {
                th3 = th3.getCause();
                if (!hashSet.add(th3)) {
                }
            }
            return null;
        }
        return (AssemblyStackTraceException) th3;
    }

    public void attachTo(Throwable th3) {
        HashSet hashSet = new HashSet();
        while (th3.getCause() != null) {
            th3 = th3.getCause();
            if (!hashSet.add(th3)) {
                s.a(this);
                return;
            }
        }
        try {
            th3.initCause(this);
        } catch (IllegalStateException unused) {
            s.a(new RuntimeException("Received an exception with a cause set to null, instead of being unset. To fix this, look down the chain of causes. The last exception had a cause explicitly set to null. It should be unset instead.", th3));
        }
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
