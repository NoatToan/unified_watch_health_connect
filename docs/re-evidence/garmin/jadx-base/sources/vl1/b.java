package vl1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i0;
import p13.h0;
import p13.j0;
import p13.t0;
import p13.x;
import rl1.i;
import rm1.h;
import rm1.j;
import xz.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvl1/b;", "Lsl1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends sl1.e {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
    }

    @Override // sl1.e
    public final float C(j jVar) {
        return vl1.a.FREQUENT.f178704a + 1;
    }

    @Override // sl1.e
    public final float D(j jVar) {
        return 0.0f;
    }

    @Override // sl1.e, qz.c
    /* JADX INFO: renamed from: x */
    public final List<f> u(j jVar) {
        em1.f fVar = em1.f.f64626a;
        i iVar = i.BREATHING_VARIATIONS;
        boolean zA = em1.e.a(jVar, iVar);
        fVar.getClass();
        return em1.f.a(this.f159983a, iVar, zA);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x020a  */
    @Override // sl1.e
    public final List<IBarLineScatterCandleBubbleDataSet<?>> y(j jVar) throws Throwable {
        ArrayList arrayList;
        ArrayList arrayList2;
        Context context;
        Throwable th3;
        boolean z14;
        ArrayList<List> arrayList3;
        boolean z15;
        ArrayList arrayList4;
        ArrayList arrayList5;
        DateTime dateTimeNow;
        DateTime dateTime;
        Context context2;
        int iIntValue;
        int i14;
        if (jVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        List<rm1.a> list = jVar.f153588d;
        h hVar = jVar.f153585a;
        Context context3 = this.f159983a;
        if (list == null || hVar == null) {
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            context = context3;
            th3 = null;
            z14 = true;
        } else {
            long j8 = hVar.f153568c;
            rm1.b bVar = jVar.D;
            if (bVar == null || (dateTimeNow = bVar.f153532a) == null) {
                dateTimeNow = DateTime.now();
            }
            DateTimeZone zone = dateTimeNow.getZone();
            int iA = (int) q(jVar);
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    x.q();
                    throw null;
                }
                rm1.a aVar = (rm1.a) obj;
                long j14 = aVar.f153529a;
                ArrayList arrayList9 = arrayList6;
                ArrayList arrayList10 = arrayList7;
                long j15 = aVar.f153530b;
                Integer num = aVar.f153531c;
                int iU = oc.b.u(j14, j8);
                em1.b bVar2 = em1.b.f64618a;
                Long lValueOf = Long.valueOf(j15);
                zone.getClass();
                bVar2.getClass();
                Integer numB = em1.b.b(lValueOf, dateTimeNow, zone);
                if (numB == null || (iIntValue = numB.intValue()) < 0 || iIntValue > iA) {
                    zone = zone;
                    dateTime = dateTimeNow;
                    context2 = context3;
                } else {
                    if (!((num != null ? num.intValue() : -10) >= 0)) {
                        num = null;
                    }
                    Number numberValueOf = num != null ? Float.valueOf(num.intValue()) : -10;
                    Entry entry = (Entry) h0.n0(arrayList8);
                    int x14 = entry != null ? ((int) entry.getX()) + 1 : 0;
                    int i17 = iIntValue - 1;
                    dateTime = dateTimeNow;
                    context2 = context3;
                    if (i17 > x14) {
                        f0.m(arrayList8, context2, x14, i17, dateTime, 1, -10.0f, i.BREATHING_VARIATIONS);
                    }
                    Integer numValueOf = Integer.valueOf(iU);
                    if (!(iU <= iA)) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue2 = numValueOf.intValue();
                        Integer numValueOf2 = Integer.valueOf(i16);
                        if (!(i16 < list.size())) {
                            numValueOf2 = null;
                        }
                        rm1.a aVar2 = numValueOf2 != null ? list.get(numValueOf2.intValue()) : null;
                        Integer numB2 = em1.b.b(aVar2 != null ? Long.valueOf(aVar2.f153530b) : null, dateTime, zone);
                        if (numB2 != null) {
                            int iIntValue3 = numB2.intValue();
                            if ((iIntValue3 >= 0 && iIntValue3 <= iA) && iIntValue3 <= iIntValue2) {
                                iIntValue2 = iIntValue3 - 1;
                            }
                        }
                        i14 = iIntValue2;
                    } else {
                        i14 = iA;
                    }
                    c cVar = new i0() { // from class: vl1.c
                        @Override // p005kotlin.jvm.internal.i0, k23.n
                        public final Object get(Object obj2) {
                            return Integer.valueOf(((a) obj2).f178704a);
                        }
                    };
                    Integer numValueOf3 = Integer.valueOf(numberValueOf.intValue());
                    vl1.a[] aVarArrValues = vl1.a.values();
                    int iA2 = t0.a(aVarArrValues.length);
                    if (iA2 < 16) {
                        iA2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA2);
                    int length = aVarArrValues.length;
                    int i18 = 0;
                    while (i18 < length) {
                        int i19 = iIntValue;
                        vl1.a aVar3 = aVarArrValues[i18];
                        linkedHashMap.put(cVar.invoke(aVar3), aVar3);
                        i18++;
                        iIntValue = i19;
                        arrayList8 = arrayList8;
                    }
                    int i24 = iIntValue;
                    ArrayList arrayList11 = arrayList8;
                    vl1.a aVar4 = (vl1.a) ((Enum) linkedHashMap.get(numValueOf3));
                    if (aVar4 == null) {
                        aVar4 = vl1.a.UNMEASURABLE;
                    }
                    arrayList8 = arrayList11;
                    f0.l(arrayList8, context2, i24, i14, dateTime, aVar4 == vl1.a.UNMEASURABLE ? -10.0f : aVar4.f178704a, i.BREATHING_VARIATIONS);
                }
                context3 = context2;
                dateTimeNow = dateTime;
                i15 = i16;
                zone = zone;
                arrayList6 = arrayList9;
                arrayList7 = arrayList10;
                j8 = j8;
            }
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            DateTime dateTime2 = dateTimeNow;
            context = context3;
            th3 = null;
            z14 = true;
            Entry entry2 = (Entry) h0.n0(arrayList8);
            int x15 = entry2 != null ? ((int) entry2.getX()) + 1 : 0;
            if (iA >= x15) {
                f0.m(arrayList8, context, x15, iA, dateTime2, 1, -10.0f, i.BREATHING_VARIATIONS);
            }
        }
        if (arrayList8.isEmpty()) {
            arrayList3 = arrayList2;
        } else {
            int i25 = 0;
            int i26 = 0;
            for (Object obj2 : arrayList8) {
                int i27 = i26 + 1;
                if (i26 < 0) {
                    x.q();
                    throw th3;
                }
                Entry entry3 = (Entry) obj2;
                if (i26 > 0) {
                    float y14 = ((Entry) arrayList8.get(i26 - 1)).getY();
                    float y15 = entry3.getY();
                    if ((y14 < 0.0f || y15 >= 0.0f) && (y14 >= 0.0f || y15 < 0.0f)) {
                        arrayList5 = arrayList2;
                    } else {
                        arrayList5 = arrayList2;
                        arrayList5.add(arrayList8.subList(i25, i26));
                        i25 = i26;
                    }
                } else {
                    arrayList5 = arrayList2;
                }
                arrayList2 = arrayList5;
                i26 = i27;
            }
            arrayList3 = arrayList2;
            if (i25 < arrayList8.size()) {
                arrayList3.add(arrayList8.subList(i25, arrayList8.size()));
            }
        }
        for (List list2 : arrayList3) {
            if (list2.isEmpty()) {
                z15 = z14;
                arrayList4 = arrayList;
            } else {
                LineDataSet lineDataSet = new LineDataSet(list2, "BREATHING_DISTURBANCES");
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setColor(a7.b.getColor(context, R.color.gcm_chart_default_data_set));
                lineDataSet.setMode(LineDataSet.Mode.LINEAR);
                lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
                lineDataSet.setLineWidth(1.5f);
                z15 = z14;
                lineDataSet.setHighlightEnabled(z15);
                arrayList4 = arrayList;
                arrayList4.add(lineDataSet);
            }
            z14 = z15;
            arrayList = arrayList4;
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvl1/b$a;", "", "<init>", "()V", "", "Y_AXIS_MIN", "F", "", "BREATHING_DISTURBANCES_STEP_MINUTES", "I", "BREATHING_DISTURBANCES_NO_VALUE", "SLEEP_START_X_INDEX", "", "DATA_SET_LABEL", "Ljava/lang/String;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
