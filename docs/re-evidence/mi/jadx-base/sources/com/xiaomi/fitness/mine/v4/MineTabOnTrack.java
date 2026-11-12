package com.xiaomi.fitness.mine.v4;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/mine/v4/MineTabOnTrack;", "", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "oneTrackRelativeCareEntranceClick", "", "oneTrackRelativeCareEntranceExpose", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MineTabOnTrack {

    @NotNull
    public static final MineTabOnTrack INSTANCE = new MineTabOnTrack();

    private MineTabOnTrack() {
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void oneTrackRelativeCareEntranceClick() {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("name", "relatives_entry");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        pairArr[1] = TuplesKt.to("device_model", mDeviceModel != null ? mDeviceModel.getDid() : null);
        pairArr[2] = TuplesKt.to("source", "profile_tab_page");
        pairArr[3] = TuplesKt.to("tip", "56.1.6.1.25014");
        Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(pairArr);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", mapMapOf);
        Logger.d("MineFragment", "oneTrackRelativeCareEntranceClick oneTrackMap=" + mapMapOf);
    }

    public final void oneTrackRelativeCareEntranceExpose() {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("name", "relatives_entry");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        pairArr[1] = TuplesKt.to("device_model", mDeviceModel != null ? mDeviceModel.getDid() : null);
        pairArr[2] = TuplesKt.to("source", "profile_tab_page");
        pairArr[3] = TuplesKt.to("tip", "56.1.6.1.25013");
        Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(pairArr);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", mapMapOf);
        Logger.d("MineFragment", "oneTrackRelativeCareEntranceExpose oneTrackMap=" + mapMapOf);
    }
}
