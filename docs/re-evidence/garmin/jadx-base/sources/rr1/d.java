package rr1;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import pi0.f;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lrr1/d;", "Lqz/c;", "", "Lkr1/c;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpi0/e;", "dateFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lpi0/e;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.c<List<? extends kr1.c>, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi0.e f154264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f154265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f154266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f154267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f154268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f154269f;

    static {
        new a(null);
    }

    public d(Context context, pi0.e eVar, LocalDate localDate, LocalDate localDate2) {
        context.getClass();
        eVar.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f154264a = eVar;
        this.f154265b = localDate;
        this.f154266c = localDate2;
        String string = context.getString(R.string.lbl_avg_overall_stress);
        string.getClass();
        this.f154267d = string;
        this.f154268e = context.getColor(R.color.gcm_chart_stress_data_set);
        this.f154269f = context.getColor(R.color.gcm_chart_highlight_line);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // qz.c
    public final List<ILineDataSet> a(List<? extends kr1.c> list) {
        ?? arrayList;
        ?? arrayList2;
        List<? extends kr1.c> list2 = list;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (kr1.c cVar : list2) {
                Integer value = cVar.getValue();
                xz.a aVar = null;
                if (value != null) {
                    int iIntValue = value.intValue();
                    LocalDate localDateB = cVar.b();
                    if (iIntValue >= 0 && localDateB != null) {
                        LocalDate localDatePlusDays = localDateB.plusDays(6);
                        localDatePlusDays.getClass();
                        aVar = new xz.a(localDateB, iIntValue, new l(this.f154264a.m(localDateB, localDatePlusDays, f.SHORT_MONTH_NO_WEEKDAY), String.valueOf(iIntValue), this.f154267d, null, null, Integer.valueOf(R.color.gcm_chart_stress_data_set), null, null, 216, null));
                    }
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        if (arrayList == 0 || arrayList.isEmpty()) {
            arrayList2 = j0.f134944a;
        } else {
            arrayList2 = new ArrayList();
            for (xz.a aVar2 : arrayList) {
                arrayList2.add(new Entry(Days.daysBetween(this.f154265b, aVar2.f192729a).getDays() / 7.0f, aVar2.f192730b, aVar2.f192731c));
            }
        }
        ArrayList arrayListB = pz.d.b(1, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            LineDataSet lineDataSet = new LineDataSet((List) it.next(), "");
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawCircleHole(false);
            int i14 = this.f154268e;
            lineDataSet.setCircleColor(i14);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setHighLightColor(this.f154269f);
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setColor(i14);
            arrayList3.add(lineDataSet);
        }
        return arrayList3;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(List<? extends kr1.c> list) {
        return Integer.valueOf(pz.d.e(this.f154265b, this.f154266c, 5).size());
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends kr1.c> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends kr1.c> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends kr1.c> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends kr1.c> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(List<? extends kr1.c> list) {
        return 100.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends kr1.c> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends kr1.c> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(List<? extends kr1.c> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends kr1.c> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends kr1.c> list) {
        return Days.daysBetween(this.f154265b, this.f154266c).getDays() / 7;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends kr1.c> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(List<? extends kr1.c> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(List<? extends kr1.c> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends kr1.c> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends kr1.c> list) {
        return 0.0f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrr1/d$a;", "", "<init>", "()V", "", "MAX_Y_VALUE", "F", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
