package com.huawei.route;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwfoundationmodel.trackmodel.TrackAltPointData;
import com.huawei.operation.ble.BleConstants;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class RouteOutputForApp {

    @SerializedName("caliAltPoints")
    private List<TrackAltPointData> caliAltPoints;

    @SerializedName("caliAltPointsNum")
    private int caliAltPointsNum;

    @SerializedName("caliPoints")
    private List<CorrectTrackPoint> caliPoints;

    @SerializedName("caliPointsNum")
    private int caliPointsNum;

    @SerializedName("downHillDistance")
    private float downHillDistance;

    @SerializedName("downHillRatio")
    private float downHillRatio;

    @SerializedName("flatDistance")
    private float flatDistance;

    @SerializedName("flatRatio")
    private float flatRatio;

    @SerializedName("isShowAltitude")
    private boolean isShowAltitude;

    @SerializedName("segmentInfo")
    private List<SegmentInfo> segmentInfo;

    @SerializedName("segmentNum")
    private int segmentNum;

    @SerializedName("slopeInfo")
    private List<SlopeInfo> slopeInfo;

    @SerializedName("slopeInfoNum")
    private int slopeInfoNum;

    @SerializedName("totalAscent")
    private float totalAscent;

    @SerializedName(BleConstants.TOTAL_DESCENT)
    private float totalDescent;

    @SerializedName("totalDist")
    private float totalDist;

    @SerializedName("totalDist3D")
    private float totalDist3D;

    @SerializedName("trackType")
    private int trackType;

    @SerializedName("upHillDistance")
    private float upHillDistance;

    @SerializedName("upHillRatio")
    private float upHillRatio;

    public float getTotalDist() {
        return this.totalDist;
    }

    public void setTotalDist(float f) {
        this.totalDist = f;
    }

    public float getTotalDist3D() {
        return this.totalDist3D;
    }

    public void setTotalDist3D(float f) {
        this.totalDist3D = f;
    }

    public float getTotalAscent() {
        return this.totalAscent;
    }

    public void setTotalAscent(float f) {
        this.totalAscent = f;
    }

    public float getTotalDescent() {
        return this.totalDescent;
    }

    public void setTotalDescent(float f) {
        this.totalDescent = f;
    }

    public List<CorrectTrackPoint> getCaliPoints() {
        return this.caliPoints;
    }

    public void setCaliPoints(List<CorrectTrackPoint> list) {
        this.caliPoints = list;
    }

    public int getCaliPointsNum() {
        return this.caliPointsNum;
    }

    public void setCaliPointsNum(int i) {
        this.caliPointsNum = i;
    }

    public List<SegmentInfo> getSegmentInfo() {
        return this.segmentInfo;
    }

    public void setSegmentInfo(List<SegmentInfo> list) {
        this.segmentInfo = list;
    }

    public int getSegmentNum() {
        return this.segmentNum;
    }

    public void setSegmentNum(int i) {
        this.segmentNum = i;
    }

    public boolean getIsShowAltitude() {
        return this.isShowAltitude;
    }

    public void setIsShowAltitude(boolean z) {
        this.isShowAltitude = z;
    }

    public int getTrackType() {
        return this.trackType;
    }

    public void setTrackType(int i) {
        this.trackType = i;
    }

    public float getDownHillDistance() {
        return this.downHillDistance;
    }

    public void setDownHillDistance(float f) {
        this.downHillDistance = f;
    }

    public float getDownHillRatio() {
        return this.downHillRatio;
    }

    public void setDownHillRatio(float f) {
        this.downHillRatio = f;
    }

    public float getFlatDistance() {
        return this.flatDistance;
    }

    public void setFlatDistance(float f) {
        this.flatDistance = f;
    }

    public float getFlatRatio() {
        return this.flatRatio;
    }

    public void setFlatRatio(float f) {
        this.flatRatio = f;
    }

    public boolean isShowAltitude() {
        return this.isShowAltitude;
    }

    public void setShowAltitude(boolean z) {
        this.isShowAltitude = z;
    }

    public List<SlopeInfo> getSlopeInfo() {
        return this.slopeInfo;
    }

    public void setSlopeInfo(List<SlopeInfo> list) {
        this.slopeInfo = list;
    }

    public int getSlopeInfoNum() {
        return this.slopeInfoNum;
    }

    public void setSlopeInfoNum(int i) {
        this.slopeInfoNum = i;
    }

    public float getUpHillDistance() {
        return this.upHillDistance;
    }

    public void setUpHillDistance(float f) {
        this.upHillDistance = f;
    }

    public float getUpHillRatio() {
        return this.upHillRatio;
    }

    public void setUpHillRatio(float f) {
        this.upHillRatio = f;
    }

    public List<TrackAltPointData> getCaliAltPoints() {
        return this.caliAltPoints;
    }

    public void setCaliAltPoints(List<TrackAltPointData> list) {
        this.caliAltPoints = list;
    }

    public int getCaliAltPointsNum() {
        return this.caliAltPointsNum;
    }

    public void setCaliAltPointsNum(int i) {
        this.caliAltPointsNum = i;
    }

    public String toString() {
        return "RouteOutputForApp{caliPoints=" + this.caliPoints + ", totalDist=" + this.totalDist + ", totalDist3D=" + this.totalDist3D + ", totalAscent=" + this.totalAscent + ", totalDescent=" + this.totalDescent + ", caliPointsNum=" + this.caliPointsNum + ", segmentInfo=" + this.segmentInfo + ", segmentNum=" + this.segmentNum + ", isShowAltitude=" + this.isShowAltitude + ", trackType=" + this.trackType + ", slopeInfo=" + this.slopeInfo + ", slopeInfoNum=" + this.slopeInfoNum + ", flatDistance=" + this.flatDistance + ", flatRatio=" + this.flatRatio + ", upHillDistance=" + this.upHillDistance + ", upHillRatio=" + this.upHillRatio + ", downHillDistance=" + this.downHillDistance + ", downHillRatio=" + this.downHillRatio + '}';
    }
}
