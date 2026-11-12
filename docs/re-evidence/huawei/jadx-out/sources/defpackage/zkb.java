package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.RendererCapabilities;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0003H\u0014J\u001d\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u0006\u0010%\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010&J\u0019\u0010'\u001a\u00020(2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J&\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020(H\u0016J\u0015\u00102\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\u001a\u00104\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010\b2\u0006\u00106\u001a\u00020\bH\u0002R\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", "", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "replayCache", "", "getReplayCache", "()Ljava/util/List;", VastAttribute.SEQUENCE, "", "value", "getValue$annotations", "()V", "getValue", "()Ljava/lang/Object;", "setValue", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "createSlot", "createSlotArray", "", "size", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fuse", "Lkotlinx/coroutines/flow/Flow;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "resetReplayCache", "tryEmit", "(Ljava/lang/Object;)Z", "updateState", "expectedState", "newState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class zkb<T> extends AbstractSharedFlow<zkc> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f54218c = AtomicReferenceFieldUpdater.newUpdater(zkb.class, Object.class, "_state");

    @Volatile
    private volatile Object _state;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54219b;

    public zkb(Object obj) {
        this._state = obj;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        zmh zmhVar = DONE.f54244b;
        T t = (T) f54218c.get(this);
        if (t == zmhVar) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t) {
        if (t == null) {
            t = (T) DONE.f54244b;
        }
        e(null, t);
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T expect, T update) {
        if (expect == null) {
            expect = (T) DONE.f54244b;
        }
        if (update == null) {
            update = (T) DONE.f54244b;
        }
        return e(expect, update);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return yzp.e(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        setValue(value);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super yzc> continuation) {
        setValue(t);
        return yzc.e;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9 A[Catch: all -> 0x0074, PHI: r2 r6 r7 r8 r11
      0x00a9: PHI (r2v10 kotlinx.coroutines.Job) = 
      (r2v8 kotlinx.coroutines.Job)
      (r2v9 kotlinx.coroutines.Job)
      (r2v9 kotlinx.coroutines.Job)
      (r2v15 kotlinx.coroutines.Job)
     binds: [B:33:0x0098, B:49:0x00db, B:51:0x00ed, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r6v5 ??) = (r6v12 ??), (r6v13 ??), (r6v14 ??), (r6v15 ??) binds: [B:33:0x0098, B:49:0x00db, B:51:0x00ed, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r7v2 ??) = (r7v0 ??), (r7v7 ??), (r7v8 ??), (r7v9 ??) binds: [B:33:0x0098, B:49:0x00db, B:51:0x00ed, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r8v6 zkb<T>) = (r8v4 zkb<T>), (r8v5 zkb<T>), (r8v5 zkb<T>), (r8v12 zkb<T>) binds: [B:33:0x0098, B:49:0x00db, B:51:0x00ed, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r11v7 java.lang.Object) = (r11v5 java.lang.Object), (r11v6 java.lang.Object), (r11v6 java.lang.Object), (r11v19 java.lang.Object) binds: [B:33:0x0098, B:49:0x00db, B:51:0x00ed, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0074, blocks: (B:14:0x003f, B:34:0x00a9, B:36:0x00b1, B:38:0x00b6, B:48:0x00d7, B:50:0x00dd, B:40:0x00bc, B:44:0x00c3, B:19:0x005d, B:22:0x0070, B:33:0x0098), top: B:60:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:14:0x003f, B:34:0x00a9, B:36:0x00b1, B:38:0x00b6, B:48:0x00d7, B:50:0x00dd, B:40:0x00bc, B:44:0x00c3, B:19:0x005d, B:22:0x0070, B:33:0x0098), top: B:60:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:14:0x003f, B:34:0x00a9, B:36:0x00b1, B:38:0x00b6, B:48:0x00d7, B:50:0x00dd, B:40:0x00bc, B:44:0x00c3, B:19:0x005d, B:22:0x0070, B:33:0x0098), top: B:60:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:14:0x003f, B:34:0x00a9, B:36:0x00b1, B:38:0x00b6, B:48:0x00d7, B:50:0x00dd, B:40:0x00bc, B:44:0x00c3, B:19:0x005d, B:22:0x0070, B:33:0x0098), top: B:60:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, zkc] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00db -> B:34:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ed -> B:34:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.Continuation<?> r12) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkb.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public zkc createSlot() {
        return new zkc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zkc[] createSlotArray(int i) {
        return new zkc[i];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return NONE.e(this, context, capacity, onBufferOverflow);
    }

    private final boolean e(Object obj, Object obj2) {
        int i;
        zkc[] slots;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54218c;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !zcp.b(obj3, obj)) {
                return false;
            }
            if (zcp.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f54219b;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.f54219b = i3;
                zkc[] slots2 = getSlots();
                yzc yzcVar = yzc.e;
                while (true) {
                    zkc[] zkcVarArr = slots2;
                    if (zkcVarArr != null) {
                        for (zkc zkcVar : zkcVarArr) {
                            if (zkcVar != null) {
                                zkcVar.a();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.f54219b;
                        if (i == i3) {
                            this.f54219b = i3 + 1;
                            return true;
                        }
                        slots = getSlots();
                        yzc yzcVar2 = yzc.e;
                    }
                    slots2 = slots;
                    i3 = i;
                }
            } else {
                this.f54219b = i2 + 2;
                return true;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {RendererCapabilities.DECODER_SUPPORT_MASK, 396, 401}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f54220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f54221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f54222c;
        Object d;
        Object e;
        int f;
        final /* synthetic */ zkb<T> h;
        /* synthetic */ Object j;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.f |= Integer.MIN_VALUE;
            return this.h.collect(null, this);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(zkb<T> zkbVar, Continuation<? super d> continuation) {
            super(continuation);
            this.h = zkbVar;
        }
    }
}
