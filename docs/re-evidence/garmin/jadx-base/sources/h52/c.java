package h52;

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
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.w;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lh52/c;", "Lqz/c;", "Lh52/e;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ld52/e;", "pushesDataFormatter", "Lpi0/e;", "gcmDateFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Ld52/e;Lpi0/e;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<e, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi0.e f82113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f82114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDate f82115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f82116e;

    static {
        new a(null);
    }

    public c(Context context, d52.e eVar, pi0.e eVar2, LocalDate localDate, LocalDate localDate2) {
        context.getClass();
        eVar.getClass();
        eVar2.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f82112a = context;
        this.f82113b = eVar2;
        this.f82114c = localDate;
        this.f82115d = localDate2;
        this.f82116e = new l22.a(context).getString(R.string.lbl_pushes);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [p13.j0] */
    @Override // qz.c
    public final List<BarDataSet> a(e eVar) {
        ?? arrayList;
        Object next;
        l lVar;
        Integer num;
        e eVar2 = eVar;
        Context context = this.f82112a;
        if (eVar2 == null) {
            arrayList = j0.f134944a;
        } else {
            List<f52.a> list = eVar2.f82123c;
            int[] iArr = {context.getColor(R.color.gcm_chart_indicator), context.getColor(R.color.gcm_chart_indicator)};
            ArrayList arrayList2 = new ArrayList(12);
            for (int i14 = 0; i14 < 12; i14++) {
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
                    num = ((f52.a) next).f69171b;
                } while (!((num != null ? num.intValue() : 0) > 0));
                if (((f52.a) next) != null) {
                    for (f52.a aVar : list) {
                        LocalDate localDate = aVar.f69170a;
                        if (localDate == null || !localDate.isAfter(eVar2.f82122b)) {
                            int iAbs = localDate != null ? Math.abs(Months.monthsBetween(eVar2.f82121a, localDate).getMonths()) : 0;
                            Integer num2 = aVar.f69171b;
                            float fIntValue = num2 != null ? num2.intValue() : -1.0f;
                            if (fIntValue >= 0.0f && localDate != null) {
                                DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
                                dateTimeAtStartOfDay.getClass();
                                lVar = new l(this.f82113b.a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_NO_DAY), d52.e.b((int) fIntValue), this.f82116e, null, null, null, Integer.valueOf(R.drawable.gcm_chart_metric_bullet_no_goal), null, SyslogConstants.LOG_LOCAL7, null);
                            } else {
                                lVar = null;
                            }
                            arrayList2.set(iAbs, new xz.e(iAbs, fIntValue, (Object) lVar, iArr, fIntValue, false, false, 96, (j) null));
                        }
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
    public final Integer c(e eVar) {
        return Integer.valueOf(pz.d.e(this.f82114c, this.f82115d, 1).size());
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(e eVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(e eVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(e eVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    @Override // qz.c
    public final float i(e eVar) {
        int iIntValue;
        List<f52.a> list;
        Object obj;
        Integer num;
        e eVar2 = eVar;
        if (eVar2 == null || (list = eVar2.f82123c) == null) {
            iIntValue = 0;
        } else {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Integer num2 = ((f52.a) next).f69171b;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    do {
                        Object next2 = it.next();
                        Integer num3 = ((f52.a) next2).f69171b;
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
            f52.a aVar = (f52.a) obj;
            if (aVar == null || (num = aVar.f69171b) == null) {
                iIntValue = 0;
            } else {
                iIntValue = num.intValue();
            }
        }
        float fT = y.t(iIntValue, 0);
        if (fT > 0.0f) {
            return fT;
        }
        return 240000.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(e eVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(e eVar) {
        return 11.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(e eVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(e eVar) {
        return 0.0f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lh52/c$a;", "", "<init>", "()V", "", "DEFAULT_Y_MAX_MONTHLY_VALUE", "F", "DEFAULT_X_AXIS_OFFSET", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
