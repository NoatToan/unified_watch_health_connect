package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class Ref<T> {

    @Nullable
    private T a;

    public Ref(@Nullable T t) {
        this.a = t;
    }

    @Nullable
    public final T getValue() {
        return this.a;
    }
}
