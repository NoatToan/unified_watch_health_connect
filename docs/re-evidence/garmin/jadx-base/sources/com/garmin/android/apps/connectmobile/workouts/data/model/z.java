package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.events.model.adapters.UnitEnumTypeAdapter$UnitTypeAdapter;
import com.garmin.android.apps.connectmobile.events.model.adapters.UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/z;", "Landroid/os/Parcelable;", "Lgg0/i;", "unit", "Lgg0/h;", "unitType", "", "value", "<init>", "(Lgg0/i;Lgg0/h;Ljava/lang/Double;)V", "a", "Lgg0/i;", "b", "()Lgg0/i;", "Lgg0/h;", "d", "()Lgg0/h;", "c", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unit")
    @JsonAdapter(UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter.class)
    private final gg0.i unit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitType")
    @JsonAdapter(UnitEnumTypeAdapter$UnitTypeAdapter.class)
    private final gg0.h unitType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Double value;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        @Override // android.os.Parcelable.Creator
        public final z createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new z(parcel.readInt() == 0 ? null : gg0.i.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : gg0.h.valueOf(parcel.readString()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final z[] newArray(int i14) {
            return new z[i14];
        }
    }

    public z(gg0.i iVar, gg0.h hVar, Double d14) {
        this.unit = iVar;
        this.unitType = hVar;
        this.value = d14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final gg0.i getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final gg0.h getUnitType() {
        return this.unitType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.unit == zVar.unit && this.unitType == zVar.unitType && p005kotlin.jvm.internal.s.g(this.value, zVar.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public final int hashCode() {
        gg0.i iVar = this.unit;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        gg0.h hVar = this.unitType;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Double d14 = this.value;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        gg0.i iVar = this.unit;
        gg0.h hVar = this.unitType;
        Double d14 = this.value;
        StringBuilder sb3 = new StringBuilder("TotalTarget(unit=");
        sb3.append(iVar);
        sb3.append(", unitType=");
        sb3.append(hVar);
        sb3.append(", value=");
        return b71.i.g(sb3, d14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        gg0.i iVar = this.unit;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iVar.name());
        }
        gg0.h hVar = this.unitType;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar.name());
        }
        Double d14 = this.value;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }
}
