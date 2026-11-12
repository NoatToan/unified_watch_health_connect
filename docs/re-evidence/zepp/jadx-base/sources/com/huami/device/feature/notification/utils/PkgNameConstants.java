package com.huami.device.feature.notification.utils;

import com.huami.pay.lib.PayConstantsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\bX\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bX\u0010YR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0016\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0004R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0004R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0004R\u0016\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0004R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0004R\u0016\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0004R\u0016\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0004R\u0016\u00104\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0004R\u0016\u00105\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0004R\u0016\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0004R\u0016\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0004R\u0016\u00108\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0004R\u0016\u00109\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0004R\u0016\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0004R\u0016\u0010;\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0004R\u0016\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0004R\u0016\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0004R\u0016\u0010>\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0004R\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0004R\u0016\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0004R\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0004R\u0016\u0010B\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0004R\u0016\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0004R\u0016\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0004R\u0016\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0004R\u0016\u0010F\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\u0004R\u0016\u0010G\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010\u0004R\u0016\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\u0004R\u0016\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010\u0004R\u0016\u0010J\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010\u0004R\u0016\u0010K\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010\u0004R\u0016\u0010L\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010\u0004R\u0016\u0010M\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010\u0004R\u0016\u0010N\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010\u0004R\u0016\u0010O\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010\u0004R\u0016\u0010P\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010\u0004R\u0016\u0010Q\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010\u0004R\u0016\u0010R\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010\u0004R\u0016\u0010S\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010\u0004R\u0016\u0010T\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010\u0004R\u0016\u0010U\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010\u0004R\u0016\u0010V\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010\u0004R\u0016\u0010W\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010\u0004¨\u0006Z"}, d2 = {"Lcom/huami/device/feature/notification/utils/PkgNameConstants;", "", "", "TENCENT_WE_WORK", "Ljava/lang/String;", "FACEBOOK", "MSPORT", "MTALKING", "QQ_MOBILE", "QQ_LITE", "QQ_HD", "QQ_INTERNATIONAL", "SNAPCHAT", "TAOBAO", "TWITTER", PayConstantsKt.PAY_CHANNEL_WECHAT, "WEIBO", "WHATSAPP", "ALIPAY", "ALIPAY2", "MOMO", "LINE", "QIANNIU", "TIEBA", "QQZONE", "XIANYU", "XIANYU2", "MISHOP", "JD", "DINGDING", "CALENDAR_NATIVE", "CALENDAR_GOOGLE", "CALENDAR_VIVO", "VIBER", "TELEGRAM", "FMESSAGE", "KAKAO", "SKYPE", "VKONTAKTE", "INSTAGRAM", "HANGOUTS", "POKEMON", "TIM", "YOUTUBE", "AMAZFIT", "MI_JIA", "QQ_EMAIL", "TENCENT_NEWS", "ARTICAL_NEWS", "PIN_DUO_DUO", "ZHIHU", "QQ_MUSIC", "DOU_YIN", "DIDI", "AIQIYI", "QQ_LIVE", "CMB_BANK", "YOUKU", "KUGOU", "BAIDU", "BAIDU_MAP", "GAODE_MAP", "KEEP", "MEITUAN", "TIMEX", "EMAIL_NATIVE", "EMAIL_GMAIL", "MMS", "MMS_SERVICE", "MMS_NUBIA", "MMS_ONE_PLUS", "MESSAGES_GOOGLE", "CONTACTS_MIUI", "CONTACTS_ONEPLUS", "CONTACTS_SAMSUNG", "CONTACTS_HUAWEI_OPPO", "CONTACTS_VIVO", "CLOCK", "CALENDAR_365", "DIDA", "FEI_SHU", "TIK_TOK", "EMAIL_OUTLOOK", "EMAIL_AOL", "EMAIL_YAHOO", "MIUI_ALERT", "XMSF", "SLACK", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class PkgNameConstants {

    @NotNull
    public static final String AIQIYI = "com.qiyi.video";

    @NotNull
    public static final String ALIPAY = "com.eg.android.alipaygphone";

    @NotNull
    public static final String ALIPAY2 = "com.eg.android.AlipayGphone";

    @NotNull
    public static final String AMAZFIT = "com.huami.watch.hmwatchmanager";

    @NotNull
    public static final String ARTICAL_NEWS = "com.ss.android.article.news";

    @NotNull
    public static final String BAIDU = "com.baidu.searchbox";

    @NotNull
    public static final String BAIDU_MAP = "com.baidu.BaiduMap";

    @NotNull
    public static final String CALENDAR_365 = "com.when.coco";

    @NotNull
    public static final String CALENDAR_GOOGLE = "com.google.android.calendar";

    @NotNull
    public static final String CALENDAR_NATIVE = "com.android.calendar";

    @NotNull
    public static final String CALENDAR_VIVO = "com.bbk.calendar";

    @NotNull
    public static final String CLOCK = "com.android.deskclock";

    @NotNull
    public static final String CMB_BANK = "cmb.pb";

    @NotNull
    public static final String CONTACTS_HUAWEI_OPPO = "com.android.contacts";

    @NotNull
    public static final String CONTACTS_MIUI = "com.android.server.telecom";

    @NotNull
    public static final String CONTACTS_ONEPLUS = "com.android.dialer";

    @NotNull
    public static final String CONTACTS_SAMSUNG = "com.samsung.android.dialer";

    @NotNull
    public static final String CONTACTS_VIVO = "com.android.phone";

    @NotNull
    public static final String DIDA = "cn.ticktick.task";

    @NotNull
    public static final String DIDI = "com.sdu.didi.psnger";

    @NotNull
    public static final String DINGDING = "com.alibaba.android.rimet";

    @NotNull
    public static final String DOU_YIN = "com.ss.android.ugc.aweme";

    @NotNull
    public static final String EMAIL_AOL = "com.aol.mobile.aolapp";

    @NotNull
    public static final String EMAIL_GMAIL = "com.google.android.gm";

    @NotNull
    public static final String EMAIL_NATIVE = "com.android.email";

    @NotNull
    public static final String EMAIL_OUTLOOK = "com.microsoft.office.outlook";

    @NotNull
    public static final String EMAIL_YAHOO = "com.yahoo.mobile.client.android.mail";

    @NotNull
    public static final String FACEBOOK = "com.facebook.katana";

    @NotNull
    public static final String FEI_SHU = "com.ss.android.lark";

    @NotNull
    public static final String FMESSAGE = "com.facebook.orca";

    @NotNull
    public static final String GAODE_MAP = "com.autonavi.minimap";

    @NotNull
    public static final String HANGOUTS = "com.google.android.talk";

    @NotNull
    public static final String INSTAGRAM = "com.instagram.android";

    @NotNull
    public static final PkgNameConstants INSTANCE = new PkgNameConstants();

    @NotNull
    public static final String JD = "com.jingdong.app.mall";

    @NotNull
    public static final String KAKAO = "com.kakao.talk";

    @NotNull
    public static final String KEEP = "com.gotokeep.keep";

    @NotNull
    public static final String KUGOU = "com.kuguo.android";

    @NotNull
    public static final String LINE = "jp.naver.line.android";

    @NotNull
    public static final String MEITUAN = "com.sankuai.meituan";

    @NotNull
    public static final String MESSAGES_GOOGLE = "com.google.android.apps.messaging";

    @NotNull
    public static final String MISHOP = "com.xiaomi.shop";

    @NotNull
    public static final String MIUI_ALERT = "com.android.deskclock";

    @NotNull
    public static final String MI_JIA = "com.xiaomi.smarthome";

    @NotNull
    public static final String MMS = "com.android.mms";

    @NotNull
    public static final String MMS_NUBIA = "cn.nubia.mms";

    @NotNull
    public static final String MMS_ONE_PLUS = "com.oneplus.mms";

    @NotNull
    public static final String MMS_SERVICE = "com.android.mms.service";

    @NotNull
    public static final String MOMO = "com.immomo.momo";

    @NotNull
    public static final String MSPORT = "com.xiaomi.hm.health";

    @NotNull
    public static final String MTALKING = "com.xiaomi.channel";

    @NotNull
    public static final String PIN_DUO_DUO = "com.xunmeng.pinduoduo";

    @NotNull
    public static final String POKEMON = "com.nianticlabs.pokemongo";

    @NotNull
    public static final String QIANNIU = "com.taobao.qianniu";

    @NotNull
    public static final String QQZONE = "com.qzone";

    @NotNull
    public static final String QQ_EMAIL = "com.tencent.androidqqmail";

    @NotNull
    public static final String QQ_HD = "com.tencent.minihd.qq";

    @NotNull
    public static final String QQ_INTERNATIONAL = "com.tencent.mobileqqi";

    @NotNull
    public static final String QQ_LITE = "com.tencent.qqlite";

    @NotNull
    public static final String QQ_LIVE = "com.tencent.qqlive";

    @NotNull
    public static final String QQ_MOBILE = "com.tencent.mobileqq";

    @NotNull
    public static final String QQ_MUSIC = "com.tencent.qqmusic";

    @NotNull
    public static final String SKYPE = "com.skype.raider";

    @NotNull
    public static final String SLACK = "com.Slack";

    @NotNull
    public static final String SNAPCHAT = "com.snapchat.android";

    @NotNull
    public static final String TAOBAO = "com.taobao.taobao";

    @NotNull
    public static final String TELEGRAM = "org.telegram.messenger";

    @NotNull
    public static final String TENCENT_NEWS = "tencent.news";

    @NotNull
    public static final String TENCENT_WE_WORK = "com.tencent.wework";

    @NotNull
    public static final String TIEBA = "com.baidu.tieba";

    @NotNull
    public static final String TIK_TOK = "com.ss.android.ugc.trill";

    @NotNull
    public static final String TIM = "com.tencent.tim";

    @NotNull
    public static final String TIMEX = "com.timex.app.android";

    @NotNull
    public static final String TWITTER = "com.twitter.android";

    @NotNull
    public static final String VIBER = "com.viber.voip";

    @NotNull
    public static final String VKONTAKTE = "com.vkontakte.android";

    @NotNull
    public static final String WECHAT = "com.tencent.mm";

    @NotNull
    public static final String WEIBO = "com.sina.weibo";

    @NotNull
    public static final String WHATSAPP = "com.whatsapp";

    @NotNull
    public static final String XIANYU = "com.taobao.fleamarket";

    @NotNull
    public static final String XIANYU2 = "com.taobao.idlefish";

    @NotNull
    public static final String XMSF = "com.xiaomi.xmsf";

    @NotNull
    public static final String YOUKU = "com.youku.phone";

    @NotNull
    public static final String YOUTUBE = "com.google.android.youtube";

    @NotNull
    public static final String ZHIHU = "com.zhihu.android";

    private PkgNameConstants() {
    }
}
