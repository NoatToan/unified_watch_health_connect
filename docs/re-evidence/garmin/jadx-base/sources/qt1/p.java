package qt1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$clearSuggestionDialog$1", f = "TrailDetailsViewModel.kt", l = {731}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f147761b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f147761b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147760a;
        k kVar = this.f147761b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = kVar.f147673h;
            pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741791);
            this.f147760a = 1;
            p2Var.k(null, oVarA);
            if (Unit.INSTANCE == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        kVar.I4();
        return Unit.INSTANCE;
    }
}
