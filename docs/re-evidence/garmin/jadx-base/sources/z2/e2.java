package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", l = {966}, m = "invokeSuspend", v = 1)
public final class e2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f201571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(h2 h2Var, t13.d<? super e2> dVar) {
        super(2, dVar);
        this.f201571b = h2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e2(this.f201571b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        s5.c cVarJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201570a;
        if (i14 == 0) {
            o13.r.b(obj);
            h2 h2Var = this.f201571b;
            if (s5.w0.e(h2Var.u().f188879b) || !h2Var.q() || (h2Var.f201609f instanceof x5.e0)) {
                cVarJ = null;
            } else {
                cVarJ = w2.a0.j(h2Var.u());
                s5.c cVarD = w2.a0.l(h2Var.u(), h2Var.u().f188878a.f157138b.length()).d(w2.a0.k(h2Var.u(), h2Var.u().f188878a.f157138b.length()));
                int iH = s5.w0.h(h2Var.u().f188879b);
                h2Var.f201606c.invoke(h2.k(cVarD, og.a.l(iH, iH)));
                h2Var.z(p006l2.m1.None);
                s3 s3Var = h2Var.f201604a;
                if (s3Var != null) {
                    s3Var.f108789f = true;
                }
            }
            if (cVarJ == null) {
                return Unit.INSTANCE;
            }
            kotlin.o1 o1Var = h2Var.f201611h;
            if (o1Var != null) {
                kotlin.m1 m1VarA = b2.b.a(cVarJ);
                this.f201570a = 1;
                if (o1Var.c(m1VarA) == aVar) {
                    return aVar;
                }
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
