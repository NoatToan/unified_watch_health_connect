package gt;

import android.content.Context;
import android.graphics.Shader;
import android.text.format.DateFormat;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.j0;
import p13.w;
import p13.x;
import zx0.m;
import zz.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lgt/c;", "Lqz/c;", "Lgt/a;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isOverlay", "showStress", "showRest", "showActive", "<init>", "(Landroid/content/Context;ZZZZ)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<gt.a, BarDataSet> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f78898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f78899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f78900j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f78904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f78905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jz.a f78906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f78907g;

    static {
        new a(null);
        f78898h = R.color.gcm_chart_body_battery_stress;
        f78899i = R.color.gcm_chart_body_battery_rest;
        f78900j = R.color.gcm_chart_body_battery_active;
    }

    public c(Context context, boolean z14, boolean z15, boolean z16, boolean z17) {
        context.getClass();
        this.f78901a = context;
        this.f78902b = z14;
        this.f78903c = z15;
        this.f78904d = z16;
        this.f78905e = z17;
        this.f78906f = new jz.a(new l22.a(context));
        this.f78907g = DateFormat.is24HourFormat(context);
    }

    public static BarDataSet A(c cVar, ArrayList arrayList, Integer num) {
        Context context = cVar.f78901a;
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setDrawValues(false);
        barDataSet.setColor(a7.b.getColor(context, num.intValue()));
        barDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        barDataSet.setHighLightAlpha(255);
        return barDataSet;
    }

    public final BarEntry B(DateTime dateTime, gs1.e.C1588e c1588e, int i14, int i15) {
        int i16 = i14;
        DateTime dateTime2 = c1588e.f78746a;
        if (dateTime2 == null) {
            dateTime2 = dateTime;
        }
        DateTime dateTimePlusMinutes = dateTime2.plusMinutes(3);
        dateTimePlusMinutes.getClass();
        String strC = this.f78906f.c(dateTime2, dateTimePlusMinutes, this.f78907g);
        Integer num = c1588e.f78747b;
        String strValueOf = String.valueOf(num != null ? num.intValue() : 0);
        Context context = this.f78901a;
        boolean z14 = this.f78902b;
        String string = z14 ? context.getString(i16) : null;
        if (z14) {
            i16 = R.string.title_stress;
        }
        l lVar = new l(strC, strValueOf, context.getString(i16), string, null, Integer.valueOf(i15), null, null, 208, null);
        j00.g.f95975a.getClass();
        return new BarEntry(j00.g.a(1, dateTime, dateTime2) + 1.5f, Float.parseFloat(strValueOf), lVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(gt.a aVar) {
        return Integer.valueOf(MathKt.c(1440.0f));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(gt.a aVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(gt.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(gt.a aVar) {
        return y();
    }

    @Override // qz.c
    public final List g(gt.a aVar) {
        gt.a aVar2 = aVar;
        return m.g(this.f78901a, aVar2 != null ? aVar2.f78895a : null, new zw.b(3));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(gt.a aVar) {
        return 100.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(gt.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(gt.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(gt.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(gt.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(gt.a aVar) {
        return 1440.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(gt.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(gt.a aVar) {
        return -8.0f;
    }

    @Override // qz.c
    public final List u(gt.a aVar) {
        return hr1.a.a(this.f78901a, true, this.f78903c, this.f78904d, this.f78905e);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(gt.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(gt.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final List<BarDataSet> a(gt.a aVar) {
        List<gs1.e.C1588e> list;
        int i14;
        int i15;
        int i16;
        if (aVar == null || (list = aVar.f78897c) == null) {
            return j0.f134944a;
        }
        DateTime dateTimeWithTimeAtStartOfDay = aVar.f78896b;
        if (dateTimeWithTimeAtStartOfDay == null) {
            dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i14 = f78899i;
            i15 = f78900j;
            i16 = f78898h;
            if (!zHasNext) {
                break;
            }
            gs1.e.C1588e c1588e = (gs1.e.C1588e) it.next();
            Integer num = c1588e.f78747b;
            int iIntValue = num != null ? num.intValue() : -1;
            if (iIntValue != -1) {
                if (iIntValue == -2) {
                    dateTimeWithTimeAtStartOfDay.getClass();
                    DateTime dateTime = c1588e.f78746a;
                    if (dateTime == null) {
                        dateTime = dateTimeWithTimeAtStartOfDay;
                    }
                    DateTime dateTimePlusMinutes = dateTime.plusMinutes(3);
                    dateTimePlusMinutes.getClass();
                    String strC = this.f78906f.c(dateTime, dateTimePlusMinutes, this.f78907g);
                    Context context = this.f78901a;
                    l lVar = new l(strC, null, this.f78902b ? context.getString(R.string.title_stress) : null, null, context.getString(R.string.allday_stress_active), Integer.valueOf(i15), null, null, 202, null);
                    j00.g.f95975a.getClass();
                    arrayList3.add(new BarEntry(j00.g.a(1, dateTimeWithTimeAtStartOfDay, dateTime) + 1.5f, -8.0f, lVar));
                } else if (iIntValue >= 0 && iIntValue < 26) {
                    dateTimeWithTimeAtStartOfDay.getClass();
                    arrayList2.add(B(dateTimeWithTimeAtStartOfDay, c1588e, R.string.stress_level_rest, i14));
                } else if (25 <= iIntValue && iIntValue < 51) {
                    dateTimeWithTimeAtStartOfDay.getClass();
                    arrayList.add(B(dateTimeWithTimeAtStartOfDay, c1588e, R.string.stress_level_low, i16));
                } else if (50 <= iIntValue && iIntValue < 76) {
                    dateTimeWithTimeAtStartOfDay.getClass();
                    arrayList.add(B(dateTimeWithTimeAtStartOfDay, c1588e, R.string.stress_level_medium, i16));
                } else if (75 <= iIntValue && iIntValue < 101) {
                    dateTimeWithTimeAtStartOfDay.getClass();
                    arrayList.add(B(dateTimeWithTimeAtStartOfDay, c1588e, R.string.stress_level_high, i16));
                }
            }
        }
        boolean z14 = this.f78904d;
        boolean z15 = this.f78903c;
        if (z15 && z14) {
            return x.k(A(this, arrayList, Integer.valueOf(i16)), A(this, arrayList2, Integer.valueOf(i14)), A(this, arrayList3, Integer.valueOf(i15)));
        }
        if (!z15 || z14) {
            return (z15 || !z14) ? w.c(A(this, arrayList3, Integer.valueOf(i15))) : w.c(A(this, arrayList2, Integer.valueOf(i14)));
        }
        return x.k(A(this, arrayList, Integer.valueOf(i16)), A(this, arrayList3, Integer.valueOf(i15)));
    }

    public final List y() {
        return x.k(z(0), z(25), z(50), z(75), z(100));
    }

    public final LimitLine z(int i14) {
        LimitLine limitLine = new LimitLine(i14, String.valueOf(i14));
        limitLine.setLineWidth(1.0f);
        rz.a.f155189g.getClass();
        int i15 = rz.a.f155190h;
        Context context = this.f78901a;
        limitLine.setLineColor(a7.b.getColor(context, i15));
        limitLine.setTextColor(a7.b.getColor(context, rz.a.f155191i));
        limitLine.setTextSize(10.0f);
        limitLine.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
        return limitLine;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lgt/c$a;", "", "<init>", "()V", "", "STRESS_DATA_INTERVAL", "I", "", "STRESS_DATA_INTERVAL_MIDDLE_OFFSET", "F", "STRESS_COLOR", "REST_COLOR", "ACTIVE_COLOR", "MIN_STRESS_LIMIT_LINE", "LOW_STRESS_LIMIT_LINE", "MEDIUM_STRESS_LIMIT_LINE", "HIGH_STRESS_LIMIT_LINE", "MAX_STRESS_LIMIT_LINE", "INVALID_STRESS_LEVEL", "TOO_ACTIVE_STRESS_LEVEL", "TOO_ACTIVE_STRESS_LEVEL_CHART_VALUE", "MIN_Y_VALUE", "MAX_Y_VALUE", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(Context context, boolean z14, boolean z15, boolean z16, boolean z17, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? true : z15, (i14 & 8) != 0 ? true : z16, (i14 & 16) != 0 ? true : z17);
    }
}
