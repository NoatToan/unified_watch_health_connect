package tl1;

import android.content.Context;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p13.j0;
import p13.x;
import rl1.i;
import rl1.k;
import rm1.h;
import rm1.j;
import sl1.e;
import xz.f;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ltl1/c;", "Lsl1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f165274e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fm1.a f165275d;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        context.getClass();
        this.f165275d = new fm1.a(new l22.a(context));
    }

    @Override // sl1.e
    public final float C(j jVar) {
        return oc.b.r(k.AWAKE, jVar != null ? jVar.A : false, false);
    }

    @Override // sl1.e
    public final float D(j jVar) {
        return 0.0f;
    }

    @Override // sl1.e, qz.c
    /* JADX INFO: renamed from: x */
    public final List<f> u(j jVar) {
        em1.f fVar = em1.f.f64626a;
        i iVar = i.AWAKE_RESTLESSNESS;
        boolean zA = em1.e.a(jVar, iVar);
        fVar.getClass();
        return em1.f.a(this.f159983a, iVar, zA);
    }

    @Override // sl1.e
    public final List<IBarLineScatterCandleBubbleDataSet<?>> y(j jVar) {
        LineDataSet lineDataSet;
        b bVar;
        Iterator it;
        DateTime dateTime;
        boolean z14;
        DateTime dateTime2;
        List<rm1.i> list;
        if (jVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        h hVar = jVar.f153585a;
        boolean z15 = jVar.A;
        boolean z16 = false;
        if (hVar != null && (list = jVar.f153587c) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (((rm1.i) obj).f153582a == k.AWAKE.f153447a) {
                        arrayList3.add(obj);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                int i14 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    rm1.i iVar = (rm1.i) next;
                    DateTime dateTime3 = iVar.f153583b;
                    DateTime dateTime4 = iVar.f153584c;
                    long j8 = hVar.f153568c;
                    Iterator it4 = it3;
                    ArrayList arrayList4 = arrayList3;
                    Integer numValueOf = dateTime3 != null ? Integer.valueOf(oc.b.u(dateTime3.getMillis(), j8)) : null;
                    Integer numValueOf2 = dateTime4 != null ? Integer.valueOf(oc.b.u(dateTime4.getMillis(), j8)) : null;
                    if (numValueOf != null && numValueOf2 != null) {
                        float fR = oc.b.r(k.AWAKE, z15, false);
                        int iIntValue = numValueOf2.intValue();
                        for (int iIntValue2 = numValueOf.intValue(); iIntValue2 < iIntValue; iIntValue2++) {
                            arrayList2.add(new Entry(iIntValue2, fR));
                        }
                        if (i14 < arrayList4.size() - 1) {
                            fR = -10.0f;
                        }
                        arrayList2.add(new Entry(numValueOf2.intValue(), fR));
                    }
                    i14 = i15;
                    arrayList3 = arrayList4;
                    it3 = it4;
                }
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        Context context = this.f159983a;
        if (zIsEmpty) {
            lineDataSet = null;
        } else {
            int i16 = k.AWAKE.f153448b;
            lineDataSet = new LineDataSet(arrayList2, "RESTLESSNESS_AWAKE");
            lineDataSet.setColor(a7.b.getColor(context, i16));
            lineDataSet.setDrawFilled(true);
            lineDataSet.setFillColor(a7.b.getColor(context, i16));
            lineDataSet.setFillAlpha(255);
            lineDataSet.setFillFormatter(new sn.a(26));
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setMode(LineDataSet.Mode.STEPPED);
            lineDataSet.setHighlightEnabled(false);
        }
        if (lineDataSet != null) {
            arrayList.add(lineDataSet);
        }
        ArrayList arrayList5 = new ArrayList();
        rm1.b bVar2 = jVar.D;
        if (bVar2 == null) {
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            DateTime dateTimeNow2 = DateTime.now();
            dateTimeNow2.getClass();
            bVar2 = new rm1.b(dateTimeNow, dateTimeNow2, null, null, 12, null);
        }
        DateTime dateTime5 = bVar2.f153532a;
        DateTime dateTime6 = bVar2.f153533b;
        int iV = oc.b.v(dateTime6, dateTime5);
        List<rm1.k> list2 = jVar.f153589e;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                rm1.k kVar = (rm1.k) it5.next();
                DateTime dateTime7 = new DateTime(kVar.f153612b, DateTimeZone.UTC);
                if (dateTime7.getMillis() < dateTime5.getMillis() || dateTime7.getMillis() > dateTime6.getMillis()) {
                    it = it5;
                    dateTime = dateTime6;
                } else {
                    int iV2 = oc.b.v(dateTime7, dateTime5);
                    int i17 = iV2 + 2;
                    if (i17 > iV) {
                        i17 = iV;
                    }
                    int i18 = kVar.f153611a;
                    DateTime dateTimePlusMinutes = dateTime5.plusMinutes(iV2);
                    DateTime dateTimePlusMinutes2 = dateTime5.plusMinutes(i17);
                    float fR2 = oc.b.r(k.AWAKE, z15, z16);
                    float f14 = fR2 * 0.01f;
                    it = it5;
                    float f15 = 6;
                    float fC = hb.a.c(f14, f15, fR2, f15);
                    float[] fArr = new float[12];
                    dateTime = dateTime6;
                    int i19 = 0;
                    for (int i24 = 12; i19 < i24; i24 = 12) {
                        fArr[i19] = i19 < i18 * 2 ? i19 % 2 != 0 ? f14 : fC : 0.0f;
                        i19++;
                    }
                    if (iV2 <= i17) {
                        while (true) {
                            float f16 = iV2;
                            dateTimePlusMinutes.getClass();
                            dateTimePlusMinutes2.getClass();
                            LocalTime localTime = dateTimePlusMinutes.toLocalTime();
                            localTime.getClass();
                            z14 = z15;
                            LocalTime localTime2 = dateTimePlusMinutes2.toLocalTime();
                            localTime2.getClass();
                            dateTime2 = dateTime5;
                            this.f159984b.getClass();
                            String strD = jz.a.d(localTime, localTime2, context);
                            fm1.a aVar = this.f165275d;
                            aVar.getClass();
                            l22.b bVar3 = aVar.f72101a;
                            String strValueOf = String.valueOf(i18);
                            if (strValueOf == null) {
                                strValueOf = bVar3.getString(R.string.no_value_card);
                            }
                            arrayList5.add(new BarEntry(f16, fArr, new l(strD, strValueOf, i18 == 1 ? bVar3.getString(R.string.lbl_restless_moment) : bVar3.getString(R.string.lbl_restless_moments), null, null, Integer.valueOf(R.color.gcm_sleep_chart_restless_moments), null, null, 216, null)));
                            if (iV2 != i17) {
                                iV2++;
                                z15 = z14;
                                dateTime5 = dateTime2;
                            }
                        }
                    }
                    it5 = it;
                    z15 = z14;
                    dateTime6 = dateTime;
                    dateTime5 = dateTime2;
                    z16 = false;
                }
                z14 = z15;
                dateTime2 = dateTime5;
                it5 = it;
                z15 = z14;
                dateTime6 = dateTime;
                dateTime5 = dateTime2;
                z16 = false;
            }
        }
        if (arrayList5.isEmpty()) {
            bVar = null;
        } else {
            b bVar4 = new b(arrayList5, "RESTLESSNESS_MOMENTS");
            int color = context.getColor(R.color.gcm_chart_default_data_set);
            ArrayList arrayList6 = new ArrayList(12);
            for (int iD = 0; iD < 12; iD = e5.d(iD % 2 != 0 ? context.getColor(R.color.transparent) : color, iD, arrayList6, 1)) {
            }
            bVar4.setColors(arrayList6);
            bVar4.setDrawValues(false);
            bVar4.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
            float fApplyDimension = TypedValue.applyDimension(1, 0.5f, context.getResources().getDisplayMetrics());
            bVar4.f165272a = 3;
            bVar4.f165273b = fApplyDimension;
            bVar4.setHighlightEnabled(true);
            bVar = bVar4;
        }
        if (bVar != null) {
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Ltl1/c$a;", "", "<init>", "()V", "", "INVALID_CHART_VALUE", "F", "", "NO_RESTLESS_MOMENT_VALUE", "I", "RESTLESS_MOMENTS_MINUTES", "RESTLESS_MOMENTS_PER_MINUTE", "RESTLESS_MOMENTS_STACK_SIZE", "RESTLESS_MOMENTS_STACK_SIZE_WITH_ELEVATION", "RESTLESS_MOMENTS_STACK_VERTICAL_ELEVATION_RATIO", "", "DATA_SET_RESTLESSNESS_AWAKE", "Ljava/lang/String;", "DATA_SET_RESTLESSNESS_MOMENTS", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
