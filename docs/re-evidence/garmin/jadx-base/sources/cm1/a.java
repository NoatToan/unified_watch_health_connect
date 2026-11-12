package cm1;

import android.content.Context;
import c22.t;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i0;
import p13.j0;
import p13.t0;
import p13.x;
import rl1.k;
import rm1.h;
import rm1.i;
import rm1.j;
import sl1.e;
import xz.f;
import xz.g;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcm1/a;", "Lsl1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27960f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b10.c f27961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final em1.c f27962e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27963a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.DEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.REM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.AWAKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27963a = iArr;
        }
    }

    static {
        new C0428a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
        this.f27961d = new b10.c(new l22.a(context));
        this.f27962e = new em1.c(new l22.a(context));
    }

    @Override // sl1.e
    public final int B(j jVar) {
        return (jVar == null || jVar.A) ? 5 : 4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000b  */
    @Override // sl1.e
    public final float C(j jVar) {
        boolean z14;
        k kVar = k.AWAKE;
        if (jVar != null) {
            z14 = jVar.A;
        }
        return oc.b.r(kVar, z14, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000b  */
    @Override // sl1.e
    public final float D(j jVar) {
        boolean z14;
        k kVar = k.NO_LEVELS;
        if (jVar != null) {
            z14 = jVar.A;
        }
        return oc.b.r(kVar, z14, false);
    }

    public final LineDataSet E(int i14, String str, ArrayList arrayList) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, str);
        Context context = this.f159983a;
        lineDataSet.setColor(a7.b.getColor(context, i14));
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillColor(a7.b.getColor(context, i14));
        lineDataSet.setFillAlpha(255);
        lineDataSet.setFillFormatter(new t(29));
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        lineDataSet.setMode(LineDataSet.Mode.STEPPED);
        lineDataSet.setHighlightEnabled(true);
        return lineDataSet;
    }

    public final l F(DateTime dateTime, k kVar) {
        String string;
        String strB = this.f159984b.b(dateTime, this.f159985c);
        b10.c cVar = this.f27962e.f64620b;
        int i14 = em1.c.a.f64621a[kVar.ordinal()];
        if (i14 == 1) {
            string = cVar.f14211a.getString(R.string.sleep_lbl_deep);
        } else if (i14 == 2) {
            string = cVar.f14211a.getString(R.string.sleep_lbl_light);
        } else if (i14 != 3) {
            string = i14 != 4 ? cVar.f14212b : cVar.f14211a.getString(R.string.sleep_lbl_awake);
        } else {
            string = cVar.f14211a.getString(R.string.sleep_lbl_rem);
        }
        String str = string;
        k kVar2 = k.NO_LEVELS;
        b10.c cVar2 = this.f27961d;
        return new l(strB, str, kVar != kVar2 ? cVar2.f14211a.getString(R.string.lbl_stage) : cVar2.f14211a.getString(R.string.allday_stress_unmeasurable), null, null, Integer.valueOf(kVar != kVar2 ? kVar.f153448b : R.color.transparent), kVar != kVar2 ? null : Integer.valueOf(R.drawable.unmeasurable_sleep_highlight_icon), null, SyslogConstants.LOG_LOCAL3, null);
    }

    @Override // sl1.e, qz.c
    /* JADX INFO: renamed from: x */
    public final List<f> u(j jVar) {
        h hVar;
        h hVar2;
        h hVar3;
        em1.f fVar = em1.f.f64626a;
        boolean z14 = true;
        boolean z15 = jVar != null && jVar.A;
        boolean z16 = (jVar == null || (hVar3 = jVar.f153585a) == null || !hVar3.f153577l) ? false : true;
        if (((jVar == null || (hVar2 = jVar.f153585a) == null) ? 0 : hVar2.f153572g) <= 0) {
            if (!((jVar == null || (hVar = jVar.f153585a) == null || !hVar.f153578m) ? false : true)) {
                z14 = false;
            }
        }
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        Context context = this.f159983a;
        String string = context.getString(R.string.sleep_lbl_deep);
        string.getClass();
        Integer numValueOf = Integer.valueOf(a7.b.getColor(context, k.DEEP.f153448b));
        g.a aVar = g.a.f192745a;
        arrayList.add(new f(string, null, numValueOf, null, aVar, null, null, 106, null));
        String string2 = context.getString(R.string.sleep_lbl_light);
        string2.getClass();
        arrayList.add(new f(string2, null, Integer.valueOf(a7.b.getColor(context, k.LIGHT.f153448b)), null, aVar, null, null, 106, null));
        if (z15) {
            String string3 = context.getString(R.string.sleep_lbl_rem);
            string3.getClass();
            arrayList.add(new f(string3, null, Integer.valueOf(a7.b.getColor(context, k.REM.f153448b)), null, aVar, null, null, 106, null));
        }
        String string4 = context.getString(R.string.sleep_lbl_awake);
        string4.getClass();
        arrayList.add(new f(string4, null, Integer.valueOf(a7.b.getColor(context, k.AWAKE.f153448b)), null, aVar, null, null, 106, null));
        if (z14) {
            String string5 = context.getString(R.string.allday_stress_unmeasurable);
            string5.getClass();
            arrayList.add(new f(string5, null, Integer.valueOf(a7.b.getColor(context, k.NO_LEVELS.f153448b)), null, g.h.f192753a, null, null, 106, null));
        }
        if (z16) {
            String string6 = context.getString(R.string.sleep_lbl_manual);
            string6.getClass();
            arrayList.add(new f(string6, null, Integer.valueOf(a7.b.getColor(context, k.MANUAL.f153448b)), null, aVar, null, null, 106, null));
        }
        return arrayList;
    }

    @Override // sl1.e
    public final List<IBarLineScatterCandleBubbleDataSet<?>> y(j jVar) {
        DateTime dateTimeNow;
        long j8;
        ArrayList arrayList;
        if (jVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList2 = new ArrayList();
        h hVar = jVar.f153585a;
        if (hVar != null) {
            boolean z14 = jVar.E.f153420f;
            List<i> list = jVar.f153587c;
            if (list != null && !list.isEmpty() && !z14) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                long j14 = hVar.f153568c;
                rm1.b bVar = jVar.D;
                if (bVar == null || (dateTimeNow = bVar.f153532a) == null) {
                    dateTimeNow = DateTime.now();
                }
                boolean z15 = jVar.A;
                int size = list.size() - 1;
                Iterator it = list.iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        ArrayList arrayList8 = arrayList6;
                        ArrayList arrayList9 = arrayList7;
                        LineDataSet lineDataSetE = E(R.color.transparent, "NO_LEVELS", arrayList3);
                        LineDataSet lineDataSetE2 = E(k.DEEP.f153448b, "DEEP", arrayList4);
                        LineDataSet lineDataSetE3 = E(k.LIGHT.f153448b, "LIGHT", arrayList5);
                        LineDataSet lineDataSetE4 = arrayList8.isEmpty() ? null : E(k.REM.f153448b, "REM", arrayList8);
                        LineDataSet lineDataSetE5 = E(k.AWAKE.f153448b, "AWAKE", arrayList9);
                        arrayList2.add(lineDataSetE);
                        arrayList2.add(lineDataSetE2);
                        arrayList2.add(lineDataSetE3);
                        if (lineDataSetE4 != null) {
                            arrayList2.add(lineDataSetE4);
                        }
                        arrayList2.add(lineDataSetE5);
                        break;
                    }
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    i iVar = (i) next;
                    int i16 = i14;
                    double d14 = iVar.f153582a;
                    Iterator it3 = it;
                    DateTime dateTime = iVar.f153583b;
                    DateTime dateTime2 = iVar.f153584c;
                    ArrayList arrayList10 = arrayList6;
                    ArrayList arrayList11 = arrayList7;
                    Integer numValueOf = dateTime != null ? Integer.valueOf(oc.b.u(dateTime.getMillis(), j14)) : null;
                    Integer numValueOf2 = dateTime2 != null ? Integer.valueOf(oc.b.u(dateTime2.getMillis(), j14)) : null;
                    if (numValueOf == null || numValueOf2 == null) {
                        j8 = j14;
                    } else {
                        cm1.b bVar2 = new i0() { // from class: cm1.b
                            @Override // p005kotlin.jvm.internal.i0, k23.n
                            public final Object get(Object obj) {
                                return Integer.valueOf(((k) obj).f153447a);
                            }
                        };
                        Integer numValueOf3 = Integer.valueOf((int) d14);
                        k[] kVarArrValues = k.values();
                        int iA = t0.a(kVarArrValues.length);
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                        int length = kVarArrValues.length;
                        Integer num = numValueOf;
                        int i17 = 0;
                        while (i17 < length) {
                            int i18 = i17;
                            k kVar = kVarArrValues[i18];
                            linkedHashMap.put(bVar2.invoke(kVar), kVar);
                            i17 = i18 + 1;
                            j14 = j14;
                        }
                        j8 = j14;
                        k kVar2 = (k) ((Enum) linkedHashMap.get(numValueOf3));
                        if (kVar2 == null) {
                            kVar2 = k.NO_LEVELS;
                        }
                        float fR = oc.b.r(kVar2, z15, false);
                        int i19 = b.f27963a[kVar2.ordinal()];
                        if (i19 == 1) {
                            arrayList = arrayList4;
                        } else if (i19 == 2) {
                            arrayList = arrayList5;
                        } else if (i19 != 3) {
                            arrayList = i19 != 4 ? arrayList3 : arrayList11;
                        } else {
                            arrayList = arrayList10;
                        }
                        int iIntValue = numValueOf2.intValue();
                        for (int iIntValue2 = num.intValue(); iIntValue2 < iIntValue; iIntValue2++) {
                            DateTime dateTimePlusMinutes = dateTimeNow.plusMinutes(iIntValue2);
                            dateTimePlusMinutes.getClass();
                            arrayList.add(new Entry(iIntValue2, fR, F(dateTimePlusMinutes, kVar2)));
                        }
                        boolean z16 = i16 == size;
                        if (!z16) {
                            fR = -10.0f;
                        }
                        Entry entry = new Entry(numValueOf2.intValue(), fR);
                        if (z16) {
                            DateTime dateTimePlusMinutes2 = dateTimeNow.plusMinutes(numValueOf2.intValue());
                            dateTimePlusMinutes2.getClass();
                            entry.setData(F(dateTimePlusMinutes2, kVar2));
                        }
                        arrayList.add(entry);
                    }
                    i14 = i15;
                    it = it3;
                    arrayList6 = arrayList10;
                    arrayList7 = arrayList11;
                    j14 = j8;
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: cm1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcm1/a$a;", "", "<init>", "()V", "", "INVALID_CHART_VALUE", "F", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0428a {
        public /* synthetic */ C0428a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0428a() {
        }
    }
}
