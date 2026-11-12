package com.huami.devicex.manager;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.ShoesDaySportData;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\f\u001a\u00020\u000b2\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\u000e\u001a\u00020\u000b2\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0002H&J6\u0010\u000f\u001a\u00020\u000b2\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u001c\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0015\u001a\u00020\u0003H&J&\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&J$\u0010\u001d\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0002H&J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001eH&¨\u0006 "}, d2 = {"Lcom/huami/devicex/manager/DataCacheApi;", "", "", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "dsdList", "", "deviceType", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "deviceId", "", "analysisNewDSDFromBand", "Lcom/xiaomi/hm/health/dataprocess/ShoesDaySportData;", "analysisNewDSDFromShoes", "analysisNewDsdFromEarbud", "initSummeryData", "tag", "", "data", "printHrData", "getTodaySportData", "startDate", "endDate", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "callback", "loadAmazfitWatchBytesData", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityData;", "activityDatas", "printActivityData", "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "getmWatchRts", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DataCacheApi {
    void analysisNewDSDFromBand(@Nullable List<? extends DaySportData> dsdList, int deviceType, @Nullable HMDeviceSource deviceSource, @Nullable String deviceId);

    void analysisNewDSDFromShoes(@Nullable List<? extends ShoesDaySportData> dsdList);

    void analysisNewDsdFromEarbud(@Nullable List<? extends DaySportData> dsdList, int deviceType, @Nullable HMDeviceSource deviceSource, @Nullable String deviceId);

    @NotNull
    DaySportData getTodaySportData();

    @Nullable
    RealtimeStep getmWatchRts();

    void initSummeryData();

    void loadAmazfitWatchBytesData(@Nullable String startDate, @Nullable String endDate, @Nullable IHMActivityDataCallback callback);

    void printActivityData(@Nullable String tag, @Nullable List<? extends ActivityData> activityDatas);

    void printHrData(@Nullable String tag, @Nullable byte[] data);
}
