package ut1;

import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rt1.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.viewmodel.ActiveTrainingPlansViewModel$quitTrainingPlan$1", f = "ActiveTrainingPlansViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f172599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f172600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f172601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f172602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<ww1.e> f172603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, Long l14, boolean z14, j jVar, List<ww1.e> list, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f172599b = eVar;
        this.f172600c = l14;
        this.f172601d = z14;
        this.f172602e = jVar;
        this.f172603f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f172599b, this.f172600c, this.f172601d, this.f172602e, this.f172603f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172598a;
        if (i14 == 0) {
            r.b(obj);
            st1.c cVar = this.f172599b.f172583b;
            this.f172598a = 1;
            if (cVar.b(this.f172600c, this.f172601d, this.f172602e, this.f172603f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
