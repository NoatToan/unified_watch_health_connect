package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.events.model.adapters.UnitEnumTypeAdapter$UnitTypeAdapter;
import com.garmin.android.apps.connectmobile.events.model.adapters.UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/c;", "Landroid/os/Parcelable;", "", "legIndex", "Lgg0/i;", "unit", "Lgg0/h;", "unitType", "", "value", "transitionOutDurationSeconds", "<init>", "(ILgg0/i;Lgg0/h;Ljava/lang/Double;Ljava/lang/Integer;)V", "a", "I", "d", "()I", "b", "Lgg0/i;", "g", "()Lgg0/i;", "c", "Lgg0/h;", "getUnitType", "()Lgg0/h;", "Ljava/lang/Double;", "h", "()Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48127f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("legIndex")
    private final int legIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unit")
    @JsonAdapter(UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter.class)
    private final gg0.i unit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitType")
    @JsonAdapter(UnitEnumTypeAdapter$UnitTypeAdapter.class)
    private final gg0.h unitType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Double value;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transitionOutDurationSeconds")
    private final Integer transitionOutDurationSeconds;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt(), parcel.readInt() == 0 ? null : gg0.i.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : gg0.h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(int i14, gg0.i iVar, gg0.h hVar, Double d14, Integer num, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, iVar, hVar, d14, (i15 & 16) != 0 ? null : num);
    }

    public static c b(c cVar, Integer num) {
        int i14 = cVar.legIndex;
        gg0.i iVar = cVar.unit;
        gg0.h hVar = cVar.unitType;
        Double d14 = cVar.value;
        cVar.getClass();
        return new c(i14, iVar, hVar, d14, num);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLegIndex() {
        return this.legIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.legIndex == cVar.legIndex && this.unit == cVar.unit && this.unitType == cVar.unitType && p005kotlin.jvm.internal.s.g(this.value, cVar.value) && p005kotlin.jvm.internal.s.g(this.transitionOutDurationSeconds, cVar.transitionOutDurationSeconds);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getTransitionOutDurationSeconds() {
        return this.transitionOutDurationSeconds;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final gg0.i getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.legIndex) * 31;
        gg0.i iVar = this.unit;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        gg0.h hVar = this.unitType;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Double d14 = this.value;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num = this.transitionOutDurationSeconds;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        int i14 = this.legIndex;
        gg0.i iVar = this.unit;
        gg0.h hVar = this.unitType;
        Double d14 = this.value;
        Integer num = this.transitionOutDurationSeconds;
        StringBuilder sb3 = new StringBuilder("CustomLegGoal(legIndex=");
        sb3.append(i14);
        sb3.append(", unit=");
        sb3.append(iVar);
        sb3.append(", unitType=");
        sb3.append(hVar);
        sb3.append(", value=");
        sb3.append(d14);
        sb3.append(", transitionOutDurationSeconds=");
        return f3.i(sb3, num, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.legIndex);
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
        Integer num = this.transitionOutDurationSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public c(int i14, gg0.i iVar, gg0.h hVar, Double d14, Integer num) {
        this.legIndex = i14;
        this.unit = iVar;
        this.unitType = hVar;
        this.value = d14;
        this.transitionOutDurationSeconds = num;
    }
}
