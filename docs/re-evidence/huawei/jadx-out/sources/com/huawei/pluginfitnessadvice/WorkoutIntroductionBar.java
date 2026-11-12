package com.huawei.pluginfitnessadvice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class WorkoutIntroductionBar implements Parcelable {
    public static final Parcelable.Creator<WorkoutIntroductionBar> CREATOR = new Parcelable.Creator<WorkoutIntroductionBar>() { // from class: com.huawei.pluginfitnessadvice.WorkoutIntroductionBar.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkoutIntroductionBar createFromParcel(Parcel parcel) {
            return new WorkoutIntroductionBar(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public WorkoutIntroductionBar[] newArray(int i) {
            return new WorkoutIntroductionBar[i];
        }
    };

    @SerializedName("layouts")
    private List<ShowLayout> mLayoutList;

    @SerializedName("name")
    private String mName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected WorkoutIntroductionBar(Parcel parcel) {
        this.mName = parcel.readString();
        this.mLayoutList = parcel.createTypedArrayList(ShowLayout.CREATOR);
    }

    private WorkoutIntroductionBar(e eVar) {
        this.mName = eVar.f22328b;
        this.mLayoutList = eVar.f22329c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName);
        parcel.writeTypedList(this.mLayoutList);
    }

    /* JADX INFO: loaded from: classes41.dex */
    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<ShowLayout> f22329c;
    }

    public String getName() {
        return this.mName;
    }

    public List<ShowLayout> getLayoutList() {
        return this.mLayoutList;
    }

    public String toString() {
        return "WorkoutIntroductionBar{mName='" + this.mName + "', mLayoutList=" + this.mLayoutList + '}';
    }
}
