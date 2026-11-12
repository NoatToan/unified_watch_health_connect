package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    @NotNull
    private final Map<FqName, T> a;

    @NotNull
    private final LockBasedStorageManager b;

    @NotNull
    private final MemoizedFunctionToNullable<FqName, T> c;

    public static final class a extends Lambda implements Function1<FqName, T> {
        public final /* synthetic */ NullabilityAnnotationStatesImpl<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NullabilityAnnotationStatesImpl<T> nullabilityAnnotationStatesImpl) {
            super(1);
            this.a = nullabilityAnnotationStatesImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(FqName fqName) {
            return (T) FqNamesUtilKt.findValueForMostSpecificFqname(fqName, this.a.getStates());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(@NotNull Map<FqName, ? extends T> map) {
        this.a = map;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.b = lockBasedStorageManager;
        this.c = lockBasedStorageManager.createMemoizedFunctionWithNullableValues(new a(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    @Nullable
    public T get(@NotNull FqName fqName) {
        return this.c.invoke(fqName);
    }

    @NotNull
    public final Map<FqName, T> getStates() {
        return this.a;
    }
}
