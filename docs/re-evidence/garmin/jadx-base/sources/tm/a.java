package tm;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.fragment.app.m;
import ar.e;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import g8.i;
import i3.e5;
import im.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o4.d0;
import o4.f0;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.u;
import p13.w;
import p13.y;
import ps.h1;
import ps.x1;
import qs.x;
import xz.d;
import zm.c;
import zm.k;
import zm.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ltm/a;", "Lzm/c;", "Landroidx/fragment/app/m;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "activityChartData", "overlayChartData", "", "fullscreen", "Lfz/c;", "xAxisType", "<init>", "(Landroidx/fragment/app/m;Lzm/p;Lzm/p;ZLfz/c;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends c {
    public static final /* synthetic */ int E = 0;
    public km.a A;
    public ArrayList B;
    public DateTime C;
    public final ArrayList D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public km.a f165341z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f165343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f165344c;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.AUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.LUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f165342a = iArr;
            int[] iArr2 = new int[fz.c.values().length];
            try {
                iArr2[fz.c.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[fz.c.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f165343b = iArr2;
            int[] iArr3 = new int[x.values().length];
            try {
                iArr3[x.RWD_RUN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[x.RWD_WALK.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[x.RWD_STAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[x.DIVE_INTERVAL_DYN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[x.DIVE_INTERVAL_STA.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[x.DIVE_INTERVAL_REST.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f165344c = iArr3;
        }
    }

    static {
        new C3106a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, p pVar, p pVar2, boolean z14, fz.c cVar) {
        super(mVar, pVar, pVar2, null, z14, cVar);
        mVar.getClass();
        pVar.getClass();
        cVar.getClass();
        this.B = new ArrayList();
        this.D = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:82:0x013b  */
    @Override // zm.c
    public final String D(List<? extends Entry> list, p pVar) {
        Object next;
        int i14;
        x xVarA2;
        Object next2;
        Double distance;
        x xVarA3;
        Object next3;
        if (!list.isEmpty()) {
            Integer numValueOf = pVar != null ? Integer.valueOf(pVar.getB1()) : null;
            Context context = this.f205202a;
            if (numValueOf == null || numValueOf.intValue() != 28) {
                if (numValueOf == null || numValueOf.intValue() != 56) {
                    if (numValueOf == null || numValueOf.intValue() != 80) {
                        return super.D(list, pVar);
                    }
                    float x14 = list.get(0).getX();
                    Iterator it = this.B.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        x1 x1Var = (x1) next;
                        DateTime dateTime = this.C;
                        if (dateTime == null) {
                            int iIndexOf = this.B.indexOf(x1Var);
                            double D = i.D(iIndexOf - 1, this.B);
                            double D2 = i.D(iIndexOf, this.B);
                            double d14 = x14;
                            if (D <= d14 && d14 <= D2) {
                                break;
                            }
                        } else {
                            double seconds = Seconds.secondsBetween(dateTime, x1Var.getStartDateTime()).getSeconds();
                            double seconds2 = ((double) Seconds.secondsBetween(x1Var.getStartDateTime(), x1Var.getEndDateTime()).getSeconds()) + seconds;
                            double d15 = x14;
                            if (seconds <= d15 && d15 <= seconds2) {
                                break;
                            }
                        }
                    }
                    x1 x1Var2 = (x1) next;
                    x xVarA4 = x1Var2 != null ? x1Var2.a2() : null;
                    i14 = xVarA4 != null ? b.f165344c[xVarA4.ordinal()] : -1;
                    if (i14 == 4) {
                        return h1.DYN.a(context);
                    }
                    if (i14 == 5) {
                        return h1.STA.a(context);
                    }
                    if (i14 != 6) {
                        return String.valueOf((x1Var2 == null || (xVarA2 = x1Var2.a2()) == null) ? null : xVarA2.f147220a);
                    }
                    return h1.REST.a(context);
                }
                float x15 = list.get(0).getX();
                Iterator it3 = this.B.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    int iIndexOf2 = this.B.indexOf((x1) next2);
                    int i15 = b.f165343b[pVar.getF113514x1().ordinal()];
                    if (i15 == 1) {
                        double D3 = i.D(iIndexOf2 - 1, this.B);
                        double D4 = i.D(iIndexOf2, this.B);
                        double d16 = x15;
                        if (D3 <= d16 && d16 <= D4) {
                            break;
                        }
                    } else {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        double dC = i.C(iIndexOf2 - 1, this.B);
                        double dC2 = i.C(iIndexOf2, this.B);
                        double d17 = x15;
                        if (dC <= d17 && d17 <= dC2) {
                            break;
                        }
                    }
                }
                x1 x1Var3 = (x1) next2;
                if (pVar.getF113514x1() == fz.c.TIME) {
                    if (x1Var3 != null) {
                        distance = x1Var3.getDuration();
                    } else {
                        distance = null;
                    }
                } else if (x1Var3 != null) {
                    distance = x1Var3.getDistance();
                } else {
                    distance = null;
                }
                String strK = k(distance != null ? (float) distance.doubleValue() : 0.0f, pVar.getF113514x1());
                x xVarA5 = x1Var3 != null ? x1Var3.a2() : null;
                i14 = xVarA5 != null ? b.f165344c[xVarA5.ordinal()] : -1;
                if (i14 == 1) {
                    return com.nimbusds.jose.shaded.gson.internal.a.h(context.getString(R.string.lbl_run), " (", strK, ")");
                }
                if (i14 == 2) {
                    return com.nimbusds.jose.shaded.gson.internal.a.h(context.getString(R.string.activity_options_walk_title), " (", strK, ")");
                }
                if (i14 != 3) {
                    return com.nimbusds.jose.shaded.gson.internal.a.h((x1Var3 == null || (xVarA3 = x1Var3.a2()) == null) ? null : xVarA3.f147220a, " (", strK, ")");
                }
                return com.nimbusds.jose.shaded.gson.internal.a.h(context.getString(R.string.lbl_rwd_idle), " (", strK, ")");
            }
            Iterator<T> it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
            } while (Float.isNaN(((Entry) next3).getY()));
            Entry entry = (Entry) next3;
            Float fValueOf = entry != null ? Float.valueOf(entry.getY()) : null;
            p pVar2 = this.f205203b;
            lm.c cVar = pVar2 instanceof lm.c ? (lm.c) pVar2 : null;
            n nVar = cVar != null ? cVar.X : null;
            if (s.e(fValueOf, 0.0f)) {
                i14 = nVar != null ? b.f165342a[nVar.ordinal()] : -1;
                if (i14 != 1) {
                    return i14 != 2 ? context.getString(R.string.activity_details_seated) : context.getString(R.string.lbl_lowered);
                }
                return context.getString(R.string.lbl_aero);
            }
            if (s.e(fValueOf, 1.0f)) {
                return context.getString(R.string.lbl_upright);
            }
            if (s.e(fValueOf, 2.0f)) {
                return context.getString(R.string.activity_details_standing);
            }
        }
        return null;
    }

    @Override // zm.c
    public final void E(float f14, float f15, float f16, float f17) {
        if (w.c(92).contains(Integer.valueOf(this.f205203b.getB1()))) {
            super.E(f14, f15, f16, f17);
        }
    }

    @Override // zm.c
    public final void F(float f14, float f15) {
        Highlight highlightByTouchPoint = n().getHighlightByTouchPoint(f14, f15);
        if (highlightByTouchPoint == null) {
            return;
        }
        n().highlightValues((Highlight[]) y.s(u.C(new List[]{t(highlightByTouchPoint.getX(), "ACTIVITY_TYPE_TAG"), t(highlightByTouchPoint.getX(), "OVERLAY_TYPE_TAG")})).toArray(new Highlight[0]));
    }

    public final List<IBarLineScatterCandleBubbleDataSet<Entry>> R(List<? extends o20.a> list, int i14, km.c cVar, int i15) {
        boolean z14;
        boolean z15;
        ArrayList arrayListC = e.c(list);
        p pVar = this.f205203b;
        boolean z16 = i15 >= pVar.D3();
        String str = z16 ? "OVERLAY_TYPE_TAG" : "ACTIVITY_TYPE_TAG";
        d dVarU = null;
        if (i14 != 2) {
            if (i14 == 4) {
                List<IScatterDataSet> listZ = z16 ? z() : B();
                if (listZ != null) {
                    IScatterDataSet iScatterDataSet = (IScatterDataSet) h0.d0(listZ);
                    if (iScatterDataSet != null) {
                        iScatterDataSet.setLabel(str);
                    }
                    return listZ;
                }
            }
            return null;
        }
        if (cVar == null) {
            if (z16) {
                d dVarY = y();
                if (dVarY != null) {
                    dVarU = dVarY;
                }
            } else {
                dVarU = u(pVar.P(0));
            }
            List<IBarLineScatterCandleBubbleDataSet<Entry>> listC = w.c(dVarU);
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                LineDataSet lineDataSet = (LineDataSet) it.next();
                if (lineDataSet != null) {
                    lineDataSet.setLabel(str);
                }
            }
            return listC;
        }
        arrayListC.getClass();
        d dVar = new d(arrayListC, str);
        dVar.setDrawValues(false);
        dVar.setDrawCircles(false);
        dVar.setAxisDependency(z16 ? YAxis.AxisDependency.RIGHT : YAxis.AxisDependency.LEFT);
        boolean z17 = cVar.f105290l;
        int i16 = cVar.f105281c;
        boolean z18 = this.f205213l;
        if ((!z17 || z16) && !(cVar.f105291m && z16)) {
            boolean z19 = (cVar.f105286h && !z16) || (cVar.f105289k && z16);
            boolean z24 = z18 && !z16;
            dVar.setVisible(true);
            dVar.setHighlightLineWidth(cVar.f105284f);
            Context context = this.f205202a;
            dVar.setHighLightColor(a7.b.getColor(context, i16));
            dVar.setLineWidth(cVar.f105283e);
            int[] iArr = cVar.f105282d;
            if (iArr.length == 0) {
                int color = a7.b.getColor(context, z16 ? cVar.f105280b : cVar.f105279a);
                long jB = f0.b(color);
                int iJ = f0.j(d0.c(d0.e(jB) * 0.5f, jB, 14));
                if (z24) {
                    color = iJ;
                }
                dVar.setColor(color);
                z14 = z16;
            } else {
                ArrayList arrayList = new ArrayList(iArr.length);
                int length = iArr.length;
                int iD = 0;
                while (iD < length) {
                    int color2 = a7.b.getColor(context, iArr[iD]);
                    long jB2 = f0.b(color2);
                    boolean z25 = z16;
                    iD = e5.d(z24 ? f0.j(d0.c(d0.e(jB2) * 0.5f, jB2, 14)) : color2, iD, arrayList, 1);
                    z16 = z25;
                }
                z14 = z16;
                dVar.setColors(arrayList);
            }
            dVar.setCircleColor(a7.b.getColor(context, i16));
            dVar.setMode((z14 && cVar.f105288j) ? LineDataSet.Mode.STEPPED : (z14 || !cVar.f105287i) ? LineDataSet.Mode.LINEAR : LineDataSet.Mode.STEPPED);
            int[] iArr2 = cVar.f105285g;
            if (iArr2.length != 0) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                ArrayList arrayList2 = new ArrayList(iArr2.length);
                for (int i17 : iArr2) {
                    arrayList2.add(Integer.valueOf(a7.b.getColor(context, i17)));
                }
                GradientDrawable gradientDrawable = new GradientDrawable(orientation, h0.a1(arrayList2));
                gradientDrawable.setAlpha(z24 ? 127 : 255);
                dVar.setFillDrawable(gradientDrawable);
            }
            dVar.setDrawFilled(z19);
            z15 = false;
        } else {
            dVar.setVisible(false);
            z15 = false;
        }
        dVar.setDrawHorizontalHighlightIndicator(z15);
        if (this.f205204c != null) {
            dVar.setFillAlpha(z18 ? 127 : 255);
        }
        dVar.setFillFormatter(new r22.a(cVar, 19));
        return w.c(dVar);
    }

    public final void S() {
        new km.b();
        p pVar = this.f205203b;
        km.a f113494d1 = pVar.getF113494d1();
        if (f113494d1 == null) {
            f113494d1 = km.b.a(pVar.getB1(), null);
        }
        this.f165341z = f113494d1;
        p pVar2 = this.f205204c;
        if (pVar2 != null) {
            km.a f113494d2 = pVar2.getF113494d1();
            if (f113494d2 == null) {
                f113494d2 = km.b.a(pVar2.getB1(), null);
            }
            this.A = f113494d2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad A[SYNTHETIC] */
    @Override // zm.c
    public final List<Entry> s(float f14) {
        HashSet hashSet;
        ArrayList arrayList;
        Entry entry;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : this.D) {
            if (s.g(((IBarLineScatterCandleBubbleDataSet) obj).getLabel(), "ACTIVITY_TYPE_TAG")) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((IBarLineScatterCandleBubbleDataSet) it.next()).getEntriesForXValue(f14));
        }
        ArrayList arrayList4 = new ArrayList(y.s(arrayList3));
        boolean zContains = p13.x.k(4, 66, 11, 44).contains(Integer.valueOf(this.f205203b.getB1()));
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (!(((IBarLineScatterCandleBubbleDataSet) it3.next()) instanceof ScatterDataSet)) {
                }
            }
            if (zContains) {
                hashSet = new HashSet();
                arrayList = new ArrayList();
                for (Object obj2 : arrayList4) {
                    entry = (Entry) obj2;
                    if (hashSet.add(new o13.p(Float.valueOf(entry.getX()), Float.valueOf(entry.getY())))) {
                        arrayList.add(obj2);
                    }
                }
                return new ArrayList(arrayList);
            }
        } else if (zContains) {
            hashSet = new HashSet();
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                entry = (Entry) obj2;
                if (hashSet.add(new o13.p(Float.valueOf(entry.getX()), Float.valueOf(entry.getY())))) {
                    arrayList.add(obj2);
                }
            }
            return new ArrayList(arrayList);
        }
        return arrayList4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zm.c
    public final ArrayList t(float f14, String str) {
        ArrayList<IBarLineScatterCandleBubbleDataSet> arrayList = new ArrayList();
        for (Object obj : this.D) {
            if (s.g(((IBarLineScatterCandleBubbleDataSet) obj).getLabel(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet : arrayList) {
            int indexOfDataSet = ((CombinedData) n().getData()).getIndexOfDataSet(iBarLineScatterCandleBubbleDataSet);
            List<T> entriesForXValue = iBarLineScatterCandleBubbleDataSet.getEntriesForXValue(f14);
            if (entriesForXValue != null && !entriesForXValue.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (T t7 : entriesForXValue) {
                    int i14 = !(iBarLineScatterCandleBubbleDataSet instanceof LineDataSet) ? 1 : 0;
                    Highlight highlight = new Highlight(t7.getX(), t7.getY(), indexOfDataSet);
                    highlight.setDataIndex(i14);
                    arrayList3.add(highlight);
                }
                arrayList2.addAll(arrayList3);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    @Override // zm.c
    public final o13.p<LineData, ScatterData> w() {
        List<IDataSet> list;
        ArrayList arrayList = this.D;
        arrayList.clear();
        LineData lineData = new LineData();
        ScatterData scatterData = new ScatterData();
        p pVar = this.f205203b;
        int iD3 = pVar.D3();
        ArrayList<IDataSet> arrayList2 = new ArrayList();
        int i14 = 0;
        while (true) {
            if (i14 >= iD3) {
                break;
            }
            List<o20.a> listP = pVar.P(i14);
            int iL0 = pVar.l0(i14);
            km.a aVar = this.f165341z;
            List<IBarLineScatterCandleBubbleDataSet<Entry>> listR = R(listP, iL0, aVar != null ? aVar.f105277b.get(i14) : null, i14);
            if (listR != null) {
                arrayList2.addAll(h0.Z(listR));
            }
            i14++;
        }
        int i15 = 0;
        for (Object obj : arrayList2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) obj;
            km.a aVar2 = this.f165341z;
            km.c cVar = aVar2 != null ? aVar2.f105277b.get(i15) : null;
            if (iBarLineScatterCandleBubbleDataSet instanceof d) {
                if ((cVar != null ? cVar.f105293o : null) != null) {
                    IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet2 = (IBarLineScatterCandleBubbleDataSet) h0.e0(cVar.f105293o.intValue(), arrayList2);
                    if (iBarLineScatterCandleBubbleDataSet2 instanceof ILineDataSet) {
                        ((d) iBarLineScatterCandleBubbleDataSet).setFillFormatter(new yz.a((ILineDataSet) iBarLineScatterCandleBubbleDataSet2));
                    }
                }
            }
            i15 = i16;
        }
        arrayList.addAll(arrayList2);
        p pVar2 = this.f205204c;
        if (pVar2 == null) {
            list = j0.f134944a;
        } else {
            int iD4 = pVar.D3();
            int iD5 = pVar2.D3();
            ArrayList arrayList3 = new ArrayList();
            for (int i17 = 0; i17 < iD5; i17++) {
                List<o20.a> listP2 = pVar2.P(i17);
                int iL1 = pVar2.l0(i17);
                km.a aVar3 = this.A;
                List<IBarLineScatterCandleBubbleDataSet<Entry>> listR2 = R(listP2, iL1, aVar3 != null ? aVar3.f105277b.get(i17) : null, iD4 + i17);
                if (listR2 != null) {
                    arrayList3.addAll(h0.Z(listR2));
                }
            }
            int i18 = 0;
            for (Object obj2 : arrayList3) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    p13.x.q();
                    throw null;
                }
                IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet3 = (IBarLineScatterCandleBubbleDataSet) obj2;
                km.a aVar4 = this.A;
                km.c cVar2 = aVar4 != null ? aVar4.f105277b.get(i18) : null;
                if (iBarLineScatterCandleBubbleDataSet3 instanceof d) {
                    if ((cVar2 != null ? cVar2.f105293o : null) != null) {
                        IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet4 = (IBarLineScatterCandleBubbleDataSet) h0.e0(cVar2.f105293o.intValue(), arrayList3);
                        if (iBarLineScatterCandleBubbleDataSet4 instanceof ILineDataSet) {
                            ((d) iBarLineScatterCandleBubbleDataSet3).setFillFormatter(new yz.a((ILineDataSet) iBarLineScatterCandleBubbleDataSet4));
                        }
                    }
                }
                i18 = i19;
            }
            list = arrayList3;
        }
        arrayList.addAll(list);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (obj3 instanceof LineDataSet) {
                arrayList4.add(obj3);
            }
        }
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            lineData.addDataSet((LineDataSet) it.next());
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (obj4 instanceof ScatterDataSet) {
                arrayList5.add(obj4);
            }
        }
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            scatterData.addDataSet((ScatterDataSet) it3.next());
        }
        List list2 = list;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : list2) {
            if (obj5 instanceof LineDataSet) {
                arrayList6.add(obj5);
            }
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            lineData.addDataSet((LineDataSet) it4.next());
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj6 : list2) {
            if (obj6 instanceof ScatterDataSet) {
                arrayList7.add(obj6);
            }
        }
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            scatterData.addDataSet((ScatterDataSet) it5.next());
        }
        boolean zA = km.d.a(pVar.getB1(), pVar2 != null ? pVar2.getB1() : -1);
        Context context = this.f205202a;
        if (zA) {
            float fMax = Float.MIN_VALUE;
            float fMin = Float.MAX_VALUE;
            for (IDataSet iDataSet : arrayList2) {
                int entryCount = iDataSet.getEntryCount();
                for (int i24 = 0; i24 < entryCount; i24++) {
                    Entry entryForIndex = iDataSet.getEntryForIndex(i24);
                    if (!Float.isNaN(entryForIndex.getY())) {
                        fMin = Math.min(fMin, entryForIndex.getY());
                        fMax = Math.max(fMax, entryForIndex.getY());
                    }
                }
            }
            for (IDataSet iDataSet2 : list) {
                int entryCount2 = iDataSet2.getEntryCount();
                for (int i25 = 0; i25 < entryCount2; i25++) {
                    Entry entryForIndex2 = iDataSet2.getEntryForIndex(i25);
                    if (!Float.isNaN(entryForIndex2.getY())) {
                        fMin = Math.min(fMin, entryForIndex2.getY());
                        fMax = Math.max(fMax, entryForIndex2.getY());
                    }
                }
            }
            double[] dArrA = k.a(fMin, fMax, this.f205203b, 0, n().getContext().getResources().getConfiguration().orientation == 2, pVar2 != null, 8);
            O(dArrA, pVar);
            if (pVar2 != null) {
                YAxis axisRight = n().getAxisRight();
                axisRight.getClass();
                k.h(context, axisRight, dArrA, pVar2, this.A);
            }
        } else {
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = Float.MIN_VALUE;
            for (IDataSet iDataSet3 : arrayList2) {
                int entryCount3 = iDataSet3.getEntryCount();
                for (int i26 = 0; i26 < entryCount3; i26++) {
                    Entry entryForIndex3 = iDataSet3.getEntryForIndex(i26);
                    if (!Float.isNaN(entryForIndex3.getY())) {
                        fMin2 = Math.min(fMin2, entryForIndex3.getY());
                        fMax2 = Math.max(fMax2, entryForIndex3.getY());
                    }
                }
            }
            O(k.a(fMin2, fMax2, this.f205203b, 0, n().getContext().getResources().getConfiguration().orientation == 2, pVar2 != null, 8), pVar);
            if (pVar2 != null) {
                float fMax3 = Float.MIN_VALUE;
                float fMin3 = Float.MAX_VALUE;
                for (IDataSet iDataSet4 : list) {
                    int entryCount4 = iDataSet4.getEntryCount();
                    for (int i27 = 0; i27 < entryCount4; i27++) {
                        Entry entryForIndex4 = iDataSet4.getEntryForIndex(i27);
                        if (!Float.isNaN(entryForIndex4.getY())) {
                            fMin3 = Math.min(fMin3, entryForIndex4.getY());
                            fMax3 = Math.max(fMax3, entryForIndex4.getY());
                        }
                    }
                }
                double[] dArrA2 = k.a(fMin3, fMax3, this.f205204c, 0, n().getContext().getResources().getConfiguration().orientation == 2, true, 8);
                YAxis axisRight2 = n().getAxisRight();
                axisRight2.getClass();
                k.h(context, axisRight2, dArrA2, pVar2, this.A);
            }
        }
        return new o13.p<>(lineData, scatterData);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7 A[SYNTHETIC] */
    @Override // zm.c
    public final ArrayList x(float f14) {
        HashSet hashSet;
        ArrayList arrayList;
        Entry entry;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : this.D) {
            if (s.g(((IBarLineScatterCandleBubbleDataSet) obj).getLabel(), "OVERLAY_TYPE_TAG")) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((IBarLineScatterCandleBubbleDataSet) it.next()).getEntriesForXValue(f14));
        }
        ArrayList arrayList4 = new ArrayList(y.s(arrayList3));
        List listK = p13.x.k(4, 66, 11, 44);
        p pVar = this.f205204c;
        boolean zR = h0.R(listK, pVar != null ? Integer.valueOf(pVar.getB1()) : null);
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (!(((IBarLineScatterCandleBubbleDataSet) it3.next()) instanceof ScatterDataSet)) {
                }
            }
            if (zR) {
                hashSet = new HashSet();
                arrayList = new ArrayList();
                for (Object obj2 : arrayList4) {
                    entry = (Entry) obj2;
                    if (hashSet.add(new o13.p(Float.valueOf(entry.getX()), Float.valueOf(entry.getY())))) {
                        arrayList.add(obj2);
                    }
                }
                return new ArrayList(arrayList);
            }
        } else if (zR) {
            hashSet = new HashSet();
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                entry = (Entry) obj2;
                if (hashSet.add(new o13.p(Float.valueOf(entry.getX()), Float.valueOf(entry.getY())))) {
                    arrayList.add(obj2);
                }
            }
            return new ArrayList(arrayList);
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: tm.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltm/a$a;", "", "<init>", "()V", "", "LARGE_HIGHLIGHT_CIRCLE_RADIUS", "F", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3106a {
        public /* synthetic */ C3106a(j jVar) {
            this();
        }

        private C3106a() {
        }
    }
}
