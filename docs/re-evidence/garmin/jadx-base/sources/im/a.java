package im;

import android.annotation.SuppressLint;
import android.content.Context;
import c22.p2;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f94080a = {R.color.gcm3_chart_gradient_blue_start, R.color.gcm3_chart_gradient_blue_end};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f94082b = {R.color.gcm_speed_start_color, R.color.gcm_speed_end_color};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f94084c = {R.color.gcm3_chart_gradient_green_start, R.color.gcm3_chart_gradient_green_end};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f94086d = {R.color.gcm3_chart_gradient_gray_start, R.color.gcm3_chart_gradient_gray_end};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f94088e = {R.color.gcm3_chart_gradient_purple_start, R.color.gcm3_chart_gradient_purple_end};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f94089f = {R.color.gds_data_viz_violet_secondary, R.color.gds_data_viz_violet_secondary};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f94090g = {R.color.palette_load_focus_chart_purple, R.color.palette_load_focus_chart_purple};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f94091h = {R.color.gcm_power_start_color, R.color.gcm_power_end_color};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f94092i = {R.color.gcm3_chart_gradient_orange_start, R.color.gcm3_chart_gradient_orange_end};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f94093j = {R.color.gcm_cadence_start_color, R.color.gcm_cadence_end_color};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f94094k = {R.color.gds_data_viz_blue_primary, R.color.gds_data_viz_blue_primary};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f94095l = {R.color.gcm3_chart_gradient_red_start, R.color.gcm3_chart_gradient_red_end};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f94096m = {R.color.gcm_heart_rate_start_color, R.color.gds_data_viz_red_primary};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f94097n = {R.color.gds_data_viz_violet_primary, R.color.gds_data_viz_blue_secondary, R.color.gds_data_viz_green_secondary, R.color.gds_data_viz_orange_secondary, R.color.gds_data_viz_red_primary};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f94098o = {R.color.gds_data_viz_purple_primary, R.color.gds_data_viz_blue_primary, R.color.gds_data_viz_green_primary, R.color.gds_data_viz_orange_primary, R.color.gds_data_viz_red_primary};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f94099p = {R.color.gcm3_chart_gradient_delta_blue_start, R.color.gcm3_chart_gradient_delta_blue_end};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f94100q = {R.color.racing_laptime_fast_80_100, R.color.racing_laptime_slow_80_100};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f94101r = {R.color.gcm_e_bike_chart_gradient_start, R.color.gcm_e_bike_chart_gradient_end};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f94102s = {0, 1, 50, 52, 64, 34, 2, 3, 82, 4, 5, 81, 61, 62, 63, 6, 7, 65, 8, 9, 10, 66, 11, 83, 84, 12, 13, 14, 15, 86, 16, 19, 20, 68, 69, 67, 21, 22, 23, 24, 25, 26, 41, 43, 33, 44, 40, 39, 35, 47, 53, 54, 89, 55, 56, 71, 72, 77, 87, 88, 28, 96};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f94103t = {52, 64, 50, 3, 82, 5, 62, 63, 81, 61, 2, 66, 11, 83, 84, 13, 12, 6, 8, 7, 65, 10, 41, 15, 86, 16, 14, 20, 33, 54, 89, 56, 9, 87, 88, 92, 28, 96};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f94104u = {52, 64, 50, 3, 81, 5, 61, 2, 66, 11, 83, 84, 13, 12, 6, 8, 7, 65, 10, 41, 15, 86, 16, 14, 20, 33, 54, 89, 56, 9, 88, 92};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f94105v = {1, 64, 3, 82, 2, 5, 81, 61, 66, 11, 83, 84, 13, 12, 6, 7, 65, 10, 41, 15, 86, 16, 14, 20, 33, 56, 69, 68, 67, 88, 28, 96};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f94106w = {1, 64, 3, 82, 2, 5, 81, 61, 66, 11, 83, 84, 13, 12, 6, 7, 65, 10, 41, 15, 86, 16, 14, 20, 33, 56, 69, 68, 67, 88, 28, 96};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f94107x = {1, 50, 52, 3, 82, 2, 66, 11, 83, 84, 13, 12, 6, 8, 7, 65, 10, 41, 15, 86, 16, 14, 20, 33, 54, 89, 56, 69, 68, 67, 88, 92};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f94108y = {3, 82, 2, 5, 81, 61, 66, 11, 83, 84, 13, 12, 6, 7, 65, 10, 41, 88};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f94109z = {0, 1, 50, 52, 34, 2, 3, 4, 6, 7, 65, 8, 9, 10, 66, 11, 83, 84, 12, 13, 68, 69, 67, 14, 15, 86, 16, 19, 20, 21, 22, 23, 24, 25, 26, 41, 43, 33, 44, 40, 39, 81, 35, 47, 53, 54, 89, 55, 56, 71, 88, 92, 28, 96};
    public static final int[] A = {0, 1, 50, 52, 34, 2, 3, 82, 5, 61, 4, 6, 7, 65, 8, 9, 10, 66, 11, 83, 84, 12, 13, 68, 69, 67, 14, 15, 86, 16, 19, 20, 21, 22, 23, 24, 25, 26, 41, 43, 33, 44, 40, 39, 35, 47, 53, 54, 89, 55, 56, 71, 88, 92, 28, 96};
    public static final int[] B = {0, 1, 50, 52, 2, 3, 5, 4, 6, 20, 21, 22, 23, 24, 25, 26, 41, 43, 33, 40, 39, 81, 35, 47, 53, 54, 89, 55, 88, 96};
    public static final int[] C = {5, 81, 61, 3, 82, 1, 52, 50, 64, 34, 2, 83, 84, 13, 62, 63, 12, 6, 0, 41, 20, 15, 86, 16, 14, 33, 54, 89, 56, 69, 68, 67, 72, 88, 92};
    public static final int[] D = {5, 81, 61, 3, 82, 2, 6, 0, 54, 89, 19, 62, 63, 21, 22, 23, 24, 25, 26, 41, 20, 33, 88, 92, 28, 96};
    public static final int[] E = {5, 81, 61, 3, 82, 2, 6, 0, 41, 20, 33, 88};
    public static final int[] F = {5, 81, 61, 3, 82, 1, 34, 2, 66, 11, 84, 13, 12, 6, 0, 41, 15, 86, 16, 14, 33, 56, 69, 68, 67, 88};
    public static final int[] G = {5, 81, 61, 3, 82, 1, 34, 2, 66, 11, 83, 13, 12, 6, 0, 41, 15, 86, 16, 14, 33, 56, 69, 68, 67, 88};
    public static final int[] H = {5, 81, 61, 3, 82, 1, 34, 2, 66, 11, 83, 84, 12, 6, 0, 41, 15, 86, 16, 14, 33, 56, 69, 68, 67, 88};
    public static final int[] I = {0, 1, 50, 52, 2, 3, 4, 6, 20, 21, 22, 28, 5, 24, 23, 25, 26, 41, 43, 33, 40, 39, 81, 35, 47, 53, 54, 89, 55, 88};
    public static final int[] J = {3, 82, 1, 34, 2, 66, 11, 13, 6, 0, 41, 15, 16, 14, 56, 69, 68, 67, 88};
    public static final int[] K = {5, 81, 61, 3, 82, 1, 50, 34, 2, 83, 84, 66, 11, 4, 13, 12, 14, 7, 65, 10, 6, 0, 19, 21, 22, 23, 24, 25, 26, 54, 89, 20, 56, 69, 68, 67, 88, 92, 28, 96};
    public static final int[] L = {3, 82, 1, 34, 6, 10, 69, 68, 67, 9, 0, 88};
    public static final int[] M = {3, 82, 1, 34, 6, 7, 65, 69, 68, 67, 88};
    public static final int[] N = {5, 61, 3, 2, 4, 6, 0, 21, 81, 82, 22, 23, 24, 25, 26, 88};
    public static final int[] O = {3, 6, 88};
    public static final int[] P = {2, 5, 81, 61, 3, 82, 1, 34, 66, 11, 83, 84, 4, 13, 12, 6, 0, 19, 21, 22, 23, 24, 25, 26, 37, 38, 41, 69, 68, 67, 88};
    public static final int[] Q = {2, 5, 81, 61, 3, 82, 1, 34, 66, 11, 83, 84, 4, 13, 12, 6, 0, 19, 21, 22, 23, 24, 25, 26, 36, 38, 69, 68, 67, 88};
    public static final int[] R = {2, 5, 81, 61, 3, 82, 1, 34, 66, 11, 83, 84, 4, 13, 12, 6, 0, 19, 21, 22, 23, 24, 25, 26, 36, 37, 69, 68, 67, 88};
    public static final int[] S = {1, 50, 52, 64, 5, 81, 61, 34, 3, 82, 66, 11, 4, 15, 86, 2, 13, 16, 83, 84, 12, 14, 33, 6, 54, 89, 5, 61, 62, 63, 56, 69, 68, 67, 88, 92};
    public static final int[] T = {0, 3, 82, 66, 11, 4, 2, 5, 81, 61, 6, 87, 0, 43, 88, 54, 89, 28, 96};
    public static final int[] U = {3, 55, 43, 87, 0, 88, 54, 89};
    public static final int[] V = {3, 55, 41, 87, 0, 88, 28, 96};
    public static final int[] W = {3, 88, 28, 96};
    public static final int[] X = {3, 35, 6, 88};
    public static final int[] Y = {58, 59, 60, 0, 2, 3, 4, 83, 84, 5, 81, 6, 13, 19, 20, 21, 22, 23, 24, 25, 26, 41, 33, 40, 39, 88};
    public static final int[] Z = {3, 88};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int[] f94081a0 = {1, 3, 8, 6, 88};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int[] f94083b0 = {6};

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int[] f94085c0 = {0, 1, 20};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int[] f94087d0 = {0, 20, 40};

    private a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0044  */
    /* JADX WARN: Code duplicated, block: B:45:0x005d  */
    /* JADX WARN: Code duplicated, block: B:51:0x007b  */
    public static int[] a(int i14) {
        if (i14 != 0 && i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 != 4) {
                        if (i14 != 5) {
                            if (i14 != 19) {
                                if (i14 != 47) {
                                    if (i14 != 77) {
                                        if (i14 == 96) {
                                            return f94098o;
                                        }
                                        if (i14 != 71) {
                                            if (i14 != 72) {
                                                switch (i14) {
                                                    case 7:
                                                    case 8:
                                                        break;
                                                    case 9:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                        break;
                                                    case 10:
                                                        break;
                                                    case 11:
                                                        break;
                                                    default:
                                                        switch (i14) {
                                                            case 21:
                                                                return new int[]{R.color.gcm3_chart_gradient_light_red, R.color.gcm3_chart_gradient_red_end};
                                                            case 22:
                                                                return new int[]{R.color.gds_data_viz_orange_secondary, R.color.gds_data_viz_orange_secondary};
                                                            case 23:
                                                            case 24:
                                                            case 25:
                                                            case 26:
                                                                return new int[]{R.color.gds_data_viz_green_secondary, R.color.gds_data_viz_blue_secondary};
                                                            default:
                                                                switch (i14) {
                                                                    case 34:
                                                                        break;
                                                                    case 35:
                                                                        return new int[]{R.color.gds_data_viz_teal_primary, R.color.gds_data_viz_teal_secondary};
                                                                    case 36:
                                                                    case 37:
                                                                    case 39:
                                                                    case 40:
                                                                        return new int[]{R.color.gcm3_chart_gradient_light_red, R.color.gcm3_chart_gradient_red_end};
                                                                    case 38:
                                                                        return new int[]{R.color.gcm3_chart_gradient_purple_start, R.color.gcm3_chart_gradient_purple_end};
                                                                    case 41:
                                                                        return f94099p;
                                                                    case 42:
                                                                        return f94100q;
                                                                    case 43:
                                                                        return new int[]{R.color.gcm_stress_level_medium, R.color.gcm_stress_level_medium};
                                                                    case 44:
                                                                        break;
                                                                    default:
                                                                        switch (i14) {
                                                                            case 50:
                                                                            case 52:
                                                                                break;
                                                                            case 51:
                                                                                break;
                                                                            case 53:
                                                                                return new int[]{R.color.gcm_stress_level_medium, R.color.gcm_stress_level_medium};
                                                                            case 54:
                                                                                break;
                                                                            default:
                                                                                switch (i14) {
                                                                                    case 57:
                                                                                    case 61:
                                                                                    case 62:
                                                                                    case 63:
                                                                                        break;
                                                                                    case 58:
                                                                                    case 59:
                                                                                    case 60:
                                                                                        return f94101r;
                                                                                    case 64:
                                                                                    case 67:
                                                                                    case 68:
                                                                                    case 69:
                                                                                        break;
                                                                                    case 65:
                                                                                        break;
                                                                                    default:
                                                                                        switch (i14) {
                                                                                            case 81:
                                                                                                return f94089f;
                                                                                            case 82:
                                                                                                break;
                                                                                            case 83:
                                                                                            case 84:
                                                                                            case 86:
                                                                                                break;
                                                                                            case 85:
                                                                                                return new int[]{R.color.gds_data_viz_teal_primary, R.color.gds_data_viz_teal_secondary};
                                                                                            case 87:
                                                                                                break;
                                                                                            case 88:
                                                                                                break;
                                                                                            default:
                                                                                                return f94086d;
                                                                                        }
                                                                                    case 66:
                                                                                        return f94090g;
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
                                            return f94090g;
                                        }
                                    }
                                }
                            }
                            return f94097n;
                        }
                        return f94088e;
                    }
                    return f94092i;
                }
                return f94095l;
            }
            return f94084c;
        }
        return f94080a;
    }

    public static int b(int i14) {
        if (i14 == 71) {
            return 2;
        }
        if (i14 == 72) {
            return 4;
        }
        if (i14 == 77 || i14 == 92) {
            return 2;
        }
        if (i14 == 95) {
            return 0;
        }
        if (i14 == 96) {
            return 4;
        }
        switch (i14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 20:
            case 28:
                return 2;
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return 4;
            case 17:
            case 18:
                return 0;
            case 27:
                return 5;
            default:
                switch (i14) {
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 45:
                    case 47:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 67:
                    case 68:
                    case 69:
                        return 2;
                    case 44:
                    case 66:
                        return 4;
                    case 46:
                    case 48:
                    case 49:
                        return 0;
                    default:
                        switch (i14) {
                            case 80:
                            case 81:
                            case 82:
                            case 85:
                            case 87:
                            case 88:
                            case 89:
                                return 2;
                            case 83:
                            case 84:
                            case 86:
                                return 4;
                            default:
                                return 1;
                        }
                }
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public static List<s> c(int i14, boolean z14) {
        Object next;
        Integer num;
        Object next2;
        Integer num2;
        Object next3;
        Integer num3;
        if (i14 != 9) {
            if (i14 == 19) {
                co1.a aVar = co1.a.f28146a;
                w13.c<co1.d> cVar = co1.a.C0433a.f28151e;
                ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                for (co1.d dVar : cVar) {
                    arrayList.add(new s(dVar.f28163c, dVar.f28161a, dVar.f28162b));
                }
                return arrayList;
            }
            if (i14 == 44) {
                co1.a aVar2 = co1.a.f28146a;
                w13.c<co1.f> cVar2 = co1.f.f28169e;
                ArrayList arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                for (co1.f fVar : cVar2) {
                    arrayList2.add(new s(fVar.f28172c, fVar.f28170a, fVar.f28171b));
                }
                return arrayList2;
            }
            if (i14 == 72) {
                co1.a aVar3 = co1.a.f28146a;
                w13.c<co1.h> cVar3 = co1.h.f28178e;
                ArrayList arrayList3 = new ArrayList(p13.y.r(cVar3, 10));
                for (co1.h hVar : cVar3) {
                    arrayList3.add(new s(hVar.f28181c, hVar.f28179a, hVar.f28180b));
                }
                return arrayList3;
            }
            if (i14 != 86) {
                if (i14 == 96) {
                    co1.a aVar4 = co1.a.f28146a;
                    w13.c<ls1.a> cVar4 = ls1.a.f114786j;
                    ArrayList arrayList4 = new ArrayList(p13.y.r(cVar4, 10));
                    for (ls1.a aVar5 : cVar4) {
                        ks1.a aVar6 = ks1.a.f106390a;
                        aVar6.getClass();
                        aVar5.getClass();
                        Iterator<T> it = ls1.a.f114786j.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ls1.a) next) != aVar5);
                        ls1.a aVar7 = (ls1.a) next;
                        p2 p2VarA = aVar7 != null ? aVar6.a(aVar7) : null;
                        arrayList4.add(new s((p2VarA == null || (num = p2VarA.f23193b) == null) ? 0 : num.intValue(), aVar5.f114787a, aVar5.f114788b));
                    }
                    return arrayList4;
                }
                if (i14 == 21) {
                    co1.a aVar8 = co1.a.f28146a;
                    return p13.w.c(new s(R.color.gds_data_viz_red_primary, -30.0d, 30.0d));
                }
                if (i14 == 22) {
                    co1.a aVar9 = co1.a.f28146a;
                    return p13.w.c(new s(R.color.gds_data_viz_orange_secondary, -30.0d, 30.0d));
                }
                if (i14 == 83) {
                    co1.a aVar10 = co1.a.f28146a;
                    w13.c<ar1.b> cVar5 = ar1.b.f12557h;
                    ArrayList arrayList5 = new ArrayList(p13.y.r(cVar5, 10));
                    for (ar1.b bVar : cVar5) {
                        zq1.b bVar2 = zq1.b.f206643a;
                        bVar2.getClass();
                        bVar.getClass();
                        j23.f<Float> fVar2 = bVar.f12558a;
                        Iterator<T> it3 = ar1.b.f12557h.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                        } while (((ar1.b) next2) != bVar);
                        ar1.b bVar3 = (ar1.b) next2;
                        p2 p2VarA2 = bVar3 != null ? bVar2.a(bVar3) : null;
                        arrayList5.add(new s((p2VarA2 == null || (num2 = p2VarA2.f23193b) == null) ? 0 : num2.intValue(), fVar2.getStart().floatValue(), fVar2.b().floatValue()));
                    }
                    return arrayList5;
                }
                if (i14 == 84) {
                    co1.a aVar11 = co1.a.f28146a;
                    w13.c<ar1.a> cVar6 = ar1.a.f12549h;
                    ArrayList arrayList6 = new ArrayList(p13.y.r(cVar6, 10));
                    for (ar1.a aVar12 : cVar6) {
                        zq1.a aVar13 = zq1.a.f206641a;
                        aVar13.getClass();
                        aVar12.getClass();
                        j23.f<Float> fVar3 = aVar12.f12550a;
                        Iterator<T> it4 = ar1.a.f12549h.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it4.next();
                        } while (((ar1.a) next3) != aVar12);
                        ar1.a aVar14 = (ar1.a) next3;
                        p2 p2VarA3 = aVar14 != null ? aVar13.a(aVar14) : null;
                        arrayList6.add(new s((p2VarA3 == null || (num3 = p2VarA3.f23193b) == null) ? 0 : num3.intValue(), fVar3.getStart().floatValue(), fVar3.b().floatValue()));
                    }
                    return arrayList6;
                }
                switch (i14) {
                    case 12:
                        co1.a aVar15 = co1.a.f28146a;
                        w13.c<co1.c> cVar7 = co1.a.C0433a.f28147a;
                        ArrayList arrayList7 = new ArrayList(p13.y.r(cVar7, 10));
                        for (co1.c cVar8 : cVar7) {
                            arrayList7.add(new s(cVar8.f28159c, cVar8.f28157a, cVar8.f28158b));
                        }
                        return arrayList7;
                    case 13:
                        if (z14) {
                            co1.a.f28146a.getClass();
                            return co1.a.a(true);
                        }
                        co1.a aVar16 = co1.a.f28146a;
                        w13.c<co1.i> cVar9 = co1.i.f28183e;
                        ArrayList arrayList8 = new ArrayList(p13.y.r(cVar9, 10));
                        for (co1.i iVar : cVar9) {
                            arrayList8.add(new s(iVar.f28186c, iVar.f28184a, iVar.f28185b));
                        }
                        return arrayList8;
                    case 14:
                        co1.a aVar17 = co1.a.f28146a;
                        w13.c<co1.b> cVar10 = co1.a.C0433a.f28150d;
                        ArrayList arrayList9 = new ArrayList(p13.y.r(cVar10, 10));
                        for (co1.b bVar4 : cVar10) {
                            arrayList9.add(new s(bVar4.f28155c, bVar4.f28153a, bVar4.f28154b));
                        }
                        return arrayList9;
                    case 15:
                        break;
                    case 16:
                        if (z14) {
                            co1.a.f28146a.getClass();
                            return co1.a.a(false);
                        }
                        co1.a aVar18 = co1.a.f28146a;
                        w13.c<co1.j> cVar11 = co1.j.f28188e;
                        ArrayList arrayList10 = new ArrayList(p13.y.r(cVar11, 10));
                        for (co1.j jVar : cVar11) {
                            arrayList10.add(new s(jVar.f28191c, jVar.f28189a, jVar.f28190b));
                        }
                        return arrayList10;
                    default:
                        co1.a aVar19 = co1.a.f28146a;
                        w13.c<co1.e> cVar12 = co1.a.C0433a.f28148b;
                        ArrayList arrayList11 = new ArrayList(p13.y.r(cVar12, 10));
                        for (co1.e eVar : cVar12) {
                            arrayList11.add(new s(eVar.f28167c, eVar.f28165a, eVar.f28166b));
                        }
                        return arrayList11;
                }
            }
        }
        co1.a aVar20 = co1.a.f28146a;
        w13.c<co1.g> cVar13 = co1.a.C0433a.f28149c;
        ArrayList arrayList12 = new ArrayList(p13.y.r(cVar13, 10));
        for (co1.g gVar : cVar13) {
            arrayList12.add(new s(gVar.f28176c, gVar.f28174a, gVar.f28175b));
        }
        return arrayList12;
    }

    public static int[] d(Context context) {
        return new int[]{a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_1), a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_2), a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_3), a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_4), a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_5), a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_6), a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_7), a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_8), a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_9), a7.b.getColor(context, R.color.tank_pressure_chart_line_tank_10)};
    }

    public static boolean e(int i14) {
        return (i14 == 14 || i14 == 19 || i14 == 2 || i14 == 87 || i14 == 47 || i14 == 20 || i14 == 24 || i14 == 23 || i14 == 25 || i14 == 26 || i14 == 39 || i14 == 40 || i14 == 41 || i14 == 43 || i14 == 46 || i14 == 48 || i14 == 54 || i14 == 89 || i14 == 56 || i14 == 80 || i14 == 58 || i14 == 59 || i14 == 60 || i14 == 85 || i14 == 92 || i14 == 28) ? false : true;
    }

    public static boolean f(Integer num) {
        return num != null && b(num.intValue()) == 0;
    }

    public static boolean g(Integer num) {
        return num != null && b(num.intValue()) == 2;
    }

    public static boolean h(Integer num) {
        return num != null && b(num.intValue()) == 4;
    }

    public static boolean i(int i14) {
        return i14 == 28 || i14 == 54 || i14 == 56 || i14 == 80 || i14 == 89 || i14 == 92;
    }
}
