package o53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo53/z1;", "T", "Lo53/o1;", "Lo53/k;", "continuation", "<init>", "(Lo53/k;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z1<T> extends o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k<T> f129435e;

    /* JADX WARN: Multi-variable type inference failed */
    public z1(k<? super T> kVar) {
        this.f129435e = kVar;
    }

    @Override // o53.o1
    public final boolean i() {
        return false;
    }

    @Override // o53.o1
    public final void j(Throwable th3) {
        Object obj = p1.f129381a.get(h());
        boolean z14 = obj instanceof v;
        k<T> kVar = this.f129435e;
        if (z14) {
            int i14 = o13.q.f128596b;
            kVar.resumeWith(o13.r.a(((v) obj).f129416a));
        } else {
            int i15 = o13.q.f128596b;
            kVar.resumeWith(q1.a(obj));
        }
    }
}
