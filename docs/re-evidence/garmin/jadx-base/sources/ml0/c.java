package ml0;

import androidx.lifecycle.v1;
import d53.w;
import o53.c2;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f119203b;

    public /* synthetic */ c(p pVar, int i14) {
        this.f119202a = i14;
        this.f119203b = pVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f119202a) {
            case 0:
                ((f.a) obj).getClass();
                this.f119203b.z4();
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                p pVar = this.f119203b;
                p2 p2Var = pVar.f119266g;
                p2Var.k(null, l.a((l) p2Var.getValue(), false, str, null, false, 0, 125));
                if (w.J(str)) {
                    pVar.z4();
                } else {
                    c2 c2Var = pVar.f119268i;
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                    pVar.f119268i = ge1.b.T(v1.a(pVar), null, null, new s(str, pVar, null), 3);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p2 p2Var2 = this.f119203b.f119266g;
                p2Var2.k(null, l.a((l) p2Var2.getValue(), zBooleanValue, null, null, false, 0, 126));
                break;
        }
        return Unit.INSTANCE;
    }
}
