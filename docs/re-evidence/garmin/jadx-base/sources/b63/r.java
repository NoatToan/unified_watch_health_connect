package b63;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lb63/r;", "", "Lb63/o;", "Lj23/m;", "longProgression", "<init>", "(Lj23/m;)V", TtmlNode.START, "endInclusive", "", "step", "(Lb63/o;Lb63/o;J)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class r implements Collection<o>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j23.m f16211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f16212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f16213c;

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(o oVar, o oVar2, long j8) {
        oVar.getClass();
        oVar2.getClass();
        j23.m.a aVar = j23.m.f96805d;
        long epochDay = oVar.f16206a.toEpochDay();
        long epochDay2 = oVar2.f16206a.toEpochDay();
        aVar.getClass();
        this(new j23.m(epochDay, epochDay2, j8));
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(o oVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends o> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof o) {
            return contains((o) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof o) || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean contains(o oVar) {
        oVar.getClass();
        long epochDay = oVar.f16206a.toEpochDay();
        j23.m mVar = this.f16211a;
        mVar.getClass();
        long j8 = mVar.f96807b;
        long j14 = mVar.f96806a;
        long j15 = mVar.f96808c;
        j23.o oVar2 = j15 > 0 ? new j23.o(j14, j8) : new j23.o(j8, j14);
        return epochDay <= oVar2.f96807b && oVar2.f96806a <= epochDay && (epochDay - j14) % j15 == 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return p005kotlin.jvm.internal.s.g(this.f16211a, ((r) obj).f16211a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f16211a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f16211a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<o> iterator() {
        j23.m mVar = this.f16211a;
        return new s(new j23.n(mVar.f96806a, mVar.f96807b, mVar.f96808c));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super o> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        j23.m mVar = this.f16211a;
        mVar.getClass();
        if (mVar.isEmpty()) {
            return 0;
        }
        try {
            return d63.c.a((Math.addExact(mVar.f96807b, -mVar.f96806a) / mVar.f96808c) + 1);
        } catch (ArithmeticException unused) {
            return Integer.MAX_VALUE;
        }
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    public String toString() {
        j23.m mVar = this.f16211a;
        long j8 = mVar.f96808c;
        o oVar = this.f16213c;
        o oVar2 = this.f16212b;
        if (j8 > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(oVar2);
            sb3.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb3.append(oVar);
            sb3.append(" step ");
            return androidx.room.a0.l(sb3, mVar.f96808c, 'D');
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(oVar2);
        sb4.append(" downTo ");
        sb4.append(oVar);
        sb4.append(" step ");
        return androidx.room.a0.l(sb4, mVar.f96808c, 'D');
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb63/r$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }

    public r(j23.m mVar) {
        mVar.getClass();
        this.f16211a = mVar;
        o.Companion companion = o.INSTANCE;
        long j8 = mVar.f96806a;
        companion.getClass();
        this.f16212b = o.Companion.a(j8);
        this.f16213c = o.Companion.a(mVar.f96807b);
    }
}
