package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001f\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0019\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", TtmlNode.TAG_HEAD, "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", "index", "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class zjx<T> extends AbstractSharedFlow<zjz> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f54202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f54203c;
    private final BufferOverflow d;
    private int e;
    private long f;
    private int g;
    private final int i;

    public zjx(int i, int i2, BufferOverflow bufferOverflow) {
        this.i = i;
        this.f54201a = i2;
        this.d = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long g() {
        return Math.min(this.f54203c, this.f);
    }

    private final int j() {
        return (int) ((g() + ((long) this.e)) - this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f() {
        return this.e + this.g;
    }

    private final long i() {
        return g() + ((long) this.e);
    }

    private final long h() {
        return g() + ((long) this.e) + ((long) this.g);
    }

    protected final T b() {
        Object[] objArr = this.f54202b;
        zcp.e(objArr);
        return (T) NO_VALUE.c(objArr, (this.f + ((long) j())) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:17:0x0045, B:35:0x009b, B:37:0x00a3, B:41:0x00b6, B:42:0x00b9), top: B:52:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9 A[EDGE_INSN: B:61:0x00c9->B:44:0x00c9 BREAK  A[LOOP:0: B:35:0x009b->B:62:0x009b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (((defpackage.zkd) r9).e(r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> Object a(zjx<T> zjxVar, FlowCollector<? super T> flowCollector, Continuation<?> continuation) throws Throwable {
        b bVar;
        zjz zjzVarAllocateSlot;
        FlowCollector<? super T> flowCollector2;
        zjz zjzVar;
        zjx<T> zjxVar2;
        Throwable th;
        Job job;
        FlowCollector flowCollector3;
        Object objD;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            if ((bVar.f54206c & Integer.MIN_VALUE) != 0) {
                bVar.f54206c -= Integer.MIN_VALUE;
            } else {
                bVar = new b(zjxVar, continuation);
            }
        } else {
            bVar = new b(zjxVar, continuation);
        }
        Object obj = bVar.j;
        Object objA = zbg.a();
        int i = bVar.f54206c;
        if (i == 0) {
            createFailure.c(obj);
            zjzVarAllocateSlot = zjxVar.allocateSlot();
            try {
                if (flowCollector instanceof zkd) {
                    bVar.f54205b = zjxVar;
                    bVar.e = flowCollector;
                    bVar.d = zjzVarAllocateSlot;
                    bVar.f54206c = 1;
                }
                flowCollector2 = flowCollector;
                zjzVar = zjzVarAllocateSlot;
                zjxVar2 = zjxVar;
                job = (Job) bVar.getContext().get(Job.INSTANCE);
                flowCollector3 = flowCollector2;
                while (true) {
                    objD = zjxVar2.d(zjzVar);
                    if (objD == NO_VALUE.f54210b) {
                        bVar.f54205b = zjxVar2;
                        bVar.e = flowCollector3;
                        bVar.d = zjzVar;
                        bVar.f54204a = job;
                        bVar.f54206c = 2;
                        if (zjxVar2.d(zjzVar, (Continuation<? super yzc>) bVar) == objA) {
                            break;
                            break;
                        }
                    } else {
                        if (job != null) {
                            zhs.c(job);
                        }
                        bVar.f54205b = zjxVar2;
                        bVar.e = flowCollector3;
                        bVar.d = zjzVar;
                        bVar.f54204a = job;
                        bVar.f54206c = 3;
                        if (flowCollector3.emit(objD, bVar) == objA) {
                            break;
                            break;
                        }
                    }
                }
                return objA;
            } catch (Throwable th2) {
                th = th2;
                zjxVar.freeSlot(zjzVarAllocateSlot);
                throw th;
            }
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (Job) bVar.f54204a;
            zjzVar = (zjz) bVar.d;
            FlowCollector flowCollector4 = (FlowCollector) bVar.e;
            zjxVar2 = (zjx) bVar.f54205b;
            try {
                createFailure.c(obj);
                flowCollector3 = flowCollector4;
                while (true) {
                    objD = zjxVar2.d(zjzVar);
                    if (objD == NO_VALUE.f54210b) {
                        bVar.f54205b = zjxVar2;
                        bVar.e = flowCollector3;
                        bVar.d = zjzVar;
                        bVar.f54204a = job;
                        bVar.f54206c = 2;
                        if (zjxVar2.d(zjzVar, (Continuation<? super yzc>) bVar) == objA) {
                            break;
                        }
                    } else {
                        if (job != null) {
                            zhs.c(job);
                        }
                        bVar.f54205b = zjxVar2;
                        bVar.e = flowCollector3;
                        bVar.d = zjzVar;
                        bVar.f54204a = job;
                        bVar.f54206c = 3;
                        if (flowCollector3.emit(objD, bVar) == objA) {
                            break;
                        }
                    }
                }
                return objA;
            } catch (Throwable th3) {
                th = th3;
                zjzVarAllocateSlot = zjzVar;
                th = th;
                zjxVar = zjxVar2;
                zjxVar.freeSlot(zjzVarAllocateSlot);
                throw th;
            }
        }
        zjzVar = (zjz) bVar.d;
        FlowCollector<? super T> flowCollector5 = (FlowCollector) bVar.e;
        zjx<T> zjxVar3 = (zjx) bVar.f54205b;
        try {
            createFailure.c(obj);
            flowCollector2 = flowCollector5;
            zjxVar = zjxVar3;
            try {
                zjxVar2 = zjxVar;
                job = (Job) bVar.getContext().get(Job.INSTANCE);
                flowCollector3 = flowCollector2;
                while (true) {
                    objD = zjxVar2.d(zjzVar);
                    if (objD == NO_VALUE.f54210b) {
                        bVar.f54205b = zjxVar2;
                        bVar.e = flowCollector3;
                        bVar.d = zjzVar;
                        bVar.f54204a = job;
                        bVar.f54206c = 2;
                        if (zjxVar2.d(zjzVar, (Continuation<? super yzc>) bVar) == objA) {
                            break;
                            break;
                        }
                    } else {
                        if (job != null) {
                            zhs.c(job);
                        }
                        bVar.f54205b = zjxVar2;
                        bVar.e = flowCollector3;
                        bVar.d = zjzVar;
                        bVar.f54204a = job;
                        bVar.f54206c = 3;
                        if (flowCollector3.emit(objD, bVar) == objA) {
                            break;
                            break;
                        }
                    }
                }
                return objA;
            } catch (Throwable th4) {
                zjxVar2 = zjxVar;
                th = th4;
                zjzVarAllocateSlot = zjzVar;
                th = th;
                zjxVar = zjxVar2;
                zjxVar.freeSlot(zjzVarAllocateSlot);
                throw th;
            }
        } catch (Throwable th5) {
            zjzVarAllocateSlot = zjzVar;
            th = th5;
            zjxVar = zjxVar3;
            zjxVar.freeSlot(zjzVarAllocateSlot);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        int i;
        boolean z;
        Continuation<yzc>[] continuationArrC = EMPTY_RESUMES.e;
        synchronized (this) {
            if (c(value)) {
                continuationArrC = c(continuationArrC);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<yzc> continuation : continuationArrC) {
            if (continuation != null) {
                yyt.c cVar = yyt.f53903b;
                continuation.resumeWith(yyt.e(yzc.e));
            }
        }
        return z;
    }

    static /* synthetic */ <T> Object e(zjx<T> zjxVar, T t, Continuation<? super yzc> continuation) {
        Object objD;
        return (!zjxVar.tryEmit(t) && (objD = zjxVar.d(t, continuation)) == zbg.a()) ? objD : yzc.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(T t) {
        if (getNCollectors() == 0) {
            return e(t);
        }
        if (this.e >= this.f54201a && this.f54203c <= this.f) {
            int i = e.f54209b[this.d.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        a(t);
        int i2 = this.e + 1;
        this.e = i2;
        if (i2 > this.f54201a) {
            e();
        }
        if (j() > this.i) {
            d(this.f + 1, this.f54203c, i(), h());
        }
        return true;
    }

    private final boolean e(T t) {
        if (ASSERTIONS_ENABLED.a() && getNCollectors() != 0) {
            throw new AssertionError();
        }
        if (this.i == 0) {
            return true;
        }
        a(t);
        int i = this.e + 1;
        this.e = i;
        if (i > this.i) {
            e();
        }
        this.f54203c = g() + ((long) this.e);
        return true;
    }

    private final void e() {
        Object[] objArr = this.f54202b;
        zcp.e(objArr);
        NO_VALUE.a(objArr, g(), null);
        this.e--;
        long jG = g() + 1;
        if (this.f < jG) {
            this.f = jG;
        }
        if (this.f54203c < jG) {
            a(jG);
        }
        if (ASSERTIONS_ENABLED.a() && g() != jG) {
            throw new AssertionError();
        }
    }

    private final void a(long j) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        zjx<T> zjxVar = this;
        if (((AbstractSharedFlow) zjxVar).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) zjxVar).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    zjz zjzVar = (zjz) abstractSharedFlowSlot;
                    if (zjzVar.f54211a >= 0 && zjzVar.f54211a < j) {
                        zjzVar.f54211a = j;
                    }
                }
            }
        }
        this.f54203c = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) {
        int iF = f();
        Object[] objArrC = this.f54202b;
        if (objArrC == null) {
            objArrC = c(null, 0, 2);
        } else if (iF >= objArrC.length) {
            objArrC = c(objArrC, iF, objArrC.length * 2);
        }
        NO_VALUE.a(objArrC, g() + ((long) iF), obj);
    }

    private final Object[] c(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.f54202b = objArr2;
        if (objArr != null) {
            long jG = g();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jG;
                NO_VALUE.a(objArr2, j, NO_VALUE.c(objArr, j));
            }
        }
        return objArr2;
    }

    public final long a() {
        long j = this.f;
        if (j < this.f54203c) {
            this.f54203c = j;
        }
        return j;
    }

    public final Continuation<yzc>[] b(long j) {
        int iMin;
        long j2;
        long j3;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (ASSERTIONS_ENABLED.a() && j < this.f54203c) {
            throw new AssertionError();
        }
        if (j > this.f54203c) {
            return EMPTY_RESUMES.e;
        }
        long jG = g();
        long j4 = ((long) this.e) + jG;
        if (this.f54201a == 0 && this.g > 0) {
            j4++;
        }
        zjx<T> zjxVar = this;
        int i = 0;
        if (((AbstractSharedFlow) zjxVar).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) zjxVar).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    zjz zjzVar = (zjz) abstractSharedFlowSlot;
                    if (zjzVar.f54211a >= 0 && zjzVar.f54211a < j4) {
                        j4 = zjzVar.f54211a;
                    }
                }
            }
        }
        if (ASSERTIONS_ENABLED.a() && j4 < this.f54203c) {
            throw new AssertionError();
        }
        if (j4 <= this.f54203c) {
            return EMPTY_RESUMES.e;
        }
        long jI = i();
        if (getNCollectors() > 0) {
            iMin = Math.min(this.g, this.f54201a - ((int) (jI - j4)));
        } else {
            iMin = this.g;
        }
        Continuation<yzc>[] continuationArr = EMPTY_RESUMES.e;
        long j5 = ((long) this.g) + jI;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.f54202b;
            zcp.e(objArr);
            long j6 = jI;
            while (true) {
                if (jI >= j5) {
                    j2 = j4;
                    break;
                }
                Object objC = NO_VALUE.c(objArr, jI);
                j2 = j4;
                if (objC != NO_VALUE.f54210b) {
                    zcp.e(objC, "");
                    c cVar = (c) objC;
                    int i2 = i + 1;
                    continuationArr[i] = cVar.d;
                    NO_VALUE.a(objArr, jI, NO_VALUE.f54210b);
                    NO_VALUE.a(objArr, j6, cVar.f54208c);
                    j3 = 1;
                    j6++;
                    if (i2 >= iMin) {
                        break;
                    }
                    i = i2;
                } else {
                    j3 = 1;
                }
                jI += j3;
                j4 = j2;
            }
            jI = j6;
        } else {
            j2 = j4;
        }
        long j7 = jI;
        Continuation<yzc>[] continuationArr2 = continuationArr;
        int i3 = (int) (j7 - jG);
        if (getNCollectors() == 0) {
            j2 = j7;
        }
        long jMax = Math.max(this.f, j7 - ((long) Math.min(this.i, i3)));
        if (this.f54201a == 0 && jMax < j5) {
            Object[] objArr2 = this.f54202b;
            zcp.e(objArr2);
            if (zcp.b(NO_VALUE.c(objArr2, jMax), NO_VALUE.f54210b)) {
                j7++;
                jMax++;
            }
        }
        d(jMax, j2, j7, j5);
        d();
        return continuationArr2.length == 0 ? continuationArr2 : c(continuationArr2);
    }

    private final void d(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        if (ASSERTIONS_ENABLED.a() && jMin < g()) {
            throw new AssertionError();
        }
        for (long jG = g(); jG < jMin; jG++) {
            Object[] objArr = this.f54202b;
            zcp.e(objArr);
            NO_VALUE.a(objArr, jG, null);
        }
        this.f = j;
        this.f54203c = j2;
        this.e = (int) (j3 - jMin);
        this.g = (int) (j4 - j3);
        if (ASSERTIONS_ENABLED.a() && this.e < 0) {
            throw new AssertionError();
        }
        if (ASSERTIONS_ENABLED.a() && this.g < 0) {
            throw new AssertionError();
        }
        if (ASSERTIONS_ENABLED.a() && this.f > g() + ((long) this.e)) {
            throw new AssertionError();
        }
    }

    private final void d() {
        if (this.f54201a != 0 || this.g > 1) {
            Object[] objArr = this.f54202b;
            zcp.e(objArr);
            while (this.g > 0 && NO_VALUE.c(objArr, (g() + ((long) f())) - 1) == NO_VALUE.f54210b) {
                this.g--;
                NO_VALUE.a(objArr, g() + ((long) f()), null);
            }
        }
    }

    private final Object d(zjz zjzVar) {
        Object obj;
        Continuation<yzc>[] continuationArrB = EMPTY_RESUMES.e;
        synchronized (this) {
            long jE = e(zjzVar);
            if (jE < 0) {
                obj = NO_VALUE.f54210b;
            } else {
                long j = zjzVar.f54211a;
                Object objC = c(jE);
                zjzVar.f54211a = jE + 1;
                continuationArrB = b(j);
                obj = objC;
            }
        }
        for (Continuation<yzc> continuation : continuationArrB) {
            if (continuation != null) {
                yyt.c cVar = yyt.f53903b;
                continuation.resumeWith(yyt.e(yzc.e));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long e(zjz zjzVar) {
        long j = zjzVar.f54211a;
        if (j >= i() && (this.f54201a > 0 || j > g() || this.g == 0)) {
            return -1L;
        }
        return j;
    }

    private final Object c(long j) {
        Object[] objArr = this.f54202b;
        zcp.e(objArr);
        Object objC = NO_VALUE.c(objArr, j);
        return objC instanceof c ? ((c) objC).f54208c : objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation<yzc>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation<yzc>[] c(Continuation<yzc>[] continuationArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        zjz zjzVar;
        Continuation<? super yzc> continuation;
        int length = continuationArr.length;
        zjx<T> zjxVar = this;
        if (((AbstractSharedFlow) zjxVar).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) zjxVar).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot == null || (continuation = (zjzVar = (zjz) abstractSharedFlowSlot).e) == null || e(zjzVar) < 0) {
                    continuationArr = continuationArr;
                } else {
                    if (length >= continuationArr.length) {
                        continuationArr = continuationArr;
                        continuationArr = continuationArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        zcp.b((Object) objArrCopyOf, "");
                        continuationArr = objArrCopyOf;
                    }
                    continuationArr = continuationArr;
                    continuationArr = continuationArr;
                    ((Continuation[]) continuationArr)[length] = continuation;
                    zjzVar.e = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
            continuationArr = continuationArr;
        }
        return (Continuation[]) continuationArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public zjz createSlot() {
        return new zjz();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zjz[] createSlotArray(int i) {
        return new zjz[i];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return NO_VALUE.a(this, context, capacity, onBufferOverflow);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class c implements DisposableHandle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f54207a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f54208c;
        public final Continuation<yzc> d;
        public final zjx<?> e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(zjx<?> zjxVar, long j, Object obj, Continuation<? super yzc> continuation) {
            this.e = zjxVar;
            this.f54207a = j;
            this.f54208c = obj;
            this.d = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.e.d(this);
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        synchronized (this) {
            int iJ = j();
            if (iJ == 0) {
                return yzp.e();
            }
            ArrayList arrayList = new ArrayList(iJ);
            Object[] objArr = this.f54202b;
            zcp.e(objArr);
            for (int i = 0; i < iJ; i++) {
                arrayList.add(NO_VALUE.c(objArr, this.f + ((long) i)));
            }
            return arrayList;
        }
    }

    private final Object d(T t, Continuation<? super yzc> continuation) {
        Continuation<yzc>[] continuationArrC;
        c cVar;
        zgf zgfVar = new zgf(zbg.c(continuation), 1);
        zgfVar.initCancellability();
        zgf zgfVar2 = zgfVar;
        Continuation<yzc>[] continuationArrC2 = EMPTY_RESUMES.e;
        synchronized (this) {
            try {
                if (c(t)) {
                    yyt.c cVar2 = yyt.f53903b;
                    zgfVar2.resumeWith(yyt.e(yzc.e));
                    continuationArrC = c(continuationArrC2);
                    cVar = null;
                } else {
                    c cVar3 = new c(this, ((long) f()) + g(), t, zgfVar2);
                    a(cVar3);
                    this.g++;
                    if (this.f54201a == 0) {
                        continuationArrC2 = c(continuationArrC2);
                    }
                    continuationArrC = continuationArrC2;
                    cVar = cVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            getOrCreateCancellableContinuation.e(zgfVar2, cVar);
        }
        for (Continuation<yzc> continuation2 : continuationArrC) {
            if (continuation2 != null) {
                yyt.c cVar4 = yyt.f53903b;
                continuation2.resumeWith(yyt.e(yzc.e));
            }
        }
        Object objB = zgfVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objB == zbg.a() ? objB : yzc.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(c cVar) {
        synchronized (this) {
            if (cVar.f54207a < g()) {
                return;
            }
            Object[] objArr = this.f54202b;
            zcp.e(objArr);
            if (NO_VALUE.c(objArr, cVar.f54207a) != cVar) {
                return;
            }
            NO_VALUE.a(objArr, cVar.f54207a, NO_VALUE.f54210b);
            d();
            yzc yzcVar = yzc.e;
        }
    }

    private final Object d(zjz zjzVar, Continuation<? super yzc> continuation) {
        zgf zgfVar = new zgf(zbg.c(continuation), 1);
        zgfVar.initCancellability();
        zgf zgfVar2 = zgfVar;
        synchronized (this) {
            if (e(zjzVar) < 0) {
                zjzVar.e = zgfVar2;
                zjzVar.e = zgfVar2;
            } else {
                yyt.c cVar = yyt.f53903b;
                zgfVar2.resumeWith(yyt.e(yzc.e));
            }
            yzc yzcVar = yzc.e;
        }
        Object objB = zgfVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objB == zbg.a() ? objB : yzc.e;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            d(i(), this.f54203c, i(), h());
            yzc yzcVar = yzc.e;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {372, 379, 382}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class b<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f54204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f54205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f54206c;
        Object d;
        Object e;
        final /* synthetic */ zjx<T> g;
        /* synthetic */ Object j;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.f54206c |= Integer.MIN_VALUE;
            return zjx.a(this.g, null, this);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zjx<T> zjxVar, Continuation<? super b> continuation) {
            super(continuation);
            this.g = zjxVar;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f54209b;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54209b = iArr;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super yzc> continuation) {
        return e(this, t, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return a(this, flowCollector, continuation);
    }
}
