package com.xiaomi.hm.health.heartrate;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.huami.heartrate.Platform;
import com.huami.heartrate.dto.RestingHeartRate;
import com.huami.heartrate.koin.IHeartRateDataDelegate;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.resting.ui.RestingHeartRateActivity;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.dataflow.HealthData;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.heartrate.HeartRateDataImpl;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import com.xiaomi.hm.health.ui.heartrate.HRDataManager;
import com.xiaomi.hm.health.ui.heartrate.HeartRateDetailActivity;
import com.xiaomi.hm.health.ui.heartrate.HeartRateUtils;
import com.xiaomi.hm.health.ui.information.HrRestingChartFragment;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J.\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J.\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016J(\u0010&\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0002H\u0016J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010)\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010*\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/heartrate/HeartRateDataImpl;", "Lcom/huami/heartrate/koin/IHeartRateDataDelegate;", "", "dateFrom", "dateEnd", "", "userId", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/heartrate/dto/RestingHeartRate;", "fetchRestingHeartRate", "getAppName", "Lcom/huami/heartrate/Platform;", "getPlatform", "Ljava/util/Calendar;", "getSyncTime", "dayFrom", "dayEnd", "", "", "getWholeDayHeartRateData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isOpenWholeDayHr", "isShowRestingHRItem", "isSupportAtrialFib", "isWatchName", "()Ljava/lang/Boolean;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "item", "", "deleteRequestCode", "", "launchHeartRateDetailActivityForResult", "userAge", "selectedDateTimeInMillis", "launchRestingHRActivity", "date", "observeWholeDayHrDataChanged", "preLoadAllData", "queryRestHeartRateByDay", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HeartRateDataImpl implements IHeartRateDataDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.heartrate.HeartRateDataImpl$observeWholeDayHrDataChanged$1", f = "HeartRateDataImpl.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                this.a = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RestingHeartRate b(HMSummery hMSummery) {
        String str = hMSummery.date;
        Sleep sleep = hMSummery.sleep;
        return new RestingHeartRate(str, sleep != null ? sleep.rhr : hMSummery.rhrDeprecated);
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    @NotNull
    public Flow<List<RestingHeartRate>> fetchRestingHeartRate(long dateFrom, long dateEnd, @NotNull String userId) {
        final MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        HRDataManager hRDataManager = HRDataManager.getInstance();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dateFrom);
        Unit unit = Unit.INSTANCE;
        String dateInFormat = HrRestingChartFragment.getDateInFormat(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(dateEnd);
        hRDataManager.queryRestingHeartRateInMonth(dateInFormat, HrRestingChartFragment.getDateInFormat(calendar2)).map(new Func1() { // from class: oy3
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HeartRateDataImpl.b((HMSummery) obj);
            }
        }).toList().observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new SingleSubscriber<List<? extends RestingHeartRate>>() { // from class: com.xiaomi.hm.health.heartrate.HeartRateDataImpl.fetchRestingHeartRate.4
            @Override // rx.SingleSubscriber
            public void onError(@NotNull Throwable error) {
                error.printStackTrace();
                MutableStateFlow.setValue(null);
            }

            @Override // rx.SingleSubscriber
            public /* bridge */ /* synthetic */ void onSuccess(List<? extends RestingHeartRate> list) {
                onSuccess2((List<RestingHeartRate>) list);
            }

            /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
            public void onSuccess2(@Nullable List<RestingHeartRate> restingHeartRates) {
                MutableStateFlow.setValue(restingHeartRates);
            }
        });
        return MutableStateFlow;
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    @NotNull
    public String getAppName() {
        return HMAppConfig.getPackageName();
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    @NotNull
    public Platform getPlatform() {
        return Platform.ZEPP;
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    @Nullable
    public Calendar getSyncTime() {
        return HRDataManager.getInstance().getBoundDeviceSyncTime();
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    @Nullable
    public Map<String, byte[]> getWholeDayHeartRateData(long dayFrom, long dayEnd, @NotNull String userId) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dayFrom);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(dayEnd);
        SportDay sportDay = new SportDay(calendar);
        SportDay sportDay2 = new SportDay(calendar2);
        HMDataCacheCenter.getInstance().getmBandUint().checkDateDataDownloadStatus(sportDay);
        return HRDataManager.getInstance().queryWholeDayHeartRateByRange(sportDay.toString(), sportDay2.toString());
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    public boolean isOpenWholeDayHr(@NotNull Context context) {
        if (HMDeviceConfig.hasBoundClassicWatch()) {
            return HealthData.isAllDayHR(context);
        }
        return HeartRateUtils.INSTANCE.isSupportFullHr() && HeartDateUtilsKt.isOpenWholeHr();
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    public boolean isShowRestingHRItem() {
        return true;
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    public boolean isSupportAtrialFib() {
        return HeartRateHelperKt.showAfb(KoinExtKt.getAppContext());
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    @Nullable
    public Boolean isWatchName() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        if (boundDeviceSource != hMDeviceSource) {
            return Boolean.valueOf(ConfigHelperKt.hasFeature(Feature.WATCH_SOURCE_S, boundDeviceSource));
        }
        if (HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WATCH) == hMDeviceSource) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    public void launchHeartRateDetailActivityForResult(@NotNull Fragment context, @NotNull HeartRateEntity item, int deleteRequestCode) {
        Integer type = item.getType();
        Integer deviceType = item.getDeviceType();
        Integer deviceSource = item.getDeviceSource();
        long time = item.getTime();
        HeartRateDetailActivity.launchForResult(context, new HeartRate(type, deviceType, deviceSource, Long.valueOf(time), item.getHr(), item.getState(), item.getTimeZone(), item.getDeviceId()), deleteRequestCode);
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    public void launchRestingHRActivity(@NotNull Context context, @NotNull String userId, int userAge, long selectedDateTimeInMillis) {
        RestingHeartRateActivity.INSTANCE.launch(context, userId, userAge, selectedDateTimeInMillis);
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    @NotNull
    public Flow<Boolean> observeWholeDayHrDataChanged(@NotNull String date, @NotNull String userId) {
        return FlowKt.flow(new a(null));
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    public void preLoadAllData(@NotNull String userId) {
    }

    @Override // com.huami.heartrate.koin.IHeartRateDataDelegate
    public int queryRestHeartRateByDay(@NotNull String date, @NotNull String userId) {
        return HRDataManager.getInstance().queryRestHeartRateByDay(date);
    }
}
