package vm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupConnectionsListDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ym0.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteViewModel$getGroupConnections$1", f = "GroupInviteViewModel.kt", l = {64, 65, 68, 72}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<t0<g3<? extends List<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f178794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f178795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f178795c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f178795c, dVar);
        nVar.f178794b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends List<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>>> t0Var, t13.d<? super Unit> dVar) {
        return ((n) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        ArrayList arrayList;
        t0 t0Var = (t0) this.f178794b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178793a;
        k kVar = this.f178795c;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f178794b = t0Var;
            this.f178793a = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                arrayList = ((GroupConnectionsListDTO) ((v2.b) v2Var).f47386a).f31549a;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                kVar.f178778e = arrayList;
                g3.f35298f.getClass();
                g3 g3VarD = g3.a.d(arrayList);
                this.f178794b = null;
                this.f178793a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                kVar.f178778e = arrayList2;
                g3.f35298f.getClass();
                g3 g3VarD2 = g3.a.d(arrayList2);
                this.f178794b = null;
                this.f178793a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        ym0.a aVar2 = kVar.f178775b;
        String strValueOf = String.valueOf(kVar.f178777d);
        this.f178794b = t0Var;
        this.f178793a = 2;
        ym0.a.C3709a c3709a = ym0.a.f197886f;
        w13.c cVar = com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k;
        aVar2.getClass();
        obj = f0.J(aVar2, new x(aVar2, strValueOf, cVar, null), this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                arrayList = ((GroupConnectionsListDTO) ((v2.b) v2Var).f47386a).f31549a;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                kVar.f178778e = arrayList;
                g3.f35298f.getClass();
                g3 g3VarD3 = g3.a.d(arrayList);
                this.f178794b = null;
                this.f178793a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                ArrayList arrayList3 = new ArrayList();
                kVar.f178778e = arrayList3;
                g3.f35298f.getClass();
                g3 g3VarD4 = g3.a.d(arrayList3);
                this.f178794b = null;
                this.f178793a = 4;
            }
        }
        return aVar;
    }
}
