package com.xiaomi.hm.health.device.feature.sync.job.mili;

import android.util.Base64;
import com.huami.account.HMLoginManager;
import com.huami.bodymeasurements.temperature.model.device.TempDeviceApi;
import com.huami.bodymeasurements.temperature.model.device.dto.AllDayTemperatureDataDo;
import com.huami.bodymeasurements.temperature.model.device.dto.EightySecondsTemperatureDo;
import com.huami.bodymeasurements.temperature.model.device.dto.SingleTemperatureDo;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao;
import com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao;
import com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao;
import com.huami.bodymeasurements.temperature.model.remote.TempWebApi;
import com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.repository.impl.EightySecondsTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.DoLooper;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.HMBodyTemperatureData;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.IHMBodyTemperatureDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.Temperature80s;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureAllDay;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureAllDayItem;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureSingle;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bj\u0010kJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0019R\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u00101R\u001d\u00105\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\"R\u001d\u00108\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\"R\u001d\u0010;\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010 \u001a\u0004\b:\u0010\"R\u001d\u0010>\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010 \u001a\u0004\b=\u00101R\u001d\u0010A\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010 \u001a\u0004\b@\u0010\"R\u001d\u0010F\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010 \u001a\u0004\bD\u0010ER\u001d\u0010K\u001a\u00020G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010 \u001a\u0004\bI\u0010JR\u001d\u0010P\u001a\u00020L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010 \u001a\u0004\bN\u0010OR\u001d\u0010U\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010 \u001a\u0004\bS\u0010TR\u001d\u0010Z\u001a\u00020V8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010 \u001a\u0004\bX\u0010YR\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00170[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001d\u0010b\u001a\u00020^8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010 \u001a\u0004\b`\u0010aR\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001a0[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010]R\u001d\u0010h\u001a\u00020d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010 \u001a\u0004\bf\u0010gR\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001c0[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010]\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006l"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMBodyTemperatureJob;", "Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMBaseSyncJob;", "Lcom/huami/bodymeasurements/temperature/model/device/TempDeviceApi;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/watch/util/DoLooper$Result;", "result", "", "syncDataFromDevice", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;", "data", "saveAllDayData", "([Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "saveSingleData", "([Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "saveEightySecondsData", "([Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;)V", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "start", "", "Lcom/huami/bodymeasurements/temperature/model/device/dto/AllDayTemperatureDataDo;", "getAllDayTempFromDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bodymeasurements/temperature/model/device/dto/SingleTemperatureDo;", "getSingleTempFromDevice", "Lcom/huami/bodymeasurements/temperature/model/device/dto/EightySecondsTemperatureDo;", "getEightySecondsTempFromDevice", "", "userId$delegate", "Lkotlin/Lazy;", "getUserId", "()Ljava/lang/String;", "userId", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi$delegate", "getDeviceManagerApi", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "deviceSnService$delegate", "getDeviceSnService", "()Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "deviceSnService", "", "deviceSource$delegate", "getDeviceSource", "()I", "deviceSource", "deviceId$delegate", "getDeviceId", "deviceId", "deviceMac$delegate", "getDeviceMac", ParamKey.deviceMac, "deviceSn$delegate", "getDeviceSn", ParamKey.deviceSn, "deviceType$delegate", "getDeviceType", "deviceType", "firmVersion$delegate", "getFirmVersion", "firmVersion", "Lcom/huami/bodymeasurements/temperature/model/local/dao/AllDayTempDao;", "allDayTempDao$delegate", "getAllDayTempDao", "()Lcom/huami/bodymeasurements/temperature/model/local/dao/AllDayTempDao;", "allDayTempDao", "Lcom/huami/bodymeasurements/temperature/model/local/dao/SingleTempDao;", "singleTempDao$delegate", "getSingleTempDao", "()Lcom/huami/bodymeasurements/temperature/model/local/dao/SingleTempDao;", "singleTempDao", "Lcom/huami/bodymeasurements/temperature/model/local/dao/EightySecondsTempDao;", "eightySecondsTempDao$delegate", "getEightySecondsTempDao", "()Lcom/huami/bodymeasurements/temperature/model/local/dao/EightySecondsTempDao;", "eightySecondsTempDao", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "webApi$delegate", "getWebApi", "()Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "webApi", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/AllDayTempRepositoryImpl;", "allDayTempRepository$delegate", "getAllDayTempRepository", "()Lcom/huami/bodymeasurements/temperature/model/repository/impl/AllDayTempRepositoryImpl;", "allDayTempRepository", "", "allDayTempResult", "Ljava/util/List;", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/SingleTempRepositoryImpl;", "singleTempRepository$delegate", "getSingleTempRepository", "()Lcom/huami/bodymeasurements/temperature/model/repository/impl/SingleTempRepositoryImpl;", "singleTempRepository", "singleTempResult", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/EightySecondsTempRepositoryImpl;", "eightySecondsTempRepository$delegate", "getEightySecondsTempRepository", "()Lcom/huami/bodymeasurements/temperature/model/repository/impl/EightySecondsTempRepositoryImpl;", "eightySecondsTempRepository", "eightySecondsTempResult", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class HMBodyTemperatureJob extends HMBaseSyncJob implements TempDeviceApi, KoinComponent {

    /* JADX INFO: renamed from: allDayTempDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy allDayTempDao;

    /* JADX INFO: renamed from: allDayTempRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy allDayTempRepository;

    @NotNull
    private final List<AllDayTemperatureDataDo> allDayTempResult;

    /* JADX INFO: renamed from: deviceId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceId;

    /* JADX INFO: renamed from: deviceMac$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceMac;

    /* JADX INFO: renamed from: deviceManagerApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: deviceSn$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSn;

    /* JADX INFO: renamed from: deviceSnService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSnService;

    /* JADX INFO: renamed from: deviceSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSource;

    /* JADX INFO: renamed from: deviceType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceType;

    /* JADX INFO: renamed from: eightySecondsTempDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eightySecondsTempDao;

    /* JADX INFO: renamed from: eightySecondsTempRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eightySecondsTempRepository;

    @NotNull
    private final List<EightySecondsTemperatureDo> eightySecondsTempResult;

    /* JADX INFO: renamed from: firmVersion$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy firmVersion;

    /* JADX INFO: renamed from: singleTempDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singleTempDao;

    /* JADX INFO: renamed from: singleTempRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singleTempRepository;

    @NotNull
    private final List<SingleTemperatureDo> singleTempResult;

    /* JADX INFO: renamed from: userId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$userId$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return String.valueOf(HMLoginManager.getValidUid());
        }
    });

    /* JADX INFO: renamed from: webApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy webApi;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$saveAllDayData$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$saveAllDayData$2", f = "HMBodyTemperatureJob.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_BOULDERING}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ TemperatureAllDay[] $data;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TemperatureAllDay[] temperatureAllDayArr, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$data = temperatureAllDayArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMBodyTemperatureJob.this.new AnonymousClass2(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBodyTemperatureJob.this.allDayTempResult.clear();
                TemperatureAllDay[] temperatureAllDayArr = this.$data;
                HMBodyTemperatureJob hMBodyTemperatureJob = HMBodyTemperatureJob.this;
                int length = temperatureAllDayArr.length;
                int i2 = 0;
                while (i2 < length) {
                    TemperatureAllDay temperatureAllDay = temperatureAllDayArr[i2];
                    TemperatureAllDayItem[] values = temperatureAllDay.getValues();
                    int length2 = values.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length2) {
                        TemperatureAllDayItem temperatureAllDayItem = values[i3];
                        Integer numBoxInt = Boxing.boxInt(i4);
                        i4++;
                        hMBodyTemperatureJob.allDayTempResult.add(new AllDayTemperatureDataDo(HealthDataTimeUtils.INSTANCE.getTimeToMinute(temperatureAllDay.getTimeMillis()) + ((long) (numBoxInt.intValue() * 60000)), temperatureAllDayItem.getAlgEnvTempe(), temperatureAllDayItem.getAlgBodyTempe(), temperatureAllDayItem.getEnvTempe(), temperatureAllDayItem.getBodyTempe()));
                        i3++;
                        i2 = i2;
                    }
                    i2++;
                }
                AllDayTempRepositoryImpl allDayTempRepository = HMBodyTemperatureJob.this.getAllDayTempRepository();
                String userId = HMBodyTemperatureJob.this.getUserId();
                int deviceType = HMBodyTemperatureJob.this.getDeviceType();
                int deviceSource = HMBodyTemperatureJob.this.getDeviceSource();
                String deviceId = HMBodyTemperatureJob.this.getDeviceId();
                String deviceMac = HMBodyTemperatureJob.this.getDeviceMac();
                String deviceSn = HMBodyTemperatureJob.this.getDeviceSn();
                String firmVersion = HMBodyTemperatureJob.this.getFirmVersion();
                this.label = 1;
                if (allDayTempRepository.saveAllDayTempFromDevice(userId, deviceType, deviceSource, deviceId, deviceMac, deviceSn, firmVersion, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$saveEightySecondsData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$saveEightySecondsData$2", f = "HMBodyTemperatureJob.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15932 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Temperature80s[] $data;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15932(Temperature80s[] temperature80sArr, Continuation<? super C15932> continuation) {
            super(2, continuation);
            this.$data = temperature80sArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMBodyTemperatureJob.this.new C15932(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15932) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBodyTemperatureJob.this.eightySecondsTempResult.clear();
                Temperature80s[] temperature80sArr = this.$data;
                HMBodyTemperatureJob hMBodyTemperatureJob = HMBodyTemperatureJob.this;
                for (Temperature80s temperature80s : temperature80sArr) {
                    hMBodyTemperatureJob.eightySecondsTempResult.add(new EightySecondsTemperatureDo(temperature80s.getTimeMillis(), temperature80s.getFlag(), temperature80s.getContinueWearDuration(), temperature80s.getBodyTemperature(), Base64.encodeToString(temperature80s.getRawData(), 2)));
                }
                EightySecondsTempRepositoryImpl eightySecondsTempRepository = HMBodyTemperatureJob.this.getEightySecondsTempRepository();
                String userId = HMBodyTemperatureJob.this.getUserId();
                int deviceType = HMBodyTemperatureJob.this.getDeviceType();
                int deviceSource = HMBodyTemperatureJob.this.getDeviceSource();
                String deviceId = HMBodyTemperatureJob.this.getDeviceId();
                String deviceMac = HMBodyTemperatureJob.this.getDeviceMac();
                String deviceSn = HMBodyTemperatureJob.this.getDeviceSn();
                String firmVersion = HMBodyTemperatureJob.this.getFirmVersion();
                this.label = 1;
                if (eightySecondsTempRepository.saveEightySecondsTempFromDevice(userId, deviceType, deviceSource, deviceId, deviceMac, deviceSn, firmVersion, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$saveSingleData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$saveSingleData$2", f = "HMBodyTemperatureJob.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15952 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ TemperatureSingle[] $data;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15952(TemperatureSingle[] temperatureSingleArr, Continuation<? super C15952> continuation) {
            super(2, continuation);
            this.$data = temperatureSingleArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMBodyTemperatureJob.this.new C15952(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15952) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBodyTemperatureJob.this.singleTempResult.clear();
                TemperatureSingle[] temperatureSingleArr = this.$data;
                HMBodyTemperatureJob hMBodyTemperatureJob = HMBodyTemperatureJob.this;
                for (TemperatureSingle temperatureSingle : temperatureSingleArr) {
                    hMBodyTemperatureJob.singleTempResult.add(new SingleTemperatureDo(temperatureSingle.getTimeMillis(), temperatureSingle.getAlgBodyTempe(), temperatureSingle.getAlgEnvTempe()));
                }
                SingleTempRepositoryImpl singleTempRepository = HMBodyTemperatureJob.this.getSingleTempRepository();
                String userId = HMBodyTemperatureJob.this.getUserId();
                int deviceType = HMBodyTemperatureJob.this.getDeviceType();
                int deviceSource = HMBodyTemperatureJob.this.getDeviceSource();
                String deviceId = HMBodyTemperatureJob.this.getDeviceId();
                String deviceMac = HMBodyTemperatureJob.this.getDeviceMac();
                String deviceSn = HMBodyTemperatureJob.this.getDeviceSn();
                String firmVersion = HMBodyTemperatureJob.this.getFirmVersion();
                this.label = 1;
                if (singleTempRepository.saveSingleTempFromDevice(userId, deviceType, deviceSource, deviceId, deviceMac, deviceSn, firmVersion, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public HMBodyTemperatureJob() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceSnService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceSnService>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceSnService getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceSnService.class), objArr2, objArr3);
            }
        });
        this.deviceSource = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$deviceSource$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                HMDeviceSource mDeviceSource;
                HMBaseDevice device = this.this$0.getDevice();
                if (device == null || (mDeviceSource = device.getMDeviceSource()) == null) {
                    return 0;
                }
                return mDeviceSource.getValue();
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Integer getA() {
                return Integer.valueOf(invoke2());
            }
        });
        this.deviceId = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$deviceId$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                DeviceInfo deviceInfo;
                String deviceID;
                HMBaseDevice device = this.this$0.getDevice();
                return (device == null || (deviceInfo = device.getDeviceInfo()) == null || (deviceID = deviceInfo.getDeviceID()) == null) ? "" : deviceID;
            }
        });
        this.deviceMac = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$deviceMac$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                String boundDeviceAddress = this.this$0.getDeviceManagerApi().getBoundDeviceAddress(HMDeviceType.MILI);
                return boundDeviceAddress == null ? "" : boundDeviceAddress;
            }
        });
        this.deviceSn = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$deviceSn$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                String sn = this.this$0.getDeviceSnService().getSn(HMDeviceType.MILI);
                return sn == null ? "" : sn;
            }
        });
        this.deviceType = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$deviceType$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                HMDeviceType deviceType;
                HMBaseDevice device = this.this$0.getDevice();
                Integer numValueOf = null;
                if (device != null && (deviceType = device.getDeviceType()) != null) {
                    numValueOf = Integer.valueOf(deviceType.getValue());
                }
                return numValueOf == null ? HMDeviceType.MILI.getValue() : numValueOf.intValue();
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Integer getA() {
                return Integer.valueOf(invoke2());
            }
        });
        this.firmVersion = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$firmVersion$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                DeviceInfo deviceInfo;
                String firmwareVersionStr;
                HMBaseDevice device = this.this$0.getDevice();
                return (device == null || (deviceInfo = device.getDeviceInfo()) == null || (firmwareVersionStr = deviceInfo.getFirmwareVersionStr()) == null) ? "" : firmwareVersionStr;
            }
        });
        this.allDayTempDao = LazyKt__LazyJVMKt.lazy(new Function0<AllDayTempDao>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$allDayTempDao$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AllDayTempDao getA() {
                return ScopesKt.temperatureDb(this.this$0.getKoin()).allDayTempDao();
            }
        });
        this.singleTempDao = LazyKt__LazyJVMKt.lazy(new Function0<SingleTempDao>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$singleTempDao$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SingleTempDao getA() {
                return ScopesKt.temperatureDb(this.this$0.getKoin()).singleTempDao();
            }
        });
        this.eightySecondsTempDao = LazyKt__LazyJVMKt.lazy(new Function0<EightySecondsTempDao>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$eightySecondsTempDao$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EightySecondsTempDao getA() {
                return ScopesKt.temperatureDb(this.this$0.getKoin()).eightySecondsTempDao();
            }
        });
        this.webApi = LazyKt__LazyJVMKt.lazy(new Function0<TempWebApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$webApi$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final TempWebApi getA() {
                return (TempWebApi) ScopesKt.temperatureScope(this.this$0.getKoin()).get(Reflection.getOrCreateKotlinClass(TempWebApi.class), null, null);
            }
        });
        this.allDayTempRepository = LazyKt__LazyJVMKt.lazy(new Function0<AllDayTempRepositoryImpl>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$allDayTempRepository$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AllDayTempRepositoryImpl getA() {
                HMBodyTemperatureJob hMBodyTemperatureJob = this.this$0;
                return new AllDayTempRepositoryImpl(hMBodyTemperatureJob, hMBodyTemperatureJob.getAllDayTempDao(), this.this$0.getWebApi());
            }
        });
        this.allDayTempResult = new ArrayList();
        this.singleTempRepository = LazyKt__LazyJVMKt.lazy(new Function0<SingleTempRepositoryImpl>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$singleTempRepository$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SingleTempRepositoryImpl getA() {
                HMBodyTemperatureJob hMBodyTemperatureJob = this.this$0;
                return new SingleTempRepositoryImpl(hMBodyTemperatureJob, hMBodyTemperatureJob.getSingleTempDao(), this.this$0.getWebApi());
            }
        });
        this.singleTempResult = new ArrayList();
        this.eightySecondsTempRepository = LazyKt__LazyJVMKt.lazy(new Function0<EightySecondsTempRepositoryImpl>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$eightySecondsTempRepository$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EightySecondsTempRepositoryImpl getA() {
                HMBodyTemperatureJob hMBodyTemperatureJob = this.this$0;
                return new EightySecondsTempRepositoryImpl(hMBodyTemperatureJob, hMBodyTemperatureJob.getEightySecondsTempDao(), this.this$0.getWebApi());
            }
        });
        this.eightySecondsTempResult = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AllDayTempDao getAllDayTempDao() {
        return (AllDayTempDao) this.allDayTempDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AllDayTempRepositoryImpl getAllDayTempRepository() {
        return (AllDayTempRepositoryImpl) this.allDayTempRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeviceId() {
        return (String) this.deviceId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeviceMac() {
        return (String) this.deviceMac.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeviceSn() {
        return (String) this.deviceSn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceSnService getDeviceSnService() {
        return (DeviceSnService) this.deviceSnService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDeviceSource() {
        return ((Number) this.deviceSource.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDeviceType() {
        return ((Number) this.deviceType.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EightySecondsTempDao getEightySecondsTempDao() {
        return (EightySecondsTempDao) this.eightySecondsTempDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EightySecondsTempRepositoryImpl getEightySecondsTempRepository() {
        return (EightySecondsTempRepositoryImpl) this.eightySecondsTempRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFirmVersion() {
        return (String) this.firmVersion.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingleTempDao getSingleTempDao() {
        return (SingleTempDao) this.singleTempDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingleTempRepositoryImpl getSingleTempRepository() {
        return (SingleTempRepositoryImpl) this.singleTempRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TempWebApi getWebApi() {
        return (TempWebApi) this.webApi.getValue();
    }

    private final void saveAllDayData(TemperatureAllDay[] data) {
        HMLog.info("HMBodyTemperatureJob", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob.saveAllDayData.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "save allDayTemperature start...";
            }
        });
        CoroutineScope scope = getScope();
        if (scope == null) {
            return;
        }
        e.f(scope, Dispatchers.getIO(), null, new AnonymousClass2(data, null), 2, null);
    }

    private final void saveEightySecondsData(Temperature80s[] data) {
        HMLog.info("HMBodyTemperatureJob", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob.saveEightySecondsData.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "save saveEightySecondsTemperature start...";
            }
        });
        CoroutineScope scope = getScope();
        if (scope == null) {
            return;
        }
        e.f(scope, Dispatchers.getIO(), null, new C15932(data, null), 2, null);
    }

    private final void saveSingleData(TemperatureSingle[] data) {
        HMLog.info("HMBodyTemperatureJob", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob.saveSingleData.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "save singleTemperature start...";
            }
        });
        CoroutineScope scope = getScope();
        if (scope == null) {
            return;
        }
        e.f(scope, Dispatchers.getIO(), null, new C15952(data, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: start$lambda-0, reason: not valid java name */
    public static final DoLooper.Result m3437start$lambda0(DoLooper.Result result) {
        return result;
    }

    private final void syncDataFromDevice(final DoLooper.Result result) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        HMBaseDevice device = getDevice();
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        ((HMMiLiProDevice) device).startSyncBodyTemperature(calendar, calendar, calendar, new IHMBodyTemperatureDataCallback() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob.syncDataFromDevice.1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onData(@Nullable List<GpsRecord> records) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onFinish(final boolean success) {
                HMLog.info("HMBodyTemperatureJob", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$syncDataFromDevice$1$onFinish$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "onSyncBodyTemperature Finish, Success: " + success;
                    }
                });
                DoLooper.Result result2 = result;
                result2.finish = true;
                result2.success = success;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onProgress(@Nullable Progress progress) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onStart() {
                HMLog.info("HMBodyTemperatureJob", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$syncDataFromDevice$1$onStart$1
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "onSyncBodyTemperature Start...";
                    }
                });
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.IHMBodyTemperatureDataCallback
            public void onTemperatureData(@Nullable HMBodyTemperatureData data) {
                result.data = data;
            }
        });
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getBODY_TEMPERATURE();
    }

    @Override // com.huami.bodymeasurements.temperature.model.device.TempDeviceApi
    @Nullable
    public Object getAllDayTempFromDevice(@NotNull Continuation<? super List<AllDayTemperatureDataDo>> continuation) {
        return this.allDayTempResult;
    }

    @Override // com.huami.bodymeasurements.temperature.model.device.TempDeviceApi
    @Nullable
    public Object getEightySecondsTempFromDevice(@NotNull Continuation<? super List<EightySecondsTemperatureDo>> continuation) {
        return this.eightySecondsTempResult;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.bodymeasurements.temperature.model.device.TempDeviceApi
    @Nullable
    public Object getSingleTempFromDevice(@NotNull Continuation<? super List<SingleTemperatureDo>> continuation) {
        return this.singleTempResult;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException {
        if (getDevice() instanceof HMMiLiProDevice) {
            sendStatus(0);
            try {
                final DoLooper.Result result = new DoLooper.Result();
                syncDataFromDevice(result);
                DoLooper.doLoop(new DoLooper.Function() { // from class: wo2
                    @Override // com.huami.watch.util.DoLooper.Function
                    public final Object apply() {
                        return HMBodyTemperatureJob.m3437start$lambda0(result);
                    }
                }, 60);
                Object obj = result.data;
                if (obj != null && (obj instanceof HMBodyTemperatureData)) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.HMBodyTemperatureData");
                    }
                    HMBodyTemperatureData hMBodyTemperatureData = (HMBodyTemperatureData) obj;
                    final Pair<Boolean, TemperatureAllDay[]> allDay = hMBodyTemperatureData.getAllDay();
                    final Pair<Boolean, TemperatureSingle[]> single = hMBodyTemperatureData.getSingle();
                    final Pair<Boolean, Temperature80s[]> eightySeconds = hMBodyTemperatureData.getEightySeconds();
                    if (allDay != null) {
                        HMLog.info("HMBodyTemperatureJob", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$start$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final String getA() {
                                return "allDayTemperature from device:" + ArraysKt___ArraysKt.toList(allDay.getSecond()) + ",success:" + allDay.getFirst();
                            }
                        });
                        if (allDay.getFirst().booleanValue()) {
                            if (!(allDay.getSecond().length == 0)) {
                                saveAllDayData(allDay.getSecond());
                            }
                        }
                    }
                    if (single != null) {
                        HMLog.info("HMBodyTemperatureJob", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$start$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final String getA() {
                                return "singleTemperature from device:" + ArraysKt___ArraysKt.toList(single.getSecond()) + ",success:" + single.getFirst();
                            }
                        });
                        if (single.getFirst().booleanValue()) {
                            if (!(single.getSecond().length == 0)) {
                                saveSingleData(single.getSecond());
                            }
                        }
                    }
                    if (eightySeconds != null) {
                        HMLog.info("HMBodyTemperatureJob", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob$start$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final String getA() {
                                return "eightSecondsTemperature from device:" + ArraysKt___ArraysKt.toList(eightySeconds.getSecond()) + ",success:" + eightySeconds.getFirst();
                            }
                        });
                        if (eightySeconds.getFirst().booleanValue()) {
                            if (!(eightySeconds.getSecond().length == 0)) {
                                saveEightySecondsData(eightySeconds.getSecond());
                            }
                        }
                    }
                }
                sendStatus(100);
            } catch (Exception e) {
                throw new SyncException("error of Stop HMBodyTemperatureJob", e, 0, 4, null);
            }
        }
    }
}
