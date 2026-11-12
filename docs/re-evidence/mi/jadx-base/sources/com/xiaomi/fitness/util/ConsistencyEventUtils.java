package com.xiaomi.fitness.util;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/util/ConsistencyEventUtils;", "", "<init>", "()V", "TAG", "", "reportCardInfo", "", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "cardName", "average", "", VibrateModeSetFragment.MAX, "min", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConsistencyEventUtils {

    @NotNull
    public static final ConsistencyEventUtils INSTANCE = new ConsistencyEventUtils();

    @NotNull
    private static final String TAG = "ConsistencyEventUtils";

    private ConsistencyEventUtils() {
    }

    public final void reportCardInfo(@Nullable SportBasicReport report, @NotNull String cardName, @Nullable Float average, @Nullable Float max, @Nullable Float min) {
        String sid;
        String sid2;
        WearableDeviceInfo deviceInfo;
        String model;
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        try {
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            if (report == null || (sid = report.getSid()) == null) {
                sid = "";
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(sid);
            Pair[] pairArr = new Pair[7];
            pairArr[0] = TuplesKt.to("tip", "56.112.0.1.41727");
            pairArr[1] = TuplesKt.to("name", cardName);
            pairArr[2] = TuplesKt.to("sport_type", String.valueOf(report != null ? Integer.valueOf(report.getSportType()) : null));
            String str = "xiaomiwear_app";
            if (report == null || (sid2 = report.getSid()) == null) {
                sid2 = "xiaomiwear_app";
            }
            pairArr[3] = TuplesKt.to("sport_sid", sid2);
            pairArr[4] = TuplesKt.to("time", String.valueOf(report != null ? Long.valueOf(report.getStartTime()) : null));
            SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(report != null ? report.getSportType() : 0);
            pairArr[5] = TuplesKt.to("key", String.valueOf(sportReportKey != null ? sportReportKey.getKey() : null));
            if (wearableDeviceModel != null && (deviceInfo = wearableDeviceModel.getDeviceInfo()) != null && (model = deviceInfo.getModel()) != null) {
                str = model;
            }
            pairArr[6] = TuplesKt.to("device_model", str);
            HashMap mapHashMapOf = MapsKt__MapsKt.hashMapOf(pairArr);
            if (average != null) {
                mapHashMapOf.put("average", Float.valueOf(average.floatValue()));
            }
            if (max != null) {
                mapHashMapOf.put(VibrateModeSetFragment.MAX, Float.valueOf(max.floatValue()));
            }
            if (min != null) {
                mapHashMapOf.put("min", Float.valueOf(min.floatValue()));
            }
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, mapHashMapOf);
        } catch (Exception e) {
            Logger.e(TAG, "reportCardInfo", e);
        }
    }
}
