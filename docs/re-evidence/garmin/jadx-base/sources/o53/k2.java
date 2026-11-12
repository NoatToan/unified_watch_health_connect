package o53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo53/k2;", "Lo53/z;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k2 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f129364a = new k2();

    private k2() {
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        o2 o2Var = (o2) gVar.get(o2.f129377b);
        if (o2Var != null) {
            o2Var.f129378a = true;
        } else {
            org.apache.commons.lang3.e.w("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // o53.z
    public final boolean isDispatchNeeded(t13.g gVar) {
        return false;
    }

    @Override // o53.z
    public final z limitedParallelism(int i14, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        return "Dispatchers.Unconfined";
    }
}
