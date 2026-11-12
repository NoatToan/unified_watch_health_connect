package com.xiaomi.hm.health.play.card.intelligence;

import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.databinding.LayoutToolAlarmItemBinding;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/AlarmHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/databinding/LayoutToolAlarmItemBinding;", "a", "Lcom/xiaomi/hm/health/databinding/LayoutToolAlarmItemBinding;", "getBinding", "()Lcom/xiaomi/hm/health/databinding/LayoutToolAlarmItemBinding;", "binding", "<init>", "(Lcom/xiaomi/hm/health/databinding/LayoutToolAlarmItemBinding;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LayoutToolAlarmItemBinding binding;

    public AlarmHolder(@NotNull LayoutToolAlarmItemBinding layoutToolAlarmItemBinding) {
        super(layoutToolAlarmItemBinding.getRoot());
        this.binding = layoutToolAlarmItemBinding;
    }

    @NotNull
    public final LayoutToolAlarmItemBinding getBinding() {
        return this.binding;
    }
}
