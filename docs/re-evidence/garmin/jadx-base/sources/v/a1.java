package v;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public class a1 implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f173667a;

    public a1(c1 c1Var) {
        this.f173667a = c1Var;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        synchronized (this.f173667a.f173719a) {
            try {
                this.f173667a.f173722d.x();
                int iOrdinal = this.f173667a.f173728j.ordinal();
                if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th3 instanceof CancellationException)) {
                    Objects.toString(this.f173667a.f173728j);
                    this.f173667a.l();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // l0.c
    public final /* bridge */ /* synthetic */ void onSuccess(Void r14) {
    }
}
