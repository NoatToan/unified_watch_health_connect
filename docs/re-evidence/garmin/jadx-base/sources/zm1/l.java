package zm1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.d0;
import p13.j0;
import p13.t0;
import p13.y;
import w02.b0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lzm1/l;", "Lzm1/t;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a10.a f205318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pi0.e f205319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f205320h;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, LocalDate localDate, LocalDate localDate2, boolean z14) {
        super(context, localDate, localDate2, z14);
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f205318f = new a10.a(context);
        this.f205319g = new pi0.e(context);
        this.f205320h = R.color.gcm_sleep_chart_respiration;
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
                        drawableA.setTint(a7.b.getColor(context, this.f205320h));
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
    public final float C(s sVar) {
        return F(sVar).f128595b.floatValue();
    }

    @Override // k00.h
    public final float D(s sVar) {
        return F(sVar).f128594a.floatValue();
    }

    @Override // k00.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<k00.c>> z(s sVar) {
        ArrayList arrayList;
        List<f> list;
        DateTime dateTimeNow;
        if (sVar == null || (list = sVar.f205341g) == null) {
            arrayList = null;
        } else {
            ArrayList<f> arrayList2 = new ArrayList();
            for (Object obj : list) {
                f fVar = (f) obj;
                if (fVar.f205304a != null && fVar.f205305b != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(y.r(arrayList2, 10));
            for (f fVar2 : arrayList2) {
                LocalDate localDate = fVar2.f205304a;
                if (localDate == null || (dateTimeNow = localDate.toDateTimeAtStartOfDay()) == null) {
                    dateTimeNow = DateTime.now();
                }
                Double d14 = fVar2.f205305b;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                dateTimeNow.getClass();
                String strA = this.f205319g.a(dateTimeNow, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                float f14 = (float) dDoubleValue;
                Float fValueOf = Float.valueOf(f14);
                a10.a aVar = this.f205318f;
                arrayList.add(new k00.c(dateTimeNow, f14, new zz.l(strA, aVar.d(fValueOf, true, (2 & 4) != 0), aVar.f242a.getString(R.string.activities_respiration_rate), null, null, Integer.valueOf(R.color.transparent), Integer.valueOf(this.f205320h), null, SyslogConstants.LOG_LOCAL3, null)));
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return t0.b(new o13.p("RESPIRATION", arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o13.p<Float, Float> F(s sVar) {
        Float fB;
        j00.a aVar = j00.a.f95964a;
        Map<String, List<k00.c>> mapZ = z(sVar);
        Float fY = null;
        if (mapZ != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, List<k00.c>>> it = mapZ.entrySet().iterator();
            while (it.hasNext()) {
                d0.v(arrayList, it.next().getValue());
            }
            fB = gl.b.B(arrayList);
        } else {
            fB = null;
        }
        float fC = j00.a.c(aVar, fB, 2.0f, 6.0f);
        j00.a aVar2 = j00.a.f95964a;
        Map<String, List<k00.c>> mapZ2 = z(sVar);
        if (mapZ2 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Map.Entry<String, List<k00.c>>> it3 = mapZ2.entrySet().iterator();
            while (it3.hasNext()) {
                d0.v(arrayList2, it3.next().getValue());
            }
            fY = gl.b.y(arrayList2);
        }
        aVar2.getClass();
        o13.p pVarA = j00.a.a(aVar, fC, j00.a.b(fY, 2.0f, 20.0f), 4);
        return new o13.p<>(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    @Override // qz.c
    public final List u(Object obj) {
        s sVar = (s) obj;
        if (sVar == null || !b0.s(sVar)) {
            return j0.f134944a;
        }
        Context context = this.f101981a;
        String string = context.getString(R.string.activities_respiration_rate);
        string.getClass();
        return p13.w.c(new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_sleep_chart_respiration)), null, xz.g.C3605g.f192752a, null, null, 106, null));
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        return gl1.d.r(list, str, this.f101984d, Integer.valueOf(a7.b.getColor(this.f101981a, this.f205320h)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lzm1/l$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "Y_AXIS_MARGIN", "F", "Y_AXIS_MIN", "Y_AXIS_MAX", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
