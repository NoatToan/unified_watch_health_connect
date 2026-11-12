package defpackage;

import com.huawei.health.algorithm.api.TrackFeatureExtractionApi;
import com.huawei.health.trackimport.algorithm.TrackFeatureExtraction;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.Point;
import com.huawei.route.RouteOutputForApp;
import com.huawei.route.RouteTrackInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
@ApiDefine(uri = TrackFeatureExtractionApi.class)
@Singleton
public class ili implements TrackFeatureExtractionApi {
    @Override // com.huawei.health.algorithm.api.TrackFeatureExtractionApi
    public byte[] algTrackImport(int i, float f, List<Point> list) throws IOException {
        TrackFeatureExtraction trackFeatureExtraction = new TrackFeatureExtraction();
        LogUtil.e("Track_FeatureExtractionImpl", "the init err is:" + trackFeatureExtraction.algInit(i, f));
        for (int i2 = 0; i2 < list.size(); i2++) {
            LogUtil.e("Track_FeatureExtractionImpl", "the add err is:" + trackFeatureExtraction.addTrackPoint(list.get(i2).getTimeStamp() / 1000, list.get(i2).getLatitude(), list.get(i2).getLongitude()));
        }
        trackFeatureExtraction.stopAlg();
        trackFeatureExtraction.obtainResultSize();
        trackFeatureExtraction.obtainCompressionRadio();
        return trackFeatureExtraction.obtainResult();
    }

    @Override // com.huawei.health.algorithm.api.TrackFeatureExtractionApi
    public byte[] algTrackImport(RouteTrackInfo routeTrackInfo, int i, double d) {
        ReleaseLogUtil.a("Track_FeatureExtractionImpl", "algTrackImport inflectPointsMaxNum:", Integer.valueOf(i));
        TrackFeatureExtraction trackFeatureExtraction = new TrackFeatureExtraction();
        int iTrackAlgInit = trackFeatureExtraction.TrackAlgInit(routeTrackInfo.getPointsNum(), routeTrackInfo.getMarkerPointsNum(), i, d, true);
        if (iTrackAlgInit != 0) {
            ReleaseLogUtil.a("Track_FeatureExtractionImpl", "initCode code is ", Integer.valueOf(iTrackAlgInit));
            return new byte[0];
        }
        int iProcessTrackInfo = trackFeatureExtraction.ProcessTrackInfo(routeTrackInfo);
        if (iProcessTrackInfo != 0) {
            ReleaseLogUtil.a("Track_FeatureExtractionImpl", "algTrackImport processCode is ", Integer.valueOf(iProcessTrackInfo), " closeCode is ", Integer.valueOf(trackFeatureExtraction.TrackAlgClose()));
            return new byte[0];
        }
        byte[] bArrGetTrackResultForWatch = trackFeatureExtraction.GetTrackResultForWatch();
        int iGetTrackResultSizeForWatch = trackFeatureExtraction.GetTrackResultSizeForWatch();
        ReleaseLogUtil.d("Track_FeatureExtractionImpl", "init code is ", Integer.valueOf(iTrackAlgInit), " processCode is ", Integer.valueOf(iProcessTrackInfo), " closeCode is ", Integer.valueOf(trackFeatureExtraction.TrackAlgClose()), " resultSize=", Integer.valueOf(iGetTrackResultSizeForWatch));
        return bArrGetTrackResultForWatch;
    }

