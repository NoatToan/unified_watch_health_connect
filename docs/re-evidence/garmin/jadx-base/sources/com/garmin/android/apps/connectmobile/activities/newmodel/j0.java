package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import c22.o3;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/j0;", "Landroid/os/Parcelable;", "", "name", "pressureUnit", "", "", "records", "", "tankIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "Ljava/lang/Integer;", "getTankIndex", "()Ljava/lang/Integer;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pressureUnit")
    private final String pressureUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("records")
    private final List<double[]> records;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankIndex")
    private final Integer tankIndex;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j0> {
        @Override // android.os.Parcelable.Creator
        public final j0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(parcel.createDoubleArray());
                }
            }
            return new j0(string, string2, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final j0[] newArray(int i14) {
            return new j0[i14];
        }
    }

    public /* synthetic */ j0(String str, String str2, List list, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPressureUnit() {
        return this.pressureUnit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p005kotlin.jvm.internal.s.g(this.name, j0Var.name) && p005kotlin.jvm.internal.s.g(this.pressureUnit, j0Var.pressureUnit) && p005kotlin.jvm.internal.s.g(this.records, j0Var.records) && p005kotlin.jvm.internal.s.g(this.tankIndex, j0Var.tankIndex);
    }

    public final List<double[]> f() {
        return this.records;
    }

    public final List<double[]> g() {
        double dA;
        ArrayList arrayList = null;
        o3 o3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? o3.BAR : o3.PSI;
        String str = this.pressureUnit;
        if (o3Var == (str != null ? o3.valueOf(str) : o3Var)) {
            return this.records;
        }
        o3 o3Var2 = o3.BAR;
        if (o3Var == o3Var2) {
            o3.a aVar = o3.f23180d;
            o3 o3Var3 = o3.PSI;
            aVar.getClass();
            dA = o3.a.a(o3Var3, o3Var2);
        } else {
            o3.a aVar2 = o3.f23180d;
            o3 o3Var4 = o3.PSI;
            aVar2.getClass();
            dA = o3.a.a(o3Var2, o3Var4);
        }
        List<double[]> list = this.records;
        if (list != null) {
            arrayList = new ArrayList(p13.y.r(list, 10));
            for (double[] dArr : list) {
                arrayList.add(new double[]{dArr[0], dArr[1] * dA});
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pressureUnit;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<double[]> list = this.records;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.tankIndex;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.pressureUnit;
        List<double[]> list = this.records;
        Integer num = this.tankIndex;
        StringBuilder sbI = p6.b.i("TankSensor(name=", str, ", pressureUnit=", str2, ", records=");
        sbI.append(list);
        sbI.append(", tankIndex=");
        sbI.append(num);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.pressureUnit);
        List<double[]> list = this.records;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeDoubleArray((double[]) itO.next());
            }
        }
        Integer num = this.tankIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public j0(String str, String str2, List<double[]> list, Integer num) {
        this.name = str;
        this.pressureUnit = str2;
        this.records = list;
        this.tankIndex = num;
    }

    public j0() {
        this(null, null, null, null, 15, null);
    }
}
