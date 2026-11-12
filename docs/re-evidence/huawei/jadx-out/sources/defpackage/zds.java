package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B-\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/sequences/GeneratorSequence;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class zds<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1<T, T> f54004a;
    private final Function0<T> e;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0004J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0002R\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "next", "hasNext", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f54005a = -2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zds<T> f54006c;
        private T e;

        c(zds<T> zdsVar) {
            this.f54006c = zdsVar;
        }

        private final void e() {
            T t;
            if (this.f54005a == -2) {
                t = (T) ((zds) this.f54006c).e.invoke();
            } else {
                Function1 function1 = ((zds) this.f54006c).f54004a;
                T t2 = this.e;
                zcp.e(t2);
                t = (T) function1.invoke(t2);
            }
            this.e = t;
            this.f54005a = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f54005a < 0) {
                e();
            }
            if (this.f54005a == 0) {
                throw new NoSuchElementException();
            }
            T t = this.e;
            zcp.e(t, "");
            this.f54005a = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f54005a < 0) {
                e();
            }
            return this.f54005a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zds(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        zcp.c(function0, "");
        zcp.c(function1, "");
        this.e = function0;
        this.f54004a = function1;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new c(this);
    }
}
