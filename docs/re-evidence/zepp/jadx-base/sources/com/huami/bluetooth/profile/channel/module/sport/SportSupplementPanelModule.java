package com.huami.bluetooth.profile.channel.module.sport;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 25)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/SportSupplementPanelModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "command", "", "c", "", HTTP.CONTENT_RANGE_BYTES, GoogleApiAvailabilityLight.a, PointCategory.INIT, "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerSportControllerListener", "queryVersion", "", "alive", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "sportConfig", "config", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportInfo;", "info", "sendControlCommand", "g", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", "sportListener", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportSupplementPanelModule extends BaseModule {
    public static final int VERSION_1 = 1;

    @NotNull
    private static final String h = "SportModule";
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 3;
    private static final int l = 4;
    private static final int m = 5;
    private static final int n = 17;
    private static final int o = 32;
    private static final int p = 16;
    private static final byte q = 0;
    private static final byte r = 1;
    private static final int s = 1;
    private static final long t = 5000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private IHMSportListener sportListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule$alive$1", f = "SportSupplementPanelModule.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportSupplementPanelModule.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(SportSupplementPanelModule.this, new byte[]{5}, 0, false, this, 6, null);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule$init$1$1", f = "SportSupplementPanelModule.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ SportSupplementPanelModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, SportSupplementPanelModule sportSupplementPanelModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = sportSupplementPanelModule;
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
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b.getData().length == 0) {
                        Debug.fi(SportSupplementPanelModule.h, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(this.b.getData()));
                    if (unSignInt == 17) {
                        SportSupplementPanelModule sportSupplementPanelModule = this.c;
                        Integer numSecond = AuthModuleKt.second(this.b.getData());
                        sportSupplementPanelModule.c(numSecond != null ? numSecond.intValue() : 0);
                    }
                    if (unSignInt == 32) {
                        this.c.d(ByteArrayKt.subArrayWithoutFirstElement(this.b.getData()));
                    }
                    if (unSignInt != 16) {
                        Debug.fi(SportSupplementPanelModule.h, "Unrecognizable response");
                        return Unit.INSTANCE;
                    }
                    Integer numSecond2 = AuthModuleKt.second(this.b.getData());
                    if (numSecond2 == null) {
                        Debug.fi(SportSupplementPanelModule.h, "Response no corresponding command");
                        return Unit.INSTANCE;
                    }
                    byte[] bArrSubArrayWithoutFirstTwoElement = ByteArrayKt.subArrayWithoutFirstTwoElement(this.b.getData());
                    Channel channel = (Channel) this.c.getMsgChannels().get(numSecond2);
                    if (channel != null) {
                        this.a = 1;
                        if (channel.send(bArrSubArrayWithoutFirstTwoElement, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) throws InterruptedException {
            kotlinx.coroutines.d.b(null, new a(channelResponse, SportSupplementPanelModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule$sendControlCommand$1", f = "SportSupplementPanelModule.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ byte[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportSupplementPanelModule.this.new c(this.c, continuation);
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
                SportSupplementPanelModule sportSupplementPanelModule = SportSupplementPanelModule.this;
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{4, 1}, this.c);
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(sportSupplementPanelModule, bArrPlus, 0, false, this, 6, null);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule$sendControlCommand$2", f = "SportSupplementPanelModule.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ byte[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte[] bArr, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportSupplementPanelModule.this.new d(this.c, continuation);
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
                SportSupplementPanelModule sportSupplementPanelModule = SportSupplementPanelModule.this;
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{4, 0}, this.c);
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(sportSupplementPanelModule, bArrPlus, 0, false, this, 6, null);
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

    public SportSupplementPanelModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int command) {
        CallbackHolder.INSTANCE.onCommand((byte) command);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(byte[] bytes) {
        if (bytes != null) {
            if (bytes.length == 0) {
                return;
            }
            CallbackHolder.INSTANCE.onInitCommand(bytes);
        }
    }

    public final boolean alive() {
        return ((Boolean) kotlinx.coroutines.d.b(null, new a(null), 1, null)).booleanValue();
    }

    public final boolean config(@NotNull SportConfig sportConfig) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, new byte[]{2, sportConfig.getSportKind().getKind(), !sportConfig.isNeedDeviceClock() ? 1 : 0}, 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            return !(bArrSendCommand$default.length == 0) && AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArrSendCommand$default)) == 1;
        }
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    public final int queryVersion() {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, 1, 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                int iFirst = ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255;
                if (iFirst == 1) {
                    return AuthModuleKt.second(bArrSendCommand$default).intValue() & 255;
                }
                Debug.fi(h, "Query version failed(" + iFirst + ')');
                return -1;
            }
        }
        Debug.fi(h, "Query version failed no response");
        return -1;
    }

    public final void registerSportControllerListener(@NotNull IHMSportListener listener) {
        this.sportListener = listener;
    }

    public final boolean sendControlCommand(@NotNull SportCommand command, @Nullable SportInfo info) {
        byte[] bytes = info == null ? null : info.getBytes();
        if (bytes == null) {
            bytes = GattUtils.intToBytes(0);
        }
        if (!SportSupplementPanelModuleKt.getControlCommandMap().containsKey(command)) {
            return command == SportCommand.NOTIFY ? ((Boolean) kotlinx.coroutines.d.b(null, new c(bytes, null), 1, null)).booleanValue() : ((Boolean) kotlinx.coroutines.d.b(null, new d(bytes, null), 1, null)).booleanValue();
        }
        byte[] bArr = new byte[2];
        bArr[0] = 3;
        Byte b2 = SportSupplementPanelModuleKt.getControlCommandMap().get(command);
        if (b2 == null) {
            throw new IllegalStateException("Could not be happen".toString());
        }
        bArr[1] = b2.byteValue();
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(bArr, bytes), 0, 0L, 6, (Object) null);
        Debug.fi(h, GattUtils.bytesToHexString(bArrSendCommand$default));
        return bArrSendCommand$default != null && AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArrSendCommand$default)) == 1;
    }
}
