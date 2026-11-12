package p007l6;

import e23.l;
import o4.l1;
import o4.t0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import q6.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo4/t0;", "", "invoke", "(Lo4/t0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class j extends w implements l<t0, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f110479a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar) {
        super(1);
        this.f110479a = hVar;
    }

    @Override // e23.l
    public final Unit invoke(t0 t0Var) {
        t0 t0Var2 = t0Var;
        h hVar = this.f110479a;
        if (!Float.isNaN(hVar.f143144f) || !Float.isNaN(hVar.f143145g)) {
            t0Var2.T0(l1.b(Float.isNaN(hVar.f143144f) ? 0.5f : hVar.f143144f, Float.isNaN(hVar.f143145g) ? 0.5f : hVar.f143145g));
        }
        if (!Float.isNaN(hVar.f143146h)) {
            t0Var2.h(hVar.f143146h);
        }
        if (!Float.isNaN(hVar.f143147i)) {
            t0Var2.i(hVar.f143147i);
        }
        if (!Float.isNaN(hVar.f143148j)) {
            t0Var2.k(hVar.f143148j);
        }
        if (!Float.isNaN(hVar.f143149k)) {
            t0Var2.x(hVar.f143149k);
        }
        if (!Float.isNaN(hVar.f143150l)) {
            t0Var2.q(hVar.f143150l);
        }
        if (!Float.isNaN(hVar.f143151m)) {
            t0Var2.j(hVar.f143151m);
        }
        if (!Float.isNaN(hVar.f143152n) || !Float.isNaN(hVar.f143153o)) {
            t0Var2.v(Float.isNaN(hVar.f143152n) ? 1.0f : hVar.f143152n);
            t0Var2.w(Float.isNaN(hVar.f143153o) ? 1.0f : hVar.f143153o);
        }
        if (!Float.isNaN(hVar.f143154p)) {
            t0Var2.c(hVar.f143154p);
        }
        return Unit.INSTANCE;
    }
}
