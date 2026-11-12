package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface egi {
    re4 a();

    void b(Throwable th);

    void c(IBinder iBinder) throws RemoteException;

    egi d(uf8 uf8Var);
}
