package qt1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$clearBottomSheetState$1", f = "TrailDetailsViewModel.kt", l = {1107, 1108}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f147744b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f147744b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147743a;
        k kVar = this.f147744b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        p2 p2Var = kVar.f147674i;
        pt1.l lVar = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
        this.f147743a = 1;
        p2Var.k(null, lVar);
        if (Unit.INSTANCE != aVar) {
        }
        return aVar;
        p2 p2Var2 = kVar.f147677l;
        this.f147743a = 2;
        p2Var2.setValue(null);
    }
}
