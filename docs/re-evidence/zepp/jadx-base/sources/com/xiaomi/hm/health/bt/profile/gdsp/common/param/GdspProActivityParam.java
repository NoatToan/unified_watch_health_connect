package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.DataReturnTime;
import com.xiaomi.hm.health.bt.profile.gdsp.common.filter.IGdspHeaderFilter;
import com.xiaomi.hm.health.bt.profile.gdsp.common.filter.header.GdspHeaderErrorActivitySizeFilter;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.ProActivityDataReceiver;
import com.xiaomi.market.sdk.Constants;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B+\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00148\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspProActivityParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityData;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/filter/IGdspHeaderFilter;", "getHeadFilters", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "getDataReturnTime", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "setDataReturnTime", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;)V", "dataReturnTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "", "gdspVersion", "<init>", "(Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspProActivityParam extends BaseGdspSyncParam<ActivityDataFragment<ActivityData>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private DataReturnTime dataReturnTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<ActivityDataFragment<ActivityData>> dataReceiver;

    public /* synthetic */ GdspProActivityParam(Calendar calendar, HMDeviceSource hMDeviceSource, Feature feature, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Calendar.getInstance() : calendar, hMDeviceSource, feature, (i2 & 8) != 0 ? 0 : i);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<ActivityDataFragment<ActivityData>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public DataReturnTime getDataReturnTime() {
        return this.dataReturnTime;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public List<IGdspHeaderFilter> getHeadFilters() {
        return e.listOf(new GdspHeaderErrorActivitySizeFilter());
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public void setDataReturnTime(@NotNull DataReturnTime dataReturnTime) {
        this.dataReturnTime = dataReturnTime;
    }

    public GdspProActivityParam(@NotNull Calendar calendar, @NotNull HMDeviceSource hMDeviceSource, @NotNull Feature feature, int i) {
        super(calendar, 1, i);
        this.dataReturnTime = DataReturnTime.ON_FINISH.INSTANCE;
        this.dataReceiver = new ProActivityDataReceiver(hMDeviceSource, feature);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @Nullable
    public Calendar getStartSyncTime(@Nullable DataHeader header, @NotNull ActivityDataFragment<ActivityData> data) {
        if (header == null) {
            return getStartTime();
        }
        if (!(data.size() > 0)) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        Calendar calendar = (Calendar) header.calendar.clone();
        calendar.add(12, data.size());
        return calendar;
    }
}
