package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class LazyWrappedType extends WrappedType {

    @NotNull
    private final StorageManager b;

    @NotNull
    private final Function0<KotlinType> c;

    @NotNull
    private final NotNullLazyValue<KotlinType> d;

    public static final class a extends Lambda implements Function0<KotlinType> {
        public final /* synthetic */ KotlinTypeRefiner a;
        public final /* synthetic */ LazyWrappedType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
            super(0);
            this.a = kotlinTypeRefiner;
            this.b = lazyWrappedType;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KotlinType invoke() {
            return this.a.refineType((KotlinType) this.b.c.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull Function0<? extends KotlinType> function0) {
        this.b = storageManager;
        this.c = function0;
        this.d = storageManager.createLazyValue(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    public KotlinType getDelegate() {
        return this.d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.d.isComputed();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public LazyWrappedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        return new LazyWrappedType(this.b, new a(kotlinTypeRefiner, this));
    }
}
