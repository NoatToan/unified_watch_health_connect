package mm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel$acceptInvitation$1", f = "GroupDetailViewModel.kt", l = {224, 225, 227, 232, 234}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<t0<g3<? extends Boolean>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f119519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f119519c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f119519c, dVar);
        fVar.f119518b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Boolean>> t0Var, t13.d<? super Unit> dVar) {
        return ((f) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        t0 t0Var = (t0) this.f119518b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119517a;
        e eVar = this.f119519c;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f119518b = t0Var;
            this.f119517a = 1;
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
            if (v2Var instanceof v2.a) {
                g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f119518b = null;
                this.f119517a = 3;
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                eVar.f119510f.j(new ArrayList());
                if (((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
                    g3.a aVar2 = g3.f35298f;
                    Boolean bool = Boolean.TRUE;
                    aVar2.getClass();
                    g3 g3VarD = g3.a.d(bool);
                    this.f119518b = null;
                    this.f119517a = 4;
                } else {
                    g3.a aVar3 = g3.f35298f;
                    Boolean bool2 = Boolean.FALSE;
                    aVar3.getClass();
                    g3 g3VarD2 = g3.a.d(bool2);
                    this.f119518b = null;
                    this.f119517a = 5;
                }
            }
        } else {
            if (i14 != 3 && i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        ym0.a aVar4 = eVar.f119505a;
        String strValueOf = String.valueOf(eVar.B4());
        uz0.b bVarC4 = eVar.C4();
        wm0.a aVar5 = new wm0.a(bVarC4 != null ? bVarC4.getGroupInviteId() : null, null, null, null, null, null, null, 126, null);
        this.f119518b = t0Var;
        this.f119517a = 2;
        aVar4.getClass();
        objJ = f0.J(aVar4, new ym0.b(aVar4, strValueOf, aVar5, null), this);
        if (objJ != aVar) {
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.a) {
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f119518b = null;
                this.f119517a = 3;
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                eVar.f119510f.j(new ArrayList());
                if (((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
                    g3.a aVar6 = g3.f35298f;
                    Boolean bool3 = Boolean.TRUE;
                    aVar6.getClass();
                    g3 g3VarD3 = g3.a.d(bool3);
                    this.f119518b = null;
                    this.f119517a = 4;
                } else {
                    g3.a aVar7 = g3.f35298f;
                    Boolean bool4 = Boolean.FALSE;
                    aVar7.getClass();
                    g3 g3VarD4 = g3.a.d(bool4);
                    this.f119518b = null;
                    this.f119517a = 5;
                }
            }
        }
        return aVar;
    }
}
