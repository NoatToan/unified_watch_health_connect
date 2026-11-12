package qt1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$setHighlightedReviewId$1", f = "TrailDetailsViewModel.kt", l = {1272}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f147752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(k kVar, long j8, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f147751b = kVar;
        this.f147752c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n0(this.f147751b, this.f147752c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147750a;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = this.f147751b.f147676k;
            pt1.a0 a0VarA = pt1.a0.a((pt1.a0) p2Var.getValue(), false, false, false, null, null, null, null, new Long(this.f147752c), null, false, false, 1919);
            this.f147750a = 1;
            p2Var.k(null, a0VarA);
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
        return Unit.INSTANCE;
    }
}
