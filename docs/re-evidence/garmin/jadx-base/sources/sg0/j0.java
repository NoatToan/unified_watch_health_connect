package sg0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageChildViewModel$getChildById$1", f = "ManageChildViewModel.kt", l = {92}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f159105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f159106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(f0 f0Var, long j8, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f159105b = f0Var;
        this.f159106c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f159105b, this.f159106c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objI;
        Object value2;
        Object value3;
        Object value4;
        List<ue0.l> listC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159104a;
        f0 f0Var = this.f159105b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = f0Var.f159087f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u.b((u) f0Var.f159087f.getValue(), null, null, null, null, true, null, false, false, false, null, null, 8159)));
            re0.o oVar = f0Var.f159083b;
            this.f159104a = 1;
            objI = oVar.i(this);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objI = obj;
        }
        v2 v2Var = (v2) objI;
        if (v2Var instanceof v2.b) {
            ue0.k kVar = (ue0.k) ((v2.b) v2Var).f47386a;
            Object obj2 = null;
            if (kVar != null && (listC = kVar.c()) != null) {
                for (Object obj3 : listC) {
                    Long userId = ((ue0.l) obj3).getUserId();
                    if (userId != null && userId.longValue() == this.f159106c) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (ue0.l) obj2;
            }
            ue0.l lVar = obj2;
            p2 p2Var2 = f0Var.f159087f;
            do {
                value4 = p2Var2.getValue();
            } while (!p2Var2.b(value4, new u(lVar, null, null, null, null, false, null, false, false, false, false, null, null, 7070, null)));
            f0Var.f159082a.f(f0Var.f159087f.getValue(), "MANAGE_CHILD_UI_STATE");
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            p2 p2Var3 = f0Var.f159087f;
            p2 p2Var4 = f0Var.f159087f;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, new u(null, null, null, null, null, false, null, false, false, false, false, null, null, 8190, null)));
            f0Var.f159082a.f(p2Var4.getValue(), "MANAGE_CHILD_UI_STATE");
            do {
                value3 = p2Var4.getValue();
            } while (!p2Var4.b(value3, u.b((u) value3, null, null, null, null, false, ((v2.a) v2Var).f47383a.getMessage(), false, false, false, null, null, 8095)));
        }
        return Unit.INSTANCE;
    }
}
