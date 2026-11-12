package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/sequences/TakeSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", VastAttribute.SEQUENCE, "count", "", "<init>", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "take", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zef<T> implements Sequence<T>, DropTakeSequence<T> {
    private final Sequence<T> d;
    private final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public zef(Sequence<? extends T> sequence, int i) {
        zcp.c(sequence, "");
        this.d = sequence;
        this.e = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + FilenameUtils.EXTENSION_SEPARATOR).toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> drop(int n) {
        int i = this.e;
        return n >= i ? zdz.d() : new zeb(this.d, n, i);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> take(int n) {
        return n >= this.e ? this : new zef(this.d, n);
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0096\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"kotlin/sequences/TakeSequence$iterator$1", "", "left", "", "getLeft", "()I", "setLeft", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "next", "()Ljava/lang/Object;", "hasNext", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Iterator<T>, KMappedMarker {
        private final Iterator<T> d;
        private int e;

        c(zef<T> zefVar) {
            this.e = ((zef) zefVar).e;
            this.d = ((zef) zefVar).d.iterator();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.e;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.e = i - 1;
            return this.d.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e > 0 && this.d.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new c(this);
    }
}
