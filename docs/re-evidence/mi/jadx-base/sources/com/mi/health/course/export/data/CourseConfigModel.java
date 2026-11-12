package com.mi.health.course.export.data;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class CourseConfigModel {

    public static class AudioInfo implements Serializable {

        @SerializedName("segments")
        public List<AudioSegment> audioSegments;

        @SerializedName("audio_size")
        public long audioSize;

        @SerializedName("audio_url")
        public String audioUrl;
    }

    public static class AudioSegment implements Serializable {

        @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
        public String endTime;
        public long endTimeMills;

        @SerializedName("intro")
        public String introduction;
        public boolean isShowTitle;
        public int requiredDistance;
        public float rpm;

        @SerializedName("section_item")
        public String sectionItem;

        @SerializedName("section_value")
        public int sectionValue;
        public float speed;

        @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
        public String startTime;
        public long timeInMills;

        @SerializedName("trigger_item")
        public String triggerItem;

        @SerializedName("trigger_value")
        public String triggerValue;
    }

    public static class ConfigDetail implements Serializable {
        public String attentions;
        public List<DevCmd> common_cmds;
        public List<String> concerned_data;
        public String course_intro;
        public String equipments;

        @SerializedName("exercise_list")
        public List<Exercise> exercises;
        public String train_frequency;
    }

    public static class CourseTags implements Serializable {
        public List<String> tags;
    }

    public static class DevCmd implements Serializable, Comparable<DevCmd> {
        public static final String CMD_ACTION_SET = "set";
        public static final String CMD_ITEM_FREQUENCY_HOPPING = "frequency_hopping";
        public static final String CMD_ITEM_RESISTANCE = "resistance";
        public static final String CMD_ITEM_SPEED = "speed";
        public String cmd;
        public String time;
        public long timeInMills;

        @SerializedName("object")
        public String triggerItem;

        @SerializedName("value")
        public String triggerValue;
        public static final List<String> CMD_ITEM_WARE = Arrays.asList("speed");
        public static final String CMD_ITEM_FTP_RPM = "ftp_rpm";
        public static final List<String> CMD_ITEM_WARE_FTP = Arrays.asList(CMD_ITEM_FTP_RPM);
        public static final List<String> CMD_ITEM_JUMP = Arrays.asList("frequency_hopping");

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DevCmd devCmd = (DevCmd) obj;
            return this.time.equals(devCmd.time) && this.triggerItem.equals(devCmd.triggerItem);
        }

        public String toString() {
            return "DevCmd{mills=" + this.timeInMills + ", time='" + this.time + "', cmd='" + this.cmd + "', item='" + this.triggerItem + "', value='" + this.triggerValue + '\'' + AbstractJsonLexerKt.END_OBJ;
        }

        public boolean valid() {
            return (TextUtils.isEmpty(this.triggerValue) || TextUtils.isEmpty(this.cmd) || TextUtils.isEmpty(this.triggerItem)) ? false : true;
        }

        @Override // java.lang.Comparable
        public int compareTo(DevCmd devCmd) {
            return (int) (this.timeInMills - devCmd.timeInMills);
        }
    }

    public static class DeviceLinkage implements Serializable {
        public static final String DATA_CALORIE = "calorie";
        public static final String DATA_DISTANCE = "distance";
        public static final String DATA_FREQUENCY_HOPPING = "frequency_hopping";
        public static final String DATA_HRM = "hrm";
        public static final String DATA_PACE = "pace";
        public static final String DATA_POWER = "power";
        public static final String DATA_RESISTANCE = "resistance";
        public static final String DATA_RPM = "rpm";
        public static final String DATA_SPEED = "speed";
        public static final int LINKAGE_SUPPORT = 1;
        public static final int STYLE_DARK = 2;
        public static final int STYLE_LIGHT = 1;

        @SerializedName("common_cmds")
        public List<DevCmd> commonCmd;
        public List<String> concernDataSet;

        @SerializedName("concerned_data")
        public String concernedData;

        @SerializedName("female_cmds")
        public List<DevCmd> femaleCmd;

        @SerializedName("male_cmds")
        public List<DevCmd> maleCmd;
        public Set<String> models;

        @SerializedName("concerned_data_display_style")
        public int style;

        @SerializedName("support_linkage")
        public int supportLink;
        public static final String DATA_GEAR = "gear";
        public static final String DATA_JUMP_ROP_COUNT = "jump_rop_count";
        public static final Set<String> DATA_SET = new TreeSet(Arrays.asList("calorie", "distance", "hrm", "pace", "speed", DATA_GEAR, "power", "rpm", "resistance", "frequency_hopping", DATA_JUMP_ROP_COUNT));
    }

    public static class Exercise implements Serializable {

        @SerializedName("common_preview_image_url")
        public String commonPreviewImage;

        @SerializedName("female_preview_image_url")
        public String femalePreviewImage;

        @SerializedName("exercise_id")
        public long id;

        @SerializedName("male_preview_image_url")
        public String malePreviewImage;

        @SerializedName("sub_title")
        public String subTitle;
        public String title;
        public int type;
    }

    public static class PreviewImg implements Serializable {

        @SerializedName("big_preview_image_url")
        public String large;

        @SerializedName("middle_preview_image_url")
        public String middle;

        @SerializedName("small_preview_image_url")
        public String small;
    }

    public static class VersionControl {

        @SerializedName("max_player_version")
        String maxPlayerVersion;

        @SerializedName("min_player_version")
        String minPlayerVersion;
    }

    public static class VideoInfo implements Serializable {

        @SerializedName("common_video_segments")
        public List<VideoSegment> commonSegments;

        @SerializedName("common_video_size")
        public long commonVideoSize;

        @SerializedName("common_video_url")
        public String commonVideoUrl;

        @SerializedName("female_video_segments")
        public List<VideoSegment> femaleSegments;

        @SerializedName("female_video_size")
        public long femaleVideoSize;

        @SerializedName("female_video_url")
        public String femaleVideoUrl;

        @SerializedName("male_video_segments")
        public List<VideoSegment> maleSegments;

        @SerializedName("male_video_size")
        public long maleVideoSize;

        @SerializedName("male_video_url")
        public String maleVideoUrl;

        @SerializedName("preview_video_url")
        public String previewVideoUrl;

        @SerializedName("common_video_for_tv_1080_url")
        public String tvCommon1080Url;

        @SerializedName("common_video_for_tv_4k_url")
        public String tvCommon4KUrl;

        @SerializedName("common_video_for_tv_720_url")
        public String tvCommon720Url;

        @SerializedName("female_video_for_tv_1080_url")
        public String tvFemale1080Url;

        @SerializedName("female_video_for_tv_4k_url")
        public String tvFemale4KUrl;

        @SerializedName("female_video_for_tv_720_url")
        public String tvFemale720Url;

        @SerializedName("male_video_for_tv_1080_url")
        public String tvMale1080Url;

        @SerializedName("male_video_for_tv_4k_url")
        public String tvMale4kUrl;

        @SerializedName("male_video_for_tv_720_url")
        public String tvMale720Url;
    }

    public static class VideoSegment implements Serializable, Comparable<VideoSegment> {

        @SerializedName("countdown_duration")
        int countDownDuration;

        @SerializedName("exercise_id")
        long exerciseId;

        @SerializedName("has_exercise_detail")
        int hasExerciseDetail;

        @SerializedName("highlight_data_item")
        String highLightData;

        @SerializedName("highlight_duration")
        int hightLightDuration;

        @SerializedName("intro")
        String introduction;

        @SerializedName("start_countdown_time")
        String startCountDownTime;
        public String time;
        public long timeInMills;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.timeInMills == ((VideoSegment) obj).timeInMills;
        }

        public String toString() {
            return "VideoSegment{time='" + this.time + "', timeInMills=" + this.timeInMills + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // java.lang.Comparable
        public int compareTo(VideoSegment videoSegment) {
            return (int) (this.timeInMills - videoSegment.timeInMills);
        }
    }
}
