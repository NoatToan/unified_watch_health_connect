package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class HrCourseConfigModel {

    public static class HeartRateStatus implements Serializable {

        @SerializedName("coach_audio")
        public List<String> coachAudio;
        public String toast;
        public int type;
    }

    public static class HrConfigDetail implements Serializable {
        public String attentions;

        @SerializedName("audio_resource")
        public String audioResource;

        @SerializedName("course_intro")
        public String courseIntro;
        public String equipments;

        @SerializedName("stage_list")
        public List<HrDetailStage> mDetailList;

        @SerializedName("heart_rate_status")
        public List<HeartRateStatus> mHeartStatusList;

        @SerializedName("exception")
        public HrException mHrException;

        @SerializedName("train_frequency")
        public String trainFrequency;

        public CourseConfigModel.ConfigDetail changeToConfigDetail() {
            CourseConfigModel.ConfigDetail configDetail = new CourseConfigModel.ConfigDetail();
            configDetail.course_intro = this.courseIntro;
            configDetail.train_frequency = this.trainFrequency;
            configDetail.equipments = this.equipments;
            configDetail.attentions = this.attentions;
            if (this.mDetailList == null) {
                return configDetail;
            }
            ArrayList arrayList = new ArrayList();
            for (HrDetailStage hrDetailStage : this.mDetailList) {
                CourseConfigModel.Exercise exercise = new CourseConfigModel.Exercise();
                exercise.type = hrDetailStage.stage;
                exercise.title = hrDetailStage.title;
                exercise.subTitle = hrDetailStage.subTitle;
                arrayList.add(exercise);
            }
            configDetail.exercises = arrayList;
            return configDetail;
        }
    }

    public static class HrDetailStage implements Serializable {

        @SerializedName("estimate_time_range")
        public int averageHrTimeRange;

        @SerializedName("estimate_bpm_type")
        public int bpmType;
        public int duration;
        public long endTimeMills;

        @SerializedName("estimate_time")
        public int hrStatusJudgeTime;

        @SerializedName("init_speed_female")
        public float initSpeedFemale;

        @SerializedName("init_speed_male")
        public float initSpeedMale;
        public boolean isStart;

        @SerializedName("regulation_list")
        public List<Regulation> mRegulationList;

        @SerializedName("max_heart_rate_percent")
        public int maxHrPercent;

        @SerializedName("min_heart_rate_percent")
        public int minHrPercent;

        @SerializedName("min_speed")
        public float minSpeed;
        public int stage;
        public long startTimeMills;

        @SerializedName("sub_title")
        public String subTitle;
        public String title;
    }

    public static class HrException implements Serializable {

        @SerializedName("exception_estimate_bpm")
        public int exceptionBpm;

        @SerializedName("exception_estimate_number")
        public int exceptionNum;

        @SerializedName("max_speed")
        public float maxSpeed;

        @SerializedName("safe_heart_rate_audio")
        public String safeHrAudio;

        @SerializedName("safe_heart_rate_percent")
        public int safeHrPercent;
    }

    public static class Regulation implements Serializable {

        @SerializedName("max_difference")
        public int maxDifference;

        @SerializedName("min_difference")
        public int minDifference;
        public String object;
        public String value;
    }
}
