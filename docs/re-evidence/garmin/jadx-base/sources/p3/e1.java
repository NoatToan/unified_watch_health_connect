package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface e1 extends t13.g.a {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final a f135069m0 = a.f135070a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp3/e1$a;", "Lt13/g$b;", "Lp3/e1;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t13.g.b<e1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f135070a = new a();

        private a() {
        }
    }

    @Override // t13.g.a
    default t13.g.b<?> getKey() {
        return f135069m0;
    }

    <R> Object v(e23.l<? super Long, ? extends R> lVar, t13.d<? super R> dVar);
}
