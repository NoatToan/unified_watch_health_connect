package defpackage;

import android.os.ConditionVariable;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetailParserFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B'\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u001d"}, d2 = {"Lyb;", "Lf1;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;)Ljava/util/Calendar;", "", "isLoop", "Z", Constant.KeyValue.KEY_COLUMN, "()Z", "setLoop", "(Z)V", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "summary", "Lqd;", "source", "", "version", "<init>", "(Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;Lqd;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class yb extends f1<SportDetail> {

    @NotNull
    public static final a l = new a(null);

    @NotNull
    public final SportSummary h;

    @NotNull
    public final qd i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final bi<SportDetail> f40004k;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lyb$a;", "", "", "PARSE_TIMEOUT", "J", "SEND_TIMEOUT", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0007\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0007\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0007\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b\u0007\u0010(R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"yb$b", "Le1;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "Lkotlinx/coroutines/CoroutineScope;", "Lf4s;", "header", "", PluginDeviceInfo.FMODEL, "(Lf4s;)V", "", "data", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", PluginDeviceInfo.FICONOFFLINE, "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "Lmb;", "errorCode", "(Lmb;)V", "j", "()V", "detail", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", PluginDeviceInfo.FLOCALIZATIONS, "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportDetailDataParser;", "sportDetailDataParser", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportDetailDataParser;", "h", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportDetailDataParser;", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportDetailDataParser;)V", "Lkotlinx/coroutines/channels/Channel;", "channel", "Lkotlinx/coroutines/channels/Channel;", PluginDeviceInfo.FBLUETOOTHPAIR, "()Lkotlinx/coroutines/channels/Channel;", "", "isFinished", "Z", "i", "()Z", "setFinished", "(Z)V", "parseFinished", "getParseFinished", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends e1<SportDetail> implements CoroutineScope {
        public boolean A;

        @Nullable
        public SportDetail w;

        @Nullable
        public ISportDetailDataParser x;
        public boolean z;

        @NotNull
        public final Channel<byte[]> y = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

        @NotNull
        public final ConditionVariable B = new ConditionVariable();

        @NotNull
        public final CompletableJob C = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspGpsDetailParam$dataReceiver$1$onFinish$1", f = "GdspGpsDetailParam.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
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
                return b.this.new a(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.t = 1;
                    if (b.this.f().send(new byte[0], this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: yb$b$b, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Result;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspGpsDetailParam$dataReceiver$1$receiveData$2", f = "GdspGpsDetailParam.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
        public static final class C1155b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
            public int t;
            public final /* synthetic */ byte[] v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1155b(byte[] bArr, Continuation<? super C1155b> continuation) {
                super(2, continuation);
                this.v = bArr;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Result<Unit>> continuation) {
                return ((C1155b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return b.this.new C1155b(this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM886constructorimpl;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        b bVar = b.this;
                        byte[] bArr = this.v;
                        Result.Companion companion = Result.Companion;
                        Channel<byte[]> channelF = bVar.f();
                        this.t = 1;
                        if (channelF.send(bArr, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                if (thM889exceptionOrNullimpl != null) {
                    t5t.d("GdspGpsDetailParam", "Send on channel failed:" + thM889exceptionOrNullimpl);
                }
                return Result.m885boximpl(objM886constructorimpl);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspGpsDetailParam$dataReceiver$1$startReceiveData$1", f = "GdspGpsDetailParam.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object t;
            public int u;
            public final /* synthetic */ yb w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(yb ybVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.w = ybVar;
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
                return b.this.new c(this.w, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0038 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x0039, B:19:0x0041, B:23:0x004d, B:25:0x0050, B:27:0x0070, B:30:0x009f, B:29:0x0078, B:31:0x00bb, B:14:0x002e, B:33:0x00c3, B:13:0x0023), top: B:45:0x0009 }] */
            /* JADX WARN: Code duplicated, block: B:21:0x004a  */
            /* JADX WARN: Code duplicated, block: B:22:0x004c  */
            /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x0039, B:19:0x0041, B:23:0x004d, B:25:0x0050, B:27:0x0070, B:30:0x009f, B:29:0x0078, B:31:0x00bb, B:14:0x002e, B:33:0x00c3, B:13:0x0023), top: B:45:0x0009 }] */
            /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x0039, B:19:0x0041, B:23:0x004d, B:25:0x0050, B:27:0x0070, B:30:0x009f, B:29:0x0078, B:31:0x00bb, B:14:0x002e, B:33:0x00c3, B:13:0x0023), top: B:45:0x0009 }] */
            /* JADX WARN: Code duplicated, block: B:29:0x0078 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x0039, B:19:0x0041, B:23:0x004d, B:25:0x0050, B:27:0x0070, B:30:0x009f, B:29:0x0078, B:31:0x00bb, B:14:0x002e, B:33:0x00c3, B:13:0x0023), top: B:45:0x0009 }] */
            /* JADX WARN: Code duplicated, block: B:33:0x00c3 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x0039, B:19:0x0041, B:23:0x004d, B:25:0x0050, B:27:0x0070, B:30:0x009f, B:29:0x0078, B:31:0x00bb, B:14:0x002e, B:33:0x00c3, B:13:0x0023), top: B:45:0x0009 }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0036 -> B:17:0x0039). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x0041
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 275
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yb.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b() {
            this.x = SportDetailParserFactory.INSTANCE.create(yb.this.h, HMDeviceFeature.TIMEX_DEVICE.contains(yb.this.i));
        }

        @Override // defpackage.bi
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SportDetail b() {
            if (!this.A) {
                t5t.d("GdspGpsDetailParam", "数据还没有解析完，等待60000ms");
                if (!this.B.block(60000L)) {
                    t5t.d("GdspGpsDetailParam", "等待了60000ms数据还没有解析完");
                }
            }
            return this.w;
        }

        @NotNull
        public final Channel<byte[]> f() {
            return this.y;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final SportDetail getW() {
            return this.w;
        }

        @Override // kotlinx.coroutines.CoroutineScope
        @NotNull
        public CoroutineContext getCoroutineContext() {
            return this.C.plus(Dispatchers.getIO());
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ISportDetailDataParser getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getZ() {
            return this.z;
        }

        public final void j() {
            BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new c(yb.this, null), 2, null);
        }

        public final void a(@Nullable SportDetail sportDetail) {
            this.w = sportDetail;
        }

        public final void a(@Nullable ISportDetailDataParser iSportDetailDataParser) {
            this.x = iSportDetailDataParser;
        }

        public final void a(boolean z) {
            this.A = z;
        }

        @Override // defpackage.e1, defpackage.bi
        public void a(@Nullable f4s header) {
            super.a(header);
            j();
        }

        @Override // defpackage.e1, defpackage.bi
        @Nullable
        public Object a(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
            if (!this.y.isClosedForSend()) {
                Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(100L, new C1155b(bArr, null), continuation);
                return objWithTimeoutOrNull == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithTimeoutOrNull : Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        @Override // defpackage.e1, defpackage.bi
        public void a(@NotNull mb errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            super.a(errorCode);
            this.z = true;
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(@NotNull Calendar startTime, @NotNull SportSummary summary, @NotNull qd source, int i) {
        super(startTime, 6, i);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(source, "source");
        this.h = summary;
        this.i = source;
        this.f40004k = new b();
    }

    @Override // defpackage.f1
    @Nullable
    public Calendar a(@Nullable f4s header, @Nullable SportDetail data) {
        return null;
    }

    @Override // defpackage.f1
    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getJ() {
        return this.j;
    }

    @Override // defpackage.f1
    @NotNull
    public bi<SportDetail> a() {
        return this.f40004k;
    }
}
