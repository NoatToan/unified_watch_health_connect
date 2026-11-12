package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.sport.LapPace;
import com.xiaomi.hm.health.bt.profile.sport.SegmentDetail;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SportDetail implements Serializable {
    private static final long serialVersionUID = 1;
    private ArrayList<GpsPoint> a = new ArrayList<>();
    private ArrayList<KmPaceInfo> b = new ArrayList<>();
    private ArrayList<MilePaceInfo> c = new ArrayList<>();
    private ArrayList<HeartRateInfo> d = new ArrayList<>();
    private ArrayList<PauseInfo> e = new ArrayList<>();
    private ArrayList<StrokeSpeedInfo> f = new ArrayList<>();
    private ArrayList<RtPaceInfo> g = new ArrayList<>();
    private List<SegmentDetail> h = new ArrayList();
    private List<LapPace> i = new ArrayList();
    private List<TxStepMode> j = new ArrayList();
    private List<LapPace> k = new ArrayList();
    private ArrayList<LapInfo> l = new ArrayList<>();
    private ArrayList<Row> m = new ArrayList<>();
    private ArrayList<SkipRope> n = new ArrayList<>();
    private List<MarathonInfo> o = new ArrayList();
    private List<RtSpo2Info> p = new ArrayList();
    private List<SportRtPressure> q = new ArrayList();
    private List<SportRtTemperature> r = new ArrayList();
    private List<AltitudePoint> s = new ArrayList();
    private List<StrengthGroupInfo> t = new ArrayList();
    private List<GolfGroupInfo> u = new ArrayList();
    private List<GolfRtInfo> v = new ArrayList();
    private List<RtPowerInfo> w = new ArrayList();
    private List<PlaygroundInfo> x = new ArrayList();
    private int y = -1;

    public void addAltitudePoint(AltitudePoint altitudePoint) {
        this.s.add(altitudePoint);
    }

    public void addGolfGroupNodes(GolfGroupInfo node) {
        this.u.add(node);
    }

    public void addGolfRtNode(GolfRtInfo golfRtNode) {
        this.v.add(golfRtNode);
    }

    public void addGpsPoint(GpsPoint point) {
        if (point == null) {
            return;
        }
        this.a.add(point);
    }

    public void addHeartRateInfo(HeartRateInfo info) {
        this.d.add(info);
    }

    public void addKmLapPace(LapPace lapPace) {
        this.i.add(lapPace);
    }

    public void addKmPaceInfo(KmPaceInfo info) {
        this.b.add(info);
    }

    public void addLapInfo(LapInfo lapInfo) {
        this.l.add(lapInfo);
    }

    public void addMarathonInfo(MarathonInfo marathonInfo) {
        this.o.add(marathonInfo);
    }

    public void addMileLapPace(LapPace lapPace) {
        this.k.add(lapPace);
    }

    public void addMilePaceInfo(MilePaceInfo info) {
        this.c.add(info);
    }

    public void addPauseInfo(PauseInfo info) {
        this.e.add(info);
    }

    public void addPlayGroundInfos(PlaygroundInfo playgroundInfo) {
        this.x.add(playgroundInfo);
    }

    public void addPressure(SportRtPressure pressure) {
        this.q.add(pressure);
    }

    public void addRowInfo(Row rowInfo) {
        this.m.add(rowInfo);
    }

    public void addRtPaceInfo(RtPaceInfo rtPaceInfo) {
        this.g.add(rtPaceInfo);
    }

    public void addRtPower(RtPowerInfo rtPowerInfo) {
        this.w.add(rtPowerInfo);
    }

    public void addRtTemperature(SportRtTemperature sportRtTemperature) {
        this.r.add(sportRtTemperature);
    }

    public void addSegment(SegmentDetail segment) {
        this.h.add(segment);
    }

    public void addSkipRopeInfo(SkipRope skipRopeInfo) {
        this.n.add(skipRopeInfo);
    }

    public void addSpo2(RtSpo2Info rtSpo2Info) {
        this.p.add(rtSpo2Info);
    }

    public void addStrengthGroupNode(StrengthGroupInfo node) {
        this.t.add(node);
    }

    public void addStrokeSpeedInfo(StrokeSpeedInfo info) {
        this.f.add(info);
    }

    public void addTxStepMode(TxStepMode txStepMode) {
        this.j.add(txStepMode);
    }

    public List<AltitudePoint> getAltitudePoints() {
        return this.s;
    }

    public List<GolfGroupInfo> getGolfGroupNodes() {
        return this.u;
    }

    public List<GolfRtInfo> getGolfRtNodes() {
        return this.v;
    }

    public ArrayList<GpsPoint> getGpsPoints() {
        return this.a;
    }

    public ArrayList<HeartRateInfo> getHeartRateInfos() {
        return this.d;
    }

    public List<LapPace> getKmLapPaces() {
        return this.i;
    }

    public ArrayList<KmPaceInfo> getKmPaceInfos() {
        return this.b;
    }

    public ArrayList<LapInfo> getLapInfos() {
        return this.l;
    }

    public List<MarathonInfo> getMarathonInfo() {
        return this.o;
    }

    public List<LapPace> getMileLapPaces() {
        return this.k;
    }

    public ArrayList<MilePaceInfo> getMilePaceInfos() {
        return this.c;
    }

    public ArrayList<PauseInfo> getPauseInfos() {
        return this.e;
    }

    public List<PlaygroundInfo> getPlaygroundInfos() {
        return this.x;
    }

    public ArrayList<Row> getRowInfos() {
        return this.m;
    }

    public ArrayList<RtPaceInfo> getRtPaceInfos() {
        return this.g;
    }

    public List<RtPowerInfo> getRtPowerNodes() {
        return this.w;
    }

    public List<SportRtPressure> getRtPressure() {
        return this.q;
    }

    public List<RtSpo2Info> getRtSpo2Infos() {
        return this.p;
    }

    public List<SportRtTemperature> getRtTemperatures() {
        return this.r;
    }

    public int getSecondHalfStartTime() {
        return this.y;
    }

    public List<SegmentDetail> getSegments() {
        return this.h;
    }

    public ArrayList<SkipRope> getSkipRopeInfos() {
        return this.n;
    }

    public List<StrengthGroupInfo> getStrengthGroupNodes() {
        return this.t;
    }

    public ArrayList<StrokeSpeedInfo> getStrokeSpeedInfos() {
        return this.f;
    }

    public List<TxStepMode> getTxStepModes() {
        return this.j;
    }

    public void setSecondHalfStartTime(int secondHalfStartTime) {
        this.y = secondHalfStartTime;
    }

    public String toSimpleString() {
        StringBuilder sb = new StringBuilder();
        Iterator<HeartRateInfo> it2 = this.d.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next() + "\n");
        }
        Iterator<KmPaceInfo> it3 = this.b.iterator();
        while (it3.hasNext()) {
            sb.append(it3.next() + "\n");
        }
        Iterator<MilePaceInfo> it4 = this.c.iterator();
        while (it4.hasNext()) {
            sb.append(it4.next() + "\n");
        }
        Iterator<PauseInfo> it5 = this.e.iterator();
        while (it5.hasNext()) {
            sb.append(it5.next() + "\n");
        }
        Iterator<StrokeSpeedInfo> it6 = this.f.iterator();
        while (it6.hasNext()) {
            sb.append(it6.next() + "\n");
        }
        Iterator<RtPaceInfo> it7 = this.g.iterator();
        while (it7.hasNext()) {
            sb.append(it7.next() + "\n");
        }
        Iterator<SegmentDetail> it8 = this.h.iterator();
        while (it8.hasNext()) {
            sb.append(it8.next());
            sb.append("\n");
        }
        Iterator<LapPace> it9 = this.i.iterator();
        while (it9.hasNext()) {
            sb.append(it9.next());
            sb.append("\n");
        }
        Iterator<TxStepMode> it10 = this.j.iterator();
        while (it10.hasNext()) {
            sb.append(it10.next());
            sb.append("\n");
        }
        Iterator<LapPace> it11 = this.k.iterator();
        while (it11.hasNext()) {
            sb.append(it11.next());
            sb.append("\n");
        }
        Iterator<SportRtPressure> it12 = this.q.iterator();
        while (it12.hasNext()) {
            sb.append(it12.next());
            sb.append("\n");
        }
        Iterator<SportRtTemperature> it13 = this.r.iterator();
        while (it13.hasNext()) {
            sb.append(it13.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<GpsPoint> it2 = this.a.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next() + "\n");
        }
        Iterator<HeartRateInfo> it3 = this.d.iterator();
        while (it3.hasNext()) {
            sb.append(it3.next() + "\n");
        }
        Iterator<KmPaceInfo> it4 = this.b.iterator();
        while (it4.hasNext()) {
            sb.append(it4.next() + "\n");
        }
        Iterator<MilePaceInfo> it5 = this.c.iterator();
        while (it5.hasNext()) {
            sb.append(it5.next() + "\n");
        }
        Iterator<PauseInfo> it6 = this.e.iterator();
        while (it6.hasNext()) {
            sb.append(it6.next() + "\n");
        }
        Iterator<StrokeSpeedInfo> it7 = this.f.iterator();
        while (it7.hasNext()) {
            sb.append(it7.next() + "\n");
        }
        Iterator<RtPaceInfo> it8 = this.g.iterator();
        while (it8.hasNext()) {
            sb.append(it8.next() + "\n");
        }
        Iterator<SegmentDetail> it9 = this.h.iterator();
        while (it9.hasNext()) {
            sb.append(it9.next());
            sb.append("\n");
        }
        Iterator<LapPace> it10 = this.i.iterator();
        while (it10.hasNext()) {
            sb.append(it10.next());
            sb.append("\n");
        }
        Iterator<TxStepMode> it11 = this.j.iterator();
        while (it11.hasNext()) {
            sb.append(it11.next());
            sb.append("\n");
        }
        Iterator<LapPace> it12 = this.k.iterator();
        while (it12.hasNext()) {
            sb.append(it12.next());
            sb.append("\n");
        }
        Iterator<Row> it13 = this.m.iterator();
        while (it13.hasNext()) {
            sb.append(it13.next() + "\n");
        }
        Iterator<SkipRope> it14 = this.n.iterator();
        while (it14.hasNext()) {
            sb.append(it14.next() + "\n");
        }
        Iterator<Row> it15 = this.m.iterator();
        while (it15.hasNext()) {
            sb.append(it15.next() + "\n");
        }
        Iterator<SkipRope> it16 = this.n.iterator();
        while (it16.hasNext()) {
            sb.append(it16.next() + "\n");
        }
        Iterator<SportRtPressure> it17 = this.q.iterator();
        while (it17.hasNext()) {
            sb.append(it17.next());
            sb.append("\n");
        }
        Iterator<SportRtTemperature> it18 = this.r.iterator();
        while (it18.hasNext()) {
            sb.append(it18.next());
            sb.append("\n");
        }
        Iterator<PlaygroundInfo> it19 = this.x.iterator();
        while (it19.hasNext()) {
            sb.append(it19.next());
            sb.append("\n");
        }
        return sb.toString();
    }
}
