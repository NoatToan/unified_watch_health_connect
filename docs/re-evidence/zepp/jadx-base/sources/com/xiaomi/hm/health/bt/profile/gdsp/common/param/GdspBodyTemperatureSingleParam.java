package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureSingle;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\u0011\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspBodyTemperatureSingleParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "", "bytesData", "", "a", "([B)[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "", "h", "Z", "isLoop", "()Z", "setLoop", "(Z)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "", "version", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspBodyTemperatureSingleParam extends BaseGdspSyncParam<List<? extends TemperatureSingle>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isLoop;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<TemperatureSingle>> dataReceiver;

    public GdspBodyTemperatureSingleParam(@NotNull Calendar calendar, int i) {
        super(calendar, 47, i);
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends TemperatureSingle>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspBodyTemperatureSingleParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            public List<TemperatureSingle> getAllData() {
                DataHeader mDataHeader = getMDataHeader();
                ArrayList arrayList = null;
                if (mDataHeader != null) {
                    if (!(mDataHeader.size > 0)) {
                        mDataHeader = null;
                    }
                    if (mDataHeader != null) {
                        GdspBodyTemperatureSingleParam gdspBodyTemperatureSingleParam = this.d;
                        arrayList = new ArrayList();
                        h.addAll(arrayList, gdspBodyTemperatureSingleParam.a(getMDataStream().toByteArray()));
                    }
                }
                return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TemperatureSingle[] a(byte[] bytesData) {
        int length = bytesData.length / 8;
        int i = 0;
        TemperatureSingle temperatureSingle = new TemperatureSingle(0L, (short) 0, (short) 0);
        TemperatureSingle[] temperatureSingleArr = new TemperatureSingle[length];
        for (int i2 = 0; i2 < length; i2++) {
            temperatureSingleArr[i2] = temperatureSingle;
        }
        if (length > 0) {
            while (true) {
                int i3 = i + 1;
                int i4 = i * 8;
                temperatureSingleArr[i] = new TemperatureSingle(GattUtils.bytesToLong(bytesData, i4 + 4, 4) * ((long) 1000), (short) GattUtils.bytesToInt(bytesData, i4, 2), (short) GattUtils.bytesToInt(bytesData, i4 + 2, 2));
                if (i3 >= length) {
                    break;
                }
                i = i3;
            }
        }
        return temperatureSingleArr;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends TemperatureSingle>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public /* bridge */ /* synthetic */ Calendar getStartSyncTime(DataHeader dataHeader, List<? extends TemperatureSingle> list) {
        return getStartSyncTime2(dataHeader, (List<TemperatureSingle>) list);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    /* JADX INFO: renamed from: isLoop, reason: from getter */
    public boolean getIsLoop() {
        return this.isLoop;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public void setLoop(boolean z) {
        this.isLoop = z;
    }

    @Nullable
    /* JADX INFO: renamed from: getStartSyncTime, reason: avoid collision after fix types in other method */
    public Calendar getStartSyncTime2(@Nullable DataHeader header, @NotNull List<TemperatureSingle> data) {
        Calendar calendar = null;
        if (header != null && header.size > 0) {
            calendar = (Calendar) header.calendar.clone();
            calendar.add(12, header.size);
        }
        return calendar == null ? getStartTime() : calendar;
    }
}
