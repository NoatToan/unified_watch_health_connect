package g4;

import ew1.c2;
import java.util.List;
import p005kotlin.Metadata;
import p3.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lg4/i;", "Lg4/h;", "Lt3/e;", "Lt13/g$a;", "Lp3/v0;", "composer", "<init>", "(Lp3/v0;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements h, t3.e, t13.g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f75740b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f75741a;

    public i(v0 v0Var) {
        this.f75741a = v0Var;
    }

    @Override // t3.e
    public final boolean b() {
        return this.f75741a.getD();
    }

    @Override // t3.e
    public final List<d> d(Integer num) {
        return this.f75741a.V();
    }

    @Override // t13.g
    public final /* bridge */ <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) t13.g.a.C3052a.a(this, r14, pVar);
    }

    @Override // g4.h
    public final boolean g(Object obj, Throwable th3) {
        return jg.b.R(th3, new c2(24, this, obj));
    }

    @Override // t13.g
    public final /* bridge */ <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) t13.g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g.a
    public final t13.g.b<?> getKey() {
        return f75740b;
    }

    @Override // t13.g
    public final /* bridge */ t13.g minusKey(t13.g.b<?> bVar) {
        return t13.g.a.C3052a.c(this, bVar);
    }

    @Override // t13.g
    public final /* bridge */ t13.g plus(t13.g gVar) {
        return t13.g.a.C3052a.d(gVar, this);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lg4/i$a;", "Lt13/g$b;", "Lg4/i;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t13.g.b<i> {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final String toString() {
            return "CompositionErrorContext";
        }

        private a() {
        }
    }
}
