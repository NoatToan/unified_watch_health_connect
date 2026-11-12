package com.xiaomi.fitness.common.viewbinding;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.records.CervicalMucusRecord;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u000f\u0012\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0097\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/common/viewbinding/EagerViewBindingProperty;", "", "R", "Lbsq;", "T", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lbsq;", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "viewBinding", "Lbsq;", "<init>", "(Lbsq;)V", "common_release"}, k = 1, mv = {2, 0, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class EagerViewBindingProperty<R, T extends bsq> implements ViewBindingProperty<R, T> {

    @NotNull
    private final T viewBinding;

    public EagerViewBindingProperty(@NotNull T viewBinding) {
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        this.viewBinding = viewBinding;
    }

    @Override // com.xiaomi.fitness.common.viewbinding.ViewBindingProperty
    public void clear() {
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @NotNull
    public T getValue(@NotNull R thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.viewBinding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }
}
