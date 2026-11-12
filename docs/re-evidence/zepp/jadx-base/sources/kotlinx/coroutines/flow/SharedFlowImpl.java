package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001jB\u001f\u0012\u0006\u0010I\u001a\u00020\u0016\u0012\u0006\u0010K\u001a\u00020\u0016\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bh\u0010iJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\f2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u0010\nJ\u001b\u00106\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u0010\u001cJ\u000f\u00107\u001a\u00020\u000eH\u0000¢\u0006\u0004\b7\u00108J%\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u00109\u001a\u00020\u000eH\u0000¢\u0006\u0004\b:\u0010;J\b\u0010<\u001a\u00020\u0003H\u0014J\u001f\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010=\u001a\u00020\u0016H\u0014¢\u0006\u0004\b>\u0010?J\b\u0010@\u001a\u00020\fH\u0016J&\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000F2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u00162\u0006\u0010E\u001a\u00020DH\u0016R\u0016\u0010I\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010:R\u0016\u0010K\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010:R\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00107R\u0016\u0010T\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u00107R\u0016\u0010V\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010:R\u0016\u0010X\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010:R\u0016\u0010Z\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u00108R\u0016\u0010]\u001a\u00020\u00168B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020\u00168B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u0016\u0010a\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u00108R\u0016\u0010c\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u00108R\u001c\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006k"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "value", "", LogUtil.D, "(Ljava/lang/Object;)Z", "E", "", SOAP.XMLNS, "", "newHead", com.google.android.exoplayer2.text.ttml.b.r, "", "item", "u", "", "curBuffer", "", "curSize", "newSize", "C", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "t", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "emitter", GoogleApiAvailabilityLight.b, "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "H", "o", "slot", "G", "F", "index", "y", "m", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", "v", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEmit", "emit", "J", "()J", "oldIndex", LogUtil.I, "(J)[Lkotlin/coroutines/Continuation;", DTransferConstants.SEARCH_KEY, "size", "r", "(I)[Lkotlinx/coroutines/flow/i;", "resetReplayCache", "Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuse", "e", "replay", "f", "bufferCapacity", "g", "Lkotlinx/coroutines/channels/BufferOverflow;", "h", "[Ljava/lang/Object;", "buffer", "i", "replayIndex", z.j, "minCollectorIndex", hl.k, "bufferSize", "l", "queueSize", "x", com.google.android.exoplayer2.text.ttml.b.o, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()I", "replaySize", "B", "totalSize", "w", "bufferEndIndex", "z", "queueEndIndex", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
final class SharedFlowImpl<T> extends AbstractSharedFlow<i> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int replay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int bufferCapacity;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Object[] buffer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long replayIndex;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long minCollectorIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int bufferSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int queueSize;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"kotlinx/coroutines/flow/SharedFlowImpl$a", "Lkotlinx/coroutines/DisposableHandle;", "", "dispose", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "a", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "flow", "", "b", "J", "index", "", "c", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/Continuation;", GoogleApiAvailabilityLight.a, "Lkotlin/coroutines/Continuation;", "cont", "<init>", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class a implements DisposableHandle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final SharedFlowImpl<?> flow;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        public long index;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Continuation<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull SharedFlowImpl<?> sharedFlowImpl, long j, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.n(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {341, 348, 351}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public final /* synthetic */ SharedFlowImpl<T> f;
        public int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SharedFlowImpl<T> sharedFlowImpl, Continuation<? super b> continuation) {
            super(continuation);
            this.f = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return this.f.collect(null, this);
        }
    }

    public SharedFlowImpl(int i, int i2, @NotNull BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    private final int A() {
        return (int) ((x() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] C(Object[] curBuffer, int curSize, int newSize) {
        int i = 0;
        if (!(newSize > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer == null) {
            return objArr;
        }
        long jX = x();
        if (curSize > 0) {
            while (true) {
                int i2 = i + 1;
                long j = ((long) i) + jX;
                SharedFlowKt.b(objArr, j, SharedFlowKt.a(curBuffer, j));
                if (i2 >= curSize) {
                    break;
                }
                i = i2;
            }
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D(T value) {
        if (getNCollectors() == 0) {
            return E(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        u(value);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.bufferCapacity) {
            s();
        }
        if (A() > this.replay) {
            H(this.replayIndex + 1, this.minCollectorIndex, w(), z());
        }
        return true;
    }

    private final boolean E(T value) {
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getNCollectors() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.replay == 0) {
            return true;
        }
        u(value);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            s();
        }
        this.minCollectorIndex = x() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long F(i slot) {
        long j = slot.index;
        if (j < w()) {
            return j;
        }
        if (this.bufferCapacity <= 0 && j <= x() && this.queueSize != 0) {
            return j;
        }
        return -1L;
    }

    private final Object G(i slot) {
        Object obj;
        Continuation<Unit>[] continuationArrI = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            long jF = F(slot);
            if (jF < 0) {
                obj = SharedFlowKt.NO_VALUE;
            } else {
                long j = slot.index;
                Object objY = y(jF);
                slot.index = jF + 1;
                continuationArrI = I(j);
                obj = objY;
            }
        }
        int i = 0;
        int length = continuationArrI.length;
        while (i < length) {
            Continuation<Unit> continuation = continuationArrI[i];
            i++;
            if (continuation != null) {
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m3845constructorimpl(unit));
            }
        }
        return obj;
    }

    private final void H(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(jMin >= x())) {
                throw new AssertionError();
            }
        }
        long jX = x();
        if (jX < jMin) {
            while (true) {
                long j = 1 + jX;
                SharedFlowKt.b(this.buffer, jX, null);
                if (j >= jMin) {
                    break;
                } else {
                    jX = j;
                }
            }
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.bufferSize >= 0)) {
                throw new AssertionError();
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.queueSize >= 0)) {
                throw new AssertionError();
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.replayIndex <= x() + ((long) this.bufferSize))) {
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(i iVar, Continuation<? super Unit> continuation) {
        Unit unit;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            if (F(iVar) < 0) {
                iVar.cont = cancellableContinuationImpl;
                iVar.cont = cancellableContinuationImpl;
            } else {
                Unit unit2 = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m3845constructorimpl(unit2));
            }
            unit = Unit.INSTANCE;
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? result : unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(a emitter) {
        synchronized (this) {
            if (emitter.index < x()) {
                return;
            }
            Object[] objArr = this.buffer;
            if (SharedFlowKt.a(objArr, emitter.index) != emitter) {
                return;
            }
            SharedFlowKt.b(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            o();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void o() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            while (this.queueSize > 0 && SharedFlowKt.a(objArr, (x() + ((long) B())) - 1) == SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                SharedFlowKt.b(objArr, x() + ((long) B()), null);
            }
        }
    }

    private final void p(long newHead) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    i iVar = (i) abstractSharedFlowSlot;
                    long j = iVar.index;
                    if (j >= 0 && j < newHead) {
                        iVar.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    private final void s() {
        SharedFlowKt.b(this.buffer, x(), null);
        this.bufferSize--;
        long jX = x() + 1;
        if (this.replayIndex < jX) {
            this.replayIndex = jX;
        }
        if (this.minCollectorIndex < jX) {
            p(jX);
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(x() == jX)) {
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(T t, Continuation<? super Unit> continuation) {
        Continuation<Unit>[] continuationArrV;
        a aVar;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Continuation<Unit>[] continuationArrV2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (D(t)) {
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m3845constructorimpl(unit));
                continuationArrV = v(continuationArrV2);
                aVar = null;
            } else {
                a aVar2 = new a(this, ((long) B()) + x(), t, cancellableContinuationImpl);
                u(aVar2);
                this.queueSize++;
                if (this.bufferCapacity == 0) {
                    continuationArrV2 = v(continuationArrV2);
                }
                continuationArrV = continuationArrV2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, aVar);
        }
        int i = 0;
        int length = continuationArrV.length;
        while (i < length) {
            Continuation<Unit> continuation2 = continuationArrV[i];
            i++;
            if (continuation2 != null) {
                Unit unit2 = Unit.INSTANCE;
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m3845constructorimpl(unit2));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Object item) {
        int iB = B();
        Object[] objArrC = this.buffer;
        if (objArrC == null) {
            objArrC = C(null, 0, 2);
        } else if (iB >= objArrC.length) {
            objArrC = C(objArrC, iB, objArrC.length * 2);
        }
        SharedFlowKt.b(objArrC, x() + ((long) iB), item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final Continuation<Unit>[] v(Continuation<Unit>[] resumesIn) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        i iVar;
        Continuation<? super Unit> continuation;
        int length = resumesIn.length;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot == null || (continuation = (iVar = (i) abstractSharedFlowSlot).cont) == null || F(iVar) < 0) {
                    resumesIn = resumesIn;
                } else {
                    if (length >= resumesIn.length) {
                        resumesIn = resumesIn;
                        resumesIn = resumesIn;
                        resumesIn = Arrays.copyOf((Object[]) resumesIn, Math.max(2, resumesIn.length * 2));
                    }
                    resumesIn = resumesIn;
                    resumesIn = resumesIn;
                    ((Continuation[]) resumesIn)[length] = continuation;
                    iVar.cont = null;
                    length++;
                }
                i++;
                resumesIn = resumesIn;
            }
            resumesIn = resumesIn;
        }
        return (Continuation[]) resumesIn;
    }

    private final long w() {
        return x() + ((long) this.bufferSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long x() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final Object y(long index) {
        Object objA = SharedFlowKt.a(this.buffer, index);
        return objA instanceof a ? ((a) objA).value : objA;
    }

    private final long z() {
        return x() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00dc A[LOOP:1: B:60:0x00ab->B:69:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3 A[PHI: r12
      0x00e3: PHI (r12v1 kotlin.coroutines.Continuation<kotlin.Unit>[]) = (r12v0 kotlin.coroutines.Continuation<kotlin.Unit>[]), (r12v4 kotlin.coroutines.Continuation<kotlin.Unit>[]) binds: [B:56:0x009e, B:58:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x00da A[SYNTHETIC] */
    @NotNull
    public final Continuation<Unit>[] I(long oldIndex) {
        long j;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(oldIndex >= this.minCollectorIndex)) {
                throw new AssertionError();
            }
        }
        if (oldIndex > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long jX = x();
        long j2 = ((long) this.bufferSize) + jX;
        long j3 = 1;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j2++;
        }
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    long j4 = ((i) abstractSharedFlowSlot).index;
                    if (j4 >= 0 && j4 < j2) {
                        j2 = j4;
                    }
                }
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(j2 >= this.minCollectorIndex)) {
                throw new AssertionError();
            }
        }
        if (j2 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long jW = w();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (jW - j2))) : this.queueSize;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j5 = ((long) this.queueSize) + jW;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.buffer;
            if (jW < j5) {
                long j6 = jW;
                int i = 0;
                while (true) {
                    long j7 = jW + j3;
                    Object objA = SharedFlowKt.a(objArr, jW);
                    Symbol symbol = SharedFlowKt.NO_VALUE;
                    j = j2;
                    if (objA != symbol) {
                        Objects.requireNonNull(objA, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) objA;
                        int i2 = i + 1;
                        continuationArr[i] = aVar.cont;
                        SharedFlowKt.b(objArr, jW, symbol);
                        SharedFlowKt.b(objArr, j6, aVar.value);
                        jW = j6 + 1;
                        if (i2 >= iMin) {
                            break;
                        }
                        i = i2;
                        j6 = jW;
                        if (j7 >= j5) {
                            jW = j6;
                            break;
                        }
                        jW = j7;
                        j2 = j;
                        j3 = 1;
                    } else {
                        if (j7 >= j5) {
                            jW = j6;
                            break;
                        }
                        jW = j7;
                        j2 = j;
                        j3 = 1;
                    }
                }
            } else {
                j = j2;
            }
        } else {
            j = j2;
        }
        int i3 = (int) (jW - jX);
        long j8 = getNCollectors() == 0 ? jW : j;
        long jMax = Math.max(this.replayIndex, jW - ((long) Math.min(this.replay, i3)));
        if (this.bufferCapacity == 0 && jMax < j5 && Intrinsics.areEqual(SharedFlowKt.a(this.buffer, jMax), SharedFlowKt.NO_VALUE)) {
            jW++;
            jMax++;
        }
        H(jMax, j8, jW, j5);
        o();
        return true ^ (continuationArr.length == 0) ? v(continuationArr) : continuationArr;
    }

    public final long J() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:14:0x003b, B:35:0x00a0, B:40:0x00ae, B:39:0x00ab, B:43:0x00bf, B:19:0x0059, B:22:0x006b, B:33:0x0092), top: B:52:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #1 {all -> 0x006f, blocks: (B:14:0x003b, B:35:0x00a0, B:40:0x00ae, B:39:0x00ab, B:43:0x00bf, B:19:0x0059, B:22:0x006b, B:33:0x0092), top: B:52:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlinx.coroutines.flow.i] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlinx.coroutines.flow.i] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.flow.internal.AbstractSharedFlow] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlinx.coroutines.flow.SharedFlowImpl] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bc -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:42:0x00be
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        Object objT;
        return (!tryEmit(t) && (objT = t(t, continuation)) == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) ? objT : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    @NotNull
    public Flow<T> fuse(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    @NotNull
    public List<T> getReplayCache() {
        synchronized (this) {
            int iA = A();
            if (iA == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(iA);
            Object[] objArr = this.buffer;
            int i = 0;
            if (iA > 0) {
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(SharedFlowKt.a(objArr, this.replayIndex + ((long) i)));
                    if (i2 >= iA) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public i createSlot() {
        return new i();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public i[] createSlotArray(int size) {
        return new i[size];
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            H(w(), this.minCollectorIndex, w(), z());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArrV = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            i = 0;
            if (D(value)) {
                continuationArrV = v(continuationArrV);
                z = true;
            } else {
                z = false;
            }
        }
        int length = continuationArrV.length;
        while (i < length) {
            Continuation<Unit> continuation = continuationArrV[i];
            i++;
            if (continuation != null) {
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m3845constructorimpl(unit));
            }
        }
        return z;
    }
}
