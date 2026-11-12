package com.huami.bluetooth.profile.channel.module;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.SupportModuleInfo;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.w2;
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
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/BuiltInModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "", "Lgu;", "getSupportModules", "getSupportModulesV1", "getSupportModulesV2", "", "init", "moduleId", "", "supportModule", "", "byteArray", "echo", "bytes", "cmdBack", "sendCommand", "needReadModuleListFromDevice", "Z", "", "Lkotlinx/coroutines/channels/Channel;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "getModulesSupportByDevice", "()Ljava/util/Map;", "modulesSupportByDevice", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class BuiltInModule extends a {
    public static final int CMD_DATA_ECHO = 2;
    public static final int CMD_GET_MODULES = 0;
    public static final int CMD_GET_MODULES_V3 = 3;
    public static final int CMD_GET_MODULES_V3_REPLY = 4;
    public static final int DATA_MODULES = 1;
    public static final int ECHO_MODULE = 0;

    @NotNull
    public static final String TAG = "EchoModule";
    public static final long TIMEOUT = 5000;

    @NotNull
    private final Map<Integer, Channel<byte[]>> channels;
    private boolean needReadModuleListFromDevice;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, Map<Integer, SupportModuleInfo>> moduleListCached = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.BuiltInModule$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/BuiltInModule$a;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "", "Lgu;", "moduleListCached", "Ljava/util/concurrent/ConcurrentHashMap;", PluginDeviceInfo.FMODEL, "()Ljava/util/concurrent/ConcurrentHashMap;", "CMD_DATA_ECHO", "I", "CMD_GET_MODULES", "CMD_GET_MODULES_V3", "CMD_GET_MODULES_V3_REPLY", "DATA_MODULES", "ECHO_MODULE", "TAG", "Ljava/lang/String;", "", "TIMEOUT", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConcurrentHashMap<String, Map<Integer, SupportModuleInfo>> a() {
            return BuiltInModule.moduleListCached;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lgu;", "it", "", PluginDeviceInfo.FMODEL, "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<Map.Entry<Integer, SupportModuleInfo>, CharSequence> {
        public static final b t = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke2(@NotNull Map.Entry<Integer, SupportModuleInfo> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue().toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BuiltInModule$init$1$1", f = "BuiltInModule.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ BuiltInModule v;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.BuiltInModule$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BuiltInModule$init$1$1$result$1", f = "BuiltInModule.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0269a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int t;
                public final /* synthetic */ BuiltInModule u;
                public final /* synthetic */ int v;
                public final /* synthetic */ byte[] w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0269a(BuiltInModule builtInModule, int i, byte[] bArr, Continuation<? super C0269a> continuation) {
                    super(2, continuation);
                    this.u = builtInModule;
                    this.v = i;
                    this.w = bArr;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0269a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0269a(this.u, this.v, this.w, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.t;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) this.u.channels.get(Boxing.boxInt(this.v));
                        if (channel == null) {
                            return null;
                        }
                        byte[] bArr = this.w;
                        this.t = 1;
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
                this.u = channelResponse;
                this.v = builtInModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.u.getData().length == 0) {
                        t5t.d("EchoModule", "Response no payload");
                        return Unit.INSTANCE;
                    }
                    C0269a c0269a = new C0269a(this.v, ArraysKt___ArraysKt.first(this.u.getData()) & 255, CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.drop(this.u.getData(), 1)), null);
                    this.t = 1;
                    obj = TimeoutKt.withTimeoutOrNull(1000L, c0269a, this);
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
                    t5t.d("EchoModule", "Send msg failed:" + this.u);
                }
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) throws InterruptedException {
            Intrinsics.checkNotNullParameter(response, "response");
            BuildersKt__BuildersKt.runBlocking$default(null, new a(response, BuiltInModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BuiltInModule$sendCommand$1", f = "BuiltInModule.kt", i = {}, l = {141, 143}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int t;
        public final /* synthetic */ int v;
        public final /* synthetic */ byte[] w;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BuiltInModule$sendCommand$1$1", f = "BuiltInModule.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ BuiltInModule u;
            public final /* synthetic */ int v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BuiltInModule builtInModule, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = builtInModule;
                this.v = i;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = (Channel) this.u.channels.get(Boxing.boxInt(this.v));
                    if (channel == null) {
                        return null;
                    }
                    this.t = 1;
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
        public d(int i, byte[] bArr, Continuation<? super d> continuation) {
            super(2, continuation);
            this.v = i;
            this.w = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BuiltInModule.this.new d(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
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
            BuiltInModule.this.channels.put(Boxing.boxInt(this.v), ChannelKt.Channel$default(0, null, null, 7, null));
            BuiltInModule builtInModule = BuiltInModule.this;
            byte[] bArr = this.w;
            this.t = 1;
            obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(builtInModule, bArr, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                return null;
            }
            a aVar = new a(BuiltInModule.this, this.v, null);
            this.t = 2;
            obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.needReadModuleListFromDevice = true;
        this.channels = new LinkedHashMap();
    }

    private final Map<Integer, SupportModuleInfo> getModulesSupportByDevice() {
        ConcurrentHashMap<String, Map<Integer, SupportModuleInfo>> concurrentHashMap = moduleListCached;
        Map<Integer, SupportModuleInfo> map = concurrentHashMap.get(getAddress());
        if (!this.needReadModuleListFromDevice && map != null) {
            return map;
        }
        this.needReadModuleListFromDevice = false;
        Map<Integer, SupportModuleInfo> supportModules = getSupportModules();
        concurrentHashMap.put(getAddress(), supportModules);
        return supportModules;
    }

    private final Map<Integer, SupportModuleInfo> getSupportModules() {
        if (getChannelVersion().getVersionCode() < 2) {
            return MapsKt__MapsKt.emptyMap();
        }
        return getChannelVersion().getEncryptEnable() != null ? getSupportModulesV2() : getSupportModulesV1();
    }

    private final Map<Integer, SupportModuleInfo> getSupportModulesV1() {
        Object objM886constructorimpl;
        byte[] bArrSendCommand = sendCommand(new byte[]{0}, 1);
        if (bArrSendCommand == null) {
            return MapsKt__MapsKt.emptyMap();
        }
        w2 w2Var = new w2(bArrSendCommand, 0, 2, null);
        int iE = w2Var.e();
        try {
            Result.Companion companion = Result.Companion;
            Map linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < iE; i++) {
                int iC = w2Var.c();
                linkedHashMap.put(Integer.valueOf(iC), new SupportModuleInfo(iC, false));
            }
            if (w2Var.h() > 0) {
                linkedHashMap = MapsKt__MapsKt.emptyMap();
            }
            objM886constructorimpl = Result.m886constructorimpl(linkedHashMap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("EchoModule", "Parse module list failed:" + thM889exceptionOrNullimpl);
        }
        if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
            objM886constructorimpl = MapsKt__MapsKt.emptyMap();
        }
        return (Map) objM886constructorimpl;
    }

    private final Map<Integer, SupportModuleInfo> getSupportModulesV2() {
        Object objM886constructorimpl;
        byte[] bArrSendCommand = sendCommand(new byte[]{3}, 4);
        if (bArrSendCommand == null) {
            return MapsKt__MapsKt.emptyMap();
        }
        w2 w2Var = new w2(bArrSendCommand, 0, 2, null);
        int iE = w2Var.e();
        try {
            Result.Companion companion = Result.Companion;
            Map linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < iE; i++) {
                int iE2 = w2Var.e();
                linkedHashMap.put(Integer.valueOf(iE2), new SupportModuleInfo(iE2, w2Var.b()));
            }
            if (w2Var.h() > 0) {
                linkedHashMap = MapsKt__MapsKt.emptyMap();
            } else {
                t5t.d("EchoModule", "Module list:" + CollectionsKt___CollectionsKt.joinToString$default(linkedHashMap.entrySet(), ", ", null, null, 0, null, b.t, 30, null));
            }
            objM886constructorimpl = Result.m886constructorimpl(linkedHashMap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("EchoModule", "Parse module list failed:" + thM889exceptionOrNullimpl);
        }
        if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
            objM886constructorimpl = MapsKt__MapsKt.emptyMap();
        }
        return (Map) objM886constructorimpl;
    }

    @Nullable
    public final byte[] echo(@NotNull byte[] byteArray) {
        List listDrop;
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        byte[] bArrR = tet.r(byteArray.length, 4);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(byteArray.size.toLong(), 4)");
        byte[] bArrSendCommand = sendCommand(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{2}, bArrR), byteArray), 2);
        if (bArrSendCommand == null || (listDrop = ArraysKt___ArraysKt.drop(bArrSendCommand, 4)) == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.toByteArray(listDrop);
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 0;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        this.needReadModuleListFromDevice = true;
        a.registerCallback$default(this, getModule(), false, new c(), 2, null);
    }

    @Nullable
    public final byte[] sendCommand(@NotNull byte[] bytes, int cmdBack) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new d(cmdBack, bytes, null), 1, null);
    }

    public final boolean supportModule(int moduleId) {
        return getModulesSupportByDevice().containsKey(Integer.valueOf(moduleId));
    }
}
