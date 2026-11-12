package v;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f173944b;

    public /* synthetic */ o(s sVar, int i14) {
        this.f173943a = i14;
        this.f173944b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f173943a) {
            case 0:
                s sVar = this.f173944b;
                sVar.toString();
                s.g gVar = sVar.f174010e;
                s.g gVar2 = s.g.RELEASING;
                if (gVar != gVar2 && sVar.f174010e != s.g.RELEASED) {
                    b0.e eVar = new b0.e(8, null);
                    sVar.f174012g.a(androidx.camera.core.impl.l0.a.CLOSED, eVar);
                    sVar.E(gVar2, eVar, true);
                    sVar.f174014i.a();
                    sVar.I0.a();
                    if (sVar.f174016k == null) {
                        sVar.u();
                    } else {
                        sVar.r();
                    }
                    break;
                }
                break;
            default:
                s sVar2 = this.f173944b;
                sVar2.B = false;
                sVar2.A = false;
                Objects.toString(sVar2.f174010e);
                sVar2.toString();
                int iOrdinal = sVar2.f174010e.ordinal();
                if (iOrdinal == 1 || iOrdinal == 5) {
                    k7.h.f(sVar2.f174023q.isEmpty(), null);
                    sVar2.u();
                } else if (iOrdinal == 7) {
                    int i14 = sVar2.f174018l;
                    if (i14 == 0) {
                        sVar2.I(false);
                    } else {
                        "OpenCameraConfigAndClose in error: ".concat(s.v(i14));
                        sVar2.toString();
                        sVar2.f174014i.b();
                    }
                } else {
                    Objects.toString(sVar2.f174010e);
                    sVar2.toString();
                }
                break;
        }
    }
}
