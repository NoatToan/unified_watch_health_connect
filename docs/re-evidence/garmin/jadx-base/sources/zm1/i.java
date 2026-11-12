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
import p13.j0;
import p13.t0;
import p13.y;
import w02.b0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lzm1/i;", "Lk00/h;", "Lzm1/s;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends k00.h<s> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v00.a f205311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pi0.e f205312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f205313h;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, LocalDate localDate, LocalDate localDate2, boolean z14) {
        super(context, localDate, localDate2, z14);
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f205311f = new v00.a(new l22.a(context));
        this.f205312g = new pi0.e(context);
        this.f205313h = R.color.gcm_sleep_chart_body_battery_change;
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
                        drawableA.setTint(a7.b.getColor(context, this.f205313h));
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
    public final /* bridge */ /* synthetic */ float C(s sVar) {
        return 100.0f;
    }

    @Override // k00.h
    public final /* bridge */ /* synthetic */ float D(s sVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(Object obj) {
        s sVar = (s) obj;
        if (sVar == null || !b0.n(sVar)) {
            return j0.f134944a;
        }
        Context context = this.f101981a;
        String string = context.getString(R.string.lbl_body_battery_change);
        string.getClass();
        return p13.w.c(new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_sleep_chart_body_battery_change)), null, xz.g.C3605g.f192752a, null, null, 106, null));
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        return gl1.d.r(list, str, this.f101984d, Integer.valueOf(a7.b.getColor(this.f101981a, this.f205313h)));
    }

    @Override // k00.h
    public final Map z(s sVar) {
        ArrayList arrayList;
        List<zm1.a> list;
        DateTime dateTimeNow;
        s sVar2 = sVar;
        if (sVar2 == null || (list = sVar2.f205338d) == null) {
            arrayList = null;
        } else {
            ArrayList<zm1.a> arrayList2 = new ArrayList();
            for (Object obj : list) {
                zm1.a aVar = (zm1.a) obj;
                if (aVar.f205292a != null && aVar.f205293b != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(y.r(arrayList2, 10));
            for (zm1.a aVar2 : arrayList2) {
                LocalDate localDate = aVar2.f205292a;
                if (localDate == null || (dateTimeNow = localDate.toDateTimeAtStartOfDay()) == null) {
                    dateTimeNow = DateTime.now();
                }
                Integer num = aVar2.f205293b;
                int iIntValue = num != null ? num.intValue() : 0;
                dateTimeNow.getClass();
                String strA = this.f205312g.a(dateTimeNow, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                Integer numValueOf = Integer.valueOf(iIntValue);
                v00.a aVar3 = this.f205311f;
                arrayList.add(new k00.c(dateTimeNow, iIntValue, new zz.l(strA, aVar3.a(numValueOf), aVar3.f174198a.getString(R.string.lbl_body_battery_change), null, null, Integer.valueOf(R.color.transparent), Integer.valueOf(this.f205313h), null, SyslogConstants.LOG_LOCAL3, null)));
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return t0.b(new o13.p("BODY_BATTERY_CHANGE", arrayList));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lzm1/i$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "BODY_BATTERY_CHANGE_MIN_VALUE", "F", "BODY_BATTERY_CHANGE_MAX_VALUE", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
