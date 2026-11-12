package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class v6s extends g6s {
    public final /* synthetic */ j8s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6s(j8s j8sVar, TaskCompletionSource taskCompletionSource) {
        super(j8sVar, taskCompletionSource);
        this.c = j8sVar;
    }

    @Override // defpackage.g6s, defpackage.cxs
    public final void K2(List list) {
        super.K2(list);
        this.f18659a.trySetResult(j8s.u(this.c, list));
    }
}
