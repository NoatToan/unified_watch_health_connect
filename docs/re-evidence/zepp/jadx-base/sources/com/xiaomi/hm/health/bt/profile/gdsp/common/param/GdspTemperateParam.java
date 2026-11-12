package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.loc.z;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.DataReturnTime;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.temperature.HMTemperatureData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\f\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00188\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspTemperateParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/temperature/HMTemperatureData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "", "h", "Z", "isLoop", "()Z", "setLoop", "(Z)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "getDataReturnTime", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "setDataReturnTime", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;)V", "dataReturnTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", z.j, "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "", "version", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspTemperateParam extends BaseGdspSyncParam<List<? extends HMTemperatureData>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isLoop;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private DataReturnTime dataReturnTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<HMTemperatureData>> dataReceiver;

    public GdspTemperateParam(@NotNull Calendar calendar, int i) {
        super(calendar, 4, i);
        this.dataReturnTime = DataReturnTime.ON_FINISH.INSTANCE;
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends HMTemperatureData>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspTemperateParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            public List<HMTemperatureData> getAllData() {
                DataHeader mDataHeader = getMDataHeader();
                ArrayList<HMTemperatureData> temperatureData = null;
                if (mDataHeader != null) {
                    if (!(mDataHeader.size > 0)) {
                        mDataHeader = null;
                    }
                    if (mDataHeader != null) {
                        temperatureData = HMProSyncDataProfile.parseTemperatureData(getMDataStream().toByteArray());
                    }
                }
                return temperatureData == null ? CollectionsKt__CollectionsKt.emptyList() : temperatureData;
            }
        };
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends HMTemperatureData>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public DataReturnTime getDataReturnTime() {
        return this.dataReturnTime;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @Nullable
    public Calendar getStartSyncTime(@Nullable DataHeader header, @NotNull List<? extends HMTemperatureData> data) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    /* JADX INFO: renamed from: isLoop, reason: from getter */
    public boolean getIsLoop() {
        return this.isLoop;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public void setDataReturnTime(@NotNull DataReturnTime dataReturnTime) {
        this.dataReturnTime = dataReturnTime;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public void setLoop(boolean z) {
        this.isLoop = z;
    }
}
