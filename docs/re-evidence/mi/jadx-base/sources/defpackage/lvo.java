package defpackage;

import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class lvo<E> extends kvo<E> implements Queue<E> {
    private static final long serialVersionUID = 1;

    public lvo(Queue<E> queue) {
        super(queue);
    }

    public static <E> lvo<E> g(Queue<E> queue) {
        return new lvo<>(queue);
    }

    @Override // java.util.Queue
    public E element() {
        E eElement;
        synchronized (this.f24347b) {
            eElement = e().element();
        }
        return eElement;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f24347b) {
            zEquals = e().equals(obj);
        }
        return zEquals;
    }

    @Override // defpackage.kvo
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Queue<E> e() {
        return (Queue) super.e();
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f24347b) {
            iHashCode = e().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        boolean zOffer;
        synchronized (this.f24347b) {
            zOffer = e().offer(e);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public E peek() {
        E ePeek;
        synchronized (this.f24347b) {
            ePeek = e().peek();
        }
        return ePeek;
    }

    @Override // java.util.Queue
    public E poll() {
        E ePoll;
        synchronized (this.f24347b) {
            ePoll = e().poll();
        }
        return ePoll;
    }

    @Override // java.util.Queue
    public E remove() {
        E eRemove;
        synchronized (this.f24347b) {
            eRemove = e().remove();
        }
        return eRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f24347b) {
            array = e().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f24347b) {
            tArr2 = (T[]) e().toArray(tArr);
        }
        return tArr2;
    }
}
