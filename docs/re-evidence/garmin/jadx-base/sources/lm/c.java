package lm;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.newmodel.o;
import com.garmin.android.gncs.NotificationConstants;
import im.b0;
import im.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import ps.o0;
import ps.r1;
import ps.w0;
import ps.x0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llm/c;", "Lim/b0;", "", NotificationConstants.KEY_DATA_MIME_TYPE, "Lkm/a;", "customization", "", "Lps/x1;", "splits", "<init>", "(ILkm/a;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c extends b0 {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final List<o0> A1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final int f113493c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final km.a f113494d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final List<x1> f113495e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final ArrayList f113496f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final LinkedHashMap f113497g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f113498h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public double f113499i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public String f113500j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public String f113501k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final j0 f113502l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public DateTime f113503m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public double f113504n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public ArrayList f113505o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final List<w0> f113506p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public o.b f113507q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final String f113508r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public double f113509s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public double f113510t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public String f113511u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public String f113512v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final String f113513w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public fz.c f113514x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public List<r1> f113515y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final List<r1> f113516z1;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = null;
            km.a aVarCreateFromParcel = parcel.readInt() == 0 ? null : km.a.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                int iD = 0;
                while (iD != i15) {
                    iD = u0.d(c.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new c(i14, aVarCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(int i14, km.a aVar, List<x1> list) {
        super(list == null ? j0.f134944a : list);
        this.f113493c1 = i14;
        this.f113494d1 = aVar;
        this.f113495e1 = list;
        this.f113496f1 = new ArrayList();
        this.f113497g1 = new LinkedHashMap();
        this.f113498h1 = i14;
        this.f113499i1 = -1.0d;
        this.f113500j1 = "";
        this.f113501k1 = "";
        j0 j0Var = j0.f134944a;
        this.f113502l1 = j0Var;
        this.f113503m1 = DateTime.now();
        this.f113506p1 = j0Var;
        this.f113508r1 = "";
        this.f113511u1 = "";
        this.f113512v1 = "";
        this.f113513w1 = "";
        this.f113514x1 = fz.c.TIME;
        this.f113515y1 = j0Var;
        this.f113516z1 = j0Var;
        this.A1 = j0Var;
    }

    public final void C(int i14, o20.a aVar) {
        Integer numValueOf = Integer.valueOf(i14);
        LinkedHashMap linkedHashMap = this.f113497g1;
        if (linkedHashMap.get(numValueOf) == null) {
            linkedHashMap.put(Integer.valueOf(i14), new ArrayList());
        }
        List list = (List) linkedHashMap.get(Integer.valueOf(i14));
        if (list != null) {
            list.add(aVar);
        }
    }

    @Override // im.b, zm.p
    public final d0 C3() {
        return null;
    }

    public final void D(int i14, List<? extends o20.a> list) {
        list.getClass();
        this.f113497g1.put(Integer.valueOf(i14), new ArrayList(list));
    }

    @Override // im.b, zm.p
    public final d0 D2() {
        return null;
    }

    @Override // im.b, zm.p
    public final int D3() {
        return this.f113497g1.keySet().size();
    }

    public final void F(List<Integer> list) {
        list.getClass();
        ArrayList arrayList = this.f113496f1;
        arrayList.clear();
        arrayList.addAll(list);
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final String getF113513w1() {
        return this.f113513w1;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final double getF113510t1() {
        return this.f113510t1;
    }

    @Override // im.b, zm.p
    public final List<String> I2() {
        return null;
    }

    @Override // im.b, zm.p
    public final List<r1> K() {
        return this.f113515y1;
    }

    @Override // im.b, zm.p
    public final int K0() {
        return 0;
    }

    @Override // im.b, zm.p
    public final List<w0> K3() {
        return this.f113506p1;
    }

    @Override // im.b, zm.p
    public final void M2(ArrayList arrayList) {
        this.f113505o1 = arrayList;
    }

    @Override // im.b, zm.p
    public final List<r1> M3() {
        return this.f113516z1;
    }

    @Override // im.b, zm.p
    public final String N() {
        return "";
    }

    @Override // im.b, zm.p
    public final int O1() {
        return 1;
    }

    @Override // im.b, zm.p
    public final List<x0> O2() {
        return null;
    }

    @Override // im.b, zm.p
    public final List<o20.a> P(int i14) {
        List<o20.a> list = (List) this.f113497g1.get(Integer.valueOf(i14));
        return list == null ? j0.f134944a : list;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: P1, reason: from getter */
    public final fz.c getF113514x1() {
        return this.f113514x1;
    }

    @Override // im.b, zm.p
    public final o Q1() {
        return this.f113507q1;
    }

    @Override // im.b, zm.p
    public final double[] Q3(double d14, double d15, int i14, double d16, int i15) {
        if (i15 == 28) {
            return fz.a.a(-0.5d, 2.5d, 4, 0.0d, true);
        }
        if (i15 == 54) {
            return fz.a.a(0.0d, 100.0d, 5, 0.0d, false);
        }
        if (i15 != 56 && i15 != 80) {
            return fz.a.a(d14, d15, i14, d16, false);
        }
        return fz.a.a(-0.5d, 15.5d, 5, 0.0d, true);
    }

    @Override // im.b, zm.p
    public final List<sm.b> R() {
        return this.f113505o1;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: U, reason: from getter */
    public final String getF113501k1() {
        return this.f113501k1;
    }

    @Override // im.b, zm.p
    public final boolean U2() {
        return false;
    }

    @Override // im.b, zm.p
    public final rm.a U3() {
        return null;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: V, reason: from getter */
    public final double getF113504n1() {
        return this.f113504n1;
    }

    @Override // im.b, zm.p
    public final boolean W() {
        return false;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: W0, reason: from getter */
    public final String getF113511u1() {
        return this.f113511u1;
    }

    @Override // im.b, zm.p
    public final double Y() {
        return 0.0d;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final km.a getF113494d1() {
        return this.f113494d1;
    }

    @Override // im.b, zm.p
    public final int Y3() {
        return Color.rgb(255, 255, 255);
    }

    @Override // im.b
    public final int d() {
        return 0;
    }

    @Override // im.b, zm.p
    public final String e4() {
        return f(this.f113510t1);
    }

    @Override // im.b, zm.p
    public final double[] f1(int i14, double d14, double d15, double d16) {
        return Q3(d14, d15, i14, d16, getF113498h1());
    }

    @Override // im.b
    public final int g() {
        return 0;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: g1, reason: from getter */
    public int getF113498h1() {
        return this.f113498h1;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: getStartDate, reason: from getter */
    public final DateTime getF113503m1() {
        return this.f113503m1;
    }

    @Override // im.b0, im.b, zm.p
    /* JADX INFO: renamed from: getTotalDuration */
    public final double getF94136a1() {
        return 0.0d;
    }

    @Override // im.b
    public final void h(double d14) {
        this.f113499i1 = d14;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: h3, reason: from getter */
    public final String getF113508r1() {
        return this.f113508r1;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: h4, reason: from getter */
    public final double getF113499i1() {
        return this.f113499i1;
    }

    @Override // im.b
    public final void i(String str) {
        this.f113512v1 = str;
    }

    @Override // im.b, zm.p
    public final String i3() {
        return f(this.f113509s1);
    }

    @Override // im.b
    public final void j(int i14) {
    }

    @Override // im.b, zm.p
    public final int l0(int i14) {
        Integer num = (Integer) h0.e0(i14, this.f113496f1);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    @Override // im.b
    public final void m(String str) {
        this.f113511u1 = str;
    }

    @Override // im.b, zm.p
    public final HashMap<Double, Double> m2() {
        s.m("windSpeedYawAngleData");
        throw null;
    }

    @Override // im.b, zm.p
    public final List<Integer> n1() {
        return this.f113502l1;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: n4, reason: from getter */
    public final double getF113509s1() {
        return this.f113509s1;
    }

    @Override // im.b
    public void o(int i14) {
        this.f113498h1 = i14;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: o2, reason: from getter */
    public final String getF113500j1() {
        return this.f113500j1;
    }

    @Override // im.b, zm.p
    public final void p1(String str) {
        this.f113501k1 = str;
    }

    @Override // im.b
    public final void q(String str) {
        str.getClass();
        this.f113500j1 = str;
    }

    @Override // im.b
    public final void r(rm.a aVar) {
        throw null;
    }

    @Override // im.b
    public final void s(List<x0> list) {
        throw null;
    }

    @Override // im.b, zm.p
    public final double s0() {
        return 0.0d;
    }

    @Override // im.b
    public final void t(double d14) {
        this.f113504n1 = d14;
    }

    @Override // im.b, zm.p
    public final int t2() {
        return 0;
    }

    @Override // im.b
    public final void u(double d14) {
        this.f113509s1 = d14;
    }

    @Override // im.b, zm.p
    public final void v2(DateTime dateTime) {
        this.f113503m1 = dateTime;
    }

    @Override // im.b, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f113493c1);
        km.a aVar = this.f113494d1;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        List<x1> list = this.f113495e1;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: x2, reason: from getter */
    public final String getF113512v1() {
        return this.f113512v1;
    }

    @Override // im.b
    public final void y(List<r1> list) {
        throw null;
    }

    @Override // im.b
    public final void z(List<r1> list) {
        list.getClass();
        this.f113515y1 = list;
    }

    public /* synthetic */ c(int i14, km.a aVar, List list, int i15, j jVar) {
        this(i14, aVar, (i15 & 4) != 0 ? null : list);
    }
}
