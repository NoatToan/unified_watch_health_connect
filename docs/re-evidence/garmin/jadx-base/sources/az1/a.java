package az1;

import androidx.lifecycle.v1;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f13705c;

    public /* synthetic */ a(String str, c cVar, int i14) {
        this.f13703a = i14;
        this.f13704b = str;
        this.f13705c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f13703a;
        final c cVar = this.f13705c;
        String str = this.f13704b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c.a aVar = c.f13708f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-51730484, new a(str, cVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c.a aVar2 = c.f13708f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zR = mVar2.r(cVar);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: az1.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = objArr2;
                                c cVar2 = cVar;
                                switch (i16) {
                                    case 0:
                                        cVar2.f13710b = true;
                                        zy1.d dVarU6 = cVar2.u6();
                                        ge1.b.T(v1.a(dVarU6), null, null, new zy1.i(dVarU6, null), 3);
                                        break;
                                    default:
                                        c.a aVar4 = c.f13708f;
                                        zy1.d dVarU7 = cVar2.u6();
                                        ge1.b.T(v1.a(dVarU7), null, null, new zy1.i(dVarU7, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: az1.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = objArr3;
                                    c cVar2 = cVar;
                                    switch (i16) {
                                        case 0:
                                            cVar2.f13710b = true;
                                            zy1.d dVarU6 = cVar2.u6();
                                            ge1.b.T(v1.a(dVarU6), null, null, new zy1.i(dVarU6, null), 3);
                                            break;
                                        default:
                                            c.a aVar4 = c.f13708f;
                                            zy1.d dVarU7 = cVar2.u6();
                                            ge1.b.T(v1.a(dVarU7), null, null, new zy1.i(dVarU7, null), 3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(cVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: az1.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = i15;
                                c cVar2 = cVar;
                                switch (i16) {
                                    case 0:
                                        cVar2.f13710b = true;
                                        zy1.d dVarU6 = cVar2.u6();
                                        ge1.b.T(v1.a(dVarU6), null, null, new zy1.i(dVarU6, null), 3);
                                        break;
                                    default:
                                        c.a aVar5 = c.f13708f;
                                        zy1.d dVarU7 = cVar2.u6();
                                        ge1.b.T(v1.a(dVarU7), null, null, new zy1.i(dVarU7, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: az1.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i15;
                                    c cVar2 = cVar;
                                    switch (i16) {
                                        case 0:
                                            cVar2.f13710b = true;
                                            zy1.d dVarU6 = cVar2.u6();
                                            ge1.b.T(v1.a(dVarU6), null, null, new zy1.i(dVarU6, null), 3);
                                            break;
                                        default:
                                            c.a aVar5 = c.f13708f;
                                            zy1.d dVarU7 = cVar2.u6();
                                            ge1.b.T(v1.a(dVarU7), null, null, new zy1.i(dVarU7, null), 3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    yy1.a.a(str, aVar4, (e23.a) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
