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
import ym0.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lwm0/a;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteViewModel$sendGroupInvitation$1", f = "GroupInviteViewModel.kt", l = {95, 99, 103, 105}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<t0<g3<? extends wm0.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f178806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f178807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k kVar, long j8, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f178807c = kVar;
        this.f178808d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f178807c, this.f178808d, dVar);
        rVar.f178806b = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends wm0.a>> t0Var, t13.d<? super Unit> dVar) {
        return ((r) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        wm0.a aVar;
        ArrayList arrayList;
        t0 t0Var = (t0) this.f178806b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178805a;
        k kVar = this.f178807c;
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
                    T t7 = ((v2.b) v2Var).f47386a;
                    aVar = (wm0.a) t7;
                    arrayList = kVar.f178779f;
                    if (arrayList != null) {
                        arrayList.add(aVar);
                    }
                    g3.f35298f.getClass();
                    g3 g3VarD = g3.a.d(t7);
                    this.f178806b = null;
                    this.f178805a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar3 = (v2.a) v2Var;
                    g3 g3VarA = g3.a.a(g3.f35298f, null, aVar3.f47383a, null, aVar3.f47384b, 5);
                    this.f178806b = null;
                    this.f178805a = 4;
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
            this.f178806b = null;
            this.f178805a = 1;
        } else {
            wm0.a aVar4 = new wm0.a(null, null, null, null, null, new Long(this.f178808d), null, 95, null);
            ym0.a aVar5 = kVar.f178775b;
            String strValueOf = String.valueOf(kVar.f178777d);
            this.f178806b = t0Var;
            this.f178805a = 2;
            aVar5.getClass();
            objJ = f0.J(aVar5, new q0(aVar5, strValueOf, aVar4, null), this);
            if (objJ != aVar2) {
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    T t14 = ((v2.b) v2Var).f47386a;
                    aVar = (wm0.a) t14;
                    arrayList = kVar.f178779f;
                    if (arrayList != null) {
                        arrayList.add(aVar);
                    }
                    g3.f35298f.getClass();
                    g3 g3VarD2 = g3.a.d(t14);
                    this.f178806b = null;
                    this.f178805a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar6 = (v2.a) v2Var;
                    g3 g3VarA3 = g3.a.a(g3.f35298f, null, aVar6.f47383a, null, aVar6.f47384b, 5);
                    this.f178806b = null;
                    this.f178805a = 4;
                }
            }
        }
        return aVar2;
    }
}
