package com.xiaomi.hm.health.bt.profile.alert;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes11.dex */
public enum HMAlertApp {
    WECHAT((byte) 0),
    QQ((byte) 1),
    MTALKING((byte) 2),
    FACEBOOK((byte) 3),
    TWITTER((byte) 4),
    MSPORT((byte) 5),
    SNAPCHAT((byte) 6),
    WHATSAPP((byte) 7),
    WEIBO((byte) 8),
    TAOBAO((byte) 9),
    ALARM((byte) 10),
    INSTAGRAM(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT),
    MOMO(HMProSyncDataBaseProfile.DATA_TYPE_PAI),
    QIANNIU(HMProSyncDataBaseProfile.DATA_TYPE_COACHING),
    TIEBA((byte) 15),
    ZHIFUBAO((byte) 16),
    QQZONE((byte) 17),
    XIANYU(HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE),
    JD(HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY),
    DINGDING((byte) 20),
    CALENDAR((byte) 21),
    FMESSENGER((byte) 22),
    VIBER((byte) 23),
    LINE((byte) 24),
    MESSENGER((byte) 25),
    KAKAOTALK((byte) 26),
    SKYPE((byte) 27),
    VKONTAKTE((byte) 28),
    POKEMON(HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR),
    HANGOUTS(HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC),
    MISHOP((byte) 31),
    TIM((byte) 32),
    YOUTUBE(SettingsModule.VALUE_TYPE_STRING_ENUM),
    AMAZFIT((byte) 34),
    WEATHER_ALERT(HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL),
    CARE(HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE),
    PHONE_ALRM(HMProSyncDataBaseProfile.DATA_SPO2_POINT),
    MI_JIA(HMProSyncDataBaseProfile.DATA_SPO2_OSA),
    QQ_EMAIL(HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT),
    TENCENT_NEWS(HMProSyncDataBaseProfile.DATA_SPO2_ODI),
    ARTICLE_NEWS(HMProSyncDataBaseProfile.DATA_STAND_HOUR),
    MOJI(HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY),
    PIN_DUO_DUO(HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK),
    ZHI_HU(HMProSyncDataBaseProfile.DATA_STATISTIC_V2),
    QQ_MUSIC((byte) 45),
    DOU_YIN(HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY),
    XIAN_YU(HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE),
    DI_DI((byte) 48),
    AI_QI_YI((byte) 49),
    QQ_LIVE(HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR),
    ZHAOSHANG_BANK((byte) 51),
    YOU_KU(HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG),
    KU_GOU(HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC),
    BAI_DU(HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG),
    BAI_DU_MAP(HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT),
    GAO_DE_MAP(HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA),
    TENCENT_WE_WORK(HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT),
    KEEP(HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE),
    MEI_TUAN((byte) 59),
    TIMEX_SMART((byte) 60),
    TIK_TOK(Base64.padSymbol),
    GMAIL((byte) 63),
    HONGBAO((byte) -2),
    GENERIC((byte) -1);

    private byte mValue;

    HMAlertApp(byte b2) {
        this.mValue = b2;
    }

    public byte getValue() {
        return this.mValue;
    }
}
