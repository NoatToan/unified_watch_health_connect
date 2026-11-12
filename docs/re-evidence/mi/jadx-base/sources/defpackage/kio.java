package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.text.StrBuilder;

/* JADX INFO: loaded from: classes3.dex */
public class kio implements ListIterator<String>, Cloneable {
    public static final kio j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final kio f23895k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f23897b;
    public int c;
    public iio d = iio.f();
    public iio e = iio.e();
    public iio f = iio.e();
    public iio g = iio.e();
    public boolean h = false;
    public boolean i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f23896a = null;

    static {
        kio kioVar = new kio();
        j = kioVar;
        kioVar.u(iio.a());
        kioVar.y(iio.b());
        kioVar.x(iio.e());
        kioVar.z(iio.h());
        kioVar.v(false);
        kioVar.w(false);
        kio kioVar2 = new kio();
        f23895k = kioVar2;
        kioVar2.u(iio.g());
        kioVar2.y(iio.b());
        kioVar2.x(iio.e());
        kioVar2.z(iio.h());
        kioVar2.v(false);
        kioVar2.w(false);
    }

    public List<String> A(char[] cArr, int i, int i2) {
        if (cArr == null || i2 == 0) {
            return Collections.emptyList();
        }
        StrBuilder strBuilder = new StrBuilder();
        ArrayList arrayList = new ArrayList();
        int iQ = i;
        while (iQ >= 0 && iQ < i2) {
            iQ = q(cArr, iQ, i2, strBuilder, arrayList);
            if (iQ >= i2) {
                b(arrayList, "");
            }
        }
        return arrayList;
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(String str) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    public final void b(List<String> list, String str) {
        if (mlo.c(str)) {
            if (k()) {
                return;
            }
            if (j()) {
                str = null;
            }
        }
        list.add(str);
    }

    public final void c() {
        if (this.f23897b == null) {
            char[] cArr = this.f23896a;
            if (cArr == null) {
                List<String> listA = A(null, 0, 0);
                this.f23897b = (String[]) listA.toArray(new String[listA.size()]);
            } else {
                List<String> listA2 = A(cArr, 0, cArr.length);
                this.f23897b = (String[]) listA2.toArray(new String[listA2.size()]);
            }
        }
    }

    public Object clone() {
        try {
            return d();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Object d() throws CloneNotSupportedException {
        kio kioVar = (kio) super.clone();
        char[] cArr = kioVar.f23896a;
        if (cArr != null) {
            kioVar.f23896a = (char[]) cArr.clone();
        }
        kioVar.s();
        return kioVar;
    }

    public iio e() {
        return this.d;
    }

    public iio f() {
        return this.f;
    }

    public iio g() {
        return this.e;
    }

    public List<String> h() {
        c();
        ArrayList arrayList = new ArrayList(this.f23897b.length);
        for (String str : this.f23897b) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        c();
        return this.c < this.f23897b.length;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        c();
        return this.c > 0;
    }

    public iio i() {
        return this.g;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.i;
    }

    public final boolean l(char[] cArr, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            if (i6 >= i2 || cArr[i6] != cArr[i3 + i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f23897b;
        int i = this.c;
        this.c = i + 1;
        return strArr[i];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public String previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f23897b;
        int i = this.c - 1;
        this.c = i;
        return strArr[i];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.c - 1;
    }

    public final int q(char[] cArr, int i, int i2, StrBuilder strBuilder, List<String> list) {
        while (i < i2) {
            int iMax = Math.max(f().d(cArr, i, i, i2), i().d(cArr, i, i, i2));
            if (iMax == 0 || e().d(cArr, i, i, i2) > 0 || g().d(cArr, i, i, i2) > 0) {
                break;
            }
            i += iMax;
        }
        if (i >= i2) {
            b(list, "");
            return -1;
        }
        int iD = e().d(cArr, i, i, i2);
        if (iD > 0) {
            b(list, "");
            return i + iD;
        }
        int iD2 = g().d(cArr, i, i, i2);
        return iD2 > 0 ? r(cArr, i + iD2, i2, strBuilder, list, i, iD2) : r(cArr, i, i2, strBuilder, list, 0, 0);
    }

    public final int r(char[] cArr, int i, int i2, StrBuilder strBuilder, List<String> list, int i3, int i4) {
        strBuilder.clear();
        boolean z = i4 > 0;
        int i5 = i;
        int size = 0;
        while (i5 < i2) {
            if (z) {
                int i6 = size;
                int i7 = i5;
                if (l(cArr, i5, i2, i3, i4)) {
                    int i8 = i7 + i4;
                    if (l(cArr, i8, i2, i3, i4)) {
                        strBuilder.append(cArr, i7, i4);
                        i5 = i7 + (i4 * 2);
                        size = strBuilder.size();
                    } else {
                        size = i6;
                        i5 = i8;
                        z = false;
                    }
                } else {
                    i5 = i7 + 1;
                    strBuilder.append(cArr[i7]);
                    size = strBuilder.size();
                }
            } else {
                int i9 = size;
                int i10 = i5;
                int iD = e().d(cArr, i10, i, i2);
                if (iD > 0) {
                    b(list, strBuilder.substring(0, i9));
                    return i10 + iD;
                }
                if (i4 <= 0 || !l(cArr, i10, i2, i3, i4)) {
                    int iD2 = f().d(cArr, i10, i, i2);
                    if (iD2 <= 0) {
                        iD2 = i().d(cArr, i10, i, i2);
                        if (iD2 > 0) {
                            strBuilder.append(cArr, i10, iD2);
                        } else {
                            i5 = i10 + 1;
                            strBuilder.append(cArr[i10]);
                            size = strBuilder.size();
                        }
                    }
                    i5 = i10 + iD2;
                    size = i9;
                } else {
                    i5 = i10 + i4;
                    size = i9;
                    z = true;
                }
            }
        }
        b(list, strBuilder.substring(0, size));
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public kio s() {
        this.c = 0;
        this.f23897b = null;
        return this;
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public String toString() {
        if (this.f23897b == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + h();
    }

    public kio u(iio iioVar) {
        if (iioVar == null) {
            this.d = iio.e();
        } else {
            this.d = iioVar;
        }
        return this;
    }

    public kio v(boolean z) {
        this.h = z;
        return this;
    }

    public kio w(boolean z) {
        this.i = z;
        return this;
    }

    public kio x(iio iioVar) {
        if (iioVar != null) {
            this.f = iioVar;
        }
        return this;
    }

    public kio y(iio iioVar) {
        if (iioVar != null) {
            this.e = iioVar;
        }
        return this;
    }

    public kio z(iio iioVar) {
        if (iioVar != null) {
            this.g = iioVar;
        }
        return this;
    }
}
