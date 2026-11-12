package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import org.joda.time.DateTimeZone;
import org.json.JSONException;
import org.json.JSONObject;
import ps.z1;

/* JADX INFO: loaded from: classes7.dex */
public class i0 extends s1 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new a();
    public double A;
    public double A1;
    public double A2;
    public double B;
    public double B1;
    public double B2;
    public double C;
    public double C1;
    public double C2;
    public double D;
    public double D1;
    public double D2;
    public double E;
    public double E1;
    public int E2;
    public double F;
    public double F1;
    public int F2;
    public double G1;
    public int G2;
    public double H0;
    public double H1;
    public int H2;
    public double I;
    public double I0;
    public double I1;
    public int I2;
    public double J0;
    public double J1;
    public int J2;
    public double K0;
    public double K1;
    public int K2;
    public double L0;
    public double L1;
    public double L2;
    public double M0;
    public double M1;
    public double M2;
    public double N0;
    public double N1;
    public double N2;
    public double O0;
    public double O1;
    public double O2;
    public double P;
    public double P0;
    public double P1;
    public double P2;
    public double Q0;
    public double Q1;
    public double Q2;
    public double R0;
    public double R1;
    public double R2;
    public double S0;
    public double S1;
    public double S2;
    public double T;
    public double T0;
    public double T1;
    public double T2;
    public double U0;
    public double U1;
    public double U2;
    public double V0;
    public double V1;
    public final Boolean V2;
    public double W0;
    public double W1;
    public int W2;
    public double X;
    public double X0;
    public double X1;
    public double X2;
    public double Y;
    public double Y0;
    public double Y1;
    public int Y2;
    public double Z;
    public String Z0;
    public double Z1;
    public double Z2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29484a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f29485a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public double f29486a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public double f29487a3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29488b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f29489b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public double f29490b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public double f29491b3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29492c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public double f29493c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public Boolean f29494c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public double f29495c3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f29496d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public double f29497d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public double f29498d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public String f29499d3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f29500e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public double f29501e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public double f29502e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public int f29503e3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f29504f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public double f29505f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public double f29506f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public double f29507f3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f29508g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public z1 f29509g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public double f29510g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public double f29511g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f29512h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public double f29513h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public double f29514h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public double f29515h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f29516i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public double f29517i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public double f29518i2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f29519j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public double f29520j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public double f29521j2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f29522k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public double f29523k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public double f29524k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public double f29525k2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f29526l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public double f29527l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public double f29528l2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f29529m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public double f29530m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public double f29531m2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f29532n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public double f29533n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public double f29534n2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f29535o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public double f29536o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public double f29537o2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f29538p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public double f29539p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public double f29540p2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f29541q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public double f29542q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public int f29543q2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f29544r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public double f29545r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public double f29546r2;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public double f29547s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public double f29548s2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f29549t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public double f29550t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public double f29551t2;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public double f29552u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public double f29553u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f29554v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public double f29555v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public double f29556v2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f29557w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public double f29558w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public double f29559w2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f29560x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public double f29561x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public double f29562x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f29563y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public double f29564y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public double f29565y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public double f29566z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public double f29567z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public double f29568z2;

    public class a implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        public final i0 createFromParcel(Parcel parcel) {
            return new i0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i0[] newArray(int i14) {
            return new i0[i14];
        }
    }

    public i0(Parcel parcel) {
        this.f29496d = Double.NaN;
        this.f29500e = Double.NaN;
        this.f29504f = Double.NaN;
        this.f29508g = Double.NaN;
        this.f29549t = Double.NaN;
        this.f29554v = Double.NaN;
        this.X0 = Double.NaN;
        this.Y0 = Double.NaN;
        this.T1 = Double.NaN;
        this.U1 = Double.NaN;
        this.f29514h2 = Double.NaN;
        this.f29556v2 = Double.NaN;
        this.G2 = -1;
        this.H2 = -1;
        this.I2 = -1;
        this.J2 = -1;
        this.K2 = -1;
        this.L2 = Double.NaN;
        this.M2 = Double.NaN;
        this.N2 = Double.NaN;
        this.O2 = Double.NaN;
        this.P2 = Double.NaN;
        this.Q2 = Double.NaN;
        this.R2 = Double.NaN;
        this.S2 = Double.NaN;
        this.T2 = Double.NaN;
        this.V2 = Boolean.FALSE;
        this.W2 = -1;
        this.X2 = Double.NaN;
        this.Y2 = -1;
        this.Z2 = Double.NaN;
        this.f29487a3 = Double.NaN;
        this.f29491b3 = Double.NaN;
        this.f29495c3 = Double.NaN;
        this.f29503e3 = -1;
        this.f29507f3 = Double.NaN;
        this.f29511g3 = Double.NaN;
        this.f29515h3 = Double.NaN;
        this.f29484a = parcel.readString();
        this.f29488b = parcel.readString();
        this.f29492c = parcel.readLong();
        this.f29496d = parcel.readDouble();
        this.f29500e = parcel.readDouble();
        this.f29504f = parcel.readDouble();
        this.f29508g = parcel.readDouble();
        this.f29512h = parcel.readDouble();
        this.f29516i = parcel.readDouble();
        this.f29519j = parcel.readDouble();
        this.f29522k = parcel.readDouble();
        this.f29526l = parcel.readDouble();
        this.f29529m = parcel.readDouble();
        this.f29532n = parcel.readDouble();
        this.f29535o = parcel.readDouble();
        this.f29538p = parcel.readDouble();
        this.f29541q = parcel.readDouble();
        this.f29544r = parcel.readDouble();
        this.f29549t = parcel.readDouble();
        this.f29554v = parcel.readDouble();
        this.f29560x = parcel.readDouble();
        this.f29563y = parcel.readDouble();
        this.f29566z = parcel.readDouble();
        this.A = parcel.readDouble();
        this.B = parcel.readDouble();
        this.C = parcel.readDouble();
        this.D = parcel.readDouble();
        this.E = parcel.readDouble();
        this.F = parcel.readDouble();
        this.I = parcel.readDouble();
        this.P = parcel.readDouble();
        this.T = parcel.readDouble();
        this.X = parcel.readDouble();
        this.Y = parcel.readDouble();
        this.Z = parcel.readDouble();
        this.f29523k0 = parcel.readDouble();
        this.H0 = parcel.readDouble();
        this.I0 = parcel.readDouble();
        this.J0 = parcel.readDouble();
        this.K0 = parcel.readDouble();
        this.L0 = parcel.readDouble();
        this.M0 = parcel.readDouble();
        this.N0 = parcel.readDouble();
        this.O0 = parcel.readDouble();
        this.P0 = parcel.readDouble();
        this.Q0 = parcel.readDouble();
        this.R0 = parcel.readDouble();
        this.S0 = parcel.readDouble();
        this.T0 = parcel.readDouble();
        this.U0 = parcel.readDouble();
        this.V0 = parcel.readDouble();
        this.W0 = parcel.readDouble();
        this.X0 = parcel.readDouble();
        this.Y0 = parcel.readDouble();
        this.f29489b1 = parcel.readString();
        this.f29485a1 = parcel.readString();
        this.f29493c1 = parcel.readDouble();
        this.f29497d1 = parcel.readDouble();
        this.f29501e1 = parcel.readDouble();
        this.f29505f1 = parcel.readDouble();
        this.f29509g1 = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.f29513h1 = parcel.readDouble();
        this.f29517i1 = parcel.readDouble();
        this.f29520j1 = parcel.readDouble();
        this.f29524k1 = parcel.readDouble();
        this.f29527l1 = parcel.readDouble();
        this.f29530m1 = parcel.readDouble();
        this.f29533n1 = parcel.readDouble();
        this.f29536o1 = parcel.readDouble();
        this.f29539p1 = parcel.readDouble();
        this.f29542q1 = parcel.readDouble();
        this.f29545r1 = parcel.readDouble();
        this.f29547s1 = parcel.readDouble();
        this.f29550t1 = parcel.readDouble();
        this.f29552u1 = parcel.readDouble();
        this.f29555v1 = parcel.readDouble();
        this.f29558w1 = parcel.readDouble();
        this.f29561x1 = parcel.readDouble();
        this.f29564y1 = parcel.readDouble();
        this.f29567z1 = parcel.readDouble();
        this.A1 = parcel.readDouble();
        this.B1 = parcel.readDouble();
        this.C1 = parcel.readDouble();
        this.D1 = parcel.readDouble();
        this.E1 = parcel.readDouble();
        this.F1 = parcel.readDouble();
        this.G1 = parcel.readDouble();
        this.H1 = parcel.readDouble();
        this.I1 = parcel.readDouble();
        this.J1 = parcel.readDouble();
        this.K1 = parcel.readDouble();
        this.L1 = parcel.readDouble();
        this.M1 = parcel.readDouble();
        this.N1 = parcel.readDouble();
        this.O1 = parcel.readDouble();
        this.P1 = parcel.readDouble();
        this.Q1 = parcel.readDouble();
        this.R1 = parcel.readDouble();
        this.S1 = parcel.readDouble();
        this.T1 = parcel.readDouble();
        this.U1 = parcel.readDouble();
        this.V1 = parcel.readDouble();
        this.W1 = parcel.readDouble();
        this.X1 = parcel.readDouble();
        this.Y1 = parcel.readDouble();
        this.Z1 = parcel.readDouble();
        this.f29486a2 = parcel.readDouble();
        this.f29490b2 = parcel.readDouble();
        this.f29494c2 = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.f29502e2 = parcel.readDouble();
        this.f29498d2 = parcel.readDouble();
        this.f29506f2 = parcel.readDouble();
        this.f29510g2 = parcel.readDouble();
        this.f29514h2 = parcel.readDouble();
        this.f29518i2 = parcel.readDouble();
        this.f29521j2 = parcel.readDouble();
        this.f29525k2 = parcel.readDouble();
        this.f29528l2 = parcel.readDouble();
        this.f29531m2 = parcel.readDouble();
        this.f29534n2 = parcel.readDouble();
        this.f29537o2 = parcel.readDouble();
        this.f29540p2 = parcel.readDouble();
        this.f29543q2 = parcel.readInt();
        this.f29546r2 = parcel.readDouble();
        this.f29548s2 = parcel.readDouble();
        this.f29551t2 = parcel.readDouble();
        this.f29553u2 = parcel.readDouble();
        this.f29556v2 = parcel.readDouble();
        this.f29559w2 = parcel.readDouble();
        this.f29562x2 = parcel.readDouble();
        this.Z0 = parcel.readString();
        this.f29565y2 = parcel.readDouble();
        this.f29568z2 = parcel.readDouble();
        this.A2 = parcel.readDouble();
        this.B2 = parcel.readDouble();
        this.C2 = parcel.readDouble();
        this.D2 = parcel.readDouble();
        this.E2 = parcel.readInt();
        this.F2 = parcel.readInt();
        this.G2 = parcel.readInt();
        this.H2 = parcel.readInt();
        this.I2 = parcel.readInt();
        this.J2 = parcel.readInt();
        this.K2 = parcel.readInt();
        this.L2 = parcel.readDouble();
        this.M2 = parcel.readDouble();
        this.N2 = parcel.readDouble();
        this.f29557w = parcel.readDouble();
        this.O2 = parcel.readDouble();
        this.P2 = parcel.readDouble();
        this.R2 = parcel.readDouble();
        this.Q2 = parcel.readDouble();
        this.S2 = parcel.readDouble();
        this.T2 = parcel.readDouble();
        this.U2 = parcel.readDouble();
        this.V2 = Boolean.valueOf(parcel.readByte() == 1);
        this.W2 = parcel.readInt();
        this.X2 = parcel.readDouble();
        this.Y2 = parcel.readInt();
        this.Z2 = parcel.readDouble();
        this.f29487a3 = parcel.readDouble();
        this.f29491b3 = parcel.readDouble();
        this.f29495c3 = parcel.readDouble();
        this.f29499d3 = parcel.readString();
        this.f29503e3 = parcel.readInt();
        this.f29507f3 = parcel.readDouble();
        this.f29511g3 = parcel.readDouble();
        this.f29515h3 = parcel.readDouble();
    }

    public static void C(JSONObject jSONObject, String str, double d14) throws JSONException {
        if (Double.isNaN(d14) || Double.compare(d14, 0.0d) == 0) {
            return;
        }
        if (d14 < 1.0d) {
            d14 = 1.0d;
        }
        jSONObject.put(str, d14);
    }

    public static i0 I(i0 i0Var) {
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0();
        i0Var2.D();
        return i0Var2;
    }

    public final void D() {
        this.f29512h = Double.NaN;
        this.f29516i = Double.NaN;
        this.f29522k = Double.NaN;
        this.f29526l = Double.NaN;
        this.f29529m = Double.NaN;
        this.f29544r = Double.NaN;
        this.f29549t = Double.NaN;
        this.f29557w = Double.NaN;
        this.f29554v = Double.NaN;
        this.f29560x = Double.NaN;
        this.f29563y = Double.NaN;
        this.f29566z = Double.NaN;
        this.A = Double.NaN;
        this.B = Double.NaN;
        this.C = Double.NaN;
        this.F = Double.NaN;
        this.I = Double.NaN;
        this.P = Double.NaN;
        this.T = Double.NaN;
        this.X = Double.NaN;
        this.Y = Double.NaN;
        this.f29501e1 = Double.NaN;
        this.f29505f1 = Double.NaN;
        this.R1 = Double.NaN;
        this.S1 = Double.NaN;
        this.V1 = Double.NaN;
        this.W1 = Double.NaN;
        this.X1 = Double.NaN;
        this.f29502e2 = Double.NaN;
        this.f29546r2 = Double.NaN;
        this.f29551t2 = Double.NaN;
        this.f29553u2 = Double.NaN;
        this.f29559w2 = Double.NaN;
        this.f29562x2 = Double.NaN;
        this.f29565y2 = Double.NaN;
        this.R2 = Double.NaN;
        this.U2 = Double.NaN;
        this.S2 = Double.NaN;
        this.f29495c3 = Double.NaN;
        this.T2 = Double.NaN;
    }

    public final double F() {
        return this.W1;
    }

    public final double G() {
        return this.f29565y2;
    }

    public final double H() {
        return this.f29495c3;
    }

    public final double M() {
        return this.X1;
    }

    public final void Z(double d14) {
        this.W1 = d14;
    }

    public final void a0(double d14) {
        this.f29565y2 = d14;
    }

    public final void c0(double d14) {
        this.X1 = d14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject e0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        s1.j(jSONObject, "startTimeLocal", this.f29484a);
        s1.j(jSONObject, "startTimeGMT", this.f29488b);
        s1.i(jSONObject, "startLatitude", this.f29496d);
        s1.i(jSONObject, "startLongitude", this.f29500e);
        s1.i(jSONObject, "endLatitude", this.f29504f);
        s1.i(jSONObject, "endLongitude", this.f29508g);
        s1.i(jSONObject, "distance", this.f29512h);
        s1.i(jSONObject, "duration", this.f29516i);
        s1.i(jSONObject, "movingDuration", this.f29519j);
        s1.i(jSONObject, "elapsedDuration", this.f29522k);
        s1.i(jSONObject, "poolLength", this.f29501e1);
        double d14 = this.f29505f1;
        if (d14 > 0.0d) {
            s1.i(jSONObject, "numberOfActiveLengths", d14);
        }
        s1.i(jSONObject, "calories", this.f29549t);
        s1.i(jSONObject, "caloriesConsumed", this.f29546r2);
        s1.i(jSONObject, "packWeightCalories", this.f29554v);
        s1.i(jSONObject, "bmrCalories", this.f29557w);
        s1.i(jSONObject, "waterEstimated", this.f29559w2);
        s1.i(jSONObject, "waterConsumed", this.f29562x2);
        s1.i(jSONObject, "averageTemperature", this.F);
        s1.i(jSONObject, "maxTemperature", this.I);
        s1.i(jSONObject, "minTemperature", this.P);
        s1.i(jSONObject, "elevationGain", this.f29526l);
        s1.i(jSONObject, "elevationLoss", this.f29529m);
        s1.i(jSONObject, "averageHR", this.f29560x);
        s1.i(jSONObject, "maxHR", this.f29563y);
        s1.i(jSONObject, "maxSpeed", this.f29544r);
        s1.i(jSONObject, "maxRespirationRate", this.f29551t2);
        s1.i(jSONObject, "avgRespirationRate", this.f29553u2);
        z1 z1Var = this.f29509g1;
        if (z1Var != null) {
            jSONObject.put("unitOfPoolLength", z1Var.i());
        }
        C(jSONObject, "averageRunCadence", this.f29566z);
        C(jSONObject, "maxRunCadence", this.A);
        C(jSONObject, "averageBikeCadence", this.B);
        C(jSONObject, "maxBikeCadence", this.C);
        s1.i(jSONObject, "averagePower", this.T);
        s1.i(jSONObject, "maxPower", this.X);
        s1.i(jSONObject, "maxPowerTwentyMinutes", this.Y);
        s1.i(jSONObject, "floorsClimbed", this.R1);
        s1.i(jSONObject, "floorsDescended", this.S1);
        s1.i(jSONObject, "avgVerticalSpeed", this.T1);
        s1.i(jSONObject, "maxVerticalSpeed", this.U1);
        s1.i(jSONObject, "maxDepth", this.V1);
        s1.i(jSONObject, "averageDepth", this.W1);
        s1.i(jSONObject, "surfaceInterval", this.X1);
        s1.i(jSONObject, "bottomTime", this.f29502e2);
        Boolean bool = this.f29494c2;
        if (bool != null) {
            jSONObject.put("isDecoDive", bool);
        }
        s1.i(jSONObject, "perceivedWorkoutEffort", this.f29514h2);
        s1.i(jSONObject, "minActivityLapDuration", this.f29565y2);
        int i14 = this.H2;
        if (i14 > -1) {
            jSONObject.put("directWorkoutFeel", i14);
        } else if (i14 == -2) {
            jSONObject.put("directWorkoutFeel", JSONObject.NULL);
        }
        int i15 = this.I2;
        if (i15 > -1) {
            jSONObject.put("directWorkoutRpe", i15);
        } else if (i15 == -2) {
            jSONObject.put("directWorkoutRpe", JSONObject.NULL);
        }
        s1.i(jSONObject, "avgGradeAdjustedSpeed", this.Q2);
        s1.i(jSONObject, "gainSolarActivityTime", this.R2);
        s1.i(jSONObject, "recoveryHeartRate", this.U2);
        s1.i(jSONObject, "avgWheelchairCadence", this.O2);
        s1.i(jSONObject, "maxWheelchairCadence", this.P2);
        s1.i(jSONObject, "differenceBodyBattery", this.S2);
        double d15 = this.f29495c3;
        Double dValueOf = Double.valueOf(d15);
        if (Double.isNaN(d15)) {
            jSONObject.put("beginPackWeight", JSONObject.NULL);
        } else {
            jSONObject.put("beginPackWeight", dValueOf);
        }
        s1.i(jSONObject, "impactLoad", this.T2);
        s1.i(jSONObject, "avgSpo2", this.f29507f3);
        s1.i(jSONObject, "maxSpo2", this.f29511g3);
        s1.i(jSONObject, "minSpo2", this.f29515h3);
        int i16 = this.W2;
        if (i16 > -1) {
            jSONObject.put("steps", i16);
        } else {
            jSONObject.put("steps", JSONObject.NULL);
        }
        s1.j(jSONObject, "maxPisteDifficulty", this.f29499d3);
        return jSONObject;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f29484a = s1.u(jSONObject, "startTimeLocal");
            String strU = s1.u(jSONObject, "startTimeGMT");
            this.f29488b = strU;
            this.f29492c = c22.j0.J(strU, DateTimeZone.UTC);
            this.f29496d = jSONObject.optDouble("startLatitude");
            this.f29500e = jSONObject.optDouble("startLongitude");
            this.f29504f = jSONObject.optDouble("endLatitude");
            this.f29508g = jSONObject.optDouble("endLongitude");
            this.f29512h = jSONObject.optDouble("distance");
            this.f29516i = jSONObject.optDouble("duration");
            this.f29519j = jSONObject.optDouble("movingDuration");
            this.f29522k = jSONObject.optDouble("elapsedDuration");
            this.f29526l = jSONObject.optDouble("elevationGain");
            this.f29529m = jSONObject.optDouble("elevationLoss");
            this.f29532n = jSONObject.optDouble("maxElevation");
            this.f29535o = jSONObject.optDouble("minElevation");
            this.f29538p = jSONObject.optDouble("averageSpeed");
            this.f29541q = jSONObject.optDouble("averageMovingSpeed");
            this.f29544r = jSONObject.optDouble("maxSpeed");
            this.f29549t = jSONObject.optDouble("calories");
            this.f29554v = jSONObject.optDouble("packWeightCalories");
            this.f29560x = jSONObject.optDouble("averageHR");
            this.f29563y = jSONObject.optDouble("maxHR");
            this.f29566z = jSONObject.optDouble("averageRunCadence");
            this.A = jSONObject.optDouble("maxRunCadence");
            this.B = jSONObject.optDouble("averageBikeCadence");
            this.C = jSONObject.optDouble("maxBikeCadence");
            this.D = jSONObject.optDouble("averageSwimCadence");
            this.E = jSONObject.optDouble("minSwimCadence");
            this.F = jSONObject.optDouble("averageTemperature");
            this.I = jSONObject.optDouble("maxTemperature");
            this.P = jSONObject.optDouble("minTemperature");
            this.T = jSONObject.optDouble("averagePower");
            this.X = jSONObject.optDouble("maxPower");
            this.Y = jSONObject.optDouble("maxPowerTwentyMinutes");
            this.Z = jSONObject.optDouble("minPower");
            this.f29523k0 = jSONObject.optDouble("normalizedPower");
            this.H0 = jSONObject.optDouble("functionalThresholdPower");
            this.I0 = jSONObject.optDouble("avgForce");
            this.J0 = jSONObject.optDouble("maxForce");
            this.K0 = jSONObject.optDouble("normalizedForce");
            this.L0 = jSONObject.optDouble("totalWork");
            this.M0 = jSONObject.optDouble("leftBalance");
            this.N0 = jSONObject.optDouble("rightBalance");
            this.O0 = jSONObject.optDouble("leftTorqueEffectiveness");
            this.P0 = jSONObject.optDouble("rightTorqueEffectiveness");
            this.Q0 = jSONObject.optDouble("leftPedalSmoothness");
            this.R0 = jSONObject.optDouble("rightPedalSmoothness");
            this.S0 = jSONObject.optDouble("groundContactTime");
            this.T0 = jSONObject.optDouble("stepSpeedLoss");
            this.U0 = jSONObject.optDouble("stepSpeedLossPercent");
            this.V0 = jSONObject.optDouble("strideLength");
            this.W0 = jSONObject.optDouble("verticalOscillation");
            this.X0 = jSONObject.optDouble("trainingEffect");
            this.Y0 = jSONObject.optDouble("anaerobicTrainingEffect");
            this.f29489b1 = s1.u(jSONObject, "aerobicTrainingEffectMessage");
            this.f29485a1 = s1.u(jSONObject, "anaerobicTrainingEffectMessage");
            this.f29493c1 = jSONObject.optDouble("trainingStressScore");
            this.f29497d1 = jSONObject.optDouble("intensityFactor");
            this.f29501e1 = jSONObject.optDouble("poolLength");
            this.f29505f1 = jSONObject.optDouble("numberOfActiveLengths");
            if (!jSONObject.isNull("unitOfPoolLength")) {
                this.f29509g1 = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("unitOfPoolLength").toString(), z1.class);
            }
            this.f29513h1 = jSONObject.optDouble("totalNumberOfStrokes");
            this.f29517i1 = jSONObject.optDouble("averageSWOLF");
            this.f29520j1 = jSONObject.optDouble("minSWOLF");
            this.f29524k1 = jSONObject.optDouble("averageEfficiency");
            this.f29527l1 = jSONObject.optDouble("minEfficiency");
            this.f29530m1 = jSONObject.optDouble("strokeDistance");
            this.f29533n1 = jSONObject.optDouble("strokeRate");
            this.f29536o1 = jSONObject.optDouble("maxStrokeRate");
            this.f29539p1 = jSONObject.optDouble("maxSwimCadence");
            this.f29542q1 = jSONObject.optDouble("averageStrokes");
            this.f29545r1 = jSONObject.optDouble("minimumStrokes");
            this.f29547s1 = jSONObject.optDouble("leftPowerPhaseStart");
            this.f29550t1 = jSONObject.optDouble("leftPowerPhaseEnd");
            this.f29552u1 = jSONObject.optDouble("leftPowerPhaseArcLength");
            this.f29555v1 = jSONObject.optDouble("leftPowerPhasePeakArcLength");
            this.f29558w1 = jSONObject.optDouble("leftPowerPhasePeakStart");
            this.f29561x1 = jSONObject.optDouble("leftPowerPhasePeakEnd");
            this.f29564y1 = jSONObject.optDouble("leftPlatformCenterOffset");
            this.f29567z1 = jSONObject.optDouble("rightPowerPhaseStart");
            this.A1 = jSONObject.optDouble("rightPowerPhaseEnd");
            this.B1 = jSONObject.optDouble("rightPowerPhaseArcLength");
            this.C1 = jSONObject.optDouble("rightPowerPhasePeakArcLength");
            this.D1 = jSONObject.optDouble("rightPowerPhasePeakStart");
            this.E1 = jSONObject.optDouble("rightPowerPhasePeakEnd");
            this.F1 = jSONObject.optDouble("rightPlatformCenterOffset");
            this.G1 = jSONObject.optDouble("maxSeatedPower");
            this.H1 = jSONObject.optDouble("averageSeatedPower");
            this.I1 = jSONObject.optDouble("seatedTime");
            this.J1 = jSONObject.optDouble("maxStandingPower");
            this.K1 = jSONObject.optDouble("averageStandingPower");
            this.L1 = jSONObject.optDouble("standingTime");
            this.M1 = jSONObject.optDouble("verticalRatio");
            this.N1 = jSONObject.optDouble("groundContactBalanceLeft");
            this.O1 = jSONObject.optDouble("averageStrokeCadence");
            this.P1 = jSONObject.optDouble("averageStrokeDistance");
            this.Q1 = jSONObject.optDouble("maxStrokeCadence");
            this.R1 = jSONObject.optDouble("floorsClimbed");
            this.S1 = jSONObject.optDouble("floorsDescended");
            this.T1 = jSONObject.optDouble("avgVerticalSpeed");
            this.U1 = jSONObject.optDouble("maxVerticalSpeed");
            this.V1 = jSONObject.optDouble("maxDepth");
            this.W1 = jSONObject.optDouble("averageDepth");
            this.X1 = jSONObject.optDouble("surfaceInterval");
            this.Y1 = jSONObject.optDouble("startCns");
            this.Z1 = jSONObject.optDouble("endCns");
            this.f29486a2 = jSONObject.optDouble("startN2");
            this.f29490b2 = jSONObject.optDouble("endN2");
            this.f29494c2 = Boolean.valueOf(jSONObject.optBoolean("isDecoDive"));
            this.f29502e2 = jSONObject.optDouble("bottomTime");
            this.f29498d2 = jSONObject.optDouble("maxBottomTime");
            this.f29506f2 = jSONObject.optDouble("avgCda");
            this.f29510g2 = jSONObject.optDouble("avgWattsPerCda");
            this.f29514h2 = jSONObject.optDouble("perceivedWorkoutEffort");
            this.f29518i2 = jSONObject.optDouble("avgAirSpeed");
            this.f29521j2 = jSONObject.optDouble("minAirSpeed");
            this.f29525k2 = jSONObject.optDouble("maxAirSpeed");
            this.f29528l2 = jSONObject.optDouble("avgWindYawAngle");
            this.f29531m2 = jSONObject.optDouble("flow");
            this.f29534n2 = jSONObject.optDouble("grit");
            this.f29537o2 = jSONObject.optDouble("avgFlow");
            this.f29540p2 = jSONObject.optDouble("avgGrit");
            this.f29543q2 = jSONObject.optInt("jumpCount");
            this.f29548s2 = jSONObject.optDouble("minRespirationRate");
            this.f29551t2 = jSONObject.optDouble("maxRespirationRate");
            this.f29553u2 = jSONObject.optDouble("avgRespirationRate");
            this.f29556v2 = jSONObject.optDouble("activityTrainingLoad");
            this.f29546r2 = jSONObject.optDouble("caloriesConsumed");
            this.f29559w2 = jSONObject.optDouble("waterEstimated");
            this.f29562x2 = jSONObject.optDouble("waterConsumed");
            this.Z0 = s1.u(jSONObject, "trainingEffectLabel");
            this.f29565y2 = jSONObject.optDouble("minActivityLapDuration");
            this.f29568z2 = jSONObject.optDouble("startStress");
            this.A2 = jSONObject.optDouble("endStress");
            this.B2 = jSONObject.optDouble("differenceStress");
            this.C2 = jSONObject.optDouble("avgStress");
            this.D2 = jSONObject.optDouble("maxStress");
            this.E2 = jSONObject.optInt("totalSets");
            this.F2 = jSONObject.optInt("activeSets");
            this.G2 = jSONObject.optInt("directWorkoutComplianceScore", -1);
            this.H2 = jSONObject.optInt("directWorkoutFeel", -1);
            this.I2 = jSONObject.optInt("directWorkoutRpe", -1);
            this.J2 = jSONObject.optInt("moderateIntensityMinutes", -1);
            this.K2 = jSONObject.optInt("vigorousIntensityMinutes", -1);
            this.L2 = jSONObject.optDouble("beginPotentialStamina");
            this.M2 = jSONObject.optDouble("endPotentialStamina");
            this.N2 = jSONObject.optDouble("minAvailableStamina");
            this.Q2 = jSONObject.optDouble("avgGradeAdjustedSpeed");
            this.f29557w = jSONObject.optDouble("bmrCalories");
            this.O2 = jSONObject.optDouble("avgWheelchairCadence");
            this.P2 = jSONObject.optDouble("maxWheelchairCadence");
            this.R2 = jSONObject.optDouble("gainSolarActivityTime");
            this.S2 = jSONObject.optDouble("differenceBodyBattery");
            this.T2 = jSONObject.optDouble("impactLoad");
            this.U2 = jSONObject.optDouble("recoveryHeartRate");
            this.W2 = jSONObject.optInt("steps", -1);
            this.X2 = jSONObject.optDouble("maxLapAvgRunCadence");
            this.Y2 = jSONObject.optInt("totalReps", -1);
            this.Z2 = jSONObject.optDouble("avgJumpRopeCadence", Double.NaN);
            this.f29487a3 = jSONObject.optDouble("maxJumpRopeCadence", Double.NaN);
            this.f29491b3 = jSONObject.optDouble("surfaceTypeUnpavedPercentage", Double.NaN);
            this.f29495c3 = jSONObject.optDouble("beginPackWeight", Double.NaN);
            this.f29499d3 = jSONObject.optString("maxPisteDifficulty");
            this.f29503e3 = jSONObject.optInt("diveCount", -1);
            this.f29507f3 = jSONObject.optDouble("avgSpo2", Double.NaN);
            this.f29511g3 = jSONObject.optDouble("maxSpo2", Double.NaN);
            this.f29515h3 = jSONObject.optDouble("minSpo2", Double.NaN);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f29484a);
        parcel.writeString(this.f29488b);
        parcel.writeLong(this.f29492c);
        parcel.writeDouble(this.f29496d);
        parcel.writeDouble(this.f29500e);
        parcel.writeDouble(this.f29504f);
        parcel.writeDouble(this.f29508g);
        parcel.writeDouble(this.f29512h);
        parcel.writeDouble(this.f29516i);
        parcel.writeDouble(this.f29519j);
        parcel.writeDouble(this.f29522k);
        parcel.writeDouble(this.f29526l);
        parcel.writeDouble(this.f29529m);
        parcel.writeDouble(this.f29532n);
        parcel.writeDouble(this.f29535o);
        parcel.writeDouble(this.f29538p);
        parcel.writeDouble(this.f29541q);
        parcel.writeDouble(this.f29544r);
        parcel.writeDouble(this.f29549t);
        parcel.writeDouble(this.f29554v);
        parcel.writeDouble(this.f29560x);
        parcel.writeDouble(this.f29563y);
        parcel.writeDouble(this.f29566z);
        parcel.writeDouble(this.A);
        parcel.writeDouble(this.B);
        parcel.writeDouble(this.C);
        parcel.writeDouble(this.D);
        parcel.writeDouble(this.E);
        parcel.writeDouble(this.F);
        parcel.writeDouble(this.I);
        parcel.writeDouble(this.P);
        parcel.writeDouble(this.T);
        parcel.writeDouble(this.X);
        parcel.writeDouble(this.Y);
        parcel.writeDouble(this.Z);
        parcel.writeDouble(this.f29523k0);
        parcel.writeDouble(this.H0);
        parcel.writeDouble(this.I0);
        parcel.writeDouble(this.J0);
        parcel.writeDouble(this.K0);
        parcel.writeDouble(this.L0);
        parcel.writeDouble(this.M0);
        parcel.writeDouble(this.N0);
        parcel.writeDouble(this.O0);
        parcel.writeDouble(this.P0);
        parcel.writeDouble(this.Q0);
        parcel.writeDouble(this.R0);
        parcel.writeDouble(this.S0);
        parcel.writeDouble(this.T0);
        parcel.writeDouble(this.U0);
        parcel.writeDouble(this.V0);
        parcel.writeDouble(this.W0);
        parcel.writeDouble(this.X0);
        parcel.writeDouble(this.Y0);
        parcel.writeString(this.f29489b1);
        parcel.writeString(this.f29485a1);
        parcel.writeDouble(this.f29493c1);
        parcel.writeDouble(this.f29497d1);
        parcel.writeDouble(this.f29501e1);
        parcel.writeDouble(this.f29505f1);
        parcel.writeParcelable(this.f29509g1, i14);
        parcel.writeDouble(this.f29513h1);
        parcel.writeDouble(this.f29517i1);
        parcel.writeDouble(this.f29520j1);
        parcel.writeDouble(this.f29524k1);
        parcel.writeDouble(this.f29527l1);
        parcel.writeDouble(this.f29530m1);
        parcel.writeDouble(this.f29533n1);
        parcel.writeDouble(this.f29536o1);
        parcel.writeDouble(this.f29539p1);
        parcel.writeDouble(this.f29542q1);
        parcel.writeDouble(this.f29545r1);
        parcel.writeDouble(this.f29547s1);
        parcel.writeDouble(this.f29550t1);
        parcel.writeDouble(this.f29552u1);
        parcel.writeDouble(this.f29555v1);
        parcel.writeDouble(this.f29558w1);
        parcel.writeDouble(this.f29561x1);
        parcel.writeDouble(this.f29564y1);
        parcel.writeDouble(this.f29567z1);
        parcel.writeDouble(this.A1);
        parcel.writeDouble(this.B1);
        parcel.writeDouble(this.C1);
        parcel.writeDouble(this.D1);
        parcel.writeDouble(this.E1);
        parcel.writeDouble(this.F1);
        parcel.writeDouble(this.G1);
        parcel.writeDouble(this.H1);
        parcel.writeDouble(this.I1);
        parcel.writeDouble(this.J1);
        parcel.writeDouble(this.K1);
        parcel.writeDouble(this.L1);
        parcel.writeDouble(this.M1);
        parcel.writeDouble(this.N1);
        parcel.writeDouble(this.O1);
        parcel.writeDouble(this.P1);
        parcel.writeDouble(this.Q1);
        parcel.writeDouble(this.R1);
        parcel.writeDouble(this.S1);
        parcel.writeDouble(this.T1);
        parcel.writeDouble(this.U1);
        parcel.writeDouble(this.V1);
        parcel.writeDouble(this.W1);
        parcel.writeDouble(this.X1);
        parcel.writeDouble(this.Y1);
        parcel.writeDouble(this.Z1);
        parcel.writeDouble(this.f29486a2);
        parcel.writeDouble(this.f29490b2);
        parcel.writeValue(this.f29494c2);
        parcel.writeDouble(this.f29502e2);
        parcel.writeDouble(this.f29498d2);
        parcel.writeDouble(this.f29506f2);
        parcel.writeDouble(this.f29510g2);
        parcel.writeDouble(this.f29514h2);
        parcel.writeDouble(this.f29518i2);
        parcel.writeDouble(this.f29521j2);
        parcel.writeDouble(this.f29525k2);
        parcel.writeDouble(this.f29528l2);
        parcel.writeDouble(this.f29531m2);
        parcel.writeDouble(this.f29534n2);
        parcel.writeDouble(this.f29537o2);
        parcel.writeDouble(this.f29540p2);
        parcel.writeInt(this.f29543q2);
        parcel.writeDouble(this.f29546r2);
        parcel.writeDouble(this.f29548s2);
        parcel.writeDouble(this.f29551t2);
        parcel.writeDouble(this.f29553u2);
        parcel.writeDouble(this.f29556v2);
        parcel.writeDouble(this.f29559w2);
        parcel.writeDouble(this.f29562x2);
        parcel.writeString(this.Z0);
        parcel.writeDouble(this.f29565y2);
        parcel.writeDouble(this.f29568z2);
        parcel.writeDouble(this.A2);
        parcel.writeDouble(this.B2);
        parcel.writeDouble(this.C2);
        parcel.writeDouble(this.D2);
        parcel.writeInt(this.E2);
        parcel.writeInt(this.F2);
        parcel.writeInt(this.G2);
        parcel.writeInt(this.H2);
        parcel.writeInt(this.I2);
        parcel.writeInt(this.J2);
        parcel.writeInt(this.K2);
        parcel.writeDouble(this.L2);
        parcel.writeDouble(this.M2);
        parcel.writeDouble(this.N2);
        parcel.writeDouble(this.f29557w);
        parcel.writeDouble(this.O2);
        parcel.writeDouble(this.P2);
        parcel.writeDouble(this.R2);
        parcel.writeDouble(this.Q2);
        parcel.writeDouble(this.S2);
        parcel.writeDouble(this.T2);
        parcel.writeDouble(this.U2);
        parcel.writeByte(this.V2.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.W2);
        parcel.writeDouble(this.X2);
        parcel.writeInt(this.Y2);
        parcel.writeDouble(this.Z2);
        parcel.writeDouble(this.f29487a3);
        parcel.writeDouble(this.f29491b3);
        parcel.writeDouble(this.f29495c3);
        parcel.writeString(this.f29499d3);
        parcel.writeInt(this.f29503e3);
        parcel.writeDouble(this.f29507f3);
        parcel.writeDouble(this.f29511g3);
        parcel.writeDouble(this.f29515h3);
    }

    public i0() {
        this.f29496d = Double.NaN;
        this.f29500e = Double.NaN;
        this.f29504f = Double.NaN;
        this.f29508g = Double.NaN;
        this.f29549t = Double.NaN;
        this.f29554v = Double.NaN;
        this.X0 = Double.NaN;
        this.Y0 = Double.NaN;
        this.T1 = Double.NaN;
        this.U1 = Double.NaN;
        this.f29514h2 = Double.NaN;
        this.f29556v2 = Double.NaN;
        this.G2 = -1;
        this.H2 = -1;
        this.I2 = -1;
        this.J2 = -1;
        this.K2 = -1;
        this.L2 = Double.NaN;
        this.M2 = Double.NaN;
        this.N2 = Double.NaN;
        this.O2 = Double.NaN;
        this.P2 = Double.NaN;
        this.Q2 = Double.NaN;
        this.R2 = Double.NaN;
        this.S2 = Double.NaN;
        this.T2 = Double.NaN;
        this.V2 = Boolean.FALSE;
        this.W2 = -1;
        this.X2 = Double.NaN;
        this.Y2 = -1;
        this.Z2 = Double.NaN;
        this.f29487a3 = Double.NaN;
        this.f29491b3 = Double.NaN;
        this.f29495c3 = Double.NaN;
        this.f29503e3 = -1;
        this.f29507f3 = Double.NaN;
        this.f29511g3 = Double.NaN;
        this.f29515h3 = Double.NaN;
    }
}
