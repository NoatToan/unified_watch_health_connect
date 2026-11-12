package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;
import defpackage.k4f;
import defpackage.xhe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class CycleDetectingLockFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> f9331a = new k4f().l().i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f9332b = Logger.getLogger(CycleDetectingLockFactory.class.getName());
    public static final ThreadLocal<ArrayList<c>> c = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Policies {
        public static final Policies THROW = new a("THROW", 0);
        public static final Policies WARN = new b("WARN", 1);
        public static final Policies DISABLED = new c("DISABLED", 2);
        private static final /* synthetic */ Policies[] $VALUES = $values();

        public final enum a extends Policies {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        }

        public final enum b extends Policies {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f9332b.log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        }

        public final enum c extends Policies {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        private static /* synthetic */ Policies[] $values() {
            return new Policies[]{THROW, WARN, DISABLED};
        }

        private Policies(String str, int i) {
            super(str, i);
        }

        public static Policies valueOf(String str) {
            return (Policies) Enum.valueOf(Policies.class, str);
        }

        public static Policies[] values() {
            return (Policies[]) $VALUES.clone();
        }

        public abstract /* synthetic */ void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);

        public /* synthetic */ Policies(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static final class PotentialDeadlockException extends b {
        private final b conflictingStackTrace;

        public /* synthetic */ PotentialDeadlockException(c cVar, c cVar2, b bVar, a aVar) {
            this(cVar, cVar2, bVar);
        }

        public b getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable cause = this.conflictingStackTrace; cause != null; cause = cause.getCause()) {
                sb.append(", ");
                sb.append(cause.getMessage());
            }
            return sb.toString();
        }

        private PotentialDeadlockException(c cVar, c cVar2, b bVar) {
            super(cVar, cVar2);
            this.conflictingStackTrace = bVar;
            initCause(bVar);
        }
    }

    public class a extends ThreadLocal<ArrayList<c>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<c> initialValue() {
            return xhe.j(3);
        }
    }

    public static class b extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.of(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());

        public b(c cVar, c cVar2) {
            String strA = cVar.a();
            String strA2 = cVar2.a();
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 4 + String.valueOf(strA2).length());
            sb.append(strA);
            sb.append(" -> ");
            sb.append(strA2);
            super(sb.toString());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (d.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else {
                    if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i].getClassName())) {
                        setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                        return;
                    }
                }
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9333a;

        public String a() {
            return this.f9333a;
        }
    }

    public static final class d<E extends Enum<E>> extends CycleDetectingLockFactory {
    }
}
