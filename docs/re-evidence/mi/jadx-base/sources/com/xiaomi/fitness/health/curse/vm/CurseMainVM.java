package com.xiaomi.fitness.health.curse.vm;

import android.os.Bundle;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureTrendRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.DayData;
import com.xiaomi.fitness.health.curse.vm.CurseMainVM;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.onetrack.c.q;
import defpackage.c0j;
import defpackage.ls9;
import defpackage.pu9;
import defpackage.s7r;
import defpackage.ur9;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\bL\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\t\u0010\u0007J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0004J>\u0010#\u001a\u00020\u00022,\u0010\"\u001a(\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b#\u0010$J@\u0010(\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020'H\u0086@¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0*¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0*¢\u0006\u0004\b/\u0010,R)\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020201008\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u00108\u001a\b\u0012\u0004\u0012\u000207008\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020:008\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR#\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C008\u0006¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u00106R\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "", "saveSetting", "()V", "Lpu9;", "getTempMonitor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lls9;", "getHrMonitor", "hrMonitor", "", "openHrMonitor", "(Lls9;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tempMonitor", "openTempMonitor", "(Lpu9;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "getSetting", "()Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "", "startTime", "endTime", "queryCurseTemperatureTrend", "(JJ)V", "cursePredictOn", "synPredict", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "action", "getHrNTempMonitorSwitch", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "openType", "Lkotlin/Function1;", "openHrNTempMonitorSwitch", "(ILpu9;Lls9;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "checkDevicesSupport", "()Landroidx/lifecycle/LiveData;", "isMenstrualIntelligentBand", "()Z", "checkSupportPredict", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "resumeMonthOb", "Landroidx/lifecycle/MutableLiveData;", "getResumeMonthOb", "()Landroidx/lifecycle/MutableLiveData;", "Lorg/joda/time/LocalDate;", "onDayClick", "getOnDayClick", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "latestSymObserver", "getLatestSymObserver", "Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureTrendRepository;", "tempTrendRepo$delegate", "Lkotlin/Lazy;", "getTempTrendRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureTrendRepository;", "tempTrendRepo", "", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "temperatureTrendData", "getTemperatureTrendData", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", "settingManager", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", q.f13857a, "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCurseMainVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseMainVM.kt\ncom/xiaomi/fitness/health/curse/vm/CurseMainVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,347:1\n1#2:348\n*E\n"})
public final class CurseMainVM extends BasicDataViewModel {
    private CurseSetting config;

    @NotNull
    private final MutableLiveData<HashMap<Long, DayData>> resumeMonthOb = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<LocalDate> onDayClick = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<WomenHealthSymptoms> latestSymObserver = new MutableLiveData<>();

