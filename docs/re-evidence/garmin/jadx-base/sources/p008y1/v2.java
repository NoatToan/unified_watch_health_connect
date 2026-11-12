package p008y1;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import s1.q1;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/y1;", "", "<anonymous>", "(Ly1/y1;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1119}, m = "invokeSuspend", v = 1)
public final class v2 extends i implements p<y1, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3 f193685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f193686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f193687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(h3 h3Var, long j8, o0 o0Var, d<? super v2> dVar) {
        super(2, dVar);
        this.f193685c = h3Var;
        this.f193686d = j8;
        this.f193687e = o0Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        v2 v2Var = new v2(this.f193685c, this.f193686d, this.f193687e, dVar);
        v2Var.f193684b = obj;
        return v2Var;
    }

    @Override // e23.p
    public final Object invoke(y1 y1Var, d<? super Unit> dVar) {
        return ((v2) create(y1Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193683a;
        if (i14 == 0) {
            r.b(obj);
            y1 y1Var = (y1) this.f193684b;
            long j8 = this.f193686d;
            h3 h3Var = this.f193685c;
            float fI = h3Var.i(j8);
            xk1.e eVar = new xk1.e(this.f193687e, 6, h3Var, y1Var);
            this.f193683a = 1;
            if (q1.c(0.0f, fI, null, eVar, this, 12) == aVar) {
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
