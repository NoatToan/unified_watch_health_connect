package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/sequences/FilteringSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", VastAttribute.SEQUENCE, "sendWhen", "", "predicate", "Lkotlin/Function1;", "<init>", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zdv<T> implements Sequence<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f54010b;
    private final Function1<T, Boolean> d;
    private final Sequence<T> e;

    /* JADX WARN: Multi-variable type inference failed */
    public zdv(Sequence<? extends T> sequence, boolean z, Function1<? super T, Boolean> function1) {
        zcp.c(sequence, "");
        zcp.c(function1, "");
        this.e = sequence;
        this.f54010b = z;
        this.d = function1;
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"kotlin/sequences/FilteringSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "calcNext", "", "next", "hasNext", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f54011a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zdv<T> f54012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator<T> f54013c;
        private T e;

        e(zdv<T> zdvVar) {
            this.f54012b = zdvVar;
            this.f54013c = ((zdv) zdvVar).e.iterator();
        }

        private final void d() {
            while (this.f54013c.hasNext()) {
                T next = this.f54013c.next();
                if (((Boolean) ((zdv) this.f54012b).d.invoke(next)).booleanValue() == ((zdv) this.f54012b).f54010b) {
                    this.e = next;
                    this.f54011a = 1;
                    return;
                }
            }
            this.f54011a = 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f54011a == -1) {
                d();
            }
            if (this.f54011a == 0) {
                throw new NoSuchElementException();
            }
            T t = this.e;
            this.e = null;
            this.f54011a = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f54011a == -1) {
                d();
            }
            return this.f54011a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new e(this);
    }
}
