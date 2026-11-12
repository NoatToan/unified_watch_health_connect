package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lr1/k2;", "Lr1/j2;", "", "clip", "Lkotlin/Function2;", "Lg6/m;", "Ls1/f0;", "sizeAnimationSpec", "<init>", "(ZLe23/p;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k2 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f149136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<g6.m, g6.m, s1.f0<g6.m>> f149137b;

    public /* synthetic */ k2(boolean z14, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, pVar);
    }

    @Override // r1.j2
    public final s1.f0<g6.m> a(long j8, long j14) {
        return this.f149137b.invoke(g6.m.a(j8), g6.m.a(j14));
    }

    @Override // r1.j2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF149136a() {
        return this.f149136a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k2(boolean z14, e23.p<? super g6.m, ? super g6.m, ? extends s1.f0<g6.m>> pVar) {
        this.f149136a = z14;
        this.f149137b = pVar;
    }
}
