package f61;

import android.content.Context;
import android.graphics.Shader;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import i3.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.m;
import o13.t;
import o71.f;
import o71.g;
import o71.h;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lf61/a;", "Lqz/c;", "Lo71/f;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<f, ILineDataSet> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1429a f69196b = new C1429a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f69197c = m.b(new ey0.a(20));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f69198a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69199a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130201g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130202h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f130205k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.f130203i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.f130204j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f69199a = iArr;
        }
    }

    public a(Context context) {
        context.getClass();
        this.f69198a = context;
    }

    public static float x(float f14, int i14, int i15) {
        t tVar = f69197c;
        C1429a c1429a = f69196b;
        if (i14 == i15) {
            c1429a.getClass();
            return ((Number) ((List) tVar.getValue()).get(i14)).floatValue();
        }
        int i16 = (i14 + i15) / 2;
        c1429a.getClass();
        return f14 <= ((Number) ((List) tVar.getValue()).get(i16)).floatValue() ? x(f14, i14, i16) : x(f14, i16 + 1, i15);
    }

    public static LineDataSet z(int i14, ArrayList arrayList) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setCircleColor(i14);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setColor(i14);
        lineDataSet.setHighLightColor(-1);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawValues(false);
        return lineDataSet;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x017b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0183  */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX WARN: Code duplicated, block: B:50:0x018a  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01be  */
    /* JADX WARN: Code duplicated, block: B:61:0x01da  */
    /* JADX WARN: Code duplicated, block: B:62:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x0203  */
    /* JADX WARN: Code duplicated, block: B:74:0x0211  */
    /* JADX WARN: Code duplicated, block: B:75:0x021c  */
    /* JADX WARN: Code duplicated, block: B:79:0x023c  */
    /* JADX WARN: Code duplicated, block: B:81:0x024b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0258 A[SYNTHETIC] */
    @Override // qz.c
    public final List<ILineDataSet> a(f fVar) {
        f fVar2;
        Iterator it;
        Float f14;
        boolean z14;
        String strPrint;
        String str;
        q13.b bVarB;
        String string;
        String string2;
        q13.b bVarA;
        String string3;
        String string4;
        Float f15;
        Float f16;
        f fVar3 = fVar;
        if ((fVar3 != null ? fVar3.f130192c : null) == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<LocalDate> list = fVar3.f130191b;
        h hVar = fVar3.f130190a;
        Iterator it3 = list.iterator();
        int i14 = 0;
        while (true) {
            boolean zHasNext = it3.hasNext();
            Context context = this.f69198a;
            if (!zHasNext) {
                hVar.getClass();
                return x.k(z(context.getColor(R.color.gds_data_viz_neutral_secondary), arrayList2), z(context.getColor(R.color.gds_data_viz_blue_primary), arrayList));
            }
            Object next = it3.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            f.a aVar = fVar3.f130192c.get((LocalDate) next);
            if (aVar == null) {
                fVar2 = fVar3;
                it = it3;
            } else {
                Float f17 = aVar.f130198b;
                Float f18 = aVar.f130197a;
                LocalDate localDate = fVar3.f130191b.get(i14);
                Integer num = fVar3.f130193d;
                g gVar = fVar3.f130194e;
                boolean z15 = fVar3.f130195f;
                int i16 = b.f69199a[gVar.ordinal()];
                fVar2 = fVar3;
                if (i16 == 1 || i16 == 2 || i16 == 3) {
                    it = it3;
                    f14 = f18;
                    z14 = z15;
                    t tVar = n71.f.f124834a;
                    localDate.getClass();
                    if (localDate.getYear() == DateTime.now().getYear()) {
                        strPrint = ((DateTimeFormatter) n71.f.f124838e.getValue()).print(localDate);
                        strPrint.getClass();
                    } else {
                        strPrint = ((DateTimeFormatter) n71.f.f124836c.getValue()).print(localDate);
                        strPrint.getClass();
                    }
                } else {
                    if (i16 == 4) {
                        LocalDate localDatePlusDays = localDate.plusDays(6);
                        localDatePlusDays.getClass();
                        t tVar2 = n71.f.f124834a;
                        it = it3;
                        f14 = f18;
                        if (localDate.getYear() != localDatePlusDays.getYear()) {
                            t tVar3 = n71.f.f124836c;
                            strPrint = e5.g(((DateTimeFormatter) tVar3.getValue()).print(localDate), " – ", ((DateTimeFormatter) tVar3.getValue()).print(localDatePlusDays));
                        } else if (localDate.getMonthOfYear() != localDatePlusDays.getMonthOfYear()) {
                            t tVar4 = n71.f.f124837d;
                            strPrint = n71.f.a(localDate.getYear(), e5.g(((DateTimeFormatter) tVar4.getValue()).print(localDate), " – ", ((DateTimeFormatter) tVar4.getValue()).print(localDatePlusDays)));
                        } else {
                            String strPrint2 = ((DateTimeFormatter) n71.f.f124834a.getValue()).print(localDate);
                            t tVar5 = n71.f.f124835b;
                            z14 = z15;
                            strPrint = n71.f.a(localDate.getYear(), j20.x.d(strPrint2, StringUtils.SPACE, ((DateTimeFormatter) tVar5.getValue()).print(localDate), "–", ((DateTimeFormatter) tVar5.getValue()).print(localDatePlusDays)));
                        }
                        z14 = z15;
                    } else {
                        if (i16 != 5) {
                            u0.r();
                            return null;
                        }
                        t tVar6 = n71.f.f124834a;
                        localDate.getClass();
                        String strPrint3 = ((DateTimeFormatter) n71.f.f124839f.getValue()).print(localDate);
                        strPrint3.getClass();
                        str = strPrint3;
                        it = it3;
                        f14 = f18;
                        z14 = z15;
                    }
                    bVarB = w.b();
                    if (f14 == null) {
                        string = context.getString(R.string.symbol_double_dash);
                        string.getClass();
                    } else {
                        if (f14.floatValue() > 0.0f) {
                            f16 = f14;
                        } else {
                            f16 = null;
                        }
                        if (f16 != null) {
                            float fFloatValue = f16.floatValue();
                            l3.f23124b.getClass();
                            string = l3.f23131i.format(Float.valueOf(fFloatValue));
                            if (string == null) {
                                string = context.getString(R.string.symbol_double_dash);
                                string.getClass();
                            }
                        } else {
                            string = context.getString(R.string.symbol_double_dash);
                            string.getClass();
                        }
                    }
                    String str2 = string;
                    String string5 = context.getString(hVar.f130229c);
                    if (num != null) {
                        string2 = context.getString(num.intValue());
                    } else {
                        string2 = null;
                    }
                    bVarB.add(new l(str, str2, string5, string2, null, Integer.valueOf(R.color.gds_data_viz_blue_primary), null, null, 208, null));
                    if (z14) {
                        if (f17 == null) {
                            string3 = context.getString(R.string.symbol_double_dash);
                            string3.getClass();
                        } else {
                            if (f17.floatValue() > 0.0f) {
                                f15 = f17;
                            } else {
                                f15 = null;
                            }
                            if (f15 != null) {
                                float fFloatValue2 = f15.floatValue();
                                l3.f23124b.getClass();
                                string3 = l3.f23131i.format(Float.valueOf(fFloatValue2));
                                if (string3 == null) {
                                    string3 = context.getString(R.string.symbol_double_dash);
                                    string3.getClass();
                                }
                            } else {
                                string3 = context.getString(R.string.symbol_double_dash);
                                string3.getClass();
                            }
                        }
                        String str3 = string3;
                        String strY = y(gVar);
                        if (num != null) {
                            string4 = context.getString(num.intValue());
                        } else {
                            string4 = null;
                        }
                        bVarB.add(new l(str, str3, strY, string4, null, Integer.valueOf(R.color.gds_data_viz_neutral_secondary), null, null, 208, null));
                    }
                    bVarA = w.a(bVarB);
                    if (f14 != null) {
                        arrayList.add(new Entry(i14, f14.floatValue(), bVarA));
                    }
                    if (f17 != null) {
                        arrayList2.add(new Entry(i14, f17.floatValue(), bVarA));
                    }
                }
                str = strPrint;
                bVarB = w.b();
                if (f14 == null) {
                    string = context.getString(R.string.symbol_double_dash);
                    string.getClass();
                } else {
                    if (f14.floatValue() > 0.0f) {
                        f16 = f14;
                    } else {
                        f16 = null;
                    }
                    if (f16 != null) {
                        float fFloatValue3 = f16.floatValue();
                        l3.f23124b.getClass();
                        string = l3.f23131i.format(Float.valueOf(fFloatValue3));
                        if (string == null) {
                            string = context.getString(R.string.symbol_double_dash);
                            string.getClass();
                        }
                    } else {
                        string = context.getString(R.string.symbol_double_dash);
                        string.getClass();
                    }
                }
                String str4 = string;
                String string6 = context.getString(hVar.f130229c);
                if (num != null) {
                    string2 = context.getString(num.intValue());
                } else {
                    string2 = null;
                }
                bVarB.add(new l(str, str4, string6, string2, null, Integer.valueOf(R.color.gds_data_viz_blue_primary), null, null, 208, null));
                if (z14) {
                    if (f17 == null) {
                        string3 = context.getString(R.string.symbol_double_dash);
                        string3.getClass();
                    } else {
                        if (f17.floatValue() > 0.0f) {
                            f15 = f17;
                        } else {
                            f15 = null;
                        }
                        if (f15 != null) {
                            float fFloatValue4 = f15.floatValue();
                            l3.f23124b.getClass();
                            string3 = l3.f23131i.format(Float.valueOf(fFloatValue4));
                            if (string3 == null) {
                                string3 = context.getString(R.string.symbol_double_dash);
                                string3.getClass();
                            }
                        } else {
                            string3 = context.getString(R.string.symbol_double_dash);
                            string3.getClass();
                        }
                    }
                    String str5 = string3;
                    String strY2 = y(gVar);
                    if (num != null) {
                        string4 = context.getString(num.intValue());
                    } else {
                        string4 = null;
                    }
                    bVarB.add(new l(str, str5, strY2, string4, null, Integer.valueOf(R.color.gds_data_viz_neutral_secondary), null, null, 208, null));
                }
                bVarA = w.a(bVarB);
                if (f14 != null) {
                    arrayList.add(new Entry(i14, f14.floatValue(), bVarA));
                }
                if (f17 != null) {
                    arrayList2.add(new Entry(i14, f17.floatValue(), bVarA));
                }
            }
            i14 = i15;
            fVar3 = fVar2;
            it3 = it;
        }
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(f fVar) {
        f fVar2 = fVar;
        if (fVar2 == null) {
            return null;
        }
        return Integer.valueOf(fVar2.f130191b.size());
    }

    @Override // qz.c
    public final boolean d(f fVar) {
        Map<LocalDate, f.a> map;
        Collection<f.a> collectionValues;
        f fVar2 = fVar;
        boolean z14 = false;
        if (fVar2 != null && (map = fVar2.f130192c) != null && (collectionValues = map.values()) != null) {
            Collection<f.a> collection = collectionValues;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((f.a) it.next()).f130197a != null) {
                        z14 = true;
                        break;
                    }
                }
            }
        }
        return !z14;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(f fVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(f fVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(f fVar) {
        return null;
    }

    @Override // qz.c
    public final float i(f fVar) {
        f fVar2 = fVar;
        if ((fVar2 != null ? fVar2.f130192c : null) != null) {
            Collection<f.a> collectionValues = fVar2.f130192c.values();
            ArrayList arrayList = new ArrayList();
            for (f.a aVar : collectionValues) {
                d0.v(arrayList, x.k(aVar.f130197a, aVar.f130198b));
            }
            Float fQ0 = h0.q0(h0.Z(arrayList));
            if (fQ0 != null) {
                float fFloatValue = fQ0.floatValue();
                if (fFloatValue != 0.0f) {
                    if (fFloatValue > 1000000.0f) {
                        float f14 = 1000000;
                        return ((float) Math.ceil(fFloatValue / f14)) * f14;
                    }
                    f69196b.getClass();
                    return x(fFloatValue, 0, ((List) f69197c.getValue()).size() - 1);
                }
            }
        }
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(f fVar) {
        return 5;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(f fVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List o(f fVar) {
        String strL;
        f fVar2 = fVar;
        if (fVar2 == null) {
            return null;
        }
        List<LocalDate> list = fVar2.f130191b;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (LocalDate localDate : list) {
            int i14 = b.f69199a[fVar2.f130194e.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                if (s.g(localDate, h0.b0(list)) || s.g(localDate, h0.m0(list))) {
                    c22.j0.f23099a.getClass();
                    strL = c22.j0.l(localDate);
                } else {
                    strL = "";
                }
            } else if (i14 == 4) {
                c22.j0.f23099a.getClass();
                strL = c22.j0.l(localDate);
            } else {
                if (i14 != 5) {
                    u0.r();
                    return null;
                }
                strL = DateTimeFormat.forPattern("MMM").print(localDate);
            }
            arrayList.add(strL);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(f fVar) {
        return null;
    }

    @Override // qz.c
    public final float q(f fVar) {
        f fVar2 = fVar;
        if (fVar2 == null) {
            return 0.0f;
        }
        return fVar2.f130191b.size() - 1.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(f fVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(f fVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(f fVar) {
        f fVar2 = fVar;
        if (fVar2 == null) {
            return j0.f134944a;
        }
        h hVar = fVar2.f130190a;
        Collection<f.a> collectionValues = fVar2.f130192c.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((f.a) it.next()).f130197a != null) {
                    q13.b bVarB = w.b();
                    int i14 = hVar.f130229c;
                    Context context = this.f69198a;
                    String string = context.getString(i14);
                    string.getClass();
                    xz.g.a aVar = xz.g.a.f192745a;
                    bVarB.add(new xz.f(string, null, Integer.valueOf(context.getColor(R.color.gds_data_viz_blue_primary)), null, aVar, null, null, 106, null));
                    if (fVar2.f130196g) {
                        bVarB.add(new xz.f(y(fVar2.f130194e), null, Integer.valueOf(context.getColor(R.color.gds_data_viz_neutral_secondary)), null, aVar, null, null, 106, null));
                    }
                    return w.a(bVarB);
                }
            }
        }
        return j0.f134944a;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(f fVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(f fVar) {
        return 0.0f;
    }

    public final String y(g gVar) {
        String string;
        int i14 = b.f69199a[gVar.ordinal()];
        Context context = this.f69198a;
        if (i14 == 1) {
            string = context.getString(R.string.lbl_last_week);
        } else if (i14 == 2) {
            string = context.getString(R.string.lbl_last_4_weeks);
        } else if (i14 == 3) {
            string = context.getString(R.string.lbl_last_month);
        } else if (i14 == 4) {
            string = context.getString(R.string.lbl_last_12_weeks);
        } else {
            if (i14 != 5) {
                u0.r();
                return null;
            }
            string = context.getString(R.string.lbl_last_year);
        }
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: f61.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf61/a$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1429a {
        public /* synthetic */ C1429a(j jVar) {
            this();
        }

        private C1429a() {
        }
    }
}
