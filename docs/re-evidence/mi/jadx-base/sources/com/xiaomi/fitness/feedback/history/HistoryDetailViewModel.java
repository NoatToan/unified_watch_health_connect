package com.xiaomi.fitness.feedback.history;

import androidx.databinding.ObservableArrayList;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.feedback.history.DialogueInfo;
import com.xiaomi.fitness.feedback.history.HistoryDetailViewModel;
import defpackage.bv1;
import defpackage.hui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/feedback/history/HistoryDetailViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/feedback/history/HistoryDetailModel;", "<init>", "()V", "adapter", "Lcom/xiaomi/fitness/feedback/history/ReplyAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/feedback/history/ReplyAdapter;", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Lcom/xiaomi/fitness/feedback/history/DialogueInfo;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "items", "Landroidx/databinding/ObservableArrayList;", "getItems", "()Landroidx/databinding/ObservableArrayList;", "showContent", "", "detail", "Lcom/xiaomi/fitness/feedback/history/HistoryDetail;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHistoryDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryDetailViewModel.kt\ncom/xiaomi/fitness/feedback/history/HistoryDetailViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n*L\n1#1,33:1\n27#2,5:34\n*S KotlinDebug\n*F\n+ 1 HistoryDetailViewModel.kt\ncom/xiaomi/fitness/feedback/history/HistoryDetailViewModel\n*L\n21#1:34,5\n*E\n"})
public final class HistoryDetailViewModel extends BaseViewModel<HistoryDetailModel> {

    @NotNull
    private final ReplyAdapter adapter = new ReplyAdapter();

    @NotNull
    private final ItemBinding<DialogueInfo> itemBinding;

    @NotNull
    private final ObservableArrayList<DialogueInfo> items;

    public HistoryDetailViewModel() {
        final Function3 function3 = new Function3() { // from class: m8c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HistoryDetailViewModel.itemBinding$lambda$0((ItemBinding) obj, ((Integer) obj2).intValue(), (DialogueInfo) obj3);
            }
        };
        this.itemBinding = ItemBinding.INSTANCE.of(new OnItemBind<DialogueInfo>() { // from class: com.xiaomi.fitness.feedback.history.HistoryDetailViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<DialogueInfo> itemBinding, int position, DialogueInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.items = new ObservableArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemBinding$lambda$0(ItemBinding itemBinding, int i, DialogueInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(bv1.c, hui.q);
        return Unit.INSTANCE;
    }

    @NotNull
    public final ReplyAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final ItemBinding<DialogueInfo> getItemBinding() {
        return this.itemBinding;
    }

    @NotNull
    public final ObservableArrayList<DialogueInfo> getItems() {
        return this.items;
    }

    public final void showContent(@Nullable HistoryDetail detail) {
        if (detail == null) {
            return;
        }
        this.items.addAll(getMModel().getDialogueInfoes(detail));
    }
}
