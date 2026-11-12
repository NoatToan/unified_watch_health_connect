package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll3/i1;", "Lh4/r$c;", "Lh5/e2;", "Lh5/y1;", "Lkotlin/Function1;", "Lp5/k0;", "", "properties", "<init>", "(Le23/l;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i1 extends h4.r.c implements h5.e2, h5.y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l<? super p5.k0, Unit> f109271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f109272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f109273c = k1.f109299a;

    public i1(e23.l<? super p5.k0, Unit> lVar) {
        this.f109271a = lVar;
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        if (this.f109272b) {
            return;
        }
        this.f109271a.invoke(k0Var);
    }

    @Override // h5.e2
    public final Object X() {
        return this.f109273c;
    }

    @Override // h5.y1
    /* JADX INFO: renamed from: l1 */
    public final boolean getF136009a() {
        return true;
    }
}
