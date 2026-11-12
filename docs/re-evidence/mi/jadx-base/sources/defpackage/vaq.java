package defpackage;

import androidx.health.platform.client.proto.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class vaq extends AbstractList<String> implements pee, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pee f36676a;

    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ListIterator<String> f36677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f36678b;

        public a(int i) {
            this.f36678b = i;
            this.f36677a = vaq.this.f36676a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f36677a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f36677a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36677a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36677a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f36677a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f36677a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<String> f36679a;

        public b() {
            this.f36679a = vaq.this.f36676a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f36679a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36679a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public vaq(pee peeVar) {
        this.f36676a = peeVar;
    }

    @Override // defpackage.pee
    public void N(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pee
    public Object d(int i) {
        return this.f36676a.d(i);
    }

    @Override // defpackage.pee
    public List<?> getUnderlyingElements() {
        return this.f36676a.getUnderlyingElements();
    }

    @Override // defpackage.pee
    public pee getUnmodifiableView() {
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
        return this.f36676a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return (String) this.f36676a.get(i);
    }
}
