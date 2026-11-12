package com.huami.bluetooth.profile.channel.module.amc.impl;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerApi;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerCallback;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerCommand;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0019\u0010\u001c\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006%"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/impl/MusicControllerApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerApi;", "", "byteArray", "", "a", "", Constant.h, "", "value", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "b", "(BLjava/lang/Integer;)Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl;", SessionDescription.n, "", "sendMusicControl", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerControllerListener", "unregisterControllerListener", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "getDeviceRequestHandler", "()Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "deviceRequestHandler", "c", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCallback;", "defaultCallback", GoogleApiAvailabilityLight.a, "musicControllerCallback", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MusicControllerApiImpl implements MusicControllerApi {

    @NotNull
    private static final String e = "MusicControllerApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceRequestHandler deviceRequestHandler = new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.amc.impl.MusicControllerApiImpl$deviceRequestHandler$2
        @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
        public boolean predict(@NotNull byte[] byteArray) {
            return ArraysKt___ArraysKt.first(byteArray) == ArraysKt___ArraysKt.first(MusicControllerCommand.DeviceControllerCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String()) || ArraysKt___ArraysKt.first(byteArray) == ArraysKt___ArraysKt.first(MusicControllerCommand.DeviceMusicControllerStateCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MusicControllerCallback defaultCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MusicControllerCallback musicControllerCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMMusicControl.AppException.values().length];
            iArr[HMMusicControl.AppException.APP_READY.ordinal()] = 1;
            iArr[HMMusicControl.AppException.NO_MUSIC.ordinal()] = 2;
            iArr[HMMusicControl.AppException.NO_PERMISSION.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(MusicControllerApiImpl musicControllerApiImpl) {
            super(1, musicControllerApiImpl, MusicControllerApiImpl.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((MusicControllerApiImpl) this.receiver).a(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.amc.impl.MusicControllerApiImpl$sendMusicControl$1", f = "MusicControllerApiImpl.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ HMMusicControl c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMMusicControl hMMusicControl, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = hMMusicControl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MusicControllerApiImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseModule baseModule = MusicControllerApiImpl.this.module;
                byte[] bArr = MusicControllerCommand.AppControllerCommand.INSTANCE.withBytes(this.c.toBleBytes()).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public MusicControllerApiImpl(@NotNull BaseModule baseModule) {
        this.module = baseModule;
        MusicControllerCallback musicControllerCallback = new MusicControllerCallback() { // from class: com.huami.bluetooth.profile.channel.module.amc.impl.MusicControllerApiImpl$defaultCallback$1
            @Override // com.huami.bluetooth.profile.channel.module.amc.MusicControllerCallback
            public void onController(@NotNull HMMusicControl.DeviceCommand cmd) {
                Debug.fi("MusicControllerApiImpl", "如果没有人监听音乐控制设备只能自嗨");
            }
        };
        this.defaultCallback = musicControllerCallback;
        this.musicControllerCallback = musicControllerCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(byte[] byteArray) {
        HMMusicControl.DeviceCommand deviceCommandB = b(ArraysKt___ArraysKt.first(byteArray), AuthModuleKt.second(byteArray));
        if (deviceCommandB == null) {
            return;
        }
        this.musicControllerCallback.onController(deviceCommandB);
    }

    private final HMMusicControl.DeviceCommand b(byte cmd, Integer value) {
        if (value == null) {
            return null;
        }
        if (cmd == ArraysKt___ArraysKt.first(MusicControllerCommand.DeviceControllerCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String())) {
            return HMMusicControl.DeviceCommand.from((byte) value.intValue());
        }
        if (cmd != ArraysKt___ArraysKt.first(MusicControllerCommand.DeviceMusicControllerStateCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String())) {
            return null;
        }
        int iIntValue = value.intValue();
        if (iIntValue == 1) {
            return HMMusicControl.DeviceCommand.START;
        }
        if (iIntValue != 2) {
            return null;
        }
        return HMMusicControl.DeviceCommand.STOP;
    }

    @NotNull
    public final DeviceRequestHandler getDeviceRequestHandler() {
        return this.deviceRequestHandler;
    }

    @Override // com.huami.bluetooth.profile.channel.module.amc.MusicControllerApi
    public void registerControllerListener(@NotNull MusicControllerCallback listener) {
        this.musicControllerCallback = listener;
        this.module.registerDeviceRequestHandler(this.deviceRequestHandler);
    }

    @Override // com.huami.bluetooth.profile.channel.module.amc.MusicControllerApi
    public boolean sendMusicControl(@NotNull HMMusicControl control) {
        HMMusicControl.AppException appException;
        HMMusicControl.AppException exception = control.getException();
        int i = exception == null ? -1 : WhenMappings.$EnumSwitchMapping$0[exception.ordinal()];
        if (i == 1) {
            appException = HMMusicControl.AppException.APP_READY;
        } else if (i != 2) {
            appException = i != 3 ? HMMusicControl.AppException.UNKNOWN : HMMusicControl.AppException.NO_MUSIC;
        } else {
            appException = HMMusicControl.AppException.APP_NONE;
        }
        control.setException(appException);
        return ((Boolean) d.b(null, new b(control, null), 1, null)).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.amc.MusicControllerApi
    public void unregisterControllerListener(@NotNull MusicControllerCallback listener) {
        this.musicControllerCallback = this.defaultCallback;
        this.module.unregisterDeviceRequestHandler(this.deviceRequestHandler);
    }
}
