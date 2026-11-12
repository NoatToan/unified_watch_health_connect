package kotlin.reflect;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface KProperty<V> extends KCallable<V> {

    public interface Accessor<V> {
        @NotNull
        KProperty<V> getProperty();
    }

    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isConst$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isLateinit$annotations() {
        }
    }

    public interface Getter<V> extends Accessor<V>, KFunction<V> {
    }

    @NotNull
    Getter<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
