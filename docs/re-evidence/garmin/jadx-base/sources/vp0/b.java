package vp0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fw.m;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lfw/m;", "Ljp0/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.hydration.presentation.detail.HydrationDetailViewModel$getHydrationData$1", f = "HydrationDetailViewModel.kt", l = {86, 88, 89, 90}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<t0<m<? extends jp0.b>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f179327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f179328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f179329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, DateTime dateTime, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f179328c = aVar;
        this.f179329d = dateTime;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f179328c, this.f179329d, dVar);
        bVar.f179327b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t0<m<? extends jp0.b>> t0Var, t13.d<? super Unit> dVar) {
        return ((b) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        t0 t0Var = (t0) this.f179327b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179326a;
        if (i14 == 0) {
            r.b(obj);
            m mVarF = m.a.f(m.f73767e, null, null, 3);
            this.f179327b = t0Var;
            this.f179326a = 1;
            if (t0Var.emit(mVarF, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else if (i14 == 2) {
            r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                m mVarG = m.a.g(m.f73767e, ((v2.b) v2Var).f47386a, 1);
                this.f179327b = null;
                this.f179326a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                m mVarD = m.a.d(m.f73767e, ((v2.a) v2Var).f47383a);
                this.f179327b = null;
                this.f179326a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        kp0.j jVar = this.f179328c.f179321a;
        this.f179327b = t0Var;
        this.f179326a = 2;
        obj = jVar.a(this.f179329d, this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                m mVarG2 = m.a.g(m.f73767e, ((v2.b) v2Var).f47386a, 1);
                this.f179327b = null;
                this.f179326a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                m mVarD2 = m.a.d(m.f73767e, ((v2.a) v2Var).f47383a);
                this.f179327b = null;
                this.f179326a = 4;
            }
        }
        return aVar;
    }
}
