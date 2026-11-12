package com.xiaomi.hm.health.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huami.account.HMLoginManager;
import com.huami.firstbeat.dbproxy.EteResultProxy;
import com.huami.firstbeat.dbproxy.ThaResultProxy;
import com.huami.firstbeat.logproxy.FbtLogger;
import com.huami.mifit.sportlib.GPSSportApplication;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.utils.FunctionSwitcher;
import com.huami.mifit.sportlib.webkit.SportHttpKit;
import com.huami.moving.datacenter.SportActiveDatasDbClient;
import com.huami.moving.datacenter.SportConfigDbClient;
import com.huami.moving.datacenter.SportDetailDbClient;
import com.huami.moving.datacenter.SportRecordDbClient;
import com.huami.moving.device.SportUsingDeviceHandler;
import com.huami.moving.fbtsupport.FbtEteResultImpl;
import com.huami.moving.fbtsupport.FbtLoggerImpl;
import com.huami.moving.fbtsupport.FbtThaResultImpl;
import com.huami.moving.log.SportLogClient;
import com.huami.moving.ui.sport.in.GPSMainActivity;
import com.huami.moving.ui.utils.RunnerPeripheralInfo;
import com.huami.moving.ui.utils.SportFunctionUtil;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.moving.webapi.ConfigAPI;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.huami.moving.webapi.SportHttpAPIImpl;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.util.RecordKeeper;
import com.huami.watch.companion.sport.helper.SportDetailNavigateHelper;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.eventbus.EventChangeTab;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.running.SportDetailPageNavigator;
import com.xiaomi.hm.health.ui.sportfitness.ExerciseHistoryActivity;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import de.greenrobot.event.EventBus;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class RunningManager {
    public static boolean SUPPORT_SPORT_RECORD_KEY_DATA = false;
    public static boolean SUPPORT_SPORT_SUPER_USER = false;
    private static final String a = "req_stat_data";
    private static final String b = "latest_sport_time";
    private static final String c = "into_exact_sport_type";

    static {
        try {
            System.loadLibrary("ete");
            System.loadLibrary("tha");
            HMLog.info("FirstBeat", new Function0() { // from class: jg6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RunningManager.f();
                }
            });
        } catch (Throwable th) {
            HMLog.info("FirstBeat", new Function0() { // from class: ig6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RunningManager.g(th);
                }
            });
        }
    }

    public static void areaUpdate() {
        SportFunctionUtil.isKoreaNoGps = HMLoginManager.isInKR();
    }

    public static void clearIndoorRunCalibratedData() {
        SportUIKeeper.setIndoorRunCalibratedData(null, "");
    }

    private static void d() {
        EteResultProxy.getInstance().setEteClient(FbtEteResultImpl.getInstance());
        ThaResultProxy.getInstance().setThaClient(FbtThaResultImpl.getInstance());
        FbtLogger.setLogger(new FbtLoggerImpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(int i, HMUserInfo hMUserInfo) {
        return "setOrUpdateRunnerData:age: " + i + "gender: " + hMUserInfo.getGender();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f() {
        return "FirstBeat Ete & Tha Success";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Throwable th) {
        return "Throwable:" + th;
    }

    public static String getIndoorRunCalibratedData() {
        return SportUIKeeper.getIndoorRunCalibratedData(null);
    }

    public static void init(Context context, boolean debugVersion) {
        SportUIKeeper.init(context);
        GPSSportApplication.init(context, debugVersion);
        GPSSportApplication.setLogClient(SportLogClient.getInstance());
        GPSSportApplication.setSportConfigDbClient(SportConfigDbClient.getInstance());
        GPSSportApplication.setSportRecordDbClient(SportRecordDbClient.getInstance());
        GPSSportApplication.setSportDetailDbClient(SportDetailDbClient.getInstance());
        GPSSportApplication.setSportActiveDataDbClient(SportActiveDatasDbClient.getInstance());
        GPSSportApplication.bindSportingClass(GPSMainActivity.class);
        SportHttpKit.getInstance().setRequester(SportHttpAPIImpl.getInstance());
        FunctionSwitcher.isSupportSuperUser = SUPPORT_SPORT_SUPER_USER;
        FunctionSwitcher.isSupportRecordKeyData = SUPPORT_SPORT_RECORD_KEY_DATA;
        d();
        SportUsingDeviceHandler.getInstance().setDelegate(SportDeviceManager.getInstance(context));
        SportDetailNavigateHelper.getInstance().setNavigate(new SportDetailPageNavigator(context));
    }

    public static void logout(Context context) {
        SportUIKeeper.clear(context);
        GPSSportApplication.logout(context);
        RecordKeeper.INSTANCE.clear(context);
    }

    public static void setOrUpdateRunnerData() {
        final HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
        RunnerData runnerData = new RunnerData();
        final int age = userInfo.getAge();
        if (age > 0) {
            runnerData.setAge(age);
        } else {
            runnerData.setAge(RunnerData.getRunner().getAge());
        }
        runnerData.setGender(userInfo.getGender());
        runnerData.setHeight(userInfo.getHeight());
        runnerData.setWeight(userInfo.getWeight());
        runnerData.setMetric(miliConfig.getUnit() == 0);
        runnerData.setPlay(HMConfig.Channel.name());
        runnerData.setUid(userInfo.getUserid());
        runnerData.setMainlandUser(HMLoginManager.isMainlandUser());
        RunnerData.setRunnerData(runnerData);
        RunnerPeripheralInfo.initPeripheralInfo(userInfo.getAvatar(), userInfo.getAvatarPath(), userInfo.getNickname(), HMLoginManager.isInChina(), HMConfig.Url.buyUrl(), userInfo.getHeight());
        HMLog.info("RunningManager", new Function0() { // from class: hg6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningManager.e(age, userInfo);
            }
        });
    }

    public static void startRunning() {
        EventBus.getDefault().post(new EventChangeTab(0));
    }

    public static void startRunningJumpRecord(Context context, HistoryRecord record, String category, String type) {
        Intent intent = new Intent(context, (Class<?>) ExerciseHistoryActivity.class);
        Bundle bundle = new Bundle();
        if (record != null) {
            bundle.putLong(b, record.getBeginTimeInMilli());
        }
        boolean z = false;
        if (HMKeeper.isNeedReqStatData()) {
            bundle.putBoolean(a, true);
            HMKeeper.setReqStatData(false);
        } else {
            if (TextUtils.isEmpty(HMKeeper.getExerSubSportList()) && TextUtils.isEmpty(HMKeeper.getExerTrainStatData())) {
                z = true;
            }
            bundle.putBoolean(a, z);
        }
        intent.putExtra("bundle", bundle);
        intent.putExtra("type", type);
        intent.putExtra("category", category);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void startRunningRecord(Context context, HistoryRecord record, int... exactSportType) {
        Intent intent = new Intent(context, (Class<?>) ExerciseHistoryActivity.class);
        Bundle bundle = new Bundle();
        if (record != null) {
            bundle.putLong(b, record.getBeginTimeInMilli());
        }
        boolean z = false;
        if (exactSportType != null && exactSportType.length > 0) {
            bundle.putInt(c, exactSportType[0]);
        }
        if (HMKeeper.isNeedReqStatData()) {
            bundle.putBoolean(a, true);
            HMKeeper.setReqStatData(false);
        } else {
            if (TextUtils.isEmpty(HMKeeper.getExerSubSportList()) && TextUtils.isEmpty(HMKeeper.getExerTrainStatData())) {
                z = true;
            }
            bundle.putBoolean(a, z);
        }
        intent.putExtra("bundle", bundle);
        context.startActivity(intent);
    }

    public static void syncGPSSport() {
        PostRunningDataToServer.postRunningData(null);
        ConfigAPI.syncRunConfigs();
    }

    public static boolean syncGPSSportWhenLogout() {
        return PostRunningDataToServer.postRunningDataInSynced() & ConfigAPI.postRunConfigInSynced();
    }
}
