package bv1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p13.j0;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f21452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21453c;

    public /* synthetic */ w(List list, boolean z14, int i14) {
        this.f21451a = 0;
        this.f21452b = list;
        this.f21453c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f21451a;
        List arrayList = null;
        boolean z14 = this.f21453c;
        List list = this.f21452b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                y.a(list, z14, (p3.m) obj, p0.t(1));
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (list != null) {
                        arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            p13.d0.v(arrayList, ((g21.y) it.next()).f75537c);
                        }
                    }
                    if (arrayList == null) {
                        arrayList = j0.f134944a;
                    }
                    i53.c cVarE = i53.a.e(arrayList);
                    if (cVarE.isEmpty() || !z14) {
                        mVar.C(-2091545963);
                        mVar.f();
                    } else {
                        mVar.C(-2091597857);
                        j82.e.h(cVarE, null, null, mVar, 0, 6);
                        mVar.f();
                    }
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (list != null) {
                        arrayList = new ArrayList();
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            p13.d0.v(arrayList, ((g21.y) it3.next()).f75537c);
                        }
                    }
                    if (arrayList == null) {
                        arrayList = j0.f134944a;
                    }
                    i53.c cVarE2 = i53.a.e(arrayList);
                    if (cVarE2.isEmpty() || !z14) {
                        mVar2.C(-1474648917);
                        mVar2.f();
                    } else {
                        mVar2.C(-1474700811);
                        j82.e.h(cVarE2, null, null, mVar2, 0, 6);
                        mVar2.f();
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ w(List list, boolean z14, int i14, byte b14) {
        this.f21451a = i14;
        this.f21452b = list;
        this.f21453c = z14;
    }
}
