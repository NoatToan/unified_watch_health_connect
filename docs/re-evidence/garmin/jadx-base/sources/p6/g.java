package p6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class g extends c implements Iterable<e> {

    public static class a implements Iterator<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f136198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f136199b = 0;

        public a(g gVar) {
            this.f136198a = gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f136199b < this.f136198a.f136192e.size();
        }

        @Override // java.util.Iterator
        public final e next() {
            e eVar = (e) this.f136198a.f136192e.get(this.f136199b);
            this.f136199b++;
            return eVar;
        }
    }

    public g(char[] cArr) {
        super(cArr);
    }

    @Override // p6.c, p6.d
    public final Object clone() {
        return (g) super.a();
    }

    @Override // java.lang.Iterable
    public final Iterator<e> iterator() {
        return new a(this);
    }

    @Override // p6.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g a() {
        return (g) super.a();
    }
}
