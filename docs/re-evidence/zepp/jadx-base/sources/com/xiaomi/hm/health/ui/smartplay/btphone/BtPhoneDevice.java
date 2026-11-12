package com.xiaomi.hm.health.ui.smartplay.btphone;

import android.bluetooth.BluetoothAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.phone.PairDisConnected;
import com.huami.bluetooth.profile.channel.module.phone.PairStatus;
import com.huami.bluetooth.profile.channel.module.phone.Paired;
import com.huami.bluetooth.profile.channel.module.phone.PhoneModule;
import com.huami.bluetooth.profile.channel.module.phone.SettingApi;
import com.huami.bluetooth.profile.channel.module.phone.dto.ItemDto;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0007*\u0001-\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0007J\u001b\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J#\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u001bJ\u001f\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0018J\u001b\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\nJ#\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\u0013\u0010 \u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u0013\u0010!\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneDevice;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/huami/bluetooth/profile/channel/module/phone/SettingApi;", "a", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "show", "showContact", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isInUse", "", "callback", "getBtPhoneInUse", "", "time", "setBtPhoneDelay", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBtDeviceApi", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "getDeviceInfo", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Pair;", "getPairStatus", "enable", "enableBtPhone", "isBtPhoneEnabled", "prepareForPair", "", "Ljava/lang/String;", "TAG", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "c", "Lcom/huami/bluetooth/profile/channel/module/phone/SettingApi;", "api", "com/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneDevice$apiDataTransferCallback$1", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneDevice$apiDataTransferCallback$1;", "apiDataTransferCallback", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneDevice implements KoinComponent {

    @NotNull
    public static final BtPhoneDevice INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "BtPhoneDevice";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static SettingApi api;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final BtPhoneDevice$apiDataTransferCallback$1 apiDataTransferCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice", f = "BtPhoneDevice.kt", i = {0}, l = {151, 155}, m = "enableBtPhone", n = {"settingList"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BtPhoneDevice.this.enableBtPhone(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "enableBtPhone api is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice", f = "BtPhoneDevice.kt", i = {0}, l = {160, 164}, m = "enableBtPhone", n = {"settingList"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BtPhoneDevice.this.enableBtPhone(null, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "enableBtPhone api is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice", f = "BtPhoneDevice.kt", i = {}, l = {76}, m = "getApiByDevice", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BtPhoneDevice.this.a(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "not support btphone api : " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice", f = "BtPhoneDevice.kt", i = {}, l = {57}, m = "getBtDeviceApi", n = {}, s = {})
    public static final class g extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneDevice.this.getBtDeviceApi(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice$getBtPhoneInUse$1", f = "BtPhoneDevice.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Boolean, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function1<? super Boolean, Unit> function1, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
                this.a = 1;
                obj = btPhoneDevice.getPairStatus(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.b.invoke((Boolean) ((Pair) obj).getSecond());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice", f = "BtPhoneDevice.kt", i = {}, l = {128, 134}, m = "getPairStatus", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneDevice.this.getPairStatus(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getPairStatus api is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getPairStatus pairStatus is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice", f = "BtPhoneDevice.kt", i = {}, l = {171, 175}, m = "isBtPhoneEnabled", n = {}, s = {})
    public static final class l extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneDevice.this.isBtPhoneEnabled(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isBtPhoneEnabled api is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice", f = "BtPhoneDevice.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_SHOOT, DataTypeSource.SPORT_TYPE_BOULDERING}, m = "prepareForPair", n = {}, s = {})
    public static final class n extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneDevice.this.prepareForPair(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "prepareForPair api is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "show Contact failed as device is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "show Contact success: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice$apiDataTransferCallback$1] */
    static {
        final BtPhoneDevice btPhoneDevice = new BtPhoneDevice();
        INSTANCE = btPhoneDevice;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = btPhoneDevice;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        apiDataTransferCallback = new DataTransferCallback() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice$apiDataTransferCallback$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ byte[] a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(byte[] bArr) {
                    super(0);
                    this.a = bArr;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "receive data: " + GattUtils.bytesToHexString(this.a);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ byte[] a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(byte[] bArr) {
                    super(0);
                    this.a = bArr;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "send data: " + GattUtils.bytesToHexString(this.a);
                }
            }

            @Override // com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback
            public void onReceive(@NotNull byte[] data) {
                HMLog.info("BtPhoneDevice", new a(data));
            }

            @Override // com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback
            public void onSend(@NotNull byte[] data) {
                HMLog.info("BtPhoneDevice", new b(data));
            }
        };
    }

    private BtPhoneDevice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(HMMiLiProDevice hMMiLiProDevice, Continuation<? super SettingApi> continuation) {
        e eVar;
        SettingApi settingApi;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objQueryVersion = eVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.d;
        int iIntValue = -1;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryVersion);
            PhoneModule phoneModule = (PhoneModule) hMMiLiProDevice.getChannelModule(PhoneModule.class);
            if (phoneModule == null) {
                settingApi = null;
            } else {
                try {
                    settingApi = phoneModule.getSettingApi();
                } catch (Exception e2) {
                    HMLog.info(TAG, new f(e2));
                    settingApi = null;
                }
            }
            if (Intrinsics.areEqual(settingApi, api)) {
                return settingApi;
            }
            if (settingApi != null) {
                settingApi.setTransferCallback(apiDataTransferCallback);
            }
            if (settingApi != null) {
                eVar.a = settingApi;
                eVar.d = 1;
                objQueryVersion = settingApi.queryVersion(eVar);
                if (objQueryVersion == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (iIntValue > 0) {
                return settingApi;
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        settingApi = (SettingApi) eVar.a;
        ResultKt.throwOnFailure(objQueryVersion);
        Integer num = (Integer) objQueryVersion;
        if (num != null) {
            iIntValue = num.intValue();
        }
        if (iIntValue > 0) {
            return settingApi;
        }
        return null;
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    @JvmStatic
    public static final void getBtPhoneInUse(@NotNull Function1<? super Boolean, Unit> callback) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new h(callback, null), 2, null);
    }

    @JvmStatic
    @Nullable
    public static final Object showContact(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        BtPhoneDevice btPhoneDevice = INSTANCE;
        HMBaseDevice device = btPhoneDevice.b().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice != null) {
            return btPhoneDevice.showContact(hMMiLiProDevice, z, continuation);
        }
        HMLog.info(TAG, p.a);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object enableBtPhone(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        ArrayList arrayListArrayListOf;
        Boolean bool;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object btDeviceApi = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.d;
        boolean zBooleanValue = false;
        if (i3 != 0) {
            if (i3 == 1) {
                arrayListArrayListOf = (ArrayList) aVar.a;
                ResultKt.throwOnFailure(btDeviceApi);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(btDeviceApi);
            }
            bool = (Boolean) btDeviceApi;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(btDeviceApi);
        ItemDto itemDto = new ItemDto();
        itemDto.value = z;
        Unit unit = Unit.INSTANCE;
        arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(itemDto);
        aVar.a = arrayListArrayListOf;
        aVar.d = 1;
        btDeviceApi = getBtDeviceApi(aVar);
        if (btDeviceApi == coroutine_suspended) {
            return coroutine_suspended;
        }
        SettingApi settingApi = (SettingApi) btDeviceApi;
        if (settingApi == null) {
            HMLog.info(TAG, b.a);
        }
        if (settingApi != null) {
            aVar.a = null;
            aVar.d = 2;
            btDeviceApi = settingApi.updateSetting(arrayListArrayListOf, aVar);
            if (btDeviceApi == coroutine_suspended) {
                return coroutine_suspended;
            }
            bool = (Boolean) btDeviceApi;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getBtDeviceApi(@NotNull Continuation<? super SettingApi> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.c = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objA = gVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objA);
            HMBaseDevice device = b().getDevice(HMDeviceType.MILI);
            HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
            if (hMMiLiProDevice == null) {
                return null;
            }
            gVar.c = 1;
            objA = a(hMMiLiProDevice, gVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        SettingApi settingApi = (SettingApi) objA;
        api = settingApi;
        return settingApi;
    }

    @Nullable
    public final DeviceInfo getDeviceInfo() {
        HMBaseDevice device = b().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice == null) {
            return null;
        }
        return hMMiLiProDevice.getDeviceInfo();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPairStatus(@NotNull Continuation<? super Pair<Boolean, Boolean>> continuation) {
        i iVar;
        PairStatus pairStatus;
        boolean z;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.c = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object btDeviceApi = iVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(btDeviceApi);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(btDeviceApi);
            }
            pairStatus = (PairStatus) btDeviceApi;
            if (pairStatus == null) {
                HMLog.info(TAG, k.a);
                return new Pair(Boxing.boxBoolean(false), Boxing.boxBoolean(false));
            }
            boolean z2 = pairStatus instanceof PairDisConnected;
            if (!(pairStatus instanceof Paired) || z2) {
                z = true;
            } else {
                z = false;
            }
            return new Pair(Boxing.boxBoolean(z), Boxing.boxBoolean((z || z2) ? false : true));
        }
        ResultKt.throwOnFailure(btDeviceApi);
        iVar.c = 1;
        btDeviceApi = getBtDeviceApi(iVar);
        if (btDeviceApi == coroutine_suspended) {
            return coroutine_suspended;
        }
        SettingApi settingApi = (SettingApi) btDeviceApi;
        if (settingApi == null) {
            HMLog.info(TAG, j.a);
        }
        String name = BluetoothAdapter.getDefaultAdapter().getName();
        if (settingApi == null) {
            pairStatus = null;
        } else {
            iVar.c = 2;
            btDeviceApi = settingApi.queryPairStatus(name, iVar);
            if (btDeviceApi == coroutine_suspended) {
                return coroutine_suspended;
            }
            pairStatus = (PairStatus) btDeviceApi;
        }
        if (pairStatus == null) {
            HMLog.info(TAG, k.a);
            return new Pair(Boxing.boxBoolean(false), Boxing.boxBoolean(false));
        }
        boolean z3 = pairStatus instanceof PairDisConnected;
        if (pairStatus instanceof Paired) {
            z = true;
        } else {
            z = true;
        }
        return new Pair(Boxing.boxBoolean(z), Boxing.boxBoolean((z || z3) ? false : true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object isBtPhoneEnabled(@NotNull Continuation<? super Boolean> continuation) {
        l lVar;
        List list;
        ItemDto itemDto;
        Boolean boolBoxBoolean;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.c = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object btDeviceApi = lVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = lVar.c;
        boolean zBooleanValue = false;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(btDeviceApi);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(btDeviceApi);
            }
            list = (List) btDeviceApi;
            if (list != null && (itemDto = (ItemDto) CollectionsKt.firstOrNull(list)) != null && (boolBoxBoolean = Boxing.boxBoolean(itemDto.value)) != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(btDeviceApi);
        lVar.c = 1;
        btDeviceApi = getBtDeviceApi(lVar);
        if (btDeviceApi == coroutine_suspended) {
            return coroutine_suspended;
        }
        SettingApi settingApi = (SettingApi) btDeviceApi;
        if (settingApi == null) {
            HMLog.info(TAG, m.a);
        }
        if (settingApi != null) {
            lVar.c = 2;
            btDeviceApi = settingApi.querySettings(lVar);
            if (btDeviceApi == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = (List) btDeviceApi;
            if (list != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
            }
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object prepareForPair(@NotNull Continuation<? super Boolean> continuation) {
        n nVar;
        Boolean bool;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        } else {
            nVar = new n(continuation);
        }
        Object btDeviceApi = nVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = nVar.c;
        boolean zBooleanValue = false;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(btDeviceApi);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(btDeviceApi);
            }
            bool = (Boolean) btDeviceApi;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(btDeviceApi);
        nVar.c = 1;
        btDeviceApi = getBtDeviceApi(nVar);
        if (btDeviceApi == coroutine_suspended) {
            return coroutine_suspended;
        }
        SettingApi settingApi = (SettingApi) btDeviceApi;
        if (settingApi == null) {
            HMLog.info(TAG, o.a);
        }
        String name = BluetoothAdapter.getDefaultAdapter().getName();
        if (settingApi != null) {
            if (name == null) {
                name = " ";
            }
            nVar.c = 2;
            btDeviceApi = settingApi.preparePair(name, nVar);
            if (btDeviceApi == coroutine_suspended) {
                return coroutine_suspended;
            }
            bool = (Boolean) btDeviceApi;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Nullable
    public final Object setBtPhoneDelay(int i2, @NotNull Continuation<? super Boolean> continuation) {
        HMBaseDevice device = b().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        return hMMiLiProDevice == null ? Boxing.boxBoolean(false) : Boxing.boxBoolean(hMMiLiProDevice.setBtPhoneDelaySync((byte) i2));
    }

    @Nullable
    public final Object setBtPhoneDelay(@NotNull HMMiLiProDevice hMMiLiProDevice, int i2, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(hMMiLiProDevice.setBtPhoneDelaySync((byte) i2));
    }

    @Nullable
    public final Object showContact(@NotNull HMMiLiProDevice hMMiLiProDevice, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        boolean zShowContactSync = hMMiLiProDevice.showContactSync(HMAlertMode.ALERT_INCALL, z || HMPersonInfo.getInstance().getMiliConfig().isIncallNameDisplayEnabled());
        HMLog.info(TAG, new q(zShowContactSync));
        return Boxing.boxBoolean(zShowContactSync);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object enableBtPhone(@NotNull HMMiLiProDevice hMMiLiProDevice, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        ArrayList arrayList;
        Boolean bool;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objA = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.d;
        boolean zBooleanValue = false;
        if (i3 != 0) {
            if (i3 == 1) {
                arrayList = (ArrayList) cVar.a;
                ResultKt.throwOnFailure(objA);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
            bool = (Boolean) objA;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(objA);
        ItemDto itemDto = new ItemDto();
        itemDto.value = z;
        Unit unit = Unit.INSTANCE;
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(itemDto);
        cVar.a = arrayListArrayListOf;
        cVar.d = 1;
        objA = a(hMMiLiProDevice, cVar);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        arrayList = arrayListArrayListOf;
        SettingApi settingApi = (SettingApi) objA;
        if (settingApi == null) {
            HMLog.info(TAG, d.a);
        }
        if (settingApi != null) {
            cVar.a = null;
            cVar.d = 2;
            objA = settingApi.updateSetting(arrayList, cVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            bool = (Boolean) objA;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        return Boxing.boxBoolean(zBooleanValue);
    }
}
