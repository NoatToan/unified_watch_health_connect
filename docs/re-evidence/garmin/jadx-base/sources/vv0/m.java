package vv0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p3.x1;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.y f180462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f180463c;

    public /* synthetic */ m(int i14, e23.a aVar, lc.y yVar) {
        this.f180461a = i14;
        this.f180462b = yVar;
        this.f180463c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006f  */
    /* JADX WARN: Code duplicated, block: B:20:0x00de  */
    /* JADX WARN: Code duplicated, block: B:30:0x014d  */
    /* JADX WARN: Code duplicated, block: B:40:0x01bb  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f180461a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f180463c;
        lc.y yVar = this.f180462b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var = p3.n.f135158a;
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(nw0.g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
                mVar.R();
                nw0.g gVar = (nw0.g) u1VarResolveViewModel;
                boolean zR = mVar.r(yVar) | mVar.B(aVar2);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new gl1.n(1, aVar2, yVar);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new gl1.n(1, aVar2, yVar);
                        mVar.K(objQ);
                    }
                }
                nw0.e.a(gVar, (e23.l) objQ, mVar, 0);
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var2 = p3.n.f135158a;
                mVar2.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar2);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(nw0.a0.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar2, 0), null);
                mVar2.R();
                nw0.a0 a0Var = (nw0.a0) u1VarResolveViewModel2;
                boolean zR2 = mVar2.r(yVar) | mVar2.B(aVar2);
                Object objQ2 = mVar2.q();
                if (zR2) {
                    objQ2 = new gl1.n(2, aVar2, yVar);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new gl1.n(2, aVar2, yVar);
                        mVar2.K(objQ2);
                    }
                }
                nw0.z.a(a0Var, (e23.l) objQ2, mVar2, 0);
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var3 = p3.n.f135158a;
                mVar3.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar3);
                if (viewModelStoreOwnerA3 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(nw0.r.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar3, 0), null);
                mVar3.R();
                nw0.r rVar = (nw0.r) u1VarResolveViewModel3;
                boolean zR3 = mVar3.r(yVar) | mVar3.B(aVar2);
                Object objQ3 = mVar3.q();
                if (zR3) {
                    objQ3 = new gl1.n(6, aVar2, yVar);
                    mVar3.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new gl1.n(6, aVar2, yVar);
                        mVar3.K(objQ3);
                    }
                }
                nw0.q.e(rVar, (e23.l) objQ3, mVar3, 0);
                return Unit.INSTANCE;
            default:
                p3.m mVar4 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var4 = p3.n.f135158a;
                mVar4.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar4);
                if (viewModelStoreOwnerA4 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(nw0.g.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar4, 0), null);
                mVar4.R();
                nw0.g gVar2 = (nw0.g) u1VarResolveViewModel4;
                boolean zR4 = mVar4.r(yVar) | mVar4.B(aVar2);
                Object objQ4 = mVar4.q();
                if (zR4) {
                    objQ4 = new gl1.n(5, aVar2, yVar);
                    mVar4.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new gl1.n(5, aVar2, yVar);
                        mVar4.K(objQ4);
                    }
                }
                nw0.e.a(gVar2, (e23.l) objQ4, mVar4, 0);
                return Unit.INSTANCE;
        }
    }
}
