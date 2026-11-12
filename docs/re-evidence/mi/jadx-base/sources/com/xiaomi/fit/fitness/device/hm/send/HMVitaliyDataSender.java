package com.xiaomi.fit.fitness.device.hm.send;

import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.CalorieData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.FatBurningData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StandData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StepsData;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.BaseVitaliyData;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.UserProfileExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/send/HMVitaliyDataSender;", "Lcom/xiaomi/fit/fitness/device/BaseVitaliyData;", "<init>", "()V", "sendToWear", "", "dailyGoalReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "todayZeroTimeSecond", "", "getVitalityData", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "buildCalItemData", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;", "report", "buildStepItemData", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;", "buildStandItemData", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;", "buildStrengthItemData", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHMVitaliyDataSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HMVitaliyDataSender.kt\ncom/xiaomi/fit/fitness/device/hm/send/HMVitaliyDataSender\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1557#2:154\n1628#2,3:155\n1557#2:158\n1628#2,3:159\n*S KotlinDebug\n*F\n+ 1 HMVitaliyDataSender.kt\ncom/xiaomi/fit/fitness/device/hm/send/HMVitaliyDataSender\n*L\n74#1:154\n74#1:155,3\n126#1:158\n126#1:159,3\n*E\n"})
public final class HMVitaliyDataSender extends BaseVitaliyData {

