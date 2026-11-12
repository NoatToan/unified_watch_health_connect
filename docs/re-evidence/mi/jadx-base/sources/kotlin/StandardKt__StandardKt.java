package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
class StandardKt__StandardKt {
    @InlineOnly
    private static final Void TODO() {
        throw new NotImplementedError(null, 1, null);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T also(T t, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(t);
        return t;
    }

    @InlineOnly
    private static final <T> T apply(T t, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(t);
        return t;
    }

    @InlineOnly
    private static final <T, R> R let(T t, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t);
    }

    @InlineOnly
    private static final void repeat(int i, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i2 = 0; i2 < i; i2++) {
            action.invoke(Integer.valueOf(i2));
        }
    }

    @InlineOnly
    private static final <R> R run(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T takeIf(T t, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T takeUnless(T t, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(t).booleanValue()) {
            return null;
        }
        return t;
    }

    @InlineOnly
    private static final <T, R> R with(T t, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t);
    }

    @InlineOnly
    private static final Void TODO(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        throw new NotImplementedError("An operation is not implemented: " + reason);
    }

    @InlineOnly
    private static final <T, R> R run(T t, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t);
    }
}
