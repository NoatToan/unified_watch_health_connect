package com.fitness.banner.export.view;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.TrackContentBean;
import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerItemV2;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\t"}, d2 = {"oneTrackOnBannerDetailItemClick", "", "bannerItem", "Lcom/fitness/banner/export/v2/BannerItemV2;", "bannerItemDetail", "Lcom/fitness/banner/export/v2/BannerItemDetail;", "buildBannerCardItemExposeTag", "Lcom/example/statistics/export/TrackContentBean;", "bannerItemV2", "banner-export_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultipleStyleBannerViewKt {
    @NotNull
    public static final TrackContentBean buildBannerCardItemExposeTag(@NotNull BannerItemV2 bannerItemV2, @NotNull BannerItemDetail bannerItemDetail) {
        String model;
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(bannerItemV2, "bannerItemV2");
        Intrinsics.checkNotNullParameter(bannerItemDetail, "bannerItemDetail");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (model = deviceInfo.getModel()) == null) {
            model = "none";
        }
        return new TrackContentBean("banner_" + bannerItemV2.getResourceId() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + bannerItemDetail.getBannerId(), false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.91.0.1.36287"), TuplesKt.to("name", "ad_expose"), TuplesKt.to("device_model", model), TuplesKt.to("asset_id", Integer.valueOf(bannerItemDetail.getBannerId())), TuplesKt.to(OneTrackExtKt.KEY_BUSINESS, Integer.valueOf(bannerItemV2.getResourceId())), TuplesKt.to(OneTrackExtKt.KEY_DELIVER_STATISTIC_TYPE, Integer.valueOf(bannerItemDetail.getDeliverStatisticType()))), 1.0f);
    }

    public static final void oneTrackOnBannerDetailItemClick(@Nullable BannerItemV2 bannerItemV2, @Nullable BannerItemDetail bannerItemDetail) {
        String model;
        WearableDeviceInfo deviceInfo;
        if (bannerItemV2 == null || bannerItemDetail == null) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (model = deviceInfo.getModel()) == null) {
            model = "none";
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.91.0.1.36288"), TuplesKt.to("name", "ad_click"), TuplesKt.to("device_model", model), TuplesKt.to("asset_id", Integer.valueOf(bannerItemDetail.getBannerId())), TuplesKt.to(OneTrackExtKt.KEY_BUSINESS, Integer.valueOf(bannerItemV2.getResourceId())), TuplesKt.to(OneTrackExtKt.KEY_DELIVER_STATISTIC_TYPE, Integer.valueOf(bannerItemDetail.getDeliverStatisticType()))));
    }
}
