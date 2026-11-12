package p13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, d2 = {"Lp13/z0;", "T", "Lp13/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "", "buffer", "", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z0<T> extends c<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f134970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f134971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134973e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p13/z0$a", "Lp13/b;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f134974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f134975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ z0<T> f134976e;

        public a(z0<T> z0Var) {
            this.f134976e = z0Var;
            this.f134974c = z0Var.getF134973e();
            this.f134975d = z0Var.f134972d;
        }

        @Override // p13.b
        public final void a() {
            int i14 = this.f134974c;
            if (i14 == 0) {
                this.f134914a = 2;
                return;
            }
            z0<T> z0Var = this.f134976e;
            Object[] objArr = z0Var.f134970b;
            int i15 = this.f134975d;
            this.f134915b = (T) objArr[i15];
            this.f134914a = 1;
            this.f134975d = (i15 + 1) % z0Var.f134971c;
            this.f134974c = i14 - 1;
        }
    }

    public z0(Object[] objArr, int i14) {
        objArr.getClass();
        this.f134970b = objArr;
        if (i14 < 0) {
            vb.h.x(am.j.h(i14, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i14 <= objArr.length) {
            this.f134971c = objArr.length;
            this.f134973e = i14;
        } else {
            vb.h.n(objArr.length, b71.i.i(i14, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF134973e() {
        return this.f134973e;
    }

    public final void b(int i14) {
        if (i14 < 0) {
            vb.h.x(am.j.h(i14, "n shouldn't be negative but it is "));
            return;
        }
        if (i14 > this.f134973e) {
            vb.h.n(this.f134973e, b71.i.i(i14, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i14 > 0) {
            int i15 = this.f134972d;
            int i16 = this.f134971c;
            int i17 = (i15 + i14) % i16;
            Object[] objArr = this.f134970b;
            if (i15 > i17) {
                s.m(i15, i16, null, objArr);
                Arrays.fill(objArr, 0, i17, (Object) null);
            } else {
                s.m(i15, i17, null, objArr);
            }
            this.f134972d = i17;
            this.f134973e -= i14;
        }
    }

    @Override // java.util.List
    public final T get(int i14) {
        int i15 = this.f134973e;
        c.f134916a.getClass();
        c.a.b(i14, i15);
        return (T) this.f134970b[(this.f134972d + i14) % this.f134971c];
    }

    @Override // p13.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    @Override // p13.a, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr;
        tArr.getClass();
        int length = tArr.length;
        int i14 = this.f134973e;
        if (length < i14) {
            tArr = (T[]) Arrays.copyOf(tArr, i14);
        }
        int i15 = this.f134973e;
        int i16 = this.f134972d;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            objArr = this.f134970b;
            if (i18 >= i15 || i16 >= this.f134971c) {
                break;
            }
            tArr[i18] = objArr[i16];
            i18++;
            i16++;
        }
        while (i18 < i15) {
            tArr[i18] = objArr[i17];
            i18++;
            i17++;
        }
        if (i15 < tArr.length) {
            tArr[i15] = null;
        }
        return tArr;
    }

    public z0(int i14) {
        this(new Object[i14], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p13.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[getF134973e()]);
    }
}
