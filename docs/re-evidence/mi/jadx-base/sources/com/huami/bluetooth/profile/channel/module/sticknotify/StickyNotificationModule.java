package com.huami.bluetooth.profile.channel.module.sticknotify;

import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.StickyNotificationRequest;
import defpackage.StickyNotificationResponse;
import defpackage.d4;
import defpackage.k9;
import defpackage.r0;
import defpackage.r3;
import defpackage.rk;
import defpackage.t5t;
import defpackage.w2;
import defpackage.xt;
import defpackage.y2;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:B\u000f\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rJ/\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR)\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R*\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u00100\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sticknotify/StickyNotificationModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "request", "Lyt;", "parseToStickyNotification", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "init", "", "queryVersion", "()Ljava/lang/Integer;", "Lorg/json/JSONObject;", "stickyNotificationJson", "Lk9;", "pushNotification", "Lzt;", "stickNotificationResponse", "Lkotlin/Function1;", "", "action", "responseImageRequest", "(Lzt;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "Lxt;", "stickyNotificationImageListener", "Lxt;", "getStickyNotificationImageListener", "()Lxt;", "setStickyNotificationImageListener", "(Lxt;)V", "getStickyNotificationImageListener$annotations", "()V", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 65)
public final class StickyNotificationModule extends a implements CoroutineScope {
    private static final int CMD_PUSH_MESSAGE = 3;
    private static final int CMD_QUERY_LIST = 5;
    private static final int CMD_QUERY_VERSION = 1;
    private static final int CMD_RETURN_LIST = 6;
    private static final int CMD_RETURN_PUSH = 4;
    private static final int CMD_RETURN_VERSION = 2;

