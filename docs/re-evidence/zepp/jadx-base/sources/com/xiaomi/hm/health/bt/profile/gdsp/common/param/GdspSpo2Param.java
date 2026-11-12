package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.DataReturnTime;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.Spo2DataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B'\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00118\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspSpo2Param;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "getDataReturnTime", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "setDataReturnTime", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;)V", "dataReturnTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "", "type", "", "supportSpo2Version", "version", "<init>", "(Ljava/util/Calendar;IZI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspSpo2Param extends BaseGdspSyncParam<List<? extends Spo2Data>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private DataReturnTime dataReturnTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<Spo2Data>> dataReceiver;

    public GdspSpo2Param(@NotNull Calendar calendar, int i, boolean z, int i2) {
        super(calendar, i, i2);
        this.dataReturnTime = DataReturnTime.ON_FINISH.INSTANCE;
        this.dataReceiver = new Spo2DataReceiver((byte) i, z);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends Spo2Data>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public DataReturnTime getDataReturnTime() {
        return this.dataReturnTime;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public void setDataReturnTime(@NotNull DataReturnTime dataReturnTime) {
        this.dataReturnTime = dataReturnTime;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @Nullable
    public Calendar getStartSyncTime(@Nullable DataHeader header, @NotNull List<? extends Spo2Data> data) {
        if (header == null) {
            return getStartTime();
        }
        Spo2Data spo2Data = (Spo2Data) CollectionsKt.lastOrNull((List) data);
        if (spo2Data == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((byte) getType()) == 40 ? spo2Data.getTimeStamp() * ((long) 1000) : (spo2Data.getTimeStamp() * ((long) 1000)) + ((long) 30000));
        return calendar;
    }
}
