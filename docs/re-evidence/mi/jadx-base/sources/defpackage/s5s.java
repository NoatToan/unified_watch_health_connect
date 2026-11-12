package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class s5s extends bct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33332b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ j8s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5s(j8s j8sVar, TaskCompletionSource taskCompletionSource, int i, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f33332b = i;
        this.c = taskCompletionSource2;
        this.d = j8sVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, wrs] */
    @Override // defpackage.bct
    public final void a() {
        try {
            this.d.d.e().G2(this.d.f22539a, j8s.h(this.f33332b), j8s.g(), new s7s(this.d, this.c));
        } catch (RemoteException e) {
            j8s.g.c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
