package wc;

import java.util.LinkedHashSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\nB\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lwc/c;", "", "parent", "Lwc/l;", "onBackCompletedFallback", "<init>", "(Lwc/c;Lwc/l;)V", "()V", "(Lwc/l;)V", "(Lwc/c;)V", "a", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f184226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f184227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f184228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f184229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f184230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f184231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f184232g;

    static {
        new a(null);
    }

    private c(c cVar, l lVar) {
        i iVar;
        this.f184226a = cVar;
        this.f184227b = lVar;
        this.f184228c = true;
        this.f184229d = (cVar == null || (iVar = cVar.f184229d) == null) ? new i() : iVar;
        this.f184230e = new LinkedHashSet();
        this.f184231f = new LinkedHashSet();
        this.f184232g = new LinkedHashSet();
        if (cVar != null) {
            cVar.f184230e.add(this);
        }
    }

    public static void a(c cVar, e eVar) {
        cVar.getClass();
        eVar.getClass();
        cVar.d();
        if (cVar.f184231f.add(eVar)) {
            i iVar = cVar.f184229d;
            iVar.getClass();
            if (eVar.f184239g != null) {
                androidx.core.view.j.s("Handler '", eVar, "' is already registered with a dispatcher");
                return;
            }
            iVar.f184248e.addFirst(eVar);
            eVar.f184239g = cVar;
            iVar.b();
        }
    }

    public final void b(h hVar) {
        d();
        if (this.f184232g.add(hVar)) {
            this.f184229d.a(this, hVar, -1);
        }
    }

    public final void c(o oVar, int i14) {
        d();
        if (i14 != 1 && i14 != 0) {
            vb.h.x(am.j.h(i14, "Unsupported priority value: "));
        } else if (this.f184232g.add(oVar)) {
            this.f184229d.a(this, oVar, i14);
        }
    }

    public final void d() {
        if (f()) {
            vb.h.z("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    public final void e(h hVar, b bVar) {
        hVar.getClass();
        d();
        if (g()) {
            i iVar = this.f184229d;
            iVar.getClass();
            if (iVar.f184250g != 0) {
                return;
            }
            e<?> eVarC = iVar.c(-1);
            iVar.f184249f = eVarC;
            iVar.f184250g = -1;
            iVar.f184251h = hVar;
            if (bVar != null) {
                if (eVarC != null) {
                    eVarC.f184236d = new j.c(bVar, -1);
                    eVarC.f(bVar);
                }
                iVar.f184244a.k(null, new j.c(bVar, -1));
            }
        }
    }

    public final boolean f() {
        c cVar = this.f184226a;
        return cVar != null && cVar.f();
    }

    public final boolean g() {
        c cVar = this.f184226a;
        if (cVar == null || cVar.g()) {
            return this.f184228c;
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lwc/c$a;", "", "<init>", "()V", "", "PRIORITY_OVERLAY", "I", "PRIORITY_DEFAULT", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public c() {
        this(null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(l lVar) {
        this(null, lVar);
        lVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(c cVar) {
        this(cVar, null);
        cVar.getClass();
    }
}
