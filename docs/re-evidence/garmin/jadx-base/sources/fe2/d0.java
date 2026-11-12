package fe2;

import java.util.Observable;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultDataUploader$stopUpload$2", f = "DefaultDataUploader.kt", l = {100, 101}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f70692b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a0 a0Var, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f70692b = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f70692b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r8 == r0) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zIsEmpty;
        Object objE0;
        ae2.g gVar;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70691a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        this.f70692b.f70591e.debug("stopping upload");
        a0 a0Var = this.f70692b;
        Observable observable = a0Var.f70592f;
        if (observable != null) {
            observable.deleteObserver(a0Var);
        }
        a0 a0Var2 = this.f70692b;
        a0Var2.f70592f = null;
        this.f70691a = 1;
        synchronized (a0Var2.f70594h) {
            zIsEmpty = a0Var2.f70594h.isEmpty();
            Unit unit = Unit.INSTANCE;
        }
        if (zIsEmpty) {
            objE0 = Unit.INSTANCE;
        } else {
            synchronized (a0Var2.f70597k) {
                gVar = a0Var2.f70596j;
            }
            a0Var2.f70591e.debug("Latest track point: " + gVar);
            if (gVar == null) {
                objE0 = Unit.INSTANCE;
            } else {
                objE0 = ge1.b.e0(o53.s0.f129406a, new c0(a0Var2, gVar, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
            }
        }
        if (objE0 != obj2) {
        }
        return obj2;
        e0 e0Var = this.f70692b.f70595i;
        this.f70691a = 2;
        e0Var.getClass();
        Object objE1 = ge1.b.e0(o53.s0.f129406a, new h0(e0Var, null), this);
        if (objE1 != obj2) {
            objE1 = Unit.INSTANCE;
        }
    }
}
