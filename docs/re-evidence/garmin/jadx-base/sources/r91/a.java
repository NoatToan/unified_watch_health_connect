package r91;

import android.content.Context;
import androidx.lifecycle.j1;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import f12.l;
import gg1.o0;
import java.text.DecimalFormat;
import java.util.List;
import o13.p;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.x;
import r53.b2;
import r53.s;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lr91/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/lifecycle/j1;", "savedStateHandle", "Lo91/a;", "personalRecordsRepository", "Lo53/b0;", "coroutineScope", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/j1;Lo91/a;Lo53/b0;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f151359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o91.a f151360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f151361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1<aa1.c> f151362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f151363e;

    /* JADX INFO: renamed from: r91.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2848a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151364a;

        static {
            int[] iArr = new int[q91.a.values().length];
            try {
                iArr[q91.a.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q91.a.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q91.a.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q91.a.SWIMMING_DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q91.a.POWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q91.a.ASCENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f151364a = iArr;
        }
    }

    public a(Context context, j1 j1Var, o91.a aVar, b0 b0Var) {
        context.getClass();
        j1Var.getClass();
        aVar.getClass();
        b0Var.getClass();
        this.f151359a = context;
        this.f151360b = aVar;
        this.f151361c = b0Var;
        z1<aa1.c> z1VarC = j1Var.c(new aa1.c(false, null, null, null, 0L, 0L, null, null, null, null, null, null, null, false, null, null, 65535, null), "manualPersonalRecordCreationState");
        this.f151362d = z1VarC;
        this.f151363e = s.d(z1VarC);
    }

    public static double a(double d14, q91.a aVar, q91.b bVar) {
        double d15;
        int i14 = C2848a.f151364a[aVar.ordinal()];
        if (i14 == 1) {
            d15 = bVar == q91.b.KILOGRAM ? 1000 : 453.592d;
        } else {
            if (i14 == 6) {
                if (bVar == q91.b.FOOT) {
                    d15 = 0.304799999536704d;
                }
                return d14;
            }
            if (i14 != 3) {
                if (i14 == 4 && bVar == q91.b.YARD) {
                    d15 = 0.9144d;
                }
                return d14;
            }
            d15 = bVar == q91.b.KILOMETER ? 1000.0d : 1609.344d;
        }
        return d14 * d15;
    }

    public final void b(q91.d dVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar) {
        List listK;
        DateTime dateTimeAtStartOfDay;
        q91.d dVar2 = dVar;
        dVar2.getClass();
        while (true) {
            z1<aa1.c> z1Var = this.f151362d;
            aa1.c value = z1Var.getValue();
            z91.a.f203130a.getClass();
            boolean z14 = am.j.z(l.f68084a);
            LocalDate localDateL1 = l.a.a().l1();
            long j8 = 0;
            if (localDateL1 != null && (dateTimeAtStartOfDay = localDateL1.toDateTimeAtStartOfDay(DateTimeZone.UTC)) != null) {
                long millis = dateTimeAtStartOfDay.getMillis();
                if (millis >= 0) {
                    j8 = millis;
                }
            }
            long j14 = dVar2.f143579a;
            Context context = this.f151359a;
            String strC = z91.a.c(context, j14, fVar);
            String string = "";
            if (strC == null) {
                strC = "";
            }
            q91.g gVar = dVar2.f143580b;
            if (gVar == q91.g.TRAINING) {
                string = context.getString(R.string.lbl_manual_pr_strength_caption);
            } else if (dVar2 == q91.d.f143568n) {
                string = context.getString(R.string.lbl_manual_pr_longest_running_caption);
            } else if (gVar == q91.g.RUNNING) {
                string = context.getString(R.string.lbl_manual_pr_running_caption);
            } else if (dVar2 == q91.d.T0) {
                string = context.getString(R.string.lbl_manual_pr_longest_push_caption);
            } else if (gVar == q91.g.PARASPORTS) {
                string = context.getString(R.string.lbl_manual_pr_pushing_caption);
            } else if (dVar2 == q91.d.f143569o) {
                string = context.getString(R.string.lbl_manual_pr_longest_ride_caption);
            } else if (dVar2 == q91.d.f143570p) {
                string = context.getString(R.string.lbl_manual_pr_total_ascent_caption);
            } else if (dVar2 == q91.d.f143571q) {
                string = context.getString(R.string.lbl_manual_pr_max_avg_power_caption);
            } else if (dVar2 == q91.d.f143572r) {
                string = context.getString(R.string.lbl_manual_pr_40_km_caption);
            } else if (dVar2 == q91.d.f143578z) {
                string = context.getString(R.string.lbl_manual_pr_longest_swim_caption);
            } else if (gVar == q91.g.SWIMMING) {
                string = context.getString(R.string.lbl_manual_pr_swimming_caption);
            }
            string.getClass();
            int i14 = z91.a.C3789a.f203135c[dVar2.f143581c.ordinal()];
            if (i14 == 1) {
                listK = x.k(q91.b.KILOMETER, q91.b.MILE);
            } else if (i14 == 2) {
                listK = x.k(q91.b.METER, q91.b.FOOT);
            } else if (i14 != 4) {
                listK = i14 != 6 ? j0.f134944a : x.k(q91.b.KILOGRAM, q91.b.POUND);
            } else {
                listK = x.k(q91.b.METER, q91.b.YARD);
            }
            if (!z14) {
                listK = h0.G0(listK);
            }
            long millis2 = DateTime.now().getMillis();
            pi0.e eVar = new pi0.e(context);
            DateTimeZone dateTimeZone = DateTimeZone.getDefault();
            dateTimeZone.getClass();
            LocalDateTime localDateTime = new LocalDateTime(millis2, dateTimeZone);
            qi0.a aVar = qi0.a.YEAR_MONTH_DAY;
            aVar.getClass();
            String strA = eVar.a(g22.k.r(localDateTime), aVar);
            String string2 = context.getString(R.string.no_value);
            if (z1Var.b(value, new aa1.c(false, dVar2, strC, string, j8, millis2, strA, null, null, string2, p6.b.d(context, R.string.txt_empty_page_no_data, string2), (q91.b) h0.d0(listK), i53.a.e(listK), false, null, null, 49153, null))) {
                return;
            } else {
                dVar2 = dVar;
            }
        }
    }

    public final void c(long j8) {
        z1<aa1.c> z1Var;
        aa1.c value;
        pi0.e eVar;
        LocalDateTime localDateTime;
        qi0.a aVar;
        do {
            z1Var = this.f151362d;
            value = z1Var.getValue();
            z91.a aVar2 = z91.a.f203130a;
            eVar = new pi0.e(this.f151359a);
            DateTimeZone dateTimeZone = DateTimeZone.getDefault();
            dateTimeZone.getClass();
            aVar2.getClass();
            localDateTime = new LocalDateTime(j8, dateTimeZone);
            aVar = qi0.a.YEAR_MONTH_DAY;
            aVar.getClass();
        } while (!z1Var.b(value, aa1.c.b(value, false, j8, eVar.a(g22.k.r(localDateTime), aVar), null, null, null, null, null, false, null, null, 65439)));
    }

    public final void d(q91.b bVar) {
        z1<aa1.c> z1Var;
        aa1.c value;
        bVar.getClass();
        do {
            z1Var = this.f151362d;
            value = z1Var.getValue();
        } while (!z1Var.b(value, aa1.c.b(value, false, 0L, null, null, null, null, null, bVar, false, null, null, 63487)));
        String str = ((aa1.c) this.f151363e.f150540a.getValue()).f2241i;
        if (str != null) {
            e(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f4 A[LOOP:0: B:97:0x02c8->B:100:0x02f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:102:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0115  */
    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    /* JADX WARN: Code duplicated, block: B:41:0x0124  */
    /* JADX WARN: Code duplicated, block: B:43:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0132  */
    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x020a  */
    /* JADX WARN: Code duplicated, block: B:72:0x022d  */
    /* JADX WARN: Code duplicated, block: B:74:0x023e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0244  */
    /* JADX WARN: Code duplicated, block: B:79:0x026a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0272  */
    /* JADX WARN: Code duplicated, block: B:83:0x0282  */
    /* JADX WARN: Code duplicated, block: B:86:0x0298  */
    /* JADX WARN: Code duplicated, block: B:88:0x029c  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:92:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c3  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(String str) {
        boolean z14;
        Context context;
        String string;
        p pVar;
        p pVar2;
        Double dValueOf;
        Double d14;
        boolean zR;
        o0 o0Var;
        o0 o0Var2;
        String strF;
        String strH;
        z1<aa1.c> z1Var;
        aa1.c value;
        String str2;
        boolean z15;
        String str3;
        p pVar3;
        q91.b bVar;
        String string2;
        String string3;
        int i14;
        double d15;
        String string4;
        String string5;
        double d16;
        j23.d dVar;
        str.getClass();
        aa1.c cVar = (aa1.c) this.f151363e.f150540a.getValue();
        q91.d dVar2 = cVar.f2234b;
        q91.b bVar2 = cVar.f2244l;
        if (dVar2 == null) {
            return;
        }
        Double dF = d53.s.f(str);
        if (!w.J(str)) {
            if (dF != null && dF.doubleValue() > 0.0d) {
                switch (C2848a.f151364a[dVar2.f143581c.ordinal()]) {
                    case 1:
                        if (bVar2 != q91.b.KILOGRAM) {
                            dVar = new j23.d(0.1d, 1000.0d);
                        } else {
                            dVar = new j23.d(0.1d, 453.5d);
                        }
                        break;
                    case 2:
                        dVar = new j23.d(1.0d, 143999.0d);
                        break;
                    case 3:
                        if (bVar2 != q91.b.KILOMETER) {
                            dVar = new j23.d(0.1d, 1000.0d);
                        } else {
                            dVar = new j23.d(0.1d, 1609.0d);
                        }
                        break;
                    case 4:
                        dVar = new j23.d(1.0d, 25000.0d);
                        break;
                    case 5:
                        dVar = new j23.d(1.0d, 1999.0d);
                        break;
                    case 6:
                        dVar = bVar2 == q91.b.METER ? new j23.d(1.0d, 27000.0d) : new j23.d(1.0d, 89999.0d);
                        break;
                    default:
                        dVar = new j23.d(0.01d, Double.MAX_VALUE);
                        break;
                }
                if (!dVar.contains(dF)) {
                }
                context = this.f151359a;
                string = "";
                if (z14) {
                    z91.a.f203130a.getClass();
                    dVar2.getClass();
                    if (dVar2 == q91.d.f143571q) {
                        bVar = q91.b.WATT;
                    } else {
                        bVar = bVar2;
                    }
                    if (bVar != null || (string2 = context.getString(bVar.f143548a)) == null) {
                        string2 = "";
                    }
                    if (bVar != null || (string3 = context.getString(bVar.f143549b)) == null) {
                        string3 = "";
                    }
                    i14 = z91.a.C3789a.f203135c[dVar2.f143581c.ordinal()];
                    if (i14 == 1) {
                        String str4 = l3.f23125c.format(0.1d);
                        DecimalFormat decimalFormat = l3.f23125c;
                        if (bVar2 == q91.b.KILOMETER) {
                            d15 = 1609.0d;
                        } else {
                            d15 = 1000.0d;
                        }
                        String str5 = decimalFormat.format(d15);
                        string4 = context.getString(R.string.lbl_distance_value_range, str4, str5, string2);
                        string4.getClass();
                        string5 = context.getString(R.string.lbl_distance_value_range, str4, str5, string3);
                        string5.getClass();
                    } else if (i14 == 2) {
                        l3.f23124b.getClass();
                        String str6 = l3.f23126d.format(1.0d);
                        String str7 = l3.f23126d.format(bVar2 == q91.b.METER ? 27000.0d : 89999.0d);
                        string4 = context.getString(R.string.lbl_ascent_value_range, str6, str7, string2);
                        string4.getClass();
                        string5 = context.getString(R.string.lbl_ascent_value_range, str6, str7, string3);
                        string5.getClass();
                    } else if (i14 == 3) {
                        l3.f23124b.getClass();
                        String str8 = l3.f23126d.format(1.0d);
                        String str9 = l3.f23126d.format(1999.0d);
                        string4 = context.getString(R.string.lbl_power_value_range, str8, str9, string2);
                        string4.getClass();
                        string5 = context.getString(R.string.lbl_power_value_range, str8, str9, string3);
                        string5.getClass();
                    } else if (i14 == 4) {
                        l3.f23124b.getClass();
                        String str10 = l3.f23126d.format(1.0d);
                        String str11 = l3.f23126d.format(25000.0d);
                        string4 = context.getString(R.string.lbl_distance_value_range, str10, str11, string2);
                        string4.getClass();
                        string5 = context.getString(R.string.lbl_distance_value_range, str10, str11, string3);
                        string5.getClass();
                    } else if (i14 != 6) {
                        string4 = "";
                        string5 = string4;
                    } else {
                        l3.f23124b.getClass();
                        String str12 = l3.f23126d.format(0.1d);
                        DecimalFormat decimalFormat2 = l3.f23126d;
                        if (bVar2 == q91.b.KILOGRAM) {
                            d16 = 453.5d;
                        } else {
                            d16 = 1000.0d;
                        }
                        String str13 = decimalFormat2.format(d16);
                        string4 = context.getString(R.string.lbl_weight_value_range, str12, str13, string2);
                        string4.getClass();
                        string5 = context.getString(R.string.lbl_weight_value_range, str12, str13, string3);
                        string5.getClass();
                    }
                    pVar = new p(string4, string5);
                } else {
                    pVar = new p("", "");
                }
                pVar2 = pVar;
                if (dF != null) {
                    dValueOf = Double.valueOf(a(dF.doubleValue(), dVar2.f143581c, bVar2));
                } else {
                    dValueOf = null;
                }
                d14 = dValueOf;
                zR = h0.R(x.k(q91.b.KILOMETER, q91.b.METER, q91.b.KILOGRAM), bVar2);
                if (zR) {
                    o0Var = o0.METRIC;
                } else {
                    o0Var = o0.STATUTE_US;
                }
                o0Var2 = o0Var;
                z91.a.f203130a.getClass();
                dVar2.getClass();
                o0Var2.getClass();
                if (d14 == null) {
                    string = context.getString(R.string.no_value);
                    string.getClass();
                } else {
                    strF = z91.a.f(context, dVar2, d14.doubleValue(), true, zR, o0Var2);
                    if (strF != null) {
                        string = strF;
                    }
                }
                strH = z91.a.h(context, dVar2, d14, string);
                while (true) {
                    z1Var = this.f151362d;
                    value = z1Var.getValue();
                    str2 = string;
                    z15 = z14;
                    str3 = strH;
                    pVar3 = pVar2;
                    if (z1Var.b(value, aa1.c.b(value, false, 0L, null, dF, str, str2, str3, null, z15, (String) pVar2.f128594a, (String) pVar2.f128595b, 6271))) {
                        return;
                    }
                    pVar2 = pVar3;
                    string = str2;
                    strH = str3;
                    z14 = z15;
                }
            }
            z14 = true;
            context = this.f151359a;
            string = "";
            if (z14) {
                z91.a.f203130a.getClass();
                dVar2.getClass();
                if (dVar2 == q91.d.f143571q) {
                    bVar = q91.b.WATT;
                } else {
                    bVar = bVar2;
                }
                if (bVar != null) {
                    string2 = "";
                } else {
                    string2 = "";
                }
                if (bVar != null) {
                    string3 = "";
                } else {
                    string3 = "";
                }
                i14 = z91.a.C3789a.f203135c[dVar2.f143581c.ordinal()];
                if (i14 == 1) {
                    String str14 = l3.f23125c.format(0.1d);
                    DecimalFormat decimalFormat3 = l3.f23125c;
                    if (bVar2 == q91.b.KILOMETER) {
                        d15 = 1609.0d;
                    } else {
                        d15 = 1000.0d;
                    }
                    String str15 = decimalFormat3.format(d15);
                    string4 = context.getString(R.string.lbl_distance_value_range, str14, str15, string2);
                    string4.getClass();
                    string5 = context.getString(R.string.lbl_distance_value_range, str14, str15, string3);
                    string5.getClass();
                } else if (i14 == 2) {
                    l3.f23124b.getClass();
                    String str16 = l3.f23126d.format(1.0d);
                    String str17 = l3.f23126d.format(bVar2 == q91.b.METER ? 27000.0d : 89999.0d);
                    string4 = context.getString(R.string.lbl_ascent_value_range, str16, str17, string2);
                    string4.getClass();
                    string5 = context.getString(R.string.lbl_ascent_value_range, str16, str17, string3);
                    string5.getClass();
                } else if (i14 == 3) {
                    l3.f23124b.getClass();
                    String str18 = l3.f23126d.format(1.0d);
                    String str19 = l3.f23126d.format(1999.0d);
                    string4 = context.getString(R.string.lbl_power_value_range, str18, str19, string2);
                    string4.getClass();
                    string5 = context.getString(R.string.lbl_power_value_range, str18, str19, string3);
                    string5.getClass();
                } else if (i14 == 4) {
                    l3.f23124b.getClass();
                    String str110 = l3.f23126d.format(1.0d);
                    String str111 = l3.f23126d.format(25000.0d);
                    string4 = context.getString(R.string.lbl_distance_value_range, str110, str111, string2);
                    string4.getClass();
                    string5 = context.getString(R.string.lbl_distance_value_range, str110, str111, string3);
                    string5.getClass();
                } else if (i14 != 6) {
                    string4 = "";
                    string5 = string4;
                } else {
                    l3.f23124b.getClass();
                    String str112 = l3.f23126d.format(0.1d);
                    DecimalFormat decimalFormat4 = l3.f23126d;
                    if (bVar2 == q91.b.KILOGRAM) {
                        d16 = 453.5d;
                    } else {
                        d16 = 1000.0d;
                    }
                    String str113 = decimalFormat4.format(d16);
                    string4 = context.getString(R.string.lbl_weight_value_range, str112, str113, string2);
                    string4.getClass();
                    string5 = context.getString(R.string.lbl_weight_value_range, str112, str113, string3);
                    string5.getClass();
                }
                pVar = new p(string4, string5);
            } else {
                pVar = new p("", "");
            }
            pVar2 = pVar;
            if (dF != null) {
                dValueOf = Double.valueOf(a(dF.doubleValue(), dVar2.f143581c, bVar2));
            } else {
                dValueOf = null;
            }
            d14 = dValueOf;
            zR = h0.R(x.k(q91.b.KILOMETER, q91.b.METER, q91.b.KILOGRAM), bVar2);
            if (zR) {
                o0Var = o0.METRIC;
            } else {
                o0Var = o0.STATUTE_US;
            }
            o0Var2 = o0Var;
            z91.a.f203130a.getClass();
            dVar2.getClass();
            o0Var2.getClass();
            if (d14 == null) {
                string = context.getString(R.string.no_value);
                string.getClass();
            } else {
                strF = z91.a.f(context, dVar2, d14.doubleValue(), true, zR, o0Var2);
                if (strF != null) {
                    string = strF;
                }
            }
            strH = z91.a.h(context, dVar2, d14, string);
            while (true) {
                z1Var = this.f151362d;
                value = z1Var.getValue();
                str2 = string;
                z15 = z14;
                str3 = strH;
                pVar3 = pVar2;
                if (z1Var.b(value, aa1.c.b(value, false, 0L, null, dF, str, str2, str3, null, z15, (String) pVar2.f128594a, (String) pVar2.f128595b, 6271))) {
                    return;
                }
                pVar2 = pVar3;
                string = str2;
                strH = str3;
                z14 = z15;
            }
        }
        z14 = false;
        context = this.f151359a;
        string = "";
        if (z14) {
            z91.a.f203130a.getClass();
            dVar2.getClass();
            if (dVar2 == q91.d.f143571q) {
                bVar = q91.b.WATT;
            } else {
                bVar = bVar2;
            }
            if (bVar != null) {
                string2 = "";
            } else {
                string2 = "";
            }
            if (bVar != null) {
                string3 = "";
            } else {
                string3 = "";
            }
            i14 = z91.a.C3789a.f203135c[dVar2.f143581c.ordinal()];
            if (i14 == 1) {
                String str114 = l3.f23125c.format(0.1d);
                DecimalFormat decimalFormat5 = l3.f23125c;
                if (bVar2 == q91.b.KILOMETER) {
                    d15 = 1609.0d;
                } else {
                    d15 = 1000.0d;
                }
                String str115 = decimalFormat5.format(d15);
                string4 = context.getString(R.string.lbl_distance_value_range, str114, str115, string2);
                string4.getClass();
                string5 = context.getString(R.string.lbl_distance_value_range, str114, str115, string3);
                string5.getClass();
            } else if (i14 == 2) {
                l3.f23124b.getClass();
                String str116 = l3.f23126d.format(1.0d);
                String str117 = l3.f23126d.format(bVar2 == q91.b.METER ? 27000.0d : 89999.0d);
                string4 = context.getString(R.string.lbl_ascent_value_range, str116, str117, string2);
                string4.getClass();
                string5 = context.getString(R.string.lbl_ascent_value_range, str116, str117, string3);
                string5.getClass();
            } else if (i14 == 3) {
                l3.f23124b.getClass();
                String str118 = l3.f23126d.format(1.0d);
                String str119 = l3.f23126d.format(1999.0d);
                string4 = context.getString(R.string.lbl_power_value_range, str118, str119, string2);
                string4.getClass();
                string5 = context.getString(R.string.lbl_power_value_range, str118, str119, string3);
                string5.getClass();
            } else if (i14 == 4) {
                l3.f23124b.getClass();
                String str1110 = l3.f23126d.format(1.0d);
                String str1111 = l3.f23126d.format(25000.0d);
                string4 = context.getString(R.string.lbl_distance_value_range, str1110, str1111, string2);
                string4.getClass();
                string5 = context.getString(R.string.lbl_distance_value_range, str1110, str1111, string3);
                string5.getClass();
            } else if (i14 != 6) {
                string4 = "";
                string5 = string4;
            } else {
                l3.f23124b.getClass();
                String str1112 = l3.f23126d.format(0.1d);
                DecimalFormat decimalFormat6 = l3.f23126d;
                if (bVar2 == q91.b.KILOGRAM) {
                    d16 = 453.5d;
                } else {
                    d16 = 1000.0d;
                }
                String str1113 = decimalFormat6.format(d16);
                string4 = context.getString(R.string.lbl_weight_value_range, str1112, str1113, string2);
                string4.getClass();
                string5 = context.getString(R.string.lbl_weight_value_range, str1112, str1113, string3);
                string5.getClass();
            }
            pVar = new p(string4, string5);
        } else {
            pVar = new p("", "");
        }
        pVar2 = pVar;
        if (dF != null) {
            dValueOf = Double.valueOf(a(dF.doubleValue(), dVar2.f143581c, bVar2));
        } else {
            dValueOf = null;
        }
        d14 = dValueOf;
        zR = h0.R(x.k(q91.b.KILOMETER, q91.b.METER, q91.b.KILOGRAM), bVar2);
        if (zR) {
            o0Var = o0.METRIC;
        } else {
            o0Var = o0.STATUTE_US;
        }
        o0Var2 = o0Var;
        z91.a.f203130a.getClass();
        dVar2.getClass();
        o0Var2.getClass();
        if (d14 == null) {
            string = context.getString(R.string.no_value);
            string.getClass();
        } else {
            strF = z91.a.f(context, dVar2, d14.doubleValue(), true, zR, o0Var2);
            if (strF != null) {
                string = strF;
            }
        }
        strH = z91.a.h(context, dVar2, d14, string);
        while (true) {
            z1Var = this.f151362d;
            value = z1Var.getValue();
            str2 = string;
            z15 = z14;
            str3 = strH;
            pVar3 = pVar2;
            if (z1Var.b(value, aa1.c.b(value, false, 0L, null, dF, str, str2, str3, null, z15, (String) pVar2.f128594a, (String) pVar2.f128595b, 6271))) {
                return;
            }
            pVar2 = pVar3;
            string = str2;
            strH = str3;
            z14 = z15;
        }
    }
}
