package com.xiaomi.fitness.sport_eco_manager_export.data;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class SportData implements Serializable {
    public byte addDis;
    public boolean addToFile;
    public float altitude;
    public int appLaunchType;
    public float aveHeight;
    public byte aveHrRate;
    public long cacheTime;
    public short cal;
    public byte calAndStep;
    public int currentCal;
    public int currentSteps;
    public int dataCount;
    public int distance;
    public byte distanceInfo;
    public float drop;
    public int endTime;
    public float exercise;
    public byte expend;
    public int fastestPace;
    public int fastestSpeed;
    public int hrAerobic;
    public int hrAnaerobic;
    public int hrFat;
    public int hrLimit;
    public byte hrRate;
    public int hrWarm;
    public int kmCount;
    public float maxHeight;
    public byte maxHrRate;
    public byte maxO;
    public short maxStepRate;
    public float minHeight;
    public byte minHrRate;
    public boolean recordStepValid;
    public short recovery;
    public float rise;
    public int slowestPace;
    public int sportType;
    public int startTime;
    public int stepRate;
    public int timeStamp;
    public int timezone;
    public int totalStep;
    public int totalTime;

    public static class a {
        public int A;
        public int B;
        public float C;
        public int D;
        public byte E;
        public byte F;
        public byte G;
        public byte H;
        public int I;
        public int J;
        public int K;
        public boolean L = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13160b;
        public int c;
        public int d;
        public short e;
        public int f;
        public int g;
        public int h;
        public int i;
        public short j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte f13161k;
        public byte l;
        public byte m;
        public float n;
        public float o;
        public float p;
        public float q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f13162r;
        public float s;
        public byte t;
        public byte u;
        public short v;
        public int w;
        public int x;
        public int y;
        public int z;

        public SportData M() {
            return new SportData(this);
        }

        public a N(byte b2) {
            this.H = b2;
            return this;
        }

        public a O(float f) {
            this.C = f;
            return this;
        }

        public a P(float f) {
            this.p = f;
            return this;
        }

        public a Q(byte b2) {
            this.f13161k = b2;
            return this;
        }

        public a R(short s) {
            this.e = s;
            return this;
        }

        public a S(byte b2) {
            this.E = b2;
            return this;
        }

        public a T(int i) {
            this.I = i;
            return this;
        }

        public a U(int i) {
            this.J = i;
            return this;
        }

        public a V(int i) {
            this.d = i;
            return this;
        }

        public a W(byte b2) {
            this.G = b2;
            return this;
        }

        public a X(float f) {
            this.o = f;
            return this;
        }

        public a Y(int i) {
            this.f13160b = i;
            return this;
        }

        public a Z(int i) {
            this.f = i;
            return this;
        }

        public a a0(int i) {
            this.h = i;
            return this;
        }

        public a b0(int i) {
            this.y = i;
            return this;
        }

        public a c0(int i) {
            this.x = i;
            return this;
        }

        public a d0(int i) {
            this.z = i;
            return this;
        }

        public a e0(int i) {
            this.w = i;
            return this;
        }

        public a f0(byte b2) {
            this.F = b2;
            return this;
        }

        public a g0(int i) {
            this.A = i;
            return this;
        }

        public a h0(float f) {
            this.q = f;
            return this;
        }

        public a i0(byte b2) {
            this.l = b2;
            return this;
        }

        public a j0(short s) {
            this.j = s;
            return this;
        }

        public a k0(byte b2) {
            this.m = b2;
            return this;
        }

        public a l0(boolean z) {
            this.L = z;
            return this;
        }

        public a m0(float f) {
            this.n = f;
            return this;
        }

        public a n0(int i) {
            this.g = i;
            return this;
        }

        public a o0(int i) {
            this.f13159a = i;
            return this;
        }

        public a p0(int i) {
            this.B = i;
            return this;
        }

        public a q0(int i) {
            this.D = i;
            return this;
        }

        public a r0(int i) {
            this.K = i;
            return this;
        }

        public a s0(int i) {
            this.i = i;
            return this;
        }

        public a t0(int i) {
            this.c = i;
            return this;
        }
    }

    public String toString() {
        return "SportData{startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalTime=" + this.totalTime + ", distance=" + this.distance + ", totalStep=" + this.totalStep + ", dataCount=" + this.dataCount + ", timeStamp=" + this.timeStamp + ", addDis=" + ((int) this.addDis) + ", currentCal=" + this.currentCal + ", currentSteps=" + this.currentSteps + ", distanceInfo=" + ((int) this.distanceInfo) + ", cal=" + ((int) this.cal) + ", kmCount=" + this.kmCount + ", maxStepRate = " + ((int) this.maxStepRate) + AbstractJsonLexerKt.END_OBJ;
    }

    private SportData(a aVar) {
        this.startTime = aVar.f13159a;
        this.endTime = aVar.f13160b;
        this.totalTime = aVar.c;
        this.distance = aVar.d;
        this.cal = aVar.e;
        this.fastestPace = aVar.f;
        this.slowestPace = aVar.g;
        this.fastestSpeed = aVar.h;
        this.totalStep = aVar.i;
        this.maxStepRate = aVar.j;
        this.aveHrRate = aVar.f13161k;
        this.maxHrRate = aVar.l;
        this.minHrRate = aVar.m;
        this.rise = aVar.n;
        this.drop = aVar.o;
        this.aveHeight = aVar.p;
        this.maxHeight = aVar.q;
        this.minHeight = aVar.f13162r;
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
        this.recordStepValid = aVar.L;
        this.stepRate = aVar.B;
    }
}
