package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls1/i;", "", "Ls1/n;", "<anonymous>", "()Ls1/i;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", f = "TimePicker.kt", l = {754}, m = "invokeSuspend")
public final class m extends v13.i implements e23.l<t13.d<? super s1.i<Float, s1.n>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f88927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f88928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f88929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, float f14, s1.k<Float> kVar, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f88927b = pVar;
        this.f88928c = f14;
        this.f88929d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f88927b, this.f88928c, this.f88929d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super s1.i<Float, s1.n>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f88926a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        s1.b<Float, s1.n> bVar = this.f88927b.f89252f;
        Float f14 = new Float(this.f88928c);
        this.f88926a = 1;
        Object objC = s1.b.c(bVar, f14, this.f88929d, null, this, 12);
        return objC == aVar ? aVar : objC;
    }
}
