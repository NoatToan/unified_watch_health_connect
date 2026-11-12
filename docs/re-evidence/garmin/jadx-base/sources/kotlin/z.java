package kotlin;

import e23.l;
import p005kotlin.jvm.internal.w;
import p1.n;
import p5.a0;
import p5.y;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp5/y;", "it", "", "invoke", "(Lp5/y;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class z extends w implements l<y, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n<a0> f91666a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(n<a0> nVar) {
        super(1);
        this.f91666a = nVar;
    }

    @Override // e23.l
    public final Boolean invoke(y yVar) {
        return Boolean.valueOf(this.f91666a.a(yVar.f136100f));
    }
}
