package vs1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.a2;
import r53.e2;
import r53.g2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvs1/h;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f179809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f179810b;

    public h() {
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f179809a = e2VarB;
        this.f179810b = r53.s.c(e2VarB);
    }

    public final Object a(pt1.k kVar, t13.d<? super Unit> dVar) {
        Object objEmit = this.f179809a.emit(kVar, dVar);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }
}
