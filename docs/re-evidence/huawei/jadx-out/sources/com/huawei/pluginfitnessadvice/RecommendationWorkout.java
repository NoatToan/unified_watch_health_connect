package com.huawei.pluginfitnessadvice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;

/* JADX INFO: loaded from: classes14.dex */
public class RecommendationWorkout implements Parcelable {
    public static final Parcelable.Creator<RecommendationWorkout> CREATOR = new Parcelable.Creator<RecommendationWorkout>() { // from class: com.huawei.pluginfitnessadvice.RecommendationWorkout.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public RecommendationWorkout createFromParcel(Parcel parcel) {
            return new RecommendationWorkout(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendationWorkout[] newArray(int i) {
            return new RecommendationWorkout[i];
        }
    };

    @SerializedName("topicListName")
    private String mTopicListName;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String mWorkoutId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected RecommendationWorkout(Parcel parcel) {
        this.mWorkoutId = parcel.readString();
        this.mTopicListName = parcel.readString();
    }

    private RecommendationWorkout(e eVar) {
        this.mWorkoutId = eVar.f22324b;
        this.mTopicListName = eVar.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mWorkoutId);
        parcel.writeString(this.mTopicListName);
    }

    /* JADX INFO: loaded from: classes41.dex */
    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22324b;
        private String e;
    }

    public String getWorkoutId() {
        return this.mWorkoutId;
    }

    public String getTopicListName() {
        return this.mTopicListName;
    }

    public String toString() {
        return "RecommendationWorkout{mWorkoutId='" + this.mWorkoutId + "', mTopicListName='" + this.mTopicListName + "'}";
    }
}
