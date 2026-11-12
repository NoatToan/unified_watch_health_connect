package com.xiaomi.fitness.health.sleep.ui.adapter;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.l1c;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepCollectViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "collectSuccess", "", "update", "(Z)V", "Ll1c;", "binding", "Ll1c;", "getBinding", "()Ll1c;", "<init>", "(Ll1c;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepCollectViewHolder extends RecyclerView.d0 {

    @NotNull
    private final l1c binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepCollectViewHolder(@NotNull l1c binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @NotNull
    public final l1c getBinding() {
        return this.binding;
    }

    public final void update(boolean collectSuccess) {
        this.binding.A.setImageResource(collectSuccess ? pni.d1 : pni.e1);
    }
}
