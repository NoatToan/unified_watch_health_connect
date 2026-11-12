package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class q4s extends bct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f31108b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ j8s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4s(j8s j8sVar, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f31108b = list;
        this.c = taskCompletionSource2;
        this.d = j8sVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.IInterface, wrs] */
    @Override // defpackage.bct
    public final void a() {
        try {
            this.d.d.e().G0(this.d.f22539a, j8s.t(this.f31108b), j8s.g(), new l6s(this.d, this.c));
        } catch (RemoteException e) {
            j8s.g.c(e, "cancelDownloads(%s)", this.f31108b);
        }
    }
}
