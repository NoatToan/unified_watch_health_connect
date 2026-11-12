package com.xiaomi.hm.health.ui.heartrate;

import android.content.Context;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.huami.device.feature.health.HealthDetect;
import com.huami.health.afppg.PpgCoroutineScope;
import com.huami.health.afppg.koin.KoinModuleKt;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.health.afppg.model.AtrialFibrillationEventDay;
import com.huami.health.afppg.usecase.GetAfibByDayUseCase;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.dataflow.Constant;
import com.huami.watch.companion.dataflow.HealthData;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.homepage.status.card.DataNotifiers;
import com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nJ\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\n¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/ui/heartrate/HeartRateUtils;", "", "", Constant.KEY_HR_VALUE, "", "isValidHeartRate", "isSupportFullHr", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "isOpenFullHr", "Landroidx/lifecycle/LiveData;", "", "queryWholeDayHeartRateOfToday", "", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "loadTodayAbnormalHeartRatesRange", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HeartRateUtils {

    @NotNull
    public static final HeartRateUtils INSTANCE = new HeartRateUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.heartrate.HeartRateUtils$loadTodayAbnormalHeartRatesRange$2$1$1", f = "HeartRateUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Calendar b;
        public final /* synthetic */ MutableLiveData<List<AtrialFibrillation>> c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.heartrate.HeartRateUtils$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/health/afppg/model/AtrialFibrillationEventDay;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1023a extends Lambda implements Function1<AtrialFibrillationEventDay, Unit> {
            public final /* synthetic */ MutableLiveData<List<AtrialFibrillation>> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1023a(MutableLiveData<List<AtrialFibrillation>> mutableLiveData) {
                super(1);
                this.a = mutableLiveData;
            }

            public final void a(@NotNull AtrialFibrillationEventDay atrialFibrillationEventDay) {
                this.a.postValue(atrialFibrillationEventDay.getAtrialFibrillationList());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AtrialFibrillationEventDay atrialFibrillationEventDay) {
                a(atrialFibrillationEventDay);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Calendar calendar, MutableLiveData<List<AtrialFibrillation>> mutableLiveData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = calendar;
            this.c = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GetAfibByDayUseCase getAfibByDayUseCase = (GetAfibByDayUseCase) KoinModuleKt.ppgScope().getOrNull(Reflection.getOrCreateKotlinClass(GetAfibByDayUseCase.class), null, null);
            if (getAfibByDayUseCase != null) {
                getAfibByDayUseCase.execute(this.b.getTimeInMillis(), new C1023a(this.c));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "af_ppg loadTodayAbnormalHeartRatesRange failed: " + this.a.getMessage();
        }
    }

    private HeartRateUtils() {
    }

    public final boolean isOpenFullHr(@NotNull Context context) {
        if (!isSupportFullHr()) {
            return false;
        }
        if (HMDeviceConfig.hasBoundClassicWatch()) {
            return HealthData.isAllDayHR(context);
        }
        if (!HMDeviceManager.getInstance().hasBound(HMDeviceType.WATCH)) {
            if (ConfigHelperKt.hasFeature(Feature.AMAZFIT_X_SOURCE_S, HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI))) {
                return true;
            }
            return HealthDetect.INSTANCE.getHealthConfig().isDeviceAlldayHrMeasure();
        }
        String property = HMPropertyUtil.getProperty("huami.watch.health.config", null);
        if (TextUtils.isEmpty(property)) {
            return false;
        }
        try {
            String strOptString = new JSONObject(property).optString(com.xiaomi.hm.health.Constant.KEY_WATCH_CONFIG_HEARTE);
            return !TextUtils.isEmpty(strOptString) && Intrinsics.areEqual("1", strOptString);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final boolean isSupportFullHr() {
        return HMDeviceConfig.hasFeatureFullHr(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceManager.getInstance().getMajorDeviceType()));
    }

    public final boolean isValidHeartRate(int heartRate) {
        return HRDataManager.getInstance().isValidHeartRate(heartRate);
    }

    @NotNull
    public final LiveData<List<AtrialFibrillation>> loadTodayAbnormalHeartRatesRange() {
        final Calendar calendar = Calendar.getInstance();
        return Transformations.switchMap(new InvalidateLiveData<Boolean>(DataNotifiers.INSTANCE.getAtrialDataNotifier()) { // from class: com.xiaomi.hm.health.ui.heartrate.HeartRateUtils.loadTodayAbnormalHeartRatesRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData
            @Nullable
            public Boolean loadData() {
                return Boolean.TRUE;
            }
        }.asLiveData(), new Function<Boolean, LiveData<List<? extends AtrialFibrillation>>>() { // from class: com.xiaomi.hm.health.ui.heartrate.HeartRateUtils$loadTodayAbnormalHeartRatesRange$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            public final LiveData<List<? extends AtrialFibrillation>> apply(Boolean bool) {
                Object objM3845constructorimpl;
                MutableLiveData mutableLiveData = new MutableLiveData();
                Job jobF = null;
                mutableLiveData.postValue(null);
                try {
                    Result.Companion companion = Result.Companion;
                    PpgCoroutineScope ppgCoroutineScope = (PpgCoroutineScope) KoinModuleKt.ppgScope().getOrNull(Reflection.getOrCreateKotlinClass(PpgCoroutineScope.class), null, null);
                    if (ppgCoroutineScope != null) {
                        jobF = e.f(ppgCoroutineScope, null, null, new HeartRateUtils.a(calendar, mutableLiveData, null), 3, null);
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(jobF);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.error$default(null, null, null, new HeartRateUtils.b(thM3848exceptionOrNullimpl), 7, null);
                }
                return mutableLiveData;
            }
        });
    }

    @NotNull
    public final LiveData<byte[]> queryWholeDayHeartRateOfToday() {
        return d.x();
    }
}
