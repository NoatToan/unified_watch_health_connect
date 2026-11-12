package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\"R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\"R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010&\u001a\u0004\b\u001f\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/s;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/r;", "workouts", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/t;", "muscleGroups", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/e;", "difficulties", "", "primaryMuscles", "sportTypes", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/i;", "goals", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/workouts/data/model/t;Lcom/garmin/android/apps/connectmobile/workouts/data/model/e;Ljava/util/List;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/workouts/data/model/i;)V", "a", "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "b", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/t;", "f", "()Lcom/garmin/android/apps/connectmobile/workouts/data/model/t;", "setMuscleGroups", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/t;)V", "c", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/e;", "()Lcom/garmin/android/apps/connectmobile/workouts/data/model/e;", "setDifficulties", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/e;)V", "d", "g", "setPrimaryMuscles", "(Ljava/util/List;)V", JWKParameterNames.RSA_EXPONENT, "h", "setSportTypes", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/i;", "()Lcom/garmin/android/apps/connectmobile/workouts/data/model/i;", "setGoals", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/i;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workouts")
    private final List<r> workouts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyParts")
    private t muscleGroups;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("difficulty")
    private e difficulties;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryMuscles")
    private List<String> primaryMuscles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportTypes")
    private List<String> sportTypes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goals")
    private i goals;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(r.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new s(arrayList, parcel.readInt() == 0 ? null : t.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0 ? i.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public /* synthetic */ s(List list, t tVar, e eVar, List list2, List list3, i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : tVar, (i14 & 4) != 0 ? null : eVar, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? null : list3, (i14 & 32) != 0 ? null : iVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getDifficulties() {
        return this.difficulties;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getGoals() {
        return this.goals;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.workouts, sVar.workouts) && p005kotlin.jvm.internal.s.g(this.muscleGroups, sVar.muscleGroups) && p005kotlin.jvm.internal.s.g(this.difficulties, sVar.difficulties) && p005kotlin.jvm.internal.s.g(this.primaryMuscles, sVar.primaryMuscles) && p005kotlin.jvm.internal.s.g(this.sportTypes, sVar.sportTypes) && p005kotlin.jvm.internal.s.g(this.goals, sVar.goals);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t getMuscleGroups() {
        return this.muscleGroups;
    }

    public final List<String> g() {
        return this.primaryMuscles;
    }

    public final List<String> h() {
        return this.sportTypes;
    }

    public final int hashCode() {
        List<r> list = this.workouts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        t tVar = this.muscleGroups;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        e eVar = this.difficulties;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<String> list2 = this.primaryMuscles;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.sportTypes;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        i iVar = this.goals;
        return iHashCode5 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final List<r> i() {
        return this.workouts;
    }

    public final String toString() {
        return "MSNWorkoutsListDTO(workouts=" + this.workouts + ", muscleGroups=" + this.muscleGroups + ", difficulties=" + this.difficulties + ", primaryMuscles=" + this.primaryMuscles + ", sportTypes=" + this.sportTypes + ", goals=" + this.goals + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<r> list = this.workouts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((r) itO.next()).writeToParcel(parcel, i14);
            }
        }
        t tVar = this.muscleGroups;
        if (tVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tVar.writeToParcel(parcel, i14);
        }
        e eVar = this.difficulties;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        parcel.writeStringList(this.primaryMuscles);
        parcel.writeStringList(this.sportTypes);
        i iVar = this.goals;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
    }

    public s(List<r> list, t tVar, e eVar, List<String> list2, List<String> list3, i iVar) {
        this.workouts = list;
        this.muscleGroups = tVar;
        this.difficulties = eVar;
        this.primaryMuscles = list2;
        this.sportTypes = list3;
        this.goals = iVar;
    }

    public s() {
        this(null, null, null, null, null, null, 63, null);
    }
}
