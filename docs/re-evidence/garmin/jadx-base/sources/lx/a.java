package lx;

import android.content.Context;
import bx.f;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.LineDataSet;
import gl1.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k00.c;
import k00.h;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import pi0.e;
import xz.g;
import zz.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Llx/a;", "Lk00/h;", "", "Lbx/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h<List<? extends f>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f115132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f115133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f115134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f115135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f115136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f115137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rx.a f115138l;

    static {
        new C2190a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, LocalDate localDate, LocalDate localDate2) {
        super(context, localDate, localDate2, true);
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f115132f = R.color.gcm_chart_body_battery_low;
        this.f115133g = a7.b.getColor(context, R.color.gcm_chart_body_battery_low);
        this.f115134h = R.color.gcm_chart_body_battery_high;
        this.f115135i = a7.b.getColor(context, R.color.gcm_chart_body_battery_high);
        this.f115136j = a7.b.getColor(context, R.color.gcm_chart_body_battery_bar);
        this.f115137k = new e(context);
        this.f115138l = new rx.a(context);
    }

    @Override // k00.h
    public final /* bridge */ /* synthetic */ float C(List<? extends f> list) {
        return 100.0f;
    }

    @Override // k00.h
    public final /* bridge */ /* synthetic */ float D(List<? extends f> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final float e(Object obj) {
        return 0.0f - (d.I(this.f101982b, this.f101983c) ? 0.2f : 0.5f);
    }

    @Override // k00.h, qz.c
    public final float q(Object obj) {
        return (d.I(this.f101982b, this.f101983c) ? 0.2f : 0.5f) + super.q((List) obj);
    }

    @Override // qz.c
    public final List u(Object obj) {
        rx.a aVar = this.f115138l;
        String string = aVar.f154899a.getString(R.string.lbl_daily_high);
        string.getClass();
        Integer numValueOf = Integer.valueOf(this.f115135i);
        g.a aVar2 = g.a.f192745a;
        xz.f fVar = new xz.f(string, null, numValueOf, null, aVar2, null, null, 106, null);
        String string2 = aVar.f154899a.getString(R.string.lbl_daily_low);
        string2.getClass();
        return x.k(fVar, new xz.f(string2, null, Integer.valueOf(this.f115133g), null, aVar2, null, null, 106, null));
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        Integer numValueOf = Integer.valueOf(this.f115136j);
        List<Integer> listK = x.k(Integer.valueOf(this.f115135i), Integer.valueOf(this.f115133g));
        listK.getClass();
        LineDataSet lineDataSetQ = d.q(list, str, true, numValueOf);
        lineDataSetQ.setCircleColors(listK);
        lineDataSetQ.setLineWidth(8.0f);
        return lineDataSetQ;
    }

    @Override // k00.h
    public final Map z(List<? extends f> list) {
        List<? extends f> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list2 != null) {
            for (f fVar : list2) {
                ArrayList arrayList = new ArrayList();
                LocalDate localDateB = fVar.b();
                Integer numF = fVar.f();
                Integer numD = fVar.d();
                if (localDateB != null) {
                    String strD = this.f115137k.d(localDateB, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                    rx.a aVar = this.f115138l;
                    if (numD != null) {
                        String strB = aVar.b(numD);
                        String string = aVar.f154899a.getString(R.string.lbl_highest);
                        string.getClass();
                        l lVar = new l(strD, strB, string, null, null, Integer.valueOf(this.f115134h), null, null, 216, null);
                        DateTime dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                        dateTimeAtStartOfDay.getClass();
                        arrayList.add(new c(dateTimeAtStartOfDay, numD.intValue(), lVar));
                    }
                    if (numF != null) {
                        String strB2 = aVar.b(numF);
                        String string2 = aVar.f154899a.getString(R.string.lbl_lowest);
                        string2.getClass();
                        l lVar2 = new l(strD, strB2, string2, null, null, Integer.valueOf(this.f115132f), null, null, 216, null);
                        DateTime dateTimeAtStartOfDay2 = localDateB.toDateTimeAtStartOfDay();
                        dateTimeAtStartOfDay2.getClass();
                        arrayList.add(new c(dateTimeAtStartOfDay2, numF.intValue(), lVar2));
                    }
                }
                linkedHashMap.put("BODY_BATTERY_" + localDateB, arrayList);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: lx.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Llx/a$a;", "", "<init>", "()V", "", "CHART_MIN", "F", "CHART_MAX", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2190a {
        public /* synthetic */ C2190a(j jVar) {
            this();
        }

        private C2190a() {
        }
    }
}
