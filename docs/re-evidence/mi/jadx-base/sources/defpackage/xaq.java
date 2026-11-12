package defpackage;

import com.google.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public class xaq extends AbstractList<String> implements ree, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ree f38923a;

    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ListIterator<String> f38924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38925b;

        public a(int i) {
            this.f38925b = i;
            this.f38924a = xaq.this.f38923a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f38924a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f38924a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f38924a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f38924a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f38924a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f38924a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<String> f38926a;

        public b() {
            this.f38926a = xaq.this.f38923a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f38926a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38926a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public xaq(ree reeVar) {
        this.f38923a = reeVar;
    }

    @Override // defpackage.ree
    public Object d(int i) {
        return this.f38923a.d(i);
    }

    @Override // defpackage.ree
    public ByteString getByteString(int i) {
        return this.f38923a.getByteString(i);
    }

    @Override // defpackage.ree
    public List<?> getUnderlyingElements() {
        return this.f38923a.getUnderlyingElements();
    }

    @Override // defpackage.ree
    public ree getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new a(i);
    }

    @Override // defpackage.ree
    public void n(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38923a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return this.f38923a.get(i);
    }
}
