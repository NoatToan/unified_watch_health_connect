package com.garmin.android.apps.connectmobile.performance.dto;

import android.os.Parcel;
import android.os.Parcelable;
import c22.t;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/dto/b;", "Landroid/os/Parcelable;", "", "", "primaryMuscles", "secondaryMuscles", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getSecondaryMuscles", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryMuscles")
    private final List<String> primaryMuscles;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryMuscles")
    private final List<String> secondaryMuscles;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.primaryMuscles = list;
        this.secondaryMuscles = list2;
    }

    public final List<String> b() {
        return this.primaryMuscles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.primaryMuscles, bVar.primaryMuscles) && s.g(this.secondaryMuscles, bVar.secondaryMuscles);
    }

    public final int hashCode() {
        return this.secondaryMuscles.hashCode() + (this.primaryMuscles.hashCode() * 31);
    }

    public final String toString() {
        return t.f("ExerciseDto(primaryMuscles=", ", secondaryMuscles=", ")", this.primaryMuscles, this.secondaryMuscles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeStringList(this.primaryMuscles);
        parcel.writeStringList(this.secondaryMuscles);
    }
}
