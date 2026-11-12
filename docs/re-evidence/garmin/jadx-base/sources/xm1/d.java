package xm1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.LineDataSet;
import d53.w;
import d53.y;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k00.h;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.x;
import w5.r;
import xz.g;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lxm1/d;", "Lk00/h;", "Lxm1/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "isDaily", "includeSleepAlignmentStatus", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZZ)V", "a", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends h<c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f191500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f191501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pi0.e f191502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b10.d f191503i;

    static {
        new a(null);
        int i14 = b10.d.f14214d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, LocalDate localDate, LocalDate localDate2, boolean z14, boolean z15) {
        super(context, localDate, localDate2, z14);
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f191500f = z14;
        this.f191501g = z15;
        this.f191502h = new pi0.e(context);
        this.f191503i = new b10.d(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p F(c cVar) {
        e eVar;
        float f14;
        float f15;
        List<e> list;
        List<e> list2;
        Object next;
        xm1.a.f191492a.getClass();
        e eVar2 = null;
        Object next2 = null;
        eVar2 = null;
        if (cVar == null || (list2 = cVar.f191497a) == null) {
            eVar = null;
        } else {
            Iterator<T> it = list2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long j8 = ((e) next).f191506c;
                    do {
                        Object next3 = it.next();
                        long j14 = ((e) next3).f191506c;
                        if (j8 < j14) {
                            next = next3;
                            j8 = j14;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            eVar = (e) next;
        }
        if (eVar == null) {
            f14 = -28800.0f;
        } else {
            long j15 = eVar.f191506c;
            long j16 = DateTimeConstants.SECONDS_PER_HOUR;
            long j17 = j15 % j16;
            f14 = j17 == 0 ? j15 : (j16 - j17) + j15;
        }
        float f16 = DateTimeConstants.SECONDS_PER_HOUR;
        float f17 = f14 / f16;
        xm1.a.f191492a.getClass();
        if (cVar != null && (list = cVar.f191497a) != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    long j18 = ((e) next2).f191505b;
                    do {
                        Object next4 = it3.next();
                        long j19 = ((e) next4).f191505b;
                        if (j18 > j19) {
                            next2 = next4;
                            j18 = j19;
                        }
                    } while (it3.hasNext());
                }
            }
            eVar2 = (e) next2;
        }
        if (eVar2 == null) {
            f15 = 14400.0f;
        } else {
            long j24 = eVar2.f191505b;
            long j25 = DateTimeConstants.SECONDS_PER_HOUR;
            long j26 = j24 % j25;
            if (j26 != 0) {
                j24 -= j25 + j26;
            }
            f15 = j24;
        }
        float f18 = f15 / f16;
        if (f18 < 0.0f) {
            f17++;
        }
        float f19 = 4;
        float f22 = f19 - ((f17 - f18) % f19);
        if (f22 == f19) {
            f22 = 0.0f;
        }
        if (f22 > 0.0f) {
            float f24 = 2;
            float f25 = f22 % f24;
            float f26 = f25 == 0.0f ? f22 / f24 : ((f24 - f25) + f22) / f24;
            f17 += f22 - f26;
            f18 -= f26;
        }
        p pVar = new p(Float.valueOf(f17), Float.valueOf(f18));
        float fFloatValue = ((Number) pVar.f128594a).floatValue();
        float f27 = -((Number) pVar.f128595b).floatValue();
        xm1.a.f191492a.getClass();
        return new p(Float.valueOf((-fFloatValue) * f16), Float.valueOf(f27 * f16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k00.h
    public final float C(c cVar) {
        List<e> list;
        c cVar2 = cVar;
        if (cVar2 == null || (list = cVar2.f191497a) == null || r.r(list)) {
            return ((Number) F(cVar2).f128595b).floatValue();
        }
        return 14400.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k00.h
    public final float D(c cVar) {
        List<e> list;
        c cVar2 = cVar;
        if (cVar2 == null || (list = cVar2.f191497a) == null || r.r(list)) {
            return ((Number) F(cVar2).f128594a).floatValue();
        }
        return -28800.0f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    public final l E(Long l14, LocalDate localDate, LocalDate localDate2, boolean z14) throws ParseException {
        String str;
        String strM;
        b10.d dVar;
        String strF;
        l22.a aVar;
        String string;
        String strT0;
        boolean z15;
        Integer numValueOf;
        pi0.e eVar = this.f191502h;
        boolean z16 = this.f191500f;
        if (!z16) {
            if (localDate2 != null) {
                strM = eVar.m(localDate, localDate2, pi0.f.SHORT_MONTH_NO_WEEKDAY);
            } else {
                str = "";
            }
            long jLongValue = l14.longValue();
            dVar = this.f191503i;
            strF = dVar.f(jLongValue);
            aVar = dVar.f14215a;
            if (z16) {
                if (z14) {
                    string = aVar.getString(R.string.sleep_lbl_wake_time);
                } else {
                    string = aVar.getString(R.string.sleep_lbl_bedtime);
                }
            } else if (z14) {
                string = aVar.getString(R.string.lbl_avg_wake_time);
            } else {
                string = aVar.getString(R.string.lbl_avg_bedtime);
            }
            String str2 = string;
            if (dVar.f14217c) {
                strT0 = null;
            } else {
                strT0 = y.t0(2, strF);
            }
            String string2 = w.i0(w.R(strF, strT0 != null ? strT0 : "")).toString();
            z15 = this.f191501g;
            if (z15) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(R.color.gcm_sleep_chart_consistency);
            }
            return new l(str, string2, str2, strT0, null, numValueOf, z15 ? null : Integer.valueOf(R.drawable.gcm_chart_metric_bullet), null, SyslogConstants.LOG_LOCAL2, null);
        }
        strM = eVar.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
        str = strM;
        long jLongValue2 = l14.longValue();
        dVar = this.f191503i;
        strF = dVar.f(jLongValue2);
        aVar = dVar.f14215a;
        if (z16) {
            if (z14) {
                string = aVar.getString(R.string.sleep_lbl_wake_time);
            } else {
                string = aVar.getString(R.string.sleep_lbl_bedtime);
            }
        } else if (z14) {
            string = aVar.getString(R.string.lbl_avg_wake_time);
        } else {
            string = aVar.getString(R.string.lbl_avg_bedtime);
        }
        String str3 = string;
        if (dVar.f14217c) {
            strT0 = null;
        } else {
            strT0 = y.t0(2, strF);
        }
        String string3 = w.i0(w.R(strF, strT0 != null ? strT0 : "")).toString();
        z15 = this.f191501g;
        if (z15) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(R.color.gcm_sleep_chart_consistency);
        }
        return new l(str, string3, str3, strT0, null, numValueOf, z15 ? null : Integer.valueOf(R.drawable.gcm_chart_metric_bullet), null, SyslogConstants.LOG_LOCAL2, null);
    }

    @Override // qz.c
    public final float e(Object obj) {
        return 0.0f - (gl1.d.I(this.f101982b, this.f101983c) ? 0.2f : 0.5f);
    }

    @Override // qz.c
    public final List f(Object obj) {
        List<e> list;
        c cVar = (c) obj;
        ArrayList arrayList = new ArrayList();
        if (cVar != null && (list = cVar.f191497a) != null && r.r(list)) {
            Long l14 = cVar.f191498b;
            Context context = this.f101981a;
            if (l14 != null) {
                LimitLine limitLine = new LimitLine(-l14.longValue());
                limitLine.setLineWidth(2.0f);
                limitLine.setLineColor(a7.b.getColor(context, R.color.gcm_chart_default_data_set));
                limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
                arrayList.add(limitLine);
            }
            Long l15 = cVar.f191499c;
            if (l15 != null) {
                LimitLine limitLine2 = new LimitLine(-l15.longValue());
                limitLine2.setLineWidth(2.0f);
                limitLine2.setLineColor(a7.b.getColor(context, R.color.gcm_chart_default_data_set));
                arrayList.add(limitLine2);
            }
        }
        return arrayList;
    }

    @Override // k00.h, qz.c
    public final float q(Object obj) {
        return (gl1.d.I(this.f101982b, this.f101983c) ? 0.2f : 0.5f) + super.q((c) obj);
    }

    @Override // qz.c
    public final List u(Object obj) {
        List<e> list;
        List<e> list2;
        c cVar = (c) obj;
        List<e> list3 = cVar != null ? cVar.f191497a : null;
        if (list3 == null || list3.isEmpty() || !(cVar == null || (list2 = cVar.f191497a) == null || r.r(list2))) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        b10.d dVar = this.f191503i;
        l22.a aVar = dVar.f14215a;
        l22.a aVar2 = dVar.f14215a;
        String string = aVar.getString(R.string.lbl_sleep_times);
        Context context = this.f101981a;
        arrayList.addAll(x.k(new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_sleep_chart_consistency)), null, g.a.f192745a, null, null, 106, null), new xz.f(aVar2.getString(R.string.lbl_avg_bedtime), null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_default_data_set)), null, new g.e(0.0f, 1, null), null, null, 106, null), new xz.f(aVar2.getString(R.string.lbl_avg_wake_time), null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_default_data_set)), null, new g.c(0, 0.0f, 3, null), null, null, 106, null)));
        if (this.f191501g && cVar != null && (list = cVar.f191497a) != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                km1.r rVar = ((e) it.next()).f191507d;
                if (rVar != null && rVar == km1.r.ALIGNED) {
                    arrayList.add(new xz.f(((l22.b) this.f101985e.getValue()).getString(R.string.lbl_internal_rhythm_aligned), null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_goal_met)), null, g.a.f192745a, null, null, 106, null));
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        int i14 = w.z(str, "SLEEP_ALIGNED_", false) ? R.color.gcm_chart_goal_met : R.color.gcm_sleep_chart_consistency;
        Context context = this.f101981a;
        int color = a7.b.getColor(context, i14);
        float f14 = gl1.d.I(this.f101982b, this.f101983c) ? 4.0f : 2.0f;
        LineDataSet lineDataSet = new LineDataSet(list, str);
        lineDataSet.setColor(color);
        lineDataSet.setCircleRadius(f14);
        lineDataSet.setCircleColor(color);
        lineDataSet.setDrawCircles(true);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_default_data_set));
        lineDataSet.setLineWidth(f14 * 2);
        return lineDataSet;
    }

    @Override // k00.h
    public final Map z(c cVar) throws ParseException {
        List<e> list;
        String string;
        c cVar2 = cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cVar2 != null && (list = cVar2.f191497a) != null) {
            for (e eVar : list) {
                ArrayList arrayList = new ArrayList();
                LocalDate localDate = eVar.f191504a;
                long j8 = eVar.f191506c;
                LocalDate localDatePlusDays = (this.f191500f || localDate == null) ? null : localDate.plusDays(6);
                long j14 = eVar.f191505b;
                km1.r rVar = eVar.f191507d;
                boolean z14 = this.f191501g;
                if (localDate != null) {
                    if (j14 != -1) {
                        long j15 = -j14;
                        l lVarE = E(Long.valueOf(j14), localDate, localDatePlusDays, false);
                        DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
                        dateTimeAtStartOfDay.getClass();
                        arrayList.add(new k00.c(dateTimeAtStartOfDay, j15, lVarE));
                    }
                    if (j8 != -1) {
                        l lVarE2 = E(Long.valueOf(j8), localDate, localDatePlusDays, true);
                        DateTime dateTimeAtStartOfDay2 = localDate.toDateTimeAtStartOfDay();
                        dateTimeAtStartOfDay2.getClass();
                        arrayList.add(new k00.c(dateTimeAtStartOfDay2, -j8, lVarE2));
                    }
                    if (z14 && rVar != null) {
                        long j16 = -j8;
                        String strD = this.f191502h.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                        boolean z15 = rVar == km1.r.ALIGNED;
                        Integer numValueOf = z15 ? Integer.valueOf(R.color.gcm_chart_goal_met) : null;
                        int i14 = z15 ? R.drawable.gcm_chart_metric_bullet_goal_achieved : R.drawable.gcm_chart_metric_bullet_goal_in_progress;
                        l22.b bVar = (l22.b) this.f101985e.getValue();
                        bVar.getClass();
                        int i15 = gn1.g.f78087a[rVar.ordinal()];
                        if (i15 == 1) {
                            string = bVar.getString(R.string.lbl_aligned);
                        } else if (i15 == 2) {
                            string = bVar.getString(R.string.lbl_ahead);
                        } else if (i15 == 3) {
                            string = bVar.getString(R.string.lbl_behind);
                        } else if (i15 != 4) {
                            string = i15 != 5 ? bVar.getString(R.string.no_value) : bVar.getString(R.string.lbl_irregular_rhythm);
                        } else {
                            string = bVar.getString(R.string.lbl_not_aligned);
                        }
                        l lVar = new l(strD, string, this.f101981a.getString(R.string.lbl_status), null, null, numValueOf, Integer.valueOf(i14), null, SyslogConstants.LOG_LOCAL3, null);
                        DateTime dateTimeAtStartOfDay3 = localDate.toDateTimeAtStartOfDay();
                        dateTimeAtStartOfDay3.getClass();
                        arrayList.add(new k00.c(dateTimeAtStartOfDay3, j16, lVar));
                    }
                }
                linkedHashMap.put(((z14 && rVar == km1.r.ALIGNED) ? "SLEEP_ALIGNED_" : "SLEEP_CONSISTENCY_") + localDate, arrayList);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lxm1/d$a;", "", "<init>", "()V", "", "DATASET_LABEL", "Ljava/lang/String;", "DATASET_LABEL_SLEEP_ALIGNED", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(Context context, LocalDate localDate, LocalDate localDate2, boolean z14, boolean z15, int i14, j jVar) {
        this(context, localDate, localDate2, z14, (i14 & 16) != 0 ? false : z15);
    }
}
