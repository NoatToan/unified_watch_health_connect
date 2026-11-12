package u1;

import kotlin.a4;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {1194, 1198}, m = "invokeSuspend", v = 1)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f167472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f167473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f167475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f167476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c0 c0Var, long j8, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f167475d = c0Var;
        this.f167476e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f167475d, this.f167476e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (o53.m0.b(r5 - r7, r11) == r0) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long jB;
        long j8;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167474c;
        c0 c0Var = this.f167475d;
        if (i14 != 0) {
            if (i14 == 1) {
                jB = this.f167473b;
                j8 = this.f167472a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            c0Var.f167354i.invoke();
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        a4 a4Var = (a4) h5.i.a(c0Var, kotlin.t1.f91502t);
        a4Var.getClass();
        jB = a4Var.b();
        j8 = 40;
        this.f167472a = 40L;
        this.f167473b = jB;
        this.f167474c = 1;
        if (o53.m0.b(40L, this) != aVar) {
        }
        return aVar;
        c0.a aVarB = c0Var.F.b(this.f167476e);
        if (aVarB != null) {
            aVarB.f167417b = true;
        }
        this.f167474c = 2;
    }
}
