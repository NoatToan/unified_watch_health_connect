package com.xiaomi.hm.health.device.headset.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.headset.vo.CervicalProtectionVo;
import com.xiaomi.hm.health.device.headset.vo.CervicalRelaxVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bo\u0010pJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\nJ\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\rJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\rJ$\u0010\u0013\u001a\u00020\n2\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011J$\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010\rJ\u0006\u0010\u0018\u001a\u00020\nJ\u001e\u0010\u001d\u001a\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\u0003J&\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\rJ=\u0010%\u001a\u00020\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b%\u0010&R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010'\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010,R$\u00103\u001a\u00020.2\u0006\u0010'\u001a\u00020.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R(\u00109\u001a\u0004\u0018\u0001042\b\u0010'\u001a\u0004\u0018\u0001048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010=R\u001e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010=R*\u0010F\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0003\u0018\u00010D0:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010=R\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR$\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010LR*\u0010T\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00120:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010=R\u001d\u0010_\u001a\u00020[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b/\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010aR\u001b\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0c8F@\u0006¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001b\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0c8F@\u0006¢\u0006\u0006\u001a\u0004\bg\u0010eR\u001b\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030c8F@\u0006¢\u0006\u0006\u001a\u0004\bi\u0010eR'\u0010l\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0003\u0018\u00010D0c8F@\u0006¢\u0006\u0006\u001a\u0004\bk\u0010eR\u0019\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00120c8F@\u0006¢\u0006\u0006\u001a\u0004\bm\u0010e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006q"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "enable", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "initHeadsetNeedCondition", "getCervicalProtectionInfo", "Lkotlin/Function1;", "callBack", "setCervicalProtection", "setCervicalRelax", "Lkotlin/Function2;", "", "queryAngle", "second", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "callback", "calibration", "closeCalibration", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "state", "handleLfEvent", "cancelCalibration", "isDualWear", "doCervicalProtectionSound", "releaseCpCallback", "releaseRelaxCallback", "releaseQueryAngleCallback", "releaseCalibrationCallback", "releaseCallback", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "<set-?>", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/databases/model/Device;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/databases/model/Device;", "getDevice", "()Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/headset/vo/CervicalProtectionVo;", "e", "Landroidx/lifecycle/MutableLiveData;", "_cervicalProtection", "Lcom/xiaomi/hm/health/device/headset/vo/CervicalRelaxVo;", "f", "_cervicalRelax", "g", "_soundPlayStatus", "Lkotlin/Pair;", "h", "_countDown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFirstQueryed", z.j, "Lkotlin/jvm/functions/Function1;", "calibrationCallback", hl.k, "cpCallback", "l", "crCallback", "m", "Lkotlin/jvm/functions/Function2;", "qaCallback", "Lkotlinx/coroutines/Job;", GoogleApiAvailabilityLight.b, "Lkotlinx/coroutines/Job;", "calibrationJob", "o", "_cervicalAngle", "Lcom/huami/devicex/manager/DeviceManagerApi;", com.google.android.exoplayer2.text.ttml.b.r, "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmDevice", "Landroidx/lifecycle/LiveData;", "getCervicalProtection", "()Landroidx/lifecycle/LiveData;", "cervicalProtection", "getCervicalRelax", "cervicalRelax", "getSoundPlayStatus", "soundPlayStatus", "getCountDown", "countDown", "getCervicalAngle", "cervicalAngle", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CervicalProtectionViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String address;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource deviceSource = HMDeviceSource.VDEVICE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<CervicalProtectionVo> _cervicalProtection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<CervicalRelaxVo> _cervicalRelax;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _soundPlayStatus;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Integer, Boolean>> _countDown;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isFirstQueryed;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Function1<? super CalibrationResultCode, Unit> calibrationCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Boolean, Unit> cpCallback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Boolean, Unit> crCallback;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Integer, ? super Boolean, Unit> qaCallback;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Job calibrationJob;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Integer> _cervicalAngle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$calibration$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {167, DataTypeSource.SPORT_TYPE_CHESS, 175, DataTypeSource.SPORT_TYPE_DOWNHILL, DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ CervicalProtectionViewModel c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$calibration$1$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0829a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ CervicalProtectionViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0829a(CervicalProtectionViewModel cervicalProtectionViewModel, Continuation<? super C0829a> continuation) {
                super(2, continuation);
                this.b = cervicalProtectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0829a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0829a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.b.calibrationCallback;
                if (function1 == null) {
                    return null;
                }
                function1.invoke(CalibrationResultCode.Failed.INSTANCE);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$calibration$1$2", f = "CervicalProtectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ CervicalProtectionViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CervicalProtectionViewModel cervicalProtectionViewModel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = cervicalProtectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.b.calibrationCallback;
                if (function1 != null) {
                    function1.invoke(CalibrationResultCode.Failed.INSTANCE);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.IntRef intRef, CervicalProtectionViewModel cervicalProtectionViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = intRef;
            this.c = cervicalProtectionViewModel;
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

        /* JADX WARN: Code duplicated, block: B:19:0x0047 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x0049  */
        /* JADX WARN: Code duplicated, block: B:22:0x006e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x006f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0092  */
        /* JADX WARN: Code duplicated, block: B:27:0x009c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x009d  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00bc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ca A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x00de A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006c -> B:24:0x0089). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006f -> B:24:0x0089). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x0047
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$closeCalibration$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CervicalProtectionViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CervicalProtectionViewModel cervicalProtectionViewModel = CervicalProtectionViewModel.this;
                this.a = 1;
                if (cervicalProtectionViewModel.a(false, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$doCervicalProtectionSound$1$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Boolean, Unit> b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super Boolean, Unit> function1, boolean z, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1<Boolean, Unit> function1 = this.b;
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(this.c));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$getCervicalProtectionInfo$1$resultCervicalProtection$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CervicalProtectionViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MozartDevice mozartDevice = (MozartDevice) CervicalProtectionViewModel.this.e();
            if (mozartDevice == null) {
                return null;
            }
            return mozartDevice.getCervicalProtection();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$getCervicalProtectionInfo$1$resultRelaxationPrompt$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CervicalProtectionViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MozartDevice mozartDevice = (MozartDevice) CervicalProtectionViewModel.this.e();
            if (mozartDevice == null) {
                return null;
            }
            return mozartDevice.getRelaxationPrompt();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$queryAngle$1$1$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Short c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Short sh, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = sh;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CervicalProtectionViewModel.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function2 function2 = CervicalProtectionViewModel.this.qaCallback;
            if (function2 != null) {
                function2.invoke(Boxing.boxInt(this.c.shortValue()), Boxing.boxBoolean(CervicalProtectionViewModel.this.isFirstQueryed.compareAndSet(true, false)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$setCervicalProtection$1$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CervicalProtectionViewModel.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = CervicalProtectionViewModel.this.cpCallback;
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(this.c));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$setCervicalRelax$1$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CervicalProtectionViewModel.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = CervicalProtectionViewModel.this.crCallback;
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(this.c));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CervicalProtectionViewModel() {
        MutableLiveData<CervicalProtectionVo> mutableLiveData = new MutableLiveData<>();
        final Qualifier qualifier = null;
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._cervicalProtection = mutableLiveData;
        MutableLiveData<CervicalRelaxVo> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(null);
        this._cervicalRelax = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(null);
        this._soundPlayStatus = mutableLiveData3;
        MutableLiveData<Pair<Integer, Boolean>> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.setValue(null);
        this._countDown = mutableLiveData4;
        this.isFirstQueryed = new AtomicBoolean(true);
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.setValue(0);
        this._cervicalAngle = mutableLiveData5;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = null == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(boolean z, Continuation<? super Boolean> continuation) {
        Boolean boolBoxBoolean;
        MozartDevice mozartDevice = (MozartDevice) e();
        boolean zBooleanValue = false;
        if (mozartDevice != null && (boolBoxBoolean = Boxing.boxBoolean(mozartDevice.doPostureCalibration(z))) != null) {
            zBooleanValue = boolBoxBoolean.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    private final boolean b() {
        Job job = this.calibrationJob;
        return job != null && job.isActive();
    }

    private final DeviceManagerApi c() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void doCervicalProtectionSound$default(CervicalProtectionViewModel cervicalProtectionViewModel, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        cervicalProtectionViewModel.doCervicalProtectionSound(z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice e() {
        return HMDeviceManager.getInstance().getDevice(HMDeviceType.HEADSET);
    }

    public static /* synthetic */ void handleLfEvent$default(CervicalProtectionViewModel cervicalProtectionViewModel, HMLFEvent hMLFEvent, HeadsetDevice.HeadsetDeviceState headsetDeviceState, int i, Object obj) {
        if ((i & 1) != 0) {
            hMLFEvent = null;
        }
        if ((i & 2) != 0) {
            headsetDeviceState = null;
        }
        cervicalProtectionViewModel.handleLfEvent(hMLFEvent, headsetDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void queryAngle$default(CervicalProtectionViewModel cervicalProtectionViewModel, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        cervicalProtectionViewModel.queryAngle(function2);
    }

    public static /* synthetic */ void releaseCallback$default(CervicalProtectionViewModel cervicalProtectionViewModel, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if ((i & 4) != 0) {
            bool3 = null;
        }
        if ((i & 8) != 0) {
            bool4 = null;
        }
        cervicalProtectionViewModel.releaseCallback(bool, bool2, bool3, bool4);
    }

    public final void calibration(int second, @Nullable Function1<? super CalibrationResultCode, Unit> callback) throws Throwable {
        if (second < 0) {
            throw new Throwable("second must > 0");
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = second;
        this.calibrationCallback = callback;
        this.calibrationJob = kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(intRef, this, null), 2, null);
    }

    public final void cancelCalibration() {
        this._countDown.postValue(null);
        this.calibrationCallback = null;
        Job job = this.calibrationJob;
        if (job == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    public final void closeCalibration() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final void doCervicalProtectionSound(boolean enable, @Nullable Function1<? super Boolean, Unit> callBack) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new CervicalProtectionViewModel$doCervicalProtectionSound$$inlined$safeLaunch$1(null, this, enable, callBack), 2, null);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final LiveData<Integer> getCervicalAngle() {
        return this._cervicalAngle;
    }

    @NotNull
    public final LiveData<CervicalProtectionVo> getCervicalProtection() {
        return this._cervicalProtection;
    }

    public final void getCervicalProtectionInfo() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new CervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final LiveData<CervicalRelaxVo> getCervicalRelax() {
        return this._cervicalRelax;
    }

    @NotNull
    public final LiveData<Pair<Integer, Boolean>> getCountDown() {
        return this._countDown;
    }

    @Nullable
    public final Device getDevice() {
        return this.device;
    }

    @NotNull
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LiveData<Boolean> getSoundPlayStatus() {
        return this._soundPlayStatus;
    }

    public final void handleLfEvent(@Nullable HMLFEvent event, @Nullable HeadsetDevice.HeadsetDeviceState state) {
        byte[] extra;
        if (state != null && !state.isDualWear()) {
            Function1<? super CalibrationResultCode, Unit> function1 = this.calibrationCallback;
            if (function1 == null) {
                return;
            }
            Function1<? super CalibrationResultCode, Unit> function2 = b() ? function1 : null;
            if (function2 == null) {
                return;
            }
            function2.invoke(CalibrationResultCode.UnWear.INSTANCE);
            cancelCalibration();
            return;
        }
        if ((event == null ? null : event.getLfType()) != LfType.HEAD_NECK_ANGLE_CHANGE) {
            if ((event == null ? null : event.getLfType()) != LfType.CERVICAL_PROTECTION_SOUND || (extra = event.getExtra()) == null) {
                return;
            }
            byte[] bArr = extra.length > 0 ? extra : null;
            if (bArr == null) {
                return;
            }
            this._soundPlayStatus.postValue(Boolean.valueOf(ByteUtilsKt.toBoolean(bArr[0])));
            return;
        }
        byte[] extra2 = event.getExtra();
        if (extra2 == null) {
            return;
        }
        CalibrationResultCode calibrationResultCodeValueOf = CalibrationResultCode.INSTANCE.valueOf(ArraysKt___ArraysKt.first(extra2));
        if (Intrinsics.areEqual(calibrationResultCodeValueOf, CalibrationResultCode.OutputValue.INSTANCE) && extra2.length >= 3) {
            this._cervicalAngle.postValue(Integer.valueOf(GattUtils.bytesToSignShort(ArraysKt___ArraysJvmKt.copyOfRange(extra2, 1, 3), 0)));
        }
        Function1<? super CalibrationResultCode, Unit> function3 = this.calibrationCallback;
        if (function3 == null) {
            return;
        }
        Function1<? super CalibrationResultCode, Unit> function4 = b() ? function3 : null;
        if (function4 == null) {
            return;
        }
        function4.invoke(calibrationResultCodeValueOf);
        cancelCalibration();
    }

    public final void initHeadsetNeedCondition(@NotNull String address) {
        this.address = address;
        Device bindDevice = c().getBindDevice(HMDeviceType.HEADSET, address);
        if (bindDevice == null) {
            bindDevice = null;
        } else {
            this.deviceSource = HMDeviceSource.fromValue(bindDevice.getDevice_source().intValue());
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
        }
        this.device = bindDevice;
        getCervicalProtectionInfo();
    }

    public final boolean isDualWear() {
        MozartDevice mozartDevice = (MozartDevice) e();
        HeadsetDevice.HeadsetDeviceState headsetState = mozartDevice == null ? null : mozartDevice.getHeadsetState();
        if (headsetState == null) {
            return false;
        }
        return headsetState.isDualWear();
    }

    public final void queryAngle(@Nullable Function2<? super Integer, ? super Boolean, Unit> callBack) {
        this.qaCallback = callBack;
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new CervicalProtectionViewModel$queryAngle$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void releaseCallback(@Nullable Boolean releaseCpCallback, @Nullable Boolean releaseRelaxCallback, @Nullable Boolean releaseQueryAngleCallback, @Nullable Boolean releaseCalibrationCallback) {
        if (releaseCpCallback != null) {
            if (!releaseCpCallback.booleanValue()) {
                releaseCpCallback = null;
            }
            if (releaseCpCallback != null) {
                releaseCpCallback.booleanValue();
                this.cpCallback = null;
            }
        }
        if (releaseRelaxCallback != null) {
            if (!releaseRelaxCallback.booleanValue()) {
                releaseRelaxCallback = null;
            }
            if (releaseRelaxCallback != null) {
                releaseRelaxCallback.booleanValue();
                this.crCallback = null;
            }
        }
        if (releaseQueryAngleCallback != null) {
            if (!releaseQueryAngleCallback.booleanValue()) {
                releaseQueryAngleCallback = null;
            }
            if (releaseQueryAngleCallback != null) {
                releaseQueryAngleCallback.booleanValue();
                this.qaCallback = null;
            }
        }
        if (releaseCalibrationCallback == null) {
            return;
        }
        if (!releaseCalibrationCallback.booleanValue()) {
            releaseCalibrationCallback = null;
        }
        if (releaseCalibrationCallback == null) {
            return;
        }
        releaseCalibrationCallback.booleanValue();
        this.calibrationCallback = null;
    }

    public final void setCervicalProtection(boolean enable, @NotNull Function1<? super Boolean, Unit> callBack) {
        this.cpCallback = callBack;
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new CervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1(null, this, enable), 2, null);
    }

    public final void setCervicalRelax(boolean enable, @NotNull Function1<? super Boolean, Unit> callBack) {
        this.crCallback = callBack;
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new CervicalProtectionViewModel$setCervicalRelax$$inlined$safeLaunch$1(null, this, enable), 2, null);
    }
}
