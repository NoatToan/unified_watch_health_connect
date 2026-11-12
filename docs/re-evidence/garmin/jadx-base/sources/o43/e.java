package o43;

import d53.w;
import i3.e5;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p005kotlin.Unit;
import p005kotlin.reflect.jvm.internal.impl.utils.WrappedValues;

/* JADX INFO: loaded from: classes3.dex */
public class e implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f129094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f129095e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o43.l f129096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f129097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f129098c;

    public static class a extends e {
        public a(String str, d dVar, o43.l lVar) {
            super(str, dVar, lVar, null);
        }

        @Override // o43.e
        public final m k(Object obj, String str) {
            return m.a();
        }
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f129099a = new a();

        public static class a implements d {
        }
    }

    /* JADX INFO: renamed from: o43.e$e, reason: collision with other inner class name */
    public static class C2474e<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f129100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<? extends V> f129101b;

        public C2474e(K k14, e23.a<? extends V> aVar) {
            this.f129100a = k14;
            this.f129101b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f129100a.equals(((C2474e) obj).f129100a);
        }

        public final int hashCode() {
            return this.f129100a.hashCode();
        }
    }

    public static class f<T> implements o43.k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f129102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<? extends T> f129103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Object f129104c;

        public f(e eVar, e23.a<? extends T> aVar) {
            if (eVar == null) {
                a(0);
                throw null;
            }
            if (aVar == null) {
                a(1);
                throw null;
            }
            this.f129104c = l.NOT_COMPUTED;
            this.f129102a = eVar;
            this.f129103b = aVar;
        }

        public static /* synthetic */ void a(int i14) {
            String str = (i14 == 2 || i14 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i14 == 2 || i14 == 3) ? 2 : 3];
            if (i14 == 1) {
                objArr[0] = "computable";
            } else if (i14 == 2 || i14 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i14 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i14 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i14 != 2 && i14 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i14 != 2 && i14 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public void b(T t7) {
        }

        public m<T> c(boolean z14) {
            m<T> mVarK = this.f129102a.k(null, "in a lazy value");
            if (mVarK != null) {
                return mVarK;
            }
            a(2);
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0038 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006d, B:34:0x0076, B:35:0x0077, B:36:0x007d, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x003c A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006d, B:34:0x0076, B:35:0x0077, B:36:0x007d, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0045 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006d, B:34:0x0076, B:35:0x0077, B:36:0x007d, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0048 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006d, B:34:0x0076, B:35:0x0077, B:36:0x007d, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
        @Override // e23.a
        public T invoke() throws Throwable {
            m<T> mVarC;
            T t7 = (T) this.f129104c;
            if (!(t7 instanceof l)) {
                WrappedValues.b(t7);
                return t7;
            }
            this.f129102a.f129096a.lock();
            try {
                T tInvoke = (T) this.f129104c;
                if (tInvoke instanceof l) {
                    l lVar = l.COMPUTING;
                    if (tInvoke == lVar) {
                        this.f129104c = l.RECURSION_WAS_DETECTED;
                        m<T> mVarC2 = c(true);
                        if (!mVarC2.f129114b) {
                            tInvoke = mVarC2.f129113a;
                        } else if (tInvoke == l.RECURSION_WAS_DETECTED) {
                            mVarC = c(false);
                            if (mVarC.f129114b) {
                                this.f129104c = lVar;
                                try {
                                    tInvoke = this.f129103b.invoke();
                                    b(tInvoke);
                                    this.f129104c = tInvoke;
                                } catch (Throwable th3) {
                                    if (w13.b.m(th3)) {
                                        this.f129104c = l.NOT_COMPUTED;
                                        throw th3;
                                    }
                                    if (this.f129104c == l.COMPUTING) {
                                        WrappedValues.a aVar = WrappedValues.f105963a;
                                        this.f129104c = new WrappedValues.b(th3, null);
                                    }
                                    ((d.a) this.f129102a.f129097b).getClass();
                                    throw th3;
                                }
                            } else {
                                tInvoke = mVarC.f129113a;
                            }
                        } else {
                            this.f129104c = lVar;
                            tInvoke = this.f129103b.invoke();
                            b(tInvoke);
                            this.f129104c = tInvoke;
                        }
                    } else if (tInvoke == l.RECURSION_WAS_DETECTED) {
                        mVarC = c(false);
                        if (mVarC.f129114b) {
                            tInvoke = mVarC.f129113a;
                        } else {
                            this.f129104c = lVar;
                            tInvoke = this.f129103b.invoke();
                            b(tInvoke);
                            this.f129104c = tInvoke;
                        }
                    } else {
                        this.f129104c = lVar;
                        tInvoke = this.f129103b.invoke();
                        b(tInvoke);
                        this.f129104c = tInvoke;
                    }
                } else {
                    WrappedValues.b(tInvoke);
                }
                this.f129102a.f129096a.unlock();
                return tInvoke;
            } catch (Throwable th4) {
                this.f129102a.f129096a.unlock();
                throw th4;
            }
        }
    }

    public static abstract class g<T> extends f<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile o43.m<T> f129105d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e eVar, e23.a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                a(0);
                throw null;
            }
            if (aVar == null) {
                a(1);
                throw null;
            }
            this.f129105d = null;
        }

        public static /* synthetic */ void a(int i14) {
            Object[] objArr = new Object[3];
            if (i14 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // o43.e.f
        public final void b(T t7) {
            this.f129105d = new o43.m<>(t7);
            try {
                d(t7);
            } finally {
                this.f129105d = null;
            }
        }

        public abstract void d(T t7);

        @Override // o43.e.f, e23.a
        public T invoke() {
            o43.m<T> mVar = this.f129105d;
            if (mVar == null || mVar.f129121b != Thread.currentThread()) {
                return (T) super.invoke();
            }
            if (mVar.f129121b == Thread.currentThread()) {
                return mVar.f129120a;
            }
            vb.h.z("No value in this thread (hasValue should be checked before)");
            return null;
        }
    }

    public static class h<T> extends f<T> implements o43.j<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e eVar, e23.a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                a(0);
                throw null;
            }
            if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i14) {
            String str = i14 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i14 != 2 ? 3 : 2];
            if (i14 == 1) {
                objArr[0] = "computable";
            } else if (i14 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i14 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i14 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i14 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // o43.e.f, e23.a
        public final T invoke() {
            T t7 = (T) super.invoke();
            if (t7 != null) {
                return t7;
            }
            a(2);
            throw null;
        }
    }

    public static abstract class i<T> extends g<T> implements o43.j<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e eVar, e23.a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                a(0);
                throw null;
            }
            if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i14) {
            String str = i14 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i14 != 2 ? 3 : 2];
            if (i14 == 1) {
                objArr[0] = "computable";
            } else if (i14 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i14 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i14 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i14 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // o43.e.g, o43.e.f, e23.a
        public final T invoke() {
            T t7 = (T) super.invoke();
            if (t7 != null) {
                return t7;
            }
            a(2);
            throw null;
        }
    }

    public static class j<K, V> implements o43.i<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f129106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConcurrentMap<K, Object> f129107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.l<? super K, ? extends V> f129108c;

        public j(e eVar, ConcurrentMap<K, Object> concurrentMap, e23.l<? super K, ? extends V> lVar) {
            if (eVar == null) {
                a(0);
                throw null;
            }
            if (concurrentMap == null) {
                a(1);
                throw null;
            }
            if (lVar == null) {
                a(2);
                throw null;
            }
            this.f129106a = eVar;
            this.f129107b = concurrentMap;
            this.f129108c = lVar;
        }

        public static /* synthetic */ void a(int i14) {
            String str = (i14 == 3 || i14 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i14 == 3 || i14 == 4) ? 2 : 3];
            if (i14 == 1) {
                objArr[0] = "map";
            } else if (i14 == 2) {
                objArr[0] = "compute";
            } else if (i14 == 3 || i14 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i14 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i14 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i14 != 3 && i14 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i14 != 3 && i14 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public final AssertionError b(K k14, Object obj) {
            AssertionError assertionError = new AssertionError("Inconsistent key detected. " + l.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k14 + " under " + this.f129106a);
            e.l(assertionError);
            return assertionError;
        }

        public final AssertionError c(K k14, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k14 + ". Old value is " + obj + " under " + this.f129106a);
            e.l(assertionError);
            return assertionError;
        }

        public final AssertionError d(K k14, Throwable th3) {
            AssertionError assertionError = new AssertionError("Unable to remove " + k14 + " under " + this.f129106a, th3);
            e.l(assertionError);
            return assertionError;
        }

        /* JADX WARN: Type inference failed for: r12v7, types: [T, V] */
        /* JADX WARN: Type inference failed for: r12v8, types: [T, V] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // e23.l
        public V invoke(K k14) throws Throwable {
            AssertionError assertionErrorC;
            Object obj;
            ConcurrentMap<K, Object> concurrentMap = this.f129107b;
            V v14 = (V) concurrentMap.get(k14);
            V v15 = null;
            if (v14 != null && v14 != l.COMPUTING) {
                WrappedValues.b(v14);
                if (v14 == WrappedValues.f105963a) {
                    return null;
                }
                return v14;
            }
            e eVar = this.f129106a;
            o43.l lVar = eVar.f129096a;
            d dVar = eVar.f129097b;
            o43.l lVar2 = eVar.f129096a;
            lVar.lock();
            try {
                Object obj2 = concurrentMap.get(k14);
                l lVar3 = l.COMPUTING;
                if (obj2 == lVar3) {
                    obj2 = l.RECURSION_WAS_DETECTED;
                    m mVarK = eVar.k(k14, "");
                    if (mVarK == null) {
                        a(3);
                        throw null;
                    }
                    if (!mVarK.f129114b) {
                        ?? r14 = mVarK.f129113a;
                        lVar2.unlock();
                        return r14;
                    }
                }
                if (obj2 == l.RECURSION_WAS_DETECTED) {
                    m mVarK2 = eVar.k(k14, "");
                    if (mVarK2 == null) {
                        a(3);
                        throw null;
                    }
                    if (!mVarK2.f129114b) {
                        ?? r15 = mVarK2.f129113a;
                        lVar2.unlock();
                        return r15;
                    }
                }
                if (obj2 != null) {
                    WrappedValues.b(obj2);
                    if (obj2 != WrappedValues.f105963a) {
                        v15 = (V) obj2;
                    }
                    lVar2.unlock();
                    return v15;
                }
                try {
                    concurrentMap.put(k14, lVar3);
                    V vInvoke = this.f129108c.invoke(k14);
                    try {
                        if (vInvoke == null) {
                            obj = WrappedValues.f105963a;
                            if (obj == null) {
                                WrappedValues.a(1);
                                throw null;
                            }
                        } else {
                            WrappedValues.a aVar = WrappedValues.f105963a;
                            obj = vInvoke;
                        }
                        Object objPut = concurrentMap.put(k14, obj);
                        if (objPut == lVar3) {
                            lVar2.unlock();
                            return vInvoke;
                        }
                        assertionErrorC = c(k14, objPut);
                        try {
                            throw assertionErrorC;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        assertionErrorC = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                assertionErrorC = null;
                if (w13.b.m(th)) {
                    try {
                        Object objRemove = concurrentMap.remove(k14);
                        if (objRemove != l.COMPUTING) {
                            throw b(k14, objRemove);
                        }
                        throw th;
                    } catch (Throwable th6) {
                        throw d(k14, th6);
                    }
                }
                if (th == assertionErrorC) {
                    try {
                        concurrentMap.remove(k14);
                        ((d.a) dVar).getClass();
                        throw th;
                    } catch (Throwable th7) {
                        throw d(k14, th7);
                    }
                }
                WrappedValues.a aVar2 = WrappedValues.f105963a;
                Object objPut2 = concurrentMap.put(k14, new WrappedValues.b(th, null));
                if (objPut2 != l.COMPUTING) {
                    throw c(k14, objPut2);
                }
                ((d.a) dVar).getClass();
                throw th;
                lVar2.unlock();
                throw th;
            } catch (Throwable th8) {
                lVar2.unlock();
                throw th8;
            }
        }
    }

    public static class k<K, V> extends j<K, V> implements o43.h<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e eVar, ConcurrentMap<K, Object> concurrentMap, e23.l<? super K, ? extends V> lVar) {
            super(eVar, concurrentMap, lVar);
            if (eVar == null) {
                a(0);
                throw null;
            }
            if (concurrentMap == null) {
                a(1);
                throw null;
            }
            if (lVar != null) {
            } else {
                a(2);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i14) {
            String str = i14 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i14 != 3 ? 3 : 2];
            if (i14 == 1) {
                objArr[0] = "map";
            } else if (i14 == 2) {
                objArr[0] = "compute";
            } else if (i14 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i14 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i14 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i14 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // o43.e.j, e23.l
        public final V invoke(K k14) {
            V v14 = (V) super.invoke(k14);
            if (v14 != null) {
                return v14;
            }
            a(3);
            throw null;
        }
    }

    public enum l {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public static class m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f129113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f129114b;

        private m(T t7, boolean z14) {
            this.f129113a = t7;
            this.f129114b = z14;
        }

        public static <T> m<T> a() {
            return new m<>(null, true);
        }

        public static <T> m<T> b(T t7) {
            return new m<>(t7, false);
        }

        public final String toString() {
            return this.f129114b ? "FALL_THROUGH" : String.valueOf(this.f129113a);
        }
    }

    static {
        String canonicalName = e.class.getCanonicalName();
        canonicalName.getClass();
        int iL = w.L(0, 6, canonicalName, ".");
        f129094d = iL == -1 ? "" : canonicalName.substring(0, iL);
        f129095e = new a("NO_LOCKS", d.f129099a, o43.d.f129093b);
    }

    private e(String str, d dVar, o43.l lVar) {
        if (str == null) {
            j(4);
            throw null;
        }
        if (dVar == null) {
            j(5);
            throw null;
        }
        if (lVar == null) {
            j(6);
            throw null;
        }
        this.f129096a = lVar;
        this.f129097b = dVar;
        this.f129098c = str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    public static /* synthetic */ void j(int i14) {
        String str = (i14 == 10 || i14 == 13 || i14 == 20 || i14 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 10 || i14 == 13 || i14 == 20 || i14 == 37) ? 2 : 3];
        if (i14 == 1 || i14 == 3 || i14 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i14 != 6) {
            switch (i14) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i14 == 10 || i14 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i14 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i14 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i14) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 10 && i14 != 13 && i14 != 20 && i14 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static void l(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i14 = 0;
        while (i14 < length) {
            if (!stackTrace[i14].getClassName().startsWith(f129094d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i14, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i14++;
        }
        i14 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i14, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    @Override // o43.n
    public final f a(e23.a aVar) {
        return new f(this, aVar);
    }

    @Override // o43.n
    public final Object b(q23.e eVar) {
        o43.l lVar = this.f129096a;
        lVar.lock();
        try {
            eVar.invoke();
            lVar.unlock();
            return null;
        } catch (Throwable th3) {
            try {
                ((d.a) this.f129097b).getClass();
                throw th3;
            } catch (Throwable th4) {
                lVar.unlock();
                throw th4;
            }
        }
    }

    @Override // o43.n
    public final b c() {
        return new b(this, new ConcurrentHashMap(3, 1.0f, 2), null);
    }

    @Override // o43.n
    public final c d() {
        return new c(this, new ConcurrentHashMap(3, 1.0f, 2), null);
    }

    @Override // o43.n
    public final k e(e23.l lVar) {
        return new k(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    @Override // o43.n
    public final o43.g f(p43.i iVar, e23.l lVar, p43.k kVar) {
        return new o43.g(this, this, iVar, lVar, kVar);
    }

    @Override // o43.n
    public final h g(e23.a aVar) {
        if (aVar != null) {
            return new h(this, aVar);
        }
        j(23);
        throw null;
    }

    @Override // o43.n
    public final j h(e23.l lVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    @Override // o43.n
    public final o43.f i(e23.a aVar, Object obj) {
        if (obj != null) {
            return new o43.f(this, this, aVar, obj);
        }
        j(27);
        throw null;
    }

    public m k(Object obj, String str) {
        StringBuilder sb3 = new StringBuilder("Recursion detected ");
        sb3.append(str);
        sb3.append(obj == null ? "" : e5.f(obj, "on input: "));
        sb3.append(" under ");
        sb3.append(this);
        AssertionError assertionError = new AssertionError(sb3.toString());
        l(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append("@");
        sb3.append(Integer.toHexString(hashCode()));
        sb3.append(" (");
        return am.j.o(this.f129098c, ")", sb3);
    }

    public static class b<K, V> extends c<K, V> implements o43.a<K, V> {
        /* JADX WARN: Illegal instructions before constructor call */
        private b(e eVar, ConcurrentMap<C2474e<K, V>, Object> concurrentMap) {
            a aVar = null;
            if (eVar == null) {
                a(0);
                throw null;
            }
            if (concurrentMap != null) {
                super(eVar, concurrentMap, aVar);
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i14) {
            String str = i14 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i14 != 3 ? 3 : 2];
            if (i14 == 1) {
                objArr[0] = "map";
            } else if (i14 == 2) {
                objArr[0] = "computation";
            } else if (i14 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i14 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i14 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i14 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i14 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        public /* synthetic */ b(e eVar, ConcurrentMap concurrentMap, a aVar) {
            this(eVar, concurrentMap);
        }
    }

    public static class c<K, V> extends j<C2474e<K, V>, V> {

        public class a implements e23.l<C2474e<K, V>, V> {
            @Override // e23.l
            public final Object invoke(Object obj) {
                return ((C2474e) obj).f129101b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private c(e eVar, ConcurrentMap<C2474e<K, V>, Object> concurrentMap) {
            super(eVar, concurrentMap, new a());
            if (eVar == null) {
                a(0);
                throw null;
            }
            if (concurrentMap != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i14) {
            Object[] objArr = new Object[3];
            if (i14 == 1) {
                objArr[0] = "map";
            } else if (i14 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i14 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public /* synthetic */ c(e eVar, ConcurrentMap concurrentMap, a aVar) {
            this(eVar, concurrentMap);
        }
    }

    public /* synthetic */ e(String str, d dVar, o43.l lVar, a aVar) {
        this(str, dVar, lVar);
    }

    public e(String str) {
        this(str, (Runnable) null, (e23.l<InterruptedException, Unit>) null);
    }

    public e(String str, Runnable runnable, e23.l<InterruptedException, Unit> lVar) {
        o43.l cVar;
        d.a aVar = d.f129099a;
        o43.l.f129118a.getClass();
        if (runnable != null && lVar != null) {
            cVar = new o43.b(runnable, lVar);
        } else {
            cVar = new o43.c(null, 1, null);
        }
        this(str, aVar, cVar);
    }
}
