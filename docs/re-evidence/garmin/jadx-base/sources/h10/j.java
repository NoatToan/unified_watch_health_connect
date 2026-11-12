package h10;

import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Luz0/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.GroupsViewModel$fetchInviteRequests$1", f = "GroupsViewModel.kt", l = {24, 25, 28}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<t0<g3<? extends List<? extends uz0.b>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f80780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f80780c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f80780c, dVar);
        jVar.f80779b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends List<? extends uz0.b>>> t0Var, t13.d<? super Unit> dVar) {
        return ((j) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f80779b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f80778a;
        o oVar = this.f80780c;
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
        jm0.b bVar = oVar.f80797a;
        String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        this.f80779b = t0Var;
        this.f80778a = 1;
        obj = bVar.A(userDisplayName, this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
            this.f80779b = null;
            this.f80778a = 2;
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            y0<List<uz0.b>> y0Var = oVar.f80799c;
            T t7 = ((v2.b) v2Var).f47386a;
            y0Var.j(h0.d1((Collection) t7));
            g3.f35298f.getClass();
            g3 g3VarD = g3.a.d(t7);
            this.f80779b = null;
            this.f80778a = 3;
        }
    }
}