    @Override // com.huawei.health.algorithm.api.TrackFeatureExtractionApi
    public RouteOutputForApp getTrackOutputForApp(RouteTrackInfo routeTrackInfo, int i, double d, boolean z) {
        ReleaseLogUtil.a("Track_FeatureExtractionImpl", "getTrackOutputForApp inflectPointsMaxNum:", Integer.valueOf(i));
        TrackFeatureExtraction trackFeatureExtraction = new TrackFeatureExtraction();
        int iTrackAlgInit = trackFeatureExtraction.TrackAlgInit(routeTrackInfo.getPointsNum(), routeTrackInfo.getMarkerPointsNum(), i, d, z);
        if (iTrackAlgInit != 0) {
            ReleaseLogUtil.a("Track_FeatureExtractionImpl", "initCode code is ", Integer.valueOf(iTrackAlgInit));
            return null;
        }
        int iProcessTrackInfo = trackFeatureExtraction.ProcessTrackInfo(routeTrackInfo);
        if (iProcessTrackInfo != 0) {
            ReleaseLogUtil.a("Track_FeatureExtractionImpl", "getTrackOutputForApp processCode is ", Integer.valueOf(iProcessTrackInfo), " closeCode is ", Integer.valueOf(trackFeatureExtraction.TrackAlgClose()));
            return null;
        }
        RouteOutputForApp routeOutputForAppGetTrackResultForApp = trackFeatureExtraction.GetTrackResultForApp();
        if (routeOutputForAppGetTrackResultForApp != null && njy.b(routeOutputForAppGetTrackResultForApp.getSlopeInfo())) {
            ReleaseLogUtil.d("Track_FeatureExtractionImpl", "getTrackOutputForApp init getSlopeInfo  = " + routeOutputForAppGetTrackResultForApp.getSlopeInfo().size() + " getSlopeInfoNum = " + routeOutputForAppGetTrackResultForApp.getSlopeInfoNum() + " getFlatDistance = " + routeOutputForAppGetTrackResultForApp.getFlatDistance() + " getFlatRatio = " + routeOutputForAppGetTrackResultForApp.getFlatRatio() + " getUpHillDistance = " + routeOutputForAppGetTrackResultForApp.getUpHillDistance() + " getUpHillRatio = " + routeOutputForAppGetTrackResultForApp.getUpHillRatio() + " getDownHillDistance = " + routeOutputForAppGetTrackResultForApp.getDownHillDistance() + " getDownHillRatio = " + routeOutputForAppGetTrackResultForApp.getDownHillRatio());
        }
        ReleaseLogUtil.d("Track_FeatureExtractionImpl", "init code is ", Integer.valueOf(iTrackAlgInit), " processCode is ", Integer.valueOf(iProcessTrackInfo), " closeCode is ", Integer.valueOf(trackFeatureExtraction.TrackAlgClose()), " resultForApp is ", Boolean.valueOf(routeOutputForAppGetTrackResultForApp == null));
        return routeOutputForAppGetTrackResultForApp;
    }

    @Override // com.huawei.health.algorithm.api.TrackFeatureExtractionApi
    public List<Point> featurePointExtraction(List<Point> list, int i) {
        int i2;
        int size = list.size();
        Point point = list.get(0);
        Point point2 = list.get(size - 1);
        if (Double.compare(point.getLongitude(), point2.getLongitude()) == 0 && Double.compare(point.getLatitude(), point2.getLatitude()) == 0) {
            size = list.size() - 1;
        }
        ArrayList arrayList = new ArrayList();
        double d = 0.0d;
        int i3 = 0;
        int i4 = 1;
        while (true) {
            i2 = size - 1;
            if (i4 >= i2) {
                break;
            }
            Point point3 = list.get(i4);
            double dC = c(point3, list.get(0), list.get(i2));
            if (dC > d) {
                i3 = i4;
                d = dC;
            }
            if (point3.getCpInfo() != null) {
                arrayList.add(point3);
            }
            i4++;
        }
        ArrayList arrayList2 = new ArrayList();
        if (d > i) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            c(list, i3, arrayList3, arrayList4);
            List<Point> listFeaturePointExtraction = featurePointExtraction(arrayList3, i);
            List<Point> listFeaturePointExtraction2 = featurePointExtraction(arrayList4, i);
            listFeaturePointExtraction2.remove(0);
            listFeaturePointExtraction.addAll(listFeaturePointExtraction2);
            return listFeaturePointExtraction;
        }
        arrayList2.add(list.get(0));
        arrayList2.addAll(arrayList);
        arrayList2.add(list.get(i2));
        return arrayList2;
    }

    private double c(Point point, Point point2, Point point3) {
        double d = d(point2, point3);
        return (e(d(point, point2), d(point, point3), d) * 2.0d) / d;
    }

    public static double d(Point point, Point point2) {
        double latitude = point.getLatitude();
        double latitude2 = point2.getLatitude();
        double longitude = point.getLongitude();
        double longitude2 = point2.getLongitude();
        double radians = Math.toRadians(latitude2 - latitude);
        double radians2 = Math.toRadians(longitude2 - longitude);
        double d = radians / 2.0d;
        double d2 = radians2 / 2.0d;
        double dSin = (Math.sin(d) * Math.sin(d)) + (Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(latitude2)) * Math.sin(d2) * Math.sin(d2));
        return Math.sqrt(Math.pow(Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d * 6371.0d * 1000.0d, 2.0d));
    }

    private static double e(double d, double d2, double d3) {
        double d4 = ((d + d2) + d3) / 2.0d;
        return Math.sqrt((d4 - d) * d4 * (d4 - d2) * (d4 - d3));
    }

    private void c(List<Point> list, int i, List<Point> list2, List<Point> list3) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 < i) {
                list2.add(list.get(i2));
            } else {
                if (i2 == i) {
                    list2.add(list.get(i2));
                }
                list3.add(list.get(i2));
            }
        }
    }
}
