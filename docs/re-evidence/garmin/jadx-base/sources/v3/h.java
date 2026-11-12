package v3;

import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import java.util.ListIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv3/h;", "T", "", "Lv3/a;", "Lv3/f;", "builder", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Lv3/f;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h<T> extends a<T> implements ListIterator<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f<T> f175374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f175375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k<? extends T> f175376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f175377f;

    public h(f<T> fVar, int i14) {
        super(i14, fVar.getF97124f());
        this.f175374c = fVar;
        this.f175375d = fVar.e();
        this.f175377f = -1;
        b();
    }

    public final void a() {
        if (this.f175375d == this.f175374c.e()) {
            return;
        }
        org.apache.commons.lang3.e.h();
    }

    @Override // v3.a, java.util.ListIterator
    public final void add(T t7) {
        a();
        int i14 = this.f175354a;
        f<T> fVar = this.f175374c;
        fVar.add(i14, t7);
        this.f175354a++;
        this.f175355b = fVar.getF97124f();
        this.f175375d = fVar.e();
        this.f175377f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f<T> fVar = this.f175374c;
        Object[] objArr = fVar.f175369f;
        if (objArr == null) {
            this.f175376e = null;
            return;
        }
        int i14 = (fVar.f175371h - 1) & (-32);
        int i15 = this.f175354a;
        if (i15 > i14) {
            i15 = i14;
        }
        int i16 = (fVar.f175367d / 5) + 1;
        k<? extends T> kVar = this.f175376e;
        if (kVar == null) {
            this.f175376e = new k<>(objArr, i15, i14, i16);
            return;
        }
        kVar.f175354a = i15;
        kVar.f175355b = i14;
        kVar.f175382c = i16;
        if (kVar.f175383d.length < i16) {
            kVar.f175383d = new Object[i16];
        }
        kVar.f175383d[0] = objArr;
        ?? r14 = i15 == i14 ? 1 : 0;
        kVar.f175384e = r14;
        kVar.b(i15 - r14, 1);
    }

    @Override // v3.a, java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        if (!hasNext()) {
            t.g();
            return null;
        }
        int i14 = this.f175354a;
        this.f175377f = i14;
        k<? extends T> kVar = this.f175376e;
        f<T> fVar = this.f175374c;
        if (kVar == null) {
            Object[] objArr = fVar.f175370g;
            this.f175354a = i14 + 1;
            return (T) objArr[i14];
        }
        if (kVar.hasNext()) {
            this.f175354a++;
            return kVar.next();
        }
        Object[] objArr2 = fVar.f175370g;
        int i15 = this.f175354a;
        this.f175354a = i15 + 1;
        return (T) objArr2[i15 - kVar.f175355b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (!hasPrevious()) {
            t.g();
            return null;
        }
        int i14 = this.f175354a;
        this.f175377f = i14 - 1;
        k<? extends T> kVar = this.f175376e;
        f<T> fVar = this.f175374c;
        if (kVar == null) {
            Object[] objArr = fVar.f175370g;
            int i15 = i14 - 1;
            this.f175354a = i15;
            return (T) objArr[i15];
        }
        int i16 = kVar.f175355b;
        if (i14 <= i16) {
            this.f175354a = i14 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = fVar.f175370g;
        int i17 = i14 - 1;
        this.f175354a = i17;
        return (T) objArr2[i17 - i16];
    }

    @Override // v3.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i14 = this.f175377f;
        if (i14 == -1) {
            x.h();
            return;
        }
        f<T> fVar = this.f175374c;
        fVar.b(i14);
        int i15 = this.f175377f;
        if (i15 < this.f175354a) {
            this.f175354a = i15;
        }
        this.f175355b = fVar.getF97124f();
        this.f175375d = fVar.e();
        this.f175377f = -1;
        b();
    }

    @Override // v3.a, java.util.ListIterator
    public final void set(T t7) {
        a();
        int i14 = this.f175377f;
        if (i14 == -1) {
            x.h();
            return;
        }
        f<T> fVar = this.f175374c;
        fVar.set(i14, t7);
        this.f175375d = fVar.e();
        b();
    }
}
