package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr1/r0;", "currentState", "targetState", "", "invoke", "(Lr1/r0;Lr1/r0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class f extends p005kotlin.jvm.internal.w implements e23.p<r0, r0, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1 f149080a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w1 w1Var) {
        super(2);
        this.f149080a = w1Var;
    }

    @Override // e23.p
    public final Boolean invoke(r0 r0Var, r0 r0Var2) {
        r0 r0Var3 = r0Var;
        r0 r0Var4 = r0Var2;
        r0 r0Var5 = r0.PostExit;
        return Boolean.valueOf(r0Var3 == r0Var5 && r0Var4 == r0Var5 && !this.f149080a.getF149312d().f149186f);
    }
}
