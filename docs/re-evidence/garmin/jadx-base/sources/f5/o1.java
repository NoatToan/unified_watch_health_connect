package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf5/o1;", "Lh4/r$c;", "Lh5/w0;", "Lkotlin/Function1;", "Lg6/m;", "", "onSizeChanged", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1 extends h4.r.c implements h5.w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l<? super g6.m, Unit> f69012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f69013b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f69014c;

    public o1(e23.l<? super g6.m, Unit> lVar) {
        this.f69012a = lVar;
        long j8 = Integer.MIN_VALUE;
        g6.m.a aVar = g6.m.f76012b;
        this.f69014c = (j8 & 4294967295L) | (j8 << 32);
    }

    @Override // h5.w0
    public final void e(long j8) {
        if (g6.m.c(this.f69014c, j8)) {
            return;
        }
        this.f69012a.invoke(g6.m.a(j8));
        this.f69014c = j8;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate, reason: from getter */
    public final boolean getF69013b() {
        return this.f69013b;
    }
}
