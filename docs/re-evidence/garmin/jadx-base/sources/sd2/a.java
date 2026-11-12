package sd2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class a implements f, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2995a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f158634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f158635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f158636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f158637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f158638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f158639f;

    /* JADX INFO: renamed from: sd2.a$a, reason: collision with other inner class name */
    public class C2995a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    private a(Parcel parcel) {
        this.f158634a = new ArrayList(2);
        this.f158638e = -1;
        this.f158639f = -1;
        this.f158634a = parcel.createTypedArrayList(j.CREATOR);
        this.f158635b = parcel.readByte() != 0;
        this.f158636c = parcel.readByte() != 0;
        this.f158637d = parcel.readByte() != 0;
        this.f158638e = parcel.readInt();
        this.f158639f = parcel.readInt();
    }

    @Override // sd2.f
    public final String[] B() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.B();
        }
        return null;
    }

    @Override // sd2.f
    public final boolean B1() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).F;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean B2() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158722z;
        }
        return false;
    }

    @Override // sd2.f
    public final int C2() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.C2();
        }
        return -1;
    }

    @Override // sd2.f
    public final boolean F2() {
        return this.f158637d;
    }

    @Override // sd2.f
    public final String J3() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.J3();
        }
        return null;
    }

    @Override // sd2.f
    public final long K2() {
        Iterator it = this.f158634a.iterator();
        long j8 = 0;
        while (it.hasNext()) {
            long j14 = ((j) it.next()).f158688d;
            if (j14 > j8) {
                j8 = j14;
            }
        }
        return j8;
    }

    @Override // sd2.f
    public final String L() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.L();
        }
        return null;
    }

    @Override // sd2.f
    public final boolean L2() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158711o;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean N0() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158719w;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean N1() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).X;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean N2() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).H0;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean O() {
        Iterator it = this.f158634a.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            z14 |= ((j) it.next()).f158687c1;
        }
        return z14;
    }

    @Override // sd2.f
    public final boolean O0() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).E;
        }
        return false;
    }

    @Override // sd2.f
    public final String Q() {
        int i14 = this.f158639f;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).J0;
        }
        return null;
    }

    @Override // sd2.f
    public final boolean Q2() {
        f fVarB = b();
        return fVarB != null && fVarB.Q2();
    }

    @Override // sd2.f
    public final boolean S() {
        return true;
    }

    @Override // sd2.f
    public final long S2() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.S2();
        }
        return 0L;
    }

    @Override // sd2.f
    public final boolean S3() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158716r;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean T() {
        f fVarB = b();
        return fVarB != null && fVarB.T();
    }

    @Override // sd2.f
    public final boolean T1() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).T;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean X0() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158708m1;
        }
        return true;
    }

    @Override // sd2.f
    public final boolean X1() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).Z;
        }
        return false;
    }

    @Override // sd2.f
    public final String a1() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.a1();
        }
        return null;
    }

    public final f b() {
        ArrayList arrayList = this.f158634a;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return (f) arrayList.get(0);
    }

    @Override // sd2.f
    public final boolean c2() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158715q;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean c3() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158717t;
        }
        return false;
    }

    @Override // sd2.f
    public final String d0() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).J0;
        }
        return null;
    }

    @Override // sd2.f
    public final boolean d2() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).Y;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // sd2.f
    public final String f3() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.f3();
        }
        return null;
    }

    @Override // sd2.f
    public final boolean g3() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).P;
        }
        return false;
    }

    @Override // sd2.f
    public final String getApplicationKey() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.getApplicationKey();
        }
        return null;
    }

    @Override // sd2.f
    public final int getConnectionType() {
        return 0;
    }

    @Override // sd2.f
    public final String getDisplayName() {
        ArrayList<f> arrayList = this.f158634a;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        for (f fVar : arrayList) {
            if (fVar != null && !TextUtils.isEmpty(fVar.getDisplayName())) {
                return fVar.getDisplayName();
            }
        }
        return null;
    }

    @Override // sd2.f
    public final byte[] getGbleEdiv() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).T0;
        }
        return null;
    }

    @Override // sd2.f
    public final byte[] getGbleLongTermKey() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).V0;
        }
        return null;
    }

    @Override // sd2.f
    public final byte[] getGbleRand() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).U0;
        }
        return null;
    }

    @Override // sd2.f
    public final String getImageURL() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.getImageURL();
        }
        return null;
    }

    @Override // sd2.f
    public final String getPartNumber() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.getPartNumber();
        }
        return null;
    }

    @Override // sd2.f
    public final String getProductDisplayName() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.getProductDisplayName();
        }
        return null;
    }

    @Override // sd2.f
    public final String getProductNumber() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.getProductNumber();
        }
        return null;
    }

    @Override // sd2.f
    public final String getSku() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.getSku();
        }
        return null;
    }

    @Override // sd2.f
    public final String getSoftwareVersion() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.getSoftwareVersion();
        }
        return null;
    }

    @Override // sd2.f
    public final long getUnitID() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.getUnitID();
        }
        return -1L;
    }

    @Override // sd2.f
    public final boolean i1() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158709n;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean isDualBluetoothConnection() {
        return this.f158635b && this.f158636c;
    }

    @Override // sd2.f
    public final boolean isMultiLinkSupported() {
        int i14 = this.f158638e;
        return i14 != -1 && ((j) this.f158634a.get(i14)).f158698i;
    }

    @Override // sd2.f
    public final boolean isPaired() {
        Iterator it = this.f158634a.iterator();
        boolean zIsPaired = false;
        while (it.hasNext()) {
            zIsPaired |= ((j) it.next()).isPaired();
        }
        return zIsPaired;
    }

    @Override // sd2.f
    public final boolean l1() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158720x;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean p2() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158718v;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean p3() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).D;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean q2() {
        return this.f158635b;
    }

    @Override // sd2.f
    public final boolean q4() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).C;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean r0() {
        f fVarB = b();
        return fVarB != null && fVarB.r0();
    }

    @Override // sd2.f
    public final String r1() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.r1();
        }
        return null;
    }

    @Override // sd2.f
    public final String r2() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.r2();
        }
        return null;
    }

    @Override // sd2.f
    public final boolean r4() {
        boolean zR4 = false;
        for (j jVar : this.f158634a) {
            if (jVar.z1()) {
                zR4 |= jVar.r4();
            }
        }
        return zR4;
    }

    @Override // sd2.f
    public final boolean s2() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158713p;
        }
        return false;
    }

    @Override // sd2.f
    public final String t0() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.t0();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("unitID[");
        sb3.append(getUnitID());
        sb3.append("], hasBluetoothClassicConnection[");
        sb3.append(this.f158635b);
        sb3.append("], hasBluetoothLowEnergyConnection[");
        return hb.a.k(sb3, this.f158636c, "]");
    }

    @Override // sd2.f
    public final boolean u0() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158703k0;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean u2() {
        f fVarB = b();
        return fVarB != null && fVarB.u2();
    }

    @Override // sd2.f
    public final boolean u3() {
        f fVarB = b();
        return fVarB != null && fVarB.u3();
    }

    @Override // sd2.f
    public final String u4() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.u4();
        }
        return null;
    }

    @Override // sd2.f
    public final String v0() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.v0();
        }
        return null;
    }

    @Override // sd2.f
    public final String w1() {
        f fVarB = b();
        if (fVarB != null) {
            return fVarB.w1();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeTypedList(this.f158634a);
        parcel.writeByte(this.f158635b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158636c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158637d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f158638e);
        parcel.writeInt(this.f158639f);
    }

    @Override // sd2.f
    public final boolean y0() {
        int i14 = this.f158638e;
        if (i14 != -1) {
            return ((j) this.f158634a.get(i14)).f158721y;
        }
        return false;
    }

    @Override // sd2.f
    public final boolean z1() {
        return this.f158636c;
    }

    public a(List<j> list) {
        ArrayList arrayList = new ArrayList(2);
        this.f158634a = arrayList;
        this.f158638e = -1;
        this.f158639f = -1;
        arrayList.addAll(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator<j> it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            int i15 = it.next().X0;
            if (2 == i15) {
                this.f158635b = true;
                this.f158639f = i14;
            } else if (1 == i15) {
                this.f158636c = true;
                this.f158638e = i14;
            } else {
                this.f158637d = true;
            }
            i14++;
        }
    }

    public /* synthetic */ a(Parcel parcel, C2995a c2995a) {
        this(parcel);
    }
}
