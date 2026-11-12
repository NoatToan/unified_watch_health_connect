package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.ClockDialNode$updateNode$1", f = "TimePicker.kt", l = {1581}, m = "invokeSuspend")
public final class h2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f88282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f88283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(p pVar, s1.k<Float> kVar, t13.d<? super h2> dVar) {
        super(2, dVar);
        this.f88282b = pVar;
        this.f88283c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h2(this.f88282b, this.f88283c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f88281a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f88281a = 1;
            p pVar = this.f88282b;
            ri riVar = pVar.f89247a;
            int iC = riVar.c();
            qi.f89469b.getClass();
            if ((iC == 0 && p.j(((Number) pVar.f89252f.f155491e.getF182175a()).floatValue()) == p.j(pVar.f89250d)) || (riVar.c() == qi.f89470c && p.j(((Number) pVar.f89252f.f155491e.getF182175a()).floatValue()) == p.j(pVar.f89251e))) {
                objB = Unit.INSTANCE;
            } else {
                objB = pVar.f89253g.b(u1.k1.PreventUserInput, new m(pVar, riVar.c() == 0 ? pVar.h(pVar.f89250d) : pVar.h(pVar.f89251e), this.f88283c, null), this);
                if (objB != aVar) {
                    objB = Unit.INSTANCE;
                }
            }
            if (objB == aVar) {
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
