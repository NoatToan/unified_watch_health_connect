package ch.qos.logback.core.helpers;

import java.util.ArrayList;
import java.util.List;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class CyclicBuffer<E> {

    /* JADX INFO: renamed from: ea, reason: collision with root package name */
    E[] f27280ea;
    int first;
    int last;
    int maxSize;
    int numElems;

    public CyclicBuffer(CyclicBuffer<E> cyclicBuffer) {
        int i14 = cyclicBuffer.maxSize;
        this.maxSize = i14;
        E[] eArr = (E[]) new Object[i14];
        this.f27280ea = eArr;
        System.arraycopy(cyclicBuffer.f27280ea, 0, eArr, 0, i14);
        this.last = cyclicBuffer.last;
        this.first = cyclicBuffer.first;
        this.numElems = cyclicBuffer.numElems;
    }

    private void init(int i14) {
        this.maxSize = i14;
        this.f27280ea = (E[]) new Object[i14];
        this.first = 0;
        this.last = 0;
        this.numElems = 0;
    }

    public void add(E e4) {
        E[] eArr = this.f27280ea;
        int i14 = this.last;
        eArr[i14] = e4;
        int i15 = i14 + 1;
        this.last = i15;
        int i16 = this.maxSize;
        if (i15 == i16) {
            this.last = 0;
        }
        int i17 = this.numElems;
        if (i17 < i16) {
            this.numElems = i17 + 1;
            return;
        }
        int i18 = this.first + 1;
        this.first = i18;
        if (i18 == i16) {
            this.first = 0;
        }
    }

    public List<E> asList() {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < length(); i14++) {
            arrayList.add(get(i14));
        }
        return arrayList;
    }

    public void clear() {
        init(this.maxSize);
    }

    public E get() {
        int i14 = this.numElems;
        if (i14 <= 0) {
            return null;
        }
        this.numElems = i14 - 1;
        E[] eArr = this.f27280ea;
        int i15 = this.first;
        E e4 = eArr[i15];
        eArr[i15] = null;
        int i16 = i15 + 1;
        this.first = i16;
        if (i16 == this.maxSize) {
            this.first = 0;
        }
        return e4;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int length() {
        return this.numElems;
    }

    public void resize(int i14) {
        if (i14 < 0) {
            h.s(e0.f(i14, "Negative array size [", "] not allowed."));
            return;
        }
        int i15 = this.numElems;
        if (i14 == i15) {
            return;
        }
        E[] eArr = (E[]) new Object[i14];
        if (i14 < i15) {
            i15 = i14;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            E[] eArr2 = this.f27280ea;
            int i17 = this.first;
            eArr[i16] = eArr2[i17];
            eArr2[i17] = null;
            int i18 = i17 + 1;
            this.first = i18;
            if (i18 == this.numElems) {
                this.first = 0;
            }
        }
        this.f27280ea = eArr;
        this.first = 0;
        this.numElems = i15;
        this.maxSize = i14;
        if (i15 == i14) {
            this.last = 0;
        } else {
            this.last = i15;
        }
    }

    public CyclicBuffer(int i14) {
        if (i14 >= 1) {
            init(i14);
        } else {
            h.s(e0.f(i14, "The maxSize argument (", ") is not a positive integer."));
            throw null;
        }
    }

    public E get(int i14) {
        if (i14 < 0 || i14 >= this.numElems) {
            return null;
        }
        return this.f27280ea[(this.first + i14) % this.maxSize];
    }
}
