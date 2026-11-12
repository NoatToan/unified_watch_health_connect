package o53;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo53/v1;", "Lt13/a;", "Lo53/l1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v1 extends t13.a implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f129418a = new v1();

    private v1() {
        super(l1.f129368i0);
    }

    @Override // o53.l1
    @o13.e
    public final o E(p1 p1Var) {
        return w1.f129420a;
    }

    @Override // o53.l1
    @o13.e
    public final u0 J(e23.l<? super Throwable, Unit> lVar) {
        return w1.f129420a;
    }

    @Override // o53.l1
    @o13.e
    public final Object P(t13.d<? super Unit> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // o53.l1
    @o13.e
    public final CancellationException Q() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // o53.l1
    public final c53.j<l1> a() {
        return c53.f.f24532a;
    }

    @Override // o53.l1
    @o13.e
    public final void c(CancellationException cancellationException) {
    }

    @Override // o53.l1
    public final boolean e() {
        return false;
    }

    @Override // o53.l1
    public final boolean isActive() {
        return true;
    }

    @Override // o53.l1
    public final boolean isCancelled() {
        return false;
    }

    @Override // o53.l1
    @o13.e
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // o53.l1
    @o13.e
    public final u0 w(boolean z14, boolean z15, n1 n1Var) {
        return w1.f129420a;
    }
}
