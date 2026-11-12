package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.assistant.response.Timeout;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jq.a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u00015B\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0002J\u000f\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH$¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\nH$¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0004J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0004J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0006H\u0004J\"\u0010#\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0004R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020!8$X¤\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00066"}, d2 = {"Lc1;", "Ljq$a;", "T", "Lkotlinx/coroutines/CoroutineScope;", "cmd", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", com.xiaomi.onetrack.api.b.I, "", "dispatch", "", "rawData", "onReceived", "command", "", "Lkotlinx/coroutines/channels/Channel;", "getChannelList", "initCallback$bluetooth_release", "()V", "initCallback", "parseCommand", "([B)Ljq$a;", "data", "handleCommand", "(Ljq$a;[B)V", "", "timeMillis", "sendRequest", "", "sendRequestNoResponse", "dispatchResponse", "", "code", "", "msg", "dispatchError", "Lkotlinx/coroutines/CompletableJob;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getTag", "()Ljava/lang/String;", "tag", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class c1<T extends jq.a> implements CoroutineScope {

    @NotNull
    public static final a Companion = new a(null);
    public static final long TIMEOUT = 5000;
    public static final long TIMEOUT_LONG = 15000;

    @NotNull
    private final HashMap<jq.a, List<Channel<Object>>> channelMap;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @NotNull
    private final com.huami.bluetooth.profile.channel.module.a module;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lc1$a;", "", "", "TIMEOUT", "J", "TIMEOUT_LONG", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Dispatch no channels!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Ljq$a;", "T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$dispatch$3", f = "BaseApiImpl.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Response<Object> A;
        public final /* synthetic */ jq.a B;
        public Object t;
        public Object u;
        public Object v;
        public Object w;
        public int x;
        public final /* synthetic */ Ref.ObjectRef<List<Channel<Object>>> y;
        public final /* synthetic */ c1<T> z;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ jq.a t;
            public final /* synthetic */ Channel<Object> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jq.a aVar, Channel<Object> channel) {
                super(0);
                this.t = aVar;
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Dispatch " + this.t + " channel: " + this.u.hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef<List<Channel<Object>>> objectRef, c1<T> c1Var, Response<Object> response, jq.a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.y = objectRef;
            this.z = c1Var;
            this.A = response;
            this.B = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.y, this.z, this.A, this.B, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            c1<T> c1Var;
            Response<Object> response;
            jq.a aVar;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.x;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<Channel<Object>> list = this.y.element;
                Intrinsics.checkNotNull(list);
                c1Var = this.z;
                response = this.A;
                aVar = this.B;
                it = list.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.w;
                aVar = (jq.a) this.v;
                response = (Response) this.u;
                c1Var = (c1) this.t;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                Channel channel = (Channel) it.next();
                le.a(c1Var.getT(), new a(aVar, channel));
                this.t = c1Var;
                this.u = response;
                this.v = aVar;
                this.w = it;
                this.x = 1;
                if (channel.send(response, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ jq.a t;
        public final /* synthetic */ int u;
        public final /* synthetic */ String v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(jq.a aVar, int i, String str) {
            super(0);
            this.t = aVar;
            this.u = i;
            this.v = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Dispatch error: " + this.t + " - " + this.u + ": " + this.v;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ jq.a t;
        public final /* synthetic */ Object u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(jq.a aVar, Object obj) {
            super(0);
            this.t = aVar;
            this.u = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Dispatch response: " + this.t + " - " + this.u;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljq$a;", "T", "Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function1<ChannelResponse, Unit> {
        public final /* synthetic */ c1<T> t;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Ljq$a;", "T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$initCallback$1$1", f = "BaseApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ c1<T> u;
            public final /* synthetic */ ChannelResponse v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c1<T> c1Var, ChannelResponse channelResponse, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = c1Var;
                this.v = channelResponse;
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
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.u.onReceived(this.v.getData());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c1<T> c1Var) {
            super(1);
            this.t = c1Var;
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            c1<T> c1Var = this.t;
            BuildersKt__Builders_commonKt.launch$default(c1Var, null, null, new a(c1Var, it, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<CompletableJob> {
        public static final g t = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ T t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(T t) {
            super(0);
            this.t = t;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Handle command: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i t = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Handle command error!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j t = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Parse command error!";
        }
    }

    /* JADX INFO: renamed from: c1$k, reason: from Kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "Ljq$a;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$sendRequest$1", f = "BaseApiImpl.kt", i = {0, 0, 0}, l = {61}, m = "invokeSuspend", n = {"$this$runBlocking", "channel", "channelList"}, s = {"L$0", "L$1", "L$2"})
    public static final class T extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<T>>, Object> {
        public final /* synthetic */ byte[] A;
        public Object t;
        public Object u;
        public int v;
        public /* synthetic */ Object w;
        public final /* synthetic */ c1<T> x;
        public final /* synthetic */ long y;
        public final /* synthetic */ jq.a z;

        /* JADX INFO: renamed from: c1$k$a, reason: from Kotlin metadata and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ljq$a;", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class C0104a extends Lambda implements Function0<String> {
            public final /* synthetic */ jq.a t;
            public final /* synthetic */ Channel<Response<T>> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0104a(jq.a aVar, Channel<Response<T>> channel) {
                super(0);
                this.t = aVar;
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Add " + this.t + ' ' + this.u.hashCode();
            }
        }

        /* JADX INFO: renamed from: c1$k$b, reason: from Kotlin metadata and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "Ljq$a;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$sendRequest$1$3", f = "BaseApiImpl.kt", i = {}, l = {62, 64}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0105b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<T>>, Object> {
            public int t;
            public final /* synthetic */ c1<T> u;
            public final /* synthetic */ jq.a v;
            public final /* synthetic */ byte[] w;
            public final /* synthetic */ Channel<Response<T>> x;
            public final /* synthetic */ Ref.ObjectRef<List<Channel<Object>>> y;

            /* JADX INFO: renamed from: c1$k$b$a, reason: from Kotlin metadata and collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ljq$a;", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            public static final class C0106a extends Lambda implements Function0<String> {
                public final /* synthetic */ jq.a t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0106a(jq.a aVar) {
                    super(0);
                    this.t = aVar;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Wait " + this.t + " response...";
                }
            }

            /* JADX INFO: renamed from: c1$k$b$b, reason: from Kotlin metadata and collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ljq$a;", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            public static final class C0107b extends Lambda implements Function0<String> {
                public final /* synthetic */ jq.a t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0107b(jq.a aVar) {
                    super(0);
                    this.t = aVar;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Send " + this.t + " failed!";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0105b(c1<T> c1Var, jq.a aVar, byte[] bArr, Channel<Response<T>> channel, Ref.ObjectRef<List<Channel<Object>>> objectRef, Continuation<? super C0105b> continuation) {
                super(2, continuation);
                this.u = c1Var;
                this.v = aVar;
                this.w = bArr;
                this.x = channel;
                this.y = objectRef;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<T>> continuation) {
                return ((C0105b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0105b(this.u, this.v, this.w, this.x, this.y, continuation);
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
                    return (Response) obj;
                }
                ResultKt.throwOnFailure(obj);
                com.huami.bluetooth.profile.channel.module.a aVar = ((c1) this.u).module;
                byte[] f23009a = new jq(this.v, this.w).getF23009a();
                this.t = 1;
                obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(aVar, f23009a, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                    this.y.element.remove(this.x);
                    le.a(this.u.getT(), null, null, new C0107b(this.v), 6, null);
                    return new Failure("Send failed!", 0, 2, null);
                }
                le.c(this.u.getT(), new C0106a(this.v));
                Channel<Response<T>> channel = this.x;
                this.t = 2;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (Response) obj;
            }
        }

        /* JADX INFO: renamed from: c1$k$c, reason: from Kotlin metadata and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ljq$a;", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class C0108c extends Lambda implements Function0<String> {
            public final /* synthetic */ jq.a t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0108c(jq.a aVar) {
                super(0);
                this.t = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Send " + this.t + " timeout!";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T(c1<T> c1Var, long j, jq.a aVar, byte[] bArr, Continuation<? super T> continuation) {
            super(2, continuation);
            this.x = c1Var;
            this.y = j;
            this.z = aVar;
            this.A = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<T>> continuation) {
            return ((T) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            T t = new T(this.x, this.y, this.z, this.A, continuation);
            t.w = obj;
            return t;
        }

        /* JADX WARN: Type inference failed for: r8v1, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Channel channelChannel$default;
            Object objWithTimeoutOrNull;
            Ref.ObjectRef objectRef;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.v;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.w;
                channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                Intrinsics.checkNotNull(channelChannel$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<kotlin.Any>");
                HashMap map = ((c1) this.x).channelMap;
                c1<T> c1Var = this.x;
                jq.a aVar = this.z;
                synchronized (map) {
                    ?? channelList = c1Var.getChannelList(aVar);
                    objectRef2.element = channelList;
                    ((List) channelList).add(channelChannel$default);
                }
                le.c(this.x.getT(), new C0104a(this.z, channelChannel$default));
                long j = this.y;
                C0105b c0105b = new C0105b(this.x, this.z, this.A, channelChannel$default, objectRef2, null);
                this.w = coroutineScope;
                this.t = channelChannel$default;
                this.u = objectRef2;
                this.v = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, c0105b, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.u;
                Channel channel = (Channel) this.t;
                ResultKt.throwOnFailure(obj);
                channelChannel$default = channel;
                objWithTimeoutOrNull = obj;
            }
            Response response = (Response) objWithTimeoutOrNull;
            if (response != null) {
                return response;
            }
            c1<T> c1Var2 = this.x;
            jq.a aVar2 = this.z;
            ((List) objectRef.element).remove(channelChannel$default);
            le.a(c1Var2.getT(), null, null, new C0108c(aVar2), 6, null);
            return new Timeout(null, 1, null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Ljq$a;", "T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$sendRequestNoResponse$1", f = "BaseApiImpl.kt", i = {0}, l = {79}, m = "invokeSuspend", n = {"$this$runBlocking"}, s = {"L$0"})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ long v;
        public final /* synthetic */ c1<T> w;
        public final /* synthetic */ jq.a x;
        public final /* synthetic */ byte[] y;

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Ljq$a;", "T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$sendRequestNoResponse$1$1", f = "BaseApiImpl.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int t;
            public final /* synthetic */ c1<T> u;
            public final /* synthetic */ jq.a v;
            public final /* synthetic */ byte[] w;

            /* JADX INFO: renamed from: c1$l$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            public static final class C0109a extends Lambda implements Function0<String> {
                public final /* synthetic */ jq.a t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0109a(jq.a aVar) {
                    super(0);
                    this.t = aVar;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Send " + this.t + " success!";
                }
            }

            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ jq.a t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(jq.a aVar) {
                    super(0);
                    this.t = aVar;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Send " + this.t + " failed!";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c1<T> c1Var, jq.a aVar, byte[] bArr, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = c1Var;
                this.v = aVar;
                this.w = bArr;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, this.w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.huami.bluetooth.profile.channel.module.a aVar = ((c1) this.u).module;
                    byte[] f23009a = new jq(this.v, this.w).getF23009a();
                    this.t = 1;
                    obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(aVar, f23009a, 0, false, this, 6, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    le.c(this.u.getT(), new C0109a(this.v));
                    return new Success(Boxing.boxBoolean(true));
                }
                le.a(this.u.getT(), null, null, new b(this.v), 6, null);
                return new Failure("Send failed!", 0, 2, null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq$a;", "T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ jq.a t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jq.a aVar) {
                super(0);
                this.t = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Send " + this.t + " timeout!";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j, c1<T> c1Var, jq.a aVar, byte[] bArr, Continuation<? super l> continuation) {
            super(2, continuation);
            this.v = j;
            this.w = c1Var;
            this.x = aVar;
            this.y = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = new l(this.v, this.w, this.x, this.y, continuation);
            lVar.u = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.u;
                long j = this.v;
                a aVar = new a(this.w, this.x, this.y, null);
                this.u = coroutineScope;
                this.t = 1;
                obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            if (response != null) {
                return response;
            }
            le.a(this.w.getT(), null, null, new b(this.x), 6, null);
            return new Timeout(null, 1, null);
        }
    }

    public c1(@NotNull com.huami.bluetooth.profile.channel.module.a module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.module = module;
        this.job = LazyKt__LazyJVMKt.lazy(g.t);
        this.channelMap = new HashMap<>();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.util.ArrayList] */
    private final void dispatch(jq.a cmd, Response<Object> response) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.channelMap) {
            List<Channel<Object>> it = this.channelMap.get(cmd);
            if (it != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (!(!it.isEmpty())) {
                    it = null;
                }
                if (it != null) {
                    objectRef.element = new ArrayList(it);
                    it.clear();
                }
            }
        }
        if (objectRef.element == 0) {
            le.a(getT(), (Throwable) null, b.t, 2, (Object) null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(objectRef, this, response, cmd, null), 3, null);
        }
    }

    public static /* synthetic */ void dispatchError$default(c1 c1Var, jq.a aVar, int i2, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchError");
        }
        if ((i3 & 4) != 0) {
            str = "";
        }
        c1Var.dispatchError(aVar, i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Channel<Object>> getChannelList(jq.a command) {
        List<Channel<Object>> list = this.channelMap.get(command);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.channelMap.put(command, arrayList);
        return arrayList;
    }

    private final CompletableJob getJob() {
        return (CompletableJob) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReceived(byte[] rawData) {
        try {
            jq.a command = parseCommand(rawData);
            if (command == null) {
                return;
            }
            byte[] bArrCopyOfRange = command.getLength() < rawData.length ? ArraysKt___ArraysJvmKt.copyOfRange(rawData, command.getLength(), rawData.length) : new byte[0];
            try {
                le.c(getT(), new h(command));
                handleCommand(command, bArrCopyOfRange);
            } catch (Exception e2) {
                le.a(getT(), null, e2, i.t, 2, null);
            }
        } catch (Exception e3) {
            le.a(getT(), null, e3, j.t, 2, null);
        }
    }

    public static /* synthetic */ Response sendRequest$default(c1 c1Var, jq.a aVar, byte[] bArr, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendRequest");
        }
        if ((i2 & 2) != 0) {
            bArr = null;
        }
        if ((i2 & 4) != 0) {
            j2 = 5000;
        }
        return c1Var.sendRequest(aVar, bArr, j2);
    }

    public static /* synthetic */ Response sendRequestNoResponse$default(c1 c1Var, jq.a aVar, byte[] bArr, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendRequestNoResponse");
        }
        if ((i2 & 2) != 0) {
            bArr = null;
        }
        if ((i2 & 4) != 0) {
            j2 = 5000;
        }
        return c1Var.sendRequestNoResponse(aVar, bArr, j2);
    }

    public final void dispatchError(@NotNull jq.a cmd, int code, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(msg, "msg");
        le.c(getT(), new d(cmd, code, msg));
        dispatch(cmd, Response.INSTANCE.a(msg, code));
    }

    public final void dispatchResponse(@NotNull jq.a cmd, @NotNull Object data) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(data, "data");
        le.c(getT(), new e(cmd, data));
        dispatch(cmd, Response.INSTANCE.a(data));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    @NotNull
    /* JADX INFO: renamed from: getTag */
    public abstract String getT();

    public abstract void handleCommand(@NotNull T cmd, @NotNull byte[] data);

    public final void initCallback$bluetooth_release() {
        com.huami.bluetooth.profile.channel.module.a aVar = this.module;
        com.huami.bluetooth.profile.channel.module.a.registerCallback$default(aVar, aVar.getModule(), false, new f(this), 2, null);
    }

    @Nullable
    public abstract T parseCommand(@NotNull byte[] rawData);

    @NotNull
    public final <T> Response<T> sendRequest(@NotNull jq.a cmd, @Nullable byte[] data, long timeMillis) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        return (Response) BuildersKt.runBlocking(getCoroutineContext(), new T(this, timeMillis, cmd, data, null));
    }

    @NotNull
    public final Response<Boolean> sendRequestNoResponse(@NotNull jq.a cmd, @Nullable byte[] data, long timeMillis) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        return (Response) BuildersKt.runBlocking(getCoroutineContext(), new l(timeMillis, this, cmd, data, null));
    }
}
