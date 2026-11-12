package com.xiaomi.hm.health.bt.profile.alert;

import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;

/* JADX INFO: loaded from: classes10.dex */
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
    INSTAGRAM((byte) 12),
    MOMO((byte) 13),
    QIANNIU((byte) 14),
    TIEBA((byte) 15),
    ZHIFUBAO((byte) 16),
    QQZONE((byte) 17),
    XIANYU((byte) 18),
    JD((byte) 19),
    DINGDING((byte) 20),
    CALENDAR((byte) 21),
    FMESSENGER((byte) 22),
    VIBER((byte) 23),
    LINE((byte) 24),
    MESSENGER((byte) 25),
    KAKAOTALK((byte) 26),
    SKYPE((byte) 27),
    VKONTAKTE((byte) 28),
    POKEMON((byte) 29),
    HANGOUTS((byte) 30),
    MISHOP((byte) 31),
    TIM((byte) 32),
    YOUTUBE((byte) 33),
    AMAZFIT(HMDisplaySetting.TYPE_HAWK_SWK),
    WEATHER_ALERT((byte) 35),
    CARE((byte) 36),
    PHONE_ALRM((byte) 37),
    MI_JIA((byte) 38),
    QQ_EMAIL((byte) 39),
    TENCENT_NEWS((byte) 40),
    ARTICLE_NEWS((byte) 41),
    MOJI((byte) 42),
    PIN_DUO_DUO((byte) 43),
    ZHI_HU((byte) 44),
    QQ_MUSIC((byte) 45),
    DOU_YIN((byte) 46),
    XIAN_YU((byte) 47),
    DI_DI((byte) 48),
    AI_QI_YI(HMDisplaySetting.TYPE_OSPREY_W),
    QQ_LIVE((byte) 50),
    ZHAOSHANG_BANK(HMDisplaySetting.TYPE_VENICE),
    YOU_KU((byte) 52),
    KU_GOU((byte) 53),
    BAI_DU((byte) 54),
    BAI_DU_MAP((byte) 55),
    GAO_DE_MAP((byte) 56),
    TENCENT_WE_WORK((byte) 57),
    KEEP((byte) 58),
    MEI_TUAN(MiLiProProfile.ECF_WRITE_PAI_DATA),
    TIMEX_SMART(MiLiProProfile.ECF_COMMAND_SET_BEEP),
    TIK_TOK((byte) 61),
    GMAIL(HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY),
    HONGBAO((byte) -2),
    GENERIC((byte) -1);

    private byte mValue;

    HMAlertApp(byte value) {
        this.mValue = value;
    }

    public byte getValue() {
        return this.mValue;
    }
}
