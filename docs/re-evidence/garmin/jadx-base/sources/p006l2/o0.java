package p006l2;

import ch.qos.logback.core.net.SyslogConstants;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import x1.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class o0 implements a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a<Unit> f108690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f108691b;

    public o0(a<Unit> aVar, k kVar) {
        this.f108690a = aVar;
        this.f108691b = kVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f108690a.invoke();
        this.f108691b.f188365a.setValue(k.a.C3505a.f188366a);
        return Unit.INSTANCE;
    }
}
