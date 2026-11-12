package a11;

import f5.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p3.p1;
import p5.k0;
import s5.w0;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f284e;

    public /* synthetic */ e(int i14, int i15, e23.l lVar, p1 p1Var) {
        this.f281b = i14;
        this.f282c = i15;
        this.f283d = lVar;
        this.f284e = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String str;
        int i14 = this.f280a;
        Object obj2 = this.f284e;
        int i15 = this.f282c;
        int i16 = this.f281b;
        Object obj3 = this.f283d;
        switch (i14) {
            case 0:
                e23.l lVar = (e23.l) obj3;
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                v21.f fVar = v21.f.f175333a;
                String str2 = l0Var.f188878a.f157138b;
                fVar.getClass();
                String strO = v21.f.o(i16, i15, str2);
                int length = strO.length();
                ((p1) obj2).setValue(new l0(strO, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                Double dV = v21.f.v(strO);
                lVar.invoke(Double.valueOf(dV != null ? dV.doubleValue() : 0.0d));
                return Unit.INSTANCE;
            case 1:
                v1 v1Var = (v1) obj3;
                v1 v1Var2 = (v1) obj2;
                v1.a aVar = (v1.a) obj;
                a3.f.a aVar2 = a3.f.a.f653a;
                if (v1Var != null) {
                    aVar.r(v1Var, 0, i16, 0.0f);
                }
                if (v1Var2 != null) {
                    aVar.r(v1Var2, 0, i15, 0.0f);
                }
                return Unit.INSTANCE;
            case 2:
                p0 p0Var = (p0) obj2;
                v1.a aVar3 = (v1.a) obj;
                aVar3.getClass();
                for (List<v1> list : (ArrayList) obj3) {
                    Iterator it = list.iterator();
                    if (!it.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    int i17 = ((v1) it.next()).f69145b;
                    while (it.hasNext()) {
                        int i18 = ((v1) it.next()).f69145b;
                        if (i17 < i18) {
                            i17 = i18;
                        }
                    }
                    int i19 = 0;
                    for (v1 v1Var3 : list) {
                        v1.a.B(aVar3, v1Var3, i19, p0Var.f105807a);
                        i19 += v1Var3.f69144a + i15;
                    }
                    p0Var.f105807a = i17 + i16 + p0Var.f105807a;
                }
                return Unit.INSTANCE;
            default:
                e23.p pVar = (e23.p) obj3;
                String str3 = (String) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                if (pVar != null && (str = (String) pVar.invoke(Integer.valueOf(i16 + 1), Integer.valueOf(i15))) != null) {
                    str3 = str;
                }
                p5.h0.n(k0Var, str3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(v1 v1Var, int i14, v1 v1Var2, int i15) {
        this.f283d = v1Var;
        this.f281b = i14;
        this.f284e = v1Var2;
        this.f282c = i15;
    }

    public /* synthetic */ e(String str, e23.p pVar, int i14, int i15) {
        this.f283d = pVar;
        this.f281b = i14;
        this.f282c = i15;
        this.f284e = str;
    }

    public /* synthetic */ e(ArrayList arrayList, p0 p0Var, int i14, int i15) {
        this.f283d = arrayList;
        this.f284e = p0Var;
        this.f281b = i14;
        this.f282c = i15;
    }
}
