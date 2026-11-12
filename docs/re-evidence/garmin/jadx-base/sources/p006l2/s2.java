package p006l2;

import e23.l;
import f5.c0;
import f5.d0;
import o4.a1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class s2 implements l<a1, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f108783a;

    public s2(c0 c0Var) {
        this.f108783a = c0Var;
    }

    @Override // e23.l
    public final Unit invoke(a1 a1Var) {
        float[] fArr = a1Var.f128808a;
        c0 c0Var = this.f108783a;
        if (c0Var.isAttached()) {
            d0.c(c0Var).G(c0Var, fArr);
        }
        return Unit.INSTANCE;
    }
}
