package com.huami.moving.maps;

import android.util.SparseArray;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class RouteLineSM {
    private static final int e = 10;
    private static final int f = 100;
    private static final int g = 100;
    private static final int h = 220;
    private SparseArray<GPSPoint> a;
    private LineSMObserver b;
    private int c = 0;
    private boolean d;

    public interface LineSMObserver {
        void onDrawDottedLine(List<GPSPoint> list, RouteLineInfo routeLineInfo);

        void onDrawMarker(GPSPoint gPSPoint, int i);

        void onDrawRouteLine(List<GPSPoint> list, RouteLineInfo routeLineInfo);

        void onDrawStableLine(List<GPSPoint> list, RouteLineInfo routeLineInfo);

        void onDrawUnstableLine(List<GPSPoint> list, RouteLineInfo routeLineInfo, boolean z);
    }

    public final class MarkerType {
        public static final int INITIAL = 0;
        public static final int LINE_ME = 4;
        public static final int NONE = -1;
        public static final int PAUSED = 2;
        public static final int STARTED = 1;
        public static final int STOPPED = 3;

        public MarkerType() {
        }
    }

    public RouteLineSM(LineSMObserver lineSMObserver) {
        this.a = null;
        this.b = null;
        this.d = false;
        this.b = lineSMObserver;
        this.a = new SparseArray<>();
        this.d = false;
    }

    private int a(List<GPSPoint> list) {
        int size = this.a.size();
        if (size <= 0) {
            return this.c;
        }
        GPSPoint gPSPointValueAt = this.a.valueAt(size - 1);
        if (gPSPointValueAt == null) {
            return this.c;
        }
        int index = list.get(0).getIndex();
        if (gPSPointValueAt.getIndex() < index) {
            return gPSPointValueAt.getAttr();
        }
        GPSPoint gPSPoint = this.a.get(index - 1);
        if (gPSPoint != null) {
            return gPSPoint.getAttr();
        }
        return 0;
    }

    private boolean b(int i, int i2) {
        if (i == 3 || i == 2 || i == 4) {
            return true;
        }
        return i2 == 4 && i == 1;
    }

    private void c(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (this.d) {
            onDrawRouteLine(list, routeLineInfo);
            return;
        }
        LineSMObserver lineSMObserver = this.b;
        if (lineSMObserver == null) {
            return;
        }
        lineSMObserver.onDrawDottedLine(list, routeLineInfo);
    }

    private void d(GPSPoint gPSPoint, int i) {
        LineSMObserver lineSMObserver;
        if (this.d || (lineSMObserver = this.b) == null) {
            return;
        }
        lineSMObserver.onDrawMarker(gPSPoint, i);
    }

    private void e(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (this.d) {
            onDrawRouteLine(list, routeLineInfo);
            return;
        }
        LineSMObserver lineSMObserver = this.b;
        if (lineSMObserver == null) {
            return;
        }
        routeLineInfo.mType = 0;
        lineSMObserver.onDrawStableLine(list, routeLineInfo);
    }

    private void f(List<GPSPoint> list, RouteLineInfo routeLineInfo, boolean z) {
        if (this.d) {
            onDrawRouteLine(list, routeLineInfo);
            return;
        }
        LineSMObserver lineSMObserver = this.b;
        if (lineSMObserver == null) {
            return;
        }
        routeLineInfo.mType = 1;
        lineSMObserver.onDrawUnstableLine(list, routeLineInfo, z);
    }

    private int g(SparseArray<GPSPoint> sparseArray, RouteLineInfo routeLineInfo, int i) {
        int i2;
        int size = sparseArray.size();
        int i3 = size - 1;
        ArrayList arrayList = new ArrayList(i3);
        ArrayList arrayList2 = new ArrayList(i3);
        HashMap map = new HashMap();
        int iAbs = i;
        GPSPoint gPSPoint = null;
        int attr = -1;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            GPSPoint gPSPointValueAt = sparseArray.valueAt(i4);
            if (gPSPointValueAt != null) {
                attr = gPSPointValueAt.getAttr();
                int index = gPSPointValueAt.getIndex();
                arrayList.add(gPSPointValueAt);
                arrayList2.add(Integer.valueOf(index));
                if (!z && b(attr, iAbs)) {
                    z = true;
                }
                if (attr == -4 || attr == -3) {
                    i2 = 1;
                    gPSPointValueAt.setAttr(1);
                    arrayList.clear();
                    arrayList.add(gPSPointValueAt);
                } else {
                    if (attr == 0 || attr == 1) {
                        if (Math.abs(iAbs) == 2 && index != 0) {
                            d(gPSPointValueAt, 2);
                        }
                    } else if (attr == 2) {
                        if (index != 0) {
                            d(gPSPointValueAt, 2);
                        }
                        if (arrayList.size() > 0) {
                            e(arrayList, routeLineInfo);
                        }
                        arrayList.clear();
                    } else if ((attr == 3 || attr == 4) && gPSPoint != null) {
                        arrayList.remove(gPSPointValueAt);
                        if (arrayList.size() > 0) {
                            e(arrayList, routeLineInfo);
                        }
                        arrayList.clear();
                        arrayList.add(gPSPoint);
                        arrayList.add(gPSPointValueAt);
                        c(arrayList, routeLineInfo);
                        arrayList.clear();
                        arrayList.add(gPSPointValueAt);
                    }
                    i2 = 1;
                }
                iAbs = Math.abs(attr);
                if (i4 == i3 && arrayList.size() > 0 && size > i2) {
                    if (routeLineInfo.mIsResore) {
                        e(arrayList, routeLineInfo);
                    } else {
                        f(arrayList, routeLineInfo, false);
                    }
                }
                gPSPoint = gPSPointValueAt;
                z = z;
            }
        }
        if (z) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sparseArray.remove(((Integer) it2.next()).intValue());
            }
            for (Map.Entry entry : map.entrySet()) {
                sparseArray.put(((Integer) entry.getKey()).intValue(), (GPSPoint) entry.getValue());
            }
        }
        arrayList2.clear();
        arrayList.clear();
        map.clear();
        return attr;
    }

    private boolean h(RouteLineInfo routeLineInfo) {
        LineSMObserver lineSMObserver;
        if (this.a.size() != 220) {
            return false;
        }
        ArrayList arrayList = new ArrayList(100);
        for (int i = 0; i < 100; i++) {
            arrayList.add(this.a.get(i));
        }
        if (arrayList.size() >= 2 && (lineSMObserver = this.b) != null) {
            routeLineInfo.mType = 0;
            lineSMObserver.onDrawStableLine(arrayList, routeLineInfo);
        }
        arrayList.clear();
        for (int i2 = 0; i2 < 99; i2++) {
            this.a.remove(0);
        }
        int size = this.a.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(this.a.valueAt(i3));
        }
        f(arrayList2, routeLineInfo, true);
        return true;
    }

    private void i(SparseArray<GPSPoint> sparseArray, List<GPSPoint> list) {
        for (GPSPoint gPSPoint : list) {
            sparseArray.put(gPSPoint.getIndex(), gPSPoint);
        }
    }

    public void clear() {
        SparseArray<GPSPoint> sparseArray = this.a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public void destroy() {
        SparseArray<GPSPoint> sparseArray = this.a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        this.b = null;
    }

    public boolean getIsRoute() {
        return this.d;
    }

    public void onDrawRouteLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        LineSMObserver lineSMObserver = this.b;
        if (lineSMObserver == null) {
            return;
        }
        routeLineInfo.mType = 0;
        lineSMObserver.onDrawRouteLine(list, routeLineInfo);
    }

    public boolean processCachedPointList(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        int iA = a(list);
        i(this.a, list);
        this.c = g(this.a, routeLineInfo, iA);
        h(routeLineInfo);
        return true;
    }

    public void setIsRoute(boolean z) {
        this.d = z;
    }
}
