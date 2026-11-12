package com.xiaomi.hm.health.device;

import android.content.Context;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\t\u001a\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006\"%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", "ctx", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "", "", "getScaleUnitResList", "unit", "getUnitString", "a", "Ljava/util/Map;", "getUnitToResId", "()Ljava/util/Map;", "unitToResId", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ScaleUnitSettingUtilsKt {

    @NotNull
    private static final Map<Integer, Integer> a = kotlin.collections.r.mapOf(TuplesKt.to(0, Integer.valueOf(R.string.unit_kg)), TuplesKt.to(1, Integer.valueOf(R.string.unit_yb)), TuplesKt.to(16, Integer.valueOf(R.string.unit_sj)), TuplesKt.to(17, Integer.valueOf(R.string.unit_stone)));

    @NotNull
    public static final Map<String, Integer> getScaleUnitResList(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(context.getString(R.string.weight_bfs_unit_kg), 0);
        linkedHashMap.put(context.getString(R.string.weight_bfs_unit_pound), 1);
        if (!HMWeightUtils.isHideUnitJin()) {
            linkedHashMap.put(context.getString(R.string.weight_bfs_unit_jin), 16);
        }
        if (hMDeviceSource == HMDeviceSource.WEIGHT_AMAZFIT_SCALE) {
            linkedHashMap.put(context.getString(R.string.unit_stone), 17);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final String getUnitString(@NotNull Context context, int i) {
        Integer num = a.get(Integer.valueOf(i));
        return context.getString(num == null ? R.string.unit_kg : num.intValue());
    }

    @NotNull
    public static final Map<Integer, Integer> getUnitToResId() {
        return a;
    }
}
