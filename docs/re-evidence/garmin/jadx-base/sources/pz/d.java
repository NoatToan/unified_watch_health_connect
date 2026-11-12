package pz;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.view.j;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import pi0.e;
import zz.l;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f141918a = (int) Utils.convertDpToPixel(17.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f141919b = (int) Utils.convertDpToPixel(4.0f);

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList a(BarLineChartBase barLineChartBase, float f14) {
        barLineChartBase.getClass();
        List<T> dataSets = ((BarLineScatterCandleBubbleData) barLineChartBase.getData()).getDataSets();
        ArrayList<List> arrayListL = j.l(dataSets);
        Iterator it = dataSets.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Collection entriesForXValue = ((IBarLineScatterCandleBubbleDataSet) it.next()).getEntriesForXValue(f14);
            Collection collection = entriesForXValue.isEmpty() ? null : entriesForXValue;
            if (collection != null) {
                arrayListL.add(collection);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List list : arrayListL) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Object data = ((Entry) it3.next()).getData();
                l lVar = data instanceof l ? (l) data : null;
                if (lVar != null) {
                    arrayList2.add(lVar);
                }
            }
            d0.v(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (List list2 : arrayListL) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                Object data2 = ((Entry) it4.next()).getData();
                List list3 = data2 instanceof List ? (List) data2 : null;
                if (list3 != null) {
                    arrayList4.add(list3);
                }
            }
            ArrayList arrayListS = y.s(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : arrayListS) {
                if (obj instanceof l) {
                    arrayList5.add(obj);
                }
            }
            d0.v(arrayList3, arrayList5);
        }
        return h0.C0(arrayList, arrayList3);
    }

    public static final ArrayList b(int i14, List list) {
        ArrayList arrayListL = j.l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (arrayListL.isEmpty() || ((Entry) h0.m0((List) h0.m0(arrayListL))).getX() + i14 != entry.getX()) {
                arrayListL.add(x.m(entry));
            } else {
                ((List) h0.m0(arrayListL)).add(entry);
            }
        }
        return arrayListL;
    }

    public static final float c(float f14, float f15, Integer num) {
        if (f15 > f14) {
            return (Math.min(num != null ? num.intValue() : f15, f15) - f14) / (f15 - f14);
        }
        return 1.0f;
    }

    public static final ArrayList d(Context context, LocalDate localDate, LocalDate localDate2) {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(context);
        while (localDate.compareTo((ReadablePartial) localDate2) <= 0) {
            arrayList.add(eVar.d(localDate, qi0.a.ABBREV_WEEKDAY));
            localDate = localDate.plusDays(1);
            localDate.getClass();
        }
        return arrayList;
    }

    public static final List<String> e(LocalDate localDate, LocalDate localDate2, int i14) {
        localDate.getClass();
        localDate2.getClass();
        if (i14 != 0) {
            if (i14 != 1 && i14 != 5) {
                return j0.f134944a;
            }
            DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            DateTime dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay2.getClass();
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM");
            dateTimeFormatterForPattern.getClass();
            return fz.a.e(null, 1, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, dateTimeFormatterForPattern);
        }
        int iE = u0.e(localDate, localDate2, 1);
        ArrayList arrayList = new ArrayList(iE);
        for (int i15 = 0; i15 < iE; i15++) {
            arrayList.add("");
        }
        c22.j0.f23099a.getClass();
        arrayList.set(0, c22.j0.l(localDate));
        arrayList.set(arrayList.size() - 1, c22.j0.l(localDate2));
        return arrayList;
    }

    public static final boolean f(BarLineChartBase<?> barLineChartBase, Highlight highlight) {
        barLineChartBase.getClass();
        if (highlight == null || highlight.getX() < barLineChartBase.getLowestVisibleX()) {
            return false;
        }
        return highlight.getX() < barLineChartBase.getHighestVisibleX() || ((double) Math.abs(highlight.getX() - barLineChartBase.getHighestVisibleX())) < 1.0E-4d;
    }

    public static final void g(BarLineChartBase<?> barLineChartBase, MotionEvent motionEvent) {
        barLineChartBase.getClass();
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getPointerCount()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            Highlight highlightByTouchPoint = barLineChartBase.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
            if (f(barLineChartBase, highlightByTouchPoint)) {
                barLineChartBase.highlightValue(highlightByTouchPoint, true);
                return;
            }
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 2) {
            barLineChartBase.highlightValues(null);
            return;
        }
        Highlight highlightByTouchPoint2 = barLineChartBase.getHighlightByTouchPoint(motionEvent.getX(0), motionEvent.getY(0));
        Highlight highlightByTouchPoint3 = barLineChartBase.getHighlightByTouchPoint(motionEvent.getX(1), motionEvent.getY(1));
        if (f(barLineChartBase, highlightByTouchPoint2) && f(barLineChartBase, highlightByTouchPoint3)) {
            barLineChartBase.highlightValues(new Highlight[]{highlightByTouchPoint2, highlightByTouchPoint3});
        }
    }

    public static final void h(BarLineChartBase<?> barLineChartBase, MotionEvent motionEvent) {
        barLineChartBase.getClass();
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getPointerCount()) : null;
        if (numValueOf == null || numValueOf.intValue() != 1) {
            barLineChartBase.highlightValues(null);
            return;
        }
        Highlight highlightByTouchPoint = barLineChartBase.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
        if (f(barLineChartBase, highlightByTouchPoint)) {
            barLineChartBase.highlightValue(highlightByTouchPoint, true);
        }
    }
}
