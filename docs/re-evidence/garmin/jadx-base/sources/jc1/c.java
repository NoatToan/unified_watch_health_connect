package jc1;

import android.content.Context;
import android.graphics.Shader;
import android.text.format.DateUtils;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import j02.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.w;
import xz.f;
import xz.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002 \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u000fB'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ljc1/c;", "Lqz/c;", "", "Lo13/p;", "Lorg/joda/time/DateTime;", "", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "startDate", "endDate", "", "showDailyAverages", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)V", "a", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<List<? extends p<? extends DateTime, ? extends Float>>, BarDataSet> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f98167e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f98169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f98170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f98171d;

    static {
        new a(null);
    }

    public c(Context context, DateTime dateTime, DateTime dateTime2, boolean z14) {
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f98168a = context;
        this.f98169b = dateTime;
        this.f98170c = dateTime2;
        this.f98171d = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final List<BarDataSet> a(List<? extends p<? extends DateTime, ? extends Float>> list) {
        List<? extends p<? extends DateTime, ? extends Float>> list2 = list;
        if (list2 == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends p<? extends DateTime, ? extends Float>> it = list2.iterator();
        while (true) {
            char c14 = 0;
            if (!it.hasNext()) {
                BarDataSet barDataSet = new BarDataSet(arrayList, null);
                barDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
                barDataSet.setHighlightEnabled(false);
                barDataSet.setDrawValues(false);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(0);
                arrayList2.addAll(jg.b.y(bc1.a.f17414a, this.f98168a));
                barDataSet.setColors(arrayList2);
                return w.c(barDataSet);
            }
            p<? extends DateTime, ? extends Float> next = it.next();
            float fFloatValue = ((Number) next.f128595b).floatValue();
            float[] fArr = new float[5];
            fArr[0] = fFloatValue;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            if (0.0f <= fFloatValue && fFloatValue <= 69.0f) {
                c14 = 1;
            } else if (70.0f <= fFloatValue && fFloatValue <= 79.0f) {
                c14 = 2;
            } else if (80.0f <= fFloatValue && fFloatValue <= 89.0f) {
                c14 = 3;
            } else if (90.0f <= fFloatValue && fFloatValue <= 100.0f) {
                c14 = 4;
            }
            fArr[c14] = 100.0f - fFloatValue;
            arrayList.add(new BarEntry(x(this.f98169b, (DateTime) next.f128594a), fArr));
        }
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return Integer.valueOf(x(this.f98169b, this.f98170c));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return 100.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return 5;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final List o(List<? extends p<? extends DateTime, ? extends Float>> list) {
        ArrayList arrayList = new ArrayList();
        DateTime dateTime = this.f98169b;
        MutableDateTime mutableDateTime = dateTime.toMutableDateTime();
        boolean z14 = this.f98171d;
        Context context = this.f98168a;
        DateTime dateTime2 = this.f98170c;
        if (z14) {
            while (mutableDateTime.compareTo((ReadableInstant) dateTime2) < 0) {
                int days = Days.daysBetween(dateTime, mutableDateTime).getDays();
                String dateTime3 = (days + 1) % 7 == 4 ? DateUtils.formatDateTime(context, mutableDateTime.toDateTime().minusDays(3).getMillis(), 131080) : "";
                dateTime3.getClass();
                arrayList.add(days, dateTime3);
                mutableDateTime.addDays(1);
            }
        } else {
            while (mutableDateTime.compareTo((ReadableInstant) dateTime2) < 0) {
                int hours = Hours.hoursBetween(dateTime, mutableDateTime).getHours();
                String dateTime4 = (hours + 1) % 24 == 12 ? DateUtils.formatDateTime(context, mutableDateTime.getMillis(), 32770) : "";
                dateTime4.getClass();
                arrayList.add(hours, dateTime4);
                mutableDateTime.addHours(1);
            }
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return x(this.f98169b, this.f98170c) - 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return 60.0f;
    }

    @Override // qz.c
    public final List u(List<? extends p<? extends DateTime, ? extends Float>> list) {
        bc1.a aVar = bc1.a.f17414a;
        Context context = this.f98168a;
        ArrayList arrayListY = jg.b.y(aVar, context);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(context.getString(R.string.less_than_string_pattern, context.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(hc1.a.HARMFUL) + 1))));
        hc1.a aVar2 = hc1.a.LOW;
        arrayList.add(context.getString(R.string.string_line_string_pattern, String.valueOf(ge1.b.J(aVar2)), context.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(aVar2)))));
        hc1.a aVar3 = hc1.a.MODERATE;
        arrayList.add(context.getString(R.string.string_line_string_pattern, String.valueOf(ge1.b.J(aVar3)), context.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(aVar3)))));
        hc1.a aVar4 = hc1.a.NORMAL;
        arrayList.add(context.getString(R.string.string_line_string_pattern, String.valueOf(ge1.b.J(aVar4)), context.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(aVar4)))));
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            String str = (String) arrayList.get(i14);
            g.a aVar5 = g.a.f192745a;
            int iIntValue = ((Number) arrayListY.get(i14)).intValue();
            arrayList2.add(new f(str, null, Integer.valueOf(iIntValue), null, aVar5, null, oi0.c.A(context, new r(20), (String) arrayList.get(i14)), 42, null));
        }
        return arrayList2;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends p<? extends DateTime, ? extends Float>> list) {
        return 0.0f;
    }

    public final int x(DateTime dateTime, DateTime dateTime2) {
        return this.f98171d ? Days.daysBetween(dateTime, dateTime2).getDays() : Hours.hoursBetween(dateTime, dateTime2).getHours();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Ljc1/c$a;", "", "<init>", "()V", "", "X_AXIS_OFFSET", "F", "", "Y_AXIS_LABEL_COUNT", "I", "LEGEND_COUNT", "MIN_VALUE", "MAX_VALUE", "DAYS_COUNT_MIDDLE", "HOURS_COUNT_MIDDLE", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
