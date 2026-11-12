package com.xiaomi.fitness.health.todayhealth;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository;
import com.xiaomi.fit.fitness.export.api.repository.IStressRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.AmbulatoryBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.todayhealth.TodayHealthExtKt;
import com.xiaomi.fitness.health.todayhealth.model.HeartHealthValueItem;
import com.xiaomi.fitness.health.todayhealth.ui.items.AbnormalSingleLastDataAdapter;
import defpackage.c0j;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007\u001a\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007\u001a\u0014\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u001a\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002\"\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"retrieveTodayHealth", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "checkedItemMap", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "getHealthTypeNameByHealth", "", "healthType", "getAbnormalTitleByAbnormalType", "type", "getAbnormalInstructionByAbnormalType", "data", "", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleLastDataAdapter$LastDataModel;", "getTimeStr", "model", "ABNORMAL_TYPE_HEART_RATE_FIB", "ABNORMAL_TYPE_HEART_RATE_HIGH", "ABNORMAL_TYPE_HEART_RATE_LOW", "ABNORMAL_TYPE_SPO2_LOW", "ABNORMAL_TYPE_STRESS_MILD", "ABNORMAL_TYPE_STRESS_MODERATE", "ABNORMAL_TYPE_STRESS_SEVERE", "ABNORMAL_TYPE_LONG_SLEEP_DURATION_SHORT", "ABNORMAL_TYPE_LONG_SLEEP_DURATION_LONG", "ABNORMAL_TYPE_SLEEP_AVG_HR_LOW", "ABNORMAL_TYPE_SLEEP_AVG_HR_HIGH", "ABNORMAL_TYPE_SLEEP_AVG_SPO2_ABNORMAL", "ABNORMAL_TYPE_HEART_HEALTH_ABNORMAL", "ABNORMAL_TYPE_BLOOD_PRESSURE_DIPPING_ABNORMAL", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTodayHealthExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthExt.kt\ncom/xiaomi/fitness/health/todayhealth/TodayHealthExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n1863#2,2:289\n295#2,2:291\n*S KotlinDebug\n*F\n+ 1 TodayHealthExt.kt\ncom/xiaomi/fitness/health/todayhealth/TodayHealthExtKt\n*L\n136#1:289,2\n91#1:291,2\n*E\n"})
public final class TodayHealthExtKt {
    public static final int ABNORMAL_TYPE_BLOOD_PRESSURE_DIPPING_ABNORMAL = 13;
    public static final int ABNORMAL_TYPE_HEART_HEALTH_ABNORMAL = 12;
    public static final int ABNORMAL_TYPE_HEART_RATE_FIB = 0;
    public static final int ABNORMAL_TYPE_HEART_RATE_HIGH = 1;
    public static final int ABNORMAL_TYPE_HEART_RATE_LOW = 2;
    public static final int ABNORMAL_TYPE_LONG_SLEEP_DURATION_LONG = 8;
    public static final int ABNORMAL_TYPE_LONG_SLEEP_DURATION_SHORT = 7;
    public static final int ABNORMAL_TYPE_SLEEP_AVG_HR_HIGH = 10;
    public static final int ABNORMAL_TYPE_SLEEP_AVG_HR_LOW = 9;
    public static final int ABNORMAL_TYPE_SLEEP_AVG_SPO2_ABNORMAL = 11;
    public static final int ABNORMAL_TYPE_SPO2_LOW = 3;
    public static final int ABNORMAL_TYPE_STRESS_MILD = 4;
    public static final int ABNORMAL_TYPE_STRESS_MODERATE = 5;
    public static final int ABNORMAL_TYPE_STRESS_SEVERE = 6;

