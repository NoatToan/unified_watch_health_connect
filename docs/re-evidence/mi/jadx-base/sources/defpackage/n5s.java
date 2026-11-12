package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class n5s extends bct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27579b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ int e;
    public final /* synthetic */ j8s f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5s(j8s j8sVar, TaskCompletionSource taskCompletionSource, int i, String str, TaskCompletionSource taskCompletionSource2, int i2) {
        super(taskCompletionSource);
        this.f27579b = i;
        this.c = str;
        this.d = taskCompletionSource2;
        this.e = i2;
        this.f = j8sVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, wrs] */
    @Override // defpackage.bct
    public final void a() {
        try {
            this.f.d.e().a5(this.f.f22539a, j8s.x(this.f27579b, this.c), j8s.g(), new m7s(this.f, this.d, this.f27579b, this.c, this.e));
        } catch (RemoteException e) {
            j8s.g.c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
