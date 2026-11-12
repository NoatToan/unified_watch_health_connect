package com.xiaomi.hm.health.device.headset.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.device.MozartDevice;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.headset.bean.HearingReportBean;
import com.xiaomi.hm.health.device.headset.vo.HearingHealthStatusVo;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\"\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u000eJ\u0006\u0010\u0011\u001a\u00020\u0005J\"\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u000eR\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR$\u0010%\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010,R\u001b\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0.8F@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100R\u001b\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0.8F@\u0006¢\u0006\u0006\u001a\u0004\b2\u00100R\u0019\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030.8F@\u0006¢\u0006\u0006\u001a\u0004\b4\u00100¨\u00069"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/HeadsetHearingHealthViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/headset/bean/HearingReportBean;", LargeWatchSkinActivity.KEY_BEAN, "", "e", "", HTTP.CONTENT_RANGE_BYTES, "c", "handleHearingHealthEvent", "", "enable", "refreshEarUserTime", "Lkotlin/Function1;", "callBack", "enableReportHeadsetInfo", "initHearingHealth", "setHearingHealth", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "connectStatus", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "_writingResult", "Lcom/xiaomi/hm/health/device/headset/vo/HearingHealthStatusVo;", GoogleApiAvailabilityLight.a, "_statusHearingHealth", "_hearingReportInfo", "<set-?>", "f", "isRefreshUserTime", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicInteger;", "g", "Ljava/util/concurrent/atomic/AtomicInteger;", "count", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmDevice", "Landroidx/lifecycle/LiveData;", "getWritingResult", "()Landroidx/lifecycle/LiveData;", "writingResult", "getStatusHearingHealth", "statusHearingHealth", "getHearingReportInfo", "hearingReportInfo", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetHearingHealthViewModel extends ViewModel implements KoinComponent {

    @NotNull
    private static final String h = "HeadsetHearingHealthViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean connectStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _writingResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HearingHealthStatusVo> _statusHearingHealth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HearingReportBean> _hearingReportInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isRefreshUserTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private AtomicInteger count;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadsetHearingHealthViewModel$enableReportHeadsetInfo$1$1", f = "HeadsetHearingHealthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Boolean, Unit> b;
        public final /* synthetic */ Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, Unit> function1, Boolean bool, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = bool;
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
            Function1<Boolean, Unit> function1 = this.b;
            Boolean bool = this.c;
            function1.invoke(Boxing.boxBoolean(bool == null ? false : bool.booleanValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<Boolean> a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef<Boolean> objectRef, Boolean bool) {
            super(0);
            this.a = objectRef;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "reportCmdResult:" + this.a.element + "\nhearingHealth:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadsetHearingHealthViewModel$setHearingHealth$1$1", f = "HeadsetHearingHealthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Boolean, Unit> b;
        public final /* synthetic */ Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Boolean, Unit> function1, Boolean bool, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
            Function1<Boolean, Unit> function1 = this.b;
            Boolean bool = this.c;
            function1.invoke(Boxing.boxBoolean(bool == null ? false : bool.booleanValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetHearingHealthViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.viewmodel.HeadsetHearingHealthViewModel$special$$inlined$inject$default$1
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
        this.connectStatus = new AtomicBoolean(false);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._writingResult = mutableLiveData;
        MutableLiveData<HearingHealthStatusVo> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(null);
        this._statusHearingHealth = mutableLiveData2;
        MutableLiveData<HearingReportBean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(new HearingReportBean(0L, 0L, 0, 0, 0, 0, 63, null));
        this._hearingReportInfo = mutableLiveData3;
        this.isRefreshUserTime = new AtomicBoolean(true);
        this.count = new AtomicInteger(0);
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice b() {
        return a().getDevice(HMDeviceType.HEADSET);
    }

    private final HearingReportBean c(byte[] bytes) {
        HearingReportBean value = this._hearingReportInfo.getValue();
        if (value == null) {
            value = new HearingReportBean(0L, 0L, 0, 0, 0, 0, 63, null);
        }
        value.setLeftInnerEarVolume(ByteUtilsKt.toInt$default(ArraysKt___ArraysJvmKt.copyOfRange(bytes, 0, 1), 1, 0, 2, null));
        value.setRightInnerEarVolume(ByteUtilsKt.toInt$default(ArraysKt___ArraysJvmKt.copyOfRange(bytes, 1, 2), 1, 0, 2, null));
        value.setLeftUserTime(ByteUtilsKt.toLong$default(ArraysKt___ArraysJvmKt.copyOfRange(bytes, 2, 6), 4, 0, 2, null));
        value.setRightUserTime(ByteUtilsKt.toLong$default(ArraysKt___ArraysJvmKt.copyOfRange(bytes, 6, 10), 4, 0, 2, null));
        if (!(bytes.length > 10)) {
            bytes = null;
        }
        if (bytes != null) {
            value.setLeftScore(ByteUtilsKt.toInt$default(ArraysKt___ArraysJvmKt.copyOfRange(bytes, 10, 11), 1, 0, 2, null));
            value.setRightScore(ByteUtilsKt.toInt$default(ArraysKt___ArraysJvmKt.copyOfRange(bytes, 11, 12), 1, 0, 2, null));
        }
        return value;
    }

    private final void e(HearingReportBean bean) {
        MozartDevice mozartDevice = (MozartDevice) b();
        HeadsetDevice.HeadsetDeviceState headsetState = mozartDevice == null ? null : mozartDevice.getHeadsetState();
        boolean z = false;
        if (!(headsetState != null && headsetState.isLeftConnected())) {
            bean.setLeftUserTime(4294967295L);
        }
        if (headsetState != null && headsetState.isRightConnected()) {
            z = true;
        }
        if (!z) {
            bean.setRightUserTime(4294967295L);
        }
        this._hearingReportInfo.postValue(bean);
    }

    public final void enableReportHeadsetInfo(boolean enable, @NotNull Function1<? super Boolean, Unit> callBack) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadsetHearingHealthViewModel$enableReportHeadsetInfo$$inlined$safeLaunch$1(null, this, enable, callBack), 2, null);
    }

    @NotNull
    public final LiveData<HearingReportBean> getHearingReportInfo() {
        return this._hearingReportInfo;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LiveData<HearingHealthStatusVo> getStatusHearingHealth() {
        return this._statusHearingHealth;
    }

    @NotNull
    public final LiveData<Boolean> getWritingResult() {
        return this._writingResult;
    }

    public final void handleHearingHealthEvent(@NotNull byte[] bytes) {
        try {
            HearingReportBean hearingReportBeanC = c(bytes);
            boolean zIsConnected = false;
            if (!this.isRefreshUserTime.get()) {
                HMBaseDevice hMBaseDeviceB = b();
                if ((hMBaseDeviceB != null && hMBaseDeviceB.isConnected() == this.connectStatus.get()) && this.count.get() > 4) {
                    hearingReportBeanC.setRefreshUserTime(false);
                    this._hearingReportInfo.postValue(hearingReportBeanC);
                    return;
                }
            }
            hearingReportBeanC.setRefreshUserTime(true);
            e(hearingReportBeanC);
            this.isRefreshUserTime.set(false);
            AtomicBoolean atomicBoolean = this.connectStatus;
            HMBaseDevice hMBaseDeviceB2 = b();
            if (hMBaseDeviceB2 != null) {
                zIsConnected = hMBaseDeviceB2.isConnected();
            }
            atomicBoolean.set(zIsConnected);
            AtomicInteger atomicInteger = this.count;
            atomicInteger.set(atomicInteger.get() + 1);
        } catch (Exception e) {
            HMLog.warn$default(h, null, new b(e), 2, null);
        }
    }

    public final void initHearingHealth() {
        HMBaseDevice device = a().getDevice(HMDeviceType.HEADSET);
        this._statusHearingHealth.setValue(new HearingHealthStatusVo(null, false));
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1(null, device, this), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: isRefreshUserTime, reason: from getter */
    public final AtomicBoolean getIsRefreshUserTime() {
        return this.isRefreshUserTime;
    }

    public final void refreshEarUserTime(boolean enable) {
        HearingReportBean value;
        if (enable && (value = this._hearingReportInfo.getValue()) != null) {
            value.setRefreshUserTime(true);
            this.count.set(0);
            e(value);
        }
        this.isRefreshUserTime.set(enable);
    }

    public final void setHearingHealth(boolean enable, @NotNull Function1<? super Boolean, Unit> callBack) {
        HMBaseDevice device = a().getDevice(HMDeviceType.HEADSET);
        this._writingResult.setValue(null);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1(null, device, enable, this, callBack), 2, null);
    }
}
