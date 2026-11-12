package com.xiaomi.hm.health.device.setting.appsort;

import android.content.Context;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\n\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\u000b\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\f\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\r\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\u000e\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&J\u001c\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\bH&JT\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\bH&¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortHelperApi;", "", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "displaySetting", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "syncAppSortDataToDevice", "Ljava/util/HashMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "upgradeCincoNFC", "upgradePAIBeatsW", "upgradePAI", "upgradeWuhanTimer", "upgradeChongqingTimer", "hashMap", "upgradePyh", "upgradeFalcon", "fixChaohuAppSort", "fixCincoAppSort", "fixCincoPAI", "fixLisbonW", "fixYork", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "nameMap", "drawableMap", "colorMap", "createAppSortMap", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AppSortHelperApi {
    void createAppSortMap(@NotNull Context context, @NotNull HMDeviceSource deviceSource, @NotNull HashMap<Integer, String> nameMap, @NotNull HashMap<Integer, Integer> drawableMap, @NotNull HashMap<Integer, Integer> colorMap);

    void fixChaohuAppSort(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap);

    void fixCincoAppSort(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap);

    void fixCincoPAI(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap);

    void fixLisbonW(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap);

    void fixYork(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap);

    void syncAppSortDataToDevice(@NotNull SortableAppItems displaySetting, @NotNull HMDeviceSource deviceSource);

    void upgradeChongqingTimer(@NotNull HashMap<HMDeviceSource, SortableAppItems> map);

    void upgradeCincoNFC(@NotNull HashMap<HMDeviceSource, SortableAppItems> map);

    void upgradeFalcon(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap);

    void upgradePAI(@NotNull HashMap<HMDeviceSource, SortableAppItems> map);

    void upgradePAIBeatsW(@NotNull HashMap<HMDeviceSource, SortableAppItems> map);

    void upgradePyh(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap);

    void upgradeWuhanTimer(@NotNull HashMap<HMDeviceSource, SortableAppItems> map);
}
