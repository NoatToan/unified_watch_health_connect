package rr;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import c22.c3;
import c22.g2;
import c22.o3;
import c22.x0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.newmodel.j0;
import com.garmin.android.apps.connectmobile.activities.newmodel.k0;
import com.garmin.android.apps.connectmobile.activities.newmodel.l0;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import f12.l;
import is.m;
import is.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jr.o;
import jr.p;
import ns.m1;
import ns.n1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.w;
import p13.y;
import ps.k1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrr/h;", "", "Lrr/g;", "action", "<init>", "(Lrr/g;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f154177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sr.b f154178b;

    public h(g gVar) {
        gVar.getClass();
        this.f154177a = gVar;
        this.f154178b = (sr.b) KoinJavaComponent.get$default(sr.b.class, null, null, 6, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:146:0x0415  */
    /* JADX WARN: Code duplicated, block: B:185:0x04af  */
    /* JADX WARN: Code duplicated, block: B:236:0x0579  */
    /* JADX WARN: Code duplicated, block: B:342:0x0697  */
    /* JADX WARN: Code duplicated, block: B:344:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:345:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:346:0x06af  */
    /* JADX WARN: Code duplicated, block: B:347:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:351:0x06c1 A[FALL_THROUGH, PHI: r15
      0x06c1: PHI (r15v6 char) = 
      (r15v5 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
      (r15v17 char)
     binds: [B:347:0x06b2, B:284:0x061a, B:288:0x0622, B:292:0x062a, B:294:0x062e, B:296:0x0631, B:298:0x0635, B:328:0x0671, B:331:0x0677, B:333:0x067d, B:334:0x0680, B:335:0x0683, B:336:0x0686, B:337:0x0689, B:338:0x068c, B:339:0x068f, B:340:0x0692] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [com.garmin.android.apps.connectmobile.activities.newmodel.j0] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [c22.o3] */
    /* JADX WARN: Type inference failed for: r12v15, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v4, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v4, types: [java.lang.Object] */
    public final nr.b a(int i14, im.b bVar, jr.i iVar, ls.a aVar, l0 l0Var, List list, SparseArray sparseArray, boolean z14) {
        String strA;
        ArrayList arrayList;
        List<j0> listB;
        Iterator it;
        char c14;
        c3 c3VarB;
        ?? pVar;
        String strH;
        int iIntValue;
        ?? r14;
        ?? r15;
        ?? r19;
        ?? r16;
        ?? arrayList2;
        k1 k1Var;
        ?? G;
        o3 o3VarValueOf;
        String pressureUnit;
        List<j0> listB2;
        List<k0> listD;
        ?? next;
        k0 k0Var;
        Integer num;
        k0 k0Var2;
        Parcelable parcelableB;
        String strH2;
        String strH3;
        jr.j jVarC = iVar.c();
        sr.b bVar2 = this.f154178b;
        l22.a aVar2 = bVar2.f160541b;
        l22.a aVar3 = bVar2.f160541b;
        char c15 = 11;
        ?? r17 = 0;
        if (jVarC == null) {
            strA = null;
        } else {
            int[] iArr = is.i.a.f94876a;
            int i15 = iArr[jVarC.ordinal()];
            if (i15 == 7) {
                parcelableB = c22.i.b(R.string.activity_details_heart_rate);
            } else if (i15 == 9) {
                parcelableB = c22.i.b(R.string.impact_load_factor);
            } else if (i15 == 11) {
                parcelableB = c22.i.b(R.string.lbl_pace);
            } else if (i15 != 15) {
                switch (i15) {
                    case 18:
                        parcelableB = c22.i.b(R.string.lbl_stamina);
                        break;
                    case 19:
                        parcelableB = c22.i.b(R.string.lbl_stamina_zones);
                        break;
                    case 20:
                        parcelableB = c22.i.b(R.string.activity_details_training_effect);
                        break;
                    default:
                        switch (i15) {
                            case 22:
                                parcelableB = c22.i.b(R.string.activities_ascent_label);
                                break;
                            case 23:
                                parcelableB = c22.i.b(R.string.activity_details_elevation);
                                break;
                            case 24:
                                parcelableB = c22.i.b(R.string.title_stress);
                                break;
                            case 25:
                                parcelableB = c22.i.b(R.string.lbl_lr_balance);
                                break;
                            case 26:
                                parcelableB = c22.i.b(R.string.activities_respiration_rate);
                                break;
                            case 27:
                                parcelableB = c22.i.b(R.string.lbl_cadence_cap);
                                break;
                            case 28:
                                x0.f23314a.getClass();
                                parcelableB = g2.b(x0.f23542n9);
                                break;
                            case 29:
                                parcelableB = c22.i.b(R.string.activity_platform_offset);
                                break;
                            case 30:
                                parcelableB = c22.i.b(R.string.activities_position);
                                break;
                            case 31:
                                parcelableB = c22.i.b(R.string.lbl_time_in_position);
                                break;
                            case 32:
                                parcelableB = c22.i.b(R.string.lbl_power_cap);
                                break;
                            case 33:
                                parcelableB = c22.i.b(R.string.lbl_force);
                                break;
                            case 34:
                                parcelableB = c22.i.b(R.string.activity_details_distance_per_stroke);
                                break;
                            case 35:
                                parcelableB = c22.i.b(R.string.lbl_depth);
                                break;
                            case 36:
                                parcelableB = c22.i.b(R.string.lbl_intervals);
                                break;
                            case 37:
                                parcelableB = c22.i.b(R.string.activity_details_tank_pressure);
                                break;
                            case 38:
                                parcelableB = c22.i.b(R.string.activities_drag_cda);
                                break;
                            case 39:
                                parcelableB = c22.i.b(R.string.activities_drag_watts_per_cda);
                                break;
                            case 40:
                                parcelableB = c22.i.b(R.string.lbl_e_bike_assist_level);
                                break;
                            case 41:
                                parcelableB = c22.i.b(R.string.lbl_e_bike_assist_mode_chart_title);
                                break;
                            case 42:
                                parcelableB = c22.i.b(R.string.lbl_e_bike_battery_use);
                                break;
                            case 43:
                                parcelableB = c22.i.b(R.string.activity_details_elevation);
                                break;
                            case 44:
                                parcelableB = c22.i.b(R.string.lbl_speed);
                                break;
                            case 45:
                                parcelableB = c22.i.b(R.string.lbl_flow_chart_title);
                                break;
                            case 46:
                                parcelableB = c22.i.b(R.string.activity_details_altitude);
                                break;
                            case 47:
                                parcelableB = c22.i.b(R.string.lbl_ground_speed);
                                break;
                            case 48:
                                parcelableB = c22.i.b(R.string.activities_grade_adjusted_pace);
                                break;
                            case 49:
                                parcelableB = c22.i.b(R.string.lbl_grit_chart_title);
                                break;
                            case 50:
                                parcelableB = c22.i.b(R.string.lbl_ground_contact_time_cap);
                                break;
                            case 51:
                                parcelableB = c22.i.b(R.string.chart_ground_contact_time_balance_title);
                                break;
                            case 52:
                                parcelableB = c22.i.b(R.string.heart_rate_zones);
                                break;
                            case 53:
                                parcelableB = c22.i.b(R.string.activities_ascent_label);
                                break;
                            case 54:
                                parcelableB = c22.i.b(R.string.lbl_jump_rope_speed);
                                break;
                            case 55:
                                parcelableB = c22.i.b(R.string.activities_lap_average_pace);
                                break;
                            case 56:
                                parcelableB = c22.i.b(R.string.activities_lap_average_pace);
                                break;
                            case 57:
                                parcelableB = c22.i.b(R.string.chart_title_split_avg_power);
                                break;
                            case 58:
                                parcelableB = c22.i.b(R.string.chart_title_split_avg_power);
                                break;
                            case 59:
                                parcelableB = c22.i.b(R.string.lbl_heart_rate_cap);
                                break;
                            case 60:
                                parcelableB = c22.i.b(R.string.lbl_racing_lap_time);
                                break;
                            case 61:
                                parcelableB = c22.i.b(R.string.activity_details_lpco);
                                break;
                            case 62:
                                parcelableB = c22.i.b(R.string.mtb_details_title);
                                break;
                            case 63:
                                parcelableB = c22.i.b(R.string.lbl_speed);
                                break;
                            case 64:
                                parcelableB = c22.i.b(R.string.activity_details_strokes);
                                break;
                            case 65:
                                parcelableB = c22.i.b(R.string.lbl_pace);
                                break;
                            case 66:
                                parcelableB = c22.i.b(R.string.lbl_pack_calories);
                                break;
                            case 67:
                                parcelableB = c22.i.b(R.string.activity_details_peak_power_phase_end);
                                break;
                            case 68:
                                parcelableB = c22.i.b(R.string.activity_details_peak_power_phase_start);
                                break;
                            case 69:
                                parcelableB = c22.i.b(R.string.lbl_performance_condition);
                                break;
                            case 70:
                                parcelableB = c22.i.b(R.string.activities_power_phase_and_balance_title);
                                break;
                            case 71:
                                parcelableB = c22.i.b(R.string.activity_details_power_phase_end);
                                break;
                            case 72:
                                parcelableB = c22.i.b(R.string.activity_details_power_phase_start);
                                break;
                            case 73:
                                parcelableB = c22.i.b(R.string.device_settings_pulse_ox);
                                break;
                            case 74:
                                parcelableB = c22.i.b(R.string.lbl_race_location);
                                break;
                            case 75:
                                parcelableB = c22.i.b(R.string.activities_respiration_rate);
                                break;
                            case 76:
                                parcelableB = c22.i.b(R.string.activity_details_rpco);
                                break;
                            case 77:
                                parcelableB = c22.i.b(R.string.chart_title_route_difficulty);
                                break;
                            case 78:
                                parcelableB = c22.i.b(R.string.chart_label_routes_climbed);
                                break;
                            case 79:
                                parcelableB = c22.i.b(R.string.lbl_pace);
                                break;
                            case 80:
                                parcelableB = c22.i.b(R.string.activity_details_distance_per_stroke);
                                break;
                            case 81:
                                parcelableB = c22.i.b(R.string.activity_details_total_rowing_strokes);
                                break;
                            case 82:
                                parcelableB = c22.i.b(R.string.activity_wakesports_run_distance_chart_title);
                                break;
                            case 83:
                                parcelableB = c22.i.b(R.string.lbl_power_cap);
                                break;
                            case 84:
                                parcelableB = c22.i.b(R.string.activity_details_power);
                                break;
                            case 85:
                                parcelableB = c22.i.b(R.string.activity_options_running_mode_run_or_walk_title);
                                break;
                            case 86:
                                parcelableB = c22.i.b(R.string.activity_details_running_cadence);
                                break;
                            case 87:
                                parcelableB = c22.i.b(R.string.lbl_crosscountry_skiing_cadence);
                                break;
                            case 88:
                                parcelableB = c22.i.b(R.string.winter_sports_ski_power);
                                break;
                            case 89:
                                parcelableB = c22.i.b(R.string.lbl_speed);
                                break;
                            case 90:
                                parcelableB = c22.i.b(R.string.title_split_average_heart_rate);
                                break;
                            case 91:
                                parcelableB = c22.i.b(R.string.activities_lap_average_pace);
                                break;
                            case 92:
                                parcelableB = c22.i.b(R.string.chart_title_split_avg_power);
                                break;
                            case 93:
                                parcelableB = c22.i.b(R.string.lbl_step_speed_loss);
                                break;
                            case 94:
                                parcelableB = c22.i.b(R.string.lbl_step_speed_loss_percent);
                                break;
                            case 95:
                                parcelableB = c22.i.b(R.string.title_stress);
                                break;
                            case 96:
                                parcelableB = c22.i.b(R.string.stride_length_title_help);
                                break;
                            case 97:
                                parcelableB = c22.i.b(R.string.activity_details_stroke_rate);
                                break;
                            case 98:
                                parcelableB = c22.i.b(R.string.lbl_pace);
                                break;
                            case 99:
                                parcelableB = c22.i.b(R.string.lbl_speed);
                                break;
                            case 100:
                                parcelableB = c22.i.b(R.string.activity_details_strokes);
                                break;
                            case 101:
                                parcelableB = c22.i.b(R.string.lbl_swolf);
                                break;
                            case 102:
                                parcelableB = c22.i.b(R.string.lbl_temperature_cap);
                                break;
                            case 103:
                                parcelableB = c22.i.b(R.string.lbl_tempo);
                                break;
                            case 104:
                                parcelableB = c22.i.b(R.string.title_time_in_heart_rate_zones);
                                break;
                            case 105:
                                parcelableB = c22.i.b(R.string.title_time_in_power_zones);
                                break;
                            case 106:
                                parcelableB = c22.i.b(R.string.title_time_in_power_zones);
                                break;
                            case 107:
                            case 108:
                                parcelableB = c22.i.b(R.string.lbl_time_in_stamina_zones);
                                break;
                            case 109:
                                parcelableB = c22.i.b(R.string.ski_slope_difficulty_help_section_title);
                                break;
                            case 110:
                                parcelableB = c22.i.b(R.string.lbl_vertical_oscillation_cap);
                                break;
                            case 111:
                                parcelableB = c22.i.b(R.string.activity_details_water_temp);
                                break;
                            case 112:
                                parcelableB = c22.i.b(R.string.lbl_vertical_ratio);
                                break;
                            case 113:
                                parcelableB = c22.i.b(R.string.activity_details_running_cadence);
                                break;
                            case 114:
                                parcelableB = c22.i.b(R.string.activities_surfing_help_title);
                                break;
                            case 115:
                                parcelableB = c22.i.b(R.string.air_speed);
                                break;
                            case 116:
                                parcelableB = c22.i.b(R.string.lbl_cadence_cap);
                                break;
                            case 117:
                                parcelableB = c22.i.b(R.string.lbl_crosscountry_skiing_cadence);
                                break;
                            case 118:
                                parcelableB = c22.i.b(R.string.stride_length_title_help);
                                break;
                            case 119:
                                parcelableB = c22.i.b(R.string.power_curve_label);
                                break;
                            case 120:
                                parcelableB = c22.i.b(R.string.power_curve_label);
                                break;
                            default:
                                parcelableB = null;
                                break;
                        }
                        break;
                }
            } else {
                parcelableB = c22.i.b(R.string.lbl_power_cap);
            }
            if (parcelableB != null) {
                aVar2.getClass();
                int i16 = iArr[jVarC.ordinal()];
                if (i16 == 57) {
                    strH2 = new m1(aVar2, m1.a.Other, null, 4, null).h(1, null);
                } else if (i16 == 58) {
                    strH2 = new n1(aVar2, null, 2, null).h(1, null);
                } else if (i16 != 83) {
                    if (i16 == 84) {
                        strH3 = new n1(aVar2, null, 2, null).h(1, null);
                    } else if (i16 == 119) {
                        strH3 = aVar2.getString(R.string.lbl_watts);
                    } else if (i16 != 120) {
                        strH2 = null;
                    } else {
                        strH3 = aVar2.getString(R.string.lbl_watt_kg);
                    }
                    strH2 = strH3;
                } else {
                    strH2 = new m1(aVar2, m1.a.Other, null, 4, null).h(1, null);
                }
                Context context = aVar2.f109162a;
                strA = strH2 == null ? dh.b.A(context, parcelableB) : aVar2.a(R.string.string_space_string_bracket_pattern, dh.b.A(context, parcelableB), strH2);
            } else {
                strA = null;
            }
        }
        if (strA != null) {
            bVar.m(strA);
        }
        String f113511u1 = bVar.getF113511u1();
        String string = (i14 == 93 || i14 == 94) ? aVar3.getString(R.string.lbl_power_curve_compare_activity) : null;
        List<o> listE = iVar.e();
        if (listE != null) {
            arrayList = new ArrayList();
            Iterator it3 = listE.iterator();
            while (it3.hasNext()) {
                o oVar = (o) it3.next();
                oVar.getClass();
                p pVarB = oVar.b();
                if (pVarB == null) {
                    it = it3;
                    pVar = r17;
                    c14 = c15;
                } else {
                    ls.e eVarA = m.a(pVarB);
                    Object objJ = ss.k.j(eVarA, aVar);
                    if (objJ == null) {
                        if (l0Var == null || (listD = l0Var.d()) == null) {
                            iIntValue = -1;
                        } else {
                            Iterator it4 = listD.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next = it4.next();
                                    k0Var2 = (k0) next;
                                } else {
                                    next = r17;
                                }
                                k0Var = (k0) next;
                                if (k0Var != null || (num = k0Var.getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String()) == null) {
                                    iIntValue = -1;
                                } else {
                                    iIntValue = num.intValue();
                                }
                            } while (!s.g(k0Var2 != null ? k0Var2.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String() : r17, "TANK_PRESSURE"));
                            k0Var = (k0) next;
                            if (k0Var != null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = -1;
                            }
                        }
                        if (l0Var != null) {
                            listB2 = l0Var.b();
                        } else {
                            r14 = r17;
                        }
                        if (r14 == 0 || r14.isEmpty()) {
                            r14 = listB2;
                            r14 = listB2;
                            r15 = r17;
                        } else {
                            r14 = listB2;
                            r15 = (j0) r14.get(0);
                        }
                        it = it3;
                        o3 o3Var = ((l) KoinJavaComponent.get$default(l.class, r17, r17, 6, r17)).y() ? o3.BAR : o3.PSI;
                        if (r15 != 0) {
                            pressureUnit = r15.getPressureUnit();
                        } else {
                            r19 = r17;
                        }
                        if (r19 != 0) {
                            o3VarValueOf = o3.valueOf(r15.getPressureUnit());
                        } else {
                            r16 = r17;
                        }
                        if (r16 != 0) {
                            r19 = pressureUnit;
                            if (r16.f23184a) {
                                r19 = pressureUnit;
                                r16 = o3VarValueOf;
                                o3Var = o3.BAR;
                            } else {
                                r19 = pressureUnit;
                                r16 = o3VarValueOf;
                                o3Var = o3.PSI;
                            }
                        }
                        if (r14 != 0) {
                            ArrayList arrayList3 = new ArrayList();
                            ?? r18 = r17;
                            for (j0 j0Var : r14) {
                                if (j0Var != null) {
                                    G = r18;
                                    G = j0Var.g();
                                }
                                if (G != 0) {
                                    arrayList3.add(G);
                                }
                                r18 = 0;
                            }
                            Iterator it5 = arrayList3.iterator();
                            if (!it5.hasNext()) {
                                org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                                return null;
                            }
                            Object next2 = it5.next();
                            while (it5.hasNext()) {
                                next2 = h0.C0((List) next2, (List) it5.next());
                            }
                            List list2 = (List) next2;
                            if (list2 != null) {
                                arrayList2 = new ArrayList(y.r(list2, 10));
                                Iterator it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    arrayList2.add(Double.valueOf(((double[]) it6.next())[iIntValue]));
                                }
                            } else {
                                arrayList2 = p13.j0.f134944a;
                            }
                        } else {
                            arrayList2 = p13.j0.f134944a;
                        }
                        int i17 = q.f94895a[eVarA.ordinal()];
                        if (i17 == 1) {
                            k1Var = new k1(Double.valueOf(h0.N((Iterable) arrayList2)), o3Var);
                        } else if (i17 != 2) {
                            String str = a2.ACTIVITIES.f28756a;
                            eVarA.name();
                            objJ = null;
                        } else {
                            Double dP0 = h0.p0((Iterable) arrayList2);
                            k1Var = new k1(Double.valueOf(dP0 != null ? dP0.doubleValue() : 0.0d), o3Var);
                        }
                        objJ = k1Var;
                    } else {
                        it = it3;
                    }
                    Object obj = objJ;
                    int[] iArr2 = ss.k.a.f160607a;
                    String strB = ss.k.b(eVarA, aVar3, obj, iArr2[eVarA.ordinal()] == 368 ? 1 : 16);
                    String str2 = (ss.k.g(eVarA) == 16 || (strH = ss.k.h(eVarA, aVar3, obj)) == null) ? "" : strH;
                    int i18 = iArr2[eVarA.ordinal()];
                    if (i18 == 1) {
                        c14 = 11;
                        c3VarB = c22.i.b(eVarA.f114681d);
                    } else if (i18 == 2 || i18 == 3) {
                        c14 = 11;
                        c3VarB = eVarA.f114678a;
                    } else if (i18 == 4 || i18 == 5) {
                        c14 = 11;
                        c3VarB = c22.i.b(eVarA.f114681d);
                    } else {
                        if (i18 != 6) {
                            if (i18 != 7) {
                                if (i18 != 10) {
                                    c14 = 11;
                                    if (i18 != 11 && i18 != 34 && i18 != 35) {
                                        if (i18 != 72) {
                                            if (i18 != 73) {
                                                if (i18 != 76) {
                                                    if (i18 != 77) {
                                                        if (i18 != 117 && i18 != 118 && i18 != 7 && i18 != 8) {
                                                            if (i18 != 200) {
                                                                if (i18 == 201) {
                                                                    c3VarB = eVarA.f114679b;
                                                                } else if (i18 != 217) {
                                                                    if (i18 == 218) {
                                                                        c3VarB = eVarA.f114679b;
                                                                    } else if (i18 != 254 && i18 != 255) {
                                                                        if (i18 == 257 || i18 == 258) {
                                                                            c3VarB = c22.i.b(eVarA.f114682e);
                                                                        } else if (i18 != 273) {
                                                                            if (i18 == 274) {
                                                                                c3VarB = eVarA.f114679b;
                                                                            } else if (i18 == 322 || i18 == 323) {
                                                                                c3VarB = c22.i.b(eVarA.f114682e);
                                                                            } else if (i18 != 358) {
                                                                                if (i18 == 359) {
                                                                                    c3VarB = c22.i.b(eVarA.f114682e);
                                                                                } else if (i18 != 398) {
                                                                                    if (i18 != 399) {
                                                                                        switch (i18) {
                                                                                            case 20:
                                                                                            case 64:
                                                                                            case 229:
                                                                                            case 252:
                                                                                                break;
                                                                                            case 26:
                                                                                            case 66:
                                                                                            case 103:
                                                                                            case 286:
                                                                                            case 318:
                                                                                                break;
                                                                                            case 29:
                                                                                                c3VarB = c22.i.b(eVarA.f114685h);
                                                                                                break;
                                                                                            case 40:
                                                                                            case 282:
                                                                                            case 293:
                                                                                                c3VarB = eVarA.f114679b;
                                                                                                break;
                                                                                            case 45:
                                                                                            case 57:
                                                                                            case 90:
                                                                                            case 115:
                                                                                            case 129:
                                                                                            case 145:
                                                                                            case 337:
                                                                                            case 368:
                                                                                                break;
                                                                                            case 170:
                                                                                            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                                                                                            case 250:
                                                                                            case 298:
                                                                                                c3VarB = c22.i.b(eVarA.f114684g);
                                                                                                break;
                                                                                            case 260:
                                                                                                c3VarB = c22.i.b(eVarA.f114682e);
                                                                                                break;
                                                                                            default:
                                                                                                switch (i18) {
                                                                                                    case 231:
                                                                                                    case 232:
                                                                                                    case 233:
                                                                                                    case 234:
                                                                                                    case 235:
                                                                                                    case 236:
                                                                                                    case 237:
                                                                                                    case 238:
                                                                                                    case 239:
                                                                                                    case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                                                                                                    case 241:
                                                                                                    case 242:
                                                                                                    case 243:
                                                                                                    case 244:
                                                                                                    case 245:
                                                                                                    case 247:
                                                                                                    case 248:
                                                                                                        break;
                                                                                                    case 246:
                                                                                                        c3VarB = c22.i.b(eVarA.f114682e);
                                                                                                        break;
                                                                                                    default:
                                                                                                        switch (i18) {
                                                                                                            default:
                                                                                                                switch (i18) {
                                                                                                                    default:
                                                                                                                        switch (i18) {
                                                                                                                            default:
                                                                                                                                switch (i18) {
                                                                                                                                    case 165:
                                                                                                                                        break;
                                                                                                                                    case 166:
                                                                                                                                        break;
                                                                                                                                    case 167:
                                                                                                                                    case 168:
                                                                                                                                        c3VarB = c22.i.b(eVarA.f114684g);
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        switch (i18) {
                                                                                                                                            case 48:
                                                                                                                                            case 49:
                                                                                                                                            case 50:
                                                                                                                                            case 51:
                                                                                                                                            case 52:
                                                                                                                                                break;
                                                                                                                                            case 53:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                switch (i18) {
                                                                                                                                                    default:
                                                                                                                                                        switch (i18) {
                                                                                                                                                            default:
                                                                                                                                                                switch (i18) {
                                                                                                                                                                    case 137:
                                                                                                                                                                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                                                                                                                                                    case 139:
                                                                                                                                                                    case 140:
                                                                                                                                                                    case 141:
                                                                                                                                                                    case 142:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        c3VarB = null;
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            case 132:
                                                                                                                                                            case 133:
                                                                                                                                                            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                                                                                                                                                c3VarB = c22.i.b(eVarA.f114681d);
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                    case 109:
                                                                                                                                                    case 110:
                                                                                                                                                    case 111:
                                                                                                                                                    case 112:
                                                                                                                                                    case 113:
                                                                                                                                                        c3VarB = c22.i.b(eVarA.f114681d);
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            case 54:
                                                                                                                                                c3VarB = c22.i.b(eVarA.f114681d);
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            case 161:
                                                                                                                            case 162:
                                                                                                                            case 163:
                                                                                                                                c3VarB = c22.i.b(eVarA.f114681d);
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    case 154:
                                                                                                                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                                                                                                    case 156:
                                                                                                                        c3VarB = c22.i.b(eVarA.f114681d);
                                                                                                                        break;
                                                                                                                }
                                                                                                            case 147:
                                                                                                            case 148:
                                                                                                            case 149:
                                                                                                            case 150:
                                                                                                            case 151:
                                                                                                            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                                                                                                                c3VarB = c22.i.b(eVarA.f114681d);
                                                                                                                break;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c14 = 11;
                                }
                                c3VarB = eVarA.f114678a;
                            } else {
                                c14 = 11;
                            }
                            c3VarB = c22.i.b(eVarA.f114681d);
                        } else {
                            c14 = 11;
                        }
                        c3VarB = c22.i.b(eVarA.f114683f);
                    }
                    String strA2 = c3VarB != null ? dh.b.A(aVar3.f109162a, c3VarB) : "";
                    pVar = strB != null ? new r22.p(strB, str2, strA2, oVar.a() != null ? eVarA.f114687j : null, oVar.a() != null ? eVarA.f114688k : -1, null, bVar2.m(String.valueOf(ss.k.b(eVarA, aVar3, obj, 4)), strA2), 32, null) : 0;
                }
                if (pVar != 0) {
                    arrayList.add(pVar);
                }
                c15 = c14;
                it3 = it;
                r17 = 0;
            }
        } else {
            arrayList = null;
        }
        List list3 = arrayList;
        if (arrayList == null) {
            list3 = p13.j0.f134944a;
        }
        List list4 = list3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (l0Var != null && (listB = l0Var.b()) != null) {
            ArrayList<String> arrayList4 = new ArrayList();
            for (j0 j0Var2 : listB) {
                String name = j0Var2 != null ? j0Var2.getName() : null;
                if (name != null) {
                    arrayList4.add(name);
                }
            }
            for (String str3 : arrayList4) {
                linkedHashMap.put(str3, str3);
            }
        }
        return new nr.b(f113511u1, string, list4, bVar, linkedHashMap, iVar.getHasHelp() ? new pn1.c(aVar, this, i14, bVar, z14) : null, (i14 == 32 || i14 == 93 || i14 == 94) ? null : i14 == 45 ? new p50.d(this, bVar, list, sparseArray, l0Var, 4) : new ok0.d(this, bVar, list, sparseArray, 15));
    }

    public final ArrayList b(List list, List list2, ls.a aVar, l0 l0Var, SparseArray sparseArray, boolean z14) {
        jr.j jVarC;
        Integer numA;
        int i14;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                jr.i itemDetails = ((jr.f) it3.next()).getItemDetails();
                if (itemDetails != null && (jVarC = itemDetails.c()) != null && (numA = is.i.a(jVarC)) != null) {
                    int iIntValue = numA.intValue();
                    if (iIntValue != 70) {
                        switch (iIntValue) {
                            case 73:
                                i14 = 0;
                                break;
                            case 74:
                                i14 = 9;
                                break;
                            case 75:
                            case 76:
                                i14 = 5;
                                break;
                            default:
                                i14 = iIntValue;
                                break;
                        }
                    } else {
                        i14 = 3;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list2) {
                        if (((im.b) obj).getB1() == i14) {
                            arrayList3.add(obj);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (arrayList3.size() == 1) {
                            arrayList2.add(a(iIntValue, (im.b) arrayList3.get(0), itemDetails, aVar, l0Var, list2, sparseArray, z14));
                        } else {
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                arrayList.add(w.c(a(iIntValue, (im.b) it4.next(), itemDetails, aVar, null, list2, sparseArray, z14)));
                            }
                        }
                    }
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
