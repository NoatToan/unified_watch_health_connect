package com.huami.watch.companion.sport;

import android.content.Context;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.ui.activity.SportItemSortActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class SportSortConfig {
    public static final int DATA_ITEM_ABSOLUTE_ALTITUDE = 7;
    public static final int DATA_ITEM_AVERAGE_FREQUENCY = 40;
    public static final int DATA_ITEM_AVE_PACE = 4;
    public static final int DATA_ITEM_AVE_SPEED = 11;
    public static final int DATA_ITEM_AVG_STROKE_FREQ = 60;
    public static final int DATA_ITEM_AVG_STROKE_SPEED = 19;
    public static final int DATA_ITEM_CADENCE = 15;
    public static final int DATA_ITEM_CALARIE = 6;
    public static final int DATA_ITEM_CUMULATIVE_CLIMB = 8;
    public static final int DATA_ITEM_CUMULATIVE_DECREASE = 9;
    public static final int DATA_ITEM_CURRENT_FREQUENCY = 38;
    public static final int DATA_ITEM_CURRENT_GROUP_COUNT = 41;
    public static final int DATA_ITEM_CUR_LAP_AVG_HEART_RATE = 49;
    public static final int DATA_ITEM_CUR_LAP_AVG_STEP_FREQ = 50;
    public static final int DATA_ITEM_CUR_LAP_DIS = 46;
    public static final int DATA_ITEM_CUR_LAP_PACE = 47;
    public static final int DATA_ITEM_CUR_LAP_SPEED = 48;
    public static final int DATA_ITEM_CUR_LAP_TIME = 45;
    public static final int DATA_ITEM_DISTANCE = 2;
    public static final int DATA_ITEM_DOWNHILL_AVG_SPEED = 25;
    public static final int DATA_ITEM_DOWNHILL_MAX_SPEED = 26;
    public static final int DATA_ITEM_DOWNHILL_NUMS = 27;
    public static final int DATA_ITEM_DOWNHILL_SINGLE_DISTANCE = 28;
    public static final int DATA_ITEM_DOWNHILL_SINGLE_ELEVATION_LOSS = 30;
    public static final int DATA_ITEM_DOWNHILL_TOTAL_DISTANCE = 29;
    public static final int DATA_ITEM_DPS = 17;
    public static final int DATA_ITEM_GROUND_SPEED_DISTANCE = 13;
    public static final int DATA_ITEM_HEARTRATE = 5;
    public static final int DATA_ITEM_LAST_LAP_AVG_HEART_RATE = 35;
    public static final int DATA_ITEM_LAST_LAP_AVG_STEP_FREQ = 36;
    public static final int DATA_ITEM_LAST_LAP_PACE = 33;
    public static final int DATA_ITEM_LAST_LAP_SPEED = 34;
    public static final int DATA_ITEM_LAST_LAP_TIME = 32;
    public static final int DATA_ITEM_LAST_SWIM_LAP_PACE = 37;
    public static final int DATA_ITEM_PACE = 3;
    public static final int DATA_ITEM_PULL_TIME = 58;
    public static final int DATA_ITEM_RETURN_TIME = 59;
    public static final int DATA_ITEM_RT_STROKE_SPEED = 18;
    public static final int DATA_ITEM_RT_TE = 23;
    public static final int DATA_ITEM_SPEED = 10;
    public static final int DATA_ITEM_STEP_COUNT = 14;
    public static final int DATA_ITEM_STEP_FREQ = 12;
    public static final int DATA_ITEM_STROKE_FREQUENCY = 57;
    public static final int DATA_ITEM_SWIM_AVG_PACE = 21;
    public static final int DATA_ITEM_SWIM_DISTANCE = 22;
    public static final int DATA_ITEM_SWIM_RT_PACE = 20;
    public static final int DATA_ITEM_TENNIS_STROKES = 31;
    public static final int DATA_ITEM_THIS_GROUP_AVERAGE_FREQUENCY = 44;
    public static final int DATA_ITEM_THIS_GROUP_AVERAGE_HR = 53;
    public static final int DATA_ITEM_THIS_GROUP_AVERAGE_STROKE_FREQUENCY = 55;
    public static final int DATA_ITEM_THIS_GROUP_CALORIE = 52;
    public static final int DATA_ITEM_THIS_GROUP_COST_TIME = 43;
    public static final int DATA_ITEM_THIS_GROUP_COUNT = 42;
    public static final int DATA_ITEM_THIS_GROUP_STROKE_COUNT = 54;
    public static final int DATA_ITEM_TIME_COST = 1;
    public static final int DATA_ITEM_TOTAL_COUNT = 39;
    public static final int DATA_ITEM_TOTAL_STROKES = 56;
    public static final int DATA_ITEM_TRIPS = 16;
    public static final int DATA_ITEM_VERTICAL_VELOCITY = 24;
    public static final String KEY_CLIMB_MOUNTAINS_ORDER = "climbmountains";
    public static final String KEY_CROSS_COUNTRY_ORDER = "crosscounty";
    public static final String KEY_ELLIPTICAL_ORDER = "elliptical";
    public static final String KEY_HIKING_ORDER = "hiking";
    public static final String KEY_INDOOR_FITNESS = "indoorfitness";
    public static final String KEY_INDOOR_RIDING_ORDER = "indoorride";
    public static final String KEY_INDOOR_RUN_ORDER = "indoorrun";
    public static final String KEY_INDOOR_SWIM_ORDER = "indoorswim";
    public static final String KEY_OPEN_WATER_SWIM_ORDER = "openwaterswim";
    public static final String KEY_OUTDOOR_RIDING_ORDER = "outdoorride";
    public static final String KEY_ROPE_SKIPPING_ORDER = "jumpRope";
    public static final String KEY_ROWING_MACHINE_ORDER = "rowingmachine";
    public static final String KEY_RUNNING_ORDER = "running";
    public static final String KEY_SKIING_ORDER = "skiing";
    public static final String KEY_SOCCER_ORDER = "soccer";
    public static final String KEY_TENNIS_ORDER = "tennis";
    public static final String KEY_WALKING_ORDER = "walking";
    public static final String KEY_WORK_OUT = "workout";
    public static final String SPORT_ACTION = "com.huami.watch.sport.sport_order_action";
    private LinkedHashMap<String, SportSortInfo> a;
    public final Map<Integer, Integer> mOrderNameResMap;
    public static final int[] mRunningInfoOrder = {1, 2, 5, 3, 4, 12, 10, 11, 7, 13, 8, 9, 6, 23, 32, 33, 34, 35, 36, 45, 46, 47, 48, 49, 50};
    public static final int[] mWalkingInfoOrder = {14, 1, 2, 5, 6, 12, 3, 4, 10, 11, 32, 34, 35, 36, 45, 46, 48, 49, 50};
    public static final int[] mCrossingInfoOrder = {1, 2, 5, 3, 4, 10, 11, 7, 13, 8, 9, 6, 32, 33, 34, 35, 36, 45, 46, 48, 49, 50};
    public static final int[] mIndoorRunningInfoOrder = {1, 2, 3, 5, 4, 6, 10, 11, 12, 32, 33, 34, 35, 36, 45, 46, 48, 49, 50};
    public static final int[] mOutdoorRidingInfoOrder = {1, 2, 5, 10, 11, 7, 13, 8, 9, 6, 32, 34, 35, 45, 46, 48, 49};
    public static final int[] mIndoorRidingInfoOrder = {1, 5, 6};
    public static final int[] mEllipticalInfoOrder = {1, 5, 6};
    public static final int[] mSwimmingInfoOrder = {1, 22, 16, 17, 18, 19, 20, 21, 6, 32, 37};
    public static final int[] mOpenWaterSwimmingInfoOrder = {1, 22, 18, 19, 20, 21, 6, 32, 37};
    public static final int[] mMountaineerInfoOrder = {1, 2, 7, 5, 8, 13, 9, 10, 11, 6, 24};
    public static final int[] mSkiingInfoOrder = {1, 10, 26, 30, 27, 28, 29, 7, 5, 6, 25};
    public static final int[] mTennisInfoOrder = {1, 31, 6, 5};
    public static final int[] mSoccerInfoOrder = {1, 2, 6, 5};
    public static final int[] mRopeSkippingInfoOrder = {1, 38, 39, 40, 5, 6, 41, 42, 43, 44};
    public static final int[] mHikingInfoOrder = {1, 2, 5, 3, 4, 10, 11, 7, 13, 8, 9, 6, 32, 33, 34, 35, 36, 45, 46, 48, 49, 50};
    public static final int[] mRowingMachineInfoOrder = {1, 56, 5, 6, 57, 58, 59, 60, 41, 43, 54, 55};
    public static final int[] mIndoorFitnessOrder = {1, 43, 41, 5, 6, 52, 53};

    public static class SportSortInfo {
        private int a;
        private String b;
        private int c;
        private String d;
        private List<SportItemSortActivity.SportItemData> e;

        public SportSortInfo(int i, String str, int i2, List<SportItemSortActivity.SportItemData> list, String str2) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            this.a = i;
            this.b = str;
            this.c = i2;
            arrayList.addAll(list);
            this.d = str2;
        }

        public String getEvent() {
            return this.d;
        }

        public int getItemCount() {
            return this.c;
        }

        public List<SportItemSortActivity.SportItemData> getItemDataList() {
            return this.e;
        }

        public int getSportIndex() {
            return this.a;
        }

        public String getSportName() {
            return this.b;
        }

        public void setEvent(String str) {
            this.d = str;
        }

        public void setItemCount(int i) {
            this.c = i;
        }

        public void setItemDataList(List<SportItemSortActivity.SportItemData> list) {
            this.e = list;
        }

        public void setSportIndex(int i) {
            this.a = i;
        }

        public void setSportName(String str) {
            this.b = str;
        }
    }

    public class a extends HashMap<Integer, Integer> {
        public a() {
            put(1, Integer.valueOf(R.string.data_item_time_cost));
            put(2, Integer.valueOf(R.string.data_item_distance));
            int i = R.string.data_item_pace;
            put(3, Integer.valueOf(i));
            int i2 = R.string.data_item_avg_pace;
            put(4, Integer.valueOf(i2));
            put(5, Integer.valueOf(R.string.data_item_heartrate));
            put(6, Integer.valueOf(R.string.data_item_calarie));
            put(7, Integer.valueOf(R.string.data_item_cur_altitude));
            put(8, Integer.valueOf(R.string.data_item_cumulative_climb));
            put(9, Integer.valueOf(R.string.data_item_cumulative_decrease));
            put(10, Integer.valueOf(R.string.data_item_speed));
            put(11, Integer.valueOf(R.string.data_item_avg_speed));
            put(12, Integer.valueOf(R.string.data_item_step_freq));
            put(13, Integer.valueOf(R.string.data_item_group_speed_distance_climb));
            put(14, Integer.valueOf(R.string.data_item_step_count));
            put(15, Integer.valueOf(R.string.data_item_cadence));
            put(16, Integer.valueOf(R.string.data_item_trips));
            put(17, Integer.valueOf(R.string.data_item_dps));
            put(18, Integer.valueOf(R.string.data_item_rt_stroke_speed));
            put(19, Integer.valueOf(R.string.data_item_avg_stroke_speed));
            put(20, Integer.valueOf(i));
            put(21, Integer.valueOf(i2));
            put(22, Integer.valueOf(R.string.data_item_range));
            put(23, Integer.valueOf(R.string.data_item_te));
            put(24, Integer.valueOf(R.string.data_item_vertical_speed));
            put(25, Integer.valueOf(R.string.data_item_downhill_avg_speed));
            put(26, Integer.valueOf(R.string.data_item_downhill_max_speed));
            put(27, Integer.valueOf(R.string.data_item_downhill_number));
            put(28, Integer.valueOf(R.string.data_item_downhill_single_distance));
            put(29, Integer.valueOf(R.string.data_item_downhill_total_distance));
            put(30, Integer.valueOf(R.string.data_item_downhill_single_elevation_loss));
            put(31, Integer.valueOf(R.string.data_item_tennis_strokes));
            put(32, Integer.valueOf(R.string.data_item_lap_time));
            int i3 = R.string.data_item_lap_pace;
            put(33, Integer.valueOf(i3));
            put(34, Integer.valueOf(R.string.data_item_lap_speed));
            put(35, Integer.valueOf(R.string.data_item_lap_hr));
            put(36, Integer.valueOf(R.string.data_item_lap_step_freq));
            put(37, Integer.valueOf(i3));
            put(38, Integer.valueOf(R.string.data_item_current_frequency));
            put(39, Integer.valueOf(R.string.data_item_total_count));
            put(40, Integer.valueOf(R.string.data_item_average_frequency));
            put(41, Integer.valueOf(R.string.data_item_current_group_count));
            put(42, Integer.valueOf(R.string.data_item_this_group_count));
            put(43, Integer.valueOf(R.string.data_item_this_group_cost_time));
            put(44, Integer.valueOf(R.string.data_item_this_group_count_average_frequency));
            put(45, Integer.valueOf(R.string.data_item_cur_lap_time));
            put(46, Integer.valueOf(R.string.data_item_cur_lap_dis));
            put(47, Integer.valueOf(R.string.data_item_cur_lap_pace));
            put(48, Integer.valueOf(R.string.data_item_cur_lap_speed));
            put(49, Integer.valueOf(R.string.data_item_cur_lap_hr));
            put(50, Integer.valueOf(R.string.data_item_cur_lap_step_freq));
            put(52, Integer.valueOf(R.string.data_item_cur_group_calorie));
            put(53, Integer.valueOf(R.string.data_item_cur_group_avg_hr));
            put(54, Integer.valueOf(R.string.data_item_cur_group_stroke_count));
            put(55, Integer.valueOf(R.string.data_item_cur_geoup_avg_stroke_freq));
            put(56, Integer.valueOf(R.string.data_item_total_stroke));
            put(57, Integer.valueOf(R.string.data_item_stroke_freq));
            put(58, Integer.valueOf(R.string.data_item_pull_time));
            put(59, Integer.valueOf(R.string.data_item_return_time));
            put(60, Integer.valueOf(R.string.data_item_avg_stroke_freq));
        }
    }

    public SportSortConfig(Context context) {
        a aVar = new a();
        this.mOrderNameResMap = aVar;
        if (DeviceUtil.isSupportNewLap(context)) {
            aVar.put(32, Integer.valueOf(R.string.data_item_last_lap_time));
            int i = R.string.data_item_last_lap_pace;
            aVar.put(33, Integer.valueOf(i));
            aVar.put(34, Integer.valueOf(R.string.data_item_last_lap_speed));
            aVar.put(35, Integer.valueOf(R.string.data_item_last_lap_hr));
            aVar.put(36, Integer.valueOf(R.string.data_item_last_lap_step_freq));
            aVar.put(37, Integer.valueOf(i));
        }
    }

    public LinkedHashMap<String, SportSortInfo> getSportSortInfoMap() {
        return this.a;
    }

    public void setSportSortInfoMap(LinkedHashMap<String, SportSortInfo> linkedHashMap) {
        this.a = linkedHashMap;
    }
}
