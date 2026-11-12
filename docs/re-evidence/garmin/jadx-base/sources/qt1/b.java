package qt1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel$exitTrailSelection$1", f = "GarminTrailsViewModel.kt", l = {531}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ je2.b<?> f147535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f147536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(je2.b<?> bVar, a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f147535b = bVar;
        this.f147536c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f147535b, this.f147536c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        le2.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147534a;
        a aVar3 = this.f147536c;
        if (i14 == 0) {
            o13.r.b(obj);
            je2.b<?> bVar = this.f147535b;
            if (bVar != null && (aVar = ((pt1.c) aVar3.f147511z.f150540a.getValue()).f140819d.f140829e) != null) {
                List<ke2.b> listK = p13.x.k(aVar.f112052a, aVar.f112053b);
                this.f147534a = 1;
                if (bVar.c(listK, null, this) == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        int i15 = a.I;
        aVar3.C4();
        return Unit.INSTANCE;
    }
}
