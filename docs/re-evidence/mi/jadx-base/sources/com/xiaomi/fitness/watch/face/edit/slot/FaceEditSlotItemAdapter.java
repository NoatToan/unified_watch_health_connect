package com.xiaomi.fitness.watch.face.edit.slot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.watch.face.edit.entity.SlotEditItem;
import com.xiaomi.fitness.watch.face.edit.slot.FaceEditSlotItemAdapter;
import defpackage.b29;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u001c\u0010\u0016\u001a\u00020\u00072\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0006H\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotItemAdapter$FaceEditSlotItemHolder;", "onFaceEditSlotClickListener", "Lcom/xiaomi/fitness/watch/face/edit/slot/OnFaceEditSlotClickListener;", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "slotList", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/SlotEditItem;", "setData", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "FaceEditSlotItemHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditSlotItemAdapter extends RecyclerView.Adapter<FaceEditSlotItemHolder> {

    @NotNull
    private final Function1<Integer, Unit> onFaceEditSlotClickListener;

    @NotNull
    private final List<SlotEditItem> slotList;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotItemAdapter$FaceEditSlotItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/watch/face/edit/entity/SlotEditItem;", "slot", "", "bindData", "(Lcom/xiaomi/fitness/watch/face/edit/entity/SlotEditItem;)V", "onClick", "()V", "Lb29;", "binding", "Lb29;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotItemAdapter;Lb29;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceEditSlotItemHolder extends RecyclerView.d0 {

        @NotNull
        private final b29 binding;
        final /* synthetic */ FaceEditSlotItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditSlotItemHolder(@NotNull FaceEditSlotItemAdapter faceEditSlotItemAdapter, b29 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditSlotItemAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(FaceEditSlotItemAdapter this$0, FaceEditSlotItemHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.onFaceEditSlotClickListener.invoke2(Integer.valueOf(this$1.getBindingAdapterPosition()));
        }

        public final void bindData(@NotNull SlotEditItem slot) {
            Intrinsics.checkNotNullParameter(slot, "slot");
            this.binding.B.setText(slot.getListWidget().get(slot.getSelectWidgetIndex()).getWidgetName());
            this.binding.A.setScaleX(AppUtil.isRTLDirection() ? -1.0f : 1.0f);
        }

        public final void onClick() {
            View root = this.binding.getRoot();
            final FaceEditSlotItemAdapter faceEditSlotItemAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: kv8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditSlotItemAdapter.FaceEditSlotItemHolder.onClick$lambda$0(faceEditSlotItemAdapter, this, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceEditSlotItemAdapter(@NotNull Function1<? super Integer, Unit> onFaceEditSlotClickListener) {
        Intrinsics.checkNotNullParameter(onFaceEditSlotClickListener, "onFaceEditSlotClickListener");
        this.onFaceEditSlotClickListener = onFaceEditSlotClickListener;
        this.slotList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.slotList.size();
    }

    public final void setData(@NotNull List<SlotEditItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.slotList.clear();
        this.slotList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceEditSlotItemHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.slotList.get(position));
        holder.onClick();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceEditSlotItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        b29 b29VarA0 = b29.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(b29VarA0, "inflate(...)");
        return new FaceEditSlotItemHolder(this, b29VarA0);
    }
}
