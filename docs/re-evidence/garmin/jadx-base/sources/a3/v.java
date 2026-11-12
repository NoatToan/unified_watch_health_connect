package a3;

import p005kotlin.Metadata;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La3/v;", "", "<init>", "()V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f860a = new v();

    private v() {
    }

    public static float a(float f14, float f15, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        long j8 = ((o4.d0) mVar.A(x.f872a)).f128833a;
        o0.f762a.getClass();
        return (!o0.a(mVar).c() ? ((double) o4.f0.i(j8)) < 0.5d : ((double) o4.f0.i(j8)) > 0.5d) ? f15 : f14;
    }

    public static float b(p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        return a(0.38f, 0.38f, mVar);
    }
}
