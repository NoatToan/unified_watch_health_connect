package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.firstbeat.FirstbeatData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspFirstbetaParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/FirstbeatData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "", "version", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspFirstbetaParam extends BaseGdspSyncParam<List<? extends FirstbeatData>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<FirstbeatData>> dataReceiver;

    public GdspFirstbetaParam(@NotNull Calendar calendar, int i) {
        super(calendar, 35, i);
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends FirstbeatData>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspFirstbetaParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            public List<FirstbeatData> getAllData() {
                DataHeader mDataHeader = getMDataHeader();
                ArrayList arrayList = null;
                if (mDataHeader != null) {
                    if (!(mDataHeader.size > 0)) {
                        mDataHeader = null;
                    }
                    if (mDataHeader != null) {
                        byte[] byteArray = getMDataStream().toByteArray();
                        int length = byteArray.length;
                        ArrayList arrayList2 = new ArrayList();
                        if (length % 32 == 0) {
                            IntProgression intProgressionStep = e.step(e.until(0, length), 32);
                            int first = intProgressionStep.getFirst();
                            int last = intProgressionStep.getLast();
                            int step = intProgressionStep.getStep();
                            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                                while (true) {
                                    int i2 = first + step;
                                    FirstbeatData fromBytes = FirstbeatData.INSTANCE.parseFromBytes(byteArray, first);
                                    if (fromBytes != null) {
                                        arrayList2.add(fromBytes);
                                    }
                                    if (first == last) {
                                        break;
                                    }
                                    first = i2;
                                }
                            }
                        }
                        arrayList = arrayList2;
                    }
                }
                return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
            }
        };
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends FirstbeatData>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public /* bridge */ /* synthetic */ Calendar getStartSyncTime(DataHeader dataHeader, List<? extends FirstbeatData> list) {
        return getStartSyncTime2(dataHeader, (List<FirstbeatData>) list);
    }

    @Nullable
    /* JADX INFO: renamed from: getStartSyncTime, reason: avoid collision after fix types in other method */
    public Calendar getStartSyncTime2(@Nullable DataHeader header, @NotNull List<FirstbeatData> data) {
        if (header == null) {
            return getStartTime();
        }
        FirstbeatData firstbeatData = (FirstbeatData) CollectionsKt.lastOrNull((List) data);
        if (firstbeatData == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(firstbeatData.getUpdateTime());
        calendar.setTimeZone(ProfileUtils.getTimezone((byte) firstbeatData.getZone()));
        return calendar;
    }
}
