package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001eB\u001b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\tR\"\u0010\u000f\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspProHrParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HMHrData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "", "Ljava/util/ArrayList;", "parseHrData", "", "h", "Z", "isLoop", "()Z", "setLoop", "(Z)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "", "gdspVersion", "<init>", "(Ljava/util/Calendar;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspProHrParam extends BaseGdspSyncParam<List<? extends HMHrData>> {

    @NotNull
    private static final String j = "GdspProHrParam";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isLoop;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<HMHrData>> dataReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    public GdspProHrParam() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public GdspProHrParam(@NotNull Calendar calendar, int i) {
        super(calendar, 2, i);
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends HMHrData>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspProHrParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            public List<HMHrData> getAllData() {
                DataHeader mDataHeader = getMDataHeader();
                ArrayList<HMHrData> hrData = null;
                if (mDataHeader != null) {
                    if (!(mDataHeader.size > 0)) {
                        mDataHeader = null;
                    }
                    if (mDataHeader != null) {
                        hrData = this.d.parseHrData(getMDataStream().toByteArray());
                    }
                }
                return hrData == null ? CollectionsKt__CollectionsKt.emptyList() : hrData;
            }
        };
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends HMHrData>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @Nullable
    public Calendar getStartSyncTime(@Nullable DataHeader header, @NotNull List<? extends HMHrData> data) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    /* JADX INFO: renamed from: isLoop, reason: from getter */
    public boolean getIsLoop() {
        return this.isLoop;
    }

    @Nullable
    public final synchronized ArrayList<HMHrData> parseHrData(@NotNull byte[] data) {
        ArrayList<HMHrData> arrayList = new ArrayList<>();
        int length = data.length;
        if (length % 6 != 0) {
            return arrayList;
        }
        for (int i = 0; i < length; i += 6) {
            int i2 = (data[i] & 255) | ((data[i + 1] & 255) << 8) | ((data[i + 2] & 255) << 16) | ((data[i + 3] & 255) << 24);
            byte b = data[i + 4];
            int i3 = data[i + 5] & 255;
            long j2 = ((long) i2) * 1000;
            Calendar calendar = Calendar.getInstance(ProfileUtils.getTimezone(b));
            calendar.setTimeInMillis(j2);
            Debug.fi(j, "HR_Log Key-Manual:" + i3 + '(' + calendar.getTime() + ')');
            arrayList.add(new HMHrData(calendar, i3));
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public void setLoop(boolean z) {
        this.isLoop = z;
    }

    public /* synthetic */ GdspProHrParam(Calendar calendar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Calendar.getInstance() : calendar, (i2 & 2) != 0 ? 0 : i);
    }
}
