package com.xiaomi.fitness.health.threetarget.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.health.threetarget.model.DataSourceModel;
import defpackage.eri;
import defpackage.jui;
import defpackage.pni;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/adpter/ThreeTargetSourceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/threetarget/adpter/ThreeTargetSourceAdapter$ViewHolder;", "context", "Landroid/content/Context;", "itemList", "", "Lcom/xiaomi/fitness/health/threetarget/model/DataSourceModel;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "ViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThreeTargetSourceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreeTargetSourceAdapter.kt\ncom/xiaomi/fitness/health/threetarget/adpter/ThreeTargetSourceAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,55:1\n54#2,3:56\n24#2:59\n59#2,6:60\n*S KotlinDebug\n*F\n+ 1 ThreeTargetSourceAdapter.kt\ncom/xiaomi/fitness/health/threetarget/adpter/ThreeTargetSourceAdapter\n*L\n32#1:56,3\n32#1:59\n32#1:60,6\n*E\n"})
public final class ThreeTargetSourceAdapter extends RecyclerView.Adapter<ViewHolder> {

    @NotNull
    private final Context context;

    @NotNull
    private final List<DataSourceModel> itemList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/adpter/ThreeTargetSourceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "textViewName", "Landroid/widget/TextView;", "getTextViewName", "()Landroid/widget/TextView;", "textViewDesc", "getTextViewDesc", "Landroid/view/View;", "dataSourceDivider", "Landroid/view/View;", "getDataSourceDivider", "()Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/threetarget/adpter/ThreeTargetSourceAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View dataSourceDivider;

        @NotNull
        private final ImageView imageView;

        @NotNull
        private final TextView textViewDesc;

        @NotNull
        private final TextView textViewName;
        final /* synthetic */ ThreeTargetSourceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull ThreeTargetSourceAdapter threeTargetSourceAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = threeTargetSourceAdapter;
            View viewFindViewById = itemView.findViewById(eri.P2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.Q2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.textViewName = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(eri.N2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.textViewDesc = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(eri.O2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.dataSourceDivider = viewFindViewById4;
        }

        @NotNull
        public final View getDataSourceDivider() {
            return this.dataSourceDivider;
        }

        @NotNull
        public final ImageView getImageView() {
            return this.imageView;
        }

        @NotNull
        public final TextView getTextViewDesc() {
            return this.textViewDesc;
        }

        @NotNull
        public final TextView getTextViewName() {
            return this.textViewName;
        }
    }

    public ThreeTargetSourceAdapter(@NotNull Context context, @NotNull List<DataSourceModel> itemList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        this.context = context;
        this.itemList = itemList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DataSourceModel dataSourceModel = this.itemList.get(position);
        ImageView imageView = holder.getImageView();
        String sourceIconUrl = dataSourceModel.getSourceIconUrl();
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(sourceIconUrl).target(imageView);
        builderTarget.placeholder(pni.O3);
        builderTarget.error(pni.O3);
        imageLoader.enqueue(builderTarget.build());
        holder.getTextViewName().setText(dataSourceModel.getSourceName());
        if (position == this.itemList.size() - 1) {
            holder.getDataSourceDivider().setVisibility(8);
        }
        if (dataSourceModel.getCurrentDevice()) {
            holder.getTextViewDesc().setVisibility(0);
            holder.getTextViewName().setGravity(8388627);
        } else {
            holder.getTextViewDesc().setVisibility(8);
            holder.getTextViewName().setGravity(17);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(jui.M8, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(this, viewInflate);
    }
}
