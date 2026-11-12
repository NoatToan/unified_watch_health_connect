package zl1;

import android.content.Context;
import c22.l3;
import c53.b0;
import c53.k;
import c53.n;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p13.g0;
import p13.h0;
import p13.j0;
import rl1.i;
import rm1.j;
import rm1.m;
import sl1.e;
import xz.f;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzl1/a;", "Lsl1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f205187e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cc1.a f205188d;

    static {
        new C3834a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
        this.f205188d = new cc1.a(context);
    }

    @Override // sl1.e
    public final float C(j jVar) {
        return em1.e.a(jVar, i.PULSE_OX) ? 100.0f : -100.0f;
    }

    @Override // sl1.e
    public final float D(j jVar) {
        return em1.e.a(jVar, i.PULSE_OX) ? 60.0f : -100.0f;
    }

    public final void E(ArrayList arrayList, float f14, DateTime dateTime) {
        Entry entry;
        List list = (List) h0.n0(arrayList);
        float x14 = (list == null || (entry = (Entry) h0.n0(list)) == null) ? 0.0f : entry.getX() + 1.0f;
        if (f14 > x14) {
            ArrayList arrayList2 = new ArrayList();
            int i14 = (int) f14;
            for (int i15 = (int) x14; i15 < i14; i15++) {
                DateTime dateTimePlusMinutes = dateTime.plusMinutes(i15);
                dateTimePlusMinutes.getClass();
                arrayList2.add(new Entry(i15, 0.0f, F(dateTimePlusMinutes, 0.0f)));
            }
            arrayList.add(arrayList2);
        }
    }

    public final l F(DateTime dateTime, float f14) {
        String string;
        String strB = this.f159984b.b(dateTime, this.f159985c);
        cc1.a aVar = this.f205188d;
        aVar.getClass();
        l22.a aVar2 = aVar.f26711a;
        if (f14 > 0.0f) {
            l3.f23124b.getClass();
            string = l3.f23131i.format(Integer.valueOf((int) f14));
            string.getClass();
        } else {
            string = aVar2.getString(R.string.no_value_card);
        }
        return new l(strB, string, aVar2.getString(R.string.pulse_ox_spo2_label), "%", null, f14 > 0.0f ? Integer.valueOf(R.color.gcm_chart_default_data_set) : null, null, null, 208, null);
    }

    @Override // sl1.e, qz.c
    /* JADX INFO: renamed from: x */
    public final List<f> u(j jVar) {
        em1.f fVar = em1.f.f64626a;
        i iVar = i.PULSE_OX;
        boolean zA = em1.e.a(jVar, iVar);
        fVar.getClass();
        return em1.f.a(this.f159983a, iVar, zA);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    @Override // sl1.e
    public final List<IBarLineScatterCandleBubbleDataSet<?>> y(j jVar) {
        Comparable comparable;
        List<m> list;
        if (jVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        rm1.b bVar = jVar.D;
        if (bVar == null) {
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            DateTime dateTimeNow2 = DateTime.now();
            dateTimeNow2.getClass();
            bVar = new rm1.b(dateTimeNow, dateTimeNow2, null, null, 12, null);
        }
        DateTime dateTime = bVar.f153532a;
        DateTime dateTime2 = bVar.f153533b;
        List<m> list2 = jVar.f153591g;
        if (list2 != null) {
            long jLongValue = DateTimeConstants.MILLIS_PER_MINUTE;
            k kVarA = n.a(new c53.m(new b0(new g0(list2), new z21.a((byte) 0, 23), null)).f24571a);
            if (kVarA.hasNext()) {
                comparable = (Comparable) kVarA.next();
                while (kVarA.hasNext()) {
                    Comparable comparable2 = (Comparable) kVarA.next();
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
            } else {
                comparable = null;
            }
            Long l14 = (Long) comparable;
            if (l14 != null && l14.longValue() != Long.MAX_VALUE && l14.longValue() > jLongValue) {
                jLongValue = l14.longValue();
            }
            int i14 = -1;
            int i15 = 0;
            while (i15 < list2.size()) {
                m mVar = list2.get(i15);
                if (mVar != null) {
                    String str = mVar.f153626a;
                    if (mVar.f153627b <= 0 || str == null) {
                        list = list2;
                    } else if (i14 >= 0) {
                        m mVar2 = list2.get(i14);
                        list = list2;
                        DateTimeZone dateTimeZone = DateTimeZone.UTC;
                        DateTime dateTimeL = c22.j0.L(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", dateTimeZone);
                        long millis = dateTimeL != null ? dateTimeL.getMillis() : 0L;
                        DateTime dateTimeL2 = c22.j0.L(mVar2.f153626a, "yyyy-MM-dd'T'HH:mm:ss.SSS", dateTimeZone);
                        if (millis - (dateTimeL2 != null ? dateTimeL2.getMillis() : 0L) > jLongValue) {
                        }
                    } else {
                        list = list2;
                    }
                    if (!arrayList3.isEmpty()) {
                        E(arrayList2, ((Entry) h0.b0(arrayList3)).getX(), dateTime);
                        arrayList2.add(arrayList3);
                        arrayList3 = new ArrayList();
                    }
                } else {
                    list = list2;
                    if (!arrayList3.isEmpty()) {
                        E(arrayList2, ((Entry) h0.b0(arrayList3)).getX(), dateTime);
                        arrayList2.add(arrayList3);
                        arrayList3 = new ArrayList();
                    }
                }
                DateTime dateTimeL3 = c22.j0.L(mVar.f153626a, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
                if (dateTimeL3 != null && dateTimeL3.compareTo(dateTime) >= 0 && dateTimeL3.compareTo(dateTime2) <= 0) {
                    int i16 = mVar.f153627b;
                    Integer numValueOf = i16 >= 60 ? Integer.valueOf(oc.b.v(dateTimeL3, dateTime)) : null;
                    if (numValueOf != null && i16 > 0) {
                        DateTime dateTimePlusMinutes = dateTime.plusMinutes(numValueOf.intValue());
                        dateTimePlusMinutes.getClass();
                        float f14 = i16;
                        arrayList3.add(new Entry(numValueOf.intValue(), f14, F(dateTimePlusMinutes, f14)));
                        i14 = i15;
                    }
                }
                i15++;
                list2 = list;
            }
        }
        if (!arrayList3.isEmpty()) {
            E(arrayList2, ((Entry) h0.b0(arrayList3)).getX(), dateTime);
            arrayList2.add(arrayList3);
        }
        if (em1.e.a(jVar, i.PULSE_OX)) {
            E(arrayList2, q(jVar) + 1, dateTime);
        }
        for (List list3 : arrayList2) {
            if (!list3.isEmpty()) {
                LineDataSet lineDataSet = new LineDataSet(list3, "PULSE_OX");
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
                lineDataSet.setLineWidth(1.5f);
                lineDataSet.setHighlightEnabled(true);
                lineDataSet.setColor(a7.b.getColor(this.f159983a, R.color.gcm_chart_default_data_set));
                arrayList.add(lineDataSet);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: zl1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzl1/a$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "PULSE_OX_NO_VALUE", "F", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3834a {
        public /* synthetic */ C3834a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3834a() {
        }
    }
}
