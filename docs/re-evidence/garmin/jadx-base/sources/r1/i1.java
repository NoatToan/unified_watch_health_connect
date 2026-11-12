package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg6/m;", "it", "invoke-mzRDjE0", "(J)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class i1 extends p005kotlin.jvm.internal.w implements e23.l<g6.m, g6.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Integer> f149120a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i1(e23.l<? super Integer, Integer> lVar) {
        super(1);
        this.f149120a = lVar;
    }

    @Override // e23.l
    public final g6.m invoke(g6.m mVar) {
        long j8 = mVar.f76013a;
        return g6.m.a((((long) ((int) (j8 >> 32))) << 32) | (4294967295L & ((long) this.f149120a.invoke(Integer.valueOf((int) (j8 & 4294967295L))).intValue())));
    }
}
