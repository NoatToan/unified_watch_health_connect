package com.huami.module.homepage.cards.manager;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/module/homepage/cards/manager/a;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/huami/module/homepage/cards/manager/AdapterItem;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
final class a extends DiffUtil.ItemCallback<AdapterItem> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull AdapterItem oldItem, @NotNull AdapterItem newItem) {
        return oldItem.getCardType() == oldItem.getCardType();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull AdapterItem oldItem, @NotNull AdapterItem newItem) {
        return oldItem.getCardType() == newItem.getCardType();
    }
}
