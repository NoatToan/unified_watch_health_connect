package p5;

import h5.y1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp5/f;", "Lh4/r$c;", "Lh5/y1;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "Lp5/k0;", "", "properties", "<init>", "(ZZLe23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends h4.r.c implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f136009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l<? super k0, Unit> f136011c;

    public f(boolean z14, boolean z15, e23.l<? super k0, Unit> lVar) {
        this.f136009a = z14;
        this.f136010b = z15;
        this.f136011c = lVar;
    }

    @Override // h5.y1
    public final void D1(k0 k0Var) {
        this.f136011c.invoke(k0Var);
    }

    @Override // h5.y1
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF136010b() {
        return this.f136010b;
    }

    @Override // h5.y1
    /* JADX INFO: renamed from: l1, reason: from getter */
    public final boolean getF136009a() {
        return this.f136009a;
    }
}
