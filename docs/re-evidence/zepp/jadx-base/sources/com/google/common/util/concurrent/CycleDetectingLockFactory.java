package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@Beta
@GwtIncompatible
public class CycleDetectingLockFactory {
    private static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, h>> b = new MapMaker().weakKeys().makeMap();
    private static final Logger c = Logger.getLogger(CycleDetectingLockFactory.class.getName());
    private static final ThreadLocal<ArrayList<h>> d = new a();
    public final Policy a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Beta
    public static abstract class Policies implements Policy {
        private static final /* synthetic */ Policies[] $VALUES;
        public static final Policies DISABLED;
        public static final Policies THROW;
        public static final Policies WARN;

        public static enum a extends Policies {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        }

        public static enum b extends Policies {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.c.log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        }

        public static enum c extends Policies {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        static {
            a aVar = new a("THROW", 0);
            THROW = aVar;
            b bVar = new b("WARN", 1);
            WARN = bVar;
            c cVar = new c("DISABLED", 2);
            DISABLED = cVar;
            $VALUES = new Policies[]{aVar, bVar, cVar};
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

        public /* synthetic */ Policies(String str, int i, a aVar) {
            this(str, i);
        }
    }

    @Beta
    public interface Policy {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    @Beta
    public static final class PotentialDeadlockException extends g {
        private final g c;

        public /* synthetic */ PotentialDeadlockException(h hVar, h hVar2, g gVar, a aVar) {
            this(hVar, hVar2, gVar);
        }

        public g getConflictingStackTrace() {
            return this.c;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable cause = this.c; cause != null; cause = cause.getCause()) {
                sb.append(", ");
                sb.append(cause.getMessage());
            }
            return sb.toString();
        }

        private PotentialDeadlockException(h hVar, h hVar2, g gVar) {
            super(hVar, hVar2);
            this.c = gVar;
            initCause(gVar);
        }
    }

    @Beta
    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {
        private final Map<E, h> e;

        @VisibleForTesting
        public WithExplicitOrdering(Policy policy, Map<E, h> map) {
            super(policy, null);
            this.e = map;
        }

        public ReentrantLock newReentrantLock(E e) {
            return newReentrantLock((Enum) e, false);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e) {
            return newReentrantReadWriteLock((Enum) e, false);
        }

        public ReentrantLock newReentrantLock(E e, boolean z) {
            return this.a == Policies.DISABLED ? new ReentrantLock(z) : new c(this, this.e.get(e), z, null);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e, boolean z) {
            return this.a == Policies.DISABLED ? new ReentrantReadWriteLock(z) : new e(this, this.e.get(e), z, null);
        }
    }

    public static class a extends ThreadLocal<ArrayList<h>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<h> initialValue() {
            return Lists.newArrayListWithCapacity(3);
        }
    }

    public interface b {
        h a();

        boolean b();
    }

    public final class c extends ReentrantLock implements b {
        private final h a;

