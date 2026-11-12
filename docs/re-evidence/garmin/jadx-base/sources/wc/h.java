package wc;

import b.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwc/h;", "", "<init>", "()V", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f184242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f184243b;

    public final void a() {
        Runnable runnable;
        c cVar = this.f184242a;
        if (cVar == null) {
            vb.h.z("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f184243b) {
            cVar.e(this, null);
        }
        cVar.d();
        if (cVar.g()) {
            i iVar = cVar.f184229d;
            l lVar = cVar.f184227b;
            iVar.getClass();
            if (equals(iVar.f184251h) && -1 == iVar.f184250g) {
                e<?> eVarC = iVar.f184249f;
                if (eVarC == null) {
                    eVarC = iVar.c(-1);
                }
                iVar.f184249f = null;
                iVar.f184250g = 0;
                iVar.f184251h = null;
                if (eVarC != null) {
                    eVarC.f184236d = j.b.f184258a;
                    eVarC.d();
                } else if (lVar != null && (runnable = ((u) ((a73.j) lVar).f1851b).f13824a) != null) {
                    runnable.run();
                }
                iVar.f184244a.setValue(j.b.f184258a);
            }
        }
        this.f184243b = false;
    }

    public void b(boolean z14) {
    }
}