    @NotNull
    private static final String TAG = "StickNotificationModule";

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Nullable
    private xt stickyNotificationImageListener;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sticknotify.StickyNotificationModule$init$1$1", f = "StickyNotificationModule.kt", i = {}, l = {113, 114, 119}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ StickyNotificationModule v;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.sticknotify.StickyNotificationModule$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sticknotify.StickyNotificationModule$init$1$1$2", f = "StickyNotificationModule.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0284a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int t;
                public final /* synthetic */ StickyNotificationModule u;
                public final /* synthetic */ int v;
                public final /* synthetic */ byte[] w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0284a(StickyNotificationModule stickyNotificationModule, int i, byte[] bArr, Continuation<? super C0284a> continuation) {
                    super(2, continuation);
                    this.u = stickyNotificationModule;
                    this.v = i;
                    this.w = bArr;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0284a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0284a(this.u, this.v, this.w, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.t;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) this.u.getMsgChannels().get(Boxing.boxInt(this.v));
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
            public a(ChannelResponse channelResponse, StickyNotificationModule stickyNotificationModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = stickyNotificationModule;
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

            /* JADX WARN: Code duplicated, block: B:29:0x007e A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                StickyNotificationRequest stickyNotificationRequest;
                xt stickyNotificationImageListener;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.u.getData().length == 0) {
                        t5t.d(StickyNotificationModule.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    int iA = r0.a(ArraysKt___ArraysKt.first(this.u.getData()));
                    byte[] bArrA = y2.a(this.u.getData());
                    if (iA != 5) {
                        C0284a c0284a = new C0284a(this.v, iA, bArrA, null);
                        this.t = 3;
                        if (TimeoutKt.withTimeoutOrNull(1000L, c0284a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (this.v.getStickyNotificationImageListener() != null) {
                        StickyNotificationModule stickyNotificationModule = this.v;
                        this.t = 1;
                        obj = stickyNotificationModule.parseToStickyNotification(bArrA, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stickyNotificationRequest = (StickyNotificationRequest) obj;
                        if (stickyNotificationRequest != null) {
                            this.t = 2;
                            if (stickyNotificationImageListener.a(stickyNotificationRequest, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    stickyNotificationRequest = (StickyNotificationRequest) obj;
                    if (stickyNotificationRequest != null && (stickyNotificationImageListener = this.v.getStickyNotificationImageListener()) != null) {
                        this.t = 2;
                        if (stickyNotificationImageListener.a(stickyNotificationRequest, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) throws InterruptedException {
            Intrinsics.checkNotNullParameter(response, "response");
            BuildersKt__BuildersKt.runBlocking$default(null, new a(response, StickyNotificationModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<CompletableJob> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sticknotify.StickyNotificationModule", f = "StickyNotificationModule.kt", i = {}, l = {SportReportBaseParser.ReportType.divingCNS}, m = "parseToStickyNotification", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object t;
        public int v;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return StickyNotificationModule.this.parseToStickyNotification(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "(Z)V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public static final e t = new e();

        public e() {
            super(1);
        }

        public final void a(boolean z) {
            t5t.d(StickyNotificationModule.TAG, "responseImageRequest invalid parameter: " + z);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
            a(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sticknotify.StickyNotificationModule", f = "StickyNotificationModule.kt", i = {0, 0}, l = {221}, m = "responseImageRequest", n = {"action", "responseByteArray"}, s = {"L$0", "L$1"})
    public static final class f extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return StickyNotificationModule.this.responseImageRequest(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyNotificationModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(c.t);
        this.channels = new LinkedHashMap();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    public static /* synthetic */ void getStickyNotificationImageListener$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object parseToStickyNotification(byte[] bArr, Continuation<? super StickyNotificationRequest> continuation) {
        d dVar;
        int iC;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.v = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.t;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.v;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (bArr.length == 0 || bArr.length < 5) {
                t5t.d(TAG, "parseToStickyNotification request is empty");
                return null;
            }
            int iC2 = 0;
            w2 w2Var = new w2(bArr, 0, 2, null);
            String strF = w2Var.f();
            String strF2 = w2Var.f();
            if (strF.length() == 0 || strF2.length() == 0) {
                t5t.d(TAG, "parseToStickyNotification msgId or imageUrl isEmpty");
                return null;
            }
            rk rkVarA = rk.u.a(w2Var.c());
            try {
                iC = w2Var.c(2);
            } catch (Exception unused) {
                iC = 0;
            }
            try {
                iC2 = w2Var.c(2);
            } catch (Exception unused2) {
            }
            int i3 = iC2;
            if (rkVarA != rk.UNKNOWN && iC != 0 && i3 != 0) {
                return new StickyNotificationRequest(strF, strF2, rkVarA, iC, i3);
            }
            t5t.d(TAG, "parseToStickyNotification imageFormat is unknown or image size is zero");
            StickyNotificationResponse stickyNotificationResponse = new StickyNotificationResponse(strF, strF2, k9.INVALID_PARAMETER);
            Function1<? super Boolean, Unit> function1 = e.t;
            dVar.v = 1;
            if (responseImageRequest(stickyNotificationResponse, function1, dVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return null;
    }

    @NotNull
    public final Map<Integer, Channel<ChannelResponse>> getChannels() {
        return this.channels;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 65;
    }

    @Nullable
    public final xt getStickyNotificationImageListener() {
        return this.stickyNotificationImageListener;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    @Nullable
    public final k9 pushNotification(@NotNull JSONObject stickyNotificationJson) {
        Intrinsics.checkNotNullParameter(stickyNotificationJson, "stickyNotificationJson");
        try {
            if (stickyNotificationJson.length() == 0) {
                t5t.d(TAG, "pushNotification does not contains json object data");
                return null;
            }
        } catch (Exception e2) {
            t5t.d(TAG, "pushNotification format to Json exception: " + e2);
        }
        String string = stickyNotificationJson.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stickyNotificationJson.toString()");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(new byte[]{3}, ArraysKt___ArraysJvmKt.plus(bytes, (byte) 0)), 4, 0L, 4, (Object) null);
        if (bArrSendCommand$default != null && bArrSendCommand$default.length != 0) {
            return k9.v.a(ArraysKt___ArraysKt.first(bArrSendCommand$default));
        }
        t5t.d(TAG, "pushNotification response null");
        return null;
    }

    @Nullable
    public final Integer queryVersion() {
        byte[] bArrSendCommand$default = a.sendCommand$default(this, 1, 2, 0L, 4, (Object) null);
        if (bArrSendCommand$default != null && bArrSendCommand$default.length != 0) {
            return Integer.valueOf(ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255);
        }
        t5t.d(TAG, "queryVersion response null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public final Object responseImageRequest(@NotNull StickyNotificationResponse stickyNotificationResponse, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        f fVar;
        byte[] bArrPlus;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i = fVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.x = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objSendDataWithResult$default = fVar2.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fVar2.x;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            String messageId = stickyNotificationResponse.getMessageId();
            Charset charset = Charsets.UTF_8;
            byte[] bytes = messageId.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bytes, (byte) 0);
            byte[] bytes2 = stickyNotificationResponse.getImageUrl().getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{6}, bArrPlus2), ArraysKt___ArraysJvmKt.plus(bytes2, (byte) 0)), stickyNotificationResponse.getErrorCode().getT());
            fVar2.t = function1;
            fVar2.u = bArrPlus;
            fVar2.x = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrPlus, 0, false, fVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArrPlus = (byte[]) fVar2.u;
            function1 = (Function1) fVar2.t;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        if (!zBooleanValue) {
            t5t.d(TAG, "StickNotificationResponse  fail " + bArrPlus);
        }
        function1.invoke2(Boxing.boxBoolean(zBooleanValue));
        return Unit.INSTANCE;
    }

    public final void setStickyNotificationImageListener(@Nullable xt xtVar) {
        this.stickyNotificationImageListener = xtVar;
    }
}
