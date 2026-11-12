package com.fitness.banner.export.view;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.TrackContentBean;
import com.fitness.banner.export.v2.BannerItemDetail;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¨\u0006\u0007"}, d2 = {"buildAnnouncementBannerExposeTag", "Lcom/example/statistics/export/TrackContentBean;", "bannerItem", "Lcom/fitness/banner/export/v2/BannerItemDetail;", "oneTrackOnAnnouncementClick", "", "bannerItemDetail", "banner-export_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AnnouncementBannerViewKt {
    @NotNull
    public static final TrackContentBean buildAnnouncementBannerExposeTag(@Nullable BannerItemDetail bannerItemDetail) {
        String model;
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (model = deviceInfo.getModel()) == null) {
            model = "none";
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("tip", "56.91.0.1.36287");
        pairArr[1] = TuplesKt.to("name", "ad_expose");
        pairArr[2] = TuplesKt.to("device_model", model);
        pairArr[3] = TuplesKt.to("asset_id", bannerItemDetail != null ? Integer.valueOf(bannerItemDetail.getBannerId()) : null);
        pairArr[4] = TuplesKt.to(OneTrackExtKt.KEY_BUSINESS, 1);
        pairArr[5] = TuplesKt.to(OneTrackExtKt.KEY_DELIVER_STATISTIC_TYPE, bannerItemDetail != null ? Integer.valueOf(bannerItemDetail.getDeliverStatisticType()) : null);
        return new TrackContentBean("banner_announcement", false, "expose_v3", MapsKt__MapsKt.mapOf(pairArr), 1.0f);
    }

    public static final void oneTrackOnAnnouncementClick(@Nullable BannerItemDetail bannerItemDetail) {
        String model;
        WearableDeviceInfo deviceInfo;
        if (bannerItemDetail == null) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (model = deviceInfo.getModel()) == null) {
            model = "none";
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.91.0.1.36288"), TuplesKt.to("name", "ad_click"), TuplesKt.to("device_model", model), TuplesKt.to("asset_id", Integer.valueOf(bannerItemDetail.getBannerId())), TuplesKt.to(OneTrackExtKt.KEY_BUSINESS, 1), TuplesKt.to(OneTrackExtKt.KEY_DELIVER_STATISTIC_TYPE, Integer.valueOf(bannerItemDetail.getDeliverStatisticType()))));
    }
}
