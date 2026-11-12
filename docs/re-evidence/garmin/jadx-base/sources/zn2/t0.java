package zn2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t0 implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Boolean> f205840a;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(o53.j<? super Boolean> jVar) {
        this.f205840a = jVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        u0.f205864a.getClass();
        u0.i().error("removeDeviceFromUser", th3);
        int i14 = o13.q.f128596b;
        this.f205840a.resumeWith(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
