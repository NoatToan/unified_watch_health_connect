package zm1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.j0;
import p13.t0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lzm1/n;", "Lk00/h;", "Lzm1/s;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "trainingReadinessFactor", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZZ)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends k00.h<s> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f205324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mn1.d f205325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pi0.e f205326h;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, LocalDate localDate, LocalDate localDate2, boolean z14, boolean z15) {
        super(context, localDate, localDate2, z14);
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f205324f = z15;
        this.f205325g = new mn1.d(new l22.a(context));
        this.f205326h = new pi0.e(context);
    }

    @Override // k00.h
    public final /* bridge */ /* synthetic */ float C(s sVar) {
        return 100.0f;
    }

    @Override // k00.h
    public final /* bridge */ /* synthetic */ float D(s sVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(Object obj) {
        List<q> list;
        s sVar = (s) obj;
        if (sVar != null && (list = sVar.f205335a) != null && !list.isEmpty()) {
            for (q qVar : list) {
                qVar.getClass();
                if (qVar.f205329a != null) {
                    Integer num = qVar.f205330b;
                    if (num == null || num.intValue() <= 0) {
                        num = null;
                    }
                    if (num != null) {
                        Context context = this.f101981a;
                        String string = context.getString(R.string.lbl_score);
                        string.getClass();
                        return p13.w.c(new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_sleep_chart_score_value)), null, this.f101984d ? xz.g.a.f192745a : new xz.g.e(0.0f, 1, null), null, null, 106, null));
                    }
                }
            }
        }
        return j0.f134944a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        int i14;
        list.getClass();
        str.getClass();
        boolean z14 = this.f205324f;
        boolean z15 = this.f101984d;
        Context context = this.f101981a;
        if (z14) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (entry.getX() == 5.0f || entry.getX() == 4.0f) {
                    q6.f.t(context, R.color.gcm_sleep_chart_score_value, arrayList);
                } else {
                    q6.f.t(context, R.color.gray_45_static, arrayList);
                }
            }
            LineDataSet lineDataSetQ = gl1.d.q(list, str, z15, Integer.valueOf(a7.b.getColor(context, R.color.gray_45_static)));
            lineDataSetQ.setCircleColors(arrayList);
            return lineDataSetQ;
        }
        int color = a7.b.getColor(context, R.color.gcm_sleep_chart_score_value);
        if (z15) {
            return gl1.d.r(list, str, true, Integer.valueOf(color));
        }
        int color2 = a7.b.getColor(context, R.color.transparent);
        ArrayList arrayList2 = new ArrayList(y.r(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            if (list.isEmpty()) {
                i14 = color2;
            } else {
                Entry entry2 = (Entry) list.get(i15);
                boolean z16 = i15 > 0 && entry2.getX() - ((Entry) list.get(i15 + (-1))).getX() <= 1.0f;
                boolean z17 = i15 < list.size() - 1 && ((Entry) list.get(i16)).getX() - entry2.getX() <= 1.0f;
                if (z16 || z17) {
                    i14 = color2;
                } else {
                    i14 = color;
                }
            }
            arrayList2.add(Integer.valueOf(i14));
            i15 = i16;
        }
        LineDataSet lineDataSetQ2 = gl1.d.q(list, str, true, Integer.valueOf(color));
        lineDataSetQ2.setCircleColors(arrayList2);
        return lineDataSetQ2;
    }

    @Override // k00.h
    public final Map z(s sVar) {
        ArrayList arrayList;
        List<q> list;
        DateTime dateTimeNow;
        String strL;
        zz.l lVar;
        s sVar2 = sVar;
        if (sVar2 == null || (list = sVar2.f205335a) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                q qVar = (q) obj;
                if (qVar.f205329a != null && qVar.f205330b != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(y.r(arrayList2, 10));
            int i14 = 0;
            for (Object obj2 : arrayList2) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                q qVar2 = (q) obj2;
                LocalDate localDate = qVar2.f205329a;
                if (localDate == null || (dateTimeNow = localDate.toDateTimeAtStartOfDay()) == null) {
                    dateTimeNow = DateTime.now();
                }
                boolean z14 = this.f101984d;
                DateTime dateTimePlusDays = (z14 || dateTimeNow == null) ? null : dateTimeNow.plusDays(6);
                Integer num = qVar2.f205330b;
                int iIntValue = num != null ? num.intValue() : 0;
                pi0.e eVar = this.f205326h;
                if (z14) {
                    dateTimeNow.getClass();
                    strL = eVar.a(dateTimeNow, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                } else if (dateTimePlusDays != null) {
                    dateTimeNow.getClass();
                    strL = eVar.l(dateTimeNow, dateTimePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                } else {
                    strL = "";
                }
                String str = strL;
                mn1.d dVar = this.f205325g;
                String string = z14 ? dVar.f119771a.getString(R.string.lbl_score) : dVar.f119771a.getString(R.string.lbl_average_stress_level_score);
                if (this.f205324f) {
                    this.f101982b.toDateTimeAtStartOfDay().getClass();
                    dateTimeNow.getClass();
                    DateTime dateTimeAtStartOfDay = this.f101983c.toDateTimeAtStartOfDay();
                    dVar.getClass();
                    String strValueOf = String.valueOf(iIntValue);
                    if (strValueOf == null) {
                        strValueOf = dVar.e();
                    }
                    int days = Days.daysBetween(dateTimeNow, dateTimeAtStartOfDay).getDays();
                    lVar = new zz.l(str, strValueOf, string, null, null, Integer.valueOf((days == 1 || days == 2) ? R.color.gcm_sleep_chart_score_value : R.color.gray_45_static), null, null, 216, null);
                } else {
                    dVar.getClass();
                    String strValueOf2 = String.valueOf(iIntValue);
                    if (strValueOf2 == null) {
                        strValueOf2 = dVar.e();
                    }
                    lVar = new zz.l(str, strValueOf2, string, null, null, Integer.valueOf(R.color.gcm_sleep_chart_score_value), null, null, 216, null);
                }
                dateTimeNow.getClass();
                arrayList.add(new k00.c(dateTimeNow, iIntValue, lVar));
                i14 = i15;
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return t0.b(new o13.p("SLEEP_SCORE", arrayList));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lzm1/n$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "SLEEP_SCORE_CHART_MIN_VALUE", "F", "SLEEP_SCORE_CHART_MAX_VALUE", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
