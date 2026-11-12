package ap;

import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import fw.m;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import p005kotlin.Unit;
import p13.j0;
import ps.d1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f11580c;

    public /* synthetic */ a(d dVar, w0 w0Var, int i14) {
        this.f11578a = i14;
        this.f11579b = dVar;
        this.f11580c = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int size;
        Object obj2;
        int i14 = this.f11578a;
        w0 w0Var = this.f11580c;
        d dVar = this.f11579b;
        switch (i14) {
            case 0:
                List list = (List) obj;
                if (list != null) {
                    yo.e eVar = dVar.f11593e;
                    y0 y0Var = dVar.f11597i;
                    List<d1> listD = eVar.f198239i.d();
                    Integer num = (Integer) y0Var.d();
                    if (listD == null || num == null) {
                        size = -1;
                    } else if (num.intValue() < 0) {
                        size = 0;
                    } else {
                        size = num.intValue() >= listD.size() ? listD.size() - 1 : num.intValue();
                    }
                    Integer num2 = (Integer) y0Var.d();
                    if (num2 != null && num2.intValue() == size) {
                        w0Var.j(new p(list, Integer.valueOf(size)));
                    } else {
                        dVar.f11596h.m(Integer.valueOf(size));
                    }
                } else {
                    int i15 = d.f11588o;
                }
                break;
            case 1:
                Integer num3 = (Integer) obj;
                List<d1> listD2 = dVar.f11593e.f198239i.d();
                if (num3 != null && listD2 != null) {
                    w0Var.j(new p(listD2, num3));
                }
                break;
            default:
                m mVar = (m) obj;
                int i16 = d.f11588o;
                aq.d dVar2 = (aq.d) mVar.f73770c;
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = dVar2 != null ? dVar2.f11879a : null;
                if (dVar2 == null || (obj2 = dVar2.f11896r) == null) {
                    obj2 = j0.f134944a;
                }
                fw.p pVar = mVar.f73769b;
                fw.p pVar2 = fw.p.SUCCESS;
                if (pVar == pVar2 && hVar != null) {
                    dVar.f11602n = hVar;
                    w0Var.n(dVar.f11593e.e(v1.a(dVar), hVar), new d.c(new a4.a(w0Var, 5, dVar, obj2)));
                } else if (pVar == fw.p.ERROR || pVar == pVar2) {
                    w0Var.j(new ArrayList());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
