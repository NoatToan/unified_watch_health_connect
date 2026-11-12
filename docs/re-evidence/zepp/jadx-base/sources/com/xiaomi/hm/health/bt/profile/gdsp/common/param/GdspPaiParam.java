package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMSyncPaiProfile;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspPaiParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "", "gdspVersion", "<init>", "(Ljava/util/Calendar;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspPaiParam extends BaseGdspSyncParam<HMPaiData> {

    @NotNull
    private static final String i = "GdspPaiParam";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<HMPaiData> dataReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    public GdspPaiParam() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public GdspPaiParam(@NotNull Calendar calendar, int i2) {
        super(calendar, 13, i2);
        this.dataReceiver = new BaseGdspDataReceiver<HMPaiData>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspPaiParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @Nullable
            public HMPaiData getAllData() {
                DataHeader mDataHeader = getMDataHeader();
                if (mDataHeader == null) {
                    return null;
                }
                if (!(mDataHeader.size > 0)) {
                    mDataHeader = null;
                }
                if (mDataHeader == null) {
                    return null;
                }
                try {
                    return HMSyncPaiProfile.parsePaiData(getMDataStream().toByteArray());
                } catch (Exception e) {
                    Debug.fi("GdspPaiParam", e.getMessage());
                    return null;
                }
            }
        };
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<HMPaiData> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @Nullable
    public Calendar getStartSyncTime(@Nullable DataHeader header, @Nullable HMPaiData data) {
        if (header == null) {
            return getStartTime();
        }
        if (data == null) {
            return null;
        }
        boolean z = data.getType() == 1;
        if (z) {
            Debug.fi("HMSyncPaiDataTask", "return as realtime pai data!!!");
        }
        if (!(!z)) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(data.getTime() + ((long) 60000));
        return calendar;
    }

    public /* synthetic */ GdspPaiParam(Calendar calendar, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Calendar.getInstance() : calendar, (i3 & 2) != 0 ? 0 : i2);
    }
}
