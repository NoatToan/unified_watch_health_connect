package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.DataReturnTime;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.GdspByteDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB#\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspByteArrayParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "data", "Ljava/util/Calendar;", "a", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "getDataReturnTime", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "setDataReturnTime", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;)V", "dataReturnTime", "startTime", "", "type", "gdspVersion", "<init>", "(Ljava/util/Calendar;II)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspByteArrayParam extends BaseGdspSyncParam<byte[]> {

    @NotNull
    private static final String j = "GdspByteArrayParam";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<byte[]> dataReceiver;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private DataReturnTime dataReturnTime;

    public GdspByteArrayParam(@NotNull Calendar calendar, int i, int i2) {
        super(calendar, i, i2);
        this.dataReceiver = new GdspByteDataReceiver();
        this.dataReturnTime = DataReturnTime.ON_LOOP.INSTANCE;
    }

    private final Calendar a(byte[] data) {
        if (!(!(data.length == 0)) || data.length % 5 != 0) {
            return null;
        }
        long jBytesToLong = GattUtils.bytesToLong(data, data.length - 5, 4) * ((long) 1000);
        Debug.fi(j, "af result last item timestamp:timestamp");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jBytesToLong);
        calendar.add(12, 1);
        return calendar;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<byte[]> getDataReceiver() {
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
    public Calendar getStartSyncTime(@Nullable DataHeader header, @NotNull byte[] data) {
        DataHeader mDataHeader = getDataReceiver().getMDataHeader();
        if (mDataHeader == null) {
            return getStartTime();
        }
        if (mDataHeader.size <= 0) {
            return null;
        }
        if (getType() == 17) {
            return a(data);
        }
        Calendar calendar = (Calendar) mDataHeader.calendar.clone();
        calendar.add(12, 1);
        return calendar;
    }

    public /* synthetic */ GdspByteArrayParam(Calendar calendar, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Calendar.getInstance() : calendar, i, (i3 & 4) != 0 ? 0 : i2);
    }
}
