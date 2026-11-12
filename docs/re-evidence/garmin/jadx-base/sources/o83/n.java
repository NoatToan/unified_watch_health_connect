package o83;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final class n<T> implements j83.l.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends T> f130940a;

    public n(Callable<? extends T> callable) {
        this.f130940a = callable;
    }

    @Override // n83.b
    public final void call(Object obj) {
        j83.m mVar = (j83.m) obj;
        try {
            mVar.c(this.f130940a.call());
        } catch (Throwable th3) {
            m83.a.b(th3);
            mVar.b(th3);
        }
    }
}
