package com.huami.bluetooth.profile.channel.module.record;

import androidx.annotation.WorkerThread;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.schedule.action.DefaultInterceptor;
import com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.tekartik.sqflite.Constant;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 51)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001>B\u000f\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001b\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019J\u0013\u0010\u001e\u001a\u00020\u001dH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\b\u0010\"\u001a\u00020 H\u0007J\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001fR\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R(\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00190.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/record/RecordModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "byteArray", "", "e", "", Constant.h, "f", "", "result", "g", "requestCmd", "returnCmd", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "i", "(BB[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(BBLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Channel;", "c", AbstractJSONTokenResponse.RESPONSE, "onReceive", "(Lcom/huami/bluetooth/profile/channel/ChannelResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lcom/huami/bluetooth/profile/channel/module/record/RecordVersion;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryPath", "queryPathSync", "", "Lcom/huami/bluetooth/profile/channel/module/record/RecordFile;", "queryRecordFiles", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lkotlinx/coroutines/Job;", "job", "", "Ljava/util/Map;", "channels", "", "Ljava/util/List;", "outerInterceptors", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DefaultInterceptor;", z.j, "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DefaultInterceptor;", "innerInterceptor", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", hl.k, "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RecordModule extends BaseModule implements CoroutineScope {

    @Deprecated
    @NotNull
    public static final String TAG = "RecordModule";

    @NotNull
    private static final a k = new a(null);

    @Deprecated
    private static final byte l = 1;

    @Deprecated
    private static final byte m = 2;

    @Deprecated
    private static final byte n = 3;

    @Deprecated
    private static final byte o = 4;

    @Deprecated
    private static final byte p = 5;

    @Deprecated
    private static final byte q = 6;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Byte, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final List<IDataInterceptor> outerInterceptors;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final DefaultInterceptor innerInterceptor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"com/huami/bluetooth/profile/channel/module/record/RecordModule$a", "", "", "CMD_QUERY_FILE_PATH", "B", "CMD_QUERY_RECORD_LIST", "CMD_QUERY_VERSION", "CMD_RETURN_FILE_PATH", "CMD_RETURN_RECORD_LIST", "CMD_RETURN_VERSION", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Job> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule", f = "RecordModule.kt", i = {}, l = {113}, m = "queryPath", n = {}, s = {})
    public static final class f extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return RecordModule.this.queryPath(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule$queryPathSync$1", f = "RecordModule.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RecordModule.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecordModule recordModule = RecordModule.this;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule", f = "RecordModule.kt", i = {}, l = {128}, m = "queryRecordFiles", n = {}, s = {})
    public static final class h extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return RecordModule.this.queryRecordFiles(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule", f = "RecordModule.kt", i = {}, l = {101}, m = "queryVersion", n = {}, s = {})
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
            return RecordModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule", f = "RecordModule.kt", i = {0, 0, 0}, l = {148, 153}, m = "sendData", n = {"this", "channel", "requestCmd"}, s = {"L$0", "L$1", "B$0"})
    public static final class j extends ContinuationImpl {
        public Object a;
        public Object b;
        public byte c;
        public /* synthetic */ Object d;
        public int f;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return RecordModule.this.i((byte) 0, (byte) 0, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.record.RecordModule$sendData$2", f = "RecordModule.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;
        public final /* synthetic */ Channel<ChannelResponse> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Channel<ChannelResponse> channel, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<ChannelResponse> channel = this.b;
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
            return obj;
        }
    }

    public RecordModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(b.a);
        this.channels = new LinkedHashMap();
        this.outerInterceptors = new ArrayList();
        this.innerInterceptor = new DefaultInterceptor(TAG);
    }

    private final Channel<ChannelResponse> c(byte cmd) {
        Channel<ChannelResponse> channel = this.channels.get(Byte.valueOf(cmd));
        if (channel != null) {
            return channel;
        }
        Channel<ChannelResponse> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        this.channels.put(Byte.valueOf(cmd), channelChannel$default);
        return channelChannel$default;
    }

    private final Job d() {
        return (Job) this.job.getValue();
    }

    private final void e(byte[] byteArray) {
        try {
            byte bFirst = ArraysKt___ArraysKt.first(byteArray);
            this.innerInterceptor.onReceive(bFirst, byteArray);
            Iterator<T> it2 = this.outerInterceptors.iterator();
            while (it2.hasNext()) {
                ((IDataInterceptor) it2.next()).onReceive(bFirst, byteArray);
            }
        } catch (Exception e2) {
            HMLog.info(TAG, new c(e2));
        }
    }

    private final void f(byte cmd, byte[] byteArray) {
        try {
            this.innerInterceptor.onSend(cmd, byteArray);
            Iterator<T> it2 = this.outerInterceptors.iterator();
            while (it2.hasNext()) {
                ((IDataInterceptor) it2.next()).onSend(cmd, byteArray);
            }
        } catch (Exception e2) {
            HMLog.info(TAG, new d(e2));
        }
    }

    private final void g(byte cmd, boolean result) {
        try {
            this.innerInterceptor.onFinishSend(cmd, result);
            Iterator<T> it2 = this.outerInterceptors.iterator();
            while (it2.hasNext()) {
                ((IDataInterceptor) it2.next()).onFinishSend(cmd, result);
            }
        } catch (Exception e2) {
            HMLog.info(TAG, new e(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(byte b2, byte b3, Continuation<? super ChannelResponse> continuation) {
        return i(b2, b3, new byte[]{b2}, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(byte b2, byte b3, byte[] bArr, Continuation<? super ChannelResponse> continuation) {
        j jVar;
        Channel<ChannelResponse> channelC;
        RecordModule recordModule;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objSendDataWithResult$default = jVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f;
        if (i3 != 0) {
            if (i3 == 1) {
                b2 = jVar.c;
                channelC = (Channel) jVar.b;
                recordModule = (RecordModule) jVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        f(b2, bArr);
        channelC = c(b3);
        jVar.a = this;
        jVar.b = channelC;
        jVar.c = b2;
        jVar.f = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArr, 0, false, jVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        recordModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        recordModule.g(b2, zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        k kVar = new k(channelC, null);
        jVar.a = null;
        jVar.b = null;
        jVar.f = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, kVar, jVar);
        return objSendDataWithResult$default == coroutine_suspended ? coroutine_suspended : objSendDataWithResult$default;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return d().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    @Nullable
    public Object onReceive(@NotNull ChannelResponse channelResponse, @NotNull Continuation<? super Unit> continuation) {
        byte[] data = channelResponse.getData();
        if (data.length == 0) {
            return Unit.INSTANCE;
        }
        e(data);
        Channel<ChannelResponse> channel = this.channels.get(Boxing.boxByte(ArraysKt___ArraysKt.first(data)));
        if (channel != null) {
            Object objSend = channel.send(channelResponse, continuation);
            return objSend == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryPath(@NotNull Continuation<? super String> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.c = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objH = fVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objH);
            fVar.c = 1;
            objH = h((byte) 3, (byte) 4, fVar);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objH);
        }
        ChannelResponse channelResponse = (ChannelResponse) objH;
        if (channelResponse == null) {
            return "";
        }
        BufByteDecoder bufByteDecoder = new BufByteDecoder(channelResponse.getData(), 0, 2, null);
        bufByteDecoder.readByte();
        return bufByteDecoder.readString();
    }

    @WorkerThread
    @NotNull
    public final String queryPathSync() {
        return (String) kotlinx.coroutines.d.b(null, new g(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryRecordFiles(@NotNull Continuation<? super List<RecordFile>> continuation) {
        h hVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.c = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objH = hVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objH);
            hVar.c = 1;
            objH = h((byte) 5, (byte) 6, hVar);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objH);
        }
        ChannelResponse channelResponse = (ChannelResponse) objH;
        if (channelResponse == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        BufByteDecoder bufByteDecoder = new BufByteDecoder(channelResponse.getData(), 0, 2, null);
        bufByteDecoder.readByte();
        bufByteDecoder.readShort();
        ArrayList arrayList = new ArrayList();
        while (bufByteDecoder.remain() > 0) {
            arrayList.add(new RecordFile(bufByteDecoder.readString(), bufByteDecoder.readInt(4), bufByteDecoder.readInt(4), bufByteDecoder.readLong(8)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super RecordVersion> continuation) {
        i iVar;
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
        Object objH = iVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objH);
            iVar.c = 1;
            objH = h((byte) 1, (byte) 2, iVar);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objH);
        }
        ChannelResponse channelResponse = (ChannelResponse) objH;
        if (channelResponse == null) {
            return new RecordVersion((byte) -1);
        }
        BufByteDecoder bufByteDecoder = new BufByteDecoder(channelResponse.getData(), 0, 2, null);
        bufByteDecoder.readByte();
        return new RecordVersion((byte) bufByteDecoder.readByte());
    }

    public final void registerInterceptor(@NotNull IDataInterceptor interceptor) {
        synchronized (this.outerInterceptors) {
            if (!this.outerInterceptors.contains(interceptor)) {
                this.outerInterceptors.add(interceptor);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void unregisterInterceptor(@NotNull IDataInterceptor interceptor) {
        synchronized (this.outerInterceptors) {
            this.outerInterceptors.remove(interceptor);
        }
    }
}
