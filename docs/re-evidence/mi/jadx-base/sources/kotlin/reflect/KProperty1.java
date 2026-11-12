package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface KProperty1<T, V> extends KProperty<V>, Function1<T, V> {

    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    public interface Getter<T, V> extends KProperty.Getter<V>, Function1<T, V> {
    }

    V get(T t);

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate(T t);

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<T, V> getGetter();
}
