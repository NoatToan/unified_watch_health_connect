package q42;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o53.e2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lq42/d0;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends u1 implements o53.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142610a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j23.l f142611b = new j23.l(20, 45);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f142612c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f142613d = ge1.b.h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f142614e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f142615f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f142616g = new LinkedHashMap();

    static {
        new a(null);
    }

    public d0() {
        new ReentrantLock();
        new y0();
    }

    public static boolean A4(d0 d0Var) {
        d0Var.getClass();
        ww0.a aVarX4 = x4();
        d0Var.getClass();
        aVarX4.getClass();
        return z4(d0Var, aVarX4) && ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).P3();
    }

    public static ww0.a x4() {
        return ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y1();
    }

    public static boolean z4(d0 d0Var, ww0.a aVar) {
        d0Var.getClass();
        int iF2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).f2();
        d0Var.getClass();
        aVar.getClass();
        return aVar != ww0.a.NONE && iF2 <= d0Var.f142610a;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return s0.f129406a.plus(this.f142613d);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    public final boolean y4(j52.f fVar) {
        boolean z14;
        if (fVar == null) {
            return x4() != ww0.a.NONE;
        }
        ww0.a aVarX4 = x4();
        ww0.a aVar = ww0.a.NONE;
        if (aVarX4 != aVar) {
            if (A4(this) == (fVar.getPeriodLength() != null)) {
                ww0.a aVarX5 = x4();
                ww0.i iVarJ1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).j1();
                boolean zZ4 = z4(this, aVarX5);
                iVarJ1.getClass();
                int iF2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).f2();
                if (aVarX5 != aVar && iVarJ1 == ww0.i.NONE && zZ4) {
                    j23.l lVar = this.f142611b;
                    int i14 = lVar.f96796a;
                    if (iF2 > lVar.f96797b || i14 > iF2 || !((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).z0()) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                } else {
                    z14 = false;
                }
                if (z14 == (fVar.getFertileWindowStartDay() != null)) {
                    if (A4(this)) {
                        if ((((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).j1() == ww0.i.NONE) != (fVar.getLutealPhaseStart() != null)) {
                        }
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq42/d0$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
