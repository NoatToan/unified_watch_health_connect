package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ga2 implements egi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re4 f18766a;

    public ga2(re4 re4Var) {
        this.f18766a = (re4) c6i.o(re4Var);
    }

    @Override // defpackage.egi
    public re4 a() {
        return this.f18766a;
    }

    @Override // defpackage.egi
    public void b(Throwable th) {
    }

    @Override // defpackage.egi
    public void c(IBinder iBinder) throws RemoteException {
    }

    @Override // defpackage.egi
    public egi d(uf8 uf8Var) {
        return this;
    }
}
