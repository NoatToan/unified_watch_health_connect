package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J,\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u00002\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0017J0\u0010 \u001a\u0004\u0018\u00018\u00002!\u0010!\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0002\u0010$J\u000f\u0010%\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0002\u0010&J\r\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010&J\u0015\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nH\u0002¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010.J$\u0010/\u001a\u0004\u0018\u00018\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010$J\r\u00100\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010&J\u0011\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0010H\u0082\u0010J\u0011\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0010H\u0082\u0010J\u0018\u00104\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0010H\u0002R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u001a\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00066"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_size", "Lkotlinx/atomicfu/AtomicInt;", "a", "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "", "()Z", "value", "", "size", "getSize", "()I", "setSize", "(I)V", "addImpl", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "addLastIf", "cond", "Lkotlin/Function1;", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", CervicalMucusRecord.Appearance.CLEAR, "find", "predicate", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", EventType.REMOVE, "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "removeAtImpl", "index", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "removeFirstOrNull", "siftDownFrom", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "siftUpFrom", "swap", "j", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class zmm<T extends ThreadSafeHeapNode & Comparable<? super T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f54306a = AtomicIntegerFieldUpdater.newUpdater(zmm.class, "_size");

    @Volatile
    private volatile int _size;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T[] f54307c;

    public final int e() {
        return f54306a.get(this);
    }

    private final void e(int i) {
        f54306a.set(this, i);
    }

    public final boolean c() {
        return e() == 0;
    }

    public final T a() {
        T[] tArr = this.f54307c;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    public final T c(int i) {
        if (ASSERTIONS_ENABLED.a() && e() <= 0) {
            throw new AssertionError();
        }
        T[] tArr = this.f54307c;
        zcp.e(tArr);
        e(e() - 1);
        if (i < e()) {
            b(i, e());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                zcp.e(t);
                T t2 = tArr[i2];
                zcp.e(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    b(i, i2);
                    b(i2);
                } else {
                    d(i);
                }
            } else {
                d(i);
            }
        }
        T t3 = tArr[e()];
        zcp.e(t3);
        if (ASSERTIONS_ENABLED.a() && t3.getHeap() != this) {
            throw new AssertionError();
        }
        t3.setHeap(null);
        t3.setIndex(-1);
        tArr[e()] = null;
        return t3;
    }

    public final void b(T t) {
        if (ASSERTIONS_ENABLED.a() && t.getHeap() != null) {
            throw new AssertionError();
        }
        t.setHeap(this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArrH = h();
        int iE = e();
        e(iE + 1);
        threadSafeHeapNodeArrH[iE] = t;
        t.setIndex(iE);
        b(iE);
    }

    private final void b(int i) {
        while (i > 0) {
            T[] tArr = this.f54307c;
            zcp.e(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            zcp.e(t);
            T t2 = tArr[i];
            zcp.e(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            b(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    private final void d(int i) {
        while (true) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (i3 >= e()) {
                return;
            }
            T[] tArr = this.f54307c;
            zcp.e(tArr);
            int i4 = i2 + 2;
            if (i4 < e()) {
                T t = tArr[i4];
                zcp.e(t);
                T t2 = tArr[i3];
                zcp.e(t2);
                if (((Comparable) t).compareTo(t2) >= 0) {
                    i4 = i3;
                }
            } else {
                i4 = i3;
            }
            T t3 = tArr[i];
            zcp.e(t3);
            T t4 = tArr[i4];
            zcp.e(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            b(i, i4);
            i = i4;
        }
    }

    private final T[] h() {
        T[] tArr = this.f54307c;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.f54307c = tArr2;
            return tArr2;
        }
        if (e() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, e() * 2);
        zcp.b((Object) objArrCopyOf, "");
        T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) objArrCopyOf);
        this.f54307c = tArr3;
        return tArr3;
    }

    private final void b(int i, int i2) {
        T[] tArr = this.f54307c;
        zcp.e(tArr);
        T t = tArr[i2];
        zcp.e(t);
        T t2 = tArr[i];
        zcp.e(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    public final T b() {
        T t;
        synchronized (this) {
            t = (T) a();
        }
        return t;
    }

    public final T d() {
        T t;
        synchronized (this) {
            t = e() > 0 ? (T) c(0) : null;
        }
        return t;
    }

    public final boolean d(T t) {
        boolean z;
        synchronized (this) {
            if (t.getHeap() == null) {
                z = false;
            } else {
                int index = t.getIndex();
                if (ASSERTIONS_ENABLED.a() && index < 0) {
                    throw new AssertionError();
                }
                c(index);
                z = true;
            }
        }
        return z;
    }
}
