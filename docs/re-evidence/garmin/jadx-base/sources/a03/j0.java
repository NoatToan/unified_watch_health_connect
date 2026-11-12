package a03;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.k3;
import c2.l1;
import c2.n3;
import c2.q3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class j0 implements e23.q<h4.r, p3.m, Integer, h4.r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f109a;

    public j0(p pVar) {
        this.f109a = pVar;
    }

    @Override // e23.q
    public final h4.r invoke(h4.r rVar, p3.m mVar, Integer num) {
        h4.r rVarC = rVar;
        p3.m mVar2 = mVar;
        num.intValue();
        rVarC.getClass();
        mVar2.L(-1147293978);
        int i14 = k3.f22728a;
        l1 l1VarC = n3.c(q3.d(mVar2), mVar2);
        float f22737b = l1VarC.getF22737b() + l1VarC.getF22739d();
        g6.f.a aVar = g6.f.f75994b;
        mVar2.L(1220123079);
        float f14 = ((Configuration) mVar2.A(AndroidCompositionLocals_androidKt.f6041a)).screenHeightDp;
        mVar2.R();
        p pVar = this.f109a;
        float f15 = ((1 - pVar.f153d.f127a) * f14) - f22737b;
        mVar2.L(-1768950116);
        boolean z14 = pVar.c() == y.FullyExpanded && lg.d.M(f15, mVar2) > 0.0f;
        mVar2.R();
        if (z14) {
            rVarC = c2.l.C(h4.r.S, 0.0f, 0.0f, 0.0f, f15, 7);
        }
        mVar2.R();
        return rVarC;
    }
}
