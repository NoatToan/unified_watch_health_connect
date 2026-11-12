package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface KMutableProperty2<D, E, V> extends KProperty2<D, E, V>, KMutableProperty<V> {

    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }

    public interface Setter<D, E, V> extends KMutableProperty.Setter<V>, Function3<D, E, V, Unit> {
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<D, E, V> getSetter();

    void set(D d, E e, V v);
}
