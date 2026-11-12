package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.w2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll3/i0;", "Lh4/r$c;", "Lh5/y1;", "Lkotlin/Function1;", "Lp5/k0;", "", "properties", "<init>", "(Le23/l;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 extends h4.r.c implements h5.y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l<? super p5.k0, Unit> f109270a;

    public i0(e23.l<? super p5.k0, Unit> lVar) {
        this.f109270a = lVar;
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        gl1.d.h0(this, k1.f109299a, new j2.h(k0Var, 2));
        this.f109270a.invoke(k0Var);
    }

    @Override // h4.r.c
    public final void onDetach() {
        super.onDetach();
        gl1.d.h0(this, k1.f109299a, new w2(13));
    }
}
