package fe2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession$stopUpload$1", f = "ClassicSession.kt", l = {265, 267}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f70820b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f70820b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (fe2.b.s(r4, r7) == r0) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70819a;
        b bVar = this.f70820b;
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
        a0 a0Var = bVar.f70641i;
        if (a0Var != null) {
            this.f70819a = 1;
            if (a0Var.f70592f == null) {
                a0Var.f70591e.error("stopUpload: upload not in progress");
                objE0 = Unit.INSTANCE;
            } else {
                objE0 = ge1.b.e0(o53.s0.f129406a, new d0(a0Var, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
            }
            if (objE0 != obj2) {
            }
        }
        return obj2;
        wr.g.w("Data upload stopped for ", bVar.f70633a, bVar.f70639g);
        this.f70819a = 2;
    }
}
