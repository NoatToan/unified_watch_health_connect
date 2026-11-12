package com.xiaomi.hm.health.speech.constant;

import com.huami.ai.speech.xiaoai.capability.instruction.custom.CustomSkillIntentKt;

/* JADX INFO: loaded from: classes21.dex */
public enum BandSeriesDeviceSkill {
    DEFAULT_SKILL("default_skill"),
    EVENT_REMINDER("event_reminder"),
    ALARM_REMINDER("alarm_reminder"),
    QUERY_WEATHER("query_weather"),
    FIND_PHONE(CustomSkillIntentKt.INTENT_FIND_DEVICE),
    OPEN_ALIPAY(CustomSkillIntentKt.INTENT_ALIPAY),
    COUNTDOWN("countdown"),
    OUTDOOR_RUN(CustomSkillIntentKt.INTENT_RUN_OUT_DOOR),
    INDOOR_RUN(CustomSkillIntentKt.INTENT_RUN_IN_DOOR),
    WALKING(CustomSkillIntentKt.INTENT_WALKING),
    SWIMMING(CustomSkillIntentKt.INTENT_POLL_SWIM),
    TRAINING("training"),
    CYCLING(CustomSkillIntentKt.INTENT_CYCLING),
    NOTIFICATION(CustomSkillIntentKt.INTENT_NOTIFICATION),
    DND("base_device_dnd"),
    STOPWATCH(CustomSkillIntentKt.INTENT_STOPWATCH),
    MUSIC_CONTROL(CustomSkillIntentKt.INTENT_MUSIC_CONTROL),
    CARD_PACK(CustomSkillIntentKt.INTENT_CARD_PACK),
    WATCH_FACE_SETTING(CustomSkillIntentKt.INTENT_FACE_SETTING),
    DEVICE_MUTE("base_device_mute"),
    BRIGHTNESS(CustomSkillIntentKt.INTENT_OPEN_BRIGHTNESS),
    ACTIVITY_STATUS(CustomSkillIntentKt.INTENT_ACTIVITY_STATUS),
    HEART_RATE(CustomSkillIntentKt.INTENT_HEART_RATE);

    private String bandSeriesDeviceSkillDesc;

    BandSeriesDeviceSkill(String bandSeriesDeviceSkillDesc) {
        this.bandSeriesDeviceSkillDesc = bandSeriesDeviceSkillDesc;
    }

    public static BandSeriesDeviceSkill getDeviceSkillByDeviceSkillDesc(String skillDesc) {
        BandSeriesDeviceSkill bandSeriesDeviceSkill = DEFAULT_SKILL;
        for (BandSeriesDeviceSkill bandSeriesDeviceSkill2 : values()) {
            if (skillDesc.equals(bandSeriesDeviceSkill2.getBandSeriesDeviceSkillDesc())) {
                bandSeriesDeviceSkill = bandSeriesDeviceSkill2;
            }
        }
        return bandSeriesDeviceSkill;
    }

    public String getBandSeriesDeviceSkillDesc() {
        return this.bandSeriesDeviceSkillDesc;
    }
}
