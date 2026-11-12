package qt1;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$refreshSubscriptionStatus$1", f = "TrailDetailsViewModel.kt", l = {454, 460, 461}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k kVar, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f147658b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f147658b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d1, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147657a;
        k kVar = this.f147658b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = kVar.f147673h;
            pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), true, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644667);
            this.f147657a = 1;
            p2Var.k(null, oVarA);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            objJ = obj;
            c80.p pVar = (c80.p) objJ;
            p2 p2Var2 = kVar.f147673h;
            pt1.o oVarA2 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, pVar, pVar instanceof c80.p.a, false, false, false, false, 1048575995);
            this.f147657a = 3;
            p2Var2.k(null, oVarA2);
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
        c80.q qVar = c80.q.GARMIN_TRAILS;
        this.f147657a = 2;
        objJ = j1Var.j(qVar, this);
        if (objJ != aVar) {
            c80.p pVar2 = (c80.p) objJ;
            p2 p2Var3 = kVar.f147673h;
            pt1.o oVarA3 = pt1.o.a((pt1.o) p2Var3.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, pVar2, pVar2 instanceof c80.p.a, false, false, false, false, 1048575995);
            this.f147657a = 3;
            p2Var3.k(null, oVarA3);
        }
        return aVar;
    }
}
