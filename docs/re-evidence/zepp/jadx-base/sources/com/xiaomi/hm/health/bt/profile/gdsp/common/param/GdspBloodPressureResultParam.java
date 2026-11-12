package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.bloodpressure.BloodPressureMeasureResult;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspBloodPressureResultParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bloodpressure/BloodPressureMeasureResult;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "", "type", "<init>", "(Ljava/util/Calendar;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspBloodPressureResultParam extends BaseGdspSyncParam<List<? extends BloodPressureMeasureResult>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String i = "BloodPressure";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<BloodPressureMeasureResult>> dataReceiver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspBloodPressureResultParam$Companion;", "", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspBloodPressureResultParam;", "gdspBloodPressureResultParam", "gdspSleepBloodPressureResultParam", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ GdspBloodPressureResultParam gdspBloodPressureResultParam$default(Companion companion, Calendar calendar, int i, Object obj) {
            if ((i & 1) != 0) {
                calendar = Calendar.getInstance();
            }
            return companion.gdspBloodPressureResultParam(calendar);
        }

        public static /* synthetic */ GdspBloodPressureResultParam gdspSleepBloodPressureResultParam$default(Companion companion, Calendar calendar, int i, Object obj) {
            if ((i & 1) != 0) {
                calendar = Calendar.getInstance();
            }
            return companion.gdspSleepBloodPressureResultParam(calendar);
        }

        @NotNull
        public final GdspBloodPressureResultParam gdspBloodPressureResultParam(@NotNull Calendar startTime) {
            return new GdspBloodPressureResultParam(startTime, 0, 2, null);
        }

        @NotNull
        public final GdspBloodPressureResultParam gdspSleepBloodPressureResultParam(@NotNull Calendar startTime) {
            return new GdspBloodPressureResultParam(startTime, 62);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GdspBloodPressureResultParam() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ GdspBloodPressureResultParam(Calendar calendar, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Calendar.getInstance() : calendar, (i3 & 2) != 0 ? 55 : i2);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends BloodPressureMeasureResult>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public /* bridge */ /* synthetic */ Calendar getStartSyncTime(DataHeader dataHeader, List<? extends BloodPressureMeasureResult> list) {
        return getStartSyncTime2(dataHeader, (List<BloodPressureMeasureResult>) list);
    }

    @Nullable
    /* JADX INFO: renamed from: getStartSyncTime, reason: avoid collision after fix types in other method */
    public Calendar getStartSyncTime2(@Nullable DataHeader header, @NotNull List<BloodPressureMeasureResult> data) {
        BloodPressureMeasureResult bloodPressureMeasureResult = (BloodPressureMeasureResult) CollectionsKt.lastOrNull((List) data);
        if (bloodPressureMeasureResult == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        long j = 1000;
        calendar.setTimeInMillis((bloodPressureMeasureResult.getTimestamp() * j) + j);
        return calendar;
    }

    public GdspBloodPressureResultParam(@NotNull Calendar calendar, int i2) {
        super(calendar, i2, 1);
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends BloodPressureMeasureResult>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspBloodPressureResultParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            public List<BloodPressureMeasureResult> getAllData() {
                DataHeader mDataHeader = getMDataHeader();
                ArrayList arrayList = null;
                if (mDataHeader != null) {
                    int i3 = 0;
                    if (!(mDataHeader.size > 0)) {
                        mDataHeader = null;
                    }
                    if (mDataHeader != null) {
                        byte[] allByteData = getAllByteData();
                        arrayList = new ArrayList();
                        if ((!(allByteData.length == 0)) && allByteData.length % 8 == 0) {
                            while (i3 < allByteData.length) {
                                long jBytesToLong = GattUtils.bytesToLong(allByteData, i3, 4);
                                int i4 = i3 + 4;
                                int i5 = i4 + 1;
                                byte b = allByteData[i4];
                                int i6 = i5 + 1;
                                int unSignInt = AuthModuleKt.toUnSignInt(allByteData[i5]);
                                int i7 = i6 + 1;
                                int unSignInt2 = AuthModuleKt.toUnSignInt(allByteData[i6]);
                                i3 = i7 + 1;
                                arrayList.add(new BloodPressureMeasureResult(jBytesToLong, b, unSignInt2, unSignInt, AuthModuleKt.toUnSignInt(allByteData[i7])));
                            }
                        } else {
                            Debug.fi("BloodPressure", Intrinsics.stringPlus("can not parse blood pressure data by origin data size:", Integer.valueOf(allByteData.length)));
                        }
                        Debug.fi("BloodPressure", Intrinsics.stringPlus("blood pressure result sync data result:", TextUtils.join(";", arrayList)));
                    }
                }
                return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
            }
        };
    }
}
