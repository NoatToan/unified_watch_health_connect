package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class CourseModel {

    public static class CourseBasicInformation {

        @SerializedName("course_id")
        long courseId;

        @SerializedName("c_time")
        long createTime;
        String name;
        int status;
        int type;
    }

    public static class CourseBasicInformationList {

        @SerializedName(CourseApiKt.COURSE_TAG_COURSE_LIST)
        public List<CourseAllInfo> list;
    }

    public static class CourseConfig implements Serializable {

        @SerializedName("c_key")
        public String key;

        @SerializedName("c_value")
        public String value;
    }

    public static class CourseData implements Serializable {
        public static final int COACH_COMMON = 2;
        public static final int COACH_OPTION = 1;
        public static final int STATUS_OFFLINE = 1;
        public static final int TYPE_COURSE_AUDIO = 2;
        public static final int TYPE_COURSE_SMART = 3;
        public static final int TYPE_COURSE_VIDEO = 1;

        @SerializedName("big_preview_image_url")
        public String bigImageUrl;

        @SerializedName("coach_limit")
        public int coachType;

        @SerializedName("course_id")
        public long courseId;

        @SerializedName("c_time")
        long createTime;

        @SerializedName("difficulty_level")
        public int difficulty;

        @SerializedName("advise_duration")
        public int duration;

        @SerializedName("female_advise_calorie")
        public int femaleCalories;

        @SerializedName("male_advise_calorie")
        public int maleCalories;

        @SerializedName("middle_preview_image_url")
        public String middleImageUrl;
        public String name;

        @SerializedName("preview_seconds")
        public int previewSeconds;

        @SerializedName("pricing_status")
        public int pricingStatus;

        @SerializedName("small_preview_image_url")
        public String smallImageUrl;

        @SerializedName("sport_type")
        public int sportType;
        public int status;

        @SerializedName("sub_title")
        public String subTitle;
        public String title;
        public int type;
    }

    public static class CourseDetailResult implements Serializable {

        @SerializedName("course_detail")
        public CourseAllInfo allInfo;

        @SerializedName("train_summary")
        public PracticedSummary practicedSummary;
    }

    public static class CourseInformationRequest {

        @SerializedName("course_id")
        long courseId;

        public CourseInformationRequest(long j) {
            this.courseId = j;
        }
    }

    public static class CourseListData {

        @SerializedName(CourseApiKt.COURSE_TAG_COURSE_LIST)
        public List<CourseData> courseList;

        @SerializedName(RouteRequest.KEY_NEXT_KEY)
        public String nextKey;
    }

    public static class CourseListRequest {
        int count;

        @SerializedName(RouteRequest.KEY_NEXT_KEY)
        String nextKey;
        String tags;
        int type;

        public CourseListRequest(int i, String str, String str2, int i2) {
            this.type = i;
            this.tags = str;
            this.nextKey = str2;
            this.count = i2;
        }
    }

    public static class CourseRecommendReq {
        public int count;
        public String next_key;
        public String rule_key;

        public CourseRecommendReq(String str, int i) {
            this.rule_key = str;
            this.count = i;
        }
    }

    public static class GetTrainRecordRequest {

        @SerializedName("course_id")
        long courseId;
        long time;

        public GetTrainRecordRequest(long j, long j2) {
            this.courseId = j;
            this.time = j2;
        }
    }

    public static class MultyCourseInformationRequest {

        @SerializedName("ids")
        String courseIds;

        public MultyCourseInformationRequest(String str) {
            this.courseIds = str;
        }
    }

    public static class PostTrainRecordRequest {

        @SerializedName("course_id")
        long courseId;

        @SerializedName("sport_record_id")
        CourseTrainRecord.SportRecord mSportRecord;
        long time;

        @SerializedName("zone_offset")
        int zoneOffset;

        public PostTrainRecordRequest(long j, long j2, CourseTrainRecord.SportRecord sportRecord, int i) {
            this.courseId = j;
            this.time = j2;
            this.mSportRecord = sportRecord;
            this.zoneOffset = i;
        }
    }

    public static class PracticedCourse {

        @SerializedName("course_info")
        public CourseData courseData;

        @SerializedName("train_summary")
        public PracticedSummary practicedSummary;
    }

    public static class PracticedCourseList {

        @SerializedName(CourseApiKt.COURSE_TAG_COURSE_LIST)
        public List<PracticedCourse> data;

        @SerializedName(RouteRequest.KEY_NEXT_KEY)
        public String nextKey;
    }

    public static class PracticedSummary implements Serializable {

        @SerializedName("last_train_time")
        long lastTrainTime;

        @SerializedName("train_times")
        public int trainTimes;
    }

    public static class RequestResult {
        public boolean success;
    }
}
