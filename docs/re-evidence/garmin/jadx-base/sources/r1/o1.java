package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg6/m;", "it", "Lg6/k;", "invoke-mHKZG7I", "(J)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class o1 extends p005kotlin.jvm.internal.w implements e23.l<g6.m, g6.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Integer> f149180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o1(e23.l<? super Integer, Integer> lVar) {
        super(1);
        this.f149180a = lVar;
    }

    @Override // e23.l
    public final g6.k invoke(g6.m mVar) {
        return g6.k.a((((long) this.f149180a.invoke(Integer.valueOf((int) (mVar.f76013a >> 32))).intValue()) << 32) | (((long) 0) & 4294967295L));
    }
}
