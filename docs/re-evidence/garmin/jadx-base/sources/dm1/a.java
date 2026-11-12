package dm1;

import android.content.Context;
import android.graphics.Shader;
import android.text.format.DateFormat;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import g22.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p13.j0;
import p13.x;
import qz.c;
import rm1.j;
import rm1.k;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ldm1/a;", "Lqz/c;", "Lrm1/j;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<j, BarDataSet> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f60445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f60446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f60447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f60448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f60449i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jz.a f60452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f60453d;

    static {
        new C1282a(null);
        f60445e = R.color.gcm_stress_level_high;
        f60446f = R.color.gcm_stress_level_medium;
        f60447g = R.color.gcm_stress_level_low;
        f60448h = R.color.gcm_stress_level_rest;
        f60449i = R.color.gcm3_stress_active;
    }

    public a(Context context) {
        context.getClass();
        this.f60450a = context;
        this.f60451b = DateFormat.is24HourFormat(context);
        this.f60452c = new jz.a(new l22.a(context));
        this.f60453d = x.k(Integer.valueOf(a7.b.getColor(context, f60447g)), Integer.valueOf(a7.b.getColor(context, f60446f)), Integer.valueOf(a7.b.getColor(context, f60445e)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BarDataSet y(a aVar, ArrayList arrayList, Integer num, List list, int i14) {
        if ((i14 & 2) != 0) {
            num = null;
        }
        if ((i14 & 4) != 0) {
            list = null;
        }
        Context context = aVar.f60450a;
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setDrawValues(false);
        if (num != null) {
            barDataSet.setColor(a7.b.getColor(context, num.intValue()));
        }
        if (list != null) {
            barDataSet.setColors((List<Integer>) list);
        }
        barDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        barDataSet.setHighLightAlpha(255);
        return barDataSet;
    }

    @Override // qz.c
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ArrayList o(j jVar) {
        rm1.b bVar;
        if (jVar == null || (bVar = jVar.D) == null) {
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            DateTime dateTimeNow2 = DateTime.now();
            dateTimeNow2.getClass();
            bVar = new rm1.b(dateTimeNow, dateTimeNow2, null, null, 12, null);
        }
        DateTime dateTime = bVar.f153532a;
        DateTime dateTime2 = bVar.f153533b;
        DateTime dateTime3 = bVar.f153536e;
        DateTime dateTime4 = bVar.f153537f;
        int minutes = Minutes.minutesBetween(dateTime, dateTime2).getMinutes();
        int i14 = minutes + 1;
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add("");
        }
        jz.a aVar = this.f60452c;
        boolean z14 = this.f60451b;
        arrayList.set(0, aVar.b(dateTime3, z14));
        arrayList.set(minutes, aVar.b(dateTime4, z14));
        int i16 = minutes - 39;
        for (int i17 = 40; i17 < i16; i17++) {
            if (dateTime.plusMinutes(i17).getMinuteOfHour() == 0) {
                arrayList.set(i17, StringUtils.SPACE);
            }
        }
        return arrayList;
    }

    @Override // qz.c
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final float q(j jVar) {
        rm1.b bVar;
        if (jVar == null || (bVar = jVar.D) == null) {
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            DateTime dateTimeNow2 = DateTime.now();
            dateTimeNow2.getClass();
            bVar = new rm1.b(dateTimeNow, dateTimeNow2, null, null, 12, null);
        }
        return Minutes.minutesBetween(bVar.f153532a, bVar.f153533b).getMinutes();
    }

    @Override // qz.c
    public final List<BarDataSet> a(j jVar) {
        List<k> list;
        DateTime dateTimeNow;
        j jVar2 = jVar;
        if (jVar2 == null || (list = jVar2.f153595k) == null) {
            return j0.f134944a;
        }
        rm1.b bVar = jVar2.D;
        if (bVar == null || (dateTimeNow = bVar.f153532a) == null) {
            dateTimeNow = DateTime.now();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i14 = f60448h;
            int i15 = f60449i;
            if (!zHasNext) {
                return x.k(y(this, arrayList, null, this.f60453d, 2), y(this, arrayList2, Integer.valueOf(i14), null, 4), y(this, arrayList3, Integer.valueOf(i15), null, 4));
            }
            k kVar = (k) it.next();
            int i16 = kVar.f153611a;
            if (i16 != -1) {
                if (i16 == -2) {
                    dateTimeNow.getClass();
                    DateTime dateTime = new DateTime(kVar.f153612b);
                    float minutes = Minutes.minutesBetween(dateTimeNow, dateTime).getMinutes();
                    DateTime dateTimePlusMinutes = dateTime.plusMinutes(3);
                    dateTimePlusMinutes.getClass();
                    arrayList3.add(new BarEntry(minutes, -8.0f, new l(this.f60452c.c(dateTime, dateTimePlusMinutes, this.f60451b), null, null, null, this.f60450a.getString(R.string.allday_stress_active), Integer.valueOf(i15), null, null, 202, null)));
                } else if (i16 >= 0 && i16 < 26) {
                    dateTimeNow.getClass();
                    arrayList2.add(z(dateTimeNow, kVar, R.string.stress_level_rest, i14));
                } else if (25 <= i16 && i16 < 51) {
                    dateTimeNow.getClass();
                    arrayList.add(z(dateTimeNow, kVar, R.string.stress_level_low, f60447g));
                } else if (50 <= i16 && i16 < 76) {
                    dateTimeNow.getClass();
                    arrayList.add(z(dateTimeNow, kVar, R.string.stress_level_medium, f60446f));
                } else if (75 <= i16 && i16 < 101) {
                    dateTimeNow.getClass();
                    arrayList.add(z(dateTimeNow, kVar, R.string.stress_level_high, f60445e));
                }
            }
        }
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(j jVar) {
        ArrayList arrayListO = o(jVar);
        int i14 = 0;
        if (!arrayListO.isEmpty()) {
            Iterator it = arrayListO.iterator();
            while (it.hasNext()) {
                if (n.d((String) it.next()) && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return Integer.valueOf(i14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(j jVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(j jVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List f(j jVar) {
        return x.k(x(0), x(25), x(50), x(75), x(100));
    }

    @Override // qz.c
    public final List g(j jVar) {
        return oc.b.q(0, (int) q(jVar), this.f60450a);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(j jVar) {
        return 100.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(j jVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(j jVar) {
        return -8.0f;
    }

    @Override // qz.c
    public final List u(j jVar) {
        return hr1.a.a(this.f60450a, true, true, true, true);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(j jVar) {
        return 0.0f;
    }

    public final LimitLine x(int i14) {
        LimitLine limitLine = new LimitLine(i14, String.valueOf(i14));
        limitLine.setLineWidth(1.0f);
        rz.a.f155189g.getClass();
        int i15 = rz.a.f155190h;
        Context context = this.f60450a;
        limitLine.setLineColor(a7.b.getColor(context, i15));
        limitLine.setTextColor(a7.b.getColor(context, rz.a.f155191i));
        limitLine.setTextSize(10.0f);
        limitLine.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
        return limitLine;
    }

    public final BarEntry z(DateTime dateTime, k kVar, int i14, int i15) {
        DateTime dateTime2 = new DateTime(kVar.f153612b, dateTime.getZone());
        float fMax = Math.max(Minutes.minutesBetween(dateTime, dateTime2).getMinutes(), 0);
        DateTime dateTimePlusMinutes = dateTime2.plusMinutes(3);
        dateTimePlusMinutes.getClass();
        String strC = this.f60452c.c(dateTime2, dateTimePlusMinutes, this.f60451b);
        String strValueOf = String.valueOf(kVar.f153611a);
        return new BarEntry(fMax, Float.parseFloat(strValueOf), new l(strC, strValueOf, this.f60450a.getString(i14), null, null, Integer.valueOf(i15), null, null, 208, null));
    }

    /* JADX INFO: renamed from: dm1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Ldm1/a$a;", "", "<init>", "()V", "", "STRESS_DATA_INTERVAL", "I", "HIGH_STRESS_COLOR", "MEDIUM_STRESS_COLOR", "LOW_STRESS_COLOR", "REST_COLOR", "ACTIVE_COLOR", "MIN_STRESS_LIMIT_LINE", "LOW_STRESS_LIMIT_LINE", "MEDIUM_STRESS_LIMIT_LINE", "HIGH_STRESS_LIMIT_LINE", "MAX_STRESS_LIMIT_LINE", "INVALID_STRESS_LEVEL", "TOO_ACTIVE_STRESS_LEVEL", "", "TOO_ACTIVE_STRESS_LEVEL_CHART_VALUE", "F", "MIN_Y_VALUE", "MAX_Y_VALUE", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1282a {
        public /* synthetic */ C1282a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1282a() {
        }
    }
}
