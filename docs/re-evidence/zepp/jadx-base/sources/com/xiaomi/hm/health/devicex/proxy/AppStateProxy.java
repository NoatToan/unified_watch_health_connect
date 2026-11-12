package com.xiaomi.hm.health.devicex.proxy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.AppStateApi;
import com.huami.devicex.injection.RunningManagerApi;
import com.huami.devicex.injection.basic.FirstBeatManagerApi;
import com.huami.devicex.injection.basic.StressUserCaseApi;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.moving.ui.sport.in.GPSMainActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.running.RunningActivity;
import com.huami.treadmill.ui.running.StartupActivity;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.bodyfat.activity.BabyWeightActivity;
import com.xiaomi.hm.health.bodyfat.activity.InstructScale2Activity;
import com.xiaomi.hm.health.bodyfat.activity.WeightConnectActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightingActivity;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.HMBindDeviceActivity;
import com.xiaomi.hm.health.device.HMSwitchDeviceActivity;
import com.xiaomi.hm.health.device.HMUnusedDeviceActivity;
import com.xiaomi.hm.health.device.PairCCBActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeFailedActivity;
import com.xiaomi.hm.health.device.weight.InstructionWeightActivity;
import com.xiaomi.hm.health.device.weight.InstructionWeightBfsActivity;
import com.xiaomi.hm.health.fragment.SelectImageFragment;
import com.xiaomi.hm.health.lab.activity.MiLiBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.activity.ShoesBehaviorTaggingActivity;
import com.xiaomi.hm.health.nfc.KoinHelperKt;
import com.xiaomi.hm.health.relation.RelationServiceKt;
import com.xiaomi.hm.health.smalltool.ToolNavigateActivity;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.ui.goal.ui.GoalSummaryActivity;
import com.xiaomi.hm.health.ui.playmiband2.MiBand2InstructionActivity;
import com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import com.xiaomi.hm.health.ui.smartplay.RestoreDeviceConfigActivity;
import com.xiaomi.hm.health.ui.smartplay.meidacontrol.MediaUtil;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import com.xiaomi.hm.health.utils.Utils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\u0018\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0014\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010!\u001a\u00020\u000eH\u0016J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u000bH\u0016J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u000eH\u0016J\u0018\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u000e0(j\b\u0012\u0004\u0012\u00020\u000e`)H\u0016J\u0018\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010-\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010/\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001aH\u0016J\u0018\u00101\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000eH\u0016J\b\u00102\u001a\u00020\u0002H\u0016J\b\u00103\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020\u0002H\u0016¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/AppStateProxy;", "Lcom/huami/devicex/injection/AppStateApi;", "", "isForeground", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "createMainTabActivityIntent", "", "jumpToDeviceDetailPage", "onDeviceDestroy", "Landroid/app/Activity;", "getTopActivity", "isLogData", "", "key", "", "getThreadPoolConst", "getChannelName", "shouldInitMusic", "Lcom/huami/devicex/injection/RunningManagerApi;", "getRunningManagerApi", "Lcom/huami/devicex/injection/basic/StressUserCaseApi;", "getStressUseCaseApi", "Lcom/huami/devicex/injection/basic/FirstBeatManagerApi;", "getFirstBeatManagerApi", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "showSelectImageFragment", "getAreaBySave", "getMainActivityName", "toolName", "createToolFn", "tag", "Ljava/lang/Class;", "getActivityClass", "activity", "isStartUpActivity", "hasSleepData", "getChannelProduction", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getIgnoreFwUpgradeList", "navigateActivityTo", "jumpToTreadmillSportPage", "jumpToDetailInfoActivity", "fragmentManager", "showAlexaLanguageSettingActivity", PointCategory.PERMISSION, "checkPermission", "isMiui", "isHK", "isFeedbackActivity", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppStateProxy implements AppStateApi {
    @Override // com.huami.devicex.injection.AppStateApi
    public boolean checkPermission(@NotNull Context context, @NotNull String permission) {
        return Utils.checkPermission(context, permission);
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public Intent createMainTabActivityIntent(@NotNull Context context) {
        return new Intent(context, (Class<?>) MainTabActivity.class);
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public void createToolFn(@NotNull Context context, @NotNull String toolName) {
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public Class<?> getActivityClass(@NotNull String tag) throws Exception {
        if (Intrinsics.areEqual(tag, "FriendsAndFamilyService")) {
            return RelationServiceKt.getRelationService().friendActivityClass();
        }
        if (Intrinsics.areEqual(tag, "GoalSummaryActivity")) {
            return GoalSummaryActivity.class;
        }
        throw new Exception("Not match activity class");
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public String getAreaBySave() {
        String value = SelectAreaHelper.getAreaBySave().getValue();
        return value == null ? "" : value;
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public String getChannelName() {
        return HMConfig.Channel.name();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public String getChannelProduction() {
        return "midong";
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public FirstBeatManagerApi getFirstBeatManagerApi() {
        return new FirstBeatManagerProxy();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public ArrayList<String> getIgnoreFwUpgradeList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(GPSMainActivity.class.getName());
        arrayList.add(FeedbackActivity.class.getName());
        arrayList.add(ShoesBehaviorTaggingActivity.class.getName());
        arrayList.add(MiLiBehaviorTaggingActivity.class.getName());
        arrayList.add(RestoreDeviceConfigActivity.class.getName());
        arrayList.add(InstructScale2Activity.class.getName());
        arrayList.add(HMUnusedDeviceActivity.class.getName());
        arrayList.add(InstructionWeightActivity.class.getName());
        arrayList.add(InstructionWeightBfsActivity.class.getName());
        arrayList.add(MiBand2InstructionActivity.class.getName());
        arrayList.add(MiBand3InstructionActivity.class.getName());
        arrayList.add(HMSwitchDeviceActivity.class.getName());
        arrayList.add(HMBindDeviceActivity.class.getName());
        arrayList.add(PairCCBActivity.class.getName());
        arrayList.add(HMFwUpgradeFailedActivity.class.getName());
        arrayList.add(TrainingPlayActivity.class.getName());
        arrayList.add(WeightingActivity.class.getName());
        arrayList.add(BabyWeightActivity.class.getName());
        arrayList.add(WeightConnectActivity.class.getName());
        arrayList.add(StartupActivity.class.getName());
        arrayList.add(RunningActivity.class.getName());
        return arrayList;
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public String getMainActivityName() {
        return MainTabActivity.class.getName();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public RunningManagerApi getRunningManagerApi() {
        return new RunningManagerProxy();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @NotNull
    public StressUserCaseApi getStressUseCaseApi() {
        return new StressUserCaseProxy();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public int getThreadPoolConst(@NotNull String key) {
        if (Intrinsics.areEqual(key, "KEEP_ALIVE_TIME")) {
            return 5000;
        }
        return Intrinsics.areEqual(key, "THREAD_TYPE_WORK_ANALISYS") ? 4 : 0;
    }

    @Override // com.huami.devicex.injection.AppStateApi
    @Nullable
    public Activity getTopActivity() {
        return BraceletForegroundCallBack.getTopActivity();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public boolean hasSleepData() {
        return HMDataCacheCenter.getInstance().getmBandUint().getRecentSleepSummary() != null;
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public boolean isFeedbackActivity() {
        return getTopActivity() instanceof FeedbackActivity;
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public boolean isForeground() {
        return BraceletForegroundCallBack.getInstance().isForeground();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public boolean isHK() {
        return Utils.isHK(DeviceXFunctionsKt.getContext());
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public boolean isLogData() {
        return HMConfig.Log.isLogData();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public boolean isMiui() {
        return MiuiAPI.isMiui(DeviceXFunctionsKt.getContext());
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public boolean isStartUpActivity(@NotNull Activity activity) {
        return activity instanceof StartUpActivity;
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public void jumpToDetailInfoActivity(@NotNull Context context) {
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public void jumpToDeviceDetailPage(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) MainTabActivity.class).putExtra("tab_index", 3));
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public void jumpToTreadmillSportPage(@NotNull Context context) {
        Intent intent = new Intent(context, (Class<?>) MainTabActivity.class);
        intent.putExtra(MainTabActivity.EXTRA_JUMP, 1);
        context.startActivity(intent);
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public void navigateActivityTo(@NotNull Context context, @NotNull String key) {
        if (Intrinsics.areEqual(key, "TYPE_SPORT_TREADMILL")) {
            ToolNavigateActivity.INSTANCE.to(context, 5);
        }
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public void onDeviceDestroy() {
        KoinHelperKt.onDeviceDestroy();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public boolean shouldInitMusic() {
        return MediaUtil.shouldInitMusic();
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public void showAlexaLanguageSettingActivity(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
    }

    @Override // com.huami.devicex.injection.AppStateApi
    public void showSelectImageFragment(@NotNull String key, @NotNull FragmentManager supportFragmentManager) {
        if (Intrinsics.areEqual(key, "REQUEST_CODE_FROM_DIAL")) {
            SelectImageFragment.newInstance(1023).show(supportFragmentManager, (String) null);
        } else if (Intrinsics.areEqual(key, "REQUEST_CODE_FROM_WATCH_SKIN")) {
            SelectImageFragment.newInstance(1025).show(supportFragmentManager, (String) null);
        }
    }
}
