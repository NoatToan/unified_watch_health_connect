package vm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import ym0.g0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lwm0/a;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteViewModel$getGroupRejectedList$1", f = "GroupInviteViewModel.kt", l = {142, 143, 146, 150}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<t0<g3<? extends List<? extends wm0.a>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f178800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f178801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f178801c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f178801c, dVar);
        pVar.f178800b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends List<? extends wm0.a>>> t0Var, t13.d<? super Unit> dVar) {
        return ((p) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        t0 t0Var = (t0) this.f178800b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178799a;
        k kVar = this.f178801c;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f178800b = t0Var;
            this.f178799a = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            objJ = obj;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                T t7 = ((v2.b) v2Var).f47386a;
                kVar.f178781h = h0.d1((Collection) t7);
                g3.f35298f.getClass();
                g3 g3VarD = g3.a.d(t7);
                this.f178800b = null;
                this.f178799a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                kVar.f178781h = new ArrayList();
                g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f178800b = null;
                this.f178799a = 4;
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
        long j8 = kVar.f178777d;
        this.f178800b = t0Var;
        this.f178799a = 2;
        aVar2.getClass();
        objJ = f0.J(aVar2, new g0(aVar2, j8, null), this);
        if (objJ != aVar) {
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                T t14 = ((v2.b) v2Var).f47386a;
                kVar.f178781h = h0.d1((Collection) t14);
                g3.f35298f.getClass();
                g3 g3VarD2 = g3.a.d(t14);
                this.f178800b = null;
                this.f178799a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                kVar.f178781h = new ArrayList();
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f178800b = null;
                this.f178799a = 4;
            }
        }
        return aVar;
    }
}
