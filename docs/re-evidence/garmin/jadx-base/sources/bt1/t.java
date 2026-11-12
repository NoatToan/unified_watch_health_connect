package bt1;

import c83.a0;
import f2.q0;
import java.util.List;
import org.slf4j.Logger;
import tn2.i0;
import tn2.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21139a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f21140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f21145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f21146h;

    public /* synthetic */ t(j23.e eVar, i53.c cVar, int i14, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4) {
        this.f21142d = eVar;
        this.f21143e = cVar;
        this.f21141c = i14;
        this.f21140b = lVar;
        this.f21144f = lVar2;
        this.f21145g = lVar3;
        this.f21146h = lVar4;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f21139a;
        Object obj2 = this.f21146h;
        Object obj3 = this.f21145g;
        Object obj4 = this.f21144f;
        Object obj5 = this.f21143e;
        Object obj6 = this.f21142d;
        switch (i14) {
            case 0:
                List list = (List) obj;
                list.getClass();
                Object obj7 = list.get(0);
                obj7.getClass();
                float fFloatValue = ((Float) obj7).floatValue();
                Object obj8 = list.get(1);
                obj8.getClass();
                j23.e eVar = new j23.e(fFloatValue, ((Float) obj8).floatValue());
                return new u((j23.e) obj6, (i53.c) obj5, this.f21141c, this.f21140b, (e23.l) obj4, (e23.l) obj3, (e23.l) obj2, eVar);
            default:
                r0 r0Var = (r0) obj6;
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                a0 a0Var = (a0) obj;
                Logger logger = r0.f165631n;
                a0Var.getClass();
                pn2.a.f138690a.getClass();
                String str4 = pn2.a.e().f138762b;
                int i15 = this.f21141c;
                e23.l lVar = this.f21140b;
                r0.e eVar2 = new r0.e(r0Var, str, str2, str4, str3, new q0(i15, lVar, str, str3, str2, r0Var), new i0(r0Var, 5), lVar);
                r0Var.getClass();
                return eVar2.c(a0Var, (String) obj5);
        }
    }

    public /* synthetic */ t(r0 r0Var, String str, String str2, String str3, String str4, e23.l lVar, int i14) {
        this.f21142d = r0Var;
        this.f21143e = str;
        this.f21144f = str2;
        this.f21145g = str3;
        this.f21146h = str4;
        this.f21140b = lVar;
        this.f21141c = i14;
    }
}
