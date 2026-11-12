package qt1;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$deleteReviewPhoto$1", f = "TrailDetailsViewModel.kt", l = {1053}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1.u f147775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k kVar, pt1.u uVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f147774b = kVar;
        this.f147775c = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f147774b, this.f147775c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147773a;
        if (i14 == 0) {
            o13.r.b(obj);
            k kVar = this.f147774b;
            p2 p2Var = kVar.f147674i;
            pt1.l lVar = (pt1.l) p2Var.getValue();
            i53.c<pt1.u> cVar = ((pt1.l) kVar.f147674i.getValue()).f140886m;
            ArrayList arrayList = new ArrayList();
            for (pt1.u uVar : cVar) {
                if (!p005kotlin.jvm.internal.s.g(uVar, this.f147775c)) {
                    arrayList.add(uVar);
                }
            }
            pt1.l lVarA = pt1.l.a(lVar, 0L, null, 0, 0L, null, null, false, null, null, null, i53.a.e(arrayList), false, 28671);
            this.f147773a = 1;
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
