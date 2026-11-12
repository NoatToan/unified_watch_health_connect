package com.xiaomi.fitness.trail.adapter;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.lpp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Llpp;", "binding", "Llpp;", "getBinding", "()Llpp;", "<init>", "(Llpp;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class Holder extends RecyclerView.d0 {

    @NotNull
    private final lpp binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Holder(@NotNull lpp binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @NotNull
    public final lpp getBinding() {
        return this.binding;
    }
}
