package jg0;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.o9;
import c.w;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import fg0.e;
import fg0.j;
import fg0.l;
import g.h;
import gg0.f;
import gl1.y;
import h4.r;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import qs.b0;
import r70.q;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:134:0x024e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0254 A[PHI: r25
      0x0254: PHI (r25v6 boolean) = (r25v2 boolean), (r25v7 boolean) binds: [B:138:0x0266, B:135:0x0252] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0257  */
    /* JADX WARN: Code duplicated, block: B:141:0x026b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0270  */
    /* JADX WARN: Code duplicated, block: B:145:0x0276  */
    /* JADX WARN: Code duplicated, block: B:147:0x027a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0280 A[PHI: r26
      0x0280: PHI (r26v3 java.lang.String) = (r26v0 java.lang.String), (r26v4 java.lang.String) binds: [B:151:0x0291, B:148:0x027e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x0283  */
    /* JADX WARN: Code duplicated, block: B:154:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x0298  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:160:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:163:0x02df  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:168:0x0303  */
    /* JADX WARN: Code duplicated, block: B:169:0x030e  */
    /* JADX WARN: Code duplicated, block: B:173:0x035c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0361  */
    /* JADX WARN: Code duplicated, block: B:176:0x0365  */
    /* JADX WARN: Code duplicated, block: B:177:0x0382  */
    /* JADX WARN: Code duplicated, block: B:180:0x0387  */
    /* JADX WARN: Code duplicated, block: B:182:0x038b  */
    /* JADX WARN: Code duplicated, block: B:183:0x038e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0396  */
    /* JADX WARN: Code duplicated, block: B:188:0x039e  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:197:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:200:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:202:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:204:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:209:0x0405  */
    /* JADX WARN: Code duplicated, block: B:210:0x0407  */
    /* JADX WARN: Code duplicated, block: B:213:0x041c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0423  */
    /* JADX WARN: Code duplicated, block: B:218:0x0457  */
    /* JADX WARN: Code duplicated, block: B:219:0x0459  */
    /* JADX WARN: Code duplicated, block: B:222:0x0460  */
    /* JADX WARN: Code duplicated, block: B:223:0x0462  */
    /* JADX WARN: Code duplicated, block: B:226:0x0479  */
    /* JADX WARN: Code duplicated, block: B:228:0x0480  */
    /* JADX WARN: Instruction removed from duplicated block: B:166:0x02ed, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:169:0x030e, please report this as an issue */
    public static final void a(r rVar, yz1.d dVar, l lVar, boolean z14, q qVar, lg0.c cVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        Long lValueOf;
        String strV0;
        String strP;
        String str;
        boolean z15;
        boolean z16;
        String strO;
        boolean z17;
        boolean z18;
        String str2;
        String strO2;
        String str3;
        String strJ;
        boolean z19;
        String str4;
        j eventCustomization;
        Long predictedRaceTimeDuration;
        String string;
        boolean z24;
        ArrayList arrayList;
        boolean z25;
        int i16;
        boolean z26;
        boolean zR;
        Object objQ;
        m.a aVar;
        c.q qVarC;
        boolean z27;
        boolean z28;
        boolean zR2;
        Object objQ2;
        String str5;
        boolean z29;
        String strN;
        String str6;
        boolean z34;
        Integer iconId;
        Double temperature;
        long j8;
        String timeZoneId;
        o0 o0VarE = mVar.E(343963638);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(qVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(cVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            e event = lVar.getEvent();
            f eventType = event.getEventType();
            if (eventType == null) {
                eventType = f.f77144v;
            }
            x0 x0Var = eventType.f77149c;
            boolean z35 = event.getLocationStartPoint() == null;
            String eventName = event.getEventName();
            String str7 = eventName == null ? "" : eventName;
            String strP2 = y.P(R.string.lbl_placeholder_event, new Object[]{gl1.d.T(x0Var.f4360c, o0VarE, 0)}, o0VarE);
            if (z35) {
                o0VarE.C(-770569164);
                strP2 = y.P(R.string.lbl_virtual_placeholder, new Object[]{strP2}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-770453844);
                o0VarE.g0(false);
            }
            og0.a aVar2 = og0.a.f131967a;
            LocalDate date = event.getDate();
            fg0.r eventTimeLocal = event.getEventTimeLocal();
            aVar2.getClass();
            String strH = com.nimbusds.jose.shaded.gson.internal.a.h(com.nimbusds.jose.shaded.gson.internal.a.h(strP2, ". ", og0.a.n(context, date, eventTimeLocal, true), "."), StringUtils.SPACE, str7, ".");
            long j14 = 1000;
            long millis = new DateTime().toLocalDate().toDateTimeAtCurrentTime().getMillis() / j14;
            LocalDate date2 = event.getDate();
            fg0.r eventTimeLocal2 = event.getEventTimeLocal();
            String upperCase = null;
            LocalTime localTimeF = eventTimeLocal2 != null ? eventTimeLocal2.f() : null;
            if (date2 == null || localTimeF == null) {
                lValueOf = null;
            } else {
                fg0.r eventTimeLocal3 = event.getEventTimeLocal();
                if (eventTimeLocal3 != null) {
                    timeZoneId = eventTimeLocal3.getTimeZoneId();
                    j8 = j14;
                } else {
                    j8 = j14;
                    timeZoneId = null;
                }
                lValueOf = Long.valueOf(og0.a.p(date2, localTimeF, timeZoneId).getMillis() / j8);
            }
            boolean z36 = lValueOf != null && millis >= lValueOf.longValue();
            h42.a weather = lVar.getWeather();
            if (weather == null || (temperature = weather.getTemperature()) == null) {
                strV0 = null;
            } else {
                double dDoubleValue = temperature.doubleValue();
                l3.a aVar3 = l3.f23124b;
                l22.a aVar4 = new l22.a(context);
                boolean zB = og0.a.B();
                aVar3.getClass();
                strV0 = l3.a.V0(aVar4, dDoubleValue, zB);
            }
            b0.a aVar5 = b0.f147008d;
            h42.a weather2 = lVar.getWeather();
            int iIntValue = (weather2 == null || (iconId = weather2.getIconId()) == null) ? -1 : iconId.intValue();
            aVar5.getClass();
            b0 b0VarA = b0.a.a(iIntValue);
            if (b0VarA == null) {
                h42.a weather3 = lVar.getWeather();
                b0VarA = b0.a.b(weather3 != null ? weather3.getDescription() : null);
            }
            Integer numValueOf = ((cVar != null && cVar.f112166c) || b0VarA == null) ? null : Integer.valueOf(b0VarA.f147029b);
            boolean z37 = (strV0 == null || z36 || b0VarA != null) ? false : true;
            if (z37) {
                o0VarE.C(-768884872);
                if (strV0 == null) {
                    o0VarE.C(-768832204);
                    z34 = false;
                    o0VarE.g0(false);
                    strP = null;
                } else {
                    o0VarE.C(-768832203);
                    strP = y.P(R.string.lbl_value_avg, new Object[]{strV0}, o0VarE);
                    z34 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z34);
            } else {
                numValueOf = numValueOf;
                o0VarE.C(-768773396);
                o0VarE.g0(false);
                strP = strV0;
            }
            if (cVar != null) {
                str = strP;
                z15 = cVar.f112166c;
                if (z15) {
                    strO = cVar.f112167d;
                    z16 = z37;
                    if (strO == null) {
                        strO = "";
                    }
                } else {
                    z16 = z37;
                    strO = og0.a.o(context, event.getDate(), event.getEventTimeLocal(), false);
                    if (strO == null) {
                        strO = "";
                    }
                }
                if (cVar != null) {
                    z17 = true;
                    z18 = cVar.f112166c;
                    if (z18) {
                        strO2 = cVar.f112167d;
                        str2 = strO;
                        if (strO2 == null) {
                            strO2 = "";
                        }
                    } else {
                        str2 = strO;
                        strO2 = og0.a.o(context, event.getDate(), event.getEventTimeLocal(), z17);
                        if (strO2 == null) {
                            strO2 = "";
                        }
                    }
                    if (str == null || b0VarA != null) {
                        o0VarE.C(-767983640);
                        if (z36 != 0) {
                            str3 = str7;
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767937202, R.string.weather_section_title, o0VarE, false);
                        } else {
                            str3 = str7;
                            if (z16) {
                                o0VarE.C(-767819309);
                                strJ = y.P(R.string.lbl_average_value, new Object[]{y.Q(o0VarE, R.string.lbl_temperature_cap)}, o0VarE);
                                o0VarE.g0(false);
                            } else {
                                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767663348, R.string.weather_forecast_label, o0VarE, false);
                            }
                        }
                        if (str != null) {
                            strJ = ((Object) strJ) + ", " + strV0;
                            Unit unit = Unit.INSTANCE;
                        }
                        if (b0VarA == null) {
                            o0VarE.C(-767408529);
                            z19 = false;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-767408528);
                            strJ = ((Object) strJ) + ", " + y.Q(o0VarE, b0VarA.f147030c);
                            Unit unit2 = Unit.INSTANCE;
                            z19 = false;
                            o0VarE.g0(false);
                        }
                        str4 = ((Object) strJ) + ".";
                        o0VarE.g0(z19);
                    } else {
                        o0VarE.C(-767241748);
                        o0VarE.g0(false);
                        str3 = str7;
                        str4 = "";
                    }
                    String str8 = strO2 + ". " + ((Object) str4);
                    eventCustomization = event.getEventCustomization();
                    if (eventCustomization != null) {
                        predictedRaceTimeDuration = eventCustomization.getPredictedRaceTimeDuration();
                    } else {
                        predictedRaceTimeDuration = null;
                    }
                    if (predictedRaceTimeDuration != null) {
                        l3.a aVar6 = l3.f23124b;
                        Long predictedRaceTimeDuration2 = event.getEventCustomization().getPredictedRaceTimeDuration();
                        aVar6.getClass();
                        string = context.getString(R.string.current_race_prediction_time, l3.a.g1(predictedRaceTimeDuration2));
                    } else {
                        string = null;
                    }
                    String str9 = string != null ? string : "";
                    if (cVar != null) {
                        z24 = cVar.f112165b;
                    } else {
                        z24 = true;
                    }
                    arrayList = new ArrayList();
                    if (z24) {
                        o0VarE.C(-766629870);
                        if (cVar != null) {
                            z25 = true;
                            z29 = cVar.f112166c;
                            if (z29) {
                                strN = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -766378398, R.string.lbl_finished, o0VarE, false);
                            } else {
                                o0VarE.C(-766298356);
                                o0VarE.g0(false);
                                strN = og0.a.n(context, event.getDate(), event.getEventTimeLocal(), false);
                            }
                            if (strN != null) {
                                upperCase = strN.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                            }
                            str6 = upperCase;
                            if (str6 != null) {
                                arrayList.add(str6);
                            }
                            o0VarE.g0(false);
                        } else {
                            z25 = true;
                        }
                        if (z29) {
                            strN = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -766378398, R.string.lbl_finished, o0VarE, false);
                        } else {
                            o0VarE.C(-766298356);
                            o0VarE.g0(false);
                            strN = og0.a.n(context, event.getDate(), event.getEventTimeLocal(), false);
                        }
                        if (strN != null) {
                            upperCase = strN.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        str6 = upperCase;
                        if (str6 != null) {
                            arrayList.add(str6);
                        }
                        o0VarE.g0(false);
                    } else {
                        z25 = true;
                        o0VarE.C(-766143604);
                        o0VarE.g0(false);
                    }
                    if (cVar != null && (str5 = cVar.f112168e) != null) {
                        arrayList.add(str5);
                    }
                    h hVar = new h();
                    i16 = i15 & 458752;
                    if (i16 == 131072) {
                        z26 = z25;
                    } else {
                        z26 = false;
                    }
                    zR = z26 | o0VarE.r(qVar) | o0VarE.r(context);
                    objQ = o0VarE.q();
                    aVar = m.f135153a;
                    if (zR) {
                        objQ = new gw1.d(cVar, 24, qVar, context);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new gw1.d(cVar, 24, qVar, context);
                            o0VarE.K(objQ);
                        }
                    }
                    qVarC = w.c(hVar, (e23.l) objQ, o0VarE, 0);
                    boolean zB2 = yz1.e.b(dVar);
                    String imageUrl = lVar.getImageUrl();
                    u4.d dVar2 = x0Var.f4362e;
                    f02.h.f67736a.getClass();
                    long jA = f02.h.a(o0VarE);
                    long jA2 = n5.a.a(o0VarE, x0Var.f4366i);
                    Boolean boolValueOf = Boolean.valueOf(zB2);
                    if (i16 == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    zR2 = z27 | z28 | o0VarE.r(event) | o0VarE.r(context) | o0VarE.r(qVarC);
                    objQ2 = o0VarE.q();
                    if (zR2) {
                        o9 o9Var = new o9(cVar, z14, event, context, qVarC, 2);
                        o0VarE.K(o9Var);
                        objQ2 = o9Var;
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            o9 o9Var2 = new o9(cVar, z14, event, context, qVarC, 2);
                            o0VarE.K(o9Var2);
                            objQ2 = o9Var2;
                        }
                    }
                    o0Var = o0VarE;
                    kg0.b.a(rVar, boolValueOf, arrayList, imageUrl, dVar2, jA, jA2, str3, str2, string, strH, str8, str9, z14, str, numValueOf, (e23.a) objQ2, o0Var, i15 & 14, (i15 << 6) & 458752);
                } else {
                    z17 = true;
                }
                if (z18) {
                    strO2 = cVar.f112167d;
                    str2 = strO;
                    if (strO2 == null) {
                        strO2 = "";
                    }
                } else {
                    str2 = strO;
                    strO2 = og0.a.o(context, event.getDate(), event.getEventTimeLocal(), z17);
                    if (strO2 == null) {
                        strO2 = "";
                    }
                }
                if (str == null) {
                    o0VarE.C(-767983640);
                    if (z36 != 0) {
                        str3 = str7;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767937202, R.string.weather_section_title, o0VarE, false);
                    } else {
                        str3 = str7;
                        if (z16) {
                            o0VarE.C(-767819309);
                            strJ = y.P(R.string.lbl_average_value, new Object[]{y.Q(o0VarE, R.string.lbl_temperature_cap)}, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767663348, R.string.weather_forecast_label, o0VarE, false);
                        }
                    }
                    if (str != null) {
                        strJ = ((Object) strJ) + ", " + strV0;
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (b0VarA == null) {
                        o0VarE.C(-767408529);
                        z19 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-767408528);
                        strJ = ((Object) strJ) + ", " + y.Q(o0VarE, b0VarA.f147030c);
                        Unit unit4 = Unit.INSTANCE;
                        z19 = false;
                        o0VarE.g0(false);
                    }
                    str4 = ((Object) strJ) + ".";
                    o0VarE.g0(z19);
                } else {
                    o0VarE.C(-767983640);
                    if (z36 != 0) {
                        str3 = str7;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767937202, R.string.weather_section_title, o0VarE, false);
                    } else {
                        str3 = str7;
                        if (z16) {
                            o0VarE.C(-767819309);
                            strJ = y.P(R.string.lbl_average_value, new Object[]{y.Q(o0VarE, R.string.lbl_temperature_cap)}, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767663348, R.string.weather_forecast_label, o0VarE, false);
                        }
                    }
                    if (str != null) {
                        strJ = ((Object) strJ) + ", " + strV0;
                        Unit unit5 = Unit.INSTANCE;
                    }
                    if (b0VarA == null) {
                        o0VarE.C(-767408529);
                        z19 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-767408528);
                        strJ = ((Object) strJ) + ", " + y.Q(o0VarE, b0VarA.f147030c);
                        Unit unit6 = Unit.INSTANCE;
                        z19 = false;
                        o0VarE.g0(false);
                    }
                    str4 = ((Object) strJ) + ".";
                    o0VarE.g0(z19);
                }
                String str10 = strO2 + ". " + ((Object) str4);
                eventCustomization = event.getEventCustomization();
                if (eventCustomization != null) {
                    predictedRaceTimeDuration = eventCustomization.getPredictedRaceTimeDuration();
                } else {
                    predictedRaceTimeDuration = null;
                }
                if (predictedRaceTimeDuration != null) {
                    l3.a aVar7 = l3.f23124b;
                    Long predictedRaceTimeDuration3 = event.getEventCustomization().getPredictedRaceTimeDuration();
                    aVar7.getClass();
                    string = context.getString(R.string.current_race_prediction_time, l3.a.g1(predictedRaceTimeDuration3));
                } else {
                    string = null;
                }
                if (string != null) {
                }
                if (cVar != null) {
                    z24 = cVar.f112165b;
                } else {
                    z24 = true;
                }
                arrayList = new ArrayList();
                if (z24) {
                    o0VarE.C(-766629870);
                    if (cVar != null) {
                        z25 = true;
                        if (cVar.f112166c) {
                        }
                        if (z29) {
                            strN = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -766378398, R.string.lbl_finished, o0VarE, false);
                        } else {
                            o0VarE.C(-766298356);
                            o0VarE.g0(false);
                            strN = og0.a.n(context, event.getDate(), event.getEventTimeLocal(), false);
                        }
                        if (strN != null) {
                            upperCase = strN.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        str6 = upperCase;
                        if (str6 != null) {
                            arrayList.add(str6);
                        }
                        o0VarE.g0(false);
                    } else {
                        z25 = true;
                    }
                    if (z29) {
                        strN = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -766378398, R.string.lbl_finished, o0VarE, false);
                    } else {
                        o0VarE.C(-766298356);
                        o0VarE.g0(false);
                        strN = og0.a.n(context, event.getDate(), event.getEventTimeLocal(), false);
                    }
                    if (strN != null) {
                        upperCase = strN.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    str6 = upperCase;
                    if (str6 != null) {
                        arrayList.add(str6);
                    }
                    o0VarE.g0(false);
                } else {
                    z25 = true;
                    o0VarE.C(-766143604);
                    o0VarE.g0(false);
                }
                if (cVar != null) {
                    arrayList.add(str5);
                }
                h hVar2 = new h();
                i16 = i15 & 458752;
                if (i16 == 131072) {
                    z26 = z25;
                } else {
                    z26 = false;
                }
                zR = z26 | o0VarE.r(qVar) | o0VarE.r(context);
                objQ = o0VarE.q();
                aVar = m.f135153a;
                if (zR) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new gw1.d(cVar, 24, qVar, context);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new gw1.d(cVar, 24, qVar, context);
                    o0VarE.K(objQ);
                }
                qVarC = w.c(hVar2, (e23.l) objQ, o0VarE, 0);
                boolean zB3 = yz1.e.b(dVar);
                String imageUrl2 = lVar.getImageUrl();
                u4.d dVar3 = x0Var.f4362e;
                f02.h.f67736a.getClass();
                long jA3 = f02.h.a(o0VarE);
                long jA4 = n5.a.a(o0VarE, x0Var.f4366i);
                Boolean boolValueOf2 = Boolean.valueOf(zB3);
                if (i16 == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if ((i15 & 7168) == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                zR2 = z27 | z28 | o0VarE.r(event) | o0VarE.r(context) | o0VarE.r(qVarC);
                objQ2 = o0VarE.q();
                if (zR2) {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        o9 o9Var3 = new o9(cVar, z14, event, context, qVarC, 2);
                        o0VarE.K(o9Var3);
                        objQ2 = o9Var3;
                    }
                } else {
                    o9 o9Var4 = new o9(cVar, z14, event, context, qVarC, 2);
                    o0VarE.K(o9Var4);
                    objQ2 = o9Var4;
                }
                o0Var = o0VarE;
                kg0.b.a(rVar, boolValueOf2, arrayList, imageUrl2, dVar3, jA3, jA4, str3, str2, string, strH, str10, str9, z14, str, numValueOf, (e23.a) objQ2, o0Var, i15 & 14, (i15 << 6) & 458752);
            } else {
                str = strP;
            }
            if (z15) {
                strO = cVar.f112167d;
                z16 = z37;
                if (strO == null) {
                    strO = "";
                }
            } else {
                z16 = z37;
                strO = og0.a.o(context, event.getDate(), event.getEventTimeLocal(), false);
                if (strO == null) {
                    strO = "";
                }
            }
            if (cVar != null) {
                z17 = true;
                if (cVar.f112166c) {
                }
                if (z18) {
                    strO2 = cVar.f112167d;
                    str2 = strO;
                    if (strO2 == null) {
                        strO2 = "";
                    }
                } else {
                    str2 = strO;
                    strO2 = og0.a.o(context, event.getDate(), event.getEventTimeLocal(), z17);
                    if (strO2 == null) {
                        strO2 = "";
                    }
                }
                if (str == null) {
                    o0VarE.C(-767983640);
                    if (z36 != 0) {
                        str3 = str7;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767937202, R.string.weather_section_title, o0VarE, false);
                    } else {
                        str3 = str7;
                        if (z16) {
                            o0VarE.C(-767819309);
                            strJ = y.P(R.string.lbl_average_value, new Object[]{y.Q(o0VarE, R.string.lbl_temperature_cap)}, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767663348, R.string.weather_forecast_label, o0VarE, false);
                        }
                    }
                    if (str != null) {
                        strJ = ((Object) strJ) + ", " + strV0;
                        Unit unit7 = Unit.INSTANCE;
                    }
                    if (b0VarA == null) {
                        o0VarE.C(-767408529);
                        z19 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-767408528);
                        strJ = ((Object) strJ) + ", " + y.Q(o0VarE, b0VarA.f147030c);
                        Unit unit8 = Unit.INSTANCE;
                        z19 = false;
                        o0VarE.g0(false);
                    }
                    str4 = ((Object) strJ) + ".";
                    o0VarE.g0(z19);
                } else {
                    o0VarE.C(-767983640);
                    if (z36 != 0) {
                        str3 = str7;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767937202, R.string.weather_section_title, o0VarE, false);
                    } else {
                        str3 = str7;
                        if (z16) {
                            o0VarE.C(-767819309);
                            strJ = y.P(R.string.lbl_average_value, new Object[]{y.Q(o0VarE, R.string.lbl_temperature_cap)}, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767663348, R.string.weather_forecast_label, o0VarE, false);
                        }
                    }
                    if (str != null) {
                        strJ = ((Object) strJ) + ", " + strV0;
                        Unit unit9 = Unit.INSTANCE;
                    }
                    if (b0VarA == null) {
                        o0VarE.C(-767408529);
                        z19 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-767408528);
                        strJ = ((Object) strJ) + ", " + y.Q(o0VarE, b0VarA.f147030c);
                        Unit unit10 = Unit.INSTANCE;
                        z19 = false;
                        o0VarE.g0(false);
                    }
                    str4 = ((Object) strJ) + ".";
                    o0VarE.g0(z19);
                }
                String str11 = strO2 + ". " + ((Object) str4);
                eventCustomization = event.getEventCustomization();
                if (eventCustomization != null) {
                    predictedRaceTimeDuration = eventCustomization.getPredictedRaceTimeDuration();
                } else {
                    predictedRaceTimeDuration = null;
                }
                if (predictedRaceTimeDuration != null) {
                    l3.a aVar8 = l3.f23124b;
                    Long predictedRaceTimeDuration4 = event.getEventCustomization().getPredictedRaceTimeDuration();
                    aVar8.getClass();
                    string = context.getString(R.string.current_race_prediction_time, l3.a.g1(predictedRaceTimeDuration4));
                } else {
                    string = null;
                }
                if (string != null) {
                }
                if (cVar != null) {
                    z24 = cVar.f112165b;
                } else {
                    z24 = true;
                }
                arrayList = new ArrayList();
                if (z24) {
                    o0VarE.C(-766629870);
                    if (cVar != null) {
                        z25 = true;
                        if (cVar.f112166c) {
                        }
                        if (z29) {
                            strN = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -766378398, R.string.lbl_finished, o0VarE, false);
                        } else {
                            o0VarE.C(-766298356);
                            o0VarE.g0(false);
                            strN = og0.a.n(context, event.getDate(), event.getEventTimeLocal(), false);
                        }
                        if (strN != null) {
                            upperCase = strN.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        str6 = upperCase;
                        if (str6 != null) {
                            arrayList.add(str6);
                        }
                        o0VarE.g0(false);
                    } else {
                        z25 = true;
                    }
                    if (z29) {
                        strN = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -766378398, R.string.lbl_finished, o0VarE, false);
                    } else {
                        o0VarE.C(-766298356);
                        o0VarE.g0(false);
                        strN = og0.a.n(context, event.getDate(), event.getEventTimeLocal(), false);
                    }
                    if (strN != null) {
                        upperCase = strN.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    str6 = upperCase;
                    if (str6 != null) {
                        arrayList.add(str6);
                    }
                    o0VarE.g0(false);
                } else {
                    z25 = true;
                    o0VarE.C(-766143604);
                    o0VarE.g0(false);
                }
                if (cVar != null) {
                    arrayList.add(str5);
                }
                h hVar3 = new h();
                i16 = i15 & 458752;
                if (i16 == 131072) {
                    z26 = z25;
                } else {
                    z26 = false;
                }
                zR = z26 | o0VarE.r(qVar) | o0VarE.r(context);
                objQ = o0VarE.q();
                aVar = m.f135153a;
                if (zR) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new gw1.d(cVar, 24, qVar, context);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new gw1.d(cVar, 24, qVar, context);
                    o0VarE.K(objQ);
                }
                qVarC = w.c(hVar3, (e23.l) objQ, o0VarE, 0);
                boolean zB4 = yz1.e.b(dVar);
                String imageUrl3 = lVar.getImageUrl();
                u4.d dVar4 = x0Var.f4362e;
                f02.h.f67736a.getClass();
                long jA5 = f02.h.a(o0VarE);
                long jA6 = n5.a.a(o0VarE, x0Var.f4366i);
                Boolean boolValueOf3 = Boolean.valueOf(zB4);
                if (i16 == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if ((i15 & 7168) == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                zR2 = z27 | z28 | o0VarE.r(event) | o0VarE.r(context) | o0VarE.r(qVarC);
                objQ2 = o0VarE.q();
                if (zR2) {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        o9 o9Var5 = new o9(cVar, z14, event, context, qVarC, 2);
                        o0VarE.K(o9Var5);
                        objQ2 = o9Var5;
                    }
                } else {
                    o9 o9Var6 = new o9(cVar, z14, event, context, qVarC, 2);
                    o0VarE.K(o9Var6);
                    objQ2 = o9Var6;
                }
                o0Var = o0VarE;
                kg0.b.a(rVar, boolValueOf3, arrayList, imageUrl3, dVar4, jA5, jA6, str3, str2, string, strH, str11, str9, z14, str, numValueOf, (e23.a) objQ2, o0Var, i15 & 14, (i15 << 6) & 458752);
            } else {
                z17 = true;
            }
            if (z18) {
                strO2 = cVar.f112167d;
                str2 = strO;
                if (strO2 == null) {
                    strO2 = "";
                }
            } else {
                str2 = strO;
                strO2 = og0.a.o(context, event.getDate(), event.getEventTimeLocal(), z17);
                if (strO2 == null) {
                    strO2 = "";
                }
            }
            if (str == null) {
                o0VarE.C(-767983640);
                if (z36 != 0) {
                    str3 = str7;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767937202, R.string.weather_section_title, o0VarE, false);
                } else {
                    str3 = str7;
                    if (z16) {
                        o0VarE.C(-767819309);
                        strJ = y.P(R.string.lbl_average_value, new Object[]{y.Q(o0VarE, R.string.lbl_temperature_cap)}, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767663348, R.string.weather_forecast_label, o0VarE, false);
                    }
                }
                if (str != null) {
                    strJ = ((Object) strJ) + ", " + strV0;
                    Unit unit11 = Unit.INSTANCE;
                }
                if (b0VarA == null) {
                    o0VarE.C(-767408529);
                    z19 = false;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-767408528);
                    strJ = ((Object) strJ) + ", " + y.Q(o0VarE, b0VarA.f147030c);
                    Unit unit12 = Unit.INSTANCE;
                    z19 = false;
                    o0VarE.g0(false);
                }
                str4 = ((Object) strJ) + ".";
                o0VarE.g0(z19);
            } else {
                o0VarE.C(-767983640);
                if (z36 != 0) {
                    str3 = str7;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767937202, R.string.weather_section_title, o0VarE, false);
                } else {
                    str3 = str7;
                    if (z16) {
                        o0VarE.C(-767819309);
                        strJ = y.P(R.string.lbl_average_value, new Object[]{y.Q(o0VarE, R.string.lbl_temperature_cap)}, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -767663348, R.string.weather_forecast_label, o0VarE, false);
                    }
                }
                if (str != null) {
                    strJ = ((Object) strJ) + ", " + strV0;
                    Unit unit13 = Unit.INSTANCE;
                }
                if (b0VarA == null) {
                    o0VarE.C(-767408529);
                    z19 = false;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-767408528);
                    strJ = ((Object) strJ) + ", " + y.Q(o0VarE, b0VarA.f147030c);
                    Unit unit14 = Unit.INSTANCE;
                    z19 = false;
                    o0VarE.g0(false);
                }
                str4 = ((Object) strJ) + ".";
                o0VarE.g0(z19);
            }
            String str12 = strO2 + ". " + ((Object) str4);
            eventCustomization = event.getEventCustomization();
            if (eventCustomization != null) {
                predictedRaceTimeDuration = eventCustomization.getPredictedRaceTimeDuration();
            } else {
                predictedRaceTimeDuration = null;
            }
            if (predictedRaceTimeDuration != null) {
                l3.a aVar9 = l3.f23124b;
                Long predictedRaceTimeDuration5 = event.getEventCustomization().getPredictedRaceTimeDuration();
                aVar9.getClass();
                string = context.getString(R.string.current_race_prediction_time, l3.a.g1(predictedRaceTimeDuration5));
            } else {
                string = null;
            }
            if (string != null) {
            }
            if (cVar != null) {
                z24 = cVar.f112165b;
            } else {
                z24 = true;
            }
            arrayList = new ArrayList();
            if (z24) {
                o0VarE.C(-766629870);
                if (cVar != null) {
                    z25 = true;
                    if (cVar.f112166c) {
                    }
                    if (z29) {
                        strN = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -766378398, R.string.lbl_finished, o0VarE, false);
                    } else {
                        o0VarE.C(-766298356);
                        o0VarE.g0(false);
                        strN = og0.a.n(context, event.getDate(), event.getEventTimeLocal(), false);
                    }
                    if (strN != null) {
                        upperCase = strN.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    str6 = upperCase;
                    if (str6 != null) {
                        arrayList.add(str6);
                    }
                    o0VarE.g0(false);
                } else {
                    z25 = true;
                }
                if (z29) {
                    strN = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -766378398, R.string.lbl_finished, o0VarE, false);
                } else {
                    o0VarE.C(-766298356);
                    o0VarE.g0(false);
                    strN = og0.a.n(context, event.getDate(), event.getEventTimeLocal(), false);
                }
                if (strN != null) {
                    upperCase = strN.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                }
                str6 = upperCase;
                if (str6 != null) {
                    arrayList.add(str6);
                }
                o0VarE.g0(false);
            } else {
                z25 = true;
                o0VarE.C(-766143604);
                o0VarE.g0(false);
            }
            if (cVar != null) {
                arrayList.add(str5);
            }
            h hVar4 = new h();
            i16 = i15 & 458752;
            if (i16 == 131072) {
                z26 = z25;
            } else {
                z26 = false;
            }
            zR = z26 | o0VarE.r(qVar) | o0VarE.r(context);
            objQ = o0VarE.q();
            aVar = m.f135153a;
            if (zR) {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new gw1.d(cVar, 24, qVar, context);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new gw1.d(cVar, 24, qVar, context);
                o0VarE.K(objQ);
            }
            qVarC = w.c(hVar4, (e23.l) objQ, o0VarE, 0);
            boolean zB5 = yz1.e.b(dVar);
            String imageUrl4 = lVar.getImageUrl();
            u4.d dVar5 = x0Var.f4362e;
            f02.h.f67736a.getClass();
            long jA7 = f02.h.a(o0VarE);
            long jA8 = n5.a.a(o0VarE, x0Var.f4366i);
            Boolean boolValueOf4 = Boolean.valueOf(zB5);
            if (i16 == 131072) {
                z27 = true;
            } else {
                z27 = false;
            }
            if ((i15 & 7168) == 2048) {
                z28 = true;
            } else {
                z28 = false;
            }
            zR2 = z27 | z28 | o0VarE.r(event) | o0VarE.r(context) | o0VarE.r(qVarC);
            objQ2 = o0VarE.q();
            if (zR2) {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    o9 o9Var7 = new o9(cVar, z14, event, context, qVarC, 2);
                    o0VarE.K(o9Var7);
                    objQ2 = o9Var7;
                }
            } else {
                o9 o9Var8 = new o9(cVar, z14, event, context, qVarC, 2);
                o0VarE.K(o9Var8);
                objQ2 = o9Var8;
            }
            o0Var = o0VarE;
            kg0.b.a(rVar, boolValueOf4, arrayList, imageUrl4, dVar5, jA7, jA8, str3, str2, string, strH, str12, str9, z14, str, numValueOf, (e23.a) objQ2, o0Var, i15 & 14, (i15 << 6) & 458752);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(rVar, dVar, lVar, z14, qVar, cVar, i14, 13);
        }
    }
}
