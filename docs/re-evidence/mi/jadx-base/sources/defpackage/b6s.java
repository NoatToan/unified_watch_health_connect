package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class b6s extends bct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3871b;
    public final /* synthetic */ j8s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6s(j8s j8sVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f3871b = taskCompletionSource2;
        this.c = j8sVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, wrs] */
    @Override // defpackage.bct
    public final void a() {
        try {
            this.c.e.e().N1(this.c.f22539a, j8s.g(), new b7s(this.c, this.f3871b));
        } catch (RemoteException e) {
            j8s.g.c(e, "keepAlive", new Object[0]);
        }
    }
}
