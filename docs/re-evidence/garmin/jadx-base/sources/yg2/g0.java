package yg2;

import java.util.Iterator;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f196991b;

        static {
            int[] iArr = new int[ag2.c.a.values().length];
            try {
                iArr[ag2.c.a.ANIMATED_WORKOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ag2.c.a.PRIMARY_TARGET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ag2.c.a.SECONDARY_TARGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ag2.c.a.MUSCLE_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f196990a = iArr;
            int[] iArr2 = new int[mt2.l.values().length];
            try {
                iArr2[mt2.l.WARM_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[mt2.l.COOL_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[mt2.l.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[mt2.l.REST.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[mt2.l.INTERVAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[mt2.l.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f196991b = iArr2;
        }
    }

    public static final h0 a(i53.c<h0> cVar, Integer num) {
        h0 next;
        cVar.getClass();
        Iterator<h0> it = cVar.iterator();
        while (it.hasNext()) {
            next = it.next();
            int i14 = next.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
            if (num != null && i14 == num.intValue()) {
                return next;
            }
        }
        next = null;
        return next;
    }

    public static final long b(mt2.l lVar, p3.m mVar) {
        lVar.getClass();
        x1 x1Var = p3.n.f135158a;
        switch (a.f196991b[lVar.ordinal()]) {
            case 1:
                mVar.C(-66523358);
                gl.c.f77766a.getClass();
                long jL = gl.c.a(mVar).l();
                mVar.f();
                return jL;
            case 2:
                mVar.C(-66521020);
                gl.c.f77766a.getClass();
                long jD = gl.c.a(mVar).d();
                mVar.f();
                return jD;
            case 3:
            case 4:
                mVar.C(-66517496);
                gl.c.f77766a.getClass();
                long jG = gl.c.a(mVar).g();
                mVar.f();
                return jG;
            case 5:
            case 6:
                mVar.C(-66513821);
                gl.c.f77766a.getClass();
                long jB = gl.c.a(mVar).b();
                mVar.f();
                return jB;
            default:
                throw n23.j.m(mVar, -66525316);
        }
    }
}
