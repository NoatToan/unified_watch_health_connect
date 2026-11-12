package kotlin.reflect.jvm.internal.impl.storage;

import com.huami.moving.ui.utils.SportAnalytics;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public class LockBasedStorageManager implements StorageManager {
    public static final /* synthetic */ boolean d = false;
    private final ExceptionHandlingStrategy a;
    private final String b;
    public final SimpleLock lock;
    private static final String c = StringsKt__StringsKt.substringBeforeLast(LockBasedStorageManager.class.getCanonicalName(), ".", "");
    public static final StorageManager NO_LOCKS = new a("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE);

    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new a();

        public static class a implements ExceptionHandlingStrategy {
            private static /* synthetic */ void a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            @NotNull
            public RuntimeException handleException(@NotNull Throwable th) {
                if (th == null) {
                    a(0);
                }
                throw ExceptionUtilsKt.rethrow(th);
            }
        }

        @NotNull
        RuntimeException handleException(@NotNull Throwable th);
    }

    public static class a extends LockBasedStorageManager {
        public a(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
            super(str, exceptionHandlingStrategy, simpleLock, null);
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        @NotNull
        public <K, V> n<V> recursionDetectedDefault(@NotNull String str, K k) {
            if (str == null) {
                a(0);
            }
            n<V> nVarA = n.a();
            if (nVarA == null) {
                a(1);
            }
            return nVarA;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> extends i<T> {
        public final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Object obj) {
            super(lockBasedStorageManager, function0);
            this.e = obj;
        }

        private static /* synthetic */ void a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        @NotNull
        public n<T> c(boolean z) {
            n<T> nVarD = n.d(this.e);
            if (nVarD == null) {
                a(0);
            }
            return nVarD;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> extends j<T> {
        public final /* synthetic */ Function1 f;
        public final /* synthetic */ Function1 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Function1 function1, Function1 function2) {
            super(lockBasedStorageManager, function0);
            this.f = function1;
            this.g = function2;
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        @NotNull
        public n<T> c(boolean z) {
            Function1 function1 = this.f;
            if (function1 == null) {
                n<T> nVarC = super.c(z);
                if (nVarC == null) {
                    a(0);
                }
                return nVarC;
            }
            n<T> nVarD = n.d(function1.invoke(Boolean.valueOf(z)));
            if (nVarD == null) {
                a(1);
            }
            return nVarD;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h
        public void d(@NotNull T t) {
            if (t == null) {
                a(2);
            }
            this.g.invoke(t);
        }
    }

    public static class d<K, V> extends e<K, V> implements CacheWithNotNullValues<K, V> {
        public static final /* synthetic */ boolean d = false;

        public /* synthetic */ d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = SportAnalytics.ParamValue.MapButtonType.MAP;
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.e, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        @NotNull
        public V computeIfAbsent(K k, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                a(2);
            }
            V v = (V) super.computeIfAbsent(k, function0);
            if (v == null) {
                a(3);
            }
            return v;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, null);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (concurrentMap == null) {
                a(1);
            }
        }
    }

    public static class e<K, V> extends k<f<K, V>, V> implements CacheWithNullableValues<K, V> {

        public class a implements Function1<f<K, V>, V> {
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public V invoke(f<K, V> fVar) {
                return (V) ((f) fVar).b.invoke();
            }
        }

        public /* synthetic */ e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = SportAnalytics.ParamValue.MapButtonType.MAP;
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Nullable
        public V computeIfAbsent(K k, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                a(2);
            }
            return invoke(new f(k, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new a());
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (concurrentMap == null) {
                a(1);
            }
        }
    }

    public static class f<K, V> {
        private final K a;
        private final Function0<? extends V> b;

        public f(K k, Function0<? extends V> function0) {
            this.a = k;
            this.b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.a.equals(((f) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static class g<T> implements NullableLazyValue<T> {
        private final LockBasedStorageManager a;
        private final Function0<? extends T> b;

        @Nullable
        private volatile Object c;

        public g(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
            this.c = m.NOT_COMPUTED;
            this.a = lockBasedStorageManager;
            this.b = function0;
        }

        private static /* synthetic */ void a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public void b(T t) {
        }

        @NotNull
        public n<T> c(boolean z) {
            n<T> nVarRecursionDetectedDefault = this.a.recursionDetectedDefault("in a lazy value", null);
            if (nVarRecursionDetectedDefault == null) {
                a(2);
            }
            return nVarRecursionDetectedDefault;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x003c A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:38:0x0012, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:38:0x0012, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x004b A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:38:0x0012, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0050 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:38:0x0012, inners: #1 }] */
        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T tInvoke;
            n<T> nVarC;
            Object obj = this.c;
            if (!(obj instanceof m)) {
                return (T) WrappedValues.unescapeThrowable(obj);
            }
            this.a.lock.lock();
            try {
                Object obj2 = this.c;
                if (obj2 instanceof m) {
                    m mVar = m.COMPUTING;
                    if (obj2 == mVar) {
                        this.c = m.RECURSION_WAS_DETECTED;
                        n<T> nVarC2 = c(true);
                        if (!nVarC2.c()) {
                            tInvoke = nVarC2.b();
                        } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                            nVarC = c(false);
                            if (nVarC.c()) {
                                this.c = mVar;
                                try {
                                    tInvoke = this.b.invoke();
                                    b(tInvoke);
                                    this.c = tInvoke;
                                } catch (Throwable th) {
                                    if (ExceptionUtilsKt.isProcessCanceledException(th)) {
                                        this.c = m.NOT_COMPUTED;
                                        throw th;
                                    }
                                    if (this.c == m.COMPUTING) {
                                        this.c = WrappedValues.escapeThrowable(th);
                                    }
                                    throw this.a.a.handleException(th);
                                }
                            } else {
                                tInvoke = nVarC.b();
                            }
                        } else {
                            this.c = mVar;
                            tInvoke = this.b.invoke();
                            b(tInvoke);
                            this.c = tInvoke;
                        }
                    } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                        nVarC = c(false);
                        if (nVarC.c()) {
                            tInvoke = nVarC.b();
                        } else {
                            this.c = mVar;
                            tInvoke = this.b.invoke();
                            b(tInvoke);
                            this.c = tInvoke;
                        }
                    } else {
                        this.c = mVar;
                        tInvoke = this.b.invoke();
                        b(tInvoke);
                        this.c = tInvoke;
                    }
                } else {
                    tInvoke = (T) WrappedValues.unescapeThrowable(obj2);
                }
                this.a.lock.unlock();
                return tInvoke;
            } catch (Throwable th2) {
                this.a.lock.unlock();
                throw th2;
            }
        }

        public boolean isComputed() {
            return (this.c == m.NOT_COMPUTED || this.c == m.COMPUTING) ? false : true;
        }
    }

    public static abstract class h<T> extends g<T> {

        @Nullable
        private volatile kotlin.reflect.jvm.internal.impl.storage.a<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
            this.d = null;
        }

        private static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        public final void b(T t) {
            this.d = new kotlin.reflect.jvm.internal.impl.storage.a<>(t);
            try {
                d(t);
            } finally {
                this.d = null;
            }
        }

        public abstract void d(T t);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.jvm.functions.Function0
        public T invoke() {
            kotlin.reflect.jvm.internal.impl.storage.a<T> aVar = this.d;
            return (aVar == null || !aVar.b()) ? (T) super.invoke() : aVar.a();
        }
    }

    public static class i<T> extends g<T> implements NotNullLazyValue<T> {
        public static final /* synthetic */ boolean d = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                a(2);
            }
            return t;
        }
    }

    public static abstract class j<T> extends h<T> implements NotNullLazyValue<T> {
        public static final /* synthetic */ boolean e = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                a(2);
            }
            return t;
        }
    }

    public static class k<K, V> implements MemoizedFunctionToNullable<K, V> {
        private final LockBasedStorageManager a;
        private final ConcurrentMap<K, Object> b;
        private final Function1<? super K, ? extends V> c;

        public k(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (concurrentMap == null) {
                a(1);
            }
            if (function1 == null) {
                a(2);
            }
            this.a = lockBasedStorageManager;
            this.b = concurrentMap;
            this.c = function1;
        }

        private static /* synthetic */ void a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = SportAnalytics.ParamValue.MapButtonType.MAP;
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @NotNull
        private AssertionError c(K k, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.e(new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.a));
            if (assertionError == null) {
                a(4);
            }
            return assertionError;
        }

        public LockBasedStorageManager b() {
            return this.a;
        }

        @NotNull
        public n<V> d(K k, boolean z) {
            n<V> nVarRecursionDetectedDefault = this.a.recursionDetectedDefault("", k);
            if (nVarRecursionDetectedDefault == null) {
                a(3);
            }
            return nVarRecursionDetectedDefault;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003b A[Catch: all -> 0x00b5, PHI: r0
          0x003b: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v17 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b5, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:16:0x003b, B:18:0x003f, B:20:0x004a, B:22:0x0051, B:32:0x007c, B:35:0x0084, B:37:0x0092, B:38:0x0096, B:39:0x0097, B:40:0x00a1, B:41:0x00a2, B:42:0x00ac, B:43:0x00ad, B:44:0x00b4, B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:48:0x0018, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:18:0x003f A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:16:0x003b, B:18:0x003f, B:20:0x004a, B:22:0x0051, B:32:0x007c, B:35:0x0084, B:37:0x0092, B:38:0x0096, B:39:0x0097, B:40:0x00a1, B:41:0x00a2, B:42:0x00ac, B:43:0x00ad, B:44:0x00b4, B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:48:0x0018, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x004a A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:16:0x003b, B:18:0x003f, B:20:0x004a, B:22:0x0051, B:32:0x007c, B:35:0x0084, B:37:0x0092, B:38:0x0096, B:39:0x0097, B:40:0x00a1, B:41:0x00a2, B:42:0x00ac, B:43:0x00ad, B:44:0x00b4, B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:48:0x0018, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x004f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:16:0x003b, B:18:0x003f, B:20:0x004a, B:22:0x0051, B:32:0x007c, B:35:0x0084, B:37:0x0092, B:38:0x0096, B:39:0x0097, B:40:0x00a1, B:41:0x00a2, B:42:0x00ac, B:43:0x00ad, B:44:0x00b4, B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:48:0x0018, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0056  */
        /* JADX WARN: Code duplicated, block: B:27:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0076 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #1 {all -> 0x007b, blocks: (B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:49:0x0057, outer: #0 }] */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public V invoke(K k) {
            AssertionError assertionErrorC;
            V vInvoke;
            Object objPut;
            V vB;
            n<V> nVarD;
            Object obj = this.b.get(k);
            if (obj != null && obj != m.COMPUTING) {
                return (V) WrappedValues.unescapeExceptionOrNull(obj);
            }
            this.a.lock.lock();
            try {
                Object obj2 = this.b.get(k);
                m mVar = m.COMPUTING;
                if (obj2 == mVar) {
                    obj2 = m.RECURSION_WAS_DETECTED;
                    n<V> nVarD2 = d(k, true);
                    if (!nVarD2.c()) {
                        vB = nVarD2.b();
                    } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                        nVarD = d(k, false);
                        if (!nVarD.c()) {
                            vB = nVarD.b();
                        } else {
                            if (obj2 != null) {
                                assertionErrorC = null;
                                try {
                                    this.b.put(k, mVar);
                                    vInvoke = this.c.invoke(k);
                                    objPut = this.b.put(k, WrappedValues.escapeNull(vInvoke));
                                    if (objPut == mVar) {
                                        this.a.lock.unlock();
                                        return vInvoke;
                                    }
                                    assertionErrorC = c(k, objPut);
                                    throw assertionErrorC;
                                } catch (Throwable th) {
                                    if (ExceptionUtilsKt.isProcessCanceledException(th)) {
                                        this.b.remove(k);
                                        throw th;
                                    }
                                    if (th == assertionErrorC) {
                                        throw this.a.a.handleException(th);
                                    }
                                    Object objPut2 = this.b.put(k, WrappedValues.escapeThrowable(th));
                                    if (objPut2 != m.COMPUTING) {
                                        throw c(k, objPut2);
                                    }
                                    throw this.a.a.handleException(th);
                                }
                            }
                            vB = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                        }
                    } else {
                        if (obj2 != null) {
                            assertionErrorC = null;
                            this.b.put(k, mVar);
                            vInvoke = this.c.invoke(k);
                            objPut = this.b.put(k, WrappedValues.escapeNull(vInvoke));
                            if (objPut == mVar) {
                                this.a.lock.unlock();
                                return vInvoke;
                            }
                            assertionErrorC = c(k, objPut);
                            throw assertionErrorC;
                        }
                        vB = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                    }
                } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                    nVarD = d(k, false);
                    if (!nVarD.c()) {
                        vB = nVarD.b();
                    } else {
                        if (obj2 != null) {
                            assertionErrorC = null;
                            this.b.put(k, mVar);
                            vInvoke = this.c.invoke(k);
                            objPut = this.b.put(k, WrappedValues.escapeNull(vInvoke));
                            if (objPut == mVar) {
                                this.a.lock.unlock();
                                return vInvoke;
                            }
                            assertionErrorC = c(k, objPut);
                            throw assertionErrorC;
                        }
                        vB = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                    }
                } else {
                    if (obj2 != null) {
                        assertionErrorC = null;
                        this.b.put(k, mVar);
                        vInvoke = this.c.invoke(k);
                        objPut = this.b.put(k, WrappedValues.escapeNull(vInvoke));
                        if (objPut == mVar) {
                            this.a.lock.unlock();
                            return vInvoke;
                        }
                        assertionErrorC = c(k, objPut);
                        throw assertionErrorC;
                    }
                    vB = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                }
                this.a.lock.unlock();
                return vB;
            } catch (Throwable th2) {
                this.a.lock.unlock();
                throw th2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public boolean isComputed(K k) {
            Object obj = this.b.get(k);
            return (obj == null || obj == m.COMPUTING) ? false : true;
        }
    }

    public static class l<K, V> extends k<K, V> implements MemoizedFunctionToNotNull<K, V> {
        public static final /* synthetic */ boolean d = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (concurrentMap == null) {
                a(1);
            }
            if (function1 == null) {
                a(2);
            }
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = SportAnalytics.ParamValue.MapButtonType.MAP;
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.k, kotlin.jvm.functions.Function1
        @NotNull
        public V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v == null) {
                a(3);
            }
            return v;
        }
    }

    public enum m {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public static class n<T> {
        public static final /* synthetic */ boolean c = false;
        private final T a;
        private final boolean b;

        private n(T t, boolean z) {
            this.a = t;
            this.b = z;
        }

        @NotNull
        public static <T> n<T> a() {
            return new n<>(null, true);
        }

        @NotNull
        public static <T> n<T> d(T t) {
            return new n<>(t, false);
        }

        public T b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.a);
        }
    }

    public /* synthetic */ LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock, a aVar) {
        this(str, exceptionHandlingStrategy, simpleLock);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    private static /* synthetic */ void a(int i2) {
        String str = (i2 == 10 || i2 == 13 || i2 == 20 || i2 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 10 || i2 == 13 || i2 == 20 || i2 == 37) ? 2 : 3];
        if (i2 == 1 || i2 == 3 || i2 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i2 != 6) {
            switch (i2) {
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
                    objArr[0] = SportAnalytics.ParamValue.MapButtonType.MAP;
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
        if (i2 == 10 || i2 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i2 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i2 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i2) {
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
        if (i2 != 10 && i2 != 13 && i2 != 20 && i2 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    private static <K> ConcurrentMap<K, Object> d() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public static <T extends Throwable> T e(@NotNull T t) {
        if (t == null) {
            a(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (!stackTrace[i3].getClassName().startsWith(c)) {
                i2 = i3;
                break;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i2, length);
        t.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            a(34);
        }
        this.lock.lock();
        try {
            T tInvoke = function0.invoke();
            this.lock.unlock();
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw this.a.handleException(th);
            } catch (Throwable th2) {
                this.lock.unlock();
                throw th2;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new d(this, d(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new e(this, d(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            a(23);
        }
        return new i(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function2) {
        if (function0 == null) {
            a(28);
        }
        if (function2 == null) {
            a(29);
        }
        return new c(this, function0, function1, function2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            a(9);
        }
        MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullCreateMemoizedFunction = createMemoizedFunction(function1, d());
        if (memoizedFunctionToNotNullCreateMemoizedFunction == null) {
            a(10);
        }
        return memoizedFunctionToNotNullCreateMemoizedFunction;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            a(19);
        }
        MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, d());
        if (memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues == null) {
            a(20);
        }
        return memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            a(30);
        }
        return new g(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull T t) {
        if (function0 == null) {
            a(26);
        }
        if (t == null) {
            a(27);
        }
        return new b(this, function0, t);
    }

    @NotNull
    public <K, V> n<V> recursionDetectedDefault(@NotNull String str, K k2) {
        String str2;
        if (str == null) {
            a(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (k2 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k2;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) e(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.b + ")";
    }

    private LockBasedStorageManager(@NotNull String str, @NotNull ExceptionHandlingStrategy exceptionHandlingStrategy, @NotNull SimpleLock simpleLock) {
        if (str == null) {
            a(4);
        }
        if (exceptionHandlingStrategy == null) {
            a(5);
        }
        if (simpleLock == null) {
            a(6);
        }
        this.lock = simpleLock;
        this.a = exceptionHandlingStrategy;
        this.b = str;
    }

    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            a(14);
        }
        if (concurrentMap == null) {
            a(15);
        }
        return new l(this, concurrentMap, function1);
    }

    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            a(21);
        }
        if (concurrentMap == null) {
            a(22);
        }
        return new k(this, concurrentMap, function1);
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, @Nullable Runnable runnable, @Nullable Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, function1));
    }
}
