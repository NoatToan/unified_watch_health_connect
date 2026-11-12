package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.3")
public interface ContinuationInterceptor extends CoroutineContext.Element {

    @NotNull
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(@NotNull ContinuationInterceptor continuationInterceptor, R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.DefaultImpls.fold(continuationInterceptor, r2, operation);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull ContinuationInterceptor continuationInterceptor, @NotNull CoroutineContext.Key<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                if (ContinuationInterceptor.Key != key) {
                    return null;
                }
                Intrinsics.checkNotNull(continuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            if (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey())) {
                return null;
            }
            E e = (E) abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor);
            if (e instanceof CoroutineContext.Element) {
                return e;
            }
            return null;
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull ContinuationInterceptor continuationInterceptor, @NotNull CoroutineContext.Key<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                return ContinuationInterceptor.Key == key ? EmptyCoroutineContext.INSTANCE : continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            return (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey()) || abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor) == null) ? continuationInterceptor : EmptyCoroutineContext.INSTANCE;
        }

        @NotNull
        public static CoroutineContext plus(@NotNull ContinuationInterceptor continuationInterceptor, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.DefaultImpls.plus(continuationInterceptor, context);
        }

        public static void releaseInterceptedContinuation(@NotNull ContinuationInterceptor continuationInterceptor, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
        }
    }

    public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key);

    @NotNull
    <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> continuation);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key);

    void releaseInterceptedContinuation(@NotNull Continuation<?> continuation);
}
