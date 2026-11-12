package j1;

import androidx.camera.core.impl.k0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f96235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.r f96236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f96237c;

    public g(i iVar, List list, b0.r rVar) {
        this.f96237c = iVar;
        this.f96235a = list;
        this.f96236b = rVar;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        this.f96237c.f96244e = null;
        List list = this.f96235a;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((k0) this.f96236b).c((androidx.camera.core.impl.s) it.next());
        }
        list.clear();
    }

    @Override // l0.c
    public final void onSuccess(Void r14) {
        this.f96237c.f96244e = null;
    }
}
