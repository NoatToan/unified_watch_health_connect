package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.MapMaker;
import defpackage.aml;
import defpackage.aqy;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class CycleDetectingLockFactory {
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> e = new MapMaker().f().g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final aqy f4696c = new aqy(CycleDetectingLockFactory.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<c>> f4695b = new ThreadLocal<ArrayList<c>>() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ArrayList<c> initialValue() {
            return aml.b(3);
        }
    };

    interface CycleDetectingLock {
        c getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    public enum Policies implements Policy {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(b bVar) {
                throw bVar;
            }
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(b bVar) {
                CycleDetectingLockFactory.f4696c.b().log(Level.SEVERE, "Detected potential deadlock", (Throwable) bVar);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(b bVar) {
            }
        }
    }

    public interface Policy {
        void handlePotentialDeadlock(b bVar);
    }

    static class c {
    }

    static class e extends IllegalStateException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final StackTraceElement[] f4698c = new StackTraceElement[0];
        static final ImmutableSet<String> e = ImmutableSet.of(CycleDetectingLockFactory.class.getName(), e.class.getName(), c.class.getName());
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f4697b;

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb = new StringBuilder((String) Objects.requireNonNull(super.getMessage()));
            for (Throwable cause = this.f4697b; cause != null; cause = cause.getCause()) {
                sb.append(", ");
                sb.append(cause.getMessage());
            }
            return sb.toString();
        }
    }
}
