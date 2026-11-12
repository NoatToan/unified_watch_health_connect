package com.huami.bluetooth.profile.channel.module.open_app;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.c3;
import defpackage.d4;
import defpackage.le;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.wn;
import defpackage.xn;
import defpackage.z2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u0006\u0010\u0016\u001a\u00020\fJ%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/open_app/OpenApplicationModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "Lm4;", com.xiaomi.onetrack.api.b.I, "", "onOpenApp", "Lxn;", "result", "onOpenAppResponse", "onCanOpenApp", "onCanOpenAppResponse", "", q.f13858b, "", "requestParameter", "", "openAppByteArray", "canOpenAppByteArray", "sendVersionInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "queryVersion", "openApp", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canOpenApp", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwn;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 68)
public final class OpenApplicationModule extends a implements CoroutineScope {
    public static final int CMD_CAN_OPEN_APP_REQUEST = 5;
    public static final int CMD_CAN_OPEN_APP_RESPONSE = 6;
    public static final int CMD_OPEN_APP_REQUEST = 3;
    public static final int CMD_OPEN_APP_RESPONSE = 4;
    public static final int CMD_QUERY_VERSION_CMD = 1;
    public static final int CMD_RETURN_QUERY_VERSION_CMD = 2;
    public static final int ERROR_VALUE = -1;
    public static final int MODULE = 68;

