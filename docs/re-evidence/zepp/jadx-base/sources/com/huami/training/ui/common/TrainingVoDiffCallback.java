package com.huami.training.ui.common;

import androidx.recyclerview.widget.DiffUtil;
import com.huami.training.vo.TrainingVo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/training/ui/common/TrainingVoDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/huami/training/vo/TrainingVo;", "oldItem", "newItem", "", "areItemsTheSame", "areContentsTheSame", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingVoDiffCallback extends DiffUtil.ItemCallback<TrainingVo> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull TrainingVo oldItem, @NotNull TrainingVo newItem) {
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull TrainingVo oldItem, @NotNull TrainingVo newItem) {
        return oldItem.getId() == newItem.getId();
    }
}
