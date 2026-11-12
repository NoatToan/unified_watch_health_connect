package zm1;

import android.content.Context;
import c22.p2;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.l0;
import p13.t0;
import p13.y;
import w02.b0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lzm1/j;", "Lzm1/t;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y00.a f205314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pi0.e f205315g;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, LocalDate localDate, LocalDate localDate2, boolean z14) {
        super(context, localDate, localDate2, z14);
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f205314f = new y00.a(new l22.a(context));
        this.f205315g = new pi0.e(context);
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
        List<b> list;
        DateTime dateTimeNow;
        if (sVar == null || (list = sVar.f205342h) == null) {
            arrayList = null;
        } else {
            ArrayList<b> arrayList2 = new ArrayList();
            for (Object obj : list) {
                b bVar = (b) obj;
                if (bVar.f205294a != null && bVar.f205295b != null && bVar.f205296c != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(y.r(arrayList2, 10));
            for (b bVar2 : arrayList2) {
                LocalDate localDate = bVar2.f205294a;
                if (localDate == null || (dateTimeNow = localDate.toDateTimeAtStartOfDay()) == null) {
                    dateTimeNow = DateTime.now();
                }
                Double d14 = bVar2.f205295b;
                float fDoubleValue = d14 != null ? (float) d14.doubleValue() : 0.0f;
                p2 p2VarA = t31.a.f162199a.a(bVar2.f205296c);
                dateTimeNow.getClass();
                String strA = this.f205315g.a(dateTimeNow, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                y00.a aVar = this.f205314f;
                aVar.getClass();
                l22.b bVar3 = aVar.f192984a;
                arrayList.add(new k00.c(dateTimeNow, fDoubleValue, new zz.l(strA, String.valueOf((int) fDoubleValue), bVar3.getString(R.string.lbl_avg_overnight_hrv), bVar3.getString(R.string.lbl_ms), null, Integer.valueOf(R.color.gcm3_transparent), p2VarA != null ? p2VarA.f23192a : null, p2VarA != null ? p2VarA.f23193b : null, 16, null)));
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return t0.b(new o13.p("HRV_STATUS", arrayList));
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
        float fC = j00.a.c(aVar, fB, 2.0f, 20.0f);
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
        o13.p pVarA = j00.a.a(aVar, fC, j00.a.b(fY, 2.0f, 120.0f), 4);
        return new o13.p<>(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    @Override // qz.c
    public final List u(Object obj) {
        ArrayList arrayList;
        Iterable iterableG1;
        int i14;
        Object next;
        s sVar = (s) obj;
        if (sVar == null || !b0.o(sVar)) {
            return j0.f134944a;
        }
        List<b> list = sVar.f205342h;
        if (list != null) {
            HashSet hashSet = new HashSet();
            ArrayList<b> arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (hashSet.add(((b) obj2).f205296c)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = new ArrayList();
            for (b bVar : arrayList2) {
                Iterator<T> it = i41.d.f90922h.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((i41.d) next).f90923a, bVar.f205296c));
                i41.d dVar = (i41.d) next;
                if (dVar != null) {
                    arrayList.add(dVar);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || (iterableG1 = h0.g1(arrayList)) == null) {
            iterableG1 = l0.f134950a;
        }
        iterableG1.getClass();
        List<i41.d> listN0 = h0.N0(iterableG1, new um1.b());
        ArrayList arrayList3 = new ArrayList(y.r(listN0, 10));
        for (i41.d dVar2 : listN0) {
            int i15 = um1.a.C3204a.f172014a[dVar2.ordinal()];
            if (i15 == 1) {
                i14 = R.string.ohrv_summary_status_no_status;
            } else if (i15 == 2) {
                i14 = R.string.ohrv_summary_status_balanced;
            } else if (i15 == 3) {
                i14 = R.string.ohrv_summary_status_unbalanced;
            } else if (i15 == 4) {
                i14 = R.string.gcm_body_battery_lbl_low;
            } else {
                if (i15 != 5) {
                    u0.r();
                    return null;
                }
                i14 = R.string.ohrv_summary_status_poor;
            }
            Context context = this.f101981a;
            String string = context.getString(i14);
            string.getClass();
            p2 p2VarA = t31.a.f162199a.a(dVar2.f90923a);
            arrayList3.add(new xz.f(string, p2VarA != null ? zf.b.y(p2VarA, context) : null, null, null, null, null, null, 124, null));
        }
        return arrayList3;
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        return gl1.d.r(list, str, false, Integer.valueOf(a7.b.getColor(this.f101981a, R.color.gcm3_transparent)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lzm1/j$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "Y_AXIS_MARGIN", "F", "Y_AXIS_MIN", "Y_AXIS_MAX", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
