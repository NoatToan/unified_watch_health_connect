package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import androidx.core.util.Supplier;
import defpackage.g6i;
import defpackage.n7i;
import defpackage.zz;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> absent() {
        return zz.a();
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? absent() : new n7i(t);
    }

    public static <T> Optional<T> of(T t) {
        return new n7i(g6i.g(t));
    }

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract String toString();
}
