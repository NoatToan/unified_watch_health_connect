package com.garmin.android.apps.connectmobile.performance.dto;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/dto/a;", "Landroid/os/Parcelable;", "", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/b;", "exercises", "", "primaryMuscles", "secondaryMuscles", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Ljava/util/List;", "getPrimaryMuscles", "()Ljava/util/List;", "c", "getSecondaryMuscles", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0733a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exercises")
    private final Map<String, b> exercises;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryMuscles")
    private final List<String> primaryMuscles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryMuscles")
    private final List<String> secondaryMuscles;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.dto.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0733a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readString(), b.CREATOR.createFromParcel(parcel));
            }
            return new a(linkedHashMap, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Map<String, b> map, List<String> list, List<String> list2) {
        map.getClass();
        this.exercises = map;
        this.primaryMuscles = list;
        this.secondaryMuscles = list2;
    }

    public final Map<String, b> b() {
        return this.exercises;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.exercises, aVar.exercises) && s.g(this.primaryMuscles, aVar.primaryMuscles) && s.g(this.secondaryMuscles, aVar.secondaryMuscles);
    }

    public final int hashCode() {
        int iHashCode = this.exercises.hashCode() * 31;
        List<String> list = this.primaryMuscles;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.secondaryMuscles;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        Map<String, b> map = this.exercises;
        List<String> list = this.primaryMuscles;
        List<String> list2 = this.secondaryMuscles;
        StringBuilder sb3 = new StringBuilder("ExerciseCategoryDto(exercises=");
        sb3.append(map);
        sb3.append(", primaryMuscles=");
        sb3.append(list);
        sb3.append(", secondaryMuscles=");
        return z.c(sb3, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itU = j.u(this.exercises, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString((String) entry.getKey());
            ((b) entry.getValue()).writeToParcel(parcel, i14);
        }
        parcel.writeStringList(this.primaryMuscles);
        parcel.writeStringList(this.secondaryMuscles);
    }
}
