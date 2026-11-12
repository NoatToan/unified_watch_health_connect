package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln70/a7;", "", "Ll70/c;", "dashboardRepository", "<init>", "(Ll70/c;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.c f124030a;

    public a7(l70.c cVar) {
        cVar.getClass();
        this.f124030a = cVar;
    }

    public final Object a(o70.f fVar, v13.i iVar) {
        Object objE = this.f124030a.e(fVar, iVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
