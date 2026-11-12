package qt1;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$reorderReviewPhotos$1", f = "TrailDetailsViewModel.kt", l = {1041}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f147664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f147665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k kVar, int i14, int i15, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f147663b = kVar;
        this.f147664c = i14;
        this.f147665d = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f147663b, this.f147664c, this.f147665d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147662a;
        if (i14 == 0) {
            o13.r.b(obj);
            k kVar = this.f147663b;
            ArrayList arrayListD1 = p13.h0.d1(((pt1.l) kVar.f147674i.getValue()).f140886m);
            arrayListD1.add(this.f147664c, arrayListD1.remove(this.f147665d));
            p2 p2Var = kVar.f147674i;
            pt1.l lVarA = pt1.l.a((pt1.l) p2Var.getValue(), 0L, null, 0, 0L, null, null, false, null, null, null, i53.a.e(arrayListD1), false, 28671);
            this.f147662a = 1;
            p2Var.k(null, lVarA);
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
