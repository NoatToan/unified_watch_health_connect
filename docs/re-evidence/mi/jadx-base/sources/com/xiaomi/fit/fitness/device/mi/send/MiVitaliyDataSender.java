package com.xiaomi.fit.fitness.device.mi.send;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.BaseVitaliyData;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.s7r;
import defpackage.ur9;
import defpackage.vu9;
import defpackage.xu9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/send/MiVitaliyDataSender;", "Lcom/xiaomi/fit/fitness/device/BaseVitaliyData;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "report", "", "todayZeroTimeSecond", "Ljava/util/ArrayList;", "Lvu9;", "Lkotlin/collections/ArrayList;", "getVitalityData", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;J)Ljava/util/ArrayList;", "buildCalItemData", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;J)Lvu9;", "", "halfAnHourSecond", "buildStepItemData", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;JI)Lvu9;", "buildStandItemData", "buildStrengthItemData", "dailyGoalReport", "", "sendToWear", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;J)V", "<init>", "()V", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMiVitaliyDataSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiVitaliyDataSender.kt\ncom/xiaomi/fit/fitness/device/mi/send/MiVitaliyDataSender\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n37#2:146\n36#2,3:147\n1557#3:150\n1628#3,3:151\n*S KotlinDebug\n*F\n+ 1 MiVitaliyDataSender.kt\ncom/xiaomi/fit/fitness/device/mi/send/MiVitaliyDataSender\n*L\n27#1:146\n27#1:147,3\n109#1:150\n109#1:151,3\n*E\n"})
public final class MiVitaliyDataSender extends BaseVitaliyData {

    @NotNull
    public static final String TAG = "VitaliyData_MI";

    private final vu9 buildCalItemData(DailyGoalReport report, long todayZeroTimeSecond) {
        Pair<Integer, ArrayList<Integer>> pairBuildCalDataDetail = buildCalDataDetail(report, todayZeroTimeSecond, getHalfAnHourSecond());
        vu9 vu9Var = new vu9();
        vu9Var.c = 2;
        vu9Var.e = 30;
        vu9Var.f = CollectionsKt___CollectionsKt.toIntArray(pairBuildCalDataDetail.getSecond());
        vu9Var.d = pairBuildCalDataDetail.getFirst().intValue();
        return vu9Var;
    }

    private final vu9 buildStandItemData(DailyGoalReport report, long todayZeroTimeSecond, int halfAnHourSecond) {
        List<StandRecord> standDetail;
        ArrayList<Integer> arrayListInitVitaliyDetailData24 = initVitaliyDetailData24();
        DailyStandReport validStandReport = report.getValidStandReport();
        if (validStandReport != null && (standDetail = validStandReport.getStandDetail()) != null) {
            List<StandRecord> list = standDetail;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (StandRecord standRecord : list) {
                int time = (int) ((standRecord.getTime() - todayZeroTimeSecond) / ((long) (halfAnHourSecond * 2)));
                if (time >= 0 && time < arrayListInitVitaliyDetailData24.size()) {
                    arrayListInitVitaliyDetailData24.set(time, Integer.valueOf(standRecord.getStandCount()));
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        FitnessLogUtils.i(BaseVitaliyData.TAG, "Vitaliy Data,before handle, type :stand , list:" + arrayListInitVitaliyDetailData24);
        vu9 vu9Var = new vu9();
        vu9Var.c = 4;
        vu9Var.e = 60;
        vu9Var.f = CollectionsKt___CollectionsKt.toIntArray(arrayListInitVitaliyDetailData24);
        DailyStandReport validStandReport2 = report.getValidStandReport();
        vu9Var.d = validStandReport2 != null ? validStandReport2.getStandCount() : 0;
        return vu9Var;
    }

    private final vu9 buildStepItemData(DailyGoalReport report, long todayZeroTimeSecond, int halfAnHourSecond) {
        Pair<Integer, ArrayList<Integer>> pairBuildStepDataDetail = buildStepDataDetail(report, todayZeroTimeSecond, halfAnHourSecond);
        vu9 vu9Var = new vu9();
        vu9Var.c = 1;
        vu9Var.e = 30;
        vu9Var.f = CollectionsKt___CollectionsKt.toIntArray(pairBuildStepDataDetail.getSecond());
        vu9Var.d = pairBuildStepDataDetail.getFirst().intValue();
        return vu9Var;
    }

    private final vu9 buildStrengthItemData(DailyGoalReport report, long todayZeroTimeSecond, int halfAnHourSecond) {
        Pair<Integer, ArrayList<Integer>> pairBuildStrengthDataDetail = buildStrengthDataDetail(report, todayZeroTimeSecond, halfAnHourSecond);
        vu9 vu9Var = new vu9();
        vu9Var.c = 3;
        vu9Var.e = 30;
        vu9Var.f = CollectionsKt___CollectionsKt.toIntArray(pairBuildStrengthDataDetail.getSecond());
        vu9Var.d = pairBuildStrengthDataDetail.getFirst().intValue();
        return vu9Var;
    }

    private final ArrayList<vu9> getVitalityData(DailyGoalReport report, long todayZeroTimeSecond) {
        ArrayList<vu9> arrayList = new ArrayList<>();
        arrayList.add(buildCalItemData(report, todayZeroTimeSecond));
        arrayList.add(buildStepItemData(report, todayZeroTimeSecond, getHalfAnHourSecond()));
        arrayList.add(buildStandItemData(report, todayZeroTimeSecond, getHalfAnHourSecond()));
        arrayList.add(buildStrengthItemData(report, todayZeroTimeSecond, getHalfAnHourSecond()));
        return arrayList;
    }

    @Override // com.xiaomi.fit.fitness.device.BaseVitaliyData
    public void sendToWear(@NotNull DailyGoalReport dailyGoalReport, long todayZeroTimeSecond) {
        String did;
        Intrinsics.checkNotNullParameter(dailyGoalReport, "dailyGoalReport");
        FitnessLogUtils.i(TAG, "syncActivityDataToDevice , dailyGoalReport:" + dailyGoalReport);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 51;
        ur9 ur9Var = new ur9();
        xu9 xu9Var = new xu9();
        xu9Var.d = (vu9[]) CollectionsKt___CollectionsKt.toList(getVitalityData(dailyGoalReport, todayZeroTimeSecond)).toArray(new vu9[0]);
        ur9Var.T0(xu9Var);
        s7rVar.S(ur9Var);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fit.fitness.device.mi.send.MiVitaliyDataSender.sendToWear.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.i(MiVitaliyDataSender.TAG, "BLE device writeVitaliyData error , did : " + did2);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                FitnessLogUtils.i(MiVitaliyDataSender.TAG, "BLE device writeVitaliyData success , did : " + did2);
            }
        }, 0, 16, (Object) null);
    }
}
