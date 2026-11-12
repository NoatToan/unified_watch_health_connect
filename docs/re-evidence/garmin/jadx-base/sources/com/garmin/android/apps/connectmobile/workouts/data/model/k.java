package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.events.model.adapters.UnitEnumTypeAdapter$UnitTypeAdapter;
import com.garmin.android.apps.connectmobile.events.model.adapters.UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;", "Landroid/os/Parcelable;", "", "courseId", "Lm52/c;", "eventLegActivityType", "legIndex", "Lgg0/i;", "unit", "Lgg0/h;", "unitType", "", "value", "<init>", "(Ljava/lang/Integer;Lm52/c;ILgg0/i;Lgg0/h;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "Lm52/c;", "f", "()Lm52/c;", "c", "I", "g", "()I", "Lgg0/i;", "h", "()Lgg0/i;", JWKParameterNames.RSA_EXPONENT, "Lgg0/h;", "getUnitType", "()Lgg0/h;", "Ljava/lang/Double;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Double;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f48247g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseId")
    private final Integer courseId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventLegActivityType")
    @JsonAdapter(EventLegActivityTypeAdapter$EventLegActivityTypeSelectionAdapter.class)
    private final m52.c eventLegActivityType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("legIndex")
    private final int legIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unit")
    @JsonAdapter(UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter.class)
    private final gg0.i unit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitType")
    @JsonAdapter(UnitEnumTypeAdapter$UnitTypeAdapter.class)
    private final gg0.h unitType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Double value;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : m52.c.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() == 0 ? null : gg0.i.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : gg0.h.valueOf(parcel.readString()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(Integer num, m52.c cVar, int i14, gg0.i iVar, gg0.h hVar, Double d14) {
        this.courseId = num;
        this.eventLegActivityType = cVar;
        this.legIndex = i14;
        this.unit = iVar;
        this.unitType = hVar;
        this.value = d14;
    }

    public static k b(k kVar, Integer num, gg0.i iVar, Double d14, int i14) {
        if ((i14 & 1) != 0) {
            num = kVar.courseId;
        }
        Integer num2 = num;
        m52.c cVar = kVar.eventLegActivityType;
        int i15 = kVar.legIndex;
        if ((i14 & 8) != 0) {
            iVar = kVar.unit;
        }
        gg0.i iVar2 = iVar;
        gg0.h hVar = kVar.unitType;
        if ((i14 & 32) != 0) {
            d14 = kVar.value;
        }
        kVar.getClass();
        return new k(num2, cVar, i15, iVar2, hVar, d14);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getCourseId() {
        return this.courseId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.courseId, kVar.courseId) && this.eventLegActivityType == kVar.eventLegActivityType && this.legIndex == kVar.legIndex && this.unit == kVar.unit && this.unitType == kVar.unitType && p005kotlin.jvm.internal.s.g(this.value, kVar.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m52.c getEventLegActivityType() {
        return this.eventLegActivityType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getLegIndex() {
        return this.legIndex;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final gg0.i getUnit() {
        return this.unit;
    }

    public final int hashCode() {
        Integer num = this.courseId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        m52.c cVar = this.eventLegActivityType;
        int iD = q2.d(this.legIndex, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
        gg0.i iVar = this.unit;
        int iHashCode2 = (iD + (iVar == null ? 0 : iVar.hashCode())) * 31;
        gg0.h hVar = this.unitType;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Double d14 = this.value;
        return iHashCode3 + (d14 != null ? d14.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public final fg0.d j() {
        return new fg0.d(this.value, this.unit, this.unitType);
    }

    public final String toString() {
        return "LegTarget(courseId=" + this.courseId + ", eventLegActivityType=" + this.eventLegActivityType + ", legIndex=" + this.legIndex + ", unit=" + this.unit + ", unitType=" + this.unitType + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.courseId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        m52.c cVar = this.eventLegActivityType;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
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
    }

    public /* synthetic */ k(Integer num, m52.c cVar, int i14, gg0.i iVar, gg0.h hVar, Double d14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(num, (i15 & 2) != 0 ? null : cVar, i14, iVar, hVar, d14);
    }
}
