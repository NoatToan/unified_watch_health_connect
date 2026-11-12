package a61;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lfq/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.StrengthTrainingRepo$getAllExerciseToEquipmentList$result$1", f = "StrengthTrainingRepo.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends fq.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f1620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(i0 i0Var, t13.d<? super k0> dVar) {
        super(1, dVar);
        this.f1620b = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k0(this.f1620b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends fq.a>>> dVar) {
        return ((k0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f1619a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f1620b.f1610b;
        this.f1619a = 1;
        Object objA = aVar2.a(this);
        return objA == aVar ? aVar : objA;
    }
}
