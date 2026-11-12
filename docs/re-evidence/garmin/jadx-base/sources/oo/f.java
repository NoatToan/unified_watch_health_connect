package oo;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import o13.r;
import o53.s0;
import okhttp3.internal.http.StatusLine;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Li53/c;", "Lpe0/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.viewmodel.ActivitiesEditViewModel$loadDogs$1", f = "ActivitiesEditViewModel.kt", l = {304, StatusLine.HTTP_TEMP_REDIRECT, StatusLine.HTTP_TEMP_REDIRECT, 310}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<t0<g3<? extends i53.c<? extends pe0.b>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f133080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g3.a f133081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f133083d;

    public f(t13.d<? super f> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(dVar);
        fVar.f133083d = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends i53.c<? extends pe0.b>>> t0Var, t13.d<? super Unit> dVar) {
        return ((f) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r5.emit(r15, r14) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (r1.emit(r15, r14) == r2) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        g3.a aVar;
        t0 t0Var;
        t0 t0Var2 = (t0) this.f133083d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133082c;
        try {
            if (i14 == 0) {
                r.b(obj);
                g3.f35298f.getClass();
                g3 g3VarB = g3.a.b(null);
                this.f133083d = t0Var2;
                this.f133082c = 1;
                if (t0Var2.emit(g3VarB, this) != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                aVar = this.f133081b;
                t0Var = this.f133080a;
                r.b(obj);
                aVar.getClass();
                g3 g3VarD = g3.a.d(obj);
                this.f133083d = t0Var2;
                this.f133080a = null;
                this.f133081b = null;
                this.f133082c = 3;
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            ne0.l lVar = (ne0.l) KoinJavaComponent.get$default(ne0.l.class, null, null, 6, null);
            aVar = g3.f35298f;
            this.f133083d = t0Var2;
            this.f133080a = t0Var2;
            this.f133081b = aVar;
            this.f133082c = 2;
            lVar.getClass();
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new ne0.k(lVar, null), this);
            if (obj != aVar2) {
                t0Var = t0Var2;
                aVar.getClass();
                g3 g3VarD2 = g3.a.d(obj);
                this.f133083d = t0Var2;
                this.f133080a = null;
                this.f133081b = null;
                this.f133082c = 3;
            }
        } catch (Exception e4) {
            String strN = fb1.c.n("loadDogs: failed to fetch dogs for activity edit, ", e4.getMessage());
            y.f136664a.getClass();
            y.a.c("ActivitiesEditViewModel", strN);
            g3 g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
            this.f133083d = null;
            this.f133080a = null;
            this.f133081b = null;
            this.f133082c = 4;
        }
        return aVar2;
    }
}
