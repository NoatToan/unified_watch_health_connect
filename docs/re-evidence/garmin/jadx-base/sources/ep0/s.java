package ep0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lep0/s;", "Ln70/a0;", "Lr53/i;", "Lep0/e0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj70/d;", "Lj70/b0;", "cardData", "Lae0/b;", "getDailyUserSummariesUseCase", "Lf12/l;", "gcmUserSettings", "Lv21/e;", "nutritionFormatter", "<init>", "(Landroid/content/Context;Lr53/i;Lae0/b;Lf12/l;Lv21/e;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements n70.a0<r53.i<? extends e0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.i<j70.d<j70.b0>> f64892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ae0.b f64893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f64894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v21.e f64895e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64896a;

        static {
            int[] iArr = new int[o70.t.values().length];
            try {
                iArr[o70.t.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.t.Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.t.f130064h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.t.f130065i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o70.t.f130066j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o70.t.f130075r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o70.t.f130077v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o70.t.A.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[o70.t.B.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[o70.t.T.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[o70.t.C.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[o70.t.Y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[o70.t.H0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[o70.t.I0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[o70.t.Q0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f64896a = iArr;
        }
    }

    public s(Context context, r53.i<j70.d<j70.b0>> iVar, ae0.b bVar, f12.l lVar, v21.e eVar) {
        context.getClass();
        iVar.getClass();
        bVar.getClass();
        lVar.getClass();
        eVar.getClass();
        this.f64891a = context;
        this.f64892b = iVar;
        this.f64893c = bVar;
        this.f64894d = lVar;
        this.f64895e = eVar;
    }

    public final String c(i41.f fVar, boolean z14) {
        Integer weeklyAvg;
        String string;
        Context context = this.f64891a;
        n41.a aVar = new n41.a(context);
        if (fVar == null || (weeklyAvg = fVar.getWeeklyAvg()) == null) {
            return null;
        }
        String strB = aVar.b(weeklyAvg.intValue());
        if (z14) {
            string = aVar.f123602b.a(R.string.lbl_day_count_average, String.valueOf(e32.o.f62807j.f62819a));
        } else {
            string = context.getString(R.string.lbl_7d_avg);
            string.getClass();
        }
        return context.getString(R.string.string_space_string_pattern, strB, string);
    }

    public final String d(hs1.d dVar, boolean z14) {
        hs1.l respiration;
        Integer avgValue;
        if (dVar == null || (respiration = dVar.getRespiration()) == null || (avgValue = respiration.getAvgValue()) == null) {
            return null;
        }
        String strValueOf = String.valueOf(avgValue.intValue());
        Context context = this.f64891a;
        return context.getString(R.string.string_space_string_pattern, strValueOf, context.getString(z14 ? R.string.lbl_awake_average : R.string.lbl_awake_avg));
    }

    public final String e(km1.v vVar, boolean z14) {
        String strB;
        jm1.c sleepScores;
        Integer numJ;
        Context context = this.f64891a;
        b10.c cVar = new b10.c(new l22.a(context));
        if ((vVar != null ? Integer.valueOf(vVar.getSleepTimeSeconds()) : null) == null || vVar.getSleepTimeSeconds() <= 0) {
            strB = null;
        } else {
            strB = z14 ? cVar.b(vVar.getSleepTimeSeconds()) : cVar.f14213c.c(vVar.getSleepTimeSeconds());
        }
        if (((vVar == null || !vVar.getSleepFromDevice()) ? o70.t.b.f130095j : o70.t.b.f130096k) != o70.t.b.f130096k) {
            return strB;
        }
        String strValueOf = (vVar == null || (sleepScores = vVar.getSleepScores()) == null || (numJ = sleepScores.j()) == null) ? null : String.valueOf(numJ.intValue());
        if (strValueOf == null || strB == null) {
            return null;
        }
        return z14 ? context.getString(R.string.string_space_string_pattern, strValueOf, strB) : context.getString(R.string.string_slash_string_pattern, strValueOf, strB);
    }

    public final o13.p<Integer, Integer> f(hs1.d dVar) {
        hs1.i movement;
        hs1.j steps;
        hs1.i movement2;
        hs1.j steps2;
        hs1.i movement3;
        hs1.j pushes;
        hs1.i movement4;
        hs1.j pushes2;
        Integer goal = null;
        if (this.f64894d.B3()) {
            Integer value = (dVar == null || (movement4 = dVar.getMovement()) == null || (pushes2 = movement4.getPushes()) == null) ? null : pushes2.getValue();
            if (dVar != null && (movement3 = dVar.getMovement()) != null && (pushes = movement3.getPushes()) != null) {
                goal = pushes.getGoal();
            }
            return new o13.p<>(value, goal);
        }
        Integer value2 = (dVar == null || (movement2 = dVar.getMovement()) == null || (steps2 = movement2.getSteps()) == null) ? null : steps2.getValue();
        if (dVar != null && (movement = dVar.getMovement()) != null && (steps = movement.getSteps()) != null) {
            goal = steps.getGoal();
        }
        return new o13.p<>(value2, goal);
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetYesterdayStatsDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends e0> invoke() {
        return r53.s.A(new t(this.f64892b, this), s0.f129406a);
    }
}
