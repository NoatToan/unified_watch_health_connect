package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class h5s extends bct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19728b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TaskCompletionSource f;
    public final /* synthetic */ j8s g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5s(j8s j8sVar, TaskCompletionSource taskCompletionSource, int i, String str, String str2, int i2, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f19728b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = taskCompletionSource2;
        this.g = j8sVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, wrs] */
    @Override // defpackage.bct
    public final void a() {
        try {
            this.g.d.e().S4(this.g.f22539a, j8s.k(this.f19728b, this.c, this.d, this.e), j8s.g(), new h7s(this.g, this.f));
        } catch (RemoteException e) {
            j8s.g.c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
