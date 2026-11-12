package im;

import am.z0;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.chartingv2.data.Entry;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.joda.time.DateTime;
import ps.i1;
import ps.o0;
import ps.r1;
import ps.w0;
import ps.x0;

/* JADX INFO: loaded from: classes7.dex */
public class b implements Parcelable, zm.p {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public int A;
    public int B;
    public DateTime C;
    public DateTime D;
    public ArrayList E;
    public ArrayList F;
    public int H0;
    public com.garmin.android.apps.connectmobile.activities.newmodel.o I;
    public double I0;
    public boolean J0;
    public final boolean K0;
    public int L0;
    public HashMap<Double, Double> M0;
    public ArrayList N0;
    public ArrayList O0;
    public ArrayList P;
    public List<Long> P0;
    public ArrayList Q0;
    public int R0;
    public int S0;
    public ArrayList T;
    public List<String> T0;
    public ps.o U0;
    public i1 V0;
    public double W0;
    public n X;
    public String Y;
    public int[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f94112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f94113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f94114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f94115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f94116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f94117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fz.c f94118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f94119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f94120k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public double f94121k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<o20.a> f94122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f94123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f94124n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f94125o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f94126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f94127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f94128r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f94129t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f94130v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d0 f94131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d0 f94132x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f94133y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public rm.a f94134z;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Parcel parcel) {
        this.f94111b = 1;
        this.X = n.SEATED_STANDING;
        this.Z = new int[]{255, 0, 0};
        this.f94121k0 = 1.0d;
        o(parcel.readInt());
        this.f94112c = parcel.readString();
        this.f94114e = parcel.readString();
        this.f94115f = parcel.readString();
        this.f94116g = parcel.readString();
        this.f94117h = parcel.readString();
        this.f94118i = fz.c.values()[parcel.readInt()];
        this.f94119j = parcel.readString();
        this.f94120k = parcel.readString();
        this.f94122l = parcel.createTypedArrayList(o20.a.CREATOR);
        parcel.readList(this.f94123m, Integer.class.getClassLoader());
        this.f94124n = parcel.readDouble();
        this.f94125o = parcel.readDouble();
        this.f94126p = parcel.readDouble();
        this.W0 = parcel.readDouble();
        this.f94127q = parcel.readDouble();
        this.f94128r = parcel.readDouble();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = (DateTime) parcel.readSerializable();
        this.D = (DateTime) parcel.readSerializable();
        this.E = new ArrayList();
        if (parcel.readInt() == 1) {
            parcel.readTypedList(this.E, r1.CREATOR);
        }
        this.F = new ArrayList();
        if (parcel.readInt() == 1) {
            parcel.readTypedList(this.E, r1.CREATOR);
        }
        this.Y = parcel.readString();
        this.f94113d = parcel.readString();
        this.I0 = parcel.readDouble();
        this.f94129t = parcel.readDouble();
        this.f94130v = parcel.readDouble();
        parcel.readIntArray(this.Z);
        this.f94121k0 = parcel.readDouble();
        this.H0 = parcel.readInt();
        this.f94110a = parcel.readInt();
        this.I = (com.garmin.android.apps.connectmobile.activities.newmodel.o) parcel.readParcelable(com.garmin.android.apps.connectmobile.activities.newmodel.o.class.getClassLoader());
        this.P = parcel.createTypedArrayList(o0.CREATOR);
        this.J0 = parcel.readInt() == 1;
        this.K0 = parcel.readInt() == 1;
        this.f94131w = (d0) parcel.readParcelable(d0.class.getClassLoader());
        this.f94132x = (d0) parcel.readParcelable(d0.class.getClassLoader());
        this.f94133y = parcel.readString();
        this.L0 = parcel.readInt();
        this.f94134z = (rm.a) parcel.readParcelable(rm.a.class.getClassLoader());
        this.M0 = (HashMap) parcel.readSerializable();
        this.T = new ArrayList();
        if (parcel.readInt() == 1) {
            parcel.readTypedList(this.T, x0.CREATOR);
        }
        parcel.readList(this.Q0, o20.a.class.getClassLoader());
        this.R0 = parcel.readInt();
        this.S0 = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.T0 = arrayList;
        parcel.readStringList(arrayList);
        this.U0 = (ps.o) parcel.readParcelable(ps.o.class.getClassLoader());
        this.V0 = (i1) parcel.readParcelable(i1.class.getClassLoader());
    }

