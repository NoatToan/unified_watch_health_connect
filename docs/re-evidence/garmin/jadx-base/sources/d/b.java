package d;

import b.u;
import p005kotlin.Metadata;
import vb.h;
import wc.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld/b;", "", "Lwc/c;", "navigationEventDispatcher", "Lb/u;", "onBackPressedDispatcher", "<init>", "(Lwc/c;Lb/u;)V", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f56985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f56986b;

    public b(c cVar, u uVar) {
        this.f56985a = cVar;
        this.f56986b = uVar;
        if ((cVar == null ? uVar : cVar) != null) {
            return;
        }
        h.s("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(a aVar) {
        c cVar = this.f56985a;
        if (cVar != null) {
            c.a(cVar, aVar.f56982b);
            return;
        }
        u uVar = this.f56986b;
        if (uVar != null) {
            uVar.a(aVar.f56981a);
        } else {
            h.z("Unreachable");
        }
    }

    public final void b(a aVar) throws Exception {
        if (this.f56985a != null) {
            aVar.f56982b.h();
        } else if (this.f56986b != null) {
            aVar.f56981a.e();
        } else {
            h.z("Unreachable");
        }
    }
}
