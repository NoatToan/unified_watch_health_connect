package vz1;

import i3.mc;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p3.o0;
import p3.p2;
import p3.x1;
import sz1.t;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180926a;

        static {
            int[] iArr = new int[oz1.c.values().length];
            try {
                iArr[oz1.c.ACUTE_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oz1.c.RECENT_SLEEP_SCORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oz1.c.RECENT_STRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[oz1.c.RECOVERY_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[oz1.c.HRV_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[oz1.c.SLEEP_SCORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[oz1.c.RECENT_DIVES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f180926a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(oz1.a aVar, oz1.b bVar, t tVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        t tVar2;
        o13.p pVar;
        b0Var.getClass();
        o0 o0VarE = mVar.E(1055569428);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            tVar2 = tVar;
            i15 |= o0VarE.r(tVar2) ? 256 : 128;
        } else {
            tVar2 = tVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(b0Var) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = (aVar != null ? aVar.f134490a : null) == oz1.c.ACUTE_LOAD ? 27 : 6;
            DateTime dateTimeS = bVar.s();
            if (dateTimeS != null) {
                LocalDate localDate = dateTimeS.toLocalDate();
                LocalDate localDateMinusDays = localDate.minusDays(i16);
                pVar = new o13.p(localDateMinusDays != null ? localDateMinusDays.toDateTimeAtStartOfDay() : null, localDate.toDateTimeAtStartOfDay());
            } else {
                pVar = new o13.p(null, null);
            }
            DateTime dateTime = (DateTime) pVar.f128594a;
            DateTime dateTime2 = (DateTime) pVar.f128595b;
            oz1.c cVar = aVar != null ? aVar.f134490a : null;
            switch (cVar == null ? -1 : a.f180926a[cVar.ordinal()]) {
                case 1:
                    o0VarE.C(-1281319302);
                    c.a(dateTime, dateTime2, tVar, mcVar, b0Var, aVar, o0VarE, (i15 & 65408) | ((i15 << 15) & 458752));
                    o0VarE.g0(false);
                    break;
                case 2:
                    o0VarE.C(-1281053229);
                    o.a(dateTime, dateTime2, tVar, mcVar, b0Var, aVar, o0VarE, (i15 & 65408) | ((i15 << 15) & 458752));
                    o0VarE.g0(false);
                    break;
                case 3:
                    o0VarE.C(-1280785513);
                    p.a(dateTime, dateTime2, tVar, mcVar, b0Var, aVar, o0VarE, (i15 & 65408) | ((i15 << 15) & 458752));
                    o0VarE.g0(false);
                    break;
                case 4:
                    o0VarE.C(789976781);
                    int i17 = i15 >> 3;
                    q.b(bVar, aVar, mcVar, b0Var, o0VarE, oz1.b.F | (i17 & 14) | ((i15 << 3) & 112) | (i17 & 896) | (i17 & 7168));
                    o0VarE.g0(false);
                    break;
                case 5:
                    o0VarE.C(789983297);
                    int i18 = i15 << 6;
                    k.b(dateTime, dateTime2, aVar, tVar, bVar, mcVar, b0Var, o0VarE, ((i15 << 9) & 57344) | (i18 & 896) | ((i15 << 3) & 7168) | (oz1.b.F << 12) | (i18 & 458752) | (i18 & 3670016));
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                    break;
                case 6:
                    o0VarE.C(789992431);
                    r.a(dateTime, dateTime2, tVar2, mcVar, b0Var, aVar, o0VarE, ((i15 << 15) & 458752) | (i15 & 65408));
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                    break;
                case 7:
                    o0VarE.C(790000942);
                    int i19 = oz1.b.F | ((i15 >> 3) & 14);
                    int i24 = i15 >> 6;
                    m.a(bVar, mcVar, b0Var, o0VarE, (i24 & 896) | i19 | (i24 & 112));
                    o0VarE.g0(false);
                    break;
                default:
                    o0VarE.C(-1279639412);
                    o0VarE.g0(false);
                    break;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(aVar, bVar, tVar, mcVar, b0Var, i14, 27);
        }
    }
}
