package com.xiaomi.fitness.watch.face.edit.font;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.edit.font.FaceEditFontColorItemAdapter;
import defpackage.n19;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u001c\u0010\u0014\u001a\u00020\u00072\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontColorItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontColorItemAdapter$FaceEditFontStyleColorHolder;", "onFaceEditFontColorSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/font/OnFaceEditFontColorSelectListener;", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "fontColorList", "", "", "currentSelect", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "FaceEditFontStyleColorHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditFontColorItemAdapter extends RecyclerView.Adapter<FaceEditFontStyleColorHolder> {
    private int currentSelect;

    @NotNull
    private final List<String> fontColorList;

    @NotNull
    private final Function1<Integer, Unit> onFaceEditFontColorSelectListener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontColorItemAdapter$FaceEditFontStyleColorHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "path", "", "bindData", "(Ljava/lang/String;)V", "onSelect", "()V", "Ln19;", "binding", "Ln19;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontColorItemAdapter;Ln19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceEditFontStyleColorHolder extends RecyclerView.d0 {

        @NotNull
        private final n19 binding;
        final /* synthetic */ FaceEditFontColorItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditFontStyleColorHolder(@NotNull FaceEditFontColorItemAdapter faceEditFontColorItemAdapter, n19 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditFontColorItemAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSelect$lambda$0(FaceEditFontColorItemAdapter this$0, FaceEditFontStyleColorHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.notifyItemChanged(this$0.currentSelect);
            this$0.currentSelect = this$1.getBindingAdapterPosition();
            this$0.notifyItemChanged(this$0.currentSelect);
            this$0.onFaceEditFontColorSelectListener.invoke2(Integer.valueOf(this$1.getBindingAdapterPosition()));
        }

        public final void bindData(@NotNull String path) {
            Intrinsics.checkNotNullParameter(path, "path");
        }

        public final void onSelect() {
            View root = this.binding.getRoot();
            final FaceEditFontColorItemAdapter faceEditFontColorItemAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: yr8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditFontColorItemAdapter.FaceEditFontStyleColorHolder.onSelect$lambda$0(faceEditFontColorItemAdapter, this, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceEditFontColorItemAdapter(@NotNull Function1<? super Integer, Unit> onFaceEditFontColorSelectListener) {
        Intrinsics.checkNotNullParameter(onFaceEditFontColorSelectListener, "onFaceEditFontColorSelectListener");
        this.onFaceEditFontColorSelectListener = onFaceEditFontColorSelectListener;
        this.fontColorList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.fontColorList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceEditFontStyleColorHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.fontColorList.get(position));
        holder.onSelect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceEditFontStyleColorHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        n19 n19VarA0 = n19.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(n19VarA0, "inflate(...)");
        return new FaceEditFontStyleColorHolder(this, n19VarA0);
    }
}
