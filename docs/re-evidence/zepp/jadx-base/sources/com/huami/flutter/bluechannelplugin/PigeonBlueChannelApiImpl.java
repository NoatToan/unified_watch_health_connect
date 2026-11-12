package com.huami.flutter.bluechannelplugin;

import com.huami.bluetooth.profile.channel.module.js.JSModule;
import com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import io.flutter.plugin.common.BinaryMessenger;
import java.io.File;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016J \u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016J(\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003H\u0016J3\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/huami/flutter/bluechannelplugin/PigeonBlueChannelApiImpl;", "Lcom/huami/flutter/bluechannelplugin/PigeonBlueChannel$PigeonBlueChannelApi;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/flutter/bluechannelplugin/PigeonBlueChannel$Result;", "", "result", "", "getConnectionStatus", "", "supportFwLowestVersion", "getOtaStatus", "devicePackagePath", "type", "Lcom/huami/flutter/bluechannelplugin/PigeonBlueChannel$DevicePackageInstallStatus;", "sendDevicePackage", "Lcom/huami/flutter/bluechannelplugin/PigeonBlueChannel$DeviceInformation;", "getDeviceInfo", "", "isDeviceSupportJsApp", "appSize", "faceId", "getDeviceWatchFaceStorageConditions", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/huami/flutter/bluechannelplugin/PigeonBlueChannel$Result;)V", "Lio/flutter/plugin/common/BinaryMessenger;", "a", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/huami/flutter/bluechannelplugin/BlueChannelDeviceApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/flutter/bluechannelplugin/BlueChannelDeviceApi;", "blueChannelDeviceApi", "Lcom/huami/flutter/bluechannelplugin/PigeonBlueChannel$PigeonBlueChannelCallbackApi$Reply;", "Ljava/lang/Void;", "c", "Lcom/huami/flutter/bluechannelplugin/PigeonBlueChannel$PigeonBlueChannelCallbackApi$Reply;", "replyFromFlutter", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "Companion", "blue_channel_plugin_release"}, k = 1, mv = {1, 5, 1})
public final class PigeonBlueChannelApiImpl implements PigeonBlueChannel.PigeonBlueChannelApi, KoinComponent {

    @NotNull
    private static final String d = "BlueChannelImpl";
    private static final long e = 0;
    private static final long f = 1;
    private static final long g = 2;
    private static final long h = 0;
    private static final long i = 1;
    private static final long j = -1;
    private static final int k = 14;
    private static final int l = 34;
    private static final int m = 32;
    private static final int n = 33;
    private static final long o = 0;
    private static final long p = 1;
    private static final long q = 2;
    private static final long r = 3;
    private static final long s = 4;
    private static final long t = 5;
    private static final long u = 6;

    @NotNull
    private static final String v = "2";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BinaryMessenger binaryMessenger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy blueChannelDeviceApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PigeonBlueChannel.PigeonBlueChannelCallbackApi.Reply<Void> replyFromFlutter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("connectionStatus is ", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("get device source is ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$getOtaStatus$1", f = "PigeonBlueChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ PigeonBlueChannel.Result<Long> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "start getOtaStatus.";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Long a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Long l) {
                super(0);
                this.a = l;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getOtaStatus ota status value is " + this.a + "!!!";
            }
        }

        /* JADX INFO: renamed from: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$getOtaStatus$1$2$2", f = "PigeonBlueChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0427c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ PigeonBlueChannel.Result<Long> b;
            public final /* synthetic */ Long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0427c(PigeonBlueChannel.Result<Long> result, Long l, Continuation<? super C0427c> continuation) {
                super(2, continuation);
                this.b = result;
                this.c = l;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0427c(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0427c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PigeonBlueChannel.Result<Long> result = this.b;
                if (result != null) {
                    result.success(this.c);
                }
                return Unit.INSTANCE;
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
                return "getOtaStatus ota status value is error!";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, PigeonBlueChannel.Result<Long> result, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = result;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PigeonBlueChannelApiImpl.this.new c(this.c, this.d, continuation);
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
            HMLog.info(PigeonBlueChannelApiImpl.d, a.a);
            BlueChannelDeviceApi blueChannelDeviceApiB = PigeonBlueChannelApiImpl.this.b();
            Long lBoxLong = blueChannelDeviceApiB == null ? null : Boxing.boxLong(blueChannelDeviceApiB.obtainOtaStatus(this.c));
            PigeonBlueChannel.Result<Long> result = this.d;
            HMLog.info(PigeonBlueChannelApiImpl.d, new b(lBoxLong));
            if (lBoxLong != null) {
                kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C0427c(result, lBoxLong, null), 3, null);
            } else {
                HMLog.error$default(PigeonBlueChannelApiImpl.d, null, null, d.a, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sendDevicePackage error: the file path is empty (filePath=" + this.a + "), and return install failed to flutter module";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sendDevicePackage error! Device is null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sendDevicePackage error: the file path is " + this.a + ", but file is not exist, and return install failed to flutter module";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ HMFirmwareType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HMFirmwareType hMFirmwareType) {
            super(0);
            this.a = hMFirmwareType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sendDevicePackage type  is " + this.a + '}';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PigeonBlueChannelApiImpl(@NotNull BinaryMessenger binaryMessenger) {
        this.binaryMessenger = binaryMessenger;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.blueChannelDeviceApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<BlueChannelDeviceApi>() { // from class: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.flutter.bluechannelplugin.BlueChannelDeviceApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BlueChannelDeviceApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(BlueChannelDeviceApi.class), qualifier, objArr);
            }
        });
        this.replyFromFlutter = new PigeonBlueChannel.PigeonBlueChannelCallbackApi.Reply() { // from class: uz5
            @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.PigeonBlueChannelCallbackApi.Reply
            public final void reply(Object obj) {
                PigeonBlueChannelApiImpl.c((Void) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BlueChannelDeviceApi b() {
        return (BlueChannelDeviceApi) this.blueChannelDeviceApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Void r0) {
    }

    @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.PigeonBlueChannelApi
    public void getConnectionStatus(@Nullable PigeonBlueChannel.Result<Long> result) {
        long j2;
        HMBaseDevice connectedDevice;
        if (GattUtils.isBluetoothEnable()) {
            BlueChannelDeviceApi blueChannelDeviceApiB = b();
            boolean zIsConnected = false;
            if (blueChannelDeviceApiB != null && (connectedDevice = blueChannelDeviceApiB.getConnectedDevice()) != null) {
                zIsConnected = connectedDevice.isConnected();
            }
            j2 = zIsConnected ? 0L : 1L;
        } else {
            j2 = 2;
        }
        HMLog.info(d, new a(j2));
        if (result == null) {
            return;
        }
        result.success(Long.valueOf(j2));
    }

    @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.PigeonBlueChannelApi
    public void getDeviceInfo(@Nullable PigeonBlueChannel.Result<PigeonBlueChannel.DeviceInformation> result) {
        HMBaseDevice connectedDevice;
        HMDeviceSource deviceSource;
        HMBaseDevice connectedDevice2;
        if (!(result != null)) {
            throw new IllegalArgumentException(("BlueChannelImpl getDeviceId(): Bad result=" + result + " param").toString());
        }
        BlueChannelDeviceApi blueChannelDeviceApiB = b();
        Integer numValueOf = (blueChannelDeviceApiB == null || (connectedDevice = blueChannelDeviceApiB.getConnectedDevice()) == null || (deviceSource = connectedDevice.getDeviceSource()) == null) ? null : Integer.valueOf(deviceSource.getValue());
        BlueChannelDeviceApi blueChannelDeviceApiB2 = b();
        String address = (blueChannelDeviceApiB2 == null || (connectedDevice2 = blueChannelDeviceApiB2.getConnectedDevice()) == null) ? null : connectedDevice2.getAddress();
        HMLog.info(d, new b(numValueOf));
        PigeonBlueChannel.DeviceInformation deviceInformation = new PigeonBlueChannel.DeviceInformation();
        deviceInformation.setDeviceSourceValue(numValueOf != null ? Long.valueOf(numValueOf.intValue()) : null);
        deviceInformation.setBoundDeviceAddress(address);
        Unit unit = Unit.INSTANCE;
        result.success(deviceInformation);
    }

    @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.PigeonBlueChannelApi
    public void getDeviceWatchFaceStorageConditions(@Nullable Long appSize, @Nullable Long faceId, @Nullable PigeonBlueChannel.Result<Boolean> result) {
        if (!(result != null)) {
            throw new IllegalArgumentException(("BlueChannelImpl getDeviceWatchFaceStorageConditions(): Bad result=" + result + " param").toString());
        }
        if (faceId != null) {
            BlueChannelDeviceApi blueChannelDeviceApiB = b();
            HMBaseDevice connectedDevice = blueChannelDeviceApiB == null ? null : blueChannelDeviceApiB.getConnectedDevice();
            Objects.requireNonNull(connectedDevice, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
            result.success(Boolean.valueOf(((HMMiLiProDevice) connectedDevice).getStorageStateSync(appSize == null ? 0L : appSize.longValue(), faceId.longValue())));
            return;
        }
        throw new IllegalArgumentException(("BlueChannelImpl getDeviceWatchFaceStorageConditions(): Bad faceId " + faceId + " param").toString());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.PigeonBlueChannelApi
    public void getOtaStatus(@NotNull String supportFwLowestVersion, @Nullable PigeonBlueChannel.Result<Long> result) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new c(supportFwLowestVersion, result, null), 3, null);
    }

    @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.PigeonBlueChannelApi
    public void isDeviceSupportJsApp(@Nullable PigeonBlueChannel.Result<Boolean> result) {
        HMBaseDevice connectedDevice;
        boolean zSupportModule = false;
        if (!(result != null)) {
            throw new IllegalArgumentException(("BlueChannelImpl isDeviceSupportJsApp(): Bad result=" + result + " param").toString());
        }
        BlueChannelDeviceApi blueChannelDeviceApiB = b();
        if (blueChannelDeviceApiB != null && (connectedDevice = blueChannelDeviceApiB.getConnectedDevice()) != null) {
            zSupportModule = connectedDevice.supportModule(JSModule.class);
        }
        result.success(Boolean.valueOf(zSupportModule));
    }

    @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.PigeonBlueChannelApi
    public void sendDevicePackage(@NotNull String devicePackagePath, @NotNull String type, @Nullable PigeonBlueChannel.Result<PigeonBlueChannel.DevicePackageInstallStatus> result) {
        final PigeonBlueChannel.PigeonBlueChannelCallbackApi pigeonBlueChannelCallbackApi = new PigeonBlueChannel.PigeonBlueChannelCallbackApi(this.binaryMessenger);
        if (devicePackagePath.length() == 0) {
            HMLog.error$default(d, null, null, new d(devicePackagePath), 6, null);
            PigeonBlueChannel.DevicePackageInstallStatus devicePackageInstallStatus = new PigeonBlueChannel.DevicePackageInstallStatus();
            devicePackageInstallStatus.setStatus(1L);
            devicePackageInstallStatus.setFinish(Boolean.TRUE);
            devicePackageInstallStatus.setProgress(100L);
            pigeonBlueChannelCallbackApi.sendDevicePackageInstallResult(devicePackageInstallStatus, this.replyFromFlutter);
            return;
        }
        BlueChannelDeviceApi blueChannelDeviceApiB = b();
        HMBaseDevice connectedDevice = blueChannelDeviceApiB == null ? null : blueChannelDeviceApiB.getConnectedDevice();
        if (connectedDevice == null) {
            HMLog.error$default(d, null, null, e.a, 6, null);
        }
        File file = new File(devicePackagePath);
        if (file.exists() && connectedDevice != null) {
            HMFirmwareType hMFirmwareType = "2".equals(type) ? HMFirmwareType.FIRMWARE_DIAL : HMFirmwareType.FIRMWARE_LITE_APP;
            HMLog.info(d, new g(hMFirmwareType));
            connectedDevice.updateFwUpgrade(new HMFirmwareInfo(file.getAbsolutePath(), hMFirmwareType), new IFirmwareUpgradeCallback() { // from class: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl.sendDevicePackage.5

                /* JADX INFO: renamed from: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ int a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(int i) {
                        super(0);
                        this.a = i;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return Intrinsics.stringPlus("sendDevicePackage send package error!!! Error code is ", Integer.valueOf(this.a));
                    }
                }

                /* JADX INFO: renamed from: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$onError$2", f = "PigeonBlueChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ PigeonBlueChannel.PigeonBlueChannelCallbackApi b;
                    public final /* synthetic */ PigeonBlueChannel.DevicePackageInstallStatus c;
                    public final /* synthetic */ PigeonBlueChannelApiImpl d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(PigeonBlueChannel.PigeonBlueChannelCallbackApi pigeonBlueChannelCallbackApi, PigeonBlueChannel.DevicePackageInstallStatus devicePackageInstallStatus, PigeonBlueChannelApiImpl pigeonBlueChannelApiImpl, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.b = pigeonBlueChannelCallbackApi;
                        this.c = devicePackageInstallStatus;
                        this.d = pigeonBlueChannelApiImpl;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new b(this.b, this.c, this.d, continuation);
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
                        this.b.sendDevicePackageInstallResult(this.c, this.d.replyFromFlutter);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: renamed from: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$c */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function0<String> {
                    public final /* synthetic */ Progress a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(Progress progress) {
                        super(0);
                        this.a = progress;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return Intrinsics.stringPlus("sendDevicePackage onFwProgress  progress > ", this.a);
                    }
                }

                /* JADX INFO: renamed from: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$d */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$onFwProgress$2", f = "PigeonBlueChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ PigeonBlueChannel.PigeonBlueChannelCallbackApi b;
                    public final /* synthetic */ PigeonBlueChannel.DevicePackageInstallStatus c;
                    public final /* synthetic */ PigeonBlueChannelApiImpl d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public d(PigeonBlueChannel.PigeonBlueChannelCallbackApi pigeonBlueChannelCallbackApi, PigeonBlueChannel.DevicePackageInstallStatus devicePackageInstallStatus, PigeonBlueChannelApiImpl pigeonBlueChannelApiImpl, Continuation<? super d> continuation) {
                        super(2, continuation);
                        this.b = pigeonBlueChannelCallbackApi;
                        this.c = devicePackageInstallStatus;
                        this.d = pigeonBlueChannelApiImpl;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new d(this.b, this.c, this.d, continuation);
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
                        this.b.sendDevicePackageInstallResult(this.c, this.d.replyFromFlutter);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: renamed from: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$e */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class e extends Lambda implements Function0<String> {
                    public static final e a = new e();

                    public e() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "sendDevicePackage send package start!!!";
                    }
                }

                /* JADX INFO: renamed from: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$f */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class f extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return Intrinsics.stringPlus("sendDevicePackage send package stop!!! Result is ", Boolean.valueOf(this.a));
                    }
                }

                /* JADX INFO: renamed from: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$g */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$onFwStop$2", f = "PigeonBlueChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ PigeonBlueChannel.PigeonBlueChannelCallbackApi b;
                    public final /* synthetic */ PigeonBlueChannel.DevicePackageInstallStatus c;
                    public final /* synthetic */ PigeonBlueChannelApiImpl d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public g(PigeonBlueChannel.PigeonBlueChannelCallbackApi pigeonBlueChannelCallbackApi, PigeonBlueChannel.DevicePackageInstallStatus devicePackageInstallStatus, PigeonBlueChannelApiImpl pigeonBlueChannelApiImpl, Continuation<? super g> continuation) {
                        super(2, continuation);
                        this.b = pigeonBlueChannelCallbackApi;
                        this.c = devicePackageInstallStatus;
                        this.d = pigeonBlueChannelApiImpl;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new g(this.b, this.c, this.d, continuation);
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
                        this.b.sendDevicePackageInstallResult(this.c, this.d.replyFromFlutter);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: renamed from: com.huami.flutter.bluechannelplugin.PigeonBlueChannelApiImpl$sendDevicePackage$5$h */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class h extends Lambda implements Function0<String> {
                    public static final h a = new h();

                    public h() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "sendDevicePackage upgradingProgress";
                    }
                }

                @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
                public void onError(int errorCode) {
                    HMLog.error$default(PigeonBlueChannelApiImpl.d, null, null, new a(errorCode), 6, null);
                    PigeonBlueChannel.DevicePackageInstallStatus devicePackageInstallStatus2 = new PigeonBlueChannel.DevicePackageInstallStatus();
                    devicePackageInstallStatus2.setFinish(Boolean.TRUE);
                    devicePackageInstallStatus2.setStatus(Long.valueOf(errorCode));
                    devicePackageInstallStatus2.setProgress(100L);
                    kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new b(pigeonBlueChannelCallbackApi, devicePackageInstallStatus2, this, null), 2, null);
                }

                @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
                public void onFwProgress(@Nullable Progress sendProgress) {
                    HMLog.info(PigeonBlueChannelApiImpl.d, new c(sendProgress));
                    if (sendProgress != null) {
                        PigeonBlueChannel.DevicePackageInstallStatus devicePackageInstallStatus2 = new PigeonBlueChannel.DevicePackageInstallStatus();
                        devicePackageInstallStatus2.setProgress(Long.valueOf((((long) sendProgress.progress) * 100) / ((long) sendProgress.total)));
                        devicePackageInstallStatus2.setFinish(Boolean.FALSE);
                        devicePackageInstallStatus2.setStatus(-1L);
                        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new d(pigeonBlueChannelCallbackApi, devicePackageInstallStatus2, this, null), 2, null);
                    }
                }

                @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
                public void onFwStart(int none) {
                    HMLog.info(PigeonBlueChannelApiImpl.d, e.a);
                }

                @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
                public void onFwStop(boolean result2) {
                    HMLog.info(PigeonBlueChannelApiImpl.d, new f(result2));
                    PigeonBlueChannel.DevicePackageInstallStatus devicePackageInstallStatus2 = new PigeonBlueChannel.DevicePackageInstallStatus();
                    devicePackageInstallStatus2.setFinish(Boolean.TRUE);
                    devicePackageInstallStatus2.setProgress(100L);
                    if (result2) {
                        devicePackageInstallStatus2.setStatus(0L);
                    } else {
                        devicePackageInstallStatus2.setStatus(1L);
                    }
                    kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new g(pigeonBlueChannelCallbackApi, devicePackageInstallStatus2, this, null), 2, null);
                }

                @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
                public void upgradingProgress(@NotNull HMFirmwareType type2, @NotNull Progress progressReceive) {
                    HMLog.info(PigeonBlueChannelApiImpl.d, h.a);
                }
            });
        } else {
            HMLog.error$default(d, null, null, new f(devicePackagePath), 6, null);
            PigeonBlueChannel.DevicePackageInstallStatus devicePackageInstallStatus2 = new PigeonBlueChannel.DevicePackageInstallStatus();
            devicePackageInstallStatus2.setStatus(1L);
            devicePackageInstallStatus2.setFinish(Boolean.TRUE);
            devicePackageInstallStatus2.setProgress(100L);
            pigeonBlueChannelCallbackApi.sendDevicePackageInstallResult(devicePackageInstallStatus2, this.replyFromFlutter);
        }
    }
}
