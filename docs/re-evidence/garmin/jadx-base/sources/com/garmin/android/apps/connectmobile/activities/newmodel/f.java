package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "Landroid/os/Parcelable;", "", "activityId", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/i;", "activityUuid", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/c0;", "rounds", "<init>", "(JLcom/garmin/android/apps/connectmobile/activities/newmodel/i;Ljava/util/List;)V", "a", "J", "d", "()J", "b", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/i;", "getActivityUuid", "()Lcom/garmin/android/apps/connectmobile/activities/newmodel/i;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityUUID")
    private final i activityUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rounds")
    private final List<c0> rounds;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j8 = parcel.readLong();
            ArrayList arrayList = null;
            i iVarCreateFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(c0.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new f(j8, iVarCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(long j8, i iVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? null : list);
    }

    public static f b(f fVar, List list) {
        long j8 = fVar.activityId;
        i iVar = fVar.activityUuid;
        fVar.getClass();
        return new f(j8, iVar, list);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
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
        return this.activityId == fVar.activityId && p005kotlin.jvm.internal.s.g(this.activityUuid, fVar.activityUuid) && p005kotlin.jvm.internal.s.g(this.rounds, fVar.rounds);
    }

    public final List<c0> f() {
        return this.rounds;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.activityId) * 31;
        i iVar = this.activityUuid;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        List<c0> list = this.rounds;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityRoundsDTO(activityId=" + this.activityId + ", activityUuid=" + this.activityUuid + ", rounds=" + this.rounds + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        i iVar = this.activityUuid;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        List<c0> list = this.rounds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((c0) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public f(long j8, i iVar, List<c0> list) {
        this.activityId = j8;
        this.activityUuid = iVar;
        this.rounds = list;
    }
}
