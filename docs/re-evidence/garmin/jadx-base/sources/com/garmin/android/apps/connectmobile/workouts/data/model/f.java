package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/f;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;", "legTargets", "Lm52/i;", "name", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/z;", "totalTarget", "<init>", "(Ljava/util/List;Lm52/i;Lcom/garmin/android/apps/connectmobile/workouts/data/model/z;)V", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Lm52/i;", "g", "()Lm52/i;", "c", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/z;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/garmin/android/apps/connectmobile/workouts/data/model/z;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("legTargets")
    private final List<k> legTargets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    @JsonAdapter(TriathlonTypeAdapter$TriathlonTypeSelectionAdapter.class)
    private final m52.i name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalTarget")
    private final z totalTarget;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(k.CREATOR, parcel, arrayList, iA, 1);
            }
            return new f(arrayList, parcel.readInt() == 0 ? null : m52.i.valueOf(parcel.readString()), z.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(List<k> list, m52.i iVar, z zVar) {
        list.getClass();
        zVar.getClass();
        this.legTargets = list;
        this.name = iVar;
        this.totalTarget = zVar;
    }

    public static f b(f fVar, ArrayList arrayList) {
        m52.i iVar = fVar.name;
        z zVar = fVar.totalTarget;
        fVar.getClass();
        zVar.getClass();
        return new f(arrayList, iVar, zVar);
    }

    public final k d(m52.c cVar) {
        Object next;
        cVar.getClass();
        Iterator<T> it = this.legTargets.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((k) next).getEventLegActivityType() == cVar) {
                return (k) next;
            }
        }
        next = null;
        return (k) next;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.legTargets, fVar.legTargets) && this.name == fVar.name && p005kotlin.jvm.internal.s.g(this.totalTarget, fVar.totalTarget);
    }

    public final List<k> f() {
        return this.legTargets;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m52.i getName() {
        return this.name;
    }

    public final m52.c h() {
        Object obj;
        Object next;
        Iterator<T> it = this.legTargets.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((k) next).getEventLegActivityType() != m52.c.LAP_SWIMMING);
        if (next != null) {
            return m52.c.LAP_SWIMMING;
        }
        for (Object obj2 : this.legTargets) {
            if (((k) obj2).getEventLegActivityType() == m52.c.SWIMMING) {
                obj = obj2;
                break;
            }
        }
        return obj != null ? m52.c.SWIMMING : m52.c.OPEN_WATER_SWIMMING;
    }

    public final int hashCode() {
        int iHashCode = this.legTargets.hashCode() * 31;
        m52.i iVar = this.name;
        return this.totalTarget.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final z getTotalTarget() {
        return this.totalTarget;
    }

    public final String toString() {
        return "EventLegDistanceDTO(legTargets=" + this.legTargets + ", name=" + this.name + ", totalTarget=" + this.totalTarget + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.legTargets, parcel);
        while (itE.hasNext()) {
            ((k) itE.next()).writeToParcel(parcel, i14);
        }
        m52.i iVar = this.name;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iVar.name());
        }
        this.totalTarget.writeToParcel(parcel, i14);
    }

    public /* synthetic */ f(List list, m52.i iVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? null : iVar, zVar);
    }
}
