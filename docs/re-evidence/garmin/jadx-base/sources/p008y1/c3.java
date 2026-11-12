package p008y1;

import e23.p;
import n4.c;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {575}, m = "invokeSuspend", v = 1)
public final class c3 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3 f193146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f193147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f193148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(a3 a3Var, float f14, float f15, d<? super c3> dVar) {
        super(2, dVar);
        this.f193146b = a3Var;
        this.f193147c = f14;
        this.f193148d = f15;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c3(this.f193146b, this.f193147c, this.f193148d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193145a;
        if (i14 == 0) {
            r.b(obj);
            h3 h3Var = this.f193146b.C;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f193147c)) << 32) | (((long) Float.floatToRawIntBits(this.f193148d)) & 4294967295L);
            c.a aVar2 = c.f123541b;
            this.f193145a = 1;
            if (t2.a(h3Var, jFloatToRawIntBits, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