    @NotNull
    public static final String getAbnormalInstructionByAbnormalType(@NotNull List<AbnormalSingleLastDataAdapter.LastDataModel> data) {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = "";
        for (AbnormalSingleLastDataAdapter.LastDataModel lastDataModel : data) {
            String timeStr = getTimeStr(lastDataModel);
            switch (lastDataModel.getAbnormalType()) {
                case 0:
                    objValueOf = Integer.valueOf(c0j.xn);
                    break;
                case 1:
                    objValueOf = ResourceExtKt.getString(c0j.yn, timeStr);
                    break;
                case 2:
                    objValueOf = ResourceExtKt.getString(c0j.zn, timeStr);
                    break;
                case 3:
                    objValueOf = ResourceExtKt.getString(c0j.Cn, timeStr);
                    break;
                case 4:
                    objValueOf = ResourceExtKt.getString(c0j.Fn);
                    break;
                case 5:
                    objValueOf = ResourceExtKt.getString(c0j.Gn);
                    break;
                case 6:
                    objValueOf = ResourceExtKt.getString(c0j.In);
                    break;
                case 7:
                    objValueOf = ResourceExtKt.getString(c0j.Sn);
                    break;
                case 8:
                    objValueOf = ResourceExtKt.getString(c0j.Qn);
                    break;
                case 9:
                    objValueOf = ResourceExtKt.getString(c0j.Mn, timeStr);
                    break;
                case 10:
                    objValueOf = ResourceExtKt.getString(c0j.Ln, timeStr);
                    break;
                case 11:
                    objValueOf = ResourceExtKt.getString(c0j.Pn, timeStr);
                    break;
                default:
                    objValueOf = Integer.valueOf(c0j.t);
                    break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) string);
            sb.append(objValueOf);
            string = sb.toString();
        }
        return string;
    }

    @NotNull
    public static final String getAbnormalTitleByAbnormalType(int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = c0j.c9;
                break;
            case 1:
                i2 = c0j.Ql;
                break;
            case 2:
                i2 = c0j.Rl;
                break;
            case 3:
                i2 = c0j.Vk;
                break;
            case 4:
                i2 = c0j.Al;
                break;
            case 5:
                i2 = c0j.Cl;
                break;
            case 6:
                i2 = c0j.Hl;
                break;
            case 7:
                i2 = c0j.Rn;
                break;
            case 8:
            case 10:
            default:
                i2 = c0j.t;
                break;
            case 9:
                i2 = c0j.Nn;
                break;
            case 11:
                i2 = c0j.On;
                break;
        }
        return ResourceExtKt.getString(i2);
    }

    @NotNull
    public static final String getHealthTypeNameByHealth(int i) {
        if (i == -2) {
            return ResourceExtKt.getString(c0j.mi);
        }
        if (i == -1) {
            return ResourceExtKt.getString(c0j.Vf);
        }
        if (i == 4) {
            return ResourceExtKt.getString(c0j.k7);
        }
        if (i == 13) {
            return ResourceExtKt.getString(c0j.N4);
        }
        if (i == 6) {
            return ResourceExtKt.getString(c0j.jh);
        }
        if (i == 7) {
            return ResourceExtKt.getString(c0j.v7);
        }
        if (i != 25) {
            return i != 26 ? "" : ResourceExtKt.getString(c0j.O4);
        }
        return ResourceExtKt.getString(c0j.P4);
    }

    private static final String getTimeStr(AbnormalSingleLastDataAdapter.LastDataModel lastDataModel) {
        Object data = lastDataModel.getData();
        switch (lastDataModel.getAbnormalType()) {
            case 0:
                if (!(data instanceof AbnormalFibItem)) {
                    return "";
                }
                AbnormalFibItem abnormalFibItem = (AbnormalFibItem) data;
                String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(abnormalFibItem.getStartTime());
                abnormalFibItem.getDuration();
                return dateHHmm24Format + "-" + TimeDateUtil.getDateHHmm24Format(abnormalFibItem.getEndTime());
            case 1:
            case 2:
            case 3:
                return data instanceof AbnormalItem ? TimeDateUtil.getDateHHmm24Format(((AbnormalItem) data).getTime()) : "";
            case 4:
            case 5:
            case 6:
                return data instanceof StressItem ? TimeDateUtil.getDateHHmm24Format(((StressItem) data).getTime()) : "";
            case 7:
            case 8:
                if (!(data instanceof SleepSegmentReport)) {
                    return "";
                }
                SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) data;
                return TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getBedTime()) + "-" + TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getWakeupTime());
            case 9:
                if (!(data instanceof SleepSegmentReport)) {
                    return "";
                }
                SleepSegmentReport sleepSegmentReport2 = (SleepSegmentReport) data;
                return TimeDateUtil.getDateHHmm24Format(sleepSegmentReport2.getBedTime()) + "-" + TimeDateUtil.getDateHHmm24Format(sleepSegmentReport2.getWakeupTime());
            case 10:
            default:
                return "";
            case 11:
                if (!(data instanceof SleepSegmentReport)) {
                    return "";
                }
                SleepSegmentReport sleepSegmentReport3 = (SleepSegmentReport) data;
                return TimeDateUtil.getDateHHmm24Format(sleepSegmentReport3.getBedTime()) + "-" + TimeDateUtil.getDateHHmm24Format(sleepSegmentReport3.getWakeupTime());
            case 12:
                return data instanceof HeartHealthValueItem ? TimeDateUtil.getDateHHmm24Format(((HeartHealthValueItem) data).getTime()) : "";
            case 13:
                return data instanceof AmbulatoryBloodPressureReport ? TimeDateUtil.getDateHHmm24Format(((AmbulatoryBloodPressureReport) data).getTime()) : "";
        }
    }

    public static final void retrieveTodayHealth(@NotNull LifecycleOwner lifecycleOwner, @NotNull final MutableLiveData<ConcurrentHashMap<Integer, Object>> checkedItemMap) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(checkedItemMap, "checkedItemMap");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateNow);
        IRepositoryProvider.Companion companion = IRepositoryProvider.INSTANCE;
        LiveData reportList$default = IRepository.DefaultImpls.getReportList$default((IHeartRateRepository) FitnessDataExtKt.getInstance(companion).getRepository(IHeartRateRepository.class), wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, "days", jChangZeroOfTheDay, 0, 0, false, 32, null);
        checkedItemMap.setValue(new ConcurrentHashMap<>());
        final String str = "retrieveTodayHealth";
        reportList$default.observe(lifecycleOwner, new TodayHealthExtKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vgp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodayHealthExtKt.retrieveTodayHealth$lambda$0(str, checkedItemMap, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default((ISpo2Repository) FitnessDataExtKt.getInstance(companion).getRepository(ISpo2Repository.class), wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, "days", jChangZeroOfTheDay, 0, 0, false, 32, null).observe(lifecycleOwner, new TodayHealthExtKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wgp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodayHealthExtKt.retrieveTodayHealth$lambda$1(str, checkedItemMap, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default((IStressRepository) FitnessDataExtKt.getInstance(companion).getRepository(IStressRepository.class), wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, "days", jChangZeroOfTheDay, 0, 0, false, 32, null).observe(lifecycleOwner, new TodayHealthExtKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xgp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodayHealthExtKt.retrieveTodayHealth$lambda$2(str, checkedItemMap, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default((ISleepRepository) FitnessDataExtKt.getInstance(companion).getRepository(ISleepRepository.class), wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, "days", jChangZeroOfTheDay, 0, 0, false, 32, null).observe(lifecycleOwner, new TodayHealthExtKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ygp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodayHealthExtKt.retrieveTodayHealth$lambda$4(str, checkedItemMap, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit retrieveTodayHealth$lambda$0(String tag, MutableLiveData checkedItemMap, List list) {
        HrItem latestHrRecord;
        Intrinsics.checkNotNullParameter(tag, "$tag");
        Intrinsics.checkNotNullParameter(checkedItemMap, "$checkedItemMap");
        Intrinsics.checkNotNull(list);
        DailyHrReport dailyHrReport = (DailyHrReport) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (dailyHrReport != null && (latestHrRecord = dailyHrReport.getLatestHrRecord()) != null) {
            Logger.d(tag, "retrieveTodayHealth latestHrItem=" + latestHrRecord);
            int hr = latestHrRecord.getHr();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) checkedItemMap.getValue();
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
            }
            concurrentHashMap.put(4, Integer.valueOf(hr));
            checkedItemMap.postValue(concurrentHashMap);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit retrieveTodayHealth$lambda$1(String tag, MutableLiveData checkedItemMap, List list) {
        Spo2Item latestSpoRecord;
        Intrinsics.checkNotNullParameter(tag, "$tag");
        Intrinsics.checkNotNullParameter(checkedItemMap, "$checkedItemMap");
        Intrinsics.checkNotNull(list);
        DailySpo2Report dailySpo2Report = (DailySpo2Report) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (dailySpo2Report != null && (latestSpoRecord = dailySpo2Report.getLatestSpoRecord()) != null) {
            int spo2 = latestSpoRecord.getSpo2();
            Logger.d(tag, "retrieveTodayHealth latestSpo2Record=" + latestSpoRecord);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) checkedItemMap.getValue();
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
            }
            concurrentHashMap.put(13, Integer.valueOf(spo2));
            checkedItemMap.postValue(concurrentHashMap);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit retrieveTodayHealth$lambda$2(String tag, MutableLiveData checkedItemMap, List list) {
        StressItem latestStressRecord;
        Intrinsics.checkNotNullParameter(tag, "$tag");
        Intrinsics.checkNotNullParameter(checkedItemMap, "$checkedItemMap");
        Intrinsics.checkNotNull(list);
        DailyStressReport dailyStressReport = (DailyStressReport) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (dailyStressReport != null && (latestStressRecord = dailyStressReport.getLatestStressRecord()) != null) {
            Logger.d(tag, "retrieveTodayHealth latestStressItem=" + latestStressRecord);
            int stress = latestStressRecord.getStress();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) checkedItemMap.getValue();
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
            }
            concurrentHashMap.put(7, Integer.valueOf(stress));
            checkedItemMap.postValue(concurrentHashMap);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit retrieveTodayHealth$lambda$4(String tag, MutableLiveData checkedItemMap, List list) {
        Intrinsics.checkNotNullParameter(tag, "$tag");
        Intrinsics.checkNotNullParameter(checkedItemMap, "$checkedItemMap");
        Intrinsics.checkNotNull(list);
        AllDaySleepReport allDaySleepReport = (AllDaySleepReport) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (allDaySleepReport == null) {
            return Unit.INSTANCE;
        }
        List<SleepSegmentReport> sleepSegments = allDaySleepReport.getSleepSegments();
        if (sleepSegments != null && !sleepSegments.isEmpty()) {
            List<SleepSegmentReport> sleepSegments2 = allDaySleepReport.getSleepSegments();
            SleepSegmentReport sleepSegmentReport = null;
            Object obj = null;
            if (sleepSegments2 != null) {
                for (Object obj2 : sleepSegments2) {
                    if (((SleepSegmentReport) obj2).getSleepDuration() > 180) {
                        obj = obj2;
                        break;
                    }
                }
                sleepSegmentReport = (SleepSegmentReport) obj;
            }
            Logger.d(tag, "retrieveTodayHealth segment=" + sleepSegmentReport);
            if (sleepSegmentReport != null && sleepSegmentReport.hasStageData()) {
                int sleepDuration = sleepSegmentReport.getSleepDuration();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) checkedItemMap.getValue();
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                concurrentHashMap.put(6, Integer.valueOf(sleepDuration));
                checkedItemMap.postValue(concurrentHashMap);
            }
        }
        return Unit.INSTANCE;
    }
}
