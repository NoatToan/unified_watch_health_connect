package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface KMutableProperty1<T, V> extends KProperty1<T, V>, KMutableProperty<V> {

    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }

    public interface Setter<T, V> extends KMutableProperty.Setter<V>, Function2<T, V, Unit> {
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<T, V> getSetter();

    void set(T t, V v);
}
