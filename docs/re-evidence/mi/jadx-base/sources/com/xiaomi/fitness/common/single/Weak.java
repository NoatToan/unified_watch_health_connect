package com.xiaomi.fitness.common.single;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.single.Weak;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J&\u0010\n\u001a\u0004\u0018\u00018\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0086\u0002¢\u0006\u0002\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0012R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/single/Weak;", "T", "", "initializer", "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "()V", "weakReference", "Ljava/lang/ref/WeakReference;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Weak<T> {

    @NotNull
    private WeakReference<T> weakReference;

    public Weak(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.weakReference = new WeakReference<>(initializer.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0() {
        return null;
    }

    @Nullable
    public final T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Logger.d("Weak Delegate", "-----------getValue");
        return this.weakReference.get();
    }

    public final void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Logger.d("Weak Delegate", "-----------setValue");
        this.weakReference = new WeakReference<>(value);
    }

    public Weak() {
        this(new Function0() { // from class: m6r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Weak._init_$lambda$0();
            }
        });
    }
}
