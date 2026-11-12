package zm1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.t0;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;
import w02.b0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lzm1/r;", "Lk00/h;", "Lzm1/s;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends k00.h<s> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final on1.a f205331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pi0.e f205332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f205333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f205334i;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, LocalDate localDate, LocalDate localDate2, boolean z14) {
        super(context, localDate, localDate2, z14);
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f205331f = new on1.a(new l22.a(context));
        this.f205332g = new pi0.e(context);
        this.f205333h = ((t0) KoinJavaComponent.get$default(t0.class, null, null, 6, null)).c();
        this.f205334i = R.color.gcm_sleep_chart_skin_temp;
    }

    public static ArrayList E(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            h hVar = (h) obj;
            hVar.getClass();
            if (hVar.f205308a != null) {
                em1.a aVar = em1.a.f64616a;
                Double d14 = hVar.f205309b;
                aVar.getClass();
                if (em1.a.a(d14) && em1.a.b(hVar.f205310c)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // k00.h
    public final ArrayList A(List list, LocalDate localDate, LocalDate localDate2) {
        ArrayList arrayListA = super.A(list, localDate, localDate2);
        if (this.f101984d) {
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                for (Entry entry : (List) it.next()) {
                    Context context = this.f101981a;
                    Drawable drawableA = j.a.a(context, R.drawable.chart_square_value_indicator);
                    if (drawableA != null) {
                        drawableA.setTint(a7.b.getColor(context, this.f205334i));
                    } else {
                        drawableA = null;
                    }
                    entry.setIcon(drawableA);
                }
            }
        }
        return arrayListA;
    }

    @Override // k00.h
    public final float D(s sVar) {
        return -C(sVar);
    }

    @Override // k00.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final float C(s sVar) {
        ArrayList arrayList;
        List<h> list;
        if (sVar == null || (list = sVar.f205339e) == null) {
            arrayList = null;
        } else {
            ArrayList<h> arrayListE = E(list);
            arrayList = new ArrayList(y.r(arrayListE, 10));
            for (h hVar : arrayListE) {
                Double d14 = this.f205333h ? hVar.f205310c : hVar.f205309b;
                arrayList.add(Double.valueOf(d14 != null ? d14.doubleValue() : 0.0d));
            }
        }
        em1.b.f64618a.getClass();
        return em1.b.a(arrayList);
    }

    @Override // qz.c
    public final List u(Object obj) {
        s sVar = (s) obj;
        if (sVar == null || !b0.u(sVar)) {
            return j0.f134944a;
        }
        Context context = this.f101981a;
        String string = context.getString(R.string.lbl_avg_skin_temp_change);
        string.getClass();
        return p13.w.c(new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_sleep_chart_skin_temp)), null, this.f101984d ? xz.g.C3605g.f192752a : new xz.g.c(3, 0.0f, 2, null), null, null, 106, null));
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        Integer numValueOf = Integer.valueOf(a7.b.getColor(this.f101981a, this.f205334i));
        boolean z14 = this.f101984d;
        LineDataSet lineDataSetR = gl1.d.r(list, str, z14, numValueOf);
        if (!z14) {
            lineDataSetR.enableDashedLine(10.0f, 10.0f, 0.0f);
        }
        return lineDataSetR;
    }

    @Override // k00.h
    public final Map z(s sVar) {
        ArrayList arrayList;
        List<h> list;
        DateTime dateTimeNow;
        String string;
        s sVar2 = sVar;
        if (sVar2 == null || (list = sVar2.f205339e) == null) {
            arrayList = null;
        } else {
            ArrayList<h> arrayListE = E(list);
            arrayList = new ArrayList(y.r(arrayListE, 10));
            for (h hVar : arrayListE) {
                LocalDate localDate = hVar.f205308a;
                if (localDate == null || (dateTimeNow = localDate.toDateTimeAtStartOfDay()) == null) {
                    dateTimeNow = DateTime.now();
                }
                Double d14 = hVar.f205309b;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = hVar.f205310c;
                double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                if (this.f205333h) {
                    dDoubleValue = dDoubleValue2;
                }
                dateTimeNow.getClass();
                String strA = this.f205332g.a(dateTimeNow, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                Double dValueOf = Double.valueOf(dDoubleValue);
                on1.a aVar = this.f205331f;
                aVar.getClass();
                l22.b bVar = aVar.f133043a;
                if (Double.isNaN(dDoubleValue)) {
                    string = bVar.getString(R.string.no_value_card);
                } else if (p005kotlin.jvm.internal.s.c(dValueOf, 0.0d)) {
                    string = "0";
                } else {
                    l3.f23124b.getClass();
                    string = l3.f23134l.format(dDoubleValue);
                    string.getClass();
                }
                arrayList.add(new k00.c(dateTimeNow, (float) dDoubleValue, new zz.l(strA, string, bVar.getString(R.string.lbl_avg_skin_temp_change), ((t0) KoinJavaComponent.get$default(t0.class, null, null, 6, null)).c() ? bVar.getString(R.string.lbl_fahrenheit) : bVar.getString(R.string.lbl_celsius), null, Integer.valueOf(R.color.transparent), Integer.valueOf(this.f101984d ? this.f205334i : R.drawable.skin_temp_dashed_line_marker_indicator), null, SyslogConstants.LOG_LOCAL2, null)));
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return p13.t0.b(new o13.p("SKIN_TEMP", arrayList));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzm1/r$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
