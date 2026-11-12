package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hms.network.embedded.q0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0002J\u0015\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0004¢\u0006\u0002\u0010\nR\u001b\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lkotlin/collections/ArrayAsCollection;", ExifInterface.GPS_DIRECTION_TRUE, "", q0.j, "", "isVarargs", "", "<init>", "([Ljava/lang/Object;Z)V", "getValues", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "()Z", "size", "", "getSize", "()I", "isEmpty", "contains", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)Z", "containsAll", "elements", "iterator", "", "toArray", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class yzb<T> implements Collection<T>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f53914a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53915c;

    public yzb(T[] tArr, boolean z) {
        zcp.c(tArr, "");
        this.f53914a = tArr;
        this.f53915c = z;
    }

    @Override // java.util.Collection
    public final int size() {
        return d();
    }

    public int d() {
        return this.f53914a.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f53914a.length == 0;
    }

    @Override // java.util.Collection
    public boolean contains(Object element) {
        return yzk.b(this.f53914a, element);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        zcp.c(elements, "");
        Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return C0461zcj.a(this.f53914a);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return yzp.a(this.f53914a, this.f53915c);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        zcp.c(tArr, "");
        return (T[]) EMPTY.e(this, tArr);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
