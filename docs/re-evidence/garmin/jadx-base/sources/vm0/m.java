package vm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.details.InvalidGroupIdException;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lwm0/a;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteViewModel$declineGroupInvitation$1", f = "GroupInviteViewModel.kt", l = {112, 116, 119, 121}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<t0<g3<? extends wm0.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f178790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f178791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm0.a f178792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, wm0.a aVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f178791c = kVar;
        this.f178792d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f178791c, this.f178792d, dVar);
        mVar.f178790b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends wm0.a>> t0Var, t13.d<? super Unit> dVar) {
        return ((m) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        ArrayList arrayList;
        t0 t0Var = (t0) this.f178790b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178789a;
        wm0.a aVar2 = this.f178792d;
        k kVar = this.f178791c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    arrayList = kVar.f178779f;
                    if (arrayList != null) {
                        arrayList.removeIf(new s52.e(new uo1.a(aVar2, 19), 19));
                    }
                    g3 g3VarE = g3.a.e(g3.f35298f);
                    this.f178790b = null;
                    this.f178789a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, this.f178792d, null, 9);
                    this.f178790b = null;
                    this.f178789a = 4;
                }
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (kVar.f178777d == -1) {
            g3 g3VarA2 = g3.a.a(g3.f35298f, null, new InvalidGroupIdException(), null, null, 13);
            this.f178790b = null;
            this.f178789a = 1;
        } else {
            wm0.a aVar3 = new wm0.a(aVar2.getGroupInviteId(), null, null, null, null, null, null, 126, null);
            ym0.a aVar4 = kVar.f178775b;
            String strValueOf = String.valueOf(kVar.f178777d);
            this.f178790b = t0Var;
            this.f178789a = 2;
            aVar4.getClass();
            objJ = f0.J(aVar4, new ym0.g(aVar4, strValueOf, aVar3, null), this);
            if (objJ != aVar) {
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    arrayList = kVar.f178779f;
                    if (arrayList != null) {
                        arrayList.removeIf(new s52.e(new uo1.a(aVar2, 19), 19));
                    }
                    g3 g3VarE2 = g3.a.e(g3.f35298f);
                    this.f178790b = null;
                    this.f178789a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    g3 g3VarA3 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, this.f178792d, null, 9);
                    this.f178790b = null;
                    this.f178789a = 4;
                }
            }
        }
        return aVar;
    }
}