    @NotNull
    public static final String TAG = "VitaliyData_HM";

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.send.HMVitaliyDataSender$sendToWear$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.send.HMVitaliyDataSender$sendToWear$1", f = "HMVitaliyDataSender.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DailyGoalReport $dailyGoalReport;
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        final /* synthetic */ long $todayZeroTimeSecond;
        int label;
        final /* synthetic */ HMVitaliyDataSender this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HuamiApiCaller huamiApiCaller, HMVitaliyDataSender hMVitaliyDataSender, DailyGoalReport dailyGoalReport, long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$huamiDevice = huamiApiCaller;
            this.this$0 = hMVitaliyDataSender;
            this.$dailyGoalReport = dailyGoalReport;
            this.$todayZeroTimeSecond = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$huamiDevice, this.this$0, this.$dailyGoalReport, this.$todayZeroTimeSecond, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zIsSupportActivityData = this.$huamiDevice.isSupportActivityData();
            FitnessLogUtils.i(HMVitaliyDataSender.TAG, "cur huami device is support activity data(san huan):" + zIsSupportActivityData);
            if (zIsSupportActivityData) {
                ArrayList<ActivityData> arrayList = new ArrayList<>();
                arrayList.add(this.this$0.getVitalityData(this.$dailyGoalReport, this.$todayZeroTimeSecond));
                this.$huamiDevice.syncActivityDataToDevice(arrayList);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final CalorieData buildCalItemData(DailyGoalReport report, long todayZeroTimeSecond) {
        Pair<Integer, ArrayList<Integer>> pairBuildCalDataDetail = buildCalDataDetail(report, todayZeroTimeSecond, getHalfAnHourSecond());
        int iIntValue = pairBuildCalDataDetail.getFirst().intValue();
        ArrayList<Integer> second = pairBuildCalDataDetail.getSecond();
        Integer itemGoal = report.getItemGoal(2);
        return new CalorieData(iIntValue, second, itemGoal != null ? itemGoal.intValue() : 0, 0, 0);
    }

    private final StandData buildStandItemData(DailyGoalReport report, long todayZeroTimeSecond) {
        List<StandRecord> standDetail;
        ArrayList<Integer> arrayListInitVitaliyDetailData24 = initVitaliyDetailData24();
        DailyStandReport validStandReport = report.getValidStandReport();
        if (validStandReport != null && (standDetail = validStandReport.getStandDetail()) != null) {
            List<StandRecord> list = standDetail;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (StandRecord standRecord : list) {
                arrayListInitVitaliyDetailData24.set((int) ((standRecord.getTime() - todayZeroTimeSecond) / ((long) (getHalfAnHourSecond() * 2))), Integer.valueOf(standRecord.getStandCount()));
                arrayList.add(Unit.INSTANCE);
            }
        }
        FitnessLogUtils.i(TAG, "vitaliy data type :stand , list:" + arrayListInitVitaliyDetailData24);
        DailyStandReport validStandReport2 = report.getValidStandReport();
        int standCount = validStandReport2 != null ? validStandReport2.getStandCount() : 0;
        Integer itemGoal = report.getItemGoal(3);
        return new StandData(standCount, arrayListInitVitaliyDetailData24, itemGoal != null ? itemGoal.intValue() : 0, 0, 0);
    }

    private final StepsData buildStepItemData(DailyGoalReport report, long todayZeroTimeSecond) {
        Pair<Integer, ArrayList<Integer>> pairBuildStepDataDetail = buildStepDataDetail(report, todayZeroTimeSecond, getHalfAnHourSecond());
        int iIntValue = pairBuildStepDataDetail.getFirst().intValue();
        ArrayList<Integer> second = pairBuildStepDataDetail.getSecond();
        Integer itemGoal = report.getItemGoal(1);
        return new StepsData(iIntValue, second, itemGoal != null ? itemGoal.intValue() : 0, 0);
    }

    private final FatBurningData buildStrengthItemData(DailyGoalReport report, long todayZeroTimeSecond) {
        Pair<Integer, ArrayList<Integer>> pairBuildStrengthDataDetail = buildStrengthDataDetail(report, todayZeroTimeSecond, getHalfAnHourSecond());
        int iIntValue = pairBuildStrengthDataDetail.getFirst().intValue();
        ArrayList<Integer> second = pairBuildStrengthDataDetail.getSecond();
        Integer itemGoal = report.getItemGoal(4);
        return new FatBurningData(iIntValue, second, itemGoal != null ? itemGoal.intValue() : 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityData getVitalityData(DailyGoalReport dailyGoalReport, long todayZeroTimeSecond) {
        Object obj;
        CalorieData calorieDataBuildCalItemData = buildCalItemData(dailyGoalReport, todayZeroTimeSecond);
        StepsData stepsDataBuildStepItemData = buildStepItemData(dailyGoalReport, todayZeroTimeSecond);
        StandData standDataBuildStandItemData = buildStandItemData(dailyGoalReport, todayZeroTimeSecond);
        FatBurningData fatBurningDataBuildStrengthItemData = buildStrengthItemData(dailyGoalReport, todayZeroTimeSecond);
        List<Integer> rainbowItemTypes = UserProfileExtKt.getRainbowItemTypes(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(rainbowItemTypes, 10));
        Iterator<T> it = rainbowItemTypes.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            FitnessLogUtils.i(TAG, "goal item : " + iIntValue);
            if (iIntValue == 3) {
                obj = Unit.INSTANCE;
                i = 0;
            } else if (iIntValue != 4) {
                obj = 0;
            } else {
                obj = Unit.INSTANCE;
                i = 1;
            }
            arrayList.add(obj);
        }
        FitnessLogUtils.i(TAG, "VitaliyData , standOrBurn:" + i);
        return new ActivityData((int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), 0.0f, 0, 0, false, i, stepsDataBuildStepItemData, calorieDataBuildCalItemData, fatBurningDataBuildStrengthItemData, null, standDataBuildStandItemData);
    }

    @Override // com.xiaomi.fit.fitness.device.BaseVitaliyData
    public void sendToWear(@NotNull DailyGoalReport dailyGoalReport, long todayZeroTimeSecond) {
        String mac;
        Intrinsics.checkNotNullParameter(dailyGoalReport, "dailyGoalReport");
        FitnessLogUtils.i(TAG, "syncActivityDataToDevice");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            FitnessLogUtils.i(TAG, "writeVitaliyData , deviceModel Conditions not met");
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel2 == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel2)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        if (huaMiApiCaller == null) {
            FitnessLogUtils.i(TAG, "writeVitaliyData , huamiDevice == null");
        } else {
            ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(huaMiApiCaller, this, dailyGoalReport, todayZeroTimeSecond, null));
        }
    }
}
