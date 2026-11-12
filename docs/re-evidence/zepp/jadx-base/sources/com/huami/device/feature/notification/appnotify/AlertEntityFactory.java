package com.huami.device.feature.notification.appnotify;

import com.huami.device.feature.notification.utils.NotificationLog;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002R2\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR2\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/huami/device/feature/notification/appnotify/AlertEntityFactory;", "", "", "pkg", "appName", "title", "msg", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "getAlertEntity", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertMode;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "mapAlertMode", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertApp;", "b", "mapAlertApp", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class AlertEntityFactory {

    @NotNull
    public static final AlertEntityFactory INSTANCE = new AlertEntityFactory();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final HashMap<String, HMAlertMode> mapAlertMode = r.hashMapOf(new Pair(PkgNameConstants.EMAIL_NATIVE, HMAlertMode.ALERT_EMAIL));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final HashMap<String, HMAlertApp> mapAlertApp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getAlertEntity exception: ", this.a);
        }
    }

    static {
        HMAlertApp hMAlertApp = HMAlertApp.QQ;
        HMAlertApp hMAlertApp2 = HMAlertApp.ZHIFUBAO;
        HMAlertApp hMAlertApp3 = HMAlertApp.XIANYU;
        HMAlertApp hMAlertApp4 = HMAlertApp.CALENDAR;
        mapAlertApp = r.hashMapOf(new Pair("com.facebook.katana", HMAlertApp.FACEBOOK), new Pair("com.xiaomi.hm.health", HMAlertApp.MSPORT), new Pair(PkgNameConstants.MTALKING, HMAlertApp.MTALKING), new Pair("com.tencent.mobileqq", hMAlertApp), new Pair("com.tencent.qqlite", hMAlertApp), new Pair("com.tencent.minihd.qq", hMAlertApp), new Pair(PkgNameConstants.QQ_INTERNATIONAL, hMAlertApp), new Pair(PkgNameConstants.SNAPCHAT, HMAlertApp.SNAPCHAT), new Pair(PkgNameConstants.TAOBAO, HMAlertApp.TAOBAO), new Pair("com.twitter.android", HMAlertApp.TWITTER), new Pair("com.tencent.mm", HMAlertApp.WECHAT), new Pair("com.sina.weibo", HMAlertApp.WEIBO), new Pair(PkgNameConstants.WHATSAPP, HMAlertApp.WHATSAPP), new Pair(PkgNameConstants.ALIPAY, hMAlertApp2), new Pair("com.eg.android.AlipayGphone", hMAlertApp2), new Pair(PkgNameConstants.MOMO, HMAlertApp.MOMO), new Pair("jp.naver.line.android", HMAlertApp.LINE), new Pair(PkgNameConstants.QIANNIU, HMAlertApp.QIANNIU), new Pair(PkgNameConstants.TIEBA, HMAlertApp.TIEBA), new Pair("com.qzone", HMAlertApp.QQZONE), new Pair(PkgNameConstants.XIANYU, hMAlertApp3), new Pair(PkgNameConstants.XIANYU2, hMAlertApp3), new Pair(PkgNameConstants.MISHOP, HMAlertApp.MISHOP), new Pair(PkgNameConstants.JD, HMAlertApp.JD), new Pair(PkgNameConstants.DINGDING, HMAlertApp.DINGDING), new Pair(PkgNameConstants.CALENDAR_NATIVE, hMAlertApp4), new Pair(PkgNameConstants.CALENDAR_GOOGLE, hMAlertApp4), new Pair(PkgNameConstants.CALENDAR_VIVO, hMAlertApp4), new Pair(PkgNameConstants.VIBER, HMAlertApp.VIBER), new Pair(PkgNameConstants.TELEGRAM, HMAlertApp.MESSENGER), new Pair("com.facebook.orca", HMAlertApp.FMESSENGER), new Pair(PkgNameConstants.KAKAO, HMAlertApp.KAKAOTALK), new Pair(PkgNameConstants.SKYPE, HMAlertApp.SKYPE), new Pair(PkgNameConstants.VKONTAKTE, HMAlertApp.VKONTAKTE), new Pair(PkgNameConstants.INSTAGRAM, HMAlertApp.INSTAGRAM), new Pair(PkgNameConstants.HANGOUTS, HMAlertApp.HANGOUTS), new Pair(PkgNameConstants.POKEMON, HMAlertApp.POKEMON), new Pair("com.tencent.tim", HMAlertApp.TIM), new Pair(PkgNameConstants.YOUTUBE, HMAlertApp.YOUTUBE), new Pair("com.huami.watch.hmwatchmanager", HMAlertApp.AMAZFIT), new Pair(PkgNameConstants.MI_JIA, HMAlertApp.MI_JIA), new Pair(PkgNameConstants.QQ_EMAIL, HMAlertApp.QQ_EMAIL), new Pair(PkgNameConstants.TENCENT_NEWS, HMAlertApp.TENCENT_NEWS), new Pair(PkgNameConstants.ARTICAL_NEWS, HMAlertApp.ARTICLE_NEWS), new Pair(PkgNameConstants.PIN_DUO_DUO, HMAlertApp.PIN_DUO_DUO), new Pair(PkgNameConstants.ZHIHU, HMAlertApp.ZHI_HU), new Pair(PkgNameConstants.QQ_MUSIC, HMAlertApp.QQ_MUSIC), new Pair(PkgNameConstants.DOU_YIN, HMAlertApp.DOU_YIN), new Pair(PkgNameConstants.DIDI, HMAlertApp.DI_DI), new Pair(PkgNameConstants.AIQIYI, HMAlertApp.AI_QI_YI), new Pair(PkgNameConstants.QQ_LIVE, HMAlertApp.QQ_LIVE), new Pair(PkgNameConstants.CMB_BANK, HMAlertApp.ZHAOSHANG_BANK), new Pair(PkgNameConstants.YOUKU, HMAlertApp.YOU_KU), new Pair(PkgNameConstants.KUGOU, HMAlertApp.KU_GOU), new Pair(PkgNameConstants.BAIDU, HMAlertApp.BAI_DU), new Pair(PkgNameConstants.BAIDU_MAP, HMAlertApp.BAI_DU_MAP), new Pair(PkgNameConstants.GAODE_MAP, HMAlertApp.GAO_DE_MAP), new Pair(PkgNameConstants.TENCENT_WE_WORK, HMAlertApp.TENCENT_WE_WORK), new Pair(PkgNameConstants.KEEP, HMAlertApp.KEEP), new Pair(PkgNameConstants.MEITUAN, HMAlertApp.MEI_TUAN), new Pair(PkgNameConstants.TIMEX, HMAlertApp.TIMEX_SMART), new Pair(PkgNameConstants.EMAIL_GMAIL, HMAlertApp.GMAIL), new Pair(PkgNameConstants.TIK_TOK, HMAlertApp.TIK_TOK), new Pair("com.android.deskclock", HMAlertApp.ALARM));
    }

    private AlertEntityFactory() {
    }

    @NotNull
    public final HMAlertModeExt getAlertEntity(@NotNull String pkg, @NotNull String appName, @Nullable String title, @Nullable String msg) {
        HMAlertModeExt hMAlertModeExt;
        try {
            HashMap<String, HMAlertMode> map = mapAlertMode;
            if (map.keySet().contains(pkg)) {
                hMAlertModeExt = new HMAlertModeExt(map.get(pkg), title, msg);
            } else {
                HashMap<String, HMAlertApp> map2 = mapAlertApp;
                hMAlertModeExt = map2.keySet().contains(pkg) ? new HMAlertModeExt(map2.get(pkg), title, msg) : new HMAlertModeExt(HMAlertApp.GENERIC, title, msg);
            }
            hMAlertModeExt.setAppName(appName);
            return hMAlertModeExt;
        } catch (Exception e) {
            HMLog.info(NotificationLog.defaultTag, new a(e));
            return new HMAlertModeExt(HMAlertApp.GENERIC, title, msg);
        }
    }
}
