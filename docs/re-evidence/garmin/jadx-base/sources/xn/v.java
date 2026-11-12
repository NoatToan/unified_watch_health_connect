package xn;

import am.z0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import gl1.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f191630b;

    public /* synthetic */ v(x xVar, int i14) {
        this.f191629a = i14;
        this.f191630b = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:224:0x0940  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f191629a;
        x xVar = this.f191630b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                List<Integer> list = x.f191633p;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    xVar.m(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                List<Integer> list2 = x.f191633p;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    rVar.D(R.string.lbl_step_speed_loss_percent, mVar2, (iIntValue2 << 3) & 112);
                    int i15 = (iIntValue2 << 6) & 896;
                    rVar.o(R.string.help_step_speed_loss_percent_paragraph_1, i15, 2, null, mVar2);
                    rVar.o(R.string.help_step_speed_loss_percent_paragraph_2, i15, 2, null, mVar2);
                    rVar.o(R.string.help_step_speed_loss_percent_paragraph_3, i15, 2, null, mVar2);
                    String strQ = y.Q(mVar2, R.string.lbl_ssl_percent_range);
                    String strQ2 = y.Q(mVar2, R.string.lbl_less_than_number);
                    String strQ3 = y.Q(mVar2, R.string.string_short_dash_line_string_pattern);
                    String strQ4 = y.Q(mVar2, R.string.lbl_greater_than_number);
                    Locale locale = Locale.getDefault();
                    co1.a aVar = co1.a.f28146a;
                    w13.c<ar1.a> cVar = ar1.a.f12549h;
                    ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                    for (ar1.a aVar2 : cVar) {
                        aVar2.getClass();
                        arrayList.add(Double.valueOf(aVar2.f12550a.getStart().floatValue()));
                    }
                    double[] dArrX0 = h0.X0(arrayList);
                    w13.c<ar1.a> cVar2 = ar1.a.f12549h;
                    ArrayList arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                    for (ar1.a aVar3 : cVar2) {
                        aVar3.getClass();
                        arrayList2.add(Double.valueOf(aVar3.f12550a.b().floatValue()));
                    }
                    double[] dArrX1 = h0.X0(arrayList2);
                    ArrayList arrayList3 = new ArrayList(dArrX0.length);
                    for (double d14 : dArrX0) {
                        l3.f23124b.getClass();
                        arrayList3.add(l3.f23130h.format(d14));
                    }
                    mVar2.C(-1587303321);
                    ArrayList arrayList4 = new ArrayList(dArrX1.length);
                    for (double d15 : dArrX1) {
                        l3.f23124b.getClass();
                        String str = l3.f23130h.format(d15);
                        str.getClass();
                        arrayList4.add(y.P(R.string.lbl_value_percent, new Object[]{str}, mVar2));
                    }
                    mVar2.f();
                    x0 x0Var = x0.f105818a;
                    this.f191630b.o(p13.x.k(y.Q(mVar2, R.string.lbl_percentile_in_zone_help), strQ), p13.x.k(String.format(locale, strQ2, Arrays.copyOf(new Object[]{arrayList4.get(0)}, 1)), String.format(locale, strQ3, Arrays.copyOf(new Object[]{arrayList3.get(1), arrayList4.get(1)}, 2)), String.format(locale, strQ3, Arrays.copyOf(new Object[]{arrayList3.get(2), arrayList4.get(2)}, 2)), String.format(locale, strQ3, Arrays.copyOf(new Object[]{arrayList3.get(3), arrayList4.get(3)}, 2)), String.format(locale, strQ4, Arrays.copyOf(new Object[]{arrayList4.get(3)}, 1))), null, mVar2, 0, 4);
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                List<Integer> list3 = x.f191633p;
                rVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    x xVar2 = this.f191630b;
                    String str2 = xVar2.f191636h;
                    z0 z0Var = z0.f4390a;
                    if (z0.b(am.x0.f4331t, str2)) {
                        mVar3.C(-1497934004);
                        rVar2.D(R.string.activity_details_running_cadence, mVar3, (iIntValue3 << 3) & 112);
                        rVar2.o(R.string.cadence_common_help_description, (iIntValue3 << 6) & 896, 2, null, mVar3);
                        mVar3.f();
                    } else if (z0.b(am.x0.f4320q, xVar2.f191636h)) {
                        mVar3.C(-1497934004);
                        rVar2.D(R.string.activity_details_running_cadence, mVar3, (iIntValue3 << 3) & 112);
                        rVar2.o(R.string.cadence_common_help_description, (iIntValue3 << 6) & 896, 2, null, mVar3);
                        mVar3.f();
                    } else if (z0.b(am.x0.F2, xVar2.f191636h)) {
                        mVar3.C(-1497934004);
                        rVar2.D(R.string.activity_details_running_cadence, mVar3, (iIntValue3 << 3) & 112);
                        rVar2.o(R.string.cadence_common_help_description, (iIntValue3 << 6) & 896, 2, null, mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(-1497752716);
                        rVar2.D(R.string.activity_details_running_cadence, mVar3, (iIntValue3 << 3) & 112);
                        int i16 = (iIntValue3 << 6) & 896;
                        rVar2.o(R.string.cadence_help_description_1, i16, 2, null, mVar3);
                        rVar2.o(R.string.cadence_help_description_2, i16, 2, null, mVar3);
                        rVar2.o(R.string.cadence_help_description_3, i16, 2, null, mVar3);
                        String strQ5 = y.Q(mVar3, R.string.lbl_spm);
                        Locale locale2 = Locale.getDefault();
                        x0 x0Var2 = x0.f105818a;
                        xVar2.o(p13.x.k(y.Q(mVar3, R.string.lbl_percentile_in_zone_help), y.Q(mVar3, R.string.lbl_rc_range)), p13.x.k(String.format(locale2, "> %d %s", Arrays.copyOf(new Object[]{185, strQ5}, 2)), String.format(locale2, "%d - %d %s", Arrays.copyOf(new Object[]{174, 185, strQ5}, 3)), String.format(locale2, "%d - %d %s", Arrays.copyOf(new Object[]{163, 173, strQ5}, 3)), String.format(locale2, "%d - %d %s", Arrays.copyOf(new Object[]{151, 162, strQ5}, 3)), String.format(locale2, "< %d %s", Arrays.copyOf(new Object[]{151, strQ5}, 2))), null, mVar3, 0, 4);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                List<Integer> list4 = x.f191633p;
                Integer numValueOf = Integer.valueOf(R.color.palette_mango_2);
                Integer numValueOf2 = Integer.valueOf(R.color.palette_ruby_2);
                Double dValueOf = Double.valueOf(50.5d);
                Double dValueOf2 = Double.valueOf(50.6d);
                Double dValueOf3 = Double.valueOf(51.5d);
                rVar3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar3) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    rVar3.D(R.string.chart_ground_contact_time_balance_title, mVar4, (iIntValue4 << 3) & 112);
                    int i17 = (iIntValue4 << 6) & 896;
                    rVar3.o(R.string.gctb_help_description_1, i17, 2, null, mVar4);
                    rVar3.o(R.string.gctb_help_description_2, i17, 2, null, mVar4);
                    rVar3.o(R.string.gctb_help_description_3, i17, 2, null, mVar4);
                    Locale locale3 = Locale.getDefault();
                    String strQ6 = y.Q(mVar4, R.string.lbl_gctb_range);
                    x0 x0Var3 = x0.f105818a;
                    this.f191630b.o(p13.x.k(y.Q(mVar4, R.string.lbl_percentile_in_zone_help), strQ6), p13.x.k(String.format(locale3, "> %s%% R", Arrays.copyOf(new Object[]{dValueOf3}, 1)), String.format(locale3, "%s%% - %s%% R", Arrays.copyOf(new Object[]{dValueOf2, dValueOf3}, 2)), String.format(locale3, "%s%% R - %s%% L", Arrays.copyOf(new Object[]{dValueOf, dValueOf}, 2)), String.format(locale3, "%s%% - %s%% L", Arrays.copyOf(new Object[]{dValueOf2, dValueOf3}, 2)), String.format(locale3, "> %s%% L", Arrays.copyOf(new Object[]{dValueOf3}, 1))), p13.x.k(numValueOf2, numValueOf, Integer.valueOf(R.color.palette_swagger_1), numValueOf, numValueOf2), mVar4, 0, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                h82.r rVar4 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                List<Integer> list5 = x.f191633p;
                rVar4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar4) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    rVar4.D(R.string.lbl_vertical_oscillation, mVar5, (iIntValue5 << 3) & 112);
                    int i18 = (iIntValue5 << 6) & 896;
                    rVar4.o(R.string.vertical_oscillation_help_description_1, i18, 2, null, mVar5);
                    rVar4.o(R.string.vertical_oscillation_help_description_2, i18, 2, null, mVar5);
                    rVar4.o(R.string.vertical_oscillation_help_description_3, i18, 2, null, mVar5);
                    co1.a aVar4 = co1.a.f28146a;
                    w13.c cVar3 = co1.i.f28183e;
                    ArrayList arrayList5 = new ArrayList(p13.y.r(cVar3, 10));
                    Iterator<T> it = cVar3.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(Double.valueOf(((co1.i) it.next()).f28185b));
                    }
                    double[] dArrX2 = h0.X0(arrayList5);
                    double[] dArr = {6.3d, 8.6d, 10.8d, 13.1d};
                    x xVar3 = this.f191630b;
                    if (xVar3.f191635g) {
                        dArrX2 = dArr;
                    }
                    String strQ7 = y.Q(mVar5, R.string.lbl_cm);
                    Locale locale4 = Locale.getDefault();
                    x0 x0Var4 = x0.f105818a;
                    xVar3.o(p13.x.k(y.Q(mVar5, R.string.lbl_percentile_in_zone_help), y.Q(mVar5, R.string.lbl_vertical_osciallation_range)), p13.x.k(String.format(locale4, "< %s %s", Arrays.copyOf(new Object[]{Double.valueOf(dArrX2[0]), strQ7}, 2)), String.format(locale4, "%s - %s %s", Arrays.copyOf(new Object[]{Double.valueOf(dArrX2[0]), Double.valueOf(dArrX2[1]), strQ7}, 3)), String.format(locale4, "%s - %s %s", Arrays.copyOf(new Object[]{Double.valueOf(dArrX2[1]), Double.valueOf(dArrX2[2]), strQ7}, 3)), String.format(locale4, "%s - %s %s", Arrays.copyOf(new Object[]{Double.valueOf(dArrX2[2]), Double.valueOf(dArrX2[3]), strQ7}, 3)), String.format(locale4, "> %s %s", Arrays.copyOf(new Object[]{Double.valueOf(dArrX2[3]), strQ7}, 2))), null, mVar5, 0, 4);
                    x1 x1Var7 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                h82.r rVar5 = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                List<Integer> list6 = x.f191633p;
                rVar5.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar5) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    rVar5.D(R.string.lbl_ground_contact_time, mVar6, (iIntValue6 << 3) & 112);
                    int i19 = (iIntValue6 << 6) & 896;
                    rVar5.o(R.string.gct_help_description_1, i19, 2, null, mVar6);
                    rVar5.o(R.string.gct_help_description_2, i19, 2, null, mVar6);
                    String strQ8 = y.Q(mVar6, R.string.lbl_gct_range);
                    String strQ9 = y.Q(mVar6, R.string.lbl_ms);
                    Locale locale5 = Locale.getDefault();
                    x0 x0Var5 = x0.f105818a;
                    this.f191630b.o(p13.x.k(y.Q(mVar6, R.string.lbl_percentile_in_zone_help), strQ8), p13.x.k(String.format(locale5, "< %d %s", Arrays.copyOf(new Object[]{208, strQ9}, 2)), String.format(locale5, "%d - %d %s", Arrays.copyOf(new Object[]{208, Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK), strQ9}, 3)), String.format(locale5, "%d - %d %s", Arrays.copyOf(new Object[]{241, 272, strQ9}, 3)), String.format(locale5, "%d - %d %s", Arrays.copyOf(new Object[]{273, 305, strQ9}, 3)), String.format(locale5, "> %d %s", Arrays.copyOf(new Object[]{305, strQ9}, 2))), null, mVar6, 0, 4);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                h82.r rVar6 = (h82.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                List<Integer> list7 = x.f191633p;
                rVar6.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(rVar6) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    int i24 = (iIntValue7 << 3) & 112;
                    rVar6.D(R.string.lbl_step_speed_loss, mVar7, i24);
                    int i25 = (iIntValue7 << 6) & 896;
                    rVar6.l(R.string.help_step_speed_loss_intro, i25, 2, null, mVar7);
                    rVar6.t(R.string.help_step_speed_loss_heading, mVar7, i24);
                    rVar6.o(R.string.help_step_speed_loss_paragraph_1, i25, 2, null, mVar7);
                    rVar6.o(R.string.help_step_speed_loss_paragraph_2, i25, 2, null, mVar7);
                    rVar6.o(R.string.help_step_speed_loss_paragraph_3, i25, 2, null, mVar7);
                    String strQ10 = y.Q(mVar7, R.string.lbl_ssl_range);
                    String strQ11 = y.Q(mVar7, R.string.lbl_less_than_number);
                    String strQ12 = y.Q(mVar7, R.string.string_short_dash_line_string_pattern);
                    String strQ13 = y.Q(mVar7, R.string.lbl_greater_than_number);
                    Locale locale6 = Locale.getDefault();
                    l22.a aVarS = a0.s(mVar7);
                    co1.a aVar5 = co1.a.f28146a;
                    w13.c<ar1.b> cVar4 = ar1.b.f12557h;
                    ArrayList arrayList6 = new ArrayList(p13.y.r(cVar4, 10));
                    for (ar1.b bVar : cVar4) {
                        bVar.getClass();
                        arrayList6.add(Double.valueOf(bVar.f12558a.getStart().floatValue()));
                        strQ13 = strQ13;
                    }
                    String str3 = strQ13;
                    double[] dArrX3 = h0.X0(arrayList6);
                    w13.c<ar1.b> cVar5 = ar1.b.f12557h;
                    ArrayList arrayList7 = new ArrayList(p13.y.r(cVar5, 10));
                    for (ar1.b bVar2 : cVar5) {
                        bVar2.getClass();
                        arrayList7.add(Double.valueOf(bVar2.f12558a.b().floatValue()));
                    }
                    double[] dArrX4 = h0.X0(arrayList7);
                    ArrayList arrayList8 = new ArrayList(dArrX3.length);
                    int i26 = 0;
                    for (int length = dArrX3.length; i26 < length; length = length) {
                        l22.a aVar6 = aVarS;
                        double d16 = dArrX3[i26];
                        l3.f23124b.getClass();
                        arrayList8.add(ss.k.b(ls.e.AVERAGE_STEP_SPEED_LOSS, aVar6, Double.valueOf(l3.a.b((float) d16)), 16));
                        i26++;
                        aVarS = aVar6;
                    }
                    l22.a aVar7 = aVarS;
                    ArrayList arrayList9 = new ArrayList(dArrX4.length);
                    for (double d17 : dArrX4) {
                        l3.f23124b.getClass();
                        arrayList9.add(ss.k.b(ls.e.AVERAGE_STEP_SPEED_LOSS, aVar7, Double.valueOf(l3.a.b((float) d17)), 1));
                    }
                    x0 x0Var6 = x0.f105818a;
                    this.f191630b.o(p13.x.k(y.Q(mVar7, R.string.lbl_percentile_in_zone_help), strQ10), p13.x.k(String.format(locale6, strQ11, Arrays.copyOf(new Object[]{arrayList9.get(0)}, 1)), String.format(locale6, strQ12, Arrays.copyOf(new Object[]{arrayList8.get(1), arrayList9.get(1)}, 2)), String.format(locale6, strQ12, Arrays.copyOf(new Object[]{arrayList8.get(2), arrayList9.get(2)}, 2)), String.format(locale6, strQ12, Arrays.copyOf(new Object[]{arrayList8.get(3), arrayList9.get(3)}, 2)), String.format(locale6, str3, Arrays.copyOf(new Object[]{arrayList9.get(3)}, 1))), null, mVar7, 0, 4);
                    x1 x1Var10 = p3.n.f135158a;
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                h82.r rVar7 = (h82.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                List<Integer> list8 = x.f191633p;
                rVar7.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(rVar7) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    rVar7.D(R.string.lbl_vertical_ratio, mVar8, (iIntValue8 << 3) & 112);
                    int i27 = (iIntValue8 << 6) & 896;
                    rVar7.o(R.string.vertical_ratio_help_description_1, i27, 2, null, mVar8);
                    rVar7.o(R.string.vertical_ratio_help_description_2, i27, 2, null, mVar8);
                    Locale locale7 = Locale.getDefault();
                    co1.a aVar8 = co1.a.f28146a;
                    w13.c cVar6 = co1.j.f28188e;
                    ArrayList arrayList10 = new ArrayList(p13.y.r(cVar6, 10));
                    Iterator<T> it3 = cVar6.iterator();
                    while (it3.hasNext()) {
                        arrayList10.add(Double.valueOf(((co1.j) it3.next()).f28190b));
                    }
                    double[] dArrX5 = h0.X0(arrayList10);
                    double[] dArr2 = {6.3d, 8.2d, 9.9d, 11.8d};
                    x xVar4 = this.f191630b;
                    if (xVar4.f191635g) {
                        dArrX5 = dArr2;
                    }
                    x0 x0Var7 = x0.f105818a;
                    xVar4.o(p13.x.k(y.Q(mVar8, R.string.lbl_percentile_in_zone_help), y.Q(mVar8, R.string.lbl_vertical_ratio_range)), p13.x.k(String.format(locale7, "< %s%%", Arrays.copyOf(new Object[]{Double.valueOf(dArrX5[0])}, 1)), String.format(locale7, "%s%% - %s%%", Arrays.copyOf(new Object[]{Double.valueOf(dArrX5[0]), Double.valueOf(dArrX5[1])}, 2)), String.format(locale7, "%s%% - %s%%", Arrays.copyOf(new Object[]{Double.valueOf(dArrX5[1]), Double.valueOf(dArrX5[2])}, 2)), String.format(locale7, "%s%% - %s%%", Arrays.copyOf(new Object[]{Double.valueOf(dArrX5[2]), Double.valueOf(dArrX5[3])}, 2)), String.format(locale7, "> %s%%", Arrays.copyOf(new Object[]{Double.valueOf(dArrX5[3])}, 1))), null, mVar8, 0, 4);
                    x1 x1Var12 = p3.n.f135158a;
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                h82.r rVar8 = (h82.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                List<Integer> list9 = x.f191633p;
                rVar8.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(rVar8) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    int i28 = ((iIntValue9 << 3) & 112) | 6;
                    rVar8.k(z3.f.c(-1040588305, new wd0.a(rVar8, 17), mVar9), mVar9, i28);
                    rVar8.a(z3.f.c(1961524760, new w(xVar), mVar9), mVar9, i28);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                List<Integer> list10 = x.f191633p;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var14 = p3.n.f135158a;
                    xVar.k(mVar10, 0);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                List<Integer> list11 = x.f191633p;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    xVar.s(mVar11, 0);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                List<Integer> list12 = x.f191633p;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var16 = p3.n.f135158a;
                    xVar.q(mVar12, 0);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                List<Integer> list13 = x.f191633p;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    xVar.r(mVar13, 0);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                List<Integer> list14 = x.f191633p;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var18 = p3.n.f135158a;
                    xVar.h(mVar14, 0);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                List<Integer> list15 = x.f191633p;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var19 = p3.n.f135158a;
                    xVar.g(mVar15, 0);
                } else {
                    mVar15.e();
                }
                break;
            default:
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                List<Integer> list16 = x.f191633p;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var20 = p3.n.f135158a;
                    xVar.l(mVar16, 0);
                } else {
                    mVar16.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
