package defpackage;

import com.huawei.hihealth.util.HiInChinaUtil;
import com.huawei.route.Point;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class cxq {
    public static List<Point> a(List<Point> list) {
        Point point = list.get(0);
        if (HiInChinaUtil.d(point.getLatitude(), point.getLongitude()) != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Point point2 : list) {
            jpg jpgVarB = izy.b(new jpg(point2.getLatitude(), point2.getLongitude()));
            point2.setLatitude(jpgVarB.d);
            point2.setLongitude(jpgVarB.f38787a);
            arrayList.add(point2);
        }
        return arrayList;
    }
}
