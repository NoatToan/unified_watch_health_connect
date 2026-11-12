package zm1;

import android.content.Context;
import c22.p2;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
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
import p13.x;
import p13.y;
import w02.b0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lzm1/k;", "Lk00/h;", "Lzm1/s;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends k00.h<s> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gc1.a f205316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pi0.e f205317g;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, LocalDate localDate, LocalDate localDate2, boolean z14) {
        super(context, localDate, localDate2, z14);
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f205316f = new gc1.a(context);
        this.f205317g = new pi0.e(context);
    }

    @Override // k00.h
    public final ArrayList A(List list, LocalDate localDate, LocalDate localDate2) {
        ArrayList arrayListA = super.A(list, localDate, localDate2);
        if (this.f101984d) {
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                for (Entry entry : (List) it.next()) {
                    Object data = entry.getData();
                    zz.l lVar = data instanceof zz.l ? (zz.l) data : null;
                    Integer num = lVar != null ? lVar.f207550g : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Context context = this.f101981a;
                        entry.setIcon(r0.c(r0.f23226a, context, iIntValue, context.getResources().getDimensionPixelSize(R.dimen.chart_value_item_size)));
                    }
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
        return 60.0f;
    }

    @Override // qz.c
    public final List u(Object obj) {
        s sVar = (s) obj;
        if (sVar == null || !b0.q(sVar)) {
            return j0.f134944a;
        }
        hc1.a aVar = hc1.a.NORMAL;
        String strValueOf = String.valueOf(ge1.b.J(aVar));
        Object[] objArr = {Integer.valueOf(ge1.b.I(aVar))};
        Context context = this.f101981a;
        String string = context.getString(R.string.string_line_string_pattern, strValueOf, context.getString(R.string.lbl_percentage, objArr));
        string.getClass();
        bc1.a aVar2 = bc1.a.f17414a;
        xz.f fVar = new xz.f(string, zf.b.z(aVar2, context, aVar), null, null, null, null, null, 124, null);
        hc1.a aVar3 = hc1.a.MODERATE;
        String string2 = context.getString(R.string.string_line_string_pattern, String.valueOf(ge1.b.J(aVar3)), context.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(aVar3))));
        string2.getClass();
        xz.f fVar2 = new xz.f(string2, zf.b.z(aVar2, context, aVar3), null, null, null, null, null, 124, null);
        hc1.a aVar4 = hc1.a.LOW;
        String string3 = context.getString(R.string.string_line_string_pattern, String.valueOf(ge1.b.J(aVar4)), context.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(aVar4))));
        string3.getClass();
        xz.f fVar3 = new xz.f(string3, zf.b.z(aVar2, context, aVar4), null, null, null, null, null, 124, null);
        hc1.a aVar5 = hc1.a.HARMFUL;
        String string4 = context.getString(R.string.less_than_string_pattern, context.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(aVar5) + 1)));
        string4.getClass();
        return x.k(fVar, fVar2, fVar3, new xz.f(string4, zf.b.z(aVar2, context, aVar5), null, null, null, null, null, 124, null));
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        return gl1.d.r(list, str, false, Integer.valueOf(a7.b.getColor(this.f101981a, R.color.gcm3_transparent)));
    }

    @Override // k00.h
    public final Map z(s sVar) {
        ArrayList arrayList;
        List<e> list;
        DateTime dateTimeNow;
        s sVar2 = sVar;
        if (sVar2 == null || (list = sVar2.f205340f) == null) {
            arrayList = null;
        } else {
            ArrayList<e> arrayList2 = new ArrayList();
            for (Object obj : list) {
                e eVar = (e) obj;
                if (eVar.f205302a != null && eVar.f205303b != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(y.r(arrayList2, 10));
            for (e eVar2 : arrayList2) {
                LocalDate localDate = eVar2.f205302a;
                if (localDate == null || (dateTimeNow = localDate.toDateTimeAtStartOfDay()) == null) {
                    dateTimeNow = DateTime.now();
                }
                Double d14 = eVar2.f205303b;
                float fDoubleValue = d14 != null ? (float) d14.doubleValue() : 0.0f;
                dateTimeNow.getClass();
                String strA = this.f205317g.a(dateTimeNow, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                Float fValueOf = Float.valueOf(fDoubleValue);
                gc1.a aVar = this.f205316f;
                String strA2 = gc1.a.a(aVar, fValueOf);
                String string = aVar.f76926b.getString(R.string.pulse_ox_spo2_label);
                int iIntValue = R.color.gcm3_transparent;
                Integer numValueOf = Integer.valueOf(R.color.gcm3_transparent);
                bc1.a aVar2 = bc1.a.f17414a;
                Float fValueOf2 = Float.valueOf(fDoubleValue);
                aVar2.getClass();
                p2 p2VarU = jg.b.u(aVar2, fValueOf2);
                Integer num = p2VarU != null ? p2VarU.f23192a : null;
                p2 p2VarU2 = jg.b.u(aVar2, Float.valueOf(fDoubleValue));
                Integer num2 = p2VarU2 != null ? p2VarU2.f23193b : null;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                arrayList.add(new k00.c(dateTimeNow, fDoubleValue, new zz.l(strA, strA2, string, null, null, numValueOf, num, Integer.valueOf(iIntValue), 24, null)));
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return t0.b(new o13.p("PULSE_OX", arrayList));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzm1/k$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
