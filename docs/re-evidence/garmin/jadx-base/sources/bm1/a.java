package bm1;

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
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.x;
import rl1.i;
import rm1.b;
import rm1.c;
import rm1.h;
import rm1.j;
import sl1.e;
import xz.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbm1/a;", "Lsl1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e {
    static {
        new C0273a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static p E(j jVar) {
        ArrayList arrayList;
        Float fValueOf;
        Object next;
        Double d14;
        Object next2;
        Double d15;
        List<c> list;
        Float fValueOf2 = null;
        if (jVar == null || (list = jVar.f153593i) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Double d16 = ((c) obj).f153539b;
                if ((d16 != null ? d16.doubleValue() : 0.0d) > 0.0d) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next2 = it.next();
                if (it.hasNext()) {
                    Double d17 = ((c) next2).f153539b;
                    double dDoubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                    do {
                        Object next3 = it.next();
                        Double d18 = ((c) next3).f153539b;
                        double dDoubleValue2 = d18 != null ? d18.doubleValue() : 0.0d;
                        if (Double.compare(dDoubleValue, dDoubleValue2) > 0) {
                            next2 = next3;
                            dDoubleValue = dDoubleValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next2 = null;
            }
            c cVar = (c) next2;
            if (cVar == null || (d15 = cVar.f153539b) == null) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(MathKt.b(d15.doubleValue()));
            }
        } else {
            fValueOf = null;
        }
        if (arrayList != null) {
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    Double d19 = ((c) next).f153539b;
                    double dDoubleValue3 = d19 != null ? d19.doubleValue() : 0.0d;
                    do {
                        Object next4 = it3.next();
                        Double d24 = ((c) next4).f153539b;
                        double dDoubleValue4 = d24 != null ? d24.doubleValue() : 0.0d;
                        if (Double.compare(dDoubleValue3, dDoubleValue4) < 0) {
                            next = next4;
                            dDoubleValue3 = dDoubleValue4;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            c cVar2 = (c) next;
            if (cVar2 != null && (d14 = cVar2.f153539b) != null) {
                fValueOf2 = Float.valueOf(MathKt.b(d14.doubleValue()));
            }
        }
        j00.a aVar = j00.a.f95964a;
        p pVarA = j00.a.a(aVar, j00.a.c(aVar, fValueOf, 2.0f, 6.0f), j00.a.b(fValueOf2, 2.0f, 20.0f), 4);
        return new p(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl1.e
    public final float C(j jVar) {
        if (em1.e.a(jVar, i.RESPIRATION_AVERAGES)) {
            return ((Number) E(jVar).f128595b).floatValue();
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl1.e
    public final float D(j jVar) {
        if (em1.e.a(jVar, i.RESPIRATION_AVERAGES)) {
            return ((Number) E(jVar).f128594a).floatValue();
        }
        return 0.0f;
    }

    @Override // sl1.e, qz.c
    /* JADX INFO: renamed from: x */
    public final List<f> u(j jVar) {
        em1.f fVar = em1.f.f64626a;
        i iVar = i.RESPIRATION_AVERAGES;
        boolean zA = em1.e.a(jVar, iVar);
        fVar.getClass();
        return em1.f.a(this.f159983a, iVar, zA);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0143  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e1  */
    @Override // sl1.e
    public final List<IBarLineScatterCandleBubbleDataSet<?>> y(j jVar) throws Throwable {
        ArrayList arrayList;
        Context context;
        Throwable th3;
        DateTime dateTimeNow;
        Context context2;
        DateTimeZone dateTimeZone;
        int i14;
        int i15;
        DateTime dateTime;
        int i16;
        float fDoubleValue;
        int iIntValue;
        if (jVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<List> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List<c> list = jVar.f153593i;
        int i17 = 1;
        double d14 = 0.0d;
        if (list == null) {
            arrayList = null;
        } else if (list.size() <= 1) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : list) {
                Double d15 = ((c) obj).f153539b;
                if (d15 != null && d15.doubleValue() > 0.0d) {
                    arrayList5.add(obj);
                }
            }
            arrayList = arrayList5;
        } else {
            ArrayList arrayList6 = new ArrayList(list);
            Double d16 = ((c) h0.b0(arrayList6)).f153539b;
            if (d16 == null || d16.doubleValue() <= 0.0d) {
                arrayList6.set(0, c.a((c) arrayList6.get(0), ((c) arrayList6.get(1)).f153539b));
            }
            Double d17 = ((c) h0.m0(arrayList6)).f153539b;
            if (d17 == null || d17.doubleValue() <= 0.0d) {
                arrayList6.set(arrayList6.size() - 1, c.a((c) h0.m0(arrayList6), ((c) am.j.f(2, arrayList6)).f153539b));
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList6) {
                Double d18 = ((c) obj2).f153539b;
                if (d18 != null && d18.doubleValue() > 0.0d) {
                    arrayList.add(obj2);
                }
            }
        }
        h hVar = jVar.f153585a;
        Context context3 = this.f159983a;
        if (arrayList == null || hVar == null) {
            context = context3;
            th3 = null;
        } else {
            b bVar = jVar.D;
            if (bVar == null || (dateTimeNow = bVar.f153532a) == null) {
                dateTimeNow = DateTime.now();
            }
            DateTimeZone zone = dateTimeNow.getZone();
            int iA = (int) q(jVar);
            int size = arrayList.size();
            int i18 = 0;
            while (i18 < size) {
                c cVar = (c) arrayList.get(i18);
                em1.b bVar2 = em1.b.f64618a;
                double d19 = d14;
                int i19 = i17;
                Long lValueOf = Long.valueOf(cVar.f153538a - ((long) 3540000));
                zone.getClass();
                bVar2.getClass();
                Integer numB = em1.b.b(lValueOf, dateTimeNow, zone);
                if (numB == null) {
                    arrayList = arrayList;
                    context2 = context3;
                    dateTimeZone = zone;
                    i14 = size;
                    i15 = i18;
                    dateTime = dateTimeNow;
                } else {
                    int iIntValue2 = numB.intValue();
                    if (iIntValue2 < 0) {
                        i16 = iIntValue2;
                        iIntValue2 = 0;
                    } else {
                        i16 = 0;
                    }
                    if (iIntValue2 < 0 || iIntValue2 > iA) {
                        arrayList = arrayList;
                        context2 = context3;
                        dateTimeZone = zone;
                        i14 = size;
                        i15 = i18;
                        dateTime = dateTimeNow;
                    } else {
                        Double d24 = cVar.f153539b;
                        if (d24 == null) {
                            fDoubleValue = 0.0f;
                        } else {
                            if (d24.doubleValue() <= d19) {
                                d24 = null;
                            }
                            if (d24 != null) {
                                fDoubleValue = (float) d24.doubleValue();
                            } else {
                                fDoubleValue = 0.0f;
                            }
                        }
                        Entry entry = (Entry) h0.n0(arrayList4);
                        int x14 = entry != null ? ((int) entry.getX()) + 1 : 0;
                        int i24 = iIntValue2 - 1;
                        if (i24 > x14) {
                            context2 = context3;
                            dateTime = dateTimeNow;
                            i15 = i18;
                            i14 = size;
                            dateTimeZone = zone;
                            f0.m(arrayList4, context2, x14, i24, dateTime, 60, 0.0f, i.RESPIRATION_AVERAGES);
                        } else {
                            context2 = context3;
                            dateTimeZone = zone;
                            i14 = size;
                            dateTime = dateTimeNow;
                            i15 = i18;
                        }
                        int i25 = iIntValue2 + 59 + i16;
                        Integer numValueOf = Integer.valueOf(i25);
                        if (i25 > iA) {
                            numValueOf = null;
                        }
                        int iIntValue3 = numValueOf != null ? numValueOf.intValue() : iA;
                        if (i15 >= i19) {
                            int i26 = i15 - 1;
                            Integer numValueOf2 = Integer.valueOf(i26);
                            if (i26 >= arrayList.size()) {
                                numValueOf2 = null;
                            }
                            c cVar2 = numValueOf2 != null ? (c) arrayList.get(numValueOf2.intValue()) : null;
                            Integer numB2 = em1.b.b(cVar2 != null ? Long.valueOf(cVar2.f153538a) : null, dateTime, dateTimeZone);
                            if (numB2 != null && (iIntValue = numB2.intValue()) >= 0 && iIntValue <= iA && iIntValue > iIntValue2) {
                                iIntValue2 = iIntValue + 1;
                            }
                        }
                        f0.l(arrayList4, context2, iIntValue2, iIntValue3, dateTime, MathKt.c(fDoubleValue), i.RESPIRATION_AVERAGES);
                    }
                }
                i18 = i15 + 1;
                dateTimeNow = dateTime;
                zone = dateTimeZone;
                size = i14;
                i17 = 1;
                context3 = context2;
                arrayList = arrayList;
                d14 = d19;
            }
            context = context3;
            th3 = null;
            DateTime dateTime2 = dateTimeNow;
            Entry entry2 = (Entry) h0.n0(arrayList4);
            int x15 = entry2 != null ? ((int) entry2.getX()) + 1 : 0;
            if (iA >= x15) {
                f0.m(arrayList4, context, x15, iA, dateTime2, 60, 0.0f, i.RESPIRATION_AVERAGES);
            }
        }
        if (!arrayList4.isEmpty()) {
            int i27 = 0;
            int i28 = 0;
            for (Object obj3 : arrayList4) {
                int i29 = i28 + 1;
                if (i28 < 0) {
                    x.q();
                    throw th3;
                }
                Entry entry3 = (Entry) obj3;
                if (i28 > 0) {
                    float y14 = ((Entry) arrayList4.get(i28 - 1)).getY();
                    float y15 = entry3.getY();
                    if ((y14 > 0.0f && y15 <= 0.0f) || (y14 <= 0.0f && y15 > 0.0f)) {
                        arrayList3.add(arrayList4.subList(i27, i28));
                        i27 = i28;
                    }
                }
                i28 = i29;
            }
            if (i27 < arrayList4.size()) {
                arrayList3.add(arrayList4.subList(i27, arrayList4.size()));
            }
        }
        for (List list2 : arrayList3) {
            if (!list2.isEmpty()) {
                LineDataSet lineDataSet = new LineDataSet(list2, "RESPIRATION_AVERAGES");
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setColor(a7.b.getColor(context, R.color.gcm_chart_default_data_set));
                lineDataSet.setMode(LineDataSet.Mode.LINEAR);
                lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
                lineDataSet.setLineWidth(1.5f);
                lineDataSet.setHighlightEnabled(true);
                arrayList2.add(lineDataSet);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: bm1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lbm1/a$a;", "", "<init>", "()V", "", "Y_AXIS_MARGIN", "F", "Y_AXIS_MIN", "Y_AXIS_MAX", "", "RESPIRATION_MINUTES_INTERVAL", "I", "ONE_MINUTE_IN_MILLIS", "RESPIRATION_NO_VALUE", "SLEEP_START_X_INDEX", "", "DATA_SET_LABEL", "Ljava/lang/String;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0273a {
        public /* synthetic */ C0273a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0273a() {
        }
    }
}
