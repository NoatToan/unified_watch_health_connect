package com.huawei.route;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.TrackAltPointData;
import com.huawei.hwfoundationmodel.trackmodel.TrackDistanceData;
import com.huawei.hwfoundationmodel.trackmodel.TrackPauseData;
import defpackage.njm;
import defpackage.xjz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class RouteTrackInfo {

    @SerializedName("altPoints")
    private List<TrackAltPointData> altPoints;

    @SerializedName("altPointsNum")
    private long altPointsNum;

    @SerializedName("disInfos")
    private List<TrackDistanceData> disInfos;

    @SerializedName("disInfosNum")
    private long disInfosNum;

    @SerializedName("isShowAltitude")
    private boolean isShowAltitude;

    @SerializedName("isSupportClimb")
    private boolean isSupportClimb;
    private transient double mMaxAltitude;
    private transient double mMinAltitude;

    @SerializedName("markerPoints")
    private List<RouteMarkerPoint> markerPoints;

    @SerializedName("markerPointsNum")
    private int markerPointsNum;

    @SerializedName("pauseInfos")
    private List<TrackPauseData> pauseInfos;

    @SerializedName("pauseInfosNum")
    private long pauseInfosNum;

    @SerializedName("points")
    private List<RouteTrackPoint> points;

    @SerializedName("pointsNum")
    private long pointsNum;

    @SerializedName("sceneType")
    private int sceneType;

    @SerializedName("targetNum")
    private int targetNum;

    @SerializedName("totalTime")
    private long totalTime;

    @SerializedName("trackId")
    private String trackId;

    @SerializedName("trackName")
    private String trackName;

    @SerializedName("trackType")
    private int trackType;

    @SerializedName("useType")
    private int useType;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE)
    private int workoutType;

    @SerializedName("version")
    private int version = 2;
    private transient List<njm> mAltitudeList = new ArrayList();

    public List<RouteTrackPoint> getPoints() {
        return this.points;
    }

    public void setPoints(List<RouteTrackPoint> list) {
        this.points = list;
    }

    public long getPointsNum() {
        return this.pointsNum;
    }

    public void setPointsNum(long j) {
        this.pointsNum = j;
    }

    public List<RouteMarkerPoint> getMarkerPoints() {
        return this.markerPoints;
    }

    public void setMarkerPoints(List<RouteMarkerPoint> list) {
        this.markerPoints = list;
    }

    public int getMarkerPointsNum() {
        return this.markerPointsNum;
    }

    public void setMarkerPointsNum(int i) {
        this.markerPointsNum = i;
    }

    public boolean isShowAltitude() {
        return this.isShowAltitude;
    }

    public void setShowAltitude(boolean z) {
        this.isShowAltitude = z;
    }

    public int getTrackType() {
        return this.trackType;
    }

    public void setTrackType(int i) {
        this.trackType = i;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public void setTrackId(String str) {
        this.trackId = str;
    }

    public String getTrackName() {
        return this.trackName;
    }

    public void setTrackName(String str) {
        this.trackName = str;
    }

    public long getTotalTime() {
        return this.totalTime;
    }

    public void setTotalTime(long j) {
        this.totalTime = j;
    }

    public int getTargetNum() {
        return this.targetNum;
    }

    public void setTargetNum(int i) {
        this.targetNum = i;
    }

    public int getWorkoutType() {
        return this.workoutType;
    }

    public void setWorkoutType(int i) {
        this.workoutType = i;
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public List<njm> getAltitudeList() {
        return this.mAltitudeList;
    }

    public void setAltitudeList(List<njm> list) {
        this.mAltitudeList = list;
    }

    public double getMinAltitude() {
        return this.mMinAltitude;
    }

    public void setMinAltitude(double d) {
        this.mMinAltitude = d;
    }

    public double getMaxAltitude() {
        return this.mMaxAltitude;
    }

    public void setMaxAltitude(double d) {
        this.mMaxAltitude = d;
    }

    public int getSceneType() {
        return this.sceneType;
    }

    public void setSceneType(int i) {
        this.sceneType = i;
    }

    public int getUseType() {
        return this.useType;
    }

    public void setUseType(int i) {
        this.useType = i;
    }

    public List<TrackAltPointData> getAltPoints() {
        return this.altPoints;
    }

    public void setAltPoints(List<TrackAltPointData> list) {
        this.altPoints = list;
    }

    public long getAltPointsNum() {
        return this.altPointsNum;
    }

    public void setAltPointsNum(long j) {
        this.altPointsNum = j;
    }

    public List<TrackDistanceData> getDisInfos() {
        return this.disInfos;
    }

    public void setDisInfos(List<TrackDistanceData> list) {
        this.disInfos = list;
    }

    public long getDisInfosNum() {
        return this.disInfosNum;
    }

    public void setDisInfosNum(long j) {
        this.disInfosNum = j;
    }

    public boolean isSupportClimb() {
        return this.isSupportClimb;
    }

    public void setSupportClimb(boolean z) {
        this.isSupportClimb = z;
    }

    public List<TrackPauseData> getPauseInfos() {
        return this.pauseInfos;
    }

    public void setPauseInfos(List<TrackPauseData> list) {
        this.pauseInfos = list;
    }

    public long getPauseInfosNum() {
        return this.pauseInfosNum;
    }

    public void setPauseInfosNum(long j) {
        this.pauseInfosNum = j;
    }

    public String toString() {
        return "RouteTrackInfo{isShowAltitude=" + this.isShowAltitude + ", points=" + this.points + ", pointsNum=" + this.pointsNum + ", markerPoints=" + this.markerPoints + ", markerPointsNum=" + this.markerPointsNum + ", trackType=" + this.trackType + ", trackId='" + this.trackId + "', trackName='" + this.trackName + "', totalTime=" + this.totalTime + ", targetNum=" + this.targetNum + ", workoutType=" + this.workoutType + ", version=" + this.version + ", sceneType=" + this.sceneType + ", useType=" + this.useType + ", mAltitudeList=" + this.mAltitudeList + ", mMinAltitude=" + this.mMinAltitude + ", mMaxAltitude=" + this.mMaxAltitude + '}';
    }

    public static RouteTrackInfo convertRouteTrackInfo(RouteData routeData) {
        RouteTrackInfo routeTrackInfo = new RouteTrackInfo();
        routeTrackInfo.setTrackName(routeData.getRouteName());
        routeTrackInfo.setTrackType(routeData.getRouteType());
        routeTrackInfo.setTotalTime((int) routeData.getRouteTime());
        routeTrackInfo.setWorkoutType(0);
        routeTrackInfo.setSceneType(routeData.getSceneType());
        convertRoutePoints(routeData, routeTrackInfo);
        routeTrackInfo.setShowAltitude(routeData.getRouteType() == RouteType.DEFAULT.routeType());
        if (routeTrackInfo.getSceneType() == SceneType.BIKE.sceneType()) {
            routeTrackInfo.setSupportClimb(true);
        }
        return routeTrackInfo;
    }

    private static void convertRoutePoints(RouteData routeData, RouteTrackInfo routeTrackInfo) {
        if (CollectionUtils.a(routeData.getRoutePoints())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int routeType = routeData.getRouteType();
        int i = 0;
        for (Point point : routeData.getRoutePoints()) {
            if (!xjz.b(point.getLatitude(), point.getLongitude())) {
                i++;
                CpInfo cpInfo = point.getCpInfo();
                if (cpInfo != null) {
                    arrayList2.add(RouteMarkerPoint.convertRouteMarkerPoint(i, point, cpInfo));
                }
                if (!xjz.c(routeType, cpInfo)) {
                    routeTrackInfo.updateAltitude(point);
                    RouteTrackPoint routeTrackPointConvertRouteTrackPoint = RouteTrackPoint.convertRouteTrackPoint(point);
                    if (!xjz.d(arrayList, routeType, cpInfo, routeTrackPointConvertRouteTrackPoint)) {
                        arrayList.add(routeTrackPointConvertRouteTrackPoint);
                    }
                }
            }
        }
        routeTrackInfo.setPoints(arrayList);
        routeTrackInfo.setPointsNum(arrayList.size());
        routeTrackInfo.setMarkerPoints(arrayList2);
        routeTrackInfo.setMarkerPointsNum(arrayList2.size());
    }

    private void updateAltitude(Point point) {
        this.mAltitudeList.add(new njm(point.getTimeStamp(), point.getAltitude()));
        if (Double.compare(this.mMaxAltitude, 0.0d) == 0 || point.getAltitude() > this.mMaxAltitude) {
            this.mMaxAltitude = point.getAltitude();
        }
        if (Double.compare(this.mMinAltitude, 0.0d) == 0 || point.getAltitude() < this.mMinAltitude) {
            this.mMinAltitude = point.getAltitude();
        }
    }
}