    /* JADX INFO: renamed from: tempTrendRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tempTrendRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h85
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CurseMainVM.tempTrendRepo_delegate$lambda$0(this.f19796a);
        }
    });

    @NotNull
    private final MutableLiveData<List<TemperatureTrendItem>> temperatureTrendData = new MutableLiveData<>();

    @NotNull
    private final DeviceSettingManager settingManager = DeviceSettingManager.INSTANCE.getInstance();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$attach$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$attach$1", f = "CurseMainVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseMainVM.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String did;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseSetting curseSetting = CurseMainVM.this.config;
            CurseSetting curseSetting2 = null;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting = null;
            }
            if (curseSetting.isAlgoPredictEnable()) {
                CurseSetting curseSetting3 = CurseMainVM.this.config;
                if (curseSetting3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                } else {
                    curseSetting2 = curseSetting3;
                }
                if (!curseSetting2.isPredictEnable()) {
                    CurseMainVM.this.cursePredictOn();
                }
            }
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel != null && (did = wearableDeviceModel.getDid()) != null) {
                CurseManager.INSTANCE.getInstance().setHasIntelligentPredictionCapability((DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(did) & 65536) == 65536);
            }
            CurseManager.Companion companion2 = CurseManager.INSTANCE;
            if (companion2.getInstance().isAlgoPredictEnable()) {
                companion2.getInstance().getAlgoCurseManager().refreshAlgoCurseData();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$checkDevicesSupport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$checkDevicesSupport$1", f = "CurseMainVM.kt", i = {}, l = {302, 309, 312}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24261 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$checkDevicesSupport$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$checkDevicesSupport$1$1", f = "CurseMainVM.kt", i = {0}, l = {314, 320}, m = "invokeSuspend", n = {"startTime"}, s = {"J$0"})
        public static final class C05851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LiveDataScope<Boolean> $$this$liveData;
            final /* synthetic */ int $lastInterval;
            long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05851(int i, LiveDataScope<Boolean> liveDataScope, Continuation<? super C05851> continuation) {
                super(2, continuation);
                this.$lastInterval = i;
                this.$$this$liveData = liveDataScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05851(this.$lastInterval, this.$$this$liveData, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                long jCurrentTimeMillis;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        jCurrentTimeMillis = this.J$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    HealthPrefer.INSTANCE.setLAST_NOTICE_DEVICE_WEAR_TIME(System.currentTimeMillis());
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                jCurrentTimeMillis = System.currentTimeMillis() - CurseRecordKt.SPACE_MIN_MILLS;
                long j = 1000;
                long jCurrentTimeMillis2 = System.currentTimeMillis() / j;
                int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                obj = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getTempCharacterRecordData(jCurrentTimeMillis / j, jCurrentTimeMillis2, currentTZOffsetInSec, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Map map = (Map) obj;
                Logger.i("CurseMainVM", "checkDevicesSupport,startTime = " + jCurrentTimeMillis + ", items:" + map);
                if (this.$lastInterval > 5 && map.isEmpty()) {
                    LiveDataScope<Boolean> liveDataScope = this.$$this$liveData;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    this.label = 2;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HealthPrefer.INSTANCE.setLAST_NOTICE_DEVICE_WEAR_TIME(System.currentTimeMillis());
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C24261(Continuation<? super C24261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24261 c24261 = new C24261(continuation);
            c24261.L$0 = obj;
            return c24261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C24261) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            CurseManager.Companion companion = CurseManager.INSTANCE;
            if (!companion.getInstance().isAlgoPredictEnable() || !companion.getInstance().getHasTempCharacterRecordHistory()) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                this.label = 1;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            long last_notice_device_wear_time = HealthPrefer.INSTANCE.getLAST_NOTICE_DEVICE_WEAR_TIME();
            int intervalDay = TimeDateUtil.getIntervalDay(last_notice_device_wear_time, System.currentTimeMillis()) + 1;
            Logger.i("CurseMainVM", "checkDevicesSupport lastTime:" + last_notice_device_wear_time + ", lastInterval:" + intervalDay);
            if (intervalDay < 5) {
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                this.label = 2;
                if (liveDataScope.emit(boolBoxBoolean2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C05851 c05851 = new C05851(intervalDay, liveDataScope, null);
            this.label = 3;
            if (BuildersKt.withContext(io2, c05851, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$checkSupportPredict$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$checkSupportPredict$1", f = "CurseMainVM.kt", i = {}, l = {342, 345}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24271 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C24271(Continuation<? super C24271> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(WearableProduct wearableProduct) {
            List<String> features = wearableProduct.getFeatures();
            if (features != null) {
                return features.contains(Feature.MENSTRUATION_INTELLIGENT_PREDICT);
            }
            return false;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24271 c24271 = CurseMainVM.this.new C24271(continuation);
            c24271.L$0 = obj;
            return c24271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C24271) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            if (((WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: com.xiaomi.fitness.health.curse.vm.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return Boolean.valueOf(CurseMainVM.C24271.invokeSuspend$lambda$0((WearableProduct) obj2));
                }
            })) == null || CurseMainVM.this.isMenstrualIntelligentBand()) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                this.label = 1;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            Boolean boolBoxBoolean2 = Boxing.boxBoolean(true);
            this.label = 2;
            if (liveDataScope.emit(boolBoxBoolean2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$getHrNTempMonitorSwitch$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$getHrNTempMonitorSwitch$2", f = "CurseMainVM.kt", i = {0, 1}, l = {139, 140, 142}, m = "invokeSuspend", n = {"deferredHr", "tempResult"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<pu9, ls9, Continuation<? super Unit>, Object> $action;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CurseMainVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function3<? super pu9, ? super ls9, ? super Continuation<? super Unit>, ? extends Object> function3, CurseMainVM curseMainVM, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$action = function3;
            this.this$0 = curseMainVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$action, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0074  */
        /* JADX WARN: Code duplicated, block: B:23:0x007b  */
        /* JADX WARN: Code duplicated, block: B:25:0x007e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0085  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred deferred;
            pu9 pu9Var;
            ls9 ls9Var;
            Boolean boolBoxBoolean;
            Integer numBoxInt;
            Function3<pu9, ls9, Continuation<? super Unit>, Object> function3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    deferred = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    pu9Var = (pu9) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ls9Var = (ls9) obj;
                    if (pu9Var != null) {
                        boolBoxBoolean = Boxing.boxBoolean(pu9Var.c);
                    } else {
                        boolBoxBoolean = null;
                    }
                    if (ls9Var != null) {
                        numBoxInt = Boxing.boxInt(ls9Var.c);
                    } else {
                        numBoxInt = null;
                    }
                    Logger.i("CurseMainVM", "getHrNTempMonitorSwitch tempMonitor on:" + boolBoxBoolean + ", hrMonitor mode:" + numBoxInt);
                    function3 = this.$action;
                    this.L$0 = null;
                    this.label = 3;
                    if (function3.invoke(pu9Var, ls9Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CurseMainVM$getHrNTempMonitorSwitch$2$deferredTemp$1(this.this$0, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CurseMainVM$getHrNTempMonitorSwitch$2$deferredHr$1(this.this$0, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
            pu9 pu9Var2 = (pu9) obj;
            this.L$0 = pu9Var2;
            this.label = 2;
            Object objAwait2 = deferred.await(this);
            if (objAwait2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            pu9Var = pu9Var2;
            obj = objAwait2;
            ls9Var = (ls9) obj;
            if (pu9Var != null) {
                boolBoxBoolean = Boxing.boxBoolean(pu9Var.c);
            } else {
                boolBoxBoolean = null;
            }
            if (ls9Var != null) {
                numBoxInt = Boxing.boxInt(ls9Var.c);
            } else {
                numBoxInt = null;
            }
            Logger.i("CurseMainVM", "getHrNTempMonitorSwitch tempMonitor on:" + boolBoxBoolean + ", hrMonitor mode:" + numBoxInt);
            function3 = this.$action;
            this.L$0 = null;
            this.label = 3;
            if (function3.invoke(pu9Var, ls9Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$openHrNTempMonitorSwitch$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$openHrNTempMonitorSwitch$2", f = "CurseMainVM.kt", i = {4, 5, 6, 6}, l = {201, 202, 209, 210, 218, 219, 220}, m = "invokeSuspend", n = {"deferredHr", "tempResult", "tempResult", "hrResult"}, s = {"L$0", "Z$0", "Z$0", "Z$1"})
    public static final class C24282 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $action;
        final /* synthetic */ ls9 $hrMonitor;
        final /* synthetic */ int $openType;
        final /* synthetic */ pu9 $tempMonitor;
        private /* synthetic */ Object L$0;
        boolean Z$0;
        boolean Z$1;
        int label;
        final /* synthetic */ CurseMainVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$openHrNTempMonitorSwitch$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$openHrNTempMonitorSwitch$2$1", f = "CurseMainVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $action;
            final /* synthetic */ boolean $hrResult;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$hrResult = z;
                this.$action = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$hrResult, this.$action, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ToastUtil.showToast(ExtUtilKt.getString(this.$hrResult ? c0j.Pp : c0j.Up));
                this.$action.invoke2(Boxing.boxBoolean(this.$hrResult));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$openHrNTempMonitorSwitch$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$openHrNTempMonitorSwitch$2$2", f = "CurseMainVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05862 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $action;
            final /* synthetic */ boolean $tempResult;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05862(boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super C05862> continuation) {
                super(2, continuation);
                this.$tempResult = z;
                this.$action = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05862(this.$tempResult, this.$action, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ToastUtil.showToast(ExtUtilKt.getString(this.$tempResult ? c0j.bq : c0j.Up));
                this.$action.invoke2(Boxing.boxBoolean(this.$tempResult));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$openHrNTempMonitorSwitch$2$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$openHrNTempMonitorSwitch$2$3", f = "CurseMainVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $action;
            final /* synthetic */ boolean $hrResult;
            final /* synthetic */ boolean $tempResult;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(boolean z, boolean z2, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$tempResult = z;
                this.$hrResult = z2;
                this.$action = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$tempResult, this.$hrResult, this.$action, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ToastUtil.showToast(ExtUtilKt.getString((this.$tempResult && this.$hrResult) ? c0j.Tp : c0j.Up));
                this.$action.invoke2(Boxing.boxBoolean(this.$tempResult && this.$hrResult));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24282(int i, CurseMainVM curseMainVM, ls9 ls9Var, Function1<? super Boolean, Unit> function1, pu9 pu9Var, Continuation<? super C24282> continuation) {
            super(2, continuation);
            this.$openType = i;
            this.this$0 = curseMainVM;
            this.$hrMonitor = ls9Var;
            this.$action = function1;
            this.$tempMonitor = pu9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24282 c24282 = new C24282(this.$openType, this.this$0, this.$hrMonitor, this.$action, this.$tempMonitor, continuation);
            c24282.L$0 = obj;
            return c24282;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x007e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00bb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x0105 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x0106  */
        /* JADX WARN: Code duplicated, block: B:40:0x0127 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x0128  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred deferred;
            MainCoroutineDispatcher main;
            AnonymousClass1 anonymousClass1;
            MainCoroutineDispatcher main2;
            C05862 c05862;
            boolean zBooleanValue;
            Object objAwait;
            boolean z;
            boolean zBooleanValue2;
            MainCoroutineDispatcher main3;
            AnonymousClass3 anonymousClass3;
            boolean z2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    int i = this.$openType;
                    if (i == CurseMainVMKt.getTYPE_HR_MONITOR_OFF()) {
                        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CurseMainVM$openHrNTempMonitorSwitch$2$deferredHr$1(this.this$0, this.$hrMonitor, null), 3, null);
                        this.label = 1;
                        obj = deferredAsync$default.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        main = Dispatchers.getMain();
                        anonymousClass1 = new AnonymousClass1(zBooleanValue3, this.$action, null);
                        this.label = 2;
                        if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i == CurseMainVMKt.getTYPE_TEMP_MONITOR_OFF()) {
                        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CurseMainVM$openHrNTempMonitorSwitch$2$deferredTemp$1(this.this$0, this.$tempMonitor, null), 3, null);
                        this.label = 3;
                        obj = deferredAsync$default2.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        main2 = Dispatchers.getMain();
                        c05862 = new C05862(zBooleanValue4, this.$action, null);
                        this.label = 4;
                        if (BuildersKt.withContext(main2, c05862, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i == CurseMainVMKt.getTYPE_HRNTEMP_MONITOR_OFF()) {
                        Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CurseMainVM$openHrNTempMonitorSwitch$2$deferredTemp$2(this.this$0, this.$tempMonitor, null), 3, null);
                        Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CurseMainVM$openHrNTempMonitorSwitch$2$deferredHr$2(this.this$0, this.$hrMonitor, null), 3, null);
                        this.L$0 = deferredAsync$default4;
                        this.label = 5;
                        Object objAwait2 = deferredAsync$default3.await(this);
                        if (objAwait2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        deferred = deferredAsync$default4;
                        obj = objAwait2;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        this.L$0 = null;
                        this.Z$0 = zBooleanValue;
                        this.label = 6;
                        objAwait = deferred.await(this);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z = zBooleanValue;
                        obj = objAwait;
                        zBooleanValue2 = ((Boolean) obj).booleanValue();
                        main3 = Dispatchers.getMain();
                        anonymousClass3 = new AnonymousClass3(z, zBooleanValue2, this.$action, null);
                        this.Z$0 = z;
                        this.Z$1 = zBooleanValue2;
                        this.label = 7;
                        if (BuildersKt.withContext(main3, anonymousClass3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z2 = zBooleanValue2;
                        Logger.i("CurseMainVM", "openHrNTempMonitorSwitch tempMonitor:" + z + ", hrMonitor:" + z2);
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                    main = Dispatchers.getMain();
                    anonymousClass1 = new AnonymousClass1(zBooleanValue5, this.$action, null);
                    this.label = 2;
                    if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                case 4:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                    main2 = Dispatchers.getMain();
                    c05862 = new C05862(zBooleanValue6, this.$action, null);
                    this.label = 4;
                    if (BuildersKt.withContext(main2, c05862, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    deferred = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    this.L$0 = null;
                    this.Z$0 = zBooleanValue;
                    this.label = 6;
                    objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = zBooleanValue;
                    obj = objAwait;
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    main3 = Dispatchers.getMain();
                    anonymousClass3 = new AnonymousClass3(z, zBooleanValue2, this.$action, null);
                    this.Z$0 = z;
                    this.Z$1 = zBooleanValue2;
                    this.label = 7;
                    if (BuildersKt.withContext(main3, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z2 = zBooleanValue2;
                    Logger.i("CurseMainVM", "openHrNTempMonitorSwitch tempMonitor:" + z + ", hrMonitor:" + z2);
                    return Unit.INSTANCE;
                case 6:
                    z = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    main3 = Dispatchers.getMain();
                    anonymousClass3 = new AnonymousClass3(z, zBooleanValue2, this.$action, null);
                    this.Z$0 = z;
                    this.Z$1 = zBooleanValue2;
                    this.label = 7;
                    if (BuildersKt.withContext(main3, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z2 = zBooleanValue2;
                    Logger.i("CurseMainVM", "openHrNTempMonitorSwitch tempMonitor:" + z + ", hrMonitor:" + z2);
                    return Unit.INSTANCE;
                case 7:
                    z2 = this.Z$1;
                    z = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                    Logger.i("CurseMainVM", "openHrNTempMonitorSwitch tempMonitor:" + z + ", hrMonitor:" + z2);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$queryCurseTemperatureTrend$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$queryCurseTemperatureTrend$1", f = "CurseMainVM.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ long $startTime;
        int label;
        final /* synthetic */ CurseMainVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24291(long j, long j2, CurseMainVM curseMainVM, Continuation<? super C24291> continuation) {
            super(2, continuation);
            this.$startTime = j;
            this.$endTime = j2;
            this.this$0 = curseMainVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24291(this.$startTime, this.$endTime, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger.i("CurseMainVM", "queryCurseTemperatureTrend before startTime:" + this.$startTime + "; endTime:" + this.$endTime);
                ITemperatureTrendRepository tempTrendRepo = this.this$0.getTempTrendRepo();
                long j = this.$startTime;
                long j2 = this.$endTime;
                this.label = 1;
                obj = ITemperatureTrendRepository.DefaultImpls.getTemperatureTrendData$default(tempTrendRepo, j, j2, 0, false, this, 12, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.getTemperatureTrendData().postValue((List) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMainVM$synPredict$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$synPredict$1", f = "CurseMainVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24301(Continuation<? super C24301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseMainVM.this.new C24301(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseMainVM.this.saveSetting();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getHrMonitor(Continuation<? super ls9> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 10;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.curse.vm.CurseMainVM$getHrMonitor$2$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("CurseMainVM", "getHrNTempMonitorSwitch getHr monitor error did:" + did + ", type:" + type + ", code:" + code);
                safeContinuation.resumeWith(Result.m886constructorimpl(null));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ur9 ur9VarU;
                Logger.i("CurseMainVM", "getHrNTempMonitorSwitch getHr monitor success did:" + did + ", type:" + type + ", result:" + result);
                ls9 ls9VarZ = null;
                if (result == null) {
                    safeContinuation.resumeWith(Result.m886constructorimpl(null));
                    return;
                }
                Continuation<ls9> continuation2 = safeContinuation;
                s7r packet = result.getPacket();
                if (packet != null && (ur9VarU = packet.u()) != null) {
                    ls9VarZ = ur9VarU.z();
                }
                continuation2.resumeWith(Result.m886constructorimpl(ls9VarZ));
            }
        }, 0, 8, null);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTempMonitor(Continuation<? super pu9> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 101;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.curse.vm.CurseMainVM$getTempMonitor$2$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("CurseMainVM", "getHrNTempMonitorSwitch getTemp monitor error did:" + did + ", type:" + type + ", code:" + code);
                safeContinuation.resumeWith(Result.m886constructorimpl(null));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ur9 ur9VarU;
                Logger.i("CurseMainVM", "getHrNTempMonitorSwitch getTemp monitor success did:" + did + ", type:" + type + ", result:" + result);
                pu9 pu9VarW = null;
                if (result == null) {
                    safeContinuation.resumeWith(Result.m886constructorimpl(null));
                    return;
                }
                Continuation<pu9> continuation2 = safeContinuation;
                s7r packet = result.getPacket();
                if (packet != null && (ur9VarU = packet.u()) != null) {
                    pu9VarW = ur9VarU.W();
                }
                continuation2.resumeWith(Result.m886constructorimpl(pu9VarW));
            }
        }, 0, 8, null);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ITemperatureTrendRepository getTempTrendRepo() {
        return (ITemperatureTrendRepository) this.tempTrendRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object openHrMonitor(ls9 ls9Var, Continuation<? super Boolean> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (ls9Var == null) {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.m886constructorimpl(Boxing.boxBoolean(false)));
        } else {
            ls9Var.c = 0;
            ls9Var.d = 0;
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 11;
            ur9 ur9Var = new ur9();
            ur9Var.o0(ls9Var);
            s7rVar.S(ur9Var);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.curse.vm.CurseMainVM$openHrMonitor$2$1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.e(CurseDeviceSyncExtKt.TAG, "openHrNTempMonitorSwitch hr error did:" + did + ", type:" + type + ", code:" + code);
                    Continuation<Boolean> continuation2 = safeContinuation;
                    Result.Companion companion2 = Result.Companion;
                    continuation2.resumeWith(Result.m886constructorimpl(Boolean.FALSE));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(CurseDeviceSyncExtKt.TAG, "openHrNTempMonitorSwitch hr success did:" + did + ", type:" + type + ", result:" + result);
                    Continuation<Boolean> continuation2 = safeContinuation;
                    Result.Companion companion2 = Result.Companion;
                    continuation2.resumeWith(Result.m886constructorimpl(Boolean.TRUE));
                }
            }, 0, 8, null);
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object openTempMonitor(pu9 pu9Var, Continuation<? super Boolean> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (pu9Var == null) {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.m886constructorimpl(Boxing.boxBoolean(false)));
        } else {
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 102;
            ur9 ur9Var = new ur9();
            pu9 pu9Var2 = new pu9();
            pu9Var2.c = true;
            pu9Var2.d = pu9Var.d;
            ur9Var.Q0(pu9Var2);
            s7rVar.S(ur9Var);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.curse.vm.CurseMainVM$openTempMonitor$2$1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.e(CurseDeviceSyncExtKt.TAG, "openHrNTempMonitorSwitch temp error did:" + did + ", type:" + type + ", code:" + code);
                    Continuation<Boolean> continuation2 = safeContinuation;
                    Result.Companion companion2 = Result.Companion;
                    continuation2.resumeWith(Result.m886constructorimpl(Boolean.FALSE));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(CurseDeviceSyncExtKt.TAG, "openHrNTempMonitorSwitch temp success did:" + did + ", type:" + type + ", result:" + result);
                    Continuation<Boolean> continuation2 = safeContinuation;
                    Result.Companion companion2 = Result.Companion;
                    continuation2.resumeWith(Result.m886constructorimpl(Boolean.TRUE));
                }
            }, 0, 8, null);
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveSetting() {
        DeviceSettingManager deviceSettingManager = this.settingManager;
        CurseSetting curseSetting = this.config;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
            curseSetting = null;
        }
        deviceSettingManager.saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting);
        DeviceSettingManager deviceSettingManager2 = this.settingManager;
        CurseSetting curseSetting3 = this.config;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
        } else {
            curseSetting2 = curseSetting3;
        }
        deviceSettingManager2.sendUserSettingItem("curse", curseSetting2, false);
        CurseManager.INSTANCE.getInstance().initData("curseSetVM");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ITemperatureTrendRepository tempTrendRepo_delegate$lambda$0(CurseMainVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (ITemperatureTrendRepository) this$0.getRepo(ITemperatureTrendRepository.class);
    }

    @Override // com.xiaomi.fitness.base.BasicDataViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        getSetting();
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(null));
    }

    @NotNull
    public final LiveData<Boolean> checkDevicesSupport() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C24261(null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<Boolean> checkSupportPredict() {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C24271(null), 2, (Object) null);
    }

    public final void cursePredictOn() {
        CurseSetting curseSetting = this.config;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
            curseSetting = null;
        }
        curseSetting.enablePredict(true);
        CurseSetting curseSetting3 = this.config;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
        } else {
            curseSetting2 = curseSetting3;
        }
        curseSetting2.enableAlgoPredict(true);
        synPredict();
    }

    @Nullable
    public final Object getHrNTempMonitorSwitch(@NotNull Function3<? super pu9, ? super ls9, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) throws InterruptedException {
        boolean zIsAlgoPredictEnable = CurseManager.INSTANCE.getInstance().isAlgoPredictEnable();
        Logger.i("CurseMainVM", "getHrNTempMonitorSwitch:: algoOpen:" + zIsAlgoPredictEnable);
        if (!zIsAlgoPredictEnable) {
            return Unit.INSTANCE;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass2(function3, this, null), 1, null);
        return Unit.INSTANCE;
    }

    @NotNull
    public final MutableLiveData<WomenHealthSymptoms> getLatestSymObserver() {
        return this.latestSymObserver;
    }

    @NotNull
    public final MutableLiveData<LocalDate> getOnDayClick() {
        return this.onDayClick;
    }

    @NotNull
    public final MutableLiveData<HashMap<Long, DayData>> getResumeMonthOb() {
        return this.resumeMonthOb;
    }

    @NotNull
    public final CurseSetting getSetting() {
        CurseSetting setting = CurseManager.INSTANCE.getInstance().getSetting();
        if (setting == null) {
            setting = CurseExtKt.m362default(new CurseSetting());
        }
        this.config = setting;
        if (setting != null) {
            return setting;
        }
        Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
        return null;
    }

    @NotNull
    public final MutableLiveData<List<TemperatureTrendItem>> getTemperatureTrendData() {
        return this.temperatureTrendData;
    }

    public final boolean isMenstrualIntelligentBand() {
        WearableDeviceInfo deviceInfo;
        Product product;
        List<String> features;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (product = deviceInfo.getProduct()) == null || (features = product.getFeatures()) == null || !features.contains(Feature.MENSTRUATION_INTELLIGENT_PREDICT)) ? false : true;
    }

    @Nullable
    public final Object openHrNTempMonitorSwitch(int i, @Nullable pu9 pu9Var, @Nullable ls9 ls9Var, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws InterruptedException {
        Logger.i("CurseMainVM", "openHrNTempMonitorSwitch ,warning:" + (pu9Var != null ? Boxing.boxInt(pu9Var.d) : null));
        BuildersKt__BuildersKt.runBlocking$default(null, new C24282(i, this, ls9Var, function1, pu9Var, null), 1, null);
        return Unit.INSTANCE;
    }

    public final void queryCurseTemperatureTrend(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24291(startTime, endTime, this, null), 2, null);
    }

    public final void synPredict() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24301(null), 2, null);
    }
}
