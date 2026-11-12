package v2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", l = {504, 510}, m = "invokeSuspend", v = 1)
public final class q1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f175143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f175144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f175145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f175146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n4.d f175147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(p1 p1Var, float f14, boolean z14, n4.d dVar, t13.d<? super q1> dVar2) {
        super(2, dVar2);
        this.f175144b = p1Var;
        this.f175145c = f14;
        this.f175146d = z14;
        this.f175147e = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q1(this.f175144b, this.f175145c, this.f175146d, this.f175147e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r8.a(r7.f175147e, r7) == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f175143a;
        p1 p1Var = this.f175144b;
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
        u1.d2 d2Var = p1Var.f175119j;
        float f14 = n1.f175100a;
        float fCeil = this.f175145c;
        if (!Float.isNaN(fCeil) && !Float.isInfinite(fCeil)) {
            fCeil = (float) (fCeil > 0.0f ? Math.ceil(fCeil) : Math.floor(fCeil));
        }
        this.f175143a = 1;
        if (m2.b(d2Var, fCeil, this) != aVar) {
        }
        return aVar;
        if (this.f175146d) {
            i2.c cVar = p1Var.f175114e.f175002h;
            this.f175143a = 2;
        }
        return Unit.INSTANCE;
    }
}
