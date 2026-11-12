package p008y1;

import e23.p;
import o13.r;
import o53.b0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u1.g0;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {498, 500}, m = "invokeSuspend", v = 1)
public final class p3 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f193557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p<b0, d<? super Unit>, Object> f193558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p3(l1 l1Var, p<? super b0, ? super d<? super Unit>, ? extends Object> pVar, d<? super p3> dVar) {
        super(2, dVar);
        this.f193557c = l1Var;
        this.f193558d = pVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        p3 p3Var = new p3(this.f193557c, this.f193558d, dVar);
        p3Var.f193556b = obj;
        return p3Var;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((p3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r4.f193558d.invoke(r1, r4) == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193555a;
        if (i14 == 0) {
            r.b(obj);
            b0Var = (b0) this.f193556b;
            if (g0.f167494a) {
                this.f193556b = b0Var;
                this.f193555a = 1;
                if (this.f193557c.P(this) != aVar) {
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            b0Var = (b0) this.f193556b;
            r.b(obj);
        } else {
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        this.f193556b = null;
        this.f193555a = 2;
    }
}
