package com.xiaomi.fitness.watch.face.market;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.FaceInfoBleFragment;
import com.xiaomi.fitness.watch.face.FaceInfoHMFragment;
import com.xiaomi.fitness.watch.face.FaceTabListFragment;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bJ\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ0\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0014\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketPageManager;", "", "<init>", "()V", "toFaceDetailPage", "", "context", "Landroid/content/Context;", "data", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "contentSource", "", "exposeSource", "positionId", "", "source", "toFaceResourcePoolPage", "key", "trackClick", "faceData", "PAGE_SOURCE_CATEGORY", "PAGE_SOURCE_DETAIL_RECOMMEND", "PAGE_SOURCE_FACE_ME", "PAGE_SOURCE_PAY_NOT_INSTALL", "PAGE_SOURCE_ORDER_LIST", "PAGE_SOURCE_FEED", "PAGE_SOURCE_DEVICE_TAB", "PAGE_SOURCE_POP_UP", "PAGE_SOURCE_POP_UP_FACE", "PAGE_SOURCE_BANNER", "PAGE_SOURCE_BANNER_FACE", "PAGE_SOURCE_FACE_TAB_LIST", "PAGE_SOURCE_PUSH", "PAGE_SOURCE_SEARCH", "PAGE_SOURCE_DETAIL", "PAGE_SOURCE_PAY_RESULT", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceFaceMarketPageManager {

    @NotNull
    public static final DeviceFaceMarketPageManager INSTANCE = new DeviceFaceMarketPageManager();
    public static final int PAGE_SOURCE_BANNER = 17;
    public static final int PAGE_SOURCE_BANNER_FACE = 18;
    public static final int PAGE_SOURCE_CATEGORY = 5;
    public static final int PAGE_SOURCE_DETAIL = 22;
    public static final int PAGE_SOURCE_DETAIL_RECOMMEND = 9;
    public static final int PAGE_SOURCE_DEVICE_TAB = 14;
    public static final int PAGE_SOURCE_FACE_ME = 10;
    public static final int PAGE_SOURCE_FACE_TAB_LIST = 19;
    public static final int PAGE_SOURCE_FEED = 13;
    public static final int PAGE_SOURCE_ORDER_LIST = 12;
    public static final int PAGE_SOURCE_PAY_NOT_INSTALL = 11;
    public static final int PAGE_SOURCE_PAY_RESULT = 23;
    public static final int PAGE_SOURCE_POP_UP = 15;
    public static final int PAGE_SOURCE_POP_UP_FACE = 16;
    public static final int PAGE_SOURCE_PUSH = 20;
    public static final int PAGE_SOURCE_SEARCH = 21;

    private DeviceFaceMarketPageManager() {
    }

    private final void trackClick(FaceData faceData, String contentSource, String exposeSource, int positionId, String source) {
        Map<String, Object> mapBuildTrackMap = FaceOneTrackUtil.INSTANCE.buildTrackMap(faceData, contentSource, exposeSource, Integer.valueOf(positionId), source);
        mapBuildTrackMap.put("name", "watchface_single_click");
        mapBuildTrackMap.put("tip", "56.82.0.1.41527");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.toMap(mapBuildTrackMap));
    }

    public final void toFaceDetailPage(@NotNull Context context, @NotNull FaceData data, @NotNull String contentSource, @NotNull String exposeSource, int positionId, @NotNull String source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        Intrinsics.checkNotNullParameter(exposeSource, "exposeSource");
        Intrinsics.checkNotNullParameter(source, "source");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        trackClick(data, contentSource, exposeSource, positionId, source);
        WatchFace faceBean = FaceExtKt.getFaceBean(data);
        Bundle bundle = new Bundle();
        bundle.putString(FaceInfoBase.FACE_ID, faceBean.getId());
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            FaceExtKt.gotoPage(context, FaceInfoHMFragment.class, bundle);
            return;
        }
        boolean z = (DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 4194304) == 4194304;
        FaceData.BleExt ble_ext = data.getBle_ext();
        if (ble_ext != null && ble_ext.canEdit() && !z) {
            FaceExtKt.gotoPage(context, FaceInfoBleFragment.class, bundle);
            return;
        }
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(currentActivity, YRNConstants.APP_NAME, "dial/DialDetail", MapsKt__MapsKt.mapOf(TuplesKt.to(FaceInfoBase.FACE_ID, data.getId()), TuplesKt.to("fromMe", Boolean.FALSE), TuplesKt.to("contentSource", contentSource), TuplesKt.to("exposeSource", exposeSource), TuplesKt.to("position", Integer.valueOf(positionId)), TuplesKt.to("source", source)));
    }

    public final void toFaceResourcePoolPage(@NotNull Context context, @NotNull String key, int source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle = new Bundle();
        bundle.putInt(FaceTabListFragment.TAB_TYPE, 4);
        bundle.putInt(FaceTabListFragment.TAB_SOURCE, source + 5);
        bundle.putString(FaceTabListFragment.TAB_ID, key);
        FaceExtKt.gotoPage(context, FaceTabListFragment.class, bundle);
    }
}
