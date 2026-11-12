package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public class waq extends AbstractList<String> implements qee, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qee f37782a;

    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ListIterator<String> f37783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37784b;

        public a(int i) {
            this.f37784b = i;
            this.f37783a = waq.this.f37782a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f37783a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f37783a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f37783a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f37783a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f37783a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f37783a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<String> f37785a;

        public b() {
            this.f37785a = waq.this.f37782a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f37785a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37785a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public waq(qee qeeVar) {
        this.f37782a = qeeVar;
    }

    @Override // defpackage.qee
    public void D(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qee
    public Object d(int i) {
        return this.f37782a.d(i);
    }

    @Override // defpackage.qee
    public List<?> getUnderlyingElements() {
        return this.f37782a.getUnderlyingElements();
    }

    @Override // defpackage.qee
    public qee getUnmodifiableView() {
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
        return this.f37782a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return (String) this.f37782a.get(i);
    }
}
