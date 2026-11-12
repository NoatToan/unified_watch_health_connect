package com.xiaomi.fitness.watch.face.debug.designer;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.t29;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\u0013\u001a\u00020\t2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerLogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerLogAdapter$FaceDesignerLogViewHolder;", "<init>", "()V", "mList", "", "", "append", "", "text", "success", "amendTimeStamp", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "FaceDesignerLogViewHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceDesignerLogAdapter extends RecyclerView.Adapter<FaceDesignerLogViewHolder> {

    @NotNull
    private final List<String> mList = new ArrayList();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerLogAdapter$FaceDesignerLogViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "text", "", "onBind", "(Ljava/lang/String;)V", "Lt29;", "binding", "Lt29;", "<init>", "(Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerLogAdapter;Lt29;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceDesignerLogViewHolder extends RecyclerView.d0 {

        @NotNull
        private final t29 binding;
        final /* synthetic */ FaceDesignerLogAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceDesignerLogViewHolder(@NotNull FaceDesignerLogAdapter faceDesignerLogAdapter, t29 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceDesignerLogAdapter;
            this.binding = binding;
        }

        public final void onBind(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.binding.A.setText(text);
        }
    }

    private final String amendTimeStamp(String text) {
        return TimeDateUtil.getDateHHmmssFormat(System.currentTimeMillis() / ((long) 1000)) + " " + text;
    }

    public final void append(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.mList.add(amendTimeStamp(text));
        notifyItemInserted(this.mList.size() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    public final void success(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.mList.clear();
        this.mList.add(amendTimeStamp(text));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceDesignerLogViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onBind(this.mList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceDesignerLogViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        t29 t29VarA0 = t29.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(t29VarA0, "inflate(...)");
        return new FaceDesignerLogViewHolder(this, t29VarA0);
    }
}
