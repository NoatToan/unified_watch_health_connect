package uq1;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import gl1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.w;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Luq1/f;", "Lqz/c;", "Lwq1/b;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpq1/d;", "stepsDataFormatter", "Lpi0/e;", "gcmDateFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lpq1/d;Lpi0/e;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.c<wq1.b, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f172298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi0.e f172299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f172300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDate f172301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f172302e;

    static {
        new a(null);
    }

    public f(Context context, pq1.d dVar, pi0.e eVar, LocalDate localDate, LocalDate localDate2) {
        context.getClass();
        dVar.getClass();
        eVar.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f172298a = context;
        this.f172299b = eVar;
        this.f172300c = localDate;
        this.f172301d = localDate2;
        this.f172302e = new l22.a(context).getString(R.string.lbl_steps);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [p13.j0] */
    @Override // qz.c
    public final List<BarDataSet> a(wq1.b bVar) {
        ?? arrayList;
        Object next;
        Integer num;
        wq1.b bVar2 = bVar;
        Context context = this.f172298a;
        if (bVar2 == null) {
            arrayList = j0.f134944a;
        } else {
            List<wq1.a> list = bVar2.f186627c;
            int[] iArr = {context.getColor(R.color.gcm_chart_indicator), context.getColor(R.color.gcm_chart_indicator)};
            ArrayList arrayList2 = new ArrayList(52);
            for (int i14 = 0; i14 < 52; i14++) {
                arrayList2.add(new xz.e(i14, 0.0f, (Object) null, iArr, 0.0f, false, false, 116, (j) null));
            }
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    num = ((wq1.a) next).f186623b;
                } while (!((num != null ? num.intValue() : 0) > 0));
                if (((wq1.a) next) != null) {
                    for (wq1.a aVar : list) {
                        LocalDate localDate = aVar.f186622a;
                        LocalDate localDatePlusDays = localDate != null ? localDate.plusDays(6) : null;
                        int days = localDate != null ? Days.daysBetween(bVar2.f186625a, localDate).getDays() / 7 : 0;
                        Integer num2 = aVar.f186623b;
                        float fIntValue = num2 != null ? num2.intValue() : -1.0f;
                        arrayList2.set(days, new xz.e(days, fIntValue, (Object) ((fIntValue < 0.0f || localDate == null || localDatePlusDays == null) ? null : new l(this.f172299b.m(localDate, localDatePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY), pq1.d.b((int) fIntValue), this.f172302e, null, null, null, Integer.valueOf(R.drawable.gcm_chart_metric_bullet_no_goal), null, SyslogConstants.LOG_LOCAL7, null)), iArr, fIntValue, false, false, 96, (j) null));
                    }
                    arrayList = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((BarEntry) obj).getData() != null) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = j0.f134944a;
                }
            } else {
                arrayList = j0.f134944a;
            }
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setHighlightEnabled(true);
        barDataSet.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
        return w.c(barDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(wq1.b bVar) {
        return Integer.valueOf(pz.d.e(this.f172300c, this.f172301d, 5).size());
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(wq1.b bVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(wq1.b bVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(wq1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(wq1.b bVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    @Override // qz.c
    public final float i(wq1.b bVar) {
        int iIntValue;
        List<wq1.a> list;
        Integer num;
        List<wq1.a> list2;
        Object next;
        Integer num2;
        wq1.b bVar2 = bVar;
        Object next2 = null;
        int iIntValue2 = 0;
        if (bVar2 == null || (list2 = bVar2.f186627c) == null) {
            iIntValue = 0;
        } else {
            Iterator<T> it = list2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Integer num3 = ((wq1.a) next).f186623b;
                    int iIntValue3 = num3 != null ? num3.intValue() : 0;
                    do {
                        Object next3 = it.next();
                        Integer num4 = ((wq1.a) next3).f186623b;
                        int iIntValue4 = num4 != null ? num4.intValue() : 0;
                        if (iIntValue3 < iIntValue4) {
                            next = next3;
                            iIntValue3 = iIntValue4;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            wq1.a aVar = (wq1.a) next;
            if (aVar == null || (num2 = aVar.f186623b) == null) {
                iIntValue = 0;
            } else {
                iIntValue = num2.intValue();
            }
        }
        if (bVar2 != null && (list = bVar2.f186627c) != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    Integer num5 = ((wq1.a) next2).f186624c;
                    int iIntValue5 = num5 != null ? num5.intValue() : 0;
                    do {
                        Object next4 = it3.next();
                        Integer num6 = ((wq1.a) next4).f186624c;
                        int iIntValue6 = num6 != null ? num6.intValue() : 0;
                        if (iIntValue5 < iIntValue6) {
                            next2 = next4;
                            iIntValue5 = iIntValue6;
                        }
                    } while (it3.hasNext());
                }
            }
            wq1.a aVar2 = (wq1.a) next2;
            if (aVar2 != null && (num = aVar2.f186624c) != null) {
                iIntValue2 = num.intValue();
            }
        }
        float fT = y.t(iIntValue, iIntValue2);
        if (fT > 0.0f) {
            return fT;
        }
        return 56000.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(wq1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(wq1.b bVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(wq1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(wq1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float q(wq1.b bVar) {
        return (Days.daysBetween(this.f172300c, this.f172301d).getDays() / 7) + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(wq1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(wq1.b bVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(wq1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(wq1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(wq1.b bVar) {
        return 0.0f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Luq1/f$a;", "", "<init>", "()V", "", "DEFAULT_Y_MAX_WEEKLY_VALUE", "F", "DEFAULT_X_AXIS_OFFSET", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
