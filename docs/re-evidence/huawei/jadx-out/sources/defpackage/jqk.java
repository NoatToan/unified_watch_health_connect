package defpackage;

import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcloudmodel.model.unite.RouteExtendData;
import com.huawei.hwfoundationmodel.trackmodel.MarkPoint;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.CpInfo;
import com.huawei.route.Point;
import com.huawei.route.RouteType;
import com.huawei.route.TrackInfoModel;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jqk {
    public static boolean e(int i) {
        return i == 258 || i == 259 || i == 257 || i == 260 || i == 282 || i == 280 || i == 227 || i == 219 || i == 222 || i == 233;
    }

    public static void d(boolean z, jqp jqpVar) {
        if (jqpVar == null) {
            LogUtil.a("Track_RouteExportUtils", "buildTrackDataAndJump dataManager == null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (jqpVar.d().requestSportType() == 222) {
            e(arrayList, jqpVar);
        } else {
            a((ArrayList<Point>) arrayList, jqpVar);
        }
        if (njy.e(arrayList)) {
            LogUtil.a("Track_RouteExportUtils", "points is empty");
        } else {
            b(z, arrayList, jqpVar);
        }
    }

    private static void e(ArrayList<Point> arrayList, jqp jqpVar) {
        ArrayList<MarkPoint> arrayListRequestMarkPointList = jqpVar.b().requestMarkPointList();
        ArrayList<njm> arrayListRequestAltitudeList = jqpVar.b().requestAltitudeList();
        int size = arrayListRequestMarkPointList.size();
        LogUtil.a("Track_RouteExportUtils", "buildExpPoints markPoints is ", Integer.valueOf(size), " altitudeList is", Integer.valueOf(arrayListRequestAltitudeList.size()));
        if (njy.e(arrayListRequestMarkPointList) || njy.e(arrayListRequestAltitudeList)) {
            return;
        }
        int i = 0;
        for (njm njmVar : arrayListRequestAltitudeList) {
            if (size > i && arrayListRequestMarkPointList.get(i).acquireTime() <= njmVar.acquireTime()) {
                Point point = new Point();
                MarkPoint markPoint = arrayListRequestMarkPointList.get(i);
                e(size, i, markPoint);
                a(markPoint, point);
                point.setAltitude(njmVar.a());
                point.setTimeStamp(njmVar.acquireTime());
                arrayList.add(point);
                i++;
            }
        }
        while (i < size) {
            Point point2 = new Point();
            MarkPoint markPoint2 = arrayListRequestMarkPointList.get(i);
            e(size, i, markPoint2);
            a(markPoint2, point2);
            point2.setAltitude(arrayListRequestAltitudeList.get(arrayListRequestAltitudeList.size() - 1).a());
            arrayList.add(point2);
            i++;
        }
    }

    private static void e(int i, int i2, MarkPoint markPoint) {
        boolean z = markPoint.c() == 0;
        if (i2 == 0 && z) {
            markPoint.b(1);
            markPoint.d(MarkPoint.MarkType.END.type());
        }
        if (i2 == i - 1 && z) {
            markPoint.b(1);
            markPoint.d(MarkPoint.MarkType.END.type());
        }
    }

    private static void a(MarkPoint markPoint, Point point) {
        point.setLatitude(markPoint.e());
        point.setLongitude(markPoint.b());
        point.setTimeStamp(markPoint.acquireTime());
        if (markPoint.c() == 1) {
            CpInfo cpInfo = new CpInfo();
            cpInfo.setColor(markPoint.a());
            cpInfo.setMode(markPoint.c());
            cpInfo.setType(markPoint.f());
            cpInfo.setName("");
            cpInfo.setDescription("");
            point.setCpInfo(cpInfo);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fc  */
    private static void a(ArrayList<Point> arrayList, jqp jqpVar) {
        if (njy.e(jqpVar.a())) {
            return;
        }
        for (MotionData motionData : jqpVar.a()) {
            if (motionData.getLbsDataMap() != null && motionData.getLbsDataMap().size() != 0) {
                double dA = !njy.e(motionData.requestAltitudeList()) ? motionData.requestAltitudeList().get(0).a() : Double.MIN_VALUE;
                int i = jqpVar.d().requestDeviceType() == 32 ? 1 : 1000;
                Iterator<Map.Entry<Long, double[]>> it = motionData.getLbsDataMap().entrySet().iterator();
                int i2 = 1;
                while (it.hasNext()) {
                    double[] value = it.next().getValue();
                    if (value.length < 4 || jfn.a(value[0], value[1]) || jfn.b(value[0], value[1])) {
                        dA = dA;
                    } else {
                        long j = ((long) value[3]) * ((long) i);
                        Point point = new Point();
                        double d = dA;
                        double d2 = value[0];
                        double d3 = value[1];
                        point.setLatitude(d2);
                        point.setLongitude(d3);
                        point.setTimeStamp(j);
                        if (njy.e(motionData.requestAltitudeList()) || i2 >= motionData.requestAltitudeList().size()) {
                            dA = d;
                        } else {
                            njm njmVar = motionData.requestAltitudeList().get(i2);
                            if (i2 == 1) {
                                LogUtil.a("Track_RouteExportUtils", "index = 1 , timeStamp:", Long.valueOf(j), " trackAltitudeData.acquireTime():", Long.valueOf(njmVar.acquireTime()));
                            }
                            if (njmVar.acquireTime() <= j) {
                                dA = njmVar.a();
                                point.setAltitude(dA);
                                i2++;
                            } else {
                                dA = d;
                            }
                        }
                        if (Math.abs(point.getAltitude() - Double.MIN_VALUE) < 1.0E-6d) {
                            point.setAltitude(dA);
                        }
                        arrayList.add(point);
                    }
                }
                LogUtil.a("Track_RouteExportUtils", "mLbsDataMap size:", Integer.valueOf(motionData.getLbsDataMap().size()), " altitudeList size", Integer.valueOf(motionData.requestAltitudeList().size()), " final altitude index:", Integer.valueOf(i2));
            }
        }
    }

    private static void b(boolean z, ArrayList<Point> arrayList, jqp jqpVar) {
        String strD = jaa.d(BaseApplication.b(), jqpVar.d().requestSportType());
        if (jqpVar.d().requestSportType() == 227) {
            strD = jqq.e(jqpVar.d().requestExtendDataMap());
        }
        LogUtil.a("Track_RouteExportUtils", "jumpRouteExport sportType=", strD);
        String strD2 = ieg.d(new Date(jqpVar.d().requestStartTime()), "yyyyMMdd");
        long totalTime = jqpVar.g().getTotalTime() / 1000;
        boolean z2 = jqpVar.d().requestSportType() == 222;
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        float fRequestCreepingWave = jqpVar.d().requestCreepingWave() / 10.0f;
        float fRequestTotalDescent = jqpVar.d().requestTotalDescent() / 10.0f;
        int iRouteType = (z2 ? RouteType.EXP : RouteType.DEFAULT).routeType();
        if (z) {
            LogUtil.a("Track_RouteExportUtils", "choose save to my route");
            RouteData routeData = new RouteData();
            routeData.setRouteName(strD2 + strD);
            routeData.setSportType(strD);
            routeData.setRouteTime((double) totalTime);
            routeData.setRouteDistance((double) jqpVar.g().getTotalDistance());
            routeData.setExtendData(c(fRequestCreepingWave, fRequestTotalDescent, iRouteType));
            routeData.setRoutePoints(arrayList);
            routeData.setType(2);
            userProfileMgrApi.setRouteData(routeData);
            return;
        }
        LogUtil.a("Track_RouteExportUtils", "choose export route");
        userProfileMgrApi.setTrackInfoModel(new TrackInfoModel.Builder().routeName(strD2 + strD).sportType(strD).sportTotalTime(totalTime).sportTotalDistance(jqpVar.g().getTotalDistance()).cumulativeClimb(fRequestCreepingWave).cumulativeDecrease(fRequestTotalDescent).points(arrayList).routeType(iRouteType).build());
    }

    private static String c(float f, float f2, int i) {
        RouteExtendData routeExtendData = new RouteExtendData();
        routeExtendData.setCumulativeClimb(f);
        routeExtendData.setCumulativeDecrease(f2);
        routeExtendData.setRouteType(i);
        return new Gson().toJson(routeExtendData);
    }
}
