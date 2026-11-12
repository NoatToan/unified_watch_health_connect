package com.huawei.operation.h5pro.jsmodules.common;

import android.os.Build;
import defpackage.btw;
import defpackage.ffv;
import defpackage.qsr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class AbilitiesConfig {
    private static final List<String> ABILITIES;

    static {
        ArrayList arrayList = new ArrayList();
        ABILITIES = arrayList;
        arrayList.add("SUPPORT_DREAM_TALK_SHARE");
        arrayList.add("SHOW_SLEEP_REPORT_ANALYSIS");
        arrayList.add("SUPPORT_SLEEP_SURVEY_RESULT");
        arrayList.add("supportSaveToAlbum");
        arrayList.add("COMMON_TRADE_VIEW");
        arrayList.add("SUPPORT_FREETRAINING");
        arrayList.add("SUPPORT_FITNESS_TARGET_MINUTE");
        arrayList.add("MY_ANNUAL_FLAG_IS_SUPPORT");
        arrayList.add("HEALTH_LIFE_JUMP_WEEK_REPORT");
        arrayList.add("FASTING_LITE_VIP");
        arrayList.add("SUPPORT_MEMBER_PAY_MODAL");
        arrayList.add("ABTEST_SUPPORT");
        arrayList.add("AUDIO_CONTROL_NOTIFICATION");
        arrayList.add("SUPPORT_DEVICE_CERT_CHAIN");
        arrayList.add("SUPPORT_AI_PLAN_BODY_SHAPE");
        arrayList.add("OUTSEA_HMS_SEARCH");
        arrayList.add("WALK_UP");
        arrayList.add("HEALTH_LIFE_PRIVACY_AGREEMENT");
        arrayList.add("TOP_MOUNTING");
        arrayList.add("MENSTRUAL_SUB_STATUS");
        arrayList.add("SUPPORT_RECIPE_WEIGHT_TARGET");
        arrayList.add("SUPPORT_VIP_TRANSFER");
        arrayList.add("SUPPORT_NATIVE_VIP_PAY_VIEW");
        arrayList.add("SUPPORT_NATIVE_EXCLUSIVE_PAY_VIEW");
        arrayList.add("KIT_SAVE_SAMPLES_MULTI_TYPE_SUPPORT");
        arrayList.add("SUPPORT_AI_PLAN_VIEW");
        arrayList.add("SUPPORT_COMPLAINT");
        arrayList.add("HEALTH_CLOVERS");
        arrayList.add("SUPPORT_H5_EXIT_RESULT");
        arrayList.add("SLEEP_MANAGEMENT_SUPPORT");
        arrayList.add("SCUBA_DIVE_DATA");
        arrayList.add("SUPPORT_H5_MODIFY_SYMPTOMS");
        arrayList.add("HEALTH-HEADLINES-SUPPORT-TAB-SHARE");
        arrayList.add("SUPPORT_PERMISSION_EXT_API");
        arrayList.add("SUPPORT_SCANKIT_PERMISSION_OPTIMIZED");
        arrayList.add("SUPPORT_MICRO_CHECKUP");
        arrayList.add("SUPPORT_SHORT_VIDEO");
        arrayList.add("SUPPORT_PRESSURE_NEW_API");
        arrayList.add("SUPPORT_AWARD_PAGE_BI");
        arrayList.add("SUPPORT_MEMBER_REDEMPTION_CODE_SCAN");
        arrayList.add("IS_SUPPORT_VIEW_HEALTH_RECORD");
        arrayList.add("HEALTH_TREND_SUPPORT_STEP_WORKOUT");
        arrayList.add("HEALTH_TREND_SUPPORT_MOVE_STAND");
        arrayList.add("SUPPORT_QUERY_MOTION_TRACK");
        arrayList.add("HEALTH_HEADLINES_SUPPORT_PLAY_ONCE");
        arrayList.add("SUPPORT_HEALTH_MANAGEMENT_SHOW_TOAST");
        arrayList.add("SUPPORT_OPEN_HEALTH_SWITCH");
        arrayList.add("SUPPORT_SETTING_UPPER_LIMIT_STATISTICS");
        arrayList.add("SUPPORT_UNI_RECOGNIZE");
        arrayList.add("APP_SUPPORT_REVERSE_CONTROL_COURSE");
        arrayList.add("FASTING_LITE_SHARE");
        arrayList.add("FAT_REDUCING_SHAPING_WEEK_REPORT");
        arrayList.add("IS_SUPPORT_MENSTRUAL_CAPABILITY");
        arrayList.add("WEIGHT_FA_SUPPORT");
        arrayList.add("SUPPORT_PRIVACY_COLLECTION_DYNAMIC_REPORT");
        arrayList.add("SUPPORT_AUDIO_PLAYER");
        arrayList.add("SUPPORT_DEEPLINK_NO_PACKAGE_NAME");
        arrayList.add("SUPPORT_DEEPLINK_ACCOUNTER_CENTER");
        arrayList.add("SUPPORT_MICRO_RECORD_BODY_STAT");
        arrayList.add("SLEEP_APNEA_SUPPORT_NMPA");
        arrayList.add("SUPPORT_HIGHLIGHT");
        arrayList.add("SUPPORT_FAMILY_POSITION");
        arrayList.add("SUPPORT_EMOTION");
        arrayList.add("SUPPORT_ADDRESS_BOOK");
        arrayList.add("SUPPORT_EUROPE_EMOTION");
        arrayList.add("HEALTHOPERATIONURL_SUPPORT");
        arrayList.add("SUPPORT_MICRO_CHECKUP_TREND_PLOT");
        arrayList.add("KIT_BATCH_DELETE_WATCH_FACE_SUPPORT");
        arrayList.add("REPORTING_INTERFACE_SUPPORT");
        arrayList.add("SUPPORT_INNERAPI_GETAPPCLIENTINFO");
        arrayList.add("SUPPORT_MY_WATCHFACE_UPDATE");
        arrayList.add("SUPPORT_EXCLUSIVE_DOCTOR_CARD");
        arrayList.add("SUPPORT_DIALOG_MODAL");
        arrayList.add("SUPPORT_REFRESH_AT");
        arrayList.add("SUPPORT_GOLF_ANON_INTERFACE");
        arrayList.add("CYCLE_CALENDAR_SUPPORT_EASY_PREGNANCY_SWITCH");
        arrayList.add("SUPPORT_FORCE_M3U8_PLAY");
        arrayList.add("SUPPORT_TARGET_SDK_34");
        arrayList.add("SUPPORT_NEW_MEMBER_CENTER");
        arrayList.add("SUPPORT_SINGLE_MEASURE_NEW");
        arrayList.add("SUPPORT_MCU_MODE");
        arrayList.add("HEART_RATE_SUPPORT_HRV");
        if (Build.VERSION.SDK_INT >= 29) {
            arrayList.add("SUPPORT_WATCHFACE_VIDEO");
        }
        arrayList.add("SUPPORT_VERIFY_ACCOUNT");
        arrayList.add("SUPPORT_VERIFY_ACCOUNT_NEW");
        arrayList.add("SUPPORT_H5_SPORT_SHARE");
        arrayList.add("IS_SUPPORT_MY_PATH_LOOP");
        arrayList.add("SUPPORT_ROUTE_EXPORT");
        arrayList.add("SUPPORT_RW_SAMPLE_CONFIG_LIST");
        arrayList.add("SUPPORT_GET_DEVICE_LISTS");
        arrayList.add("SUPPORT_LOADH5PROAPP_ISEXIT");
        arrayList.add("SUPPORT_WATCH_FACE_STICKER_CUSTOM");
        arrayList.add("SUPPORT_CUSTOM_RECIPE_FAT_GUIDE");
        arrayList.add("IS_SUPPORT_OVULATION_CAPABILITY");
        arrayList.add("DEVICE_SUPPORT_DETECTION");
        arrayList.add("SUPPORT_HELP");
        arrayList.add("DM_SUPPORT_ESIM");
        arrayList.add("DM_WEAR_DEVICE_SUPPORT_OTA");
        arrayList.add("DM_SUPPORT_TO_DO_DELETION");
        arrayList.add("EASY_PREGANCY_SWITCH_SYNC_CAPABILITY");
        arrayList.add("SUPPORT_ONETOUCH_PROGRESS");
        arrayList.add("SUPPORT_GOLF_SCORE_CARD_MODIFY");
        arrayList.add("SUPPORT_SOS_HELP_SETTINGS");
        arrayList.add("SUPPORT_HIGHLIGHT_HISTORY");
        arrayList.add("SUPPORT_HEALTH_HEAD_PLAY_SPEED");
        arrayList.add("SUPPORT_GOLF_MAP_AUTO_DOWNLOAD");
        arrayList.add("SUPPORT_SCREEN_SHOT_SETTINGS");
        arrayList.add("SUPPORT_GOLF_DYNAMIC_MOTIONTRACK_SHARE");
        arrayList.add("SUPPORT_GROUP_TEAM_ACTIVITY");
        arrayList.add("SUPPORT_NOT_GOAL_GOTO_SPORT_PUSH");
        arrayList.add("SUPPORT_WEIGHT_INPUT");
        arrayList.add("CLOVER_FREE_SUPPORT_INTENSITY");
        arrayList.add("SUPPORT_NPS_INFO");
        arrayList.add("BETA_FOR_DEVICE");
        arrayList.add("SUPPORT_ACTIVE_TARGET_2025");
        arrayList.add("SUPPORT_WATCHFACE_SHARE");
        arrayList.add("SUPPORT_PICTURE_RECOGNITION_NEW");
        arrayList.add("SUPPORT_PICTURE_RECOGNITION_FOR_RESULT");
        arrayList.add("SUPPORT_H5_GOLF_PRACTICE");
        arrayList.add("SUPPORT_NEW_MENSTRUAL_PREDICT_SWITCH");
        arrayList.add("SUPPORT_SPORT_RECORD_RENAME");
        arrayList.add("SUPPORT_WEIGHT_MEASUREMENT_REMINDER");
        arrayList.add("SUPPORT_DIET_OR_PLAN_CLOUD_REQUEST");
        if (btw.i()) {
            arrayList.add("SUPPORT_TRAIN_PLAN");
        }
        if (ffv.t()) {
            arrayList.add("SUPPORT_HEALTH_LIFE");
        }
        arrayList.add("SUPPORT_AIWEIGHT_V2");
        arrayList.add("SUPPORT_PROMOTION_DIALOG");
        arrayList.add("IS_SUPPORT_MERGE_DATA_CACHE");
        arrayList.add("SUPPORT_MARATHON_SPORT_TYPE");
        arrayList.add("IS_SUPPORT_WRIST_TEMP_CAPABILITY");
        arrayList.add("SUPPORT_ANDROID_OVERSEAS_COLLECTION");
        arrayList.add("IS_SUPPORT_SLEEP_APNEA_DELETE");
        arrayList.add("MENSTRUAL_SUPPORT_MANUAL_OPERATION");
        arrayList.add("SUPPORT_TRAIN_PLAN_SETTING");
        arrayList.add("IS_COURSE_SUPPORT_INDOOR_RUN");
        if (qsr.c().i()) {
            arrayList.add("SUPPORT_CUSTOM_RECIPE_V2");
        }
        arrayList.add("SUPPORT_NEW_QUICK_ENTRY");
    }

    private AbilitiesConfig() {
    }

    public static List<String> getAbilities() {
        return Collections.unmodifiableList(ABILITIES);
    }
}
