package t71;

import android.content.Context;
import android.graphics.Shader;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Weeks;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.x;
import p13.y;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0012BA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\b\u0003\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lt71/d;", "Lqz/c;", "", "Lt71/a;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "interval", "", "axisMinimum", "axisMaximum", "scoreColorResId", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;IFFI)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.c<List<? extends t71.a>, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f163094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f163095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f163096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f163097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f163098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f163099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f163100g;

    static {
        new a(null);
    }

    public d(Context context, LocalDate localDate, LocalDate localDate2, int i14, float f14, float f15, int i15) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f163094a = context;
        this.f163095b = localDate;
        this.f163096c = localDate2;
        this.f163097d = i14;
        this.f163098e = f14;
        this.f163099f = f15;
        this.f163100g = i15;
    }

    @Override // qz.c
    public final List<ILineDataSet> a(List<? extends t71.a> list) {
        int i14;
        Context context;
        int i15;
        int days;
        String string;
        List<? extends t71.a> list2 = list;
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
            Iterator<T> it = list2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i14 = this.f163100g;
                String strD = "";
                context = this.f163094a;
                i15 = this.f163097d;
                if (!zHasNext) {
                    break;
                }
                t71.a aVar = (t71.a) it.next();
                LocalDate localDate = aVar.f163084b;
                int i16 = aVar.f163083a;
                LocalDate localDate2 = this.f163095b;
                if (i15 == 3 || i15 == 4 || i15 == 5) {
                    days = Days.daysBetween(localDate2, localDate).getDays();
                } else if (i15 != 6) {
                    days = i15 != 10 ? Months.monthsBetween(localDate2, localDate).getMonths() : Weeks.weeksBetween(localDate2, localDate).getWeeks();
                } else {
                    days = Months.monthsBetween(localDate2, jg.b.t(localDate)).getMonths();
                }
                LocalDate localDate3 = aVar.f163084b;
                pi0.e eVar = new pi0.e(context);
                if (i15 == 3 || i15 == 4 || i15 == 5) {
                    strD = eVar.d(localDate3, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                } else if (i15 == 6) {
                    strD = eVar.d(localDate3, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_NO_DAY);
                } else if (i15 == 10) {
                    LocalDate localDatePlusDays = localDate3.plusDays(6);
                    if (localDatePlusDays.isAfter(LocalDate.now())) {
                        localDatePlusDays = LocalDate.now();
                    }
                    localDatePlusDays.getClass();
                    qi0.c cVar = qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY;
                    cVar.getClass();
                    DateTime dateTimeAtStartOfDay = localDate3.toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay.getClass();
                    DateTime dateTimeAtStartOfDay2 = localDatePlusDays.toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay2.getClass();
                    strD = eVar.g(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, cVar);
                }
                String str = strD;
                if (i15 == 3 || i15 == 5) {
                    l3.f23124b.getClass();
                    string = l3.f23131i.format(Integer.valueOf(i16));
                    string.getClass();
                } else {
                    l3.f23124b.getClass();
                    string = context.getString(R.string.string_space_string_pattern, l3.f23131i.format(Integer.valueOf(i16)), context.getString(R.string.sleep_lbl_average_prefix));
                    string.getClass();
                }
                arrayList2.add(new Entry(days, i16, new l(str, string, aVar.f163085c, null, null, Integer.valueOf(i14), null, null, 216, null)));
            }
            LineDataSet lineDataSet = new LineDataSet(h0.N0(arrayList2, new e()), "");
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircles(x.k(4, 10, 5).contains(Integer.valueOf(i15)));
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setCircleColor(a7.b.getColor(context, i14));
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
            lineDataSet.setHighlightLineWidth(1.0f);
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setColor(a7.b.getColor(context, i14));
            lineDataSet.setCircleRadius(4.0f);
            arrayList.add(lineDataSet);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(List<? extends t71.a> list) {
        int i14 = this.f163097d;
        if (i14 == 4) {
            return 7;
        }
        if (i14 == 5) {
            return 28;
        }
        if (i14 != 6) {
            return i14 != 10 ? null : 12;
        }
        return 13;
    }

    @Override // qz.c
    public final boolean d(List<? extends t71.a> list) {
        List<? extends t71.a> list2 = list;
        return list2 == null || list2.isEmpty();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends t71.a> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends t71.a> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends t71.a> list) {
        return null;
    }

    @Override // qz.c
    public final float i(List<? extends t71.a> list) {
        return this.f163099f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends t71.a> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends t71.a> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(List<? extends t71.a> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends t71.a> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends t71.a> list) {
        LocalDate localDate = this.f163095b;
        LocalDate localDate2 = this.f163096c;
        int i14 = this.f163097d;
        if (i14 == 4) {
            return Days.daysBetween(localDate, localDate2).getDays();
        }
        if (i14 != 6) {
            return i14 != 10 ? Days.daysBetween(localDate, localDate2).getDays() : Weeks.weeksBetween(localDate, localDate2).getWeeks();
        }
        return Months.monthsBetween(localDate, localDate2).getMonths() + 1;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends t71.a> list) {
        return null;
    }

    @Override // qz.c
    public final float t(List<? extends t71.a> list) {
        return this.f163098e;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(List<? extends t71.a> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends t71.a> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends t71.a> list) {
        return 0.0f;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lt71/d$a;", "", "<init>", "()V", "", "MIN_HILL_SCORE", "F", "MAX_HILL_SCORE", "MIN_DEFAULT_ENDURANCE_SCORE", "MAX_DEFAULT_ENDURANCE_SCORE", "DATAPOINT_CIRCLE_RADIUS", "", "DATAPOINT_BUFFER", "I", "CHART_LINE_WIDTH", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(Context context, LocalDate localDate, LocalDate localDate2, int i14, float f14, float f15, int i15, int i16, j jVar) {
        this(context, localDate, localDate2, i14, f14, f15, (i16 & 64) != 0 ? R.color.blue_10_static : i15);
    }
}
