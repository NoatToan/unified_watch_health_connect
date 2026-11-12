package com.xiaomi.fitness.sport_manager_export.data;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class SportData implements Serializable {
    public byte addDis;
    public boolean addToFile;
    public int adjustmentDis;
    public float altitude;
    public int appLaunchType;
    public float aveHeight;
    public byte aveHrRate;
    public int avgFrequency;
    public int avgImpact;
    public int avgOffGround;
    public int avgOnGround;
    public int avgOnOffRatio;
    public int avgPace;
    public float avgSpeed;
    public int avgStried;
    public int avgVerticalAmplitude;
    public int avgVerticalStrideRatio;
    public long cacheTime;
    public short cal;
    public byte calAndStep;
    public long courseId;
    public int currentCal;
    public int currentPace;
    public float currentSpeed;
    public int currentSteps;
    public int dataCount;
    public byte degree;
    public int distance;
    public byte distanceInfo;
    public float drop;
    public int endTime;
    public float exercise;
    public byte expend;
    public int fastestPace;
    public float fastestSpeed;
    public int foreFootDurBySecond;
    public int forefootRatio;
    public int fullFootDurBySecond;
    public short good;
    public int heelRatio;
    public int hindFootDurBySecond;
    public byte hitRate;
    public int hrAerobic;
    public int hrAnaerobic;
    public int hrFat;
    public int hrLimit;
    public byte hrRate;
    public int hrWarm;
    public int impact;
    public boolean isHasDegree;
    public int kmCount;
    public int mainRunStyle;
    public int maxFrequency;
    public float maxHeight;
    public short maxHit;
    public byte maxHrRate;
    public int maxImpact;
    public byte maxO;
    public int maxOffGround;
    public int maxPace;
    public float maxPushStrength;
    public float maxSpeed;
    public short maxStepRate;
    public int maxVerticalAmplitude;
    public int maxVerticalStrideRatio;
    public float minHeight;
    public byte minHrRate;
    public int minOnGround;
    public int minOnOffRatio;
    public int minVerticalAmplitude;
    public int minVerticalStrideRatio;
    public short miss;
    public int offGround;
    public int onGround;
    public int onOffRatio;
    public short perfect;
    public long planId;
    public boolean recordStepValid;
    public short recovery;
    public int revolutionCount;
    public float rise;
    public int slowestPace;
    public int sportCourse;
    public int sportType;
    public int startTime;
    public int stepRate;
    public byte stride;
    public int targetCal;
    public int targetDis;
    public int targetDurution;
    public int timeStamp;
    public int timezone;
    public short totalPunches;
    public int totalStep;
    public int totalTime;
    public int verticalAmplitude;
    public int verticalStrideRatio;
    public int wearMode;

    public static class a {
        public int A;
        public int A0;
        public int B;
        public float C;
        public int C0;
        public int D;
        public int D0;
        public byte E;
        public int E0;
        public byte F;
        public int F0;
        public byte G;
        public int G0;
        public byte H;
        public int H0;
        public int I;
        public int J;
        public int K;
        public byte L;
        public boolean M;
        public short N;
        public short O;
        public short P;
        public short Q;
        public float R;
        public short S;
        public byte T;
        public int U;
        public long V;
        public int W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13207a;
        public int a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13208b;
        public int b0;
        public int c;
        public int c0;
        public int d;
        public byte d0;
        public short e;
        public int e0;
        public int f;
        public int f0;
        public int g;
        public float g0;
        public float h;
        public float h0;
        public int i;
        public int i0;
        public short j;
        public int j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte f13209k;
        public int k0;
        public byte l;
        public int l0;
        public byte m;
        public int m0;
        public float n;
        public int n0;
        public float o;
        public int o0;
        public float p;
        public int p0;
        public float q;
        public int q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f13210r;
        public int r0;
        public float s;
        public int s0;
        public byte t;
        public int t0;
        public byte u;
        public int u0;
        public short v;
        public int v0;
        public int w;
        public int w0;
        public int x;
        public int x0;
        public int y;
        public float y0;
        public int z;
        public int z0;
        public boolean B0 = true;
        public long I0 = 0;

        public a A1(int i) {
            this.b0 = i;
            return this;
        }

        public a B1(int i) {
            this.a0 = i;
            return this;
        }

        public a C1(short s) {
            this.P = s;
            return this;
        }

        public a D0(int i) {
            this.i0 = i;
            return this;
        }

        public a D1(int i) {
            this.c0 = i;
            return this;
        }

        public a E0(int i) {
            this.o0 = i;
            return this;
        }

        public a E1(byte b2) {
            this.T = b2;
            return this;
        }

        public a F0(int i) {
            this.s0 = i;
            return this;
        }

        public a F1(int i) {
            this.y = i;
            return this;
        }

        public a G0(int i) {
            this.q0 = i;
            return this;
        }

        public a G1(int i) {
            this.x = i;
            return this;
        }

        public a H0(int i) {
            this.u0 = i;
            return this;
        }

        public a H1(int i) {
            this.z = i;
            return this;
        }

        public a I0(float f) {
            this.g0 = f;
            return this;
        }

        public a I1(int i) {
            this.w = i;
            return this;
        }

        public a J0(int i) {
            this.k0 = i;
            return this;
        }

        public a J1(byte b2) {
            this.F = b2;
            return this;
        }

        public a K0(int i) {
            this.F0 = i;
            return this;
        }

        public a K1(int i) {
            this.A = i;
            return this;
        }

        public a L0(int i) {
            this.C0 = i;
            return this;
        }

        public a L1(int i) {
            this.X = i;
            return this;
        }

        public SportData M0() {
            return new SportData(this);
        }

        public a M1(float f) {
            this.q = f;
            return this;
        }

        public a N0(int i) {
            this.x0 = i;
            return this;
        }

        public a N1(short s) {
            this.S = s;
            return this;
        }

        public a O0(float f) {
            this.y0 = f;
            return this;
        }

        public a O1(byte b2) {
            this.l = b2;
            return this;
        }

        public a P0(int i) {
            this.m0 = i;
            return this;
        }

        public a P1(float f) {
            this.R = f;
            return this;
        }

        public a Q0(int i) {
            this.n0 = i;
            return this;
        }

        public a Q1(short s) {
            this.j = s;
            return this;
        }

        public a R0(int i) {
            this.X = i;
            return this;
        }

        public a R1(byte b2) {
            this.m = b2;
            return this;
        }

        public a S0(boolean z) {
            this.M = z;
            return this;
        }

        public a S1(short s) {
            this.Q = s;
            return this;
        }

        public a T0(int i) {
            this.l0 = i;
            return this;
        }

        public a T1(int i) {
            this.Z = i;
            return this;
        }

        public a U0(int i) {
            this.j0 = i;
            return this;
        }

        public a U1(int i) {
            this.Y = i;
            return this;
        }

        public a V0(int i) {
            this.p0 = i;
            return this;
        }

        public a V1(short s) {
            this.O = s;
            return this;
        }

        public a W0(int i) {
            this.t0 = i;
            return this;
        }

        public a W1(boolean z) {
            this.B0 = z;
            return this;
        }

        public a X0(int i) {
            this.f0 = i;
            return this;
        }

        public a X1(int i) {
            this.W = i;
            return this;
        }

        public a Y0(float f) {
            this.h0 = f;
            return this;
        }

        public a Y1(float f) {
            this.n = f;
            return this;
        }

        public a Z0(int i) {
            this.H0 = i;
            return this;
        }

        public a Z1(int i) {
            this.g = i;
            return this;
        }

        public a a1(int i) {
            this.E0 = i;
            return this;
        }

        public a a2(int i) {
            this.f13207a = i;
            return this;
        }

        public a b1(int i) {
            this.r0 = i;
            return this;
        }

        public a b2(int i) {
            this.B = i;
            return this;
        }

        public a c1(int i) {
            this.v0 = i;
            return this;
        }

        public a c2(byte b2) {
            this.d0 = b2;
            return this;
        }

        public a d1(int i) {
            this.G0 = i;
            return this;
        }

        public a d2(int i) {
            this.D = i;
            return this;
        }

        public a e1(int i) {
            this.D0 = i;
            return this;
        }

        public a e2(int i) {
            this.K = i;
            return this;
        }

        public a f1(int i) {
            this.Z = i;
            return this;
        }

        public a f2(short s) {
            this.N = s;
            return this;
        }

        public a g1(int i) {
            this.Y = i;
            return this;
        }

        public a g2(int i) {
            this.i = i;
            return this;
        }

        public a h1(int i) {
            this.w0 = i;
            return this;
        }

        public a h2(int i) {
            this.c = i;
            return this;
        }

        public a i1(long j) {
            this.I0 = j;
            return this;
        }

        public a i2(int i) {
            this.U = i;
            return this;
        }

        public a j1(byte b2) {
            this.H = b2;
            return this;
        }

        public a j2(int i) {
            this.z0 = i;
            return this;
        }

        public a k1(float f) {
            this.C = f;
            return this;
        }

        public a k2(int i) {
            this.A0 = i;
            return this;
        }

        public a l1(float f) {
            this.p = f;
            return this;
        }

        public a m1(byte b2) {
            this.f13209k = b2;
            return this;
        }

        public a n1(int i) {
            this.e0 = i;
            return this;
        }

        public a o1(short s) {
            this.e = s;
            return this;
        }

        public a p1(byte b2) {
            this.E = b2;
            return this;
        }

        public a q1(long j) {
            this.V = j;
            return this;
        }

        public a r1(int i) {
            this.I = i;
            return this;
        }

        public a s1(int i) {
            this.J = i;
            return this;
        }

        public a t1(byte b2) {
            this.L = b2;
            return this;
        }

        public a u1(int i) {
            this.d = i;
            return this;
        }

        public a v1(byte b2) {
            this.G = b2;
            return this;
        }

        public a w1(float f) {
            this.o = f;
            return this;
        }

        public a x1(int i) {
            this.f13208b = i;
            return this;
        }

        public a y1(int i) {
            if (i == Integer.MAX_VALUE) {
                this.f = 0;
            } else {
                this.f = i;
            }
            return this;
        }

        public a z1(float f) {
            this.h = f;
            return this;
        }
    }

    public int getOnOffGroundRecordValue() {
        int i = ((this.impact & 63) << 26) + ((this.onGround & 8191) << 13) + (this.offGround & 8191);
        FitnessLogUtils.i("SportData", "impact=" + this.impact + ", onGround=" + this.onGround + ", value=" + i);
        return i;
    }

    public String toString() {
        return "SportData{startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalTime=" + this.totalTime + ", distance=" + this.distance + ", totalStep=" + this.totalStep + ", dataCount=" + this.dataCount + ", timeStamp=" + this.timeStamp + ", addDis=" + ((int) this.addDis) + ", currentCal=" + this.currentCal + ", currentSteps=" + this.currentSteps + ", distanceInfo=" + ((int) this.distanceInfo) + ", cal=" + ((int) this.cal) + ", kmCount=" + this.kmCount + ", maxStepRate = " + ((int) this.maxStepRate) + ", impact=" + this.impact + ", onGround=" + this.onGround + ", offGround=" + this.offGround + ", fullFootDurBySecond=" + this.fullFootDurBySecond + ", foreFootDurBySecond=" + this.foreFootDurBySecond + ", hindFootDurBySecond=" + this.hindFootDurBySecond + ", degree=" + ((int) this.degree) + ", avgPace=" + this.avgPace + ", maxPace=" + this.maxPace + ", avgSpeed=" + this.avgSpeed + ", maxSpeed=" + this.maxSpeed + ", avgFrequency=" + this.avgFrequency + ", maxFrequency=" + this.maxFrequency + ", avgStried=" + this.avgStried + ", mainRunStyle=" + this.mainRunStyle + ", forefootRatio=" + this.forefootRatio + ", heelRatio=" + this.heelRatio + ", avgImpact=" + this.avgImpact + ", maxImpact=" + this.maxImpact + ", avgOnGround=" + this.avgOnGround + ", minOnGround=" + this.minOnGround + ", avgOffGround=" + this.avgOffGround + ", maxOffGround=" + this.maxOffGround + ", avgOnOffRatio=" + this.avgOnOffRatio + ", minOnOffRatio=" + this.minOnOffRatio + ", onOffRatio=" + this.onOffRatio + ", curPace=" + this.currentPace + ", curSpeed=" + this.currentSpeed + ", totalPunches=" + ((int) this.totalPunches) + ", perfect=" + ((int) this.perfect) + ", maxHr=" + ((int) this.maxHrRate) + ", good=" + ((int) this.good) + ", miss=" + ((int) this.miss) + ", maxPushStrength=" + this.maxPushStrength + ", maxHit=" + ((int) this.maxHit) + ", hitRate=" + ((int) this.hitRate) + ", planId=" + this.planId + ", courseId=" + this.courseId + ", avgVerticalStrideRatio=" + this.avgVerticalStrideRatio + ", minVerticalStrideRatio=" + this.minVerticalStrideRatio + ", maxVerticalStrideRatio=" + this.maxVerticalStrideRatio + ", avgVerticalAmplitude=" + this.avgVerticalAmplitude + ", minVerticalAmplitude=" + this.minVerticalAmplitude + ", maxVerticalAmplitude=" + this.maxVerticalAmplitude + ", fastestSpeed=" + this.fastestSpeed + ", fastestPace=" + this.fastestPace + AbstractJsonLexerKt.END_OBJ;
    }

    private SportData(a aVar) {
        this.startTime = aVar.f13207a;
        this.endTime = aVar.f13208b;
        this.totalTime = aVar.c;
        this.distance = aVar.d;
        this.cal = aVar.e;
        this.fastestPace = aVar.f;
        this.slowestPace = aVar.g;
        this.fastestSpeed = aVar.h;
        this.totalStep = aVar.i;
        this.maxStepRate = aVar.j;
        this.aveHrRate = aVar.f13209k;
        this.maxHrRate = aVar.l;
        this.minHrRate = aVar.m;
        this.rise = aVar.n;
        this.drop = aVar.o;
        this.aveHeight = aVar.p;
        this.maxHeight = aVar.q;
        this.minHeight = aVar.f13210r;
        this.exercise = aVar.s;
        this.maxO = aVar.t;
        this.expend = aVar.u;
        this.recovery = aVar.v;
        this.hrLimit = aVar.w;
        this.hrAnaerobic = aVar.x;
        this.hrAerobic = aVar.y;
        this.hrFat = aVar.z;
        this.hrWarm = aVar.A;
        this.altitude = aVar.C;
        this.timeStamp = aVar.D;
        this.calAndStep = aVar.E;
        this.hrRate = aVar.F;
        this.distanceInfo = aVar.G;
        this.addDis = aVar.H;
        this.currentCal = aVar.I;
        this.currentSteps = aVar.J;
        this.timezone = aVar.K;
        this.recordStepValid = aVar.B0;
        this.stepRate = aVar.B;
        this.degree = aVar.L;
        this.totalPunches = aVar.N;
        this.perfect = aVar.O;
        this.good = aVar.P;
        this.miss = aVar.Q;
        this.maxPushStrength = aVar.R;
        this.maxHit = aVar.S;
        this.hitRate = aVar.T;
        this.courseId = aVar.V;
        this.revolutionCount = aVar.W;
        this.impact = aVar.X;
        this.onGround = aVar.Y;
        this.offGround = aVar.Z;
        this.fullFootDurBySecond = aVar.a0;
        this.foreFootDurBySecond = aVar.b0;
        this.hindFootDurBySecond = aVar.c0;
        this.stride = aVar.d0;
        this.onOffRatio = aVar.w0;
        this.currentPace = aVar.x0;
        this.currentSpeed = aVar.y0;
        this.avgPace = aVar.e0;
        this.maxPace = aVar.f0;
        this.avgSpeed = aVar.g0;
        this.maxSpeed = aVar.h0;
        this.avgFrequency = aVar.i0;
        this.maxFrequency = aVar.j0;
        this.avgStried = aVar.k0;
        this.mainRunStyle = aVar.l0;
        this.forefootRatio = aVar.m0;
        this.heelRatio = aVar.n0;
        this.avgImpact = aVar.o0;
        this.maxImpact = aVar.p0;
        this.avgOnGround = aVar.q0;
        this.minOnGround = aVar.r0;
        this.avgOffGround = aVar.s0;
        this.maxOffGround = aVar.t0;
        this.avgOnOffRatio = aVar.u0;
        this.minOnOffRatio = aVar.v0;
        this.isHasDegree = aVar.M;
        this.planId = aVar.I0;
        this.sportCourse = aVar.U;
        this.verticalAmplitude = aVar.z0;
        this.verticalStrideRatio = aVar.A0;
        this.avgVerticalStrideRatio = aVar.C0;
        this.minVerticalStrideRatio = aVar.D0;
        this.maxVerticalStrideRatio = aVar.E0;
        this.avgVerticalAmplitude = aVar.F0;
        this.minVerticalAmplitude = aVar.G0;
        this.maxVerticalAmplitude = aVar.H0;
    }
}
