package wm1;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.w;
import pi0.e;
import w52.u0;
import xz.f;
import xz.g;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lwm1/b;", "Lqz/c;", "Lwm1/d;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.c<d, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f186056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f186057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f186058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f186059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f186060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f186061f;

    static {
        new a(null);
    }

    public b(Context context, LocalDate localDate, LocalDate localDate2) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f186056a = context;
        this.f186057b = localDate;
        this.f186058c = localDate2;
        this.f186059d = new e(context);
        this.f186060e = a7.b.getColor(context, R.color.gcm_chart_goal_in_progress);
        this.f186061f = a7.b.getColor(context, R.color.gcm_chart_highlight_line);
    }

    @Override // qz.c
    public final List<BarDataSet> a(d dVar) {
        List list;
        l lVar;
        d dVar2 = dVar;
        int i14 = this.f186060e;
        if (dVar2 == null) {
            list = j0.f134944a;
        } else {
            ArrayList arrayList = new ArrayList();
            List<wm1.a> list2 = dVar2.f186065a;
            if (list2 != null) {
                for (wm1.a aVar : list2) {
                    Integer num = aVar.f186055b;
                    LocalDate localDate = aVar.f186054a;
                    int iIntValue = num != null ? num.intValue() : 0;
                    float days = localDate != null ? Days.daysBetween(this.f186057b, localDate).getDays() : 0;
                    float f14 = iIntValue;
                    int[] iArr = {i14, i14};
                    if (localDate != null) {
                        String strD = this.f186059d.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                        String strValueOf = String.valueOf(iIntValue);
                        Context context = this.f186056a;
                        lVar = new l(strD, strValueOf, context.getString(R.string.title_intensity_minutes_abbr), context.getString(R.string.common_min_abbreviated_without_period), null, Integer.valueOf(R.color.gcm_chart_goal_in_progress), Integer.valueOf(R.drawable.gcm_chart_metric_bullet), null, SyslogConstants.LOG_LOCAL2, null);
                    } else {
                        lVar = null;
                    }
                    arrayList.add(new xz.e(days, f14, (Object) lVar, iArr, f14, false, false, 96, (j) null));
                }
            }
            list = arrayList;
        }
        BarDataSet barDataSet = new BarDataSet(list, "SLEEP_INTENSITY_MINUTES_DATASET_LABEL");
        barDataSet.setHighlightEnabled(true);
        barDataSet.setHighLightColor(this.f186061f);
        barDataSet.setGradientColors(w.c(new GradientColor(i14, i14)));
        return w.c(barDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(d dVar) {
        return Integer.valueOf(Days.daysBetween(this.f186057b, this.f186058c).getDays() + 1);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(d dVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(d dVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final List f(d dVar) {
        List<wm1.a> list;
        Integer num;
        d dVar2 = dVar;
        ArrayList arrayList = new ArrayList();
        if (dVar2 != null && (list = dVar2.f186065a) != null && u0.o(list) && (num = dVar2.f186066b) != null) {
            LimitLine limitLine = new LimitLine(num.intValue());
            limitLine.setLineWidth(2.0f);
            limitLine.setLineColor(a7.b.getColor(this.f186056a, R.color.gds_data_viz_neutral_primary));
            limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
            arrayList.add(limitLine);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(d dVar) {
        return null;
    }

    @Override // qz.c
    public final float i(d dVar) {
        List<wm1.a> list;
        Object obj;
        Integer num;
        d dVar2 = dVar;
        int iIntValue = 0;
        if (dVar2 != null) {
            List<wm1.a> list2 = dVar2.f186065a;
            if (!(list2 != null ? u0.o(list2) : false)) {
                return 200.0f;
            }
        }
        if (dVar2 != null && (list = dVar2.f186065a) != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Integer num2 = ((wm1.a) next).f186055b;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    do {
                        Object next2 = it.next();
                        Integer num3 = ((wm1.a) next2).f186055b;
                        int iIntValue3 = num3 != null ? num3.intValue() : 0;
                        if (iIntValue2 < iIntValue3) {
                            next = next2;
                            iIntValue2 = iIntValue3;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            wm1.a aVar = (wm1.a) obj;
            if (aVar != null && (num = aVar.f186055b) != null) {
                iIntValue = num.intValue();
            }
        }
        float f14 = iIntValue;
        float f15 = 30;
        float f16 = f14 % f15;
        return f16 == 0.0f ? f14 : (f15 - f16) + f14;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(d dVar) {
        return 4;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(d dVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(d dVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(d dVar) {
        return null;
    }

    @Override // qz.c
    public final float q(d dVar) {
        return Days.daysBetween(this.f186057b, this.f186058c).getDays() + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(d dVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(d dVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(d dVar) {
        d dVar2 = dVar;
        ArrayList arrayList = new ArrayList();
        if (dVar2 != null) {
            List<wm1.a> list = dVar2.f186065a;
            if (list != null ? u0.o(list) : false) {
                Context context = this.f186056a;
                String string = context.getString(R.string.title_intensity_minutes_abbr);
                string.getClass();
                arrayList.add(new f(string, null, Integer.valueOf(this.f186060e), null, g.a.f192745a, null, null, 106, null));
                String string2 = context.getString(R.string.common_lbl_avg_daily_total);
                string2.getClass();
                arrayList.add(new f(string2, null, Integer.valueOf(a7.b.getColor(context, R.color.gds_data_viz_neutral_primary)), null, new g.c(3, 0.0f, 2, null), null, null, 106, null));
            }
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(d dVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(d dVar) {
        return 0.0f;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lwm1/b$a;", "", "<init>", "()V", "", "SLEEP_INTENSITY_MINUTES_DATASET_LABEL", "Ljava/lang/String;", "", "DEFAULT_Y_AXIS_MAX_VALUE", "F", "DEFAULT_X_AXIS_OFFSET", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
