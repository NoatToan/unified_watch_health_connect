package c42;

import java.util.ArrayList;
import java.util.List;
import l72.j0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f24384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f24385c;

    public /* synthetic */ e0(e23.l lVar, List list) {
        this.f24383a = 6;
        this.f24385c = lVar;
        this.f24384b = list;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        List list;
        switch (this.f24383a) {
            case 0:
                ((Integer) obj2).getClass();
                h0.b(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                e70.c.a(this.f24384b, this.f24385c, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 2:
                List list2 = (List) obj;
                int iIntValue = ((Integer) obj2).intValue();
                list2.getClass();
                g21.v vVar = null;
                if (((j0) list2.get(iIntValue)).f111076e && (list = this.f24384b) != null) {
                    vVar = (g21.v) p13.h0.e0(iIntValue, list);
                }
                this.f24385c.invoke(vVar);
                return Unit.INSTANCE;
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                ((List) obj).getClass();
                this.f24385c.invoke((g21.l) this.f24384b.get(iIntValue2));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ha0.f.a(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                int iIntValue3 = ((Integer) obj2).intValue();
                ((List) obj).getClass();
                eo.b bVar = (eo.b) p13.h0.e0(iIntValue3, this.f24384b);
                if (bVar == null) {
                    return Unit.INSTANCE;
                }
                this.f24385c.invoke(bVar);
                return Unit.INSTANCE;
            case 6:
                List list3 = (List) obj;
                ((Integer) obj2).intValue();
                list3.getClass();
                int i14 = 0;
                for (Object obj3 : list3) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    if (((j0) obj3).f111076e) {
                        this.f24385c.invoke(((j11.a) this.f24384b.get(i14)).name());
                    }
                    i14 = i15;
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ll1.i.b(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                mk1.f.d(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                List list4 = (List) obj;
                ((Integer) obj2).intValue();
                list4.getClass();
                ArrayList arrayList = new ArrayList();
                int i16 = 0;
                for (Object obj4 : this.f24384b) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    if (((j0) list4.get(i16)).f111076e) {
                        arrayList.add(obj4);
                    }
                    i16 = i17;
                }
                this.f24385c.invoke(arrayList);
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                n40.i.a(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                qn1.a.d(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                qn1.a.c(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                qn1.a.c(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                qn1.a.d(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                qn1.c.b(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                qn1.c.a(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                qn1.c.a(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                List list5 = (List) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                list5.getClass();
                this.f24385c.invoke(!((j0) list5.get(iIntValue4)).f111076e ? null : (rl1.i) p13.h0.e0(iIntValue4, this.f24384b));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                rr0.q.a(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                rr0.q.a(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                rr0.u.e(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                rr0.u.e(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                rr0.y.b(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                rr0.y.b(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ur2.a.a(this.f24384b, this.f24385c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e0(e23.l lVar, int i14, int i15, List list) {
        this.f24383a = i15;
        this.f24384b = list;
        this.f24385c = lVar;
    }

    public /* synthetic */ e0(List list, e23.l lVar, int i14) {
        this.f24383a = i14;
        this.f24384b = list;
        this.f24385c = lVar;
    }
}
