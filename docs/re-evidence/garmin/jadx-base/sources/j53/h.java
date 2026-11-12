package j53;

import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import java.util.ListIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj53/h;", "T", "", "Lj53/a;", "Lj53/f;", "builder", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Lj53/f;I)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h<T> extends a<T> implements ListIterator<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f<T> f97127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f97128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k<? extends T> f97129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97130f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f<T> fVar, int i14) {
        super(i14, fVar.getF97124f());
        fVar.getClass();
        this.f97127c = fVar;
        this.f97128d = fVar.d();
        this.f97130f = -1;
        b();
    }

    public final void a() {
        if (this.f97128d == this.f97127c.d()) {
            return;
        }
        org.apache.commons.lang3.e.h();
    }

    @Override // j53.a, java.util.ListIterator
    public final void add(T t7) {
        a();
        int i14 = this.f97110a;
        f<T> fVar = this.f97127c;
        fVar.add(i14, t7);
        this.f97110a++;
        this.f97111b = fVar.getF97124f();
        this.f97128d = fVar.d();
        this.f97130f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f<T> fVar = this.f97127c;
        Object[] objArr = fVar.f97122d;
        if (objArr == null) {
            this.f97129e = null;
            return;
        }
        int i14 = (fVar.f97124f - 1) & (-32);
        int i15 = this.f97110a;
        if (i15 > i14) {
            i15 = i14;
        }
        int i16 = (fVar.f97119a / 5) + 1;
        k<? extends T> kVar = this.f97129e;
        if (kVar == null) {
            this.f97129e = new k<>(objArr, i15, i14, i16);
            return;
        }
        kVar.f97110a = i15;
        kVar.f97111b = i14;
        kVar.f97135c = i16;
        if (kVar.f97136d.length < i16) {
            kVar.f97136d = new Object[i16];
        }
        kVar.f97136d[0] = objArr;
        ?? r14 = i15 == i14 ? 1 : 0;
        kVar.f97137e = r14;
        kVar.b(i15 - r14, 1);
    }

    @Override // j53.a, java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        if (!hasNext()) {
            t.g();
            return null;
        }
        int i14 = this.f97110a;
        this.f97130f = i14;
        k<? extends T> kVar = this.f97129e;
        f<T> fVar = this.f97127c;
        if (kVar == null) {
            Object[] objArr = fVar.f97123e;
            this.f97110a = i14 + 1;
            return (T) objArr[i14];
        }
        if (kVar.hasNext()) {
            this.f97110a++;
            return kVar.next();
        }
        Object[] objArr2 = fVar.f97123e;
        int i15 = this.f97110a;
        this.f97110a = i15 + 1;
        return (T) objArr2[i15 - kVar.f97111b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (!hasPrevious()) {
            t.g();
            return null;
        }
        int i14 = this.f97110a;
        this.f97130f = i14 - 1;
        k<? extends T> kVar = this.f97129e;
        f<T> fVar = this.f97127c;
        if (kVar == null) {
            Object[] objArr = fVar.f97123e;
            int i15 = i14 - 1;
            this.f97110a = i15;
            return (T) objArr[i15];
        }
        int i16 = kVar.f97111b;
        if (i14 <= i16) {
            this.f97110a = i14 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = fVar.f97123e;
        int i17 = i14 - 1;
        this.f97110a = i17;
        return (T) objArr2[i17 - i16];
    }

    @Override // j53.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i14 = this.f97130f;
        if (i14 == -1) {
            x.h();
            return;
        }
        f<T> fVar = this.f97127c;
        fVar.b(i14);
        int i15 = this.f97130f;
        if (i15 < this.f97110a) {
            this.f97110a = i15;
        }
        this.f97111b = fVar.getF97124f();
        this.f97128d = fVar.d();
        this.f97130f = -1;
        b();
    }

    @Override // j53.a, java.util.ListIterator
    public final void set(T t7) {
        a();
        int i14 = this.f97130f;
        if (i14 == -1) {
            x.h();
            return;
        }
        f<T> fVar = this.f97127c;
        fVar.set(i14, t7);
        this.f97128d = fVar.d();
        b();
    }
}
