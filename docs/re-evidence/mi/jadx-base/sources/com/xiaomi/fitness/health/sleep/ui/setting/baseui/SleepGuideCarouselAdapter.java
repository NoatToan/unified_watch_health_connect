package com.xiaomi.fitness.health.sleep.ui.setting.baseui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepGuideCarouselAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepGuideCarouselAdapter$CarouselItemViewHolder;", "dataList", "", "Lcom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepDetectionGuideCarouselItem;", "<init>", "(Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "CarouselItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepGuideCarouselAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepGuideCarouselAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepGuideCarouselAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,49:1\n54#2,3:50\n24#2:53\n57#2,6:54\n63#2,2:61\n57#3:60\n*S KotlinDebug\n*F\n+ 1 SleepGuideCarouselAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepGuideCarouselAdapter\n*L\n43#1:50,3\n43#1:53\n43#1:54,6\n43#1:61,2\n43#1:60\n*E\n"})
public final class SleepGuideCarouselAdapter extends RecyclerView.Adapter<CarouselItemViewHolder> {

    @NotNull
    private final List<SleepDetectionGuideCarouselItem> dataList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001f\u0010\u0010\u001a\n \b*\u0004\u0018\u00010\u000f0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepGuideCarouselAdapter$CarouselItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "description", "getDescription", "Landroid/widget/ImageView;", "carouselImage", "Landroid/widget/ImageView;", "getCarouselImage", "()Landroid/widget/ImageView;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepGuideCarouselAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class CarouselItemViewHolder extends RecyclerView.d0 {
        private final ImageView carouselImage;
        private final TextView description;

        @NotNull
        private final View itemView;
        final /* synthetic */ SleepGuideCarouselAdapter this$0;
        private final TextView titleView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CarouselItemViewHolder(@NotNull SleepGuideCarouselAdapter sleepGuideCarouselAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepGuideCarouselAdapter;
            this.itemView = itemView;
            this.titleView = (TextView) itemView.findViewById(eri.cj);
            this.description = (TextView) itemView.findViewById(eri.h3);
            this.carouselImage = (ImageView) itemView.findViewById(eri.q5);
        }

        public final ImageView getCarouselImage() {
            return this.carouselImage;
        }

        public final TextView getDescription() {
            return this.description;
        }

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }

        public final TextView getTitleView() {
            return this.titleView;
        }
    }

    public SleepGuideCarouselAdapter(@NotNull List<SleepDetectionGuideCarouselItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    @NotNull
    public final List<SleepDetectionGuideCarouselItem> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CarouselItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SleepDetectionGuideCarouselItem sleepDetectionGuideCarouselItem = this.dataList.get(position);
        String title = sleepDetectionGuideCarouselItem.getTitle();
        String description = sleepDetectionGuideCarouselItem.getDescription();
        int drawableId = sleepDetectionGuideCarouselItem.getDrawableId();
        holder.getTitleView().setText(title);
        holder.getDescription().setText(description);
        ImageView carouselImage = holder.getCarouselImage();
        Intrinsics.checkNotNullExpressionValue(carouselImage, "<get-carouselImage>(...)");
        Coil.imageLoader(carouselImage.getContext()).enqueue(new ImageRequest.Builder(carouselImage.getContext()).data(Integer.valueOf(drawableId)).target(carouselImage).build());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CarouselItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.g5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new CarouselItemViewHolder(this, viewInflate);
    }
}
