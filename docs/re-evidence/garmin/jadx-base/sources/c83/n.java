package c83;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class n implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d<Object> f25810a;

    public n(d<Object> dVar) {
        this.f25810a = dVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        this.f25810a.cancel();
        return Unit.INSTANCE;
    }
}
