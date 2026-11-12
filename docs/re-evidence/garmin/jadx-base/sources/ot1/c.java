package ot1;

import androidx.lifecycle.v1;
import o53.c2;
import o53.s0;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.a f133782b;

    public /* synthetic */ c(qt1.a aVar, int i14) {
        this.f133781a = i14;
        this.f133782b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        int i14 = this.f133781a;
        qt1.a aVar = this.f133782b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                e eVar = e.f133785a;
                str.getClass();
                c2 c2Var = aVar.f147508w;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                w9.a aVarA = v1.a(aVar);
                x53.c cVar = s0.f129406a;
                aVar.f147508w = ge1.b.T(aVarA, x53.b.f189152a, null, new qt1.e(str, zBooleanValue, aVar, null), 2);
                break;
            default:
                String str2 = (String) obj;
                ((Boolean) obj2).getClass();
                n nVar = n.f133806a;
                str2.getClass();
                vs1.t tVar = aVar.f147506t;
                tVar.getClass();
                p2 p2Var = tVar.f179900i;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, pt1.h.a((pt1.h) value, false, false, null, null, false, str2, 31)));
                tVar.b();
                break;
        }
        return Unit.INSTANCE;
    }
}
