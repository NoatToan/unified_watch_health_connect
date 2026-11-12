package am1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
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
import rm1.d;
import rm1.h;
import rm1.j;
import sl1.e;
import xz.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lam1/a;", "Lsl1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e {
    static {
        new C0068a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p E(j jVar) {
        h hVar;
        Double d14;
        h hVar2;
        Double d15;
        j00.a aVar = j00.a.f95964a;
        Float fValueOf = null;
        float fC = j00.a.c(aVar, (jVar == null || (hVar2 = jVar.f153585a) == null || (d15 = hVar2.f153573h) == null) ? null : Float.valueOf((float) d15.doubleValue()), 2.0f, 6.0f);
        if (jVar != null && (hVar = jVar.f153585a) != null && (d14 = hVar.f153574i) != null) {
            fValueOf = Float.valueOf((float) d14.doubleValue());
        }
        p pVarA = j00.a.a(aVar, fC, j00.a.b(fValueOf, 2.0f, 20.0f), 4);
        return new p(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl1.e
    public final float C(j jVar) {
        if (em1.e.a(jVar, i.RESPIRATION)) {
            return ((Number) E(jVar).f128595b).floatValue();
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl1.e
    public final float D(j jVar) {
        if (em1.e.a(jVar, i.RESPIRATION)) {
            return ((Number) E(jVar).f128594a).floatValue();
        }
        return 0.0f;
    }

    @Override // sl1.e, qz.c
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final List<f> u(j jVar) {
        em1.f fVar = em1.f.f64626a;
        i iVar = i.RESPIRATION;
        boolean zA = em1.e.a(jVar, iVar);
        fVar.getClass();
        return em1.f.a(this.f159983a, iVar, zA);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    @Override // sl1.e
    public final List<IBarLineScatterCandleBubbleDataSet<?>> y(j jVar) throws Throwable {
        boolean z14;
        Throwable th3;
        float f14;
        DateTime dateTimeNow;
        int i14;
        int iIntValue;
        int i15;
        float fDoubleValue;
        int i16;
        int iIntValue2;
        if (jVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<d> list = jVar.f153592h;
        h hVar = jVar.f153585a;
        Context context = this.f159983a;
        if (list == null || hVar == null) {
            z14 = true;
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
            int i17 = 0;
            while (i17 < size) {
                d dVar = list.get(i17);
                em1.b bVar2 = em1.b.f64618a;
                Long lValueOf = Long.valueOf(dVar.f153542a);
                zone.getClass();
                bVar2.getClass();
                Integer numB = em1.b.b(lValueOf, dateTime, zone);
                if (numB == null || (iIntValue = numB.intValue()) < 0 || iIntValue > iA) {
                    zone = zone;
                    size = size;
                    i14 = i17;
                } else {
                    Double d14 = dVar.f153543b;
                    if (d14 == null) {
                        i15 = 1;
                        fDoubleValue = 0.0f;
                    } else {
                        if (d14.doubleValue() <= 0.0d) {
                            d14 = null;
                        }
                        if (d14 != null) {
                            i15 = 1;
                            fDoubleValue = (float) d14.doubleValue();
                        } else {
                            i15 = 1;
                            fDoubleValue = 0.0f;
                        }
                    }
                    Entry entry = (Entry) h0.n0(arrayList3);
                    int x14 = entry != null ? ((int) entry.getX()) + i15 : 0;
                    int i18 = iIntValue - 1;
                    if (i18 > x14) {
                        i14 = i17;
                        dateTime = dateTime;
                        f0.m(arrayList3, context, x14, i18, dateTime, 2, 0.0f, i.RESPIRATION);
                    } else {
                        i14 = i17;
                        dateTime = dateTime;
                    }
                    int i19 = iIntValue + 1;
                    Integer numValueOf = Integer.valueOf(i19);
                    if (i19 > iA) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue3 = numValueOf.intValue();
                        int i24 = i14 + 1;
                        Integer numValueOf2 = Integer.valueOf(i24);
                        if (i24 >= list.size()) {
                            numValueOf2 = null;
                        }
                        d dVar2 = numValueOf2 != null ? list.get(numValueOf2.intValue()) : null;
                        Integer numB2 = em1.b.b(dVar2 != null ? Long.valueOf(dVar2.f153542a) : null, dateTime, zone);
                        if (numB2 != null && (iIntValue2 = numB2.intValue()) >= 0 && iIntValue2 <= iA && iIntValue2 <= iIntValue3) {
                            iIntValue3 = iIntValue2 - 1;
                        }
                        i16 = iIntValue3;
                    } else {
                        i16 = iA;
                    }
                    f0.l(arrayList3, context, iIntValue, i16, dateTime, fDoubleValue, i.RESPIRATION);
                }
                i17 = i14 + 1;
                zone = zone;
                size = size;
            }
            z14 = true;
            th3 = null;
            f14 = 0.0f;
            Entry entry2 = (Entry) h0.n0(arrayList3);
            int x15 = entry2 != null ? ((int) entry2.getX()) + 1 : 0;
            if (iA >= x15) {
                f0.m(arrayList3, context, x15, iA, dateTime, 2, 0.0f, i.RESPIRATION);
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
                LineDataSet lineDataSet = new LineDataSet(list2, "RESPIRATION");
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

    /* JADX INFO: renamed from: am1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lam1/a$a;", "", "<init>", "()V", "", "Y_AXIS_MARGIN", "F", "Y_AXIS_MIN", "Y_AXIS_MAX", "", "RESPIRATION_MINUTES", "I", "RESPIRATION_NO_VALUE", "SLEEP_START_X_INDEX", "", "DATA_SET_LABEL", "Ljava/lang/String;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0068a {
        public /* synthetic */ C0068a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0068a() {
        }
    }
}
