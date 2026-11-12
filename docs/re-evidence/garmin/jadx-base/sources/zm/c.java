package zm;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import c22.l3;
import c22.m3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.garmin.android.apps.connectmobile.i2;
import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.highlight.CombinedHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.renderer.CombinedChartRenderer;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.u0;
import ps.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u000fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lzm/c;", "Lzm/q;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "activityChartData", "overlayChartData", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;", "comparisonTargetData", "", "fullScreen", "Lfz/c;", "xAxisType", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;ZLfz/c;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c implements q {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f205201y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f205202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f205203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f205204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.l f205205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f205206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fz.c f205207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OverlayCombinedChart f205208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f205209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f205210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f205211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f205212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f205213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f205214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public um.a f205215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sm.a f205216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f205217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final im.g f205218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f12.l f205219r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f205220t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l22.a f205221v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C3837c f205222w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m3 f205223x;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/d1", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f205224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OverlayCombinedChart f205225b;

        public b(View view2, OverlayCombinedChart overlayCombinedChart) {
            this.f205224a = view2;
            this.f205225b = overlayCombinedChart;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            this.f205224a.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            this.f205225b.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
        }
    }

    /* JADX INFO: renamed from: zm.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zm/c$c", "Lum/d;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3837c implements um.d {
        public C3837c() {
        }

        /* JADX WARN: Code duplicated, block: B:29:0x009d  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v22 */
        /* JADX WARN: Type inference failed for: r7v23, types: [com.github.mikephil.charting.data.BaseEntry] */
        /* JADX WARN: Type inference failed for: r7v39 */
        @Override // um.d
        public final void a(float f14) throws Throwable {
            Throwable th3;
            List<sm.b> listR;
            int i14;
            ArrayList arrayListX;
            String strH;
            String str;
            ?? r14;
            String string;
            Object entryForXValue;
            c cVar = c.this;
            List<Entry> listS = cVar.s(f14);
            fz.c cVar2 = cVar.f205207f;
            Context context = cVar.f205202a;
            p pVar = cVar.f205203b;
            if (listS == null || listS.isEmpty()) {
                return;
            }
            ArrayList arrayListD1 = h0.d1(c(listS, pVar));
            int i15 = 0;
            if (arrayListD1.isEmpty()) {
                th3 = null;
            } else {
                if (cVar.f205214m) {
                    IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) ((CombinedData) cVar.n().getData()).getDataSetByLabel("TARGET_TYPE_TAG", true);
                    if (iBarLineScatterCandleBubbleDataSet != null) {
                        entryForXValue = iBarLineScatterCandleBubbleDataSet.getEntryForXValue(f14, Float.NaN);
                    } else {
                        r14 = 0;
                    }
                    Float fValueOf = r14 != 0 ? Float.valueOf(r14.getY()) : null;
                    if (fValueOf != null) {
                        r14 = entryForXValue;
                        if (Float.isNaN(fValueOf.floatValue()) || p005kotlin.jvm.internal.s.e(fValueOf, Float.MAX_VALUE) || fValueOf.floatValue() <= 0.0f || p005kotlin.jvm.internal.s.e(fValueOf, 1000000.0f)) {
                            r14 = entryForXValue;
                            r14 = entryForXValue;
                            r14 = entryForXValue;
                            r14 = entryForXValue;
                            r14 = entryForXValue;
                            r14 = entryForXValue;
                            string = "";
                        } else {
                            r14 = entryForXValue;
                            string = context.getString(R.string.string_colon_string_pattern, context.getString(R.string.workout_target), cVar.l(fValueOf.floatValue(), pVar, false));
                            string.getClass();
                        }
                    } else {
                        r14 = entryForXValue;
                        r14 = entryForXValue;
                        r14 = entryForXValue;
                        r14 = entryForXValue;
                        r14 = entryForXValue;
                        r14 = entryForXValue;
                        string = "";
                    }
                    if (string.length() == 0) {
                        zz.l lVar = (zz.l) h0.d0(arrayListD1);
                        if (lVar != null) {
                            strH = lVar.f207545b;
                        } else {
                            str = null;
                        }
                    } else {
                        zz.l lVar2 = (zz.l) h0.d0(arrayListD1);
                        strH = com.nimbusds.jose.shaded.gson.internal.a.h(lVar2 != null ? lVar2.f207545b : null, " (", string, ")");
                    }
                    str = strH;
                } else {
                    zz.l lVar3 = (zz.l) h0.d0(arrayListD1);
                    if (lVar3 != null) {
                        strH = lVar3.f207545b;
                        str = strH;
                    } else {
                        str = null;
                    }
                }
                zz.l lVar4 = (zz.l) arrayListD1.get(0);
                th3 = null;
                arrayListD1.set(0, new zz.l(lVar4.f207544a, str, lVar4.f207546c, lVar4.f207547d, lVar4.f207548e, lVar4.f207549f, lVar4.f207550g, lVar4.f207551h));
            }
            List<zz.l> listC = (!cVar.f205213l || (arrayListX = cVar.x(f14)) == null) ? j0.f134944a : c(arrayListX, cVar.f205204c);
            String f113501k1 = pVar.getF113501k1();
            pVar.getClass();
            if ((z0.P(f113501k1) || z0.b(x0.R0, f113501k1)) && (listR = pVar.R()) != null) {
                double d14 = f14;
                Iterator it = listR.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                        break;
                    }
                    Object next = it.next();
                    i14 = i15 + 1;
                    if (i15 < 0) {
                        p13.x.q();
                        throw th3;
                    }
                    sm.b bVar = (sm.b) next;
                    if (bVar.f160060a <= d14 && bVar.f160061b >= d14) {
                        break;
                    } else {
                        i15 = i14;
                    }
                }
                if (i14 > 0) {
                    String string2 = z0.b(x0.R0, f113501k1) ? context.getString(R.string.lbl_enduro_split_index, String.valueOf(i14)) : context.getString(R.string.lbl_ski_run_with_number, String.valueOf(i14));
                    string2.getClass();
                    arrayListD1.add(new zz.l("", string2, "", null, null, null, null, null, 216, null));
                }
            }
            String strK = cVar.k(f14, cVar2);
            um.a aVar = cVar.f205215n;
            if (aVar != null) {
                ArrayList arrayListC0 = h0.C0(arrayListD1, listC);
                if (cVar2 == fz.c.DISTANCE) {
                    strK = context.getString(R.string.string_space_string_pattern, strK, cVar.f205221v.getString(cVar.f205223x.f23164e));
                }
                strK.getClass();
                aVar.b(strK, arrayListC0);
            }
        }

        /* JADX WARN: Code duplicated, block: B:166:0x04e0  */
        /* JADX WARN: Code duplicated, block: B:184:0x05ad  */
        /* JADX WARN: Code duplicated, block: B:185:0x05c9  */
        /* JADX WARN: Code duplicated, block: B:188:0x05ce  */
        /* JADX WARN: Code duplicated, block: B:190:0x05da  */
        /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:19:0x0091  */
        /* JADX WARN: Code duplicated, block: B:20:0x0093  */
        /* JADX WARN: Code duplicated, block: B:23:0x009e  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:38:0x0117  */
        /* JADX WARN: Code duplicated, block: B:39:0x011a  */
        /* JADX WARN: Code duplicated, block: B:44:0x0134  */
        /* JADX WARN: Code duplicated, block: B:45:0x0136  */
        /* JADX WARN: Code duplicated, block: B:48:0x0141  */
        /* JADX WARN: Code duplicated, block: B:51:0x016c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0178  */
        /* JADX WARN: Code duplicated, block: B:58:0x017e  */
        /* JADX WARN: Code duplicated, block: B:59:0x0183  */
        /* JADX WARN: Code duplicated, block: B:61:0x018b  */
        /* JADX WARN: Code duplicated, block: B:63:0x018e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0194  */
        /* JADX WARN: Code duplicated, block: B:66:0x0199  */
        /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:71:0x01a6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:75:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:76:0x0204  */
        @Override // um.d
        public final void b(float f14, float f15) {
            String str;
            Float f16;
            String str2;
            String string;
            Integer numB;
            zz.l lVar;
            zz.l lVar2;
            um.a aVar;
            List<Entry> entriesForXValue;
            Float fValueOf;
            String strL;
            String string2;
            List<Entry> entriesForXValue2;
            Object next;
            double d14;
            o20.a aVar2;
            Iterator<T> it;
            Object next2;
            double d15;
            Double dValueOf;
            Object next3;
            Double dValueOf2;
            o20.a aVar3;
            Iterator<T> it3;
            Object next4;
            double d16;
            double dAbs;
            Object next5;
            Object obj;
            double dAbs2;
            o20.a aVar4;
            Iterator<T> it4;
            Object next6;
            double d17;
            Double dValueOf3;
            Object next7;
            Double dValueOf4;
            o20.a aVar5;
            Double dValueOf5;
            Double dValueOf6;
            um.a aVar6;
            zz.l lVar3;
            zz.l lVar4;
            double D;
            double D2;
            c cVar = c.this;
            Context context = cVar.f205202a;
            Context context2 = cVar.f205202a;
            fz.c cVar2 = cVar.f205207f;
            String string3 = context.getString(R.string.string_line_string_pattern, cVar.k(f14, cVar2), cVar.k(f15, cVar2));
            string3.getClass();
            p pVar = cVar.f205203b;
            if (pVar.getB1() != 92) {
                IBarLineScatterCandleBubbleDataSet<Entry> iBarLineScatterCandleBubbleDataSetQ = cVar.q();
                String strD = cVar.getF205218q().d(Integer.valueOf(pVar.getB1()), pVar.getF113501k1());
                if (pVar.getB1() == 3 || pVar.getB1() == 88 || pVar.getB1() == 5 || pVar.getB1() == 0 || pVar.getB1() == 4 || pVar.getB1() == 81 || pVar.getB1() == 41 || pVar.getB1() == 40 || pVar.getB1() == 39 || pVar.getB1() == 6) {
                    un.a.C3206a c3206a = un.a.f172031f;
                    z81.b bVar = new z81.b(11);
                    c3206a.getClass();
                    float fA = un.a.C3206a.a(iBarLineScatterCandleBubbleDataSetQ, f14, f15, bVar);
                    Float fValueOf2 = Float.valueOf(fA);
                    String strL2 = cVar.l(fA, cVar.f205203b, false);
                    String string4 = context2.getString(R.string.string_space_string_pattern, context2.getString(R.string.common_avg), strD);
                    string4.getClass();
                    Unit unit = Unit.INSTANCE;
                    str = strL2;
                    f16 = fValueOf2;
                    str2 = string4;
                } else {
                    if (pVar.getB1() != 55) {
                        if (p13.x.k(2, 87).contains(Integer.valueOf(pVar.getB1()))) {
                            un.a.C3206a c3206a2 = un.a.f172031f;
                            z81.b bVar2 = new z81.b(13);
                            c3206a2.getClass();
                            float fA2 = un.a.C3206a.a(iBarLineScatterCandleBubbleDataSetQ, f14, f15, bVar2);
                            Float fValueOf3 = Float.valueOf(fA2);
                            String strL3 = cVar.l(fA2, cVar.f205203b, false);
                            String string5 = context2.getString(R.string.string_space_string_pattern, context2.getString(R.string.common_avg), strD);
                            string5.getClass();
                            List<Entry> entriesForXValue3 = iBarLineScatterCandleBubbleDataSetQ.getEntriesForXValue(f14);
                            List<Entry> entriesForXValue4 = iBarLineScatterCandleBubbleDataSetQ.getEntriesForXValue(f15);
                            double x14 = cVar2 == fz.c.DISTANCE ? entriesForXValue4.get(0).getX() - entriesForXValue3.get(0).getX() : c.f(cVar, pVar.getDistanceList(), entriesForXValue4.get(0).getX()) - c.f(cVar, pVar.getDistanceList(), entriesForXValue3.get(0).getX());
                            string = x14 > 0.0d ? context2.getString(R.string.lbl_value_percent, context2.getString(R.string.string_colon_string_pattern, context2.getString(R.string.lbl_avg_gradient), String.valueOf(new BigDecimal(String.valueOf((((double) Math.abs(entriesForXValue4.get(0).getY() - entriesForXValue3.get(0).getY())) / x14) * ((double) 100))).setScale(2, RoundingMode.UP).doubleValue()))) : null;
                            Unit unit2 = Unit.INSTANCE;
                            str2 = string5;
                            str = strL3;
                            f16 = fValueOf3;
                        } else if (pVar.getB1() == 60) {
                            List<Entry> entriesForXValue5 = iBarLineScatterCandleBubbleDataSetQ.getEntriesForXValue(f14);
                            if (entriesForXValue5 == null || (entriesForXValue2 = iBarLineScatterCandleBubbleDataSetQ.getEntriesForXValue(f15)) == null) {
                                return;
                            }
                            float y14 = entriesForXValue5.get(0).getY() - entriesForXValue2.get(0).getY();
                            fValueOf = Float.valueOf(y14);
                            if (Float.isNaN(y14) || Float.isInfinite(y14)) {
                                strL = context2.getString(R.string.no_value);
                            } else {
                                l3.f23124b.getClass();
                                strL = l3.a.B(y14);
                            }
                            Unit unit3 = Unit.INSTANCE;
                        } else {
                            List<Entry> entriesForXValue6 = iBarLineScatterCandleBubbleDataSetQ.getEntriesForXValue(f14);
                            if (entriesForXValue6 == null || (entriesForXValue = iBarLineScatterCandleBubbleDataSetQ.getEntriesForXValue(f15)) == null) {
                                return;
                            }
                            if (entriesForXValue6.size() <= 1 || entriesForXValue.size() <= 1) {
                                if (entriesForXValue6.size() > 0 && entriesForXValue.size() > 0) {
                                    if (pVar.getB1() == 52) {
                                        float y15 = entriesForXValue6.get(0).getY();
                                        List<ps.x0> listO2 = pVar.O2();
                                        if (p005kotlin.jvm.internal.s.b(y15, listO2 != null ? Float.valueOf((float) e0.c(listO2)) : null)) {
                                            string2 = context2.getString(R.string.no_value);
                                        } else {
                                            float y16 = entriesForXValue.get(0).getY();
                                            List<ps.x0> listO3 = pVar.O2();
                                            if (p005kotlin.jvm.internal.s.b(y16, listO3 != null ? Float.valueOf((float) e0.c(listO3)) : null)) {
                                                string2 = context2.getString(R.string.no_value);
                                            } else {
                                                string2 = cVar.l(entriesForXValue6.get(0).getY() - entriesForXValue.get(0).getY(), pVar, false);
                                            }
                                        }
                                        string2.getClass();
                                    } else {
                                        float y17 = entriesForXValue6.get(0).getY() - entriesForXValue.get(0).getY();
                                        fValueOf = Float.valueOf(y17);
                                        if (y17 < 0.0f) {
                                            strL = (cVar.f205203b.getB1() == 83 || pVar.getB1() == 84) ? cVar.f205202a.getString(R.string.lbl_string_with_negative_sign, cVar.l(-y17, cVar.f205203b, false)) : cVar.l(y17, cVar.f205203b, false);
                                        } else {
                                            strL = cVar.l(y17, cVar.f205203b, false);
                                        }
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                }
                                Unit unit5 = Unit.INSTANCE;
                            } else {
                                context2.getString(R.string.string_slash_string_pattern, cVar.l(entriesForXValue6.get(0).getY() - entriesForXValue.get(0).getY(), pVar, true), cVar.l(entriesForXValue6.get(1).getY() - entriesForXValue.get(1).getY(), pVar, false));
                            }
                            strL = null;
                            fValueOf = null;
                            Unit unit6 = Unit.INSTANCE;
                        }
                        numB = im.g.b(cVar.getF205218q(), f16, Integer.valueOf(pVar.getB1()), null, pVar.K(), 4);
                        lVar = new zz.l("", str, str2, null, null, numB, null, null, 216, null);
                        if (string != null) {
                            lVar2 = new zz.l("", string, str2, null, null, numB, null, null, 216, null);
                        } else {
                            lVar2 = null;
                        }
                        aVar = cVar.f205215n;
                        if (aVar != null) {
                            ArrayList arrayListC = p13.u.C(new zz.l[]{lVar, lVar2});
                            if (cVar2 == fz.c.DISTANCE) {
                                string3 = context2.getString(R.string.string_space_string_pattern, string3, cVar.f205221v.getString(cVar.f205223x.f23164e));
                            }
                            string3.getClass();
                            aVar.b(string3, arrayListC);
                            return;
                        }
                        return;
                    }
                    un.a.C3206a c3206a3 = un.a.f172031f;
                    z81.b bVar3 = new z81.b(12);
                    c3206a3.getClass();
                    float fA3 = un.a.C3206a.a(iBarLineScatterCandleBubbleDataSetQ, f14, f15, bVar3);
                    fValueOf = Float.valueOf(fA3);
                    strL = cVar.l(fA3, cVar.f205203b, false);
                    strD = context2.getString(R.string.pulse_ox_avg_spo2);
                    strD.getClass();
                    Unit unit7 = Unit.INSTANCE;
                    str = strL;
                    f16 = fValueOf;
                    str2 = strD;
                }
                string = null;
                numB = im.g.b(cVar.getF205218q(), f16, Integer.valueOf(pVar.getB1()), null, pVar.K(), 4);
                lVar = new zz.l("", str, str2, null, null, numB, null, null, 216, null);
                if (string != null) {
                    lVar2 = new zz.l("", string, str2, null, null, numB, null, null, 216, null);
                } else {
                    lVar2 = null;
                }
                aVar = cVar.f205215n;
                if (aVar != null) {
                    ArrayList arrayListC2 = p13.u.C(new zz.l[]{lVar, lVar2});
                    if (cVar2 == fz.c.DISTANCE) {
                        string3 = context2.getString(R.string.string_space_string_pattern, string3, cVar.f205221v.getString(cVar.f205223x.f23164e));
                    }
                    string3.getClass();
                    aVar.b(string3, arrayListC2);
                    return;
                }
                return;
            }
            Iterator<T> it5 = pVar.P(1).iterator();
            if (it5.hasNext()) {
                next = it5.next();
                if (it5.hasNext()) {
                    d14 = 0.0d;
                    double d18 = f14;
                    double dAbs3 = Math.abs(((o20.a) next).C() - d18);
                    while (true) {
                        Object next8 = it5.next();
                        double d19 = d18;
                        double dAbs4 = Math.abs(((o20.a) next8).C() - d18);
                        if (Double.compare(dAbs3, dAbs4) > 0) {
                            dAbs3 = dAbs4;
                            next = next8;
                        }
                        if (!it5.hasNext()) {
                            break;
                        } else {
                            d18 = d19;
                        }
                    }
                }
                aVar2 = (o20.a) next;
                it = pVar.P(0).iterator();
                if (it.hasNext()) {
                    next2 = it.next();
                    if (it.hasNext()) {
                        d15 = f14;
                        dValueOf = Double.valueOf(Math.abs(((o20.a) next2).C() - d15));
                        do {
                            next3 = it.next();
                            dValueOf2 = Double.valueOf(Math.abs(((o20.a) next3).C() - d15));
                            if (dValueOf.compareTo(dValueOf2) > 0) {
                                next2 = next3;
                                dValueOf = dValueOf2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next2 = null;
                }
                aVar3 = (o20.a) next2;
                it3 = pVar.P(1).iterator();
                if (it3.hasNext()) {
                    next4 = it3.next();
                    if (it3.hasNext()) {
                        d16 = f15;
                        dAbs = Math.abs(((o20.a) next4).C() - d16);
                        do {
                            next5 = it3.next();
                            obj = next4;
                            dAbs2 = Math.abs(((o20.a) next5).C() - d16);
                            if (Double.compare(dAbs, dAbs2) > 0) {
                                dAbs = dAbs2;
                                next4 = next5;
                            } else {
                                next4 = obj;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next4 = null;
                }
                aVar4 = (o20.a) next4;
                it4 = pVar.P(0).iterator();
                if (it4.hasNext()) {
                    next6 = it4.next();
                    if (it4.hasNext()) {
                        d17 = f15;
                        dValueOf3 = Double.valueOf(Math.abs(((o20.a) next6).C() - d17));
                        do {
                            next7 = it4.next();
                            dValueOf4 = Double.valueOf(Math.abs(((o20.a) next7).C() - d17));
                            if (dValueOf3.compareTo(dValueOf4) > 0) {
                                next6 = next7;
                                dValueOf3 = dValueOf4;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next6 = null;
                }
                aVar5 = (o20.a) next6;
                if (aVar2 != null) {
                    double D3 = aVar2.D();
                    if (aVar4 != null) {
                        D2 = aVar4.D();
                    } else {
                        D2 = d14;
                    }
                    dValueOf5 = Double.valueOf(D3 - D2);
                } else {
                    dValueOf5 = null;
                }
                if (aVar3 != null) {
                    double D4 = aVar3.D();
                    if (aVar5 != null) {
                        D = aVar5.D();
                    } else {
                        D = d14;
                    }
                    dValueOf6 = Double.valueOf(D4 - D);
                } else {
                    dValueOf6 = null;
                }
                aVar6 = cVar.f205215n;
                if (aVar6 != null) {
                    if (dValueOf5 != null) {
                        l3.f23124b.getClass();
                        lVar3 = new zz.l(null, l3.f23130h.format(dValueOf5.doubleValue()), context2.getString(R.string.lbl_non_pack_calories_diff), null, null, Integer.valueOf(R.color.gds_data_viz_neutral_secondary), null, null, 217, null);
                    } else {
                        lVar3 = null;
                    }
                    if (dValueOf6 != null) {
                        l3.f23124b.getClass();
                        lVar4 = new zz.l(null, l3.f23130h.format(dValueOf6.doubleValue()), context2.getString(R.string.lbl_pack_calories_diff), null, null, Integer.valueOf(R.color.gds_data_viz_red_primary), null, null, 217, null);
                    } else {
                        lVar4 = null;
                    }
                    aVar6.b(string3, p13.u.C(new zz.l[]{lVar3, lVar4}));
                    Unit unit8 = Unit.INSTANCE;
                }
            }
            next = null;
            d14 = 0.0d;
            aVar2 = (o20.a) next;
            it = pVar.P(0).iterator();
            if (it.hasNext()) {
                next2 = null;
            } else {
                next2 = it.next();
                if (it.hasNext()) {
                    d15 = f14;
                    dValueOf = Double.valueOf(Math.abs(((o20.a) next2).C() - d15));
                    do {
                        next3 = it.next();
                        dValueOf2 = Double.valueOf(Math.abs(((o20.a) next3).C() - d15));
                        if (dValueOf.compareTo(dValueOf2) > 0) {
                            next2 = next3;
                            dValueOf = dValueOf2;
                        }
                    } while (it.hasNext());
                }
            }
            aVar3 = (o20.a) next2;
            it3 = pVar.P(1).iterator();
            if (it3.hasNext()) {
                next4 = null;
            } else {
                next4 = it3.next();
                if (it3.hasNext()) {
                    d16 = f15;
                    dAbs = Math.abs(((o20.a) next4).C() - d16);
                    do {
                        next5 = it3.next();
                        obj = next4;
                        dAbs2 = Math.abs(((o20.a) next5).C() - d16);
                        if (Double.compare(dAbs, dAbs2) > 0) {
                            dAbs = dAbs2;
                            next4 = next5;
                        } else {
                            next4 = obj;
                        }
                    } while (it3.hasNext());
                }
            }
            aVar4 = (o20.a) next4;
            it4 = pVar.P(0).iterator();
            if (it4.hasNext()) {
                next6 = null;
            } else {
                next6 = it4.next();
                if (it4.hasNext()) {
                    d17 = f15;
                    dValueOf3 = Double.valueOf(Math.abs(((o20.a) next6).C() - d17));
                    do {
                        next7 = it4.next();
                        dValueOf4 = Double.valueOf(Math.abs(((o20.a) next7).C() - d17));
                        if (dValueOf3.compareTo(dValueOf4) > 0) {
                            next6 = next7;
                            dValueOf3 = dValueOf4;
                        }
                    } while (it4.hasNext());
                }
            }
            aVar5 = (o20.a) next6;
            if (aVar2 != null) {
                double D5 = aVar2.D();
                if (aVar4 != null) {
                    D2 = aVar4.D();
                } else {
                    D2 = d14;
                }
                dValueOf5 = Double.valueOf(D5 - D2);
            } else {
                dValueOf5 = null;
            }
            if (aVar3 != null) {
                double D6 = aVar3.D();
                if (aVar5 != null) {
                    D = aVar5.D();
                } else {
                    D = d14;
                }
                dValueOf6 = Double.valueOf(D6 - D);
            } else {
                dValueOf6 = null;
            }
            aVar6 = cVar.f205215n;
            if (aVar6 != null) {
                if (dValueOf5 != null) {
                    l3.f23124b.getClass();
                    lVar3 = new zz.l(null, l3.f23130h.format(dValueOf5.doubleValue()), context2.getString(R.string.lbl_non_pack_calories_diff), null, null, Integer.valueOf(R.color.gds_data_viz_neutral_secondary), null, null, 217, null);
                } else {
                    lVar3 = null;
                }
                if (dValueOf6 != null) {
                    l3.f23124b.getClass();
                    lVar4 = new zz.l(null, l3.f23130h.format(dValueOf6.doubleValue()), context2.getString(R.string.lbl_pack_calories_diff), null, null, Integer.valueOf(R.color.gds_data_viz_red_primary), null, null, 217, null);
                } else {
                    lVar4 = null;
                }
                aVar6.b(string3, p13.u.C(new zz.l[]{lVar3, lVar4}));
                Unit unit9 = Unit.INSTANCE;
            }
        }

        /* JADX WARN: Code duplicated, block: B:181:0x03c3 A[PHI: r2
          0x03c3: PHI (r2v30 java.lang.Integer) = (r2v29 java.lang.Integer), (r2v47 java.lang.Integer) binds: [B:174:0x03a5, B:179:0x03c0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:224:0x04c3  */
        /* JADX WARN: Code duplicated, block: B:232:0x04e0  */
        /* JADX WARN: Code duplicated, block: B:297:0x00e8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:59:0x0127  */
        /* JADX WARN: Code duplicated, block: B:73:0x017a  */
        public final List<zz.l> c(List<? extends Entry> list, p pVar) {
            Float fValueOf;
            Float fValueOf2;
            zz.l lVar;
            zz.l lVar2;
            double d14;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            String str;
            String strB1;
            o20.a aVar;
            o20.a aVar2;
            Iterator it;
            Object next;
            Entry entry;
            Integer numValueOf4;
            Entry entry2;
            Integer numValueOf5;
            zp1.a aVarA;
            Integer numValueOf6;
            int i14 = 0;
            Integer num = 0;
            boolean zR = h0.R(p13.x.k(56, 28), pVar != null ? Integer.valueOf(pVar.getB1()) : null);
            c cVar = c.this;
            if (zR) {
                return p13.w.c(new zz.l("", cVar.D(list, pVar), "", null, null, null, null, null, 216, null));
            }
            double d15 = 0.0d;
            if (pVar != null && pVar.getB1() == 54) {
                Object obj = cVar.f205203b;
                p pVar2 = cVar.f205204c;
                Context context = cVar.f205202a;
                boolean z14 = (pVar.equals(obj) && pVar2 != null && pVar2.getB1() == 89) || (pVar.equals(pVar2) && cVar.f205203b.getB1() == 89);
                Entry entry3 = (Entry) h0.d0(list);
                if (entry3 != null) {
                    float y14 = entry3.getY();
                    Float fValueOf3 = Float.valueOf(y14);
                    if (Float.isNaN(y14) || y14 < 0.0d) {
                        fValueOf3 = null;
                    }
                    if (fValueOf3 != null) {
                        numValueOf4 = Integer.valueOf(MathKt.c(fValueOf3.floatValue()));
                    } else {
                        it = h0.S0(h0.U(list, 2), zp1.a.f206594h.getF134973e()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            entry2 = (Entry) next;
                            if (Float.isNaN(entry2.getY()) && entry2.getY() >= 0.0d) {
                                break;
                            }
                        }
                        entry = (Entry) next;
                        if (entry != null) {
                            numValueOf4 = Integer.valueOf(MathKt.c(entry.getY()));
                        } else {
                            numValueOf4 = null;
                        }
                    }
                } else {
                    it = h0.S0(h0.U(list, 2), zp1.a.f206594h.getF134973e()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        entry2 = (Entry) next;
                        if (Float.isNaN(entry2.getY())) {
                        }
                    }
                    entry = (Entry) next;
                    if (entry != null) {
                        numValueOf4 = Integer.valueOf(MathKt.c(entry.getY()));
                    } else {
                        numValueOf4 = null;
                    }
                }
                Entry entry4 = (Entry) h0.e0(1, list);
                if (entry4 != null) {
                    float y15 = entry4.getY();
                    Float fValueOf4 = Float.valueOf(y15);
                    if (Float.isNaN(y15) || y15 < 0.0d) {
                        fValueOf4 = null;
                    }
                    if (fValueOf4 != null) {
                        numValueOf5 = Integer.valueOf(MathKt.c(fValueOf4.floatValue()));
                    } else {
                        numValueOf5 = null;
                    }
                } else {
                    numValueOf5 = null;
                }
                if (z14) {
                    aVarA = null;
                } else {
                    Iterator it3 = h0.S0(h0.U(list, 2), zp1.a.f206594h.getF134973e()).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            numValueOf6 = null;
                            break;
                        }
                        int i15 = i14 + 1;
                        Entry entry5 = (Entry) it3.next();
                        if (!Float.isNaN(entry5.getY()) && entry5.getY() >= 0.0d) {
                            numValueOf6 = Integer.valueOf(i14);
                            break;
                        }
                        i14 = i15;
                    }
                    if (numValueOf6 != null) {
                        int iIntValue = numValueOf6.intValue();
                        zp1.a.C3847a c3847a = zp1.a.f206590d;
                        Integer numValueOf7 = Integer.valueOf(iIntValue + 1);
                        c3847a.getClass();
                        aVarA = zp1.a.C3847a.a(numValueOf7);
                    } else {
                        aVarA = null;
                    }
                }
                return p13.u.C(new zz.l[]{numValueOf4 != null ? new zz.l(null, numValueOf4 + "%", context.getString(R.string.lbl_stamina), null, null, null, null, null, 249, null) : null, numValueOf5 != null ? new zz.l(null, numValueOf5 + "%", context.getString(R.string.lbl_stamina_potential), null, null, null, null, null, 249, null) : null, aVarA != null ? new zz.l(null, context.getString(aVarA.f206596b), context.getString(R.string.lbl_stamina_zone), null, null, Integer.valueOf(aVarA.f206597c), null, null, 217, null) : null});
            }
            if (pVar == null || pVar.getB1() != 89) {
                if (pVar == null || pVar.getB1() != 92) {
                    if (list.size() > 1) {
                        String string = cVar.f205202a.getString(R.string.string_slash_string_pattern, cVar.l(list.get(0).getY(), pVar, true), cVar.l(list.get(1).getY(), pVar, false));
                        string.getClass();
                        return p13.w.c(new zz.l("", string, cVar.getF205218q().d(pVar != null ? Integer.valueOf(pVar.getB1()) : null, pVar != null ? pVar.getF113501k1() : null), null, null, cVar.getF205218q().c(list.get(0), pVar != null ? Integer.valueOf(pVar.getB1()) : null, pVar != null ? pVar.getF113501k1() : null, pVar != null ? pVar.K() : null), null, null, 216, null));
                    }
                    if (list.isEmpty()) {
                        return j0.f134944a;
                    }
                    Entry entry6 = list.get(0);
                    return p13.w.c(new zz.l("", c.m(cVar, entry6, pVar), cVar.getF205218q().d(pVar != null ? Integer.valueOf(pVar.getB1()) : null, pVar != null ? pVar.getF113501k1() : null), null, null, cVar.getF205218q().c(entry6, pVar != null ? Integer.valueOf(pVar.getB1()) : null, pVar != null ? pVar.getF113501k1() : null, pVar != null ? pVar.K() : null), null, null, 216, null));
                }
                Entry entry7 = (Entry) h0.d0(list);
                if (entry7 != null) {
                    float y16 = entry7.getY();
                    fValueOf = Float.valueOf(y16);
                    if (Float.isNaN(y16) || y16 < 0.0d) {
                        fValueOf = null;
                    }
                } else {
                    fValueOf = null;
                }
                Entry entry8 = (Entry) h0.e0(1, list);
                if (entry8 != null) {
                    float y17 = entry8.getY();
                    fValueOf2 = Float.valueOf(y17);
                    if (Float.isNaN(y17) || y17 < 0.0d) {
                        fValueOf2 = null;
                    }
                } else {
                    fValueOf2 = null;
                }
                if (fValueOf2 != null) {
                    l3.f23124b.getClass();
                    lVar = new zz.l(null, l3.f23130h.format(fValueOf2), cVar.f205202a.getString(R.string.lbl_non_pack_calories), null, null, Integer.valueOf(R.color.gds_data_viz_neutral_secondary), null, null, 217, null);
                } else {
                    lVar = null;
                }
                if (fValueOf != null) {
                    l3.f23124b.getClass();
                    DecimalFormat decimalFormat = l3.f23130h;
                    float fFloatValue = fValueOf.floatValue() - (fValueOf2 != null ? fValueOf2.floatValue() : 0.0f);
                    lVar2 = new zz.l(null, decimalFormat.format(Float.valueOf(fFloatValue >= 0.0f ? fFloatValue : 0.0f)), cVar.f205202a.getString(R.string.lbl_pack_calories), null, null, Integer.valueOf(R.color.gds_data_viz_red_primary), null, null, 217, null);
                } else {
                    lVar2 = null;
                }
                return p13.u.C(new zz.l[]{lVar, lVar2});
            }
            Entry entry9 = (Entry) h0.d0(list);
            Float fValueOf5 = entry9 != null ? Float.valueOf(entry9.getX()) : null;
            Iterator it4 = h0.U(list, 1).iterator();
            int i16 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    d14 = d15;
                    i16 = -1;
                    break;
                }
                Entry entry10 = (Entry) it4.next();
                if (!Float.isNaN(entry10.getY())) {
                    d14 = d15;
                    if (entry10.getY() >= d14) {
                        break;
                    }
                } else {
                    d14 = d15;
                }
                i16++;
                d15 = d14;
            }
            w13.c cVar2 = zp1.a.f206594h;
            zp1.a aVar3 = (zp1.a) h0.e0(i16, cVar2);
            if (aVar3 == null) {
                return j0.f134944a;
            }
            ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
            p13.c.b bVar = new p13.c.b();
            int i17 = 0;
            while (bVar.hasNext()) {
                Object next2 = bVar.next();
                double d16 = d14;
                int i18 = i17 + 1;
                if (i17 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList.add(new o13.p((zp1.a) next2, pVar.P(i18)));
                i17 = i18;
                d14 = d16;
            }
            double d17 = d14;
            Map mapL = u0.l(arrayList);
            List list2 = (List) h0.c0(mapL.values());
            if (list2 == null) {
                numValueOf = null;
                break;
            }
            Iterator it5 = list2.iterator();
            int i19 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    numValueOf = null;
                    break;
                }
                int i24 = i19 + 1;
                if (p005kotlin.jvm.internal.s.b((float) ((o20.a) it5.next()).C(), fValueOf5)) {
                    numValueOf = Integer.valueOf(i19);
                    break;
                }
                i19 = i24;
            }
            List list3 = (List) h0.c0(mapL.values());
            int size = list3 != null ? list3.size() : 0;
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue() - 1;
                boolean z15 = false;
                while (true) {
                    if (-1 >= iIntValue2) {
                        numValueOf3 = null;
                        break;
                    }
                    for (Map.Entry entry11 : mapL.entrySet()) {
                        o20.a aVar4 = (o20.a) h0.e0(iIntValue2, (List) entry11.getValue());
                        Double dValueOf = aVar4 != null ? Double.valueOf(aVar4.D()) : null;
                        if (entry11.getKey() != aVar3 && dValueOf != null && zf.b.D(dValueOf) && dValueOf.doubleValue() >= d17) {
                            z15 = true;
                        }
                    }
                    if (z15) {
                        numValueOf3 = Integer.valueOf(iIntValue2 + 1);
                        break;
                    }
                    iIntValue2--;
                }
                int iIntValue3 = numValueOf.intValue() + 1;
                boolean z16 = false;
                while (true) {
                    if (iIntValue3 >= size) {
                        numValueOf2 = null;
                        break;
                    }
                    for (Map.Entry entry12 : mapL.entrySet()) {
                        o20.a aVar5 = (o20.a) h0.e0(iIntValue3, (List) entry12.getValue());
                        Double dValueOf2 = aVar5 != null ? Double.valueOf(aVar5.D()) : null;
                        if (entry12.getKey() != aVar3 && dValueOf2 != null && zf.b.D(dValueOf2) && dValueOf2.doubleValue() >= d17) {
                            z16 = true;
                        }
                    }
                    if (z16) {
                        numValueOf2 = Integer.valueOf(iIntValue3);
                        break;
                    }
                    iIntValue3++;
                }
                Unit unit = Unit.INSTANCE;
            } else {
                numValueOf2 = null;
                numValueOf3 = null;
            }
            if (numValueOf3 == null) {
                numValueOf3 = num;
            }
            if (numValueOf2 == null) {
                List list4 = (List) h0.c0(mapL.values());
                numValueOf2 = list4 != null ? Integer.valueOf(list4.size() - 1) : null;
                num = numValueOf2 != null ? numValueOf2 : 0;
            }
            List list5 = (List) h0.c0(mapL.values());
            Double dValueOf3 = (list5 == null || (aVar2 = (o20.a) list5.get(numValueOf3.intValue())) == null) ? null : Double.valueOf(aVar2.C());
            List list6 = (List) h0.c0(mapL.values());
            Double dValueOf4 = (list6 == null || (aVar = (o20.a) list6.get(num.intValue())) == null) ? null : Double.valueOf(aVar.C());
            if (dValueOf3 == null || dValueOf4 == null) {
                str = null;
            } else {
                double dDoubleValue = dValueOf4.doubleValue();
                double dDoubleValue2 = dValueOf3.doubleValue();
                if (pVar.getF113514x1() == fz.c.DISTANCE) {
                    m3 m3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
                    l3.a aVar6 = l3.f23124b;
                    DecimalFormat decimalFormat2 = l3.f23129g;
                    aVar6.getClass();
                    strB1 = l3.a.N(dDoubleValue - dDoubleValue2, m3Var, decimalFormat2);
                } else {
                    l3.a aVar7 = l3.f23124b;
                    long jD = MathKt.d((dDoubleValue - dDoubleValue2) * ((double) 1000));
                    aVar7.getClass();
                    strB1 = l3.a.b1(jD);
                }
                str = strB1;
            }
            Context context2 = cVar.f205202a;
            String string2 = context2.getString(aVar3.f206596b);
            string2.getClass();
            if (str != null) {
                string2 = context2.getString(R.string.value_parenthesis_value, string2, str);
            }
            return p13.w.c(new zz.l(null, string2, context2.getString(R.string.lbl_stamina_zone), null, null, Integer.valueOf(aVar3.f206597c), null, null, 217, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ xz.d f205228b;

        public d(xz.d dVar) {
            this.f205228b = dVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            view2.removeOnLayoutChangeListener(this);
            c cVar = c.this;
            int color = a7.b.getColor(cVar.f205202a, R.color.grit_flow_color_green);
            Context context = cVar.f205202a;
            int[] iArr = {color, a7.b.getColor(context, R.color.flow_color_yellow), a7.b.getColor(context, R.color.flow_color_red)};
            ArrayList arrayList = new ArrayList(3);
            int i26 = 0;
            while (true) {
                xz.d dVar = this.f205228b;
                if (i26 >= 3) {
                    dVar.f192733a = new LinearGradient(0.0f, cVar.n().getViewPortHandler().contentBottom(), 0.0f, cVar.n().getViewPortHandler().contentTop(), iArr, h0.Y0(arrayList), Shader.TileMode.CLAMP);
                    return;
                } else {
                    arrayList.add(Float.valueOf(im.a.f94085c0[i26] / dVar.getYMax()));
                    i26++;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ xz.d f205230b;

        public e(xz.d dVar) {
            this.f205230b = dVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            view2.removeOnLayoutChangeListener(this);
            c cVar = c.this;
            int color = a7.b.getColor(cVar.f205202a, R.color.grit_flow_color_green);
            Context context = cVar.f205202a;
            int[] iArr = {color, a7.b.getColor(context, R.color.grit_color_blue), a7.b.getColor(context, R.color.grit_color_purple)};
            ArrayList arrayList = new ArrayList(3);
            int i26 = 0;
            while (true) {
                xz.d dVar = this.f205230b;
                if (i26 >= 3) {
                    dVar.f192733a = new LinearGradient(0.0f, cVar.n().getViewPortHandler().contentBottom(), 0.0f, cVar.n().getViewPortHandler().contentTop(), iArr, h0.Y0(arrayList), Shader.TileMode.CLAMP);
                    return;
                } else {
                    arrayList.add(Float.valueOf(im.a.f94087d0[i26] / dVar.getYMax()));
                    i26++;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f205232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f205233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ xz.d f205234d;

        public f(p pVar, boolean z14, xz.d dVar) {
            this.f205232b = pVar;
            this.f205233c = z14;
            this.f205234d = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v13, types: [T, int[]] */
        /* JADX WARN: Type inference failed for: r13v21, types: [T, int[]] */
        /* JADX WARN: Type inference failed for: r13v3, types: [T, int[]] */
        /* JADX WARN: Type inference failed for: r1v8, types: [T, int[]] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            Object next;
            Object objPrevious;
            Integer zoneNumber;
            r1 r1Var;
            Double secsInZone;
            r1 r1Var2;
            Double secsInZone2;
            view2.removeOnLayoutChangeListener(this);
            c cVar = c.this;
            int color = a7.b.getColor(cVar.f205202a, R.color.gds_data_viz_red_primary);
            r0 r0Var = new r0();
            r0Var.f105810a = new int[]{color, color};
            List<r1> listK = this.f205232b.K();
            float[] fArrE = null;
            if (!listK.isEmpty()) {
                ArrayList<r1> arrayListC0 = h0.C0(listK, p13.w.c(new r1(null, Double.valueOf(cVar.n().getAxisLeft().getAxisMaximum()), null, null, 8, null)));
                Context context = cVar.f205202a;
                ArrayList arrayList = new ArrayList(p13.y.r(arrayListC0, 10));
                for (r1 r1Var3 : arrayListC0) {
                    arrayList.add(r1Var3 != null ? r1Var3.getZoneNumber() : null);
                }
                int[] iArrW = xy2.b.w(context, arrayList);
                ArrayList arrayList2 = new ArrayList(iArrW.length);
                for (int i26 : iArrW) {
                    arrayList2.add(Integer.valueOf(c7.d.e(i26, cVar.f205213l ? 127 : 255)));
                }
                r0Var.f105810a = h0.a1(arrayList2);
                Iterator it = arrayListC0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        r1Var2 = (r1) next;
                    }
                } while (((r1Var2 == null || (secsInZone2 = r1Var2.getSecsInZone()) == null) ? 0.0d : secsInZone2.doubleValue()) <= 0.0d);
                r1 r1Var4 = (r1) next;
                ListIterator listIterator = arrayListC0.listIterator(arrayListC0.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        r1Var = (r1) objPrevious;
                    }
                } while (((r1Var == null || (secsInZone = r1Var.getSecsInZone()) == null) ? 0.0d : secsInZone.doubleValue()) <= 0.0d);
                r1 r1Var5 = (r1) objPrevious;
                if (r1Var4 == null && r1Var5 == null) {
                    int i27 = ((int[]) r0Var.f105810a)[0];
                    r0Var.f105810a = new int[]{i27, i27};
                } else if (p005kotlin.jvm.internal.s.d(r1Var4 != null ? r1Var4.getZoneLowBoundary() : null, r1Var5 != null ? r1Var5.getZoneLowBoundary() : null)) {
                    Integer numValueOf = (r1Var4 == null || (zoneNumber = r1Var4.getZoneNumber()) == null) ? null : Integer.valueOf(((int[]) r0Var.f105810a)[zoneNumber.intValue()]);
                    if (numValueOf != null) {
                        r0Var.f105810a = new int[]{numValueOf.intValue(), numValueOf.intValue()};
                    }
                } else {
                    YAxis axisLeft = this.f205233c ? cVar.n().getAxisLeft() : cVar.n().getAxisRight();
                    ArrayList arrayList3 = new ArrayList(p13.y.r(arrayListC0, 10));
                    for (r1 r1Var6 : arrayListC0) {
                        arrayList3.add(r1Var6 != null ? r1Var6.getZoneLowBoundary() : null);
                    }
                    fArrE = c.e(cVar, arrayList3, axisLeft.getAxisMinimum(), axisLeft.getAxisMaximum());
                }
            }
            this.f205234d.f192733a = new LinearGradient(0.0f, cVar.n().getViewPortHandler().contentBottom(), 0.0f, cVar.n().getViewPortHandler().contentTop(), (int[]) r0Var.f105810a, fArrE, Shader.TileMode.CLAMP);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ xz.d f205236b;

        public g(xz.d dVar) {
            this.f205236b = dVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            view2.removeOnLayoutChangeListener(this);
            bc1.a aVar = bc1.a.f17414a;
            c cVar = c.this;
            int[] iArrA1 = h0.a1(jg.b.y(aVar, cVar.f205202a));
            this.f205236b.f192733a = new LinearGradient(0.0f, cVar.n().getViewPortHandler().contentBottom(), 0.0f, cVar.n().getViewPortHandler().contentTop(), p13.s.r(iArrA1[iArrA1.length - 1], iArrA1), new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public c(Context context, p pVar, p pVar2, com.garmin.android.apps.connectmobile.activities.newmodel.l lVar, boolean z14, fz.c cVar) {
        boolean z15;
        m3 m3Var;
        List<o20.a> listP;
        context.getClass();
        pVar.getClass();
        cVar.getClass();
        this.f205202a = context;
        this.f205203b = pVar;
        this.f205204c = pVar2;
        this.f205205d = lVar;
        this.f205206e = z14;
        this.f205207f = cVar;
        this.f205211j = a7.b.getColor(context, R.color.gcm_text_secondary);
        this.f205212k = a7.b.getColor(context, R.color.gcm_chart_highlight_line);
        if (pVar2 != null && (listP = pVar2.P(0)) != null) {
            z15 = listP.isEmpty() ^ true;
        }
        this.f205213l = z15;
        this.f205214m = lVar != null ? lVar.getF29638b() : false;
        this.f205218q = new im.g(new l22.a(context));
        f12.l lVar2 = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        this.f205219r = lVar2;
        this.f205220t = lVar2.y();
        this.f205221v = new l22.a(context);
        this.f205222w = new C3837c();
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        String f113501k1 = pVar.getF113501k1();
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.I0, f113501k1)) {
            m3Var = m3.METER;
        } else if (z0.b(x0.f4324r, pVar.getF113501k1())) {
            if (zY) {
                m3Var = m3.METER;
            } else {
                m3Var = m3.YARD;
            }
        } else if (z0.b(x0.f4297k1, pVar.getF113501k1())) {
            if (zY) {
                m3Var = m3.METER;
            } else {
                m3Var = m3.YARD;
            }
        } else if (!z0.b(x0.f4301l1, pVar.getF113501k1())) {
            m3Var = zY ? m3.KILOMETER : m3.MILE;
        } else if (zY) {
            m3Var = m3.METER;
        } else {
            m3Var = m3.YARD;
        }
        this.f205223x = m3Var;
    }

    public static final float[] e(c cVar, ArrayList arrayList, float f14, float f15) {
        cVar.getClass();
        float f16 = f15 - f14;
        if (f16 <= 0.0f) {
            return new float[0];
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Double d14 = (Double) it.next();
            arrayList2.add(Float.valueOf(j23.t.d((float) (((d14 != null ? d14.doubleValue() : f14) - ((double) f14)) / ((double) f16)), 0.0f, 1.0f)));
        }
        return h0.Y0(arrayList2);
    }

    public static final double f(c cVar, List list, float f14) {
        Object next;
        cVar.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((o20.a) next).C() != f14);
        o20.a aVar = (o20.a) next;
        if (aVar != null) {
            return aVar.D();
        }
        return 0.0d;
    }

    public static void g(o20.a aVar) {
        double D = aVar.D();
        if (D <= 90.0d) {
            aVar.G(((double) 90) - D);
        } else {
            aVar.G((((double) 360) - D) + ((double) 90));
        }
    }

    public static String m(c cVar, Entry entry, p pVar) {
        Context context = cVar.f205202a;
        float y14 = entry.getY();
        if (pVar == null || pVar.getB1() != 52) {
            return cVar.l(entry.getY(), pVar, false);
        }
        double d14 = y14;
        List<ps.x0> listO2 = pVar.O2();
        if (d14 < (listO2 != null ? Math.min(3599.0d, e0.c(listO2)) : 0.0d)) {
            String strQ0 = l3.f23124b.q0(cVar.f205202a, Math.abs(y14), cVar.f205220t, false);
            if (y14 < 0.0f) {
                strQ0 = "- ".concat(strQ0);
            }
            String string = context.getString(R.string.string_space_string_pattern, strQ0, pVar.k4());
            string.getClass();
            return string;
        }
        List<ps.x0> listO3 = pVar.O2();
        ps.x0 x0Var = null;
        Object obj = null;
        if (listO3 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listO3) {
                if (p005kotlin.jvm.internal.s.g(qs.x.RUN_REST.f147220a, ((ps.x0) obj2).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String())) {
                    arrayList.add(obj2);
                }
            }
            for (Object obj3 : arrayList) {
                ps.x0 x0Var2 = (ps.x0) obj3;
                long millis = new DateTime(x0Var2.getStartTimeGMT()).getMillis();
                DateTime f113503m1 = pVar.getF113503m1();
                float millis2 = (millis - (f113503m1 != null ? f113503m1.getMillis() : -1L)) / 1000.0f;
                Double duration = x0Var2.getDuration();
                float fDoubleValue = (duration != null ? (long) duration.doubleValue() : 0L) + millis2;
                float x14 = entry.getX();
                if (millis2 <= x14 && x14 <= fDoubleValue) {
                    obj = obj3;
                    break;
                }
            }
            x0Var = (ps.x0) obj;
        }
        if (x0Var != null) {
            String string2 = context.getString(R.string.strength_training_rest_time_label);
            l3.a aVar = l3.f23124b;
            Double duration2 = x0Var.getDuration();
            double dDoubleValue = duration2 != null ? duration2.doubleValue() : 0.0d;
            aVar.getClass();
            String string3 = context.getString(R.string.string_colon_string_pattern, string2, l3.a.b1((long) (dDoubleValue * 1000.0d)));
            if (string3 != null) {
                return string3;
            }
        }
        String string4 = context.getString(R.string.no_duration_value);
        string4.getClass();
        return string4;
    }

    public final ScatterDataSet A(ArrayList arrayList, String str, YAxis.AxisDependency axisDependency, int i14, int i15) {
        ScatterDataSet scatterDataSet = new ScatterDataSet(arrayList, str);
        scatterDataSet.setDrawValues(false);
        scatterDataSet.setAxisDependency(axisDependency);
        scatterDataSet.setColor(a7.b.getColor(this.f205202a, i14), i15);
        scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
        scatterDataSet.setScatterShapeSize(15.0f);
        scatterDataSet.setDrawHighlightIndicators(false);
        scatterDataSet.setHighlightEnabled(false);
        return scatterDataSet;
    }

    public final List<IScatterDataSet> B() {
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        p pVar = this.f205203b;
        ScatterData scatterData = new ScatterData(h(pVar, false, axisDependency));
        O(k.a(scatterData.getYMin(), scatterData.getYMax(), this.f205203b, 0, n().getContext().getResources().getConfiguration().orientation == 2, false, 40), pVar);
        return scatterData.getDataSets();
    }

    public final LineDataSet C(float f14, float f15) {
        float yMax;
        p pVar = this.f205203b;
        com.garmin.android.apps.connectmobile.activities.newmodel.l lVar = this.f205205d;
        LineDataSet lineDataSet = new LineDataSet(lVar != null ? lVar.d(pVar, this.f205207f) : null, "TARGET_TYPE_TAG");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        Context context = this.f205202a;
        lineDataSet.setColor(a7.b.getColor(context, R.color.surface_background_hero_inverted));
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillDrawable(new ColorDrawable(a7.b.getColor(context, R.color.surface_background_hero_inverted_opacity_1)));
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.surface_background_hero_inverted));
        if (gl1.y.B(pVar.getB1()) || pVar.getB1() == 64) {
            lineDataSet.setFillFormatter(new zm.b(this, 0));
        }
        double dMin = Math.min(f14, w52.u0.k(lineDataSet));
        if (gl1.y.B(pVar.getB1()) || pVar.getB1() == 64) {
            Collection values = lineDataSet.getValues();
            float f16 = Float.MIN_VALUE;
            if (values != null) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    float y14 = ((Entry) it.next()).getY();
                    if (y14 != 1000000.0f && y14 > f16) {
                        f16 = y14;
                    }
                }
            }
            yMax = 20 + f16;
        } else {
            yMax = lineDataSet.getYMax();
        }
        O(k.a(dMin, Math.max(f15, yMax), this.f205203b, 0, n().getContext().getResources().getConfiguration().orientation == 2, false, 40), pVar);
        return lineDataSet;
    }

    public String D(List<? extends Entry> list, p pVar) {
        if (list.size() > 1) {
            return this.f205202a.getString(R.string.string_slash_string_pattern, l(list.get(0).getY(), pVar, true), l(list.get(1).getY(), pVar, false));
        }
        if (list.isEmpty()) {
            return null;
        }
        return m(this, list.get(0), pVar);
    }

    public void E(float f14, float f15, float f16, float f17) {
        Highlight highlightByTouchPoint;
        Highlight highlightByTouchPoint2 = n().getHighlightByTouchPoint(f14, f15);
        if (highlightByTouchPoint2 == null || (highlightByTouchPoint = n().getHighlightByTouchPoint(f16, f17)) == null) {
            return;
        }
        Highlight[] highlightArr = f14 < f16 ? new Highlight[]{highlightByTouchPoint2, highlightByTouchPoint} : new Highlight[]{highlightByTouchPoint, highlightByTouchPoint2};
        if (highlightByTouchPoint2.getX() < n().getLowestVisibleX() || highlightByTouchPoint.getX() > n().getHighestVisibleX()) {
            return;
        }
        n().setRectMargins(highlightArr);
        n().highlightValues(highlightArr);
    }

    public void F(float f14, float f15) {
        Highlight highlightByTouchPoint = n().getHighlightByTouchPoint(f14, f15);
        if (highlightByTouchPoint == null) {
            return;
        }
        n().highlightValues((Highlight[]) p13.y.s(p13.u.C(new List[]{t(highlightByTouchPoint.getX(), "ACTIVITY_TYPE_TAG"), this.f205214m ? t(highlightByTouchPoint.getX(), "TARGET_TYPE_TAG") : null, this.f205213l ? t(highlightByTouchPoint.getX(), "OVERLAY_TYPE_TAG") : null})).toArray(new Highlight[0]));
    }

    public final boolean G() {
        p pVar = this.f205203b;
        int b14 = pVar.getB1();
        boolean zO = z0.o(pVar.getF113501k1());
        boolean zX = z0.x(pVar.getF113501k1());
        if ((zO || zX) && b14 == 2) {
            return pVar.U2();
        }
        return false;
    }

    public final void H(xz.d dVar) {
        OverlayCombinedChart overlayCombinedChartN = n();
        if (!overlayCombinedChartN.isLaidOut() || overlayCombinedChartN.isLayoutRequested()) {
            overlayCombinedChartN.addOnLayoutChangeListener(new d(dVar));
            return;
        }
        Context context = this.f205202a;
        int[] iArr = {a7.b.getColor(context, R.color.grit_flow_color_green), a7.b.getColor(context, R.color.flow_color_yellow), a7.b.getColor(context, R.color.flow_color_red)};
        ArrayList arrayList = new ArrayList(3);
        for (int i14 = 0; i14 < 3; i14++) {
            arrayList.add(Float.valueOf(im.a.f94085c0[i14] / dVar.getYMax()));
        }
        dVar.f192733a = new LinearGradient(0.0f, n().getViewPortHandler().contentBottom(), 0.0f, n().getViewPortHandler().contentTop(), iArr, h0.Y0(arrayList), Shader.TileMode.CLAMP);
    }

    public final void I(xz.d dVar) {
        OverlayCombinedChart overlayCombinedChartN = n();
        if (!overlayCombinedChartN.isLaidOut() || overlayCombinedChartN.isLayoutRequested()) {
            overlayCombinedChartN.addOnLayoutChangeListener(new e(dVar));
            return;
        }
        Context context = this.f205202a;
        int[] iArr = {a7.b.getColor(context, R.color.grit_flow_color_green), a7.b.getColor(context, R.color.grit_color_blue), a7.b.getColor(context, R.color.grit_color_purple)};
        ArrayList arrayList = new ArrayList(3);
        for (int i14 = 0; i14 < 3; i14++) {
            arrayList.add(Float.valueOf(im.a.f94087d0[i14] / dVar.getYMax()));
        }
        dVar.f192733a = new LinearGradient(0.0f, n().getViewPortHandler().contentBottom(), 0.0f, n().getViewPortHandler().contentTop(), iArr, h0.Y0(arrayList), Shader.TileMode.CLAMP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, int[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, int[]] */
    /* JADX WARN: Type inference failed for: r13v13, types: [T, int[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [T, int[]] */
    public final void J(p pVar, xz.d dVar, boolean z14) {
        Object next;
        Object objPrevious;
        Integer zoneNumber;
        r1 r1Var;
        Double secsInZone;
        r1 r1Var2;
        Double secsInZone2;
        OverlayCombinedChart overlayCombinedChartN = n();
        if (!overlayCombinedChartN.isLaidOut() || overlayCombinedChartN.isLayoutRequested()) {
            overlayCombinedChartN.addOnLayoutChangeListener(new f(pVar, z14, dVar));
            return;
        }
        Context context = this.f205202a;
        int color = a7.b.getColor(context, R.color.gds_data_viz_red_primary);
        r0 r0Var = new r0();
        r0Var.f105810a = new int[]{color, color};
        List<r1> listK = pVar.K();
        float[] fArrE = null;
        if (!listK.isEmpty()) {
            ArrayList<r1> arrayListC0 = h0.C0(listK, p13.w.c(new r1(null, Double.valueOf(n().getAxisLeft().getAxisMaximum()), null, null, 8, null)));
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListC0, 10));
            for (r1 r1Var3 : arrayListC0) {
                arrayList.add(r1Var3 != null ? r1Var3.getZoneNumber() : null);
            }
            int[] iArrW = xy2.b.w(context, arrayList);
            ArrayList arrayList2 = new ArrayList(iArrW.length);
            for (int i14 : iArrW) {
                arrayList2.add(Integer.valueOf(c7.d.e(i14, this.f205213l ? 127 : 255)));
            }
            r0Var.f105810a = h0.a1(arrayList2);
            Iterator it = arrayListC0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    r1Var2 = (r1) next;
                }
            } while (((r1Var2 == null || (secsInZone2 = r1Var2.getSecsInZone()) == null) ? 0.0d : secsInZone2.doubleValue()) <= 0.0d);
            r1 r1Var4 = (r1) next;
            ListIterator listIterator = arrayListC0.listIterator(arrayListC0.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    r1Var = (r1) objPrevious;
                }
            } while (((r1Var == null || (secsInZone = r1Var.getSecsInZone()) == null) ? 0.0d : secsInZone.doubleValue()) <= 0.0d);
            r1 r1Var5 = (r1) objPrevious;
            if (r1Var4 == null && r1Var5 == null) {
                int i15 = ((int[]) r0Var.f105810a)[0];
                r0Var.f105810a = new int[]{i15, i15};
            } else if (p005kotlin.jvm.internal.s.d(r1Var4 != null ? r1Var4.getZoneLowBoundary() : null, r1Var5 != null ? r1Var5.getZoneLowBoundary() : null)) {
                Integer numValueOf = (r1Var4 == null || (zoneNumber = r1Var4.getZoneNumber()) == null) ? null : Integer.valueOf(((int[]) r0Var.f105810a)[zoneNumber.intValue()]);
                if (numValueOf != null) {
                    r0Var.f105810a = new int[]{numValueOf.intValue(), numValueOf.intValue()};
                }
            } else {
                YAxis axisLeft = z14 ? n().getAxisLeft() : n().getAxisRight();
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayListC0, 10));
                for (r1 r1Var6 : arrayListC0) {
                    arrayList3.add(r1Var6 != null ? r1Var6.getZoneLowBoundary() : null);
                }
                fArrE = e(this, arrayList3, axisLeft.getAxisMinimum(), axisLeft.getAxisMaximum());
            }
        }
        dVar.f192733a = new LinearGradient(0.0f, n().getViewPortHandler().contentBottom(), 0.0f, n().getViewPortHandler().contentTop(), (int[]) r0Var.f105810a, fArrE, Shader.TileMode.CLAMP);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x011c  */
    public final void K(xz.d dVar, boolean z14) {
        int[] iArrA;
        Drawable drawable;
        int color;
        int i14;
        p pVar = this.f205203b;
        int b14 = pVar.getB1();
        p pVar2 = this.f205204c;
        boolean zA = km.d.a(b14, pVar2 != null ? pVar2.getB1() : 0);
        int b15 = pVar.getB1();
        if (b15 == 39) {
            H(dVar);
            return;
        }
        if (b15 == 40) {
            I(dVar);
            return;
        }
        if (b15 == 55) {
            L(dVar);
            return;
        }
        if (b15 == 88) {
            J(pVar, dVar, true);
            return;
        }
        int b16 = pVar.getB1();
        Context context = this.f205202a;
        if (b16 == 20) {
            int iY3 = pVar.Y3();
            int iO1 = pVar.O1();
            ColorDrawable colorDrawable = new ColorDrawable(iY3);
            if (pVar2 != null) {
                iO1 = 127;
            }
            colorDrawable.setAlpha(iO1);
            drawable = colorDrawable;
        } else if (zA) {
            ColorDrawable colorDrawable2 = new ColorDrawable(a7.b.getColor(context, R.color.palette_gray_3));
            colorDrawable2.setAlpha(pVar2 != null ? 127 : 0);
            drawable = colorDrawable2;
        } else {
            int b17 = pVar.getB1();
            if (!z14) {
                iArrA = im.a.a(b17);
            } else if (b17 == 0 || b17 == 1) {
                iArrA = im.a.f94082b;
            } else if (b17 == 3) {
                iArrA = im.a.f94096m;
            } else if (b17 == 4) {
                iArrA = im.a.f94093j;
            } else if (b17 == 5) {
                iArrA = im.a.f94091h;
            } else if (b17 == 50 || b17 == 52) {
                iArrA = im.a.f94082b;
            } else if (b17 == 54) {
                iArrA = im.a.f94092i;
            } else if (b17 != 57) {
                if (b17 != 77) {
                    if (b17 != 81 && b17 != 82) {
                        switch (b17) {
                            case 61:
                            case 62:
                            case 63:
                                iArrA = im.a.f94091h;
                                break;
                            default:
                                switch (b17) {
                                    case 67:
                                    case 68:
                                    case 69:
                                        break;
                                    default:
                                        iArrA = im.a.f94086d;
                                        break;
                                }
                            case 64:
                                iArrA = im.a.f94082b;
                                break;
                        }
                    } else {
                        iArrA = im.a.f94091h;
                    }
                } else {
                    iArrA = im.a.f94082b;
                }
            } else {
                iArrA = im.a.f94091h;
            }
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{a7.b.getColor(context, iArrA[0]), a7.b.getColor(context, iArrA[1])});
            gradientDrawable.setAlpha(this.f205213l ? 127 : 255);
            drawable = gradientDrawable;
        }
        dVar.setFillDrawable(drawable);
        if (zA || !z14) {
            color = a7.b.getColor(context, R.color.gcm3_transparent);
        } else {
            int b18 = pVar.getB1();
            if (b18 == 0 || b18 == 1) {
                i14 = R.color.gcm3_chart_blue_light;
            } else if (b18 == 3) {
                i14 = R.color.gcm3_chart_fill_red;
            } else if (b18 == 4) {
                i14 = R.color.gcm3_chart_gradient_orange_start;
            } else if (b18 == 5) {
                i14 = R.color.gcm3_chart_gradient_purple_end;
            } else if (b18 == 50 || b18 == 52) {
                i14 = R.color.gcm3_chart_blue_light;
            } else if (b18 == 54) {
                i14 = R.color.transparent;
            } else if (b18 == 57) {
                i14 = R.color.gcm3_chart_gradient_purple_end;
            } else if (b18 == 77) {
                i14 = R.color.gcm3_chart_blue_light;
            } else if (b18 != 81) {
                switch (b18) {
                    case 61:
                    case 62:
                    case 63:
                        i14 = R.color.gcm3_chart_gradient_purple_end;
                        break;
                    default:
                        switch (b18) {
                            case 67:
                            case 68:
                            case 69:
                                break;
                            default:
                                i14 = R.color.gcm3_chart_gradient_gray_end;
                                break;
                        }
                    case 64:
                        i14 = R.color.gcm3_chart_blue_light;
                        break;
                }
            } else {
                i14 = R.color.gcm3_chart_gradient_purple_end;
            }
            color = a7.b.getColor(context, i14);
        }
        dVar.setColor(color);
        dVar.setDrawFilled(true);
    }

    public final void L(xz.d dVar) {
        OverlayCombinedChart overlayCombinedChartN = n();
        if (!overlayCombinedChartN.isLaidOut() || overlayCombinedChartN.isLayoutRequested()) {
            overlayCombinedChartN.addOnLayoutChangeListener(new g(dVar));
            return;
        }
        int[] iArrA1 = h0.a1(jg.b.y(bc1.a.f17414a, this.f205202a));
        dVar.f192733a = new LinearGradient(0.0f, n().getViewPortHandler().contentBottom(), 0.0f, n().getViewPortHandler().contentTop(), p13.s.r(iArrA1[iArrA1.length - 1], iArrA1), new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void M(OverlayCombinedChart overlayCombinedChart) {
        if (overlayCombinedChart == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.ACTIVITIES;
            aVar.getClass();
            i2.a.e(a2Var, "Missing chart");
            return;
        }
        this.f205208g = overlayCombinedChart;
        OverlayCombinedChart overlayCombinedChartN = n();
        overlayCombinedChartN.getDescription().setEnabled(false);
        overlayCombinedChartN.getF31342c().setEnabled(false);
        boolean z14 = this.f205206e;
        overlayCombinedChartN.setTouchEnabled(z14);
        overlayCombinedChartN.setPinchZoom(false);
        overlayCombinedChartN.setDrawGridBackground(false);
        overlayCombinedChartN.setScaleYEnabled(false);
        overlayCombinedChartN.setExtraBottomOffset(Utils.convertPixelsToDp(overlayCombinedChartN.getContext().getResources().getDimension(R.dimen.gcm3_chart_margin_bottom_large)));
        if (z14) {
            overlayCombinedChartN.setExtraTopOffset(Utils.convertPixelsToDp(overlayCombinedChartN.getContext().getResources().getDimension(R.dimen.hover_marker_view_height_large)));
        } else {
            overlayCombinedChartN.setExtraLeftOffset(Utils.convertPixelsToDp(overlayCombinedChartN.getContext().getResources().getDimension(R.dimen.gcm3_chart_margin_right)));
        }
        XAxis xAxis = overlayCombinedChartN.getXAxis();
        p pVar = this.f205203b;
        xAxis.setValueFormatter(c22.v.a(pVar.getF113514x1(), this.f205223x));
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(pVar.getB1() == 40 || pVar.getB1() == 39);
        int i14 = this.f205211j;
        xAxis.setTextColor(i14);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisLineColor(i14);
        xAxis.setAxisLineWidth(2.0f);
        xAxis.setTextSize(10.0f);
        xAxis.setLabelCount(z14 ? 10 : 6, true);
        i(overlayCombinedChart, xAxis);
        YAxis axisRight = overlayCombinedChartN.getAxisRight();
        axisRight.setDrawGridLines(false);
        axisRight.setDrawAxisLine(false);
        YAxis.YAxisLabelPosition yAxisLabelPosition = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
        axisRight.setPosition(yAxisLabelPosition);
        axisRight.setLabelCount(6, true);
        boolean z15 = this.f205213l;
        axisRight.setDrawLabels(z15);
        axisRight.setTextColor(i14);
        YAxis axisLeft = overlayCombinedChartN.getAxisLeft();
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setTextColor(i14);
        axisLeft.setPosition(yAxisLabelPosition);
        axisLeft.setLabelCount(6, true);
        if (z15) {
            axisLeft.removeAllLimitLines();
        } else if (!(this instanceof wo.e) && im.a.e(pVar.getB1()) && (!im.a.g(Integer.valueOf(pVar.getB1())) || !this.f205214m)) {
            Context context = overlayCombinedChartN.getContext();
            context.getClass();
            float f113499i1 = (float) pVar.getF113499i1();
            boolean zG = im.a.g(Integer.valueOf(pVar.getB1()));
            LimitLine limitLine = new LimitLine(f113499i1, "");
            limitLine.setLineColor(a7.b.getColor(context, R.color.gcm_chart_avg_line));
            limitLine.setLineWidth(context.getResources().getDimension(R.dimen.gcm3_chart_line_size) / 2);
            if (!zG) {
                limitLine.enableDashedLine(20.0f, 10.0f, 0.0f);
            }
            axisLeft.addLimitLine(limitLine);
        }
        XAxis xAxis2 = overlayCombinedChart.getXAxis();
        xAxis2.getClass();
        Q(overlayCombinedChart, xAxis2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:58:0x0166  */
    /* JADX WARN: Code duplicated, block: B:59:0x016e  */
    /* JADX WARN: Code duplicated, block: B:73:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d6  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void N() {
        int b14;
        Integer numValueOf;
        boolean z14;
        n nVar;
        BarChartRenderer barChartRenderer;
        ArrayList arrayListM;
        int iIndexOf;
        BarData barData;
        ScatterData scatterData;
        um.a aVar;
        int iIndexOf2;
        int iIndexOf3;
        Collection dataSets;
        CombinedData combinedData = new CombinedData();
        List<Object> listO = o();
        p pVar = this.f205203b;
        boolean zI = im.a.i(pVar.getB1());
        p pVar2 = this.f205204c;
        boolean z15 = zI || (pVar2 != null && im.a.i(pVar2.getB1()));
        if (listO != null) {
            ArrayList arrayList = (ArrayList) listO;
            if (arrayList.isEmpty() || z15) {
                o13.p<LineData, ScatterData> pVarW = w();
                LineData lineData = pVarW.f128594a;
                ScatterData scatterData2 = pVarW.f128595b;
                combinedData.setData(lineData);
                combinedData.setData(scatterData2);
                combinedData.setData(new BarData());
            } else {
                for (Object obj : arrayList) {
                    if (obj instanceof LineData) {
                        combinedData.setData((LineData) obj);
                    } else if (obj instanceof ScatterData) {
                        combinedData.setData((ScatterData) obj);
                    } else if (obj instanceof BarData) {
                        combinedData.setData((BarData) obj);
                    }
                }
            }
        } else {
            o13.p<LineData, ScatterData> pVarW2 = w();
            LineData lineData2 = pVarW2.f128594a;
            ScatterData scatterData3 = pVarW2.f128595b;
            combinedData.setData(lineData2);
            combinedData.setData(scatterData3);
            combinedData.setData(new BarData());
        }
        sm.a aVar2 = this.f205216o;
        if (aVar2 != null) {
            LineDataSet lineDataSetA = aVar2.a(this.f205202a, pVar, n());
            LineData lineData3 = combinedData.getLineData();
            ArrayList arrayList2 = (lineData3 == null || (dataSets = lineData3.getDataSets()) == null) ? new ArrayList() : new ArrayList(dataSets);
            arrayList2.add(0, lineDataSetA);
            combinedData.setData(new LineData(arrayList2));
        }
        n().setData(combinedData);
        if (((CombinedData) n().getData()).getEntryCount() == 0) {
            n().getAxisLeft().setDrawLabels(false);
        }
        DataRenderer renderer = n().getRenderer();
        renderer.getClass();
        CombinedChartRenderer combinedChartRenderer = (CombinedChartRenderer) renderer;
        o oVar = new o();
        OverlayCombinedChart overlayCombinedChartN = n();
        int b15 = pVar.getB1();
        sm.a aVar3 = this.f205216o;
        if (this.f205213l) {
            if (pVar2 != null) {
                b14 = pVar2.getB1();
            } else {
                numValueOf = null;
            }
            l lVar = new l(overlayCombinedChartN, !h0.R(p13.w.c(54), numValueOf), oVar, overlayCombinedChartN.getAnimator(), overlayCombinedChartN.getViewPortHandler(), new m());
            if (b15 != 2 || b15 == 87) {
                z14 = true;
            } else {
                z14 = false;
            }
            lVar.f67663g = z14;
            nVar = new n(overlayCombinedChartN, oVar, overlayCombinedChartN.getAnimator(), overlayCombinedChartN.getViewPortHandler());
            barChartRenderer = new BarChartRenderer(overlayCombinedChartN, overlayCombinedChartN.getAnimator(), overlayCombinedChartN.getViewPortHandler());
            arrayListM = p13.x.m(lVar, nVar, barChartRenderer);
            if (im.a.f(Integer.valueOf(b15))) {
                iIndexOf3 = arrayListM.indexOf(barChartRenderer);
                if (iIndexOf3 > 0) {
                    arrayListM.add(0, arrayListM.remove(iIndexOf3));
                }
            } else if (im.a.h(Integer.valueOf(b15)) && (iIndexOf = arrayListM.indexOf(nVar)) > 0) {
                arrayListM.add(0, arrayListM.remove(iIndexOf));
            }
            if ((aVar3 instanceof sm.c) && (iIndexOf2 = arrayListM.indexOf(lVar)) > 0) {
                arrayListM.add(0, arrayListM.remove(iIndexOf2));
            }
            barData = overlayCombinedChartN.getCombinedData().getBarData();
            if (barData != null || barData.getDataSets().isEmpty()) {
                arrayListM.remove(barChartRenderer);
            }
            scatterData = overlayCombinedChartN.getCombinedData().getScatterData();
            if (scatterData != null || scatterData.getDataSets().isEmpty()) {
                arrayListM.remove(nVar);
            }
            combinedChartRenderer.setSubRenderers(arrayListM);
            if (this.f205206e) {
                j(n());
            }
            aVar = this.f205215n;
            if (aVar != null) {
                aVar.setOffset(n().getAxisLeft().getAxisLineWidth(), n().getAxisRight().getAxisLineWidth());
            }
            n().invalidate();
        }
        b14 = pVar.getB1();
        numValueOf = Integer.valueOf(b14);
        l lVar2 = new l(overlayCombinedChartN, !h0.R(p13.w.c(54), numValueOf), oVar, overlayCombinedChartN.getAnimator(), overlayCombinedChartN.getViewPortHandler(), new m());
        if (b15 != 2) {
            z14 = true;
        } else {
            z14 = true;
        }
        lVar2.f67663g = z14;
        nVar = new n(overlayCombinedChartN, oVar, overlayCombinedChartN.getAnimator(), overlayCombinedChartN.getViewPortHandler());
        barChartRenderer = new BarChartRenderer(overlayCombinedChartN, overlayCombinedChartN.getAnimator(), overlayCombinedChartN.getViewPortHandler());
        arrayListM = p13.x.m(lVar2, nVar, barChartRenderer);
        if (im.a.f(Integer.valueOf(b15))) {
            iIndexOf3 = arrayListM.indexOf(barChartRenderer);
            if (iIndexOf3 > 0) {
                arrayListM.add(0, arrayListM.remove(iIndexOf3));
            }
        } else if (im.a.h(Integer.valueOf(b15))) {
            arrayListM.add(0, arrayListM.remove(iIndexOf));
        }
        if (aVar3 instanceof sm.c) {
            arrayListM.add(0, arrayListM.remove(iIndexOf2));
        }
        barData = overlayCombinedChartN.getCombinedData().getBarData();
        if (barData != null) {
            arrayListM.remove(barChartRenderer);
        } else {
            arrayListM.remove(barChartRenderer);
        }
        scatterData = overlayCombinedChartN.getCombinedData().getScatterData();
        if (scatterData != null) {
            arrayListM.remove(nVar);
        } else {
            arrayListM.remove(nVar);
        }
        combinedChartRenderer.setSubRenderers(arrayListM);
        if (this.f205206e) {
            j(n());
        }
        aVar = this.f205215n;
        if (aVar != null) {
            aVar.setOffset(n().getAxisLeft().getAxisLineWidth(), n().getAxisRight().getAxisLineWidth());
        }
        n().invalidate();
    }

    public final void O(double[] dArr, p pVar) {
        dArr.getClass();
        pVar.getClass();
        YAxis axisLeft = n().getAxisLeft();
        axisLeft.getClass();
        k.h(this.f205202a, axisLeft, dArr, pVar, null);
        k.f(n(), pVar.getB1());
    }

    public final void P(double[] dArr, p pVar) {
        int iY3;
        int color;
        int i14;
        YAxis axisRight = n().getAxisRight();
        axisRight.getClass();
        Context context = this.f205202a;
        k.h(context, axisRight, dArr, pVar, null);
        OverlayCombinedChart overlayCombinedChartN = n();
        int b14 = pVar.getB1();
        context.getClass();
        if (b14 == 14 || b14 == 19 || b14 == 24) {
            overlayCombinedChartN.setExtraRightOffset(context.getResources().getDimension(R.dimen.chart_margin_labels_chart));
            overlayCombinedChartN.setRendererRightYAxis(new ym.b(overlayCombinedChartN, YAxis.AxisDependency.RIGHT, b14));
        }
        int b15 = pVar.getB1();
        if (b15 == 20) {
            iY3 = pVar.Y3();
        } else if (b15 != 43) {
            switch (b15) {
                case 58:
                case 59:
                case 60:
                    iY3 = a7.b.getColor(context, R.color.gray_white_static);
                    break;
                default:
                    iY3 = a7.b.getColor(context, im.a.a(pVar.getB1())[1]);
                    break;
            }
        } else {
            iY3 = a7.b.getColor(context, R.color.gcm3_stress_gradient_orange_middle);
        }
        int b16 = pVar.getB1();
        if (b16 == 11 || b16 == 44 || b16 == 66) {
            color = a7.b.getColor(context, R.color.gds_data_viz_orange_primary);
        } else {
            switch (pVar.getB1()) {
                case 23:
                case 24:
                case 25:
                case 26:
                    i14 = im.a.a(pVar.getB1())[0];
                    break;
                default:
                    im.s sVar = (im.s) h0.m0(im.a.c(pVar.getB1(), pVar.W()));
                    i14 = sVar == null ? R.color.gcm_text_secondary : sVar.f94179a;
                    break;
            }
            color = a7.b.getColor(context, i14);
        }
        YAxis axisRight2 = n().getAxisRight();
        if (!im.a.g(Integer.valueOf(pVar.getB1()))) {
            iY3 = color;
        }
        axisRight2.setTextColor(iY3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
    public void Q(OverlayCombinedChart overlayCombinedChart, XAxis xAxis) {
        h00.g gVar;
        overlayCombinedChart.getClass();
        p pVar = this.f205203b;
        if (pVar.getB1() == 40 || pVar.getB1() == 39) {
            ViewPortHandler viewPortHandler = overlayCombinedChart.getViewPortHandler();
            viewPortHandler.getClass();
            Transformer transformer = overlayCombinedChart.getTransformer(YAxis.AxisDependency.LEFT);
            transformer.getClass();
            overlayCombinedChart.setXAxisRenderer(new ym.c(viewPortHandler, xAxis, transformer, this.f205202a, pVar.K3(), this.f205207f, this.f205220t));
            return;
        }
        String f113501k1 = pVar.getF113501k1();
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.f4312o, f113501k1) && pVar.getB1() == 2) {
            ViewPortHandler viewPortHandler2 = overlayCombinedChart.getViewPortHandler();
            viewPortHandler2.getClass();
            Transformer transformer2 = overlayCombinedChart.getTransformer(YAxis.AxisDependency.LEFT);
            transformer2.getClass();
            overlayCombinedChart.setXAxisRenderer(new ym.a(viewPortHandler2, xAxis, transformer2, this.f205202a, pVar.Y2(), this.f205207f, this.f205220t));
            return;
        }
        if ((z0.o(pVar.getF113501k1()) || z0.x(pVar.getF113501k1())) && pVar.getB1() == 2) {
            xAxis.setDrawAxisLine(true);
            ViewPortHandler viewPortHandler3 = overlayCombinedChart.getViewPortHandler();
            viewPortHandler3.getClass();
            Transformer transformer3 = overlayCombinedChart.getTransformer(YAxis.AxisDependency.LEFT);
            transformer3.getClass();
            overlayCombinedChart.setXAxisRenderer(new ym.d(viewPortHandler3, xAxis, transformer3, this.f205202a, pVar.Y2(), this.f205207f, this.f205220t));
            return;
        }
        ViewPortHandler viewPortHandler4 = overlayCombinedChart.getViewPortHandler();
        viewPortHandler4.getClass();
        Transformer transformer4 = overlayCombinedChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer4.getClass();
        if (z0.b(x0.f4324r, pVar.getF113501k1())) {
            gVar = h00.g.MULTIPLE_OF_10;
        } else {
            if (z0.b(x0.I0, pVar.getF113501k1())) {
                gVar = h00.g.MULTIPLE_OF_10;
            } else {
                gVar = h00.g.MULTIPLE_OF_0_05;
            }
        }
        overlayCombinedChart.setXAxisRenderer(new h00.j(viewPortHandler4, xAxis, transformer4, this.f205207f, this.f205220t, gVar));
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
        linearLayout.getClass();
        this.f205210i = linearLayout;
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
        linearLayout.getClass();
        this.f205209h = linearLayout;
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f205202a).inflate(R.layout.gcm3_overlay_combined_chart_view, viewGroup, false);
        OverlayCombinedChart overlayCombinedChart = (OverlayCombinedChart) viewInflate.findViewById(R.id.combined_chart_view);
        if (this.f205206e) {
            zm.a aVar = new zm.a(overlayCombinedChart, 0);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(overlayCombinedChart, aVar);
            overlayCombinedChart.getClass();
            if (overlayCombinedChart.isAttachedToWindow()) {
                overlayCombinedChart.requestApplyInsets();
            } else {
                overlayCombinedChart.addOnAttachStateChangeListener(new b(overlayCombinedChart, overlayCombinedChart));
            }
        }
        qm.t.c(overlayCombinedChart);
        M(overlayCombinedChart);
        N();
        LinearLayout linearLayout = this.f205210i;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            if (!this.f205217p) {
                linearLayout.removeAllViews();
                p pVar = this.f205203b;
                String f113500j1 = pVar.getF113500j1();
                Context context = linearLayout.getContext();
                int i14 = this.f205211j;
                TextView textViewA = qm.t.a(context, i14, i14, f113500j1);
                String strE1 = pVar.E1();
                if (strE1 != null) {
                    textViewA.setContentDescription(strE1);
                }
                linearLayout.addView(textViewA);
            }
        }
        LinearLayout linearLayout2 = this.f205209h;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0158  */
    /* JADX WARN: Code duplicated, block: B:51:0x0177  */
    /* JADX WARN: Code duplicated, block: B:56:0x0185  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c0  */
    public final ArrayList h(p pVar, boolean z14, YAxis.AxisDependency axisDependency) {
        boolean z15;
        int i14;
        String str;
        c cVar;
        List<o13.p> listK;
        o20.a aVar;
        o20.a aVar2;
        ArrayList arrayList;
        c cVar2 = this;
        int b14 = pVar.getB1();
        boolean z16 = cVar2.f205213l;
        int i15 = 0;
        switch (b14) {
            case 23:
            case 24:
            case 25:
            case 26:
                z15 = true;
                List<o20.a> listP = pVar.P(0);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i16 = 0;
                while (i16 < listP.size() - 1) {
                    int i17 = i16 + 1;
                    if (listP.get(i16).C() >= listP.get(i17).C() && !(listP.get(i16).C() == listP.get(i17).C() && (Double.isNaN(listP.get(i16).D()) || Double.isNaN(listP.get(i17).D())))) {
                        if (i16 < listP.size()) {
                            aVar2 = new o20.a(listP.get(i16).C(), listP.get(i16).D());
                            if (pVar.getB1() == 24) {
                                g(aVar2);
                            }
                            arrayList2.add(aVar2);
                            i16++;
                        }
                        while (i16 < listP.size()) {
                            aVar = new o20.a(listP.get(i16).C(), listP.get(i16).D());
                            if (pVar.getB1() == 24) {
                                g(aVar);
                            }
                            arrayList3.add(aVar);
                            i16++;
                        }
                        int[] iArrA = im.a.a(pVar.getB1());
                        if (z16 || z14) {
                            i14 = 255;
                        } else {
                            i14 = 127;
                        }
                        if (z14) {
                            str = "OVERLAY_TYPE_TAG";
                        } else {
                            str = "ACTIVITY_TYPE_TAG";
                        }
                        ArrayList arrayListC = ar.e.c(arrayList2);
                        arrayListC.getClass();
                        cVar = this;
                        o13.p pVar2 = new o13.p(cVar.A(arrayListC, str, axisDependency, iArrA[0], i14), arrayListC);
                        ArrayList arrayListC2 = ar.e.c(arrayList3);
                        arrayListC2.getClass();
                        listK = p13.x.k(pVar2, new o13.p(cVar.A(arrayListC2, str, axisDependency, iArrA[1], i14), arrayListC2));
                    } else {
                        o20.a aVar3 = new o20.a(listP.get(i16).C(), listP.get(i16).D());
                        if (pVar.getB1() == 24) {
                            g(aVar3);
                        }
                        arrayList2.add(aVar3);
                        i16 = i17;
                    }
                    break;
                }
                if (i16 < listP.size()) {
                    aVar2 = new o20.a(listP.get(i16).C(), listP.get(i16).D());
                    if (pVar.getB1() == 24) {
                        g(aVar2);
                    }
                    arrayList2.add(aVar2);
                    i16++;
                }
                while (i16 < listP.size()) {
                    aVar = new o20.a(listP.get(i16).C(), listP.get(i16).D());
                    if (pVar.getB1() == 24) {
                        g(aVar);
                    }
                    arrayList3.add(aVar);
                    i16++;
                }
                int[] iArrA2 = im.a.a(pVar.getB1());
                if (z16) {
                    i14 = 255;
                } else {
                    i14 = 255;
                }
                if (z14) {
                    str = "OVERLAY_TYPE_TAG";
                } else {
                    str = "ACTIVITY_TYPE_TAG";
                }
                ArrayList arrayListC3 = ar.e.c(arrayList2);
                arrayListC3.getClass();
                cVar = this;
                o13.p pVar3 = new o13.p(cVar.A(arrayListC3, str, axisDependency, iArrA2[0], i14), arrayListC3);
                ArrayList arrayListC4 = ar.e.c(arrayList3);
                arrayListC4.getClass();
                listK = p13.x.k(pVar3, new o13.p(cVar.A(arrayListC4, str, axisDependency, iArrA2[1], i14), arrayListC4));
                break;
            default:
                ArrayList arrayList4 = new ArrayList();
                for (im.s sVar : im.a.c(pVar.getB1(), pVar.W())) {
                    List<o20.a> listP2 = pVar.P(i15);
                    if (listP2 == null || sVar == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        int i18 = i15;
                        for (int size = listP2.size(); i18 < size; size = size) {
                            double D = listP2.get(i18).D();
                            if ((D >= sVar.f94180b && D < sVar.f94181c) || Double.isNaN(D)) {
                                arrayList.add(new Entry((float) listP2.get(i18).C(), (float) D));
                            }
                            i18++;
                        }
                    }
                    if (arrayList != null) {
                        int i19 = sVar.f94179a;
                        ArrayList arrayList5 = arrayList;
                        arrayList4.add(new o13.p(cVar2.A(arrayList5, "", axisDependency, i19, (!z16 || z14) ? 255 : 127), arrayList5));
                    }
                    cVar2 = this;
                    i15 = 0;
                }
                z15 = true;
                listK = h0.b1(arrayList4);
                cVar = this;
                break;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (o13.p pVar4 : listK) {
            arrayList6.add(pVar4.f128594a);
            arrayList7.addAll((Collection) pVar4.f128595b);
        }
        p13.c0.u(arrayList7, new ww0.d(new z21.a((byte) 0, 24), 6));
        ScatterDataSet scatterDataSet = new ScatterDataSet(arrayList7, z14 ? "OVERLAY_TYPE_TAG" : "ACTIVITY_TYPE_TAG");
        scatterDataSet.setDrawValues(false);
        scatterDataSet.setAxisDependency(axisDependency);
        scatterDataSet.setColor(a7.b.getColor(cVar.f205202a, R.color.gcm_text_on_color), 0);
        scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
        scatterDataSet.setScatterShapeSize(15.0f);
        scatterDataSet.setHighlightLineWidth(1.0f);
        scatterDataSet.setHighLightColor(cVar.getF205212k());
        boolean z17 = z15;
        scatterDataSet.setDrawVerticalHighlightIndicator(z17);
        scatterDataSet.setDrawHorizontalHighlightIndicator(false);
        scatterDataSet.setHighlightEnabled(z17);
        arrayList6.add(0, scatterDataSet);
        return arrayList6;
    }

    public void i(OverlayCombinedChart overlayCombinedChart, XAxis xAxis) {
        overlayCombinedChart.getClass();
    }

    public void j(OverlayCombinedChart overlayCombinedChart) {
        um.a aVar = new um.a(this.f205202a, R.layout.chart_highlight_dynamic_metrics_view, true);
        C3837c c3837c = this.f205222w;
        boolean z14 = this.f205213l;
        aVar.a(z14, c3837c);
        this.f205215n = aVar;
        overlayCombinedChart.setTouchEnabled(true);
        overlayCombinedChart.setMarker(this.f205215n);
        overlayCombinedChart.setHighlighter(new CombinedHighlighter(overlayCombinedChart, overlayCombinedChart));
        overlayCombinedChart.setHighlightPerDragEnabled(false);
        overlayCombinedChart.setHighlightPerTapEnabled(false);
        overlayCombinedChart.setDoubleTapToZoomEnabled(true);
        overlayCombinedChart.setOnChartGestureListener(new s(overlayCombinedChart));
        t.b(overlayCombinedChart, new zm.d(this), new zm.e(this), !z14, aVar);
    }

    public final String k(float f14, fz.c cVar) {
        cVar.getClass();
        String formattedValue = c22.v.a(this.f205203b.getF113514x1(), this.f205223x).getFormattedValue(f14);
        formattedValue.getClass();
        return formattedValue;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02f6 A[RETURN] */
    public final String l(float f14, p pVar, boolean z14) {
        String strK4;
        q3 q3Var;
        q3 q3Var2;
        rm.a aVarU3;
        Float f15;
        String strK;
        String strB;
        if (pVar != null) {
            int b14 = pVar.getB1();
            boolean z15 = this.f205220t;
            float fFloatValue = 0.0f;
            String strX0 = "";
            l22.a aVar = this.f205221v;
            Context context = this.f205202a;
            switch (b14) {
                case 0:
                    q3 q3Var3 = z15 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                    boolean zI = z0.I(pVar.getF113501k1());
                    boolean zB = z0.b(x0.O1, pVar.getF113501k1());
                    if (zI) {
                        q3Var3 = q3.NAUTICAL_MILES_PER_HOUR;
                    } else {
                        if (zB && (strK4 = pVar.k4()) != null && (q3Var = com.garmin.android.apps.connectmobile.activities.newmodel.e0.valueOf(strK4).f29425a) != null) {
                            q3Var2 = q3Var;
                        }
                        l3.f23124b.getClass();
                        strX0 = l3.a.X0(this.f205202a, f14, q3Var2, l3.f23130h, context.getString(R.string.no_value));
                        if (strX0 != null) {
                            return strX0;
                        }
                    }
                    q3Var2 = q3Var3;
                    l3.f23124b.getClass();
                    strX0 = l3.a.X0(this.f205202a, f14, q3Var2, l3.f23130h, context.getString(R.string.no_value));
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 1:
                case 50:
                case 52:
                case 64:
                case 67:
                case 68:
                case 69:
                    l3.a aVar2 = l3.f23124b;
                    double dAbs = Math.abs(f14);
                    String string = context.getString(R.string.no_value);
                    aVar2.getClass();
                    context.getClass();
                    String strZ0 = aVar2.z0(new l22.a(context), dAbs, this.f205220t, false, string);
                    if (f14 < 0.0f) {
                        strZ0 = "- ".concat(strZ0);
                    }
                    strX0 = context.getString(R.string.string_space_string_pattern, strZ0, pVar.k4());
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 2:
                case 47:
                case 87:
                    l3.a aVar3 = l3.f23124b;
                    boolean zR = am.r1.r();
                    aVar3.getClass();
                    strX0 = l3.a.W0(f14, context, zR);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 3:
                case 51:
                case 88:
                    strX0 = l3.a.l0(l3.f23124b, aVar, f14, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 4:
                    l3.f23124b.getClass();
                    strX0 = l3.a.E(context, f14, true, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 5:
                case 62:
                    strX0 = l3.a.F0(l3.f23124b, context, f14, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 6:
                    l3.a aVar4 = l3.f23124b;
                    boolean zC = this.f205219r.c();
                    aVar4.getClass();
                    strX0 = l3.a.Y0(f14, context, zC);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 7:
                case 10:
                    strX0 = (Float.isNaN(f14) || Float.isInfinite(f14)) ? context.getString(R.string.no_value) : String.valueOf((int) f14);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 8:
                case 9:
                case 17:
                case 18:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 36:
                case 37:
                case 38:
                case 42:
                case 45:
                case 46:
                case 48:
                case 49:
                case 53:
                case 54:
                case 56:
                case 57:
                case 65:
                case 70:
                case 73:
                case 74:
                case 75:
                case 76:
                case 78:
                case 79:
                case 80:
                case 82:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                default:
                    strX0 = String.valueOf(f14);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 11:
                case 44:
                case 66:
                case 71:
                case 72:
                    l3.f23124b.getClass();
                    strX0 = l3.a.E(context, f14, true, false);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 12:
                    l3.f23124b.getClass();
                    strX0 = l3.a.i0(aVar, f14, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 13:
                    l3.f23124b.getClass();
                    strX0 = l3.a.z1(aVar, f14, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 14:
                    l3.f23124b.getClass();
                    strX0 = l3.a.J(aVar, f14);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 15:
                case 86:
                    l3.f23124b.getClass();
                    strX0 = l3.a.R0(aVar, f14, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 16:
                    double d14 = f14;
                    l3.f23124b.getClass();
                    strX0 = l3.a.A1(context != null ? new l22.a(context) : null, d14, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 19:
                    l3.f23124b.getClass();
                    strX0 = l3.a.J(aVar, f14);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 20:
                    strX0 = context.getString(R.string.string_space_string_pattern, new mm.a(pVar.t2()).getFormattedValue(f14, null), pVar.k4());
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 21:
                case 22:
                    l3.f23124b.getClass();
                    strX0 = l3.a.C0(aVar, f14);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 23:
                case 25:
                case 26:
                    l3.f23124b.getClass();
                    return l3.a.I0(aVar, f14, z14, false);
                case 24:
                    l3.f23124b.getClass();
                    return l3.a.I0(aVar, f14, z14, true);
                case 34:
                    l3.f23124b.getClass();
                    strX0 = l3.a.d0(f14, context, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 35:
                    p pVar2 = this.f205204c;
                    if (pVar2 != null && (aVarU3 = pVar2.U3()) != null && (f15 = aVarU3.f153493g) != null) {
                        fFloatValue = f15.floatValue();
                    }
                    double d15 = fFloatValue - f14;
                    l3.a aVar5 = l3.f23124b;
                    if (d15 <= 0.0d) {
                        d15 = 0.0d;
                    }
                    aVar5.getClass();
                    strX0 = l3.a.M(context, d15, z15, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 39:
                    l3.f23124b.getClass();
                    strX0 = l3.a.e0(context, f14);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 40:
                    l3.f23124b.getClass();
                    strX0 = l3.a.h0(context, f14);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 41:
                    strK = new l3(context).k(f14, true);
                    if (strK.length() == 0) {
                        strK = context.getString(R.string.no_value);
                        strK.getClass();
                    }
                    break;
                case 43:
                    strX0 = c22.u.d(f14, context);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 55:
                    if (Float.isNaN(f14) || Float.isInfinite(f14)) {
                        return "--%";
                    }
                    l3.f23124b.getClass();
                    strX0 = l3.a.A0(context, f14, 0);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 58:
                case 59:
                    String string2 = context.getString(R.string.no_value);
                    string2.getClass();
                    l3.f23124b.getClass();
                    strX0 = l3.a.B0(aVar, f14, 0, string2);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 60:
                    if (Float.isNaN(f14) || Float.isInfinite(f14)) {
                        strX0 = context.getString(R.string.no_value);
                    } else {
                        List<String> listI2 = pVar.I2();
                        int f113509s1 = ((int) f14) - ((int) pVar.getF113509s1());
                        if (listI2 == null || listI2.isEmpty() || f113509s1 >= listI2.size()) {
                            if (f14 < 1.0f) {
                                strB = context.getString(R.string.lbl_off);
                            } else {
                                l3.f23124b.getClass();
                                strB = l3.a.B(f14);
                            }
                            strX0 = strB;
                            strX0.getClass();
                        } else {
                            strX0 = listI2.get(f113509s1);
                        }
                    }
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 61:
                case 63:
                    l3.f23124b.getClass();
                    strX0 = l3.a.G0(context, f14, true, "");
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 77:
                    l3.f23124b.getClass();
                    strX0 = l3.a.o0(aVar, f14, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 81:
                    l3.a aVar6 = l3.f23124b;
                    String string3 = context.getString(R.string.no_value);
                    string3.getClass();
                    aVar6.getClass();
                    strX0 = l3.a.g0(aVar, f14, true, string3);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 83:
                    ls.e eVar = ls.e.AVERAGE_STEP_SPEED_LOSS;
                    l3.f23124b.getClass();
                    strK = ss.k.b(eVar, aVar, Double.valueOf(l3.a.b(f14)), 1);
                    if (strK != null) {
                    }
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 84:
                    strK = ss.k.b(ls.e.AVERAGE_STEP_SPEED_LOSS_PERCENT, aVar, Double.valueOf(f14), 1);
                    if (strK != null) {
                    }
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 85:
                    l3.f23124b.getClass();
                    strX0 = l3.a.M(context, f14, z15, true);
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
                case 96:
                    strK = ss.k.b(ls.e.TA, aVar, Double.valueOf(f14), 1);
                    if (strK != null) {
                    }
                    if (strX0 != null) {
                        return strX0;
                    }
                    break;
            }
            strX0 = strK;
            if (strX0 != null) {
                return strX0;
            }
        }
        l3.f23124b.getClass();
        return l3.a.B(f14);
    }

    public final OverlayCombinedChart n() {
        OverlayCombinedChart overlayCombinedChart = this.f205208g;
        if (overlayCombinedChart != null) {
            return overlayCombinedChart;
        }
        p005kotlin.jvm.internal.s.m("chart");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    public List<Object> o() {
        ChartData barData;
        ArrayList arrayList = new ArrayList();
        LineData lineData = new LineData();
        ChartData barData2 = null;
        p pVar = this.f205204c;
        Integer numValueOf = pVar != null ? Integer.valueOf(pVar.getB1()) : null;
        int b14 = this.f205203b.getB1();
        boolean zG = im.a.g(Integer.valueOf(b14));
        boolean z14 = this.f205214m;
        boolean z15 = this.f205213l;
        if (zG) {
            Iterator it = v().iterator();
            while (it.hasNext()) {
                lineData.addDataSet((LineDataSet) it.next());
            }
            if (z14) {
                lineData.addDataSet(C(lineData.getYMin(), lineData.getYMax()));
            }
            if (z15) {
                if (im.a.g(numValueOf)) {
                    lineData.addDataSet(y());
                } else if (im.a.h(numValueOf)) {
                    barData = null;
                    barData2 = new ScatterData(z());
                } else if (im.a.f(numValueOf)) {
                    barData = new BarData(pVar == null ? j0.f134944a : j0.f134944a);
                }
                barData = null;
            } else {
                barData = null;
            }
        } else if (im.a.f(Integer.valueOf(b14))) {
            j0 j0Var = j0.f134944a;
            barData = new BarData(j0Var);
            if (z15) {
                if (im.a.g(numValueOf)) {
                    lineData.addDataSet(y());
                } else if (im.a.h(numValueOf)) {
                    barData2 = new ScatterData(z());
                } else if (im.a.f(numValueOf)) {
                    barData = new BarData(j0Var);
                }
            }
        } else if (im.a.h(Integer.valueOf(b14))) {
            ChartData scatterData = new ScatterData(B());
            if (z14 && !z15) {
                lineData = new LineData(C(scatterData.getYMin(), scatterData.getYMax()));
            }
            if (z15) {
                if (im.a.g(numValueOf)) {
                    lineData = new LineData(y());
                } else if (im.a.h(numValueOf)) {
                    List<IScatterDataSet> listZ = z();
                    if (listZ != null) {
                        Iterator<T> it3 = listZ.iterator();
                        while (it3.hasNext()) {
                            scatterData.addDataSet((IScatterDataSet) it3.next());
                        }
                    }
                } else if (im.a.f(numValueOf)) {
                    barData2 = new BarData(pVar == null ? j0.f134944a : j0.f134944a);
                }
            }
            barData = barData2;
            barData2 = scatterData;
        } else {
            barData = null;
        }
        arrayList.add(lineData);
        if (barData2 != null) {
            arrayList.add(barData2);
        }
        if (barData != null) {
            arrayList.add(barData);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public im.g getF205218q() {
        return this.f205218q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IBarLineScatterCandleBubbleDataSet<Entry> q() {
        T dataSetByLabel = ((CombinedData) n().getData()).getDataSetByLabel("ACTIVITY_TYPE_TAG", true);
        dataSetByLabel.getClass();
        return (IBarLineScatterCandleBubbleDataSet) dataSetByLabel;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public int getF205212k() {
        return this.f205212k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<Entry> s(float f14) {
        Collection entriesForXValue;
        IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) ((CombinedData) n().getData()).getDataSetByLabel("ACTIVITY_TYPE_TAG", true);
        if (iBarLineScatterCandleBubbleDataSet == null || (entriesForXValue = iBarLineScatterCandleBubbleDataSet.getEntriesForXValue(f14)) == null) {
            return null;
        }
        return new ArrayList(entriesForXValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList t(float f14, String str) {
        IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) ((CombinedData) n().getData()).getDataSetByLabel(str, true);
        if (iBarLineScatterCandleBubbleDataSet == null) {
            return null;
        }
        List<BarLineScatterCandleBubbleData> allData = ((CombinedData) n().getData()).getAllData();
        allData.getClass();
        Iterator<BarLineScatterCandleBubbleData> it = allData.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            if (it.next().getIndexOfDataSet(iBarLineScatterCandleBubbleDataSet) != -1) {
                break;
            }
            i14++;
        }
        int indexOfDataSet = ((CombinedData) n().getData()).getAllData().get(i14).getIndexOfDataSet(iBarLineScatterCandleBubbleDataSet);
        Collection<Entry> entriesForXValue = iBarLineScatterCandleBubbleDataSet.getEntriesForXValue(f14);
        if (entriesForXValue == null || entriesForXValue.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : entriesForXValue) {
            Highlight highlight = new Highlight(entry.getX(), entry.getY(), indexOfDataSet);
            highlight.setDataIndex(i14);
            arrayList.add(highlight);
        }
        return arrayList;
    }

    public final xz.d u(List list) {
        list.getClass();
        p pVar = this.f205203b;
        int b14 = pVar.getB1();
        ArrayList arrayListC = ar.e.c(list);
        arrayListC.getClass();
        xz.d dVar = new xz.d(arrayListC, "ACTIVITY_TYPE_TAG");
        dVar.setDrawValues(false);
        dVar.setDrawCircles(false);
        dVar.setAxisDependency(YAxis.AxisDependency.LEFT);
        dVar.setHighlightLineWidth(1.0f);
        dVar.setHighLightColor(getF205212k());
        dVar.setLineWidth(2.0f);
        dVar.setDrawHorizontalHighlightIndicator(false);
        if (gl1.y.B(b14) || b14 == 64) {
            dVar.setFillFormatter(new zm.b(this, 1));
        }
        if (G()) {
            boolean z14 = this.f205213l;
            Context context = this.f205202a;
            if (z14) {
                dVar.setColor(a7.b.getColor(context, R.color.gcm3_transparent));
            } else {
                List<Integer> listN1 = pVar.n1();
                ArrayList arrayList = new ArrayList(p13.y.r(listN1, 10));
                Iterator<T> it = listN1.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(a7.b.getColor(context, ((Number) it.next()).intValue())));
                }
                dVar.setColors(arrayList);
            }
        }
        dVar.setMode(k.e(pVar) ? LineDataSet.Mode.STEPPED : LineDataSet.Mode.LINEAR);
        if (!G()) {
            K(dVar, this.f205214m);
        }
        O(k.a((b14 == 3 || b14 == 88) ? w52.u0.k(dVar) : dVar.getYMin(), dVar.getYMax(), this.f205203b, 0, n().getContext().getResources().getConfiguration().orientation == 2, this.f205204c != null, 8), pVar);
        return dVar;
    }

    public ArrayList v() {
        boolean z14;
        ArrayList arrayList = new ArrayList();
        p pVar = this.f205203b;
        boolean z15 = false;
        arrayList.add(u(pVar.P(0)));
        if (G()) {
            List<o20.a> listP = pVar.P(0);
            List<Integer> listN1 = pVar.n1();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i14 = 0;
            for (Object obj : listP) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                o20.a aVar = (o20.a) obj;
                if (i14 == listP.size() - 1 || !p005kotlin.jvm.internal.s.g(h0.e0(i14, listN1), h0.e0(i15, listN1))) {
                    arrayList3.add(new Entry((float) aVar.C(), (float) aVar.D()));
                    LineDataSet lineDataSet = new LineDataSet(h0.b1(arrayList3), "ACTIVITY_TYPE_TAG");
                    boolean z16 = this.f205213l;
                    Context context = this.f205202a;
                    if (z16) {
                        lineDataSet.setColor(a7.b.getColor(context, R.color.gcm3_transparent));
                        lineDataSet.setFillColor(a7.b.getColor(context, R.color.palette_gray_3));
                        lineDataSet.setFillAlpha(this.f205204c != null ? 127 : 0);
                    } else {
                        Integer num = (Integer) h0.e0(i14, listN1);
                        lineDataSet.setColor(a7.b.getColor(context, num != null ? num.intValue() : 0));
                        lineDataSet.setFillColor(lineDataSet.getColor());
                        lineDataSet.setFillAlpha(255);
                    }
                    z14 = false;
                    lineDataSet.setHighlightEnabled(false);
                    lineDataSet.setDrawFilled(true);
                    lineDataSet.setDrawValues(false);
                    lineDataSet.setDrawCircles(false);
                    lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
                    lineDataSet.setDrawHorizontalHighlightIndicator(false);
                    lineDataSet.setFillFormatter(new zl.a(1));
                    lineDataSet.setMode(k.e(pVar) ? LineDataSet.Mode.STEPPED : LineDataSet.Mode.LINEAR);
                    arrayList2.add(lineDataSet);
                    arrayList3.clear();
                    arrayList3.add(new Entry((float) aVar.C(), (float) aVar.D()));
                } else {
                    arrayList3.add(new Entry((float) aVar.C(), (float) aVar.D()));
                    z14 = z15;
                }
                i14 = i15;
                z15 = z14;
                listP = listP;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add((LineDataSet) it.next());
            }
        }
        return arrayList;
    }

    public o13.p<LineData, ScatterData> w() {
        return new o13.p<>(new LineData(), new ScatterData());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList x(float f14) {
        p pVar;
        Object next;
        IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) ((CombinedData) n().getData()).getDataSetByLabel("OVERLAY_TYPE_TAG", true);
        if (iBarLineScatterCandleBubbleDataSet != null) {
            Collection entriesForXValue = iBarLineScatterCandleBubbleDataSet.getEntriesForXValue(f14);
            entriesForXValue.getClass();
            if (!entriesForXValue.isEmpty() || (pVar = this.f205204c) == null || !k.d(pVar)) {
                return new ArrayList(entriesForXValue);
            }
            c53.g.a aVar = new c53.g.a(c53.c0.h(c53.c0.o(h0.M(j23.t.o(0, iBarLineScatterCandleBubbleDataSet.getEntryCount())), new zm.f(iBarLineScatterCandleBubbleDataSet)), new a81.d(f14, 10)));
            if (aVar.hasNext()) {
                next = aVar.next();
                if (aVar.hasNext()) {
                    float x14 = ((Entry) next).getX();
                    do {
                        Object next2 = aVar.next();
                        float x15 = ((Entry) next2).getX();
                        if (Float.compare(x14, x15) < 0) {
                            next = next2;
                            x14 = x15;
                        }
                    } while (aVar.hasNext());
                }
            } else {
                next = null;
            }
            Entry entry = (Entry) next;
            if (entry != null) {
                return p13.x.m(entry);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x011d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0202  */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final xz.d y() {
        ArrayList arrayList;
        double dFloatValue;
        boolean z14;
        double dMin;
        double dFloatValue2;
        double dMax;
        Double dValueOf;
        Double dValueOf2;
        List<Entry> listD;
        p pVar = this.f205204c;
        if (pVar == null) {
            return null;
        }
        p pVar2 = this.f205203b;
        int b14 = pVar2.getB1();
        boolean zA = km.d.a(b14, pVar.getB1());
        List<ps.x0> listO2 = pVar.O2();
        double dC = listO2 != null ? e0.c(listO2) : 0.0d;
        ArrayList arrayListC = ar.e.c(pVar.P(0));
        arrayListC.getClass();
        xz.d dVar = new xz.d(arrayListC, "OVERLAY_TYPE_TAG");
        dVar.setDrawValues(false);
        dVar.setDrawCircles(false);
        dVar.setAxisDependency(YAxis.AxisDependency.RIGHT);
        dVar.setHighlightLineWidth(1.0f);
        dVar.setHighLightColor(getF205212k());
        dVar.setLineWidth(2.0f);
        dVar.setCircleColor(getF205212k());
        dVar.setDrawHorizontalHighlightIndicator(false);
        dVar.setMode(k.d(pVar) ? LineDataSet.Mode.STEPPED : LineDataSet.Mode.LINEAR);
        int b15 = pVar.getB1();
        if (b15 != 3) {
            Context context = this.f205202a;
            if (b15 != 6) {
                if (b15 == 20) {
                    dVar.setColor(pVar.Y3());
                    dVar.setDrawFilled(false);
                } else if (b15 == 43 || b15 == 53) {
                    new Handler(Looper.getMainLooper()).post(new za.j(4, dVar, this));
                } else if (b15 == 55) {
                    L(dVar);
                } else if (b15 == 88) {
                    J(pVar, dVar, false);
                } else if (b15 == 39) {
                    H(dVar);
                } else if (b15 != 40) {
                    switch (b15) {
                        case 58:
                        case 59:
                        case 60:
                            dVar.setColor(a7.b.getColor(context, R.color.gcm_chart_e_bike_data_set));
                            dVar.setDrawFilled(false);
                            break;
                        default:
                            dVar.setColor(a7.b.getColor(context, im.a.a(pVar.getB1())[1]));
                            dVar.setDrawFilled(false);
                            break;
                    }
                } else {
                    I(dVar);
                }
            } else if (z0.o(pVar2.getF113501k1()) || z0.x(pVar2.getF113501k1())) {
                dVar.setColor(a7.b.getColor(context, im.a.f94080a[1]));
                dVar.setDrawFilled(false);
            } else {
                dVar.setColor(a7.b.getColor(context, im.a.a(pVar.getB1())[1]));
                dVar.setDrawFilled(false);
            }
        } else {
            J(pVar, dVar, false);
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.l lVar = this.f205205d;
        if (lVar == null || (listD = lVar.d(pVar2, this.f205207f)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(p13.y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(((Entry) it.next()).getY()));
            }
        }
        if (km.d.a(b14, pVar.getB1()) && (gl1.y.B(b14) || b14 == 64)) {
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Number) obj).floatValue() != 1000000.0f) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Float.valueOf(((Number) it3.next()).floatValue() + 20));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
        }
        float fK = (pVar.getB1() == 3 || pVar.getB1() == 88) ? w52.u0.k(dVar) : dVar.getYMin();
        if (arrayList != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!Float.isNaN(((Number) obj2).floatValue())) {
                    arrayList4.add(obj2);
                }
            }
            Float fV0 = h0.v0(arrayList4);
            if (fV0 != null) {
                dFloatValue = fV0.floatValue();
            } else {
                dFloatValue = Double.MAX_VALUE;
            }
        } else {
            dFloatValue = Double.MAX_VALUE;
        }
        if (zA) {
            List<o20.a> listP = pVar2.P(0);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : listP) {
                if (!Double.isNaN(((o20.a) obj3).D())) {
                    arrayList5.add(obj3);
                }
            }
            Iterator it4 = arrayList5.iterator();
            if (it4.hasNext()) {
                double D = ((o20.a) it4.next()).D();
                while (it4.hasNext()) {
                    D = Math.min(D, ((o20.a) it4.next()).D());
                    zA = zA;
                    it4 = it4;
                }
                z14 = zA;
                dValueOf2 = Double.valueOf(D);
            } else {
                z14 = zA;
                dValueOf2 = null;
            }
            dMin = Math.min(dValueOf2 != null ? dValueOf2.doubleValue() : Double.MAX_VALUE, Math.min(fK, dFloatValue));
        } else {
            z14 = zA;
            dMin = fK;
        }
        double d14 = dMin;
        if (arrayList != null) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (!Float.isNaN(((Number) obj4).floatValue())) {
                    arrayList6.add(obj4);
                }
            }
            Float fQ0 = h0.q0(arrayList6);
            if (fQ0 != null) {
                dFloatValue2 = fQ0.floatValue();
            } else {
                dFloatValue2 = Double.MIN_VALUE;
            }
        } else {
            dFloatValue2 = Double.MIN_VALUE;
        }
        float yMax = dVar.getYMax();
        if (z14) {
            List<o20.a> listP2 = pVar2.P(0);
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : listP2) {
                if (!Double.isNaN(((o20.a) obj5).D())) {
                    arrayList7.add(obj5);
                }
            }
            Iterator it5 = arrayList7.iterator();
            if (it5.hasNext()) {
                double D2 = ((o20.a) it5.next()).D();
                while (it5.hasNext()) {
                    D2 = Math.max(D2, ((o20.a) it5.next()).D());
                }
                dValueOf = Double.valueOf(D2);
            } else {
                dValueOf = null;
            }
            dMax = Math.max(dValueOf != null ? dValueOf.doubleValue() : Double.MIN_VALUE, Math.max(yMax, dFloatValue2));
        } else {
            dMax = yMax;
        }
        if (z14 && 52 == pVar.getB1()) {
            int entryCount = dVar.getEntryCount();
            for (int i14 = 0; i14 < entryCount; i14++) {
                ?? entryForIndex = dVar.getEntryForIndex(i14);
                if (entryForIndex.getY() == ((float) dC) || Float.isNaN(entryForIndex.getY())) {
                    entryForIndex.setY((float) dMax);
                }
            }
        }
        double[] dArrA = k.a(d14, dMax, this.f205204c, 0, n().getContext().getResources().getConfiguration().orientation == 2, false, 40);
        if (z14) {
            O(dArrA, pVar2);
        }
        P(dArrA, pVar);
        return dVar;
    }

    public final List<IScatterDataSet> z() {
        p pVar = this.f205204c;
        if (pVar == null) {
            return null;
        }
        ScatterData scatterData = new ScatterData(h(pVar, true, YAxis.AxisDependency.RIGHT));
        P(k.a(scatterData.getYMin(), scatterData.getYMax(), this.f205204c, 0, n().getContext().getResources().getConfiguration().orientation == 2, false, 40), pVar);
        return scatterData.getDataSets();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lzm/c$a;", "", "<init>", "()V", "", "ACTIVITY_TYPE_TAG", "Ljava/lang/String;", "EXERCISE_TYPE_TAG", "OVERLAY_TYPE_TAG", "", "FULLSCREEN_DEFAULT_X_LABEL_COUNT", "I", "DEFAULT_X_LABEL_COUNT", "", "X_AXIS_TEXT_SIZE", "F", "DEFAULT_LINE_WIDTH", "HIGHLIGHT_LINE_WIDTH", "HIGHLIGHT_CIRCLE_RADIUS", "ALPHA_TRANSPARENT_COLOR", "ALPHA_HALF_TRANSPARENT_COLOR", "ALPHA_FULL_COLOR", "TOP_LEGEND_NORMAL_PADDING", "SCATTER_SHAPE_SIZE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(Context context, p pVar, p pVar2, com.garmin.android.apps.connectmobile.activities.newmodel.l lVar, boolean z14, fz.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, pVar, (i14 & 4) != 0 ? null : pVar2, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? true : z14, cVar);
    }
}
