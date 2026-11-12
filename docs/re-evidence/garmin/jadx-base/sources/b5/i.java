package b5;

import h5.d2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb5/h;", "it", "Lh5/d2;", "invoke", "(Lb5/h;)Lh5/d2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class i extends p005kotlin.jvm.internal.w implements e23.l<h, d2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<h> f15815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p005kotlin.jvm.internal.r0<h> r0Var) {
        super(1);
        this.f15815a = r0Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, b5.h] */
    @Override // e23.l
    public final d2 invoke(h hVar) {
        h hVar2 = hVar;
        d2 d2Var = d2.ContinueTraversal;
        if (hVar2.f15813d) {
            this.f15815a.f105810a = hVar2;
            if (hVar2.f15812c) {
                return d2.SkipSubtreeAndContinueTraversal;
            }
        }
        return d2Var;
    }
}
