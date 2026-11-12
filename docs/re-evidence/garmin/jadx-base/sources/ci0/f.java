package ci0;

import b11.v;
import b63.u;
import e23.l;
import f5.c0;
import f5.d0;
import g6.m;
import g6.n;
import gg1.o0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f27642b;

    public /* synthetic */ f(l lVar, int i14) {
        this.f27641a = i14;
        this.f27642b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f27641a) {
            case 0:
                l lVar = this.f27642b;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                lVar.invoke(bool);
                return Unit.INSTANCE;
            case 1:
                l lVar2 = this.f27642b;
                ((f.a) obj).getClass();
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 2:
                l lVar3 = this.f27642b;
                String str = (String) obj;
                str.getClass();
                lVar3.invoke(bg0.a.b.valueOf(str));
                return Unit.INSTANCE;
            case 3:
                l lVar4 = this.f27642b;
                Integer num = (Integer) obj;
                num.intValue();
                lVar4.invoke(num);
                return Unit.INSTANCE;
            case 4:
                l lVar5 = this.f27642b;
                Long l14 = (Long) obj;
                l14.longValue();
                lVar5.invoke(l14);
                return Unit.INSTANCE;
            case 5:
                l lVar6 = this.f27642b;
                List list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    vb.h.z("non-zero remainder");
                    return null;
                }
                for (int i14 = 0; i14 < list.size(); i14 += 2) {
                    Object obj2 = list.get(i14);
                    obj2.getClass();
                    linkedHashMap.put((String) obj2, list.get(i14 + 1));
                }
                return lVar6.invoke(linkedHashMap);
            case 6:
                l lVar7 = this.f27642b;
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                lVar7.invoke(m.a(c0Var.a()));
                return Unit.INSTANCE;
            case 7:
                l lVar8 = this.f27642b;
                String str2 = (String) obj;
                str2.getClass();
                lVar8.invoke(str2);
                return Unit.INSTANCE;
            case 8:
                l lVar9 = this.f27642b;
                Float f14 = (Float) obj;
                f14.floatValue();
                lVar9.invoke(f14);
                return Unit.INSTANCE;
            case 9:
                l lVar10 = this.f27642b;
                c0 c0Var2 = (c0) obj;
                c0Var2.getClass();
                lVar10.invoke(g8.i.g(d0.d(c0Var2), n.c(c0Var2.a())));
                return Unit.INSTANCE;
            case 10:
                l lVar11 = this.f27642b;
                List list2 = (List) obj;
                list2.getClass();
                lVar11.invoke(list2);
                return Unit.INSTANCE;
            case 11:
                l lVar12 = this.f27642b;
                String str3 = (String) obj;
                str3.getClass();
                lVar12.invoke(str3);
                return Unit.INSTANCE;
            case 12:
                l lVar13 = this.f27642b;
                String str4 = (String) obj;
                str4.getClass();
                lVar13.invoke(str4);
                return Unit.INSTANCE;
            case 13:
                l lVar14 = this.f27642b;
                String str5 = (String) obj;
                str5.getClass();
                lVar14.invoke(str5);
                return Unit.INSTANCE;
            case 14:
                l lVar15 = this.f27642b;
                v vVar = (v) obj;
                vVar.getClass();
                lVar15.invoke(vVar);
                return Unit.INSTANCE;
            case 15:
                l lVar16 = this.f27642b;
                u uVar = (u) obj;
                uVar.getClass();
                lVar16.invoke(uVar);
                return Unit.INSTANCE;
            case 16:
                l lVar17 = this.f27642b;
                String str6 = (String) obj;
                str6.getClass();
                lVar17.invoke(new n50.f.i(str6));
                return Unit.INSTANCE;
            case 17:
                this.f27642b.invoke(new n50.f.h(((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            case 18:
                this.f27642b.invoke(new n50.f.C2321f(((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            case 19:
                this.f27642b.invoke(new n50.f.g(((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            case 20:
                l lVar18 = this.f27642b;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                lVar18.invoke(bool2);
                return Unit.INSTANCE;
            case 21:
                l lVar19 = this.f27642b;
                vs.e eVar = (vs.e) obj;
                eVar.getClass();
                lVar19.invoke(eVar);
                return Unit.INSTANCE;
            case 22:
                l lVar20 = this.f27642b;
                vs.e eVar2 = (vs.e) obj;
                eVar2.getClass();
                lVar20.invoke(eVar2);
                return Unit.INSTANCE;
            case 23:
                l lVar21 = this.f27642b;
                pt1.l lVar22 = (pt1.l) obj;
                lVar22.getClass();
                lVar21.invoke(lVar22);
                return Unit.INSTANCE;
            case 24:
                f4.f fVar = (f4.f) this.f27642b.invoke((f4.j) obj);
                synchronized (f4.l.f68775c) {
                    f4.l.f68776d = f4.l.f68776d.e(fVar.getF68737b());
                    Unit unit = Unit.INSTANCE;
                }
                return fVar;
            case 25:
                l lVar23 = this.f27642b;
                String str7 = (String) obj;
                str7.getClass();
                lVar23.invoke(str7);
                return Unit.INSTANCE;
            case 26:
                l lVar24 = this.f27642b;
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                lVar24.invoke(bool3);
                return Unit.INSTANCE;
            case 27:
                l lVar25 = this.f27642b;
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                lVar25.invoke(bool4);
                return Unit.INSTANCE;
            case 28:
                this.f27642b.invoke(Boolean.valueOf(((Integer) obj).intValue() == 1));
                return Unit.INSTANCE;
            default:
                l lVar26 = this.f27642b;
                int iIntValue = ((Integer) obj).intValue();
                w13.c cVar = o0.f77290i;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : cVar) {
                    if (((o0) obj3) != o0.STATUTE_UK) {
                        arrayList.add(obj3);
                    }
                }
                o0 o0Var = (o0) h0.e0(iIntValue, arrayList);
                if (o0Var != null) {
                    lVar26.invoke(o0Var);
                }
                return Unit.INSTANCE;
        }
    }
}
