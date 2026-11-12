package kotlin.properties;

import kotlin.SinceKotlin;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.4")
public interface PropertyDelegateProvider<T, D> {
    D provideDelegate(T t, @NotNull KProperty<?> kProperty);
}
