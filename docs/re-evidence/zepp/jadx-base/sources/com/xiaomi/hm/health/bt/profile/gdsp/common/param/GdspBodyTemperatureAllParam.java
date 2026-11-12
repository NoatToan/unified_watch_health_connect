package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureAllDay;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureAllDayItem;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001a2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00108\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspBodyTemperatureAllParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;", "", "time", "", "bytesData", "", "oneItemSize", "a", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "version", "<init>", "(Ljava/util/Calendar;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspBodyTemperatureAllParam extends BaseGdspSyncParam<List<? extends TemperatureAllDay>> {

    @NotNull
    private static final String i = "BodyTemperature";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<TemperatureAllDay>> dataReceiver;

    public GdspBodyTemperatureAllParam(@NotNull Calendar calendar, int i2) {
        super(calendar, 46, i2);
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends TemperatureAllDay>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspBodyTemperatureAllParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            /* JADX INFO: renamed from: getAllData */
            public List<TemperatureAllDay> getDetail() {
                DataHeader mDataHeader = getMDataHeader();
                List<TemperatureAllDay> listListOf = null;
                if (mDataHeader != null) {
                    if (!(mDataHeader.size > 0)) {
                        mDataHeader = null;
                    }
                    if (mDataHeader != null) {
                        long j = 1000;
                        listListOf = e.listOf(this.d.a((mDataHeader.calendar.getTimeInMillis() / j) * j, getMDataStream().toByteArray(), 8));
                    }
                }
                return listListOf == null ? CollectionsKt__CollectionsKt.emptyList() : listListOf;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TemperatureAllDay a(long time, byte[] bytesData, int oneItemSize) {
        Debug.fi(i, Intrinsics.stringPlus("Parse AllDayData, ByteSize/Minute: ", Integer.valueOf(oneItemSize)));
        int length = bytesData.length / oneItemSize;
        int i2 = 0;
        TemperatureAllDayItem temperatureAllDayItem = new TemperatureAllDayItem((short) 0, (short) 0, (short) 0, (short) 0);
        TemperatureAllDayItem[] temperatureAllDayItemArr = new TemperatureAllDayItem[length];
        for (int i3 = 0; i3 < length; i3++) {
            temperatureAllDayItemArr[i3] = temperatureAllDayItem;
        }
        if (length > 0) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = i2 * oneItemSize;
                temperatureAllDayItemArr[i2] = new TemperatureAllDayItem((short) GattUtils.bytesToInt(bytesData, i5, 2), (short) GattUtils.bytesToInt(bytesData, i5 + 2, 2), (short) GattUtils.bytesToInt(bytesData, i5 + 4, 2), (short) GattUtils.bytesToInt(bytesData, i5 + 6, 2));
                if (i4 >= length) {
                    break;
                }
                i2 = i4;
            }
        }
        return new TemperatureAllDay(time, temperatureAllDayItemArr, bytesData);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends TemperatureAllDay>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public /* bridge */ /* synthetic */ Calendar getStartSyncTime(DataHeader dataHeader, List<? extends TemperatureAllDay> list) {
        return getStartSyncTime2(dataHeader, (List<TemperatureAllDay>) list);
    }

    @Nullable
    /* JADX INFO: renamed from: getStartSyncTime, reason: avoid collision after fix types in other method */
    public Calendar getStartSyncTime2(@Nullable DataHeader header, @NotNull List<TemperatureAllDay> data) {
        TemperatureAllDayItem[] values;
        if (header == null) {
            return getStartTime();
        }
        TemperatureAllDay temperatureAllDay = (TemperatureAllDay) CollectionsKt.lastOrNull((List) data);
        if (temperatureAllDay == null || (values = temperatureAllDay.getValues()) == null) {
            return null;
        }
        if (!(!(values.length == 0))) {
            values = null;
        }
        if (values == null) {
            return null;
        }
        Calendar calendar = (Calendar) header.calendar.clone();
        calendar.add(12, values.length);
        return calendar;
    }
}
