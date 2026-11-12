package com.xiaomi.hm.health.model.account;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Config;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class HMPersonInfo {
    private static final String IO_THREAD = "personinfo#save_db";
    private static final String TAG = "HMPersonInfo";
    private static Callback callback;
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static SyncUserInfoUpdater syncUserInfoUpdater;
    private final Lazy<Handler> ioHandler;
    private HMMiliConfig miliConfig;
    private HMUserInfo userInfo;

    public interface Callback {
        long getValidUid();
    }

    public static class Holder {
        public static final HMPersonInfo INSTANCE = new HMPersonInfo();

        private Holder() {
        }
    }

    public interface SyncUserInfoCallback {
        void onResult(boolean z);
    }

    public interface SyncUserInfoUpdater {
        void syncToServer(@NonNull SyncUserInfoCallback syncUserInfoCallback);
    }

    private HMPersonInfo() {
        this.ioHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wb3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMPersonInfo.lambda$new$0();
            }
        });
    }

    private Config getConfigFormDB() {
        List<Config> listLoadAll = HMDaoManager.getInstance().getDaoSession().getConfigDao().loadAll();
        return (listLoadAll == null || listLoadAll.size() <= 0) ? new Config() : listLoadAll.get(listLoadAll.size() - 1);
    }

    public static Calendar getCurrentTime() {
        String serverDate = Utils.getServerDate();
        Calendar calendar = Calendar.getInstance();
        if (!TextUtils.isEmpty(serverDate)) {
            try {
                calendar.setTime(new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US).parse(serverDate));
            } catch (Exception e) {
                HMLog.i(TAG, e.toString(), new Object[0]);
            }
        }
        return calendar;
    }

    public static HMPersonInfo getInstance() {
        HMPersonInfo hMPersonInfo = Holder.INSTANCE;
        AtomicBoolean atomicBoolean = isInitialized;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    hMPersonInfo.refresh();
                    atomicBoolean.set(true);
                } catch (Exception e) {
                    HMLog.e(TAG, "HMPersonInfo 初始化失败：" + Log.getStackTraceString(e), new Object[0]);
                }
            }
        }
        return hMPersonInfo;
    }

    private void init(String str) {
        if (HMDaoManager.getInstance() == null) {
            initDefault();
            return;
        }
        UserInfos userInfosLoad = HMDaoManager.getInstance().getDaoSession().getUserInfosDao().load(str);
        Config configFormDB = getConfigFormDB();
        this.userInfo = HMUserInfo.getHMUserInfo(userInfosLoad);
        this.miliConfig = HMMiliConfig.getHMMiliConfig(configFormDB);
    }

    @Deprecated
    public static void initCallback(Callback callback2) {
        callback = callback2;
    }

    private void initDefault() {
        this.userInfo = new HMUserInfo();
        this.miliConfig = new HMMiliConfig();
    }

    private void initMiliConfig(HMBeanPersonInfo hMBeanPersonInfo) {
        if (hMBeanPersonInfo.getConfig() == null) {
            this.miliConfig = new HMMiliConfig();
            return;
        }
        if (this.miliConfig == null) {
            this.miliConfig = new HMMiliConfig();
        }
        this.miliConfig.setGoalStepsCount(hMBeanPersonInfo.getConfig().getGoalStepsCount());
        this.miliConfig.setAlarmNotifyEnabled(hMBeanPersonInfo.getConfig().isAlarmNotifyEnabled());
        this.miliConfig.setDayReportNoti(hMBeanPersonInfo.getConfig().getDayReportNoti());
        this.miliConfig.setEnableConnectedBtAdv(hMBeanPersonInfo.getConfig().isEnableConnectedBtAdv());
        this.miliConfig.setHasHeartRate(hMBeanPersonInfo.getConfig().isHasHeartRate());
        this.miliConfig.setIncallContactNotifyEnabled(hMBeanPersonInfo.getConfig().isIncallContactNotifyEnabled());
        this.miliConfig.setIncallNotifyEnabled(hMBeanPersonInfo.getConfig().isIncallNotifyEnabled());
        this.miliConfig.setInComingCallNotifyTime(hMBeanPersonInfo.getConfig().getInComingCallNotifyTime());
        if (hMBeanPersonInfo.getConfig().getInComingCallNotifyTime() < 256) {
            this.miliConfig.enableInComingCallTime();
        } else {
            this.miliConfig.disableInComingCallTime();
        }
        this.miliConfig.setLightColor(hMBeanPersonInfo.getConfig().getLightColor());
        this.miliConfig.setmOpenSleepNotify(hMBeanPersonInfo.getConfig().ismOpenSleepNotify());
        this.miliConfig.setSleepAssist(hMBeanPersonInfo.getConfig().isSleepAssist());
        this.miliConfig.setSmsContactNotifyEnabled(hMBeanPersonInfo.getConfig().isSmsContactNotifyEnabled());
        this.miliConfig.setHasHeartRate(hMBeanPersonInfo.getConfig().isHasHeartRate());
        this.miliConfig.setSmsNotifyEnabled(hMBeanPersonInfo.getConfig().isSmsNotifyEnabled());
        this.miliConfig.setUnit(hMBeanPersonInfo.getConfig().getUnit());
        this.miliConfig.setVibrate(hMBeanPersonInfo.getConfig().isVibrate());
        this.miliConfig.setWearHand(hMBeanPersonInfo.getConfig().getWearHand());
        this.miliConfig.setWeightMergeResult(hMBeanPersonInfo.getConfig().isWeightMergeResult());
        this.miliConfig.setWeightUnit(hMBeanPersonInfo.getConfig().getWeightUnit());
        this.miliConfig.setScreenLock(hMBeanPersonInfo.getConfig().getScreenLock());
        this.miliConfig.setProDisplay(hMBeanPersonInfo.getConfig().getProDisplay());
        this.miliConfig.setSedentaryRemind(hMBeanPersonInfo.getConfig().getSedentaryRemind());
        this.miliConfig.setEmailNotifyEnabled(hMBeanPersonInfo.getConfig().isEmailNotifyEnabled());
        this.miliConfig.setLiftWristBrightView(hMBeanPersonInfo.getConfig().isLiftWristBrightView());
        this.miliConfig.setGoalRemind(hMBeanPersonInfo.getConfig().isGoalRemind());
        this.miliConfig.setAvoidDisturdMode(hMBeanPersonInfo.getConfig().isAvoidDisturdMode());
        this.miliConfig.setIosappNotifySettings(hMBeanPersonInfo.getConfig().getIosappNotifySettings());
        this.miliConfig.setAndroidappNotifySettings(hMBeanPersonInfo.getConfig().getAndroidappNotifySettings());
        this.miliConfig.setQuietMode(hMBeanPersonInfo.getConfig().getQuietMode());
        this.miliConfig.setUnlockScreenType(hMBeanPersonInfo.getConfig().getUnlockScreenType());
        this.miliConfig.setTimePanelType(hMBeanPersonInfo.getConfig().getTimePanelType());
        this.miliConfig.setTimePanelLang(hMBeanPersonInfo.getConfig().getTimePanelLang());
        this.miliConfig.setAntiLost(hMBeanPersonInfo.getConfig().isAntiLost());
        this.miliConfig.setNotificationOn(hMBeanPersonInfo.getConfig().isNotificationOn());
        this.miliConfig.setCheckNotification(hMBeanPersonInfo.getConfig().isCheckNotification());
        this.miliConfig.setFlipWrist(hMBeanPersonInfo.getConfig().isFlipWrist());
        this.miliConfig.setIncallNameDisplayEnabled(hMBeanPersonInfo.getConfig().isIncallNameDisplayEnabled());
        this.miliConfig.setSmsNameDisplayEnabled(hMBeanPersonInfo.getConfig().isSmsNameDisplayEnabled());
        this.miliConfig.setShoePlaceMode(hMBeanPersonInfo.getConfig().getShoePlaceMode());
        this.miliConfig.setWeightBfsUnit(hMBeanPersonInfo.getConfig().getWeightBfsUnit());
        this.miliConfig.setWholeHeartRate(hMBeanPersonInfo.getConfig().isWholeHeartRate());
        this.miliConfig.setDialSetting(hMBeanPersonInfo.getConfig().getDialSetting());
        this.miliConfig.setLongPressSettings(hMBeanPersonInfo.getConfig().getLongPressSettings());
        this.miliConfig.setHrDetectType(Integer.valueOf(hMBeanPersonInfo.getConfig().getHrDetectType()));
        this.miliConfig.setWeatherSetting(hMBeanPersonInfo.getConfig().getWeatherSetting());
        this.miliConfig.setWatchApps(hMBeanPersonInfo.getConfig().getWatchApps());
        this.miliConfig.setLiftWristTime(hMBeanPersonInfo.getConfig().getLiftWristTime());
        this.miliConfig.setHrDetectFreq(Integer.valueOf(hMBeanPersonInfo.getConfig().getHrDetectFreq()));
        this.miliConfig.setDisconnectRemind(hMBeanPersonInfo.getConfig().getDisconnectRemind());
        this.miliConfig.setPhoneNotifyDelayEnable(hMBeanPersonInfo.getConfig().isPhoneNotifyDelayEnable());
    }

    public static void initUserIdProvider(Callback callback2) {
        callback = callback2;
    }

    private void initUserInfo(HMBeanPersonInfo hMBeanPersonInfo) {
        if (this.userInfo == null) {
            this.userInfo = new HMUserInfo();
        }
        this.userInfo.setUserid(TextUtils.isEmpty(hMBeanPersonInfo.getUserid()) ? EcgData.DEFAULT_DIGIT_VALUE : hMBeanPersonInfo.getUserid());
        this.userInfo.setWeight(hMBeanPersonInfo.getWeight());
        this.userInfo.setHeight(hMBeanPersonInfo.getHeight());
        if (!TextUtils.isEmpty(hMBeanPersonInfo.getAvatar()) || TextUtils.isEmpty(hMBeanPersonInfo.getIcon())) {
            this.userInfo.setAvatar(hMBeanPersonInfo.getAvatar());
        } else {
            this.userInfo.setAvatar(hMBeanPersonInfo.getIcon());
        }
        this.userInfo.setAvatarPath("");
        this.userInfo.setBirthday(hMBeanPersonInfo.getBirthday());
        this.userInfo.setCreatTime(hMBeanPersonInfo.getCreatTime());
        this.userInfo.setGender(hMBeanPersonInfo.getGender());
        this.userInfo.setLastLoginTime(hMBeanPersonInfo.getLastLoginTime());
        this.userInfo.setNickname(hMBeanPersonInfo.getNickname());
        this.userInfo.setLoginTime(hMBeanPersonInfo.getLogintime());
        this.userInfo.setSignature(hMBeanPersonInfo.getSignature());
        this.userInfo.setTargetWeight(-1.0f);
        this.userInfo.setDownloaded(false);
        this.userInfo.setLocation(hMBeanPersonInfo.getLocation());
        this.userInfo.setUserIntroduction(hMBeanPersonInfo.getUserIntroduction());
        this.userInfo.setDefaultFields(hMBeanPersonInfo.getDefaultFields());
    }

    public static void initUserInfoUpdater(SyncUserInfoUpdater syncUserInfoUpdater2) {
        syncUserInfoUpdater = syncUserInfoUpdater2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Handler lambda$new$0() {
        HandlerThread handlerThread = new HandlerThread(IO_THREAD);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveInfo$2(boolean z) {
        HMLog.d(TAG, "已触发用户资料同步，同步结果：" + (z ? "成功" : "失败"), new Object[0]);
    }

    private void refresh() {
        Callback callback2 = callback;
        long validUid = callback2 != null ? callback2.getValidUid() : -1L;
        if (validUid != -1) {
            init(String.valueOf(validUid));
        } else {
            initDefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveToDb, reason: merged with bridge method [inline-methods] */
    public void lambda$saveInfo$1(UserInfos userInfos, Config config) {
        HMDaoManager.getInstance().getDaoSession().getUserInfosDao().insertOrReplace(userInfos);
        HMDaoManager.getInstance().getDaoSession().getConfigDao().insertOrReplace(config);
    }

    public static void syncToServer(SyncUserInfoCallback syncUserInfoCallback) {
        SyncUserInfoUpdater syncUserInfoUpdater2 = syncUserInfoUpdater;
        if (syncUserInfoUpdater2 != null) {
            syncUserInfoUpdater2.syncToServer(syncUserInfoCallback);
        }
    }

    public HMMiliConfig getMiliConfig() {
        return this.miliConfig;
    }

    public HMUserInfo getUserInfo() {
        return this.userInfo;
    }

    public boolean isNewUser() {
        return !this.userInfo.isValid() || this.miliConfig.getGoalStepsCount() <= 0;
    }

    public boolean isValidUser() {
        return (this.userInfo == null || this.miliConfig == null) ? false : true;
    }

    public void saveInfo(int i, boolean z) {
        if (i == 0) {
            this.userInfo.setSynced(i);
        } else {
            HMUserInfo hMUserInfo = this.userInfo;
            hMUserInfo.setSynced(hMUserInfo.getSynced() | i);
        }
        final UserInfos userInfos = new UserInfos();
        final Config config = new Config();
        this.userInfo.getUserInfos(userInfos);
        this.miliConfig.getConfig(config);
        if (z) {
            this.ioHandler.getValue().post(new Runnable() { // from class: vb3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$saveInfo$1(userInfos, config);
                }
            });
        } else {
            lambda$saveInfo$1(userInfos, config);
        }
        HMLog.d(TAG, "mili config :" + this.miliConfig.toString(), new Object[0]);
        SyncUserInfoUpdater syncUserInfoUpdater2 = syncUserInfoUpdater;
        if (i != 2 || syncUserInfoUpdater2 == null) {
            return;
        }
        syncUserInfoUpdater2.syncToServer(new SyncUserInfoCallback() { // from class: ub3
            @Override // com.xiaomi.hm.health.model.account.HMPersonInfo.SyncUserInfoCallback
            public final void onResult(boolean z2) {
                HMPersonInfo.lambda$saveInfo$2(z2);
            }
        });
    }

    public void saveInfoAsync(int i) {
        saveInfo(i, true);
    }

    public void setMiliConfig(HMMiliConfig hMMiliConfig) {
        this.miliConfig = hMMiliConfig;
    }

    public void setUserInfo(HMUserInfo hMUserInfo) {
        this.userInfo = hMUserInfo;
    }

    public HMPersonInfo updateFromServer(HMBeanPersonInfo hMBeanPersonInfo) {
        initUserInfo(hMBeanPersonInfo);
        initMiliConfig(hMBeanPersonInfo);
        return this;
    }

    public void saveInfoAsync() {
        saveInfo(0, true);
    }

    public void saveInfo(int i) {
        saveInfo(i, false);
    }

    public void saveInfo() {
        saveInfo(0, false);
    }
}
