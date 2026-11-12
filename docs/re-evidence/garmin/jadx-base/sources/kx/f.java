package kx;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.format.DateFormat;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.u;
import p13.x;
import p13.y;
import zx0.m;
import zz.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkx/f;", "Lqz/c;", "Ljx/a;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.c<jx.a, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f107019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jz.a f107020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f107021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f107022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f107023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f107024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f107025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f107026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f107027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f107028j;

    static {
        new a(null);
    }

    public f(Context context) {
        context.getClass();
        this.f107019a = context;
        this.f107020b = new jz.a(new l22.a(context));
        this.f107021c = DateFormat.is24HourFormat(context);
        this.f107022d = new ArrayList();
        this.f107023e = new ArrayList();
        this.f107024f = new ArrayList();
        this.f107025g = new ArrayList();
        this.f107026h = new ArrayList();
        this.f107027i = new ArrayList();
    }

    public final LineDataSet A(List<? extends Entry> list) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawFilled(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        Context context = this.f107019a;
        lineDataSet.setColor(context.getColor(R.color.gcm_chart_body_battery_data_set));
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setHighLightColor(context.getColor(R.color.gcm_chart_body_battery_data_set));
        return lineDataSet;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f9  */
    @Override // qz.c
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(jx.a aVar) {
        Iterable iterable;
        DateTime dateTimeWithTimeAtStartOfDay;
        Integer numValueOf;
        Context context;
        int i14;
        gs1.e.d[] dVarArr;
        String strC;
        bx.c bVar;
        String string;
        int i15;
        List<gs1.e.a> list;
        if (aVar == null || (iterable = aVar.f101386c) == null) {
            iterable = j0.f134944a;
        }
        if (aVar == null || (dateTimeWithTimeAtStartOfDay = aVar.f101385b) == null) {
            dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        }
        int i16 = 0;
        Float f14 = null;
        if (aVar == null || (list = aVar.f101386c) == null) {
            numValueOf = null;
        } else {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                Integer num = ((gs1.e.a) it.next()).f78731c;
                numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                while (it.hasNext()) {
                    Integer num2 = ((gs1.e.a) it.next()).f78731c;
                    Integer numValueOf2 = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
            } else {
                numValueOf = null;
            }
        }
        dateTimeWithTimeAtStartOfDay.getClass();
        ArrayList arrayList = this.f107022d;
        arrayList.clear();
        ArrayList<LineDataSet> arrayList2 = this.f107023e;
        arrayList2.clear();
        ArrayList<LineDataSet> arrayList3 = this.f107024f;
        arrayList3.clear();
        this.f107025g = new ArrayList();
        this.f107026h = new ArrayList();
        this.f107027i = new ArrayList();
        this.f107028j = 0;
        Iterator it3 = iterable.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            context = this.f107019a;
            if (!zHasNext) {
                break;
            }
            gs1.e.a aVar2 = (gs1.e.a) it3.next();
            DateTime dateTime = aVar2.f78729a;
            Integer num3 = aVar2.f78731c;
            if (dateTime != null) {
                j00.g.f95975a.getClass();
                float fA = j00.g.a(1, dateTimeWithTimeAtStartOfDay, dateTime);
                if (num3 != null) {
                    Entry entry = (Entry) h0.n0(this.f107025g);
                    Float fValueOf = entry != null ? Float.valueOf(entry.getX()) : f14;
                    if (fA - (fValueOf != null ? fValueOf.floatValue() : fA) > 180.0f) {
                        x();
                        z();
                        y();
                        this.f107028j = 9;
                        i14 = i16;
                    } else {
                        i14 = i16;
                        float f15 = fA + 1.5f;
                        gs1.e.d dVar = aVar2.f78730b;
                        Entry entry2 = new Entry(f15, num3 != null ? num3.intValue() : 0.0f);
                        Entry entry3 = (Entry) h0.n0(this.f107025g);
                        Float fValueOf2 = entry3 != null ? Float.valueOf(entry3.getX()) : f14;
                        float fFloatValue = fA - (fValueOf2 != null ? fValueOf2.floatValue() : fA);
                        if (3.0f < fFloatValue && fFloatValue < 180.0f) {
                            z();
                            y();
                            Entry entryCopy = ((Entry) h0.m0(this.f107025g)).copy();
                            entryCopy.setData(f14);
                            Unit unit = Unit.INSTANCE;
                            this.f107027i = x.m(entryCopy, entry2);
                            y();
                        }
                        if (this.f107027i.size() == 8 && (i15 = this.f107028j) > 0) {
                            this.f107028j = i15 - 1;
                            this.f107027i.add(entry2);
                            y();
                        }
                        int i17 = this.f107028j;
                        if (i17 > 0) {
                            this.f107028j = i17 - 1;
                            this.f107027i.add(entry2);
                        } else if (dVar != null) {
                            gs1.e.d[] dVarArr2 = new gs1.e.d[3];
                            dVarArr2[i14] = gs1.e.d.f.f78744c;
                            dVarArr2[1] = gs1.e.d.b.f78741c;
                            dVarArr2[2] = gs1.e.d.g.f78745c;
                            if (u.z(dVarArr2, dVar)) {
                                if (!this.f107026h.isEmpty()) {
                                    this.f107027i.add(h0.m0(this.f107026h));
                                }
                                z();
                                this.f107027i.add(entry2);
                            } else if (dVar != null) {
                                dVarArr = new gs1.e.d[2];
                                dVarArr[i14] = gs1.e.d.C1587e.f78743c;
                                dVarArr[1] = gs1.e.d.a.f78740c;
                                if (u.z(dVarArr, dVar)) {
                                    if (!this.f107027i.isEmpty()) {
                                        this.f107027i.add(entry2);
                                    }
                                    y();
                                    this.f107026h.add(entry2);
                                }
                            }
                        } else if (dVar != null) {
                            dVarArr = new gs1.e.d[2];
                            dVarArr[i14] = gs1.e.d.C1587e.f78743c;
                            dVarArr[1] = gs1.e.d.a.f78740c;
                            if (u.z(dVarArr, dVar)) {
                                if (!this.f107027i.isEmpty()) {
                                    this.f107027i.add(entry2);
                                }
                                y();
                                this.f107026h.add(entry2);
                            }
                        }
                        DateTime dateTime2 = aVar2.f78729a;
                        if (dateTime2 != null) {
                            DateTime dateTimePlusMinutes = dateTime2.plusMinutes(3);
                            dateTimePlusMinutes.getClass();
                            strC = this.f107020b.c(dateTime2, dateTimePlusMinutes, this.f107021c);
                        } else {
                            strC = "";
                        }
                        String str = strC;
                        ArrayList arrayList4 = this.f107025g;
                        Entry entryCopy2 = entry2.copy();
                        if (s.c(aVar2.f78732d, 3.0d)) {
                            string = null;
                        } else {
                            bx.c.a aVar3 = bx.c.f21614d;
                            int iIntValue = num3 != null ? num3.intValue() : i14;
                            aVar3.getClass();
                            if (iIntValue >= 0 && iIntValue < 26) {
                                bVar = new bx.c.h();
                            } else if (26 <= iIntValue && iIntValue < 51) {
                                bVar = new bx.c.d();
                            } else if (51 > iIntValue || iIntValue >= 76) {
                                bVar = (76 > iIntValue || iIntValue >= 101) ? null : new bx.c.b();
                            } else {
                                bVar = new bx.c.f();
                            }
                            if (bVar != null) {
                                string = context.getString(bVar.f21617c);
                            } else {
                                string = null;
                            }
                        }
                        entryCopy2.setData(new l(str, String.valueOf(num3), context.getString(R.string.gcm_body_battery_lbl_body_battery), string, null, Integer.valueOf(R.color.gcm_chart_body_battery_data_set), null, null, 208, null));
                        arrayList4.add(entryCopy2);
                    }
                } else {
                    i14 = i16;
                    x();
                }
            } else {
                i14 = i16;
            }
            i16 = i14;
            f14 = null;
        }
        x();
        z();
        y();
        pz.c cVar = new pz.c(context, R.color.transparent, R.color.gcm_chart_body_battery_fill_gradient_start_color, pz.d.c(-25.0f, 100.0f, numValueOf));
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(cVar);
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList5.add((LineDataSet) it4.next());
        }
        for (LineDataSet lineDataSet : arrayList2) {
            lineDataSet.setFillDrawable(paintDrawable);
            arrayList5.add(lineDataSet);
        }
        for (LineDataSet lineDataSet2 : arrayList3) {
            lineDataSet2.setFillDrawable(paintDrawable);
            arrayList5.add(lineDataSet2);
        }
        return arrayList5;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    @Override // qz.c
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final ArrayList u(jx.a aVar) {
        List<gs1.e.a> list;
        boolean z14;
        boolean z15;
        ArrayList arrayList = new ArrayList();
        Context context = this.f107019a;
        if (aVar != null && (list = aVar.f101386c) != null) {
            if (!list.isEmpty()) {
                String string = context.getString(R.string.gcm_body_battery_lbl_body_battery);
                string.getClass();
                arrayList.add(new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_body_battery_data_set)), null, xz.g.a.f192745a, null, null, 106, null));
                if (list != null) {
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z15 = false;
                                break;
                            }
                            gs1.e.d dVar = ((gs1.e.a) it.next()).f78730b;
                            if (dVar != null ? u.z(new gs1.e.d[]{gs1.e.d.f.f78744c, gs1.e.d.b.f78741c, gs1.e.d.g.f78745c}, dVar) : false) {
                                z15 = true;
                                break;
                            }
                        }
                    } else {
                        z15 = false;
                        break;
                    }
                    z14 = z15;
                }
                if (z14) {
                    String string2 = context.getString(R.string.common_lbl_estimated);
                    string2.getClass();
                    arrayList.add(new xz.f(string2, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_body_battery_data_set)), null, new xz.g.c(0, 0.0f, 3, null), null, null, 106, null));
                }
                return arrayList;
            }
        }
        String string3 = context.getString(R.string.gcm_body_battery_lbl_body_battery);
        string3.getClass();
        arrayList.add(new xz.f(string3, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_body_battery_data_set)), null, xz.g.a.f192745a, null, null, 106, null));
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(jx.a aVar) {
        return Integer.valueOf(MathKt.c(1440.0f));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(jx.a aVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(jx.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(jx.a aVar) {
        return null;
    }

    @Override // qz.c
    public final List g(jx.a aVar) {
        jx.a aVar2 = aVar;
        return m.g(this.f107019a, aVar2 != null ? aVar2.f101384a : null, new zw.b(3));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(jx.a aVar) {
        return 100.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(jx.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(jx.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(jx.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(jx.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(jx.a aVar) {
        return 1440.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(jx.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(jx.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(jx.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(jx.a aVar) {
        return 0.0f;
    }

    public final void x() {
        if (this.f107025g.isEmpty()) {
            return;
        }
        LineDataSet lineDataSetA = A(this.f107025g);
        lineDataSetA.setColor(this.f107019a.getColor(R.color.transparent));
        this.f107022d.add(lineDataSetA);
        this.f107025g = new ArrayList();
    }

    public final void y() {
        if (this.f107027i.isEmpty()) {
            return;
        }
        LineDataSet lineDataSetA = A(zf.b.J(this.f107027i));
        lineDataSetA.setDrawFilled(true);
        lineDataSetA.enableDashedLine(4.0f, 4.0f, 0.0f);
        this.f107024f.add(lineDataSetA);
        this.f107027i = new ArrayList();
        this.f107028j = 0;
    }

    public final void z() {
        Entry entry;
        if (this.f107026h.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f107026h;
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            Entry entry2 = (Entry) obj;
            if (i14 == 0) {
                entry = new Entry(entry2.getX() - 1.5f, entry2.getY());
            } else {
                if (i14 == this.f107026h.size() - 1) {
                    entry = new Entry(entry2.getX() + 1.5f, entry2.getY());
                }
                arrayList2.add(entry2);
                i14 = i15;
            }
            entry2 = entry;
            arrayList2.add(entry2);
            i14 = i15;
        }
        LineDataSet lineDataSetA = A(arrayList2);
        lineDataSetA.setDrawFilled(true);
        lineDataSetA.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSetA.setCubicIntensity(0.05f);
        lineDataSetA.setHighlightEnabled(false);
        this.f107023e.add(lineDataSetA);
        this.f107026h = new ArrayList();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkx/f$a;", "", "<init>", "()V", "", "BODY_BATTERY_DATA_INTERVAL", "I", "", "BODY_BATTERY_DATA_INTERVAL_MIDDLE_OFFSET", "F", "MAX_ESTIMATED_GAP", "MIN_ESTIMATED_GAP", "MAX_FORCED_ENTRIES_COUNT", "MIN_Y_VALUE", "MAX_Y_VALUE", "CUBIC_INTENSITY_SMOOTH", "", "ENTRIES_REDUCE_EPSILON", "D", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
