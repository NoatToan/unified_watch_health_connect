package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.Temperature80s;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.Temperature80sItem;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00128\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspBodyTemperature80sParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "", "bytesData", "", "a", "([B)[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "", "index", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80sItem;", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "version", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspBodyTemperature80sParam extends BaseGdspSyncParam<List<? extends Temperature80s>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<Temperature80s>> dataReceiver;

    public GdspBodyTemperature80sParam(@NotNull Calendar calendar, int i) {
        super(calendar, 48, i);
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends Temperature80s>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspBodyTemperature80sParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            public List<Temperature80s> getAllData() {
                DataHeader mDataHeader = getMDataHeader();
                ArrayList arrayList = null;
                if (mDataHeader != null) {
                    if (!(mDataHeader.size > 0)) {
                        mDataHeader = null;
                    }
                    if (mDataHeader != null) {
                        GdspBodyTemperature80sParam gdspBodyTemperature80sParam = this.d;
                        arrayList = new ArrayList();
                        h.addAll(arrayList, gdspBodyTemperature80sParam.a(getMDataStream().toByteArray()));
                    }
                }
                return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Temperature80s[] a(byte[] bytesData) {
        int length = bytesData.length / 1291;
        Temperature80s temperature80s = new Temperature80s(0L, 0, 0, (short) 0, new Temperature80sItem[0], new byte[0]);
        Temperature80s[] temperature80sArr = new Temperature80s[length];
        for (int i = 0; i < length; i++) {
            temperature80sArr[i] = temperature80s;
        }
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int i4 = i2 * 1291;
                int i5 = bytesData[i4] & 255;
                int iBytesToInt = GattUtils.bytesToInt(bytesData, i4 + 1, 4);
                int iBytesToInt2 = GattUtils.bytesToInt(bytesData, i4 + 5, 2);
                long jBytesToLong = GattUtils.bytesToLong(bytesData, i4 + 7, 4);
                Temperature80sItem temperature80sItem = new Temperature80sItem(0L, (short) 0, (short) 0, (short) 0, (short) 0, 0);
                Temperature80sItem[] temperature80sItemArr = new Temperature80sItem[80];
                for (int i6 = 0; i6 < 80; i6++) {
                    temperature80sItemArr[i6] = temperature80sItem;
                }
                int i7 = i4 + 11;
                byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bytesData, i7, i7 + 1280);
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    temperature80sItemArr[i8] = b(bytesData, (i8 * 16) + i7);
                    if (i9 >= 80) {
                        break;
                    }
                    i8 = i9;
                }
                temperature80sArr[i2] = new Temperature80s(jBytesToLong * ((long) 1000), i5, iBytesToInt, (short) iBytesToInt2, temperature80sItemArr, bArrCopyOfRange);
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return temperature80sArr;
    }

    private final Temperature80sItem b(byte[] bytesData, int index) {
        int iBytesToInt = GattUtils.bytesToInt(bytesData, index, 2);
        int iBytesToInt2 = GattUtils.bytesToInt(bytesData, index + 2, 2);
        int iBytesToInt3 = GattUtils.bytesToInt(bytesData, index + 4, 2);
        int iBytesToInt4 = GattUtils.bytesToInt(bytesData, index + 6, 2);
        return new Temperature80sItem(GattUtils.bytesToLong(bytesData, index + 12, 4) * ((long) 1000), (short) iBytesToInt, (short) iBytesToInt2, (short) iBytesToInt3, (short) iBytesToInt4, bytesData[index + 8]);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends Temperature80s>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public /* bridge */ /* synthetic */ Calendar getStartSyncTime(DataHeader dataHeader, List<? extends Temperature80s> list) {
        return getStartSyncTime2(dataHeader, (List<Temperature80s>) list);
    }

    @Nullable
    /* JADX INFO: renamed from: getStartSyncTime, reason: avoid collision after fix types in other method */
    public Calendar getStartSyncTime2(@Nullable DataHeader header, @NotNull List<Temperature80s> data) {
        if (header == null) {
            return getStartTime();
        }
        Temperature80s temperature80s = (Temperature80s) CollectionsKt.lastOrNull((List) data);
        if (temperature80s == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(temperature80s.getTimeMillis());
        calendar.add(13, 80);
        return calendar;
    }
}
