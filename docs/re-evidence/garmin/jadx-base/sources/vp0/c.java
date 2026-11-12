package vp0;

import androidx.lifecycle.t0;
import c22.j0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fw.m;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lfw/m;", "Ljp0/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.hydration.presentation.detail.HydrationDetailViewModel$logHydrationData$1", f = "HydrationDetailViewModel.kt", l = {96, 98, 99, 100}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<t0<m<? extends jp0.b>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f179331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f179332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f179333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f179334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, DateTime dateTime, double d14, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f179332c = aVar;
        this.f179333d = dateTime;
        this.f179334e = d14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f179332c, this.f179333d, this.f179334e, dVar);
        cVar.f179331b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(t0<m<? extends jp0.b>> t0Var, t13.d<? super Unit> dVar) {
        return ((c) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        t0 t0Var = (t0) this.f179331b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179330a;
        if (i14 == 0) {
            r.b(obj);
            m mVarF = m.a.f(m.f73767e, null, null, 3);
            this.f179331b = t0Var;
            this.f179330a = 1;
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
                this.f179331b = null;
                this.f179330a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                m mVarD = m.a.d(m.f73767e, ((v2.a) v2Var).f47383a);
                this.f179331b = null;
                this.f179330a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        kp0.j jVar = this.f179332c.f179321a;
        this.f179331b = t0Var;
        this.f179330a = 2;
        jVar.getClass();
        int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        String strB = j0.b(this.f179333d, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        jVar.c().debug("HydrationLog round log value");
        obj = f0.J(jVar, new kp0.g(jVar, new jp0.d(new Integer(userProfilePk), strB, new Double(jp0.c.o(this.f179334e, "HydrationLogDTO.valueInML", jVar.c()))), null), this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                m mVarG2 = m.a.g(m.f73767e, ((v2.b) v2Var).f47386a, 1);
                this.f179331b = null;
                this.f179330a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                m mVarD2 = m.a.d(m.f73767e, ((v2.a) v2Var).f47383a);
                this.f179331b = null;
                this.f179330a = 4;
            }
        }
        return aVar;
    }
}
