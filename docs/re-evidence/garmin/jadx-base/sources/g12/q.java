package g12;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.UserProfileViewModel$fetchUserEvents$1", f = "UserProfileViewModel.kt", l = {273, 281}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f74921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f74923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.i f74924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f74925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.garmin.android.apps.connectmobile.userprofile.i iVar, String str, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f74924d = iVar;
        this.f74925e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f74924d, this.f74925e, dVar);
        qVar.f74923c = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        v2 v2Var;
        b0 b0Var = (b0) this.f74923c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f74922b;
        String str2 = this.f74925e;
        com.garmin.android.apps.connectmobile.userprofile.i iVar = this.f74924d;
        if (i14 == 0) {
            o13.r.b(obj);
            qo1.c cVar = iVar.f46750b;
            this.f74923c = b0Var;
            this.f74922b = 1;
            qo1.c.a aVar2 = qo1.c.f145960d;
            w13.c cVar2 = com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k;
            cVar.getClass();
            obj = f0.J(cVar, new qo1.f(cVar, str2, cVar2, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.f74921a;
            o13.r.b(obj);
        }
        v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            z.h(g3.f35298f, ((v2.b) v2Var).f47386a, iVar.f46760l);
        } else if (v2Var instanceof v2.a) {
            String strN = fb1.c.n("Error! Could not fetch events for Garmin GUID ", str);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "UserProfileViewModel", strN);
            iVar.f46760l.j(g3.a.a(g3.f35298f, null, null, null, ((v2.a) v2Var).f47384b, 7));
        }
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) obj;
        if (v2Var2 instanceof v2.b) {
            com.garmin.android.apps.connectmobile.userprofile.model.m mVar = (com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var2).f47386a;
            String garminGUID = mVar.getGarminGUID();
            Boolean showUpcomingEvents = mVar.getShowUpcomingEvents();
            iVar.E = showUpcomingEvents != null ? showUpcomingEvents.booleanValue() : false;
            if (iVar.x4() || iVar.E) {
                zf0.d dVar = iVar.f46751c;
                this.f74923c = b0Var;
                this.f74921a = garminGUID;
                this.f74922b = 2;
                obj = dVar.b(5, garminGUID, this);
                if (obj != aVar) {
                    str = garminGUID;
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        z.h(g3.f35298f, ((v2.b) v2Var).f47386a, iVar.f46760l);
                    } else if (v2Var instanceof v2.a) {
                        String strN2 = fb1.c.n("Error! Could not fetch events for Garmin GUID ", str);
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var2, "UserProfileViewModel", strN2);
                        iVar.f46760l.j(g3.a.a(g3.f35298f, null, null, null, ((v2.a) v2Var).f47384b, 7));
                    }
                }
                return aVar;
            }
            iVar.f46760l.j(g3.a.e(g3.f35298f));
        } else if (v2Var2 instanceof v2.a) {
            String strN3 = fb1.c.n("Error! Could not fetch the social profile for displayName ", str2);
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var3, "UserProfileViewModel", strN3);
            iVar.f46760l.j(g3.a.a(g3.f35298f, null, null, null, ((v2.a) v2Var2).f47384b, 7));
        }
        return Unit.INSTANCE;
    }
}
