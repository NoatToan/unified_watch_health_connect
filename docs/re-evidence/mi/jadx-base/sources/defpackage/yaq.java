package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class yaq extends AbstractList<String> implements see, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final see f39996a;

    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ListIterator<String> f39997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f39998b;

        public a(int i) {
            this.f39998b = i;
            this.f39997a = yaq.this.f39996a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f39997a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f39997a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f39997a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f39997a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f39997a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f39997a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<String> f39999a;

        public b() {
            this.f39999a = yaq.this.f39996a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f39999a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f39999a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public yaq(see seeVar) {
        this.f39996a = seeVar;
    }

    @Override // defpackage.see
    public Object d(int i) {
        return this.f39996a.d(i);
    }

    @Override // defpackage.see
    public List<?> getUnderlyingElements() {
        return this.f39996a.getUnderlyingElements();
    }

    @Override // defpackage.see
    public see getUnmodifiableView() {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f39996a.size();
    }

    @Override // defpackage.see
    public void y(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return (String) this.f39996a.get(i);
    }
}
