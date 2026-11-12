package z21;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w01.d f202005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f202006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w01.c f202007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f202008e;

    public /* synthetic */ g(w01.d dVar, i iVar, w01.c cVar, boolean z14, int i14) {
        this.f202004a = i14;
        this.f202005b = dVar;
        this.f202006c = iVar;
        this.f202007d = cVar;
        this.f202008e = z14;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        boolean z14 = false;
        final int i14 = 1;
        switch (this.f202004a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = i.f202012d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2092053570, new g(this.f202005b, this.f202006c, this.f202007d, this.f202008e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = i.f202012d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    w01.d dVar = this.f202005b;
                    final i iVar = this.f202006c;
                    final w01.c cVar = this.f202007d;
                    m.a aVar = m.f135153a;
                    if (dVar != null) {
                        mVar2.C(-97394422);
                        boolean zR = mVar2.r(iVar) | mVar2.r(cVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            obj4 = objQ;
                            final boolean z15 = z14 ? 1 : 0;
                            e23.a aVar2 = new e23.a() { // from class: z21.h
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (z15) {
                                        case 0:
                                            iVar.f202015c.invoke(cVar);
                                            break;
                                        default:
                                            iVar.f202015c.invoke(cVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar2);
                            obj4 = aVar2;
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                obj4 = objQ;
                                final int z16 = z14 ? 1 : 0;
                                e23.a aVar3 = new e23.a() { // from class: z21.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (z16) {
                                            case 0:
                                                iVar.f202015c.invoke(cVar);
                                                break;
                                            default:
                                                iVar.f202015c.invoke(cVar);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(aVar3);
                                obj4 = aVar3;
                            }
                        }
                        obj4 = objQ;
                        f.c(dVar, (e23.a) obj4, mVar2, 0);
                        mVar2.f();
                    } else if (this.f202008e) {
                        mVar2.C(-97028250);
                        boolean zR2 = mVar2.r(iVar) | mVar2.r(cVar);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            obj3 = objQ2;
                            e23.a aVar4 = new e23.a() { // from class: z21.h
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            iVar.f202015c.invoke(cVar);
                                            break;
                                        default:
                                            iVar.f202015c.invoke(cVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar4);
                            obj3 = aVar4;
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                obj3 = objQ2;
                                e23.a aVar5 = new e23.a() { // from class: z21.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i14) {
                                            case 0:
                                                iVar.f202015c.invoke(cVar);
                                                break;
                                            default:
                                                iVar.f202015c.invoke(cVar);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(aVar5);
                                obj3 = aVar5;
                            }
                        }
                        obj3 = objQ2;
                        f.d((e23.a) obj3, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-96805515);
                        f.b(iVar.f202014b, mVar2, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
