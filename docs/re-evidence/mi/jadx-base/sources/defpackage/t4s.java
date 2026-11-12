package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class t4s extends bct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f34315b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ j8s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4s(j8s j8sVar, TaskCompletionSource taskCompletionSource, Map map, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f34315b = map;
        this.c = taskCompletionSource2;
        this.d = j8sVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, wrs] */
    @Override // defpackage.bct
    public final void a() {
        try {
            this.d.d.e().l2(this.d.f22539a, j8s.n(this.f34315b), new v6s(this.d, this.c));
        } catch (RemoteException e) {
            j8s.g.c(e, "syncPacks", new Object[0]);
            this.c.trySetException(new RuntimeException(e));
        }
    }
}
