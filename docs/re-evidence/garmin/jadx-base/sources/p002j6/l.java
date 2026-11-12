package p002j6;

import e23.a;
import f5.t1;
import f5.u1;
import h5.i;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class l extends w implements a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0<t1> f97244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f97245b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r0<t1> r0Var, k kVar) {
        super(0);
        this.f97244a = r0Var;
        this.f97245b = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // e23.a
    public final Unit invoke() {
        this.f97244a.f105810a = i.a(this.f97245b, u1.f69122a);
        return Unit.INSTANCE;
    }
}
