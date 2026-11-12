package m72;

import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import lc.j0;
import lc.p0;
import lc.y0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w72.a f117125b;

    public /* synthetic */ n(w72.a aVar, int i14) {
        this.f117124a = i14;
        this.f117125b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f117124a;
        int i15 = 1;
        w72.a aVar = this.f117125b;
        switch (i14) {
            case 0:
                w72.e eVar = (w72.e) obj;
                int i16 = PreviewCatalogActivity.f49781a;
                eVar.getClass();
                aVar.getClass();
                aVar.f183514a.h(new n(aVar, i15), eVar.f183519a);
                break;
            default:
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                j0.a aVar2 = j0.f111790h;
                j0 j0VarK = aVar.f183514a.f111904b.k();
                aVar2.getClass();
                y0 y0VarI = kg.f.i(p0Var, j0.a.a(j0VarK).f111773b.f144346e);
                y0VarI.f111915b = true;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = y0VarI.f111914a;
                p0Var.f111834g = true;
                p0Var.f111829b = true;
                p0Var.f111830c = true;
                break;
        }
        return Unit.INSTANCE;
    }
}
