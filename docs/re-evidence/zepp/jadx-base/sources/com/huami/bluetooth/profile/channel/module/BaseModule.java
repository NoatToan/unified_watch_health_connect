package com.huami.bluetooth.profile.channel.module;

import androidx.annotation.WorkerThread;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelDataCallback;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.model.ChannelRequest;
import com.huami.bluetooth.profile.channel.model.ChannelVersion;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\b\u0016\u0018\u0000 R2\u00020\u0001:\u0001RB\u000f\u0012\u0006\u00108\u001a\u00020\u000b¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\nJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0013\u001a\u00020\u0012J,\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J4\u0010!\u001a\u00020\u00022\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001eø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0006\u0010#\u001a\u00020\u0002J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u0016J/\u0010(\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u0016H\u0007J\"\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u001aJ$\u0010+\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\b2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u001aJ$\u00100\u001a\u0004\u0018\u00010\b2\u0006\u0010,\u001a\u00020\u00162\b\b\u0002\u0010-\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020.J$\u00100\u001a\u0004\u0018\u00010\b2\u0006\u00101\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020.J\u0006\u00103\u001a\u000202J\u0006\u00105\u001a\u000204R\u0016\u00108\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001d\u0010\u0017\u001a\u00020\u00168V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R.\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0>0=8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010H\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00120D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000e0I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR7\u0010O\u001a \b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bM\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/ChannelDataCallback;", "", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "onReceive", "(Lcom/huami/bluetooth/profile/channel/ChannelResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "setChannelApi", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "handler", "registerDeviceRequestHandler", "unregisterDeviceRequestHandler", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "sendRequest", "", "module", "", "isOneTime", "Lkotlin/Function1;", "callback", "registerCallback", "unregisterCallback", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "registerMessageCallback", "(Lkotlin/jvm/functions/Function2;)V", "unregisterMessageCallback", "byteArray", "replyFreq", "sendData", "needTailReply", "sendDataWithResult", "([BIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncSendData", "sendWithoutDataResponse", Constant.h, "responseCode", "", "timeout", "sendCommand", HTTP.CONTENT_RANGE_BYTES, "", "getAddress", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "getChannelVersion", "a", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "b", "Lkotlin/Lazy;", "getModule", "()I", "", "Lkotlinx/coroutines/channels/Channel;", "c", "Ljava/util/Map;", "getMsgChannels", "()Ljava/util/Map;", "msgChannels", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/UUID;", GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/ConcurrentHashMap;", "requestList", "", "e", "Ljava/util/List;", "deviceRequestHandler", "f", "Lkotlin/jvm/functions/Function2;", "messageCallback", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class BaseModule implements ChannelDataCallback {
    public static final long HANDLE_TIMEOUT = 1000;

    @NotNull
    public static final String TAG = "BaseModule";
    public static final long TIMEOUT = 15000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private ChannelApi channelController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy module = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<byte[]>> msgChannels = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<UUID, ModuleRequest> requestList = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<DeviceRequestHandler> deviceRequestHandler = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function2<? super byte[], ? super Continuation<? super Unit>, ? extends Object> messageCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.BaseModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$init$1$1", f = "BaseModule.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0312a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ BaseModule b;
            public final /* synthetic */ ChannelResponse c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0312a(BaseModule baseModule, ChannelResponse channelResponse, Continuation<? super C0312a> continuation) {
                super(2, continuation);
                this.b = baseModule;
                this.c = channelResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0312a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0312a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BaseModule baseModule = this.b;
                    ChannelResponse channelResponse = this.c;
                    this.a = 1;
                    if (baseModule.onReceive(channelResponse, this) == coroutine_suspended) {
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

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) throws InterruptedException {
            kotlinx.coroutines.d.b(null, new C0312a(BaseModule.this, channelResponse, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            Object objM3845constructorimpl;
            BaseModule baseModule = BaseModule.this;
            try {
                Result.Companion companion = Result.Companion;
                ChannelModule channelModule = (ChannelModule) baseModule.getClass().getAnnotation(ChannelModule.class);
                objM3845constructorimpl = Result.m3845constructorimpl(Integer.valueOf(channelModule == null ? 0 : channelModule.id()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                objM3845constructorimpl = 0;
            }
            return ((Number) objM3845constructorimpl).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule", f = "BaseModule.kt", i = {}, l = {100}, m = "onReceive$suspendImpl", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public int f;
        public /* synthetic */ Object g;
        public int i;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return BaseModule.b(BaseModule.this, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$onReceive$4$sendResult$1", f = "BaseModule.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ModuleRequest b;
        public final /* synthetic */ byte[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ModuleRequest moduleRequest, byte[] bArr, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = moduleRequest;
            this.c = bArr;
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
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b.getChannel();
                byte[] bArr = this.c;
                this.a = 1;
                if (channel.send(bArr, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$sendCommand$1", f = "BaseModule.kt", i = {}, l = {222, 224}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ byte[] d;
        public final /* synthetic */ long e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$sendCommand$1$1", f = "BaseModule.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ BaseModule b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BaseModule baseModule, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = baseModule;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<byte[]> channel = this.b.getMsgChannels().get(Boxing.boxInt(this.c));
                    if (channel == null) {
                        return null;
                    }
                    this.a = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, byte[] bArr, long j, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = bArr;
            this.e = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseModule.this.new e(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            BaseModule.this.getMsgChannels().put(Boxing.boxInt(this.c), ChannelKt.Channel(-1));
            BaseModule baseModule = BaseModule.this;
            byte[] bArr = this.d;
            this.a = 1;
            obj = BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                return null;
            }
            long j = this.e;
            a aVar = new a(BaseModule.this, this.c, null);
            this.a = 2;
            obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$sendRequest$1", f = "BaseModule.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ModuleResult<byte[]>>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ ModuleRequest d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$sendRequest$1$response$1", f = "BaseModule.kt", i = {}, l = {130, 135}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ModuleResult<byte[]>>, Object> {
            public int a;
            public final /* synthetic */ BaseModule b;
            public final /* synthetic */ ModuleRequest c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BaseModule baseModule, ModuleRequest moduleRequest, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = baseModule;
                this.c = moduleRequest;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ModuleResult<byte[]>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return new Success((byte[]) obj);
                }
                ResultKt.throwOnFailure(obj);
                BaseModule baseModule = this.b;
                byte[] bArr = this.c.getCommand().getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                boolean needTailReply = this.c.getNeedTailReply();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(baseModule, bArr, 0, needTailReply, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new Failure("Send failed!", 0, 2, null);
                }
                Channel<byte[]> channel = this.c.getChannel();
                this.a = 2;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Success((byte[]) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ModuleRequest moduleRequest, Continuation<? super f> continuation) {
            super(2, continuation);
            this.d = moduleRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = BaseModule.this.new f(this.d, continuation);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ModuleResult<byte[]>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                BaseModule.this.requestList.put(this.d.getId(), this.d);
                long timeout = this.d.getTimeout();
                a aVar = new a(BaseModule.this, this.d, null);
                this.b = coroutineScope;
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(timeout, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Object timeout2 = (ModuleResult) obj;
            if (timeout2 == null) {
                BaseModule baseModule = BaseModule.this;
                ModuleRequest moduleRequest = this.d;
                if (baseModule.requestList.contains(moduleRequest)) {
                    baseModule.requestList.remove(moduleRequest.getId());
                }
                timeout2 = new Timeout(null, 1, null);
            }
            Debug.fi(BaseModule.TAG, "Command " + this.d.getCommand() + " with result " + timeout2);
            return timeout2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<ChannelResponse, Unit> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$syncSendData$1", f = "BaseModule.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(byte[] bArr, int i, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = bArr;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseModule.this.new h(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseModule baseModule = BaseModule.this;
                byte[] bArr = this.c;
                int i2 = this.d;
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(baseModule, bArr, i2, false, this, 4, null);
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

    public BaseModule(@NotNull ChannelApi channelApi) {
        this.channelController = channelApi;
    }

    public static /* synthetic */ Object a(BaseModule baseModule, ChannelResponse channelResponse, Continuation continuation) {
        Function2<? super byte[], ? super Continuation<? super Unit>, ? extends Object> function2 = baseModule.messageCallback;
        if (function2 == null) {
            Object objOnReceive = baseModule.onReceive(channelResponse.getData(), (Continuation<? super Unit>) continuation);
            return objOnReceive == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objOnReceive : Unit.INSTANCE;
        }
        if (function2 != null) {
            Object objInvoke = function2.invoke(channelResponse.getData(), continuation);
            return objInvoke == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0096 -> B:44:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a0 -> B:44:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ae -> B:44:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d3 -> B:40:0x00db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object b(com.huami.bluetooth.profile.channel.module.BaseModule r13, byte[] r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.BaseModule.b(com.huami.bluetooth.profile.channel.module.BaseModule, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void registerCallback$default(BaseModule baseModule, int i, boolean z, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerCallback");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        baseModule.registerCallback(i, z, function1);
    }

    public static /* synthetic */ byte[] sendCommand$default(BaseModule baseModule, int i, int i2, long j, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommand");
        }
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        if ((i3 & 4) != 0) {
            j = 15000;
        }
        return baseModule.sendCommand(i, i2, j);
    }

    public static /* synthetic */ void sendData$default(BaseModule baseModule, byte[] bArr, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendData");
        }
        if ((i2 & 2) != 0) {
            i = 16;
        }
        baseModule.sendData(bArr, i);
    }

    public static /* synthetic */ Object sendDataWithResult$default(BaseModule baseModule, byte[] bArr, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendDataWithResult");
        }
        if ((i2 & 2) != 0) {
            i = 16;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return baseModule.sendDataWithResult(bArr, i, z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendWithoutDataResponse$default(BaseModule baseModule, byte[] bArr, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendWithoutDataResponse");
        }
        if ((i & 2) != 0) {
            function1 = g.a;
        }
        baseModule.sendWithoutDataResponse(bArr, function1);
    }

    public static /* synthetic */ boolean syncSendData$default(BaseModule baseModule, byte[] bArr, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncSendData");
        }
        if ((i2 & 2) != 0) {
            i = 16;
        }
        return baseModule.syncSendData(bArr, i);
    }

    @NotNull
    public final String getAddress() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(this.channelController.getAddress());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = "";
        }
        return (String) objM3845constructorimpl;
    }

    @NotNull
    public final ChannelVersion getChannelVersion() {
        return this.channelController.getVersion();
    }

    /* JADX INFO: renamed from: getModule */
    public int getChannelModule() {
        return ((Number) this.module.getValue()).intValue();
    }

    @NotNull
    public final Map<Integer, Channel<byte[]>> getMsgChannels() {
        return this.msgChannels;
    }

    public void init() {
        registerCallback$default(this, getChannelModule(), false, new a(), 2, null);
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelDataCallback
    public void onError(@NotNull ChannelResponse channelResponse) {
        ChannelDataCallback.DefaultImpls.onError(this, channelResponse);
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelDataCallback
    public void onProgress(@NotNull Progress progress) {
        ChannelDataCallback.DefaultImpls.onProgress(this, progress);
    }

    @Nullable
    public Object onReceive(@NotNull ChannelResponse channelResponse, @NotNull Continuation<? super Unit> continuation) {
        return a(this, channelResponse, continuation);
    }

    @Nullable
    public Object onReceive(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        return b(this, bArr, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelDataCallback
    public void onSuccess(@NotNull byte[] bArr) {
        ChannelDataCallback.DefaultImpls.onSuccess(this, bArr);
    }

    public final void registerCallback(int module, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        this.channelController.register(module, isOneTime, callback);
    }

    public final void registerDeviceRequestHandler(@NotNull DeviceRequestHandler handler) {
        if (this.deviceRequestHandler.contains(handler)) {
            return;
        }
        this.deviceRequestHandler.add(handler);
    }

    public final void registerMessageCallback(@NotNull Function2<? super byte[], ? super Continuation<? super Unit>, ? extends Object> callback) {
        this.messageCallback = callback;
    }

    @Nullable
    public final byte[] sendCommand(int cmd, int responseCode, long timeout) {
        return sendCommand(new byte[]{(byte) cmd}, responseCode, timeout);
    }

    public final void sendData(@NotNull byte[] byteArray, int replyFreq) {
        this.channelController.sendData(new ChannelRequest(getChannelModule(), byteArray, replyFreq, 0, false, 0, null, false, 248, null));
    }

    @Nullable
    public final Object sendDataWithResult(@NotNull byte[] bArr, int i, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        return this.channelController.transport(new ChannelRequest(getChannelModule(), bArr, i, 0, false, 0, null, z, 120, null), continuation);
    }

    @NotNull
    public final ModuleResult<byte[]> sendRequest(@NotNull ModuleRequest request) {
        return (ModuleResult) kotlinx.coroutines.d.b(null, new f(request, null), 1, null);
    }

    public final void sendWithoutDataResponse(@NotNull byte[] byteArray, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        registerCallback(getChannelModule(), true, callback);
        this.channelController.sendData(new ChannelRequest(getChannelModule(), byteArray, 0, 0, false, 0, null, false, 252, null));
    }

    public final void setChannelApi(@NotNull ChannelApi channelApi) {
        this.channelController = channelApi;
        init();
    }

    @WorkerThread
    public final boolean syncSendData(@NotNull byte[] byteArray, int replyFreq) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new h(byteArray, replyFreq, null), 1, null)).booleanValue();
    }

    public final void unregisterCallback(int module) {
        this.channelController.unregister(module);
    }

    public final void unregisterDeviceRequestHandler(@NotNull DeviceRequestHandler handler) {
        if (this.deviceRequestHandler.contains(handler)) {
            this.deviceRequestHandler.remove(handler);
        }
    }

    public final void unregisterMessageCallback() {
        this.messageCallback = null;
    }

    public static /* synthetic */ byte[] sendCommand$default(BaseModule baseModule, byte[] bArr, int i, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommand");
        }
        if ((i2 & 2) != 0) {
            i = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArr));
        }
        if ((i2 & 4) != 0) {
            j = 15000;
        }
        return baseModule.sendCommand(bArr, i, j);
    }

    @Nullable
    public final byte[] sendCommand(@NotNull byte[] bytes, int responseCode, long timeout) {
        return (byte[]) kotlinx.coroutines.d.b(null, new e(responseCode, bytes, timeout, null), 1, null);
    }

    public final void sendData(@NotNull byte[] byteArray, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        registerCallback(getChannelModule(), true, callback);
        this.channelController.sendData(new ChannelRequest(getChannelModule(), byteArray, 0, 0, false, 0, null, false, 252, null));
    }
}
