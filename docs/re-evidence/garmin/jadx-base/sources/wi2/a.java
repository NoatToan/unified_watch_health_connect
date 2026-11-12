package wi2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class a implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qi2.c f185586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f185587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<ti2.b, Unit> f185588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<ti2.c, Unit> f185589d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(qi2.c cVar, h4.r rVar, e23.l<? super ti2.b, Unit> lVar, e23.l<? super ti2.c, Unit> lVar2) {
        this.f185586a = cVar;
        this.f185587b = rVar;
        this.f185588c = lVar;
        this.f185589d = lVar2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        if ((num.intValue() & 3) == 2 && mVar2.b()) {
            mVar2.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
            mVar2.C(-1633490746);
            qi2.c cVar = this.f185586a;
            boolean zB = mVar2.B(cVar) | mVar2.r(context);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new w02.b(15, cVar, context);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w02.b(15, cVar, context);
                    mVar2.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            mVar2.f();
            mVar2.L(419377738);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            t0 t0Var = s0.f105811a;
            k23.d dVarB = t0Var.b(e.class);
            u9.b bVar = new u9.b();
            bVar.a(t0Var.b(e.class), lVar);
            u1 u1VarA = v9.b.a(dVarB, viewModelStoreOwnerA, null, bVar.b(), viewModelStoreOwnerA instanceof y ? ((y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, mVar2);
            mVar2.R();
            b.c(cVar.f144951d, (e) u1VarA, this.f185587b, this.f185588c, this.f185589d, mVar2, 0);
        }
        return Unit.INSTANCE;
    }
}
