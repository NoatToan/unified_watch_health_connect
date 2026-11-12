package fv0;

import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import p005kotlin.Unit;
import r53.p2;
import wd2.a2;
import wd2.m;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f73637b;

    public /* synthetic */ e(g gVar, int i14) {
        this.f73636a = i14;
        this.f73637b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        g3 g3VarD;
        ou0.f fVar;
        Object value2;
        ou0.e eVarA;
        switch (this.f73636a) {
            case 0:
                boolean z14 = !((Boolean) obj).booleanValue();
                g gVar = this.f73637b;
                p2 p2Var = gVar.f73644d;
                do {
                    value = p2Var.getValue();
                    g3VarD = (g3) value;
                    ou0.e eVar = (ou0.e) g3VarD.f35301b;
                    ou0.f fVarA = (eVar == null || (fVar = eVar.f133979b) == null) ? null : ou0.f.a(fVar, null, null, null, Boolean.valueOf(z14), null, 55);
                    ou0.e eVar2 = (ou0.e) g3VarD.f35301b;
                    ou0.e eVarA2 = eVar2 != null ? ou0.e.a(eVar2, null, fVarA, null, null, 29) : null;
                    if (eVarA2 != null) {
                        g3.f35298f.getClass();
                        g3VarD = g3.a.d(eVarA2);
                    }
                } while (!p2Var.b(value, g3VarD));
                m.i(gVar.f73641a, new a2(null, new ge2.e(null, null, Boolean.valueOf(z14), null, null, null, null, 123, null), 1, null));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                p2 p2Var2 = this.f73637b.f73644d;
                do {
                    value2 = p2Var2.getValue();
                    g3.a aVar = g3.f35298f;
                    ou0.e eVar3 = (ou0.e) ((g3) value2).f35301b;
                    eVarA = eVar3 != null ? ou0.e.a(eVar3, str, null, null, null, 30) : null;
                    aVar.getClass();
                } while (!p2Var2.b(value2, g3.a.d(eVarA)));
                break;
        }
        return Unit.INSTANCE;
    }
}
