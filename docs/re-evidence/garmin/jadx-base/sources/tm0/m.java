package tm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Ljo1/e;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostViewModel$createPost$1", f = "CreatePostViewModel.kt", l = {111, 120, 121, 122}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<t0<g3<? extends jo1.e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f165400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f165401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f165402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<jo1.f> f165403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, String str, List<jo1.f> list, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f165401c = lVar;
        this.f165402d = str;
        this.f165403e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f165401c, this.f165402d, this.f165403e, dVar);
        mVar.f165400b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends jo1.e>> t0Var, t13.d<? super Unit> dVar) {
        return ((m) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L29;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        t0 t0Var = (t0) this.f165400b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f165399a;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f165400b = t0Var;
            this.f165399a = 1;
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
                this.f165400b = null;
                this.f165399a = 3;
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                g3.a aVar2 = g3.f35298f;
                T t7 = ((v2.b) v2Var).f47386a;
                aVar2.getClass();
                g3 g3VarD = g3.a.d(t7);
                this.f165400b = null;
                this.f165399a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        l lVar = this.f165401c;
        jo1.b bVar = new jo1.b("GROUP", lVar.f165395a, this.f165402d, 4L, this.f165403e);
        ym0.a aVar3 = lVar.f165396b;
        long j8 = lVar.f165395a;
        this.f165400b = t0Var;
        this.f165399a = 2;
        ym0.a.C3709a c3709a = ym0.a.f197886f;
        aVar3.getClass();
        objJ = f0.J(aVar3, new ym0.f(aVar3, j8, "GROUP", bVar, null), this);
        if (objJ != aVar) {
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.a) {
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f165400b = null;
                this.f165399a = 3;
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                g3.a aVar4 = g3.f35298f;
                T t14 = ((v2.b) v2Var).f47386a;
                aVar4.getClass();
                g3 g3VarD2 = g3.a.d(t14);
                this.f165400b = null;
                this.f165399a = 4;
            }
        }
        return aVar;
    }
}
