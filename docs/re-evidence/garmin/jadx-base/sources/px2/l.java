package px2;

import java.util.concurrent.atomic.AtomicBoolean;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class l extends w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f141823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f141824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dt2.k f141825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AtomicBoolean atomicBoolean, f fVar, dt2.k kVar) {
        super(0);
        this.f141823a = atomicBoolean;
        this.f141824b = fVar;
        this.f141825c = kVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        AtomicBoolean atomicBoolean = this.f141823a;
        if (atomicBoolean.compareAndSet(false, true)) {
            f fVar = this.f141824b;
            b0 b0Var = fVar.f141795c;
            x53.c cVar = s0.f129406a;
            ge1.b.T(b0Var, x53.b.f189152a, null, new k(fVar, this.f141825c, atomicBoolean, null), 2);
        }
        return Unit.INSTANCE;
    }
}
