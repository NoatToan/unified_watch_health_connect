package h10;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.GroupsViewModel$acceptInvitation$1", f = "GroupsViewModel.kt", l = {35, 36, 37}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<t0<g3<? extends Boolean>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f80775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f80776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f80777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, long j8, long j14, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f80775c = oVar;
        this.f80776d = j8;
        this.f80777e = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f80775c, this.f80776d, this.f80777e, dVar);
        iVar.f80774b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Boolean>> t0Var, t13.d<? super Unit> dVar) {
        return ((i) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f80774b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f80773a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        jm0.b bVar = this.f80775c.f80797a;
        Long l14 = new Long(this.f80777e);
        this.f80774b = t0Var;
        this.f80773a = 1;
        obj = bVar.q(this.f80776d, l14, this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
            this.f80774b = null;
            this.f80773a = 2;
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            g3.a aVar2 = g3.f35298f;
            T t7 = ((v2.b) v2Var).f47386a;
            aVar2.getClass();
            g3 g3VarD = g3.a.d(t7);
            this.f80774b = null;
            this.f80773a = 3;
        }
    }
}
