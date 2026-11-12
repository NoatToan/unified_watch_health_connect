package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class ech<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<T> f16494a;

    public ech(@NotNull Class<T> cls) {
        this.f16494a = cls;
    }

    @NotNull
    public static <T> ech<T> a(@NotNull Class<T> cls) {
        return new ech<>(cls);
    }

    @NotNull
    public T b() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        return this.f16494a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}
