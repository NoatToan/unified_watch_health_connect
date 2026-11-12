package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums;

import android.content.res.Resources;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsDataInterval;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;", "", "fullDesc", "shortDesc", "", "other", "", "equals", "", "hashCode", "toString", "a", LogUtil.I, "getInterval", "()I", "interval", "<init>", "(I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsDataInterval implements GpsSetting {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int interval;

    public GpsDataInterval(int i) {
        this.interval = i;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof GpsDataInterval) && ((GpsDataInterval) other).interval == this.interval;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting
    @NotNull
    public String fullDesc() {
        Resources resources = DeviceXFunctionsKt.getContext().getResources();
        int i = R.plurals.ds_gps_data_interval;
        int i2 = this.interval;
        return resources.getQuantityString(i, i2, Integer.valueOf(i2));
    }

    public final int getInterval() {
        return this.interval;
    }

    public int hashCode() {
        return this.interval;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting
    @NotNull
    public String shortDesc() {
        Resources resources = DeviceXFunctionsKt.getContext().getResources();
        int i = R.plurals.ds_gps_data_interval_simple;
        int i2 = this.interval;
        return resources.getQuantityString(i, i2, Integer.valueOf(i2));
    }

    @NotNull
    public String toString() {
        return "GpsDataInterval[interval" + this.interval + "]";
    }
}
