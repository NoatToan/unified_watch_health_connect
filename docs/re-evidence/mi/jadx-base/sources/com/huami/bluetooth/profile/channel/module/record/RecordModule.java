package com.huami.bluetooth.profile.channel.module.record;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.ChannelResponse;
import defpackage.RecordFile;
import defpackage.RecordVersion;
import defpackage.d4;
import defpackage.jh;
import defpackage.le;
import defpackage.m6;
import defpackage.r3;
import defpackage.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:B\u000f\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001b\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018J\u0013\u0010\u001d\u001a\u00020\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\b\u0010!\u001a\u00020\u001fH\u0007J\u0019\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001eR\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/record/RecordModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "byteArray", "", "notifyOnReceive", "", "cmd", "notifyOnSend", "", "result", "notifyOnSendFinish", "requestCmd", "returnCmd", "Lm4;", "sendData", "(BB[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(BBLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Channel;", "getChannel", com.xiaomi.onetrack.api.b.I, "onReceive", "(Lm4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljh;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lgq;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryPath", "queryPathSync", "", "Lfq;", "queryRecordFiles", "Lkotlinx/coroutines/CompletableJob;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "job", "", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "", "outerInterceptors", "Ljava/util/List;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "api", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 51)
public final class RecordModule extends com.huami.bluetooth.profile.channel.module.a implements CoroutineScope {

    @Deprecated
    private static final byte CMD_QUERY_FILE_PATH = 3;

    @Deprecated
    private static final byte CMD_QUERY_RECORD_LIST = 5;

    @Deprecated
    private static final byte CMD_QUERY_VERSION = 1;

    @Deprecated
    private static final byte CMD_RETURN_FILE_PATH = 4;

    @Deprecated
    private static final byte CMD_RETURN_RECORD_LIST = 6;

    @Deprecated
    private static final byte CMD_RETURN_VERSION = 2;

    @NotNull
    private static final a Companion = new a(null);

    @Deprecated
    @NotNull
    public static final String TAG = "RecordModule";

    @NotNull
    private final Map<Byte, Channel<ChannelResponse>> channels;

