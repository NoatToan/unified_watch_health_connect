package tu1;

import android.content.Context;
import androidx.fragment.app.v;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.o1;
import e23.l;
import gg1.m;
import i3.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import jv1.q;
import lc.u0;
import o13.p;
import o13.r;
import o13.u;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import pk1.t;
import vt1.n;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltu1/i;", "", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f166483a = new a(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0012R\u0014\u0010\"\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0014\u0010#\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u0014\u0010$\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u0014\u0010%\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0012R\u0014\u0010&\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0012R\u0014\u0010'\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0012R\u0014\u0010(\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0012R\u0014\u0010)\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0012R\u0014\u0010*\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0012R\u0014\u0010+\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0012R\u0014\u0010,\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u0014\u0010-\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0012R\u0014\u0010.\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0012¨\u0006/"}, d2 = {"Ltu1/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONTENT_REF_URL", "EXTRA_CONTENT_TITLE", "EXTRA_IMAGE_URL", "", "MAX_GOAL_SPEED_MPH", "D", "MAX_GOAL_SPEED_KMH", "MIN_GOAL_SPEED", "EMPTY_VALUE", "", "GOAL_TIME_PICKER_MAX_HOURS", "I", "MIN_GOAL_TIME_SECONDS", "MAX_GOAL_TIME_SECONDS", "DEFAULT_GOAL_END_WEEKS", "FBT_FITNESS_DEFAULT_GOAL_END_WEEKS", "FBT_PLAN_START_WEEKS", "FBT_PLAN_END_WEEKS", "FBT_FITNESS_START_WEEKS", "FBT_FITNESS_END_WEEKS", "GOAL_DATE_DURATION_INDEX", "GOAL_DATE_CALENDAR_INDEX", "PROGRESS_REPORT_REQUEST_CODE", "PROGRESS_REPORT_FIND_PLAN_RESULT_CODE", "PROGRESS_REPORT_CREATED_PLAN_RESULT_CODE", "PROGRESS_REPORT_NEW_PLAN_ID_KEY", "PERSONAL_RECORD_LONGEST_RUN_ID", "PERSONAL_RECORD_LONGEST_RIDE_ID", "PERSONAL_RECORD_LONGEST_SWIM_ID", "TWO_WEEKS_OFFSET", "ONE_WEEK_OFFSET", "FIFTEEN_KILOMETERS_IN_METERS", "FIFTY_KILOMETERS_IN_METERS", "NINETY_MINUTES_IN_SECONDS", "ONE_HUNDRED_THIRTY_FIVE_MINUTES_IN_SECONDS", "TWENTY_FIVE_KILOMETERS_IN_METERS", "THIRTY_KILOMETERS_IN_METERS", "THIRTY_FIVE_KILOMETERS_IN_METERS", "ONE_HUNDRED_KILOMETERS_IN_METERS", "ONE_HUNDRED_SIXTY_KILOMETERS_IN_METERS", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: tu1.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3134a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f166484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f166485b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f166486c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ int[] f166487d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ int[] f166488e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ int[] f166489f;

            static {
                int[] iArr = new int[m52.i.values().length];
                try {
                    iArr[m52.i.SPRINT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[m52.i.STANDARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[m52.i.HALF_IRON.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f166484a = iArr;
                int[] iArr2 = new int[n.values().length];
                try {
                    iArr2[n.FIVE_K.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[n.TEN_K.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[n.HALF_MARATHON.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[n.MARATHON.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                f166485b = iArr2;
                int[] iArr3 = new int[hv1.f.values().length];
                try {
                    iArr3[hv1.f.ZERO_FOUR.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr3[hv1.f.FIVE_NINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[hv1.f.TEN_PLUS.ordinal()] = 3;
                } catch (NoSuchFieldError unused10) {
                }
                f166486c = iArr3;
                int[] iArr4 = new int[m52.c.values().length];
                try {
                    iArr4[m52.c.RUNNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr4[m52.c.CYCLING.ordinal()] = 2;
                } catch (NoSuchFieldError unused12) {
                }
                f166487d = iArr4;
                int[] iArr5 = new int[o.values().length];
                try {
                    iArr5[o.f180175f.ordinal()] = 1;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr5[o.f180176g.ordinal()] = 2;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr5[o.f180178i.ordinal()] = 3;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr5[o.f180179j.ordinal()] = 4;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr5[o.f180180k.ordinal()] = 5;
                } catch (NoSuchFieldError unused17) {
                }
                f166488e = iArr5;
                int[] iArr6 = new int[vt1.k.values().length];
                try {
                    iArr6[vt1.k.CENTURY.ordinal()] = 1;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr6[vt1.k.METRIC_CENTURY.ordinal()] = 2;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr6[vt1.k.GRAND_FONDO.ordinal()] = 3;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr6[vt1.k.MOUNTAIN_BIKING.ordinal()] = 4;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr6[vt1.k.RACE.ordinal()] = 5;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr6[vt1.k.TIME_TRIAL.ordinal()] = 6;
                } catch (NoSuchFieldError unused23) {
                }
                f166489f = iArr6;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"tu1/i$a$b", "Lcom/garmin/android/apps/connectmobile/o1$a;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements o1.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mv1.e f166490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f166491b;

            public b(mv1.e eVar, e23.a<Unit> aVar) {
                this.f166490a = eVar;
                this.f166491b = aVar;
            }

            @Override // com.garmin.android.apps.connectmobile.o1.a
            public final void a(boolean z14) {
                l<Boolean, Unit> lVar = this.f166490a.f121190f;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(z14));
                }
                this.f166491b.invoke();
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q a(int i14, Context context) {
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDatePlusWeeks = localDateNow.plusWeeks(i14);
            localDatePlusWeeks.getClass();
            String string = context.getString(R.string.msg_week_plural_desc, Integer.valueOf(i14));
            string.getClass();
            fy1.i.a aVar = fy1.i.f73924a;
            DateTime dateTimeAtStartOfDay = localDateNow.toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            DateTime dateTimeAtStartOfDay2 = localDatePlusWeeks.toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay2.getClass();
            aVar.getClass();
            return new q(localDatePlusWeeks, string, fy1.i.a.j(context, dateTimeAtStartOfDay, dateTimeAtStartOfDay2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static n b(jv1.g gVar) {
            gVar.getClass();
            w13.c cVar = n.f180170k;
            ArrayList<n> arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                if (((n) next) != n.OTHER) {
                    arrayListK.add(next);
                }
            }
            ArrayList<p> arrayList = new ArrayList(y.r(arrayListK, 10));
            for (n nVar : arrayListK) {
                arrayList.add(new p(nVar, i(i.f166483a, nVar.f180173c)));
            }
            og0.a aVar = og0.a.f131967a;
            Double d14 = gVar.f101057a;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            gg0.i iVar = gVar.f101058b;
            if (iVar == null) {
                iVar = gg0.i.METER;
            }
            aVar.getClass();
            double dG = og0.a.g(dDoubleValue, iVar);
            for (p pVar : arrayList) {
                if (((j23.f) pVar.f128595b).contains(Double.valueOf(dG))) {
                    return (n) pVar.f128594a;
                }
            }
            return null;
        }

        public static p c(Context context, List list) {
            context.getClass();
            list.getClass();
            if (list.size() == wt1.q.f187129o.getF134973e()) {
                String string = context.getString(R.string.frequency_every_day);
                string.getClass();
                return new p(string, context.getString(R.string.frequency_every_day));
            }
            if (list.size() == 5) {
                wt1.q.f187120f.getClass();
                if (list.containsAll(wt1.q.a.d())) {
                    String string2 = context.getString(R.string.frequency_weekdays);
                    string2.getClass();
                    return new p(string2, context.getString(R.string.frequency_weekdays));
                }
            }
            if (list.size() == 2) {
                wt1.q.f187120f.getClass();
                if (list.containsAll(x.k(wt1.q.SATURDAY, wt1.q.SUNDAY))) {
                    String string3 = context.getString(R.string.device_settings_frequency_weekends);
                    string3.getClass();
                    return new p(string3, context.getString(R.string.device_settings_frequency_weekends));
                }
            }
            return new p(h0.k0(list, ", ", null, null, new ot.c(context, 14), 30), h0.k0(list, StringUtils.SPACE, null, null, new ot.c(context, 15), 30));
        }

        public static p d(Context context, long j8) {
            context.getClass();
            l3.f23124b.getClass();
            String strE1 = l3.a.e1(j8);
            if (strE1 == null) {
                strE1 = "00:00:00";
            }
            return new p(strE1, l3.a.k1(new l22.a(context), false, (int) j8));
        }

        public static Integer e(double d14, int i14) {
            if (i14 <= 10) {
                return Integer.valueOf(d14 >= 30000.0d ? 24 : 16);
            }
            if (i14 <= 15) {
                return Integer.valueOf(d14 < 30000.0d ? 12 : 20);
            }
            if (i14 > 15) {
                return Integer.valueOf(d14 < 30000.0d ? 10 : 16);
            }
            return null;
        }

        public static Integer f(double d14, hv1.f fVar) {
            int i14;
            fVar.getClass();
            if (d14 < 100000.0d) {
                int i15 = C3134a.f166486c[fVar.ordinal()];
                if (i15 != 1) {
                    if (i15 == 2) {
                        return 10;
                    }
                    if (i15 == 3) {
                        return null;
                    }
                    u0.r();
                    return null;
                }
            } else {
                if (d14 > 160000.0d) {
                    int i16 = C3134a.f166486c[fVar.ordinal()];
                    if (i16 == 1) {
                        i14 = 24;
                    } else if (i16 == 2) {
                        i14 = 18;
                    } else {
                        if (i16 != 3) {
                            u0.r();
                            return null;
                        }
                        i14 = 12;
                    }
                    return Integer.valueOf(i14);
                }
                int i17 = C3134a.f166486c[fVar.ordinal()];
                if (i17 == 1) {
                    return 20;
                }
                if (i17 != 2) {
                    if (i17 == 3) {
                        return null;
                    }
                    u0.r();
                    return null;
                }
            }
            return 16;
        }

        public static u g(Context context, boolean z14, double d14, double d15, m52.c cVar) {
            cVar.getClass();
            double d16 = d14 / d15;
            int i14 = C3134a.f166487d[cVar.ordinal()];
            if (i14 == 1) {
                og0.a.f131967a.getClass();
                l3.a aVar = l3.f23124b;
                long jE = (long) og0.a.e(d15, d14, z14);
                aVar.getClass();
                String strE1 = l3.a.e1(jE);
                if (strE1 == null) {
                    strE1 = "";
                }
                String string = context.getString(l3.a.N1(z14));
                string.getClass();
                return new u(strE1, string, e5.g(l3.a.k1(new l22.a(context), true, (int) og0.a.e(d15, d14, z14)), StringUtils.SPACE, context.getString(z14 ? R.string.lbl_per_kilometer : R.string.lbl_per_mile)));
            }
            if (i14 != 2) {
                String strM1 = l3.f23124b.M1(context, d16, true, false, "--");
                String string2 = context.getString(R.string.lbl_per_100_meters);
                string2.getClass();
                return new u(strM1, string2, com.nimbusds.jose.shaded.gson.internal.a.h(l3.a.k1(new l22.a(context), true, l3.a.r(d16, true)), context.getString(R.string.lbl_per), " 100 ", context.getString(R.string.meters)));
            }
            q3 q3Var = z14 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
            l3.f23124b.getClass();
            String strM0 = l3.a.M0(context, d16, q3Var, l3.f23130h, false);
            String string3 = context.getString(q3Var.f23223e);
            string3.getClass();
            String string4 = context.getString(z14 ? R.string.common_kph_string : R.string.common_mph_string);
            string4.getClass();
            return new u(strM0, string3, e5.g(strM0, StringUtils.SPACE, string4));
        }

        public static i53.c h(Context context, boolean z14, boolean z15) {
            Iterable iterableK;
            if (z14) {
                iterableK = z15 ? x.k(a(4, context), a(8, context), a(12, context)) : x.k(a(8, context), a(12, context), a(16, context));
            } else {
                iterableK = j0.f134944a;
            }
            return i53.a.e(iterableK);
        }

        public static j23.d i(a aVar, double d14) {
            aVar.getClass();
            double d15 = 0.05d * d14;
            return new j23.d(d14 - d15, d14 + d15);
        }

        public static tw1.k j(double d14, int i14) {
            if (d14 < 15000.0d) {
                return i14 <= 10 ? tw1.k.BEGINNER : tw1.k.INTERMEDIATE;
            }
            if (d14 < 25000.0d) {
                return i14 <= 15 ? tw1.k.BEGINNER : tw1.k.INTERMEDIATE;
            }
            if (d14 < 35000.0d) {
                return i14 <= 20 ? tw1.k.BEGINNER : tw1.k.INTERMEDIATE;
            }
            return i14 <= 25 ? tw1.k.BEGINNER : tw1.k.INTERMEDIATE;
        }

        public static String k(Context context, m52.i iVar, boolean z14) {
            String string;
            context.getClass();
            int i14 = iVar == null ? -1 : C3134a.f166484a[iVar.ordinal()];
            if (i14 == 1) {
                string = context.getString(R.string.triathlon_event_type_sprint);
            } else if (i14 == 2) {
                string = context.getString(R.string.triathlon_event_type_standard);
            } else if (i14 != 3) {
                String string2 = context.getString(R.string.lbl_stp_custom);
                string2.getClass();
                string = string2.toLowerCase(Locale.ROOT);
                string.getClass();
            } else {
                string = context.getString(R.string.triathlon_event_type_half);
            }
            string.getClass();
            if (z14) {
                string = e5.g(string, StringUtils.SPACE, context.getString(R.string.lbl_triathlon));
            }
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }

        public static ArrayList l(List list) {
            if (list == null) {
                return null;
            }
            wt1.q.f187120f.getClass();
            List listG = wt1.q.a.g();
            m mVarE1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1();
            if (mVarE1 == m.SUNDAY) {
                Collections.rotate(listG, -1);
            } else if (mVarE1 == m.MONDAY) {
                Collections.rotate(listG, -2);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (list.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public static p m(boolean z14, jv1.g gVar) {
            if (!z14) {
                return new p(Boolean.FALSE, null);
            }
            n nVarB = gVar.f101054c;
            if (nVarB == n.OTHER) {
                nVarB = b(gVar);
            }
            int i14 = nVarB == null ? -1 : C3134a.f166485b[nVarB.ordinal()];
            boolean z15 = true;
            if (i14 != 1 && i14 != 2 && i14 != 3 && i14 != 4) {
                z15 = false;
            }
            return new p(Boolean.valueOf(z15), nVarB);
        }

        public static void o(i.c cVar, mv1.e eVar, e23.a aVar) {
            cVar.getClass();
            eVar.getClass();
            if (!eVar.f121185a) {
                new androidx.appcompat.app.e.a(cVar).setCancelable(false).setTitle(eVar.f121186b).setMessage(eVar.f121187c).setPositiveButton(eVar.f121188d, new t(8, eVar, aVar)).show();
                return;
            }
            o1 o1VarA = o1.b.a(o1.f39651c, 0, eVar.f121187c, eVar.f121188d, eVar.f121189e, new b(eVar, aVar), eVar.f121186b, null, null, 386);
            v supportFragmentManager = cVar.getSupportFragmentManager();
            supportFragmentManager.getClass();
            o1VarA.show(supportFragmentManager, "GCMFragTwoBtnVerticalAlertDialog");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object n(v13.c cVar) {
            k kVar;
            if (cVar instanceof k) {
                kVar = (k) cVar;
                int i14 = kVar.f166494c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    kVar.f166494c = i14 - Integer.MIN_VALUE;
                } else {
                    kVar = new k(this, cVar);
                }
            } else {
                kVar = new k(this, cVar);
            }
            Object objM = kVar.f166492a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = kVar.f166494c;
            if (i15 == 0) {
                r.b(objM);
                e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                kVar.f166494c = 1;
                objM = e3Var.m(kVar);
                if (objM == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objM);
            }
            return Boolean.valueOf(!((Boolean) objM).booleanValue() && ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g4());
        }

        private a() {
        }
    }
}