    @NotNull
    private static final String TAG = "OpenAppModule";

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Nullable
    private wn listener;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.open_app.OpenApplicationModule", f = "OpenApplicationModule.kt", i = {0}, l = {218, SportReportBaseParser.ReportType.avgFreq}, m = "canOpenApp", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return OpenApplicationModule.this.canOpenApp(0, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.open_app.OpenApplicationModule$canOpenApp$response$1", f = "OpenApplicationModule.kt", i = {}, l = {SportReportBaseParser.ReportType.maxFreq}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OpenApplicationModule.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) OpenApplicationModule.this.channels.get(Boxing.boxInt(6));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.open_app.OpenApplicationModule$init$1$1", f = "OpenApplicationModule.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ OpenApplicationModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, OpenApplicationModule openApplicationModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = openApplicationModule;
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
                        return Unit.INSTANCE;
                    }
                    t5t.d(OpenApplicationModule.TAG, "data: " + tet.x(this.u.getData()));
                    byte bFirst = ArraysKt___ArraysKt.first(this.u.getData());
                    if (bFirst == 3) {
                        this.v.onOpenApp(this.u);
                        return Unit.INSTANCE;
                    }
                    if (bFirst == 5) {
                        this.v.onCanOpenApp(this.u);
                        return Unit.INSTANCE;
                    }
                    Channel channel = (Channel) this.v.channels.get(Boxing.boxInt(bFirst));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.u;
                        this.t = 1;
                        if (channel.send(channelResponse, this) == coroutine_suspended) {
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

        public d() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            OpenApplicationModule openApplicationModule = OpenApplicationModule.this;
            BuildersKt__Builders_commonKt.launch$default(openApplicationModule, null, null, new a(it, openApplicationModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<CompletableJob> {
        public static final e t = new e();

        public e() {
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.open_app.OpenApplicationModule", f = "OpenApplicationModule.kt", i = {0}, l = {171, 177}, m = "openApp", n = {"this"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return OpenApplicationModule.this.openApp(0, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.open_app.OpenApplicationModule$openApp$response$1", f = "OpenApplicationModule.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OpenApplicationModule.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) OpenApplicationModule.this.channels.get(Boxing.boxInt(4));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.open_app.OpenApplicationModule$queryVersion$1", f = "OpenApplicationModule.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int t;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OpenApplicationModule.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int iA;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OpenApplicationModule openApplicationModule = OpenApplicationModule.this;
                this.t = 1;
                obj = openApplicationModule.sendVersionInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            byte[] bArr = (byte[]) obj;
            if (bArr == null || bArr.length <= 1) {
                iA = -1;
            } else {
                iA = c3.a(bArr, 1, 1);
                le.c(OpenApplicationModule.TAG, "version=" + iA, new Object[0]);
            }
            return Boxing.boxInt(iA);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.open_app.OpenApplicationModule", f = "OpenApplicationModule.kt", i = {0}, l = {SportSummary.VERSION_103, 265}, m = "sendVersionInfo", n = {"this"}, s = {"L$0"})
    public static final class i extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return OpenApplicationModule.this.sendVersionInfo(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.open_app.OpenApplicationModule$sendVersionInfo$response$1", f = "OpenApplicationModule.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OpenApplicationModule.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) OpenApplicationModule.this.channels.get(Boxing.boxInt(2));
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
            return (ChannelResponse) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenApplicationModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(e.t);
        this.channels = new LinkedHashMap();
    }

    private final byte[] canOpenAppByteArray(int appId) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(5);
        byte[] bytes = String.valueOf(appId).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCanOpenApp(ChannelResponse response) {
        Object objM886constructorimpl;
        xn xnVarA;
        try {
            Result.Companion companion = Result.Companion;
            byte[] data = response.getData();
            int length = data.length;
            t5t.d(TAG, "onCanOpenApp: size=" + length);
            if (length > 1) {
                int iA = c3.a(data, 1, 1);
                t5t.d(TAG, "onCanOpenApp: appId=" + iA);
                wn wnVar = this.listener;
                xnVarA = wnVar != null ? wnVar.a(iA) : null;
                t5t.d(TAG, "onCanOpenApp: result" + xnVarA);
                if (xnVarA == null) {
                    xnVarA = xn.D;
                }
            } else {
                xnVarA = xn.y;
            }
            objM886constructorimpl = Result.m886constructorimpl(xnVarA);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d(TAG, "onCanOpenApp: error:" + thM889exceptionOrNullimpl);
            objM886constructorimpl = xn.y;
        }
        onCanOpenAppResponse((xn) objM886constructorimpl);
    }

    private final void onCanOpenAppResponse(xn result) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(result.getT());
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        a.sendWithoutDataResponse$default(this, byteArray, null, 2, null);
        t5t.d(TAG, "onCanOpenAppResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOpenApp(ChannelResponse response) {
        byte[] data = response.getData();
        ByteBuffer buffer = ByteBuffer.wrap(ArraysKt___ArraysJvmKt.copyOfRange(data, 1, data.length));
        Intrinsics.checkNotNullExpressionValue(buffer, "buffer");
        String strQ = z2.q(buffer);
        String strQ2 = z2.q(buffer);
        t5t.d(TAG, "onOpenApp: appId=" + strQ + ";requestParameter=" + strQ2);
        wn wnVar = this.listener;
        xn xnVarA = wnVar != null ? wnVar.a(Integer.parseInt(strQ), strQ2) : null;
        t5t.d(TAG, "onOpenApp: result" + xnVarA);
        if (xnVarA == null) {
            xnVarA = xn.x;
        }
        onOpenAppResponse(xnVarA);
    }

    private final void onOpenAppResponse(xn result) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(4);
        byteArrayOutputStream.write(result.getT());
        byteArrayOutputStream.write(0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        a.sendWithoutDataResponse$default(this, byteArray, null, 2, null);
        t5t.d(TAG, "onOpenAppResponse");
    }

    private final byte[] openAppByteArray(int appId, String requestParameter) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(3);
        String strValueOf = String.valueOf(appId);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strValueOf.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        if (requestParameter == null || requestParameter.length() == 0) {
            byteArrayOutputStream.write(0);
        } else {
            byte[] bytes2 = requestParameter.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object sendVersionInfo(Continuation<? super byte[]> continuation) {
        i iVar;
        OpenApplicationModule openApplicationModule;
        ChannelResponse channelResponse;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.w = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objSendDataWithResult$default = iVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                openApplicationModule = (OpenApplicationModule) iVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "response: " + channelResponse);
            if (channelResponse != null) {
                return channelResponse.getData();
            }
            return null;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
        iVar.t = this;
        iVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{1}, 0, false, iVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        openApplicationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "sendVersionInfo result: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        j jVar = openApplicationModule.new j(null);
        iVar.t = null;
        iVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, jVar, iVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "response: " + channelResponse);
        if (channelResponse != null) {
            return channelResponse.getData();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00a3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00ba, please report this as an issue */
    @Nullable
    public final Object canOpenApp(int i2, @NotNull Continuation<? super xn> continuation) throws IOException {
        b bVar;
        OpenApplicationModule openApplicationModule;
        byte[] data;
        int length;
        xn xnVarA;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.w = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSendDataWithResult$default = bVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = bVar.w;
        if (i4 != 0) {
            if (i4 == 1) {
                openApplicationModule = (OpenApplicationModule) bVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            data = channelResponse != null ? channelResponse.getData() : null;
            if (data != null) {
                length = data.length;
                t5t.d(TAG, "canOpenApp size:" + length);
                if (length > 1) {
                    int iA = c3.a(data, 1, 1);
                    t5t.d(TAG, "canOpenApp errorCode:" + iA);
                    xnVarA = xn.v.a(iA);
                } else {
                    xnVarA = xn.y;
                }
                if (xnVarA != null) {
                    return xnVarA;
                }
            }
            return xn.y;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, null, null, 7, null));
        byte[] bArrCanOpenAppByteArray = canOpenAppByteArray(i2);
        bVar.t = this;
        bVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrCanOpenAppByteArray, 0, false, bVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        openApplicationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "canOpenApp result: " + zBooleanValue);
        if (!zBooleanValue) {
            return xn.x;
        }
        c cVar = openApplicationModule.new c(null);
        bVar.t = null;
        bVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, cVar, bVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse2 != null) {
        }
        if (data != null) {
            length = data.length;
            t5t.d(TAG, "canOpenApp size:" + length);
            if (length > 1) {
                int iA2 = c3.a(data, 1, 1);
                t5t.d(TAG, "canOpenApp errorCode:" + iA2);
                xnVarA = xn.v.a(iA2);
            } else {
                xnVarA = xn.y;
            }
            if (xnVarA != null) {
                return xnVarA;
            }
        }
        return xn.y;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 68;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new d(), 2, null);
        queryVersion();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x0101  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00bd, please report this as an issue */
    @Nullable
    public final Object openApp(int i2, @Nullable String str, @NotNull Continuation<? super xn> continuation) throws IOException {
        f fVar;
        OpenApplicationModule openApplicationModule;
        byte[] data;
        int length;
        xn xnVarA;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i3 = fVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.w = i3 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objSendDataWithResult$default = fVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = fVar2.w;
        if (i4 != 0) {
            if (i4 == 1) {
                openApplicationModule = (OpenApplicationModule) fVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "response: " + channelResponse);
            data = channelResponse != null ? channelResponse.getData() : null;
            if (data != null) {
                length = data.length;
                t5t.d(TAG, "openApp size:" + length);
                if (length > 2) {
                    int iA = c3.a(data, 1, 1);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(ArraysKt___ArraysJvmKt.copyOfRange(data, 2, data.length));
                    Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(it.copyOfRange(2, it.size))");
                    String strQ = z2.q(byteBufferWrap);
                    xnVarA = xn.v.a(iA);
                    xnVarA.a(strQ);
                } else if (length > 1) {
                    xnVarA = xn.v.a(c3.a(data, 1, 1));
                } else {
                    xnVarA = xn.y;
                }
                if (xnVarA != null) {
                    return xnVarA;
                }
            }
            return xn.y;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
        byte[] bArrOpenAppByteArray = openAppByteArray(i2, str);
        fVar2.t = this;
        fVar2.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrOpenAppByteArray, 0, false, fVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        openApplicationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "openApp result: " + zBooleanValue);
        if (!zBooleanValue) {
            return xn.x;
        }
        g gVar = openApplicationModule.new g(null);
        fVar2.t = null;
        fVar2.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, gVar, fVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "response: " + channelResponse2);
        if (channelResponse2 != null) {
        }
        if (data != null) {
            length = data.length;
            t5t.d(TAG, "openApp size:" + length);
            if (length > 2) {
                int iA2 = c3.a(data, 1, 1);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(ArraysKt___ArraysJvmKt.copyOfRange(data, 2, data.length));
                Intrinsics.checkNotNullExpressionValue(byteBufferWrap2, "wrap(it.copyOfRange(2, it.size))");
                String strQ2 = z2.q(byteBufferWrap2);
                xnVarA = xn.v.a(iA2);
                xnVarA.a(strQ2);
            } else if (length > 1) {
                xnVarA = xn.v.a(c3.a(data, 1, 1));
            } else {
                xnVarA = xn.y;
            }
            if (xnVarA != null) {
                return xnVarA;
            }
        }
        return xn.y;
    }

    public final int queryVersion() {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new h(null), 1, null)).intValue();
    }

    public final void setListener(@NotNull wn listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        t5t.d(TAG, "setListener:" + listener);
        this.listener = listener;
    }
}