    @NotNull
    private final m6 innerInterceptor;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @NotNull
    private final List<jh> outerInterceptors;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/record/RecordModule$a;", "", "", "CMD_QUERY_FILE_PATH", com.xiaomi.onetrack.api.c.f13755a, "CMD_QUERY_RECORD_LIST", "CMD_QUERY_VERSION", "CMD_RETURN_FILE_PATH", "CMD_RETURN_RECORD_LIST", "CMD_RETURN_VERSION", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<CompletableJob> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.t = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.t.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.t = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.t.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.t = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.t.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule", f = "RecordModule.kt", i = {}, l = {113}, m = "queryPath", n = {}, s = {})
    public static final class f extends ContinuationImpl {
        public /* synthetic */ Object t;
        public int v;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return RecordModule.this.queryPath(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule$queryPathSync$1", f = "RecordModule.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public int t;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RecordModule.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecordModule recordModule = RecordModule.this;
                this.t = 1;
                obj = recordModule.queryPath(this);
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule", f = "RecordModule.kt", i = {}, l = {128}, m = "queryRecordFiles", n = {}, s = {})
    public static final class h extends ContinuationImpl {
        public /* synthetic */ Object t;
        public int v;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return RecordModule.this.queryRecordFiles(this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule", f = "RecordModule.kt", i = {}, l = {101}, m = "queryVersion", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public /* synthetic */ Object t;
        public int v;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return RecordModule.this.queryVersion(this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule", f = "RecordModule.kt", i = {0, 0, 0}, l = {148, 153}, m = "sendData", n = {"this", "channel", "requestCmd"}, s = {"L$0", "L$1", "B$0"})
    public static final class j extends ContinuationImpl {
        public Object t;
        public Object u;
        public byte v;
        public /* synthetic */ Object w;
        public int y;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return RecordModule.this.sendData((byte) 0, (byte) 0, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule$sendData$2", f = "RecordModule.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;
        public final /* synthetic */ Channel<ChannelResponse> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Channel<ChannelResponse> channel, Continuation<? super k> continuation) {
            super(2, continuation);
            this.u = channel;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<ChannelResponse> channel = this.u;
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
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
        this.job = LazyKt__LazyJVMKt.lazy(b.t);
        this.channels = new LinkedHashMap();
        this.outerInterceptors = new ArrayList();
        this.innerInterceptor = new m6(TAG);
    }

    private final Channel<ChannelResponse> getChannel(byte cmd) {
        Channel<ChannelResponse> channel = this.channels.get(Byte.valueOf(cmd));
        if (channel != null) {
            return channel;
        }
        Channel<ChannelResponse> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.channels.put(Byte.valueOf(cmd), channelChannel$default);
        return channelChannel$default;
    }

    private final CompletableJob getJob() {
        return (CompletableJob) this.job.getValue();
    }

    private final void notifyOnReceive(byte[] byteArray) {
        try {
            byte bFirst = ArraysKt___ArraysKt.first(byteArray);
            this.innerInterceptor.b(bFirst, byteArray);
            Iterator<T> it = this.outerInterceptors.iterator();
            while (it.hasNext()) {
                ((jh) it.next()).b(bFirst, byteArray);
            }
        } catch (Exception e2) {
            le.c(TAG, new c(e2));
        }
    }

    private final void notifyOnSend(byte cmd, byte[] byteArray) {
        try {
            this.innerInterceptor.a(cmd, byteArray);
            Iterator<T> it = this.outerInterceptors.iterator();
            while (it.hasNext()) {
                ((jh) it.next()).a(cmd, byteArray);
            }
        } catch (Exception e2) {
            le.c(TAG, new d(e2));
        }
    }

    private final void notifyOnSendFinish(byte cmd, boolean result) {
        try {
            this.innerInterceptor.a(cmd, result);
            Iterator<T> it = this.outerInterceptors.iterator();
            while (it.hasNext()) {
                ((jh) it.next()).a(cmd, result);
            }
        } catch (Exception e2) {
            le.c(TAG, new e(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendData(byte b2, byte b3, byte[] bArr, Continuation<? super ChannelResponse> continuation) {
        j jVar;
        Channel<ChannelResponse> channel;
        RecordModule recordModule;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.y = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objSendDataWithResult$default = jVar.w;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.y;
        if (i3 != 0) {
            if (i3 == 1) {
                b2 = jVar.v;
                channel = (Channel) jVar.u;
                recordModule = (RecordModule) jVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        notifyOnSend(b2, bArr);
        channel = getChannel(b3);
        jVar.t = this;
        jVar.u = channel;
        jVar.v = b2;
        jVar.y = 1;
        objSendDataWithResult$default = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(this, bArr, 0, false, jVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        recordModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        recordModule.notifyOnSendFinish(b2, zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        k kVar = new k(channel, null);
        jVar.t = null;
        jVar.u = null;
        jVar.y = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, kVar, jVar);
        return objSendDataWithResult$default == coroutine_suspended ? coroutine_suspended : objSendDataWithResult$default;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    @Nullable
    public Object onReceive(@NotNull ChannelResponse channelResponse, @NotNull Continuation<? super Unit> continuation) {
        Object objSend;
        byte[] data = channelResponse.getData();
        if (data.length == 0) {
            return Unit.INSTANCE;
        }
        notifyOnReceive(data);
        Channel<ChannelResponse> channel = this.channels.get(Boxing.boxByte(ArraysKt___ArraysKt.first(data)));
        return (channel == null || (objSend = channel.send(channelResponse, continuation)) != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objSend;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryPath(@NotNull Continuation<? super String> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.v = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objSendData = fVar.t;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fVar.v;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendData);
            fVar.v = 1;
            objSendData = sendData((byte) 3, (byte) 4, fVar);
            if (objSendData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendData);
        }
        ChannelResponse channelResponse = (ChannelResponse) objSendData;
        if (channelResponse == null) {
            return "";
        }
        w2 w2Var = new w2(channelResponse.getData(), 0, 2, null);
        w2Var.c();
        return w2Var.f();
    }

    @NotNull
    public final String queryPathSync() {
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new g(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryRecordFiles(@NotNull Continuation<? super List<RecordFile>> continuation) {
        h hVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.v = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objSendData = hVar.t;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = hVar.v;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendData);
            hVar.v = 1;
            objSendData = sendData((byte) 5, (byte) 6, hVar);
            if (objSendData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendData);
        }
        ChannelResponse channelResponse = (ChannelResponse) objSendData;
        if (channelResponse == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        w2 w2Var = new w2(channelResponse.getData(), 0, 2, null);
        w2Var.c();
        w2Var.e();
        ArrayList arrayList = new ArrayList();
        while (w2Var.h() > 0) {
            arrayList.add(new RecordFile(w2Var.f(), w2Var.c(4), w2Var.c(4), w2Var.d(8)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super RecordVersion> continuation) {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.v = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objSendData = iVar.t;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.v;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendData);
            iVar.v = 1;
            objSendData = sendData((byte) 1, (byte) 2, iVar);
            if (objSendData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendData);
        }
        ChannelResponse channelResponse = (ChannelResponse) objSendData;
        if (channelResponse == null) {
            return new RecordVersion((byte) -1);
        }
        w2 w2Var = new w2(channelResponse.getData(), 0, 2, null);
        w2Var.c();
        return new RecordVersion((byte) w2Var.c());
    }

    public final void registerInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        synchronized (this.outerInterceptors) {
            try {
                if (!this.outerInterceptors.contains(interceptor)) {
                    this.outerInterceptors.add(interceptor);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void unregisterInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        synchronized (this.outerInterceptors) {
            this.outerInterceptors.remove(interceptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendData(byte b2, byte b3, Continuation<? super ChannelResponse> continuation) {
        return sendData(b2, b3, new byte[]{b2}, continuation);
    }
}
