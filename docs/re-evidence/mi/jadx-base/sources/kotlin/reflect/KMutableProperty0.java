package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface KMutableProperty0<V> extends KProperty0<V>, KMutableProperty<V> {

    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }

    public interface Setter<V> extends KMutableProperty.Setter<V>, Function1<V, Unit> {
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<V> getSetter();

    void set(V v);
}
