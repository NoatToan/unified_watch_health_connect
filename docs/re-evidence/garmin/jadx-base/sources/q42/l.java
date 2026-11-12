package q42;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightGoalViewModel$updateWellnessGoal$1", f = "WeightGoalViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f142657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f142658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f142659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f142660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, String str, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f142659c = iVar;
        this.f142660d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f142659c, this.f142660d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        i iVar;
        Object value2;
        Boolean bool;
        Object value3;
        Boolean bool2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142658b;
        if (i14 == 0) {
            o13.r.b(obj);
            i iVar2 = this.f142659c;
            zk0.e eVar = (zk0.e) iVar2.f142650d.getValue();
            if (eVar != null) {
                double goalValue = eVar.getGoalValue();
                if (goalValue > 0.0d) {
                    p2 p2Var = iVar2.f142648b;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, f.a((f) value, true, 2)));
                    zk0.h hVar = new zk0.h("WEIGHT_GRAMS", (int) goalValue);
                    al0.a aVar2 = iVar2.f142647a;
                    this.f142657a = iVar2;
                    this.f142658b = 1;
                    Object objA = aVar2.a("weight-grams", this.f142660d, hVar, this);
                    if (objA == aVar) {
                        return aVar;
                    }
                    iVar = iVar2;
                    obj = objA;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iVar = this.f142657a;
        o13.r.b(obj);
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            sn.a.o(f12.l.f68084a, true);
            p2 p2Var2 = iVar.f142648b;
            do {
                value3 = p2Var2.getValue();
                bool2 = Boolean.TRUE;
                ((f) value3).getClass();
            } while (!p2Var2.b(value3, new f(true, bool2)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            p2 p2Var3 = iVar.f142648b;
            do {
                value2 = p2Var3.getValue();
                bool = Boolean.FALSE;
                ((f) value2).getClass();
            } while (!p2Var3.b(value2, new f(false, bool)));
        }
        return Unit.INSTANCE;
    }
}
