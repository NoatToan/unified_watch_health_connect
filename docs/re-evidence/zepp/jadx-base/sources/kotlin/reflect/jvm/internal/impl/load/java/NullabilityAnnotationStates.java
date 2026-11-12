package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.r;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public interface NullabilityAnnotationStates<T> {

    @NotNull
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        @NotNull
        private static final NullabilityAnnotationStates b = new NullabilityAnnotationStatesImpl(r.emptyMap());

        private Companion() {
        }

        @NotNull
        public final NullabilityAnnotationStates getEMPTY() {
            return b;
        }
    }

    @Nullable
    T get(@NotNull FqName fqName);
}
