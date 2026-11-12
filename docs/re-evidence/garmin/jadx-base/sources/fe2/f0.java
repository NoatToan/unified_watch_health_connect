package fe2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultPeriodicUploadTask$begin$1", f = "DefaultPeriodicUploadTask.kt", l = {53, 54}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f70734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f70736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f70736c = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f70736c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e0 e0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70735b;
        e0 e0Var2 = this.f70736c;
        if (i14 != 0) {
            if (i14 == 1) {
                e0Var = this.f70734a;
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
        xd2.a1 a1Var = e0Var2.f70714c;
        long j8 = e0Var2.f70712a;
        this.f70734a = e0Var2;
        this.f70735b = 1;
        obj = a1Var.r(j8, this);
        if (obj != aVar) {
            e0Var = e0Var2;
        }
        return aVar;
        e0Var.f70722k = ((Number) obj).intValue();
        this.f70734a = null;
        this.f70735b = 2;
        e0Var2.getClass();
        Object objE0 = ge1.b.e0(o53.s0.f129406a, new g0(e0Var2, null), this);
        if (objE0 != aVar) {
            objE0 = Unit.INSTANCE;
        }
    }
}
