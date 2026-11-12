package kotlin.properties;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class Delegates {

    @NotNull
    public static final Delegates INSTANCE = new Delegates();

    private Delegates() {
    }

    @NotNull
    public final <T> ReadWriteProperty<Object, T> notNull() {
        return new a();
    }

    @NotNull
    public final <T> ReadWriteProperty<Object, T> observable(T t, @NotNull Function3<? super KProperty<?>, ? super T, ? super T, Unit> function3) {
        return new ObservableProperty<T>(t, function3) { // from class: kotlin.properties.Delegates.observable.1
            public final /* synthetic */ T b;
            public final /* synthetic */ Function3<KProperty<?>, T, T, Unit> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(t);
                this.b = t;
                this.c = function3;
            }

            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> kProperty, T t2, T t3) {
                this.c.invoke(kProperty, t2, t3);
            }
        };
    }

    @NotNull
    public final <T> ReadWriteProperty<Object, T> vetoable(T t, @NotNull Function3<? super KProperty<?>, ? super T, ? super T, Boolean> function3) {
        return new ObservableProperty<T>(t, function3) { // from class: kotlin.properties.Delegates.vetoable.1
            public final /* synthetic */ T b;
            public final /* synthetic */ Function3<KProperty<?>, T, T, Boolean> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(t);
                this.b = t;
                this.c = function3;
            }

            @Override // kotlin.properties.ObservableProperty
            public boolean beforeChange(@NotNull KProperty<?> kProperty, T t2, T t3) {
                return this.c.invoke(kProperty, t2, t3).booleanValue();
            }
        };
    }
}
