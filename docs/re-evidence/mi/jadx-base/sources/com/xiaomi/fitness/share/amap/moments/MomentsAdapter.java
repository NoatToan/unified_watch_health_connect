package com.xiaomi.fitness.share.amap.moments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.ep0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\u0010J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u001c\u0010\u0019\u001a\u00020\u00102\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/share/amap/moments/MomentsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/share/amap/moments/MomentsAdapter$Holder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "list", "", "Lcom/xiaomi/fitness/share/amap/moments/MomentData;", "mPosition", "", "addData", "", "position", "momentData", "reset", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "Holder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MomentsAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private Context context;

    @NotNull
    private final List<MomentData> list;
    private int mPosition;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/share/amap/moments/MomentsAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/share/amap/moments/MomentData;", "data", "", "bindData", "(Lcom/xiaomi/fitness/share/amap/moments/MomentData;)V", "Lep0;", "view", "Lep0;", "getView", "()Lep0;", "<init>", "(Lcom/xiaomi/fitness/share/amap/moments/MomentsAdapter;Lep0;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class Holder extends RecyclerView.d0 {
        final /* synthetic */ MomentsAdapter this$0;

        @NotNull
        private final ep0 view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull MomentsAdapter momentsAdapter, ep0 view) {
            super(view.getRoot());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = momentsAdapter;
            this.view = view;
        }

        @SuppressLint({"UseCompatLoadingForDrawables"})
        public final void bindData(@NotNull MomentData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.view.B.setText(data.getName());
            Drawable drawable = AppUtil.getApp().getResources().getDrawable(data.getImg());
            Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.view.B.setCompoundDrawables(drawable, null, null, null);
            this.view.B.setBackgroundResource(data.getBg());
            if (this.this$0.mPosition <= 2) {
                ViewGroup.LayoutParams layoutParams = this.view.A.getLayoutParams();
                layoutParams.width = (2 - this.this$0.mPosition) * ExtUtilsKt.getDp(10);
                this.view.A.setLayoutParams(layoutParams);
            }
        }

        @NotNull
        public final ep0 getView() {
            return this.view;
        }
    }

    public MomentsAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.list = new ArrayList();
    }

    public final void addData(int position, @NotNull MomentData momentData) {
        Intrinsics.checkNotNullParameter(momentData, "momentData");
        this.mPosition = position;
        this.list.add(position, momentData);
        notifyItemInserted(position);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public final void reset() {
        this.list.clear();
        notifyDataSetChanged();
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.list.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ep0 ep0VarA0 = ep0.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(ep0VarA0, "inflate(...)");
        return new Holder(this, ep0VarA0);
    }
}
