package com.xiaomi.hm.health;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.huami.account.HMLoginManager;
import com.huami.feedback.api.FeedbackParams;
import com.huami.feedback.api.FeedbackService;
import com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity;
import com.huami.healthlabel.utils.HealthLabelHelper;
import com.huami.mifit.analytics.Analytics;
import com.huami.sky.service.SkyPlayFromEvent;
import com.huami.sleep.napsleep.ui.NapSleepDetailActivity;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.log.HMLog;
import com.huami.training.ui.course.TrainingFilterListActivity;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.ui.activity.PBTabActivity;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.di.koin.startup.UserInfoModuleInitializerKt;
import com.xiaomi.hm.health.discovery.WebActivityUtil;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.eventbus.EventChangeTab;
import com.xiaomi.hm.health.healthdata.navigation.SleepExternalNavigtor;
import com.xiaomi.hm.health.hmintent.SleepHMIntent;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.nfc.door.HuamiWorkUtils;
import com.xiaomi.hm.health.nfc.jac.JacUtils;
import com.xiaomi.hm.health.nfc.xiaopeng.XiaoPengUtils;
import com.xiaomi.hm.health.nps.NpsUtil;
import com.xiaomi.hm.health.privacy.AnonymousManager;
import com.xiaomi.hm.health.push.HMPushItem;
import com.xiaomi.hm.health.relation.RelationServiceKt;
import com.xiaomi.hm.health.sky.SkyServiceKt;
import com.xiaomi.hm.health.thirdbind.AlipayBindEntry;
import com.xiaomi.hm.health.training.ui.activity.FeaturedCourseDetailActivity;
import com.xiaomi.hm.health.training.ui.activity.FormulateCurriculumActivity;
import com.xiaomi.hm.health.training.ui.activity.FreeTrainingDetailActivity;
import com.xiaomi.hm.health.ui.AllDataCategoriesActivity;
import com.xiaomi.hm.health.ui.SettingActivity;
import com.xiaomi.hm.health.ui.goal.ui.GoalSummaryActivity;
import com.xiaomi.hm.health.ui.smartplay.HuamiOSAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.utils.HMActivityManager;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.watchfacestore.WatchFaceIntentHandler;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import de.greenrobot.event.EventBus;
import java.net.URL;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class HMIntentHandler {
    private static final String A = "course";
    public static final String ALL = "all";
    public static final String APP_GOTO_ALL_DATA_FLAG = "all_data";
    public static final String APP_GOTO_BREATHE_TRAINING_FLAG = "breathe_training";
    public static final String APP_GOTO_NPS = "nps";
    public static final String APP_GOTO_RECORD_FLAG = "record";
    public static final String APP_GOTO_TRAINING_SLEEP_FLAG = "sleep";
    public static final String APP_GOTO_TRAINING_STRESS_FLAG = "stress";
    private static final String B = "home";
    public static final String EXCELLENT_COURSE = "EXCELLENT_COURSE";
    public static final String FITNESS = "fitness";
    public static final String HEALTH_RECORD = "health_record";
    public static final String INFORMATION = "information";
    public static final String NAME_FEEDBACK = "feedback";
    public static final String NAME_FEMALE = "female";
    public static final String NAME_SKY = "sky";
    public static final String NAME_SLEEP = "sleep";
    public static final String NAME_SNORE = "snore";
    public static final String NAME_THIRD_PARTY = "thirdParty";
    public static final String NAP_TYPE_LATEST = "latest";
    public static final String RECORD = "record";
    public static final String SINGLE_TRAINING = "SINGLE_TRAINING";
    public static final String TARGET = "target";
    public static final String TARGET_NAP_SLEEP = "little";
    public static final String TARGET_SKY_PLAYER = "player";
    public static final String TARGET_SLEEP = "sleep";
    public static final String TARGET_SNORE_MONITOR = "monitor";
    public static final String TARGET_THIRD_PARTY = "alipay";
    public static final String TRAINING = "training";
    private static final String a = "HMIntentHandler";
    private static final String d = "/action";
    private static final String e = "module";
    private static final String f = "target";
    private static final String g = "name";
    private static final String h = "url";
    private static final String i = "title";
    private static final String j = "cookie";
    private static final String k = "data";
    private static final String l = "title";
    private static final String m = "device";
    private static final String n = "bindnormandy";
    private static final String o = "run";
    private static final String p = "history";
    private static final String q = "status";
    private static final String r = "mine";
    private static final String s = "smartplay";
    private static final String t = "alarmclock";
    private static final String u = "friends";
    private static final String v = "dosearch";
    private static final String w = "webview";
    private static final String x = "discovery";
    private static final String y = "appUpgrade";
    private static final String z = "sport";
    private static final String b = HMConfig.getScheme();
    private static final String c = HMConfig.getAppHost();
    private static final String[] C = {".xiaomi.com", ".mi-ae.cn", ".mi-ae.com", ".huami.com", ".amazfit.com", ".huami-inc.com", ".smartdevices.com.cn", ".api.mi-img.com", ".mi.com", ".m.tiaohot.com", ".huamishop.com"};
    private static final String[] D = {"m.tiaohot.com", "huamishop.com"};
    private static Lazy<FeedbackService> E = KoinJavaComponent.inject(FeedbackService.class);

    public static class HMAction {
        public String a = null;
        public String b = null;
        public String c = null;
        public String d = null;
        public String e = null;
        public String f = null;
        public String g = null;
        public Object h = null;

        public String getData() {
            return this.g;
        }

        public Object getExtra() {
            return this.h;
        }

        public String getHost() {
            return this.b;
        }

        public String getModule() {
            return this.d;
        }

        public String getName() {
            return this.f;
        }

        public String getPath() {
            return this.c;
        }

        public String getScheme() {
            return this.a;
        }

        public String getTarget() {
            return this.e;
        }

        public boolean isValid() {
            return HMIntentHandler.b.equals(this.a) && HMIntentHandler.c.equals(this.b) && HMIntentHandler.d.equals(this.c);
        }

        public void setData(String data) {
            this.g = data;
        }

        public void setExtra(Object o) {
            this.h = o;
        }

        public void setHost(String host) {
            this.b = host;
        }

        public void setModule(String module) {
            this.d = module;
        }

        public void setName(String name) {
            this.f = name;
        }

        public void setPath(String path) {
            this.c = path;
        }

        public void setScheme(String scheme) {
            this.a = scheme;
        }

        public void setTarget(String target) {
            this.e = target;
        }

        public String toString() {
            return "HMAction{scheme='" + this.a + "', host='" + this.b + "', path='" + this.c + "', module='" + this.d + "', name='" + this.f + "', target='" + this.e + "', data='" + this.g + "'}";
        }
    }

    private static boolean d(Context context, Intent intent) {
        HuamiWorkUtils huamiWorkUtils = HuamiWorkUtils.INSTANCE;
        if (!huamiWorkUtils.isHuamiWorkIntent(intent)) {
            return false;
        }
        huamiWorkUtils.handleHuamiWorkIntent(context, intent);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    public static boolean doAction(Context context, HMAction action) {
        Intent intentFriendActivityIntent;
        byte b2 = 0;
        HMLog.d(a, "action = " + action, new Object[0]);
        if (AnonymousManager.isAnonymousLogin()) {
            return false;
        }
        if (y.equalsIgnoreCase(action.getName())) {
            SettingActivity.lunch(context, SettingActivity.FROM_PUSH_APP_UPGRADE);
            return true;
        }
        if ("device".equals(action.getModule()) && n.equals(action.getTarget())) {
            return true;
        }
        if ("run".equalsIgnoreCase(action.getName())) {
            if ("history".equalsIgnoreCase(action.getTarget())) {
                RunningManager.startRunningRecord(context, null, new int[0]);
            } else {
                RunningManager.startRunning();
            }
            return true;
        }
        if ("sport".equalsIgnoreCase(action.getName())) {
            if (!Utils.isOverseaUser() && "course".equalsIgnoreCase(action.getTarget()) && !TextUtils.isEmpty(action.getData())) {
                String vaildData = getVaildData(action.getData(), "id");
                if ("SINGLE_TRAINING".equals(getVaildData(action.getData(), "type"))) {
                    if (!TextUtils.isEmpty(vaildData)) {
                        try {
                            Intent intent = new Intent(context, (Class<?>) FreeTrainingDetailActivity.class);
                            intent.putExtra("EXTRA_TRAINING_ID", Long.parseLong(vaildData));
                            intent.setFlags(268435456);
                            context.startActivity(intent);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            HMLog.e(a, "跳转错误：", e2);
                        }
                    }
                } else if (!TextUtils.isEmpty(vaildData)) {
                    HMActivityManager hMActivityManager = HMActivityManager.INSTANCE;
                    hMActivityManager.removeActivity(hMActivityManager.getCurrentActivity());
                    HMLog.i(a, " aiity" + hMActivityManager.getCurrentActivity().getClass().toString(), new Object[0]);
                    if (hMActivityManager.getCurrentActivity() instanceof FeaturedCourseDetailActivity) {
                        HMLog.i(a, "销毁  FeaturedCourseDetailActivity", new Object[0]);
                        hMActivityManager.getCurrentActivity().finish();
                    }
                    Intent intent2 = new Intent(context, (Class<?>) FeaturedCourseDetailActivity.class);
                    intent2.putExtra("ARG_FEATURED_COURSE_ID", vaildData);
                    context.startActivity(intent2);
                }
            }
            return true;
        }
        if ("all".equalsIgnoreCase(action.getName())) {
            if (!Utils.isOverseaUser() && "course".equalsIgnoreCase(action.getTarget()) && !TextUtils.isEmpty(action.getData())) {
                String vaildData2 = getVaildData(action.getData(), "type");
                vaildData2.hashCode();
                switch (vaildData2.hashCode()) {
                    case -1320674870:
                        if (!vaildData2.equals("hit_list")) {
                            b2 = -1;
                        }
                        break;
                    case 108960:
                        if (!vaildData2.equals("new")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 319964022:
                        if (!vaildData2.equals("burn_calories")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        l(context, new Intent(context, (Class<?>) TrainingFilterListActivity.class).putExtra(TrainingFilterListActivity.JUMP_TYPE, "HOT"));
                        break;
                    case 1:
                        l(context, new Intent(context, (Class<?>) TrainingFilterListActivity.class).putExtra(TrainingFilterListActivity.JUMP_TYPE, "NEWEST"));
                        break;
                    case 2:
                        l(context, new Intent(context, (Class<?>) TrainingFilterListActivity.class).putExtra(TrainingFilterListActivity.JUMP_TYPE, "CONSUMPTION"));
                        break;
                    default:
                        l(context, new Intent(context, (Class<?>) TrainingFilterListActivity.class).putExtra(TrainingFilterListActivity.JUMP_TYPE, vaildData2));
                        break;
                }
            }
            return true;
        }
        if ("target".equalsIgnoreCase(action.getName())) {
            if (!Utils.isOverseaUser() && "fitness".equalsIgnoreCase(action.getTarget())) {
                l(context, new Intent(context, (Class<?>) FormulateCurriculumActivity.class));
            }
            return true;
        }
        if ("device".equalsIgnoreCase(action.getName())) {
            if ("home".equalsIgnoreCase(action.getTarget()) && !TextUtils.isEmpty(action.getData())) {
                String vaildData3 = getVaildData(action.getData(), "source");
                if (!TextUtils.isEmpty(vaildData3)) {
                    HMDeviceUtils.jumpToDeviceDetailPage(context, Integer.valueOf(vaildData3).intValue());
                }
            }
            return true;
        }
        if ("status".equalsIgnoreCase(action.getName())) {
            EventBus.getDefault().post(new EventChangeTab(0));
            return true;
        }
        if ("mine".equalsIgnoreCase(action.getName())) {
            if (!TextUtils.isEmpty(action.getTarget()) && "record".equalsIgnoreCase(action.getTarget())) {
                String vaildData4 = getVaildData(action.getData(), "type");
                Intent intent3 = new Intent(context, (Class<?>) PBTabActivity.class);
                intent3.putExtra("type", vaildData4);
                l(context, intent3);
            } else if (!TextUtils.isEmpty(action.getTarget()) && "target".equalsIgnoreCase(action.getTarget())) {
                l(context, new Intent(context, (Class<?>) GoalSummaryActivity.class));
            } else if (!TextUtils.isEmpty(action.getTarget()) && "information".equalsIgnoreCase(action.getTarget())) {
                UserInfoModuleInitializerKt.getUserInfoService().navigateToPersonInfo(context, null);
            } else if (TextUtils.isEmpty(action.getTarget()) || !HEALTH_RECORD.equalsIgnoreCase(action.getTarget())) {
                l(context, new Intent(context, (Class<?>) MainTabActivity.class).putExtra("tab_index", 3));
            } else if (!Utils.isOverseaUser()) {
                HealthLabelHelper.openRecordLabelPage(context.getApplicationContext());
            }
            return true;
        }
        if ("discovery".equalsIgnoreCase(action.getName())) {
            return true;
        }
        if (!"smartplay".equalsIgnoreCase(action.getName())) {
            if ("friends".equalsIgnoreCase(action.getName())) {
                if (TextUtils.isEmpty(action.getTarget()) || !v.equalsIgnoreCase(action.getTarget())) {
                    intentFriendActivityIntent = RelationServiceKt.getRelationService().friendActivityIntent(context);
                } else {
                    intentFriendActivityIntent = RelationServiceKt.getRelationService().addFriendActivityNewIntent(context);
                    intentFriendActivityIntent.putExtra("data", action.getData());
                }
                intentFriendActivityIntent.setPackage(context.getPackageName());
                context.startActivity(intentFriendActivityIntent);
                return true;
            }
            if (w.equalsIgnoreCase(action.getName())) {
                Object extra = action.getExtra();
                HMLog.d(a, "WebItem:" + extra, new Object[0]);
                if (extra == null || !(extra instanceof WebItem)) {
                    return false;
                }
                if ("nps".equals(action.getTarget())) {
                    HMLog.info(a, new Function0() { // from class: zz2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMIntentHandler.i();
                        }
                    });
                    NpsUtil.INSTANCE.setHasNpsActivityDone(1);
                }
                g(context, (WebItem) extra);
                return true;
            }
            if (NAME_FEMALE.equalsIgnoreCase(action.getName())) {
                context.startActivity(new Intent(context, (Class<?>) FemaleHealthActivity.class));
                return true;
            }
            if ("snore".equalsIgnoreCase(action.getName())) {
                if (!TARGET_SNORE_MONITOR.equalsIgnoreCase(action.e) || Config.isUserOversea(context) || Config.isLocaleOversea(context)) {
                    return false;
                }
                context.startActivity(new Intent(context, (Class<?>) SnoreMonitorActivity.class));
                return true;
            }
            if ("sleep".equalsIgnoreCase(action.getName())) {
                if (!TARGET_NAP_SLEEP.equalsIgnoreCase(action.e)) {
                    return SleepHMIntent.INSTANCE.doAction(context, action);
                }
                if (NAP_TYPE_LATEST.equalsIgnoreCase(getVaildData(action.getData(), "type"))) {
                    String lastNapDataDate = SportDataManager.getInstance().getLastNapDataDate();
                    if (TextUtils.isEmpty(lastNapDataDate)) {
                        lastNapDataDate = new SportDay().getKey();
                    }
                    NapSleepDetailActivity.launch(context, lastNapDataDate, HMPersonInfo.getInstance().getUserInfo().getUserid());
                } else {
                    NapSleepDetailActivity.launch(context, new SportDay().getKey(), HMPersonInfo.getInstance().getUserInfo().getUserid());
                }
                return true;
            }
            if ("all_data".equalsIgnoreCase(action.getName())) {
                l(context, new Intent(context, (Class<?>) AllDataCategoriesActivity.class));
                return true;
            }
            if (APP_GOTO_BREATHE_TRAINING_FLAG.equalsIgnoreCase(action.getName())) {
                if (Language.isSimplifiedChinese() && HMLoginManager.isInChina()) {
                    if ("stress".equalsIgnoreCase(action.e)) {
                        Navigator.INSTANCE.startBreatheTraining(context, 2);
                    } else {
                        SleepExternalNavigtor.INSTANCE.jumpPranayamaIntroduction();
                    }
                }
                return true;
            }
            if ("record".equalsIgnoreCase(action.getName())) {
                HistoryRecord historyRecordQueryLatestExerciseHistory = HistoryRecordManager.getInstance().queryLatestExerciseHistory();
                String vaildData5 = getVaildData(action.getData(), "type");
                if (!"course".equals(action.e)) {
                    RunningManager.startRunningJumpRecord(context, historyRecordQueryLatestExerciseHistory, action.e, vaildData5);
                } else if (Language.isSimplifiedChinese() && HMLoginManager.isInChina()) {
                    RunningManager.startRunningJumpRecord(context, historyRecordQueryLatestExerciseHistory, action.e, vaildData5);
                }
                return true;
            }
            if ("watch".equalsIgnoreCase(action.getName())) {
                WatchFaceIntentHandler.INSTANCE.handlerAction(context, action);
                return true;
            }
            if ("feedback".equalsIgnoreCase(action.getName())) {
                try {
                    if (context instanceof StartUpActivity) {
                        E.getValue().feedback(null, context, ((StartUpActivity) context).getSupportFragmentManager(), new FeedbackParams(null, new JSONObject(action.g).getString("source"), null, null, false));
                    }
                } catch (JSONException unused) {
                    HMLog.w(StatEvent.EventParams.FEEDBACK, "Parse deep link data fail:" + action.g, new Object[0]);
                }
                return true;
            }
            if (NAME_SKY.equalsIgnoreCase(action.getName()) && "player".equalsIgnoreCase(action.getTarget())) {
                SkyPlayFromEvent skyPlayFromEvent = SkyPlayFromEvent.FROM_OTHER;
                if (!TextUtils.isEmpty(action.g)) {
                    try {
                        if (SDKConstants.PARAM_TOURNAMENTS_DEEPLINK.equals(new JSONObject(action.g).getString("from"))) {
                            skyPlayFromEvent = SkyPlayFromEvent.FROM_DEEP_LINK;
                        }
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                SkyServiceKt.getSkyNavigation().launchSkyMainPage(context, skyPlayFromEvent);
                return true;
            }
            if (NAME_THIRD_PARTY.equalsIgnoreCase(action.getName()) && "alipay".equalsIgnoreCase(action.getTarget()) && HMLoginManager.isUserValid()) {
                AlipayBindEntry.open(context);
            }
        } else if (t.equalsIgnoreCase(action.getTarget()) && HMDeviceManager.getInstance().hasBound(HMDeviceType.MILI)) {
            Intent intent4 = AlarmClockManager.isSupportAlarmModule() ? new Intent(context, (Class<?>) HuamiOSAlarmActivity.class) : new Intent(context, (Class<?>) MiBandAlarmActivity.class);
            intent4.setPackage(context.getPackageName());
            context.startActivity(intent4);
            return true;
        }
        return false;
    }

    private static boolean e(Context context, Intent intent) {
        JacUtils jacUtils = JacUtils.INSTANCE;
        if (!jacUtils.isJacIntent(intent)) {
            return false;
        }
        jacUtils.handleJacIntent(context, intent);
        return true;
    }

    private static boolean f(Context context, Intent intent) {
        XiaoPengUtils xiaoPengUtils = XiaoPengUtils.INSTANCE;
        if (!xiaoPengUtils.isXiaoPengIntent(intent)) {
            return false;
        }
        xiaoPengUtils.handleXiaoPengIntent(context, intent);
        return true;
    }

    private static boolean g(Context context, WebItem webItem) {
        if (h(webItem.url)) {
            WebHelper.launch(webItem);
            return true;
        }
        HMLog.i(a, "invalid host:" + webItem.url, new Object[0]);
        return false;
    }

    @Nullable
    public static String getVaildData(String jsonData, String key) {
        if (TextUtils.isEmpty(jsonData) || TextUtils.isEmpty(key)) {
            return null;
        }
        try {
            return new JSONObject(jsonData).getString(key);
        } catch (JSONException e2) {
            e2.printStackTrace();
            HMLog.i(a, "getVaildData Exception:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    private static boolean h(String url) {
        try {
            String host = new URL(url).getHost();
            for (String str : C) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
            for (String str2 : D) {
                if (host.equals(str2)) {
                    return true;
                }
            }
        } catch (Exception e2) {
            HMLog.i(a, "getHost Exception:" + e2.getMessage(), new Object[0]);
        }
        return false;
    }

    public static boolean handleMifit(Context context, Uri uri) {
        HMAction hMAction;
        HMLog.d(a, "handleMifit:" + uri, new Object[0]);
        if (uri == null || (hMAction = parse(uri)) == null || !hMAction.isValid()) {
            return false;
        }
        doAction(context, hMAction);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i() {
        return "showed======goToNps";
    }

    private static HMPushItem j(Bundle extra) {
        if (extra == null) {
            return null;
        }
        MiPushMessage miPushMessage = (MiPushMessage) extra.getSerializable(PushMessageHelper.KEY_MESSAGE);
        HMLog.d(a, "parseMiPushExtra:" + miPushMessage, new Object[0]);
        if (miPushMessage == null) {
            return null;
        }
        return HMPushItem.formExtra(miPushMessage.getExtra());
    }

    private static boolean k(Context context, Intent intent) {
        if (intent.getExtras() == null) {
            return false;
        }
        HMPushItem hMPushItemJ = j(intent.getExtras());
        HMLog.d(a, "item:" + hMPushItemJ, new Object[0]);
        if (hMPushItemJ == null) {
            return false;
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(hMPushItemJ.getJobKey())) {
            map.put("jobkey", hMPushItemJ.getJobKey());
        }
        if (!TextUtils.isEmpty(hMPushItemJ.getMsgTitle())) {
            map.put("title", hMPushItemJ.getMsgTitle());
        }
        Analytics.event(context, StatEvent.RECEIVE_NOTIFICATION_CLICK, map);
        if (hMPushItemJ.isJumpDynamic()) {
            HMLog.d(a, "do nothing...", new Object[0]);
            return true;
        }
        if (hMPushItemJ.isAppScheme()) {
            handleMifit(context, hMPushItemJ.getMifitUri());
        } else if (hMPushItemJ.isUserHttp()) {
            g(context, WebActivityUtil.toWebItem(hMPushItemJ));
        }
        return true;
    }

    private static void l(Context context, Intent intent) {
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @SuppressLint({"WrongConstant"})
    public static HMAction parse(Uri uri) {
        if (uri == null) {
            return null;
        }
        HMAction hMAction = new HMAction();
        hMAction.setScheme(uri.getScheme());
        hMAction.setHost(uri.getHost());
        hMAction.setPath(uri.getPath());
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, uri.getQueryParameter(str));
        }
        String str2 = (String) map.get(e);
        String str3 = (String) map.get("target");
        String str4 = (String) map.get("name");
        String str5 = (String) map.get("url");
        String str6 = (String) map.get("cookie");
        String str7 = (String) map.get("data");
        String str8 = (String) map.get("title");
        if (!TextUtils.isEmpty(str2)) {
            hMAction.setModule(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hMAction.setTarget(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hMAction.setName(str4);
            if (str4.equals(w) && !TextUtils.isEmpty(str5)) {
                WebItem webItem = new WebItem();
                webItem.url = str5;
                if (!TextUtils.isEmpty(str8)) {
                    try {
                        webItem.titleBarStyle = Integer.parseInt(str8);
                    } catch (Exception unused) {
                        webItem.titleBarStyle = 0;
                    }
                }
                if (!TextUtils.isEmpty(str6)) {
                    try {
                        boolean z2 = true;
                        if (Integer.parseInt(str6) != 1) {
                            z2 = false;
                        }
                        webItem.needWriteCookie = z2;
                    } catch (Exception e2) {
                        HMLog.d(a, "Exception:" + e2.getMessage(), new Object[0]);
                    }
                }
                hMAction.setExtra(webItem);
            }
        }
        if (!TextUtils.isEmpty(str7)) {
            hMAction.setData(str7);
        }
        HMLog.d(a, "parse action:" + hMAction, new Object[0]);
        return hMAction;
    }

    public static boolean processIntent(Context context, Intent intent) {
        HMLog.i(a, "processIntent:" + intent, new Object[0]);
        return (intent != null && (k(context, intent) || handleMifit(context, intent.getData()) || f(context, intent))) || e(context, intent) || d(context, intent);
    }
}
