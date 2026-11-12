package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.LapPace;
import defpackage.pr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SportDetail implements Serializable {
    private static final long serialVersionUID = 1;
    private ArrayList<GpsPoint> gpsPoints = new ArrayList<>();
    private ArrayList<KmPaceInfo> kmPaceInfos = new ArrayList<>();
    private ArrayList<MilePaceInfo> milePaceInfos = new ArrayList<>();
    private ArrayList<HeartRateInfo> heartRateInfos = new ArrayList<>();
    private ArrayList<PauseInfo> pauseInfos = new ArrayList<>();
    private ArrayList<StrokeSpeedInfo> strokeSpeedInfos = new ArrayList<>();
    private ArrayList<RtPaceInfo> rtPaceInfos = new ArrayList<>();
    private List<pr> segments = new ArrayList();
    private List<LapPace> kmLapPaces = new ArrayList();
    private List<TxStepMode> txStepModes = new ArrayList();
    private List<LapPace> mileLapPaces = new ArrayList();
    private ArrayList<LapInfo> lapInfos = new ArrayList<>();
    private ArrayList<Row> rowInfos = new ArrayList<>();
    private ArrayList<SkipRope> skipRopeInfos = new ArrayList<>();
    private List<MarathonInfo> marathonInfo = new ArrayList();
    private List<RtSpo2Info> rtSpo2Infos = new ArrayList();
    private List<SportRtPressure> rtPressures = new ArrayList();
    private List<SportRtTemperature> rtTemperatures = new ArrayList();
    private List<AltitudePoint> altitudePoints = new ArrayList();
    private List<StrengthGroupInfo> strengthGroupNodes = new ArrayList();
    private List<GolfGroupInfo> golfGroupNodes = new ArrayList();
    private List<GolfRtInfo> golfRtNodes = new ArrayList();
    private List<RtPowerInfo> rtPowerNodes = new ArrayList();
    private List<PlaygroundInfo> playgroundInfos = new ArrayList();
    private int secondHalfStartTime = -1;

    public void addAltitudePoint(AltitudePoint altitudePoint) {
        this.altitudePoints.add(altitudePoint);
    }

    public void addGolfGroupNodes(GolfGroupInfo golfGroupInfo) {
        this.golfGroupNodes.add(golfGroupInfo);
    }

    public void addGolfRtNode(GolfRtInfo golfRtInfo) {
        this.golfRtNodes.add(golfRtInfo);
    }

    public void addGpsPoint(GpsPoint gpsPoint) {
        if (gpsPoint == null) {
            return;
        }
        this.gpsPoints.add(gpsPoint);
    }

    public void addHeartRateInfo(HeartRateInfo heartRateInfo) {
        this.heartRateInfos.add(heartRateInfo);
    }

    public void addKmLapPace(LapPace dkVar) {
        this.kmLapPaces.add(dkVar);
    }

    public void addKmPaceInfo(KmPaceInfo kmPaceInfo) {
        this.kmPaceInfos.add(kmPaceInfo);
    }

    public void addLapInfo(LapInfo lapInfo) {
        this.lapInfos.add(lapInfo);
    }

    public void addMarathonInfo(MarathonInfo marathonInfo) {
        this.marathonInfo.add(marathonInfo);
    }

    public void addMileLapPace(LapPace dkVar) {
        this.mileLapPaces.add(dkVar);
    }

    public void addMilePaceInfo(MilePaceInfo milePaceInfo) {
        this.milePaceInfos.add(milePaceInfo);
    }

    public void addPauseInfo(PauseInfo pauseInfo) {
        this.pauseInfos.add(pauseInfo);
    }

    public void addPlayGroundInfos(PlaygroundInfo playgroundInfo) {
        this.playgroundInfos.add(playgroundInfo);
    }

    public void addPressure(SportRtPressure sportRtPressure) {
        this.rtPressures.add(sportRtPressure);
    }

    public void addRowInfo(Row row) {
        this.rowInfos.add(row);
    }

    public void addRtPaceInfo(RtPaceInfo rtPaceInfo) {
        this.rtPaceInfos.add(rtPaceInfo);
    }

    public void addRtPower(RtPowerInfo rtPowerInfo) {
        this.rtPowerNodes.add(rtPowerInfo);
    }

    public void addRtTemperature(SportRtTemperature sportRtTemperature) {
        this.rtTemperatures.add(sportRtTemperature);
    }

    public void addSegment(pr prVar) {
        this.segments.add(prVar);
    }

    public void addSkipRopeInfo(SkipRope skipRope) {
        this.skipRopeInfos.add(skipRope);
    }

    public void addSpo2(RtSpo2Info rtSpo2Info) {
        this.rtSpo2Infos.add(rtSpo2Info);
    }

    public void addStrengthGroupNode(StrengthGroupInfo strengthGroupInfo) {
        this.strengthGroupNodes.add(strengthGroupInfo);
    }

    public void addStrokeSpeedInfo(StrokeSpeedInfo strokeSpeedInfo) {
        this.strokeSpeedInfos.add(strokeSpeedInfo);
    }

    public void addTxStepMode(TxStepMode txStepMode) {
        this.txStepModes.add(txStepMode);
    }

    public List<AltitudePoint> getAltitudePoints() {
        return this.altitudePoints;
    }

    public List<GolfGroupInfo> getGolfGroupNodes() {
        return this.golfGroupNodes;
    }

    public List<GolfRtInfo> getGolfRtNodes() {
        return this.golfRtNodes;
    }

    public ArrayList<GpsPoint> getGpsPoints() {
        return this.gpsPoints;
    }

    public ArrayList<HeartRateInfo> getHeartRateInfos() {
        return this.heartRateInfos;
    }

    public List<LapPace> getKmLapPaces() {
        return this.kmLapPaces;
    }

    public ArrayList<KmPaceInfo> getKmPaceInfos() {
        return this.kmPaceInfos;
    }

    public ArrayList<LapInfo> getLapInfos() {
        return this.lapInfos;
    }

    public List<MarathonInfo> getMarathonInfo() {
        return this.marathonInfo;
    }

    public List<LapPace> getMileLapPaces() {
        return this.mileLapPaces;
    }

    public ArrayList<MilePaceInfo> getMilePaceInfos() {
        return this.milePaceInfos;
    }

    public ArrayList<PauseInfo> getPauseInfos() {
        return this.pauseInfos;
    }

    public List<PlaygroundInfo> getPlaygroundInfos() {
        return this.playgroundInfos;
    }

    public ArrayList<Row> getRowInfos() {
        return this.rowInfos;
    }

    public ArrayList<RtPaceInfo> getRtPaceInfos() {
        return this.rtPaceInfos;
    }

    public List<RtPowerInfo> getRtPowerNodes() {
        return this.rtPowerNodes;
    }

    public List<SportRtPressure> getRtPressure() {
        return this.rtPressures;
    }

    public List<RtSpo2Info> getRtSpo2Infos() {
        return this.rtSpo2Infos;
    }

    public List<SportRtTemperature> getRtTemperatures() {
        return this.rtTemperatures;
    }

    public int getSecondHalfStartTime() {
        return this.secondHalfStartTime;
    }

    public List<pr> getSegments() {
        return this.segments;
    }

    public ArrayList<SkipRope> getSkipRopeInfos() {
        return this.skipRopeInfos;
    }

    public List<StrengthGroupInfo> getStrengthGroupNodes() {
        return this.strengthGroupNodes;
    }

    public ArrayList<StrokeSpeedInfo> getStrokeSpeedInfos() {
        return this.strokeSpeedInfos;
    }

    public List<TxStepMode> getTxStepModes() {
        return this.txStepModes;
    }

    public void setSecondHalfStartTime(int i) {
        this.secondHalfStartTime = i;
    }

    public String toSimpleString() {
        StringBuilder sb = new StringBuilder();
        Iterator<HeartRateInfo> it = this.heartRateInfos.iterator();
        while (it.hasNext()) {
            sb.append(it.next() + "\n");
        }
        Iterator<KmPaceInfo> it2 = this.kmPaceInfos.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next() + "\n");
        }
        Iterator<MilePaceInfo> it3 = this.milePaceInfos.iterator();
        while (it3.hasNext()) {
            sb.append(it3.next() + "\n");
        }
        Iterator<PauseInfo> it4 = this.pauseInfos.iterator();
        while (it4.hasNext()) {
            sb.append(it4.next() + "\n");
        }
        Iterator<StrokeSpeedInfo> it5 = this.strokeSpeedInfos.iterator();
        while (it5.hasNext()) {
            sb.append(it5.next() + "\n");
        }
        Iterator<RtPaceInfo> it6 = this.rtPaceInfos.iterator();
        while (it6.hasNext()) {
            sb.append(it6.next() + "\n");
        }
        Iterator<pr> it7 = this.segments.iterator();
        while (it7.hasNext()) {
            sb.append(it7.next());
            sb.append("\n");
        }
        Iterator<LapPace> it8 = this.kmLapPaces.iterator();
        while (it8.hasNext()) {
            sb.append(it8.next());
            sb.append("\n");
        }
        Iterator<TxStepMode> it9 = this.txStepModes.iterator();
        while (it9.hasNext()) {
            sb.append(it9.next());
            sb.append("\n");
        }
        Iterator<LapPace> it10 = this.mileLapPaces.iterator();
        while (it10.hasNext()) {
            sb.append(it10.next());
            sb.append("\n");
        }
        Iterator<SportRtPressure> it11 = this.rtPressures.iterator();
        while (it11.hasNext()) {
            sb.append(it11.next());
            sb.append("\n");
        }
        Iterator<SportRtTemperature> it12 = this.rtTemperatures.iterator();
        while (it12.hasNext()) {
            sb.append(it12.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<GpsPoint> it = this.gpsPoints.iterator();
        while (it.hasNext()) {
            sb.append(it.next() + "\n");
        }
        Iterator<HeartRateInfo> it2 = this.heartRateInfos.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next() + "\n");
        }
        Iterator<KmPaceInfo> it3 = this.kmPaceInfos.iterator();
        while (it3.hasNext()) {
            sb.append(it3.next() + "\n");
        }
        Iterator<MilePaceInfo> it4 = this.milePaceInfos.iterator();
        while (it4.hasNext()) {
            sb.append(it4.next() + "\n");
        }
        Iterator<PauseInfo> it5 = this.pauseInfos.iterator();
        while (it5.hasNext()) {
            sb.append(it5.next() + "\n");
        }
        Iterator<StrokeSpeedInfo> it6 = this.strokeSpeedInfos.iterator();
        while (it6.hasNext()) {
            sb.append(it6.next() + "\n");
        }
        Iterator<RtPaceInfo> it7 = this.rtPaceInfos.iterator();
        while (it7.hasNext()) {
            sb.append(it7.next() + "\n");
        }
        Iterator<pr> it8 = this.segments.iterator();
        while (it8.hasNext()) {
            sb.append(it8.next());
            sb.append("\n");
        }
        Iterator<LapPace> it9 = this.kmLapPaces.iterator();
        while (it9.hasNext()) {
            sb.append(it9.next());
            sb.append("\n");
        }
        Iterator<TxStepMode> it10 = this.txStepModes.iterator();
        while (it10.hasNext()) {
            sb.append(it10.next());
            sb.append("\n");
        }
        Iterator<LapPace> it11 = this.mileLapPaces.iterator();
        while (it11.hasNext()) {
            sb.append(it11.next());
            sb.append("\n");
        }
        Iterator<Row> it12 = this.rowInfos.iterator();
        while (it12.hasNext()) {
            sb.append(it12.next() + "\n");
        }
        Iterator<SkipRope> it13 = this.skipRopeInfos.iterator();
        while (it13.hasNext()) {
            sb.append(it13.next() + "\n");
        }
        Iterator<Row> it14 = this.rowInfos.iterator();
        while (it14.hasNext()) {
            sb.append(it14.next() + "\n");
        }
        Iterator<SkipRope> it15 = this.skipRopeInfos.iterator();
        while (it15.hasNext()) {
            sb.append(it15.next() + "\n");
        }
        Iterator<SportRtPressure> it16 = this.rtPressures.iterator();
        while (it16.hasNext()) {
            sb.append(it16.next());
            sb.append("\n");
        }
        Iterator<SportRtTemperature> it17 = this.rtTemperatures.iterator();
        while (it17.hasNext()) {
            sb.append(it17.next());
            sb.append("\n");
        }
        Iterator<PlaygroundInfo> it18 = this.playgroundInfos.iterator();
        while (it18.hasNext()) {
            sb.append(it18.next());
            sb.append("\n");
        }
        return sb.toString();
    }
}
