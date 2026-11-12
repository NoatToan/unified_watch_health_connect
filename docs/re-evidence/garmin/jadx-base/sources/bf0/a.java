package bf0;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import gs1.m;
import gs1.t;
import j23.l;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.p0;
import p13.x;
import yz.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbf0/a;", "Lqz/c;", "Lgs1/t;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyz/k;", "timeFormatter", "<init>", "(Landroid/content/Context;Lyz/k;)V", "a", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a implements qz.c<t, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f17791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.a f17792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xz.f f17798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f17799j;

    static {
        new C0253a(null);
    }

    public a(Context context, k kVar) {
        context.getClass();
        kVar.getClass();
        this.f17790a = context;
        this.f17791b = kVar;
        l22.a aVar = new l22.a(context);
        this.f17792c = aVar;
        this.f17793d = aVar.getString(R.string.lbl_bpm);
        this.f17794e = aVar.getString(R.string.lbl_heart_rate_cap);
        this.f17795f = aVar.getString(R.string.lbl_zone);
        this.f17798i = new xz.f(aVar.getString(R.string.lbl_abnormal_hr_alert), a7.b.getDrawable(context, 2131232636), null, null, null, null, null, 124, null);
        this.f17799j = a7.b.getDrawable(context, R.drawable.heart_rate_alert_chart_item_view);
    }

    @Override // qz.c
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final float i(t tVar) {
        int i14;
        Integer maxHeartRate;
        m heartRateZonesDTO;
        gs1.d allDayHeartRateDTO;
        m.b payload = null;
        gs1.d.c payload2 = (tVar == null || (allDayHeartRateDTO = tVar.getAllDayHeartRateDTO()) == null) ? null : allDayHeartRateDTO.getPayload();
        if (tVar != null && (heartRateZonesDTO = tVar.getHeartRateZonesDTO()) != null) {
            payload = heartRateZonesDTO.getPayload();
        }
        int iIntValue = 0;
        int iIntValue2 = (payload2 == null || (maxHeartRate = payload2.getMaxHeartRate()) == null) ? 0 : maxHeartRate.intValue();
        if (payload != null) {
            if (payload.f78831k == null) {
                List<Integer> listB = payload.b();
                if (listB == null || (i14 = (Integer) h0.n0(listB)) == null) {
                    i14 = -1;
                }
                payload.f78831k = i14;
            }
            Integer num = payload.f78831k;
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        int iMax = Math.max(iIntValue, iIntValue2);
        if (iIntValue2 == 0) {
            return 200.0f;
        }
        fz.a.f73959a.getClass();
        return (float) fz.a.h(((double) iMax) + 5.0d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    @Override // qz.c
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final float t(t tVar) {
        int iIntValue;
        Integer minHeartRate;
        Integer minHeartRate2;
        Integer maxHeartRate;
        int i14;
        gs1.d allDayHeartRateDTO;
        m heartRateZonesDTO;
        Double dValueOf = null;
        m.b payload = (tVar == null || (heartRateZonesDTO = tVar.getHeartRateZonesDTO()) == null) ? null : heartRateZonesDTO.getPayload();
        gs1.d.c payload2 = (tVar == null || (allDayHeartRateDTO = tVar.getAllDayHeartRateDTO()) == null) ? null : allDayHeartRateDTO.getPayload();
        int iIntValue2 = 200;
        if (payload == null) {
            iIntValue = 200;
        } else {
            if (payload.f78831k == null) {
                List<Integer> listB = payload.b();
                if (listB == null || (i14 = (Integer) h0.n0(listB)) == null) {
                    i14 = -1;
                }
                payload.f78831k = i14;
            }
            Integer num = payload.f78831k;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 200;
            }
        }
        if (payload2 != null && (maxHeartRate = payload2.getMaxHeartRate()) != null) {
            iIntValue2 = maxHeartRate.intValue();
        }
        int iMax = Math.max(iIntValue, iIntValue2);
        if (((payload2 == null || (minHeartRate2 = payload2.getMinHeartRate()) == null) ? 0 : minHeartRate2.intValue()) == 0) {
            return 0.0f;
        }
        if (payload2 != null && (minHeartRate = payload2.getMinHeartRate()) != null) {
            dValueOf = Double.valueOf(minHeartRate.intValue());
        }
        return xy2.b.y(dValueOf, iMax);
    }

    @Override // qz.c
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public List<xz.f> u(t tVar) {
        gs1.d.c payload;
        gs1.d.c payload2;
        if (tVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (tVar.s()) {
            arrayList.add(this.f17798i);
        }
        gs1.d allDayHeartRateDTO = tVar.getAllDayHeartRateDTO();
        Integer lowAbnormalHrThresholdValue = (allDayHeartRateDTO == null || (payload2 = allDayHeartRateDTO.getPayload()) == null) ? null : payload2.getLowAbnormalHrThresholdValue();
        Context context = this.f17790a;
        l22.a aVar = this.f17792c;
        if (lowAbnormalHrThresholdValue != null) {
            arrayList.add(new xz.f(aVar.a(R.string.lbl_low_abnormal_hr, lowAbnormalHrThresholdValue), null, Integer.valueOf(context.getColor(R.color.palette_red_15)), null, new xz.g.c(2, 0.0f, 2, null), null, null, 106, null));
        }
        gs1.d allDayHeartRateDTO2 = tVar.getAllDayHeartRateDTO();
        Integer abnormalHrThresholdValue = (allDayHeartRateDTO2 == null || (payload = allDayHeartRateDTO2.getPayload()) == null) ? null : payload.getAbnormalHrThresholdValue();
        if (abnormalHrThresholdValue != null) {
            arrayList.add(new xz.f(aVar.a(R.string.lbl_high_abnormal_hr, abnormalHrThresholdValue), null, Integer.valueOf(context.getColor(R.color.palette_red_15)), null, new xz.g.c(2, 0.0f, 2, null), null, null, 106, null));
        }
        return arrayList;
    }

    @Override // qz.c
    public final Integer c(t tVar) {
        return Integer.valueOf(MathKt.c(1440.0f));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(t tVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(t tVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List g(t tVar) {
        zw.b bVar = new zw.b(3);
        return zx0.m.g(this.f17790a, tVar, bVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(t tVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(t tVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(t tVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(t tVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(t tVar) {
        return 1440.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(t tVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(t tVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(t tVar) {
        return 0.0f;
    }

    @Override // qz.c
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final List<ILineDataSet> a(t tVar) throws ParseException {
        List<gs1.d.b> listF;
        List<gs1.d.b> listB;
        k kVar;
        Context context;
        LineDataSet lineDataSet;
        LineDataSet lineDataSet2;
        gs1.d.b bVar;
        Integer num;
        m heartRateZonesDTO;
        m.b payload;
        gs1.d allDayHeartRateDTO;
        gs1.d.c payload2 = (tVar == null || (allDayHeartRateDTO = tVar.getAllDayHeartRateDTO()) == null) ? null : allDayHeartRateDTO.getPayload();
        List<Integer> listB2 = (tVar == null || (heartRateZonesDTO = tVar.getHeartRateZonesDTO()) == null || (payload = heartRateZonesDTO.getPayload()) == null) ? null : payload.b();
        DateTime dateTimeK = payload2 != null ? payload2.k() : null;
        if (payload2 == null || (listF = payload2.f()) == null) {
            listF = j0.f134944a;
        }
        if (payload2 == null || (listB = payload2.b()) == null) {
            listB = j0.f134944a;
        }
        df0.c.f59441a.getClass();
        df0.c.f59442b = listB2;
        ArrayList arrayList = new ArrayList();
        int entryCount = 0;
        while (true) {
            int size = listF.size();
            int i14 = 2;
            kVar = this.f17791b;
            context = this.f17790a;
            if (entryCount >= size) {
                break;
            }
            List<gs1.d.b> listSubList = listF.subList(entryCount, listF.size());
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext() && (num = (bVar = (gs1.d.b) it.next()).f78714b) != null && num.intValue() != 0) {
                DateTime dateTimeNow = dateTimeK == null ? DateTime.now() : dateTimeK;
                DateTime dateTimeNow2 = bVar.f78713a;
                if (dateTimeNow2 == null) {
                    dateTimeNow2 = DateTime.now();
                }
                float minutes = Minutes.minutesBetween(dateTimeNow, dateTimeNow2).getMinutes();
                String strA = kVar.a(minutes);
                String strA2 = kVar.a(i14 + minutes);
                this.f17797h = num.intValue() + this.f17797h;
                int iIntValue = num.intValue();
                df0.b.f59440a.getClass();
                df0.c cVar = df0.c.f59441a;
                cVar.getClass();
                Integer numValueOf = Integer.valueOf(df0.b.a(df0.c.a(num)));
                cVar.getClass();
                int iA = df0.c.a(num);
                String strValueOf = iA == 0 ? "<1" : String.valueOf(iA);
                int i15 = this.f17796g;
                this.f17796g = i15 + 1;
                arrayList2.add(new Entry(minutes, num.intValue(), new cf0.a(strA, strA2, iIntValue, this.f17793d, this.f17794e, numValueOf, strValueOf, this.f17795f, i15, this.f17797h, null, null, 3072, null)));
                listB = listB;
                i14 = 2;
            }
            List<gs1.d.b> list = listB;
            if (arrayList2.isEmpty()) {
                lineDataSet2 = null;
            } else {
                lineDataSet2 = new LineDataSet(arrayList2, "");
                lineDataSet2.setDrawValues(false);
                lineDataSet2.setDrawCircleHole(false);
                lineDataSet2.setDrawCircles(false);
                lineDataSet2.setDrawHorizontalHighlightIndicator(false);
                lineDataSet2.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
                lineDataSet2.setHighlightLineWidth(1.0f);
                lineDataSet2.setLineWidth(2.0f);
                lineDataSet2.setColor(context.getColor(df0.b.a(0)));
            }
            if (lineDataSet2 != null) {
                arrayList.add(lineDataSet2);
                entryCount += lineDataSet2.getEntryCount();
            } else {
                entryCount++;
            }
            listB = list;
        }
        List<gs1.d.b> list2 = listB;
        ArrayList arrayList3 = new ArrayList();
        for (gs1.d.b bVar2 : list2) {
            Integer num2 = bVar2.f78714b;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                DateTime dateTimeNow3 = dateTimeK == null ? DateTime.now() : dateTimeK;
                DateTime dateTimeNow4 = bVar2.f78713a;
                if (dateTimeNow4 == null) {
                    dateTimeNow4 = DateTime.now();
                }
                int minutes2 = Minutes.minutesBetween(dateTimeNow3, dateTimeNow4).getMinutes();
                if (minutes2 % 2 != 0) {
                    minutes2--;
                }
                float f14 = minutes2;
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Collection entriesForXValue = ((ILineDataSet) it3.next()).getEntriesForXValue(f14);
                    entriesForXValue.getClass();
                    d0.v(arrayList4, entriesForXValue);
                }
                l22.a aVar = this.f17792c;
                String string = aVar.getString(R.string.device_settings_alert);
                String string2 = iIntValue2 <= 60 ? aVar.getString(R.string.lbl_heart_rate_low_short) : iIntValue2 >= 100 ? aVar.getString(R.string.lbl_heart_rate_high_short) : null;
                boolean zIsEmpty = arrayList4.isEmpty();
                Drawable drawable = this.f17799j;
                if (zIsEmpty) {
                    String strA3 = kVar.a(f14);
                    String strA4 = kVar.a(2 + f14);
                    df0.c cVar2 = df0.c.f59441a;
                    Integer numValueOf2 = Integer.valueOf(iIntValue2);
                    cVar2.getClass();
                    int iA2 = df0.c.a(numValueOf2);
                    String strValueOf2 = iA2 == 0 ? "<1" : String.valueOf(iA2);
                    int i16 = this.f17796g;
                    this.f17796g = i16 + 1;
                    arrayList3.add(new Entry(f14, iIntValue2, drawable, new cf0.a(strA3, strA4, iIntValue2, this.f17793d, this.f17794e, Integer.valueOf(R.color.red_40), strValueOf2, this.f17795f, i16, this.f17797h, string2, string)));
                } else {
                    Object data = ((Entry) arrayList4.get(0)).getData();
                    data.getClass();
                    cf0.a aVar2 = (cf0.a) data;
                    aVar2.f27005c = iIntValue2;
                    aVar2.f27008f = Integer.valueOf(R.color.red_40);
                    aVar2.f27014l = string;
                    aVar2.f27013k = string2;
                    arrayList3.add(new Entry(f14, iIntValue2, drawable, aVar2));
                }
            }
            dateTimeK = dateTimeK;
        }
        if (arrayList3.isEmpty()) {
            lineDataSet = null;
        } else {
            LineDataSet lineDataSet3 = new LineDataSet(arrayList3, "");
            lineDataSet3.setDrawValues(false);
            lineDataSet3.setDrawCircleHole(false);
            lineDataSet3.setDrawCircles(false);
            lineDataSet3.setDrawIcons(true);
            lineDataSet3.setDrawHorizontalHighlightIndicator(false);
            lineDataSet3.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
            lineDataSet3.setHighlightLineWidth(1.0f);
            lineDataSet3.setLineWidth(2.0f);
            lineDataSet3.setColor(context.getColor(R.color.transparent));
            lineDataSet = lineDataSet3;
        }
        if (lineDataSet != null) {
            arrayList.add(lineDataSet);
        }
        return arrayList;
    }

    @Override // qz.c
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final Shader b(t tVar, float f14, float f15) {
        float[] fArrY0;
        Integer num;
        gs1.d allDayHeartRateDTO;
        gs1.d.c payload;
        m heartRateZonesDTO;
        m.b payload2;
        List<Integer> listB = (tVar == null || (heartRateZonesDTO = tVar.getHeartRateZonesDTO()) == null || (payload2 = heartRateZonesDTO.getPayload()) == null) ? null : payload2.b();
        Integer maxHeartRate = (tVar == null || (allDayHeartRateDTO = tVar.getAllDayHeartRateDTO()) == null || (payload = allDayHeartRateDTO.getPayload()) == null) ? null : payload.getMaxHeartRate();
        if (maxHeartRate == null || listB == null || listB.isEmpty()) {
            return null;
        }
        int[] iArrW = xy2.b.w(this.f17790a, listB);
        int iIntValue = maxHeartRate.intValue();
        float fI = i(tVar);
        float fT = t(tVar);
        float f16 = fI - fT;
        if (f16 <= 0.0f) {
            fArrY0 = new float[0];
        } else {
            l lVarI = x.i(listB);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = lVarI.iterator();
            while (((j23.k) it).f96801c) {
                int iNextInt = ((p0) it).nextInt();
                Integer num2 = (Integer) h0.e0(iNextInt - 1, listB);
                float fIntValue = num2 != null ? num2.intValue() : 0.0f;
                arrayList.add(Float.valueOf(((((((iNextInt == listB.size() + (-1) || (num = listB.get(iNextInt)) == null) ? iIntValue : num.intValue()) - fIntValue) / 2) + fIntValue) - fT) / f16));
            }
            fArrY0 = h0.Y0(arrayList);
        }
        return new LinearGradient(0.0f, f14, 0.0f, f15, iArrW, fArrY0, Shader.TileMode.CLAMP);
    }

    @Override // qz.c
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final List<LimitLine> f(t tVar) {
        gs1.d.c payload;
        Integer lowAbnormalHrThresholdValue;
        gs1.d.c payload2;
        Integer abnormalHrThresholdValue;
        ArrayList arrayList = new ArrayList();
        if (tVar != null && tVar.y()) {
            int color = this.f17790a.getColor(R.color.red_40);
            gs1.d allDayHeartRateDTO = tVar.getAllDayHeartRateDTO();
            int iIntValue = 0;
            int iIntValue2 = (allDayHeartRateDTO == null || (payload2 = allDayHeartRateDTO.getPayload()) == null || (abnormalHrThresholdValue = payload2.getAbnormalHrThresholdValue()) == null) ? 0 : abnormalHrThresholdValue.intValue();
            if (iIntValue2 > 0) {
                LimitLine limitLine = new LimitLine(iIntValue2);
                limitLine.setLineWidth(2.0f);
                limitLine.setLineColor(color);
                limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
                arrayList.add(limitLine);
            }
            gs1.d allDayHeartRateDTO2 = tVar.getAllDayHeartRateDTO();
            if (allDayHeartRateDTO2 != null && (payload = allDayHeartRateDTO2.getPayload()) != null && (lowAbnormalHrThresholdValue = payload.getLowAbnormalHrThresholdValue()) != null) {
                iIntValue = lowAbnormalHrThresholdValue.intValue();
            }
            if (iIntValue > 0) {
                LimitLine limitLine2 = new LimitLine(iIntValue);
                limitLine2.setLineWidth(2.0f);
                limitLine2.setLineColor(color);
                limitLine2.enableDashedLine(10.0f, 10.0f, 0.0f);
                arrayList.add(limitLine2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: bf0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lbf0/a$a;", "", "<init>", "()V", "", "HEART_RATE_DATA_INTERVAL", "I", "HEAR_RATE_LEGEND_ITEM_DASH_LINE_COUNT", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0253a {
        public /* synthetic */ C0253a(j jVar) {
            this();
        }

        private C0253a() {
        }
    }
}
