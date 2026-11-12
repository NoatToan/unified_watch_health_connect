package com.huawei.healthcloud.plugintrack.model;

import android.content.Context;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.route.SlopeInfo;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import defpackage.gzr;
import defpackage.gzv;
import defpackage.lmb;
import defpackage.njb;
import defpackage.njc;
import defpackage.nje;
import defpackage.njg;
import defpackage.njh;
import defpackage.nji;
import defpackage.njl;
import defpackage.njm;
import defpackage.njp;
import defpackage.njq;
import defpackage.njr;
import defpackage.njs;
import defpackage.nju;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TrackLineChartHolderImpl extends TrackLineChartHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<njc> f10492a;
    private float aa;
    private float ab;
    private List<njl> ac;
    private ArrayList<njr> ad;
    private List<gzv> ae;
    private ArrayList<HeartRateData> af;
    private List<gzr> ag;
    private float ah;
    private int ai;
    private List<njg> aj;
    private float ak;
    private List<nju> al;
    private ArrayList<SlopeInfo> am;
    private int an;
    private int ao;
    private int ap;
    private float aq;
    private ArrayList<StepRateData> ar;
    private List<njq> as;
    private int aw;
    private List<njs> ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10494c;
    private ArrayList<njm> d;
    private int e;
    private int f;
    private float g;
    private List<njb> h;
    private int i;
    private float j;
    private int k;
    private ArrayList<HeartRateData> l;
    private float m;
    private List<nje> n;
    private ArrayList<HeartRateData> o;
    private int p;
    private int q;
    private ArrayList<lmb> r;
    private ArrayList<HeartRateData> s;
    private int t;
    private int u;
    private List<nji> v;
    private int w;
    private List<njh> x;
    private List<njp> y;
    private int z;

    public TrackLineChartHolderImpl(Context context) {
        super(context);
        this.ab = -1.0f;
        this.m = -1.0f;
        this.ah = -1.0f;
        this.aa = -1.0f;
        this.g = -1.0f;
        this.aq = -1.0f;
        this.j = -1.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<HeartRateData> acquireHeartRateData() {
        return this.l;
    }

    public void d(ArrayList<HeartRateData> arrayList) {
        this.l = arrayList;
    }

    public void c(ArrayList<HeartRateData> arrayList) {
        this.o = arrayList;
    }

    public void e(ArrayList<HeartRateData> arrayList) {
        this.s = arrayList;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireHeartRateDataInterval() {
        return this.k;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireHeartRateDataSumTime() {
        return this.m;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireRecoverHeartRateDataSumTime() {
        return this.ab;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<HeartRateData> acquireInvalidHeartRateData() {
        return this.o;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<HeartRateData> acquireInvalidUnixHeartRateData() {
        return this.s;
    }

    public void a(int i) {
        this.k = i;
    }

    public void d(float f) {
        this.m = f;
    }

    public void b(float f) {
        this.ab = f;
    }

    public void f(float f) {
        this.ah = f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireRealTimePaceDataSumTime() {
        return this.aa;
    }

    public void e(float f) {
        this.j = f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireAnalogCadenceDataSumTime() {
        return this.j;
    }

    public void a(float f) {
        this.aa = f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireRunningPostureDataSumTime() {
        return this.ah;
    }

    public void c() {
        this.m = -1.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<StepRateData> acquireStepRateData() {
        return this.ar;
    }

    public void b(ArrayList<StepRateData> arrayList) {
        this.ar = arrayList;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireJumpDataInterval() {
        return this.q;
    }

    public void c(int i) {
        this.q = i;
    }

    public void a(ArrayList<lmb> arrayList) {
        this.r = arrayList;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<lmb> acquireTrackJumpData() {
        return this.r;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireStepRateDataInterval() {
        return this.ap;
    }

    public void m(int i) {
        this.ap = i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireStepRateSumTime() {
        return this.aq;
    }

    public void j(float f) {
        this.aq = f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<njm> acquireTrackAltitudeData() {
        return this.d;
    }

    public void f(ArrayList<njm> arrayList) {
        this.d = arrayList;
    }

    public void i(ArrayList<SlopeInfo> arrayList) {
        this.am = arrayList;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireTrackAltitudeDataInterval() {
        return this.f10493b;
    }

    public void l(int i) {
        this.f10493b = i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireTrackAltitudeShowType() {
        return this.f10494c;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<SlopeInfo> acquireSlopeInfoList() {
        return this.am;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public boolean isSlopeInfoDisplayEnabled() {
        return njy.e(this.am);
    }

    public void o(int i) {
        this.f10494c = i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<njr> acquireTrackRealTimeSpeedData() {
        return this.ad;
    }

    public void h(ArrayList<njr> arrayList) {
        this.ad = arrayList;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireTrackRealTimeSpeedDataInterval() {
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ArrayList<HeartRateData> acquireTrackHeartRateData() {
        return this.af;
    }

    public void j(ArrayList<HeartRateData> arrayList) {
        this.af = arrayList;
    }

    public void q(int i) {
        this.z = i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njq> acquireSwolfData() {
        return this.as;
    }

    public void l(List<njq> list) {
        this.as = list;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireSwolfDataInterval() {
        return this.ao;
    }

    public void n(int i) {
        this.ao = i;
    }

    public void d(List<gzr> list) {
        this.ag = list;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<nji> acquirePaddleFrequencyData() {
        return this.v;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquirePaddleFreqInterval() {
        return this.t;
    }

    public void f(int i) {
        this.t = i;
    }

    public void e(List<nji> list) {
        this.v = list;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<gzr> acquireRidePostureData() {
        return this.ag;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireCadenceInterval() {
        return this.i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireCadenceSumTime() {
        return this.g;
    }

    public void c(float f) {
        this.g = f;
    }

    public void d(int i) {
        this.i = i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njh> acquirePoweData() {
        return this.x;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njb> acquireAnalogPowerData() {
        return this.h;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njc> acquireAnalogCadenceData() {
        return this.f10492a;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njs> acquireWeightData() {
        return this.ax;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njg> acquireSkippingSpeedData() {
        return this.aj;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireSkippingSpeedInterval() {
        return this.an;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquirePowerDataInterval() {
        return this.w;
    }

    public void g(int i) {
        this.w = i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireAnalogPowerInterval() {
        return this.f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireAnalogCadenceInterval() {
        return this.e;
    }

    public void b(int i) {
        this.f = i;
    }

    public void e(int i) {
        this.e = i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireWeightDataInterval() {
        return this.aw;
    }

    public void r(int i) {
        this.aw = i;
    }

    public void k(int i) {
        this.an = i;
    }

    public void a(List<njh> list) {
        this.x = list;
    }

    public void b(List<njb> list) {
        this.h = list;
    }

    public void c(List<njc> list) {
        this.f10492a = list;
    }

    public void m(List<njs> list) {
        this.ax = list;
    }

    public void g(List<njg> list) {
        this.aj = list;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njp> acquirePullFreqData() {
        return this.y;
    }

    public void j(List<njp> list) {
        this.y = list;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquirePullFreqDataInterval() {
        return this.u;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireJumpTotalTime() {
        return this.p;
    }

    public void i(int i) {
        this.p = i;
    }

    public void j(int i) {
        this.u = i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njl> acquireTrackRealTimePaceData() {
        return this.ac;
    }

    public void f(List<njl> list) {
        this.ac = list;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<gzv> acquireRunningPostureData() {
        return this.ae;
    }

    public void i(List<gzv> list) {
        this.ae = list;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireRunningPostureDataInterval() {
        return this.ai;
    }

    public void h(int i) {
        this.ai = i;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<nju> acquireTrackSpo2Data() {
        return this.al;
    }

    public void h(List<nju> list) {
        this.al = list;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireSpo2SumTime() {
        return this.ak;
    }

    public void i(float f) {
        this.ak = f;
    }

    public void n(List<nje> list) {
        this.n = list;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<nje> getHeartRateAreaList() {
        return this.n;
    }
}