    @Override // zm.p
    public d0 C3() {
        return this.f94132x;
    }

    @Override // zm.p
    public d0 D2() {
        return this.f94131w;
    }

    @Override // zm.p
    public int D3() {
        return 1;
    }

    @Override // zm.p
    public final String E1() {
        return this.f94120k;
    }

    @Override // zm.p
    public final double E2() {
        return this.W0;
    }

    @Override // zm.p
    public String F0() {
        return this.f94115f;
    }

    @Override // zm.p
    public double H0() {
        return this.f94125o;
    }

    @Override // zm.p
    public List<String> I2() {
        return this.T0;
    }

    @Override // zm.p
    public List<r1> K() {
        return this.E;
    }

    @Override // zm.p
    public int K0() {
        return this.f94110a;
    }

    @Override // zm.p
    public List<w0> K3() {
        return this.N0;
    }

    @Override // zm.p
    public void M2(ArrayList arrayList) {
        this.O0 = arrayList;
    }

    @Override // zm.p
    public List<r1> M3() {
        return this.F;
    }

    @Override // zm.p
    public String N() {
        return f(this.f94126p);
    }

    @Override // zm.p
    public int O1() {
        return (int) (this.f94121k0 * 255.0d);
    }

    @Override // zm.p
    public List<x0> O2() {
        return this.T;
    }

    @Override // zm.p
    public List<o20.a> P(int i14) {
        return this.f94122l;
    }

    @Override // zm.p
    public fz.c P1() {
        return this.f94118i;
    }

    @Override // zm.p
    public com.garmin.android.apps.connectmobile.activities.newmodel.o Q1() {
        return this.I;
    }

    @Override // zm.p
    @SuppressLint({"SwitchIntDef"})
    public double[] Q3(double d14, double d15, int i14, double d16, int i15) {
        if (i15 != 1) {
            if (i15 != 2 && i15 != 6) {
                if (i15 == 14) {
                    return new double[]{40.0d, 40.0d, 50.0d, 60.0d, 60.0d};
                }
                if (i15 == 33) {
                    double[] dArrA = c22.u.a(d14, d15);
                    return dArrA == null ? fz.a.a(d14, d15, i14, d16, true) : dArrA;
                }
                if (i15 != 50) {
                    if (i15 != 52 && i15 != 64) {
                        if (i15 != 87) {
                            if (i15 == 19) {
                                return new double[]{0.0d, 0.0d, 50.0d, 100.0d, 100.0d};
                            }
                            if (i15 == 20) {
                                return fz.a.a(d14, d15, i14, d16, true);
                            }
                            switch (i15) {
                                case 67:
                                case 68:
                                    break;
                                case 69:
                                    break;
                                default:
                                    return fz.a.a(d14, d15, i14, zm.k.b(d16, i15), false);
                            }
                        }
                    }
                }
                return fz.a.b(i14, d15, d14, d16);
            }
            return fz.a.a(d14, d15, i14, 0.0d, true);
        }
        return fz.a.b(i14, d15, d14, 0.0d);
    }

    @Override // zm.p
    public List<sm.b> R() {
        return this.O0;
    }

    @Override // zm.p
    public String U() {
        return this.Y;
    }

    @Override // zm.p
    public boolean U2() {
        ArrayList arrayList = this.f94123m;
        return (arrayList == null || arrayList.isEmpty() || this.f94123m.size() != this.f94122l.size()) ? false : true;
    }

    @Override // zm.p
    public rm.a U3() {
        return this.f94134z;
    }

    @Override // zm.p
    public double V() {
        return this.f94127q;
    }

    @Override // zm.p
    public boolean W() {
        return this.J0;
    }

    @Override // zm.p
    public String W0() {
        return this.f94112c;
    }

    @Override // zm.p
    public final i1 W3() {
        return this.V0;
    }

    @Override // zm.p
    public double Y() {
        return this.f94130v;
    }

    @Override // zm.p
    public km.a Y0() {
        return null;
    }

    @Override // zm.p
    public final List<Long> Y2() {
        return this.P0;
    }

