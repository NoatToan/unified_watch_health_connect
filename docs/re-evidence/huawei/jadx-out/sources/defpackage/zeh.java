package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0096\u0002J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0003\"\u0004\b\u0002\u0010\f2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\n0\u0006H\u0000¢\u0006\u0002\b\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/sequences/TransformingSequence;", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlin/sequences/Sequence;", VastAttribute.SEQUENCE, "transformer", "Lkotlin/Function1;", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "flatten", ExifInterface.LONGITUDE_EAST, "flatten$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zeh<T, R> implements Sequence<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence<T> f54021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1<T, R> f54022b;

    /* JADX WARN: Multi-variable type inference failed */
    public zeh(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        zcp.c(sequence, "");
        zcp.c(function1, "");
        this.f54021a = sequence;
        this.f54022b = function1;
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000e\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "next", "()Ljava/lang/Object;", "hasNext", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Iterator<R>, KMappedMarker {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<T> f54023b;
        final /* synthetic */ zeh<T, R> d;

        d(zeh<T, R> zehVar) {
            this.d = zehVar;
            this.f54023b = ((zeh) zehVar).f54021a.iterator();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((zeh) this.d).f54022b.invoke(this.f54023b.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f54023b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<R> iterator() {
        return new d(this);
    }
}
