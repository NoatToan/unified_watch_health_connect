package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.watchface.videoedit.gles.Constant;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ,*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J1\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0006J&\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\u0004\b\u0001\u0010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H#0%J\b\u0010&\u001a\u00020\u001aH\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010(\u001a\u0004\u0018\u00010\u0002J,\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002R#\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n0\tX\u0082\u0004R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", ExifInterface.LONGITUDE_EAST, "", "capacity", "", "singleConsumer", "", "(IZ)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Lkotlinx/atomicfu/AtomicArray;", "isEmpty", "()Z", Constant.MASK, "size", "getSize", "()I", "addLast", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)I", "allocateNextCopy", "state", "", "allocateOrGetNextCopy", "close", "fillPlaceholder", "index", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "markFrozen", "next", "removeFirstOrNull", "removeSlowPath", "oldHead", "newHead", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zlv<E> {

    @Volatile
    private volatile Object _next;

    @Volatile
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f54287a;
    private final int h;
    private final int i;
    private final boolean j;
    public static final a e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f54285b = AtomicReferenceFieldUpdater.newUpdater(zlv.class, Object.class, "_next");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f54286c = AtomicLongFieldUpdater.newUpdater(zlv.class, "_state");
    public static final zmh d = new zmh("REMOVE_FROZEN");

    public zlv(int i, boolean z) {
        this.i = i;
        this.j = z;
        int i2 = i - 1;
        this.h = i2;
        this.f54287a = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean a() {
        long j = f54286c.get(this);
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final int e() {
        long j = f54286c.get(this);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final boolean b() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f54286c;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((FileUtils.ONE_EB & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int b(E e2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f54286c;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return e.c(j);
            }
            a aVar = e;
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.h;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.j && this.f54287a.get(i2 & i3) != null) {
                int i4 = this.i;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (f54286c.compareAndSet(this, j, aVar.a(j, (i2 + 1) & 1073741823))) {
                this.f54287a.set(i2 & i3, e2);
                zlv<E> zlvVarA = this;
                while ((f54286c.get(zlvVarA) & FileUtils.ONE_EB) != 0 && (zlvVarA = zlvVarA.d().a(i2, e2)) != null) {
                }
                return 0;
            }
        }
    }

    private final zlv<E> a(int i, E e2) {
        Object obj = this.f54287a.get(this.h & i);
        if (!(obj instanceof b) || ((b) obj).f54288c != i) {
            return null;
        }
        this.f54287a.set(i & this.h, e2);
        return this;
    }

    public final Object c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f54286c;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((FileUtils.ONE_EB & j) != 0) {
                return d;
            }
            a aVar = e;
            int i = (int) (1073741823 & j);
            int i2 = this.h;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f54287a.get(i4);
            if (obj == null) {
                if (this.j) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i5 = (i + 1) & 1073741823;
                if (f54286c.compareAndSet(this, j, aVar.e(j, i5))) {
                    this.f54287a.set(this.h & i, null);
                    return obj;
                }
                if (this.j) {
                    zlv<E> zlvVarE = this;
                    do {
                        zlvVarE = zlvVarE.e(i, i5);
                    } while (zlvVarE != null);
                    return obj;
                }
            }
        }
    }

    private final zlv<E> e(int i, int i2) {
        long j;
        a aVar;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f54286c;
        do {
            j = atomicLongFieldUpdater.get(this);
            aVar = e;
            i3 = (int) (1073741823 & j);
            if (ASSERTIONS_ENABLED.a() && i3 != i) {
                throw new AssertionError();
            }
            if ((FileUtils.ONE_EB & j) != 0) {
                return d();
            }
        } while (!f54286c.compareAndSet(this, j, aVar.e(j, i2)));
        this.f54287a.set(this.h & i3, null);
        return null;
    }

    public final zlv<E> d() {
        return e(h());
    }

    private final long h() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f54286c;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & FileUtils.ONE_EB) != 0) {
                return j;
            }
            j2 = j | FileUtils.ONE_EB;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    private final zlv<E> e(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54285b;
        while (true) {
            zlv<E> zlvVar = (zlv) atomicReferenceFieldUpdater.get(this);
            if (zlvVar != null) {
                return zlvVar;
            }
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54285b, this, null, b(j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zlv<E> b(long j) {
        zlv<E> zlvVar = new zlv<>(this.i * 2, this.j);
        int i = (int) (1073741823 & j);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.h;
            int i4 = i & i3;
            if (i4 != (i3 & i2)) {
                Object bVar = this.f54287a.get(i4);
                if (bVar == null) {
                    bVar = new b(i);
                }
                zlvVar.f54287a.set(zlvVar.h & i, bVar);
                i++;
            } else {
                f54286c.set(zlvVar, e.b(j, FileUtils.ONE_EB));
                return zlvVar;
            }
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "index", "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54288c;

        public b(int i) {
            this.f54288c = i;
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", TtmlNode.TAG_HEAD, "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public final long b(long j, long j2) {
            return j & (~j2);
        }

        public final int c(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        private a() {
        }

        public final long e(long j, int i) {
            return b(j, 1073741823L) | ((long) i);
        }

        public final long a(long j, int i) {
            return b(j, 1152921503533105152L) | (((long) i) << 30);
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }
    }
}
