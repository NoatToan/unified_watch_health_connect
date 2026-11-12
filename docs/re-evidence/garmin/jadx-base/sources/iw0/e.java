package iw0;

import android.content.Context;
import b63.o;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import g22.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k00.h;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.t0;
import p13.y;
import pv0.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001:\u0001\u000fB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Liw0/e;", "Lk00/h;", "Lkw0/f;", "Lkw0/e$a;", "Lpi0/e;", "dateTimeFormatter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj23/g;", "Lb63/o;", "dateInterval", "", "daily", "<init>", "(Lpi0/e;Landroid/content/Context;Lj23/g;Z)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends h<kw0.f<kw0.e.a>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pi0.e f95300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j23.g<o> f95301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f95302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f95303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f95304j;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pi0.e eVar, Context context, j23.g<o> gVar, boolean z14) {
        super(context, l.h((o) gVar.getStart()), l.h((o) gVar.b()), z14);
        eVar.getClass();
        context.getClass();
        gVar.getClass();
        this.f95300f = eVar;
        this.f95301g = gVar;
        zv0.d dVar = zv0.d.f207169a;
        r rVar = r.OVERNIGHT_HRV;
        l22.a aVar = new l22.a(context);
        dVar.getClass();
        this.f95302h = zv0.d.c(rVar, aVar);
        String string = context.getString(R.string.lbl_ms);
        string.getClass();
        this.f95303i = string;
        this.f95304j = true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    public static p E(kw0.f fVar) {
        Float fValueOf;
        Collection collection;
        Collection collection2;
        j00.a aVar = j00.a.f95964a;
        Float fValueOf2 = null;
        if (fVar == null || (collection2 = fVar.f106947d) == null) {
            fValueOf = null;
        } else {
            Iterator it = collection2.iterator();
            if (it.hasNext()) {
                Integer num = ((kw0.e.a) it.next()).f106923g;
                float fIntValue = num != null ? num.intValue() : 0.0f;
                while (it.hasNext()) {
                    Integer num2 = ((kw0.e.a) it.next()).f106923g;
                    fIntValue = Math.min(fIntValue, num2 != null ? num2.intValue() : 0.0f);
                }
                fValueOf = Float.valueOf(fIntValue);
            } else {
                fValueOf = null;
            }
        }
        float fC = j00.a.c(aVar, fValueOf, 2.0f, 20.0f);
        j00.a aVar2 = j00.a.f95964a;
        if (fVar != null && (collection = fVar.f106947d) != null) {
            Iterator it3 = collection.iterator();
            if (it3.hasNext()) {
                Integer num3 = ((kw0.e.a) it3.next()).f106923g;
                float fIntValue2 = num3 != null ? num3.intValue() : 0.0f;
                while (it3.hasNext()) {
                    Integer num4 = ((kw0.e.a) it3.next()).f106923g;
                    fIntValue2 = Math.max(fIntValue2, num4 != null ? num4.intValue() : 0.0f);
                }
                fValueOf2 = Float.valueOf(fIntValue2);
            }
        }
        aVar2.getClass();
        p pVarA = j00.a.a(aVar, fC, j00.a.b(fValueOf2, 2.0f, 120.0f), 5);
        return new p(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k00.h
    public final float C(kw0.f<kw0.e.a> fVar) {
        kw0.f<kw0.e.a> fVar2 = fVar;
        if (fVar2 != null) {
            return ((Number) E(fVar2).f128595b).floatValue();
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k00.h
    public final float D(kw0.f<kw0.e.a> fVar) {
        kw0.f<kw0.e.a> fVar2 = fVar;
        if (fVar2 != null) {
            return ((Number) E(fVar2).f128594a).floatValue();
        }
        return 0.0f;
    }

    @Override // k00.h, qz.c
    public final List<ILineDataSet> a(Object obj) {
        List<LifestyleMetric> list;
        kw0.f fVar = (kw0.f) obj;
        this.f95304j = fVar != null ? fVar.f106946c : true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (fVar != null && (list = fVar.f106947d) != 0) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                kw0.e.a aVar = (kw0.e.a) list.get(i14);
                o oVar = aVar.f106922f;
                if (oVar != null) {
                    Integer num = aVar.f106923g;
                    DateTime dateTimeAtStartOfDay = l.h(oVar).toDateTimeAtStartOfDay();
                    int iJ = lw0.b.j((o) this.f95301g.getStart(), oVar, this.f101984d);
                    if (num != null) {
                        dateTimeAtStartOfDay.getClass();
                        arrayList2.add(new Entry(iJ, num.intValue(), lw0.b.g(dateTimeAtStartOfDay, this.f95300f, this.f101981a, aVar, this.f95302h, this.f95303i, null, this.f95304j, this.f101984d, 64)));
                    }
                }
            }
        }
        arrayList.add(x("OVERNIGHT_HRV", h0.Z(arrayList2)));
        return arrayList;
    }

    @Override // qz.c
    public final Integer c(Object obj) {
        return Integer.valueOf(lw0.b.b(this.f95301g, this.f101984d));
    }

    @Override // k00.h, qz.c
    public final float q(Object obj) {
        return lw0.b.c(this.f95301g, this.f101984d, false);
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        int iD = lw0.b.d(this.f95304j, this.f101984d);
        Context context = this.f101981a;
        LineDataSet lineDataSetR = gl1.d.r(list, str, false, Integer.valueOf(context.getColor(iD)));
        lineDataSetR.setDrawHorizontalHighlightIndicator(false);
        lineDataSetR.enableDashedLine(4.0f, 0.0f, 0.0f);
        lineDataSetR.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        lineDataSetR.setHighlightLineWidth(1.0f);
        return lineDataSetR;
    }

    @Override // k00.h
    public final Map z(kw0.f<kw0.e.a> fVar) {
        ArrayList arrayList;
        List<kw0.e.a> list;
        DateTime dateTimeNow;
        kw0.f<kw0.e.a> fVar2 = fVar;
        this.f95304j = fVar2 != null ? fVar2.f106946c : true;
        if (fVar2 == null || (list = fVar2.f106947d) == null) {
            arrayList = null;
        } else {
            ArrayList<kw0.e.a> arrayList2 = new ArrayList();
            for (Object obj : list) {
                kw0.e.a aVar = (kw0.e.a) obj;
                if (aVar.f106922f != null && aVar.f106923g != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(y.r(arrayList2, 10));
            for (kw0.e.a aVar2 : arrayList2) {
                o oVar = aVar2.f106922f;
                if (oVar == null || (dateTimeNow = l.h(oVar).toDateTimeAtStartOfDay()) == null) {
                    dateTimeNow = DateTime.now();
                }
                DateTime dateTime = dateTimeNow;
                Integer num = aVar2.f106923g;
                float fIntValue = num != null ? num.intValue() : 0.0f;
                dateTime.getClass();
                arrayList.add(new k00.c(dateTime, fIntValue, lw0.b.g(dateTime, this.f95300f, this.f101981a, aVar2, this.f95302h, null, null, this.f95304j, this.f101984d, 96)));
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return t0.b(new p("OVERNIGHT_HRV", arrayList));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Liw0/e$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "OVERNIGHT_HRV_NO_VALUE", "F", "Y_AXIS_MARGIN", "Y_AXIS_MIN", "Y_AXIS_MAX", "", "Y_AXIS_LABELS_COUNT", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
