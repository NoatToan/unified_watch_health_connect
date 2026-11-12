package wl1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.x;
import rl1.i;
import rm1.h;
import rm1.j;
import rm1.k;
import sl1.e;
import xz.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lwl1/b;", "Lsl1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends e {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    public static p E(j jVar) {
        Float fValueOf;
        List<k> list;
        List<k> list2;
        j00.a aVar = j00.a.f95964a;
        Float fValueOf2 = null;
        if (jVar == null || (list2 = jVar.f153600p) == null) {
            fValueOf = null;
        } else {
            Iterator<T> it = list2.iterator();
            if (it.hasNext()) {
                float fMin = ((k) it.next()).f153611a;
                while (it.hasNext()) {
                    fMin = Math.min(fMin, ((k) it.next()).f153611a);
                }
                fValueOf = Float.valueOf(fMin);
            } else {
                fValueOf = null;
            }
        }
        float fC = j00.a.c(aVar, fValueOf, 2.0f, 10.0f);
        j00.a aVar2 = j00.a.f95964a;
        if (jVar != null && (list = jVar.f153600p) != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                float fMax = ((k) it3.next()).f153611a;
                while (it3.hasNext()) {
                    fMax = Math.max(fMax, ((k) it3.next()).f153611a);
                }
                fValueOf2 = Float.valueOf(fMax);
            }
        }
        aVar2.getClass();
        p pVarA = j00.a.a(aVar, fC, j00.a.b(fValueOf2, 2.0f, 200.0f), 4);
        return new p(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl1.e
    public final float C(j jVar) {
        if (em1.e.a(jVar, i.RESTING_HEART_RATE)) {
            return ((Number) E(jVar).f128595b).floatValue();
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl1.e
    public final float D(j jVar) {
        if (em1.e.a(jVar, i.RESTING_HEART_RATE)) {
            return ((Number) E(jVar).f128594a).floatValue();
        }
        return 0.0f;
    }

    @Override // sl1.e, qz.c
    /* JADX INFO: renamed from: x */
    public final List<f> u(j jVar) {
        em1.f fVar = em1.f.f64626a;
        i iVar = i.RESTING_HEART_RATE;
        boolean zA = em1.e.a(jVar, iVar);
        fVar.getClass();
        return em1.f.a(this.f159983a, iVar, zA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl1.e
    public final List<IBarLineScatterCandleBubbleDataSet<?>> y(j jVar) throws Throwable {
        boolean z14;
        Throwable th3;
        float f14;
        DateTime dateTimeNow;
        DateTimeZone dateTimeZone;
        int iIntValue;
        int i14;
        int iIntValue2;
        if (jVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<k> list = jVar.f153600p;
        h hVar = jVar.f153585a;
        Context context = this.f159983a;
        int i15 = 1;
        if (list == null || hVar == null) {
            z14 = 1;
            th3 = null;
            f14 = 0.0f;
        } else {
            rm1.b bVar = jVar.D;
            if (bVar == null || (dateTimeNow = bVar.f153532a) == null) {
                dateTimeNow = DateTime.now();
            }
            DateTime dateTime = dateTimeNow;
            DateTimeZone zone = dateTime.getZone();
            int iA = (int) q(jVar);
            int size = list.size();
            int i16 = 0;
            while (i16 < size) {
                k kVar = list.get(i16);
                em1.b bVar2 = em1.b.f64618a;
                Long lValueOf = Long.valueOf(kVar.f153612b);
                zone.getClass();
                bVar2.getClass();
                Integer numB = em1.b.b(lValueOf, dateTime, zone);
                if (numB == null || (iIntValue = numB.intValue()) < 0 || iIntValue > iA) {
                    dateTimeZone = zone;
                    size = size;
                    i16 = i16;
                } else {
                    int i17 = kVar.f153611a;
                    Integer numValueOf = Integer.valueOf(i17);
                    if (i17 <= 0) {
                        numValueOf = null;
                    }
                    float fIntValue = numValueOf != null ? numValueOf.intValue() : 0.0f;
                    Entry entry = (Entry) h0.n0(arrayList3);
                    int x14 = entry != null ? ((int) entry.getX()) + i15 : 0;
                    int i18 = iIntValue - 1;
                    if (i18 > x14) {
                        dateTimeZone = zone;
                        f0.m(arrayList3, context, x14, i18, dateTime, 2, 0.0f, i.RESTING_HEART_RATE);
                    } else {
                        dateTimeZone = zone;
                    }
                    int i19 = iIntValue + 1;
                    Integer numValueOf2 = Integer.valueOf(i19);
                    if (i19 > iA) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        int iIntValue3 = numValueOf2.intValue();
                        int i24 = i16 + 1;
                        Integer numValueOf3 = Integer.valueOf(i24);
                        if (i24 >= list.size()) {
                            numValueOf3 = null;
                        }
                        k kVar2 = numValueOf3 != null ? list.get(numValueOf3.intValue()) : null;
                        Integer numB2 = em1.b.b(kVar2 != null ? Long.valueOf(kVar2.f153612b) : null, dateTime, dateTimeZone);
                        if (numB2 != null && (iIntValue2 = numB2.intValue()) >= 0 && iIntValue2 <= iA && iIntValue2 <= iIntValue3) {
                            iIntValue3 = iIntValue2 - 1;
                        }
                        i14 = iIntValue3;
                    } else {
                        i14 = iA;
                    }
                    f0.l(arrayList3, context, iIntValue, i14, dateTime, fIntValue, i.RESTING_HEART_RATE);
                }
                i16++;
                i15 = i15;
                zone = dateTimeZone;
                size = size;
            }
            z14 = i15;
            th3 = null;
            f14 = 0.0f;
            Entry entry2 = (Entry) h0.n0(arrayList3);
            int x15 = entry2 != null ? ((int) entry2.getX()) + (z14 ? 1 : 0) : 0;
            if (iA >= x15) {
                f0.m(arrayList3, context, x15, iA, dateTime, 2, 0.0f, i.RESTING_HEART_RATE);
            }
        }
        if (!arrayList3.isEmpty()) {
            int i25 = 0;
            int i26 = 0;
            for (Object obj : arrayList3) {
                int i27 = i26 + 1;
                if (i26 < 0) {
                    x.q();
                    throw th3;
                }
                Entry entry3 = (Entry) obj;
                if (i26 > 0) {
                    float y14 = ((Entry) arrayList3.get(i26 - 1)).getY();
                    float y15 = entry3.getY();
                    if ((y14 > f14 && y15 <= f14) || (y14 <= f14 && y15 > f14)) {
                        arrayList2.add(arrayList3.subList(i25, i26));
                        i25 = i26;
                    }
                }
                i26 = i27;
            }
            if (i25 < arrayList3.size()) {
                arrayList2.add(arrayList3.subList(i25, arrayList3.size()));
            }
        }
        for (List list2 : arrayList2) {
            if (!list2.isEmpty()) {
                LineDataSet lineDataSet = new LineDataSet(list2, "RESTING_HEART_RATE");
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setColor(a7.b.getColor(context, R.color.gcm_chart_default_data_set));
                lineDataSet.setMode(LineDataSet.Mode.LINEAR);
                lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
                lineDataSet.setLineWidth(1.5f);
                lineDataSet.setHighlightEnabled(z14);
                arrayList.add(lineDataSet);
            }
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lwl1/b$a;", "", "<init>", "()V", "", "Y_AXIS_MARGIN", "F", "Y_AXIS_MIN", "Y_AXIS_MAX", "", "HEART_RATE_MINUTES", "I", "HEART_RATE_NO_VALUE", "SLEEP_START_X_INDEX", "", "DATA_SET_LABEL", "Ljava/lang/String;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
