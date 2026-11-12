package w61;

import android.view.View;
import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f183262b;

    public /* synthetic */ v(x xVar, int i14) {
        this.f183261a = i14;
        this.f183262b = xVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f183261a;
        x xVar = this.f183262b;
        switch (i14) {
            case 0:
                int i15 = x.O0;
                ((View) obj).getClass();
                xVar.N0 = !xVar.N0;
                xVar.K0.m(Boolean.TRUE);
                break;
            default:
                fw.m mVar = (fw.m) obj;
                int i16 = x.O0;
                if ((mVar != null ? mVar.f73769b : null) == fw.p.SUCCESS && zb0.n0.h()) {
                    x61.p pVar = new x61.p(false, false, false, false, 15, null);
                    pVar.f189267a = true;
                    ge1.b.T(v1.a(xVar), null, null, new h0(mVar, xVar, pVar, null), 3);
                } else {
                    xVar.f183275k.m(Boolean.FALSE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
