package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0004J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00180\u001aJ\r\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001cR\u001f\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t0\u0007X\u0082\u0004R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", ExifInterface.LONGITUDE_EAST, "", "singleConsumer", "", "(Z)V", "_cur", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "isEmpty", "()Z", "size", "", "getSize", "()I", "addLast", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)Z", "close", "", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "removeFirstOrNull", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class zlx<E> {
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(zlx.class, Object.class, "_cur");

    @Volatile
    private volatile Object _cur;

    public zlx(boolean z) {
        this._cur = new zlv(8, z);
    }

    public final int c() {
        return ((zlv) d.get(this)).e();
    }

    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        while (true) {
            zlv zlvVar = (zlv) atomicReferenceFieldUpdater.get(this);
            if (zlvVar.b()) {
                return;
            } else {
                AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, this, zlvVar, zlvVar.d());
            }
        }
    }

    public final boolean b(E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        while (true) {
            zlv zlvVar = (zlv) atomicReferenceFieldUpdater.get(this);
            int iB = zlvVar.b(e);
            if (iB == 0) {
                return true;
            }
            if (iB == 1) {
                AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, this, zlvVar, zlvVar.d());
            } else if (iB == 2) {
                return false;
            }
        }
    }

    public final E b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        while (true) {
            zlv zlvVar = (zlv) atomicReferenceFieldUpdater.get(this);
            E e = (E) zlvVar.c();
            if (e != zlv.d) {
                return e;
            }
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, this, zlvVar, zlvVar.d());
        }
    }
}
