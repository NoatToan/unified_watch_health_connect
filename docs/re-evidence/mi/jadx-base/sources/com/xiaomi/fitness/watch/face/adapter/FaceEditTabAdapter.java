package com.xiaomi.fitness.watch.face.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.watch.face.adapter.FaceEditTabAdapter;
import com.xiaomi.fitness.watch.face.viewholder.FaceEditTabViewHolder;
import defpackage.j29;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u000e\u001a\u00020\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\n¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceEditTabAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/viewholder/FaceEditTabViewHolder;", "<init>", "()V", "selectPosition", "", "typeList", "", "onFaceEditTypeChooseListener", "Lcom/xiaomi/fitness/watch/face/widget/OnFaceEditTypeChooseListener;", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "setOnTypeSelectListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lkotlin/jvm/functions/Function1;)V", "setTypeList", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditTabAdapter extends RecyclerView.Adapter<FaceEditTabViewHolder> {

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditTypeChooseListener;
    private int selectPosition;

    @NotNull
    private final List<Integer> typeList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(FaceEditTabAdapter this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyItemChanged(this$0.selectPosition);
        this$0.selectPosition = i;
        this$0.notifyItemChanged(i);
        Function1<? super Integer, Unit> function1 = this$0.onFaceEditTypeChooseListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.typeList.size();
    }

    public final void setOnTypeSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFaceEditTypeChooseListener = listener;
    }

    public final void setTypeList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.typeList.clear();
        this.typeList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceEditTabViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.typeList.get(position).intValue(), position == this.selectPosition);
        holder.onSelect(new Function1() { // from class: nv8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditTabAdapter.onBindViewHolder$lambda$0(this.f28471a, ((Integer) obj).intValue());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceEditTabViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        j29 j29VarA0 = j29.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(j29VarA0, "inflate(...)");
        return new FaceEditTabViewHolder(j29VarA0);
    }
}
