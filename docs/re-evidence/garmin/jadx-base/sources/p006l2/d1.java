package p006l2;

import e23.p;
import i2.a;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s5.q0;
import s5.w0;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import x5.c0;
import x5.l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {350}, m = "invokeSuspend", v = 1)
public final class d1 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f108437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f108438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2 f108439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i3 f108440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f108441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(a aVar, l0 l0Var, b2 b2Var, i3 i3Var, c0 c0Var, d<? super d1> dVar) {
        super(2, dVar);
        this.f108437b = aVar;
        this.f108438c = l0Var;
        this.f108439d = b2Var;
        this.f108440e = i3Var;
        this.f108441f = c0Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new d1(this.f108437b, this.f108438c, this.f108439d, this.f108440e, this.f108441f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((d1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        n4.d dVarB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108436a;
        if (i14 == 0) {
            r.b(obj);
            n2 n2Var = this.f108439d.f108391a;
            q0 q0Var = this.f108440e.f108575a;
            this.f108436a = 1;
            int iB = this.f108441f.b(w0.g(this.f108438c.f188879b));
            if (iB < q0Var.f157280a.f157265a.f157138b.length()) {
                dVarB = q0Var.b(iB);
            } else {
                dVarB = iB != 0 ? q0Var.b(iB - 1) : new n4.d(0.0f, 0.0f, 1.0f, (int) (u2.a(n2Var.f108675b, n2Var.f108680g, n2Var.f108681h, u2.f108806a, 1) & 4294967295L));
            }
            Object objA = this.f108437b.a(dVarB, this);
            if (objA != aVar) {
                objA = Unit.INSTANCE;
            }
            if (objA == aVar) {
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
