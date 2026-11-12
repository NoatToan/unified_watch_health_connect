package com.xiaomi.fitness.watch.face.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.banner.export.BannerHelper;
import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.v2.SourceItem;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketListItemWrapper;
import com.xiaomi.fitness.widget.carousel.CarouselBanner;
import defpackage.j9e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceFeedBannerItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "data", "", "bindData", "(Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lj9e;", "binding", "Lj9e;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lj9e;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceFeedBannerItemViewHolder extends RecyclerView.d0 {

    @NotNull
    private final j9e binding;

    @Nullable
    private final WearableDeviceModel deviceModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceFeedBannerItemViewHolder(@Nullable WearableDeviceModel wearableDeviceModel, @NotNull j9e binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.deviceModel = wearableDeviceModel;
        this.binding = binding;
    }

    public final void bindData(@NotNull DeviceFaceMarketListItemWrapper data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List<BannerItemV2> bannerList = data.getBannerList();
        this.binding.A.setCarouselBannerAdapter(new FaceFeedBannerItemCarouselBannerAdapter());
        List<BannerItemV2> list = bannerList;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BannerItemV2> it = bannerList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (!arrayList.isEmpty()) {
            try {
                CarouselBanner carouselBanner = this.binding.A;
                Intrinsics.checkNotNull(carouselBanner, "null cannot be cast to non-null type com.xiaomi.fitness.widget.carousel.CarouselBanner<com.fitness.banner.export.v2.BannerItemV2>");
                ViewExtKt.visible(carouselBanner);
                carouselBanner.setData(arrayList);
                carouselBanner.setOnBannerSelectListener(new Function2<Integer, BannerItemV2, Unit>() { // from class: com.xiaomi.fitness.watch.face.adapter.FaceFeedBannerItemViewHolder.bindData.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, BannerItemV2 bannerItemV2) {
                        invoke(num.intValue(), bannerItemV2);
                        return Unit.INSTANCE;
                    }

                    public void invoke(int index, BannerItemV2 item) {
                        BannerItemDetail bannerItemDetail;
                        List<SourceItem> sourceList;
                        SourceItem sourceItem;
                        String model;
                        Intrinsics.checkNotNullParameter(item, "item");
                        List<BannerItemDetail> bannerInfoList = item.getBannerInfoList();
                        if (bannerInfoList == null || (bannerItemDetail = (BannerItemDetail) CollectionsKt___CollectionsKt.getOrNull(bannerInfoList, 0)) == null || (sourceList = bannerItemDetail.getSourceList()) == null || (sourceItem = (SourceItem) CollectionsKt___CollectionsKt.getOrNull(sourceList, 0)) == null) {
                            return;
                        }
                        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("expose_v3", "56.82.1.1.35069");
                        Object[] objArr = new Object[12];
                        objArr[0] = "name";
                        objArr[1] = "watchface_market_banner";
                        objArr[2] = "position_id";
                        objArr[3] = Integer.valueOf(index);
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
                        WearableDeviceModel wearableDeviceModel = FaceFeedBannerItemViewHolder.this.deviceModel;
                        if (wearableDeviceModel != null && (model = DeviceModelExtKt.getModel(wearableDeviceModel)) != null) {
                            str = model;
                        }
                        objArr[11] = str;
                        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
                    }
                });
            } catch (Exception e) {
                Logger.i("FaceFeedBannerItemViewHolder", "bindData: " + e.getMessage());
            }
        }
    }
}
