package kotlin;

import e23.l;
import o53.b0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "it", "Li5/o0;", "invoke", "(Lo53/b0;)Li5/o0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class t extends w implements l<b0, o0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f91481a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m mVar) {
        super(1);
        this.f91481a = mVar;
    }

    @Override // e23.l
    public final o0 invoke(b0 b0Var) {
        m mVar = this.f91481a;
        return new o0(mVar, mVar.getTextInputService(), b0Var);
    }
}
