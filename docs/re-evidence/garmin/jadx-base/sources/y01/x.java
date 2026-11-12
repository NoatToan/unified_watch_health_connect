package y01;

import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.common.composable.TwoLineInputWithCounterKt$TwoLineInputWithCounter$2$1", f = "TwoLineInputWithCounter.kt", l = {63, 64}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f193045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i2.a f193046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f193047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z14, i2.a aVar, p1<Boolean> p1Var, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f193045b = z14;
        this.f193046c = aVar;
        this.f193047d = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f193045b, this.f193046c, this.f193047d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r5.f193046c.a(null, r5) == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193044a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                this.f193044a = 2;
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
        if (this.f193047d.getF182175a().booleanValue() && this.f193045b) {
            this.f193044a = 1;
            if (m0.b(100L, this) != aVar) {
                this.f193044a = 2;
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
