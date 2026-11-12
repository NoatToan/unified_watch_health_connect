package kotlin;

import e23.l;
import o53.b0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "it", "Li5/j2;", "invoke", "(Lo53/b0;)Li5/j2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class m0 extends w implements l<b0, j2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b3 f91338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f91339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(b3 b3Var, o0 o0Var) {
        super(1);
        this.f91338a = b3Var;
        this.f91339b = o0Var;
    }

    @Override // e23.l
    public final j2 invoke(b0 b0Var) {
        return new j2(this.f91338a, new l0(this.f91339b));
    }
}
