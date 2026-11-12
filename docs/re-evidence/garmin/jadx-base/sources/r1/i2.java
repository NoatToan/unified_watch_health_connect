package r1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {242}, m = "invokeSuspend", v = 1)
public final class i2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f149121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2.a f149122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f149123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2 f149124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(h2.a aVar, long j8, h2 h2Var, t13.d<? super i2> dVar) {
        super(2, dVar);
        this.f149122b = aVar;
        this.f149123c = j8;
        this.f149124d = h2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i2(this.f149122b, this.f149123c, this.f149124d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e23.p<? super g6.m, ? super g6.m, Unit> pVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f149121a;
        h2 h2Var = this.f149124d;
        h2.a aVar2 = this.f149122b;
        if (i14 == 0) {
            o13.r.b(obj);
            s1.b<g6.m, s1.o> bVar = aVar2.f149107a;
            g6.m mVarA = g6.m.a(this.f149123c);
            s1.k<g6.m> kVar = h2Var.f149100a;
            this.f149121a = 1;
            obj = s1.b.c(bVar, mVarA, kVar, null, this, 12);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        s1.i iVar = (s1.i) obj;
        if (iVar.f155594b == s1.h.Finished && (pVar = h2Var.f149102c) != null) {
            pVar.invoke(g6.m.a(aVar2.f149108b), iVar.f155593a.f155628b.getF182175a());
        }
        return Unit.INSTANCE;
    }
}
