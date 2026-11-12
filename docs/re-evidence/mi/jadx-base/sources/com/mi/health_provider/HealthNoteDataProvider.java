package com.mi.health_provider;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.mi.health_provider.HealthNoteDataProvider;
import com.miui.tsmclient.entity.UIConfig;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.MedicalAidRecord;
import com.xiaomi.fit.fitness.export.data.item.RecentAbnormalDataItem;
import com.xiaomi.fit.fitness.export.data.item.RecentDailyDataItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRecord;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRepositoryExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0017\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\u001c\u0010\u001d\u001a\u00020\u00102\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000eJ\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u000fH\u0002J\u0018\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020\u000fH\u0002J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010&\u001a\u00020)2\u0006\u0010$\u001a\u00020\u000fH\u0002J\u0018\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002J\"\u0010.\u001a\u0004\u0018\u00010/2\u000e\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\u0006\u0010-\u001a\u00020,H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/mi/health_provider/HealthNoteDataProvider;", "", "<init>", "()V", "countDownTimer", "Ljava/util/Timer;", "fitnessSyncer", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "getFitnessSyncer", "()Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "fitnessSyncer$delegate", "Lkotlin/Lazy;", "mRecentDailyData", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Lcom/xiaomi/fit/fitness/export/data/item/RecentDailyDataItem;", "", "syncStatus", "", "dataReceiverRegistered", "", "deviceReceiverRegistered", "mDataChangedReceiver", "com/mi/health_provider/HealthNoteDataProvider$mDataChangedReceiver$1", "Lcom/mi/health_provider/HealthNoteDataProvider$mDataChangedReceiver$1;", "mDeviceStatusListener", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "requireDataAndClearAll", "startCountDownTimer", "getHealthDailyRecord", "recentDailyData", "getMedicalAidRecord", "Lcom/xiaomi/fit/fitness/export/data/item/MedicalAidRecord;", "stopCountDownTimer", "getDataChanged", "requireData", "dailyItem", "competeHrReport", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "competeSpo2Report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "judgeTimeValid", "recordTime", "", UIConfig.KEY_CURRENT_TIME, "getAbnormalRecordData", "Lcom/xiaomi/fit/fitness/export/data/item/RecentAbnormalDataItem;", "abnormalHrHighRecords", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "Companion", "health-provider_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthNoteDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthNoteDataProvider.kt\ncom/mi/health_provider/HealthNoteDataProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,305:1\n1863#2,2:306\n1863#2,2:308\n*S KotlinDebug\n*F\n+ 1 HealthNoteDataProvider.kt\ncom/mi/health_provider/HealthNoteDataProvider\n*L\n286#1:306,2\n229#1:308,2\n*E\n"})
public final class HealthNoteDataProvider {
    public static final int RUNNING_SYNC = 2;

    @NotNull
    public static final String TAG = "HealthNoteDataProvider";
    public static final int WAIT_SYNC = 1;

    @Nullable
    private Timer countDownTimer;
    private boolean dataReceiverRegistered;
    private boolean deviceReceiverRegistered;

