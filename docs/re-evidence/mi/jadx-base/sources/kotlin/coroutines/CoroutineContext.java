package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.3")
public interface CoroutineContext {

    public static final class DefaultImpls {
        @NotNull
        public static CoroutineContext plus(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == EmptyCoroutineContext.INSTANCE ? coroutineContext : (CoroutineContext) context.fold(coroutineContext, new Function2() { // from class: ul4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContext.DefaultImpls.plus$lambda$0((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static CoroutineContext plus$lambda$0(CoroutineContext acc, Element element) {
            CombinedContext combinedContext;
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            CoroutineContext coroutineContextMinusKey = acc.minusKey(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (coroutineContextMinusKey == emptyCoroutineContext) {
                return element;
            }
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(key);
            if (continuationInterceptor == null) {
                combinedContext = new CombinedContext(coroutineContextMinusKey, element);
            } else {
                CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(key);
                if (coroutineContextMinusKey2 == emptyCoroutineContext) {
                    return new CombinedContext(element, continuationInterceptor);
                }
                combinedContext = new CombinedContext(new CombinedContext(coroutineContextMinusKey2, element), continuationInterceptor);
            }
            return combinedContext;
        }
    }

    public interface Element extends CoroutineContext {

        public static final class DefaultImpls {
            public static <R> R fold(@NotNull Element element, R r2, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(r2, element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends Element> E get(@NotNull Element element, @NotNull Key<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.areEqual(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.checkNotNull(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            @NotNull
            public static CoroutineContext minusKey(@NotNull Element element, @NotNull Key<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.areEqual(element.getKey(), key) ? EmptyCoroutineContext.INSTANCE : element;
            }

            @NotNull
            public static CoroutineContext plus(@NotNull Element element, @NotNull CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return DefaultImpls.plus(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R r2, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

        @Override // kotlin.coroutines.CoroutineContext
        @Nullable
        <E extends Element> E get(@NotNull Key<E> key);

        @NotNull
        Key<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        CoroutineContext minusKey(@NotNull Key<?> key);
    }

    public interface Key<E extends Element> {
    }

    <R> R fold(R r2, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    @Nullable
    <E extends Element> E get(@NotNull Key<E> key);

    @NotNull
    CoroutineContext minusKey(@NotNull Key<?> key);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
