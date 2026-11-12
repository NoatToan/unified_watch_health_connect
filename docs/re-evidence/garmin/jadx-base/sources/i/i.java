package i;

import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.i1;
import androidx.core.view.s0;

/* JADX INFO: loaded from: classes.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f86635a;

    public class a extends i1 {
        public a() {
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public final void a() {
            i.this.f86635a.f86594x.setVisibility(0);
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public final void onAnimationEnd() {
            i iVar = i.this;
            iVar.f86635a.f86594x.setAlpha(1.0f);
            f fVar = iVar.f86635a;
            fVar.A.d(null);
            fVar.A = null;
        }
    }

    public i(f fVar) {
        this.f86635a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        f fVar = this.f86635a;
        fVar.f86595y.showAtLocation(fVar.f86594x, 55, 0, 0);
        g1 g1Var = fVar.A;
        if (g1Var != null) {
            g1Var.b();
        }
        if (!fVar.C || (viewGroup = fVar.D) == null || !viewGroup.isLaidOut()) {
            fVar.f86594x.setAlpha(1.0f);
            fVar.f86594x.setVisibility(0);
            return;
        }
        fVar.f86594x.setAlpha(0.0f);
        g1 g1VarC = s0.c(fVar.f86594x);
        g1VarC.a(1.0f);
        fVar.A = g1VarC;
        g1VarC.d(new a());
    }
}
