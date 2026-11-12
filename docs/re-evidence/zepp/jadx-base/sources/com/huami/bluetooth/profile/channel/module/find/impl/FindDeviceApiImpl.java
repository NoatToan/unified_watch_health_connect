package com.huami.bluetooth.profile.channel.module.find.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.ErrorCode;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.huami.bluetooth.profile.channel.module.find.DeviceFindStatus;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceCommand;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceModule;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceV2Command;
import com.huami.bluetooth.profile.channel.module.find.FindErrorCode;
import com.huami.bluetooth.profile.channel.module.find.FindPhoneListener;
import com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi;
import com.huami.bluetooth.profile.channel.module.find.IFindDeviceCallback;
import com.huami.bluetooth.profile.channel.module.find.IFindPhoneCallback;
import com.huami.bluetooth.profile.channel.module.find.codec.CodeCodec;
import com.huami.bluetooth.profile.channel.module.find.codec.FindDeviceCodecV2;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 22\u00020\u0001:\u00012B\u001f\u0012\u0006\u0010%\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b0\u00101J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0019H\u0016J\u0014\u0010\u001d\u001a\u00020\u00062\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u0014\u0010\u001f\u001a\u00020\u00062\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016J\u0014\u0010 \u001a\u00020\u00062\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016R\u0019\u0010%\u001a\u00020!8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/impl/FindDeviceApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceBleCmdApi;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "", "c", "byteArray", "", "b", "a", "Lcom/huami/bluetooth/profile/channel/module/find/FindPhoneListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerListener", "unregisterListener", "", "queryFindDeviceProtocolVersion", "Lcom/huami/bluetooth/profile/channel/module/find/DeviceFindStatus;", "findDeviceWithStatus", "", "stopFindDevice", "enable", "enableRing", "Lcom/huami/bluetooth/profile/channel/module/find/IFindPhoneCallback;", "registerFindPhoneCallback", "callback", "unregisterFindPhoneCallback", "Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceCallback;", "registerFindDeviceCallback", "unregisterFindDeviceCallback", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "findDevice", "findDeviceSync", "confirmFindPhone", "stopFindPhone", "", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule;", "module", LogUtil.I, "version", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/find/FindPhoneListener;", "e", "Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceCallback;", "findDeviceCallback", "<init>", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FindDeviceApiImpl implements IFindDeviceBleCmdApi {

    @NotNull
    private static final String f = "FindDeviceImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String address;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FindDeviceModule module;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private FindPhoneListener listener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private IFindDeviceCallback findDeviceCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(FindDeviceApiImpl findDeviceApiImpl) {
            super(1, findDeviceApiImpl, FindDeviceApiImpl.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((FindDeviceApiImpl) this.receiver).b(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.find.impl.FindDeviceApiImpl$confirmFindPhone$result$1", f = "FindDeviceApiImpl.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindDeviceApiImpl.this.new b(continuation);
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
                FindDeviceModule findDeviceModule = FindDeviceApiImpl.this.module;
                byte[] bArr = FindDeviceCommand.FindPhoneDeviceResponseCommand.INSTANCE.withByte(1).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(findDeviceModule, bArr, 0, false, this, 6, null);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.find.impl.FindDeviceApiImpl$enableRing$1", f = "FindDeviceApiImpl.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindDeviceApiImpl.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindDeviceModule findDeviceModule = FindDeviceApiImpl.this.module;
                byte[] bArr = FindDeviceV2Command.EnableDeviceRingCommand.INSTANCE.withBoolean(this.c).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(findDeviceModule, bArr, 0, false, this, 6, null);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.find.impl.FindDeviceApiImpl$stopFindDevice$result$1", f = "FindDeviceApiImpl.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindDeviceApiImpl.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindDeviceModule findDeviceModule = FindDeviceApiImpl.this.module;
                byte[] bArr = FindDeviceV2Command.StopFindDeviceCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(findDeviceModule, bArr, 0, false, this, 6, null);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.find.impl.FindDeviceApiImpl$stopFindPhone$result$1", f = "FindDeviceApiImpl.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindDeviceApiImpl.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindDeviceModule findDeviceModule = FindDeviceApiImpl.this.module;
                byte[] bArr = FindDeviceCommand.FindPhoneStopCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(findDeviceModule, bArr, 0, false, this, 6, null);
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

    public FindDeviceApiImpl(@NotNull String str, @NotNull FindDeviceModule findDeviceModule, int i) {
        this.address = str;
        this.module = findDeviceModule;
        this.version = i;
        findDeviceModule.registerDeviceRequestHandler(new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.find.impl.FindDeviceApiImpl.2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(byteArray));
                return unSignInt == FindDeviceCommand.FindPhoneDeviceCommand.INSTANCE.getCmd() || unSignInt == FindDeviceCommand.StopFindPhoneDeviceCommand.INSTANCE.getCmd() || unSignInt == FindDeviceV2Command.StopFindDeviceCommandResponse.INSTANCE.getCmd() || unSignInt == FindDeviceV2Command.EnablePhoneRingNotification.INSTANCE.getCmd();
            }
        }));
    }

    private final void a(byte[] byteArray) {
        if (byteArray.length == 0) {
            return;
        }
        boolean z = ArraysKt___ArraysKt.first(byteArray) == 1;
        FindPhoneListener findPhoneListener = this.listener;
        if (findPhoneListener instanceof IFindPhoneCallback) {
            ((IFindPhoneCallback) findPhoneListener).onEnablePhoneRing(this.address, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(byte[] byteArray) {
        int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(byteArray));
        if (unSignInt == FindDeviceCommand.FindPhoneDeviceCommand.INSTANCE.getCmd()) {
            FindPhoneListener findPhoneListener = this.listener;
            if (findPhoneListener == null) {
                return;
            }
            findPhoneListener.onFind(this.address);
            return;
        }
        if (unSignInt == FindDeviceCommand.StopFindPhoneDeviceCommand.INSTANCE.getCmd()) {
            FindPhoneListener findPhoneListener2 = this.listener;
            if (findPhoneListener2 == null) {
                return;
            }
            findPhoneListener2.onStop(this.address);
            return;
        }
        if (unSignInt != FindDeviceV2Command.StopFindDeviceCommandResponse.INSTANCE.getCmd()) {
            if (unSignInt == FindDeviceV2Command.EnablePhoneRingNotification.INSTANCE.getCmd()) {
                a(ByteArrayKt.subArrayWithoutFirstElement(byteArray));
            }
        } else {
            IFindDeviceCallback iFindDeviceCallback = this.findDeviceCallback;
            if (iFindDeviceCallback == null) {
                return;
            }
            iFindDeviceCallback.onFindDeviceStop();
        }
    }

    private final ModuleResult<byte[]> c() {
        ModuleResult<byte[]> moduleResultSendRequest = this.module.sendRequest(new ModuleRequest(FindDeviceCommand.FindWearableDeviceCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null));
        Debug.fi(f, Intrinsics.stringPlus("Find wearable device result:", moduleResultSendRequest));
        return moduleResultSendRequest;
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void confirmFindPhone(@NotNull HMCallback<?> callback) {
        callback.onFinish(((Boolean) kotlinx.coroutines.d.b(null, new b(null), 1, null)).booleanValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi
    public boolean enableRing(boolean enable) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new c(enable, null), 1, null)).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void findDevice(@NotNull HMCallback<?> callback) {
        callback.sendOnFinishMessage(findDeviceSync());
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public boolean findDeviceSync() {
        ModuleResult<ErrorCode> moduleResultDecode = new CodeCodec().decode(c());
        Debug.fi(f, Intrinsics.stringPlus("Find wearable device result:", moduleResultDecode));
        ErrorCode errorCode = (ErrorCode) ModuleResultKt.peel(moduleResultDecode);
        return errorCode != null && errorCode.getCode() == FindErrorCode.OK.INSTANCE.getCode();
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi
    @NotNull
    public DeviceFindStatus findDeviceWithStatus() {
        return new FindDeviceCodecV2().decodeFindStatus(c());
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    /* JADX INFO: renamed from: queryFindDeviceProtocolVersion, reason: from getter */
    public int getVersion() {
        return this.version;
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi
    public void registerFindDeviceCallback(@NotNull IFindDeviceCallback callback) {
        this.findDeviceCallback = callback;
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi
    public void registerFindPhoneCallback(@NotNull IFindPhoneCallback listener) {
        registerListener(listener);
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void registerListener(@NotNull FindPhoneListener listener) {
        this.listener = listener;
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi
    public boolean stopFindDevice() {
        boolean zBooleanValue = ((Boolean) kotlinx.coroutines.d.b(null, new d(null), 1, null)).booleanValue();
        Debug.fi(f, Intrinsics.stringPlus("stopFindDevice: ", Boolean.valueOf(zBooleanValue)));
        return zBooleanValue;
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void stopFindPhone(@NotNull HMCallback<?> callback) {
        callback.onFinish(((Boolean) kotlinx.coroutines.d.b(null, new e(null), 1, null)).booleanValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi
    public void unregisterFindDeviceCallback(@NotNull IFindDeviceCallback callback) {
        this.findDeviceCallback = null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi
    public void unregisterFindPhoneCallback(@NotNull IFindPhoneCallback callback) {
        unregisterListener(callback);
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void unregisterListener(@NotNull FindPhoneListener listener) {
        this.listener = null;
    }
}
