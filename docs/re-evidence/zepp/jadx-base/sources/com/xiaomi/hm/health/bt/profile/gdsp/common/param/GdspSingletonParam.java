package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPData;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B'\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspSingletonParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "mType", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "i", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", z.j, "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "", "version", "<init>", "(Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspSingletonParam extends BaseGdspSyncParam<HMGDSPData> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final HMGDSPType mType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<HMGDSPData> dataReceiver;

    public GdspSingletonParam(@NotNull Calendar calendar, @NotNull HMGDSPType hMGDSPType, @NotNull HMDeviceSource hMDeviceSource, int i) {
        super(calendar, hMGDSPType.getValue() & 255, i);
        this.mType = hMGDSPType;
        this.source = hMDeviceSource;
        this.dataReceiver = new BaseGdspDataReceiver<HMGDSPData>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspSingletonParam$dataReceiver$1

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @Nullable
            private HMGDSPData result;

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver, com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            public void receiveData(@NotNull byte[] data) {
                super.receiveData(data);
                if (this.result == null) {
                    HMGDSPData hMGDSPData = new HMGDSPData(this.e.mType, this.e.source);
                    hMGDSPData.init();
                    Unit unit = Unit.INSTANCE;
                    this.result = hMGDSPData;
                }
                this.result.parse(data);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver, com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            public void receiveHeader(@Nullable DataHeader header) {
                super.receiveHeader(header);
                HMGDSPData hMGDSPData = new HMGDSPData(this.e.mType, this.e.source);
                hMGDSPData.init();
                Unit unit = Unit.INSTANCE;
                this.result = hMGDSPData;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @Nullable
            public HMGDSPData getAllData() {
                HMGDSPData hMGDSPData = this.result;
                if (hMGDSPData != null) {
                    hMGDSPData.deInit();
                }
                return this.result;
            }
        };
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<HMGDSPData> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @Nullable
    public Calendar getStartSyncTime(@Nullable DataHeader header, @Nullable HMGDSPData data) {
        return null;
    }
}
