package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j0;", "tankSensors", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/k0;", "tankSensorsMetaData", "", "pressureUnitType", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "c", "Ljava/lang/String;", "getPressureUnitType", "()Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankSensors")
    private final List<j0> tankSensors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankSensorsMetaData")
    private final List<k0> tankSensorsMetaData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pressureUnitType")
    private final String pressureUnitType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l0> {
        @Override // android.os.Parcelable.Creator
        public final l0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(parcel.readInt() == 0 ? null : j0.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i16 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList3.add(parcel.readInt() == 0 ? null : k0.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new l0(arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l0[] newArray(int i14) {
            return new l0[i14];
        }
    }

    public /* synthetic */ l0(List list, List list2, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2, (i14 & 4) != 0 ? null : str);
    }

    public final List<j0> b() {
        return this.tankSensors;
    }

    public final List<k0> d() {
        return this.tankSensorsMetaData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return p005kotlin.jvm.internal.s.g(this.tankSensors, l0Var.tankSensors) && p005kotlin.jvm.internal.s.g(this.tankSensorsMetaData, l0Var.tankSensorsMetaData) && p005kotlin.jvm.internal.s.g(this.pressureUnitType, l0Var.pressureUnitType);
    }

    public final int hashCode() {
        List<j0> list = this.tankSensors;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<k0> list2 = this.tankSensorsMetaData;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.pressureUnitType;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.pressureUnitType, ")", f3.k("TanksPressureDTO(tankSensors=", ", tankSensorsMetaData=", ", pressureUnitType=", this.tankSensors, this.tankSensorsMetaData));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<j0> list = this.tankSensors;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                j0 j0Var = (j0) itO.next();
                if (j0Var == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    j0Var.writeToParcel(parcel, i14);
                }
            }
        }
        List<k0> list2 = this.tankSensorsMetaData;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                k0 k0Var = (k0) itO2.next();
                if (k0Var == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    k0Var.writeToParcel(parcel, i14);
                }
            }
        }
        parcel.writeString(this.pressureUnitType);
    }

    public l0(List<j0> list, List<k0> list2, String str) {
        this.tankSensors = list;
        this.tankSensorsMetaData = list2;
        this.pressureUnitType = str;
    }

    public l0() {
        this(null, null, null, 7, null);
    }
}