    /* JADX INFO: renamed from: fitnessSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fitnessSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o0c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HealthNoteDataProvider.fitnessSyncer_delegate$lambda$0();
        }
    });

    @NotNull
    private final CopyOnWriteArrayList<Function1<RecentDailyDataItem, Unit>> mRecentDailyData = new CopyOnWriteArrayList<>();
    private int syncStatus = 1;

    @NotNull
    private final HealthNoteDataProvider$mDataChangedReceiver$1 mDataChangedReceiver = new BroadcastReceiver() { // from class: com.mi.health_provider.HealthNoteDataProvider$mDataChangedReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent != null ? intent.getAction() : null;
            if (action != null && action.hashCode() == 1484986885 && action.equals("recent_data_changed_broadcast")) {
                String stringExtra = intent.getStringExtra(FitnessDataConstants.EXTRA_DATA_CHANGED_REASON);
                intent.getIntExtra("error_code", -1);
                boolean booleanExtra = intent.getBooleanExtra(FitnessDataConstants.EXTRA_BOOLEAN_RESULT, true);
                if (Intrinsics.areEqual(stringExtra, "device_sync") && booleanExtra) {
                    this.this$0.requireDataAndClearAll();
                }
            }
        }
    };

    @NotNull
    private final OnDeviceStatusListener mDeviceStatusListener = new OnDeviceFullStatusListener() { // from class: com.mi.health_provider.HealthNoteDataProvider$mDeviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
            Logger.i(HealthNoteDataProvider.TAG, "onConnectFailure");
            this.this$0.requireDataAndClearAll();
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
            super.onConnectStart(did);
            Logger.i(HealthNoteDataProvider.TAG, "onConnectStart");
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            Logger.i(HealthNoteDataProvider.TAG, "onConnectSuccess");
            this.this$0.getFitnessSyncer().triggerDataSync(true);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
        public void onDestroy(String did, boolean isRemoved) {
            super.onDestroy(did, isRemoved);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            Logger.i(HealthNoteDataProvider.TAG, "onDisconnect");
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
        public void onInit(String did, boolean isReadded) {
            super.onInit(did, isReadded);
        }
    };

    private final void competeHrReport(DailyHrReport report, RecentDailyDataItem dailyItem) {
        if (report.getLatestHrRecord() != null) {
            HrItem latestHrRecord = report.getLatestHrRecord();
            Intrinsics.checkNotNull(latestHrRecord);
            if (judgeTimeValid(latestHrRecord.getTime(), dailyItem.getTime())) {
                dailyItem.setLastHrItem(report.getLatestHrRecord());
            }
        }
        dailyItem.setAbnormalHighHrItem(getAbnormalRecordData(report.getAbnormalHrHighRecords(), dailyItem.getTime()));
        dailyItem.setAbnormalLowHrItem(getAbnormalRecordData(report.getAbnormalHrLowRecords(), dailyItem.getTime()));
    }

    private final void competeSpo2Report(DailySpo2Report report, RecentDailyDataItem dailyItem) {
        if (report.getLatestSpoRecord() != null) {
            Spo2Item latestSpoRecord = report.getLatestSpoRecord();
            Intrinsics.checkNotNull(latestSpoRecord);
            if (judgeTimeValid(latestSpoRecord.getTime(), dailyItem.getTime())) {
                dailyItem.setLasSpo2Item(report.getLatestSpoRecord());
            }
        }
        dailyItem.setAbnormalSpo2Item(getAbnormalRecordData(report.getAbnormalSpo2Records(), dailyItem.getTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessSyncer fitnessSyncer_delegate$lambda$0() {
        return FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE);
    }

    private final RecentAbnormalDataItem getAbnormalRecordData(List<SegmentItem> abnormalHrHighRecords, long currentTime) {
        List<SegmentItem> list = abnormalHrHighRecords;
        if (list != null && !list.isEmpty()) {
            SegmentItem segmentItem = abnormalHrHighRecords.get(0);
            if (!judgeTimeValid(segmentItem.getStartTime(), currentTime)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            List<AbnormalItem> items = segmentItem.getItems();
            if (items != null) {
                for (AbnormalItem abnormalItem : items) {
                    if (abnormalItem.getValue() > 0) {
                        arrayList.add(Integer.valueOf(abnormalItem.getValue()));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new RecentAbnormalDataItem(segmentItem.getStartTime(), segmentItem.getEndTime(), ArrayUtils.getMinValueInArray(arrayList), ArrayUtils.getMaxValueInArray(arrayList), arrayList.size() > 0);
            }
        }
        return null;
    }

    private final void getDataChanged() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("recent_data_changed_broadcast");
        intentFilter.addAction(FitnessDataConstants.ACTION_DATA_LIST_CHANGED_BROADCAST);
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(this.mDataChangedReceiver, intentFilter, 4);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(this.mDataChangedReceiver, intentFilter);
        }
        this.dataReceiverRegistered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessSyncer getFitnessSyncer() {
        return (FitnessSyncer) this.fitnessSyncer.getValue();
    }

    private final boolean judgeTimeValid(long recordTime, long currentTime) {
        return recordTime > currentTime - TimeDateUtil.TIME_HOUR;
    }

    private final void requireData(final RecentDailyDataItem dailyItem) {
        FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository().getHomeData(CollectionsKt__CollectionsKt.listOf((Object[]) new HomeDataType[]{HomeDataType.HR, HomeDataType.SPO2}), new Function1() { // from class: p0c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthNoteDataProvider.requireData$lambda$2(this.f29867a, dailyItem, (Map) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requireData$lambda$2(HealthNoteDataProvider this$0, RecentDailyDataItem dailyItem, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dailyItem, "$dailyItem");
        if (map != null) {
            HomeDataType homeDataType = HomeDataType.HR;
            if (map.containsKey(homeDataType)) {
                Object obj = map.get(homeDataType);
                Logger.i(TAG, "home stepLiveData observer result:" + obj);
                if (obj instanceof DailyHrReport) {
                    this$0.competeHrReport((DailyHrReport) obj, dailyItem);
                }
            }
        }
        if (map != null) {
            HomeDataType homeDataType2 = HomeDataType.SPO2;
            if (map.containsKey(homeDataType2)) {
                Object obj2 = map.get(homeDataType2);
                Logger.i(TAG, "home stepLiveData observer result:" + obj2);
                if (obj2 instanceof DailySpo2Report) {
                    this$0.competeSpo2Report((DailySpo2Report) obj2, dailyItem);
                }
            }
        }
        Logger.i(TAG, "RecentDailyDataItem " + dailyItem);
        if (!this$0.mRecentDailyData.isEmpty()) {
            try {
                Iterator<T> it = this$0.mRecentDailyData.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke2(dailyItem);
                }
                this$0.mRecentDailyData.clear();
            } catch (Exception e) {
                Logger.e(TAG, "mRecentDailyData", e);
            }
        }
        this$0.syncStatus = 1;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requireDataAndClearAll() {
        requireData(new RecentDailyDataItem(System.currentTimeMillis() / ((long) 1000), null, null, null, null, null, 62, null));
        Timer timer = this.countDownTimer;
        if (timer != null) {
            if (timer != null) {
                timer.cancel();
            }
            this.countDownTimer = null;
        }
        if (this.dataReceiverRegistered) {
            ApplicationExtKt.getApplication().unregisterReceiver(this.mDataChangedReceiver);
            this.dataReceiverRegistered = false;
        }
        if (this.deviceReceiverRegistered) {
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.mDeviceStatusListener);
            this.deviceReceiverRegistered = false;
        }
    }

    private final void startCountDownTimer() {
        stopCountDownTimer();
        Timer timer = new Timer();
        this.countDownTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.mi.health_provider.HealthNoteDataProvider.startCountDownTimer.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                HealthNoteDataProvider.this.requireDataAndClearAll();
            }
        }, 10000L);
    }

    private final void stopCountDownTimer() {
        Timer timer = this.countDownTimer;
        if (timer != null) {
            if (timer != null) {
                timer.cancel();
            }
            this.countDownTimer = null;
        }
    }

    public final void getHealthDailyRecord(@NotNull Function1<? super RecentDailyDataItem, Unit> recentDailyData) {
        Intrinsics.checkNotNullParameter(recentDailyData, "recentDailyData");
        this.mRecentDailyData.add(recentDailyData);
        int i = this.syncStatus;
        if (i == 2) {
            FitnessLogUtils.i(TAG, "getHealthDailyRecord: syncStatus " + i);
            return;
        }
        this.syncStatus = 2;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        if (((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel()) == null) {
            FitnessLogUtils.i(TAG, "triggerDataSync: no bound device");
            requireDataAndClearAll();
            return;
        }
        getDataChanged();
        startCountDownTimer();
        if (DeviceManagerExtKt.getInstance(companion).isConnected()) {
            Logger.i(TAG, "triggerDataSync HealthNoteDataProvider");
            getFitnessSyncer().triggerDataSync(true);
        } else {
            Logger.i(TAG, "triggerDataSync connectDevice()");
            DeviceManager.DefaultImpls.connectDevice$default(DeviceManagerExtKt.getInstance(companion), null, 1, null);
            DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(this.mDeviceStatusListener);
            this.deviceReceiverRegistered = true;
        }
    }

    @NotNull
    public final MedicalAidRecord getMedicalAidRecord() {
        IMedicalIdRepository.Companion companion = IMedicalIdRepository.INSTANCE;
        MedicalIdRecord medicalIdRecord = MedicalIdRepositoryExtKt.getInstance(companion).getMedicalIdRecord();
        int age = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getAge();
        return new MedicalAidRecord(medicalIdRecord.getName(), medicalIdRecord.getGender() == 0 ? null : MedicalIdRepositoryExtKt.getInstance(companion).getGenderString(), age > 0 ? String.valueOf(age) : null, medicalIdRecord.getBloodType() == 0 ? null : MedicalIdRepositoryExtKt.getInstance(companion).getBloodString(medicalIdRecord.getBloodType()), medicalIdRecord.getAllergyDrugs(), medicalIdRecord.getChronic(), medicalIdRecord.getTreatment());
    }
}
