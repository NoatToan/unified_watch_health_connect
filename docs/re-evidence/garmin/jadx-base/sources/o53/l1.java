package o53;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public interface l1 extends t13.g.a {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final a f129368i0 = a.f129369a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo53/l1$a;", "Lt13/g$b;", "Lo53/l1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t13.g.b<l1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f129369a = new a();

        private a() {
        }
    }

    o E(p1 p1Var);

    u0 J(e23.l<? super Throwable, Unit> lVar);

    Object P(t13.d<? super Unit> dVar);

    CancellationException Q();

    c53.j<l1> a();

    void c(CancellationException cancellationException);

    boolean e();

    boolean isActive();

    boolean isCancelled();

    boolean start();

    u0 w(boolean z14, boolean z15, n1 n1Var);
}
