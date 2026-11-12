package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.PressureJob;
import com.huami.device.core.sync.impl.job.milible.type.PressureType;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.stress.domain.data.AllDayStressRepositoryImpl;
import com.huami.stress.domain.data.SingleStressRepositoryImpl;
import com.huami.stress.domain.data.device.StressDeviceApi;
import com.huami.stress.domain.data.device.bean.StressDeviceBean;
import com.huami.stress.domain.data.local.StressDatabase;
import com.huami.stress.domain.data.local.dao.AllDayStressDao;
import com.huami.stress.domain.data.local.dao.SingleStressDao;
import com.huami.stress.domain.data.remote.StressWebApi;
import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.stress.StressScopeNames;
import com.xiaomi.hm.health.stress.StressUseCaseUtils;
import com.xiaomi.hm.health.stress.koin.StressExtKt;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bs\u0010tJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u001e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0014\u0010\u001b\u001a\u00020\u00142\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016J=\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J=\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u00109\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u00108R\u001d\u0010>\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010=R\u001d\u0010C\u001a\u00020?8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010BR\u001d\u0010H\u001a\u00020D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010)\u001a\u0004\bF\u0010GR\u001d\u0010M\u001a\u00020I8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010)\u001a\u0004\bK\u0010LR\u001d\u0010R\u001a\u00020N8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010)\u001a\u0004\bP\u0010QR\u001d\u0010W\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010)\u001a\u0004\bU\u0010VR\u001d\u0010\\\u001a\u00020X8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010)\u001a\u0004\bZ\u0010[R%\u0010a\u001a\n ]*\u0004\u0018\u00010$0$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010)\u001a\u0004\b_\u0010`R\u001f\u0010d\u001a\u0004\u0018\u00010$8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\bb\u0010)\u001a\u0004\bc\u0010`R\u001d\u0010g\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010)\u001a\u0004\bf\u0010`R\u001d\u0010j\u001a\u00020$8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\bh\u0010)\u001a\u0004\bi\u0010`R\u001d\u0010\u001d\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010)\u001a\u0004\bl\u0010mR&\u0010p\u001a\u0012\u0012\u0004\u0012\u00020\u00050nj\b\u0012\u0004\u0012\u00020\u0005`o8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR&\u0010r\u001a\u0012\u0012\u0004\u0012\u00020\u00050nj\b\u0012\u0004\u0012\u00020\u0005`o8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006u"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMPressureJob;", "Lcom/huami/device/core/sync/impl/job/milible/PressureJob;", "Lcom/huami/stress/domain/data/device/StressDeviceApi;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "pressureData", "Lcom/huami/stress/domain/data/device/bean/StressDeviceBean;", "convertAndFilter", "", "futureData", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "Lcom/huami/device/core/sync/impl/job/milible/type/PressureType;", "type", "Ljava/util/Calendar;", "loadStartTime", "", "time", "allDay", "", "saveSyncTime", "outData", "onDataOut", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.EXCEPTION, "onError", "", "deviceType", "deviceSource", "calendar", "Lkotlin/Pair;", "getDeviceAllDayStress", "(IILjava/util/Calendar;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceSingleStress", "", "tag", "Ljava/lang/String;", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi$delegate", "Lkotlin/Lazy;", "getDeviceTimeStoreApi", "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi$delegate", "getDeviceManagerApi", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lorg/koin/core/qualifier/StringQualifier;", "stressScopeName", "Lorg/koin/core/qualifier/StringQualifier;", "Lorg/koin/core/scope/Scope;", "stressScope$delegate", "getStressScope", "()Lorg/koin/core/scope/Scope;", "stressScope", "Lcom/huami/stress/domain/data/local/StressDatabase;", "stressDatabase$delegate", "getStressDatabase", "()Lcom/huami/stress/domain/data/local/StressDatabase;", "stressDatabase", "Lcom/huami/stress/domain/data/local/dao/SingleStressDao;", "singleDao$delegate", "getSingleDao", "()Lcom/huami/stress/domain/data/local/dao/SingleStressDao;", "singleDao", "Lcom/huami/stress/domain/data/local/dao/AllDayStressDao;", "allDayDao$delegate", "getAllDayDao", "()Lcom/huami/stress/domain/data/local/dao/AllDayStressDao;", "allDayDao", "Lcom/huami/stress/domain/data/remote/StressWebApi;", "stressWebApi$delegate", "getStressWebApi", "()Lcom/huami/stress/domain/data/remote/StressWebApi;", "stressWebApi", "Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "deviceSnService$delegate", "getDeviceSnService", "()Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "deviceSnService", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "allDayStressRepository$delegate", "getAllDayStressRepository", "()Lcom/huami/stress/domain/repository/AllDayStressRepository;", "allDayStressRepository", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "singleStressRepository$delegate", "getSingleStressRepository", "()Lcom/huami/stress/domain/repository/SingleStressRepository;", "singleStressRepository", "kotlin.jvm.PlatformType", "userId$delegate", "getUserId", "()Ljava/lang/String;", "userId", "deviceSn$delegate", "getDeviceSn", ParamKey.deviceSn, "deviceId$delegate", "getDeviceId", "deviceId", "deviceMac$delegate", "getDeviceMac", ParamKey.deviceMac, "deviceType$delegate", "getDeviceType", "()I", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allDayPressureResult", "Ljava/util/ArrayList;", "singlePressureResult", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public class HMPressureJob extends PressureJob implements StressDeviceApi, KoinComponent {

    /* JADX INFO: renamed from: allDayDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy allDayDao;

    @NotNull
    private final ArrayList<HMPressureData> allDayPressureResult;

    /* JADX INFO: renamed from: allDayStressRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy allDayStressRepository;

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

    /* JADX INFO: renamed from: deviceTimeStoreApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceTimeStoreApi;

    /* JADX INFO: renamed from: deviceType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceType;

    /* JADX INFO: renamed from: singleDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singleDao;

    @NotNull
    private final ArrayList<HMPressureData> singlePressureResult;

    /* JADX INFO: renamed from: singleStressRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singleStressRepository;

    /* JADX INFO: renamed from: stressDatabase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stressDatabase;

    /* JADX INFO: renamed from: stressScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stressScope;

    @NotNull
    private final StringQualifier stressScopeName;

    /* JADX INFO: renamed from: stressWebApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stressWebApi;

    @NotNull
    private final String tag = "HMPressureJob";

    /* JADX INFO: renamed from: userId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$onDataOut$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$onDataOut$1", f = "HMPressureJob.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<HMPressureData> $outData;
        public final /* synthetic */ PressureType $type;
        public int label;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$onDataOut$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$onDataOut$1$1", f = "HMPressureJob.kt", i = {}, l = {95, 104}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ List<HMPressureData> $outData;
            public final /* synthetic */ PressureType $type;
            public int label;
            public final /* synthetic */ HMPressureJob this$0;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$onDataOut$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class C08151 extends FunctionReferenceImpl implements Function2<Long, Boolean, Unit> {
                public C08151(HMPressureJob hMPressureJob) {
                    super(2, hMPressureJob, HMPressureJob.class, "saveSyncTime", "saveSyncTime(JZ)V", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Long l, Boolean bool) {
                    invoke(l.longValue(), bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j, boolean z) {
                    ((HMPressureJob) this.receiver).saveSyncTime(j, z);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$onDataOut$1$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<Long, Boolean, Unit> {
                public AnonymousClass2(HMPressureJob hMPressureJob) {
                    super(2, hMPressureJob, HMPressureJob.class, "saveSyncTime", "saveSyncTime(JZ)V", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Long l, Boolean bool) {
                    invoke(l.longValue(), bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j, boolean z) {
                    ((HMPressureJob) this.receiver).saveSyncTime(j, z);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$onDataOut$1$1$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PressureType.values().length];
                    iArr[PressureType.ALL_DAY.ordinal()] = 1;
                    iArr[PressureType.SINGLE.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08141(PressureType pressureType, HMPressureJob hMPressureJob, List<HMPressureData> list, Continuation<? super C08141> continuation) {
                super(2, continuation);
                this.$type = pressureType;
                this.this$0 = hMPressureJob;
                this.$outData = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C08141(this.$type, this.this$0, this.$outData, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C08141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
                    if (i2 == 1) {
                        this.this$0.allDayPressureResult.clear();
                        this.this$0.allDayPressureResult.addAll(this.$outData);
                        AllDayStressRepository allDayStressRepository = this.this$0.getAllDayStressRepository();
                        String userId = this.this$0.getUserId();
                        int deviceType = this.this$0.getDeviceType();
                        int value = this.this$0.getDevice().getMDeviceSource().getValue();
                        String deviceId = this.this$0.getDeviceId();
                        String deviceMac = this.this$0.getDeviceMac();
                        String strValueOf = String.valueOf(this.this$0.getDeviceSn());
                        Calendar calendarLoadStartTime = this.this$0.loadStartTime(PressureType.ALL_DAY);
                        C08151 c08151 = new C08151(this.this$0);
                        this.label = 1;
                        if (allDayStressRepository.saveAllDayStressFromDevice(userId, deviceType, value, deviceId, deviceMac, strValueOf, calendarLoadStartTime, c08151, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 == 2) {
                        this.this$0.singlePressureResult.clear();
                        this.this$0.singlePressureResult.addAll(this.$outData);
                        SingleStressRepository singleStressRepository = this.this$0.getSingleStressRepository();
                        String userId2 = this.this$0.getUserId();
                        int deviceType2 = this.this$0.getDeviceType();
                        int value2 = this.this$0.getDevice().getMDeviceSource().getValue();
                        String deviceId2 = this.this$0.getDeviceId();
                        String deviceMac2 = this.this$0.getDeviceMac();
                        String strValueOf2 = String.valueOf(this.this$0.getDeviceSn());
                        Calendar calendarLoadStartTime2 = this.this$0.loadStartTime(PressureType.SINGLE);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                        this.label = 2;
                        if (singleStressRepository.saveSingleStressFromDevice(userId2, deviceType2, value2, deviceId2, deviceMac2, strValueOf2, calendarLoadStartTime2, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (!this.$outData.isEmpty()) {
                    DeviceXFunctionsKt.getAppStateApi().getStressUseCaseApi().syncDataToServer();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PressureType pressureType, List<HMPressureData> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = pressureType;
            this.$outData = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMPressureJob.this.new AnonymousClass1(this.$type, this.$outData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long jMaxTime = HMPressureJob.this.maxTime();
                C08141 c08141 = new C08141(this.$type, HMPressureJob.this, this.$outData, null);
                this.label = 1;
                if (TimeoutKt.withTimeout(jMaxTime, c08141, this) == coroutine_suspended) {
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
    public HMPressureJob() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceTimeStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceTimeStoreApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.DeviceTimeStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceTimeStoreApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$special$$inlined$inject$default$2
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr2, objArr3);
            }
        });
        this.stressScopeName = QualifierKt.named(StressScopeNames.STRESS);
        this.stressScope = LazyKt__LazyJVMKt.lazy(new Function0<Scope>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$stressScope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Scope getA() {
                return Koin.getOrCreateScope$default(this.this$0.getKoin(), this.this$0.stressScopeName.getValue(), this.this$0.stressScopeName, null, 4, null);
            }
        });
        this.stressDatabase = LazyKt__LazyJVMKt.lazy(new Function0<StressDatabase>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$stressDatabase$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final StressDatabase getA() {
                return (StressDatabase) this.this$0.getStressScope().get(Reflection.getOrCreateKotlinClass(StressDatabase.class), null, null);
            }
        });
        this.singleDao = LazyKt__LazyJVMKt.lazy(new Function0<SingleStressDao>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$singleDao$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SingleStressDao getA() {
                return this.this$0.getStressDatabase().singleStressDao();
            }
        });
        this.allDayDao = LazyKt__LazyJVMKt.lazy(new Function0<AllDayStressDao>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$allDayDao$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AllDayStressDao getA() {
                return this.this$0.getStressDatabase().allDayStressDao();
            }
        });
        this.stressWebApi = LazyKt__LazyJVMKt.lazy(new Function0<StressWebApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$stressWebApi$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final StressWebApi getA() {
                return (StressWebApi) this.this$0.getStressScope().get(Reflection.getOrCreateKotlinClass(StressWebApi.class), null, null);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceSnService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceSnService>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$special$$inlined$inject$default$3
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceSnService.class), objArr4, objArr5);
            }
        });
        this.allDayStressRepository = LazyKt__LazyJVMKt.lazy(new Function0<AllDayStressRepositoryImpl>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$allDayStressRepository$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AllDayStressRepositoryImpl getA() {
                AllDayStressDao allDayDao = this.this$0.getAllDayDao();
                HMPressureJob hMPressureJob = this.this$0;
                return new AllDayStressRepositoryImpl(allDayDao, hMPressureJob, hMPressureJob.getStressWebApi());
            }
        });
        this.singleStressRepository = LazyKt__LazyJVMKt.lazy(new Function0<SingleStressRepositoryImpl>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$singleStressRepository$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SingleStressRepositoryImpl getA() {
                SingleStressDao singleDao = this.this$0.getSingleDao();
                HMPressureJob hMPressureJob = this.this$0;
                return new SingleStressRepositoryImpl(singleDao, hMPressureJob, hMPressureJob.getStressWebApi());
            }
        });
        this.userId = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$userId$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return HMPersonInfo.getInstance().getUserInfo().getUserid();
            }
        });
        this.deviceSn = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$deviceSn$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.this$0.getDeviceSnService().getSn(HMDeviceType.MILI);
            }
        });
        this.deviceId = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$deviceId$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                String deviceID;
                DeviceInfo deviceInfo = this.this$0.getDevice().getDeviceInfo();
                return (deviceInfo == null || (deviceID = deviceInfo.getDeviceID()) == null) ? "" : deviceID;
            }
        });
        this.deviceMac = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$deviceMac$2
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
        this.deviceType = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob$deviceType$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return this.this$0.getDevice().getMDeviceSource().getType().getValue();
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Integer getA() {
                return Integer.valueOf(invoke2());
            }
        });
        this.allDayPressureResult = new ArrayList<>();
        this.singlePressureResult = new ArrayList<>();
    }

    private final List<StressDeviceBean> convertAndFilter(List<HMPressureData> pressureData) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : pressureData) {
            HMPressureData hMPressureData = (HMPressureData) obj;
            if ((hMPressureData.inVaild() || hMPressureData.repeat() || futureData(hMPressureData)) ? false : true) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(StressExtKt.toStressDeviceBean((HMPressureData) it2.next()));
        }
        return arrayList2;
    }

    private final boolean futureData(HMPressureData hMPressureData) {
        return hMPressureData.getTime() > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AllDayStressDao getAllDayDao() {
        return (AllDayStressDao) this.allDayDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AllDayStressRepository getAllDayStressRepository() {
        return (AllDayStressRepository) this.allDayStressRepository.getValue();
    }

    public static /* synthetic */ Object getDeviceAllDayStress$suspendImpl(HMPressureJob hMPressureJob, int i, int i2, Calendar calendar, Continuation continuation) {
        return new Pair(Boxing.boxBoolean(true), hMPressureJob.convertAndFilter(hMPressureJob.allDayPressureResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeviceId() {
        return (String) this.deviceId.getValue();
    }

    public static /* synthetic */ Object getDeviceSingleStress$suspendImpl(HMPressureJob hMPressureJob, int i, int i2, Calendar calendar, Continuation continuation) {
        return new Pair(Boxing.boxBoolean(true), hMPressureJob.convertAndFilter(hMPressureJob.singlePressureResult));
    }

    private final DeviceTimeStoreApi getDeviceTimeStoreApi() {
        return (DeviceTimeStoreApi) this.deviceTimeStoreApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDeviceType() {
        return ((Number) this.deviceType.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingleStressDao getSingleDao() {
        return (SingleStressDao) this.singleDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingleStressRepository getSingleStressRepository() {
        return (SingleStressRepository) this.singleStressRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StressDatabase getStressDatabase() {
        return (StressDatabase) this.stressDatabase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Scope getStressScope() {
        return (Scope) this.stressScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StressWebApi getStressWebApi() {
        return (StressWebApi) this.stressWebApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.PressureJob, com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getPRESSURE();
    }

    @Override // com.huami.stress.domain.data.device.StressDeviceApi
    @Nullable
    public Object getDeviceAllDayStress(int i, int i2, @NotNull Calendar calendar, @NotNull Continuation<? super Pair<Boolean, ? extends List<StressDeviceBean>>> continuation) {
        return getDeviceAllDayStress$suspendImpl(this, i, i2, calendar, continuation);
    }

    @NotNull
    public String getDeviceMac() {
        return (String) this.deviceMac.getValue();
    }

    @NotNull
    public final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @Override // com.huami.stress.domain.data.device.StressDeviceApi
    @Nullable
    public Object getDeviceSingleStress(int i, int i2, @NotNull Calendar calendar, @NotNull Continuation<? super Pair<Boolean, ? extends List<StressDeviceBean>>> continuation) {
        return getDeviceSingleStress$suspendImpl(this, i, i2, calendar, continuation);
    }

    @Nullable
    public String getDeviceSn() {
        return (String) this.deviceSn.getValue();
    }

    @NotNull
    public final DeviceSnService getDeviceSnService() {
        return (DeviceSnService) this.deviceSnService.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.impl.job.milible.PressureJob
    @NotNull
    public Calendar loadStartTime(@NotNull PressureType type) {
        return type == PressureType.SINGLE ? getDeviceTimeStoreApi().getPressureSingleSyncTime() : getDeviceTimeStoreApi().getPressureAllDaySyncTime();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.PressureJob
    public void onDataOut(@NotNull PressureType type, @NotNull List<HMPressureData> outData) throws InterruptedException {
        BuildersKt.runBlocking(getScope().getCoroutineContext(), new AnonymousClass1(type, outData, null));
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onError(@NotNull Exception exception) {
        HMLog.e(this.tag, exception);
    }

    public void saveSyncTime(long time, boolean allDay) {
        StressUseCaseUtils.INSTANCE.saveStressSyncTime(time, allDay);
    }
}