    @Override // zm.p
    public int Y3() {
        int[] iArr = this.Z;
        if (iArr == null || iArr.length != 3) {
            return 0;
        }
        return Color.rgb(iArr[0], iArr[1], iArr[2]);
    }

    public final void b(o20.a aVar) {
        this.f94122l.add(aVar);
    }

    public int d() {
        return this.R0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // zm.p
    public String e4() {
        return f(this.f94124n);
    }

    @SuppressLint({"SwitchIntDef"})
    public final String f(double d14) {
        if (Double.isNaN(d14)) {
            return null;
        }
        int iG1 = g1();
        if (iG1 != 0) {
            if (iG1 != 1) {
                if (iG1 != 2) {
                    if (iG1 != 9) {
                        if (iG1 != 13) {
                            if (iG1 != 36) {
                                if (iG1 != 50 && iG1 != 52) {
                                    if (iG1 != 61 && iG1 != 15) {
                                        if (iG1 != 16) {
                                            if (iG1 != 63) {
                                                if (iG1 != 64) {
                                                    if (iG1 != 86) {
                                                        if (iG1 != 87) {
                                                            switch (iG1) {
                                                                case 67:
                                                                case 68:
                                                                case 69:
                                                                    break;
                                                                default:
                                                                    return new DecimalFormat("0").format(Math.round(d14));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return new DecimalFormat("0.00").format(d14);
                }
                return (z0.o(this.Y) || z0.x(this.Y)) ? new DecimalFormat("#,###,##0.#").format(Math.round(d14)) : new DecimalFormat("0").format(Math.round(d14));
            }
            return new mm.b().format(d14);
        }
        return new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(d14);
    }

    @Override // zm.p
    public double[] f1(int i14, double d14, double d15, double d16) {
        return Q3(d14, d15, i14, d16, this.f94111b);
    }

    @Override // zm.p
    public final void f2(ArrayList arrayList) {
        this.P0 = arrayList;
    }

    public int g() {
        return this.S0;
    }

    @Override // zm.p
    public int g1() {
        return this.f94111b;
    }

    @Override // zm.p
    public final List<o20.a> getDistanceList() {
        return this.Q0;
    }

    @Override // zm.p
    public DateTime getStartDate() {
        return this.C;
    }

    @Override // zm.p
    public double getTotalDuration() {
        return this.I0;
    }

    public void h(double d14) {
        this.f94126p = d14;
    }

    @Override // zm.p
    public String h3() {
        return this.f94133y;
    }

    @Override // zm.p
    public double h4() {
        return this.f94126p;
    }

    public void i(String str) {
        this.f94116g = str;
    }

    @Override // zm.p
    public String i3() {
        return f(this.f94127q);
    }

    public void j(int i14) {
        this.L0 = i14;
    }

    public final void k(List<o20.a> list) {
        this.f94122l = list;
        this.f94123m = new ArrayList();
    }

    @Override // zm.p
    public final String k4() {
        return this.f94113d;
    }

    @Override // zm.p
    public int l0(int i14) {
        return im.a.b(this.f94111b);
    }

    public void m(String str) {
        this.f94112c = str;
    }

    @Override // zm.p
    public final ps.o m0() {
        return this.U0;
    }

    @Override // zm.p
    public HashMap<Double, Double> m2() {
        return this.M0;
    }

    @Override // zm.p
    public List<Integer> n1() {
        return this.f94123m;
    }

    @Override // zm.p
    public double n4() {
        return this.f94124n;
    }

    public void o(int i14) {
        this.f94111b = i14;
    }

    @Override // zm.p
    public String o2() {
        return this.f94119j;
    }

    @Override // zm.p
    public void p1(String str) {
        this.Y = str;
    }

    public void q(String str) {
        this.f94119j = str;
    }

    public void r(rm.a aVar) {
        ArrayList<Entry> arrayList;
        this.f94134z = aVar;
        if (aVar == null || (arrayList = aVar.f153487a) == null) {
            return;
        }
        for (Entry entry : arrayList) {
            if (this.f94122l == null) {
                this.f94122l = new ArrayList();
            }
            this.f94122l.add(new o20.a(entry.getXIndex(), entry.getVal()));
        }
    }

    public void s(List<x0> list) {
        if (this.T == null) {
            this.T = new ArrayList();
        }
        this.T.clear();
        if (list != null) {
            this.T.addAll(list);
        }
    }

    @Override // zm.p
    public double s0() {
        return this.f94129t;
    }

    public void t(double d14) {
        this.f94127q = d14;
    }

    @Override // zm.p
    public int t2() {
        return this.H0;
    }

    public void u(double d14) {
        this.f94124n = d14;
    }

    @Override // zm.p
    public void v2(DateTime dateTime) {
        this.C = dateTime;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f94111b);
        parcel.writeString(this.f94112c);
        parcel.writeString(this.f94114e);
        parcel.writeString(this.f94115f);
        parcel.writeString(this.f94116g);
        parcel.writeString(this.f94117h);
        parcel.writeInt(this.f94118i.ordinal());
        parcel.writeString(this.f94119j);
        parcel.writeString(this.f94120k);
        parcel.writeTypedList(this.f94122l);
        parcel.writeList(this.f94123m);
        parcel.writeDouble(this.f94124n);
        parcel.writeDouble(this.f94125o);
        parcel.writeDouble(this.f94126p);
        parcel.writeDouble(this.W0);
        parcel.writeDouble(this.f94127q);
        parcel.writeDouble(this.f94128r);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeTypedList(this.E);
        parcel.writeTypedList(this.F);
        parcel.writeString(this.Y);
        parcel.writeString(this.f94113d);
        parcel.writeDouble(this.I0);
        parcel.writeDouble(this.f94129t);
        parcel.writeDouble(this.f94130v);
        parcel.writeIntArray(this.Z);
        parcel.writeDouble(this.f94121k0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.f94110a);
        parcel.writeParcelable(this.I, i14);
        parcel.writeTypedList(this.P);
        parcel.writeInt(this.J0 ? 1 : 0);
        parcel.writeInt(this.K0 ? 1 : 0);
        parcel.writeParcelable(this.f94131w, i14);
        parcel.writeParcelable(this.f94132x, i14);
        parcel.writeString(this.f94133y);
        parcel.writeInt(this.L0);
        parcel.writeParcelable(this.f94134z, i14);
        parcel.writeSerializable(this.M0);
        if (this.T != null) {
            parcel.writeInt(1);
            parcel.writeTypedList(this.T);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeList(this.Q0);
        parcel.writeInt(this.R0);
        parcel.writeInt(this.S0);
        parcel.writeStringList(this.T0);
        parcel.writeParcelable(this.U0, i14);
        parcel.writeParcelable(this.V0, i14);
    }

    @Override // zm.p
    public String x2() {
        return this.f94116g;
    }

    public void y(List<r1> list) {
        if (this.F == null) {
            this.F = new ArrayList();
        }
        this.F.clear();
        if (list != null) {
            this.F.addAll(list);
        }
    }

    public void z(List<r1> list) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.clear();
        if (list != null) {
            this.E.addAll(list);
        }
    }

    public b(int i14) {
        this(i14, 0);
    }

    public b(int i14, int i15) {
        this.f94111b = 1;
        this.X = n.SEATED_STANDING;
        this.Z = new int[]{255, 0, 0};
        this.f94121k0 = 1.0d;
        o(i14);
        this.f94112c = null;
        this.f94114e = null;
        this.f94115f = null;
        this.f94116g = null;
        this.f94117h = null;
        this.f94118i = fz.c.TIME;
        this.f94119j = null;
        this.f94120k = null;
        this.f94122l = new ArrayList();
        this.f94123m = new ArrayList();
        this.f94124n = Double.MAX_VALUE;
        this.f94125o = Double.MIN_VALUE;
        this.f94126p = Double.MIN_VALUE;
        this.W0 = 1.0d;
        this.f94127q = Double.MAX_VALUE;
        this.f94128r = Double.MIN_VALUE;
        this.f94129t = Double.MIN_VALUE;
        this.f94130v = Double.MIN_VALUE;
        this.H0 = i15;
        this.f94110a = -1;
        this.I = null;
        this.f94131w = null;
        this.f94132x = null;
        this.f94133y = null;
        this.f94134z = null;
        this.T = new ArrayList();
        this.O0 = new ArrayList();
        this.Q0 = new ArrayList();
        this.R0 = 0;
        this.S0 = 0;
        this.T0 = null;
        this.U0 = null;
        this.V0 = null;
    }

    public b() {
        this(1);
    }
}
