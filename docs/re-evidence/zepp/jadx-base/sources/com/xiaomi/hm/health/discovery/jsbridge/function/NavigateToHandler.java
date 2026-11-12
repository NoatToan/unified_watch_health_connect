package com.xiaomi.hm.health.discovery.jsbridge.function;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.account.HMLogoutManager;
import com.huami.discovery.bridge.jsbridge.api.NavigateApiExHandler;
import com.huami.healthlabel.utils.HealthLabelHelper;
import com.huami.phn.logic.PHNStateLogic;
import com.huami.sky.service.SkyPlayFromEvent;
import com.huami.sleep.napsleep.ui.NapSleepDetailActivity;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.third.wechat.ui.WeChatBind;
import com.huami.third.wechat.ui.WeChatStartDestination;
import com.huami.tools.log.HMLog;
import com.huami.training.ui.course.TrainingFilterListActivity;
import com.huami.watch.companion.ui.activity.PBTabActivity;
import com.huami.watch.companion.util.NumUtil;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.ui.store.list.CategoryListActivity;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.di.koin.startup.UserInfoModuleInitializerKt;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.discovery.jsbridge.function.NavigateToHandler;
import com.xiaomi.hm.health.discovery.jsbridge.function.content.NavigateContent;
import com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate.JsDeviceNavigator;
import com.xiaomi.hm.health.eventbus.EventChangeTab;
import com.xiaomi.hm.health.healthdata.navigation.SleepExternalNavigtor;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.relation.RelationServiceKt;
import com.xiaomi.hm.health.sky.SkyServiceKt;
import com.xiaomi.hm.health.speech.handler.CustomSkillsHandler;
import com.xiaomi.hm.health.training.ui.activity.FeaturedCourseDetailActivity;
import com.xiaomi.hm.health.training.ui.activity.FormulateCurriculumActivity;
import com.xiaomi.hm.health.training.ui.activity.FreeTrainingDetailActivity;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.ui.AllDataCategoriesActivity;
import com.xiaomi.hm.health.ui.diagnosis.DiagnosisActivity;
import com.xiaomi.hm.health.ui.goal.ui.GoalSummaryActivity;
import com.xiaomi.hm.health.ui.keekalive.KeepAliveActivity;
import com.xiaomi.hm.health.ui.smartplay.HuamiOSAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.wxapi.WeChatAPI;
import de.greenrobot.event.EventBus;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class NavigateToHandler implements NavigateApiExHandler {
    public static final String APP_GOTO_MINE_HOME = "mine";
    public static final String APP_GOTO_MINI_PROGRAM_WECHAT = "miniprogram:wechat";
    public static final String APP_GOTO_RUN_HOME = "sport";
    public static final String APP_GOTO_STATUS_HOME = "status";
    private static final String a = "sport:yoga:";
    private static final String b = "sport:course:";
    private static final String c = "mine:device:";
    private static final String d = "watch:detail";
    private static final String e = "watch:category";
    private static final String f = "phn:detail";
    private static final int g = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(String str, String str2) {
        return "navigateTo, position: " + str + ", data: " + str2;
    }

    private static String c(String position, int index) {
        try {
            return position.split(":")[index];
        } catch (Exception e2) {
            HMLog.e(CustomSkillsHandler.TAG, e2);
            return null;
        }
    }

    public static void startActivity(Context context, Intent intent) {
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.NavigateApiExHandler
    public String handleNavigateTo(Context context, @NonNull final String position, final String data) {
        HMLog.info(CustomSkillsHandler.TAG, new Function0() { // from class: jc5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigateToHandler.b(position, data);
            }
        });
        if ("miniprogram:wechat".equals(position)) {
            new WeChatAPI(context).launchMiniProgram(data);
        } else if (NavigateContent.APP_GOTO_CLOCK_HOME.equals(position)) {
            if (!"sleepMusicH5".equals(data)) {
                Intent intent = AlarmClockManager.isSupportAlarmModule() ? new Intent(context, (Class<?>) HuamiOSAlarmActivity.class) : new Intent(context, (Class<?>) MiBandAlarmActivity.class);
                intent.setPackage(context.getPackageName());
                startActivity(context, intent);
            }
        } else if (NavigateContent.APP_GOTO_FRIENDS_HOME.equals(position)) {
            startActivity(context, RelationServiceKt.getRelationService().friendActivityIntent(context));
            HMLog.i(CustomSkillsHandler.TAG, "to friends", new Object[0]);
        } else if ("sport".equals(position)) {
            RunningManager.startRunning();
        } else if (NavigateContent.APP_GOTO_RUN_HISTORY_HOME.equals(position)) {
            RunningManager.startRunningRecord(context, null, new int[0]);
        } else if ("login".equals(position)) {
            HMLogoutManager.logout(2);
        } else if (NavigateContent.APP_GOTO_RELOGIN.equals(position)) {
            HMLogoutManager.mutex(System.currentTimeMillis());
        } else if (!position.startsWith("discovery")) {
            if ("status".equals(position)) {
                EventBus.getDefault().post(new EventChangeTab(0));
            } else if ("mine".equals(position)) {
                EventBus.getDefault().post(new EventChangeTab(3));
            } else if (NavigateContent.APP_GOTO_MINE_PROFILE.equals(position)) {
                UserInfoModuleInitializerKt.getUserInfoService().navigateToPersonInfo(context, null);
            } else if (NavigateContent.APP_GOTO_FRIENDS_QRCODE.equals(position)) {
                Intent intentFriendActivityIntent = RelationServiceKt.getRelationService().friendActivityIntent(context);
                intentFriendActivityIntent.setPackage(context.getPackageName());
                intentFriendActivityIntent.putExtra(Constant.OPER_TYPE, Constant.TYPE_QRCODE);
                startActivity(context, intentFriendActivityIntent);
            } else if (NavigateContent.APP_GOTO_FRIENDS_SCAN.equals(position)) {
                Intent intentFriendActivityIntent2 = RelationServiceKt.getRelationService().friendActivityIntent(context);
                intentFriendActivityIntent2.setPackage(context.getPackageName());
                intentFriendActivityIntent2.putExtra(Constant.OPER_TYPE, Constant.TYPE_SCAN);
                startActivity(context, intentFriendActivityIntent2);
            } else if ("training".equals(position)) {
                startActivity(context, new Intent(context, (Class<?>) MainTabActivity.class).putExtra("tab_index", 2));
            } else if (position.startsWith(NavigateContent.APP_GOTO_TRAINING_DETAIL) || position.startsWith("sport:yoga:")) {
                try {
                    String[] strArrSplit = position.split(":");
                    if (strArrSplit.length == 3) {
                        FreeTrainingDetailActivity.startActivity(context, Long.parseLong(strArrSplit[2]), "Promotion");
                    }
                } catch (NumberFormatException e2) {
                    e2.printStackTrace();
                }
            } else if (position.startsWith("sport:course:")) {
                try {
                    String[] strArrSplit2 = position.split(":");
                    if (strArrSplit2.length == 3) {
                        TrainingInjection.get().getNavigationController().navigateToFeaturedCourseDetail(context, strArrSplit2[2]);
                    }
                } catch (NumberFormatException e3) {
                    e3.printStackTrace();
                }
            } else if (position.startsWith(d)) {
                String strC = c(position, 2);
                if (!TextUtils.isEmpty(strC)) {
                    WatchFaceDetailActivity.INSTANCE.actionStart(context, 0, Integer.parseInt(strC), null);
                }
            } else if (position.startsWith(e)) {
                String strC2 = c(position, 2);
                if (!TextUtils.isEmpty(strC2)) {
                    CategoryListActivity.INSTANCE.actionStart(context, 5, Integer.parseInt(strC2));
                }
            } else if (position.startsWith(f)) {
                PHNStateLogic.INSTANCE.gotoPHNDetailPage(context);
            } else if (position.startsWith(c)) {
                HMDeviceUtils.jumpToDeviceDetailPage(context, NumUtil.toInt(c(position, 2)), "");
            } else if (position.startsWith(NavigateContent.APP_GOTO_SLEEP_RHYTHM)) {
                Navigator.INSTANCE.startMusicPlayer(context);
            } else if (position.startsWith(NavigateContent.APP_GOTO_SLEEP_BREATH)) {
                Navigator.INSTANCE.startBreatheTraining(context);
            } else if (position.startsWith(NavigateContent.APP_GOTO_SLEEP_MONITOR)) {
                Intent intent2 = new Intent(context, (Class<?>) SnoreMonitorActivity.class);
                intent2.setPackage(context.getPackageName());
                startActivity(context, intent2);
            } else if (position.startsWith(NavigateContent.APP_GOTO_SLEEP_FLAG)) {
                if (NavigateContent.APP_GOTO_SLEEP_DAY.equals(position)) {
                    SleepExternalNavigtor.INSTANCE.jumpSleepDay();
                } else if (NavigateContent.APP_GOTO_SLEEP_WEEK.equals(position)) {
                    SleepExternalNavigtor.INSTANCE.jumpSleepWeek();
                } else if (NavigateContent.APP_GOTO_SLEEP_MONTH.equals(position)) {
                    SleepExternalNavigtor.INSTANCE.jumpSleepMonth();
                } else {
                    SleepExternalNavigtor.INSTANCE.jumpSleepYear();
                }
            } else if (position.startsWith("web")) {
                WebHelper.launch(position.substring(position.indexOf(":") + 1));
            } else if (JsDeviceNavigator.isDeviceNavigator(position)) {
                JsDeviceNavigator.navigateTo(context, position, data);
            } else if (NavigateContent.APP_GOTO_SKY.equals(position)) {
                SkyServiceKt.getSkyNavigation().launchSkyMainPage(context, SkyPlayFromEvent.FROM_OTHER);
            } else if (position.startsWith(NavigateContent.APP_GOTO_BACK_RUNTIME)) {
                Intent intent3 = new Intent(context, (Class<?>) KeepAliveActivity.class);
                intent3.setFlags(268435456);
                context.startActivity(intent3);
            } else if (position.startsWith(NavigateContent.APP_GOTO_DIAGNOSIS_TOOL)) {
                Intent intent4 = new Intent(context, (Class<?>) DiagnosisActivity.class);
                intent4.setFlags(268435456);
                context.startActivity(intent4);
            } else {
                if (!position.startsWith(NavigateContent.APP_GOTO_WECHAT_SPORT)) {
                    return position;
                }
                WeChatBind.open(context, WeChatStartDestination.DeviceList);
            }
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    public String handleNavigateTo(NavigateToHandlerOptions options) {
        Context context = options.getContext();
        String position = options.getPosition();
        String jumpSource = options.getJumpSource();
        String data = options.getData();
        byte b2 = 0;
        HMLog.i(CustomSkillsHandler.TAG, "position :: " + position + "    jumpSource :: " + jumpSource + "  dataContent ::" + data, new Object[0]);
        if ("miniprogram:wechat".equals(position)) {
            new WeChatAPI(context).launchMiniProgram(data);
            return "";
        }
        if (!"sport".equals(position) && !"status".equals(position)) {
            if ("mine".equals(position)) {
                startActivity(context, new Intent(context, (Class<?>) MainTabActivity.class).putExtra(MainTabActivity.EXTRA_SPORTTYPE_INDEX, 3));
                return "";
            }
            if (NavigateContent.APP_GOTO_PRANAYAMA_INTRODUCTION.equals(position)) {
                SleepExternalNavigtor.INSTANCE.jumpPranayamaIntroduction();
                return "";
            }
            if (NavigateContent.APP_GOTO_BREATH_DETAIL.equals(position)) {
                SleepExternalNavigtor.INSTANCE.jumpPranayamaDetails();
                return "";
            }
            if ("all_data".equals(position)) {
                startActivity(context, new Intent(context, (Class<?>) AllDataCategoriesActivity.class));
                return "";
            }
            if (NavigateContent.APP_GOTO_TARGET_FITNESS.equals(position)) {
                if (Utils.isOverseaUser()) {
                    return "";
                }
                startActivity(context, new Intent(context, (Class<?>) FormulateCurriculumActivity.class));
                return "";
            }
            if (NavigateContent.APP_GOTO_MINE_HEALTH_RECORD.equals(position)) {
                if (Utils.isOverseaUser()) {
                    return "";
                }
                HealthLabelHelper.openRecordLabelPage(context.getApplicationContext());
                return "";
            }
            if (NavigateContent.APP_GOTO_MINE_INFORMATION.equals(position)) {
                UserInfoModuleInitializerKt.getUserInfoService().navigateToPersonInfo(context, null);
                return "";
            }
            if (NavigateContent.APP_GOTO_MINE_TARGET.equals(position)) {
                startActivity(context, new Intent(context, (Class<?>) GoalSummaryActivity.class));
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_MINE_RECORD)) {
                String[] strArrSplit = position.split(":");
                if (strArrSplit.length != 3) {
                    return "";
                }
                Intent intent = new Intent(context, (Class<?>) PBTabActivity.class);
                intent.putExtra("type", strArrSplit[2]);
                startActivity(context, intent);
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_ALL_COURSE)) {
                if (Utils.isOverseaUser()) {
                    return "";
                }
                String[] strArrSplit2 = position.split(":");
                if (strArrSplit2.length != 3) {
                    return "";
                }
                String str = strArrSplit2[2];
                str.hashCode();
                switch (str.hashCode()) {
                    case -1320674870:
                        if (!str.equals("hit_list")) {
                            b2 = -1;
                        }
                        break;
                    case 108960:
                        if (!str.equals("new")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 319964022:
                        if (!str.equals("burn_calories")) {
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
                        startActivity(context, new Intent(context, (Class<?>) TrainingFilterListActivity.class).putExtra(TrainingFilterListActivity.JUMP_TYPE, "HOT"));
                        return "";
                    case 1:
                        startActivity(context, new Intent(context, (Class<?>) TrainingFilterListActivity.class).putExtra(TrainingFilterListActivity.JUMP_TYPE, "NEWEST"));
                        return "";
                    case 2:
                        startActivity(context, new Intent(context, (Class<?>) TrainingFilterListActivity.class).putExtra(TrainingFilterListActivity.JUMP_TYPE, "CONSUMPTION"));
                        return "";
                    default:
                        startActivity(context, new Intent(context, (Class<?>) TrainingFilterListActivity.class).putExtra(TrainingFilterListActivity.JUMP_TYPE, strArrSplit2[2]));
                        return "";
                }
            }
            if (position.startsWith(NavigateContent.APP_GOTO_TRAINING_DETAIL)) {
                if (Utils.isOverseaUser()) {
                    return "";
                }
                try {
                    String[] strArrSplit3 = position.split(":");
                    if (strArrSplit3.length != 3) {
                        return "";
                    }
                    long j = Long.parseLong(strArrSplit3[2]);
                    Intent intent2 = new Intent(context, (Class<?>) FreeTrainingDetailActivity.class);
                    intent2.putExtra("EXTRA_TRAINING_ID", j);
                    context.startActivity(intent2);
                    return "";
                } catch (NumberFormatException e2) {
                    e2.printStackTrace();
                    return "";
                }
            }
            if (position.startsWith("sport:course:")) {
                if (Utils.isOverseaUser()) {
                    return "";
                }
                try {
                    String[] strArrSplit4 = position.split(":");
                    if (strArrSplit4.length != 3) {
                        return "";
                    }
                    Intent intent3 = new Intent(context, (Class<?>) FeaturedCourseDetailActivity.class);
                    intent3.putExtra("ARG_FEATURED_COURSE_ID", strArrSplit4[2]);
                    context.startActivity(intent3);
                    return "";
                } catch (NumberFormatException e3) {
                    e3.printStackTrace();
                    return "";
                }
            }
            if (NavigateContent.APP_GOTO_FRIENDS_HOME.equals(position)) {
                startActivity(context, RelationServiceKt.getRelationService().friendActivityIntent(context));
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_BREATHE_TRAINING_FLAG)) {
                String[] strArrSplit5 = position.split(":");
                if (strArrSplit5.length != 2) {
                    return "";
                }
                if ("stress".equals(strArrSplit5[1])) {
                    Navigator.INSTANCE.startBreatheTraining(context, 2);
                    return "";
                }
                SleepExternalNavigtor.INSTANCE.jumpPranayamaIntroduction();
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_RECORD_FLAG)) {
                String[] strArrSplit6 = position.split(":");
                if (strArrSplit6.length != 3) {
                    return "";
                }
                RunningManager.startRunningJumpRecord(context, HistoryRecordManager.getInstance().queryLatestExerciseHistory(), strArrSplit6[1], strArrSplit6[2]);
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_TONELIST_FLAG)) {
                if (NavigateContent.APP_GOTO_TONELIST_LIST.equals(position)) {
                    SleepExternalNavigtor sleepExternalNavigtor = SleepExternalNavigtor.INSTANCE;
                    sleepExternalNavigtor.jumpToneList(sleepExternalNavigtor.getLIST_TYPE());
                    return "";
                }
                SleepExternalNavigtor sleepExternalNavigtor2 = SleepExternalNavigtor.INSTANCE;
                sleepExternalNavigtor2.jumpToneList(sleepExternalNavigtor2.getFAVORITE_TYPE());
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_SLEEP_FLAG)) {
                if (NavigateContent.APP_GOTO_SLEEP_DAY.equals(position)) {
                    SleepExternalNavigtor.INSTANCE.jumpSleepDay();
                    return "";
                }
                if (NavigateContent.APP_GOTO_SLEEP_WEEK.equals(position)) {
                    SleepExternalNavigtor.INSTANCE.jumpSleepWeek();
                    return "";
                }
                if (NavigateContent.APP_GOTO_SLEEP_MONTH.equals(position)) {
                    SleepExternalNavigtor.INSTANCE.jumpSleepMonth();
                    return "";
                }
                SleepExternalNavigtor.INSTANCE.jumpSleepYear();
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_RHYTHM_DETAIL)) {
                try {
                    String[] strArrSplit7 = position.split(":");
                    if (strArrSplit7.length != 3) {
                        return "";
                    }
                    SleepExternalNavigtor.INSTANCE.jumpToneDetails(strArrSplit7[2].split(","));
                    return "";
                } catch (Exception e4) {
                    HMLog.e(CustomSkillsHandler.TAG, "解析出错", e4);
                    e4.printStackTrace();
                    return "";
                }
            }
            if (position.startsWith(c)) {
                String strC = c(position, 2);
                if (TextUtils.isEmpty(strC)) {
                    return "";
                }
                HMDeviceUtils.jumpToDeviceDetailPage(context, Integer.parseInt(strC), jumpSource);
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_SLEEP_MONITOR)) {
                HMLog.i(CustomSkillsHandler.TAG, "position: $position", new Object[0]);
                Intent intent4 = new Intent(context, (Class<?>) SnoreMonitorActivity.class);
                intent4.setPackage(context.getPackageName());
                startActivity(context, intent4);
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_SLEEP_NAP)) {
                HMLog.i(CustomSkillsHandler.TAG, "position: $position", new Object[0]);
                if (HMIntentHandler.NAP_TYPE_LATEST.equalsIgnoreCase(c(position, 2))) {
                    String lastNapDataDate = SportDataManager.getInstance().getLastNapDataDate();
                    if (TextUtils.isEmpty(lastNapDataDate)) {
                        lastNapDataDate = new SportDay().getKey();
                    }
                    NapSleepDetailActivity.launch(context, lastNapDataDate, HMPersonInfo.getInstance().getUserInfo().getUserid());
                    return "";
                }
                NapSleepDetailActivity.launch(context, new SportDay().getKey(), HMPersonInfo.getInstance().getUserInfo().getUserid());
                return "";
            }
            if (position.startsWith(NavigateContent.APP_GOTO_SLEEP_RHYTHM)) {
                Navigator.INSTANCE.startMusicPlayer(context);
                return "";
            }
            if (!NavigateContent.APP_GOTO_SKY.equals(position)) {
                return position;
            }
            SkyServiceKt.getSkyNavigation().launchSkyMainPage(context, SkyPlayFromEvent.FROM_OTHER);
            return "";
        }
        startActivity(context, new Intent(context, (Class<?>) MainTabActivity.class).putExtra(MainTabActivity.EXTRA_SPORTTYPE_INDEX, 0).putExtra("source", jumpSource));
        return "";
    }
}
