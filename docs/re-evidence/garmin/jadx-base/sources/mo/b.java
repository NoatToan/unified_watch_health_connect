package mo;

import e23.l;
import e23.p;
import java.util.HashSet;
import java.util.List;
import mh1.x;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f119849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f119850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashSet f119851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f119853f;

    public /* synthetic */ b(boolean z14, List list, HashSet hashSet, boolean z15, a aVar, int i14) {
        this.f119848a = i14;
        this.f119849b = z14;
        this.f119850c = list;
        this.f119851d = hashSet;
        this.f119852e = z15;
        this.f119853f = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f119848a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i14 = f.f119854a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1599365415, new b(this.f119849b, this.f119850c, this.f119851d, this.f119852e, this.f119853f, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i15 = f.f119854a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    i iVar = new i(true, this.f119849b, i53.a.j(this.f119850c), i53.a.l(this.f119851d), this.f119852e, false, 32, null);
                    a aVar = this.f119853f;
                    boolean zR = mVar2.r(aVar);
                    Object objQ = mVar2.q();
                    m.a aVar2 = m.f135153a;
                    if (zR) {
                        objQ = new c(aVar);
                        mVar2.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new c(aVar);
                            mVar2.K(objQ);
                        }
                    }
                    l lVar = (l) ((k23.g) objQ);
                    boolean zR2 = mVar2.r(aVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new x(aVar, 4);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new x(aVar, 4);
                            mVar2.K(objQ2);
                        }
                    }
                    l lVar2 = (l) objQ2;
                    boolean zR3 = mVar2.r(aVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new d(aVar);
                        mVar2.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new d(aVar);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar3 = (e23.a) ((k23.g) objQ3);
                    boolean zR4 = mVar2.r(aVar);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        objQ4 = new e(aVar);
                        mVar2.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new e(aVar);
                            mVar2.K(objQ4);
                        }
                    }
                    h.a(iVar, lVar, lVar2, aVar3, (e23.a) ((k23.g) objQ4), null, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
