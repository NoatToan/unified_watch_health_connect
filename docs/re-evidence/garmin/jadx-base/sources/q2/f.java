package q2;

import android.view.ActionMode;
import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq2/f;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f142172a;

    public f(d dVar) {
        this.f142172a = dVar;
    }

    @Override // p3.h0
    public final void dispose() {
        d dVar = this.f142172a;
        f4.v vVar = dVar.f142158e;
        en0.n nVar = vVar.f68820h;
        if (nVar != null) {
            nVar.c();
        }
        vVar.a();
        ActionMode actionMode = dVar.f142161h;
        if (actionMode != null) {
            actionMode.finish();
        }
        dVar.f142161h = null;
    }
}
