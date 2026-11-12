package kotlin;

import e23.l;
import m4.j0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class p extends w implements l<j0, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91375a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i14) {
        super(1);
        this.f91375a = i14;
    }

    @Override // e23.l
    public final Boolean invoke(j0 j0Var) {
        return Boolean.valueOf(j0Var.n1(this.f91375a));
    }
}
