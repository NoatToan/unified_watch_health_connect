package com.xiaomi.fitness.homepage.banner;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.view.MultipleStyleBannerView;
import defpackage.eri;
import defpackage.jui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/homepage/banner/OperationalBannerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/fitness/banner/export/v2/BannerItemV2;", "bannerItemList", "", "bindData", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "mBannerItemList", "Ljava/util/List;", "<init>", "()V", "OperationalBannerViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OperationalBannerAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private final List<BannerItemV2> mBannerItemList = new ArrayList();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/homepage/banner/OperationalBannerAdapter$OperationalBannerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/fitness/banner/export/v2/BannerItemV2;", "item", "", "bindData", "(Lcom/fitness/banner/export/v2/BannerItemV2;)V", "Lcom/fitness/banner/export/view/MultipleStyleBannerView;", "bannerView", "Lcom/fitness/banner/export/view/MultipleStyleBannerView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/homepage/banner/OperationalBannerAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class OperationalBannerViewHolder extends RecyclerView.d0 {

        @NotNull
        private final MultipleStyleBannerView bannerView;
        final /* synthetic */ OperationalBannerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OperationalBannerViewHolder(@NotNull OperationalBannerAdapter operationalBannerAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = operationalBannerAdapter;
            View viewFindViewById = itemView.findViewById(eri.c0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.bannerView = (MultipleStyleBannerView) viewFindViewById;
        }

        public final void bindData(@NotNull BannerItemV2 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.bannerView.updateBanner(item);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void bindData(@NotNull List<BannerItemV2> bannerItemList) {
        Intrinsics.checkNotNullParameter(bannerItemList, "bannerItemList");
        this.mBannerItemList.clear();
        this.mBannerItemList.addAll(bannerItemList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mBannerItemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BannerItemV2 bannerItemV2 = this.mBannerItemList.get(position);
        if (holder instanceof OperationalBannerViewHolder) {
            ((OperationalBannerViewHolder) holder).bindData(bannerItemV2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.E8, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new OperationalBannerViewHolder(this, viewInflate);
    }
}
