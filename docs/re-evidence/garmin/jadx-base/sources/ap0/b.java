package ap0;

import e23.p;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f11657e;

    public /* synthetic */ b(String str, String str2, ArrayList arrayList, d dVar, int i14) {
        this.f11653a = i14;
        this.f11654b = str;
        this.f11655c = str2;
        this.f11656d = arrayList;
        this.f11657e = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        boolean z14 = false;
        final int i14 = 1;
        switch (this.f11653a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d.a aVar = d.f11660e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1860205418, new b(this.f11654b, this.f11655c, this.f11656d, this.f11657e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d.a aVar2 = d.f11660e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    final d dVar = this.f11657e;
                    boolean zR = mVar2.r(dVar);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        obj3 = objQ;
                        final boolean z15 = z14 ? 1 : 0;
                        e23.a aVar4 = new e23.a() { // from class: ap0.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i15 = z15;
                                d dVar2 = dVar;
                                switch (i15) {
                                    case 0:
                                        d.a aVar5 = d.f11660e;
                                        dVar2.dismiss();
                                        e eVar = dVar2.f11661a;
                                        if (eVar != null) {
                                            eVar.invoke();
                                        }
                                        break;
                                    default:
                                        d.a aVar6 = d.f11660e;
                                        dVar2.dismiss();
                                        e eVar2 = dVar2.f11662b;
                                        if (eVar2 != null) {
                                            eVar2.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar4);
                        obj3 = aVar4;
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            obj3 = objQ;
                            final int z16 = z14 ? 1 : 0;
                            e23.a aVar5 = new e23.a() { // from class: ap0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i15 = z16;
                                    d dVar2 = dVar;
                                    switch (i15) {
                                        case 0:
                                            d.a aVar6 = d.f11660e;
                                            dVar2.dismiss();
                                            e eVar = dVar2.f11661a;
                                            if (eVar != null) {
                                                eVar.invoke();
                                            }
                                            break;
                                        default:
                                            d.a aVar7 = d.f11660e;
                                            dVar2.dismiss();
                                            e eVar2 = dVar2.f11662b;
                                            if (eVar2 != null) {
                                                eVar2.invoke();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar5);
                            obj3 = aVar5;
                        }
                    }
                    obj3 = objQ;
                    e23.a aVar6 = (e23.a) obj3;
                    boolean zR2 = mVar2.r(dVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        obj4 = objQ2;
                        e23.a aVar7 = new e23.a() { // from class: ap0.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i15 = i14;
                                d dVar2 = dVar;
                                switch (i15) {
                                    case 0:
                                        d.a aVar8 = d.f11660e;
                                        dVar2.dismiss();
                                        e eVar = dVar2.f11661a;
                                        if (eVar != null) {
                                            eVar.invoke();
                                        }
                                        break;
                                    default:
                                        d.a aVar9 = d.f11660e;
                                        dVar2.dismiss();
                                        e eVar2 = dVar2.f11662b;
                                        if (eVar2 != null) {
                                            eVar2.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar7);
                        obj4 = aVar7;
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            obj4 = objQ2;
                            e23.a aVar8 = new e23.a() { // from class: ap0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i15 = i14;
                                    d dVar2 = dVar;
                                    switch (i15) {
                                        case 0:
                                            d.a aVar9 = d.f11660e;
                                            dVar2.dismiss();
                                            e eVar = dVar2.f11661a;
                                            if (eVar != null) {
                                                eVar.invoke();
                                            }
                                            break;
                                        default:
                                            d.a aVar10 = d.f11660e;
                                            dVar2.dismiss();
                                            e eVar2 = dVar2.f11662b;
                                            if (eVar2 != null) {
                                                eVar2.invoke();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar8);
                            obj4 = aVar8;
                        }
                    }
                    obj4 = objQ2;
                    bp0.c.a(this.f11654b, this.f11655c, this.f11656d, aVar6, (e23.a) obj4, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
