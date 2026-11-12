package i;

import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.i1;
import androidx.core.view.s0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class j extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f86637a;

    public j(f fVar) {
        this.f86637a = fVar;
    }

    @Override // androidx.core.view.i1, androidx.core.view.h1
    public final void a() {
        f fVar = this.f86637a;
        fVar.f86594x.setVisibility(0);
        if (fVar.f86594x.getParent() instanceof View) {
            View view2 = (View) fVar.f86594x.getParent();
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.requestApplyInsets();
        }
    }

    @Override // androidx.core.view.i1, androidx.core.view.h1
    public final void onAnimationEnd() {
        f fVar = this.f86637a;
        fVar.f86594x.setAlpha(1.0f);
        fVar.A.d(null);
        fVar.A = null;
    }
}
