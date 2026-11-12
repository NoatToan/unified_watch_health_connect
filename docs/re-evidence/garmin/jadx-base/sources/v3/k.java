package v3;

import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv3/k;", "E", "Lv3/a;", "", "", "root", "", FirebaseAnalytics.Param.INDEX, "size", "height", "<init>", "([Ljava/lang/Object;III)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k<E> extends a<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f175382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f175383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f175384e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i14, int i15, int i16) {
        super(i14, i15);
        this.f175382c = i16;
        Object[] objArr2 = new Object[i16];
        this.f175383d = objArr2;
        ?? r14 = i14 == i15 ? 1 : 0;
        this.f175384e = r14;
        objArr2[0] = objArr;
        b(i14 - r14, 1);
    }

    public final E a() {
        int i14 = this.f175354a & 31;
        Object obj = this.f175383d[this.f175382c - 1];
        obj.getClass();
        return (E) ((Object[]) obj)[i14];
    }

    public final void b(int i14, int i15) {
        int i16 = (this.f175382c - i15) * 5;
        while (i15 < this.f175382c) {
            Object[] objArr = this.f175383d;
            Object obj = objArr[i15 - 1];
            obj.getClass();
            objArr[i15] = ((Object[]) obj)[l.a(i14, i16)];
            i16 -= 5;
            i15++;
        }
    }

    public final void c(int i14) {
        int i15 = 0;
        while (l.a(this.f175354a, i15) == i14) {
            i15 += 5;
        }
        if (i15 > 0) {
            b(this.f175354a, ((this.f175382c - 1) - (i15 / 5)) + 1);
        }
    }

    @Override // v3.a, java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        E eA = a();
        int i14 = this.f175354a + 1;
        this.f175354a = i14;
        if (i14 == this.f175355b) {
            this.f175384e = true;
            return eA;
        }
        c(0);
        return eA;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            t.g();
            return null;
        }
        this.f175354a--;
        if (this.f175384e) {
            this.f175384e = false;
            return a();
        }
        c(31);
        return a();
    }
}
