package wc;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwc/n;", "Landroid/window/OnBackAnimationCallback;", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f184261a;

    public n(o oVar) {
        this.f184261a = oVar;
    }

    public final void onBackCancelled() {
        o oVar = this.f184261a;
        c cVar = oVar.f184242a;
        if (cVar == null) {
            vb.h.z("This input is not added to any dispatcher.");
            return;
        }
        if (!oVar.f184243b) {
            cVar.e(oVar, null);
        }
        cVar.d();
        if (cVar.g()) {
            i iVar = cVar.f184229d;
            iVar.getClass();
            if (oVar.equals(iVar.f184251h) && -1 == iVar.f184250g) {
                e<?> eVarC = iVar.f184249f;
                if (eVarC == null) {
                    eVarC = iVar.c(-1);
                }
                iVar.f184249f = null;
                iVar.f184250g = 0;
                iVar.f184251h = null;
                if (eVarC != null) {
                    eVarC.f184236d = j.b.f184258a;
                    eVarC.c();
                }
                iVar.f184244a.setValue(j.b.f184258a);
            }
        }
        oVar.f184243b = false;
    }

    public final void onBackInvoked() {
        this.f184261a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        b bVarA = k.a(backEvent);
        o oVar = this.f184261a;
        oVar.getClass();
        c cVar = oVar.f184242a;
        if (cVar == null) {
            vb.h.z("This input is not added to any dispatcher.");
            return;
        }
        if (oVar.f184243b) {
            cVar.d();
            if (cVar.g()) {
                i iVar = cVar.f184229d;
                iVar.getClass();
                if (oVar.equals(iVar.f184251h) && -1 == iVar.f184250g) {
                    e<?> eVarC = iVar.f184249f;
                    if (eVarC == null) {
                        eVarC = iVar.c(-1);
                    }
                    if (eVarC != null) {
                        eVarC.f184236d = new j.c(bVarA, -1);
                        eVarC.e(bVarA);
                    }
                    iVar.f184244a.k(null, new j.c(bVarA, -1));
                }
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        b bVarA = k.a(backEvent);
        o oVar = this.f184261a;
        oVar.getClass();
        c cVar = oVar.f184242a;
        if (cVar == null) {
            vb.h.z("This input is not added to any dispatcher.");
        } else {
            if (oVar.f184243b) {
                return;
            }
            cVar.e(oVar, bVarA);
            oVar.f184243b = true;
        }
    }
}
