package b81;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.Shader;
import c22.c3;
import c22.i;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import g81.g;
import g81.k;
import g81.o;
import g81.w;
import i3.e5;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.Weeks;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lb81/a;", "Lqz/c;", "Lg81/w;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "intervalType", "", "axisMinimum", "axisMaximum", "", "", "colorMap", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;IFFLjava/util/Map;)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<w, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f16385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f16386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f16389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, Integer> f16390g;

    static {
        new C0233a(null);
    }

    public a(Context context, LocalDate localDate, LocalDate localDate2, int i14, float f14, float f15, Map<String, Integer> map) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        map.getClass();
        this.f16384a = context;
        this.f16385b = localDate;
        this.f16386c = localDate2;
        this.f16387d = i14;
        this.f16388e = f14;
        this.f16389f = f15;
        this.f16390g = map;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0286  */
    @Override // qz.c
    public final List<BarDataSet> a(w wVar) throws Throwable {
        Throwable th3;
        List list;
        List list2;
        int i14;
        String strD;
        i53.e<Map.Entry> eVar;
        int iIntValue;
        a aVar = this;
        w wVar2 = wVar;
        ArrayList arrayList = new ArrayList();
        i53.d<LocalDate, o> dVar = wVar2 != null ? wVar2.f76415d : null;
        Context context = aVar.f16384a;
        if (dVar == null || (eVar = (i53.e) dVar.entrySet()) == null) {
            th3 = null;
            list = j0.f134944a;
        } else {
            ArrayList arrayList2 = new ArrayList(y.r(eVar, 10));
            for (Map.Entry entry : eVar) {
                LocalDate localDate = (LocalDate) entry.getKey();
                float f14 = ((o) entry.getValue()).f76381a;
                List<g> listG0 = h0.G0(((o) entry.getValue()).f76382b);
                int i15 = (int) ((o) entry.getValue()).f76381a;
                DateTime dateTime = localDate.toDateTime(LocalTime.MIDNIGHT);
                dateTime.getClass();
                ArrayList arrayList3 = new ArrayList(y.r(listG0, 10));
                for (g gVar : listG0) {
                    Double d14 = gVar.f76328d;
                    float fDoubleValue = ((d14 != null ? (float) d14.doubleValue() : 0.0f) / 100.0f) * f14;
                    Integer num = gVar.f76327c;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        k.f76348a.getClass();
                        iIntValue = k.f76350c;
                    }
                    c3 c3VarB = gVar.f76326b;
                    if (c3VarB == null && (c3VarB = gVar.f76325a) == null) {
                        c3VarB = i.b(R.string.no_value);
                    }
                    arrayList3.add(new k00.a(fDoubleValue, iIntValue, dh.b.A(context, c3VarB)));
                }
                arrayList2.add(new k00.b(i15, dateTime, arrayList3));
            }
            th3 = null;
            list = arrayList2;
        }
        ArrayList arrayList4 = new ArrayList();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList5 = new ArrayList();
            int i16 = 0;
            for (int size = list.size(); i16 != size; size = size) {
                list2 = list;
                k00.b bVar = (k00.b) list2.get(i16);
                List<k00.a> list3 = bVar.f101960c;
                Iterator<T> it = list3.iterator();
                double d15 = 0.0d;
                List list4 = list2;
                while (it.hasNext()) {
                    d15 += (double) ((k00.a) it.next()).f101955a;
                    list4 = list4;
                }
                List list5 = list4;
                List listG1 = h0.G0(list3);
                if (listG1.isEmpty()) {
                    i14 = i16;
                } else {
                    float f15 = i16;
                    float f16 = (float) d15;
                    ArrayList arrayList6 = new ArrayList(y.r(list3, 10));
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(Integer.valueOf(MathKt.c(((k00.a) it3.next()).f101955a / 25.0f)));
                    }
                    ArrayList arrayList7 = new ArrayList();
                    int i17 = 0;
                    for (Object obj : arrayList6) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            x.q();
                            throw th3;
                        }
                        float f17 = f16;
                        int i19 = i16;
                        int iD = 0;
                        ArrayList arrayList8 = arrayList6;
                        for (int iS = h0.S(t.o(0, ((Number) obj).intValue())); iD < iS; iS = iS) {
                            iD = e5.d(list3.get(i17).f101956b, iD, arrayList7, 1);
                        }
                        if (i17 < arrayList8.size() - 1) {
                            arrayList7.add(Integer.valueOf(R.color.transparent));
                        }
                        arrayList6 = arrayList8;
                        i17 = i18;
                        f16 = f17;
                        i16 = i19;
                    }
                    float f18 = f16;
                    i14 = i16;
                    ArrayList arrayList9 = new ArrayList(y.r(arrayList7, 10));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        arrayList9.add(Integer.valueOf(a7.b.getColor(context, ((Number) it4.next()).intValue())));
                    }
                    xz.e eVar2 = new xz.e(f15, f18, (Object) null, h0.a1(arrayList9), 0.0f, false, false, 112, (j) null);
                    if (d15 > 0.0d) {
                        int size2 = listG1.size();
                        ArrayList arrayList10 = new ArrayList(size2);
                        int i24 = 0;
                        while (i24 < size2) {
                            int i25 = bVar.f101958a;
                            l3.f23124b.getClass();
                            String string = context.getString(R.string.lbl_endurance_score_value, l3.f23131i.format(Integer.valueOf(i25)));
                            string.getClass();
                            LocalDate localDate2 = bVar.f101959b.toLocalDate();
                            localDate2.getClass();
                            int i26 = size2;
                            pi0.e eVar3 = new pi0.e(context);
                            k00.b bVar2 = bVar;
                            double d16 = d15;
                            int i27 = aVar.f16387d;
                            if (i27 == 3) {
                                strD = eVar3.d(localDate2, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                            } else if (i27 == 10) {
                                LocalDate localDatePlusDays = localDate2.plusDays(6);
                                if (localDatePlusDays.isAfter(LocalDate.now())) {
                                    localDatePlusDays = LocalDate.now();
                                }
                                localDatePlusDays.getClass();
                                qi0.c cVar = qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY;
                                cVar.getClass();
                                DateTime dateTimeAtStartOfDay = localDate2.toDateTimeAtStartOfDay();
                                dateTimeAtStartOfDay.getClass();
                                DateTime dateTimeAtStartOfDay2 = localDatePlusDays.toDateTimeAtStartOfDay();
                                dateTimeAtStartOfDay2.getClass();
                                strD = eVar3.g(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, cVar);
                            } else if (i27 != 5) {
                                strD = i27 != 6 ? "" : eVar3.d(localDate2, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_NO_DAY);
                            } else {
                                strD = eVar3.d(localDate2, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                            }
                            arrayList10.add(new l(context.getString(R.string.string_space_dot_space_string_pattern, strD, string), l3.f23125c.format((((double) ((k00.a) listG1.get(i24)).f101955a) / d16) * 100.0d), ((k00.a) listG1.get(i24)).f101957c, context.getString(R.string.percent_sign), null, Integer.valueOf(((k00.a) listG1.get(i24)).f101956b), null, null, 208, null));
                            i24++;
                            aVar = this;
                            size2 = i26;
                            bVar = bVar2;
                            d15 = d16;
                        }
                        eVar2.setData(arrayList10);
                    }
                    arrayList5.add(eVar2);
                }
                i16 = i14 + 1;
                aVar = this;
                list2 = list5;
            }
            list2 = list;
            if (!arrayList5.isEmpty()) {
                arrayList4.add(arrayList5);
            }
        }
        ArrayList arrayList11 = new ArrayList(y.r(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            BarDataSet barDataSet = new BarDataSet((List) it5.next(), "");
            barDataSet.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
            arrayList11.add(barDataSet);
        }
        if (!arrayList11.isEmpty()) {
            arrayList.addAll(arrayList11);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(w wVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(w wVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(w wVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(w wVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(w wVar) {
        return null;
    }

    @Override // qz.c
    public final float i(w wVar) {
        return MathKt.c((this.f16389f + 500) / 100.0f) * 100.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(w wVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(w wVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(w wVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(w wVar) {
        return null;
    }

    @Override // qz.c
    public final float q(w wVar) {
        LocalDate localDate = this.f16386c;
        int i14 = this.f16387d;
        LocalDate localDate2 = this.f16385b;
        return (i14 == 10 ? Weeks.weeksBetween(localDate2, localDate).getWeeks() : Months.monthsBetween(localDate2, localDate).getMonths() + 1.0f) + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(w wVar) {
        return null;
    }

    @Override // qz.c
    public final float t(w wVar) {
        return this.f16388e;
    }

    @Override // qz.c
    public final List u(w wVar) {
        Boolean boolValueOf;
        i53.b bVar;
        w wVar2 = wVar;
        Context context = this.f16384a;
        String string = context.getString(R.string.lbl_miscellaneous_activities);
        string.getClass();
        k.f76348a.getClass();
        xz.f fVar = new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, k.f76350c)), null, xz.g.a.f192745a, null, null, 106, null);
        if (wVar2 == null || (bVar = (i53.b) wVar2.f76415d.values()) == null) {
            boolValueOf = null;
        } else {
            boolean z14 = false;
            if (!bVar.isEmpty()) {
                Iterator<E> it = bVar.iterator();
                loop0: while (it.hasNext()) {
                    List<g> list = ((o) it.next()).f76382b;
                    if (!list.isEmpty()) {
                        Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (s.g(((g) it3.next()).f76325a, i.b(R.string.lbl_miscellaneous_activities))) {
                                z14 = true;
                                break loop0;
                            }
                        }
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z14);
        }
        q13.b bVarB = p13.w.b();
        Iterator<T> it4 = this.f16390g.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            x0 x0VarM = z0.m((String) entry.getKey());
            if (x0VarM == null) {
                x0VarM = x0.f4346x;
            }
            bVarB.add(new xz.f(dh.b.A(context, x0VarM.f4360c), null, Integer.valueOf(a7.b.getColor(context, ((Number) entry.getValue()).intValue())), null, xz.g.a.f192745a, null, null, 106, null));
        }
        if (s.g(boolValueOf, Boolean.TRUE)) {
            bVarB.add(fVar);
        }
        return p13.w.a(bVarB);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(w wVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(w wVar) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: b81.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lb81/a$a;", "", "<init>", "()V", "", "X_AXIS_EDGE_PADDING", "F", "MONTHS_LAST_BAR_INDEX_CORRECTION", "", "Y_AXIS_TOP_PADDING", "I", "Y_AXIS_ROUNDING_STEP", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0233a {
        public /* synthetic */ C0233a(j jVar) {
            this();
        }

        private C0233a() {
        }
    }
}
