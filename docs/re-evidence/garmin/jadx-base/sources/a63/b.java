package a63;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import o13.q;
import o53.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class b<TResult> implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j<Object> f1713a;

    public b(j<Object> jVar) {
        this.f1713a = jVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Object> task) {
        Exception exception = task.getException();
        j<Object> jVar = this.f1713a;
        if (exception != null) {
            int i14 = q.f128596b;
            jVar.resumeWith(new q.b(exception));
        } else if (task.isCanceled()) {
            jVar.u(null);
        } else {
            int i15 = q.f128596b;
            jVar.resumeWith(task.getResult());
        }
    }
}
