package yl1;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyl1/a;", "Lsl1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e {
    static {
        new C3707a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Multi-variable type inference failed */
    public static p E(j jVar) {
        Float fValueOf;
        Float fValueOf2 = null;
        List<k> list = jVar != null ? jVar.f153603s : null;
        j00.a aVar = j00.a.f95964a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                float fMin = ((k) it.next()).f153611a;
                while (it.hasNext()) {
                    fMin = Math.min(fMin, ((k) it.next()).f153611a);
                }
                fValueOf = Float.valueOf(fMin);
            } else {
                fValueOf = null;
            }
        } else {
            fValueOf = null;
        }
        float fC = j00.a.c(aVar, fValueOf, 2.0f, 20.0f);
        j00.a aVar2 = j00.a.f95964a;
        if (list != null) {
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
        p pVarA = j00.a.a(aVar, fC, j00.a.b(fValueOf2, 2.0f, 120.0f), 4);
        return new p(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl1.e
    public final float C(j jVar) {
        if (em1.e.a(jVar, i.OVERNIGHT_HRV)) {
            return ((Number) E(jVar).f128595b).floatValue();
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl1.e
    public final float D(j jVar) {
        if (em1.e.a(jVar, i.OVERNIGHT_HRV)) {
            return ((Number) E(jVar).f128594a).floatValue();
        }
        return 0.0f;
    }

    @Override // sl1.e, qz.c
    /* JADX INFO: renamed from: x */
    public final List<f> u(j jVar) {
        em1.f fVar = em1.f.f64626a;
        i iVar = i.OVERNIGHT_HRV;
        boolean zA = em1.e.a(jVar, iVar);
        fVar.getClass();
        return em1.f.a(this.f159983a, iVar, zA);
    }

    @Override // sl1.e
    public final List<IBarLineScatterCandleBubbleDataSet<?>> y(j jVar) throws Throwable {
        Throwable th3;
        DateTime dateTimeNow;
        DateTimeZone dateTimeZone;
        int iIntValue;
        k kVar;
        int iIntValue2;
        if (jVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<k> list = jVar.f153603s;
        h hVar = jVar.f153585a;
        Context context = this.f159983a;
        int i14 = 1;
        if (list == null || hVar == null) {
            th3 = null;
        } else {
            rm1.b bVar = jVar.D;
            if (bVar == null || (dateTimeNow = bVar.f153532a) == null) {
                dateTimeNow = DateTime.now();
            }
            DateTime dateTime = dateTimeNow;
            DateTimeZone zone = dateTime.getZone();
            int iA = (int) q(jVar);
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    x.q();
                    throw null;
                }
                k kVar2 = (k) obj;
                em1.b bVar2 = em1.b.f64618a;
                Long lValueOf = Long.valueOf(kVar2.f153612b);
                zone.getClass();
                bVar2.getClass();
                Integer numB = em1.b.b(lValueOf, dateTime, zone);
                if (numB == null || (iIntValue = numB.intValue()) < 0 || iIntValue > iA) {
                    dateTimeZone = zone;
                    i16 = i16;
                } else {
                    Entry entry = (Entry) h0.n0(arrayList3);
                    int x14 = entry != null ? ((int) entry.getX()) + i14 : 0;
                    int iIntValue3 = numB.intValue() - i14;
                    if (iIntValue3 > x14) {
                        kVar = kVar2;
                        dateTimeZone = zone;
                        f0.m(arrayList3, context, x14, iIntValue3, dateTime, 5, 0.0f, i.OVERNIGHT_HRV);
                    } else {
                        dateTimeZone = zone;
                        kVar = kVar2;
                    }
                    int iIntValue4 = numB.intValue() + 4;
                    Integer numValueOf = Integer.valueOf(iIntValue4);
                    if (iIntValue4 > iA) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        Integer numValueOf2 = Integer.valueOf(i16);
                        if (i16 >= list.size()) {
                            numValueOf2 = null;
                        }
                        k kVar3 = numValueOf2 != null ? list.get(numValueOf2.intValue()) : null;
                        Integer numB2 = em1.b.b(kVar3 != null ? Long.valueOf(kVar3.f153612b) : null, dateTime, dateTimeZone);
                        if (numB2 != null && (iIntValue2 = numB2.intValue()) >= 0 && iIntValue2 <= iA && numB2.intValue() <= numValueOf.intValue()) {
                            numValueOf = b71.i.e(1, numB2);
                        }
                    } else {
                        numValueOf = Integer.valueOf(iA);
                    }
                    f0.l(arrayList3, context, numB.intValue(), numValueOf.intValue(), dateTime, kVar.f153611a, i.OVERNIGHT_HRV);
                }
                i15 = i16;
                zone = dateTimeZone;
                i14 = 1;
            }
            th3 = null;
            Entry entry2 = (Entry) h0.n0(arrayList3);
            int x15 = entry2 != null ? ((int) entry2.getX()) + 1 : 0;
            if (iA > x15) {
                f0.m(arrayList3, context, x15, iA, dateTime, 5, 0.0f, i.OVERNIGHT_HRV);
            }
        }
        if (!arrayList3.isEmpty()) {
            int i17 = 0;
            int i18 = 0;
            for (Object obj2 : arrayList3) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    x.q();
                    throw th3;
                }
                Entry entry3 = (Entry) obj2;
                if (i18 > 0) {
                    float y14 = ((Entry) arrayList3.get(i18 - 1)).getY();
                    if (entry3.getY() == 0.0f || y14 == 0.0f) {
                        arrayList2.add(arrayList3.subList(i17, i18));
                        i17 = i18;
                    }
                }
                i18 = i19;
            }
            if (i17 < arrayList3.size()) {
                arrayList2.add(arrayList3.subList(i17, arrayList3.size()));
            }
        }
        for (List list2 : arrayList2) {
            if (!list2.isEmpty()) {
                LineDataSet lineDataSet = new LineDataSet(list2, "OVERNIGHT_HRV");
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setMode(LineDataSet.Mode.LINEAR);
                lineDataSet.setLineWidth(1.5f);
                lineDataSet.setHighlightEnabled(true);
                lineDataSet.setColor(a7.b.getColor(context, R.color.gcm_chart_default_data_set));
                lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
                arrayList.add(lineDataSet);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: yl1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyl1/a$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "OVERNIGHT_HRV_NO_VALUE", "F", "Y_AXIS_MARGIN", "Y_AXIS_MIN", "Y_AXIS_MAX", "", "OVERNIGHT_HRV_MINUTES_INTERVAL", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3707a {
        public /* synthetic */ C3707a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3707a() {
        }
    }
}
