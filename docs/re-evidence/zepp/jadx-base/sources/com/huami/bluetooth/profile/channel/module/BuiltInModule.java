package com.huami.bluetooth.profile.channel.module;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.d;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00170\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/BuiltInModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "", "Lcom/huami/bluetooth/profile/channel/module/SupportModuleInfo;", GoogleApiAvailabilityLight.a, "e", "f", "", PointCategory.INIT, "moduleId", "", "supportModule", "", "byteArray", "echo", HTTP.CONTENT_RANGE_BYTES, "cmdBack", "sendCommand", "g", "Z", "needReadModuleListFromDevice", "", "Lkotlinx/coroutines/channels/Channel;", "h", "Ljava/util/Map;", "channels", "c", "()Ljava/util/Map;", "modulesSupportByDevice", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BuiltInModule extends BaseModule {
    public static final int CMD_DATA_ECHO = 2;
    public static final int CMD_GET_MODULES = 0;
    public static final int CMD_GET_MODULES_V3 = 3;
    public static final int CMD_GET_MODULES_V3_REPLY = 4;
    public static final int DATA_MODULES = 1;
    public static final int ECHO_MODULE = 0;

    @NotNull
    public static final String TAG = "EchoModule";
    public static final long TIMEOUT = 5000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean needReadModuleListFromDevice;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<byte[]>> channels;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, Map<Integer, SupportModuleInfo>> i = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R1\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/BuiltInModule$Companion;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "", "Lcom/huami/bluetooth/profile/channel/module/SupportModuleInfo;", "moduleListCached", "Ljava/util/concurrent/ConcurrentHashMap;", "getModuleListCached", "()Ljava/util/concurrent/ConcurrentHashMap;", "CMD_DATA_ECHO", LogUtil.I, "CMD_GET_MODULES", "CMD_GET_MODULES_V3", "CMD_GET_MODULES_V3_REPLY", "DATA_MODULES", "ECHO_MODULE", "TAG", "Ljava/lang/String;", "", "TIMEOUT", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConcurrentHashMap<String, Map<Integer, SupportModuleInfo>> getModuleListCached() {
            return BuiltInModule.i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010'\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/bluetooth/profile/channel/module/SupportModuleInfo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Map.Entry<Integer, SupportModuleInfo>, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Map.Entry<Integer, SupportModuleInfo> entry) {
            return entry.getValue().toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BuiltInModule$init$1$1", f = "BuiltInModule.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ BuiltInModule c;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.BuiltInModule$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BuiltInModule$init$1$1$result$1", f = "BuiltInModule.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0313a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ BuiltInModule b;
                public final /* synthetic */ int c;
                public final /* synthetic */ byte[] d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0313a(BuiltInModule builtInModule, int i, byte[] bArr, Continuation<? super C0313a> continuation) {
                    super(2, continuation);
                    this.b = builtInModule;
                    this.c = i;
                    this.d = bArr;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0313a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0313a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) this.b.channels.get(Boxing.boxInt(this.c));
                        if (channel == null) {
                            return null;
                        }
                        byte[] bArr = this.d;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, BuiltInModule builtInModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = builtInModule;
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
                        Debug.fi("EchoModule", "Response no payload");
                        return Unit.INSTANCE;
                    }
                    C0313a c0313a = new C0313a(this.c, ArraysKt___ArraysKt.first(this.b.getData()) & 255, CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.drop(this.b.getData(), 1)), null);
                    this.a = 1;
                    obj = TimeoutKt.withTimeoutOrNull(1000L, c0313a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Unit) obj) == null) {
                    Debug.fi("EchoModule", Intrinsics.stringPlus("Send msg failed:", this.b));
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) throws InterruptedException {
            d.b(null, new a(channelResponse, BuiltInModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BuiltInModule$sendCommand$1", f = "BuiltInModule.kt", i = {}, l = {141, 143}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ byte[] d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BuiltInModule$sendCommand$1$1", f = "BuiltInModule.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ BuiltInModule b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BuiltInModule builtInModule, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = builtInModule;
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
                    Channel channel = (Channel) this.b.channels.get(Boxing.boxInt(this.c));
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
        public c(int i, byte[] bArr, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BuiltInModule.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            BuiltInModule.this.channels.put(Boxing.boxInt(this.c), ChannelKt.Channel$default(0, 1, null));
            BuiltInModule builtInModule = BuiltInModule.this;
            byte[] bArr = this.d;
            this.a = 1;
            obj = BaseModule.sendDataWithResult$default(builtInModule, bArr, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                return null;
            }
            a aVar = new a(BuiltInModule.this, this.c, null);
            this.a = 2;
            obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    public BuiltInModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.needReadModuleListFromDevice = true;
        this.channels = new LinkedHashMap();
    }

    private final Map<Integer, SupportModuleInfo> c() {
        ConcurrentHashMap<String, Map<Integer, SupportModuleInfo>> concurrentHashMap = i;
        Map<Integer, SupportModuleInfo> map = concurrentHashMap.get(getAddress());
        if (!this.needReadModuleListFromDevice && map != null) {
            return map;
        }
        this.needReadModuleListFromDevice = false;
        Map<Integer, SupportModuleInfo> mapD = d();
        concurrentHashMap.put(getAddress(), mapD);
        return mapD;
    }

    private final Map<Integer, SupportModuleInfo> d() {
        if (getChannelVersion().getVersionCode() < 2) {
            return r.emptyMap();
        }
        return getChannelVersion().getEncryptEnable() != null ? f() : e();
    }

    private final Map<Integer, SupportModuleInfo> e() {
        Object objM3845constructorimpl;
        byte[] bArrSendCommand = sendCommand(new byte[]{0}, 1);
        if (bArrSendCommand == null) {
            return r.emptyMap();
        }
        BufByteDecoder bufByteDecoder = new BufByteDecoder(bArrSendCommand, 0, 2, null);
        int i2 = bufByteDecoder.readShort();
        try {
            Result.Companion companion = Result.Companion;
            Map linkedHashMap = new LinkedHashMap();
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bufByteDecoder.readByte();
                linkedHashMap.put(Integer.valueOf(i4), new SupportModuleInfo(i4, false));
            }
            if (bufByteDecoder.remain() > 0) {
                linkedHashMap = r.emptyMap();
            }
            objM3845constructorimpl = Result.m3845constructorimpl(linkedHashMap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi("EchoModule", Intrinsics.stringPlus("Parse module list failed:", thM3848exceptionOrNullimpl));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = r.emptyMap();
        }
        return (Map) objM3845constructorimpl;
    }

    private final Map<Integer, SupportModuleInfo> f() {
        Object objM3845constructorimpl;
        byte[] bArrSendCommand = sendCommand(new byte[]{3}, 4);
        if (bArrSendCommand == null) {
            return r.emptyMap();
        }
        BufByteDecoder bufByteDecoder = new BufByteDecoder(bArrSendCommand, 0, 2, null);
        int i2 = bufByteDecoder.readShort();
        try {
            Result.Companion companion = Result.Companion;
            Map linkedHashMap = new LinkedHashMap();
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bufByteDecoder.readShort();
                linkedHashMap.put(Integer.valueOf(i4), new SupportModuleInfo(i4, bufByteDecoder.readBoolean()));
            }
            if (bufByteDecoder.remain() > 0) {
                linkedHashMap = r.emptyMap();
            } else {
                Debug.fi("EchoModule", Intrinsics.stringPlus("Module list:", CollectionsKt___CollectionsKt.joinToString$default(linkedHashMap.entrySet(), ", ", null, null, 0, null, a.a, 30, null)));
            }
            objM3845constructorimpl = Result.m3845constructorimpl(linkedHashMap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi("EchoModule", Intrinsics.stringPlus("Parse module list failed:", thM3848exceptionOrNullimpl));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = r.emptyMap();
        }
        return (Map) objM3845constructorimpl;
    }

    @Nullable
    public final byte[] echo(@NotNull byte[] byteArray) {
        List<Byte> listDrop;
        byte[] bArrSendCommand = sendCommand(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{2}, GattUtils.numberToBytes(byteArray.length, 4)), byteArray), 2);
        if (bArrSendCommand == null || (listDrop = ArraysKt___ArraysKt.drop(bArrSendCommand, 4)) == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.toByteArray(listDrop);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 0;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        this.needReadModuleListFromDevice = true;
        BaseModule.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    @Nullable
    public final byte[] sendCommand(@NotNull byte[] bytes, int cmdBack) {
        return (byte[]) d.b(null, new c(cmdBack, bytes, null), 1, null);
    }

    public final boolean supportModule(int moduleId) {
        return c().containsKey(Integer.valueOf(moduleId));
    }
}
