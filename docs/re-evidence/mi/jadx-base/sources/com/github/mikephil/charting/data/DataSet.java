package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;
import defpackage.k62;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DataSet<T extends Entry> extends k62<T> {
    public List<T> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7800r;
    public float s;
    public float t;
    public float u;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.f7800r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.q = list;
        if (list == null) {
            this.q = new ArrayList();
        }
        j0();
    }

    @Override // defpackage.erc
    public float A() {
        return this.u;
    }

    @Override // defpackage.erc
    public T H0(float f, float f2, Rounding rounding) {
        int iG1 = g1(f, f2, rounding);
        if (iG1 > -1) {
            return this.q.get(iG1);
        }
        return null;
    }

    @Override // defpackage.erc
    public float L() {
        return this.t;
    }

    @Override // defpackage.erc
    public int O0() {
        return this.q.size();
    }

    @Override // defpackage.erc
    public float V() {
        return this.f7800r;
    }

    @Override // defpackage.erc
    public float Z() {
        return this.s;
    }

    @Override // defpackage.erc
    public int c(Entry entry) {
        return this.q.indexOf(entry);
    }

    public void c1(T t) {
        if (t == null) {
            return;
        }
        d1(t);
        e1(t);
    }

    public void d1(T t) {
        if (t.getX() < this.u) {
            this.u = t.getX();
        }
        if (t.getX() > this.t) {
            this.t = t.getX();
        }
    }

    public void e1(T t) {
        if (t.getY() < this.s) {
            this.s = t.getY();
        }
        if (t.getY() > this.f7800r) {
            this.f7800r = t.getY();
        }
    }

    public List<T> f1() {
        return this.q;
    }

    @Override // defpackage.erc
    public boolean g0(T t) {
        if (t == null) {
            return false;
        }
        List<T> listF1 = f1();
        if (listF1 == null) {
            listF1 = new ArrayList<>();
        }
        c1(t);
        return listF1.add(t);
    }

    public int g1(float f, float f2, Rounding rounding) {
        int i;
        T t;
        List<T> list = this.q;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.q.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            float x = this.q.get(i3).getX() - f;
            int i4 = i3 + 1;
            float x2 = this.q.get(i4).getX() - f;
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(x2);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = x;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i3;
            }
            i2 = i4;
        }
        if (size == -1) {
            return size;
        }
        float x3 = this.q.get(size).getX();
        if (rounding == Rounding.UP) {
            if (x3 < f && size < this.q.size() - 1) {
                size++;
            }
        } else if (rounding == Rounding.DOWN && x3 > f && size > 0) {
            size--;
        }
        if (Float.isNaN(f2)) {
            return size;
        }
        while (size > 0 && this.q.get(size - 1).getX() == x3) {
            size--;
        }
        float y = this.q.get(size).getY();
        loop2: while (true) {
            i = size;
            do {
                size++;
                if (size >= this.q.size()) {
                    break loop2;
                }
                t = this.q.get(size);
                if (t.getX() != x3) {
                    break loop2;
                }
            } while (Math.abs(t.getY() - f2) > Math.abs(y - f2));
            y = f2;
        }
        return i;
    }

    public void h1(List<T> list) {
        this.q = list;
        S0();
    }

    @Override // defpackage.erc
    public T i(int i) {
        return this.q.get(i);
    }

    @Deprecated
    public void i1(List<T> list) {
        h1(list);
    }

    @Override // defpackage.erc
    public void j0() {
        this.f7800r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        List<T> list = this.q;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<T> it = this.q.iterator();
        while (it.hasNext()) {
            c1(it.next());
        }
    }

    public String j1() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("DataSet, label: ");
        sb.append(getLabel() == null ? "" : getLabel());
        sb.append(", entries: ");
        sb.append(this.q.size());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    @Override // defpackage.erc
    public void q(float f, float f2) {
        int iG1;
        int iG2;
        this.f7800r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        List<T> list = this.q;
        if (list == null || list.isEmpty() || (iG2 = g1(f2, Float.NaN, Rounding.UP)) < (iG1 = g1(f, Float.NaN, Rounding.DOWN))) {
            return;
        }
        for (iG1 = g1(f, Float.NaN, Rounding.DOWN); iG1 <= iG2; iG1++) {
            e1(this.q.get(iG1));
        }
    }

    @Override // defpackage.erc
    public List<T> r(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.q.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (size + i) / 2;
            T t = this.q.get(i2);
            if (f == t.getX()) {
                while (i2 > 0 && this.q.get(i2 - 1).getX() == f) {
                    i2--;
                }
                int size2 = this.q.size();
                while (i2 < size2) {
                    T t2 = this.q.get(i2);
                    if (t2.getX() != f) {
                        break;
                    }
                    arrayList.add(t2);
                    i2++;
                }
                break;
            }
            if (f > t.getX()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(j1());
        for (int i = 0; i < this.q.size(); i++) {
            stringBuffer.append(this.q.get(i).toString() + " ");
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.erc
    public T v0(float f, float f2) {
        return (T) H0(f, f2, Rounding.CLOSEST);
    }
}
