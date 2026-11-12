package oo;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import ne0.v;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.viewmodel.ActivitiesEditViewModel$isOptedIntoDogActivities$1", f = "ActivitiesEditViewModel.kt", l = {316, 319, 319, 322}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<t0<g3<? extends Boolean>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f133076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g3.a f133077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f133079d;

    public e(t13.d<? super e> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(dVar);
        eVar.f133079d = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Boolean>> t0Var, t13.d<? super Unit> dVar) {
        return ((e) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r5.emit(r15, r14) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (r1.emit(r15, r14) == r2) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g3.a aVar;
        t0 t0Var;
        t0 t0Var2 = (t0) this.f133079d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133078c;
        try {
            if (i14 == 0) {
                r.b(obj);
                g3.f35298f.getClass();
                g3 g3VarB = g3.a.b(null);
                this.f133079d = t0Var2;
                this.f133078c = 1;
                if (t0Var2.emit(g3VarB, this) != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                aVar = this.f133077b;
                t0Var = this.f133076a;
                r.b(obj);
                aVar.getClass();
                g3 g3VarD = g3.a.d(obj);
                this.f133079d = t0Var2;
                this.f133076a = null;
                this.f133077b = null;
                this.f133078c = 3;
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            v vVar = (v) KoinJavaComponent.get$default(v.class, null, null, 6, null);
            aVar = g3.f35298f;
            this.f133079d = t0Var2;
            this.f133076a = t0Var2;
            this.f133077b = aVar;
            this.f133078c = 2;
            obj = vVar.a(this);
            if (obj != aVar2) {
                t0Var = t0Var2;
                aVar.getClass();
                g3 g3VarD2 = g3.a.d(obj);
                this.f133079d = t0Var2;
                this.f133076a = null;
                this.f133077b = null;
                this.f133078c = 3;
            }
        } catch (Exception e4) {
            String strN = fb1.c.n("isOptedIntoDogActivities: failed to fetch dog activities opt-in status, ", e4.getMessage());
            y.f136664a.getClass();
            y.a.c("ActivitiesEditViewModel", strN);
            g3 g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
            this.f133079d = null;
            this.f133076a = null;
            this.f133077b = null;
            this.f133078c = 4;
        }
        return aVar2;
    }
}
