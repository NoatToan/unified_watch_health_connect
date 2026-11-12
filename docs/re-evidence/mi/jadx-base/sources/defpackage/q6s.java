package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class q6s extends g6s {
    public q6s(j8s j8sVar, TaskCompletionSource taskCompletionSource) {
        super(j8sVar, taskCompletionSource);
    }

    @Override // defpackage.g6s, defpackage.cxs
    public final void g2(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.g2(bundle, bundle2);
        this.f18659a.trySetResult((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
