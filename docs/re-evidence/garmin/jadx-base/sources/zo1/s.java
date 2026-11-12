package zo1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideDetailsViewModel$getSocialGroupRideResults$1", f = "GroupRideDetailsViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f206444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f206445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f206446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f206446c = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f206446c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        q qVar;
        Object value;
        yo1.h hVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206445b;
        if (i14 == 0) {
            o13.r.b(obj);
            q qVar2 = this.f206446c;
            yo1.h hVar2 = (yo1.h) qVar2.f206423j.getValue();
            if (hVar2 != null && (str = hVar2.f198479b) != null) {
                q.y4(qVar2, true);
                vo1.c cVar = qVar2.f206414a;
                String strB = hb2.h.b();
                Long l14 = hVar2.f198478a;
                this.f206444a = qVar2;
                this.f206445b = 1;
                cVar.getClass();
                Object objJ = com.garmin.android.apps.connectmobile.f0.J(cVar, new vo1.m(cVar, str, strB, l14, null), this);
                if (objJ == aVar) {
                    return aVar;
                }
                qVar = qVar2;
                obj = objJ;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qVar = this.f206444a;
        o13.r.b(obj);
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            q.y4(qVar, false);
            p2 p2Var = qVar.f206423j;
            do {
                value = p2Var.getValue();
                hVar = (yo1.h) value;
            } while (!p2Var.b(value, hVar != null ? yo1.h.a(hVar, (yo1.j) ((v2.b) v2Var).f47386a, null, null, null, null, null, 1015) : null));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            q.y4(qVar, false);
        }
        return Unit.INSTANCE;
    }
}
