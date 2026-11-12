package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface KProperty2<D, E, V> extends KProperty<V>, Function2<D, E, V> {

    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    public interface Getter<D, E, V> extends KProperty.Getter<V>, Function2<D, E, V> {
    }

    V get(D d, E e);

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate(D d, E e);

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<D, E, V> getGetter();
}
