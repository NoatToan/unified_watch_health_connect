package w2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.j1;
import z2.d1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 1)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f181340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f181341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, long j8, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f181340b = kVar;
        this.f181341c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f181340b, this.f181341c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f181339a;
        if (i14 == 0) {
            o13.r.b(obj);
            s1.b<n4.c, s1.o> bVar = this.f181340b.f181352h;
            n4.c cVarA = n4.c.a(this.f181341c);
            j1<n4.c> j1Var = d1.f201562d;
            this.f181339a = 1;
            if (s1.b.c(bVar, cVarA, j1Var, null, this, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
