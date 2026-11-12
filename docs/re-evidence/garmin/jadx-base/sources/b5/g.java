package b5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb5/h;", "it", "", "invoke", "(Lb5/h;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class g extends p005kotlin.jvm.internal.w implements e23.l<h, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<h> f15809a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p005kotlin.jvm.internal.r0<h> r0Var) {
        super(1);
        this.f15809a = r0Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, b5.h] */
    @Override // e23.l
    public final Boolean invoke(h hVar) {
        h hVar2 = hVar;
        p005kotlin.jvm.internal.r0<h> r0Var = this.f15809a;
        h hVar3 = r0Var.f105810a;
        if (hVar3 == null && hVar2.f15813d) {
            r0Var.f105810a = hVar2;
        } else if (hVar3 != null && hVar2.f15812c && hVar2.f15813d) {
            r0Var.f105810a = hVar2;
        }
        return Boolean.TRUE;
    }
}
