package defpackage;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001f7B\u001f\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\bL\u0010MJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001b\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\rJ\b\u0010\t\u001a\u00020\u000eH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J,\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0011H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0017J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J8\u0010\t\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\nH&J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH&J0\u0010\t\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\nJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H&J\b\u0010\u001f\u001a\u00020\u0005H&J\b\u0010#\u001a\u00020\u0005H&R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R#\u00104\u001a\n 0*\u0004\u0018\u00010/0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u00103R\u001a\u00105\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\"\u0010B\u001a\u00020A8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Ld1;", "Lr3;", "Lkotlinx/coroutines/CoroutineScope;", "", "i", "", "packetCount", "freq", "", PluginDeviceInfo.FMODEL, "", "byteArray", PluginDeviceInfo.FDESC, "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "moduleId", "isOneTime", "Lkotlin/Function1;", "Lm4;", "callback", "Ll4;", "request", "(Ll4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionId", "", "Lz3;", "flag", "packetIndex", "totalSize", RnReportConst.ApiReport.PARAM_MODULE, "data", PluginDeviceInfo.FICONON, Constants.EXTRA_SESSION_ID, "code", "index", "j", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FLOCALIZATIONS, "()Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/sync/Mutex;", "mutex$delegate", "h", "()Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", "buf$delegate", PluginDeviceInfo.FICONOFFLINE, "()Lio/netty/buffer/ByteBuf;", "buf", q.f13858b, "I", PluginDeviceInfo.FICONOFF, "()I", "Lo4;", "getVersion", "()Lo4;", "version", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lx3;", "buffer", "Lx3;", PluginDeviceInfo.FBLUETOOTHPAIR, "()Lx3;", "setBuffer", "(Lx3;)V", "Lq3;", "channel", "Lw3;", "channelCallbackHolder", "<init>", "(Lq3;Lw3;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class d1 implements r3, CoroutineScope {

    @NotNull
    public static final d C = new d(null);

    @NotNull
    public final Lazy A;

    @NotNull
    public x3 B;

    @NotNull
    public q3 t;

    @NotNull
    public final w3 u;
    public final int v;

    @NotNull
    public final Lazy w;

    @NotNull
    public final Lazy x;

    @NotNull
    public final Channel<ChannelPacketResponse> y;

    @NotNull
    public final Channel<byte[]> z;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$1", f = "BaseChannelApiImpl.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object t;
        public int u;

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
            return d1.this.new a(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x003e  */
        /* JADX WARN: Code duplicated, block: B:21:0x00b3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x003e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$2", f = "BaseChannelApiImpl.kt", i = {0, 1}, l = {74, 80}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object t;
        public int u;
        public /* synthetic */ Object v;

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14941a;

            static {
                int[] iArr = new int[j4.values().length];
                try {
                    iArr[j4.VERSION_QUIEY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j4.DATA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14941a = iArr;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = d1.this.new b(continuation);
            bVar.v = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0051 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x0052  */
        /* JADX WARN: Code duplicated, block: B:21:0x005d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0092 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:25:0x0094 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0018, B:30:0x00aa, B:22:0x0065, B:25:0x0094, B:26:0x009a, B:29:0x00a7), top: B:39:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x009a A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0018, B:30:0x00aa, B:22:0x0065, B:25:0x0094, B:26:0x009a, B:29:0x00a7), top: B:39:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x00a6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0018, B:30:0x00aa, B:22:0x0065, B:25:0x0094, B:26:0x009a, B:29:0x00a7), top: B:39:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0094 -> B:30:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a4 -> B:30:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a7 -> B:30:0x00aa). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: d1$c, reason: from toString */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Ld1$c;", "", "", "toString", "", "hashCode", "other", "", "equals", RnReportConst.ApiReport.PARAM_MODULE, "I", PluginDeviceInfo.FMODEL, "()I", Constants.EXTRA_SESSION_ID, PluginDeviceInfo.FICONON, "Lm4;", com.xiaomi.onetrack.api.b.I, "Lm4;", PluginDeviceInfo.FDESC, "()Lm4;", "<init>", "(IILm4;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ChannelPacketResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        public final int module;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
        public final int sessionID;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final ChannelResponse response;

        public ChannelPacketResponse(int i, int i2, @NotNull ChannelResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.module = i;
            this.sessionID = i2;
            this.response = response;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getModule() {
            return this.module;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ChannelResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSessionID() {
            return this.sessionID;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChannelPacketResponse)) {
                return false;
            }
            ChannelPacketResponse channelPacketResponse = (ChannelPacketResponse) other;
            return this.module == channelPacketResponse.module && this.sessionID == channelPacketResponse.sessionID && Intrinsics.areEqual(this.response, channelPacketResponse.response);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.module) * 31) + Integer.hashCode(this.sessionID)) * 31) + this.response.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChannelPacketResponse(module=" + this.module + ", sessionID=" + this.sessionID + ", response=" + this.response + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Ld1$d;", "", "", "FIRST_PACKET_HEADER_SIZE", "I", "INIT_BUF_SIZE", "NEED_REPLY_PACKET_COUNT", "PACKET_INDEX_COUNT", "", "REPLY_TIMEOUT", "J", "SUBSEQUENT_PACKET_HEADER_SIZE", "", "TAG", "Ljava/lang/String;", "VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", PluginDeviceInfo.FMODEL, "()Lio/netty/buffer/ByteBuf;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<ByteBuf> {
        public static final e t = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteBuf invoke() {
            return Unpooled.buffer(1024);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$deliverPacket$1", f = "BaseChannelApiImpl.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;
        public final /* synthetic */ byte[] x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, int i2, byte[] bArr, Continuation<? super f> continuation) {
            super(2, continuation);
            this.v = i;
            this.w = i2;
            this.x = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return d1.this.new f(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = d1.this.y;
                ChannelPacketResponse channelPacketResponse = new ChannelPacketResponse(this.v, this.w, new ChannelResponse(0, null, this.x, 2, null));
                this.t = 1;
                if (channel.send(channelPacketResponse, this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$handleDatePacket$2", f = "BaseChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return d1.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            d1.this.u.a(d1.this.getB().getF38626a(), new ChannelResponse(4, "append data failed", null, 4, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function0<CompletableJob> {
        public static final h t = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/sync/Mutex;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/sync/Mutex;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements Function0<Mutex> {
        public static final i t = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Mutex invoke() {
            return MutexKt.Mutex$default(false, 1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$onChannelPacket$1", f = "BaseChannelApiImpl.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ byte[] v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(byte[] bArr, Continuation<? super j> continuation) {
            super(2, continuation);
            this.v = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return d1.this.new j(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = d1.this.z;
                byte[] bArr = this.v;
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class k extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public k(Object obj) {
            super(1, obj, d1.class, "onChannelPacket", "onChannelPacket([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) throws InterruptedException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((d1) this.receiver).b(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) throws InterruptedException {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$sendData$1", f = "BaseChannelApiImpl.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ l4 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(l4 l4Var, Continuation<? super l> continuation) {
            super(2, continuation);
            this.v = l4Var;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return d1.this.new l(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                d1 d1Var = d1.this;
                l4 l4Var = this.v;
                this.t = 1;
                if (d1Var.a(l4Var, this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$transport$2", f = "BaseChannelApiImpl.kt", i = {0, 1, 1, 1, 1}, l = {358, 136}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "packet", "sessionId", "result"}, s = {"L$0", "L$0", "L$4", "I$0", "I$1"})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int A;
        public final /* synthetic */ l4 C;
        public Object t;
        public Object u;
        public Object v;
        public Object w;
        public Object x;
        public int y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l4 l4Var, Continuation<? super m> continuation) {
            super(2, continuation);
            this.C = l4Var;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return d1.this.new m(this.C, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0088 A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:29:0x00e1, B:31:0x00e9, B:51:0x0157, B:55:0x016e, B:34:0x00f3, B:24:0x0082, B:26:0x0088, B:37:0x00fa, B:39:0x0100, B:40:0x0106, B:42:0x0124, B:43:0x012a, B:45:0x0130, B:47:0x014a, B:23:0x0072), top: B:68:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x00e0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00f3 A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:29:0x00e1, B:31:0x00e9, B:51:0x0157, B:55:0x016e, B:34:0x00f3, B:24:0x0082, B:26:0x0088, B:37:0x00fa, B:39:0x0100, B:40:0x0106, B:42:0x0124, B:43:0x012a, B:45:0x0130, B:47:0x014a, B:23:0x0072), top: B:68:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:37:0x00fa A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:29:0x00e1, B:31:0x00e9, B:51:0x0157, B:55:0x016e, B:34:0x00f3, B:24:0x0082, B:26:0x0088, B:37:0x00fa, B:39:0x0100, B:40:0x0106, B:42:0x0124, B:43:0x012a, B:45:0x0130, B:47:0x014a, B:23:0x0072), top: B:68:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x0100 A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:29:0x00e1, B:31:0x00e9, B:51:0x0157, B:55:0x016e, B:34:0x00f3, B:24:0x0082, B:26:0x0088, B:37:0x00fa, B:39:0x0100, B:40:0x0106, B:42:0x0124, B:43:0x012a, B:45:0x0130, B:47:0x014a, B:23:0x0072), top: B:68:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0106 A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:29:0x00e1, B:31:0x00e9, B:51:0x0157, B:55:0x016e, B:34:0x00f3, B:24:0x0082, B:26:0x0088, B:37:0x00fa, B:39:0x0100, B:40:0x0106, B:42:0x0124, B:43:0x012a, B:45:0x0130, B:47:0x014a, B:23:0x0072), top: B:68:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0124 A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:29:0x00e1, B:31:0x00e9, B:51:0x0157, B:55:0x016e, B:34:0x00f3, B:24:0x0082, B:26:0x0088, B:37:0x00fa, B:39:0x0100, B:40:0x0106, B:42:0x0124, B:43:0x012a, B:45:0x0130, B:47:0x014a, B:23:0x0072), top: B:68:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x012a A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:29:0x00e1, B:31:0x00e9, B:51:0x0157, B:55:0x016e, B:34:0x00f3, B:24:0x0082, B:26:0x0088, B:37:0x00fa, B:39:0x0100, B:40:0x0106, B:42:0x0124, B:43:0x012a, B:45:0x0130, B:47:0x014a, B:23:0x0072), top: B:68:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0130 A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:29:0x00e1, B:31:0x00e9, B:51:0x0157, B:55:0x016e, B:34:0x00f3, B:24:0x0082, B:26:0x0088, B:37:0x00fa, B:39:0x0100, B:40:0x0106, B:42:0x0124, B:43:0x012a, B:45:0x0130, B:47:0x014a, B:23:0x0072), top: B:68:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x014a A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:29:0x00e1, B:31:0x00e9, B:51:0x0157, B:55:0x016e, B:34:0x00f3, B:24:0x0082, B:26:0x0088, B:37:0x00fa, B:39:0x0100, B:40:0x0106, B:42:0x0124, B:43:0x012a, B:45:0x0130, B:47:0x014a, B:23:0x0072), top: B:68:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0150  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00de -> B:29:0x00e1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 423
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d1(@NotNull q3 channel, @NotNull w3 channelCallbackHolder, int i2) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(channelCallbackHolder, "channelCallbackHolder");
        this.t = channel;
        this.u = channelCallbackHolder;
        this.v = i2;
        this.w = LazyKt__LazyJVMKt.lazy(h.t);
        this.x = LazyKt__LazyJVMKt.lazy(i.t);
        this.y = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.z = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.A = LazyKt__LazyJVMKt.lazy(e.t);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
        i();
        ByteBuf buf = e();
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        this.B = new x3(-1, -1, -1, buf);
    }

    @Override // defpackage.r3
    @Nullable
    public Object a(@NotNull l4 l4Var, @NotNull Continuation<? super Boolean> continuation) {
        return a(this, l4Var, continuation);
    }

    @NotNull
    public abstract z3 a(int flag, int sessionId, int packetIndex, int totalSize, int module, @NotNull byte[] data);

    @NotNull
    public abstract byte[] a(int module, int sessionID, int code, int index);

    public abstract int c();

    @NotNull
    public abstract z3 c(@NotNull byte[] byteArray);

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final x3 getB() {
        return this.B;
    }

    public final Job g() {
        return (Job) this.w.getValue();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return g().plus(Dispatchers.getIO());
    }

    @Override // defpackage.r3
    @NotNull
    /* JADX INFO: renamed from: getVersion */
    public ChannelVersion getE() {
        return this.t.c();
    }

    public final Mutex h() {
        return (Mutex) this.x.getValue();
    }

    public final void i() {
        this.t.a(new k(this));
    }

    public abstract int j();

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getV() {
        return this.v;
    }

    public final ByteBuf e() {
        return (ByteBuf) this.A.getValue();
    }

    @Override // defpackage.r3
    public void b() {
        t5t.d("ChannelApi", "Cancel channel coroutine");
        CoroutineScopeKt.cancel$default(this, null, 1, null);
    }

    @Override // defpackage.r3
    @NotNull
    public String a() {
        return this.t.a();
    }

    public final void b(byte[] byteArray) throws InterruptedException {
        if (byteArray.length == 0) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new j(byteArray, null), 1, null);
    }

    @Override // defpackage.r3
    public void a(int moduleId, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.u.a(moduleId, isOneTime, callback);
    }

    @Override // defpackage.r3
    public void a(int moduleId) {
        this.u.c(moduleId);
    }

    @Override // defpackage.r3
    @Deprecated(message = "Not recommend", replaceWith = @ReplaceWith(expression = "transport()", imports = {}))
    public void a(@NotNull l4 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new l(request, null), 3, null);
    }

    public static /* synthetic */ Object a(d1 d1Var, l4 l4Var, Continuation<? super Boolean> continuation) {
        if (!JobKt.isActive(d1Var.getU())) {
            t5t.d("ChannelApi", "Error:协程已经被取消了，不能再执行发送数据任务了，请检查是不是使用的已销毁设备的API");
            return Boxing.boxBoolean(false);
        }
        return BuildersKt.withContext(d1Var.getU(), d1Var.new m(l4Var, null), continuation);
    }

    @NotNull
    public List<z3> a(int sessionId, @NotNull l4 request) {
        int iJ;
        Intrinsics.checkNotNullParameter(request, "request");
        sft mtu = this.t.getC().getMtu();
        int module = request.getModule();
        int length = request.getData().length;
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < request.getData().length) {
            if (z) {
                iJ = c();
            } else {
                iJ = j();
            }
            int i5 = request.getEncrypt() ? 8 : 0;
            int iD = i2 + ((mtu.d() - iJ) + i2 < length ? mtu.d() - iJ : length - i2);
            byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(request.getData(), new IntRange(i2, iD - 1));
            if (iD >= request.getData().length) {
                i5 = i5 | 2 | ((request.getH() ? 4 : 0) & 4);
            }
            if (z) {
                i5 |= 1;
            }
            int i6 = i3 + 1;
            arrayList.add(a(a(i6, request.getReplyFreq()) ? i5 | 4 : i5, sessionId, i4, request.getDataSize(), module, bArrSliceArray));
            i4 = (i4 + 1) % 256;
            i3 = i6;
            i2 = iD;
            z = false;
        }
        return arrayList;
    }

    public final boolean a(int packetCount, int freq) {
        return packetCount % freq == 0;
    }

    public final void a(byte[] byteArray) {
        t5t.d("ChannelApi", "Version query command: " + tet.x(byteArray));
        this.t.a(new byte[]{2, 1});
    }

    public final Object a(byte[] bArr, Continuation<? super Unit> continuation) throws InterruptedException {
        z3 z3VarC = c(bArr);
        if (z3VarC instanceof cb) {
            cb cbVar = (cb) z3VarC;
            if (!this.u.a(cbVar.getI())) {
                this.t.a(a(4, z3VarC.getF40827b(), 5, z3VarC.getC()));
                return Unit.INSTANCE;
            }
            int i2 = cbVar.getI();
            int f40827b = z3VarC.getF40827b();
            int h2 = ((cb) z3VarC).getH();
            ByteBuf buf = e();
            Intrinsics.checkNotNullExpressionValue(buf, "buf");
            this.B = new x3(i2, f40827b, h2, buf);
        }
        int iA = this.B.a(z3VarC);
        if (iA != 1) {
            BuildersKt__BuildersKt.runBlocking$default(null, new g(null), 1, null);
            this.t.a(a(4, z3VarC.getF40827b(), iA, z3VarC.getC()));
            return Unit.INSTANCE;
        }
        if (z3VarC.h()) {
            this.t.a(a(4, z3VarC.getF40827b(), 1, z3VarC.getC()));
        }
        if (this.B.getF()) {
            t5t.d("ChannelApi", "Put packet to channel...");
            a(this.B.getF38627b(), this.B.getG(), this.B.getF38626a(), this.B.a(), this.B.getC());
        }
        return Unit.INSTANCE;
    }

    public void a(int sessionID, int flag, int module, @NotNull byte[] data, int totalSize) throws InterruptedException {
        Intrinsics.checkNotNullParameter(data, "data");
        a(sessionID, module, data);
    }

    public final void a(int sessionID, int module, @NotNull byte[] data) throws InterruptedException {
        Intrinsics.checkNotNullParameter(data, "data");
        BuildersKt__BuildersKt.runBlocking$default(null, new f(module, sessionID, data, null), 1, null);
    }
}
