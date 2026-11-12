package h62;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.x1;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f82226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f82227c;

    public /* synthetic */ g(boolean z14, e23.a aVar) {
        this.f82225a = 2;
        this.f82227c = aVar;
        this.f82226b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0049  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f82225a;
        boolean z14 = this.f82226b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    if (z14) {
                        mVar.C(1728684312);
                        k.h(y.Q(mVar, R.string.workout_lbl_find_workout), null, 0L, this.f82227c, mVar, 0, 6);
                        mVar.f();
                    } else {
                        mVar.C(1728864019);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ox0.c) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    mVar2.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(rx0.b.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), null);
                    mVar2.R();
                    oe2.f.a((rx0.b) u1VarResolveViewModel, z14, this.f82227c, mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                r rVar = (r) obj;
                p3.m mVar3 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                mVar3.C(-196777734);
                x1 x1Var3 = p3.n.f135158a;
                long j8 = ((t2) mVar3.A(u2.f201804a)).f201802a;
                boolean zL = mVar3.l(j8);
                e23.a aVar = this.f82227c;
                boolean zB = zL | mVar3.B(aVar);
                boolean z15 = this.f82226b;
                boolean zH = zB | mVar3.h(z15);
                Object objQ = mVar3.q();
                if (zH) {
                    objQ = new ba1.b(j8, aVar, z15, 3);
                    mVar3.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ba1.b(j8, aVar, z15, 3);
                        mVar3.K(objQ);
                    }
                }
                r rVarE = l4.k.e(rVar, (e23.l) objQ);
                mVar3.f();
                return rVarE;
        }
    }

    public /* synthetic */ g(boolean z14, e23.a aVar, int i14) {
        this.f82225a = i14;
        this.f82226b = z14;
        this.f82227c = aVar;
    }
}
