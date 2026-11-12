package im;

import am.z0;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import ps.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lim/g;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f94146b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f94147a;

    static {
        new a(null);
    }

    public g(l22.b bVar) {
        bVar.getClass();
        this.f94147a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015c  */
    /* JADX WARN: Code duplicated, block: B:177:0x024c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v16 java.lang.Object, still in use, count: 2, list:
          (r15v16 java.lang.Object) from 0x00ab: PHI (r15 I:??) = (r15v13 java.lang.Object), (r15v16 java.lang.Object) binds: [B:53:0x00aa, B:190:0x00ab] A[DONT_GENERATE, DONT_INLINE]
          (r15v16 java.lang.Object) from 0x009b: CHECK_CAST (ar1.b) (r15v16 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static java.lang.Integer a(java.lang.Float r12, java.lang.Integer r13, java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.g.a(java.lang.Float, java.lang.Integer, java.lang.String, java.util.List):java.lang.Integer");
    }

    public static Integer b(g gVar, Float f14, Integer num, String str, List list, int i14) {
        if ((i14 & 4) != 0) {
            str = null;
        }
        if ((i14 & 8) != 0) {
            list = j0.f134944a;
        }
        gVar.getClass();
        return a(f14, num, str, list);
    }

    public final Integer c(Entry entry, Integer num, String str, List<r1> list) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 43) {
            if (iIntValue == 55) {
                return b(this, entry != null ? Float.valueOf(entry.getY()) : null, num, str, null, 8);
            }
            if (iIntValue == 88) {
                Float fValueOf = entry != null ? Float.valueOf(entry.getY()) : null;
                if (list == null) {
                    list = j0.f134944a;
                }
                return a(fValueOf, num, str, list);
            }
            if (iIntValue != 96 && iIntValue != 83 && iIntValue != 84) {
                return b(this, null, num, str, null, 8);
            }
        }
        return b(this, entry != null ? Float.valueOf(entry.getY()) : null, num, str, null, 8);
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0142  */
    public final String d(Integer num, String str) {
        if (num == null) {
            return "";
        }
        int iIntValue = num.intValue();
        l22.b bVar = this.f94147a;
        if (iIntValue != 11) {
            if (iIntValue == 13) {
                return bVar.getString(R.string.lbl_vertical_oscillation_cap);
            }
            if (iIntValue == 19) {
                return bVar.getString(R.string.lbl_lr_balance);
            }
            if (iIntValue == 33) {
                return bVar.getString(R.string.lbl_performance_condition);
            }
            if (iIntValue == 50 || iIntValue == 52) {
                return bVar.getString(R.string.activities_lap_avg_pace);
            }
            if (iIntValue == 55) {
                return bVar.getString(R.string.pulse_ox_spo2_label);
            }
            if (iIntValue != 71) {
                if (iIntValue == 77) {
                    return bVar.getString(R.string.lbl_jump_rope_speed);
                }
                if (iIntValue == 96) {
                    x0.f23314a.getClass();
                    return bVar.b(g2.b(x0.f23542n9));
                }
                if (iIntValue == 43) {
                    return bVar.getString(R.string.title_stress);
                }
                if (iIntValue != 44) {
                    if (iIntValue == 87) {
                        return bVar.getString(R.string.activity_details_altitude);
                    }
                    if (iIntValue == 88) {
                        return bVar.getString(R.string.heart_rate_zones);
                    }
                    switch (iIntValue) {
                        case 0:
                            return bVar.getString(R.string.lbl_speed);
                        case 1:
                            return bVar.getString(R.string.lbl_pace);
                        case 2:
                            if (p005kotlin.jvm.internal.s.g(str, am.x0.O1.f4358a)) {
                                return bVar.getString(R.string.activity_details_altitude);
                            }
                            return p005kotlin.jvm.internal.s.g(str, am.x0.f4333t2.f4358a) ? bVar.getString(R.string.activities_ascent_label) : bVar.getString(R.string.activity_details_elevation);
                        case 3:
                            return bVar.getString(R.string.activity_details_heart_rate);
                        case 4:
                            break;
                        case 5:
                            return z0.v(str) ? bVar.getString(R.string.winter_sports_ski_power) : bVar.getString(R.string.lbl_power_cap);
                        case 6:
                            z0 z0Var = z0.f4390a;
                            return z0.b(am.x0.D, str) ? bVar.getString(R.string.activity_details_water_temp) : bVar.getString(R.string.lbl_temperature_cap);
                        default:
                            switch (iIntValue) {
                                case 21:
                                    return bVar.getString(R.string.activity_details_lpco);
                                case 22:
                                    return bVar.getString(R.string.activity_details_rpco);
                                case 23:
                                    return bVar.getString(R.string.activity_details_power_phase_end);
                                case 24:
                                    return bVar.getString(R.string.activity_details_power_phase_start);
                                case 25:
                                    return bVar.getString(R.string.activity_details_peak_power_phase_start);
                                case 26:
                                    return bVar.getString(R.string.activity_details_peak_power_phase_end);
                                default:
                                    switch (iIntValue) {
                                        case 39:
                                            return bVar.getString(R.string.lbl_flow_chart_title);
                                        case 40:
                                            return bVar.getString(R.string.lbl_grit_chart_title);
                                        case 41:
                                            return bVar.getString(R.string.activities_respiration_title);
                                        default:
                                            switch (iIntValue) {
                                                case 58:
                                                    return bVar.getString(R.string.device_setting_watch_face_complications_battery);
                                                case 59:
                                                    return bVar.getString(R.string.lbl_e_bike_assist_level);
                                                case 60:
                                                    return bVar.getString(R.string.lbl_e_bike_assist_mode_chart_title);
                                                default:
                                                    switch (iIntValue) {
                                                        case 64:
                                                            return bVar.getString(R.string.activities_grade_adj_pace);
                                                        case 65:
                                                        case 66:
                                                            break;
                                                        case 67:
                                                        case 68:
                                                        case 69:
                                                            return bVar.getString(R.string.lbl_pace);
                                                        default:
                                                            switch (iIntValue) {
                                                                case 81:
                                                                    return bVar.getString(R.string.lbl_force);
                                                                case 82:
                                                                    return bVar.getString(R.string.impact_load_factor);
                                                                case 83:
                                                                    return bVar.getString(R.string.lbl_step_speed_loss);
                                                                case 84:
                                                                    return bVar.getString(R.string.lbl_step_speed_loss_percent);
                                                                default:
                                                                    return "";
                                                            }
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            }
        }
        return bVar.getString(R.string.lbl_cadence_cap);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lim/g$a;", "", "<init>", "()V", "", "", "newLayoutSupportedChartTypes", "[Ljava/lang/Integer;", "", "supportedStepTypes", "[Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
