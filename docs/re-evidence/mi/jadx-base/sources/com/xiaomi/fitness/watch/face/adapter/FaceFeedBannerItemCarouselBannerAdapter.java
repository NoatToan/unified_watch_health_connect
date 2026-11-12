package com.xiaomi.fitness.watch.face.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.banner.export.BannerHelper;
import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.v2.SourceItem;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.widget.carousel.CarouselBannerAdapter;
import com.xiaomi.fitness.widget.carousel.CarouselBannerViewHolder;
import defpackage.z09;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceFeedBannerItemCarouselBannerAdapter;", "Lcom/xiaomi/fitness/widget/carousel/CarouselBannerAdapter;", "Lcom/fitness/banner/export/v2/BannerItemV2;", "<init>", "()V", "createCarouselBannerViewHolder", "Lcom/xiaomi/fitness/widget/carousel/CarouselBannerViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "FaceFeedCarouselBannerViewHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceFeedBannerItemCarouselBannerAdapter extends CarouselBannerAdapter<BannerItemV2> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceFeedBannerItemCarouselBannerAdapter$FaceFeedCarouselBannerViewHolder;", "Lcom/xiaomi/fitness/widget/carousel/CarouselBannerViewHolder;", "Lcom/fitness/banner/export/v2/BannerItemV2;", "", "position", "data", "", "bindData", "(ILcom/fitness/banner/export/v2/BannerItemV2;)V", "onClick", "Lz09;", "binding", "Lz09;", "<init>", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceFeedBannerItemCarouselBannerAdapter;Lz09;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceFeedCarouselBannerViewHolder extends CarouselBannerViewHolder<BannerItemV2> {

        @NotNull
        private final z09 binding;
        final /* synthetic */ FaceFeedBannerItemCarouselBannerAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        public FaceFeedCarouselBannerViewHolder(@NotNull FaceFeedBannerItemCarouselBannerAdapter faceFeedBannerItemCarouselBannerAdapter, z09 binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceFeedBannerItemCarouselBannerAdapter;
            View root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.binding = binding;
        }

        @Override // com.xiaomi.fitness.widget.carousel.CarouselBannerViewHolder
        public void bindData(int position, @NotNull BannerItemV2 data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.binding.A.updateBanner(data);
        }

        @Override // com.xiaomi.fitness.widget.carousel.CarouselBannerViewHolder
        public void onClick(int position, @NotNull BannerItemV2 data) {
            BannerItemDetail bannerItemDetail;
            List<SourceItem> sourceList;
            SourceItem sourceItem;
            String model;
            Intrinsics.checkNotNullParameter(data, "data");
            List<BannerItemDetail> bannerInfoList = data.getBannerInfoList();
            if (bannerInfoList == null || (bannerItemDetail = (BannerItemDetail) CollectionsKt___CollectionsKt.getOrNull(bannerInfoList, 0)) == null || (sourceList = bannerItemDetail.getSourceList()) == null || (sourceItem = (SourceItem) CollectionsKt___CollectionsKt.getOrNull(sourceList, 0)) == null) {
                return;
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.82.1.1.35070");
            Object[] objArr = new Object[12];
            objArr[0] = "name";
            objArr[1] = "watchface_market_banner";
            objArr[2] = "position_id";
            objArr[3] = Integer.valueOf(position);
            objArr[4] = "url";
            String strFindFirstNotNullImgUrl = BannerHelper.INSTANCE.findFirstNotNullImgUrl(sourceItem, false);
            String str = "";
            if (strFindFirstNotNullImgUrl == null) {
                strFindFirstNotNullImgUrl = "";
            }
            objArr[5] = strFindFirstNotNullImgUrl;
            objArr[6] = "picture_name";
            objArr[7] = bannerItemDetail.getMainTitle();
            objArr[8] = "picture_id";
            objArr[9] = Integer.valueOf(bannerItemDetail.getBannerId());
            objArr[10] = "device_model";
            if (wearableDeviceModel != null && (model = DeviceModelExtKt.getModel(wearableDeviceModel)) != null) {
                str = model;
            }
            objArr[11] = str;
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        }
    }

    @Override // com.xiaomi.fitness.widget.carousel.CarouselBannerAdapter
    @NotNull
    public CarouselBannerViewHolder<BannerItemV2> createCarouselBannerViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        z09 z09VarA0 = z09.A0(LayoutInflater.from(parent.getContext()));
        Intrinsics.checkNotNullExpressionValue(z09VarA0, "inflate(...)");
        z09VarA0.getRoot().setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        return new FaceFeedCarouselBannerViewHolder(this, z09VarA0);
    }
}