        public /* synthetic */ c(CycleDetectingLockFactory cycleDetectingLockFactory, h hVar, boolean z, a aVar) {
            this(hVar, z);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public h a() {
            return this.a;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public boolean b() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        private c(h hVar, boolean z) {
            super(z);
            this.a = (h) Preconditions.checkNotNull(hVar);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }
    }

    public final class e extends ReentrantReadWriteLock implements b {
        private final d a;
        private final f b;
        private final h c;

        public /* synthetic */ e(CycleDetectingLockFactory cycleDetectingLockFactory, h hVar, boolean z, a aVar) {
            this(hVar, z);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public h a() {
            return this.c;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public boolean b() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        private e(h hVar, boolean z) {
            super(z);
            this.a = CycleDetectingLockFactory.this.new d(this);
            this.b = CycleDetectingLockFactory.this.new f(this);
            this.c = (h) Preconditions.checkNotNull(hVar);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.a;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.b;
        }
    }

    public static class g extends IllegalStateException {
        public static final StackTraceElement[] a = new StackTraceElement[0];
        public static final ImmutableSet<String> b = ImmutableSet.of(CycleDetectingLockFactory.class.getName(), g.class.getName(), h.class.getName());

        public g(h hVar, h hVar2) {
            super(hVar.d() + " -> " + hVar2.d());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (WithExplicitOrdering.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(a);
                    return;
                } else {
                    if (!b.contains(stackTrace[i].getClassName())) {
                        setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                        return;
                    }
                }
            }
        }
    }

    public static class h {
        public final Map<h, g> a = new MapMaker().weakKeys().makeMap();
        public final Map<h, PotentialDeadlockException> b = new MapMaker().weakKeys().makeMap();
        public final String c;

        public h(String str) {
            this.c = (String) Preconditions.checkNotNull(str);
        }

        @NullableDecl
        private g c(h hVar, Set<h> set) {
            if (!set.add(this)) {
                return null;
            }
            g gVar = this.a.get(hVar);
            if (gVar != null) {
                return gVar;
            }
            for (Map.Entry<h, g> entry : this.a.entrySet()) {
                h key = entry.getKey();
                g gVarC = key.c(hVar, set);
                if (gVarC != null) {
                    g gVar2 = new g(key, this);
                    gVar2.setStackTrace(entry.getValue().getStackTrace());
                    gVar2.initCause(gVarC);
                    return gVar2;
                }
            }
            return null;
        }

        public void a(Policy policy, h hVar) {
            Preconditions.checkState(this != hVar, "Attempted to acquire multiple locks with the same rank %s", hVar.d());
            if (this.a.containsKey(hVar)) {
                return;
            }
            PotentialDeadlockException potentialDeadlockException = this.b.get(hVar);
            a aVar = null;
            if (potentialDeadlockException != null) {
                policy.handlePotentialDeadlock(new PotentialDeadlockException(hVar, this, potentialDeadlockException.getConflictingStackTrace(), aVar));
                return;
            }
            g gVarC = hVar.c(this, Sets.newIdentityHashSet());
            if (gVarC == null) {
                this.a.put(hVar, new g(hVar, this));
                return;
            }
            PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(hVar, this, gVarC, aVar);
            this.b.put(hVar, potentialDeadlockException2);
            policy.handlePotentialDeadlock(potentialDeadlockException2);
        }

        public void b(Policy policy, List<h> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a(policy, list.get(i));
            }
        }

        public String d() {
            return this.c;
        }
    }

    public /* synthetic */ CycleDetectingLockFactory(Policy policy, a aVar) {
        this(policy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        if (bVar.b()) {
            return;
        }
        ArrayList<h> arrayList = d.get();
        h hVarA = bVar.a();
        hVarA.b(this.a, arrayList);
        arrayList.add(hVarA);
    }

    @VisibleForTesting
    public static <E extends Enum<E>> Map<E, h> e(Class<E> cls) {
        EnumMap enumMapNewEnumMap = Maps.newEnumMap(cls);
        E[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(length);
        int i = 0;
        for (E e2 : enumConstants) {
            h hVar = new h(f(e2));
            arrayListNewArrayListWithCapacity.add(hVar);
            enumMapNewEnumMap.put(e2, hVar);
        }
        for (int i2 = 1; i2 < length; i2++) {
            ((h) arrayListNewArrayListWithCapacity.get(i2)).b(Policies.THROW, arrayListNewArrayListWithCapacity.subList(0, i2));
        }
        while (i < length - 1) {
            i++;
            ((h) arrayListNewArrayListWithCapacity.get(i)).b(Policies.DISABLED, arrayListNewArrayListWithCapacity.subList(i, length));
        }
        return Collections.unmodifiableMap(enumMapNewEnumMap);
    }

    private static String f(Enum<?> r2) {
        return r2.getDeclaringClass().getSimpleName() + "." + r2.name();
    }

    private static Map<? extends Enum, h> g(Class<? extends Enum> cls) {
        ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, h>> concurrentMap = b;
        Map<? extends Enum, h> map = concurrentMap.get(cls);
        if (map != null) {
            return map;
        }
        Map<? extends Enum, h> mapE = e(cls);
        return (Map) MoreObjects.firstNonNull(concurrentMap.putIfAbsent(cls, mapE), mapE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(b bVar) {
        if (bVar.b()) {
            return;
        }
        ArrayList<h> arrayList = d.get();
        h hVarA = bVar.a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == hVarA) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public static CycleDetectingLockFactory newInstance(Policy policy) {
        return new CycleDetectingLockFactory(policy);
    }

    public static <E extends Enum<E>> WithExplicitOrdering<E> newInstanceWithExplicitOrdering(Class<E> cls, Policy policy) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(policy);
        return new WithExplicitOrdering<>(policy, g(cls));
    }

    public ReentrantLock newReentrantLock(String str) {
        return newReentrantLock(str, false);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str) {
        return newReentrantReadWriteLock(str, false);
    }

    private CycleDetectingLockFactory(Policy policy) {
        this.a = (Policy) Preconditions.checkNotNull(policy);
    }

    public ReentrantLock newReentrantLock(String str, boolean z) {
        return this.a == Policies.DISABLED ? new ReentrantLock(z) : new c(this, new h(str), z, null);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str, boolean z) {
        return this.a == Policies.DISABLED ? new ReentrantReadWriteLock(z) : new e(this, new h(str), z, null);
    }

    public class d extends ReentrantReadWriteLock.ReadLock {

        @Weak
        public final e a;

        public d(e eVar) {
            super(eVar);
            this.a = eVar;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.a);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.a);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.a);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.a);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }
    }

    public class f extends ReentrantReadWriteLock.WriteLock {

        @Weak
        public final e a;

        public f(e eVar) {
            super(eVar);
            this.a = eVar;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.a);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.a);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.a);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.a);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this.a);
            }
        }
    }
}
