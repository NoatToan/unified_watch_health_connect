package t70;

import i3.mc;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class v0 implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f163038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f163039b;

    public v0(mc mcVar, x0 x0Var) {
        this.f163038a = mcVar;
        this.f163039b = x0Var;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        if (!this.f163038a.e()) {
            this.f163039b.f163065t.k(null, Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
