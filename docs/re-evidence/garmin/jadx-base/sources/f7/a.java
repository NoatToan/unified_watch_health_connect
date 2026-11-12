package f7;

import android.os.CancellationSignal;
import o53.c2;
import p006l2.b2;
import s5.w0;
import u2.d;
import u2.h;
import v2.h2;
import v2.m0;
import x2.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69397b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f69396a = i14;
        this.f69397b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f69396a) {
            case 0:
                b.C1430b c1430b = (b.C1430b) this.f69397b;
                synchronized (c1430b) {
                    try {
                        if (c1430b.f69403e) {
                            return;
                        }
                        c1430b.f69403e = true;
                        c1430b.f69402d = null;
                        c1430b.f69399a.removeUpdates(c1430b);
                        eh2.b bVar = c1430b.f69404f;
                        if (bVar != null) {
                            c1430b.f69401c.removeCallbacks(bVar);
                            c1430b.f69404f = null;
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 1:
                ((c2) this.f69397b).c(null);
                return;
            case 2:
                h2 h2Var = (h2) this.f69397b;
                m0 m0Var = m0.f175086a;
                h hVar = h2Var.f175039a;
                h2.a aVar = h2.f175038e;
                c cVar = c.MergeIfPossible;
                hVar.f167847b.a().b();
                d dVar = hVar.f167847b;
                dVar.f167836g = null;
                h2Var.l(dVar);
                h.a(hVar, true, cVar);
                return;
            default:
                z2.h2 h2Var2 = (z2.h2) this.f69397b;
                m0 m0Var2 = m0.f175086a;
                if (h2Var2 != null) {
                    b2 b2Var = h2Var2.f201607d;
                    if (b2Var != null) {
                        w0.f157315b.getClass();
                        b2Var.B.setValue(w0.a(w0.f157316c));
                    }
                    b2 b2Var2 = h2Var2.f201607d;
                    if (b2Var2 != null) {
                        w0.f157315b.getClass();
                        b2Var2.A.setValue(w0.a(w0.f157316c));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
