package com.xiaomi.wearable.gpsalgorithm.inner;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.wearable.gpsalgorithm.utils.FitnessSportDistanceUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TrackUtils {
    private static final String TAG = "TrackUtils";

    private static double calDis(Location location, Location location2) {
        return FitnessSportDistanceUtil.computeDistance(location, location2);
    }

    public static List<Location> trackFilter(List<Location> list) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        Location location = null;
        for (int i = 0; i < 30; i++) {
            if (i == 0) {
                location = list.get(0);
            } else {
                double dCalDis = calDis(location, list.get(i));
                location = list.get(i);
                arrayList.add(Double.valueOf(dCalDis));
            }
        }
        for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
            double d = 10;
            if (((Double) arrayList.get(i2)).doubleValue() > d || ((Double) arrayList.get(i2 + 1)).doubleValue() > d) {
                linkedList.offer(list.get(i2));
            }
        }
        Iterator<Location> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals(linkedList.poll())) {
                it.remove();
            }
        }
        return list;
    }
}
