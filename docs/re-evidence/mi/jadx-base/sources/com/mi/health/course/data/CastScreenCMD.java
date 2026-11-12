package com.mi.health.course.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class CastScreenCMD {
    public static final int COURSE_MODE_DEEP = 1;
    public static final int COURSE_MODE_LIGHT = 2;
    public static final int TYPE_CONTROL = 2;
    public static final int TYPE_DATA = 1;
    public static final int TYPE_DEVICE_STATUS = 4;
    public static final int TYPE_GET_TV_CLARITY = 3;
    public static final int VIDEO_CLARITY = 3;
    public static final int VIDEO_CLARITY_1080P = 2;
    public static final int VIDEO_CLARITY_4K = 3;
    public static final int VIDEO_CLARITY_720P = 1;
    public static final int VIDEO_DEVICE_HUAMI = 1;
    public static final int VIDEO_DEVICE_THREADMILL = 3;
    public static final int VIDEO_DEVICE_WATCH = 2;
    public static final int VIDEO_STATUS_PLAYING = 1;
    public static final int VIDEO_STATUS_STOP = 2;

    public static class CourseData {
        public int cadence;
        public int calorie;

        @SerializedName("concerned_data")
        public String concernedData;
        public float distance;
        public int gear;
        public int hrm;
        public int power;
        public int resistance;
        public float speed;
        public int step;

        public String toString() {
            return "CourseData{calories=" + this.calorie + ", hrm=" + this.hrm + ", speed=" + this.speed + ", distance=" + this.distance + ", resistance=" + this.resistance + ", cadence=" + this.cadence + ", step=" + this.step + ", power=" + this.power + ", gear=" + this.gear + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class DeviceInfo {

        @SerializedName("device_name")
        public String deviceName;

        @SerializedName("device_status")
        public int deviceStatus;

        @SerializedName(DeviceContractKt.COLUMN_DEVICE_TYPE)
        public int deviceType;

        public DeviceInfo(String str, int i, int i2) {
            this.deviceName = str;
            this.deviceStatus = i;
            this.deviceType = i2;
        }
    }

    public static class FloatWindowData {
        public Integer cadence;
        public int calorie;
        public Integer count;
        public Float distance;
        public long duration;

        @SerializedName("group_flag")
        public int groupFlag;

        @SerializedName("group_info")
        public GroupInfo groupInfo;
        public int hrm;
        public Integer pace;
        public Integer resistance;
        public Float speed;

        @SerializedName("sport_type")
        public int sportType;

        @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
        public long startTime;
        public Integer steps;

        @SerializedName("stumble_times")
        public Integer stumbleTimes;
    }

    public static class GetVideoDataFromTV {
        public int clarity;
        public long progress;
        public int status;
    }

    public static class GroupInfo {
        public long duration;
        public int index;

        @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
        public long startTime;
        public int type;

        public String toString() {
            return "GroupInfo{index=" + this.index + ", type=" + this.type + ", startTime=" + this.startTime + ", duration=" + this.duration + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public enum Operation {
        START(1),
        PAUSE(2),
        RESTART(3),
        STOP(4),
        PROGRESS(5),
        CLARITY(6);

        int operationCmd;

        Operation(int i) {
            this.operationCmd = i;
        }

        public int getOperationCmd() {
            return this.operationCmd;
        }
    }

    public static class SendDevicesStatus {

        @SerializedName("course_mode")
        public int courseMode;

        @SerializedName("devices")
        public List<DeviceInfo> deviceInfos;
        public int type;
        public String uid;
    }

    public static class SendVideoCMD {

        @SerializedName("video_clarity")
        public int clarity;
        public int operation;

        @SerializedName("progress_change")
        public long progress;
        public int type;
        public String uid;
        public String url;
    }

    public static class SendVideoData {
        public Integer course;

        @SerializedName("course_mode")
        public Integer courseMode;

        @SerializedName("current_time")
        public long currentTime;

        @SerializedName("course_data")
        public CourseData data;

        @SerializedName("data_type")
        public int dataType;

        @SerializedName("float_window_data")
        public FloatWindowData floatWindowData;

        @SerializedName(FitnessPersistKey.ReportMaxHr)
        public int maxHr;

        @SerializedName("total_time")
        public long totalTime;
        public int type;
        public String uid;
    }
}
