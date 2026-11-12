package b21;

import java.util.ArrayList;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.t f14599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3 f14600c;

    public /* synthetic */ d(u21.t tVar, p3.p1 p1Var, int i14) {
        this.f14598a = i14;
        this.f14599b = tVar;
        this.f14600c = p1Var;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Iterable, java.lang.Object] */
    @Override // e23.a
    public final Object invoke() {
        s21.i iVar;
        switch (this.f14598a) {
            case 0:
                u21.t tVar = this.f14599b;
                Integer num = tVar.f168131a;
                s21.e eVar = tVar.f168132b;
                Object obj = tVar.f168142l;
                p3.x3 x3Var = this.f14600c;
                return ParametersHolderKt.parametersOf(num, eVar, obj, ((u21.s) x3Var.getF182175a()).f168119h.f156100a, ((u21.s) x3Var.getF182175a()).f168120i.f156100a, ((u21.s) x3Var.getF182175a()).f168114c);
            default:
                u21.t tVar2 = this.f14599b;
                s21.c cVar = ((u21.s) tVar2.f168140j.getValue()).f168114c;
                ?? r14 = tVar2.f168142l;
                ArrayList arrayList = new ArrayList();
                for (q01.e eVar2 : r14) {
                    if (cVar != s21.c.TIMELINE || eVar2.f141996d) {
                        eVar2.getClass();
                        iVar = new s21.i(eVar2.f141993a, eVar2.f141995c, eVar2.f141998f, eVar2.f141997e);
                    } else {
                        iVar = null;
                    }
                    if (iVar != null) {
                        arrayList.add(iVar);
                    }
                }
                return ParametersHolderKt.parametersOf(arrayList, Boolean.valueOf(((u21.s) this.f14600c.getF182175a()).f168114c == s21.c.CLASSIC));
        }
    }
}
