package com.xiaomi.fitness.widget.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.carousel.CarouselBannerAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0014\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/widget/carousel/CarouselBannerAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/widget/carousel/CarouselBannerViewHolder;", "<init>", "()V", "mDataList", "", "getMDataList", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "createCarouselBannerViewHolder", "onBindViewHolder", "", "holder", "position", "getItemCount", "bindData", "dataList", "", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CarouselBannerAdapter<T> extends RecyclerView.Adapter<CarouselBannerViewHolder<T>> {

    @NotNull
    private final List<T> mDataList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(CarouselBannerViewHolder holder, int i, CarouselBannerAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        holder.onClick(i, this$0.mDataList.get(i));
    }

    public final void bindData(@NotNull List<? extends T> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mDataList.clear();
        this.mDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Nullable
    public CarouselBannerViewHolder<T> createCarouselBannerViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    @NotNull
    public final List<T> getMDataList() {
        return this.mDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final CarouselBannerViewHolder<T> holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(position, this.mDataList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: as3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CarouselBannerAdapter.onBindViewHolder$lambda$0(holder, position, this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CarouselBannerViewHolder<T> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        CarouselBannerViewHolder<T> carouselBannerViewHolderCreateCarouselBannerViewHolder = createCarouselBannerViewHolder(parent, viewType);
        Intrinsics.checkNotNull(carouselBannerViewHolderCreateCarouselBannerViewHolder);
        return carouselBannerViewHolderCreateCarouselBannerViewHolder;
    }
}
