package ep0;

import am.x0;
import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.k1;
import g21.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ns.q2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lep0/b;", "Ln70/a0;", "Lr53/i;", "Lep0/z;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj70/d;", "Lj70/s;", "cardData", "Lae0/b;", "getDailyUserSummariesUseCase", "Lf12/l;", "userSettings", "Lv21/e;", "nutritionFormatter", "<init>", "(Landroid/content/Context;Lr53/i;Lae0/b;Lf12/l;Lv21/e;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements n70.a0<r53.i<? extends z>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.i<j70.d<j70.s>> f64862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ae0.b f64863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f64864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v21.e f64865e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f64867b;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4308n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4331t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4312o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.Y2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.f4268a3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.f4320q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x0.f4324r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x0.f4316p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[x0.D.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[x0.f4350y.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[x0.U1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[x0.f4323q3.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[x0.f4277d3.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[x0.E2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f64866a = iArr;
            int[] iArr2 = new int[o70.t.values().length];
            try {
                iArr2[o70.t.f130064h.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[o70.t.f130066j.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[o70.t.f130075r.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[o70.t.f130077v.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[o70.t.B.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[o70.t.T.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[o70.t.X.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[o70.t.Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[o70.t.Z.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[o70.t.H0.ordinal()] = 10;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[o70.t.I0.ordinal()] = 11;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[o70.t.Q0.ordinal()] = 12;
            } catch (NoSuchFieldError unused27) {
            }
            f64867b = iArr2;
        }
    }

    public b(Context context, r53.i<j70.d<j70.s>> iVar, ae0.b bVar, f12.l lVar, v21.e eVar) {
        context.getClass();
        iVar.getClass();
        bVar.getClass();
        lVar.getClass();
        eVar.getClass();
        this.f64861a = context;
        this.f64862b = iVar;
        this.f64863c = bVar;
        this.f64864d = lVar;
        this.f64865e = eVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:147:0x0343  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final List c(b bVar, o70.t tVar, List list, b22.e eVar, ArrayList arrayList, List list2, kw.k kVar, f0 f0Var, boolean z14) {
        int i14;
        String string;
        Map<String, Integer> mapB;
        b22.d data;
        hs1.c calories;
        Integer consumedRemaining;
        String strI;
        b22.d data2;
        hs1.c calories2;
        String strI2;
        String string2;
        String strI3;
        String strI4;
        String str;
        Double dL;
        Double dValueOf;
        b22.d data3;
        hs1.i movement;
        hs1.j steps;
        Integer value;
        String strI5;
        b22.d data4;
        hs1.i movement2;
        hs1.j pushes;
        Integer value2;
        String strI6;
        Context context = bVar.f64861a;
        int iIntValue = 0;
        switch (a.f64867b[tVar.ordinal()]) {
            case 1:
                if (kVar == null || (mapB = kVar.b()) == null) {
                    i14 = 0;
                } else {
                    int i15 = 0;
                    i14 = 0;
                    for (Map.Entry<String, Integer> entry : mapB.entrySet()) {
                        String key = entry.getKey();
                        iIntValue = entry.getValue().intValue();
                        i15 += iIntValue;
                        switch (key.hashCode()) {
                            case -1934042132:
                                if (key.equals("HYPERTENSIVE_CRISIS")) {
                                }
                                break;
                            case 178036260:
                                if (key.equals("HIGH_NORMAL")) {
                                }
                                break;
                            case 782485418:
                                if (key.equals("ELEVATED")) {
                                }
                                break;
                            case 997966249:
                                if (key.equals("GRADE_1")) {
                                }
                                break;
                            case 997966250:
                                if (key.equals("GRADE_2")) {
                                }
                                break;
                            case 2036261233:
                                if (key.equals("STAGE_1_HIGH")) {
                                }
                                break;
                            case 2064890384:
                                if (key.equals("STAGE_2_HIGH")) {
                                }
                                break;
                            default:
                                break;
                        }
                        i14 += iIntValue;
                    }
                    iIntValue = i15;
                }
                if (iIntValue == 0) {
                    string = null;
                } else if (i14 > 0) {
                    String string3 = context.getResources().getString(R.string.string_slash_string_no_space_pattern, Integer.valueOf(i14), Integer.valueOf(iIntValue));
                    string = context.getString(R.string.string_space_string_pattern, string3, p6.b.d(context, R.string.lbl_elevated_readings_title_case, string3));
                } else {
                    String string4 = context.getString(R.string.lbl_normal_readings);
                    string4.getClass();
                    string = context.getString(R.string.string_space_string_pattern, Integer.valueOf(iIntValue), g22.n.b(string4));
                }
                if (string != null) {
                    return p13.w.c(string);
                }
                return null;
            case 2:
                boolean zD3 = bVar.f64864d.d3();
                if (zD3) {
                    if (eVar == null || (data = eVar.getData()) == null || (calories = data.getCalories()) == null) {
                        consumedRemaining = null;
                    } else {
                        consumedRemaining = calories.getConsumedRemaining();
                    }
                } else if (eVar == null || (data2 = eVar.getData()) == null || (calories2 = data2.getCalories()) == null) {
                    consumedRemaining = null;
                } else {
                    consumedRemaining = calories2.getBurnedTotal();
                }
                if (consumedRemaining != null) {
                    int iIntValue2 = consumedRemaining.intValue();
                    l3.f23124b.getClass();
                    String strZ0 = l3.a.Z0(iIntValue2);
                    if (zD3) {
                        String string5 = context.getString(R.string.calories_average_remaining);
                        string5.getClass();
                        strI = context.getString(R.string.string_space_string_pattern, strZ0, string5);
                        strI.getClass();
                        if (z14) {
                            strI = oi0.c.A(context, new ep0.a(4), strI);
                        }
                    } else {
                        strI = bVar.i(strZ0, z14);
                    }
                } else {
                    strI = null;
                }
                if (strI != null) {
                    return p13.w.c(strI);
                }
                return null;
            case 3:
                Double dK = k(list, new ep0.a(7), new e70.a(21));
                if (dK != null) {
                    int iB = MathKt.b(dK.doubleValue());
                    l3.f23124b.getClass();
                    strI2 = bVar.i(l3.a.Z0(iB), z14);
                } else {
                    strI2 = null;
                }
                if (strI2 != null) {
                    return p13.w.c(strI2);
                }
                return null;
            case 4:
                Double dL2 = l(bVar, list, new e70.a(22));
                if (dL2 != null) {
                    int iB2 = MathKt.b(dL2.doubleValue());
                    String string6 = context.getString(R.string.activities_average_resting_lbl);
                    string6.getClass();
                    string2 = context.getString(R.string.string_space_string_pattern, Integer.valueOf(iB2), string6);
                    string2.getClass();
                    if (z14) {
                        string2 = oi0.c.A(context, new e70.a(23), string2);
                    }
                } else {
                    string2 = null;
                }
                if (string2 != null) {
                    return p13.w.c(string2);
                }
                return null;
            case 5:
                Double dL3 = l(bVar, list, new e70.a(26));
                if (dL3 != null) {
                    double dDoubleValue = dL3.doubleValue();
                    op0.b.a aVar = op0.b.f133168a;
                    gg1.n nVarD0 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).d0();
                    aVar.getClass();
                    q22.b bVarA = op0.b.a.a(nVarD0);
                    wp0.a aVar2 = new wp0.a(new l22.a(context));
                    wp0.a.f186524b.getClass();
                    strI3 = bVar.i(aVar2.b(MathKt.b(q22.a.a(dDoubleValue, q22.b.MILLILITER, bVarA)), bVarA, true, wp0.a.C3469a.a(bVarA), z14), z14);
                } else {
                    strI3 = null;
                }
                if (strI3 != null) {
                    return p13.w.c(strI3);
                }
                return null;
            case 6:
                Integer num = f0Var.f75417a;
                if (num != null) {
                    int iIntValue3 = num.intValue();
                    v21.e eVar2 = bVar.f64865e;
                    l22.a aVar3 = eVar2.f175325b;
                    l3.f23124b.getClass();
                    String str2 = l3.f23131i.format(Integer.valueOf(iIntValue3));
                    if (str2 == null) {
                        str2 = eVar2.f175327d;
                    }
                    return p13.w.c(aVar3.a(R.string.string_space_string_pattern, str2, z14 ? aVar3.getString(R.string.lbl_average_calories) : aVar3.getString(R.string.avg_calories)));
                }
                return null;
            case 7:
                Double dL4 = l(bVar, list, new e70.a(24));
                if (dL4 != null) {
                    String string7 = context.getString(R.string.lbl_value_percent, Integer.valueOf(MathKt.b(dL4.doubleValue())));
                    string7.getClass();
                    strI4 = bVar.i(string7, z14);
                } else {
                    strI4 = null;
                }
                if (strI4 != null) {
                    return p13.w.c(strI4);
                }
                return null;
            case 8:
                Double dL5 = l(bVar, list, new e70.a(20));
                String string8 = dL5 != null ? context.getString(R.string.string_space_string_space_string_pattern, Integer.valueOf(MathKt.b(dL5.doubleValue())), context.getString(z14 ? R.string.lbl_average_awake : R.string.sleep_lbl_avg_awake), context.getString(R.string.device_settings_frequency_daily)) : null;
                if (string8 != null) {
                    return p13.w.c(string8);
                }
                return null;
            case 9:
                ArrayList arrayList2 = new ArrayList();
                bv.b.f21239a.getClass();
                bv.b.a();
                if (k1.f37122a.o() && (dL = l(bVar, arrayList, new e70.a(27))) != null) {
                    arrayList2.add(bVar.i(String.valueOf(MathKt.b(dL.doubleValue())), z14));
                }
                Double dL6 = l(bVar, arrayList, new e70.a(28));
                if (dL6 != null) {
                    int iDoubleValue = (int) dL6.doubleValue();
                    arrayList2.add(bVar.i(z14 ? new u00.a(new l22.a(context)).d(iDoubleValue) : new b10.c(new l22.a(context)).f14213c.c(iDoubleValue), z14));
                }
                if (!arrayList2.isEmpty()) {
                    if (arrayList2.size() == 1) {
                        return arrayList2;
                    }
                    String str3 = (String) h0.d0(arrayList2);
                    if (str3 != null && (str = (String) h0.n0(arrayList2)) != null) {
                        return p13.w.c(context.getString(R.string.string_slash_string_pattern, str3, str));
                    }
                }
                return null;
            case 10:
                f12.l.f68084a.getClass();
                if (f12.l.a.a().B3()) {
                    dValueOf = (eVar == null || (data4 = eVar.getData()) == null || (movement2 = data4.getMovement()) == null || (pushes = movement2.getPushes()) == null || (value2 = pushes.getValue()) == null) ? null : Double.valueOf(value2.intValue());
                    if ((dValueOf != null ? dValueOf.doubleValue() : 0.0d) <= 0.0d) {
                        dValueOf = null;
                    }
                } else {
                    dValueOf = (eVar == null || (data3 = eVar.getData()) == null || (movement = data3.getMovement()) == null || (steps = movement.getSteps()) == null || (value = steps.getValue()) == null) ? null : Double.valueOf(value.intValue());
                    if ((dValueOf != null ? dValueOf.doubleValue() : 0.0d) <= 0.0d) {
                        dValueOf = null;
                    }
                }
                if (dValueOf == null) {
                    strI5 = null;
                } else {
                    l3.a aVar4 = l3.f23124b;
                    int iDoubleValue2 = (int) dValueOf.doubleValue();
                    aVar4.getClass();
                    strI5 = bVar.i(l3.a.Z0(iDoubleValue2), z14);
                }
                if (strI5 != null) {
                    return p13.w.c(strI5);
                }
                return null;
            case 11:
                Double dL7 = l(bVar, list, new e70.a(25));
                String strI7 = dL7 != null ? bVar.i(String.valueOf((int) dL7.doubleValue()), z14) : null;
                if (strI7 != null) {
                    return p13.w.c(strI7);
                }
                return null;
            case 12:
                Double dL8 = l(bVar, list2, new e70.a(29));
                if (dL8 != null) {
                    double dDoubleValue2 = dL8.doubleValue();
                    q42.h hVar = new q42.h(context);
                    l3.f23124b.getClass();
                    strI6 = bVar.i(q42.h.c(hVar, Double.valueOf(l3.a.P1(dDoubleValue2)), null, false, 14), z14);
                } else {
                    strI6 = null;
                }
                if (strI6 != null) {
                    return p13.w.c(strI6);
                }
                return null;
            default:
                return null;
        }
    }

    public static final String d(b bVar, List list) {
        Context context = bVar.f64861a;
        int size = list.size();
        gf0.a aVar = (gf0.a) h0.n0(list);
        if (size == 1 && aVar != null) {
            return new pf0.s(context).c(aVar);
        }
        String string = context.getString(R.string.lbl_recordings_count, Integer.valueOf(size));
        string.getClass();
        return string;
    }

    public static final String e(b bVar, List list, boolean z14) {
        Object next;
        Object next2;
        Context context = bVar.f64861a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(((sl0.a) obj).getScoreType(), "STABLEFORD")) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int typeScore = ((sl0.a) next).getTypeScore();
                do {
                    Object next3 = it.next();
                    int typeScore2 = ((sl0.a) next3).getTypeScore();
                    if (typeScore > typeScore2) {
                        next = next3;
                        typeScore = typeScore2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        sl0.a aVar = (sl0.a) next;
        Object objValueOf = aVar != null ? Integer.valueOf(aVar.getTypeScore()) : null;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!p005kotlin.jvm.internal.s.g(((sl0.a) obj2).getScoreType(), "STABLEFORD")) {
                arrayList2.add(obj2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                int strokes = ((sl0.a) next2).getStrokes();
                do {
                    Object next4 = it3.next();
                    int strokes2 = ((sl0.a) next4).getStrokes();
                    if (strokes > strokes2) {
                        next2 = next4;
                        strokes = strokes2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next2 = null;
        }
        sl0.a aVar2 = (sl0.a) next2;
        Integer numValueOf = aVar2 != null ? Integer.valueOf(aVar2.getStrokes()) : null;
        if (numValueOf != null) {
            objValueOf = numValueOf;
        } else if (objValueOf == null) {
            objValueOf = new b50.o(z14, bVar, 1);
        }
        String string = context.getString(R.string.lbl_best_total);
        string.getClass();
        String string2 = context.getString(R.string.string_space_string_pattern, objValueOf, string);
        string2.getClass();
        return string2;
    }

    public static final String f(b bVar, List list, boolean z14) {
        String string;
        Context context = bVar.f64861a;
        Double dL = l(bVar, list, new ep0.a(5));
        Integer numValueOf = dL != null ? Integer.valueOf(MathKt.b(dL.doubleValue())) : null;
        if (numValueOf == null || (string = String.valueOf(numValueOf.intValue())) == null) {
            string = context.getString(z14 ? R.string.no_data_label : R.string.no_value);
            string.getClass();
        }
        if (z14) {
            String string2 = context.getString(R.string.string_space_string_pattern, string, context.getString(R.string.activity_details_average_heart_rate));
            string2.getClass();
            return oi0.c.A(context, new ep0.a(6), string2);
        }
        String string3 = context.getString(R.string.param_avg_hr, string);
        string3.getClass();
        return string3;
    }

    public static final Double g(b bVar, Double d14) {
        bVar.getClass();
        if (d14 == null || d14.doubleValue() < 0.0d) {
            return null;
        }
        return d14;
    }

    public static Double k(List list, e23.l lVar, e23.l lVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Double d14 = (Double) lVar.invoke((Double) lVar2.invoke(it.next()));
            if (d14 != null) {
                arrayList.add(d14);
            }
        }
        if (arrayList.isEmpty() || h0.P0(arrayList) == 0.0d) {
            return null;
        }
        return Double.valueOf(h0.P0(arrayList) / Math.max(arrayList.size(), 1.0d));
    }

    public static /* synthetic */ Double l(b bVar, List list, e23.l lVar) {
        ds0.g gVar = new ds0.g(bVar, 11);
        bVar.getClass();
        return k(list, gVar, lVar);
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetLastSevenDaysDataUseCase";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h(List<? extends ActivityListItemDTO> list, boolean z14, boolean z15) {
        Iterator<T> it = list.iterator();
        double d14 = 0.0d;
        while (it.hasNext()) {
            d14 += ((ActivityListItemDTO) it.next()).f29273j;
        }
        int i14 = z15 ? 5 : 1;
        Context context = this.f64861a;
        if (z14) {
            String strC = u00.b.c(new q2(new l22.a(context), null, 2, 0 == true ? 1 : 0), new ls.g(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), d14), i14, 4);
            if (strC != null) {
                return strC;
            }
        } else {
            String strC2 = u00.b.c(new ns.p(new l22.a(context), false, false, l3.f23126d, null, 22, null), Double.valueOf(d14), i14, 4);
            if (strC2 != null) {
                return strC2;
            }
        }
        return "";
    }

    public final String i(String str, boolean z14) {
        Context context = this.f64861a;
        if (z14) {
            String string = context.getString(R.string.string_space_string_pattern, str, context.getString(R.string.lbl_average));
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.lbl_value_avg, str);
        string2.getClass();
        return string2;
    }

    @Override // n70.a0
    public final r53.i<? extends z> invoke() {
        return new g(this.f64862b, this);
    }

    public final String j(x0 x0Var, List<? extends ActivityListItemDTO> list, boolean z14) {
        int i14 = a.f64866a[x0Var.ordinal()];
        Context context = this.f64861a;
        switch (i14) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return h(list, false, z14);
            case 8:
                return h(list, true, z14);
            case 9:
            case 10:
                Iterator<T> it = list.iterator();
                double d14 = 0.0d;
                while (it.hasNext()) {
                    d14 += ((ActivityListItemDTO) it.next()).f29275k;
                }
                int iB = MathKt.b(d14);
                String strA = z14 ? new oi0.e(new l22.a(context)).a(((long) iB) * 1000, false) : gm.b.b(context, iB);
                strA.getClass();
                return strA;
            default:
                int size = list.size();
                if (size != 1) {
                    String string = context.getString(R.string.num_activities, Integer.valueOf(size));
                    string.getClass();
                    return string;
                }
                String string2 = context.getString(R.string.string_space_string_pattern, Integer.valueOf(size), context.getString(R.string.device_screen_activity));
                string2.getClass();
                return string2;
        }
    }
}
