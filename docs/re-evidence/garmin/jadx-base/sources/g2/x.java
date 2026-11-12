package g2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 1)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f75299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1.f0<Float> f75300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r4.c f75301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v vVar, s1.f0<Float> f0Var, r4.c cVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f75299b = vVar;
        this.f75300c = f0Var;
        this.f75301d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f75299b, this.f75300c, this.f75301d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75298a;
        v vVar = this.f75299b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                s1.b<Float, s1.n> bVar = vVar.f75267p;
                Float f14 = new Float(0.0f);
                s1.f0<Float> f0Var = this.f75300c;
                w wVar = new w(this.f75301d, vVar, 1);
                this.f75298a = 1;
                if (s1.b.c(bVar, f14, f0Var, wVar, this, 4) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            vVar.f75262k.setValue(Boolean.TRUE);
            vVar.e(false);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            v.a aVar2 = v.f75250s;
            vVar.e(false);
            throw th3;
        }
    }
}
