package qx;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.r0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import gs1.i;
import gs1.t;
import gs1.u;
import i3.mc;
import ix.j;
import ku1.l;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148396a;

        static {
            int[] iArr = new int[hx.c.values().length];
            try {
                iArr[hx.c.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hx.c.SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hx.c.NAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hx.c.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hx.c.STRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f148396a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0159  */
    /* JADX WARN: Code duplicated, block: B:140:0x0248  */
    /* JADX WARN: Code duplicated, block: B:175:0x035b  */
    /* JADX WARN: Code duplicated, block: B:80:0x010a  */
    public static final void a(mc mcVar, b0 b0Var, bx.b bVar, t tVar, j jVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        DateTime dateTimeWithZone;
        Interval interval;
        String str;
        String str2;
        String string;
        cx.a aVar;
        Integer numValueOf;
        cx.b bVar2;
        Integer numValueOf2;
        DateTime dateTimeG;
        i currentDayDailySleepDTO;
        i.b payload;
        Integer timezoneOffset;
        b0Var.getClass();
        jVar.getClass();
        o0 o0VarE = mVar.E(-1576956575);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(mcVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(b0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(bVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(jVar) ? 16384 : 8192;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            if (bVar != null) {
                o0VarE.C(-760561861);
                p1 p1VarC = s9.c.c(jVar.f95628h, o0VarE);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                rx.a aVar2 = new rx.a(context);
                hx.b event = bVar.getEvent();
                hx.c cVarB = event != null ? event.b() : null;
                boolean z14 = event != null && event.o();
                DateTimeZone dateTimeZoneForOffsetMillis = (event == null || (timezoneOffset = event.getTimezoneOffset()) == null) ? null : DateTimeZone.forOffsetMillis(timezoneOffset.intValue());
                e.f148394a.getClass();
                DateTimeZone dateTimeZoneA = (tVar == null || (currentDayDailySleepDTO = tVar.getCurrentDayDailySleepDTO()) == null || (payload = currentDayDailySleepDTO.getPayload()) == null) ? null : u.a(payload);
                if (dateTimeZoneForOffsetMillis == null) {
                    dateTimeZoneForOffsetMillis = DateTimeZone.getDefault();
                }
                if (dateTimeZoneA == null) {
                    dateTimeZoneForOffsetMillis.getClass();
                } else {
                    dateTimeZoneForOffsetMillis = dateTimeZoneA;
                }
                if (event != null) {
                    Parcelable.Creator<hx.b> creator = hx.b.CREATOR;
                    DateTime dateTimeK = event.k("yyyy-MM-dd'T'HH:mm:ss.S");
                    if (dateTimeK != null) {
                        dateTimeWithZone = dateTimeK.withZone(dateTimeZoneForOffsetMillis);
                    } else {
                        dateTimeWithZone = null;
                    }
                } else {
                    dateTimeWithZone = null;
                }
                Interval interval2 = new Interval(dateTimeWithZone, (event == null || (dateTimeG = hx.b.g(event)) == null) ? null : dateTimeG.withZone(dateTimeZoneForOffsetMillis));
                String strC = aVar2.c(bVar);
                if (z14) {
                    String shortFeedBack = event.getShortFeedBack();
                    tx.b bVar3 = aVar2.f154907i;
                    bVar3.getClass();
                    if (shortFeedBack == null) {
                        interval = interval2;
                    } else {
                        interval = interval2;
                        cx.b[] bVarArrValues = cx.b.values();
                        int length = bVarArrValues.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                bVar2 = null;
                                break;
                            }
                            int i18 = i17;
                            bVar2 = bVarArrValues[i18];
                            int i19 = length;
                            if (bVar2.f56328a.contains(shortFeedBack)) {
                                break;
                            }
                            i17 = i18 + 1;
                            length = i19;
                        }
                        if (bVar2 != null) {
                            switch (tx.b.a.f166808a[bVar2.ordinal()]) {
                                case 1:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_battery_recharge);
                                    break;
                                case 2:
                                    numValueOf2 = Integer.valueOf(R.string.msg_restful_period);
                                    break;
                                case 3:
                                    numValueOf2 = Integer.valueOf(R.string.msg_long_restful_period);
                                    break;
                                case 4:
                                    numValueOf2 = Integer.valueOf(R.string.msg_stressful_period);
                                    break;
                                case 5:
                                    numValueOf2 = Integer.valueOf(R.string.msg_need_a_break);
                                    break;
                                case 6:
                                    numValueOf2 = Integer.valueOf(R.string.msg_try_to_relax);
                                    break;
                                case 7:
                                    numValueOf2 = Integer.valueOf(R.string.msg_restful_nap);
                                    break;
                                case 8:
                                    numValueOf2 = Integer.valueOf(R.string.sleep_lbl_nap);
                                    break;
                                case 9:
                                case 10:
                                case 11:
                                    numValueOf2 = Integer.valueOf(R.string.msg_health_maintenance);
                                    break;
                                case 12:
                                case 13:
                                case 14:
                                    numValueOf2 = Integer.valueOf(R.string.msg_health_benefits);
                                    break;
                                case 15:
                                case 16:
                                    numValueOf2 = Integer.valueOf(R.string.msg_vo2_max_benefits);
                                    break;
                                case 17:
                                case 18:
                                case 19:
                                    numValueOf2 = Integer.valueOf(R.string.msg_recovery_benefits);
                                    break;
                                case 20:
                                    numValueOf2 = Integer.valueOf(R.string.msg_vo2_max_maintenance);
                                    break;
                                case 21:
                                case 22:
                                    numValueOf2 = Integer.valueOf(R.string.msg_fitness_maintenance);
                                    break;
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    numValueOf2 = Integer.valueOf(R.string.msg_fitness_benefits);
                                    break;
                                case 29:
                                case 30:
                                case 31:
                                    numValueOf2 = Integer.valueOf(R.string.msg_speed_maintenance);
                                    break;
                                case 32:
                                case 33:
                                    numValueOf2 = Integer.valueOf(R.string.msg_speed_benefits);
                                    break;
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                    numValueOf2 = Integer.valueOf(R.string.msg_high_intensity);
                                    break;
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                    numValueOf2 = Integer.valueOf(R.string.msg_strenuous);
                                    break;
                                default:
                                    numValueOf2 = null;
                                    break;
                            }
                        } else {
                            numValueOf2 = null;
                        }
                        String string2 = numValueOf2 != null ? bVar3.f166807a.getString(numValueOf2.intValue()) : null;
                        str = string2;
                    }
                    str = string2;
                } else {
                    interval = interval2;
                    str = null;
                }
                if (z14) {
                    String feedbackType = event.getFeedbackType();
                    tx.a aVar3 = aVar2.f154906h;
                    aVar3.getClass();
                    if (feedbackType == null) {
                        string = null;
                    } else {
                        cx.a[] aVarArrValues = cx.a.values();
                        int length2 = aVarArrValues.length;
                        int i24 = 0;
                        while (true) {
                            if (i24 < length2) {
                                int i25 = i24;
                                aVar = aVarArrValues[i25];
                                cx.a[] aVarArr = aVarArrValues;
                                if (!aVar.f56303a.contains(feedbackType)) {
                                    i24 = i25 + 1;
                                    aVarArrValues = aVarArr;
                                }
                            } else {
                                aVar = null;
                            }
                        }
                        if (aVar != null) {
                            switch (tx.a.C3138a.f166806a[aVar.ordinal()]) {
                                case 1:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_recovery_short);
                                    break;
                                case 2:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_recovery_bb_increase);
                                    break;
                                case 3:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_recovery_bb_not_increase);
                                    break;
                                case 4:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_recovery_long_bb_increase);
                                    break;
                                case 5:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_recovery_long_bb_not_increase);
                                    break;
                                case 6:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_recovery_evening);
                                    break;
                                case 7:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_stress_warning);
                                    break;
                                case 8:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_stress_long_continues_warning);
                                    break;
                                case 9:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_stress_evening_warning);
                                    break;
                                case 10:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_stress_long_evening_continues_warning);
                                    break;
                                case 11:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_stress);
                                    break;
                                case 12:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_stress_long);
                                    break;
                                case 13:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_stress_evening);
                                    break;
                                case 14:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_stress_long_evening);
                                    break;
                                case 15:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_nap_recovering_bb_increase);
                                    break;
                                case 16:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_nap_recovering_bb_maintain);
                                    break;
                                case 17:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_nap_recovering_bb_decrease);
                                    break;
                                case 18:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_nap_not_recovering_bb_increase);
                                    break;
                                case 19:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_nap_not_recovering_bb_maintain);
                                    break;
                                case 20:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_nap_not_recovering_bb_decrease);
                                    break;
                                case 21:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_exercise_te5);
                                    break;
                                case 22:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_exercise_te5_late);
                                    break;
                                case 23:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_exercise_te5_good_timing);
                                    break;
                                case 24:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_exercise_te4);
                                    break;
                                case 25:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_exercise_te4_late);
                                    break;
                                case 26:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_exercise_te4_good_timing);
                                    break;
                                case 27:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_exercise_te3);
                                    break;
                                case 28:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_exercise_te2);
                                    break;
                                case 29:
                                    numValueOf = Integer.valueOf(R.string.msg_body_battery_event_exercise_te_below_2);
                                    break;
                                default:
                                    numValueOf = null;
                                    break;
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            string = aVar3.f166805a.getString(numValueOf.intValue());
                        } else {
                            string = null;
                        }
                    }
                    str2 = string;
                } else {
                    str2 = null;
                }
                Interval interval3 = interval;
                d.a(mcVar, b0Var, strC, str, str2, z3.f.c(-1415475438, new oy0.b(bVar, tVar, interval3, jVar, dateTimeZoneForOffsetMillis, p1VarC, 9), o0VarE), z3.f.c(-2074541519, new pp.g(aVar2, 9, bVar, tVar), o0VarE), z3.f.c(-443172928, new l(bVar, interval3, cVarB, context, tVar, 14), o0VarE), o0VarE, (i16 & 14) | 14352384 | (i16 & 112));
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-753759903);
                o0Var.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(mcVar, b0Var, bVar, tVar, jVar, i14, 12);
        }
    }

    public static final LayerDrawable b(Context context) {
        bv.b.f21239a.getClass();
        bv.b.a();
        return r0.b(context, k1.f37122a.o() ? R.drawable.sleep_score : R.drawable.sleep, R.color.gcm_sleep_color, R.color.gcm_icon_on_color, r0.a.LARGE, 48);
    }
}
