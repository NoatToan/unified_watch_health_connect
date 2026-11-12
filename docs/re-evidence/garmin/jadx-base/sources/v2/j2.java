package v2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class j2 implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f175068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.h.a f175069b;

    public j2(h2 h2Var, u2.h.a aVar) {
        this.f175068a = h2Var;
        this.f175069b = aVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        u2.h hVar = this.f175068a.f175039a;
        hVar.f167851f.j(this.f175069b);
        return Unit.INSTANCE;
    }
}
