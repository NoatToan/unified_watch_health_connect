package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\u000f\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspPressureParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "", "data", "Ljava/util/ArrayList;", "parsePressureSingleData", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "Ljava/util/Calendar;", "getStartSyncTime", "", "h", "Z", "isLoop", "()Z", "setLoop", "(Z)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "isSingle", "", "gdspVersion", "<init>", "(Ljava/util/Calendar;ZI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspPressureParam extends BaseGdspSyncParam<List<? extends HMPressureData>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isLoop;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<HMPressureData>> dataReceiver;

    public GdspPressureParam(@NotNull Calendar calendar, final boolean z, int i) {
        super(calendar, (z ? 18 : 19) & 255, i);
        this.isLoop = !z;
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends HMPressureData>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspPressureParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            public List<HMPressureData> getAllData() {
                DataHeader mDataHeader = getMDataHeader();
                ArrayList<HMPressureData> pressureSingleData = null;
                if (mDataHeader != null) {
                    int i2 = 0;
                    if (!(mDataHeader.size > 0)) {
                        mDataHeader = null;
                    }
                    if (mDataHeader != null) {
                        boolean z2 = z;
                        GdspPressureParam gdspPressureParam = this;
                        if (z2) {
                            pressureSingleData = gdspPressureParam.parsePressureSingleData(getMDataStream().toByteArray());
                        } else {
                            byte[] byteArray = getMDataStream().toByteArray();
                            Debug.fi("GdspPressureParam", TextUtils.join(",", ArraysKt___ArraysKt.toList(byteArray)));
                            ArrayList<HMPressureData> arrayList = new ArrayList<>(byteArray.length);
                            int length = byteArray.length;
                            int i3 = 0;
                            while (i2 < length) {
                                arrayList.add(new HMPressureData(mDataHeader.calendar.getTimeInMillis() + ((long) (i3 * 1000 * 60)), byteArray[i2] & 255));
                                i2++;
                                i3++;
                            }
                            pressureSingleData = arrayList;
                        }
                    }
                }
                return pressureSingleData == null ? CollectionsKt__CollectionsKt.emptyList() : pressureSingleData;
            }
        };
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends HMPressureData>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public /* bridge */ /* synthetic */ Calendar getStartSyncTime(DataHeader dataHeader, List<? extends HMPressureData> list) {
        return getStartSyncTime2(dataHeader, (List<HMPressureData>) list);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    /* JADX INFO: renamed from: isLoop, reason: from getter */
    public boolean getIsLoop() {
        return this.isLoop;
    }

    @Nullable
    public final synchronized ArrayList<HMPressureData> parsePressureSingleData(@NotNull byte[] data) {
        ArrayList<HMPressureData> arrayList = new ArrayList<>();
        int length = data.length;
        if (length % 5 != 0) {
            return arrayList;
        }
        for (int i = 0; i < length; i += 5) {
            int i2 = (data[i] & 255) | ((data[i + 1] & 255) << 8) | ((data[i + 2] & 255) << 16) | ((data[i + 3] & 255) << 24);
            int i3 = data[i + 4] & 255;
            long j = ((long) i2) * 1000;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Debug.fi("GdspPressureParam", "pressure:" + i3 + '(' + calendar.getTime() + ')');
            arrayList.add(new HMPressureData(j, i3));
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public void setLoop(boolean z) {
        this.isLoop = z;
    }

    @Nullable
    /* JADX INFO: renamed from: getStartSyncTime, reason: avoid collision after fix types in other method */
    public Calendar getStartSyncTime2(@Nullable DataHeader header, @NotNull List<HMPressureData> data) {
        if (header == null) {
            return getStartTime();
        }
        if (!(getIsLoop() && (data.isEmpty() ^ true))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        Calendar calendar = (Calendar) header.calendar.clone();
        calendar.add(12, data.size());
        calendar.add(13, 1);
        return calendar;
    }
}
