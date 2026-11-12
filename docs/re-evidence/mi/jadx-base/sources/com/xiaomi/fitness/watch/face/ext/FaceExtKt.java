package com.xiaomi.fitness.watch.face.ext;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import defpackage.eu6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\b\u001a\"\u0010\t\u001a\u00020\n*\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0011\u001a \u0010\u0012\u001a\u00020\n*\u0004\u0018\u00010\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014¨\u0006\u0016"}, d2 = {"hasFun", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;", "getFaceBean", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "item", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "isSuccess", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "gotoPage", "", "Landroid/content/Context;", "targetClazz", "Ljava/lang/Class;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "isSupportZhouHaiPhotoFace", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getLatestFirmwareVersion", "firmwareVersion", "Lkotlin/Function1;", "", "watch-face_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FaceExtKt {
    @NotNull
    public static final WatchFace getFaceBean(@NotNull FaceData item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FaceManager faceManager = FaceManager.INSTANCE;
        WatchFace face = faceManager.getFace(item.getId());
        if (face == null) {
            String id = item.getId();
            String display_name = item.getDisplay_name();
            Long version_code = item.getVersion_code();
            face = new WatchFace(id, display_name, false, false, false, false, null, version_code != null ? version_code.longValue() : 0L, null, 0, null, null, null, false, null, 0, 0, null, false, null, null, 0, 4194160, null);
        }
        face.setPublish_name(item.getPublish_name());
        face.icon = item.getIcon();
        Long version_code2 = item.getVersion_code();
        face.setVersionCode(version_code2 != null ? version_code2.longValue() : 0L);
        FaceData.BleExt ble_ext = item.getBle_ext();
        face.setHasSpiritColor(ble_ext != null ? ble_ext.hasSpirit() : false);
        face.setTabId(item.getTabId());
        face.setTabName(item.getTabName());
        FaceData.BleExt ble_ext2 = item.getBle_ext();
        if (ble_ext2 != null) {
            face.setAlbum_picture_type(ble_ext2.getAlbum_picture_type());
            if (faceManager.isInstalled(item.getId())) {
                WatchFace face2 = faceManager.getFace(item.getId());
                Intrinsics.checkNotNull(face2);
                face.setStyle(face2.getStyle());
            }
            if (face.getStyle() == null || Intrinsics.areEqual(face.getStyle(), "")) {
                FaceData.BgStyle[] bg_styles = ble_ext2.getBg_styles();
                if (bg_styles == null || bg_styles.length == 0) {
                    face.setStyleUrl(ble_ext2.getUpper_background());
                } else {
                    face.setStyleUrl(bg_styles[0].getStyle());
                }
            } else {
                String style = face.getStyle();
                Intrinsics.checkNotNull(style);
                face.setStyleUrl(ble_ext2.getStyleUrl(style));
            }
            face.setBottom_background(ble_ext2.getBottom_background());
            face.setFaceType(ble_ext2.getType());
            face.setPortraitFace(ble_ext2.isPortraitFace());
            face.setBgImg(ble_ext2.getBg_img());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("faceMarket face: ");
        sb.append(face);
        return face;
    }

    public static final void getLatestFirmwareVersion(@Nullable WearableDeviceModel wearableDeviceModel, @NotNull final Function1<? super String, Unit> firmwareVersion) {
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        if (wearableDeviceModel == null) {
            firmwareVersion.invoke2("");
            return;
        }
        String firmwareVersion2 = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
        if (firmwareVersion2 == null || firmwareVersion2.length() == 0) {
            wearableDeviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.watch.face.ext.FaceExtKt.getLatestFirmwareVersion.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i("FaceExt", "readWatchInfo fail: " + errorCode);
                    firmwareVersion.invoke2("");
                }

                @Override // defpackage.eu6
                public void onResult(WatchInfo result) {
                    String firmwareVersion3;
                    Logger.i("FaceExt", "readWatchInfo: " + (result != null ? result.getFirmwareVersion() : null));
                    Function1<String, Unit> function1 = firmwareVersion;
                    if (result == null || (firmwareVersion3 = result.getFirmwareVersion()) == null) {
                        firmwareVersion3 = "";
                    }
                    function1.invoke2(firmwareVersion3);
                }
            });
        } else {
            firmwareVersion.invoke2(firmwareVersion2);
        }
    }

    public static final void gotoPage(@NotNull Context context, @NotNull Class<?> targetClazz, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        Intent intent = new Intent();
        intent.setClass(context, CommonBaseActivity.class);
        intent.putExtra("fragment_param", (Parcelable) fragmentParamsB);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static /* synthetic */ void gotoPage$default(Context context, Class cls, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        gotoPage(context, cls, bundle);
    }

    public static final boolean hasFun(@NotNull FaceData.BleExt bleExt) {
        Intrinsics.checkNotNullParameter(bleExt, "<this>");
        FaceData.Functions[] functions = bleExt.getFunctions();
        if (functions == null || functions.length == 0 || bleExt.getIcon_color() == null || bleExt.getIcon_style() == null) {
            return false;
        }
        int[] icon_color = bleExt.getIcon_color();
        Intrinsics.checkNotNull(icon_color);
        if (!(!(icon_color.length == 0))) {
            return false;
        }
        int[] icon_style = bleExt.getIcon_style();
        Intrinsics.checkNotNull(icon_style);
        return ((icon_style.length == 0) ^ true) && FaceManager.INSTANCE.supportData();
    }

    public static final boolean isSuccess(@NotNull SyncResult syncResult) {
        Intrinsics.checkNotNullParameter(syncResult, "<this>");
        return syncResult.getCode() == 0;
    }

    public static final boolean isSupportZhouHaiPhotoFace(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return DeviceModelExtKt.isBluetooth(wearableDeviceModel) && (DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MULAN_PHOTO_WATCHFACE) || DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.M69_PHOTO_WATCHFACE) || DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.M65A_PHOTO_WATCHFACE));
    }
}
